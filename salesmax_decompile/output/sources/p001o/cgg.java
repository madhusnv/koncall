package p001o;

import android.util.Size;
import java.util.Map;

/* loaded from: classes2.dex */
public abstract class cgg {
    /* renamed from: a */
    public static cgg m21211a(Size size, Map map, Size size2, Map map2, Size size3, Map map3, Map map4) {
        return new v51(size, map, size2, map2, size3, map3, map4);
    }

    /* renamed from: b */
    public abstract Size mo21212b();

    /* renamed from: c */
    public Size m21213c(int i) {
        return (Size) mo21214d().get(Integer.valueOf(i));
    }

    /* renamed from: d */
    public abstract Map mo21214d();

    /* renamed from: e */
    public abstract Size mo21215e();

    /* renamed from: f */
    public abstract Size mo21216f();

    /* renamed from: g */
    public Size m21217g(int i) {
        return (Size) mo21218h().get(Integer.valueOf(i));
    }

    /* renamed from: h */
    public abstract Map mo21218h();

    /* renamed from: i */
    public Size m21219i(int i) {
        return (Size) mo21220j().get(Integer.valueOf(i));
    }

    /* renamed from: j */
    public abstract Map mo21220j();

    /* renamed from: k */
    public Size m21221k(int i) {
        return (Size) mo21222l().get(Integer.valueOf(i));
    }

    /* renamed from: l */
    public abstract Map mo21222l();
}
