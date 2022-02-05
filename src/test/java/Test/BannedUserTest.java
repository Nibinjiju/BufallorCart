package Test;

import static org.testng.Assert.assertEquals;

import java.util.List;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import Page.BannedUserPage;
import Page.DeleteUserPage;

public class BannedUserTest extends Base {
	@Test(priority = 25, description = "TC_025_Verify user can ban a user list")
	public void verifyUserCanBanUserList() {
		BannedUserPage ban = new BannedUserPage(driver);
		ban.login();
		ban.link();
		boolean selected = ban.isSelected();
		Assert.assertFalse(selected, "did not banned");

	}

	@Test(priority = 26, description = "TC_026_Verify title of banned user list")
	public void verifyTitleOfBannedUserList() {
		BannedUserPage ban = new BannedUserPage(driver);
		String exp = "User List";
		String Actual = ban.title();
		Assert.assertEquals(Actual, exp, "invalid title");
	}

}