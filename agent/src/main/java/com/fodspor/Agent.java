/*
 * This source file was generated by the Gradle 'init' task
 */
package com.fodspor;

import net.bytebuddy.agent.builder.AgentBuilder;
import net.bytebuddy.asm.Advice;
import net.bytebuddy.matcher.ElementMatchers;

import java.lang.instrument.Instrumentation;

public class Agent {

    public static void premain(String agentOps, Instrumentation instrumentation) {
        System.out.println("Hello from Agent!");

        var advice = Advice.to(ReportAdvice.class);

        new AgentBuilder.Default()
                .type(ElementMatchers.any())
                .transform((builder, typeDescription, classLoader, javaModule, protectionDomain) -> builder.visit(advice.on(ElementMatchers.isMethod())))
                .installOn(instrumentation);
    }
}
