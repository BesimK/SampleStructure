package utils;

import lombok.Data;
import pages.HomePage;

/**
 * This the class where we create main structure
 */
@Data
public class Pages {

	private HomePage homePage;

	public Pages() {
		homePage = new HomePage();
	}

}