package com.fodspor;

import com.fodspor.report.MethodReportTransformer;
import net.bytebuddy.agent.builder.AgentBuilder;
import net.bytebuddy.matcher.ElementMatchers;

import java.lang.instrument.Instrumentation;

public class Agent {

    public static void premain(String agentOps, Instrumentation instrumentation) {
        System.out.println("Hello from Agent!");

        new AgentBuilder.Default()
                .type(ElementMatchers.any())
                .transform(new MethodReportTransformer())
                .installOn(instrumentation);
    }
}
