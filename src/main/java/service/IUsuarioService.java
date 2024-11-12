/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package service;

import java.util.List;
import model.entity.Usuario;

/**
 *
 * @author DeveloperOak
 */
public interface IUsuarioService {
    
    Usuario guardarUsuario(Usuario usuario);
    Usuario editarUsuario(Usuario usuario);
    void eliminarUsuario(Usuario usuario);
    List<Usuario> listarUsuarios();
    
}
