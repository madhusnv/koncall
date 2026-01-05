package p001o;

import com.google.firebase.perf.util.Constants;

/* loaded from: classes6.dex */
public class v48 {

    /* renamed from: n */
    public static byte[] f49848n = new byte[0];

    /* renamed from: c */
    public String f49851c;

    /* renamed from: d */
    public int f49852d;

    /* renamed from: e */
    public int f49853e;

    /* renamed from: f */
    public int f49854f;

    /* renamed from: g */
    public int f49855g;

    /* renamed from: h */
    public int f49856h;

    /* renamed from: i */
    public int f49857i;

    /* renamed from: j */
    public int f49858j;

    /* renamed from: k */
    public int f49859k;

    /* renamed from: l */
    public int f49860l;

    /* renamed from: a */
    public boolean f49849a = false;

    /* renamed from: b */
    public byte[] f49850b = f49848n;

    /* renamed from: m */
    public oqi f49861m = new oqi(64);

    public v48() {
    }

    /* renamed from: a */
    public void m52310a() {
        this.f49860l = 0;
        this.f49859k = 0;
        this.f49858j = 0;
        this.f49857i = 0;
        this.f49856h = 0;
        this.f49855g = 0;
        this.f49854f = 0;
        this.f49853e = 0;
        this.f49852d = 0;
        this.f49850b = f49848n;
        this.f49851c = "";
    }

    /* renamed from: b */
    public void mo20364b(cob cobVar) {
        if (this.f49858j == this.f49859k) {
            return;
        }
        this.f49861m.m42551e();
        o8i.m41783y(this.f49850b, this.f49858j + 1, (this.f49859k - r1) - 1, cobVar, this.f49861m);
    }

    /* renamed from: c */
    public void mo20365c(cob cobVar, String str) {
        if (this.f49858j == this.f49859k) {
            return;
        }
        if (str != null && !s8g.m47996c(str)) {
            o8i.m41779k(m52313m(this.f49858j + 1, (this.f49859k - r0) - 1), cobVar, str);
        } else {
            o8i.m41782u(this.f49850b, this.f49858j + 1, (this.f49859k - r0) - 1, cobVar);
        }
    }

    /* renamed from: d */
    public String mo20366d() {
        int i;
        int i2 = this.f49856h;
        int i3 = this.f49857i;
        byte[] bArr = null;
        if (i2 == i3) {
            return null;
        }
        int i4 = i3 - i2;
        int i5 = 0;
        while (true) {
            int i6 = this.f49857i;
            if (i2 >= i6) {
                break;
            }
            byte[] bArr2 = this.f49850b;
            byte bM22142d = bArr2[i2];
            if (bM22142d != 37 || (i = i2 + 2) >= i6) {
                if (bArr == null) {
                    i5++;
                }
                i2++;
            } else {
                bM22142d = (byte) (czh.m22142d(bArr2, i2 + 1, 2, 16) & Constants.MAX_HOST_LENGTH);
                i2 = i;
            }
            if (bArr == null) {
                bArr = new byte[i4];
                for (int i7 = 0; i7 < i5; i7++) {
                    bArr[i7] = this.f49850b[this.f49856h + i7];
                }
            }
            bArr[i5] = bM22142d;
            i5++;
            i2++;
        }
        if (bArr == null) {
            return m52313m(this.f49856h, i4);
        }
        this.f49861m.m42551e();
        this.f49861m.m42548b(bArr, 0, i5);
        return this.f49861m.toString();
    }

    /* renamed from: e */
    public String mo20367e() {
        int i = this.f49859k;
        if (i == this.f49860l) {
            return null;
        }
        return m52313m(i + 1, (r1 - i) - 1);
    }

    /* renamed from: f */
    public String mo20368f() {
        int i = this.f49854f;
        int i2 = this.f49855g;
        if (i == i2) {
            return null;
        }
        return m52313m(i, i2 - i);
    }

    /* renamed from: g */
    public String mo20369g() {
        int i = this.f49856h;
        int i2 = this.f49858j;
        if (i == i2) {
            return null;
        }
        return m52313m(i, i2 - i);
    }

    /* renamed from: h */
    public int mo20370h() {
        int i = this.f49855g;
        if (i == this.f49856h) {
            return -1;
        }
        return czh.m22142d(this.f49850b, i + 1, (r1 - i) - 1, 10);
    }

    /* renamed from: i */
    public String mo20371i() {
        int i = this.f49858j;
        if (i == this.f49859k) {
            return null;
        }
        return m52313m(i + 1, (r1 - i) - 1);
    }

    /* renamed from: j */
    public boolean mo20372j() {
        return this.f49859k > this.f49858j;
    }

    /* renamed from: k */
    public void m52311k(byte[] bArr, int i, int i2) {
        this.f49851c = null;
        m52312l(bArr, i, i2);
    }

