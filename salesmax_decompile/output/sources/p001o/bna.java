package p001o;

import p001o.dab;

/* loaded from: classes5.dex */
public class bna extends wma implements dab {

    /* renamed from: e */
    public dab.InterfaceC12854a f16577e;

    public bna(long j) {
        super(j);
    }

    @Override // p001o.dab
    /* renamed from: a */
    public void mo19441a(int i) {
        if (i >= 40) {
            m54706b();
        } else if (i >= 20 || i == 15) {
            m54712m(m54709h() / 2);
        }
    }

    @Override // p001o.dab
    /* renamed from: c */
    public void mo19442c(dab.InterfaceC12854a interfaceC12854a) {
        this.f16577e = interfaceC12854a;
    }

    @Override // p001o.dab
    /* renamed from: d */
    public /* bridge */ /* synthetic */ zne mo19443d(ic9 ic9Var) {
        return (zne) super.m54711l(ic9Var);
    }

    @Override // p001o.dab
    /* renamed from: e */
    public /* bridge */ /* synthetic */ zne mo19444e(ic9 ic9Var, zne zneVar) {
        return (zne) super.m54710k(ic9Var, zneVar);
    }

    @Override // p001o.wma
    /* renamed from: n, reason: merged with bridge method [inline-methods] */
    public int mo19445i(zne zneVar) {
        return zneVar == null ? super.mo19445i(null) : zneVar.mo19619j();
    }

    @Override // p001o.wma
    /* renamed from: o, reason: merged with bridge method [inline-methods] */
    public void mo19446j(ic9 ic9Var, zne zneVar) {
        dab.InterfaceC12854a interfaceC12854a = this.f16577e;
        if (interfaceC12854a == null || zneVar == null) {
            return;
        }
        interfaceC12854a.mo22702c(zneVar);
    }
}
