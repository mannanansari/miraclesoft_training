package com.example.practise_spring.Basic.Demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class BinarySearchImpl {
	@Autowired
	public SortAlgorithm sortAlgorithm;

}
