package pageLocator;

import org.openqa.selenium.support.PageFactory;

import utility.BaseClass;

public class HomePageLocator extends BaseClass{

  public HomePageLocator(){
	  
	  PageFactory.initElements( driver,this);

    

}
}