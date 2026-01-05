package p001o;

import com.google.firebase.perf.util.Constants;
import java.io.IOException;
import java.math.RoundingMode;
import java.util.Arrays;
import java.util.Objects;

/* loaded from: classes3.dex */
public abstract class yb1 {

    /* renamed from: a */
    public static final yb1 f55165a = new C18367c("base64()", "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/", '=');

    /* renamed from: b */
    public static final yb1 f55166b = new C18367c("base64Url()", "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789-_", '=');

    /* renamed from: c */
    public static final yb1 f55167c = new C18369e("base32()", "ABCDEFGHIJKLMNOPQRSTUVWXYZ234567", '=');

    /* renamed from: d */
    public static final yb1 f55168d = new C18369e("base32Hex()", "0123456789ABCDEFGHIJKLMNOPQRSTUV", '=');

    /* renamed from: e */
    public static final yb1 f55169e = new C18366b("base16()", "0123456789ABCDEF");

    /* renamed from: o.yb1$a */
    public static final class C18365a {

        /* renamed from: a */
        public final String f55170a;

        /* renamed from: b */
        public final char[] f55171b;

        /* renamed from: c */
        public final int f55172c;

        /* renamed from: d */
        public final int f55173d;

        /* renamed from: e */
        public final int f55174e;

        /* renamed from: f */
        public final int f55175f;

        /* renamed from: g */
        public final byte[] f55176g;

        /* renamed from: h */
        public final boolean[] f55177h;

        /* renamed from: i */
        public final boolean f55178i;

        public C18365a(String str, char[] cArr) {
            this(str, cArr, m57450b(cArr), false);
        }

        /* renamed from: b */
        public static byte[] m57450b(char[] cArr) {
            byte[] bArr = new byte[128];
            Arrays.fill(bArr, (byte) -1);
            for (int i = 0; i < cArr.length; i++) {
                char c = cArr[i];
                boolean z = true;
                dgd.m23053f(c < 128, "Non-ASCII character: %s", c);
                if (bArr[c] != -1) {
                    z = false;
                }
                dgd.m23053f(z, "Duplicate character: %s", c);
                bArr[c] = (byte) i;
            }
            return bArr;
        }

        /* renamed from: c */
        public int m57451c(char c) throws C18368d {
            if (c > 127) {
                throw new C18368d("Unrecognized character: 0x" + Integer.toHexString(c));
            }
            byte b = this.f55176g[c];
            if (b != -1) {
                return b;
            }
            if (c <= ' ' || c == 127) {
                throw new C18368d("Unrecognized character: 0x" + Integer.toHexString(c));
            }
            throw new C18368d("Unrecognized character: " + c);
        }

        /* renamed from: d */
        public char m57452d(int i) {
            return this.f55171b[i];
        }

