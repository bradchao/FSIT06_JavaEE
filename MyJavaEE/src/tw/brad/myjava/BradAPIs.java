package tw.brad.myjava;

import com.berry.BCrypt;

public class BradAPIs {
	public static boolean ckPasswd(String src, String cpasswd) {
		boolean isRight = false;
		if (cpasswd.startsWith("$2a$10$")) {
			isRight = BCrypt.checkpw(src, cpasswd);
		}
		return isRight;
	}
}
