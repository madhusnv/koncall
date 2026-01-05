package p001o;

import p001o.i74;

/* loaded from: classes6.dex */
public final class j74 implements i74 {

    /* renamed from: a */
    public float f29876a;

    /* renamed from: b */
    public float f29877b;

    /* renamed from: c */
    public float f29878c;

    /* renamed from: d */
    public float f29879d;

    public j74(float f, float f2, float f3, float f4) {
        this.f29876a = f;
        this.f29877b = f2;
        this.f29878c = f3;
        this.f29879d = f4;
    }

    @Override // p001o.i74
    /* renamed from: a */
    public void mo31622a(float f) {
        this.f29877b = f;
    }

    @Override // p001o.i74
    /* renamed from: b */
    public void mo31623b(float f) {
        this.f29876a = f;
    }

    @Override // p001o.i74
    /* renamed from: c */
    public float mo31624c() {
        return this.f29876a;
    }

    @Override // p001o.i74
    /* renamed from: d */
    public float mo31625d() {
        return this.f29877b;
    }

    @Override // p001o.i74
    /* renamed from: e */
    public boolean mo31626e(int i, int i2) {
        return i74.C14203a.m31629a(this, i, i2);
    }

    @Override // p001o.i74
    /* renamed from: f */
    public void mo31627f(float f) {
        this.f29879d = f;
    }

    @Override // p001o.i74
    /* renamed from: g */
    public void mo31628g(float f) {
        this.f29878c = f;
    }

    @Override // p001o.i74
    public float getHeight() {
        return this.f29879d;
    }

    @Override // p001o.i74
    public float getWidth() {
        return this.f29878c;
    }

    /* renamed from: h */
    public void m33323h(float f, float f2, float f3, float f4) {
        i74.C14203a.m31630b(this, f, f2, f3, f4);
    }

    public /* synthetic */ j74(float f, float f2, float f3, float f4, int i, id5 id5Var) {
        this((i & 1) != 0 ? 0.0f : f, (i & 2) != 0 ? 0.0f : f2, (i & 4) != 0 ? 0.0f : f3, (i & 8) != 0 ? 0.0f : f4);
    }
}
