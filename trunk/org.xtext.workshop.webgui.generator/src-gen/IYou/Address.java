package IYou;



public class Address {

   public Address() {
   }


   private String street;

   public String getStreet() {
      return street;
   }
   
   public void setStreet(String street) {
      this.street = street;
   }      

   private String city;

   public String getCity() {
      return city;
   }
   
   public void setCity(String city) {
      this.city = city;
   }      

   private Zipcode zipcode;

   public Zipcode getZipcode() {
      return zipcode;
   }
   
   public void setZipcode(Zipcode zipcode) {
      this.zipcode = zipcode;
   }      

}
