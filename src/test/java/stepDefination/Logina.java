package stepDefination;

import cucumber.api.java.en.Given;
import utility.BaseClass;

public class Logina extends BaseClass {
	
	@Given("^Launch \"([^\"]*)\"$")
	public void launch(String URL) throws Throwable {
	   
		launchURL(URL);
	}

	
}
