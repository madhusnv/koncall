package cu;

import ab.C0084b;
import android.content.Context;
import d7.w0;
import du.AbstractC1839u;
import du.C1822d;
import du.C1836r;
import iu.C3356h;
import java.util.ArrayList;
import kotlin.jvm.internal.AbstractC4154l;
import nn.C5113e;
import og.pe;
import ru.C6624b;
import rw.AbstractC6663m;
import tx.c0;
import uo.C7485j;
import uw.InterfaceC7559c;
import wx.c1;
import wx.m1;
import xm.y5;
import yx.C8810d;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: cu.b */
/* loaded from: classes3.dex */
public final class C1504b extends w0 {

    /* renamed from: b */
    public final C5113e f7607b;

    /* renamed from: c */
    public final C7485j f7608c;

    /* renamed from: d */
    public final y5 f7609d;

    /* renamed from: e */
    public final Context f7610e;

    /* renamed from: f */
    public final C8810d f7611f;

    /* renamed from: g */
    public final m1 f7612g;

    /* renamed from: h */
    public final wx.w0 f7613h;

    public C1504b(C5113e c5113e, C7485j c7485j, y5 userSIMRepository, Context context, C8810d c8810d) {
        AbstractC4154l.m8923f(userSIMRepository, "userSIMRepository");
        this.f7607b = c5113e;
        this.f7608c = c7485j;
        this.f7609d = userSIMRepository;
        this.f7610e = context;
        this.f7611f = c8810d;
        m1 m1VarM15372c = c1.m15372c(new C3356h());
        this.f7612g = m1VarM15372c;
        this.f7613h = new wx.w0(m1VarM15372c);
    }

    /* renamed from: e */
    public final void m5060e(AbstractC1839u abstractC1839u) {
        m1 m1Var;
        Object value;
        boolean z6 = abstractC1839u instanceof C1822d;
        C8810d c8810d = this.f7611f;
        InterfaceC7559c interfaceC7559c = null;
        if (z6) {
            c0.m13502y(c8810d, null, null, new C1503a(this, interfaceC7559c, 0), 3);
            return;
        }
        if (abstractC1839u instanceof C1836r) {
            ArrayList arrayListD0 = AbstractC6663m.d0(((C3356h) this.f7613h.f39340a.getValue()).f17739b);
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
                if (i10 == ((C1836r) abstractC1839u).f8814a) {
                    arrayListD0.set(i10, C6624b.m12672a(c6624b, true));
                } else {
                    arrayListD0.set(i10, C6624b.m12672a(c6624b, false));
                }
                i10 = i12;
            }
            do {
                m1Var = this.f7612g;
                value = m1Var.getValue();
            } while (!m1Var.m15397i(value, C3356h.m7670a((C3356h) value, null, arrayListD0, false, false, false, false, null, null, false, null, null, false, false, false, null, 262141)));
            c0.m13502y(c8810d, null, null, new C0084b(this, interfaceC7559c, 8), 3);
        }
    }
}
