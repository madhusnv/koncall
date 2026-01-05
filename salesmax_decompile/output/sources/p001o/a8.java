package p001o;

import com.amplifyframework.storage.s3.transfer.TransferTable;
import com.onesignal.core.internal.database.impl.OneSignalDbContract;
import java.util.ArrayList;
import org.apache.http.message.TokenParser;

/* loaded from: classes6.dex */
public abstract class a8 {

    /* renamed from: a */
    public int f14266a;

    /* renamed from: c */
    public String f14268c;

    /* renamed from: b */
    public final da9 f14267b = new da9();

    /* renamed from: d */
    public StringBuilder f14269d = new StringBuilder();

    /* renamed from: O */
    public static /* synthetic */ boolean m16580O(a8 a8Var, boolean z, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: tryConsumeNull");
        }
        if ((i & 1) != 0) {
            z = true;
        }
        return a8Var.m16597N(z);
    }

    /* renamed from: n */
    public static final double m16581n(long j, boolean z) {
        if (!z) {
            return Math.pow(10.0d, -j);
        }
        if (z) {
            return Math.pow(10.0d, j);
        }
        throw new szb();
    }

    /* renamed from: x */
    public static /* synthetic */ Void m16582x(a8 a8Var, String str, int i, String str2, int i2, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: fail");
        }
        if ((i2 & 2) != 0) {
            i = a8Var.f14266a;
        }
        if ((i2 & 4) != 0) {
            str2 = "";
        }
        return a8Var.m16621w(str, i, str2);
    }

    /* renamed from: z */
    public static /* synthetic */ Void m16583z(a8 a8Var, byte b, boolean z, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: fail");
        }
        if ((i & 2) != 0) {
            z = true;
        }
        return a8Var.m16622y(b, z);
    }

    /* renamed from: A */
    public final void m16584A(String str) {
        sq8.m48649h(str, TransferTable.COLUMN_KEY);
        m16621w("Encountered an unknown key '" + str + '\'', f9g.h0(m16594K(0, this.f14266a), str, 0, false, 6, null), "Use 'ignoreUnknownKeys = true' in 'Json {}' builder to ignore unknown keys.");
        throw new qe9();
    }

    /* renamed from: B */
    public final int m16585B(CharSequence charSequence, int i) {
        char cCharAt = charSequence.charAt(i);
        if ('0' <= cCharAt && cCharAt < ':') {
            return cCharAt - '0';
        }
        char c = 'a';
        if (!('a' <= cCharAt && cCharAt < 'g')) {
            c = 'A';
            if (!('A' <= cCharAt && cCharAt < 'G')) {
                m16582x(this, "Invalid toHexChar char '" + cCharAt + "' in unicode escape", 0, null, 6, null);
                throw new qe9();
            }
        }
        return (cCharAt - c) + 10;
    }

    /* renamed from: C */
    public abstract CharSequence mo16586C();

    /* renamed from: D */
    public final boolean m16587D(char c) {
        return !(((c == '}' || c == ']') || c == ':') || c == ',');
    }

    /* renamed from: E */
    public abstract String mo16588E(String str, boolean z);

    /* renamed from: F */
    public final byte m16589F() {
        CharSequence charSequenceMo16586C = mo16586C();
        int i = this.f14266a;
        while (true) {
            int iMo16591H = mo16591H(i);
            if (iMo16591H == -1) {
                this.f14266a = iMo16591H;
                return (byte) 10;
            }
            char cCharAt = charSequenceMo16586C.charAt(iMo16591H);
            if (cCharAt != ' ' && cCharAt != '\n' && cCharAt != '\r' && cCharAt != '\t') {
                this.f14266a = iMo16591H;
                return b8.m18263a(cCharAt);
            }
            i = iMo16591H + 1;
        }
    }

    /* renamed from: G */
    public final String m16590G(boolean z) {
        String strM16613o;
        byte bM16589F = m16589F();
        if (z) {
            if (bM16589F != 1 && bM16589F != 0) {
                return null;
            }
            strM16613o = m16615q();
        } else {
            if (bM16589F != 1) {
                return null;
            }
            strM16613o = m16613o();
        }
        this.f14268c = strM16613o;
        return strM16613o;
    }

    /* renamed from: H */
    public abstract int mo16591H(int i);

    /* renamed from: I */
    public final void m16592I(boolean z) {
        ArrayList arrayList = new ArrayList();
        byte bM16589F = m16589F();
        if (bM16589F != 8 && bM16589F != 6) {
            m16615q();
            return;
        }
        while (true) {
            byte bM16589F2 = m16589F();
            boolean z2 = true;
            if (bM16589F2 != 1) {
                if (bM16589F2 != 8 && bM16589F2 != 6) {
                    z2 = false;
                }
                if (z2) {
                    arrayList.add(Byte.valueOf(bM16589F2));
                } else if (bM16589F2 == 9) {
                    if (((Number) kh3.r0(arrayList)).byteValue() != 8) {
                        throw w89.m54057e(this.f14266a, "found ] instead of } at path: " + this.f14267b, mo16586C());
                    }
                    hh3.m30449I(arrayList);
                } else if (bM16589F2 == 7) {
                    if (((Number) kh3.r0(arrayList)).byteValue() != 6) {
                        throw w89.m54057e(this.f14266a, "found } instead of ] at path: " + this.f14267b, mo16586C());
                    }
                    hh3.m30449I(arrayList);
                } else if (bM16589F2 == 10) {
                    m16582x(this, "Unexpected end of input due to malformed JSON during ignoring unknown keys", 0, null, 6, null);
                    throw new qe9();
                }
                mo16609j();
                if (arrayList.size() == 0) {
                    return;
                }
            } else if (z) {
                m16615q();
            } else {
                mo16608i();
            }
        }
    }

    /* renamed from: J */
    public abstract int mo16593J();

    /* renamed from: K */
    public String m16594K(int i, int i2) {
        return mo16586C().subSequence(i, i2).toString();
    }

    /* renamed from: L */
    public final String m16595L() {
        String str = this.f14268c;
        sq8.m48646e(str);
        this.f14268c = null;
        return str;
    }

    /* renamed from: M */
    public abstract boolean mo16596M();

    /* renamed from: N */
    public final boolean m16597N(boolean z) {
        int iMo16591H = mo16591H(mo16593J());
        int length = mo16586C().length() - iMo16591H;
        if (length < 4 || iMo16591H == -1) {
            return false;
        }
        for (int i = 0; i < 4; i++) {
            if ("null".charAt(i) != mo16586C().charAt(iMo16591H + i)) {
                return false;
            }
        }
        if (length > 4 && b8.m18263a(mo16586C().charAt(iMo16591H + 4)) == 0) {
            return false;
        }
        if (!z) {
            return true;
        }
        this.f14266a = iMo16591H + 4;
        return true;
    }

    /* renamed from: P */
    public final void m16598P(char c) {
        int i = this.f14266a;
        if (i > 0 && c == '\"') {
            try {
                this.f14266a = i - 1;
                String strM16615q = m16615q();
                this.f14266a = i;
                if (sq8.m48644c(strM16615q, "null")) {
                    m16621w("Expected string literal but 'null' literal was found", this.f14266a - 1, "Use 'coerceInputValues = true' in 'Json {}' builder to coerce nulls if property has a default value.");
                    throw new qe9();
                }
            } catch (Throwable th) {
                this.f14266a = i;
                throw th;
            }
        }
        m16583z(this, b8.m18263a(c), false, 2, null);
        throw new qe9();
    }

    /* renamed from: Q */
    public final boolean m16599Q() {
        return mo16586C().charAt(this.f14266a - 1) != '\"';
    }

    /* renamed from: a */
    public final int m16600a(int i) {
        int iMo16591H = mo16591H(i);
        if (iMo16591H == -1) {
            m16582x(this, "Expected escape sequence to continue, got EOF", 0, null, 6, null);
            throw new qe9();
        }
        int i2 = iMo16591H + 1;
        char cCharAt = mo16586C().charAt(iMo16591H);
        if (cCharAt == 'u') {
            return m16602c(mo16586C(), i2);
        }
        char cM18264b = b8.m18264b(cCharAt);
        if (cM18264b != 0) {
            this.f14269d.append(cM18264b);
            return i2;
        }
        m16582x(this, "Invalid escaped char '" + cCharAt + '\'', 0, null, 6, null);
        throw new qe9();
    }

    /* renamed from: b */
    public final int m16601b(int i, int i2) {
        m16603d(i, i2);
        return m16600a(i2 + 1);
    }

    /* renamed from: c */
    public final int m16602c(CharSequence charSequence, int i) {
        int i2 = i + 4;
        if (i2 < charSequence.length()) {
            this.f14269d.append((char) ((m16585B(charSequence, i) << 12) + (m16585B(charSequence, i + 1) << 8) + (m16585B(charSequence, i + 2) << 4) + m16585B(charSequence, i + 3)));
            return i2;
        }
        this.f14266a = i;
        m16619u();
        if (this.f14266a + 4 < charSequence.length()) {
            return m16602c(charSequence, this.f14266a);
        }
        m16582x(this, "Unexpected EOF during unicode escape", 0, null, 6, null);
        throw new qe9();
    }

    /* renamed from: d */
    public void m16603d(int i, int i2) {
        this.f14269d.append(mo16586C(), i, i2);
    }

    /* renamed from: e */
    public abstract boolean mo16604e();

    /* renamed from: f */
    public final boolean m16605f(int i) {
        int iMo16591H = mo16591H(i);
        if (iMo16591H >= mo16586C().length() || iMo16591H == -1) {
            m16582x(this, "EOF", 0, null, 6, null);
            throw new qe9();
        }
        int i2 = iMo16591H + 1;
        int iCharAt = mo16586C().charAt(iMo16591H) | TokenParser.SP;
        if (iCharAt == 102) {
            m16607h("alse", i2);
            return false;
        }
        if (iCharAt == 116) {
            m16607h("rue", i2);
            return true;
        }
        m16582x(this, "Expected valid boolean literal prefix, but had '" + m16615q() + '\'', 0, null, 6, null);
        throw new qe9();
    }

    /* renamed from: g */
    public final boolean m16606g() {
        boolean z;
        int iMo16593J = mo16593J();
        if (iMo16593J == mo16586C().length()) {
            m16582x(this, "EOF", 0, null, 6, null);
            throw new qe9();
        }
        if (mo16586C().charAt(iMo16593J) == '\"') {
            iMo16593J++;
            z = true;
        } else {
            z = false;
        }
        boolean zM16605f = m16605f(iMo16593J);
        if (z) {
            if (this.f14266a == mo16586C().length()) {
                m16582x(this, "EOF", 0, null, 6, null);
                throw new qe9();
            }
            if (mo16586C().charAt(this.f14266a) != '\"') {
                m16582x(this, "Expected closing quotation mark", 0, null, 6, null);
                throw new qe9();
            }
            this.f14266a++;
        }
        return zM16605f;
    }

    /* renamed from: h */
    public final void m16607h(String str, int i) {
        if (mo16586C().length() - i < str.length()) {
            m16582x(this, "Unexpected end of boolean literal", 0, null, 6, null);
            throw new qe9();
        }
        int length = str.length();
        for (int i2 = 0; i2 < length; i2++) {
            if (str.charAt(i2) != (mo16586C().charAt(i + i2) | TokenParser.SP)) {
                m16582x(this, "Expected valid boolean literal prefix, but had '" + m16615q() + '\'', 0, null, 6, null);
                throw new qe9();
            }
        }
        this.f14266a = i + str.length();
    }

    /* renamed from: i */
    public abstract String mo16608i();

    /* renamed from: j */
    public abstract byte mo16609j();

    /* renamed from: k */
    public final byte m16610k(byte b) {
        byte bMo16609j = mo16609j();
        if (bMo16609j == b) {
            return bMo16609j;
        }
        m16583z(this, b, false, 2, null);
        throw new qe9();
    }

    /* renamed from: l */
    public abstract void mo16611l(char c);

    /* JADX WARN: Code restructure failed: missing block: B:101:0x01f0, code lost:
    
        return -r11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:102:0x01f1, code lost:
    
        m16582x(r18, "Numeric value overflow", 0, null, 6, null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:103:0x0201, code lost:
    
        throw new p001o.qe9();
     */
    /* JADX WARN: Code restructure failed: missing block: B:104:0x0202, code lost:
    
        m16582x(r18, "Expected numeric literal", 0, null, 6, null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:105:0x0212, code lost:
    
        throw new p001o.qe9();
     */
    /* JADX WARN: Code restructure failed: missing block: B:127:?, code lost:
    
        return r11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x0149, code lost:
    
        if (r5 == r0) goto L66;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x014b, code lost:
    
        r2 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x014d, code lost:
    
        r2 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x014e, code lost:
    
        if (r0 == r5) goto L104;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x0150, code lost:
    
        if (r10 == false) goto L71;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x0154, code lost:
    
        if (r0 == (r5 - 1)) goto L104;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x0156, code lost:
    
        if (r1 == false) goto L80;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x0158, code lost:
    
        if (r2 == false) goto L78;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x0164, code lost:
    
        if (mo16586C().charAt(r5) != '\"') goto L76;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x0166, code lost:
    
        r5 = r5 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x0169, code lost:
    
        m16582x(r18, "Expected closing quotation mark", 0, null, 6, null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x0179, code lost:
    
        throw new p001o.qe9();
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x017a, code lost:
    
        m16582x(r18, "EOF", 0, null, 6, null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x018a, code lost:
    
        throw new p001o.qe9();
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x018b, code lost:
    
        r18.f14266a = r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x018d, code lost:
    
        if (r9 == false) goto L96;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x018f, code lost:
    
        r0 = r11 * m16581n(r13, r15);
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x0199, code lost:
    
        if (r0 > 9.223372036854776E18d) goto L94;
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x019f, code lost:
    
        if (r0 < (-9.223372036854776E18d)) goto L94;
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x01a7, code lost:
    
        if (java.lang.Math.floor(r0) != r0) goto L89;
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x01a9, code lost:
    
        r3 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x01ab, code lost:
    
        r3 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x01ac, code lost:
    
        if (r3 == false) goto L92;
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x01ae, code lost:
    
        r11 = (long) r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x01b0, code lost:
    
        m16582x(r18, "Can't convert " + r0 + " to Long", 0, null, 6, null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x01d4, code lost:
    
        throw new p001o.qe9();
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x01d5, code lost:
    
        m16582x(r18, "Numeric value overflow", 0, null, 6, null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x01e5, code lost:
    
        throw new p001o.qe9();
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x01e6, code lost:
    
        if (r10 == false) goto L98;
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x01ed, code lost:
    
        if (r11 == Long.MIN_VALUE) goto L102;
     */
    /* renamed from: m */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final long m16612m() {
        boolean z;
        int iMo16591H = mo16591H(mo16593J());
        if (iMo16591H < mo16586C().length() && iMo16591H != -1) {
            if (mo16586C().charAt(iMo16591H) == '\"') {
                iMo16591H++;
                if (iMo16591H == mo16586C().length()) {
                    m16582x(this, "EOF", 0, null, 6, null);
                    throw new qe9();
                }
                z = true;
            } else {
                z = false;
            }
            int i = iMo16591H;
            long j = 0;
            long j2 = 0;
            boolean z2 = false;
            boolean z3 = false;
            loop0: while (true) {
                boolean z4 = false;
                while (i != mo16586C().length()) {
                    char cCharAt = mo16586C().charAt(i);
                    if ((cCharAt == 'e' || cCharAt == 'E') && !z2) {
                        if (i == iMo16591H) {
                            m16582x(this, "Unexpected symbol " + cCharAt + " in numeric literal", 0, null, 6, null);
                            throw new qe9();
                        }
                        i++;
                        z2 = true;
                    } else if (cCharAt == '-' && z2) {
                        if (i == iMo16591H) {
                            m16582x(this, "Unexpected symbol '-' in numeric literal", 0, null, 6, null);
                            throw new qe9();
                        }
                        i++;
                    } else if (cCharAt != '+' || !z2) {
                        if (cCharAt != '-') {
                            if (b8.m18263a(cCharAt) != 0) {
                                break loop0;
                            }
                            i++;
                            int i2 = cCharAt - '0';
                            if (!(i2 >= 0 && i2 < 10)) {
                                m16582x(this, "Unexpected symbol '" + cCharAt + "' in numeric literal", 0, null, 6, null);
                                throw new qe9();
                            }
                            if (z2) {
                                j2 = (j2 * 10) + i2;
                            } else {
                                j = (j * 10) - i2;
                                if (j > 0) {
                                    m16582x(this, "Numeric value overflow", 0, null, 6, null);
                                    throw new qe9();
                                }
                            }
                        } else {
                            if (i != iMo16591H) {
                                m16582x(this, "Unexpected symbol '-' in numeric literal", 0, null, 6, null);
                                throw new qe9();
                            }
                            i++;
                            z3 = true;
                        }
                    } else {
                        if (i == iMo16591H) {
                            m16582x(this, "Unexpected symbol '+' in numeric literal", 0, null, 6, null);
                            throw new qe9();
                        }
                        i++;
                    }
                    z4 = true;
                }
                break loop0;
            }
        } else {
            m16582x(this, "EOF", 0, null, 6, null);
            throw new qe9();
        }
    }

    /* renamed from: o */
    public final String m16613o() {
        return this.f14268c != null ? m16595L() : mo16608i();
    }

    /* renamed from: p */
    public final String m16614p(CharSequence charSequence, int i, int i2) {
        int iMo16591H;
        sq8.m48649h(charSequence, "source");
        char cCharAt = charSequence.charAt(i2);
        boolean z = false;
        while (cCharAt != '\"') {
            if (cCharAt == '\\') {
                iMo16591H = mo16591H(m16601b(i, i2));
                if (iMo16591H == -1) {
                    m16582x(this, "Unexpected EOF", iMo16591H, null, 4, null);
                    throw new qe9();
                }
            } else {
                i2++;
                if (i2 >= charSequence.length()) {
                    m16603d(i, i2);
                    iMo16591H = mo16591H(i2);
                    if (iMo16591H == -1) {
                        m16582x(this, "Unexpected EOF", iMo16591H, null, 4, null);
                        throw new qe9();
                    }
                } else {
                    continue;
                    cCharAt = charSequence.charAt(i2);
                }
            }
            z = true;
            i = iMo16591H;
            i2 = i;
            cCharAt = charSequence.charAt(i2);
        }
        String strM16594K = !z ? m16594K(i, i2) : m16617s(i, i2);
        this.f14266a = i2 + 1;
        return strM16594K;
    }

    /* renamed from: q */
    public final String m16615q() {
        if (this.f14268c != null) {
            return m16595L();
        }
        int iMo16593J = mo16593J();
        if (iMo16593J >= mo16586C().length() || iMo16593J == -1) {
            m16582x(this, "EOF", iMo16593J, null, 4, null);
            throw new qe9();
        }
        byte bM18263a = b8.m18263a(mo16586C().charAt(iMo16593J));
        if (bM18263a == 1) {
            return m16613o();
        }
        if (bM18263a != 0) {
            m16582x(this, "Expected beginning of the string, but got " + mo16586C().charAt(iMo16593J), 0, null, 6, null);
            throw new qe9();
        }
        boolean z = false;
        while (b8.m18263a(mo16586C().charAt(iMo16593J)) == 0) {
            iMo16593J++;
            if (iMo16593J >= mo16586C().length()) {
                m16603d(this.f14266a, iMo16593J);
                int iMo16591H = mo16591H(iMo16593J);
                if (iMo16591H == -1) {
                    this.f14266a = iMo16593J;
                    return m16617s(0, 0);
                }
                iMo16593J = iMo16591H;
                z = true;
            }
        }
        String strM16594K = !z ? m16594K(this.f14266a, iMo16593J) : m16617s(this.f14266a, iMo16593J);
        this.f14266a = iMo16593J;
        return strM16594K;
    }

    /* renamed from: r */
    public final String m16616r() {
        String strM16615q = m16615q();
        if (!sq8.m48644c(strM16615q, "null") || !m16599Q()) {
            return strM16615q;
        }
        m16582x(this, "Unexpected 'null' value instead of string literal", 0, null, 6, null);
        throw new qe9();
    }

    /* renamed from: s */
    public final String m16617s(int i, int i2) {
        m16603d(i, i2);
        String string = this.f14269d.toString();
        sq8.m48648g(string, "toString(...)");
        this.f14269d.setLength(0);
        return string;
    }

    /* renamed from: t */
    public final void m16618t() {
        this.f14268c = null;
    }

    public String toString() {
        return "JsonReader(source='" + ((Object) mo16586C()) + "', currentPosition=" + this.f14266a + ')';
    }

    /* renamed from: u */
    public void m16619u() {
    }

    /* renamed from: v */
    public final void m16620v() {
        if (mo16609j() == 10) {
            return;
        }
        m16582x(this, "Expected EOF after parsing, but had " + mo16586C().charAt(this.f14266a - 1) + " instead", 0, null, 6, null);
        throw new qe9();
    }

    /* renamed from: w */
    public final Void m16621w(String str, int i, String str2) {
        String str3;
        sq8.m48649h(str, OneSignalDbContract.NotificationTable.COLUMN_NAME_MESSAGE);
        sq8.m48649h(str2, "hint");
        if (str2.length() == 0) {
            str3 = "";
        } else {
            str3 = '\n' + str2;
        }
        throw w89.m54057e(i, str + " at path: " + this.f14267b.m22677a() + str3, mo16586C());
    }

    /* renamed from: y */
    public final Void m16622y(byte b, boolean z) {
        String strM18265c = b8.m18265c(b);
        int i = z ? this.f14266a - 1 : this.f14266a;
        m16582x(this, "Expected " + strM18265c + ", but had '" + ((this.f14266a == mo16586C().length() || i < 0) ? "EOF" : String.valueOf(mo16586C().charAt(i))) + "' instead", i, null, 4, null);
        throw new qe9();
    }
}
