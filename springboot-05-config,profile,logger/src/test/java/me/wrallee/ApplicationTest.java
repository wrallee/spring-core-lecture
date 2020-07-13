package me.wrallee;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.core.env.Environment;
import org.springframework.test.context.TestPropertySource;
import org.springframework.test.context.junit4.SpringRunner;

import static org.assertj.core.api.Assertions.assertThat;

@RunWith(SpringRunner.class)
//@TestPropertySource(properties = "wchan.age=10")
//@SpringBootTest(properties = "wchan.age=100")
@TestPropertySource(locations = "classpath:/test.properties")
@SpringBootTest
public class ApplicationTest {
    @Autowired
    Environment environment;

    @Test
    public void contextLoads() {
        assertThat(environment.getProperty("wchan.name"))
                .isEqualTo("WRALLEE!");
    }
}
