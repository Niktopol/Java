package task4;

public enum Sizes {
    XXS(32),
    XS(34),
    S(36),
    M(38),
    L(40);
    private int size;
    private Sizes(int size){
        this.size = size;
    }
    public String getDescription(){
        if (this.equals(XXS)){
            return "Детский размер";
        }else if(this.equals(XS) || this.equals(S) || this.equals(M) || this.equals(L)){
            return "Взрослый размер";
        }
        return "";
    }
}
