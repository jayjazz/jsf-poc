package net.holon.jsfpoc;

import java.io.Serializable;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

import org.activiti.engine.ProcessEngine;
import org.activiti.engine.ProcessEngines;
import org.activiti.engine.RuntimeService;
import org.activiti.engine.runtime.ProcessInstance;

@ManagedBean
@ViewScoped
public class ActivitiUtil implements Serializable {

	private static final long serialVersionUID = 1L;

	private ProcessEngine processEngine;
	private String taskId;
	private List<ProcessInstance> processes;

	public ActivitiUtil() {
		processEngine = ProcessEngines.getDefaultProcessEngine();
		if (processEngine != null) {
			RuntimeService rService = processEngine.getRuntimeService();
			ProcessInstance task = rService.startProcessInstanceByKey("task");
			taskId = task.getId();
			processes = rService.createProcessInstanceQuery().list();
		} else {
			taskId = "Creating process engine failed";
		}
	}
	
	public void addTask() {
		RuntimeService rService = processEngine.getRuntimeService();
		ProcessInstance task = rService.startProcessInstanceByKey("task");
		taskId = task.getId();
	}

	public String getTaskId() {
		return taskId;
	}

	public void setTaskId(String taskId) {
		this.taskId = taskId;
	}

	public List<ProcessInstance> getProcesses() {
		return processes;
	}

	public void setProcesses(List<ProcessInstance> processes) {
		this.processes = processes;
	}

}
