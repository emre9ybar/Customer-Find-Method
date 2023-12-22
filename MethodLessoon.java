

public class MethodLessoon {
public static void findCustomer(String name){
    System.out.println("Customer is name :"+name);

}
public static void findCustomer(int customerID){
    System.out.println("Customer is find ID :"+customerID);
}
public static void findCustomer(String email,int phoneNumber){
    System.out.println("Customer is find Email :"+email);
}

    public static void main(String[] args) {

findCustomer("EMRE");
findCustomer(1233354);
findCustomer("emre.aybar@gmail.com",54654654);

    }
}


