package br.com.ufrn.imd.MyIVF.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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
