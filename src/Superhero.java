public class Superhero {
    private String superheroName;
    private String realName;
    private String superpower;
    private int yearCreated;
    private boolean isHuman;
    private int strength;

    //Constructor no superhero name
    public Superhero(String realName, String superpower, int yearCreated, boolean isHuman, int strength) {
        this.realName = realName;
        this.superpower = superpower;
        this.yearCreated = yearCreated;
        this.isHuman = isHuman;
        this.strength = strength;
    }

    //Constructor with superhero name
    public Superhero(String superheroName, String realName, String superpower, int yearCreated, boolean isHuman, int strength) {
        this.superheroName = superheroName;
        this.realName = realName;
        this.superpower = superpower;
        this.yearCreated = yearCreated;
        this.isHuman = isHuman;
        this.strength = strength;
    }

    //Gettere
    public String getSuperheroName(){
        return superheroName;
    }

    public String getRealName() {
        return realName;
    }

    public String getSuperpower() {
        return superpower;
    }

    public int getYearCreated() {
        return yearCreated;
    }

    public boolean getIsHuman() {
        return isHuman;
    }

    public int getStrength() {
        return strength;
    }

    //Settere
    public void setSuperheroName(String superheroName) {
        this.superheroName = superheroName;
    }

    public void setRealName(String realName) {
        this.realName = realName;
    }

    public void setSuperpower(String superpower) {
        this.superpower = superpower;
    }

    public void setYearCreated(int yearCreated) {
        this.yearCreated = yearCreated;
    }

    public void setIsHuman(boolean isHuman) {
        this.isHuman = isHuman;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    //ToString Method
    public String toString() {
        return "Superhero Name: " + superheroName + "\n" +
                "Real name: " + realName + "\n" +
                "Superpower: " + superpower + "\n" +
                "Year created: " + yearCreated + "\n" +
                "The superhero is human: " +  isHuman + "\n" +
                "Their strength is: " + strength;
    }
}
