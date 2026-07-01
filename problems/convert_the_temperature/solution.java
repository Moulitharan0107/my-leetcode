class Solution {
    public double[] convertTemperature(double celsius) {
        double k=celsius+273.15;
        double f;
        f=celsius*1.8;
        f=f+32;
        return new double[]{k,f};
    }
}