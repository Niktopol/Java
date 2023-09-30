import task10.SortingStudentsByGPA;

public class Task10 {
    public void doThing(){
        SortingStudentsByGPA srt = new SortingStudentsByGPA();
        srt.setArray(10);
        srt.mergeSort();
        srt.outArray();
        srt.setSortToggle();
        srt.quickSort();
        srt.outArray();
    }
}
