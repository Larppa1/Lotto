package src.fi.tuni.tamk.tiko.juvalari.lotto;


import src.fi.tuni.tamk.tiko.juvalari.util.Arrays;
import src.fi.tuni.tamk.tiko.juvalari.util.Math;
import src.fi.tuni.tamk.tiko.juvalari.util.MyConsole;
import src.fi.tuni.tamk.tiko.juvalari.lotto.locale.Languages;

public class Main {
    public static void main(String[] args) {
        int[] lottoNums = new int[7];
        int[] realLottoNums = new int[7];
        String[] lottoNumsWithPrefix = new String[7];
        int lifetimes = 0;

        System.out.println(Languages.welcome() + "\n"  + "\n" + Languages.chooseLanguage());
        Languages.readString(Languages.notString());
        getLottoNums(lottoNums);
        realLottoNums = calculateLotto(lottoNums);
        compareNums(lottoNums, realLottoNums, lottoNumsWithPrefix, lifetimes);
    }

    public static void getLottoNums(int[] lottoNums) {
        int i = 0;
        do {
            System.out.println(Languages.giveUniqueNum());
            int num = MyConsole.readIntAgain(1, 40, Languages.notIntValue(), Languages.notBetweenMinAndMax());
            if(Arrays.contains(num, lottoNums) == false) {
                lottoNums[i] = num;
                num = 0;
                i++;
            }else {
                System.out.println(Languages.notUnique());
            }
        }while(i < 7);
    }

    private static int[] calculateLotto(int[] lottoNums) {
        int[] correctLottoNums = new int[7];
        int[] nums = new int[40];

        for(int i = 0; i < 40; i++) {
            nums[i] = i + 1;
        }
        for(int j = 0; j < 7; j++) {
            int index = Math.getRandomNum(0, nums.length - 1);
            correctLottoNums[j] = nums[index];
            nums = Arrays.removeIndex(nums, index);
        }

        return correctLottoNums;
    }

    public static void compareNums(int[] lottoNums, int[] realLottoNums, String[] lottoNumsWithPrefix, int lifetimes) {
        int weeks = 0;
        int years = 0;

        for(int i = 1; i < 8; i++) {
            do {
                realLottoNums = calculateLotto(lottoNums);
                weeks++;
            }while(Arrays.containsSameValues(lottoNums, realLottoNums) != i);

            realLottoNums = Arrays.sort(realLottoNums);
            lottoNumsWithPrefix = Arrays.addPrefix(realLottoNums);
            years = weeks / 52;
            System.out.println(Languages.got() + i + " " + Languages.right() + years + " " + Languages.years());
        }

        if(years > 120) {
            System.out.println(Languages.although());
            lifetimes++;
            compareNums(lottoNums, realLottoNums, lottoNumsWithPrefix, lifetimes);
        }else {
            System.out.println(Languages.finallyTxt() + " " + lifetimes + " " + Languages.lifetimes());
        }
    }
}
