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
public class Capacitacion {
    
    private List <Float> notasCurso;
    private Curso curso;

    public Capacitacion(Curso curso) {
        this.curso = curso;
    }

    public void setCurso(Curso curso) {
        this.curso = curso;
    }
    
    public void agregarNota (float nota){
        notasCurso.add(nota);
        
    }

    public List<Float> getNotasCurso() {
        return notasCurso;
    }

    public Curso getCurso() {
        return curso;
    }
    
    
    
}
