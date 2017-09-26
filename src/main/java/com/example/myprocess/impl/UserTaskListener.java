package com.example.myprocess.impl;

import org.activiti.engine.delegate.DelegateExecution;
import org.activiti.engine.delegate.ExecutionListener;

public class UserTaskListener implements ExecutionListener {

	private static final long serialVersionUID = -572873089377492574L;

	public void notify(DelegateExecution execution) throws Exception {
		System.out.println("UserTaskListener.notify");
    	execution.setVariable("userTaskVariable", "user_task");
    	System.out.println(execution.getVariables());
	}

}
