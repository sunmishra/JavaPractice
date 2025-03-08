package main.method;

//multiple main() are possible but one in a class
//Here we are not making any of the class as public as multiple classes are present in the file
 class MyMainA {
     public static void main(String[] args) {
         System.out.println("MuManiA");
         String[] str = {"abc","xyz"};
         MyMainB.main1(str);
     }
}
 class MyMainB {
     public static void main1(String[] args) {
         System.out.println("MuMainB");
     }
}