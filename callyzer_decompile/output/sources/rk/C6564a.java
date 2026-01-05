package rk;

import com.google.gson.stream.MalformedJsonException;
import com.sun.mail.util.AbstractC1452a;
import i0.m0;
import java.io.Closeable;
import java.io.IOException;
import java.io.Reader;
import java.util.Arrays;
import java.util.Objects;
import kk.EnumC4099s;
import mm.AbstractC4801l;
import oj.C5392d;
import org.bouncycastle.iana.AEADAlgorithm;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: rk.a */
/* loaded from: classes.dex */
public class C6564a implements Closeable {

    /* renamed from: a */
    public final Reader f31423a;

    /* renamed from: k */
    public long f31432k;

    /* renamed from: l */
    public int f31433l;

    /* renamed from: m */
    public String f31434m;

    /* renamed from: n */
    public int[] f31435n;

    /* renamed from: q */
    public String[] f31437q;

    /* renamed from: r */
    public int[] f31438r;

    /* renamed from: b */
    public EnumC4099s f31424b = EnumC4099s.LEGACY_STRICT;

    /* renamed from: c */
    public final int f31425c = 255;

    /* renamed from: d */
    public final char[] f31426d = new char[1024];

    /* renamed from: e */
    public int f31427e = 0;

    /* renamed from: f */
    public int f31428f = 0;

    /* renamed from: g */
    public int f31429g = 0;

    /* renamed from: h */
    public int f31430h = 0;

    /* renamed from: j */
    public int f31431j = 0;

    /* renamed from: p */
    public int f31436p = 1;

    static {
        C5392d.f27079c = new C5392d(26);
    }

    public C6564a(Reader reader) {
        int[] iArr = new int[32];
        this.f31435n = iArr;
        iArr[0] = 6;
        this.f31437q = new String[32];
        this.f31438r = new int[32];
        Objects.requireNonNull(reader, "in == null");
        this.f31423a = reader;
    }

    /* renamed from: A */
    public final boolean m12576A(int i10) throws IOException {
        int i11;
        int i12;
        int i13 = this.f31430h;
        int i14 = this.f31427e;
        this.f31430h = i13 - i14;
        int i15 = this.f31428f;
        char[] cArr = this.f31426d;
        if (i15 != i14) {
            int i16 = i15 - i14;
            this.f31428f = i16;
            System.arraycopy(cArr, i14, cArr, 0, i16);
        } else {
            this.f31428f = 0;
        }
        this.f31427e = 0;
        do {
            int i17 = this.f31428f;
            int i18 = this.f31423a.read(cArr, i17, cArr.length - i17);
            if (i18 == -1) {
                return false;
            }
            i11 = this.f31428f + i18;
            this.f31428f = i11;
            if (this.f31429g == 0 && (i12 = this.f31430h) == 0 && i11 > 0 && cArr[0] == 65279) {
                this.f31427e++;
                this.f31430h = i12 + 1;
                i10++;
            }
        } while (i11 < i10);
        return true;
    }

