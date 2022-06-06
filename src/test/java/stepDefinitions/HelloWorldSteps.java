package stepDefinitions;
import io.cucumber.java.en.Given;

public class HelloWorldSteps {

    @Given("print step with {string}")
    public void print(String arg1) {
        System.out.println(arg1);
    }

}
