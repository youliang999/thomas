package com.youliang.thomas.helper;

import java.util.Date;

public class IdGenerator {

    public static long generatorId() {
            return new Date().getTime();
    }
}
