package com.educate.BlockBuilderJava.validators;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class InputValidatorAspect {
    @Around("execution(public * com.educate.BlockBuilderJava.MainController.randomNumbers(..))")
    public Object validateInputData(ProceedingJoinPoint joinPoint) throws Throwable {
        System.out.println("start - " + joinPoint.getArgs()[0]);
        return joinPoint.proceed();
    }
}
