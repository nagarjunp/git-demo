package com.atom.gitdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class GitDemoApplication {
	public void addData(String data) {
		if (data.equals(Constant.DATA_TYPE)) {
			System.out.println("Inside if looop");
		}
	}
	public void addMethod()
	{
		System.out.println("Added method");
	}
	public void addMethod2()
	{
		System.out.println("Added method2");
	}

	public void addMethodB2M()
	{
		System.out.println("Added method2");
	}

	public static void main(String[] args) {
		SpringApplication.run(GitDemoApplication.class, args);
	}

}
