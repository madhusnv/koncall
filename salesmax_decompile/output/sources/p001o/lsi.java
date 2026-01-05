package p001o;

/* loaded from: classes2.dex */
public class lsi {

    /* renamed from: a */
    public float f34351a;

    /* renamed from: b */
    public float f34352b;

    /* renamed from: c */
    public float f34353c;

    /* renamed from: d */
    public float f34354d;

    /* renamed from: e */
    public float f34355e;

    /* renamed from: f */
    public float f34356f;

    /* renamed from: a */
    public void m37863a(float f, float f2, int i, int i2, float[] fArr) {
        float f3 = fArr[0];
        float f4 = fArr[1];
        float f5 = (f2 - 0.5f) * 2.0f;
        float f6 = f3 + this.f34353c;
        float f7 = f4 + this.f34354d;
        float f8 = f6 + (this.f34351a * (f - 0.5f) * 2.0f);
        float f9 = f7 + (this.f34352b * f5);
        float radians = (float) Math.toRadians(this.f34356f);
        float radians2 = (float) Math.toRadians(this.f34355e);
        double d = radians;
        double d2 = i2 * f5;
        float fSin = f8 + (((float) ((((-i) * r7) * Math.sin(d)) - (Math.cos(d) * d2))) * radians2);
        float fCos = f9 + (radians2 * ((float) (((i * r7) * Math.cos(d)) - (d2 * Math.sin(d)))));
        fArr[0] = fSin;
        fArr[1] = fCos;
    }

    /* renamed from: b */
    public void m37864b() {
        this.f34355e = 0.0f;
        this.f34354d = 0.0f;
        this.f34353c = 0.0f;
        this.f34352b = 0.0f;
        this.f34351a = 0.0f;
    }

    /* renamed from: c */
    public void m37865c(mc9 mc9Var, float f) {
        if (mc9Var != null) {
            this.f34355e = mc9Var.m38728b(f);
        }
    }

    /* renamed from: d */
    public void m37866d(v0g v0gVar, float f) {
        if (v0gVar != null) {
            this.f34355e = v0gVar.m52203b(f);
            this.f34356f = v0gVar.m52202a(f);
        }
    }

    /* renamed from: e */
    public void m37867e(mc9 mc9Var, mc9 mc9Var2, float f) {
        if (mc9Var != null) {
            this.f34351a = mc9Var.m38728b(f);
        }
        if (mc9Var2 != null) {
            this.f34352b = mc9Var2.m38728b(f);
        }
    }

    /* renamed from: f */
    public void m37868f(v0g v0gVar, v0g v0gVar2, float f) {
        if (v0gVar != null) {
            this.f34351a = v0gVar.m52203b(f);
        }
        if (v0gVar2 != null) {
            this.f34352b = v0gVar2.m52203b(f);
        }
    }

    /* renamed from: g */
    public void m37869g(mc9 mc9Var, mc9 mc9Var2, float f) {
        if (mc9Var != null) {
            this.f34353c = mc9Var.m38728b(f);
        }
        if (mc9Var2 != null) {
            this.f34354d = mc9Var2.m38728b(f);
        }
    }

    /* renamed from: h */
    public void m37870h(v0g v0gVar, v0g v0gVar2, float f) {
        if (v0gVar != null) {
            this.f34353c = v0gVar.m52203b(f);
        }
        if (v0gVar2 != null) {
            this.f34354d = v0gVar2.m52203b(f);
        }
    }
}
