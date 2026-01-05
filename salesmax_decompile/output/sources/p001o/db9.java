package p001o;

import java.io.EOFException;
import org.apache.http.message.BasicHeaderValueFormatter;
import org.apache.http.message.TokenParser;
import org.objectweb.asm.Opcodes;
import p001o.ka9;

/* loaded from: classes3.dex */
public final class db9 extends ka9 {

    /* renamed from: L */
    public static final zq1 f19515L = zq1.m59687e("'\\");

    /* renamed from: M */
    public static final zq1 f19516M = zq1.m59687e(BasicHeaderValueFormatter.UNSAFE_CHARS);

    /* renamed from: Q */
    public static final zq1 f19517Q = zq1.m59687e("{}[]:, \n\t\r\f/\\;#=");

    /* renamed from: X */
    public static final zq1 f19518X = zq1.m59687e("\n\r");

    /* renamed from: Y */
    public static final zq1 f19519Y = zq1.m59687e("*/");

    /* renamed from: H */
    public String f19520H;

    /* renamed from: h */
    public final im1 f19521h;

    /* renamed from: q */
    public final rl1 f19522q;

    /* renamed from: s */
    public int f19523s = 0;

    /* renamed from: x */
    public long f19524x;

    /* renamed from: y */
    public int f19525y;

    public db9(im1 im1Var) {
        if (im1Var == null) {
            throw new NullPointerException("source == null");
        }
        this.f19521h = im1Var;
        this.f19522q = im1Var.mo32309e();
        m35228D(6);
    }

    @Override // p001o.ka9
    /* renamed from: C */
    public ka9.EnumC14757b mo22723C() throws u89, EOFException {
        int iM22728T = this.f19523s;
        if (iM22728T == 0) {
            iM22728T = m22728T();
        }
        switch (iM22728T) {
            case 1:
                return ka9.EnumC14757b.BEGIN_OBJECT;
            case 2:
                return ka9.EnumC14757b.END_OBJECT;
            case 3:
                return ka9.EnumC14757b.BEGIN_ARRAY;
            case 4:
                return ka9.EnumC14757b.END_ARRAY;
            case 5:
            case 6:
                return ka9.EnumC14757b.BOOLEAN;
            case 7:
                return ka9.EnumC14757b.NULL;
            case 8:
            case 9:
            case 10:
            case 11:
                return ka9.EnumC14757b.STRING;
            case 12:
            case 13:
            case 14:
            case 15:
                return ka9.EnumC14757b.NAME;
            case 16:
            case 17:
                return ka9.EnumC14757b.NUMBER;
            case 18:
                return ka9.EnumC14757b.END_DOCUMENT;
            default:
                throw new AssertionError();
        }
    }

    @Override // p001o.ka9
    /* renamed from: H */
    public int mo22724H(ka9.C14756a c14756a) throws u89, EOFException {
        int iM22728T = this.f19523s;
        if (iM22728T == 0) {
            iM22728T = m22728T();
        }
        if (iM22728T < 12 || iM22728T > 15) {
            return -1;
        }
        if (iM22728T == 15) {
            return m22729X(this.f19520H, c14756a);
        }
        int iN3 = this.f19521h.n3(c14756a.f31744b);
        if (iN3 != -1) {
            this.f19523s = 0;
            this.f31739c[this.f31737a - 1] = c14756a.f31743a[iN3];
            return iN3;
        }
        String str = this.f31739c[this.f31737a - 1];
        String strMo22739s = mo22739s();
        int iM22729X = m22729X(strMo22739s, c14756a);
        if (iM22729X == -1) {
            this.f19523s = 15;
            this.f19520H = strMo22739s;
            this.f31739c[this.f31737a - 1] = str;
        }
        return iM22729X;
    }

    @Override // p001o.ka9
    /* renamed from: J */
    public void mo22725J() throws u89, EOFException {
        if (this.f31742f) {
            throw new a89("Cannot skip unexpected " + mo22723C() + " at " + getPath());
        }
        int iM22728T = this.f19523s;
        if (iM22728T == 0) {
            iM22728T = m22728T();
        }
        if (iM22728T == 14) {
            y0();
        } else if (iM22728T == 13) {
            r0(f19516M);
        } else if (iM22728T == 12) {
            r0(f19515L);
        } else if (iM22728T != 15) {
            throw new a89("Expected a name but was " + mo22723C() + " at path " + getPath());
        }
        this.f19523s = 0;
        this.f31739c[this.f31737a - 1] = "null";
    }

