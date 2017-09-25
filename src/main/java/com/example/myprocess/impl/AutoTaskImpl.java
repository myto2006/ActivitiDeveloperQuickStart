package com.example.myprocess.impl;

import java.util.Map;

import org.activiti.engine.delegate.DelegateExecution;
import org.activiti.engine.delegate.JavaDelegate;

public class AutoTaskImpl implements JavaDelegate {

	  public void execute(DelegateExecution execution) {
	    String var = (String) execution.getVariable("name");
	    var = var.toUpperCase();
	    execution.setVariable("name", var);
	    Map<String, Object> map = execution.getVariables();
	    System.out.println(map);
	  }

	}