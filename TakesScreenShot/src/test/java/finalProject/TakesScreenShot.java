package finalProject;

public class TakesScreenShot {

	public static void main(String[] args) throws Exception {
		
		
		LoginPage log = new LoginPage();
		
		String uname ="8610043430";
		String pass ="8610043430";
		
		log.login(uname, pass);
		log.takeScreenshot();
		log.gotoHome();
		

	}

}
