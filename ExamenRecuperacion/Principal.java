package ExamenRecuperacion;

import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {

        System.out.println("Autor : Víctor Infantes Guerra");

        ArrayList<Alumno> alumnos = new ArrayList<>();
        int notaProgramacion, notaEntornos, notaBaseDeDatos, edad, menu = 0;
        String nombre, apellidos, DNI, direccion;
        String fechaMatricula, asignatura; //Date fechaMatricula
        boolean matriculado;
        Scanner sc = new Scanner(System.in);
        float media = 0, mediaNueva = 0;
        String mejorAlumno, peorAlumno;

        while (menu != 11) {
            System.out.println("1. Insertar un alumno ");
            System.out.println("2. Listado de alumnos");
            System.out.println("3. Buscar y mostrar alumnos");
            System.out.println("4. Eliminar y mostrar alumno");
            System.out.println("5. Mostrar alumnos aprobados de programación");
            System.out.println("6. Modificar la nota de un alumno");
            System.out.println("7. Nota media de todos los alumnos por asignatura");
            System.out.println("8. Mejor alumno");
            System.out.println("9. Peor Alumno");
            System.out.println("11.Salir");
            menu = sc.nextInt();
            switch (menu) {
                case 1: {
                    System.out.println("Introduce el nombre del alumno");
                    nombre = sc.next();
                    System.out.println("Introduce los apellidos del alumno");
                    apellidos = sc.next();
                    System.out.println("Introduce el DNI del alumno");
                    DNI = sc.next();
                    System.out.println("Introduce la edad del alumno");
                    edad = sc.nextInt();
                    System.out.println("Introduce la direccion del alumno");
                    direccion = sc.next();
                    System.out.println("Introduce la nota de Programacion");
                    notaProgramacion = sc.nextInt();
                    System.out.println("Introduce la nota de Entornos");
                    notaEntornos = sc.nextInt();
                    System.out.println("Introduce la nota de Base de datos");
                    notaBaseDeDatos = sc.nextInt();
                    System.out.println("Alumno matriculado true o false");
                    matriculado = sc.nextBoolean();
                    System.out.println("Introduce la fecha de matriculacion");
                    fechaMatricula = sc.next();

                    alumnos.add(new Alumno(nombre, apellidos, DNI, edad, direccion, matriculado, fechaMatricula,
                            notaProgramacion, notaEntornos, notaBaseDeDatos));

                }
                break;
                case 2: {
                    for (Alumno l : alumnos) {
                        System.out.println(l.toString());
                    }
                }
                break;
                case 3: {
                    System.out.println("Buscar por DNI :");
                    System.out.println("Buscar por Apellidos :");
                    System.out.println("Buscar por FechaMatriculación :");
                    menu = sc.nextInt();
                    switch (menu) {
                        case 1: {
                            System.out.println("Introduce el DNI del alumno");
                            DNI = sc.next();
                            for (int i = 0; i < alumnos.size(); i++) {
                                if (DNI.equals(alumnos.get(i).getDNI())) {
                                    System.out.println(alumnos.get(i).toString());
                                } else {
                                    System.out.println("El DNI no pertenece a ningun alumno");
                                }
                            }
                        }
                        break;
                        case 2: {
                            System.out.println("Introduce los apellidos del alumno");
                            apellidos = sc.next();
                            for (int i = 0; i < alumnos.size(); i++) {
                                if (apellidos.equals(alumnos.get(i).getApellidos())) {
                                    System.out.println(alumnos.get(i).toString());
                                } else {
                                    System.out.println("Los apellidos no pertenece a ningun alumno");
                                }
                            }
                        }
                        break;
                        case 3: {
                            System.out.println("Introduce la fecha de matriculacion del alumno");
                            fechaMatricula = sc.next();
                            for (int i = 0; i < alumnos.size(); i++) {
                                if (fechaMatricula.equals(alumnos.get(i).getFechaMatricula())) {
                                    System.out.println(alumnos.get(i).toString());
                                } else {
                                    System.out.println("La fecha no pertenece a ningun alumno");
                                }
                            }
                        }
                        break;
                    }
                }
                break;
                case 4: {
                    System.out.println("Eliminar alumno por DNI");
                    System.out.println("Eliminar alumno por Apellidos");
                    System.out.println("Eliminar alumno por Fecha de matriculacion");
                    menu = sc.nextInt();
                    switch (menu) {
                        case 1: {
                            System.out.println("Introduce el DNI del alumno");
                            DNI = sc.next();
                            for (int i = 0; i < alumnos.size(); i++) {
                                if (DNI.equals(alumnos.get(i).getDNI())) {
                                    System.out.println(alumnos.get(i).toString());
                                    alumnos.remove(i);
                                } else {
                                    System.out.println("El DNI no pertenece a ningun alumno");
                                }
                            }
                        }
                        break;
                        case 2: {
                            System.out.println("Introduce los apellidos del alumno");
                            apellidos = sc.next();
                            for (int i = 0; i < alumnos.size(); i++) {
                                if (apellidos.equals(alumnos.get(i).getApellidos())) {
                                    System.out.println(alumnos.get(i).toString());
                                    alumnos.remove(i);
                                } else {
                                    System.out.println("Los apellidos no pertenece a ningun alumno");
                                }
                            }
                        }
                        break;
                        case 3: {
                            System.out.println("Introduce la fecha de matriculacion del alumno");
                            fechaMatricula = sc.next();
                            for (int i = 0; i < alumnos.size(); i++) {
                                if (fechaMatricula.equals(alumnos.get(i).getFechaMatricula())) {
                                    System.out.println(alumnos.get(i).toString());
                                } else {
                                    System.out.println("La fecha no pertenece a ningun alumno");
                                }
                            }
                        }
                        break;
                    }
                }
                break;
                case 5: { //Sacar todos los alumnos que tengan un 5 o mas de la asignatura de programacion
                    System.out.println("Introduce la asignatura");
                    asignatura = sc.next();
                    for (int i = 0; i < alumnos.size(); i++) {
                        if (asignatura.equalsIgnoreCase("Programacion")) {
                            if (alumnos.get(i).getNotaProgramacion() >= 5) {
                                System.out.println(alumnos.get(i).toString());
                            }
                        }
                        if (asignatura.equalsIgnoreCase("BaseDeDatos")) {
                            if (alumnos.get(i).getNotaBaseDeDatos() >= 5) {
                                System.out.println(alumnos.get(i).toString());
                            }
                        }
                        if (asignatura.equalsIgnoreCase("Entornos")) {
                            if (alumnos.get(i).getNotaEntornos() >= 5) {
                                System.out.println(alumnos.get(i).toString());
                            }
                        }
                    }
                }
                break;
                case 6: {
                    System.out.println("Introduce el DNI del alumno");
                    DNI = sc.next();
                    System.out.println("Introduce la asignatura");
                    asignatura = sc.next();
                    if (asignatura.equalsIgnoreCase("Programacion")) {
                        System.out.println("Introduce la nota que desea poner");
                        notaProgramacion = sc.nextInt();
                        for (int i = 0; i < alumnos.size(); i++) {
                            if (DNI.equalsIgnoreCase(alumnos.get(i).getDNI())) {
                                alumnos.get(i).setNotaProgramacion(notaProgramacion);
                            }
                        }
                    } else if (asignatura.equalsIgnoreCase("BaseDeDatos")) {
                        System.out.println("Introduce la nota que desea poner");
                        notaBaseDeDatos = sc.nextInt();
                        for (int i = 0; i < alumnos.size(); i++) {
                            if (DNI.equalsIgnoreCase(alumnos.get(i).getDNI())) {
                                alumnos.get(i).setNotaBaseDeDatos(notaBaseDeDatos);
                            }
                        }
                    } else if (asignatura.equalsIgnoreCase("Entornos")) {
                        System.out.println("Introduce la nota que desea poner");
                        notaEntornos = sc.nextInt();
                        for (int i = 0; i < alumnos.size(); i++) {
                            if (DNI.equalsIgnoreCase(alumnos.get(i).getDNI())) {
                                alumnos.get(i).setNotaEntornos(notaEntornos);
                            }
                        }
                    }
                }
                break;
                case 7: {
                    System.out.println("Introduce la asignatura");
                    asignatura = sc.next();
                    for (int i = 0; i < alumnos.size(); i++) {
                        if (asignatura.equalsIgnoreCase("Programacion")) {
                            media = media + alumnos.get(i).getNotaProgramacion();
                        } else if (asignatura.equalsIgnoreCase("BaseDeDatos")) {
                            media = media + alumnos.get(i).getNotaBaseDeDatos();
                        } else if (asignatura.equalsIgnoreCase("Entornos")) {
                            media = media + alumnos.get(i).getNotaEntornos();
                        }
                        System.out.println("La media es : "+media / alumnos.size());
                    }
                }
                break;
                case 8: {
                    for (int i = 0; i < alumnos.size(); i++) {
                        mediaNueva = (alumnos.get(i).getNotaBaseDeDatos()+alumnos.get(i).getNotaEntornos()+alumnos.get(i).getNotaBaseDeDatos())/3;
                        if (mediaNueva > media) {
                            media = mediaNueva;
                        }

                        mejorAlumno = alumnos.get(i).toString();
                        System.out.println(mejorAlumno);
                    }
                }
                break;
                case 9 : {
                    for (int i = 0; i < alumnos.size(); i++) {
                        mediaNueva = (alumnos.get(i).getNotaBaseDeDatos()+alumnos.get(i).getNotaEntornos()+alumnos.get(i).getNotaBaseDeDatos())/3;
                        if (mediaNueva < media) {
                            media = mediaNueva;
                        }
                        peorAlumno = alumnos.get(i).toString();
                        System.out.println(peorAlumno);
                    }
                }
                break;
                case 11: {
                    System.out.println("Gracias por utilizar mi aplicacion :)");
                    break;
                }
            }

        }
    }


}

