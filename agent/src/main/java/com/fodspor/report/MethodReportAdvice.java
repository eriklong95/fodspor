package com.fodspor.report;

import net.bytebuddy.asm.Advice;
import net.bytebuddy.asm.Advice.OnMethodEnter;

public class MethodReportAdvice {

    @OnMethodEnter
    public static void enter(@Advice.Origin final String origin) {
        System.out.println("agent: target entered method " + origin);
    }

}
