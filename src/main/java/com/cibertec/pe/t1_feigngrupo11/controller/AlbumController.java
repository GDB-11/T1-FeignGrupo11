package com.cibertec.pe.t1_feigngrupo11.controller;

import com.cibertec.pe.t1_feigngrupo11.restclient.placeholder.model.AlbumsPlaceHolder;
import com.cibertec.pe.t1_feigngrupo11.service.AlbumService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/albums")
public class AlbumController {

    private final AlbumService albumService;

    public AlbumController(AlbumService albumService) {
        this.albumService = albumService;
    }

    @GetMapping
    public List<AlbumsPlaceHolder> getAlbums() {
        return albumService.getAlbumsUserIdEvenAndIdOdd();
    }
}
