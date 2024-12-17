public class Cup{
    private String liquidType;
    private double PercentFull;

    public Cup(String liquidType, double percentfull){
        this.liquidType = liquidType;
        this.PercentFull =percentfull;
    }
    public String getliquidType() {
        return liquidType;
    }

    public double getPercentFull() {
        return PercentFull;
    }
    public void setLiquidType(String liquidType){
        if(liquidType == null){
            return;
        }
        this.liquidType = liquidType;
    }

    public boolean isEmpty() {
        return PercentFull == 0;
    }

    public void setPercentFull(double PercentFull){
        if(PercentFull > 100 || PercentFull < 0){
            throw new IllegalArgumentException("percentage of the water is be between greater than 0 or less than 100");

        }
    }

}
