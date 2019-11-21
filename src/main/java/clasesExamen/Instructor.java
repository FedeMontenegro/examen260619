/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clasesExamen;

import java.util.List;

/**
 *
 * @author visita
 */
public class Instructor {
    
    private int dni;
    String nombre;
    String apellido;
    private int cupoModalidadVirtual;
    private List<Capacitacion> capacitaciones;

    public Instructor(int dni, String nombre, String apellido, int cupoModalidadVirtual) {
        this.dni = dni;
        this.nombre = nombre;
        this.apellido = apellido;
        this.cupoModalidadVirtual = cupoModalidadVirtual;
    }
    
    /**
     * Permite inscribirse a un curso en modalidad virtual, siempre y cuando
     * los cursos realizados en dicha modalidad no superen el cupo disponible.
     * @param capacitacion
     * @return en caso de tener cupos disponibles de modalidad virtual,
     * retorna true, sino, retorna false
     */
    public boolean inscribirACurso(Capacitacion capacitacion){
        
        Curso curso = null;
        int cantidadCapacitacionesVirtuales = 0;
        
        for (int i = 0; i < capacitaciones.size(); i++) {
            
        if(curso.getModalidad().equals(this.cupoModalidadVirtual)){
            cantidadCapacitacionesVirtuales++;
            }
        }
        
        if (cantidadCapacitacionesVirtuales<this.cupoModalidadVirtual) {
            capacitaciones.add(capacitacion);
            return true;
        }
    
        return false;
    }
}
