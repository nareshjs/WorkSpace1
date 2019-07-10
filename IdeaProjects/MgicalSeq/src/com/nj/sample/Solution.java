package com.nj.sample;

/**
 * Magical Sequence
 * You’re given a sequence of digits. Find the count of all contiguous subsequences that make a magical sequence. A magical sequence passes the following test:
 *
 * From the last digit, and moving left, double the value of every alternate digit. If the result of this operation is two digit number, then add the digits (e.g., 18: 1 + 8 = 9).
 *
 * Sum up all the digits.
 *
 * Resultant sum is divisible by 10.
 *
 * Input Format
 * The first line of input consists of an integer t. This is the number of test cases. The first line of each test case contains the length of the sequence d. This is followed by a sequence containing d digits.
 *
 * Output Format
 * For each case output the count of all magical sequences.
 *
 * Constraints
 * 1 <= t <= 1000
 * 1 <= d <= 1000
 *
 * Sample Input
 * 8
 * 1
 * 0
 * 0000
 * 1234567890
 * 41201953788963824033556555672
 * 3000158
 * 90540677470
 * 188648824429847292479287385561746664
 * Sample Output
 * 0
 * 1
 * 10
 * 7
 * 38
 * 10
 * 7
 * 60
 * Explanation
 * The sequence 1234567890 has 55 contiguous subsequences out of which only the following 7 are magical
 *
 * 2345
 * 234567
 * 34
 * 345678
 * 5678
 * 67
 * 0
 *
 * img
 *
 * img
 *
 *
 * 15
 * 2
 * 26
 * 1
 * 1
 * 1
 * 0
 * 3
 * 100
 * 3
 * 675
 * 4
 * 8342
 * 5
 * 67591
 * 6
 * 426759
 * 7
 * 1182675
 * 8
 * 52844118
 * 10
 * 1234567890
 * 10
 * 0000000000
 * 16
 * 3905202947924550
 * 20
 * 01234567899876543210
 * 20
 * 14215839450944124608
 *
 *
 * 1
 * 0
 * 1
 * 3
 * 2
 * 4
 * 6
 * 9
 * 9
 * 4
 * 7
 * 55
 * 10
 * 26
 * 17
 */
public class Solution {
    public static void main(String[] args)
    {
        for(int i = 0; i < args.length; i++)
        {
            System.out.println(magicCount(args[i]));
        }
    }

    private static int magicCount(String input)
    {
        int retValue = 0;
        int[] digits = new int[input.length()];
        for(int i = input.length() - 1, j = 0;  i >= 0; i--)
        {
            digits[j++] = Integer.parseInt(input.substring(i, i +1));
        }

        for(int subSeqLen = 1; subSeqLen <= input.length(); subSeqLen++)
        {
            for(int start = 0; start + subSeqLen <= input.length(); start++)
            {
                int sum = 0;
                for (int i = start, j = 0; i < start + subSeqLen; i++) {
                    if (j == 0) {
                        sum += digits[i];
                        j++;
                    } else {
                        j = 0;
                        sum += getValueOfDigit(digits[i]);
                    }
                }
                if(sum == 0 || sum % 10 == 0) retValue++;
            }
        }
        return retValue;
    }

    private static int getValueOfDigit(int digit)
    {
        int retValue = 0;
        int doubleDigit = digit * 2;
        if(doubleDigit < 10)
        {
            retValue = doubleDigit;
        }
        else
        {
            retValue = doubleDigit % 10 + doubleDigit / 10;
        }
        return retValue;
    }
}
