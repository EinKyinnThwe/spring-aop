package com.demo.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Aspect
@Component
public class MyCurrencyServiceAspect {
    @Pointcut("within(com.demo.service.*)")
    public void withinPointCut() {}
    //@Before("withinPointCut()")
    public void beforeCurrencyAdvice(JoinPoint joinPoint) {
        System.out.println(
                String.format("%s is invoked before with:%s",
                        joinPoint.getSignature().getName(),
                        Arrays.toString(joinPoint.getArgs()))
        );
    }
    //@Pointcut("@within(com.demo.annotation.Secured)")
    public void annotationWithinPointCut() {}
    public void beforeWithinAdvice(JoinPoint joinPoint) {
        System.out.println(
                String.format("%s is invoked before with:%s",
                        joinPoint.getSignature().getName(),
                        Arrays.toString(joinPoint.getArgs()))
        );
    }
    @Pointcut("@annotation(com.demo.annotation.InTransaction)")
    public void annotation(){}
    //@Before("annotationWithinPointCut()")
    public void annotationBeforeAdvice(JoinPoint joinPoint) {
        System.out.println(
                String.format("%s is invoked before with:%s",
                        joinPoint.getSignature().getName(),
                        Arrays.toString(joinPoint.getArgs()))
        );
    }
    @Pointcut("bean(my_bean)")
    public void beanPointCut(){}
    //@Before("beanPointCut()")
    public void myBeanBeforeAnnotation(JoinPoint joinPoint) {
        System.out.println(
                String.format("%s is invoked before with:%s",
                        joinPoint.getSignature().getName(),
                        Arrays.toString(joinPoint.getArgs()))
        );
    }
    @Pointcut("args(int , double )")
    public void argsPointCut(){}
    //@Before("argsPointCut()")
    public void argsBeforeAdvice(JoinPoint joinPoint){
        System.out.println(
                String.format("%s is invoked before with:%s",
                        joinPoint.getSignature().getName(),
                        Arrays.toString(joinPoint.getArgs()))
        );
    }
    @Pointcut("@args(com.demo.annotation.Validated)")
    public void annotationArgsPointCut(){}
    //@Before("annotationArgsPointCut()")
    public void annotationBeforeCurrencyTypeAdvice(JoinPoint joinPoint) {
        System.out.println(
                String.format("%s is invoked before with:%s",
                        joinPoint.getSignature().getName(),
                        Arrays.toString(joinPoint.getArgs()))
        );
    }
    //@AfterReturning(value = "annotationArgsPointCut()", returning = "name")
    public void afterReturningAdvice(JoinPoint joinPoint, String name) {
        System.out.println(
                String.format("%s is invoked before with:%s and return value:[%s]",
                        joinPoint.getSignature().getName(),
                        Arrays.toString(joinPoint.getArgs()), name)
        );
    }
    //@AfterThrowing(value = "annotationArgsPointCut()", throwing = "exception")
    public void afterThrowingAdvice(JoinPoint joinPoint, Exception exception) {
        System.out.println("Exception caught::" + exception);
    }
    @Pointcut("@target(com.demo.annotation.Secured)")
    public void targetPointCut() {}
    //@Before("targetPointCut()")
    public void targetAnnotationAdvice(JoinPoint joinPoint) {
        System.out.println(
                String.format("%s is invoked before with:%s",
                        joinPoint.getSignature().getName(),
                        Arrays.toString(joinPoint.getArgs()))
        );
    }
    @Pointcut("execution(public void com.demo.service.MyCurrencyService.changeCurrency(..))")
    public void changeCurrencyPointCut(){}
    //@Before("changeCurrencyPointCut()")
    public void executionBeforeAdvice(JoinPoint joinPoint) {
        System.out.println(
                String.format("%s is invoked before with:%s",
                        joinPoint.getSignature().getName(),
                        Arrays.toString(joinPoint.getArgs()))
        );
    }
    @Before("withinPointCut() && annotationArgsPointCut()")
    public void combinationAdvice(JoinPoint joinPoint) {
        System.out.println(
                String.format("%s is invoked before with:%s",
                        joinPoint.getSignature().getName(),
                        Arrays.toString(joinPoint.getArgs()))
        );
    }
}
