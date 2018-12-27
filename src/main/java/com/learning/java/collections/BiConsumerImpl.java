package com.learning.java.collections;

import java.util.function.BiConsumer;

public class BiConsumerImpl implements BiConsumer<String, String> {

	@Override
	public void accept(String key, String value) {
		System.out.println(key);
		System.out.println(value);
	}

}
