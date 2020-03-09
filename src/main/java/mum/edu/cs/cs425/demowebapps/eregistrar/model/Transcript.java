package mum.edu.cs.cs425.demowebapps.eregistrar.model;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Transient;
import javax.validation.Valid;
import javax.validation.constraints.NotEmpty;

import org.springframework.lang.NonNull;

@Entity(name = "transcripts")
public class Transcript {
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@NonNull  @Valid
	@NotEmpty(message = "DegreeTitle must be provided")
	private String degreeTitle;
	
	//@OneToOne(mappedBy="transcript", cascade = CascadeType.ALL, orphanRemoval = true) 
	@Transient
	private Student student;

	/**
	 * 
	 */
	public Transcript() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param degreeTitle
	 */
	public Transcript(@NotEmpty(message = "Degree Title must be provided") String degreeTitle) {
		super();
		this.degreeTitle = degreeTitle;
	}



	/**
	 * @return the transcriptId
	 */
	public Long getTranscriptId() {
		return id;
	}

	/**
	 * @param transcriptId the transcriptId to set
	 */
	public void setTranscriptId(Long transcriptId) {
		this.id = transcriptId;
	}

	/**
	 * @return the degreeTitle
	 */
	public String getDegreeTitle() {
		return degreeTitle;
	}

	/**
	 * @param degreeTitle the degreeTitle to set
	 */
	public void setDegreeTitle(String degreeTitle) {
		this.degreeTitle = degreeTitle;
	}

	@Override
	public String toString() {
		return String.format("Transcript [transcriptId=%s, degreeTitle=%s]", id, degreeTitle);
	}
	
	
	
}
