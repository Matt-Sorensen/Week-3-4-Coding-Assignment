package codingAssignment3_4;

public class codingAssignment3_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//1.	Create an array of int called ages that contains the following values: 3, 9, 23, 64, 2, 8, 28, 93.
						
						int [] ages = {3, 9, 23, 64, 2, 8, 28, 93};
						
		
				//a.	Programmatically subtract the value of the first element in the array from the value in the last element of the array (i.e. do not use ages[7] in your code). Print the result to the console.  
				
						System.out.println("Question 1a: ");
						
						int arraySubtraction = ages[ages.length - 1] - ages [0];
						
						System.out.println(arraySubtraction);
						
						//ages.length takes the total length of array and subtracts 1 because Zero-based array indexing starts at 0 and would throw an out of bounds exception without doing this.
						
						
				//b.	Add a new age to your array and repeat the step above to ensure it is dynamic (works for arrays of different lengths).
						
						System.out.println("Question 1b: ");
						
						int [] ages2 = {3, 9, 23, 64, 2, 8, 28, 93, 77};
						
						int arraySubtraction2 = ages2[ages2.length - 1] - ages2 [0];
						
						System.out.println(arraySubtraction2);
						
		
				//c.	Use a loop to iterate through the array and calculate the average age. Print the result to the console.
						
						System.out.println("Question 1c: ");
						
						double sum = 0;
						double averageAge = 0;
						
						for (int age : ages) {
							
							sum += age;
							
							averageAge = sum / ages.length;
						}
							System.out.println(averageAge);
							
		
		//2.	Create an array of String called names that contains the following values: “Sam”, “Tommy”, “Tim”, “Sally”, “Buck”, “Bob”.
				
						String [] names = {"Sam", "Tommy", "Tim", "Sally", "Buck", "Bob"};
						
							
				//a.	Use a loop to iterate through the array and calculate the average number of letters per name. Print the result to the console.
						
						System.out.println("Question 2a: ");
						
						        double charactersInNamesArray = 0.0;
						        
						        for (int i = 0; i < names.length; i++) {
						           
						        	charactersInNamesArray += names[i].length();
						        }

						       double averageNameLength = charactersInNamesArray / names.length;
						       
						       System.out.println(averageNameLength);
						       
						       //names.length calculates the length of the array while names[i].length() calculates how many characters are in each element [i] of the names array
							
						
				//b.	Use a loop to iterate through the array again and concatenate all the names together, separated by spaces, and print the result to the console.
						       
						       System.out.println("Question 2b: ");
						       
						       String concatenatedNames = "";
						       
						       for (String name : names) {
						    	   
						    	   concatenatedNames += name + " ";
						       }
						       
						       System.out.println(concatenatedNames);
						       
		
		//3.	How do you access the last element of any array?
						       
						       System.out.println(names[names.length - 1]);
						       
		
		//4.	How do you access the first element of any array?
		
						       System.out.println(names[0]);
						       
		
		//5.	Create a new array of int called nameLengths. Write a loop to iterate over the previously created names array and add the length of each name to the nameLengths array.
						     
						       System.out.println("Question 5: ");
						       
						       int [] nameLengths = new int [6];
						       
						       for (int i = 0; i < names.length; i++) {
						           
						    	   nameLengths[i] = names[i].length();
						    	   
						    	   System.out.println(nameLengths[i]);
						       }
					
						       
		//6.	Write a loop to iterate over the nameLengths array and calculate the sum of all the elements in the array. Print the result to the console.
						       
						       System.out.println("Question 6: ");
						       
						       int charactersInNameLengthsArray = 0;
						       
						       for (int i = 0; i < nameLengths.length; i++) {
						    	   
						    	   charactersInNameLengthsArray += nameLengths[i];
						       }
						       
						       System.out.println(charactersInNameLengthsArray);
						       
						       
       //***This area is used for testing the results of the following methods exercises***
						       
			System.out.println("Question 7: ");

			System.out.println(returnWordTimesN("Billy", 5));
			
								
		    System.out.println("Question 8: ");

			System.out.println((fullName("Matt", "Sorensen")));
			
																		
		    System.out.println("Question 9: ");

			int [] intArray = {5, 6, 7, 5, 45, 99};
																		
			System.out.println(isSumGreater100(intArray));
			
																		
		    System.out.println("Question 10: ");

			double[] doubleArray = {10.0, 10.0, 10.0, 10.0, 10.0};
																		
			System.out.println(averageDouble(doubleArray));
			
																		
		    System.out.println("Question 11: ");

			double[] doubleArrayX = {10.0, 10.0, 10.0, 10.0, 10.0};
																		
			double[] doubleArrayY = {5.0, 5.0, 5.0, 5.0, 5.0};
																		
			System.out.println(isArray1Greater(doubleArrayX, doubleArrayY));
			
																	
		    System.out.println("Question 12: ");

			boolean isHotOutside = true;
																		
			double moneyInPocket = 11;
																		
			System.out.println(willBuyDrink(isHotOutside, moneyInPocket));
			
																		
		    System.out.println("Question 13: ");

			boolean haveYouEaten = false;
																		
			int militaryTime = 2200;
																		
			System.out.println(isItTimeToGoToBed(haveYouEaten,militaryTime));
			
	}
						       
		//7.	Write a method that takes a String, word, and an int, n, as arguments and returns the word concatenated to itself n number of times. (i.e. if I pass in “Hello” and 3, I expect the method to return “HelloHelloHello”).
	
	
						       public static String returnWordTimesN( String word, int n) {
						    	   
						    	   String result = "";
						    	   
						    	   for (int i = 1; i <= n; i++) {
						    		   
						    		   result += word;
						    
						       }
						    	  
						    	   return result;
				 }
						       
						       
		//8.	Write a method that takes two Strings, firstName and lastName, and returns a full name (the full name should be the first and the last name as a String separated by a space).
						       
						       
						       public static String fullName (String firstName, String lastName) {
						    	   
						    	   String result = firstName + " " + lastName;
						    
						       return result;
						       
						       }

		
		//9.	Write a method that takes an array of int and returns true if the sum of all the ints in the array is greater than 100.
						       
						      
						       public static boolean isSumGreater100 (int[] x) {
						    	   
						    	   int sumOfInts = 0;
						  
						    	   for (int number : x) {
						    		   
						    		   sumOfInts += number;
						    		   
						    	   } if (sumOfInts > 100) {
						    		   
						    		   return true;
						    	   }
						    	   
								return false;
								
						       }
						       
		//10.	Write a method that takes an array of double and returns the average of all the elements in the array.
								
								public static double averageDouble (double[] x) {
									
									double sumElement = 0.0;
									
									//for (int i = 0; i < x.length; i++) {
									
									for (double element : x) {
										
										sumElement += element;
										
										//sumElement += x[i];

									}
									
									return sumElement / x.length;
								
								
								}
		//11.	Write a method that takes two arrays of double and returns true if the average of the elements in the first array is greater than the average of the elements in the second array.
		
									public static boolean isArray1Greater (double[] x, double[] y) {
										
										double xSum = 0.0;
										double ySum = 0.0;
										
										for (double element : x) {
											
											xSum += element;
										}
										
										for(double element : y) {
											
											ySum += element;
										}
										
										if ((xSum / x.length) > (ySum / y.length)) {
											
											return true;
										}
										
										else {
											
											return false;
										}
									}
										
									
		//12.	Write a method called willBuyDrink that takes a boolean isHotOutside, and a double moneyInPocket, and returns true if it is hot outside and if moneyInPocket is greater than 10.50.
		
										public static boolean willBuyDrink (boolean isHotOutside, double moneyInPocket) {
											
											if (isHotOutside == true && moneyInPocket > 10.50) {
												
												return true;
											}
											
											else {
												
												return false;
											}
											
										}
										
										
		//13.	Create a method of your own that solves a problem. In comments, write what the method does and why you created it.

		//Write a method called isItTimeToGoToBed that takes a boolean haveYouEaten, and a int militaryTime, and returns true if you've eaten and it's past 2200 hours.
		
										
											public static boolean isItTimeToGoToBed (boolean haveYouEaten, int militaryTime ) {
												
												if (haveYouEaten == true && militaryTime > 2200) {
													
													return true;
												}
												
												else {
													
													return false;
												
												}
									
											
		
											}
											
											
	

}
