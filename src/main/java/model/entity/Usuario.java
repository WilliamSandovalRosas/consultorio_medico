/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.entity;

import jakarta.persistence.Table;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import java.io.Serializable;
import java.util.Date;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 *
 * @author DeveloperOak
 */

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
@Table(name = "usuario")
    
public class Usuario implements Serializable {
    
  
       
    @Id
    @Column(name="Identificacion")
    private int id;
    
    @Column(name="Nombre")
    private String name;
    
    @Column(name="Sexo")
    private char gender;
    
    @Column(name="Nacimiento")
    private Date birthday;
    
    @Column(name="Rol")
    private String rol;
    
    @Column(name="Correo")
    private String email;
    
    @Column(name="Foto")
    private String photo;
    
    
    
    
}
