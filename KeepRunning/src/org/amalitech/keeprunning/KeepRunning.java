package org.amalitech.keeprunning;
import java.util.Scanner;
public class KeepRunning {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String codeTriggerStarterStr="start";
	    
		rerunKeyboardInput(codeTriggerStarterStr);
	}//end of main method
	private static void rerunKeyboardInput(String codeTriggerStarterStr ) {
		boolean programRunningBool;
		Scanner keyboardInput=new Scanner(System.in);
		String keyboardInputStr=keyboardInput.nextLine();
		
		if (keyboardInputStr.equalsIgnoreCase(codeTriggerStarterStr)) {
			programRunningBool=true;
			//int x=0;
			//int y=5;
			//we need to trigger to start the code
			while(programRunningBool==true) {
				//if (x<y) {
					
					String keyboardInputStr2=keyboardInput.nextLine();
					String codeTriggerEnderStr="end";
					if (keyboardInputStr2.equalsIgnoreCase(codeTriggerEnderStr))
					{
						programRunningBool=false;
						System.out.println("Program ended");
					}
					else
					{
					System.out.println(keyboardInputStr2);
					
				//	System.out.println("We are still in the while : "+Integer.toString(x));
				//	x=x+1;
					}
				}
			//	else {
				//	programRunningBool=false;
				//	System.out.println("We are still in the while loop.");
							
				//}
				//We need a trigger to end the code
			//}//End of while loop
				//System.out.println("Hurrayy! we are out of the while loop");
			keyboardInput.close();
		}
		else 
		{
			System.out.println(keyboardInputStr);
			System.out.println("Please restart"+ " and enter start to run code");
			rerunKeyboardInput(codeTriggerStarterStr);
			
		}
	}


		}

