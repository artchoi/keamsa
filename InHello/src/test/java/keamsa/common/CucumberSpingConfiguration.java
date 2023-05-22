package keamsa.common;

import io.cucumber.spring.CucumberContextConfiguration;
import keamsa.InHelloApplication;
import org.springframework.boot.test.context.SpringBootTest;

@CucumberContextConfiguration
@SpringBootTest(classes = { InHelloApplication.class })
public class CucumberSpingConfiguration {}
