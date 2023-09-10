package com.pblgllgs;

import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
class AppCiCdApplicationTests {

	private static final Logger LOGGER = LoggerFactory.getLogger(AppCiCdApplicationTests.class);

	@Test
	void contextLoads() {
		String msg = "Tests run successfully";
		LOGGER.info(msg);
		assertThat(msg).isEqualTo("Tests run successfully");
	}

}
