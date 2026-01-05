package p001o;

import java.util.Arrays;
import org.apache.http.message.TokenParser;

/* loaded from: classes6.dex */
public final class wa9 implements up8 {

    /* renamed from: a */
    public char[] f51693a = bh2.f16204c.m18958d();

    /* renamed from: b */
    public int f51694b;

    @Override // p001o.up8
    /* renamed from: a */
    public void mo51907a(char c) {
        m54133f(1);
        char[] cArr = this.f51693a;
        int i = this.f51694b;
        this.f51694b = i + 1;
        cArr[i] = c;
    }

    @Override // p001o.up8
    /* renamed from: b */
    public void mo51908b(String str) {
        sq8.m48649h(str, "text");
        m54133f(str.length() + 2);
        char[] cArr = this.f51693a;
        int i = this.f51694b;
        int i2 = i + 1;
        cArr[i] = TokenParser.DQUOTE;
        int length = str.length();
        str.getChars(0, length, cArr, i2);
        int i3 = length + i2;
        for (int i4 = i2; i4 < i3; i4++) {
            char c = cArr[i4];
            if (c < o8g.m41771a().length && o8g.m41771a()[c] != 0) {
                m54132e(i4 - i2, i4, str);
                return;
            }
        }
        cArr[i3] = TokenParser.DQUOTE;
        this.f51694b = i3 + 1;
    }

    @Override // p001o.up8
    /* renamed from: c */
    public void mo51909c(long j) {
        mo51910d(String.valueOf(j));
    }

    @Override // p001o.up8
    /* renamed from: d */
    public void mo51910d(String str) {
        sq8.m48649h(str, "text");
        int length = str.length();
        if (length == 0) {
            return;
        }
        m54133f(length);
        str.getChars(0, str.length(), this.f51693a, this.f51694b);
        this.f51694b += length;
    }

    /* renamed from: e */
    public final void m54132e(int i, int i2, String str) {
        byte b;
        int length = str.length();
        while (i < length) {
            int iM54134g = m54134g(i2, 2);
            char cCharAt = str.charAt(i);
            if (cCharAt >= o8g.m41771a().length || (b = o8g.m41771a()[cCharAt]) == 0) {
                int i3 = iM54134g + 1;
                this.f51693a[iM54134g] = cCharAt;
                i2 = i3;
                i++;
            } else {
                if (b == 1) {
                    String str2 = o8g.m41772b()[cCharAt];
                    sq8.m48646e(str2);
                    int iM54134g2 = m54134g(iM54134g, str2.length());
                    str2.getChars(0, str2.length(), this.f51693a, iM54134g2);
                    i2 = iM54134g2 + str2.length();
                    this.f51694b = i2;
                } else {
                    char[] cArr = this.f51693a;
                    cArr[iM54134g] = TokenParser.ESCAPE;
                    cArr[iM54134g + 1] = (char) b;
                    i2 = iM54134g + 2;
                    this.f51694b = i2;
                }
                i++;
            }
        }
        int iM54134g3 = m54134g(i2, 1);
        this.f51693a[iM54134g3] = TokenParser.DQUOTE;
        this.f51694b = iM54134g3 + 1;
    }

    /* renamed from: f */
    public final void m54133f(int i) {
        m54134g(this.f51694b, i);
    }

    /* renamed from: g */
    public final int m54134g(int i, int i2) {
        int i3 = i2 + i;
        char[] cArr = this.f51693a;
        if (cArr.length <= i3) {
            char[] cArrCopyOf = Arrays.copyOf(cArr, bce.m18601d(i3, i * 2));
            sq8.m48648g(cArrCopyOf, "copyOf(...)");
            this.f51693a = cArrCopyOf;
        }
        return i;
    }

    /* renamed from: h */
    public void m54135h() {
        bh2.f16204c.m18957c(this.f51693a);
    }

    public String toString() {
        return new String(this.f51693a, 0, this.f51694b);
    }
}
