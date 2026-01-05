package xu;

import com.websoptimization.callyzerbiz.data.model.response.AppSettings;
import ex.InterfaceC2139c;
import k2.h2;
import kotlin.NoWhenBranchMatchedException;
import l7.a0;
import qv.C6328c;
import qv.C6338m;
import qv.C6348w;
import rv.C6631g;
import rv.C6642r;
import rv.d0;
import rv.e0;
import rv.f0;
import rv.g0;
import rv.h0;
import rv.p0;
import uw.InterfaceC7559c;
import wx.InterfaceC8210k;
import wx.m1;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: xu.k */
/* loaded from: classes3.dex */
public final class C8472k implements InterfaceC8210k {

    /* renamed from: a */
    public final /* synthetic */ C6338m f41284a;

    /* renamed from: b */
    public final /* synthetic */ p0 f41285b;

    /* renamed from: c */
    public final /* synthetic */ a0 f41286c;

    /* renamed from: d */
    public final /* synthetic */ InterfaceC2139c f41287d;

    /* renamed from: e */
    public final /* synthetic */ h2 f41288e;

    public C8472k(C6338m c6338m, p0 p0Var, a0 a0Var, InterfaceC2139c interfaceC2139c, h2 h2Var) {
        this.f41284a = c6338m;
        this.f41285b = p0Var;
        this.f41286c = a0Var;
        this.f41287d = interfaceC2139c;
        this.f41288e = h2Var;
    }

    @Override // wx.InterfaceC8210k
    public final Object emit(Object obj, InterfaceC7559c interfaceC7559c) {
        g0 g0Var = (g0) obj;
        boolean z6 = g0Var instanceof e0;
        a0 a0Var = this.f41286c;
        p0 p0Var = this.f41285b;
        C6338m c6338m = this.f41284a;
        if (z6) {
            m1 m1Var = c6338m.f30725h;
            AppSettings appSettings = ((C6328c) m1Var.getValue()).f30686b;
            if (appSettings == null || appSettings.m4728g()) {
                a0.m9181f(a0Var, "otp_verification");
            } else {
                p0Var.m12682m(new C6631g(((C6328c) m1Var.getValue()).f30687c, ((C6328c) m1Var.getValue()).f30685a));
                c6338m.m12362e(new C6348w(((h0) this.f41288e.getValue()).f31837b.f33665l));
            }
        } else if (g0Var instanceof f0) {
            AppSettings appSettings2 = ((C6328c) c6338m.f30725h.getValue()).f30686b;
            if (appSettings2 == null || !appSettings2.m4728g()) {
                p0Var.m12682m(C6642r.f31896a);
                this.f41287d.invoke("synced_call_log_progress");
            } else {
                a0.m9181f(a0Var, "otp_verification");
            }
        } else {
            if (!(g0Var instanceof d0)) {
                throw new NoWhenBranchMatchedException();
            }
            a0Var.m9188g();
        }
        return qw.a0.f30746a;
    }
}
