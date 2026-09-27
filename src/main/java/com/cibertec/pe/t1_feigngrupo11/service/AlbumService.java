package com.cibertec.pe.t1_feigngrupo11.service;

import com.cibertec.pe.t1_feigngrupo11.restclient.placeholder.iclient.AlbumClient;
import com.cibertec.pe.t1_feigngrupo11.restclient.placeholder.model.AlbumsPlaceHolder;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AlbumService {

    private final AlbumClient albumClient;

    public AlbumService(AlbumClient albumClient) {
        this.albumClient = albumClient;
    }

    public List<AlbumsPlaceHolder> getAlbumsUserIdEvenAndIdOdd() {
        return albumClient.getAlbums().stream()
                .filter(album -> album.getUserId() % 2 == 0 && album.getId() % 2 != 0)
                .toList();
    }
}
