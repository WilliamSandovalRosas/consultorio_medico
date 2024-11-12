/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package service.implement;

import java.util.List;
import model.entity.Usuario;
import repository.UsuarioRepository;
import service.IUsuarioService;

/**
 *
 * @author DeveloperOak
 */
public class UsuarioServiceImplement implements IUsuarioService{
    
    private UsuarioRepository usuarioRepository;

    @Override
    public Usuario guardarUsuario(Usuario usuario) {
       // throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
       return usuarioRepository.save(usuario);
    }

    @Override
    public Usuario editarUsuario(Usuario usuario) {
        //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        return usuarioRepository.update(usuario);
    }   

    @Override
    public List<Usuario> listarUsuarios() {
        //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        return usuarioRepository.findAll();
    }

    @Override
    public void eliminarUsuario(Usuario usuario) {
        //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        usuarioRepository.delete(usuario);
    }
}
