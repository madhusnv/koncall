package p001o;

/* loaded from: classes6.dex */
public abstract class vk3 extends uk3 {
    /* renamed from: i */
    public static final float m52897i(float f, float... fArr) {
        sq8.m48649h(fArr, "other");
        for (float f2 : fArr) {
            f = Math.max(f, f2);
        }
        return f;
    }

    /* renamed from: j */
    public static final Comparable m52898j(Comparable comparable, Comparable comparable2) {
        sq8.m48649h(comparable, "a");
        sq8.m48649h(comparable2, "b");
        return comparable.compareTo(comparable2) >= 0 ? comparable : comparable2;
    }

    /* renamed from: k */
    public static final float m52899k(float f, float... fArr) {
        sq8.m48649h(fArr, "other");
        for (float f2 : fArr) {
            f = Math.min(f, f2);
        }
        return f;
    }
}
