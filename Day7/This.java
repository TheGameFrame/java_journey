//Drafted from Encapsulating.java
package java_journey.Day7;
class Human
{
    private int age;
    private String name;
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;  // this.age refers to the instance variable, while age refers to the local variable
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name; //"This" makes everything simpler
    }

    //Human.obj1 = obj;
    //obj1.age = age; (NO YOU DONT HAVE TO DO THIS)

    //this.age = fixes the above script


}
