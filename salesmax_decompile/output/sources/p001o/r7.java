package p001o;

import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.lang.reflect.Field;
import org.apache.http.HttpStatus;
import org.apache.http.protocol.HTTP;
import org.objectweb.asm.Opcodes;

/* loaded from: classes6.dex */
public abstract class r7 implements zn7 {

    /* renamed from: v */
    public static int f43065v = 512;

    /* renamed from: x */
    public static /* synthetic */ Class f43067x;

    /* renamed from: d */
    public sl1 f43071d;

    /* renamed from: e */
    public sl1 f43072e;

    /* renamed from: f */
    public String f43073f;

    /* renamed from: m */
    public lm1 f43080m;

    /* renamed from: n */
    public y76 f43081n;

    /* renamed from: o */
    public int f43082o;

    /* renamed from: p */
    public int f43083p;

    /* renamed from: q */
    public sl1 f43084q;

    /* renamed from: r */
    public sl1 f43085r;

    /* renamed from: s */
    public sl1 f43086s;

    /* renamed from: t */
    public boolean f43087t;

    /* renamed from: u */
    public static final byte[] f43064u = new byte[0];

    /* renamed from: w */
    public static sl1[] f43066w = new sl1[HttpStatus.SC_HTTP_VERSION_NOT_SUPPORTED];

    /* renamed from: a */
    public int f43068a = 0;

    /* renamed from: b */
    public int f43069b = 0;

    /* renamed from: c */
    public int f43070c = 11;

    /* renamed from: g */
    public long f43074g = 0;

    /* renamed from: h */
    public long f43075h = -3;

    /* renamed from: i */
    public boolean f43076i = false;

    /* renamed from: j */
    public boolean f43077j = false;

    /* renamed from: k */
    public boolean f43078k = false;

    /* renamed from: l */
    public boolean f43079l = false;

    static {
        Class clsM46280r = f43067x;
        if (clsM46280r == null) {
            clsM46280r = m46280r("javax.servlet.http.HttpServletResponse");
            f43067x = clsM46280r;
        }
        Field[] declaredFields = clsM46280r.getDeclaredFields();
        for (int i = 0; i < declaredFields.length; i++) {
            if ((declaredFields[i].getModifiers() & 8) != 0 && declaredFields[i].getName().startsWith("SC_")) {
                try {
                    int i2 = declaredFields[i].getInt(null);
                    sl1[] sl1VarArr = f43066w;
                    if (i2 < sl1VarArr.length) {
                        sl1VarArr[i2] = new pp1(declaredFields[i].getName().substring(3));
                    }
                } catch (IllegalAccessException unused) {
                }
            }
        }
    }

    public r7(lm1 lm1Var, y76 y76Var, int i, int i2) {
        this.f43080m = lm1Var;
        this.f43081n = y76Var;
        this.f43082o = i;
        this.f43083p = i2;
    }

    /* renamed from: r */
    public static /* synthetic */ Class m46280r(String str) throws Throwable {
        try {
            return Class.forName(str);
        } catch (ClassNotFoundException e) {
            throw new NoClassDefFoundError().initCause(e);
        }
    }

    /* renamed from: s */
    public static String m46281s(int i) {
        sl1[] sl1VarArr = f43066w;
        sl1 sl1Var = i < sl1VarArr.length ? sl1VarArr[i] : null;
        return sl1Var == null ? czh.m22143e(i) : sl1Var.toString();
    }

    /* renamed from: t */
    public static sl1 m46282t(int i) {
        sl1[] sl1VarArr = f43066w;
        sl1 sl1Var = i < sl1VarArr.length ? sl1VarArr[i] : null;
        if (sl1Var == null) {
            return null;
        }
        return sl1Var;
    }

    @Override // p001o.zn7
    /* renamed from: a */
    public void mo28016a(boolean z) {
        this.f43068a = 0;
        this.f43069b = 0;
        this.f43070c = 11;
        this.f43071d = null;
        this.f43076i = false;
        this.f43077j = false;
        this.f43078k = false;
        this.f43079l = false;
        this.f43074g = 0L;
        this.f43075h = -3L;
        synchronized (this) {
            if (z) {
                sl1 sl1Var = this.f43084q;
                if (sl1Var != null) {
                    this.f43080m.mo37461j(sl1Var);
                }
                this.f43084q = null;
                sl1 sl1Var2 = this.f43085r;
                if (sl1Var2 != null) {
                    this.f43080m.mo37461j(sl1Var2);
                }
                this.f43085r = null;
            } else {
                sl1 sl1Var3 = this.f43084q;
                if (sl1Var3 != null) {
                    sl1Var3.clear();
                }
                sl1 sl1Var4 = this.f43085r;
                if (sl1Var4 != null) {
                    this.f43080m.mo37461j(sl1Var4);
                    this.f43085r = null;
                }
            }
        }
        this.f43086s = null;
        this.f43072e = null;
    }

