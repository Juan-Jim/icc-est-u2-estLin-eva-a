package main;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

import utils.StudentValidator;

public class App {
    public static void main(String[] args) throws Exception {
        // NO MODIFICAR ESTE CÓDIGO
        var estudiante = StudentValidator.validarDatos();
        System.out.println("👤 Estudiante: " + estudiante.nombre());
        System.out.println("✉️  Correo: " + estudiante.correo());
        // NO MODIFICAR HASTA AQUÍfdsafads
        
        LogicaClasificacion lc = new LogicaClasificacion();
    
        

        lc.invertirColaNombres(null);
    }
}
