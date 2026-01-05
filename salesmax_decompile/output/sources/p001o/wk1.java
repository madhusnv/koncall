package p001o;

/* loaded from: classes3.dex */
public class wk1 extends e36 implements Cloneable {

    /* renamed from: a */
    public float f52249a;

    /* renamed from: b */
    public float f52250b;

    /* renamed from: c */
    public float f52251c;

    /* renamed from: d */
    public float f52252d;

    /* renamed from: e */
    public float f52253e;

    /* renamed from: f */
    public float f52254f = -1.0f;

    public wk1(float f, float f2, float f3) {
        this.f52250b = f;
        this.f52249a = f2;
        m54653k(f3);
        this.f52253e = 0.0f;
    }

    @Override // p001o.e36
    /* renamed from: b */
    public void mo24170b(float f, float f2, float f3, klf klfVar) {
        float f4;
        float f5;
        float f6 = this.f52251c;
        if (f6 == 0.0f) {
            klfVar.m35853m(f, 0.0f);
            return;
        }
        float f7 = ((this.f52250b * 2.0f) + f6) / 2.0f;
        float f8 = f3 * this.f52249a;
        float f9 = f2 + this.f52253e;
        float f10 = (this.f52252d * f3) + ((1.0f - f3) * f7);
        if (f10 / f7 >= 1.0f) {
            klfVar.m35853m(f, 0.0f);
            return;
        }
        float f11 = this.f52254f;
        float f12 = f11 * f3;
        boolean z = f11 == -1.0f || Math.abs((f11 * 2.0f) - f6) < 0.1f;
        if (z) {
            f4 = f10;
            f5 = 0.0f;
        } else {
            f5 = 1.75f;
            f4 = 0.0f;
        }
        float f13 = f7 + f8;
        float f14 = f4 + f8;
        float fSqrt = (float) Math.sqrt((f13 * f13) - (f14 * f14));
        float f15 = f9 - fSqrt;
        float f16 = f9 + fSqrt;
        float degrees = (float) Math.toDegrees(Math.atan(fSqrt / f14));
        float f17 = (90.0f - degrees) + f5;
        klfVar.m35853m(f15, 0.0f);
        float f18 = f8 * 2.0f;
        klfVar.m35841a(f15 - f8, 0.0f, f15 + f8, f18, 270.0f, degrees);
        if (z) {
            klfVar.m35841a(f9 - f7, (-f7) - f4, f9 + f7, f7 - f4, 180.0f - f17, (f17 * 2.0f) - 180.0f);
        } else {
            float f19 = this.f52250b;
            float f20 = f12 * 2.0f;
            float f21 = f9 - f7;
            klfVar.m35841a(f21, -(f12 + f19), f21 + f19 + f20, f19 + f12, 180.0f - f17, ((f17 * 2.0f) - 180.0f) / 2.0f);
            float f22 = f9 + f7;
            float f23 = this.f52250b;
            klfVar.m35853m(f22 - ((f23 / 2.0f) + f12), f23 + f12);
            float f24 = this.f52250b;
            klfVar.m35841a(f22 - (f20 + f24), -(f12 + f24), f22, f24 + f12, 90.0f, f17 - 90.0f);
        }
        klfVar.m35841a(f16 - f8, 0.0f, f16 + f8, f18, 270.0f - degrees, degrees);
        klfVar.m35853m(f, 0.0f);
    }

    /* renamed from: c */
    public float m54647c() {
        return this.f52252d;
    }

    /* renamed from: f */
    public float m54648f() {
        return this.f52254f;
    }

    /* renamed from: g */
    public float m54649g() {
        return this.f52250b;
    }

    /* renamed from: h */
    public float m54650h() {
        return this.f52249a;
    }

    /* renamed from: i */
    public float m54651i() {
        return this.f52251c;
    }

    /* renamed from: j */
    public float m54652j() {
        return this.f52253e;
    }

    /* renamed from: k */
    public void m54653k(float f) {
        if (f < 0.0f) {
            throw new IllegalArgumentException("cradleVerticalOffset must be positive.");
        }
        this.f52252d = f;
    }

    /* renamed from: l */
    public void m54654l(float f) {
        this.f52254f = f;
    }

    /* renamed from: m */
    public void m54655m(float f) {
        this.f52250b = f;
    }

    /* renamed from: n */
    public void m54656n(float f) {
        this.f52249a = f;
    }

    /* renamed from: p */
    public void m54657p(float f) {
        this.f52251c = f;
    }

    /* renamed from: q */
    public void m54658q(float f) {
        this.f52253e = f;
    }
}