    @Override // p001o.zn7
    /* renamed from: b */
    public boolean mo46283b() {
        return this.f43068a == 0 && this.f43072e == null && this.f43069b == 0;
    }

    @Override // p001o.zn7
    /* renamed from: c */
    public void mo28017c() {
        if (this.f43068a == 0) {
            throw new IllegalStateException("State==HEADER");
        }
        long j = this.f43075h;
        if (j < 0 || j == this.f43074g || this.f43077j) {
            return;
        }
        if (tia.m49926h()) {
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("ContentLength written==");
            stringBuffer.append(this.f43074g);
            stringBuffer.append(" != contentLength==");
            stringBuffer.append(this.f43075h);
            tia.m49920b(stringBuffer.toString());
        }
        this.f43079l = true;
    }

    @Override // p001o.zn7
    /* renamed from: e */
    public void mo46284e(int i, String str) {
        if (this.f43068a != 0) {
            throw new IllegalStateException("STATE!=START");
        }
        this.f43069b = i;
        if (str != null) {
            int length = str.length();
            int i2 = this.f43082o;
            if (length > i2 / 2) {
                length = i2 / 2;
            }
            this.f43071d = new pp1(length);
            for (int i3 = 0; i3 < length; i3++) {
                char cCharAt = str.charAt(i3);
                if (cCharAt == '\r' || cCharAt == '\n') {
                    this.f43071d.d1((byte) 32);
                } else {
                    this.f43071d.d1((byte) cCharAt);
                }
            }
        }
    }

    @Override // p001o.zn7
    /* renamed from: f */
    public boolean mo46285f() {
        return this.f43068a != 0;
    }

    @Override // p001o.zn7
    public abstract long flush();

    @Override // p001o.zn7
    /* renamed from: g */
    public void mo46286g() {
        if (this.f43068a >= 3) {
            throw new IllegalStateException("Flushed");
        }
        this.f43076i = false;
        this.f43079l = false;
        this.f43074g = 0L;
        this.f43075h = -3L;
        this.f43086s = null;
        sl1 sl1Var = this.f43085r;
        if (sl1Var != null) {
            sl1Var.clear();
        }
    }

    @Override // p001o.zn7
    /* renamed from: h */
    public abstract void mo28019h(e38 e38Var, boolean z);

    @Override // p001o.zn7
    /* renamed from: i */
    public boolean mo46287i() {
        long j = this.f43075h;
        return j >= 0 && this.f43074g >= j;
    }

    @Override // p001o.zn7
    public boolean isComplete() {
        return this.f43068a == 4;
    }

    @Override // p001o.zn7
    public boolean isPersistent() {
        return !this.f43079l;
    }

    @Override // p001o.zn7
    /* renamed from: j */
    public void mo46288j(boolean z) {
        this.f43079l = !z;
    }

    @Override // p001o.zn7
    /* renamed from: l */
    public void mo46289l(int i, String str, String str2, boolean z) {
        if (z) {
            this.f43079l = z;
        }
        if (mo46285f()) {
            return;
        }
        mo46284e(i, str);
        mo28019h(null, false);
        if (str2 != null) {
            mo28018d(new nvi(new pp1(str2)), true);
        }
        mo28017c();
    }

    @Override // p001o.zn7
    /* renamed from: m */
    public void mo46290m(boolean z) {
        this.f43077j = z;
    }

    @Override // p001o.zn7
    /* renamed from: n */
    public void mo46291n(boolean z) {
        this.f43087t = z;
    }

    @Override // p001o.zn7
    /* renamed from: o */
    public void mo46292o(long j) {
        if (j < 0) {
            this.f43075h = -3L;
        } else {
            this.f43075h = j;
        }
    }

    @Override // p001o.zn7
    public void setVersion(int i) {
        if (this.f43068a != 0) {
            throw new IllegalStateException("STATE!=START");
        }
        this.f43070c = i;
        if (i != 9 || this.f43072e == null) {
            return;
        }
        this.f43078k = true;
    }

