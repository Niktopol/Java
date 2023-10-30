package task24;

public class MusicDocument implements IDocument{
    @Override
    public void open() {
        System.out.println("Opening a music document");
    }

    @Override
    public void save() {
        System.out.println("Saving a music document");
    }
}