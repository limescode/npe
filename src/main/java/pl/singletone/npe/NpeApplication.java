package pl.singletone.npe;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.math.BigDecimal;

@SpringBootApplication
public class NpeApplication {

    public static void main( String[] args ) {
        SpringApplication.run( NpeApplication.class, args );

        //BigDecimal bigDecimal = Arithmetics.MULTIPLY( BigDecimal.valueOf( -26.29841 ), BigDecimal.valueOf( -0.68452 ) );
        //System.out.println("Hello "  + bigDecimal);

    }

}
