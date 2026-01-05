package p001o;

import org.objectweb.asm.Opcodes;
import p001o.vbe;

/* loaded from: classes3.dex */
public final class pri {

    /* renamed from: d */
    public static final C16169a f40455d = new C16169a(null);

    /* renamed from: e */
    public static final char[] f40456e;

    /* renamed from: f */
    public static final vbe.C17544a f40457f;

    /* renamed from: g */
    public static final long f40458g;

    /* renamed from: h */
    public static final long f40459h;

    /* renamed from: i */
    public static final long f40460i;

    /* renamed from: j */
    public static final long f40461j;

    /* renamed from: a */
    public final long f40462a;

    /* renamed from: b */
    public final long f40463b;

    /* renamed from: c */
    public final String f40464c;

    /* renamed from: o.pri$a */
    public static final class C16169a {
        public C16169a() {
        }

        public /* synthetic */ C16169a(id5 id5Var) {
            this();
        }

        /* renamed from: b */
        public final pri m44098b() {
            return new pri((pri.f40457f.mo22614i() & (~pri.f40458g)) | pri.f40459h, (pri.f40457f.mo22614i() & (~pri.f40460i)) | pri.f40461j);
        }

        /* renamed from: c */
        public final String m44099c(long j, long j2) {
            char[] cArr = new char[36];
            m44100d(j, 0, cArr, 0, 4);
            cArr[8] = '-';
            m44100d(j, 4, cArr, 9, 2);
            cArr[13] = '-';
            m44100d(j, 6, cArr, 14, 2);
            cArr[18] = '-';
            m44100d(j2, 0, cArr, 19, 2);
            cArr[23] = '-';
            m44100d(j2, 2, cArr, 24, 6);
            return e9g.m24598p(cArr);
        }

        /* renamed from: d */
        public final void m44100d(long j, int i, char[] cArr, int i2, int i3) {
            int i4 = 64 - (i * 8);
            int i5 = i3 * 2;
            int i6 = 0;
            while (i6 < i5) {
                i4 -= 4;
                cArr[i2] = pri.f40456e[(int) ((j >> i4) & 15)];
                i6++;
                i2++;
            }
        }
    }

    static {
        char[] charArray = "0123456789abcdef".toCharArray();
        sq8.m48648g(charArray, "toCharArray(...)");
        f40456e = charArray;
        f40457f = vbe.f50091a;
        f40458g = 61440 & 4294967295L;
        f40459h = Opcodes.ACC_ENUM & 4294967295L;
        f40460i = -4611686018427387904L;
        f40461j = Long.MIN_VALUE;
    }

    public pri(long j, long j2) {
        this.f40462a = j;
        this.f40463b = j2;
        this.f40464c = f40455d.m44099c(j, j2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pri)) {
            return false;
        }
        pri priVar = (pri) obj;
        return this.f40462a == priVar.f40462a && this.f40463b == priVar.f40463b;
    }

    public int hashCode() {
        return (Long.hashCode(this.f40462a) * 31) + Long.hashCode(this.f40463b);
    }

    public String toString() {
        return this.f40464c;
    }
}
