package gs;

import a9.C0073l;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import ap.C0388a;
import aq.C0406i;
import c9.C0910e;
import com.websoptimization.callyzerbiz.R;
import com.websoptimization.callyzerbiz.data.model.response.lead.Leads;
import cs.C1483b;
import cs.C1484c;
import cs.C1485d;
import cs.C1487f;
import cs.C1488g;
import cs.C1489h;
import cs.C1490i;
import d7.q0;
import d7.w0;
import ds.C1790n;
import es.C2128e;
import fo.C2348l;
import fs.C2371b;
import im.n0;
import kotlin.jvm.internal.AbstractC4154l;
import kotlin.jvm.internal.C4164v;
import ln.C4494g;
import og.hb;
import pg.o6;
import pg.y8;
import tx.c0;
import uw.InterfaceC7559c;
import vx.C7806h;
import wj.C8090p;
import wx.C8203d;
import wx.c1;
import wx.m1;
import xm.r3;
import yx.C8810d;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: gs.n */
/* loaded from: classes3.dex */
public final class C2728n extends w0 {

    /* renamed from: b */
    public final C0910e f15213b;

    /* renamed from: c */
    public final C2348l f15214c;

    /* renamed from: d */
    public final C8090p f15215d;

    /* renamed from: e */
    public final wx.w0 f15216e;

    /* renamed from: f */
    public final C4494g f15217f;

    /* renamed from: g */
    public final C0073l f15218g;

    /* renamed from: h */
    public final String f15219h;

    /* renamed from: i */
    public final String f15220i;

    /* renamed from: j */
    public final String f15221j;

    /* renamed from: k */
    public final C8810d f15222k;

    /* renamed from: l */
    public final Context f15223l;

    /* renamed from: m */
    public final m1 f15224m;

    /* renamed from: n */
    public final wx.w0 f15225n;

    /* renamed from: o */
    public final m1 f15226o;

    /* renamed from: p */
    public final C7806h f15227p;

    /* renamed from: q */
    public final C8203d f15228q;

    public C2728n(C0910e c0910e, C2348l c2348l, C8090p c8090p, wx.w0 w0Var, C4494g c4494g, C0073l c0073l, String str, String str2, String str3, C8810d c8810d, Context context) {
        Object value;
        this.f15213b = c0910e;
        this.f15214c = c2348l;
        this.f15215d = c8090p;
        this.f15216e = w0Var;
        this.f15217f = c4494g;
        this.f15218g = c0073l;
        this.f15219h = str;
        this.f15220i = str2;
        this.f15221j = str3;
        this.f15222k = c8810d;
        this.f15223l = context;
        m1 m1VarM15372c = c1.m15372c(new C2371b());
        this.f15224m = m1VarM15372c;
        this.f15225n = new wx.w0(m1VarM15372c);
        InterfaceC7559c interfaceC7559c = null;
        this.f15226o = c1.m15372c(null);
        C7806h c7806hM11805a = o6.m11805a(0, null, null, 7);
        this.f15227p = c7806hM11805a;
        this.f15228q = c1.m15389t(c7806hM11805a);
        do {
            value = m1VarM15372c.getValue();
        } while (!m1VarM15372c.m15397i(value, C2371b.m6058a((C2371b) value, false, null, this.f15221j, null, null, null, false, false, null, null, 4087)));
        c0.m13502y(this.f15222k, null, null, new C2725k(this, interfaceC7559c, 0), 3);
        C1790n c1790n = new C1790n(this, 2);
        C4164v c4164v = new C4164v();
        c4164v.f21160a = true;
        c0.m13502y(this.f15222k, null, null, new C0406i(this, c4164v, c1790n, interfaceC7559c, 23), 3);
        c0.m13502y(q0.m5340g(this), null, null, new C2725k(this, interfaceC7559c, 1), 3);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: e */
    public final void m6727e(hb hbVar) {
        String str;
        boolean z6 = hbVar instanceof C1484c;
        C0910e c0910e = this.f15213b;
        if (z6) {
            C1484c c1484c = (C1484c) hbVar;
            c0910e.m2609s("+" + c1484c.f7562a + c1484c.f7563b);
            return;
        }
        boolean z10 = hbVar instanceof C1485d;
        wx.w0 w0Var = this.f15225n;
        if (z10) {
            C2128e c2128e = ((C2371b) w0Var.f39340a.getValue()).f10792f;
            if (c2128e == null || (str = c2128e.f9959n) == null) {
                return;
            }
            c0910e.getClass();
            Context context = (Context) c0910e.f5579b;
            try {
                context.startActivity(new Intent("android.intent.action.VIEW", Uri.parse("mailto:".concat(str))).addFlags(268435456));
                return;
            } catch (Exception e2) {
                e2.printStackTrace();
                y8.m11949d(context, R.string.intent_action_error);
                return;
            }
        }
        if (hbVar instanceof C1487f) {
            C1487f c1487f = (C1487f) hbVar;
            c0910e.m2587F("+" + c1487f.f7566a + c1487f.f7567b);
            return;
        }
        boolean z11 = hbVar instanceof C1483b;
        C8810d c8810d = this.f15222k;
        C8090p c8090p = this.f15215d;
        Object[] objArr = 0;
        Object[] objArr2 = 0;
        if (z11) {
            C1483b c1483b = (C1483b) hbVar;
            c0910e.m2585D("+" + c1483b.f7560a + c1483b.f7561b);
            String str2 = ((C2371b) w0Var.f39340a.getValue()).f10790d;
            C2128e c2128e2 = ((C2371b) w0Var.f39340a.getValue()).f10792f;
            String str3 = c2128e2 != null ? c2128e2.f9948c : null;
            AbstractC4154l.m8920c(str3);
            c8090p.m15242T(new n0(str2, str3));
            c0.m13502y(c8810d, null, null, new C0388a(this, hbVar, objArr2 == true ? 1 : 0, 17), 3);
            return;
        }
        if (hbVar instanceof C1490i) {
            C2128e c2128e3 = ((C2371b) w0Var.f39340a.getValue()).f10792f;
            Leads leads = c2128e3 != null ? c2128e3.f9946a : null;
            Object obj = c8090p.f38725c;
            r3.f40778i = leads;
            return;
        }
        if (hbVar instanceof C1488g) {
            Object obj2 = c8090p.f38725c;
            r3.f40778i = null;
        } else if (hbVar instanceof C1489h) {
            c0.m13502y(c8810d, null, null, new C2715a(this, hbVar, objArr == true ? 1 : 0, 4), 3);
        }
    }
}
