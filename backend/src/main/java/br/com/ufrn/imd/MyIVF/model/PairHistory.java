package br.com.ufrn.imd.MyIVF.model;

import java.security.Timestamp;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name="pairHistory")
@Getter
@Setter
public class PairHistory {

	@Id
	@OneToOne
	@JoinColumn(name="idTreatment", nullable = false)
	private Treatment treatment;
	
	private Timestamp unionTime;
	private Timestamp infertiletime;
	private String previousTreatments;
	private boolean hadPreviousPregnanses;
	private String previousFIV;
	private String previousResultFIV;
	private String abort;
	private String actualDiagnostic;
	
}
