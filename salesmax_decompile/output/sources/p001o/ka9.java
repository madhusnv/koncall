package p001o;

import java.io.Closeable;
import java.io.IOException;
import java.util.Arrays;

/* loaded from: classes3.dex */
public abstract class ka9 implements Closeable {

    /* renamed from: g */
    public static final String[] f31736g = new String[128];

    /* renamed from: a */
    public int f31737a;

    /* renamed from: b */
    public int[] f31738b = new int[32];

    /* renamed from: c */
    public String[] f31739c = new String[32];

    /* renamed from: d */
    public int[] f31740d = new int[32];

    /* renamed from: e */
    public boolean f31741e;

    /* renamed from: f */
    public boolean f31742f;

    /* renamed from: o.ka9$a */
    public static final class C14756a {

        /* renamed from: a */
        public final String[] f31743a;

        /* renamed from: b */
        public final qec f31744b;

        public C14756a(String[] strArr, qec qecVar) {
            this.f31743a = strArr;
            this.f31744b = qecVar;
        }

        /* renamed from: a */
        public static C14756a m35230a(String... strArr) {
            try {
                zq1[] zq1VarArr = new zq1[strArr.length];
                rl1 rl1Var = new rl1();
                for (int i = 0; i < strArr.length; i++) {
                    ka9.m35225O(rl1Var, strArr[i]);
                    rl1Var.readByte();
                    zq1VarArr[i] = rl1Var.m46906O();
                }
                return new C14756a((String[]) strArr.clone(), qec.m45280A(zq1VarArr));
            } catch (IOException e) {
                throw new AssertionError(e);
            }
        }
    }

    /* renamed from: o.ka9$b */
    public enum EnumC14757b {
        BEGIN_ARRAY,
        END_ARRAY,
        BEGIN_OBJECT,
        END_OBJECT,
        NAME,
        STRING,
        NUMBER,
        BOOLEAN,
        NULL,
        END_DOCUMENT
    }

    static {
        for (int i = 0; i <= 31; i++) {
            f31736g[i] = String.format("\\u%04x", Integer.valueOf(i));
        }
        String[] strArr = f31736g;
        strArr[34] = "\\\"";
        strArr[92] = "\\\\";
        strArr[9] = "\\t";
        strArr[8] = "\\b";
        strArr[10] = "\\n";
        strArr[13] = "\\r";
        strArr[12] = "\\f";
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x002b  */
    /* renamed from: O */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void m35225O(gm1 gm1Var, String str) {
        String str2;
        String[] strArr = f31736g;
        gm1Var.T1(34);
        int length = str.length();
        int i = 0;
        for (int i2 = 0; i2 < length; i2++) {
            char cCharAt = str.charAt(i2);
            if (cCharAt < 128) {
                str2 = strArr[cCharAt];
                if (str2 != null) {
                    if (i < i2) {
                        gm1Var.mo29025i(str, i, i2);
                    }
                    gm1Var.n0(str2);
                    i = i2 + 1;
                }
            } else {
                if (cCharAt == 8232) {
                    str2 = "\\u2028";
                } else if (cCharAt == 8233) {
                    str2 = "\\u2029";
                }
                if (i < i2) {
                }
                gm1Var.n0(str2);
                i = i2 + 1;
            }
        }
        if (i < length) {
            gm1Var.mo29025i(str, i, length);
        }
        gm1Var.T1(34);
    }

    /* renamed from: u */
    public static ka9 m35227u(im1 im1Var) {
        return new db9(im1Var);
    }

    /* renamed from: C */
    public abstract EnumC14757b mo22723C();

    /* renamed from: D */
    public final void m35228D(int i) {
        int i2 = this.f31737a;
        int[] iArr = this.f31738b;
        if (i2 == iArr.length) {
            if (i2 == 256) {
                throw new a89("Nesting too deep at " + getPath());
            }
            this.f31738b = Arrays.copyOf(iArr, iArr.length * 2);
            String[] strArr = this.f31739c;
            this.f31739c = (String[]) Arrays.copyOf(strArr, strArr.length * 2);
            int[] iArr2 = this.f31740d;
            this.f31740d = Arrays.copyOf(iArr2, iArr2.length * 2);
        }
        int[] iArr3 = this.f31738b;
        int i3 = this.f31737a;
        this.f31737a = i3 + 1;
        iArr3[i3] = i;
    }

    /* renamed from: H */
    public abstract int mo22724H(C14756a c14756a);

    /* renamed from: J */
    public abstract void mo22725J();

    /* renamed from: K */
    public abstract void mo22726K();

    /* renamed from: Q */
    public final u89 m35229Q(String str) throws u89 {
        throw new u89(str + " at path " + getPath());
    }

    /* renamed from: c */
    public abstract void mo22731c();

    /* renamed from: d */
    public abstract void mo22732d();

    /* renamed from: f */
    public abstract void mo22733f();

    /* renamed from: g */
    public abstract void mo22734g();

    public final String getPath() {
        return ma9.m38628a(this.f31737a, this.f31738b, this.f31739c, this.f31740d);
    }

    /* renamed from: h */
    public abstract boolean mo22735h();

    /* renamed from: k */
    public abstract boolean mo22736k();

    /* renamed from: o */
    public abstract double mo22737o();

    /* renamed from: r */
    public abstract int mo22738r();

    /* renamed from: s */
    public abstract String mo22739s();

    /* renamed from: t */
    public abstract String mo22740t();
}
