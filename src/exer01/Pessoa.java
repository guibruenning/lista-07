package exer01;

public class Pessoa {
    private String name;
    private String lastName;

    public Pessoa(String name, String lastName) {
        setName(name);
        setLastName(lastName);
    }

    public String mostrarNome(){
        return name + " " + lastName;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if(name.length()> 3)
            this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        if (lastName.length() > 3)
            this.lastName = lastName;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Exer01{");
        sb.append("name='").append(name).append('\'');
        sb.append(", lastName='").append(lastName).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
