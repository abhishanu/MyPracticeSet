package abhi.web;

public class UserValidationService {
	public boolean isValid(String user, String pass) {
		if (user.equals("abhi") && pass.equals("123")) {
			return true;
		}
		return false;
	}
}
