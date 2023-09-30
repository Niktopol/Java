package task10;

import java.util.*;

public class SortingStudentsByGPA implements Comparator<Student> {
    private Random random = new Random();
    private boolean sortToggle = false;

    @Override
    public int compare(Student o1, Student o2) {
        if (sortToggle){
            return o1.compareTo(o2);
        }else{
            return o1.getPoints() - o2.getPoints();
        }
    }
    private String getString(int num){
        StringBuilder bl = new StringBuilder();
        String alphabet = "abcdefghijklmnopqrsyuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";
        for (int i = 0; i < num; i++) {
            bl.append(alphabet.charAt(random.nextInt(alphabet.length())));
        }
        return bl.toString();
    }
    private int partition(int begin, int end) {
        int i = (begin - 1);

        for (int j = begin; j < end; j++) {
            if (compare(iDNumber.get(j), iDNumber.get(end)) <= 0) {
                i++;

                Student swapTemp = iDNumber.get(i);
                iDNumber.set(i, iDNumber.get(j));
                iDNumber.set(j, swapTemp);
            }
        }

        Student swapTemp = iDNumber.get(i + 1);
        iDNumber.set(i + 1, iDNumber.get(end));
        iDNumber.set(end, swapTemp);

        return i + 1;
    }

    private void quickSort(int begin, int end) {
        if (begin < end) {
            int partitionIndex = partition(begin, end);

            quickSort(begin, partitionIndex - 1);
            quickSort(partitionIndex + 1, end);
        }
    }

    public void merge(Student[] a, Student[] l, Student[] r, int left, int right) {
        int i = 0, j = 0, k = 0;
        while (i < left && j < right) {
            if (compare(l[i], r[j]) <= 0) {
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
    public void mergeSort(){
        Student[] students = new Student[iDNumber.size()];
        iDNumber.toArray(students);
        mergeSort(students, students.length);
        for(int i = 0; i < students.length; i++){
            iDNumber.set(i, students[i]);
        }
    }
    public void quickSort(){
        quickSort(0, iDNumber.size()-1);
    }
    ArrayList<Student> iDNumber = new ArrayList<>();
    public void setArray(int num){
        iDNumber.clear();
        for (int i = 0; i < num; i++){
            iDNumber.add(new Student(random.nextInt(100000), random.nextInt(100), getString(10), getString(10), getString(15), random.nextInt(30), getString(4)));
        }
    }
    public void addArray(ArrayList<Student> toAdd){
        iDNumber.addAll(toAdd);
    }
    public ArrayList<Student> getArr(){
        return iDNumber;
    }
    public void outArray(){
        System.out.println(Arrays.toString(iDNumber.toArray()));
    }
    public void setSortToggle(){
        sortToggle = !sortToggle;
        if (sortToggle){
            System.out.println("Установлена сортировака по id");
        }else{
            System.out.println("Установлена сортировака по баллам");
        }
    }
}
