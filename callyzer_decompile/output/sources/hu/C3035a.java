package hu;

import ab.C0084b;
import android.content.Context;
import cu.C1503a;
import d7.w0;
import du.AbstractC1839u;
import du.C1824f;
import du.C1837s;
import iu.C3354f;
import java.util.ArrayList;
import nn.C5113e;
import og.pe;
import ru.C6623a;
import rw.AbstractC6663m;
import rw.C6668r;
import tx.c0;
import uo.C7485j;
import uw.InterfaceC7559c;
import wx.c1;
import wx.m1;
import yx.C8810d;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: hu.a */
/* loaded from: classes3.dex */
public final class C3035a extends w0 {

    /* renamed from: b */
    public final C5113e f16361b;

    /* renamed from: c */
    public final C7485j f16362c;

    /* renamed from: d */
    public final Context f16363d;

    /* renamed from: e */
    public final C8810d f16364e;

    /* renamed from: f */
    public final m1 f16365f;

    /* renamed from: g */
    public final wx.w0 f16366g;

    public C3035a(Context context, C5113e c5113e, C7485j c7485j, C8810d c8810d) {
        this.f16361b = c5113e;
        this.f16362c = c7485j;
        this.f16363d = context;
        this.f16364e = c8810d;
        m1 m1VarM15372c = c1.m15372c(new C3354f(C6668r.f31943a));
        this.f16365f = m1VarM15372c;
        this.f16366g = new wx.w0(m1VarM15372c);
    }

    /* renamed from: e */
    public final void m7275e(AbstractC1839u abstractC1839u) {
        m1 m1Var;
        Object value;
        boolean z6 = abstractC1839u instanceof C1824f;
        C8810d c8810d = this.f16364e;
        InterfaceC7559c interfaceC7559c = null;
        if (z6) {
            c0.m13502y(c8810d, null, null, new C1503a(this, null), 3);
            return;
        }
        if (abstractC1839u instanceof C1837s) {
            ArrayList arrayListD0 = AbstractC6663m.d0(((C3354f) this.f16366g.f39340a.getValue()).f17735a);
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
                C6623a c6623a = (C6623a) obj;
                if (i10 == ((C1837s) abstractC1839u).f8815a) {
                    arrayListD0.set(i10, C6623a.m12671a(c6623a, true));
                } else {
                    arrayListD0.set(i10, C6623a.m12671a(c6623a, false));
                }
                i10 = i12;
            }
            do {
                m1Var = this.f16365f;
                value = m1Var.getValue();
                ((C3354f) value).getClass();
            } while (!m1Var.m15397i(value, new C3354f(arrayListD0)));
            c0.m13502y(c8810d, null, null, new C0084b(this, interfaceC7559c, 21), 3);
        }
    }
}
