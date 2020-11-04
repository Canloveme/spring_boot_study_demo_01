package cn.csq.springboot;

import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class SpringBoot03LoggingApplicationTests {

	/**
	 * 记录器
	 */
	Logger logger = LoggerFactory.getLogger(getClass());

	@Test
	void contextLoads() {
	}

	/**
	 * 日志的级别：
	 * 由低到高 trace<debug<info<warn<error
	 * 可以调整输出的日志级别：日志就只会在这个级别以后的高级别生效
	 */
	@Test
	public void testLogging() {
		//System.out.println();
		logger.trace("trace日志");
		logger.debug("debug日志");
		logger.info("info日志");
		logger.warn("warn日志");
		logger.error("error日志");
	}

}
