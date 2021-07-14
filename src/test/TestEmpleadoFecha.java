package test;

import dominio.Empleado;
import dominio.Fecha;
import java.util.Scanner;

public class TestEmpleadoFecha {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        Fecha fNacimiento;
        Fecha fIngreso;
        Empleado empleado1;
        int anionaci, mesnaci, dianaci, anioingre, mesingre, diaingre;
        String nombre;
        System.out.print("Ingrese el nombre del empleado: ");
        nombre = entrada.nextLine();
        System.out.println("Fecha de Nacimiento");
        System.out.print("Año: ");
        anionaci = entrada.nextInt();
        System.out.print("Mes: ");
        mesnaci = entrada.nextInt();
        System.out.print("Día: ");
        dianaci = entrada.nextInt();
        fNacimiento = new Fecha(anionaci, mesnaci, dianaci);
        System.out.println("Fecha de Ingreso a la Empresa");
        System.out.print("Año: ");
        anioingre = entrada.nextInt();
        System.out.print("Mes: ");
        mesingre = entrada.nextInt();
        System.out.print("Día: ");
        diaingre = entrada.nextInt();
        fIngreso = new Fecha(anioingre, mesingre, diaingre);
        empleado1 = new Empleado(nombre, fNacimiento, fIngreso);
        System.out.println("Datos Ingresados:");
        empleado1.DatosNacimiento();
        System.out.print("Su edad actual es: ");
        empleado1.Anios(dianaci, mesnaci, anionaci);    
        empleado1.Meses(dianaci, mesnaci, anionaci);
        empleado1.Dias(dianaci, mesnaci, anionaci);
        empleado1.DatosIngresoEmpresa();
        System.out.print("Su tiempo en la empresa es: ");
        empleado1.Anios(diaingre, mesingre, anioingre);
        empleado1.Meses(diaingre, mesingre, anioingre);
        empleado1.Dias(diaingre, mesingre, anioingre);      
    }
}