package training.task.BankingApplication.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class AspectConfig {
    //Logging
    private Logger log = LoggerFactory.getLogger(AspectConfig.class);

    @Before(value = "execution(* training.task.BankingApplication.*.*(..))")
    public void methodBefore(JoinPoint joinPoint){
        log.info("Executing ()"+joinPoint.getSignature().getName());
    }
}
