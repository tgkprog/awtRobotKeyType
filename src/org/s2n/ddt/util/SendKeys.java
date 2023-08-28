package org.s2n.ddt.util;

public class SendKeys {
	public static void main(String[] args) throws Exception {
		if (args.length == 0) {
			System.out.println("Needs one parameter atleast, string to send");
			System.out.println(
					"If more than one parameter, tests if first param starts with <<<loop-123>>> if so loops over 2nd and rest of params. ");
			System.out.println(
					"Count will be 123, the 123 is the number of times to loop, can be any Java integer literal. ");
			System.out.println(
					"Other parameter supported is <<<wait-1234>>> where 1234 is milliseconds to wait before next action, default is 2000 if only 1 param sent");
			System.out.println("Example:");
			System.out.println("SendKeys Tushar");
			System.out.println("this will wait 2 seconds and then send the keys Tushar");
			System.out.println("");
			System.out.println("SendKeys  <<<wait-3500>>> <<<loop-5>>> Tushar \" Kapila\"");
			System.out.println(
					"waits 3.5 seconds then sends in a 5 iterations loop \"Tushar Kapila\" the loop is effective for all args after it till another loop is encountered.");

			System.out.println("");
			System.out.println(
					"SendKeys  <<<wait-4000>>> <<<loop-3>>> Tushar \" Kapila\" <<<loop-2>>> <<<wait-5000>>>  \"Okay\\\n\\\n\" ");
			System.out.println(
					"waits 4 seconds then sends in a 3 iterations loop \"Tushar Kapila\" the loop is effective for all args after it till another loop is encountered. Next in 2 iterations loop, waits 5 seconds, then sends Okay followed by two new line characters. New lines need slash escaped followed by n");
			return;
		}
		args[0] = "" + args[0];
		args[0] = args[0].replace("\\n", "\n");
		Thread.sleep(2000);
		RobotHelper.sendKeys(args[0], 30);
	}

}
