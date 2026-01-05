package ln;

import en.C2073f;
import en.C2074g;
import im.p1;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.AbstractC4154l;
import wx.m1;
import wx.v0;
import wx.w0;
import xm.p4;
import xm.q4;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: ln.g */
/* loaded from: classes3.dex */
public final class C4494g {

    /* renamed from: a */
    public final q4 f22367a;

    /* renamed from: b */
    public final v0 f22368b;

    /* renamed from: c */
    public final w0 f22369c;

    /* renamed from: d */
    public final w0 f22370d;

    /* renamed from: e */
    public final w0 f22371e;

    public C4494g(q4 sessionConfigurationRepository) {
        AbstractC4154l.m8923f(sessionConfigurationRepository, "sessionConfigurationRepository");
        this.f22367a = sessionConfigurationRepository;
        this.f22368b = sessionConfigurationRepository.f40745e;
        this.f22369c = sessionConfigurationRepository.f40752l;
        this.f22370d = sessionConfigurationRepository.f40754n;
        this.f22371e = sessionConfigurationRepository.f40750j;
    }

    /* renamed from: a */
    public final Object m9336a(p1 sessionConst) {
        AbstractC4154l.m8923f(sessionConst, "sessionConst");
        q4 q4Var = this.f22367a;
        w0 w0Var = q4Var.f40752l;
        m1 m1Var = q4Var.f40744d;
        try {
            switch (p4.f40714a[sessionConst.ordinal()]) {
                case 1:
                    return Boolean.valueOf(((C2073f) m1Var.getValue()).f9686a);
                case 2:
                    return Integer.valueOf(((C2073f) m1Var.getValue()).f9687b);
                case 3:
                    return ((C2074g) w0Var.f39340a.getValue()).f9694a;
                case 4:
                    return Boolean.valueOf(((C2074g) w0Var.f39340a.getValue()).f9695b);
                case 5:
                    return Boolean.valueOf(((C2074g) w0Var.f39340a.getValue()).f9696c);
                case 6:
                    return ((C2074g) w0Var.f39340a.getValue()).f9697d;
                case 7:
                    return q4Var.f40754n.f39340a.getValue();
                case 8:
                    return q4Var.f40750j.f39340a.getValue();
                case 9:
                    return q4Var.f40746f.f39340a.getValue();
                case 10:
                    return ((C2073f) m1Var.getValue()).f9691f;
                case 11:
                    return Boolean.valueOf(((C2073f) m1Var.getValue()).f9692g);
                case 12:
                    return ((C2073f) m1Var.getValue()).f9693h;
                case 13:
                    return q4Var.f40748h;
                default:
                    throw new NoWhenBranchMatchedException();
            }
        } catch (Exception e2) {
            q4Var.f40741a.m16234i("SessionConfiguration", e2);
            return null;
        }
    }

    /* renamed from: b */
    public final void m9337b(p1 sessionConst, Object obj) {
        AbstractC4154l.m8923f(sessionConst, "sessionConst");
        this.f22367a.m15601a(sessionConst, obj);
    }
}
