package p001o;

import p001o.ux5;

/* loaded from: classes2.dex */
public abstract class wx5 {

    /* renamed from: a */
    public static final C17996a f52831a = new C17996a(null);

    /* renamed from: b */
    public static final long f52832b;

    /* renamed from: c */
    public static final long f52833c;

    /* renamed from: o.wx5$a */
    public static final class C17996a {
        public C17996a() {
        }

        public /* synthetic */ C17996a(id5 id5Var) {
            this();
        }

        /* renamed from: a */
        public final long m55323a() {
            return wx5.f52833c;
        }

        /* renamed from: b */
        public final long m55324b() {
            return wx5.f52832b;
        }
    }

    static {
        float f = 0;
        f52832b = vx5.m53535a(ux5.m52097c(f), ux5.m52097c(f));
        ux5.C17466a c17466a = ux5.f49589a;
        f52833c = vx5.m53535a(c17466a.m52098a(), c17466a.m52098a());
    }

    /* renamed from: c */
    public static long m55320c(long j) {
        return j;
    }

    /* renamed from: d */
    public static final float m55321d(long j) {
        if (!(j != f52833c)) {
            throw new IllegalStateException("DpSize is unspecified".toString());
        }
        e37 e37Var = e37.f20857a;
        return ux5.m52097c(Float.intBitsToFloat((int) (j & 4294967295L)));
    }

    /* renamed from: e */
    public static final float m55322e(long j) {
        if (!(j != f52833c)) {
            throw new IllegalStateException("DpSize is unspecified".toString());
        }
        e37 e37Var = e37.f20857a;
        return ux5.m52097c(Float.intBitsToFloat((int) (j >> 32)));
    }
}
