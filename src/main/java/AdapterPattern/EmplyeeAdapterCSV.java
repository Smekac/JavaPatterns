package AdapterPattern;

public class EmplyeeAdapterCSV implements Emplyee {

    private EmplyeeCSV instance;

    public EmplyeeAdapterCSV(EmplyeeCSV instance){
        this.instance = instance;
    }

    @Override
    public String getId() {
        return instance.getId() + "";
    }

    @Override
    public String getFirstName() {
        return instance.getfirstname();
    }

    @Override
    public String getLastName() {
        return instance.getlastname();
    }

    @Override
    public String getEmail() {
        return instance.getEmailAddress();
    }
}
