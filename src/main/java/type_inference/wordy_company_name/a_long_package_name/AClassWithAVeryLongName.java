package type_inference.wordy_company_name.a_long_package_name;

public class AClassWithAVeryLongName {
    String name;

    public AClassWithAVeryLongName() {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "AClassWithAVeryLongName{" +
                "name='" + name + '\'' +
                '}';
    }
}
