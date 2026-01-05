package p001o;

import androidx.media3.common.C2181a;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes2.dex */
public final class euh {

    /* renamed from: b */
    public static final euh f22201b = new euh(nf8.m40499E());

    /* renamed from: c */
    public static final String f22202c = sqi.B0(0);

    /* renamed from: a */
    public final nf8 f22203a;

    /* renamed from: o.euh$a */
    public static final class C13263a {

        /* renamed from: f */
        public static final String f22204f = sqi.B0(0);

        /* renamed from: g */
        public static final String f22205g = sqi.B0(1);

        /* renamed from: h */
        public static final String f22206h = sqi.B0(3);

        /* renamed from: i */
        public static final String f22207i = sqi.B0(4);

        /* renamed from: a */
        public final int f22208a;

        /* renamed from: b */
        public final qth f22209b;

        /* renamed from: c */
        public final boolean f22210c;

        /* renamed from: d */
        public final int[] f22211d;

        /* renamed from: e */
        public final boolean[] f22212e;

        public C13263a(qth qthVar, boolean z, int[] iArr, boolean[] zArr) {
            int i = qthVar.f42400a;
            this.f22208a = i;
            boolean z2 = false;
            op0.m42511a(i == iArr.length && i == zArr.length);
            this.f22209b = qthVar;
            if (z && i > 1) {
                z2 = true;
            }
            this.f22210c = z2;
            this.f22211d = (int[]) iArr.clone();
            this.f22212e = (boolean[]) zArr.clone();
        }

        /* renamed from: a */
        public qth m25632a() {
            return this.f22209b;
        }

        /* renamed from: b */
        public C2181a m25633b(int i) {
            return this.f22209b.m45839a(i);
        }

        /* renamed from: c */
        public int m25634c() {
            return this.f22209b.f42402c;
        }

        /* renamed from: d */
        public boolean m25635d() {
            return this.f22210c;
        }

        /* renamed from: e */
        public boolean m25636e() {
            return ik1.m32230b(this.f22212e, true);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || C13263a.class != obj.getClass()) {
                return false;
            }
            C13263a c13263a = (C13263a) obj;
            return this.f22210c == c13263a.f22210c && this.f22209b.equals(c13263a.f22209b) && Arrays.equals(this.f22211d, c13263a.f22211d) && Arrays.equals(this.f22212e, c13263a.f22212e);
        }

        /* renamed from: f */
        public boolean m25637f(boolean z) {
            for (int i = 0; i < this.f22211d.length; i++) {
                if (m25640i(i, z)) {
                    return true;
                }
            }
            return false;
        }

        /* renamed from: g */
        public boolean m25638g(int i) {
            return this.f22212e[i];
        }

        /* renamed from: h */
        public boolean m25639h(int i) {
            return m25640i(i, false);
        }

        public int hashCode() {
            return (((((this.f22209b.hashCode() * 31) + (this.f22210c ? 1 : 0)) * 31) + Arrays.hashCode(this.f22211d)) * 31) + Arrays.hashCode(this.f22212e);
        }

        /* renamed from: i */
        public boolean m25640i(int i, boolean z) {
            int i2 = this.f22211d[i];
            return i2 == 4 || (z && i2 == 3);
        }
    }

    public euh(List list) {
        this.f22203a = nf8.m40511y(list);
    }

    /* renamed from: a */
    public nf8 m25627a() {
        return this.f22203a;
    }

    /* renamed from: b */
    public boolean m25628b() {
        return this.f22203a.isEmpty();
    }

    /* renamed from: c */
    public boolean m25629c(int i) {
        for (int i2 = 0; i2 < this.f22203a.size(); i2++) {
            C13263a c13263a = (C13263a) this.f22203a.get(i2);
            if (c13263a.m25636e() && c13263a.m25634c() == i) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: d */
    public boolean m25630d(int i) {
        return m25631e(i, false);
    }

    /* renamed from: e */
    public boolean m25631e(int i, boolean z) {
        for (int i2 = 0; i2 < this.f22203a.size(); i2++) {
            if (((C13263a) this.f22203a.get(i2)).m25634c() == i && ((C13263a) this.f22203a.get(i2)).m25637f(z)) {
                return true;
            }
        }
        return false;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || euh.class != obj.getClass()) {
            return false;
        }
        return this.f22203a.equals(((euh) obj).f22203a);
    }

    public int hashCode() {
        return this.f22203a.hashCode();
    }
}
