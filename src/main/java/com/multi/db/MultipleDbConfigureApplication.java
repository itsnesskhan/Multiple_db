package com.multi.db;

import java.util.Arrays;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MultipleDbConfigureApplication {

	public static void main(String[] args) {
		SpringApplication.run(MultipleDbConfigureApplication.class, args);
	}
	
	public int sum3(int[] nums) {
		  return Arrays.stream(nums).reduce(0, (el,el2)-> el+el2);
		}


}
