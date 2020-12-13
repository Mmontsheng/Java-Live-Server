package com.mmontsheng.liveserver;

import java.util.Optional;

public class Arguments {

    public static Boolean hasArgs(String arg, String[] args, int argIndex, Boolean hasArgument) {
        return (argIndex < args.length && args[argIndex].equals(arg)) && (!hasArgument || argIndex + 1 < args.length);
    }

    public static Optional<String> getArgOption(String[] args, int argIndex) {
        return argIndex + 1 < args.length ? Optional.ofNullable(args[argIndex + 1]) : Optional.empty();
    }

}
