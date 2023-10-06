package jdbcdemomaven;

public class loadandregisterdriver {

	public static void main(String[] args) throws ClassNotFoundException{
		Class.forName("com.mysql.cj.jdbc.Driver");
		System.out.println("load and register the driver successfully");
		
	}
	

}
