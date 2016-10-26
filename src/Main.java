import java.util.Hashtable;




public class Main {
	public static void main (String args[]) {
		WebRequest webRequest = new WebRequest();
		String urlGet = "http://www.cuatrovientos.org";
		
		if (webRequest.get(urlGet)) {
			System.out.println("OK: " + webRequest.getResponseString());
		} else {
			System.out.println("Error: " + webRequest.getExceptionMessage());			
		}
		
		Hashtable<String,String> parameters = new Hashtable<String,String>();
		parameters.put("usuario", "falken");
		parameters.put("password", "josua");
		
		String urlPost = "http://www.cuatrovientos.org/login.php";
		
		if (webRequest.post(urlPost , parameters)) {
			System.out.println("OK POST: " + webRequest.getResponseString() + "\n" + webRequest.getResponseCode());
		} else {
			System.out.println("Error: " + webRequest.getExceptionMessage() + "\n" + webRequest.getResponseCode());			
		}
		
	}
}
