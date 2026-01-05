package p001o;

import p001o.dn5;

/* loaded from: classes3.dex */
public final class x99 implements dn5.InterfaceC12997c, dn5, uhd {

    /* renamed from: a */
    public final /* synthetic */ i89 f53395a;

    /* renamed from: b */
    public final /* synthetic */ i89 f53396b;

    public x99(i89 i89Var) {
        sq8.m48649h(i89Var, "deserializer");
        this.f53395a = i89Var;
        this.f53396b = i89Var;
    }

    @Override // p001o.uhd
    /* renamed from: b */
    public int mo31724b() {
        return this.f53396b.mo31724b();
    }

    @Override // p001o.dn5
    /* renamed from: c */
    public dn5.InterfaceC12995a mo23577c(h7f h7fVar) {
        sq8.m48649h(h7fVar, "descriptor");
        return this.f53395a.mo23577c(h7fVar);
    }

    @Override // p001o.dn5
    /* renamed from: g */
    public dn5.InterfaceC12996b mo23578g(h7f h7fVar) {
        sq8.m48649h(h7fVar, "descriptor");
        return this.f53395a.mo23578g(h7fVar);
    }

    @Override // p001o.dn5
    /* renamed from: h */
    public dn5.InterfaceC12997c mo23579h(t7f t7fVar) {
        sq8.m48649h(t7fVar, "descriptor");
        return this.f53395a.mo23579h(t7fVar);
    }

    @Override // p001o.uhd
    /* renamed from: i */
    public String mo31726i() {
        return this.f53396b.mo31726i();
    }

    @Override // p001o.uhd
    /* renamed from: j */
    public vv5 mo31727j() {
        return this.f53396b.mo31727j();
    }

    @Override // p001o.uhd
    /* renamed from: k */
    public float mo31728k() {
        return this.f53396b.mo31728k();
    }

    @Override // p001o.uhd
    /* renamed from: l */
    public gk8 mo31729l(vmh vmhVar) {
        sq8.m48649h(vmhVar, "format");
        return this.f53396b.mo31729l(vmhVar);
    }

    @Override // p001o.dn5.InterfaceC12997c
    /* renamed from: m */
    public Integer mo23583m() {
        return null;
    }

    @Override // p001o.uhd
    /* renamed from: n */
    public boolean mo31730n() {
        return this.f53396b.mo31730n();
    }

    @Override // p001o.uhd
    /* renamed from: o */
    public long mo31731o() {
        return this.f53396b.mo31731o();
    }

    @Override // p001o.dn5.InterfaceC12997c
    public void skipValue() {
        throw new an5("This should not be called during deserialization.");
    }
}
