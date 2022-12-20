package transport;

import java.time.LocalDate;

public class Car {
    private String brand;
    private String model;
   private double engineVolume;
    private String color;
   private int year;
   private String country;
    private String transmission;
    private String carBodyType;
    private String registrationNumber;
   private int numberOfSeats;
   private boolean winterTires;
    private Insurance insurance;
   public class Insurance {
       private double termOfInsurance;
       private double insuranceCost;
       private String insuranceNumber;

       public double getTermOfInsurance() {
           if (termOfInsurance <= 0) {
               termOfInsurance = 1;
           }
           return termOfInsurance;
       }

       public void setTermOfInsurance(double termOfInsurance) {
           this.termOfInsurance = termOfInsurance;
       }

       public double getInsuranceCost() {

           return insuranceCost;
       }

       public void setInsuranceCost(double insuranceCost) {
           this.insuranceCost = insuranceCost;
       }

       public String getInsuranceNumber() {
           if (insuranceNumber == null && insuranceNumber.length() != 9) {
               insuranceNumber = "значение по умолчанию xxxxxxxxx";
           }
           return insuranceNumber;
       }

       public void setInsuranceNumber(String insuranceNumber) {
           this.insuranceNumber = insuranceNumber;
       }

       public Insurance(double termOfInsurance, double insuranceCost, String insuranceNumber) {
           this.termOfInsurance = termOfInsurance;
           this.insuranceCost = insuranceCost;
           this.insuranceNumber = insuranceNumber;
       }

       @Override
       public String toString() {
           return
                   "Срок действия» страховки- " + getTermOfInsurance() +
                   ", стоимость» страховки- " + getInsuranceCost() +
                   ", номер» страховки №" + getInsuranceNumber();
       }
   }
   public static class Key{
       private boolean remoteEngineStart;
       private boolean keylessEntry;

       public Key(boolean remoteEngineStart,boolean keylessEntry) {
           this.remoteEngineStart = remoteEngineStart;
           this.keylessEntry = keylessEntry;
       }

       public boolean getRemoteEngineStart() {
           return remoteEngineStart;
       }

       public boolean getKeylessEntry() {
           return keylessEntry;
       }

   }
    public Car(String brand, String model, double engineVolume, String color, int year, String country, String transmission,
               String carBodyType, String registrationNumber, int numberOfSeats, boolean winterTires) {
        this.brand = brand;
        this.model = model;
        this.engineVolume = engineVolume;
        this.color = color;
        this.year=year;
        this.country = country;

        this.transmission= transmission;
        this.carBodyType = carBodyType;
        this.registrationNumber = registrationNumber;
        this.numberOfSeats = numberOfSeats;
        this.winterTires = winterTires;
        this.insurance = insurance;
    }

    public String getBrand() {
        if (brand == null || brand.isEmpty()) {
            brand = "значение по умолчанию";
        }
        return brand;
    }

    public String getModel() {
        if (model == null || model.isEmpty()) {
            model = "значение по умолчанию";
        }
        return model;
    }

    public double getEngineVolume() {
        if (engineVolume <= 0) {
            engineVolume = 1.5;
        }
        return engineVolume;
    }

    public void setEngineVolume( double engineVolume) {
        if (engineVolume!=0 ) {
            this.engineVolume = engineVolume;
        }
    }
//    public void setEngineVolume( double engineVolume) {
//        if (engineVolume!=0 && ! engineVolume.isEmpty()&& !engineVolume.isBlank()) {
//            this.engineVolume = engineVolume;
//        }
//    }

    public String getColor() {
        if (color == null || color.isEmpty()) {
            color = " белый";
        }
        return color;
    }
    public void setColor( String color) {
        if (color!=null && ! color.isEmpty()&& !color.isBlank()) {
            this.color = color;
        }
    }

    public int getYear() {
        if (year <= 0) {
            year = 2000;
        }
        return year;
    }

    public String getCountry() {
        if (country == null || country.isEmpty()) {
            country = "значение по умолчанию";
        }
        return country;
    }

    public String getCarBodyType() {
        if (carBodyType == null || carBodyType.isEmpty()) {
            carBodyType = "значение по умолчанию";
        }
        return carBodyType;
    }
    public String getTransmission() {
        if (transmission == null || transmission.isEmpty()) {
            transmission = "значение по умолчанию";
        }
        return transmission;
    }
    public void setTransmission(String transmission) {
            if (transmission!=null&& ! transmission.isEmpty()&& !transmission.isBlank()) {
                this.transmission = transmission;
            }
    }
    public String getRegistrationNumber() {
        if (registrationNumber == null && registrationNumber.length() != 9) {
            registrationNumber = "значение по умолчанию х000хх000";
        }
        return registrationNumber;
    }

    public void setRegistrationNumber(String registrationNumber) {
        if (registrationNumber != null && registrationNumber.length() == 9&&registrationNumber.isBlank()) {
            this.registrationNumber = registrationNumber;
        }

    }

    public double getNumberOfSeats() {
        if (numberOfSeats <= 0) {
            numberOfSeats = 4;
        }
        return numberOfSeats;
    }

    public boolean getWinterTires() {
              return winterTires;
    }

    public void seasonalTireCheck(Car car) {
        LocalDate date = LocalDate.now();
        int month = date.getMonthValue();
        if (( month>9 ||month<4) && getWinterTires() == true) {
            System.out.println (" менят резину не надо");
        }
        else {
            System.out.println (" смените резину на зимнюю");
        }

    }

    public void setWinterTires(boolean winterTires) {
        this.winterTires = winterTires;
    }

    @Override
    public String toString() {
        return " марка: "+getBrand()+", модель: "+getModel()+", год выпуска "+getYear()+ ", сборка в "+ getCountry()+", \n"+getColor()+
                " цвет, объем двигателя  "+getEngineVolume()+" л. коробка передач "+getTransmission()+
                ", тип кузова \n "+getCarBodyType()+ ", pегистрационный номер "+ getRegistrationNumber()+
                ", количество мест "+ getNumberOfSeats();
    }
}
