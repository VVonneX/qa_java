package ru.yandex.praktikum;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.Spy;
import org.mockito.junit.MockitoJUnitRunner;
import ru.praktikum.Animal;
import ru.praktikum.Feline;

import java.util.List;

@RunWith(MockitoJUnitRunner.class)
public class FelineTest {
    List<String> eat = List.of("Животные", "Птицы", "Рыба");

    @Spy
    Feline feline;

    @Mock
    Animal animal;

    @Test
    public void shouldReturnTrueGetFamily() {
        Assert.assertEquals("Кошачьи", feline.getFamily());
    }

    @Test
    public void shouldReturnTrueGetZeroKittens() {
        Assert.assertEquals(1, feline.getKittens());
    }

    @Test
    public void shouldReturnTrueGetKittens() {
        Assert.assertEquals(4, feline.getKittens(4));
    }

    @Test
    public void shouldReturnTrueEatMeat() throws Exception {
        Mockito.when(animal.getFood("Хищник")).thenReturn(eat);
        Assert.assertEquals(eat, feline.eatMeat());
    }
}