package p001o;

import java.util.Arrays;
import java.util.List;

/* loaded from: classes3.dex */
public class glf implements z24 {

    /* renamed from: a */
    public final String f25420a;

    /* renamed from: b */
    public final List f25421b;

    /* renamed from: c */
    public final boolean f25422c;

    public glf(String str, List list, boolean z) {
        this.f25420a = str;
        this.f25421b = list;
        this.f25422c = z;
    }

    @Override // p001o.z24
    /* renamed from: a */
    public j14 mo16967a(ema emaVar, hc1 hc1Var) {
        return new x14(emaVar, hc1Var, this);
    }

    /* renamed from: b */
    public List m29011b() {
        return this.f25421b;
    }

    /* renamed from: c */
    public String m29012c() {
        return this.f25420a;
    }

    /* renamed from: d */
    public boolean m29013d() {
        return this.f25422c;
    }

    public String toString() {
        return "ShapeGroup{name='" + this.f25420a + "' Shapes: " + Arrays.toString(this.f25421b.toArray()) + '}';
    }
}
