package demo.planit.utility;

import org.apache.commons.lang3.RandomStringUtils;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class RandomGenerator {

    String result = "";

    public String RandomGenerator(int count, Boolean includeLetters, Boolean includeNumbers) {
        return result = RandomStringUtils.random(count, includeLetters, includeNumbers);
    }

    public String RandomGenerator(int count) {
        return result = RandomStringUtils.randomAlphabetic(count).toLowerCase();
    }

    public String RandomGeneratorPassword(int count) {
        return result = RandomStringUtils.randomAscii(count);
    }

    public int RandomNumberGeneratorBetweenLimits(int min, int max) {
        int randomNum = ThreadLocalRandom.current().nextInt(min, max + 1);
        return  randomNum;

    }



}