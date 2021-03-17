import java.io.*;

public class AgendaFactoryCliente extends AgendaCliente {

    AgendaCliente agendaCliente;
    private String path;

    AgendaFactoryCliente(String path) {
        this.path = path;
    }

    @Override
    public void createAgenda_Cliente(String name, Integer age, String phone, String disease, String treatment) {

        this.name = name;
        this.age = age;
        this.phone = phone;
        this.disease = disease;
        this.treatment = treatment;

    }

    @Override
    public void printRegistro_Cliente() {

        System.out.println("Name: "+this.name);
        System.out.println("Age: "+this.age);
        System.out.println("Phone: "+this.phone);
        System.out.println("Disease: "+this.disease);
        System.out.println("Treatment: "+this.disease);

    }

    @Override
    public void saveRegistro_Cliente() {

        if (this==null)
        {
            return;
        }
        try {

            FileOutputStream fos = new FileOutputStream(path);
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(this);

        } catch (Exception e){
            e.printStackTrace();
        }

    }

    @Override
    public void readRegistro_Cliente() {

        try {

            FileInputStream fis = new FileInputStream(path);
            ObjectInputStream ois = new ObjectInputStream(fis);
            Object o = ois.readObject();
            agendaCliente = (AgendaCliente) o;

        } catch (Exception e){
            System.out.println(e);
        }
    }



}
