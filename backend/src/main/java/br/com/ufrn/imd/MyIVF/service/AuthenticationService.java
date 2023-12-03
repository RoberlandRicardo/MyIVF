package br.com.ufrn.imd.MyIVF.service;



import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import br.com.ufrn.imd.MyIVF.dto.JWTAuthenticationResponse;
import br.com.ufrn.imd.MyIVF.dto.LoginDTO;
import br.com.ufrn.imd.MyIVF.model.Patient;
import br.com.ufrn.imd.MyIVF.repository.MedicRepository;
import br.com.ufrn.imd.MyIVF.repository.PatientRepository;
import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class AuthenticationService {

  private final PatientRepository patientRepository;
  private final MedicRepository medicRepository;
  private final UserService userService;
  private final PasswordEncoder passwordEncoder;
  private final JWTService jwtService;
  private final AuthenticationManager authenticationManager;

//  public JwtAuthenticationResponse signup(SignUpRequest request) {
//      var user = User
//                  .builder()
//                  .firstName(request.getFirstName())
//                  .lastName(request.getLastName())
//                  .email(request.getEmail())
//                  .password(passwordEncoder.encode(request.getPassword()))
//                  .role(Role.ROLE_USER)
//                  .build();
//
//      user = userService.save(user);
//      var jwt = jwtService.generateToken(user);
//      return JwtAuthenticationResponse.builder().token(jwt).build();
//  }


	  public JWTAuthenticationResponse login(LoginDTO request) {
	      authenticationManager.authenticate(
	              new UsernamePasswordAuthenticationToken(request.getEmail(), request.getPassword()));
	      UserDetails user = patientRepository.getByEmail(request.getEmail());
	      if (user == null)
	    	  user = medicRepository.getByEmail(request.getEmail());
	      		if (user == null)
	              throw new IllegalArgumentException("Invalid email or password.");
	      var jwt = jwtService.generateToken(user);
	      return JWTAuthenticationResponse.builder().token(jwt).build();
	  }
  
}