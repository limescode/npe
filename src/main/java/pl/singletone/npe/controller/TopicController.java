package pl.singletone.npe.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import pl.singletone.npe.model.Topic;
import pl.singletone.npe.service.TopicService;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class TopicController {

    private final TopicService topicService;

    @GetMapping("/topics")
    public List<Topic> getTopics() {
        return topicService.getTopics();
    }

    @GetMapping("/topics/{id}")
    public Topic getSinglePost( @PathVariable long id ) {
        return topicService.getSinglePost( id );
    }
}


