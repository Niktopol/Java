import task10.SortingStudentsByGPA;

public class Task10 {
    public void doThing(){
        SortingStudentsByGPA srt = new SortingStudentsByGPA();
        srt.setArray(3);
        srt.mergeSort();
        srt.outArray();
        srt.setSortToggle();
        srt.quickSort();
        srt.outArray();
        SortingStudentsByGPA newsrt = new SortingStudentsByGPA();
        newsrt.setArray(2);
        srt.addArray(newsrt.getArr());
        srt.quickSort();
        srt.outArray();
    }
}