    /* renamed from: l */
    public final void m52312l(byte[] bArr, int i, int i2) {
        this.f49850b = bArr;
        int i3 = i + i2;
        this.f49860l = i3;
        this.f49852d = i;
        this.f49853e = i;
        this.f49854f = i;
        this.f49855g = i;
        this.f49856h = i;
        this.f49857i = i3;
        this.f49858j = i3;
        this.f49859k = i3;
        char c = 0;
        int i4 = i;
        int i5 = i4;
        while (i4 < i3) {
            byte[] bArr2 = this.f49850b;
            char c2 = (char) (bArr2[i4] & 255);
            int i6 = i4 + 1;
            switch (c) {
                case 0:
                    if (c2 == '#') {
                        this.f49857i = i4;
                        this.f49858j = i4;
                        this.f49859k = i4;
                    } else if (c2 == '*') {
                        this.f49856h = i4;
                        c = '\n';
                    } else if (c2 == '/') {
                        i5 = i4;
                        i4 = i6;
                        c = 1;
                    } else if (c2 == ';') {
                        this.f49857i = i4;
                        i5 = i4;
                        i4 = i6;
                        c = '\b';
                    } else if (c2 == '?') {
                        this.f49857i = i4;
                        this.f49858j = i4;
                        i5 = i4;
                        i4 = i6;
                        c = '\t';
                    } else {
                        if (!Character.isLetterOrDigit(c2)) {
                            throw new IllegalArgumentException(s8g.m47998e(this.f49850b, i, i2, b1i.f15461a));
                        }
                        c = 2;
                    }
                    i5 = i4;
                    i4 = i6;
                case 1:
                    if ((this.f49849a || this.f49852d != this.f49853e) && c2 == '/') {
                        this.f49854f = i6;
                        int i7 = this.f49860l;
                        this.f49855g = i7;
                        this.f49856h = i7;
                        i4 = i6;
                        c = 4;
                    } else if (c2 == ';' || c2 == '?' || c2 == '#') {
                        i4 = i6 - 1;
                        c = 7;
                    } else {
                        this.f49854f = i5;
                        this.f49855g = i5;
                        i4 = i6;
                        c = 7;
                    }
                    break;
                case 2:
                    if (i2 > 6 && c2 == 't') {
                        int i8 = i + 3;
                        if (bArr2[i8] == 58) {
                            i6 = i + 4;
                        } else {
                            i8 = i + 4;
                            if (bArr2[i8] == 58) {
                                i6 = i + 5;
                            } else {
                                i8 = i + 5;
                                if (bArr2[i8] == 58) {
                                    i6 = i + 6;
                                }
                            }
                        }
                        i4 = i8;
                        c2 = ':';
                    }
                    if (c2 == '#') {
                        this.f49857i = i4;
                        this.f49858j = i4;
                        this.f49859k = i4;
                    } else if (c2 == '/') {
                        i4 = i6;
                        c = 7;
                    } else if (c2 == '?') {
                        this.f49857i = i4;
                        this.f49858j = i4;
                        i4 = i6;
                        c = '\t';
                    } else if (c2 == ':') {
                        int i9 = i6 + 1;
                        this.f49853e = i6;
                        this.f49856h = i6;
                        if (((char) (bArr2[i9] & 255)) == '/') {
                            i4 = i9;
                            i5 = i6;
                            c = 1;
                        } else {
                            this.f49854f = i6;
                            this.f49855g = i6;
                            i4 = i9;
                            i5 = i6;
                            c = 7;
                        }
                    } else if (c2 == ';') {
                        this.f49857i = i4;
                        i4 = i6;
                        c = '\b';
                    }
                    i4 = i6;
                    break;
                case 3:
                default:
                    i4 = i6;
                case 4:
                    if (c2 == '/') {
                        this.f49856h = i4;
                        this.f49855g = i4;
                        i5 = i4;
                        c = 7;
                    } else if (c2 == ':') {
                        this.f49855g = i4;
                        c = 6;
                    } else if (c2 == '@') {
                        this.f49854f = i6;
                    } else if (c2 == '[') {
                        c = 5;
                    }
                    i4 = i6;
                case 5:
                    if (c2 == '/') {
                        StringBuffer stringBuffer = new StringBuffer();
                        stringBuffer.append("No closing ']' for ");
                        stringBuffer.append(s8g.m47998e(this.f49850b, i, i2, b1i.f15461a));
                        throw new IllegalArgumentException(stringBuffer.toString());
                    }
                    if (c2 == ']') {
                        c = 4;
                    }
                    i4 = i6;
                case 6:
                    if (c2 == '/') {
                        this.f49856h = i4;
                        if (this.f49855g <= this.f49853e) {
                            this.f49855g = i4;
                        }
                        i5 = i4;
                        i4 = i6;
                        c = 7;
                    } else {
                        i4 = i6;
                    }
                case 7:
                    if (c2 == '#') {
                        this.f49857i = i4;
                        this.f49858j = i4;
                        this.f49859k = i4;
                    } else if (c2 == ';') {
                        this.f49857i = i4;
                        c = '\b';
                    } else if (c2 == '?') {
                        this.f49857i = i4;
                        this.f49858j = i4;
                        c = '\t';
                    }
                    i4 = i6;
                case '\b':
                    if (c2 == '#') {
                        this.f49858j = i4;
                        this.f49859k = i4;
                    } else if (c2 == '?') {
                        this.f49858j = i4;
                        c = '\t';
                    }
                    i4 = i6;
                case '\t':
                    if (c2 == '#') {
                        this.f49859k = i4;
                    }
                    i4 = i6;
                case '\n':
                    throw new IllegalArgumentException("only '*'");
            }
        }
    }

    /* renamed from: m */
    public final String m52313m(int i, int i2) {
        this.f49861m.m42551e();
        this.f49861m.m42548b(this.f49850b, i, i2);
        return this.f49861m.toString();
    }

    public String toString() {
        if (this.f49851c == null) {
            int i = this.f49852d;
            this.f49851c = m52313m(i, this.f49860l - i);
        }
        return this.f49851c;
    }

    public v48(String str) {
        this.f49851c = str;
        byte[] bytes = str.getBytes();
        m52311k(bytes, 0, bytes.length);
    }
}
