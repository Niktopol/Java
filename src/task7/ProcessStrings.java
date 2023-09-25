package task7;

public class ProcessStrings implements StringModifier{
    @Override
    public int countChars(String s) {
        return s.length();
    }

    @Override
    public String getOdd(String s) {
        StringBuilder builder = new StringBuilder();
        for (int i = 1; i < s.length(); i+=2){
            builder.append(s.charAt(i));
        }
        return builder.toString();
    }

    @Override
    public String makeReversed(String s) {
        StringBuilder builder = new StringBuilder(s);
        return builder.reverse().toString();
    }
}
