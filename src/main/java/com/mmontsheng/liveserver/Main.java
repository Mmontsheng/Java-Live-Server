package com.mmontsheng.liveserver;

public class Main {

    public static void main(String[] args) {
        for (int i = 0; i < args.length; i++) {
            if (Boolean.TRUE.equals(Arguments.hasArgs("-h", args, i, false))) {
                UsageHelper.printHelpeMessage();
                return;
            }
            // check for other options
        }
    }

}
