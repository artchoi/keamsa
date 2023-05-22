package keamsa.common;

import io.cucumber.spring.CucumberContextConfiguration;
import keamsa.HelloworldApplication;
import org.springframework.boot.test.context.SpringBootTest;

@CucumberContextConfiguration
@SpringBootTest(classes = { HelloworldApplication.class })
public class CucumberSpingConfiguration {}
