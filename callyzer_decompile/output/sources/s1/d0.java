package s1;

import k2.C3953b;
import k2.e1;
import n1.AbstractC4941a;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class d0 {

    /* renamed from: a */
    public final Object f32056a;

    /* renamed from: b */
    public final e0 f32057b;

    /* renamed from: d */
    public int f32059d;

    /* renamed from: e */
    public d0 f32060e;

    /* renamed from: f */
    public boolean f32061f;

    /* renamed from: c */
    public int f32058c = -1;

    /* renamed from: g */
    public final e1 f32062g = C3953b.m8517t(null);

    public d0(Object obj, e0 e0Var) {
        this.f32056a = obj;
        this.f32057b = e0Var;
    }

    /* renamed from: a */
    public final d0 m12845a() {
        if (this.f32061f) {
            AbstractC4941a.m9886c("Pin should not be called on an already disposed item ");
        }
        if (this.f32059d == 0) {
            this.f32057b.f32063a.add(this);
            d0 d0Var = (d0) this.f32062g.getValue();
            if (d0Var != null) {
                d0Var.m12845a();
            } else {
                d0Var = null;
            }
            this.f32060e = d0Var;
        }
        this.f32059d++;
        return this;
    }

    /* renamed from: b */
    public final void m12846b() {
        if (this.f32061f) {
            return;
        }
        if (this.f32059d <= 0) {
            AbstractC4941a.m9886c("Release should only be called once");
        }
        int i10 = this.f32059d - 1;
        this.f32059d = i10;
        if (i10 == 0) {
            this.f32057b.f32063a.remove(this);
            d0 d0Var = this.f32060e;
            if (d0Var != null) {
                d0Var.m12846b();
            }
            this.f32060e = null;
        }
    }
}