    /* renamed from: u */
    public boolean m46293u() {
        return this.f43087t;
    }

    /* renamed from: v */
    public int m46294v() {
        return this.f43070c;
    }

    /* renamed from: w */
    public boolean mo28021w() {
        sl1 sl1Var = this.f43085r;
        if (sl1Var == null || sl1Var.V0() != 0) {
            sl1 sl1Var2 = this.f43086s;
            return sl1Var2 != null && sl1Var2.length() > 0;
        }
        if (this.f43085r.length() == 0 && !this.f43085r.y0()) {
            this.f43085r.R0();
        }
        return this.f43085r.V0() == 0;
    }

    /* renamed from: o.r7$a */
    public static class C16546a extends ygf {

        /* renamed from: b */
        public r7 f43088b;

        /* renamed from: c */
        public long f43089c;

        /* renamed from: d */
        public pp1 f43090d = new pp1(r7.f43064u);

        /* renamed from: e */
        public boolean f43091e;

        /* renamed from: f */
        public String f43092f;

        /* renamed from: g */
        public Writer f43093g;

        /* renamed from: h */
        public char[] f43094h;

        /* renamed from: q */
        public vp1 f43095q;

        public C16546a(r7 r7Var, long j) {
            this.f43088b = r7Var;
            this.f43089c = j;
        }

        /* renamed from: a */
        public void m46295a() throws IOException {
            if (this.f43088b.f43081n.mo51046c()) {
                try {
                    flush();
                    return;
                } catch (IOException e) {
                    this.f43088b.f43081n.close();
                    throw e;
                }
            }
            if (this.f43088b.f43081n.mo51047e(this.f43089c)) {
                this.f43088b.flush();
            } else {
                this.f43088b.f43081n.close();
                throw new dj6("timeout");
            }
        }

        /* renamed from: c */
        public void m46296c() {
            this.f43091e = false;
        }

        @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            this.f43091e = true;
        }

        /* renamed from: d */
        public final void m46297d(sl1 sl1Var) throws IOException {
            if (this.f43091e) {
                throw new IOException("Closed");
            }
            if (!this.f43088b.f43081n.isOpen()) {
                throw new dj6();
            }
            while (this.f43088b.mo28021w()) {
                m46295a();
                if (this.f43091e) {
                    throw new IOException("Closed");
                }
                if (!this.f43088b.f43081n.isOpen()) {
                    throw new dj6();
                }
            }
            this.f43088b.mo28018d(sl1Var, false);
            if (this.f43088b.mo28021w()) {
                flush();
            }
            if (this.f43088b.mo46287i()) {
                flush();
                close();
            }
            while (sl1Var.length() > 0 && this.f43088b.f43081n.isOpen()) {
                m46295a();
            }
        }

        @Override // java.io.OutputStream, java.io.Flushable
        public void flush() throws dj6 {
            r7 r7Var = this.f43088b;
            sl1 sl1Var = r7Var.f43086s;
            sl1 sl1Var2 = r7Var.f43085r;
            if ((sl1Var == null || sl1Var.length() <= 0) && ((sl1Var2 == null || sl1Var2.length() <= 0) && !this.f43088b.mo28021w())) {
                return;
            }
            this.f43088b.flush();
            while (true) {
                if (((sl1Var == null || sl1Var.length() <= 0) && (sl1Var2 == null || sl1Var2.length() <= 0)) || !this.f43088b.f43081n.isOpen()) {
                    return;
                } else {
                    m46295a();
                }
            }
        }

        @Override // java.io.OutputStream
        public void write(byte[] bArr, int i, int i2) throws IOException {
            this.f43090d.m44000h(bArr, i, i2);
            m46297d(this.f43090d);
            this.f43090d.m43999g(r7.f43064u);
        }

        @Override // java.io.OutputStream
        public void write(byte[] bArr) throws IOException {
            this.f43090d.m43999g(bArr);
            m46297d(this.f43090d);
            this.f43090d.m43999g(r7.f43064u);
        }

