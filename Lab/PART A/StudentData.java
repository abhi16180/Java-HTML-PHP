import java.util.Scanner;

class StudentData {
    
    String name;
    String usn;
   
    void setName(String name){
        this.name=name;
    }
    void setUsn(String usn){
        this.usn=usn;
    }

    String getName(){
        return this.name;
    }
    String getUsn(){
        return this.usn;
    }

    public static void main(String args[]){
        int size;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of students");
        size=sc.nextInt();
        //creates array of Student type
        StudentData studentArray[]= new StudentData[size];
        for(int i=0;i<size;i++){
            studentArray[i]= new StudentData();
            System.out.println("Enter student name");  
            studentArray[i].setName(sc.next());
            System.out.println("Enter student usn");
            studentArray[i].setUsn(sc.next());
        }

        System.out.println("Printing data");
        for(int i=0;i<size;i++){
            System.out.println(studentArray[i].getName());
            System.out.println(studentArray[i].getUsn());
        }
        sc.close();

        
    }
}
