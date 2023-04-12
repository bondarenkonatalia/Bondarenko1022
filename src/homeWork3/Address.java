package homeWork3;

public class Address {
    private String name;
    private String surname;
    private int age;
    private String gender;
    private UserAddress address;

    public Address(String name, String surname, int age, String gender,UserAddress address) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.gender = gender;
        this.address = address;

        System.out.println(name+" "+surname+" "+age+" "+gender+" "+ address.country+" "+ address.city);
    }
    public static class UserAddress{
        private String country;
        private String city;

        public UserAddress(String country, String city) {
            this.country = country;
            this.city = city;
        }
        public void printlnAddress(){
            System.out.println(country+" "+city);
        }
    }

}



