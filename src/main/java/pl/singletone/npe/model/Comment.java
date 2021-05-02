package pl.singletone.npe.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.time.LocalDateTime;
import java.util.List;

@Entity
@Getter
@Setter
public class Comment {
    @Id
    private long id;
    private String content;
    private LocalDateTime created;

}
