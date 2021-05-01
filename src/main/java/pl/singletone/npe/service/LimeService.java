package pl.singletone.npe.service;

import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.stereotype.Service;

@Service
public class LimeService {

    public String sayHello(){
        return "Hello world";
    }
}
