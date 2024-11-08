package nit.GitProj01;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;


public class AppTest {

    @Test
    public void  testWithPositive() {
    	App ap=new App();
    	int expected=300;
    	int actual=ap.sum(100, 200);
    	assertEquals(expected,actual);
}
    
    @Test
    public void  testWithNegative() {
    	App ap=new App();
    	int expected=-300;
    	int actual=ap.sum(-100, -200);
    	assertEquals(expected,actual);
}
    @Test
    public void  testWithMixed() {
    	App ap=new App();
    	int expected=100;
    	int actual=ap.sum(-100, 200);
    	assertEquals(expected,actual);
}
    @Test
    public void  testWithZeros() {
    	App ap=new App();
    	int expected=100;
    	int actual=ap.sum(-100, 200);
    	assertEquals(expected,actual);
}

	
}
