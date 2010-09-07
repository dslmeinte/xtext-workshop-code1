package IYou;

import java.util.List;

public class Person {

   public Person() {
   }


   private String name;

   public String getName() {
      return name;
   }
   
   public void setName(String name) {
      this.name = name;
   }      

   private java.util.Date birth;

   public java.util.Date getBirth() {
      return birth;
   }
   
   public void setBirth(java.util.Date birth) {
      this.birth = birth;
   }      

   private String email;

   public String getEmail() {
      return email;
   }
   
   public void setEmail(String email) {
      this.email = email;
   }      

   private Address address;

   public Address getAddress() {
      return address;
   }
   
   public void setAddress(Address address) {
      this.address = address;
   }      

   private List<Person> recommends;

   public List<Person> getRecommends() {
      return recommends;
   }
   
   public void setRecommends(List<Person> recommends) {
      this.recommends = recommends;
   }      

}