    public void A0() {
        int iM12581u = this.f31431j;
        if (iM12581u == 0) {
            iM12581u = m12581u();
        }
        if (iM12581u != 7) {
            throw N0("null");
        }
        this.f31431j = 0;
        int[] iArr = this.f31438r;
        int i10 = this.f31436p - 1;
        iArr[i10] = iArr[i10] + 1;
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x003e, code lost:
    
        r11.f31427e = r8;
        r8 = r8 - r3;
        r2 = r8 - 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0043, code lost:
    
        if (r1 != null) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0045, code lost:
    
        r1 = new java.lang.StringBuilder(java.lang.Math.max(r8 * 2, 16));
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x006c, code lost:
    
        if (r1 != null) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x006e, code lost:
    
        r1 = new java.lang.StringBuilder(java.lang.Math.max((r2 - r3) * 2, 16));
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x007c, code lost:
    
        r1.append(r7, r3, r2 - r3);
        r11.f31427e = r2;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String B0(char r12) throws com.google.gson.stream.MalformedJsonException {
        /*
            r11 = this;
            r0 = 0
            r1 = r0
        L2:
            int r2 = r11.f31427e
            int r3 = r11.f31428f
        L6:
            r4 = r3
            r3 = r2
        L8:
            r5 = 16
            r6 = 1
            char[] r7 = r11.f31426d
            if (r2 >= r4) goto L6c
            int r8 = r2 + 1
            char r2 = r7[r2]
            kk.s r9 = r11.f31424b
            kk.s r10 = kk.EnumC4099s.STRICT
            if (r9 != r10) goto L24
            r9 = 32
            if (r2 < r9) goto L1e
            goto L24
        L1e:
            java.lang.String r12 = "Unescaped control characters (\\u0000-\\u001F) are not allowed in strict mode"
            r11.M0(r12)
            throw r0
        L24:
            if (r2 != r12) goto L3a
            r11.f31427e = r8
            int r8 = r8 - r3
            int r8 = r8 - r6
            if (r1 != 0) goto L32
            java.lang.String r12 = new java.lang.String
            r12.<init>(r7, r3, r8)
            return r12
        L32:
            r1.append(r7, r3, r8)
            java.lang.String r12 = r1.toString()
            return r12
        L3a:
            r9 = 92
            if (r2 != r9) goto L5f
            r11.f31427e = r8
            int r8 = r8 - r3
            int r2 = r8 + (-1)
            if (r1 != 0) goto L50
            int r8 = r8 * 2
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            int r4 = java.lang.Math.max(r8, r5)
            r1.<init>(r4)
        L50:
            r1.append(r7, r3, r2)
            char r2 = r11.G0()
            r1.append(r2)
            int r2 = r11.f31427e
            int r3 = r11.f31428f
            goto L6
        L5f:
            r5 = 10
            if (r2 != r5) goto L6a
            int r2 = r11.f31429g
            int r2 = r2 + r6
            r11.f31429g = r2
            r11.f31430h = r8
        L6a:
            r2 = r8
            goto L8
        L6c:
            if (r1 != 0) goto L7c
            int r1 = r2 - r3
            int r1 = r1 * 2
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            int r1 = java.lang.Math.max(r1, r5)
            r4.<init>(r1)
            r1 = r4
        L7c:
            int r4 = r2 - r3
            r1.append(r7, r3, r4)
            r11.f31427e = r2
            boolean r2 = r11.m12576A(r6)
            if (r2 == 0) goto L8b
            goto L2
        L8b:
            java.lang.String r12 = "Unterminated string"
            r11.M0(r12)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: rk.C6564a.B0(char):java.lang.String");
    }

    public String C0() throws IOException {
        String str;
        int iM12581u = this.f31431j;
        if (iM12581u == 0) {
            iM12581u = m12581u();
        }
        if (iM12581u == 10) {
            str = D0();
        } else if (iM12581u == 8) {
            str = B0('\'');
        } else if (iM12581u == 9) {
            str = B0('\"');
        } else if (iM12581u == 11) {
            str = this.f31434m;
            this.f31434m = null;
        } else if (iM12581u == 15) {
            str = Long.toString(this.f31432k);
        } else {
            if (iM12581u != 16) {
                throw N0("a string");
            }
            str = new String(this.f31426d, this.f31427e, this.f31433l);
            this.f31427e += this.f31433l;
        }
        this.f31431j = 0;
        int[] iArr = this.f31438r;
        int i10 = this.f31436p - 1;
        iArr[i10] = iArr[i10] + 1;
        return str;
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x004a, code lost:
    
        m12580n();
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:32:0x0044. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:46:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0084  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String D0() throws com.google.gson.stream.MalformedJsonException {
        /*
            r7 = this;
            r0 = 0
            r1 = 0
        L2:
            r2 = r1
        L3:
            int r3 = r7.f31427e
            int r4 = r3 + r2
            int r5 = r7.f31428f
            char[] r6 = r7.f31426d
            if (r4 >= r5) goto L4e
            int r3 = r3 + r2
            char r3 = r6[r3]
            r4 = 9
            if (r3 == r4) goto L5a
            r4 = 10
            if (r3 == r4) goto L5a
            r4 = 12
            if (r3 == r4) goto L5a
            r4 = 13
            if (r3 == r4) goto L5a
            r4 = 32
            if (r3 == r4) goto L5a
            r4 = 35
            if (r3 == r4) goto L4a
            r4 = 44
            if (r3 == r4) goto L5a
            r4 = 47
            if (r3 == r4) goto L4a
            r4 = 61
            if (r3 == r4) goto L4a
            r4 = 123(0x7b, float:1.72E-43)
            if (r3 == r4) goto L5a
            r4 = 125(0x7d, float:1.75E-43)
            if (r3 == r4) goto L5a
            r4 = 58
            if (r3 == r4) goto L5a
            r4 = 59
            if (r3 == r4) goto L4a
            switch(r3) {
                case 91: goto L5a;
                case 92: goto L4a;
                case 93: goto L5a;
                default: goto L47;
            }
        L47:
            int r2 = r2 + 1
            goto L3
        L4a:
            r7.m12580n()
            goto L5a
        L4e:
            int r3 = r6.length
            if (r2 >= r3) goto L5c
            int r3 = r2 + 1
            boolean r3 = r7.m12576A(r3)
            if (r3 == 0) goto L5a
            goto L3
        L5a:
            r1 = r2
            goto L7a
        L5c:
            if (r0 != 0) goto L69
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r3 = 16
            int r3 = java.lang.Math.max(r2, r3)
            r0.<init>(r3)
        L69:
            int r3 = r7.f31427e
            r0.append(r6, r3, r2)
            int r3 = r7.f31427e
            int r3 = r3 + r2
            r7.f31427e = r3
            r2 = 1
            boolean r2 = r7.m12576A(r2)
            if (r2 != 0) goto L2
        L7a:
            if (r0 != 0) goto L84
            java.lang.String r0 = new java.lang.String
            int r2 = r7.f31427e
            r0.<init>(r6, r2, r1)
            goto L8d
        L84:
            int r2 = r7.f31427e
            r0.append(r6, r2, r1)
            java.lang.String r0 = r0.toString()
        L8d:
            int r2 = r7.f31427e
            int r2 = r2 + r1
            r7.f31427e = r2
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: rk.C6564a.D0():java.lang.String");
    }

    public EnumC6565b E0() {
        int iM12581u = this.f31431j;
        if (iM12581u == 0) {
            iM12581u = m12581u();
        }
        switch (iM12581u) {
            case 1:
                return EnumC6565b.BEGIN_OBJECT;
            case 2:
                return EnumC6565b.END_OBJECT;
            case 3:
                return EnumC6565b.BEGIN_ARRAY;
            case 4:
                return EnumC6565b.END_ARRAY;
            case 5:
            case 6:
                return EnumC6565b.BOOLEAN;
            case 7:
                return EnumC6565b.NULL;
            case 8:
            case 9:
            case 10:
            case 11:
                return EnumC6565b.STRING;
            case 12:
            case 13:
            case 14:
                return EnumC6565b.NAME;
            case AEADAlgorithm.AEAD_AES_SIV_CMAC_256 /* 15 */:
            case 16:
                return EnumC6565b.NUMBER;
            case 17:
                return EnumC6565b.END_DOCUMENT;
            default:
                throw new AssertionError();
        }
    }

