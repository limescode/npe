package pl.singletone.npe.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import pl.singletone.npe.model.Topic;
import pl.singletone.npe.repository.TopicRepository;

import java.util.List;

@Service
@RequiredArgsConstructor
public class TopicService {

    private final TopicRepository topicRepository;

    public List<Topic> getTopics(){
        return topicRepository.findAll();
    }

    public Topic getSinglePost( long id ) {
        return topicRepository.findById( id )
                .orElseThrow();
    }
}
