package mum.edu.cs.cs425.demowebapps.eregistrar.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Transient;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

@Entity(name = "classrooms")
public class Classroom {

	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long classroomId;
	
	@NotNull 
	@NotEmpty(message = "Building Name required")
	private String buildingName;

	@NotNull
	@NotEmpty(message="Room Number cannot be empty")
	private String roomNumber;
	
//	@OneToMany(mappedBy = "classRoom", cascade = CascadeType.ALL, orphanRemoval = true)
	@Transient
	private List<Student> students;

	/**
	 * 
	 */
	public Classroom() {
		super();
		// TODO Auto-generated constructor stub
	}

	

	/**
	 * @param classroomId
	 * @param buildingName
	 * @param roomNumber
	 */
	public Classroom(@NotNull @NotEmpty(message = "Building Name required") String buildingName,
			@NotNull @NotEmpty(message = "Room Number cannot be empty") String roomNumber) {
		super();
		this.buildingName = buildingName;
		this.roomNumber = roomNumber;
	}
	
	



	/**
	 * @return the students
	 */
	public List<Student> getStudents() {
		return students;
	}



	/**
	 * @param students the students to set
	 */
	public void setStudents(List<Student> students) {
		this.students = students;
	}



	/**
	 * @return the classroomId
	 */
	public Long getClassroomId() {
		return classroomId;
	}

	/**
	 * @param classroomId the classroomId to set
	 */
	public void setClassroomId(Long classroomId) {
		this.classroomId = classroomId;
	}

	/**
	 * @return the buildingName
	 */
	public String getBuildingName() {
		return buildingName;
	}

	/**
	 * @param buildingName the buildingName to set
	 */
	public void setBuildingName(String buildingName) {
		this.buildingName = buildingName;
	}

	/**
	 * @return the roomNumber
	 */
	public String getRoomNumber() {
		return roomNumber;
	}

	/**
	 * @param roomNumber the roomNumber to set
	 */
	public void setRoomNumber(String roomNumber) {
		this.roomNumber = roomNumber;
	}

	@Override
	public String toString() {
		return String.format("Classroom [classroomId=%s, buildingName=%s, roomNumber=%s]", classroomId, buildingName,
				roomNumber);
	}
	
	
	
}
