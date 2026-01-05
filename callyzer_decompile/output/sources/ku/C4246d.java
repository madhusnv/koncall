package ku;

import android.content.Context;
import cu.C1503a;
import d7.w0;
import java.util.ArrayList;
import k9.C4032f;
import kotlin.NoWhenBranchMatchedException;
import nn.C5113e;
import og.pe;
import pg.t9;
import ru.C6624b;
import rw.AbstractC6663m;
import rw.C6668r;
import tx.c0;
import uo.C7485j;
import uw.InterfaceC7559c;
import wx.c1;
import wx.m1;
import yx.C8810d;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: ku.d */
/* loaded from: classes3.dex */
public final class C4246d extends w0 {

    /* renamed from: b */
    public final C5113e f21567b;

    /* renamed from: c */
    public final C8810d f21568c;

    /* renamed from: d */
    public final C7485j f21569d;

    /* renamed from: e */
    public final Context f21570e;

    /* renamed from: f */
    public final m1 f21571f;

    /* renamed from: g */
    public final wx.w0 f21572g;

    public C4246d(Context context, C5113e c5113e, C7485j c7485j, C8810d c8810d) {
        this.f21567b = c5113e;
        this.f21568c = c8810d;
        this.f21569d = c7485j;
        this.f21570e = context;
        m1 m1VarM15372c = c1.m15372c(new C4245c(C6668r.f31943a));
        this.f21571f = m1VarM15372c;
        this.f21572g = new wx.w0(m1VarM15372c);
    }

    /* renamed from: e */
    public final void m8979e(t9 t9Var) {
        m1 m1Var;
        Object value;
        boolean z6 = t9Var instanceof C4243a;
        C8810d c8810d = this.f21568c;
        InterfaceC7559c interfaceC7559c = null;
        if (z6) {
            c0.m13502y(c8810d, null, null, new C1503a(this, interfaceC7559c, 2), 3);
            return;
        }
        if (!(t9Var instanceof C4244b)) {
            throw new NoWhenBranchMatchedException();
        }
        ArrayList arrayListD0 = AbstractC6663m.d0(((C4245c) this.f21572g.f39340a.getValue()).f21566a);
        int size = arrayListD0.size();
        int i10 = 0;
        int i11 = 0;
        while (i11 < size) {
            Object obj = arrayListD0.get(i11);
            i11++;
            int i12 = i10 + 1;
            if (i10 < 0) {
                pe.m10842q();
                throw null;
            }
            C6624b c6624b = (C6624b) obj;
            if (i10 == ((C4244b) t9Var).f21565a) {
                arrayListD0.set(i10, C6624b.m12672a(c6624b, true));
            } else {
                arrayListD0.set(i10, C6624b.m12672a(c6624b, false));
            }
            i10 = i12;
        }
        do {
            m1Var = this.f21571f;
            value = m1Var.getValue();
            ((C4245c) value).getClass();
        } while (!m1Var.m15397i(value, new C4245c(arrayListD0)));
        c0.m13502y(c8810d, null, null, new C4032f(this, interfaceC7559c, 1), 3);
    }
}
