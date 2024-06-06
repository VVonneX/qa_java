package ru.yandex.praktikum;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;
import ru.praktikum.Cat;
import ru.praktikum.Feline;

import java.util.List;

@RunWith(MockitoJUnitRunner.class)
public class CatTest {

    List<String> eat = List.of("Животные", "Птица", "Рыба");

    private Cat cat;

    @Mock
    Feline feline;

    @Before
    public void setup() {
        cat = new Cat(feline);
    }

    @Test
    public void shouldReturnTrueGetSound() {
        String actual = cat.getSound();
        Assert.assertEquals("Мяу", actual);
    }

    @Test
    public void shouldReturnTrueGetFood() throws Exception {
        Mockito.when(feline.eatMeat()).thenReturn(eat);
        Assert.assertEquals(eat, cat.getFood());
    }

}