    @Override // p001o.ka9
    /* renamed from: K */
    public void mo22726K() throws u89, EOFException {
        if (this.f31742f) {
            throw new a89("Cannot skip unexpected " + mo22723C() + " at " + getPath());
        }
        int i = 0;
        do {
            int iM22728T = this.f19523s;
            if (iM22728T == 0) {
                iM22728T = m22728T();
            }
            if (iM22728T == 3) {
                m35228D(1);
            } else if (iM22728T == 1) {
                m35228D(3);
            } else {
                if (iM22728T == 4) {
                    i--;
                    if (i < 0) {
                        throw new a89("Expected a value but was " + mo22723C() + " at path " + getPath());
                    }
                    this.f31737a--;
                } else if (iM22728T == 2) {
                    i--;
                    if (i < 0) {
                        throw new a89("Expected a value but was " + mo22723C() + " at path " + getPath());
                    }
                    this.f31737a--;
                } else if (iM22728T == 14 || iM22728T == 10) {
                    y0();
                } else if (iM22728T == 9 || iM22728T == 13) {
                    r0(f19516M);
                } else if (iM22728T == 8 || iM22728T == 12) {
                    r0(f19515L);
                } else if (iM22728T == 17) {
                    this.f19522q.skip(this.f19525y);
                } else if (iM22728T == 18) {
                    throw new a89("Expected a value but was " + mo22723C() + " at path " + getPath());
                }
                this.f19523s = 0;
            }
            i++;
            this.f19523s = 0;
        } while (i != 0);
        int[] iArr = this.f31740d;
        int i2 = this.f31737a;
        int i3 = i2 - 1;
        iArr[i3] = iArr[i3] + 1;
        this.f31739c[i2 - 1] = "null";
    }

    /* renamed from: S */
    public final void m22727S() throws u89 {
        if (!this.f31741e) {
            throw m35229Q("Use JsonReader.setLenient(true) to accept malformed JSON");
        }
    }

    /* renamed from: T */
    public final int m22728T() throws u89, EOFException {
        int[] iArr = this.f31738b;
        int i = this.f31737a;
        int i2 = iArr[i - 1];
        if (i2 == 1) {
            iArr[i - 1] = 2;
        } else if (i2 == 2) {
            int iD0 = d0(true);
            this.f19522q.readByte();
            if (iD0 != 44) {
                if (iD0 != 59) {
                    if (iD0 != 93) {
                        throw m35229Q("Unterminated array");
                    }
                    this.f19523s = 4;
                    return 4;
                }
                m22727S();
            }
        } else {
            if (i2 == 3 || i2 == 5) {
                iArr[i - 1] = 4;
                if (i2 == 5) {
                    int iD02 = d0(true);
                    this.f19522q.readByte();
                    if (iD02 != 44) {
                        if (iD02 != 59) {
                            if (iD02 != 125) {
                                throw m35229Q("Unterminated object");
                            }
                            this.f19523s = 2;
                            return 2;
                        }
                        m22727S();
                    }
                }
                int iD03 = d0(true);
                if (iD03 == 34) {
                    this.f19522q.readByte();
                    this.f19523s = 13;
                    return 13;
                }
                if (iD03 == 39) {
                    this.f19522q.readByte();
                    m22727S();
                    this.f19523s = 12;
                    return 12;
                }
                if (iD03 != 125) {
                    m22727S();
                    if (!m22730Y((char) iD03)) {
                        throw m35229Q("Expected name");
                    }
                    this.f19523s = 14;
                    return 14;
                }
                if (i2 == 5) {
                    throw m35229Q("Expected name");
                }
                this.f19522q.readByte();
                this.f19523s = 2;
                return 2;
            }
            if (i2 == 4) {
                iArr[i - 1] = 5;
                int iD04 = d0(true);
                this.f19522q.readByte();
                if (iD04 != 58) {
                    if (iD04 != 61) {
                        throw m35229Q("Expected ':'");
                    }
                    m22727S();
                    if (this.f19521h.request(1L) && this.f19522q.m46918s(0L) == 62) {
                        this.f19522q.readByte();
                    }
                }
            } else if (i2 == 6) {
                iArr[i - 1] = 7;
            } else if (i2 == 7) {
                if (d0(false) == -1) {
                    this.f19523s = 18;
                    return 18;
                }
                m22727S();
            } else if (i2 == 8) {
                throw new IllegalStateException("JsonReader is closed");
            }
        }
        int iD05 = d0(true);
        if (iD05 == 34) {
            this.f19522q.readByte();
            this.f19523s = 9;
            return 9;
        }
        if (iD05 == 39) {
            m22727S();
            this.f19522q.readByte();
            this.f19523s = 8;
            return 8;
        }
        if (iD05 != 44 && iD05 != 59) {
            if (iD05 == 91) {
                this.f19522q.readByte();
                this.f19523s = 3;
                return 3;
            }
            if (iD05 != 93) {
                if (iD05 == 123) {
                    this.f19522q.readByte();
                    this.f19523s = 1;
                    return 1;
                }
                int iK0 = k0();
                if (iK0 != 0) {
                    return iK0;
                }
                int iL0 = l0();
                if (iL0 != 0) {
                    return iL0;
                }
                if (!m22730Y(this.f19522q.m46918s(0L))) {
                    throw m35229Q("Expected value");
                }
                m22727S();
                this.f19523s = 10;
                return 10;
            }
            if (i2 == 1) {
                this.f19522q.readByte();
                this.f19523s = 4;
                return 4;
            }
        }
        if (i2 != 1 && i2 != 2) {
            throw m35229Q("Unexpected value");
        }
        m22727S();
        this.f19523s = 7;
        return 7;
    }

