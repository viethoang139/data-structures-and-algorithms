package org.example.leetcode;

import java.util.Arrays;

public class AverageSalaryExcludingTheMinimumAndMaximumSalary {
    public double average(int[] salary) {
        double sum = 0d;
        double count = 0;
        Arrays.sort(salary);
        for(int i = 1 ; i < salary.length - 1;i++){
            sum += salary[i];
            count++;
        }
        return sum / count;

    }
}
