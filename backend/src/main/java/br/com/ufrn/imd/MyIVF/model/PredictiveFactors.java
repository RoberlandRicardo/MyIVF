package br.com.ufrn.imd.MyIVF.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "predictiveFactors")
@Getter
@Setter
public class PredictiveFactors {

	@Id
	@OneToOne
	@JoinColumn(name="idTreatment", nullable = false)
	private Treatment treatment;
	
	private float weight;
	private float height;
	private String CFA;
	private String AMH;
	private String FSH;
	private String estradiol;
	private String LH;
}
