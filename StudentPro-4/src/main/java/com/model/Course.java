package com.model;

import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import com.fasterxml.jackson.annotation.JsonManagedReference;


@Entity
@Table(name = "course")

public class Course{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
    
    private int id;
 // @NotNull(message = "Please provid CourseName")
    private String courseName;
 //@NotNull(message = "Please provid CourseDuration")
    private String courseDuration;
  //@NotNull(message = "Please provid CourseFees")
    private Long courseFees;
 // @NotNull(message = "Please provid CourseFaculty")
    private String courseFaculty;
    
    
    @OneToMany(mappedBy = "course", cascade = CascadeType.ALL)
    @JsonManagedReference
    private List<Student> students;


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getCourseName() {
		return courseName;
	}


	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}


	public String getCourseDuration() {
		return courseDuration;
	}


	public void setCourseDuration(String courseDuration) {
		this.courseDuration = courseDuration;
	}


	public Long getCourseFees() {
		return courseFees;
	}


	public void setCourseFees(Long courseFees) {
		this.courseFees = courseFees;
	}


	public String getCourseFaculty() {
		return courseFaculty;
	}


	public void setCourseFaculty(String courseFaculty) {
		this.courseFaculty = courseFaculty;
	}


	public List<Student> getStudents() {
		return students;
	}


	public void setStudents(List<Student> students) {
		this.students = students;
	}


}