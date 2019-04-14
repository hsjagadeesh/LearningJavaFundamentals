package com.learning.java.clone;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Builder
@Getter
@Setter
public class Address {

    String street;
    String city;
    Long zip;
}
