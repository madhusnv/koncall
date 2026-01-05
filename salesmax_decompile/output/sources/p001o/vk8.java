package p001o;

/* loaded from: classes3.dex */
public final class vk8 extends cre {

    /* renamed from: c */
    public final cre f50466c;

    /* renamed from: d */
    public final nlb f50467d;

    /* renamed from: e */
    public final qx0 f50468e;

    public vk8(cre creVar, nlb nlbVar, qx0 qx0Var) {
        sq8.m48649h(creVar, "delegate");
        sq8.m48649h(nlbVar, "counter");
        sq8.m48649h(qx0Var, "attributes");
        this.f50466c = creVar;
        this.f50467d = nlbVar;
        this.f50468e = qx0Var;
    }

    @Override // p001o.cre
    /* renamed from: g */
    public long mo21617g() {
        return this.f50466c.mo21617g();
    }

    @Override // p001o.cre
    /* renamed from: h */
    public y9b mo21618h() {
        return this.f50466c.mo21618h();
    }

    @Override // p001o.cre
    /* renamed from: o */
    public im1 mo21619o() {
        return uac.m51310c(new xk8(this.f50466c.mo21619o(), this.f50467d, this.f50468e));
    }
}
