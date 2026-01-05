package p001o;

import p001o.w6c;

/* loaded from: classes2.dex */
public abstract class ge1 implements w6c {

    /* renamed from: a */
    public transient ond f25029a;

    @Override // p001o.w6c
    /* renamed from: b */
    public void mo28506b(w6c.AbstractC17784a abstractC17784a) {
        synchronized (this) {
            if (this.f25029a == null) {
                this.f25029a = new ond();
            }
        }
        this.f25029a.m26013a(abstractC17784a);
    }

    @Override // p001o.w6c
    /* renamed from: e */
    public void mo28507e(w6c.AbstractC17784a abstractC17784a) {
        synchronized (this) {
            ond ondVar = this.f25029a;
            if (ondVar == null) {
                return;
            }
            ondVar.m26021k(abstractC17784a);
        }
    }

    /* renamed from: g */
    public void m28508g() {
        synchronized (this) {
            ond ondVar = this.f25029a;
            if (ondVar == null) {
                return;
            }
            ondVar.m26016f(this, 0, null);
        }
    }

    /* renamed from: h */
    public void m28509h(int i) {
        synchronized (this) {
            ond ondVar = this.f25029a;
            if (ondVar == null) {
                return;
            }
            ondVar.m26016f(this, i, null);
        }
    }
}
