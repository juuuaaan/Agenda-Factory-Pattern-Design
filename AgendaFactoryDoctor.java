import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class AgendaFactoryDoctor extends AgendaDoctor {

    AgendaDoctor agendaDoctor;
    private String path;

    AgendaFactoryDoctor(String path) {
        this.path = path;
    }

    @Override
    public void createAgenda_Doctor(String specialty, Integer years_of_experience) {

        this.specialty = specialty;
        this.years_of_experience = years_of_experience;

    }

    @Override
    public void printRegistro_Doctor() {

        System.out.println("Especialidad: "+specialty);
        System.out.println("Años de experiencia: "+years_of_experience);

    }

    @Override
    public void saveRegistro_Doctor() {

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
    public void readRegistro_Doctor() {
        try {
            FileInputStream fis = new FileInputStream(path);
            ObjectInputStream ois = new ObjectInputStream(fis);
            Object o = ois.readObject();
            agendaDoctor = (AgendaDoctor) o;

        } catch (Exception e){
            System.out.println(e);
        }
    }
}
