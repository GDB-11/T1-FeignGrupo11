package com.cibertec.pe.t1_feigngrupo11.service;

import com.cibertec.pe.t1_feigngrupo11.restclient.github.iclient.GithubEventClient;
import com.cibertec.pe.t1_feigngrupo11.restclient.github.model.GithubEventDto;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GithubEventService {

    private final GithubEventClient githubEventClient;

    public GithubEventService(GithubEventClient githubEventClient) {
        this.githubEventClient = githubEventClient;
    }

    public List<GithubEventDto> getPushEventsWithOddActorId() {
        return githubEventClient.getEvents().stream()
                .filter(event -> "PushEvent".equals(event.getType()))
                .filter(event -> event.getActor() != null && event.getActor().getId() != null)
                .filter(event -> event.getActor().getId() % 2 != 0)
                .toList();
    }
}
