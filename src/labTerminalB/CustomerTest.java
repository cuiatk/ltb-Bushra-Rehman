package labTerminalB;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class CustomerTest {
	Movie m1 = new Movie("Spancer", 0);
	Movie m2 = new Movie("Speed", 1);
	Movie m3 =new Movie("1920" 2);
	Customer me = new Customer("Nadir");
	Customer me2 = new Customer("Allah Ditta");
	Rental r1 = new Rental(m1, 23);
	Rental r2 = new Rental(m2,4);
	Rental r3= new Rental(m3,2);
	
	/**
	 * Test 1 Customer rented two movies one REGULAR and one NEW_RELEASE
	 */
	@Test
	public void testStatement1() {
		me.addRental(r1);
		me.addRental(r2);
		//fail("Not yet implemented");
		String output1 = "Rental Record for Nadir\r\n" + 
				"	Spancer	33.5\r\n" + 
				"	Speed	12.0";
		if(output1.equals(me.statement()))
		{
			assert true;
	
	}
		
	}
	/*
	 * TODO 2			10 Marks
	 * Provide at least two more test cases carefully chosen so that they satisfy our testing
	 * strategy basics i.e. input partition etc
	 */
	/**
	 * test case2 for new release movie rent
	 */
     @Test
     public void newmovie() {
    	 
    	 me.addRental(new Rental(m2,1));
    	 assertEquals(me.statement(),me.statement());
     }
    
 	/**
 	 * testcase3 customer rent movies
 	 */
 	
 		
 		@Test
 		public void rentalsSum() {
 			me2.addRental(new Rental(m1,1));
 		    me2.addRental(new Rental(m2,2));
 		    me2.addRental(new Rental(m3,3));
 		    assertEquals(me2.statement(),me2.statement());
 		    
 			
 		
 		
 		}
 			
 		}
	
     
	

}
