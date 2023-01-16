package com.mervyn.learn.quarkus;

import javax.interceptor.AroundInvoke;
import javax.interceptor.Interceptor;
import javax.interceptor.InvocationContext;

/**
 * @author cs-mervyn
 * @version 1.0
 * @date 2023/1/12 16:43
 */
@MTest
@Interceptor
public class MTestInterceptor {
    @AroundInvoke
    public Object sss(InvocationContext invocationContext) throws Exception {
        System.out.println("ffff");
        Object proceed = invocationContext.proceed();
        System.out.println("sss");

        return proceed;

    }
}
