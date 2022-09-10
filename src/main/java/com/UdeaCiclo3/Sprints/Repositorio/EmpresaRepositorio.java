package com.UdeaCiclo3.Sprints.Repositorio;


import com.UdeaCiclo3.Sprints.ProyectoEmpleado.Empleado;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;

@Repository
public interface EmpresaRepositorio extends JpaRepository <Empleado,String> {

    ArrayList<Empleado> findByUser(String user);

}
