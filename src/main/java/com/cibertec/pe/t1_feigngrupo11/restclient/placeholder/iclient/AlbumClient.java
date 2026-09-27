package com.cibertec.pe.t1_feigngrupo11.restclient.placeholder.iclient;

import com.cibertec.pe.t1_feigngrupo11.restclient.placeholder.model.AlbumsPlaceHolder;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@FeignClient(name = "albumClient", url = "${placeholder.api.url}")
public interface AlbumClient {

    @GetMapping("/albums")
    List<AlbumsPlaceHolder> getAlbums();
}
