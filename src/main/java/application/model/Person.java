package application.model;

public class Person {
    private static int countId;
    /*уникальное поле */
    private int id;
    /*имя/псевдоним*/
    private String name;


    public Person(String name) {
        this.id = ++countId;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
