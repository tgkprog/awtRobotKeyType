package org.s2n.ddt.util;

public class SendKeys {
	public static void main(String[] args) throws Exception {
		if(args.length == 0){
			args = new String[]{"343"};
		}
		args[0] = "" + args[0];
		args[0] = args[0].replace("\\n", "\n");
		Thread.sleep(2000);
		RobotHelper.sendKeys(args[0], 30);
	}

}
