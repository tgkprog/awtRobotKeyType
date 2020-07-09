package org.s2n.ddt.util;

public class EnterKeys {
    static final String VER = "b003";
	public static void main(String[] args) throws Exception {
		if(args.length == 0){			
			System.out.println("Needs one parameter atleast,  count of enter chars followed by sleep between sends");
		
			return;
		}
		
		int fromArgsI = 0;
		long slp1 = 2000;
		if(args.length > 2){	
            System.out.println(" parsing sleep 1 from first arg :" + args[fromArgsI]);
            slp1 = Long.parseLong(args[fromArgsI]);
            fromArgsI++;
		}
		
		
		long cnt = Long.parseLong(args[fromArgsI]);
		fromArgsI++;
		long slp3 = 350;
		if(args.length > 1){
            slp3 = Long.parseLong(args[fromArgsI]);
            if(slp3 < 110){
                slp3 = 111;
            }
        }
        System.out.println("v " + VER + " with cnt " + cnt + ", with slep 3 :" + slp3 + " and sleep 1 :" + slp1);
        Thread.sleep(slp1);
		for(long i=0; i<  cnt; i++){
            RobotHelper.sendEnterKey();
            Thread.sleep(slp3);
            System.out.println("v " + VER + " Iteration " + i + " of " + cnt + ", with slep 3 " + slp3);
            }
	}

}