    /* renamed from: X */
    public final int m22729X(String str, ka9.C14756a c14756a) {
        int length = c14756a.f31743a.length;
        for (int i = 0; i < length; i++) {
            if (str.equals(c14756a.f31743a[i])) {
                this.f19523s = 0;
                this.f31739c[this.f31737a - 1] = str;
                return i;
            }
        }
        return -1;
    }

    /* renamed from: Y */
    public final boolean m22730Y(int i) throws u89 {
        if (i == 9 || i == 10 || i == 12 || i == 13 || i == 32) {
            return false;
        }
        if (i != 35) {
            if (i == 44) {
                return false;
            }
            if (i != 47 && i != 61) {
                if (i == 123 || i == 125 || i == 58) {
                    return false;
                }
                if (i != 59) {
                    switch (i) {
                        case Opcodes.DUP_X2 /* 91 */:
                        case Opcodes.DUP2_X1 /* 93 */:
                            return false;
                        case Opcodes.DUP2 /* 92 */:
                            break;
                        default:
                            return true;
                    }
                }
            }
        }
        m22727S();
        return false;
    }

    @Override // p001o.ka9
    /* renamed from: c */
    public void mo22731c() throws u89, EOFException {
        int iM22728T = this.f19523s;
        if (iM22728T == 0) {
            iM22728T = m22728T();
        }
        if (iM22728T == 3) {
            m35228D(1);
            this.f31740d[this.f31737a - 1] = 0;
            this.f19523s = 0;
        } else {
            throw new a89("Expected BEGIN_ARRAY but was " + mo22723C() + " at path " + getPath());
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws EOFException {
        this.f19523s = 0;
        this.f31738b[0] = 8;
        this.f31737a = 1;
        this.f19522q.clear();
        this.f19521h.close();
    }

    @Override // p001o.ka9
    /* renamed from: d */
    public void mo22732d() throws u89, EOFException {
        int iM22728T = this.f19523s;
        if (iM22728T == 0) {
            iM22728T = m22728T();
        }
        if (iM22728T == 1) {
            m35228D(3);
            this.f19523s = 0;
            return;
        }
        throw new a89("Expected BEGIN_OBJECT but was " + mo22723C() + " at path " + getPath());
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0025, code lost:
    
        r6.f19522q.skip(r3 - 1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x002f, code lost:
    
        if (r1 != 47) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0039, code lost:
    
        if (r6.f19521h.request(2) != false) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x003b, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x003c, code lost:
    
        m22727S();
        r3 = r6.f19522q.m46918s(1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0049, code lost:
    
        if (r3 == 42) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x004b, code lost:
    
        if (r3 == 47) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x004d, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x004e, code lost:
    
        r6.f19522q.readByte();
        r6.f19522q.readByte();
        v0();
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x005c, code lost:
    
        r6.f19522q.readByte();
        r6.f19522q.readByte();
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x006a, code lost:
    
        if (u0() == false) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0073, code lost:
    
        throw m35229Q("Unterminated comment");
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0076, code lost:
    
        if (r1 != 35) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0078, code lost:
    
        m22727S();
        v0();
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x007f, code lost:
    
        return r1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int d0(boolean z) throws u89, EOFException {
        while (true) {
            int i = 0;
            while (true) {
                int i2 = i + 1;
                if (!this.f19521h.request(i2)) {
                    if (z) {
                        throw new EOFException("End of input");
                    }
                    return -1;
                }
                byte bM46918s = this.f19522q.m46918s(i);
                if (bM46918s != 10 && bM46918s != 32 && bM46918s != 13 && bM46918s != 9) {
                    break;
                }
                i = i2;
            }
        }
    }

    @Override // p001o.ka9
    /* renamed from: f */
    public void mo22733f() throws u89, EOFException {
        int iM22728T = this.f19523s;
        if (iM22728T == 0) {
            iM22728T = m22728T();
        }
        if (iM22728T != 4) {
            throw new a89("Expected END_ARRAY but was " + mo22723C() + " at path " + getPath());
        }
        int i = this.f31737a - 1;
        this.f31737a = i;
        int[] iArr = this.f31740d;
        int i2 = i - 1;
        iArr[i2] = iArr[i2] + 1;
        this.f19523s = 0;
    }

    public final String f0(zq1 zq1Var) throws u89, EOFException {
        StringBuilder sb = null;
        while (true) {
            long jR2 = this.f19521h.r2(zq1Var);
            if (jR2 == -1) {
                throw m35229Q("Unterminated string");
            }
            if (this.f19522q.m46918s(jR2) != 92) {
                if (sb == null) {
                    String strT1 = this.f19522q.t1(jR2);
                    this.f19522q.readByte();
                    return strT1;
                }
                sb.append(this.f19522q.t1(jR2));
                this.f19522q.readByte();
                return sb.toString();
            }
            if (sb == null) {
                sb = new StringBuilder();
            }
            sb.append(this.f19522q.t1(jR2));
            this.f19522q.readByte();
            sb.append(o0());
        }
    }

    @Override // p001o.ka9
    /* renamed from: g */
    public void mo22734g() throws u89, EOFException {
        int iM22728T = this.f19523s;
        if (iM22728T == 0) {
            iM22728T = m22728T();
        }
        if (iM22728T != 2) {
            throw new a89("Expected END_OBJECT but was " + mo22723C() + " at path " + getPath());
        }
        int i = this.f31737a - 1;
        this.f31737a = i;
        this.f31739c[i] = null;
        int[] iArr = this.f31740d;
        int i2 = i - 1;
        iArr[i2] = iArr[i2] + 1;
        this.f19523s = 0;
    }

    @Override // p001o.ka9
    /* renamed from: h */
    public boolean mo22735h() throws u89, EOFException {
        int iM22728T = this.f19523s;
        if (iM22728T == 0) {
            iM22728T = m22728T();
        }
        return (iM22728T == 2 || iM22728T == 4 || iM22728T == 18) ? false : true;
    }

    public final String j0() {
        long jR2 = this.f19521h.r2(f19517Q);
        return jR2 != -1 ? this.f19522q.t1(jR2) : this.f19522q.m46909T();
    }

    @Override // p001o.ka9
    /* renamed from: k */
    public boolean mo22736k() throws u89, EOFException {
        int iM22728T = this.f19523s;
        if (iM22728T == 0) {
            iM22728T = m22728T();
        }
        if (iM22728T == 5) {
            this.f19523s = 0;
            int[] iArr = this.f31740d;
            int i = this.f31737a - 1;
            iArr[i] = iArr[i] + 1;
            return true;
        }
        if (iM22728T == 6) {
            this.f19523s = 0;
            int[] iArr2 = this.f31740d;
            int i2 = this.f31737a - 1;
            iArr2[i2] = iArr2[i2] + 1;
            return false;
        }
        throw new a89("Expected a boolean but was " + mo22723C() + " at path " + getPath());
    }

    public final int k0() throws EOFException {
        String str;
        String str2;
        int i;
        byte bM46918s = this.f19522q.m46918s(0L);
        if (bM46918s == 116 || bM46918s == 84) {
            str = "true";
            str2 = "TRUE";
            i = 5;
        } else if (bM46918s == 102 || bM46918s == 70) {
            str = "false";
            str2 = "FALSE";
            i = 6;
        } else {
            if (bM46918s != 110 && bM46918s != 78) {
                return 0;
            }
            str = "null";
            str2 = "NULL";
            i = 7;
        }
        int length = str.length();
        int i2 = 1;
        while (i2 < length) {
            int i3 = i2 + 1;
            if (!this.f19521h.request(i3)) {
                return 0;
            }
            byte bM46918s2 = this.f19522q.m46918s(i2);
            if (bM46918s2 != str.charAt(i2) && bM46918s2 != str2.charAt(i2)) {
                return 0;
            }
            i2 = i3;
        }
        if (this.f19521h.request(length + 1) && m22730Y(this.f19522q.m46918s(length))) {
            return 0;
        }
        this.f19522q.skip(length);
        this.f19523s = i;
        return i;
    }

    /* JADX WARN: Code restructure failed: missing block: B:46:0x0081, code lost:
    
        if (m22730Y(r11) != false) goto L69;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x0083, code lost:
    
        if (r6 != 2) goto L60;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x0085, code lost:
    
        if (r7 == false) goto L60;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x008b, code lost:
    
        if (r8 != Long.MIN_VALUE) goto L52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x008d, code lost:
    
        if (r10 == false) goto L60;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x0091, code lost:
    
        if (r8 != 0) goto L55;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x0093, code lost:
    
        if (r10 != false) goto L60;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x0095, code lost:
    
        if (r10 == false) goto L57;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x0098, code lost:
    
        r8 = -r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x0099, code lost:
    
        r16.f19524x = r8;
        r16.f19522q.skip(r5);
        r16.f19523s = 16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x00a5, code lost:
    
        return 16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x00a6, code lost:
    
        if (r6 == 2) goto L67;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x00a9, code lost:
    
        if (r6 == 4) goto L67;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x00ac, code lost:
    
        if (r6 != 7) goto L66;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x00af, code lost:
    
        return 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x00b0, code lost:
    
        r16.f19525y = r5;
        r16.f19523s = 17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x00b6, code lost:
    
        return 17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x00b7, code lost:
    
        return 0;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int l0() throws EOFException {
        char c;
        boolean z = true;
        long j = 0;
        int i = 0;
        char c2 = 0;
        boolean z2 = false;
        boolean z3 = true;
        while (true) {
            int i2 = i + 1;
            if (!this.f19521h.request(i2)) {
                break;
            }
            byte bM46918s = this.f19522q.m46918s(i);
            if (bM46918s != 43) {
                if (bM46918s == 69 || bM46918s == 101) {
                    if (c2 != 2 && c2 != 4) {
                        return 0;
                    }
                    c2 = 5;
                } else if (bM46918s == 45) {
                    c = 6;
                    if (c2 == 0) {
                        c2 = 1;
                        z2 = true;
                    } else if (c2 != 5) {
                        return 0;
                    }
                } else if (bM46918s != 46) {
                    if (bM46918s < 48 || bM46918s > 57) {
                        break;
                    }
                    if (c2 == z || c2 == 0) {
                        j = -(bM46918s - 48);
                        c2 = 2;
                    } else if (c2 == 2) {
                        if (j == 0) {
                            return 0;
                        }
                        long j2 = (10 * j) - (bM46918s - 48);
                        z3 &= j > -922337203685477580L || (j == -922337203685477580L && j2 < j);
                        j = j2;
                    } else if (c2 == 3) {
                        c2 = 4;
                    } else if (c2 == 5 || c2 == 6) {
                        c2 = 7;
                    }
                } else {
                    if (c2 != 2) {
                        return 0;
                    }
                    c2 = 3;
                }
                i = i2;
                z = true;
            } else {
                c = 6;
                if (c2 != 5) {
                    return 0;
                }
            }
            c2 = c;
            i = i2;
            z = true;
        }
    }

    @Override // p001o.ka9
    /* renamed from: o */
    public double mo22737o() throws u89, NumberFormatException, EOFException {
        int iM22728T = this.f19523s;
        if (iM22728T == 0) {
            iM22728T = m22728T();
        }
        if (iM22728T == 16) {
            this.f19523s = 0;
            int[] iArr = this.f31740d;
            int i = this.f31737a - 1;
            iArr[i] = iArr[i] + 1;
            return this.f19524x;
        }
        if (iM22728T == 17) {
            this.f19520H = this.f19522q.t1(this.f19525y);
        } else if (iM22728T == 9) {
            this.f19520H = f0(f19516M);
        } else if (iM22728T == 8) {
            this.f19520H = f0(f19515L);
        } else if (iM22728T == 10) {
            this.f19520H = j0();
        } else if (iM22728T != 11) {
            throw new a89("Expected a double but was " + mo22723C() + " at path " + getPath());
        }
        this.f19523s = 11;
        try {
            double d = Double.parseDouble(this.f19520H);
            if (this.f31741e || !(Double.isNaN(d) || Double.isInfinite(d))) {
                this.f19520H = null;
                this.f19523s = 0;
                int[] iArr2 = this.f31740d;
                int i2 = this.f31737a - 1;
                iArr2[i2] = iArr2[i2] + 1;
                return d;
            }
            throw new u89("JSON forbids NaN and infinities: " + d + " at path " + getPath());
        } catch (NumberFormatException unused) {
            throw new a89("Expected a double but was " + this.f19520H + " at path " + getPath());
        }
    }

    public final char o0() throws u89, EOFException {
        int i;
        int i2;
        if (!this.f19521h.request(1L)) {
            throw m35229Q("Unterminated escape sequence");
        }
        byte b = this.f19522q.readByte();
        if (b == 10 || b == 34 || b == 39 || b == 47 || b == 92) {
            return (char) b;
        }
        if (b == 98) {
            return '\b';
        }
        if (b == 102) {
            return '\f';
        }
        if (b == 110) {
            return '\n';
        }
        if (b == 114) {
            return TokenParser.CR;
        }
        if (b == 116) {
            return '\t';
        }
        if (b != 117) {
            if (this.f31741e) {
                return (char) b;
            }
            throw m35229Q("Invalid escape sequence: \\" + ((char) b));
        }
        if (!this.f19521h.request(4L)) {
            throw new EOFException("Unterminated escape sequence at path " + getPath());
        }
        char c = 0;
        for (int i3 = 0; i3 < 4; i3++) {
            byte bM46918s = this.f19522q.m46918s(i3);
            char c2 = (char) (c << 4);
            if (bM46918s < 48 || bM46918s > 57) {
                if (bM46918s >= 97 && bM46918s <= 102) {
                    i = bM46918s - 97;
                } else {
                    if (bM46918s < 65 || bM46918s > 70) {
                        throw m35229Q("\\u" + this.f19522q.t1(4L));
                    }
                    i = bM46918s - 65;
                }
                i2 = i + 10;
            } else {
                i2 = bM46918s - 48;
            }
            c = (char) (c2 + i2);
        }
        this.f19522q.skip(4L);
        return c;
    }

    @Override // p001o.ka9
    /* renamed from: r */
    public int mo22738r() throws u89, NumberFormatException, EOFException {
        int iM22728T = this.f19523s;
        if (iM22728T == 0) {
            iM22728T = m22728T();
        }
        if (iM22728T == 16) {
            long j = this.f19524x;
            int i = (int) j;
            if (j == i) {
                this.f19523s = 0;
                int[] iArr = this.f31740d;
                int i2 = this.f31737a - 1;
                iArr[i2] = iArr[i2] + 1;
                return i;
            }
            throw new a89("Expected an int but was " + this.f19524x + " at path " + getPath());
        }
        if (iM22728T == 17) {
            this.f19520H = this.f19522q.t1(this.f19525y);
        } else if (iM22728T == 9 || iM22728T == 8) {
            String strF0 = iM22728T == 9 ? f0(f19516M) : f0(f19515L);
            this.f19520H = strF0;
            try {
                int i3 = Integer.parseInt(strF0);
                this.f19523s = 0;
                int[] iArr2 = this.f31740d;
                int i4 = this.f31737a - 1;
                iArr2[i4] = iArr2[i4] + 1;
                return i3;
            } catch (NumberFormatException unused) {
            }
        } else if (iM22728T != 11) {
            throw new a89("Expected an int but was " + mo22723C() + " at path " + getPath());
        }
        this.f19523s = 11;
        try {
            double d = Double.parseDouble(this.f19520H);
            int i5 = (int) d;
            if (i5 == d) {
                this.f19520H = null;
                this.f19523s = 0;
                int[] iArr3 = this.f31740d;
                int i6 = this.f31737a - 1;
                iArr3[i6] = iArr3[i6] + 1;
                return i5;
            }
            throw new a89("Expected an int but was " + this.f19520H + " at path " + getPath());
        } catch (NumberFormatException unused2) {
            throw new a89("Expected an int but was " + this.f19520H + " at path " + getPath());
        }
    }

    public final void r0(zq1 zq1Var) throws u89, EOFException {
        while (true) {
            long jR2 = this.f19521h.r2(zq1Var);
            if (jR2 == -1) {
                throw m35229Q("Unterminated string");
            }
            if (this.f19522q.m46918s(jR2) != 92) {
                this.f19522q.skip(jR2 + 1);
                return;
            } else {
                this.f19522q.skip(jR2 + 1);
                o0();
            }
        }
    }

    @Override // p001o.ka9
    /* renamed from: s */
    public String mo22739s() throws u89, EOFException {
        String strF0;
        int iM22728T = this.f19523s;
        if (iM22728T == 0) {
            iM22728T = m22728T();
        }
        if (iM22728T == 14) {
            strF0 = j0();
        } else if (iM22728T == 13) {
            strF0 = f0(f19516M);
        } else if (iM22728T == 12) {
            strF0 = f0(f19515L);
        } else {
            if (iM22728T != 15) {
                throw new a89("Expected a name but was " + mo22723C() + " at path " + getPath());
            }
            strF0 = this.f19520H;
        }
        this.f19523s = 0;
        this.f31739c[this.f31737a - 1] = strF0;
        return strF0;
    }

    @Override // p001o.ka9
    /* renamed from: t */
    public String mo22740t() throws u89, EOFException {
        String strT1;
        int iM22728T = this.f19523s;
        if (iM22728T == 0) {
            iM22728T = m22728T();
        }
        if (iM22728T == 10) {
            strT1 = j0();
        } else if (iM22728T == 9) {
            strT1 = f0(f19516M);
        } else if (iM22728T == 8) {
            strT1 = f0(f19515L);
        } else if (iM22728T == 11) {
            strT1 = this.f19520H;
            this.f19520H = null;
        } else if (iM22728T == 16) {
            strT1 = Long.toString(this.f19524x);
        } else {
            if (iM22728T != 17) {
                throw new a89("Expected a string but was " + mo22723C() + " at path " + getPath());
            }
            strT1 = this.f19522q.t1(this.f19525y);
        }
        this.f19523s = 0;
        int[] iArr = this.f31740d;
        int i = this.f31737a - 1;
        iArr[i] = iArr[i] + 1;
        return strT1;
    }

    public String toString() {
        return "JsonReader(" + this.f19521h + ")";
    }

    public final boolean u0() throws EOFException {
        long jMo32308W = this.f19521h.mo32308W(f19519Y);
        boolean z = jMo32308W != -1;
        rl1 rl1Var = this.f19522q;
        rl1Var.skip(z ? jMo32308W + r1.m59694L() : rl1Var.f0());
        return z;
    }

    public final void v0() throws EOFException {
        long jR2 = this.f19521h.r2(f19518X);
        rl1 rl1Var = this.f19522q;
        rl1Var.skip(jR2 != -1 ? jR2 + 1 : rl1Var.f0());
    }

    public final void y0() throws EOFException {
        long jR2 = this.f19521h.r2(f19517Q);
        rl1 rl1Var = this.f19522q;
        if (jR2 == -1) {
            jR2 = rl1Var.f0();
        }
        rl1Var.skip(jR2);
    }
}
