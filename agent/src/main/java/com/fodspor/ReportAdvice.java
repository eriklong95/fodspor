package com.fodspor;

import net.bytebuddy.asm.Advice;
import net.bytebuddy.asm.Advice.OnMethodEnter;

public class ReportAdvice {

    @OnMethodEnter
    public static void enter(@Advice.Origin final String origin) {
        System.out.println("entered method " + origin);
    }

}
