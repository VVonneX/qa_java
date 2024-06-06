package ru.yandex.praktikum;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;
import ru.praktikum.Feline;
import ru.praktikum.Lion;

import java.util.List;

@RunWith(MockitoJUnitRunner.class)
public class LionTest {

    List<String> eat = List.of("Животные", "Птица", "Рыба");

    private Lion lion;

    @Mock
    Feline feline;

    @Before
    public void setup() {
        lion = new Lion("Самец", feline);
    }

    @Test
    public void shouldReturnTrueGetKittens() {
        Mockito.when(feline.getKittens()).thenReturn(4);
        Assert.assertEquals(4, lion.getKittens());
    }

    @Test
    public void shouldReturnTrueGetFood() throws Exception {
        Mockito.when(feline.getFood("Хищник")).thenReturn(eat);
        Assert.assertEquals(eat, lion.getFood());
    }

}