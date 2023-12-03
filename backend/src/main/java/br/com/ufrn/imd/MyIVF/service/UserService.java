package br.com.ufrn.imd.MyIVF.service;

import java.time.LocalDateTime;

import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import br.com.ufrn.imd.MyIVF.model.Medic;
import br.com.ufrn.imd.MyIVF.model.Patient;
import br.com.ufrn.imd.MyIVF.repository.MedicRepository;
import br.com.ufrn.imd.MyIVF.repository.PatientRepository;

@Service
public class UserService {

	  private final PatientRepository patientRepository;
	  private final MedicRepository medicRepository;
	  
	  public UserService(PatientRepository patientRepository, MedicRepository medicRepository) {
		this.patientRepository = patientRepository;
		this.medicRepository = medicRepository;
		  
	  }

	  public UserDetailsService userDetailsService() {
	      return new UserDetailsService() {
	          @Override
	          public UserDetails loadUserByUsername(String email) {
	        	  Patient patient = patientRepository.getByEmail(email);
	        	  if (patient != null) return patient;
	        	  
	        	  Medic medic = medicRepository.getByEmail(email);
	        	  if (medic != null) return medic;
	        	  
	        	  throw new UsernameNotFoundException("User not found");
	          }
	      };
	  }

	  public UserDetails save(UserDetails newUser) {
		  if (newUser instanceof Patient)
			  return patientRepository.save((Patient) newUser);
		  else if (newUser instanceof Medic)
			  return medicRepository.save((Medic) newUser);
		  return null;
	  }

}