package pl.singletone.npe.controller;

import lombok.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import pl.singletone.npe.model.Topic;
import pl.singletone.npe.service.LimeService;

@RestController
@RequiredArgsConstructor
public class LimeController {

    private final LimeService limeService;

    @GetMapping("/")
    public String limeGreetings(){
        return limeService.sayHello();
    }

}
