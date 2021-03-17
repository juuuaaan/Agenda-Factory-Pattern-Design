import java.io.Serializable;

public abstract class AgendaCliente implements Serializable {

    private static final long serialVersionUID = 4796670316545455693L;

    String name = null;
    Integer age = null;
    String phone = null;
    String disease = null;
    String treatment = null;

    public abstract void createAgenda_Cliente( String name, Integer age, String phone, String disease, String treatment);

    public abstract void printRegistro_Cliente();

    public abstract void saveRegistro_Cliente();

    public abstract void readRegistro_Cliente();

}
