public class Main {
    public static void main(String[] args){
        // created array object of Student class
        Student[] students = new Student[5];
        // set the values through the constructor
        students[0] = new Student(1,"John", 19);
        students[1] = new Student(2,"Alice",20);
        students[2] = new Student(3,"Bob",21);
        students[3] = new Student(4,"Mo",22);
        students[4] = new Student(5,"Mona",23);


        int IndexToDelete = 1;
        removeElement(IndexToDelete, students);
        AddElement(students[4], students);
        int IndexToUpdate = 2;
        updateElement(IndexToUpdate, students);
    }
    public static void removeElement(int IndexToDelete, Student[] originalArray){
        Student [] newArray = new Student[originalArray.length-1];
        for (int i=0,j=0; i<originalArray.length; i++){
            if (i != IndexToDelete) {
                newArray[j++] = originalArray[i];
            }
        }
        printArray("Remove",newArray);
    }
    public static void AddElement(Student newStudent,Student[] originalArray){
        Student [] newArray = new Student[originalArray.length+1];
        for(int i=0; i<originalArray.length; i++){
            newArray[i] = originalArray[i];
        }
        newArray[newArray.length-1] = newStudent;
        printArray("Add",newArray);
    }

    public static void updateElement(int indexToUpdate, Student[] originalArray){
        if (indexToUpdate>=0 && indexToUpdate < originalArray.length){
            originalArray[indexToUpdate].setName("UpdateName");
            originalArray[indexToUpdate].setAge(25);
            originalArray[indexToUpdate].setRollNumber(99);
        }
        printArray("Update",originalArray);
    }
    public static void printArray(String message, Student[] students){
        System.out.println(message + " Student Array: ");
        for (Student s : students){
            System.out.println("RollNumber: " + s.getRollNumber() + ", Name: " + s.getName() + ", Age: " + s.getAge());
        }
        System.out.println();

    }
}
