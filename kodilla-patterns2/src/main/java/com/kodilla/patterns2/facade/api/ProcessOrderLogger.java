package com.kodilla.patterns2.facade.api;

import com.kodilla.patterns2.aop.calculator.Watcher;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;


@Aspect
@Component
public class ProcessOrderLogger {
    private static final Logger LOGGER = LoggerFactory.getLogger(ProcessOrderLogger.class);

    @Before("execution(* com.kodilla.patterns2.facade.api.OrderFacade.processOrder(..))" +
            "&& args(order, userId)")

    public void logEvent(OrderDto order, Long userId) {
        LOGGER.info("Method processOrder() was called. Item quantity: " + order.getItems().size() + " ordered by user with ID: " + userId);    }
}
