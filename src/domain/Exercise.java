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