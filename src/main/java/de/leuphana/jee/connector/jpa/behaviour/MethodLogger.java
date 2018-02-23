package de.leuphana.jee.connector.jpa.behaviour;

import java.lang.reflect.Method;

import org.apache.log4j.Logger;
import org.springframework.aop.AfterReturningAdvice;
import org.springframework.aop.MethodBeforeAdvice;

public class MethodLogger implements MethodBeforeAdvice, AfterReturningAdvice {

	private static Logger logger;

	private long startTime;

	static {
		logger = Logger.getLogger(MethodLogger.class);
	}

	public MethodLogger() {
		startTime = System.currentTimeMillis();
	}

	@Override
	public void before(Method method, Object[] args, Object target) throws Throwable {
		logger.info("Enter " + method.getName());
	}

	@Override
	public void afterReturning(Object returnValue, Method method, Object[] args, Object target) throws Throwable {
		logger.info("Method " + method.getName() + 
				" executed in " + (System.currentTimeMillis() - startTime) + " ms");
		logger.info("Exit " + method.getName());
	}

}
