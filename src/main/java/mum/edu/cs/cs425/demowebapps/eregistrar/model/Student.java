/**
 * 
 */
package mum.edu.cs.cs425.demowebapps.eregistrar.model;

import java.time.LocalDate;
import java.util.List;

import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Transient;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.lang.NonNull;

/**
 * @author Team 4
 *
 */
@Entity(name = "students")
public class Student {
	
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long studentId;
	
	@NonNull
	@NotEmpty(message = "Student Number required")
	private String studentNumber;
	@NonNull
	@NotEmpty(message = "Firstname required")
	private String firstName;
	
	private String middleName;
	
	@NonNull 
	@NotEmpty(message = "Lastname required")
	private String lastName;
	
	
	private double cgpa;
	
	@NotNull
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private LocalDate enrollmentDate;
	
	private boolean isInternational;
	
	
	//@OneToOne
	@Transient
	private Transcript transcript;
	
	//@ManyToOne(cascade = CascadeType.ALL)
	//@JoinColumn(name = "classroom_id")
	@Transient
	private Classroom classRoom;

	/**
	 * 
	 */
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param studentNumber
	 * @param firstName
	 * @param middleName
	 * @param lastName
	 * @param cgpa
	 * @param dateOfEnrollment
	 */
	public Student(String studentNumber, String firstName, String middleName, String lastName, double cgpa,
			LocalDate dateOfEnrollment) {
		super();
		this.studentNumber = studentNumber;
		this.firstName = firstName;
		this.middleName = middleName;
		this.lastName = lastName;
		this.cgpa = cgpa;
		this.enrollmentDate = dateOfEnrollment;
	}

	/**
	 * @return the studentId
	 */
	public Long getStudentId() {
		return studentId;
	}

	/**
	 * @param studentId the studentId to set
	 */
	public void setStudentId(Long studentId) {
		this.studentId = studentId;
	}

	/**
	 * @return the studentNumber
	 */
	public String getStudentNumber() {
		return studentNumber;
	}

	/**
	 * @param studentNumber the studentNumber to set
	 */
	public void setStudentNumber(String studentNumber) {
		this.studentNumber = studentNumber;
	}

	/**
	 * @return the firstName
	 */
	public String getFirstName() {
		return firstName;
	}

	/**
	 * @param firstName the firstName to set
	 */
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	/**
	 * @return the middleName
	 */
	public String getMiddleName() {
		return middleName;
	}

	/**
	 * @param middleName the middleName to set
	 */
	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}

	/**
	 * @return the lastName
	 */
	public String getLastName() {
		return lastName;
	}

	/**
	 * @param lastName the lastName to set
	 */
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	/**
	 * @return the cgpa
	 */
	public double getCgpa() {
		return cgpa;
	}

	/**
	 * @param cgpa the cgpa to set
	 */
	public void setCgpa(double cgpa) {
		this.cgpa = cgpa;
	}

	/**
	 * @return the dateOfEnrollment
	 */
	public LocalDate getDateOfEnrollment() {
		return enrollmentDate;
	}

	/**
	 * @param dateOfEnrollment the dateOfEnrollment to set
	 */
	public void setDateOfEnrollment(LocalDate dateOfEnrollment) {
		this.enrollmentDate = dateOfEnrollment;
	}
	 
	

	/**
	 * @return the enrollmentDate
	 */
	public LocalDate getEnrollmentDate() {
		return enrollmentDate;
	}

	/**
	 * @param enrollmentDate the enrollmentDate to set
	 */
	public void setEnrollmentDate(LocalDate enrollmentDate) {
		this.enrollmentDate = enrollmentDate;
	}

	/**
	 * @return the isInternational
	 */
	public boolean isInternational() {
		return isInternational;
	}

	/**
	 * @param isInternational the isInternational to set
	 */
	public void setInternational(boolean isInternational) {
		this.isInternational = isInternational;
	}

	/**
	 * @return the transcript
	 */
	public Transcript getTranscript() {
		return transcript;
	}

	/**
	 * @param transcript the transcript to set
	 */
	public void setTranscript(Transcript transcript) {
		this.transcript = transcript;
	}

	@Override
	public String toString() {
		return String.format(
				"Student [studentId=%s, studentNumber=%s, firstName=%s, middleName=%s, lastName=%s, cgpa=%s, enrollmentDate=%s, isInternational=%s, transcript=%s]",
				studentId, studentNumber, firstName, middleName, lastName, cgpa, enrollmentDate, isInternational,
				transcript);
	}

	
	
	
	
	
}
