package springboo.example.sping_boot;

/*
@author zhang
@Date   2025/9/11 20:00
@description
*/
public class User {


    public User(){}
    public User(String name, Integer age, address address) {
        this.name = name;
        this.age = age;
        this.address = address;
    }


    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public address getAddress() {
        return address;
    }

    public void setAddress(address address) {
        this.address = address;
    }


    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", address=" + address +
                '}';
    }
    private String name;
    private Integer age;
    private address address;

}
