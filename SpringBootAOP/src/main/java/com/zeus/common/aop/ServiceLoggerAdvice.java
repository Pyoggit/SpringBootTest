package com.zeus.common.aop;

import java.util.Arrays;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
//import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
//import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Component
@Aspect
public class ServiceLoggerAdvice {

	@Around("execution(* com.zeus.service.BoardService*.*(..))")
	public Object timeLog(ProceedingJoinPoint pjp) throws Throwable {
		long startTime = System.currentTimeMillis();
		log.info(Arrays.toString(pjp.getArgs()));
		Object result = pjp.proceed();
		long endTime = System.currentTimeMillis();
		log.info(pjp.getSignature().getName() + " : " + (endTime - startTime));
		return result;
	}

	/*
	 * @Before("execution(* com.zeus.service.BoardService*.*(..))") public void
	 * startLog(JoinPoint jp) { log.info("ServiceLoggerAdvice");
	 * log.info("ServiceLoggerAdvice jp.signature"+jp.getSignature());
	 * log.info("ServiceLoggerAdvice jp.signature"+Arrays.toString(jp.getArgs()));
	 * log.info("========================================================="); }
	 * 
	 * @AfterReturning(pointcut =
	 * "execution(* com.zeus.service.BoardService*.*(..))", returning = "result")
	 * public void stopLog(JoinPoint jp, Object result) {
	 * log.info("ServiceLoggerAdvice.stopLog"); if(result != null) {
	 * log.info("ServiceLoggerAdvice.stopLog" + result.toString()); }
	 * log.info("========================================================="); }
	 */

	@AfterThrowing(pointcut = "execution(* com.zeus.service.BoardService*.*(..))", throwing = "e")
	public void exceptionLog(JoinPoint jp, Exception e) {
		log.info("ServiceLoggerAdvice.stopLog");
		if (e != null) {
			log.info("ServiceLoggerAdvice.stopLog exception" + e.toString());
		}
		log.info("=========================================================");
	}
}
