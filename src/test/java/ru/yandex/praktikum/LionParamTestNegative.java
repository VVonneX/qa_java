package ru.yandex.praktikum;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import ru.praktikum.Feline;
import ru.praktikum.Lion;

@RunWith(Parameterized.class)
public class LionParamTestNegative {

    @Mock
    Feline feline;

    private String sex;

    public LionParamTestNegative(String sex) {
        this.sex = sex;

    }

    @Parameterized.Parameters
    public static Object[][] data() {
        return new Object[][]{
                {"ksjdNFG"},
                {null},
                {"basdfgjihSBDG"},
                {"Альфа-самец"},
                {"Альфа-самка"},
        };
    }

    @Before
    public void setup() {
        MockitoAnnotations.openMocks(this);
    }

    @Test
    public void shouldReturnTrueDoesHaveManeTextException() {
        IndexOutOfBoundsException indexOutOfBoundsException = Assert.assertThrows(IndexOutOfBoundsException.class, () -> {
            new Lion(sex, feline);
        });
        Assert.assertEquals("Используйте допустимые значения пола животного - самец или самка", indexOutOfBoundsException.getMessage());

    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void shouldReturnExceptionDoesHaveMane() {
        new Lion(sex, feline);
    }
}