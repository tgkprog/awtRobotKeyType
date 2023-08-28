package org.s2n.ddt.util;

//send enter keys
public class EnterKeys {
    static final String VER = "b004";

    public static void main(String[] args) throws Exception {
        if (args.length == 0 || args[0].indexOf('h') > -1 || args[0].indexOf('H') > -1) {
            System.err.println("Needs one parameter atleast,  count of enter chars. ");

            System.err.println(
                    "If two args then first is milliseconds sleep between enter chars and 2nd is number of enter chars");

            System.err.println(
                    "If three args then first is milliseconds initial sleep, then milliseconds sleep between enter chars and 2nd is number of enter chars");

            return;
        }

        int fromArgsI = 0;
        long slp1 = 2000;
        long slp2 = 350;

        if (args.length > 2) {
            System.out.println(" parsing sleep 1 from first arg :" + args[fromArgsI]);
            slp1 = Long.parseLong(args[fromArgsI++]);
        }

        if (args.length > 1) {
            slp2 = Long.parseLong(args[fromArgsI++]);
            if (slp2 < 110) {
                slp2 = 111;
            }
        }

        long cnt = Long.parseLong(args[fromArgsI]);
        fromArgsI++;

        System.out.println("v " + VER + " with cnt " + cnt + ", with sleep between (slp2) :" + slp2
                + " and sleep initial (slp1) :" + slp1);
        Thread.sleep(slp1);
        for (long i = 0; i < cnt; i++) {
            RobotHelper.sendEnterKey();
            Thread.sleep(slp2);
            System.out.println("v " + VER + " Iteration " + i + " of " + cnt + ", with slep 2 " + slp2);
        }
    }

}
