package com.example.myprocess.impl;

import org.activiti.engine.EngineServices;
import org.activiti.engine.RuntimeService;
import org.activiti.engine.delegate.DelegateExecution;
import org.activiti.engine.delegate.ExecutionListener;
import org.activiti.engine.delegate.event.ActivitiEvent;
import org.activiti.engine.delegate.event.ActivitiEventListener;

public class UserTaskListener implements ExecutionListener {

	public void onEvent(ActivitiEvent event) {
        switch (event.getType()) {
        case ACTIVITY_STARTED:
        	System.out.println("UserTaskListener.onEvent.ACTIVITY_STARTED");
        	EngineServices engineServices = event.getEngineServices();
        	String executionId = event.getExecutionId();
        	RuntimeService runtimeService = engineServices.getRuntimeService();
        	runtimeService.setVariable(executionId, "userTaskVariable", "user_task");
        }
	}

	public boolean isFailOnException() {
		// TODO Auto-generated method stub
		return false;
	}

	public void notify(DelegateExecution execution) throws Exception {
		System.out.println("UserTaskListener.notify");
    	execution.setVariable("userTaskVariable", "user_task");
    	System.out.println(execution.getVariables());
	}

}
