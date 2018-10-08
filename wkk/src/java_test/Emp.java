package java_test;

public class Emp {

    public String getE_id() {
        return e_id;
    }

    public void setE_id(String e_id) {
        this.e_id = e_id;
    }

    private String e_id;

    public String getE_name() {
        return e_name;
    }

    public void setE_name(String e_name) {
        this.e_name = e_name;
    }

    private String e_name;

    public Emp(String id, String name) {
        this.e_id=id;
        this.e_name=name;
    }

}
