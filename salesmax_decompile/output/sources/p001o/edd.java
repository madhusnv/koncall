package p001o;

/* loaded from: classes2.dex */
public abstract class edd {

    /* renamed from: a */
    public static final C13162a f21438a = new C13162a(null);

    /* renamed from: b */
    public static final int f21439b = m24805f(0);

    /* renamed from: c */
    public static final int f21440c = m24805f(1);

    /* renamed from: d */
    public static final int f21441d = m24805f(2);

    /* renamed from: e */
    public static final int f21442e = m24805f(3);

    /* renamed from: f */
    public static final int f21443f = m24805f(4);

    /* renamed from: o.edd$a */
    public static final class C13162a {
        public C13162a() {
        }

        public /* synthetic */ C13162a(id5 id5Var) {
            this();
        }

        /* renamed from: a */
        public final int m24809a() {
            return edd.f21443f;
        }

        /* renamed from: b */
        public final int m24810b() {
            return edd.f21441d;
        }

        /* renamed from: c */
        public final int m24811c() {
            return edd.f21442e;
        }

        /* renamed from: d */
        public final int m24812d() {
            return edd.f21440c;
        }

        /* renamed from: e */
        public final int m24813e() {
            return edd.f21439b;
        }
    }

    /* renamed from: f */
    public static int m24805f(int i) {
        return i;
    }

    /* renamed from: g */
    public static final boolean m24806g(int i, int i2) {
        return i == i2;
    }

    /* renamed from: h */
    public static int m24807h(int i) {
        return Integer.hashCode(i);
    }

    /* renamed from: i */
    public static String m24808i(int i) {
        return i != 1 ? i != 2 ? i != 3 ? i != 4 ? "Unknown" : "Eraser" : "Stylus" : "Mouse" : "Touch";
    }
}
