package cppf.employe.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

import lombok.NoArgsConstructor;


@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Employe {
    private int id;
    private String nomComplet;
    private String matricule;
    private Service service;
    
  
}
