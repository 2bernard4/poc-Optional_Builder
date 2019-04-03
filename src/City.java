public class City {
    int id;
    String name;

    public City(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "City[ '" + name + '\'' + " ]";
    }

    /*public City setId(int id) {
        this.id = id;
        return this;
    }

    public City setName(String name) {
        this.name = name;
        return this;
    }

    public City build(){
        City c = new City();
        c.id = this.id;
        c.name = this.name;
        return c;
    }*/


}
