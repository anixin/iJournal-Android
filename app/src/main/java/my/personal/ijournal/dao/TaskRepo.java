package my.personal.ijournal.dao;

import java.util.ArrayList;
import java.util.List;

import my.personal.ijournal.model.Task;

public class TaskRepo {
    public List<Task> getAllTaskCategory(){
        List<Task> taskList = new ArrayList<>();
        for(int i = 0;i<5;  i++){
            Task task = new Task();
            task.setTaskName("Task : " + i);

            taskList.add(task);
        }
        return taskList;
    }

}
