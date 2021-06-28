package Builder;

public class TableModel {

    public static class Builder {
        private Long id;
        private String ime;
        private String prezime;

        public Builder(){
        }

        public TableModel build(){
            return new TableModel(this);
        }

        public Builder id(Long id){
            this.id = id;
            return this;
        }

        public Builder ime(String ime){
            this.ime = ime;
            return this;
        }

        public Builder prezime(String prezime){
            this.prezime = prezime;
            return this;
        }

    }

    private final Long id;
    private final  String ime;
    private final  String prezime;

    public Long getId() {
        return id;
    }

    public String getIme() {
        return ime;
    }

    public String getPrezime() {
        return prezime;
    }

    public TableModel(Builder builder) {
        this.id = builder.id;
        this.ime = builder.ime;
        this.prezime = builder.prezime;
    }


}
