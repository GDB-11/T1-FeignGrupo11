package com.cibertec.pe.t1_feigngrupo11.restclient.github.iclient;

import com.cibertec.pe.t1_feigngrupo11.restclient.github.model.GithubEventDto;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@FeignClient(name = "githubEventClient", url = "${github.api.url}")
public interface GithubEventClient {

    @GetMapping(value = "/events", headers = "User-Agent=t1-feigngrupo11")
    List<GithubEventDto> getEvents();
}
