package com.cibertec.pe.t1_feigngrupo11.controller;

import com.cibertec.pe.t1_feigngrupo11.restclient.github.model.GithubEventDto;
import com.cibertec.pe.t1_feigngrupo11.service.GithubEventService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/github/events")
public class GithubEventController {

    private final GithubEventService githubEventService;

    public GithubEventController(GithubEventService githubEventService) {
        this.githubEventService = githubEventService;
    }

    @GetMapping
    public List<GithubEventDto> getEvents() {
        return githubEventService.getPushEventsWithOddActorId();
    }
}
