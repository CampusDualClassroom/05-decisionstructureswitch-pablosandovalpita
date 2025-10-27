package com.campusdual.classroom;

import java.util.Calendar;

public class Exercise {
    public static void main(String[] args) {
        // Creamos una instancia del calendario
        Calendar now = Calendar.getInstance();
        int month = now.get(Calendar.MONTH) + 1;
        int hour = now.get(Calendar.HOUR_OF_DAY);
        checkSeason(month);
        checkHour(hour);
    }

    //TODO ↓
    // Si la hora es desde las 0:00 a las 6:59, imprimir por pantalla → It's night
    // Si la hora es desde las 7:00 a las 13:59, imprimir por pantalla → It's morning
    // Si la hora es desde las 14:00 a las 20:59, imprimir por pantalla → It's afternoon
    // Si la hora es desde las 21:00 a las 23:59, imprimir por pantalla → It's night
    public static void checkHour(int hour) {
        if (hour >= 0 && hour < 7 || hour >= 21 && hour <= 23) {
            System.out.println("It's night");
        } else if (hour >= 7 && hour < 14) {
            System.out.println("It's morning");
        } else if (hour >= 14 && hour < 21) {
            System.out.println("It's afternoon");
        } else {
            System.out.println("Invalid hour");
        }
    }

    //TODO ↓
    // Si es Enero, Febrero o Marzo, imprimir por pantalla → Winter
    // Si es Abril, Mayo o Junio, imprimir por pantalla → Spring
    // Si es Julio, Agosto o Septiembre, imprimir por pantalla → Summer
    // Si es Octubre, Noviembre o Diciembre, imprimir por pantalla → Autumn
    public static void checkSeason(int month) {
        if (month >= 1 && month <= 3) {
            System.out.println("Winter");
        } else if (month >= 4 && month <= 6) {
            System.out.println("Spring");
        } else if (month >= 7 && month <= 9) {
            System.out.println("Summer");
        } else if (month >= 10 && month <= 12) {
            System.out.println("Autumn");
        } else {
            System.out.println("Invalid month");
        }
    }
}
