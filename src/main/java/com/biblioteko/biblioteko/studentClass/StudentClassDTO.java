package com.biblioteko.biblioteko.studentClass;

import java.util.Set;
import java.util.UUID;
import com.biblioteko.biblioteko.user.UserDTO;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class StudentClassDTO {
  
    private UUID id;
	private String name;
    private int classYear;
	private String schoolSubject;
	private String photo;
    private UserDTO owner;
    private Set<UUID> students;
    private Set<UUID> suggestedBooks;

}
