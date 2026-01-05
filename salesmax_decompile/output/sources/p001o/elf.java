package p001o;

import android.graphics.Path;

/* loaded from: classes3.dex */
public class elf implements z24 {

    /* renamed from: a */
    public final boolean f21811a;

    /* renamed from: b */
    public final Path.FillType f21812b;

    /* renamed from: c */
    public final String f21813c;

    /* renamed from: d */
    public final eg0 f21814d;

    /* renamed from: e */
    public final hg0 f21815e;

    /* renamed from: f */
    public final boolean f21816f;

    public elf(String str, boolean z, Path.FillType fillType, eg0 eg0Var, hg0 hg0Var, boolean z2) {
        this.f21813c = str;
        this.f21811a = z;
        this.f21812b = fillType;
        this.f21814d = eg0Var;
        this.f21815e = hg0Var;
        this.f21816f = z2;
    }

    @Override // p001o.z24
    /* renamed from: a */
    public j14 mo16967a(ema emaVar, hc1 hc1Var) {
        return new c07(emaVar, hc1Var, this);
    }

    /* renamed from: b */
    public eg0 m25215b() {
        return this.f21814d;
    }

    /* renamed from: c */
    public Path.FillType m25216c() {
        return this.f21812b;
    }

    /* renamed from: d */
    public String m25217d() {
        return this.f21813c;
    }

    /* renamed from: e */
    public hg0 m25218e() {
        return this.f21815e;
    }

    /* renamed from: f */
    public boolean m25219f() {
        return this.f21816f;
    }

    public String toString() {
        return "ShapeFill{color=, fillEnabled=" + this.f21811a + '}';
    }
}
