package com.mmontsheng.liveserver;

public class UsageHelper {

    public static void printHelpeMessage() {
        System.out.println("Java Live Server\n");
        for (Helper helper : Helper.values()) {
            String messsage = helper.getArg() + "\t"+helper.getName()+"\t\t" + helper.getDescription();
            System.out.println(messsage);
        }
    }

    private enum Helper {
        HELP("-h", "Help","Prints this help message"),
        DEBUG("-d", "Debug", "A flag to enable debug logs, default: false"),
        ENTRY_POINT("-e", "Entry", "Specify the top level directory to watch for changes"),
        PORT("-p","Port", "Specify an alternate port from the default Live Reload port");

        private String arg;
        private String name;
        private String description;

        private Helper(String arg, String name, String description) {
            this.arg = arg;
            this.name = name;
            this.description = description;
        }

        public String getArg() {
            return arg;
        }
        
        public String getName() {
            return name;
        }

        public String getDescription() {
            return description;
        }
    }
}
