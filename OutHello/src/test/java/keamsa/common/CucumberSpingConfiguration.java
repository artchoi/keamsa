package keamsa.common;

import io.cucumber.spring.CucumberContextConfiguration;
import keamsa.OutHelloApplication;
import org.springframework.boot.test.context.SpringBootTest;

@CucumberContextConfiguration
@SpringBootTest(classes = { OutHelloApplication.class })
public class CucumberSpingConfiguration {}
