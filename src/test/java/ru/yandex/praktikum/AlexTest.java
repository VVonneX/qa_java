package ru.yandex.praktikum;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;
import ru.praktikum.Alex;
import ru.praktikum.Feline;

import java.util.List;

@RunWith(MockitoJUnitRunner.class)
public class AlexTest {

    private Alex alex;

    List<String> friends = List.of("зебра Марти", "бегемотиха Глория", "жирафа Мелман");
    List<String> eat = List.of("Животные", "Птицы", "Рыба");
    @Mock
    Feline feline;

    @Before
    public void setup() {
        alex = new Alex(feline);
    }


    @Test
    public void shouldReturnTrueGetFriends() {
        List<String> actual = alex.getFriends();
        Assert.assertEquals(friends, actual);
    }

    @Test
    public void shouldReturnTrueGetPlaceOfLiving() {
        Assert.assertEquals("Нью-Йоркский зоопарк", alex.getPlaceOfLiving());
    }

    @Test
    public void shouldReturnTrueGetKittens() {
        Assert.assertEquals(0, alex.getKittens());
    }

    @Test
    public void shouldReturnTrueGetFood() throws Exception {
        Mockito.when(feline.getFood("Хищник")).thenReturn(eat);
        Assert.assertEquals(eat, alex.getFood());
    }
}