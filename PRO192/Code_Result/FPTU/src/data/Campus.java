
package data;


public class Campus {
    private String code;
    private String name;
    private String address;
    public Campus(){

    }

    public Campus(String code, String name, String address) {
        this.code = code;
        this.name = name;
        this.address = address;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
