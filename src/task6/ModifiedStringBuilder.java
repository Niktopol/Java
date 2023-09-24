package task6;

import java.util.ArrayList;
import java.util.Stack;
import java.util.stream.IntStream;

public class ModifiedStringBuilder implements Updatable{
    Stack<StringBuilder> builders = new Stack<>();
    private ArrayList<Updatable> subscribers = new ArrayList<>();

    public void addSubscriber(Updatable subscriber){
        subscribers.add(subscriber);
    }
    public void removeSubscriber(Updatable subscriber){
        subscribers.remove(subscriber);
    }
    public void undo(){
        if (builders.size() > 1){
            builders.pop();
        }
    }
    public ModifiedStringBuilder(String s) {
        builders.push(new StringBuilder(s));
    }
    public ModifiedStringBuilder(CharSequence sq) {
        builders.push(new StringBuilder(sq));
    }
    public ModifiedStringBuilder() {
        builders.push(new StringBuilder());
    }
    public ModifiedStringBuilder append(long lng){
        builders.push(new StringBuilder(builders.peek()).append(lng));
        return this;
    }
    public ModifiedStringBuilder append(int i){
        builders.push(new StringBuilder(builders.peek()).append(i));
        return this;
    }
    public ModifiedStringBuilder append(char c){
        builders.push(new StringBuilder(builders.peek()).append(c));
        return this;
    }
    public ModifiedStringBuilder append(float f){
        builders.push(new StringBuilder(builders.peek()).append(f));
        return this;
    }
    public ModifiedStringBuilder append(double d){
        builders.push(new StringBuilder(builders.peek()).append(d));
        return this;
    }
    public ModifiedStringBuilder append(boolean b){
        builders.push(new StringBuilder(builders.peek()).append(b));
        return this;
    }
    public ModifiedStringBuilder append(char[] str){
        builders.push(new StringBuilder(builders.peek()).append(str));
        return this;
    }
    public ModifiedStringBuilder append(Object obj){
        builders.push(new StringBuilder(builders.peek()).append(obj));
        return this;
    }
    public ModifiedStringBuilder append(String str){
        builders.push(new StringBuilder(builders.peek()).append(str));
        return this;
    }
    public ModifiedStringBuilder append(CharSequence s){
        builders.push(new StringBuilder(builders.peek()).append(s));
        return this;
    }
    public ModifiedStringBuilder append(StringBuffer sb){
        builders.push(new StringBuilder(builders.peek()).append(sb));
        return this;
    }
    public ModifiedStringBuilder append(char[] str, int offset, int len){
        builders.push(new StringBuilder(builders.peek()).append(str, offset, len));
        return this;
    }
    public ModifiedStringBuilder append(CharSequence s, int start, int end){
        builders.push(new StringBuilder(builders.peek()).append(s, start, end));
        return this;
    }
    public ModifiedStringBuilder appendCodePoint(int codePoint){
        builders.push(new StringBuilder(builders.peek()).appendCodePoint(codePoint));
        return this;
    }
    public int compareTo(StringBuilder another){
        return builders.peek().compareTo(another);
    }
    public ModifiedStringBuilder delete(int start, int end){
        builders.push(new StringBuilder(builders.peek()).delete(start, end));
        return this;
    }
    public ModifiedStringBuilder deleteCharAt(int index){
        builders.push(new StringBuilder(builders.peek()).deleteCharAt(index));
        return this;
    }
    public int indexOf(String str){
        return builders.peek().indexOf(str);
    }
    public int indexOf(String str, int fromIndex){
        return builders.peek().indexOf(str, fromIndex);
    }
    public ModifiedStringBuilder insert(int offset, long lng){
        builders.push(new StringBuilder(builders.peek()).insert(offset, lng));
        return this;
    }
    public ModifiedStringBuilder insert(int offset, int i){
        builders.push(new StringBuilder(builders.peek()).insert(offset, i));
        return this;
    }
    public ModifiedStringBuilder insert(int offset, char c){
        builders.push(new StringBuilder(builders.peek()).insert(offset, c));
        return this;
    }
    public ModifiedStringBuilder insert(int offset, float f){
        builders.push(new StringBuilder(builders.peek()).insert(offset, f));
        return this;
    }
    public ModifiedStringBuilder insert(int offset, double d){
        builders.push(new StringBuilder(builders.peek()).insert(offset, d));
        return this;
    }
    public ModifiedStringBuilder insert(int offset, boolean b){
        builders.push(new StringBuilder(builders.peek()).insert(offset, b));
        return this;
    }
    public ModifiedStringBuilder insert(int offset, char[] str){
        builders.push(new StringBuilder(builders.peek()).insert(offset, str));
        return this;
    }
    public ModifiedStringBuilder insert(int offset, Object obj){
        builders.push(new StringBuilder(builders.peek()).insert(offset, obj));
        return this;
    }
    public ModifiedStringBuilder insert(int offset, String str){
        builders.push(new StringBuilder(builders.peek()).insert(offset, str));
        return this;
    }
    public ModifiedStringBuilder insert(int dstOffset, CharSequence s){
        builders.push(new StringBuilder(builders.peek()).insert(dstOffset, s));
        return this;
    }
    public ModifiedStringBuilder insert(int index, char[] str, int offset, int len){
        builders.push(new StringBuilder(builders.peek()).insert(index, str, offset, len));
        return this;
    }
    public ModifiedStringBuilder insert(int dstOffset, CharSequence s, int start, int end){
        builders.push(new StringBuilder(builders.peek()).insert(dstOffset, s, start, end));
        return this;
    }
    public int lastIndexOf(String str){
        return builders.peek().lastIndexOf(str);
    }
    public int lastIndexOf(String str, int fromIndex){
        return builders.peek().lastIndexOf(str, fromIndex);
    }
    public ModifiedStringBuilder replace(int start, int end, String str){
        builders.push(new StringBuilder(builders.peek()).replace(start,end,str));
        return this;
    }
    public ModifiedStringBuilder reverse(){
        builders.push(new StringBuilder(builders.peek()).reverse());
        return this;
    }
    @Override
    public String toString(){
        return builders.peek().toString();
    }
    public int capacity(){
        return builders.peek().capacity();
    }
    public char charAt(int index){
        return builders.peek().charAt(index);
    }
    public IntStream chars(){
        return builders.peek().chars();
    }
    public int codePointAt(int index){
        return builders.peek().codePointAt(index);
    }
    public int codePointBefore(int index){
        return builders.peek().codePointBefore(index);
    }
    public IntStream codePoints(){
        return builders.peek().codePoints();
    }
    public int codePointCount(int beginIndex, int endIndex){
        return builders.peek().codePointCount(beginIndex, endIndex);
    }
    public void ensureCapacity(int minimumCapacity){
        builders.push(new StringBuilder(builders.peek()));
        builders.peek().ensureCapacity(minimumCapacity);
    }
    public void getChars(int srcBegin, int srcEnd, char[] dst, int dstBegin){
        builders.peek().getChars(srcBegin, srcEnd, dst, dstBegin);
    }
    public boolean isEmpty(){
        return builders.peek().isEmpty();
    }
    public int length(){
        return builders.peek().length();
    }
    public int offsetByCodePoints(int index, int codePointOffset){
        return builders.peek().offsetByCodePoints(index,codePointOffset);
    }
    public void setCharAt(int index, char ch){
        builders.push(new StringBuilder(builders.peek()));
        builders.peek().setCharAt(index, ch);
    }
    public void setLength(int newLength){
        builders.push(new StringBuilder(builders.peek()));
        builders.peek().setLength(newLength);
    }
    public CharSequence subSequence(int start, int end){
        return builders.peek().subSequence(start, end);
    }
    public String substring(int start, int end){
        return builders.peek().substring(start, end);
    }
    public String substring(int start){
        return builders.peek().substring(start);
    }
    public void trimToSize(){
        builders.push(new StringBuilder(builders.peek()));
        builders.peek().trimToSize();
    }

    @Override
    public void update(String s) {
        builders.push(new StringBuilder(s));
    }
    @Override
    public void notifySubs() {
        for(Updatable i: subscribers){
            i.update(builders.peek().toString());
        }
    }
}
