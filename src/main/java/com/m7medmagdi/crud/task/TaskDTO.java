package com.m7medmagdi.crud.task;

import lombok.Data;

@Data
public class TaskDTO {
    private Long id;
    private String title;
    private String description;
    private boolean completed;
}
