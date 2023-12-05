package br.com.ufrn.imd.MyIVF.model;

import java.util.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name="treatment")
@Getter
@Setter
public class Treatment {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long idTreatment;
	private Date initialDate = new Date();
	private Date finishDate;
	
	@ManyToOne
    @JoinColumn(name="idMedic", nullable=false)
    private Medic medic;
	
	@ManyToOne
    @JoinColumn(name="idPatient", nullable=false)
    private Patient patient;
	
	@ManyToOne
    @JoinColumn(name="idPartner", nullable=false)
    private Patient partner;
	
	@OneToOne
	@JoinColumn(name="idPairHistory", nullable=false)
	private PairHistory pairHistory;
	
	@OneToOne
	@JoinColumn(name="idPairHistory", nullable=true)
	private PredictiveFactors pf;
	
}
