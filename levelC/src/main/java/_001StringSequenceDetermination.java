import sun.jvm.hotspot.ui.SysPropsPanel;

import java.util.Scanner;

/**
 *
 *

 相关链接：https://wiki.amoscloud.com/zh/ProgramingPractice/NowCoder/Adecco/Topic0090
 https://blog.csdn.net/banxia_frontend/article/details/134300229


 题目描述

 【字符串序列判定】

 输入两个字符串S和L，都只包含英文小写字母。S长度<=100，L长度<=500,000。

 判定S是否是L的有效子串。

 判定规则：

 S中的每个字符在L中都能找到（可以不连续），且S在Ｌ中字符的前后顺序与S中顺序要保持一致。

 （例如，S=”ace”是L=”abcde”的一个子序列且有效字符是a、c、e，而”aec”不是有效子序列，且有效字符只有a、e）

 输入描述:

 输入两个字符串S和L，都只包含英文小写字母。S长度<=100，L长度<=500,000。
 先输入S，再输入L，每个字符串占一行。

 输出描述:

 S串最后一个有效字符在L中的位置。（首位从0开始计算，无有效字符返回-1）

 */


public class _001StringSequenceDetermination {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String l = sc.nextLine();
        int location = solution(s, l);
        System.out.println(location);
    }

    public static int solution(String s, String l){
        if(s.length() == 0 || l.length() == 0){
            return -1;
        }
        int sLen = s.length();
        int lLen = s.length();

        int p1 = 0, p2 = 0;
        int lastPos = -1;
        while (p1 < sLen && p2 < lLen){
            if(s.charAt(p1) == l.charAt(p2)){
                p1++;
                if(p1 == sLen){
                    lastPos = p2;
                }
            }
            p2++;
        }
        return lastPos;
    }

}
