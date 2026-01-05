package p001o;

import java.util.Collection;
import p001o.h7g;
import p001o.w8i;

/* loaded from: classes2.dex */
public class p0j implements v92 {

    /* renamed from: a */
    public final v92 f39162a;

    /* renamed from: b */
    public final v0j f39163b;

    /* renamed from: c */
    public final w0j f39164c;

    /* renamed from: d */
    public final w8i.InterfaceC17799b f39165d;

    public p0j(v92 v92Var, w8i.InterfaceC17799b interfaceC17799b, h7g.InterfaceC13892a interfaceC13892a) {
        this.f39162a = v92Var;
        this.f39165d = interfaceC17799b;
        this.f39163b = new v0j(v92Var.mo26115c(), interfaceC13892a);
        this.f39164c = new w0j(v92Var.mo26122j());
    }

    @Override // p001o.w8i.InterfaceC17799b
    /* renamed from: b */
    public void mo26114b(w8i w8iVar) {
        elh.m25220a();
        this.f39165d.mo26114b(w8iVar);
    }

    @Override // p001o.v92
    /* renamed from: c */
    public z82 mo26115c() {
        return this.f39163b;
    }

    @Override // p001o.w8i.InterfaceC17799b
    /* renamed from: e */
    public void mo26117e(w8i w8iVar) {
        elh.m25220a();
        this.f39165d.mo26117e(w8iVar);
    }

    @Override // p001o.w8i.InterfaceC17799b
    /* renamed from: g */
    public void mo26119g(w8i w8iVar) {
        elh.m25220a();
        this.f39165d.mo26119g(w8iVar);
    }

    @Override // p001o.v92
    /* renamed from: h */
    public void mo26120h(Collection collection) {
        throw new UnsupportedOperationException("Operation not supported by VirtualCamera.");
    }

    @Override // p001o.v92
    /* renamed from: i */
    public void mo26121i(Collection collection) {
        throw new UnsupportedOperationException("Operation not supported by VirtualCamera.");
    }

    @Override // p001o.v92
    /* renamed from: j */
    public u92 mo26122j() {
        return this.f39164c;
    }

    @Override // p001o.w8i.InterfaceC17799b
    /* renamed from: m */
    public void mo26124m(w8i w8iVar) {
        elh.m25220a();
        this.f39165d.mo26124m(w8iVar);
    }

    @Override // p001o.v92
    /* renamed from: n */
    public v6c mo26125n() {
        return this.f39162a.mo26125n();
    }

    /* renamed from: o */
    public void m42847o(int i) {
        this.f39164c.m53765l(i);
    }

    @Override // p001o.v92
    /* renamed from: p */
    public boolean mo42848p() {
        return false;
    }
}
