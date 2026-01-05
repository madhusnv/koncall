package p001o;

import p001o.qbg;

/* loaded from: classes2.dex */
public class rbg implements tq6 {

    /* renamed from: a */
    public final tq6 f43346a;

    /* renamed from: b */
    public final qbg.InterfaceC16329a f43347b;

    /* renamed from: c */
    public sbg f43348c;

    public rbg(tq6 tq6Var, qbg.InterfaceC16329a interfaceC16329a) {
        this.f43346a = tq6Var;
        this.f43347b = interfaceC16329a;
    }

    @Override // p001o.tq6
    /* renamed from: a */
    public void mo17261a(long j, long j2) {
        sbg sbgVar = this.f43348c;
        if (sbgVar != null) {
            sbgVar.m48140a();
        }
        this.f43346a.mo17261a(j, j2);
    }

    @Override // p001o.tq6
    /* renamed from: c */
    public boolean mo17262c(uq6 uq6Var) {
        return this.f43346a.mo17262c(uq6Var);
    }

    @Override // p001o.tq6
    /* renamed from: d */
    public void mo17263d(vq6 vq6Var) {
        sbg sbgVar = new sbg(vq6Var, this.f43347b);
        this.f43348c = sbgVar;
        this.f43346a.mo17263d(sbgVar);
    }

    @Override // p001o.tq6
    /* renamed from: f */
    public tq6 mo46490f() {
        return this.f43346a;
    }

    @Override // p001o.tq6
    /* renamed from: k */
    public int mo17264k(uq6 uq6Var, ued uedVar) {
        return this.f43346a.mo17264k(uq6Var, uedVar);
    }

    @Override // p001o.tq6
    public void release() {
        this.f43346a.release();
    }
}
