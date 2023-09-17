package task4;

public enum Season {
    WINTER(-5.3, "В это время года выпадает снег"),
    SPRING(10.6, "В это время года растут листья"),
    SUMMER(29.7, "В это время года принято отдыхать"),
    AUTUMN(-12.2, "В это время года деревья желтеют");
    private double temp;
    private String info;
    private Season(double temp, String info){
        this.temp = temp;
        this.info = info;
    }
    public void theLover(Season season){
        switch (season){
            case WINTER:
                System.out.println("Я люблю зиму");
                break;
            case SPRING:
                System.out.println("Я люблю весну");
                break;
            case SUMMER:
                System.out.println("Я люблю лето");
                break;
            case AUTUMN:
                System.out.println("Я люблю осень");
                break;
        }
    }
    public String getDescription(){
        if (this.equals(SUMMER)){
            return "Тёплое время года";
        }else if(this.equals(WINTER) || this.equals(SPRING) || this.equals(AUTUMN)){
            return "Холодное время года";
        }
        return "";
    }
    @Override
    public String toString(){
        return info + " t: " + temp;
    }
}
