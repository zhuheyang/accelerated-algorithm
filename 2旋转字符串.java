import java.util.*;

public class Rotation {
    public boolean chkRotation(String a, int lena, String b, int lenb) {
        // 比普通答案多了验证他们为空的情形
        if(a == null || b == null || lena != lenb) {
            return false;
        }
        String b2 = b + b;
        return getIndexOf(b2, a) != -1;
    }

    // KMP Algorithm
    public int getIndexOf(String s, String m) {
        if (s.length() < m.length()) {
            return -1;
        }
        char [] ss = s.toCharArray();
        char [] ms = m.toCharArray();
        int si = 0;
        int mi = 0;
        int[] next = getNextArray(ms);
        while (si < ss.length && mi < ms.length) {
            if(ss[si] == ms[mi]) {
                si++;
                mi++;
            } else if (next[mi] == -1) {
                si++;
            } else {
                mi = next[mi];
            }
        }
        return mi == ms.length ? si - mi : -1;
    }

    public int[] getNextArray(char[] ms) {
        if(ms.length == 1) {
            return new int[] { -1 };
        }
        int[] next = new int[ms.length];
        next[0] = -1;
        next[1] = 0;
        int pos = 2;
        int cn = 0;
        while (pos < next.length) {
            if (ms[pos - 1] == ms[cn]) {
                next[pos++] = ++cn;
            } else if (cn > 0) {
                cn = next[cn];
            } else {
                next[pos++] = 0;
            }
        }
        return next;
    }
}


class Rotation1 {
public:
    bool chkRotation(string A, int lena, string B, int lenb) {
        // write code here
        A = A.append(A);
        int i = 0, j = 0;
        while( i < A.length() - B.length() + 1) {
            if(A[i+j] == B[j]) {
                j++;
                if (j == B.length() - 1)
                    return true;
            } else{
                i++;
                j = 0;
            }
        }
        return false;
    }
};

class Rotation2 {
    public:
    bool chkRotation(string A, int lena, string B, int lenb) {
        // write code here
        if(lena != lenb) {
            return false;
        }
        string C = A.append(A);
        if(C.find(B) != string::npos) {
            return ture;
        } else {
            return false;
        }
    }
}