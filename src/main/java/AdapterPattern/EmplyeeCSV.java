package AdapterPattern;

import java.util.StringTokenizer;

public class EmplyeeCSV {

    private int id;
    private String firstname;
    private String lastname;
    private String emailAddress;

    public EmplyeeCSV(String values){
        StringTokenizer tokenizer = new StringTokenizer(values,",");
        if(tokenizer.hasMoreElements()){
            id = Integer.parseInt(tokenizer.nextToken());
        }
        if(tokenizer.hasMoreElements()){
            firstname = tokenizer.nextToken();
        }
        if(tokenizer.hasMoreElements()){
            lastname = tokenizer.nextToken();
        }
        if(tokenizer.hasMoreElements()) {
            emailAddress = tokenizer.nextToken();
        }

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getfirstname() {
        return firstname;
    }

    public void setfirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getlastname() {
        return lastname;
    }

    public void setlastname(String lastname) {
        this.lastname = lastname;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }
}
