import task9.SortingStudentsByGPA;
import task9.Student;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class Task9 {

    private void insertionSort(Student[] students) {
        for (int j = 1; j < students.length; j++) {
            int i = j - 1;
            Student key = students[j];
            while ((i > -1) && (students[i].compareTo(key) > 0)) {
                students[i + 1] = students[i];
                i--;
            }
            students[i + 1] = key;
        }
    }

    private int partition(Student[] arr, int begin, int end) {
        SortingStudentsByGPA comparator = new SortingStudentsByGPA();
        int i = (begin - 1);

        for (int j = begin; j < end; j++) {
            if (comparator.compare(arr[j], arr[end]) <= 0) {
                i++;

                Student swapTemp = arr[i];
                arr[i] = arr[j];
                arr[j] = swapTemp;
            }
        }

        Student swapTemp = arr[i + 1];
        arr[i + 1] = arr[end];
        arr[end] = swapTemp;

        return i + 1;
    }

    private void quickSort(Student[] arr, int begin, int end) {
        if (begin < end) {
            int partitionIndex = partition(arr, begin, end);

            quickSort(arr, begin, partitionIndex - 1);
            quickSort(arr, partitionIndex + 1, end);
        }
    }

    public static void merge(Student[] a, Student[] l, Student[] r, int left, int right) {
        SortingStudentsByGPA comparator = new SortingStudentsByGPA();
        int i = 0, j = 0, k = 0;
        while (i < left && j < right) {
            if (comparator.compare(l[i], r[j]) <= 0) {
                a[k++] = l[i++];
            } else {
                a[k++] = r[j++];
            }
        }
        while (i < left) {
            a[k++] = l[i++];
        }
        while (j < right) {
            a[k++] = r[j++];
        }
    }

    private void mergeSort(Student[] a, int n) {
        if (n < 2) {
            return;
        }
        int mid = n / 2;
        Student[] l = new Student[mid];
        Student[] r = new Student[n - mid];

        for (int i = 0; i < mid; i++) {
            l[i] = a[i];
        }
        for (int i = mid; i < n; i++) {
            r[i - mid] = a[i];
        }
        mergeSort(l, mid);
        mergeSort(r, n - mid);

        merge(a, l, r, mid, n - mid);
    }
    private Student[] joinArrays(Student[] a, Student[] b){
        Student[] students = new Student[a.length+b.length];
        for (int i = 0; i < a.length; i++) {
            students[i] = a[i];
        }
        for (int i = 0; i < b.length; i++) {
            students[a.length+i] = b[i];
        }
        return students;
    }

    public void doThing() {
        Random random = new Random();
        Student[] students = new Student[7];
        students[0] = new Student(random.nextInt(100000), random.nextInt(100));
        students[1] = new Student(random.nextInt(100000), random.nextInt(100));
        students[2] = new Student(random.nextInt(100000), random.nextInt(100));
        students[3] = new Student(random.nextInt(100000), random.nextInt(100));
        students[4] = new Student(random.nextInt(100000), random.nextInt(100));
        students[5] = new Student(random.nextInt(100000), random.nextInt(100));
        students[6] = new Student(random.nextInt(100000), random.nextInt(100));
        System.out.println(Arrays.toString(students));
        //Задание 1
        insertionSort(students);
        System.out.println(Arrays.toString(students));
        //Задание 2
        quickSort(students, 0, students.length - 1);
        System.out.println(Arrays.toString(students));
        //Задание 3
        Student[] otherStudents = new Student[5];
        otherStudents[0] = new Student(random.nextInt(100000), random.nextInt(100));
        otherStudents[1] = new Student(random.nextInt(100000), random.nextInt(100));
        otherStudents[2] = new Student(random.nextInt(100000), random.nextInt(100));
        otherStudents[3] = new Student(random.nextInt(100000), random.nextInt(100));
        otherStudents[4] = new Student(random.nextInt(100000), random.nextInt(100));
        System.out.println(Arrays.toString(otherStudents));
        Student[] joined = joinArrays(students, otherStudents);
        System.out.println(Arrays.toString(joined));
        mergeSort(joined, joined.length);
        System.out.println(Arrays.toString(joined));
    }

}
