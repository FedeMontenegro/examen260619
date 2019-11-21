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
public class Curso {
    
    private String nombre;
    private String modalidad;
    private float minimoNotaCurso;

    public Curso(String nombre, String modalidad, float minimoNotaCurso) {
        this.nombre = nombre;
        this.modalidad = modalidad;
        this.minimoNotaCurso = minimoNotaCurso;
    }

    public String getModalidad() {
        return modalidad;
    }

    public float getMinimoNotaCurso() {
        return minimoNotaCurso;
    }

    public void setMinimoNotaCurso(float minimoNotaCurso) {
        this.minimoNotaCurso = minimoNotaCurso;
    }
    
    /**/
    public boolean estaAprobado(List<Float>notas){
        
        for (int i = 0; i < notas.size(); i++) {
            if (notas.get(i)>=this.minimoNotaCurso) {
                return true;
            }
        }
        return false;
    }
    
}
