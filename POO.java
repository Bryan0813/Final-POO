import java.util.ArrayList;
import java.util.Scanner;

public class POO {
    static Scanner input = new Scanner(System.in);
    static ArrayList<Estudiantes> estudiantes = new ArrayList<>();

    public static void readStudent() {
        System.out.print("Ingrese la cantidad de estudiantes: ");
        int numeroEstudiantes = input.nextInt();
        for (int i = 1; i <= numeroEstudiantes; i++) {
            System.out.println("Estudiante #" + i);
            System.out.print("identificacion: ");
            String identificacion = input.next();
            System.out.print("Nombre: ");
            String nombre = input.next();
            System.out.print("Email: ");
            String email = input.next();
            Estudiantes estudiante = new Estudiantes();
            estudiante.setIdentificacion(identificacion);
            estudiante.setNombre(nombre);
            estudiante.setEmail(email);
            estudiantes.add(estudiante);
        }
    }

    public static void getStudents() {
        for (int i = 0; i < estudiantes.size(); i++) {
            System.out.println("Estudiante #" + (i + 1));
            System.out.println(estudiantes.get(i).getIdentificacion());
            System.out.println(estudiantes.get(i).getNombre());
            System.out.println(estudiantes.get(i).getEmail());
        }
    }

    public static void getStudentById() {
        System.out.print("Escribe la identificacion que quiere buscar: ");
        String identificacion = input.next();
        for (int i = 0; i < estudiantes.size(); i++) {
            if (estudiantes.get(i).getIdentificacion().equals(identificacion)) {
                System.out.println(estudiantes.get(i).getIdentificacion());
                System.out.println(estudiantes.get(i).getNombre());
                System.out.println(estudiantes.get(i).getEmail());
            }
        }
    }

    public static void updateStudent() {
        System.out.println("Escribe la identificacion del estudiante a actualizar");
        String identificacion = input.next();
        for (int i = 0; i < estudiantes.size(); i++) {
            if (estudiantes.get(i).getIdentificacion().equals(identificacion)) {
                System.out.println("Estudiante encontrado");
                System.out.println(estudiantes.get(i).getIdentificacion());
                System.out.println(estudiantes.get(i).getNombre());
                System.out.println(estudiantes.get(i).getEmail());
                System.out.println("Nuevo nombre: ");
                String newName = input.next();
                estudiantes.get(i).setNombre(newName);
                System.out.println("Nombre actualizado: " + estudiantes.get(i).getNombre());
                System.out.println("Nuevo email: ");
                String newEmail = input.next();
                estudiantes.get(i).setEmail(newEmail);
                System.out.println("Email actualizado: " + estudiantes.get(i).getEmail());
            }
        }

    }

    public static void main(String[] args) {
        readStudent();
        getStudentById();
        updateStudent();
    }
}
