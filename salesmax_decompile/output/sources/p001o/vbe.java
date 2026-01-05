package p001o;

import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import java.io.Serializable;

/* loaded from: classes6.dex */
public abstract class vbe {

    /* renamed from: a */
    public static final C17544a f50091a = new C17544a(null);

    /* renamed from: b */
    public static final vbe f50092b = k9d.f31711a.mo28093b();

    /* renamed from: o.vbe$a */
    public static final class C17544a extends vbe implements Serializable {

        /* renamed from: o.vbe$a$a */
        public static final class a implements Serializable {

            /* renamed from: a */
            public static final a f50093a = new a();

            private final Object readResolve() {
                return vbe.f50091a;
            }
        }

        public /* synthetic */ C17544a(id5 id5Var) {
            this();
        }

        private final Object writeReplace() {
            return a.f50093a;
        }

        @Override // p001o.vbe
        /* renamed from: b */
        public int mo22610b(int i) {
            return vbe.f50092b.mo22610b(i);
        }

        @Override // p001o.vbe
        /* renamed from: c */
        public double mo22611c() {
            return vbe.f50092b.mo22611c();
        }

        @Override // p001o.vbe
        /* renamed from: d */
        public double mo18507d(double d) {
            return vbe.f50092b.mo18507d(d);
        }

        @Override // p001o.vbe
        /* renamed from: e */
        public double mo52510e(double d, double d2) {
            return vbe.f50092b.mo52510e(d, d2);
        }

        @Override // p001o.vbe
        /* renamed from: f */
        public int mo22612f() {
            return vbe.f50092b.mo22612f();
        }

        @Override // p001o.vbe
        /* renamed from: g */
        public int mo22613g(int i) {
            return vbe.f50092b.mo22613g(i);
        }

        @Override // p001o.vbe
        /* renamed from: h */
        public int mo18508h(int i, int i2) {
            return vbe.f50092b.mo18508h(i, i2);
        }

        @Override // p001o.vbe
        /* renamed from: i */
        public long mo22614i() {
            return vbe.f50092b.mo22614i();
        }

        public C17544a() {
        }
    }

    /* renamed from: b */
    public abstract int mo22610b(int i);

    /* renamed from: c */
    public abstract double mo22611c();

    /* renamed from: d */
    public double mo18507d(double d) {
        return mo52510e(FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE, d);
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x003d  */
    /* renamed from: e */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public double mo52510e(double d, double d2) {
        double dMo22611c;
        ybe.m57472b(d, d2);
        double d3 = d2 - d;
        if (Double.isInfinite(d3)) {
            if ((Double.isInfinite(d) || Double.isNaN(d)) ? false : true) {
                if ((Double.isInfinite(d2) || Double.isNaN(d2)) ? false : true) {
                    double d4 = 2;
                    double dMo22611c2 = mo22611c() * ((d2 / d4) - (d / d4));
                    dMo22611c = d + dMo22611c2 + dMo22611c2;
                }
            } else {
                dMo22611c = d + (mo22611c() * d3);
            }
        }
        return dMo22611c >= d2 ? Math.nextAfter(d2, Double.NEGATIVE_INFINITY) : dMo22611c;
    }

    /* renamed from: f */
    public abstract int mo22612f();

    /* renamed from: g */
    public abstract int mo22613g(int i);

    /* renamed from: h */
    public int mo18508h(int i, int i2) {
        int iMo22612f;
        int i3;
        int iMo22610b;
        int iMo22612f2;
        boolean z;
        ybe.m57473c(i, i2);
        int i4 = i2 - i;
        if (i4 > 0 || i4 == Integer.MIN_VALUE) {
            if (((-i4) & i4) == i4) {
                iMo22610b = mo22610b(ybe.m57474d(i4));
            } else {
                do {
                    iMo22612f = mo22612f() >>> 1;
                    i3 = iMo22612f % i4;
                } while ((iMo22612f - i3) + (i4 - 1) < 0);
                iMo22610b = i3;
            }
            return i + iMo22610b;
        }
        do {
            iMo22612f2 = mo22612f();
            z = false;
            if (i <= iMo22612f2 && iMo22612f2 < i2) {
                z = true;
            }
        } while (!z);
        return iMo22612f2;
    }

    /* renamed from: i */
    public abstract long mo22614i();
}
