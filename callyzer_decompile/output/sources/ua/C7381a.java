package ua;

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
/* renamed from: ua.a */
/* loaded from: classes.dex */
public final class C7381a implements InterfaceC1974d, InterfaceC4052g, InterfaceC4438a, InterfaceC4439b, InterfaceC8917k, InterfaceC8921o, InterfaceC4444d {

    /* renamed from: d */
    public String f35092d;

    /* renamed from: e */
    public List f35093e;

    /* renamed from: h */
    public AbstractC8912f f35096h;

    /* renamed from: j */
    public Boolean f35097j;

    /* renamed from: k */
    public Boolean f35098k;

    /* renamed from: l */
    public String f35099l;

    /* renamed from: a */
    public final /* synthetic */ C4367l f35089a = new C4367l(11);

    /* renamed from: b */
    public final /* synthetic */ C8919m f35090b = new C8919m();

    /* renamed from: c */
    public final String f35091c = "Cognito Identity";

    /* renamed from: f */
    public final C6668r f35094f = C6668r.f31943a;

    /* renamed from: g */
    public final ArrayList f35095g = new ArrayList();

    @Override // ea.InterfaceC1974d
    /* renamed from: a */
    public final void mo234a(String str) {
        this.f35092d = str;
    }

    @Override // ea.InterfaceC1974d
    /* renamed from: b */
    public final InterfaceC1681a mo235b() {
        return null;
    }

    @Override // ud.InterfaceC7397a
    public final Object build() {
        return new C7382b(this);
    }

    @Override // ea.InterfaceC1974d
    /* renamed from: c */
    public final String mo236c() {
        return this.f35099l;
    }

    @Override // ld.InterfaceC4444d
    /* renamed from: d */
    public final InterfaceC4447g mo237d() {
        return null;
    }

    @Override // ea.InterfaceC1974d
    /* renamed from: e */
    public final Boolean mo238e() {
        return this.f35098k;
    }

    @Override // kc.InterfaceC4052g
    /* renamed from: f */
    public final void mo239f(List list) {
        this.f35093e = list;
    }

    @Override // ea.InterfaceC1974d
    /* renamed from: g */
    public final void mo240g(Boolean bool) {
        this.f35098k = bool;
    }

    @Override // ea.InterfaceC1974d
    /* renamed from: h */
    public final Boolean mo241h() {
        return this.f35097j;
    }

    @Override // ea.InterfaceC1974d
    /* renamed from: i */
    public final void mo242i(String str) {
        this.f35099l = str;
    }

    @Override // zb.InterfaceC8917k
    /* renamed from: j */
    public final void mo243j(C0959n c0959n) {
        this.f35090b.mo243j(c0959n);
    }

    @Override // kc.InterfaceC4052g
    /* renamed from: k */
    public final List mo244k() {
        return this.f35093e;
    }

    @Override // lc.InterfaceC4439b
    /* renamed from: l */
    public final void mo245l(InterfaceC4991b interfaceC4991b) {
        this.f35089a.mo245l(interfaceC4991b);
    }

    @Override // zb.InterfaceC8921o
    /* renamed from: m */
    public final void mo246m(AbstractC8912f abstractC8912f) {
        this.f35096h = abstractC8912f;
    }

    @Override // ea.InterfaceC1974d
    /* renamed from: n */
    public final String mo247n() {
        return this.f35092d;
    }

    @Override // ea.InterfaceC1974d
    /* renamed from: o */
    public final void mo248o(Boolean bool) {
        this.f35097j = bool;
    }

    @Override // zb.InterfaceC8921o
    /* renamed from: p */
    public final AbstractC8912f mo249p() {
        return this.f35096h;
    }
}
