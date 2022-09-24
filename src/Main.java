public class Main {
    public static void main(String[] args) {

        //Задача №1
        System.out.println("Задача №1");
        int applesCount = 5;
        System.out.println("Значение переменной applesCount с типом int равно " + applesCount);
        byte oragesCount = 4;
        System.out.println("Значение переменной orageCount с типом byte равно " + oragesCount);
        short catsCount = 3;
        System.out.println("Значение переменной catsCount с типом short равно " + catsCount);
        long peopleCount = 7_500_000_000L;
        System.out.println("Значение переменной peopleCount с типом long равно " + peopleCount);
        float pi = 3.141592F;
        System.out.println("Значение переменной pi с типом float равно " + pi);
        double e = 2.8;
        System.out.println("Значение переменной e с типом double равно " + e);

        //Задача №2
        System.out.println("Задача №2");
        float variable1 = 27.12F;
        long variable2 = 987_678_965_549L;
        double variable3 = 2.786;
        boolean variable4 = false;
        char variable5 = 569;
        short variable6 = -159;
        int variable7 = 27897;
        byte variable8 = 67;

        //Задача №3
        System.out.println("Задача №3");
        int pupilsInFirstClass = 23;
        int pupilsInSecondClaas = 27;
        int pupilsInThirdClass = 30;
        int papersCount = 480;
        int papersPerPupil = papersCount/(pupilsInSecondClaas+pupilsInSecondClaas+pupilsInThirdClass);
        System.out.println("На каждого ученика рассчитано "+papersPerPupil+" листов бумаги");

        //Задача №4
        System.out.println("Задача №4");
        int bottles = 16;
        int minutes = 2;
        int productivityPerMinutes = bottles / minutes;
        int twentyMinutes = 20;
        System.out.println("За "+twentyMinutes+" минут машина произвела бутылок "+productivityPerMinutes*twentyMinutes+" штук");
        int minutesInDay = 24 * 60;
        System.out.println("За "+minutesInDay+" минут машина произвела бутылок "+productivityPerMinutes*minutesInDay+" штук");
        int minutesInThreeDays = 3 * minutesInDay;
        System.out.println("За "+minutesInThreeDays+" минут машина произвела бутылок "+productivityPerMinutes*minutesInThreeDays+" штук");
        int minutesInMonth = 10 * minutesInThreeDays; //в месяце 30 дней!!!
        System.out.println("За "+minutesInMonth+" минут машина произвела бутылок "+productivityPerMinutes*minutesInMonth+" штук");

        //Задача №5
        System.out.println("Задача №5");
        int totalCans = 120;
        int whiteCansPerClaas = 2;
        int brownCansPerClaas = 4;
        int totalClasses = totalCans / (whiteCansPerClaas + brownCansPerClaas);
        int totalWhiteCans = totalClasses*whiteCansPerClaas;
        int totalBrownCans = totalClasses*brownCansPerClaas;
        System.out.println("В школе, где "+totalClasses+" классов, нужно "+totalWhiteCans+" банок белой краски и "+totalBrownCans+" банок коричневой краски");


    }
}