    public final void F0(int i10) throws MalformedJsonException {
        int i11 = this.f31436p;
        int i12 = i11 - 1;
        int i13 = this.f31425c;
        if (i12 >= i13) {
            StringBuilder sbM4567n = AbstractC1452a.m4567n(i13, "Nesting limit ", " reached");
            sbM4567n.append(m12579U());
            throw new MalformedJsonException(sbM4567n.toString());
        }
        int[] iArr = this.f31435n;
        if (i11 == iArr.length) {
            int i14 = i11 * 2;
            this.f31435n = Arrays.copyOf(iArr, i14);
            this.f31438r = Arrays.copyOf(this.f31438r, i14);
            this.f31437q = (String[]) Arrays.copyOf(this.f31437q, i14);
        }
        int[] iArr2 = this.f31435n;
        int i15 = this.f31436p;
        this.f31436p = i15 + 1;
        iArr2[i15] = i10;
    }

    public final char G0() throws MalformedJsonException {
        int i10;
        if (this.f31427e == this.f31428f && !m12576A(1)) {
            M0("Unterminated escape sequence");
            throw null;
        }
        int i11 = this.f31427e;
        int i12 = i11 + 1;
        this.f31427e = i12;
        char[] cArr = this.f31426d;
        char c2 = cArr[i11];
        if (c2 != '\n') {
            if (c2 != '\"') {
                if (c2 != '\'') {
                    if (c2 != '/' && c2 != '\\') {
                        if (c2 == 'b') {
                            return '\b';
                        }
                        if (c2 == 'f') {
                            return '\f';
                        }
                        if (c2 == 'n') {
                            return '\n';
                        }
                        if (c2 == 'r') {
                            return '\r';
                        }
                        if (c2 == 't') {
                            return '\t';
                        }
                        if (c2 != 'u') {
                            M0("Invalid escape sequence");
                            throw null;
                        }
                        if (i11 + 5 > this.f31428f && !m12576A(4)) {
                            M0("Unterminated escape sequence");
                            throw null;
                        }
                        int i13 = this.f31427e;
                        int i14 = i13 + 4;
                        int i15 = 0;
                        while (i13 < i14) {
                            char c10 = cArr[i13];
                            int i16 = i15 << 4;
                            if (c10 >= '0' && c10 <= '9') {
                                i10 = c10 - '0';
                            } else if (c10 >= 'a' && c10 <= 'f') {
                                i10 = c10 - 'W';
                            } else {
                                if (c10 < 'A' || c10 > 'F') {
                                    M0("Malformed Unicode escape \\u".concat(new String(cArr, this.f31427e, 4)));
                                    throw null;
                                }
                                i10 = c10 - '7';
                            }
                            i15 = i10 + i16;
                            i13++;
                        }
                        this.f31427e += 4;
                        return (char) i15;
                    }
                }
            }
            return c2;
        }
        if (this.f31424b == EnumC4099s.STRICT) {
            M0("Cannot escape a newline character in strict mode");
            throw null;
        }
        this.f31429g++;
        this.f31430h = i12;
        if (this.f31424b == EnumC4099s.STRICT) {
            M0("Invalid escaped character \"'\" in strict mode");
            throw null;
        }
        return c2;
    }

