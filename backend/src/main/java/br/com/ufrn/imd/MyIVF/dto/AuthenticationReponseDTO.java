package br.com.ufrn.imd.MyIVF.dto;

import org.springframework.security.core.userdetails.UserDetails;

import br.com.ufrn.imd.MyIVF.model.Medic;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;

@Data
@Builder
@RequiredArgsConstructor
@AllArgsConstructor
public class AuthenticationReponseDTO {
  String token;
  UserDetails user;
}