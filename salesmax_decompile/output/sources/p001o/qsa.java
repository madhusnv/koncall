package p001o;

/* loaded from: classes3.dex */
public final class qsa extends e36 {

    /* renamed from: a */
    public final float f42368a;

    public qsa(float f) {
        this.f42368a = f - 0.001f;
    }

    @Override // p001o.e36
    /* renamed from: a */
    public boolean mo24169a() {
        return true;
    }

    @Override // p001o.e36
    /* renamed from: b */
    public void mo24170b(float f, float f2, float f3, klf klfVar) {
        float fSqrt = (float) ((this.f42368a * Math.sqrt(2.0d)) / 2.0d);
        float fSqrt2 = (float) Math.sqrt(Math.pow(this.f42368a, 2.0d) - Math.pow(fSqrt, 2.0d));
        klfVar.m35854n(f2 - fSqrt, ((float) (-((this.f42368a * Math.sqrt(2.0d)) - this.f42368a))) + fSqrt2);
        klfVar.m35853m(f2, (float) (-((this.f42368a * Math.sqrt(2.0d)) - this.f42368a)));
        klfVar.m35853m(f2 + fSqrt, ((float) (-((this.f42368a * Math.sqrt(2.0d)) - this.f42368a))) + fSqrt2);
    }
}
