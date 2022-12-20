public class Car {
    String brand;
    String model;
    double engineVolume;
    String color;
    int year;
    String country;
    Car( String brand,String model,double engineVolume,String color,int year,String country) {
        this.brand = brand;
        this.model = model;
        this.engineVolume = engineVolume;
        this.color = color;
        this.year=year;
        this.country = country;
    }

    public String getBrand() {
        if (brand == null || brand.isEmpty()) {
            brand = "default";
        }
        return brand;
    }

    public String getModel() {
        if (model == null || model.isEmpty()) {
            brand = "default";
        }
        return model;
    }

    public double getEngineVolume() {
        if (engineVolume <= 0) {
            engineVolume = 1.5;
        }
        return engineVolume;
    }

    public String getColor() {
        if (color == null || color.isEmpty()) {
            color = " белый";
        }
        return color;
    }

    public int getYear() {
        if (year <= 0) {
            year = 2000;
        }
        return year;
    }

    public String getCountry() {
        if (country == null || country.isEmpty()) {
            country = "default";
        }
        return country;
    }

    @Override
    public String toString() {
        return " марка: "+getBrand()+", модель: "+getModel()+", год выпуска "+getYear()+ ", сборка в "+ getCountry()+", "+getColor()+
                " цвет, объем двигателя "+getEngineVolume()+" л.";
    }
}
