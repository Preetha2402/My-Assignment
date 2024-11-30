package MethodOverLoading;

public class APIClient {
	//define the sendRequest method with multiple overloaded
	
	//One version should accept one input argument
	public void sendRequest(String endpoint) {
		System.out.println("First end point of API Client : "+ endpoint);
	}
	
	//Another version of the sendRequest method should accept three input arguments(String,String,boolean)
	public void sendRequest(String endpoint,String requestBody, boolean requestStatus) {
		System.out.println("Request body by API Client : "+requestBody);
		System.out.println("verify whether the request is successful :"+requestStatus);
		System.out.println("second end point of API Client : "+ endpoint);
	}
	
	
	public static void main(String[] args) {
		
		//Inside the main method, create an object of the APIClient class.
		APIClient status = new APIClient();
		
		//Call both versions of the sendRequest method on the APIClient object with different sets of i/p
		status.sendRequest("Half  project");
		status.sendRequest("full project");
		
	}

}
	
	
	
	
	
	
	
		
		
		
		

	

	