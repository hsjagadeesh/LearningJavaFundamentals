package com.learning.java.inheritance;

import java.util.Comparator;
import java.util.function.BiConsumer;

public interface A extends BiConsumer<String, String>, Comparator<String> {

}
