import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class Task4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        if (!sc.hasNextLine()) return;
        String text = sc.nextLine();
        if (!sc.hasNextLine()) return;
        String pattern = sc.nextLine();
        
        kmpSearch(text, pattern);
    }

    static void kmpSearch(String txt, String pat) {
        int M = pat.length();
        int N = txt.length();
        int[] lps = new int[M];
        computeLPSArray(pat, M, lps);

        int i = 0, j = 0;
        while (i < N) {
            if (pat.charAt(j) == txt.charAt(i)) {
                j++;
                i++;
            }
            if (j == M) {
                System.out.print((i - j) + " ");
                j = lps[j - 1];
            } else if (i < N && pat.charAt(j) != txt.charAt(i)) {
                if (j != 0) j = lps[j - 1];
                else i = i + 1;
            }
        }
    }

    static void computeLPSArray(String pat, int M, int[] lps) {
        int len = 0;
        int i = 1;
        lps[0] = 0;
        while (i < M) {
            if (pat.charAt(i) == pat.charAt(len)) {
                len++;
                lps[i] = len;
                i++;
            } else {
                if (len != 0) len = lps[len - 1];
                else {
                    lps[i] = 0;
                    i++;
                }
            }
        }
    }
}