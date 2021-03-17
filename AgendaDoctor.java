import java.io.Serializable;

public abstract class AgendaDoctor implements Serializable {

    private static final long serialVersionUID = 1222670323423455693L;

    String specialty = null;
    Integer years_of_experience = 0;

    public abstract void createAgenda_Doctor( String specialty, Integer years_of_experience);

    public abstract void printRegistro_Doctor();

    public abstract void saveRegistro_Doctor();

    public abstract void readRegistro_Doctor();

}
