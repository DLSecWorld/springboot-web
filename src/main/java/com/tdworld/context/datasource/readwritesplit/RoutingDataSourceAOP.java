package com.tdworld.context.datasource.readwritesplit;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.core.Ordered;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class RoutingDataSourceAOP implements Ordered {

    @Around("@annotation(tradingDataSource)")
    public Object proceed(ProceedingJoinPoint proceedingJoinPoint, TradingDataSource tradingDataSource) throws Throwable {
        try {
            ThreadDBHolder.set(tradingDataSource.value());
            return proceedingJoinPoint.proceed();
        } finally {
            ThreadDBHolder.clear();
        }
    }	
	
	@Override
	public int getOrder() {
		return 0;
	}

}
