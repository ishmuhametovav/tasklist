package com.example.tasklist.repository.mappers;

import com.example.tasklist.domain.task.Status;
import com.example.tasklist.domain.task.Task;
import lombok.SneakyThrows;

import java.sql.ResultSet;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

public class TaskRowMapper
{
    @SneakyThrows
    public static Task mapRow(ResultSet resultSet)
    {
        if(resultSet.next())
        {
            Task task = new Task();
            task.setId(resultSet.getLong("task_id"));
            task.setTitle(resultSet.getString("task_title"));
            task.setDescription(resultSet.getString("task_description"));
            task.setStatus(Status.valueOf(resultSet.getString("task_status")));
            Timestamp timeStamp = resultSet.getTimestamp("task_expiration_date");
            if(timeStamp != null)
            {
                task.setExpirationDate(timeStamp.toLocalDateTime());
            }
            return task;
        }
        return null;
    }

    @SneakyThrows
    public static List<Task> mapRows(ResultSet resultSet)
    {
        List<Task> tasks = new ArrayList<>();
        while(resultSet.next())
        {
            Task task = new Task();
            task.setId(resultSet.getLong("task_id"));
            if(!resultSet.wasNull())
            {
                task.setTitle(resultSet.getString("task_title"));
                task.setDescription(resultSet.getString("task_description"));
                task.setStatus(Status.valueOf(resultSet.getString("task_status")));
                Timestamp timeStamp = resultSet.getTimestamp("task_expiration_date");
                if(timeStamp != null)
                {
                    task.setExpirationDate(timeStamp.toLocalDateTime());
                }
                tasks.add(task);
            }
        }
        return tasks;
    }
}