    /* renamed from: H */
    public String mo10021H() {
        return m12577J(false);
    }

    public final void H0(EnumC4099s enumC4099s) {
        Objects.requireNonNull(enumC4099s);
        this.f31424b = enumC4099s;
    }

    public final void I0(char c2) throws MalformedJsonException {
        do {
            int i10 = this.f31427e;
            int i11 = this.f31428f;
            while (i10 < i11) {
                int i12 = i10 + 1;
                char c10 = this.f31426d[i10];
                if (c10 == c2) {
                    this.f31427e = i12;
                    return;
                }
                if (c10 == '\\') {
                    this.f31427e = i12;
                    G0();
                    i10 = this.f31427e;
                    i11 = this.f31428f;
                } else {
                    if (c10 == '\n') {
                        this.f31429g++;
                        this.f31430h = i12;
                    }
                    i10 = i12;
                }
            }
            this.f31427e = i10;
        } while (m12576A(1));
        M0("Unterminated string");
        throw null;
    }

    /* renamed from: J */
    public final String m12577J(boolean z6) {
        StringBuilder sb2 = new StringBuilder("$");
        int i10 = 0;
        while (true) {
            int i11 = this.f31436p;
            if (i10 >= i11) {
                return sb2.toString();
            }
            int i12 = this.f31435n[i10];
            switch (i12) {
                case 1:
                case 2:
                    int i13 = this.f31438r[i10];
                    if (z6 && i13 > 0 && i10 == i11 - 1) {
                        i13--;
                    }
                    sb2.append('[');
                    sb2.append(i13);
                    sb2.append(']');
                    break;
                case 3:
                case 4:
                case 5:
                    sb2.append('.');
                    String str = this.f31437q[i10];
                    if (str == null) {
                        break;
                    } else {
                        sb2.append(str);
                        break;
                    }
                case 6:
                case 7:
                case 8:
                    break;
                default:
                    throw new AssertionError(AbstractC4801l.m9730d(i12, "Unknown scope value: "));
            }
            i10++;
        }
    }

