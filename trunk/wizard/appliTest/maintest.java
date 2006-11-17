package appliTest;

import java.rmi.RemoteException;

import webservices.TestWebServicesProxy;

public class maintest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TestWebServicesProxy wsp = new TestWebServicesProxy();
		wsp.setEndpoint("http://localhost:8080/remote/services/TestWebServices");
		try {
			System.out.println(wsp.getExample());
		} catch (RemoteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
