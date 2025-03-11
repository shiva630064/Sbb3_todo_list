package dao;

import java.util.List;
import beans.Register;
import beans.Task;

public interface ToDoDAO {
	public int rigister(Register register);
	public int login(String email, String pass);
	public List<Task> findTaskByRegId(int regId);
	public int addTask(int regID, Task task);
	public boolean markTaskCompleted(int taskId, int regId);
	
}
