package com.ssg.springwebmvc.dto;

import lombok.*;
import java.time.LocalDate;

@Data
@ToString
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class TodoDTO {
    private int tno;
    private String title;
    private LocalDate dueDate;
    private boolean finished;
    private String writer;
}
