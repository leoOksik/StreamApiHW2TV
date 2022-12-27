public class TV {

    private String model;
    private int yearRelease;
    private int price;
    private double diagonal;
    private String vendor;

    public TV(String model, int yearRelease, int price, double diagonal, String vendor) {
        this.model = model;
        this.yearRelease = yearRelease;
        this.price = price;
        this.diagonal = diagonal;
        this.vendor = vendor;
    }

    public String getModel() {
        return model;
    }

    public int getYearRelease() {
        return yearRelease;
    }

    public int getPrice() {
        return price;
    }

    public double getDiagonal() {
        return diagonal;
    }

    public String getVendor() {
        return vendor;
    }

    @Override
    public String toString() {
        return "TV{" +
                "model='" + model + '\'' +
                ", yearRelease=" + yearRelease +
                ", price=" + price +
                ", diagonal=" + diagonal +
                ", vendor='" + vendor + '\'' +
                '}';
    }
}
