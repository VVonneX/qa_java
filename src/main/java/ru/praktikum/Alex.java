package ru.praktikum;

import java.util.List;

public class Alex extends Lion {

    public Alex(Feline feline) throws IndexOutOfBoundsException {
        super("Самец", feline);
    }

    public List<String> getFriends() {
        return List.of("зебра Марти", "бегемотиха Глория", "жирафа Мелман");
    }

    public String getPlaceOfLiving() {
        return "Нью-Йоркский зоопарк";
    }

    @Override
    public int getKittens() {
        return 0;
    }

    @Override
    public List<String> getFood() throws Exception {
        return feline.getFood("Хищник");
    }
}