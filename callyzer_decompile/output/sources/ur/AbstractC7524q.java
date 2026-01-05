package ur;

import java.util.Iterator;
import pg.o6;
import qr.AbstractC6297u;
import qw.C6361k;
import rw.C6668r;
import vx.C7806h;
import wx.C8203d;
import wx.c1;
import wx.m1;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: ur.q */
/* loaded from: classes3.dex */
public abstract class AbstractC7524q extends d7.w0 {

    /* renamed from: b */
    public final m1 f36252b;

    /* renamed from: c */
    public final wx.w0 f36253c;

    /* renamed from: d */
    public final C7806h f36254d;

    /* renamed from: e */
    public final C8203d f36255e;

    public AbstractC7524q() {
        Boolean bool = Boolean.FALSE;
        C6668r c6668r = C6668r.f31943a;
        m1 m1VarM15372c = c1.m15372c(new i0(c6668r, c6668r, null, null, new C6361k(bool, c6668r)));
        this.f36252b = m1VarM15372c;
        this.f36253c = new wx.w0(m1VarM15372c);
        C7806h c7806hM11805a = o6.m11805a(0, null, null, 7);
        this.f36254d = c7806hM11805a;
        this.f36255e = c1.m15389t(c7806hM11805a);
    }

    /* renamed from: e */
    public abstract void mo2033e(AbstractC7523p abstractC7523p);

    /* renamed from: f */
    public abstract void mo2034f();

    /* renamed from: g */
    public final void m14294g() {
        Iterator it = ((i0) this.f36253c.f39340a.getValue()).f36224a.iterator();
        while (it.hasNext()) {
            ((AbstractC6297u) it.next()).m12329m();
        }
    }
}
