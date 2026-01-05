package p001o;

/* loaded from: classes5.dex */
public abstract class xj6 {
    /* renamed from: d */
    public static xj6 m56376d(int i, Object obj) {
        return new m41(Integer.valueOf(i), obj, fid.DEFAULT);
    }

    /* renamed from: e */
    public static xj6 m56377e(Object obj) {
        return new m41(null, obj, fid.DEFAULT);
    }

    /* renamed from: f */
    public static xj6 m56378f(int i, Object obj) {
        return new m41(Integer.valueOf(i), obj, fid.VERY_LOW);
    }

    /* renamed from: g */
    public static xj6 m56379g(Object obj) {
        return new m41(null, obj, fid.VERY_LOW);
    }

    /* renamed from: h */
    public static xj6 m56380h(Object obj) {
        return new m41(null, obj, fid.HIGHEST);
    }

    /* renamed from: a */
    public abstract Integer mo38281a();

    /* renamed from: b */
    public abstract Object mo38282b();

    /* renamed from: c */
    public abstract fid mo38283c();
}
