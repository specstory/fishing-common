package com.specstory.common.aspect;

import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;
import org.springframework.util.StopWatch;

@Slf4j
@Component
@Aspect
public class StopWatchAspect {
   // Logger logger = LoggerFactory.getLogger(StopWatchAspect.class);

    //@Around("@annotation(StopWatchTarget)")
    @Around("execution(**..repository.*.*(..))")
    public Object logExecutionTime(ProceedingJoinPoint joinPoint) throws Throwable {
        StopWatch stopWatch = new StopWatch();
        stopWatch.start();

        // @LogExecutionTime 애노테이션이 붙어있는 타겟 메소드를 실행
        Object proceed = joinPoint.proceed();

        stopWatch.stop();

        System.out.println("걸린시간 : " + stopWatch.getLastTaskTimeMillis());
        log.info("걸린시간={}", stopWatch.getLastTaskTimeMillis());

        return proceed; // 결과 리턴
    }
}
