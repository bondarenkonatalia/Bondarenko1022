package homeWork3;
   public class User1 {
    private String name;
    private String surname;
    private int age;
    private String gender;

    public User1(String name, String surname, int age, String gender) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.gender = gender;
        System.out.println(name+" "+surname+" "+age+" "+gender);
    }

    public User1(String name) {
        this();
        this.name = name;
        System.out.println("Constructor whis name");
    }
       public User1() {
           System.out.println("Constructor empty");
       }
   }