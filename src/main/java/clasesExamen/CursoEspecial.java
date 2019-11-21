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
public class CursoEspecial extends Curso {
    
    private float notaMinimaTrabajo;
    /**/
    private int promedio;

    public CursoEspecial(String nombre, String modalidad, float minimoNotaCurso, float notaMinimaTrabajo) {
        super(nombre, modalidad, minimoNotaCurso);
    }

    public float getNotaMinimaTrabajo() {
        return notaMinimaTrabajo;
    }

    public void setNotaMinimaTrabajo(float notaMinimaTrabajo) {
        this.notaMinimaTrabajo = notaMinimaTrabajo;
    }
    
    public void calcularPromedio(List<Float>notas){
        int acumulador = 0;
        int sumaNotas = 0;
        
        for (int i = 0; i < notas.size(); i++) {
            acumulador += i;
            sumaNotas += notas.get(i);
        }
        promedio = sumaNotas/acumulador;
    }
    
    public boolean estaAprobado(List<Float>notas){
        
        for (int i = 0; i < notas.size(); i++) {
            if (notas.get(i)>= this.notaMinimaTrabajo && promedio >= this.notaMinimaTrabajo) {
                return true;
            }
        }
        return false;
    }
}
