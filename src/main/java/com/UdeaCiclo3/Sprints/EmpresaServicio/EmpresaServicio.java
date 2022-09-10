package com.UdeaCiclo3.Sprints.EmpresaServicio;


import com.UdeaCiclo3.Sprints.ProyectoEmpleado.Empleado;
import com.UdeaCiclo3.Sprints.Repositorio.EmpresaRepositorio;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Optional;


@Service
public class EmpresaServicio {

    private EmpresaRepositorio repositorio;
    public EmpresaServicio(EmpresaRepositorio repositorio){

        this.repositorio=repositorio;
    }


    public ArrayList<Empleado>listarEmpleados(){
        return (ArrayList<Empleado>) repositorio.findAll();
    }

    public Optional<Empleado>buscarEmpleado(String id){
        return repositorio.findById(id);
    }

    public  Optional<Empleado>buscarCedula(String document){
        return repositorio.findById(document);
    }

    public ArrayList<Empleado>buscarUsuario(String user){
        return repositorio.findByUser(user);
    }





}
