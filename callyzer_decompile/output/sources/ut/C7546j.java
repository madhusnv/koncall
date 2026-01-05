package ut;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import c9.C0908c;
import com.websoptimization.callyzerbiz.R;
import d7.q0;
import d7.w0;
import h6.C2856l;
import im.p1;
import kotlin.NoWhenBranchMatchedException;
import ln.C4494g;
import og.pe;
import pg.f0;
import rw.C6668r;
import tx.c0;
import u7.C7351a;
import uw.InterfaceC7559c;
import wx.c1;
import wx.m1;
import yx.C8810d;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: ut.j */
/* loaded from: classes3.dex */
public final class C7546j extends w0 {

    /* renamed from: b */
    public final Context f36317b;

    /* renamed from: c */
    public final C0908c f36318c;

    /* renamed from: d */
    public final wx.w0 f36319d;

    /* renamed from: e */
    public final C4494g f36320e;

    /* renamed from: f */
    public final C2856l f36321f;

    /* renamed from: g */
    public final m1 f36322g;

    /* renamed from: h */
    public final wx.w0 f36323h;

    public C7546j(Context context, C0908c c0908c, wx.w0 w0Var, C4494g c4494g, C2856l c2856l, C8810d c8810d) {
        this.f36317b = context;
        this.f36318c = c0908c;
        this.f36319d = w0Var;
        this.f36320e = c4494g;
        this.f36321f = c2856l;
        m1 m1VarM15372c = c1.m15372c(new C7543g(pe.m10834i(Integer.valueOf(R.drawable.ic_facebook), Integer.valueOf(R.drawable.ic_twitter), Integer.valueOf(R.drawable.ic_linkedin), Integer.valueOf(R.drawable.ic_instagram), Integer.valueOf(R.drawable.ic_youtube), Integer.valueOf(R.drawable.ic_globe)), C6668r.f31943a, "Unknown", true, false, false, false));
        this.f36322g = m1VarM15372c;
        this.f36323h = new wx.w0(m1VarM15372c);
        InterfaceC7559c interfaceC7559c = null;
        c0.m13502y(q0.m5340g(this), null, null, new C7544h(this, interfaceC7559c, 0), 3);
        c0.m13502y(q0.m5340g(this), null, null, new C7544h(this, interfaceC7559c, 1), 3);
        c0.m13502y(c8810d, null, null, new C7351a(this, interfaceC7559c, 7), 3);
        m14299e(C7537a.f36297a);
    }

    /* renamed from: e */
    public final void m14299e(f0 f0Var) {
        m1 m1Var;
        Object value;
        if (f0Var instanceof C7539c) {
            int i10 = ((C7539c) f0Var).f36299a;
            Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(i10 == R.drawable.ic_facebook ? "https://www.facebook.com/Callyzer" : i10 == R.drawable.ic_twitter ? "https://twitter.com/callyzer" : i10 == R.drawable.ic_linkedin ? "https://www.linkedin.com/company/callyzer" : i10 == R.drawable.ic_instagram ? "https://www.instagram.com/callyzer_/" : i10 == R.drawable.ic_youtube ? "https://youtu.be/D6ojHbshZE4" : "https://callyzer.co/"));
            intent.addFlags(268435456);
            this.f36317b.startActivity(intent);
            return;
        }
        if (f0Var instanceof C7541e) {
            do {
                m1Var = this.f36322g;
                value = m1Var.getValue();
            } while (!m1Var.m15397i(value, C7543g.m14298a((C7543g) value, null, null, false, false, ((C7541e) f0Var).f36301a, false, 95)));
        } else if (f0Var instanceof C7540d) {
            this.f36320e.m9337b(p1.MESSAGE_TEMPLATE_CALL_LOG_DATA, ((C7540d) f0Var).f36300a);
        } else if (f0Var instanceof C7538b) {
            this.f36321f.m6987c();
        } else {
            if (!(f0Var instanceof C7537a)) {
                throw new NoWhenBranchMatchedException();
            }
            c0.m13502y(q0.m5340g(this), null, null, new C7545i(this, null, 1), 3);
        }
    }
}
