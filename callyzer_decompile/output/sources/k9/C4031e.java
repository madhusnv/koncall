package k9;

import ad.C0109p;
import cd.C0959n;
import dc.InterfaceC1681a;
import ea.InterfaceC1974d;
import java.util.ArrayList;
import java.util.List;
import kc.InterfaceC4052g;
import l4.C4367l;
import lc.InterfaceC4438a;
import lc.InterfaceC4439b;
import ld.InterfaceC4444d;
import ld.InterfaceC4447g;
import nc.InterfaceC4991b;
import rw.C6668r;
import zb.AbstractC8912f;
import zb.C8919m;
import zb.InterfaceC8917k;
import zb.InterfaceC8921o;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: k9.e */
/* loaded from: classes.dex */
public final class C4031e implements InterfaceC1974d, InterfaceC4052g, InterfaceC4438a, InterfaceC4439b, InterfaceC8917k, InterfaceC8921o, InterfaceC4444d {

    /* renamed from: d */
    public String f20821d;

    /* renamed from: e */
    public List f20822e;

    /* renamed from: g */
    public C0109p f20824g;

    /* renamed from: j */
    public AbstractC8912f f20826j;

    /* renamed from: k */
    public InterfaceC4447g f20827k;

    /* renamed from: l */
    public Boolean f20828l;

    /* renamed from: m */
    public Boolean f20829m;

    /* renamed from: n */
    public String f20830n;

    /* renamed from: a */
    public final /* synthetic */ C4367l f20818a = new C4367l(11);

    /* renamed from: b */
    public final /* synthetic */ C8919m f20819b = new C8919m();

    /* renamed from: c */
    public final String f20820c = "SSO";

    /* renamed from: f */
    public final C6668r f20823f = C6668r.f31943a;

    /* renamed from: h */
    public final ArrayList f20825h = new ArrayList();

    @Override // ea.InterfaceC1974d
    /* renamed from: a */
    public final void mo234a(String str) {
        this.f20821d = str;
    }

    @Override // ea.InterfaceC1974d
    /* renamed from: b */
    public final InterfaceC1681a mo235b() {
        return null;
    }

    @Override // ud.InterfaceC7397a
    public final Object build() {
        return new C4033g(this);
    }

    @Override // ea.InterfaceC1974d
    /* renamed from: c */
    public final String mo236c() {
        return this.f20830n;
    }

    @Override // ld.InterfaceC4444d
    /* renamed from: d */
    public final InterfaceC4447g mo237d() {
        return this.f20827k;
    }

    @Override // ea.InterfaceC1974d
    /* renamed from: e */
    public final Boolean mo238e() {
        return this.f20829m;
    }

    @Override // kc.InterfaceC4052g
    /* renamed from: f */
    public final void mo239f(List list) {
        this.f20822e = list;
    }

    @Override // ea.InterfaceC1974d
    /* renamed from: g */
    public final void mo240g(Boolean bool) {
        this.f20829m = bool;
    }

    @Override // ea.InterfaceC1974d
    /* renamed from: h */
    public final Boolean mo241h() {
        return this.f20828l;
    }

    @Override // ea.InterfaceC1974d
    /* renamed from: i */
    public final void mo242i(String str) {
        this.f20830n = str;
    }

    @Override // zb.InterfaceC8917k
    /* renamed from: j */
    public final void mo243j(C0959n c0959n) {
        this.f20819b.mo243j(c0959n);
    }

    @Override // kc.InterfaceC4052g
    /* renamed from: k */
    public final List mo244k() {
        return this.f20822e;
    }

    @Override // lc.InterfaceC4439b
    /* renamed from: l */
    public final void mo245l(InterfaceC4991b interfaceC4991b) {
        this.f20818a.mo245l(interfaceC4991b);
    }

    @Override // zb.InterfaceC8921o
    /* renamed from: m */
    public final void mo246m(AbstractC8912f abstractC8912f) {
        this.f20826j = abstractC8912f;
    }

    @Override // ea.InterfaceC1974d
    /* renamed from: n */
    public final String mo247n() {
        return this.f20821d;
    }

    @Override // ea.InterfaceC1974d
    /* renamed from: o */
    public final void mo248o(Boolean bool) {
        this.f20828l = bool;
    }

    @Override // zb.InterfaceC8921o
    /* renamed from: p */
    public final AbstractC8912f mo249p() {
        return this.f20826j;
    }
}
