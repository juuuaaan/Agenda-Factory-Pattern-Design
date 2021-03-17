import java.util.Scanner;

public class TestAgenda {
    public static void main(String[] args) {

        String path = "agenda", action="", name="", phone="", disease="", treatment="", especialidad="";
        Integer age = 0, years_of_experience=0;

        AgendaFactoryCliente factory_c = new AgendaFactoryCliente(path);
        AgendaFactoryDoctor factory_d = new AgendaFactoryDoctor(path);

        Scanner scanner = new Scanner(System.in);

        System.out.println("¿Qué agenda te gustaría utilizar? cliente, doctor");
        action = scanner.next();

        switch (action)
        {
            case "cliente":

                while (!action.equals("over"))
                {
                    System.out.println("-> What operation do you want to do? add, read, over");

                    action = scanner.next();

                    if (action.equalsIgnoreCase("add"))
                    {

                        System.out.println("Name: ");
                        name = scanner.next();

                        System.out.println("Age: ");
                        age = scanner.nextInt();

                        System.out.println("Phone: ");
                        phone = scanner.next();

                        System.out.println("Disease: ");
                        disease = scanner.next();

                        System.out.println("Treatment: ");
                        treatment = scanner.next();

                        factory_c.createAgenda_Cliente(name, age, phone, disease, treatment);
                        factory_c.printRegistro_Cliente();
                        factory_c.saveRegistro_Cliente();
                        System.out.println("1 contacto guardado exitosamente.");

                    }
                    else if (action.equalsIgnoreCase("read")) {
                        factory_c.readRegistro_Cliente();
                        factory_c.printRegistro_Cliente();
                    }

                }

                break;


            case "doctor":

                while (!action.equals("over"))
                {
                    System.out.println("-> What operation do you want to do? add, read, over");

                    action = scanner.next();

                    if (action.equalsIgnoreCase("add"))
                    {

                        System.out.println("Especialidad: ");
                        especialidad = scanner.next();

                        System.out.println("Años de experiencia: ");
                        years_of_experience = scanner.nextInt();

                        factory_d.createAgenda_Doctor(especialidad, years_of_experience);
                        factory_d.printRegistro_Doctor();
                        factory_d.saveRegistro_Doctor();
                        System.out.println("1 contacto guardado exitosamente.");

                    }
                    else if (action.equalsIgnoreCase("read")) {
                        factory_d.readRegistro_Doctor();
                        factory_d.printRegistro_Doctor();
                    }

                }


        }



    }
}
