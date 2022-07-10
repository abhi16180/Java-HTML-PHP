import java.util.Scanner;

class StudentData {

    String name;
    String usn;
    String phone;
    String branch;

    void setName(String name) {
        this.name = name;
    }

    void setUsn(String usn) {
        this.usn = usn;
    }

    void setBranch(String branch) {
        this.branch = branch;
    }

    void setPhone(String phone) {
        this.phone = phone;
    }

    String getName() {
        return this.name;
    }

    String getUsn() {
        return this.usn;
    }

    String getBranch() {
        return this.branch;
    }

    String getPhone() {
        return this.phone;
    }

    public static void main(String args[]) {
        int size;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of students");
        size = sc.nextInt();
        // creates array of Student type
        StudentData studentArray[] = new StudentData[size];
        for (int i = 0; i < size; i++) {
            studentArray[i] = new StudentData();
            System.out.println("Enter student name");
            studentArray[i].setName(sc.next());
            System.out.println("Enter student usn");
            studentArray[i].setUsn(sc.next());
            System.out.println("Enter student branch");
            studentArray[i].setBranch(sc.next());
            System.out.println("Enter student phone number");
            studentArray[i].setPhone(sc.next());
        }

        System.out.println("Printing data");
        for (int i = 0; i < size; i++) {
            System.out.println("Student "+(i+1)+" data");
            System.out.println("Name ->" + studentArray[i].getName() + "\nUSN ->" + studentArray[i].getUsn() + "\nBranch ->"
                    + studentArray[i].getBranch() + "\nPhone ->" + studentArray[i].getPhone());
        }
        sc.close();

    }
}