        /* renamed from: e */
        public boolean m57453e(int i) {
            return this.f55177h[i % this.f55174e];
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof C18365a)) {
                return false;
            }
            C18365a c18365a = (C18365a) obj;
            return this.f55178i == c18365a.f55178i && Arrays.equals(this.f55171b, c18365a.f55171b);
        }

        /* renamed from: f */
        public boolean m57454f(char c) {
            byte[] bArr = this.f55176g;
            return c < bArr.length && bArr[c] != -1;
        }

        public int hashCode() {
            return Arrays.hashCode(this.f55171b) + (this.f55178i ? 1231 : 1237);
        }

        public String toString() {
            return this.f55170a;
        }

        public C18365a(String str, char[] cArr, byte[] bArr, boolean z) {
            this.f55170a = (String) dgd.m23062o(str);
            this.f55171b = (char[]) dgd.m23062o(cArr);
            try {
                int iM27021e = fl8.m27021e(cArr.length, RoundingMode.UNNECESSARY);
                this.f55173d = iM27021e;
                int iNumberOfTrailingZeros = Integer.numberOfTrailingZeros(iM27021e);
                int i = 1 << (3 - iNumberOfTrailingZeros);
                this.f55174e = i;
                this.f55175f = iM27021e >> iNumberOfTrailingZeros;
                this.f55172c = cArr.length - 1;
                this.f55176g = bArr;
                boolean[] zArr = new boolean[i];
                for (int i2 = 0; i2 < this.f55175f; i2++) {
                    zArr[fl8.m27018b(i2 * 8, this.f55173d, RoundingMode.CEILING)] = true;
                }
                this.f55177h = zArr;
                this.f55178i = z;
            } catch (ArithmeticException e) {
                throw new IllegalArgumentException("Illegal alphabet length " + cArr.length, e);
            }
        }
    }

    /* renamed from: o.yb1$b */
    public static final class C18366b extends C18369e {

        /* renamed from: h */
        public final char[] f55179h;

        public C18366b(String str, String str2) {
            this(new C18365a(str, str2.toCharArray()));
        }

        @Override // p001o.yb1.C18369e, p001o.yb1
        /* renamed from: e */
        public int mo57441e(byte[] bArr, CharSequence charSequence) throws C18368d {
            dgd.m23062o(bArr);
            if (charSequence.length() % 2 == 1) {
                throw new C18368d("Invalid input length " + charSequence.length());
            }
            int i = 0;
            int i2 = 0;
            while (i < charSequence.length()) {
                bArr[i2] = (byte) ((this.f55180f.m57451c(charSequence.charAt(i)) << 4) | this.f55180f.m57451c(charSequence.charAt(i + 1)));
                i += 2;
                i2++;
            }
            return i2;
        }

        @Override // p001o.yb1.C18369e, p001o.yb1
        /* renamed from: h */
        public void mo57444h(Appendable appendable, byte[] bArr, int i, int i2) throws IOException {
            dgd.m23062o(appendable);
            dgd.m23067t(i, i + i2, bArr.length);
            for (int i3 = 0; i3 < i2; i3++) {
                int i4 = bArr[i + i3] & 255;
                appendable.append(this.f55179h[i4]);
                appendable.append(this.f55179h[i4 | 256]);
            }
        }

        @Override // p001o.yb1.C18369e
        /* renamed from: o */
        public yb1 mo57455o(C18365a c18365a, Character ch) {
            return new C18366b(c18365a);
        }

        public C18366b(C18365a c18365a) {
            super(c18365a, null);
            this.f55179h = new char[512];
            dgd.m23051d(c18365a.f55171b.length == 16);
            for (int i = 0; i < 256; i++) {
                this.f55179h[i] = c18365a.m57452d(i >>> 4);
                this.f55179h[i | 256] = c18365a.m57452d(i & 15);
            }
        }
    }

    /* renamed from: o.yb1$c */
    public static final class C18367c extends C18369e {
        public C18367c(String str, String str2, Character ch) {
            this(new C18365a(str, str2.toCharArray()), ch);
        }

        @Override // p001o.yb1.C18369e, p001o.yb1
        /* renamed from: e */
        public int mo57441e(byte[] bArr, CharSequence charSequence) throws C18368d {
            dgd.m23062o(bArr);
            CharSequence charSequenceMo57448m = mo57448m(charSequence);
            if (!this.f55180f.m57453e(charSequenceMo57448m.length())) {
                throw new C18368d("Invalid input length " + charSequenceMo57448m.length());
            }
            int i = 0;
            int i2 = 0;
            while (i < charSequenceMo57448m.length()) {
                int i3 = i + 1;
                int i4 = i3 + 1;
                int iM57451c = (this.f55180f.m57451c(charSequenceMo57448m.charAt(i)) << 18) | (this.f55180f.m57451c(charSequenceMo57448m.charAt(i3)) << 12);
                int i5 = i2 + 1;
                bArr[i2] = (byte) (iM57451c >>> 16);
                if (i4 < charSequenceMo57448m.length()) {
                    int i6 = i4 + 1;
                    int iM57451c2 = iM57451c | (this.f55180f.m57451c(charSequenceMo57448m.charAt(i4)) << 6);
                    i2 = i5 + 1;
                    bArr[i5] = (byte) ((iM57451c2 >>> 8) & Constants.MAX_HOST_LENGTH);
                    if (i6 < charSequenceMo57448m.length()) {
                        i4 = i6 + 1;
                        i5 = i2 + 1;
                        bArr[i2] = (byte) ((iM57451c2 | this.f55180f.m57451c(charSequenceMo57448m.charAt(i6))) & Constants.MAX_HOST_LENGTH);
                    } else {
                        i = i6;
                    }
                }
                i2 = i5;
                i = i4;
            }
            return i2;
        }

        @Override // p001o.yb1.C18369e, p001o.yb1
        /* renamed from: h */
        public void mo57444h(Appendable appendable, byte[] bArr, int i, int i2) throws IOException {
            dgd.m23062o(appendable);
            int i3 = i + i2;
            dgd.m23067t(i, i3, bArr.length);
            while (i2 >= 3) {
                int i4 = i + 1;
                int i5 = i4 + 1;
                int i6 = ((bArr[i] & 255) << 16) | ((bArr[i4] & 255) << 8) | (bArr[i5] & 255);
                appendable.append(this.f55180f.m57452d(i6 >>> 18));
                appendable.append(this.f55180f.m57452d((i6 >>> 12) & 63));
                appendable.append(this.f55180f.m57452d((i6 >>> 6) & 63));
                appendable.append(this.f55180f.m57452d(i6 & 63));
                i2 -= 3;
                i = i5 + 1;
            }
            if (i < i3) {
                m57456n(appendable, bArr, i, i3 - i);
            }
        }

        @Override // p001o.yb1.C18369e
        /* renamed from: o */
        public yb1 mo57455o(C18365a c18365a, Character ch) {
            return new C18367c(c18365a, ch);
        }

        public C18367c(C18365a c18365a, Character ch) {
            super(c18365a, ch);
            dgd.m23051d(c18365a.f55171b.length == 64);
        }
    }

    /* renamed from: o.yb1$d */
    public static final class C18368d extends IOException {
        public C18368d(String str) {
            super(str);
        }
    }

    /* renamed from: o.yb1$e */
    public static class C18369e extends yb1 {

        /* renamed from: f */
        public final C18365a f55180f;

        /* renamed from: g */
        public final Character f55181g;

        public C18369e(String str, String str2, Character ch) {
            this(new C18365a(str, str2.toCharArray()), ch);
        }

        @Override // p001o.yb1
        /* renamed from: e */
        public int mo57441e(byte[] bArr, CharSequence charSequence) throws C18368d {
            C18365a c18365a;
            dgd.m23062o(bArr);
            CharSequence charSequenceMo57448m = mo57448m(charSequence);
            if (!this.f55180f.m57453e(charSequenceMo57448m.length())) {
                throw new C18368d("Invalid input length " + charSequenceMo57448m.length());
            }
            int i = 0;
            int i2 = 0;
            while (i < charSequenceMo57448m.length()) {
                long jM57451c = 0;
                int i3 = 0;
                int i4 = 0;
                while (true) {
                    c18365a = this.f55180f;
                    if (i3 >= c18365a.f55174e) {
                        break;
                    }
                    jM57451c <<= c18365a.f55173d;
                    if (i + i3 < charSequenceMo57448m.length()) {
                        jM57451c |= this.f55180f.m57451c(charSequenceMo57448m.charAt(i4 + i));
                        i4++;
                    }
                    i3++;
                }
                int i5 = c18365a.f55175f;
                int i6 = (i5 * 8) - (i4 * c18365a.f55173d);
                int i7 = (i5 - 1) * 8;
                while (i7 >= i6) {
                    bArr[i2] = (byte) ((jM57451c >>> i7) & 255);
                    i7 -= 8;
                    i2++;
                }
                i += this.f55180f.f55174e;
            }
            return i2;
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof C18369e)) {
                return false;
            }
            C18369e c18369e = (C18369e) obj;
            return this.f55180f.equals(c18369e.f55180f) && Objects.equals(this.f55181g, c18369e.f55181g);
        }

        @Override // p001o.yb1
        /* renamed from: h */
        public void mo57444h(Appendable appendable, byte[] bArr, int i, int i2) throws IOException {
            dgd.m23062o(appendable);
            dgd.m23067t(i, i + i2, bArr.length);
            int i3 = 0;
            while (i3 < i2) {
                m57456n(appendable, bArr, i + i3, Math.min(this.f55180f.f55175f, i2 - i3));
                i3 += this.f55180f.f55175f;
            }
        }

        public int hashCode() {
            return this.f55180f.hashCode() ^ Objects.hashCode(this.f55181g);
        }

        @Override // p001o.yb1
        /* renamed from: j */
        public int mo57445j(int i) {
            return (int) (((this.f55180f.f55173d * i) + 7) / 8);
        }

        @Override // p001o.yb1
        /* renamed from: k */
        public int mo57446k(int i) {
            C18365a c18365a = this.f55180f;
            return c18365a.f55174e * fl8.m27018b(i, c18365a.f55175f, RoundingMode.CEILING);
        }

        @Override // p001o.yb1
        /* renamed from: l */
        public yb1 mo57447l() {
            return this.f55181g == null ? this : mo57455o(this.f55180f, null);
        }

        @Override // p001o.yb1
        /* renamed from: m */
        public CharSequence mo57448m(CharSequence charSequence) {
            dgd.m23062o(charSequence);
            Character ch = this.f55181g;
            if (ch == null) {
                return charSequence;
            }
            char cCharValue = ch.charValue();
            int length = charSequence.length() - 1;
            while (length >= 0 && charSequence.charAt(length) == cCharValue) {
                length--;
            }
            return charSequence.subSequence(0, length + 1);
        }

        /* renamed from: n */
        public void m57456n(Appendable appendable, byte[] bArr, int i, int i2) throws IOException {
            dgd.m23062o(appendable);
            dgd.m23067t(i, i + i2, bArr.length);
            int i3 = 0;
            dgd.m23051d(i2 <= this.f55180f.f55175f);
            long j = 0;
            for (int i4 = 0; i4 < i2; i4++) {
                j = (j | (bArr[i + i4] & 255)) << 8;
            }
            int i5 = ((i2 + 1) * 8) - this.f55180f.f55173d;
            while (i3 < i2 * 8) {
                C18365a c18365a = this.f55180f;
                appendable.append(c18365a.m57452d(((int) (j >>> (i5 - i3))) & c18365a.f55172c));
                i3 += this.f55180f.f55173d;
            }
            if (this.f55181g != null) {
                while (i3 < this.f55180f.f55175f * 8) {
                    appendable.append(this.f55181g.charValue());
                    i3 += this.f55180f.f55173d;
                }
            }
        }

        /* renamed from: o */
        public yb1 mo57455o(C18365a c18365a, Character ch) {
            return new C18369e(c18365a, ch);
        }

        public String toString() {
            StringBuilder sb = new StringBuilder("BaseEncoding.");
            sb.append(this.f55180f);
            if (8 % this.f55180f.f55173d != 0) {
                if (this.f55181g == null) {
                    sb.append(".omitPadding()");
                } else {
                    sb.append(".withPadChar('");
                    sb.append(this.f55181g);
                    sb.append("')");
                }
            }
            return sb.toString();
        }

        public C18369e(C18365a c18365a, Character ch) {
            this.f55180f = (C18365a) dgd.m23062o(c18365a);
            dgd.m23058k(ch == null || !c18365a.m57454f(ch.charValue()), "Padding character %s was already in alphabet", ch);
            this.f55181g = ch;
        }
    }

    /* renamed from: a */
    public static yb1 m57436a() {
        return f55165a;
    }

    /* renamed from: b */
    public static yb1 m57437b() {
        return f55166b;
    }

    /* renamed from: i */
    public static byte[] m57438i(byte[] bArr, int i) {
        if (i == bArr.length) {
            return bArr;
        }
        byte[] bArr2 = new byte[i];
        System.arraycopy(bArr, 0, bArr2, 0, i);
        return bArr2;
    }

    /* renamed from: c */
    public final byte[] m57439c(CharSequence charSequence) {
        try {
            return m57440d(charSequence);
        } catch (C18368d e) {
            throw new IllegalArgumentException(e);
        }
    }

    /* renamed from: d */
    public final byte[] m57440d(CharSequence charSequence) {
        CharSequence charSequenceMo57448m = mo57448m(charSequence);
        byte[] bArr = new byte[mo57445j(charSequenceMo57448m.length())];
        return m57438i(bArr, mo57441e(bArr, charSequenceMo57448m));
    }

    /* renamed from: e */
    public abstract int mo57441e(byte[] bArr, CharSequence charSequence);

    /* renamed from: f */
    public String m57442f(byte[] bArr) {
        return m57443g(bArr, 0, bArr.length);
    }

    /* renamed from: g */
    public final String m57443g(byte[] bArr, int i, int i2) {
        dgd.m23067t(i, i + i2, bArr.length);
        StringBuilder sb = new StringBuilder(mo57446k(i2));
        try {
            mo57444h(sb, bArr, i, i2);
            return sb.toString();
        } catch (IOException e) {
            throw new AssertionError(e);
        }
    }

    /* renamed from: h */
    public abstract void mo57444h(Appendable appendable, byte[] bArr, int i, int i2);

    /* renamed from: j */
    public abstract int mo57445j(int i);

    /* renamed from: k */
    public abstract int mo57446k(int i);

    /* renamed from: l */
    public abstract yb1 mo57447l();

    /* renamed from: m */
    public abstract CharSequence mo57448m(CharSequence charSequence);
}
