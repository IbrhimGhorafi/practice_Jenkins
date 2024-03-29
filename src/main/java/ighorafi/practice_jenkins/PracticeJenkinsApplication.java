package ighorafi.practice_jenkins;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class PracticeJenkinsApplication {
    public static Logger logger= LoggerFactory.getLogger(SpringApplication.class);
    public void init(){
        logger.info("Application started");
    }
    public static void main(String[] args) {
        logger.info("Application executed");
        SpringApplication.run(PracticeJenkinsApplication.class, args);
    }

}
