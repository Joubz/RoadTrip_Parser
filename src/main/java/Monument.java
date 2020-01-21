public class Monument {

    String name;
    String address;
    String historic;
    String hopeningHours;
    String importance;

    /**
     * Constructeur
     * @param name
     */
    Monument(String name)
    {
        this.name=name;
    }

    public String toString() {
        return "Monument is "+getName()+ ", address is "+getAddress()+", it's a "+getHistoric()+" and opening hours are : "+getHopeningHours();
    }

    /**
     *
     * @return
     */
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

    public String getHistoric() {
        return historic;
    }

    public void setHistoric(String historic) {
        this.historic = historic;
    }

    public String getHopeningHours() {
        return hopeningHours;
    }

    public void setHopeningHours(String hopeningHours) {
        this.hopeningHours = hopeningHours;
    }

    public String getImportance() {
        return importance;
    }

    public void setImportance(String importance) {
        this.importance = importance;
    }
}
