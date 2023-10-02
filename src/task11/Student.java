package task11;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class Student {
    private String name;
    private String surname;
    private Date birth;

    private int format;
    public final int LONG = 2;
    public final int MEDIUM = 1;
    public final int SHORT = 0;

    public Student(String name, String surname, Date birth){
        this.name = name;
        this.surname = surname;
        this.birth = birth;
        format = 2;
    }
    public void setFormat(int format) {
        this.format = Math.abs(format)%3;
    }
    @Override
    public String toString(){
        SimpleDateFormat formatter;
        switch (format){
            case LONG:
                formatter = new SimpleDateFormat("EEEE, dd MMM, yyyy", Locale.ENGLISH);
                return formatter.format(birth);
            case MEDIUM:
                formatter = new SimpleDateFormat("dd MMM, yyyy", Locale.ENGLISH);
                return formatter.format(birth);
            case SHORT:
                formatter = new SimpleDateFormat("dd/MM/yyyy");
                return formatter.format(birth);
        }
        return "";
    }
}
