package br.com.ufrn.imd.MyIVF.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.ufrn.imd.MyIVF.dto.JWTAuthenticationResponse;
import br.com.ufrn.imd.MyIVF.dto.LoginDTO;
import br.com.ufrn.imd.MyIVF.service.AuthenticationService;
import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/info")
@RequiredArgsConstructor
public class InfoController {
	
	@GetMapping("/check-connection")
	public String checkConnection() {
		return "Connection is ok";
	}
}
