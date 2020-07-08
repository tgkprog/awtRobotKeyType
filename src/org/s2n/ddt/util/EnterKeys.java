package org.s2n.ddt.util;

public class EnterKeys {
	public static void main(String[] args) throws Exception {
		if(args.length == 0){			
			System.out.println("Needs one parameter atleast,  count of enter chars followed by sleep between sends");
		
			return;
		}
		args[0] = "" + args[0];
		args[0] = args[0].replace("\\n", "\n");
		Thread.sleep(2000);
		long cnt = Long.parseLong(args[0]);
		long slp3 = 350;
		if(args.length > 1){
            slp3 = Long.parseLong(args[1]);
            if(slp3 < 110){
                slp3 = 111;
            }
        }
		for(long i=0; i<  cnt; i++){
            RobotHelper.sendEnterKey();
            Thread.sleep(slp3);
            System.out.println("v b002 c " + i + " of " + cnt + ", with slep " + slp3);
            }
	}

}
