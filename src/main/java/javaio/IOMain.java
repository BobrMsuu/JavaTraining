package javaio;

import treemap.AverageStudentGrade;
import treemap.SubjectGrade;
import treemap.TreeMapRunner;

import java.io.*;
import java.util.*;

public class IOMain {

    private static final String FILE_NAME = "GradeBook.txt";
    private static final String BINARY_FILE = "Students.bin";

    public static void main(String[] args) throws IOException {

//        SortedMap<AverageStudentGrade, Set<SubjectGrade>> grades = TreeMapRunner.createGrades();
        Reader reader = new Reader();
//        Writer writer = new Writer();
//        writer.writeFile(grades, FILE_NAME);
//        reader.readFile(FILE_NAME);
//        writer.writeWithFormatter();
//        processGrades(grades,writer,BINARY_FILE);
//        outputObjects(reader,BINARY_FILE);

        FileUtils utils = new FileUtils();
        utils.printIOFileDetails("./");
        utils.printNioFileDetails(FILE_NAME);
        reader.readFileInFull(FILE_NAME);
//        reader.nioReadFileWithBuffer(FILE_NAME);
//        writer.nioWriteWithBuffer(BUFFERED_FILE);
//        reader.nioReadWithStream(FILE_NAME);
//        writer.nioWriteWithStream(BUFFERED_FILE);
//
//        reader.nioReadWithChannel(FILE_NAME);
//        writer.nioWriteWithChannel(BUFFERED_FILE);
//        writer.writeWithRandomAccess(FILE_NAME);


    }

    private static void processGrades(SortedMap<AverageStudentGrade, Set<SubjectGrade>> grades, Writer writer, String file_Name) {
        List<Student> students = new ArrayList<>();
        for (AverageStudentGrade gradeKey : grades.keySet()) {
            students.add(new Student(gradeKey.getName(),gradeKey.getAverageGrade(),grades.get(gradeKey)));
        }
        writer.writeObject(students, file_Name);
    }

    private static void outputObjects(Reader reader, String fileName){
        List<Student>students = reader.readObject(fileName);
        for (Student student : students){
            System.out.printf("%s, %.2f %n", student.getName(),student.getAverageGrade());
            System.out.println(student.getGrades());
        }
    }


}


//        try (FileInputStream reader = new FileInputStream(FILE_NAME);
//             FileOutputStream writer = new FileOutputStream("GradeBookByte.txt")) {
//
//            int c;
//            while ((c = reader.read()) != -1) {
//                System.out.print(c);
//                writer.write(c);
//            }
//        }
