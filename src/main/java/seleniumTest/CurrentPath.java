package seleniumTest;

public class CurrentPath {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String path=System.getProperty("user.dir");
		String Actual_path = path+"/src/main/java/seleniumTest";
		System.out.println(Actual_path);

	}

}
