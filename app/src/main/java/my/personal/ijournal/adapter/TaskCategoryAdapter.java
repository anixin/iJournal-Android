package my.personal.ijournal.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

import my.personal.ijournal.R;
import my.personal.ijournal.model.Task;

public class TaskCategoryAdapter extends RecyclerView.Adapter<TaskCategoryAdapter.ViewHolder> {

    List<Task> taskList = new ArrayList<>();
    private Context context;

    public TaskCategoryAdapter(List<Task> taskList) {
        this.taskList = taskList;
        this.context = context;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.list_item, parent,false);

        return new ViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        Task task = taskList.get(position);
        holder.textViewHead.setText(task.getTaskName());
    }

    @Override
    public int getItemCount() {
        return taskList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{
        public TextView textViewHead;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            textViewHead = (TextView) itemView.findViewById(R.id.addTaskHeaderid);
        }
    }
}