        @Override // java.io.OutputStream
        public void write(int i) throws IOException {
            if (!this.f43091e) {
                if (this.f43088b.f43081n.isOpen()) {
                    while (this.f43088b.mo28021w()) {
                        m46295a();
                        if (!this.f43091e) {
                            if (!this.f43088b.f43081n.isOpen()) {
                                throw new dj6();
                            }
                        } else {
                            throw new IOException("Closed");
                        }
                    }
                    if (this.f43088b.mo28020k((byte) i)) {
                        flush();
                    }
                    if (this.f43088b.mo46287i()) {
                        flush();
                        close();
                        return;
                    }
                    return;
                }
                throw new dj6();
            }
            throw new IOException("Closed");
        }
    }

    /* renamed from: o.r7$b */
    public static class C16547b extends Writer {

        /* renamed from: a */
        public C16546a f43096a;

        /* renamed from: b */
        public r7 f43097b;

        /* renamed from: c */
        public int f43098c;

        public C16547b(C16546a c16546a) {
            this.f43096a = c16546a;
            this.f43097b = c16546a.f43088b;
        }

        /* renamed from: a */
        public final Writer m46298a() {
            C16546a c16546a = this.f43096a;
            if (c16546a.f43093g == null) {
                C16546a c16546a2 = this.f43096a;
                c16546a.f43093g = new OutputStreamWriter(c16546a2.f43095q, c16546a2.f43092f);
            }
            return this.f43096a.f43093g;
        }

        /* renamed from: c */
        public void m46299c(String str) {
            if (str == null || s8g.f44982b.equalsIgnoreCase(str)) {
                this.f43098c = 1;
            } else if (HTTP.UTF_8.equalsIgnoreCase(str)) {
                this.f43098c = 2;
            } else {
                this.f43098c = 0;
                String str2 = this.f43096a.f43092f;
                if (str2 == null || !str2.equalsIgnoreCase(str)) {
                    this.f43096a.f43093g = null;
                }
            }
            C16546a c16546a = this.f43096a;
            c16546a.f43092f = str;
            if (c16546a.f43095q == null) {
                c16546a.f43095q = new vp1(r7.f43065v);
            }
        }

        @Override // java.io.Writer, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            this.f43096a.close();
        }

        @Override // java.io.Writer, java.io.Flushable
        public void flush() throws dj6 {
            this.f43096a.flush();
        }

        @Override // java.io.Writer
        public void write(String str, int i, int i2) throws IOException {
            while (i2 > r7.f43065v) {
                write(str, i, r7.f43065v);
                i += r7.f43065v;
                i2 -= r7.f43065v;
            }
            C16546a c16546a = this.f43096a;
            if (c16546a.f43094h == null) {
                c16546a.f43094h = new char[r7.f43065v];
            }
            char[] cArr = this.f43096a.f43094h;
            str.getChars(i, i + i2, cArr, 0);
            write(cArr, 0, i2);
        }

        /* JADX WARN: Removed duplicated region for block: B:90:0x0154 A[SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:92:0x0157 A[SYNTHETIC] */
        @Override // java.io.Writer
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public void write(char[] cArr, int i, int i2) throws IOException {
            int i3;
            C16546a c16546a = this.f43096a;
            while (i2 > 0) {
                c16546a.f43095q.reset();
                int length = i2 > r7.f43065v ? r7.f43065v : i2;
                int i4 = this.f43098c;
                if (i4 != 0) {
                    int i5 = 0;
                    if (i4 == 1) {
                        byte[] bArrM53158a = c16546a.f43095q.m53158a();
                        int count = c16546a.f43095q.getCount();
                        if (length > bArrM53158a.length - count) {
                            length = bArrM53158a.length - count;
                        }
                        while (i5 < length) {
                            char c = cArr[i + i5];
                            int i6 = count + 1;
                            if (c >= 256) {
                                c = '?';
                            }
                            bArrM53158a[count] = (byte) c;
                            i5++;
                            count = i6;
                        }
                        if (count >= 0) {
                            c16546a.f43095q.m53159c(count);
                        }
                    } else if (i4 == 2) {
                        byte[] bArrM53158a2 = c16546a.f43095q.m53158a();
                        int count2 = c16546a.f43095q.getCount();
                        if (count2 + length > bArrM53158a2.length) {
                            length = bArrM53158a2.length - count2;
                        }
                        while (i5 < length) {
                            char c2 = cArr[i + i5];
                            if ((c2 & 65408) != 0) {
                                if ((c2 & 63488) != 0) {
                                    if ((0 & c2) != 0) {
                                        if ((0 & c2) != 0) {
                                            if ((0 & c2) == 0) {
                                                if (count2 + 5 <= bArrM53158a2.length) {
                                                    int i7 = count2 + 1;
                                                    bArrM53158a2[count2] = (byte) ((c2 >> 24) | 248);
                                                    int i8 = i7 + 1;
                                                    bArrM53158a2[i7] = (byte) (((c2 >> 18) & 63) | 128);
                                                    int i9 = i8 + 1;
                                                    bArrM53158a2[i8] = (byte) (((c2 >> '\f') & 63) | 128);
                                                    int i10 = i9 + 1;
                                                    bArrM53158a2[i9] = (byte) (((c2 >> 6) & 63) | 128);
                                                    i3 = i10 + 1;
                                                    bArrM53158a2[i10] = (byte) ((c2 & '?') | 128);
                                                    count2 = i3;
                                                    if (count2 == bArrM53158a2.length) {
                                                    }
                                                }
                                            } else {
                                                if ((0 & c2) == 0) {
                                                    if (count2 + 6 <= bArrM53158a2.length) {
                                                        int i11 = count2 + 1;
                                                        bArrM53158a2[count2] = (byte) ((c2 >> 30) | 252);
                                                        int i12 = i11 + 1;
                                                        bArrM53158a2[i11] = (byte) (((c2 >> 24) & 63) | 128);
                                                        int i13 = i12 + 1;
                                                        bArrM53158a2[i12] = (byte) (((c2 >> 18) & 63) | 128);
                                                        int i14 = i13 + 1;
                                                        bArrM53158a2[i13] = (byte) (((c2 >> '\f') & 63) | 128);
                                                        int i15 = i14 + 1;
                                                        bArrM53158a2[i14] = (byte) (((c2 >> 6) & 63) | 128);
                                                        count2 = i15 + 1;
                                                        bArrM53158a2[i15] = (byte) ((c2 & '?') | 128);
                                                    }
                                                } else {
                                                    bArrM53158a2[count2] = 63;
                                                    count2++;
                                                }
                                                if (count2 == bArrM53158a2.length) {
                                                }
                                            }
                                            length = i5;
                                            break;
                                        }
                                        if (count2 + 4 > bArrM53158a2.length) {
                                            length = i5;
                                            break;
                                        }
                                        int i16 = count2 + 1;
                                        bArrM53158a2[count2] = (byte) ((c2 >> 18) | 240);
                                        int i17 = i16 + 1;
                                        bArrM53158a2[i16] = (byte) (((c2 >> '\f') & 63) | 128);
                                        int i18 = i17 + 1;
                                        bArrM53158a2[i17] = (byte) (((c2 >> 6) & 63) | 128);
                                        count2 = i18 + 1;
                                        bArrM53158a2[i18] = (byte) ((c2 & '?') | 128);
                                        if (count2 == bArrM53158a2.length) {
                                        }
                                    } else {
                                        if (count2 + 3 > bArrM53158a2.length) {
                                            length = i5;
                                            break;
                                        }
                                        int i19 = count2 + 1;
                                        bArrM53158a2[count2] = (byte) ((c2 >> '\f') | 224);
                                        int i20 = i19 + 1;
                                        bArrM53158a2[i19] = (byte) (((c2 >> 6) & 63) | 128);
                                        i3 = i20 + 1;
                                        bArrM53158a2[i20] = (byte) ((c2 & '?') | 128);
                                        count2 = i3;
                                        if (count2 == bArrM53158a2.length) {
                                        }
                                    }
                                } else {
                                    if (count2 + 2 > bArrM53158a2.length) {
                                        length = i5;
                                        break;
                                    }
                                    int i21 = count2 + 1;
                                    bArrM53158a2[count2] = (byte) ((c2 >> 6) | Opcodes.CHECKCAST);
                                    count2 = i21 + 1;
                                    bArrM53158a2[i21] = (byte) ((c2 & '?') | 128);
                                    if (count2 == bArrM53158a2.length) {
                                        i5++;
                                        length = i5;
                                        break;
                                    }
                                    i5++;
                                }
                            } else {
                                int i22 = count2 + 1;
                                if (i22 > bArrM53158a2.length) {
                                    length = i5;
                                    break;
                                } else {
                                    bArrM53158a2[count2] = (byte) c2;
                                    count2 = i22;
                                    i5++;
                                }
                            }
                        }
                        c16546a.f43095q.m53159c(count2);
                    } else {
                        throw new IllegalStateException();
                    }
                } else {
                    Writer writerM46298a = m46298a();
                    writerM46298a.write(cArr, i, length);
                    writerM46298a.flush();
                }
                c16546a.f43095q.writeTo(c16546a);
                i2 -= length;
                i += length;
            }
        }
    }
}
