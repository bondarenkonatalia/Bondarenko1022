package homeWork3;

public enum USER {
    USER1 ("Egor", "Legov", 34, "M"),
    USER2 ("Ivan", "Titov", 26, "M"),
    USER3 ("Mila", "Sergeeva", 33, "W"),
    USER4 ("Anna", "Pavlova", 21, "W");

    private String name;
    private String surname;
    private int age;
    private String gender;

    USER(String name, String surname, int age, String gender) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.gender = gender;
    }
    public void println(){
        System.out.println(name +" "+ surname);
    }
    public void addAge(int addAge){
        age += addAge;
        System.out.println(age);
    }
    public void printUser() {
        System.out.println("имя: " +name +", фамилия: "+ surname +", возраст: "+ age +",  пол: "+ gender);
    }

}
