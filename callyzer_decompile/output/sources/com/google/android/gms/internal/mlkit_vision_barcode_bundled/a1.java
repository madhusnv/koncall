package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public abstract class a1 implements Cloneable, t1 {

    /* renamed from: a */
    public final e1 f6474a;

    /* renamed from: b */
    public e1 f6475b;

    public a1(e1 e1Var) {
        this.f6474a = e1Var;
        if (e1Var.m3840k()) {
            throw new IllegalArgumentException("Default instance must be immutable.");
        }
        this.f6475b = (e1) e1Var.mo3803m(4, null);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.t1
    /* renamed from: a */
    public final boolean mo3804a() {
        return e1.m3834j(this.f6475b, false);
    }

    /* renamed from: b */
    public final e1 m3805b() {
        e1 e1VarMo3806c = mo3806c();
        if (e1.m3834j(e1VarMo3806c, true)) {
            return e1VarMo3806c;
        }
        throw new zzgr();
    }

    /* renamed from: c */
    public e1 mo3806c() {
        if (!this.f6475b.m3840k()) {
            return this.f6475b;
        }
        e1 e1Var = this.f6475b;
        e1Var.getClass();
        y1.f6701c.m4007a(e1Var.getClass()).mo3844c(e1Var);
        e1Var.m3838g();
        return this.f6475b;
    }

    public final Object clone() {
        a1 a1Var = (a1) this.f6474a.mo3803m(5, null);
        a1Var.f6475b = mo3806c();
        return a1Var;
    }

    /* renamed from: d */
    public /* bridge */ j0 mo3807d() {
        return mo3806c();
    }

    /* renamed from: e */
    public final void m3808e() {
        if (this.f6475b.m3840k()) {
            return;
        }
        mo3809f();
    }

    /* renamed from: f */
    public void mo3809f() {
        e1 e1Var = (e1) this.f6474a.mo3803m(4, null);
        y1.f6701c.m4007a(e1Var.getClass()).mo3848g(e1Var, this.f6475b);
        this.f6475b = e1Var;
    }
}
