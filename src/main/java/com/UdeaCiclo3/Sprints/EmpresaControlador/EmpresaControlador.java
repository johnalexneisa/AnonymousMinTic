package com.UdeaCiclo3.Sprints.EmpresaControlador;


import com.UdeaCiclo3.Sprints.EmpresaServicio.EmpresaServicio;
import com.UdeaCiclo3.Sprints.ProyectoEmpleado.Empleado;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Optional;

@RestController
public class EmpresaControlador {
    private EmpresaServicio servicio;
    public EmpresaControlador(EmpresaServicio servicio){
        this.servicio=servicio;
    }

    @GetMapping("/ListarEmpleado")
    public ArrayList<Empleado>listar(){
        return servicio.listarEmpleados();
    }

    @GetMapping("/BuscarEmpleado/{id}")
    public Optional<Empleado>buscarEmpleado(@PathVariable("id")String id){
        return servicio.buscarEmpleado(id);
    }

    @GetMapping("/BuscarEmpleadoDoc/{document}")
    public Optional<Empleado>buscarDocumento(@PathVariable("document")String document){
        return servicio.buscarEmpleado(document);
    }


}
