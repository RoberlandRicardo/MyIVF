package br.com.ufrn.imd.MyIVF.repository;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.ufrn.imd.MyIVF.model.Medic;
import br.com.ufrn.imd.MyIVF.model.Patient;

@Repository
public interface PatientRepository extends JpaRepository<Patient, UUID> {
	
	public Patient getByCPF(String cpf);
	public Patient getByEmail(String cpf);
}
