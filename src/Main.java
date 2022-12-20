import transport.Car;

public class Main {
    public static void main(String[] args) {
        Car Lada = new Car("Lada", "Granta", 1.7,"" , -1, "Россия","механика","седан","е103хс138",4,true);
        Car.Insurance LadaInsurance= Lada.new Insurance(18, 5423, " 123456789");


      //  transport.Car Audi = new transport.Car("Audi", "A8 50 L TDI quattro", 3.0, "черный", 2020, "Германия");
      //  transport.Car BMW = new transport.Car("BMW", "Z8", 3.0, "черный", -1, "Германия");
      //  transport.Car Kia = new transport.Car("Kia", "Sportage 4-го поколения", 2.4, "красный", 2018, "Южная Корея");
      //  transport.Car Hyundai = new transport.Car("Hyundai", "Avante", 1.6, "оранжевый", 2016, "Южная Корея")""

        System.out.println(Lada);
     //   System.out.println(car1);
        Lada.seasonalTireCheck(Lada);
         Lada.setRegistrationNumber("000000000");
        System.out.println(LadaInsurance);
        System.out.println(Lada);

    }
}