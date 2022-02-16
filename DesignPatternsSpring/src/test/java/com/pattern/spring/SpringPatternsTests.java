package com.pattern.spring;

import com.pattern.spring.creational.prototype.ProtoFalse;
import com.pattern.spring.creational.prototype.ProtoTrue;
import com.pattern.spring.creational.singleton.PoolConnection;
import com.pattern.spring.creational.singleton.PoolThread;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertSame;

@SpringBootTest
class SpringPatternsTests {

	@Autowired
	private PoolThread poolThread;

	@Autowired
	private PoolThread poolThread2;

	@Autowired
	private ProtoTrue protoTrue1;

	@Autowired
	private ProtoTrue protoTrue2;

	@Autowired
	private ProtoFalse protoFalse;

	@Autowired
	private ProtoFalse protoFalse2;

	@Test
	void testSingletonInstances() {
		PoolConnection poolConnection1 = PoolConnection.getInstance();
		PoolConnection poolConnection2 = PoolConnection.getInstance();
		assertSame(poolConnection1, poolConnection2);

		assertSame(poolThread,poolThread2);
	}

	@Test
	void testPrototypes(){
		assertSame(protoFalse, protoFalse2);
		assertFalse(protoTrue1.equals(protoTrue2));
	}

}
