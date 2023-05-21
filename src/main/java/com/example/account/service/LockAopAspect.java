package com.example.account.service;

import com.example.account.aop.AccountLockIdInterFace;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.beans.factory.annotation.Required;
import org.springframework.stereotype.Component;

@Aspect
@Component
@Slf4j
@RequiredArgsConstructor
public class LockAopAspect {

    private final LockService lockService;

    @Around("@annotation(com.example.account.aop.AccountLock) && args(request)")
    public Object aroundMethod(
            ProceedingJoinPoint pjp,
            AccountLockIdInterFace request
    ) throws Throwable {
        //lock 취득 시도
        lockService.Lock(request.getAccountNumber());
        try{
            //동작 전
            return pjp.proceed();
            //동작 후
        } finally {
            //lock 해제
            lockService.unlock(request.getAccountNumber());
        }
    }
}
