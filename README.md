# Практична робота "Створення і використання статичних методів"

## Завдання: Перевірити чи задане слово є анаграмою іншого заданого слова (метод Calculate має повернути булевське значення).

### Код класу Exercise
```java
package domain;

import java.util.Arrays;

/**
 * Клас який представляє завдання
 * @author Roman
 */
public class Exercise {
    
    /**
     * Перевіряє чи є одне слово анаграмою іншого
     * @param firstWord перше слово
     * @param secondWord друге слово
     * @return логічне значення
     */
    public static boolean Calculate(String firstWord, String secondWord) {
        char[] word1 = firstWord.toUpperCase().replaceAll("[\\s]", "").toCharArray();
        char[] word2 = secondWord.toUpperCase().replaceAll("[\\s]", "").toCharArray();
        Arrays.sort(word1);
        Arrays.sort(word2);
        return Arrays.equals(word1, word2);
}
    
}
```
### Код класу TestResult
```java
package test;

import domain.Exercise;

public class TestResult {

    public static void main(String[] args) {
        String first = "water";
        String second = "reTaw";
        System.out.printf("Word '%s' is anagram of '%s' - %b", first, second, Exercise.Calculate(first, second));
        
    }
}

```

### Приклади роботи
[![netbeans64-iv-H8-Not-Bw-S.png](https://i.postimg.cc/bJwF8GVF/netbeans64-iv-H8-Not-Bw-S.png)](https://postimg.cc/JySQ5hLb)
[![netbeans64-Q6-Fc-VUX9-MU.png](https://i.postimg.cc/5NBGBMzg/netbeans64-Q6-Fc-VUX9-MU.png)](https://postimg.cc/7fLm4dmJ)
