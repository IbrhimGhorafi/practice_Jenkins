package ighorafi.practice_jenkins;

import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;
@SpringBootTest
class PracticeJenkinsApplicationTests {

    public static Logger logger= LoggerFactory.getLogger(PracticeJenkinsApplication.class);

    @Test
    void contextLoads() {
        logger.info("test case executing...");
    }

}
