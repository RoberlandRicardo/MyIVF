package br.com.ufrn.imd.MyIVF.model;

import java.util.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "FIVSegment")
@Getter
@Setter
public class FIVSegment {

	private Date estimulationDate;
	private Date DUM;
	private String estimulationScheme;
	private String adjuvantMedication;
	private String validSerologies;
	private Date dateTestZika;
	private boolean resultTestZika;
	private String USTVBasal;
}
