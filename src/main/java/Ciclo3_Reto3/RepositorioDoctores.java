/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ciclo3_Reto3;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 *
 * @author
 */
@Repository
public class RepositorioDoctores {
    
    @Autowired
    private InterfaceDoctores crud;

    public List<Doctores> getAll(){
        return (List<Doctores>) crud.findAll();
    }

    public Optional<Doctores> getDoctor(int id){
        return crud.findById(id);
    }

    public Doctores save(Doctores doctor){
        return crud.save(doctor);
    }
    public void delete(Doctores doctor){
        crud.delete(doctor);
    }
    
}
