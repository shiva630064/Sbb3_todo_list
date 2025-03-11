package beans;

import java.util.Objects;

public class Task {
	private int taskid;
	private String taskName;
	private String taskDate;
	private int taskStatus;
	private int regId;
	
	public Task() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	

	public int getTaskid() {
		return taskid;
	}




	public void setTaskid(int taskid) {
		this.taskid = taskid;
	}




	public String getTaskName() {
		return taskName;
	}




	public void setTaskName(String taskName) {
		this.taskName = taskName;
	}




	public String getTaskDate() {
		return taskDate;
	}




	public void setTaskDate(String taskDate) {
		this.taskDate = taskDate;
	}




	public int getTaskStatus() {
		return taskStatus;
	}




	public void setTaskStatus(int taskStatus) {
		this.taskStatus = taskStatus;
	}




	public int getRegId() {
		return regId;
	}




	public void setRegId(int regId) {
		this.regId = regId;
	}




	public Task(int taskid, String taskName, String taskDate, int taskStatus, int regId) {
		super();
		this.taskid = taskid;
		this.taskName = taskName;
		this.taskDate = taskDate;
		this.taskStatus = taskStatus;
		this.regId = regId;
	}




	@Override
	public String toString() {
		return "Task [taskid=" + taskid + ", taskName=" + taskName + ", taskDate=" + taskDate + ", taskStatus="
				+ taskStatus + ", regId=" + regId + "]";
	}




	@Override
	public int hashCode() {
		return Objects.hash(regId, taskDate, taskName, taskStatus, taskid);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Task other = (Task) obj;
		return regId == other.regId && Objects.equals(taskDate, other.taskDate)
				&& Objects.equals(taskName, other.taskName) && taskStatus == other.taskStatus && taskid == other.taskid;
	}
	
	
	
	
}
