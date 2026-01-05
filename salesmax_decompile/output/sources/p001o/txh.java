package p001o;

import java.util.ArrayList;
import java.util.List;
import p001o.gc1;
import p001o.plf;

/* loaded from: classes3.dex */
public class txh implements j14, gc1.InterfaceC13670b {

    /* renamed from: a */
    public final String f48005a;

    /* renamed from: b */
    public final boolean f48006b;

    /* renamed from: c */
    public final List f48007c = new ArrayList();

    /* renamed from: d */
    public final plf.EnumC16137a f48008d;

    /* renamed from: e */
    public final gc1 f48009e;

    /* renamed from: f */
    public final gc1 f48010f;

    /* renamed from: g */
    public final gc1 f48011g;

    public txh(hc1 hc1Var, plf plfVar) {
        this.f48005a = plfVar.m43849c();
        this.f48006b = plfVar.m43853g();
        this.f48008d = plfVar.m43852f();
        gc1 gc1VarMo24960a = plfVar.m43851e().mo24960a();
        this.f48009e = gc1VarMo24960a;
        gc1 gc1VarMo24960a2 = plfVar.m43848b().mo24960a();
        this.f48010f = gc1VarMo24960a2;
        gc1 gc1VarMo24960a3 = plfVar.m43850d().mo24960a();
        this.f48011g = gc1VarMo24960a3;
        hc1Var.m30184i(gc1VarMo24960a);
        hc1Var.m30184i(gc1VarMo24960a2);
        hc1Var.m30184i(gc1VarMo24960a3);
        gc1VarMo24960a.m28369a(this);
        gc1VarMo24960a2.m28369a(this);
        gc1VarMo24960a3.m28369a(this);
    }

    @Override // p001o.gc1.InterfaceC13670b
    /* renamed from: a */
    public void mo19333a() {
        for (int i = 0; i < this.f48007c.size(); i++) {
            ((gc1.InterfaceC13670b) this.f48007c.get(i)).mo19333a();
        }
    }

    @Override // p001o.j14
    /* renamed from: b */
    public void mo19334b(List list, List list2) {
    }

    /* renamed from: c */
    public void m50751c(gc1.InterfaceC13670b interfaceC13670b) {
        this.f48007c.add(interfaceC13670b);
    }

    /* renamed from: d */
    public gc1 m50752d() {
        return this.f48010f;
    }

    /* renamed from: f */
    public gc1 m50753f() {
        return this.f48011g;
    }

    /* renamed from: h */
    public gc1 m50754h() {
        return this.f48009e;
    }

    /* renamed from: i */
    public plf.EnumC16137a m50755i() {
        return this.f48008d;
    }

    /* renamed from: j */
    public boolean m50756j() {
        return this.f48006b;
    }
}
