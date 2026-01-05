package p001o;

import com.google.android.gms.common.internal.ImagesContract;
import p001o.fve;

/* loaded from: classes6.dex */
public final class hc7 implements fve {

    /* renamed from: a */
    public final ede f26652a;

    public hc7(ede edeVar) {
        sq8.m48649h(edeVar, "delegate");
        this.f26652a = edeVar;
    }

    @Override // p001o.fve
    /* renamed from: a */
    public boolean mo24816a(w48 w48Var) {
        sq8.m48649h(w48Var, ImagesContract.URL);
        return this.f26652a.mo24816a(w48Var);
    }

    @Override // p001o.fve
    /* renamed from: b */
    public oo0 mo24817b() {
        return this.f26652a.mo24817b();
    }

    @Override // p001o.fve
    /* renamed from: c */
    public boolean mo24818c(zce zceVar) {
        return this.f26652a.mo24818c(zceVar);
    }

    @Override // p001o.fve
    /* renamed from: d */
    public fve.InterfaceC13582b mo24819d() {
        return this.f26652a.m24821g();
    }

    @Override // p001o.fve
    public d60 getAddress() {
        return this.f26652a.getAddress();
    }

    @Override // p001o.fve
    public boolean isCanceled() {
        return this.f26652a.isCanceled();
    }
}
