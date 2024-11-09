package nit.GitProj01;

import java.security.DomainCombiner;

/**
 * Hello world!
 */
public class App {
	public int sum(int a,int b) {
		int c=a+b;
		return c;
		
	
	}
	public static void main(String[] args) {
		App ap=new App();
		System.out.println("sum is::"+ap.sum(10, 20));
		System.out.println("sum is::"+ap.sum(10, 20));
		System.out.println("sum is::"+ap.sum(10, 40));

	}
    
}