    public final void J0() {
        char c2;
        do {
            if (this.f31427e >= this.f31428f && !m12576A(1)) {
                return;
            }
            int i10 = this.f31427e;
            int i11 = i10 + 1;
            this.f31427e = i11;
            c2 = this.f31426d[i10];
            if (c2 == '\n') {
                this.f31429g++;
                this.f31430h = i11;
                return;
            }
        } while (c2 != '\r');
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x0048, code lost:
    
        m12580n();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void K0() throws com.google.gson.stream.MalformedJsonException {
        /*
            r4 = this;
        L0:
            r0 = 0
        L1:
            int r1 = r4.f31427e
            int r2 = r1 + r0
            int r3 = r4.f31428f
            if (r2 >= r3) goto L51
            char[] r2 = r4.f31426d
            int r1 = r1 + r0
            char r1 = r2[r1]
            r2 = 9
            if (r1 == r2) goto L4b
            r2 = 10
            if (r1 == r2) goto L4b
            r2 = 12
            if (r1 == r2) goto L4b
            r2 = 13
            if (r1 == r2) goto L4b
            r2 = 32
            if (r1 == r2) goto L4b
            r2 = 35
            if (r1 == r2) goto L48
            r2 = 44
            if (r1 == r2) goto L4b
            r2 = 47
            if (r1 == r2) goto L48
            r2 = 61
            if (r1 == r2) goto L48
            r2 = 123(0x7b, float:1.72E-43)
            if (r1 == r2) goto L4b
            r2 = 125(0x7d, float:1.75E-43)
            if (r1 == r2) goto L4b
            r2 = 58
            if (r1 == r2) goto L4b
            r2 = 59
            if (r1 == r2) goto L48
            switch(r1) {
                case 91: goto L4b;
                case 92: goto L48;
                case 93: goto L4b;
                default: goto L45;
            }
        L45:
            int r0 = r0 + 1
            goto L1
        L48:
            r4.m12580n()
        L4b:
            int r1 = r4.f31427e
            int r1 = r1 + r0
            r4.f31427e = r1
            return
        L51:
            int r1 = r1 + r0
            r4.f31427e = r1
            r0 = 1
            boolean r0 = r4.m12576A(r0)
            if (r0 != 0) goto L0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: rk.C6564a.K0():void");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public void L0() throws IOException {
        int i10 = 0;
        do {
            int iM12581u = this.f31431j;
            if (iM12581u == 0) {
                iM12581u = m12581u();
            }
            switch (iM12581u) {
                case 1:
                    F0(3);
                    i10++;
                    this.f31431j = 0;
                    break;
                case 2:
                    if (i10 == 0) {
                        this.f31437q[this.f31436p - 1] = null;
                    }
                    this.f31436p--;
                    i10--;
                    this.f31431j = 0;
                    break;
                case 3:
                    F0(1);
                    i10++;
                    this.f31431j = 0;
                    break;
                case 4:
                    this.f31436p--;
                    i10--;
                    this.f31431j = 0;
                    break;
                case 5:
                case 6:
                case 7:
                case 11:
                case AEADAlgorithm.AEAD_AES_SIV_CMAC_256 /* 15 */:
                default:
                    this.f31431j = 0;
                    break;
                case 8:
                    I0('\'');
                    this.f31431j = 0;
                    break;
                case 9:
                    I0('\"');
                    this.f31431j = 0;
                    break;
                case 10:
                    K0();
                    this.f31431j = 0;
                    break;
                case 12:
                    I0('\'');
                    if (i10 == 0) {
                        this.f31437q[this.f31436p - 1] = "<skipped>";
                    }
                    this.f31431j = 0;
                    break;
                case 13:
                    I0('\"');
                    if (i10 == 0) {
                        this.f31437q[this.f31436p - 1] = "<skipped>";
                    }
                    this.f31431j = 0;
                    break;
                case 14:
                    K0();
                    if (i10 == 0) {
                        this.f31437q[this.f31436p - 1] = "<skipped>";
                    }
                    this.f31431j = 0;
                    break;
                case 16:
                    this.f31427e += this.f31433l;
                    this.f31431j = 0;
                    break;
                case 17:
                    break;
            }
            return;
        } while (i10 > 0);
        int[] iArr = this.f31438r;
        int i11 = this.f31436p - 1;
        iArr[i11] = iArr[i11] + 1;
    }

    public final void M0(String str) throws MalformedJsonException {
        StringBuilder sbM4568o = AbstractC1452a.m4568o(str);
        sbM4568o.append(m12579U());
        sbM4568o.append("\nSee ");
        sbM4568o.append("https://github.com/google/gson/blob/main/Troubleshooting.md#".concat("malformed-json"));
        throw new MalformedJsonException(sbM4568o.toString());
    }

    public final IllegalStateException N0(String str) {
        String str2 = E0() == EnumC6565b.NULL ? "adapter-not-null-safe" : "unexpected-json-structure";
        StringBuilder sbM7383p = m0.m7383p("Expected ", str, " but was ");
        sbM7383p.append(E0());
        sbM7383p.append(m12579U());
        sbM7383p.append("\nSee ");
        sbM7383p.append("https://github.com/google/gson/blob/main/Troubleshooting.md#".concat(str2));
        return new IllegalStateException(sbM7383p.toString());
    }

    /* renamed from: P */
    public String mo10022P() {
        return m12577J(true);
    }

    /* renamed from: R */
    public boolean mo10023R() throws IOException {
        int iM12581u = this.f31431j;
        if (iM12581u == 0) {
            iM12581u = m12581u();
        }
        return (iM12581u == 2 || iM12581u == 4 || iM12581u == 17) ? false : true;
    }

    /* renamed from: S */
    public final boolean m12578S(char c2) throws MalformedJsonException {
        if (c2 == '\t' || c2 == '\n' || c2 == '\f' || c2 == '\r' || c2 == ' ') {
            return false;
        }
        if (c2 != '#') {
            if (c2 == ',') {
                return false;
            }
            if (c2 != '/' && c2 != '=') {
                if (c2 == '{' || c2 == '}' || c2 == ':') {
                    return false;
                }
                if (c2 != ';') {
                    switch (c2) {
                        case '[':
                        case ']':
                            return false;
                        case '\\':
                            break;
                        default:
                            return true;
                    }
                }
            }
        }
        m12580n();
        return false;
    }

    /* renamed from: U */
    final String m12579U() {
        StringBuilder sbM4566m = AbstractC1452a.m4566m(this.f31429g + 1, (this.f31427e - this.f31430h) + 1, " at line ", " column ", " path ");
        sbM4566m.append(mo10021H());
        return sbM4566m.toString();
    }

    public boolean a0() throws IOException {
        int iM12581u = this.f31431j;
        if (iM12581u == 0) {
            iM12581u = m12581u();
        }
        if (iM12581u == 5) {
            this.f31431j = 0;
            int[] iArr = this.f31438r;
            int i10 = this.f31436p - 1;
            iArr[i10] = iArr[i10] + 1;
            return true;
        }
        if (iM12581u != 6) {
            throw N0("a boolean");
        }
        this.f31431j = 0;
        int[] iArr2 = this.f31438r;
        int i11 = this.f31436p - 1;
        iArr2[i11] = iArr2[i11] + 1;
        return false;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.f31431j = 0;
        this.f31435n[0] = 8;
        this.f31436p = 1;
        this.f31423a.close();
    }

    public double f0() throws IOException, NumberFormatException {
        int iM12581u = this.f31431j;
        if (iM12581u == 0) {
            iM12581u = m12581u();
        }
        if (iM12581u == 15) {
            this.f31431j = 0;
            int[] iArr = this.f31438r;
            int i10 = this.f31436p - 1;
            iArr[i10] = iArr[i10] + 1;
            return this.f31432k;
        }
        if (iM12581u == 16) {
            this.f31434m = new String(this.f31426d, this.f31427e, this.f31433l);
            this.f31427e += this.f31433l;
        } else if (iM12581u == 8 || iM12581u == 9) {
            this.f31434m = B0(iM12581u == 8 ? '\'' : '\"');
        } else if (iM12581u == 10) {
            this.f31434m = D0();
        } else if (iM12581u != 11) {
            throw N0("a double");
        }
        this.f31431j = 11;
        double d2 = Double.parseDouble(this.f31434m);
        if (this.f31424b != EnumC4099s.LENIENT && (Double.isNaN(d2) || Double.isInfinite(d2))) {
            M0("JSON forbids NaN and infinities: " + d2);
            throw null;
        }
        this.f31434m = null;
        this.f31431j = 0;
        int[] iArr2 = this.f31438r;
        int i11 = this.f31436p - 1;
        iArr2[i11] = iArr2[i11] + 1;
        return d2;
    }

    /* renamed from: h */
    public void mo10024h() throws IOException {
        int iM12581u = this.f31431j;
        if (iM12581u == 0) {
            iM12581u = m12581u();
        }
        if (iM12581u != 3) {
            throw N0("BEGIN_ARRAY");
        }
        F0(1);
        this.f31438r[this.f31436p - 1] = 0;
        this.f31431j = 0;
    }

    /* renamed from: j */
    public void mo10025j() throws IOException {
        int iM12581u = this.f31431j;
        if (iM12581u == 0) {
            iM12581u = m12581u();
        }
        if (iM12581u != 1) {
            throw N0("BEGIN_OBJECT");
        }
        F0(3);
        this.f31431j = 0;
    }

    /* renamed from: n */
    public final void m12580n() throws MalformedJsonException {
        if (this.f31424b == EnumC4099s.LENIENT) {
            return;
        }
        M0("Use JsonReader.setStrictness(Strictness.LENIENT) to accept malformed JSON");
        throw null;
    }

    public int o0() throws IOException, NumberFormatException {
        int iM12581u = this.f31431j;
        if (iM12581u == 0) {
            iM12581u = m12581u();
        }
        if (iM12581u == 15) {
            long j6 = this.f31432k;
            int i10 = (int) j6;
            if (j6 != i10) {
                throw new NumberFormatException("Expected an int but was " + this.f31432k + m12579U());
            }
            this.f31431j = 0;
            int[] iArr = this.f31438r;
            int i11 = this.f31436p - 1;
            iArr[i11] = iArr[i11] + 1;
            return i10;
        }
        if (iM12581u == 16) {
            this.f31434m = new String(this.f31426d, this.f31427e, this.f31433l);
            this.f31427e += this.f31433l;
        } else {
            if (iM12581u != 8 && iM12581u != 9 && iM12581u != 10) {
                throw N0("an int");
            }
            if (iM12581u == 10) {
                this.f31434m = D0();
            } else {
                this.f31434m = B0(iM12581u == 8 ? '\'' : '\"');
            }
            try {
                int i12 = Integer.parseInt(this.f31434m);
                this.f31431j = 0;
                int[] iArr2 = this.f31438r;
                int i13 = this.f31436p - 1;
                iArr2[i13] = iArr2[i13] + 1;
                return i12;
            } catch (NumberFormatException unused) {
            }
        }
        this.f31431j = 11;
        double d2 = Double.parseDouble(this.f31434m);
        int i14 = (int) d2;
        if (i14 != d2) {
            throw new NumberFormatException("Expected an int but was " + this.f31434m + m12579U());
        }
        this.f31434m = null;
        this.f31431j = 0;
        int[] iArr3 = this.f31438r;
        int i15 = this.f31436p - 1;
        iArr3[i15] = iArr3[i15] + 1;
        return i14;
    }

    public long t0() throws IOException, NumberFormatException {
        int iM12581u = this.f31431j;
        if (iM12581u == 0) {
            iM12581u = m12581u();
        }
        if (iM12581u == 15) {
            this.f31431j = 0;
            int[] iArr = this.f31438r;
            int i10 = this.f31436p - 1;
            iArr[i10] = iArr[i10] + 1;
            return this.f31432k;
        }
        if (iM12581u == 16) {
            this.f31434m = new String(this.f31426d, this.f31427e, this.f31433l);
            this.f31427e += this.f31433l;
        } else {
            if (iM12581u != 8 && iM12581u != 9 && iM12581u != 10) {
                throw N0("a long");
            }
            if (iM12581u == 10) {
                this.f31434m = D0();
            } else {
                this.f31434m = B0(iM12581u == 8 ? '\'' : '\"');
            }
            try {
                long j6 = Long.parseLong(this.f31434m);
                this.f31431j = 0;
                int[] iArr2 = this.f31438r;
                int i11 = this.f31436p - 1;
                iArr2[i11] = iArr2[i11] + 1;
                return j6;
            } catch (NumberFormatException unused) {
            }
        }
        this.f31431j = 11;
        double d2 = Double.parseDouble(this.f31434m);
        long j10 = (long) d2;
        if (j10 != d2) {
            throw new NumberFormatException("Expected a long but was " + this.f31434m + m12579U());
        }
        this.f31434m = null;
        this.f31431j = 0;
        int[] iArr3 = this.f31438r;
        int i12 = this.f31436p - 1;
        iArr3[i12] = iArr3[i12] + 1;
        return j10;
    }

    public String toString() {
        return getClass().getSimpleName() + m12579U();
    }

    /* JADX WARN: Code restructure failed: missing block: B:169:0x021c, code lost:
    
        if (m12578S(r12) != false) goto L125;
     */
    /* JADX WARN: Removed duplicated region for block: B:119:0x018c A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:120:0x018d  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x01be  */
    /* JADX WARN: Removed duplicated region for block: B:204:0x026b  */
    /* JADX WARN: Removed duplicated region for block: B:208:0x0274 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:209:0x0275  */
    /* JADX WARN: Removed duplicated region for block: B:232:0x02b7  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00ec  */
    /* renamed from: u */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int m12581u() throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 796
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: rk.C6564a.m12581u():int");
    }

    public String v0() throws IOException {
        String strB0;
        int iM12581u = this.f31431j;
        if (iM12581u == 0) {
            iM12581u = m12581u();
        }
        if (iM12581u == 14) {
            strB0 = D0();
        } else if (iM12581u == 12) {
            strB0 = B0('\'');
        } else {
            if (iM12581u != 13) {
                throw N0("a name");
            }
            strB0 = B0('\"');
        }
        this.f31431j = 0;
        this.f31437q[this.f31436p - 1] = strB0;
        return strB0;
    }

    /* renamed from: w */
    public void mo10026w() throws IOException {
        int iM12581u = this.f31431j;
        if (iM12581u == 0) {
            iM12581u = m12581u();
        }
        if (iM12581u != 4) {
            throw N0("END_ARRAY");
        }
        int i10 = this.f31436p;
        this.f31436p = i10 - 1;
        int[] iArr = this.f31438r;
        int i11 = i10 - 2;
        iArr[i11] = iArr[i11] + 1;
        this.f31431j = 0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x0074, code lost:
    
        return r5;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int w0(boolean r10) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 226
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: rk.C6564a.w0(boolean):int");
    }

    /* renamed from: z */
    public void mo10027z() throws IOException {
        int iM12581u = this.f31431j;
        if (iM12581u == 0) {
            iM12581u = m12581u();
        }
        if (iM12581u != 2) {
            throw N0("END_OBJECT");
        }
        int i10 = this.f31436p;
        int i11 = i10 - 1;
        this.f31436p = i11;
        this.f31437q[i11] = null;
        int[] iArr = this.f31438r;
        int i12 = i10 - 2;
        iArr[i12] = iArr[i12] + 1;
        this.f31431j = 0;
    }
}
