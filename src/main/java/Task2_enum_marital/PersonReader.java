package Task2_enum_marital;

public class PersonReader {
    public static void main(String[] args) {
        Person mstislav = new Person(44, "Mstislav", MaritalStatus.SINGLE);
        Person yaroslav = new Person(34,"Yaroslav", MaritalStatus.DIVORCED);
        Person david = new Person(24,"David", MaritalStatus.MARRIED);
        Person anya = new Person(53,"Anya", MaritalStatus.WIDOW);
        Person emma = new Person(43,"Emma", MaritalStatus.WIDOW);

        System.out.println(david.maritalStatus.toString());
        System.out.println(yaroslav.toString());

        if (anya.maritalStatus == emma.maritalStatus){
            System.out.println("You again??");
        }
    }
}
