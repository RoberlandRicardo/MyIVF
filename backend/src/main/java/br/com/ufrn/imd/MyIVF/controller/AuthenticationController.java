package br.com.ufrn.imd.MyIVF.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import br.com.ufrn.imd.MyIVF.dto.JWTAuthenticationResponse;
import br.com.ufrn.imd.MyIVF.dto.LoginDTO;
import br.com.ufrn.imd.MyIVF.service.AuthenticationService;
import lombok.RequiredArgsConstructor;

@RestController
@RequiredArgsConstructor
public class AuthenticationController {
	
	private final AuthenticationService authenticationService;
	
	@PostMapping("/login")
	public JWTAuthenticationResponse login(@RequestBody LoginDTO request) {
		return authenticationService.login(request);
	}
}
