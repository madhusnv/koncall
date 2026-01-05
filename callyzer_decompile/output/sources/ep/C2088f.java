package ep;

import android.content.Context;
import ap.C0388a;
import bq.C0724d;
import bu.C0782a;
import c9.C0927v;
import d7.q0;
import dr.C1770t;
import eb.i0;
import eo.C2082h;
import ex.InterfaceC2137a;
import j$.time.LocalDate;
import j$.time.LocalDateTime;
import j$.time.LocalTime;
import java.util.ArrayList;
import k4.C4001v;
import kotlin.jvm.internal.AbstractC4154l;
import mn.C4812i;
import nn.C5113e;
import pn.C5979e;
import qp.C6265b;
import qr.C6294r;
import qr.C6295s;
import qr.C6296t;
import qw.a0;
import rw.AbstractC6663m;
import rw.C6668r;
import tq.EnumC7204p;
import tx.c0;
import ur.AbstractC7523p;
import ur.AbstractC7524q;
import uw.InterfaceC7559c;
import wx.c1;
import wx.m1;
import wx.w0;
import yv.C8800o;
import yx.C8810d;
import zp.C9003c;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: ep.f */
/* loaded from: classes3.dex */
public final class C2088f extends AbstractC7524q {

    /* renamed from: f */
    public final C4812i f9763f;

    /* renamed from: g */
    public final C4001v f9764g;

    /* renamed from: h */
    public final C2082h f9765h;

    /* renamed from: i */
    public final C0927v f9766i;

    /* renamed from: j */
    public final C8810d f9767j;

    /* renamed from: k */
    public final C5113e f9768k;

    /* renamed from: l */
    public final C5979e f9769l;

    /* renamed from: m */
    public final ArrayList f9770m = new ArrayList();

    /* renamed from: n */
    public final m1 f9771n;

    /* renamed from: o */
    public final w0 f9772o;

    /* renamed from: p */
    public final C6295s f9773p;

    /* renamed from: q */
    public final C6294r f9774q;

    /* renamed from: r */
    public final C6296t f9775r;

    public C2088f(Context context, C4812i c4812i, C4001v c4001v, C2082h c2082h, C0927v c0927v, C8810d c8810d, C5113e c5113e, C5979e c5979e) {
        Object value;
        this.f9763f = c4812i;
        this.f9764g = c4001v;
        this.f9765h = c2082h;
        this.f9766i = c0927v;
        this.f9767j = c8810d;
        this.f9768k = c5113e;
        this.f9769l = c5979e;
        final int i10 = 1;
        String str = (63 & 1) != 0 ? "-" : "456";
        final int i11 = 2;
        C9003c c9003c = new C9003c(str, (63 & 2) != 0 ? "-" : "45s", (63 & 4) == 0 ? "45s" : "-", new i0(), new i0(), new i0());
        LocalDateTime localDateTimeOf = LocalDateTime.of(LocalDate.now(), LocalTime.MIN);
        AbstractC4154l.m8922e(localDateTimeOf, "of(...)");
        EnumC7204p enumC7204p = EnumC7204p.DEFAULT;
        C8800o c8800o = C8800o.f42459a;
        m1 m1VarM15372c = c1.m15372c(new C6265b(c9003c, localDateTimeOf, enumC7204p, C8800o.m16201j(), C6668r.f31943a, false, false, false));
        this.f9771n = m1VarM15372c;
        this.f9772o = new w0(m1VarM15372c);
        final int i12 = 0;
        this.f9773p = new C6295s(C2082h.m5794c(), context, new InterfaceC2137a(this) { // from class: ep.a

            /* renamed from: b */
            public final /* synthetic */ C2088f f9751b;

            {
                this.f9751b = this;
            }

            @Override // ex.InterfaceC2137a
            public final Object invoke() {
                switch (i12) {
                    case 0:
                        C2088f c2088f = this.f9751b;
                        c0.m13502y(q0.m5340g(c2088f), null, null, new C2084b(c2088f, null, 1), 3);
                        return a0.f30746a;
                    case 1:
                        this.f9751b.f9765h.getClass();
                        return C2082h.m5794c();
                    case 2:
                        this.f9751b.f9765h.getClass();
                        return C2082h.m5793b();
                    default:
                        this.f9751b.f9765h.getClass();
                        return C2082h.m5795d();
                }
            }
        }, new InterfaceC2137a(this) { // from class: ep.a

            /* renamed from: b */
            public final /* synthetic */ C2088f f9751b;

            {
                this.f9751b = this;
            }

            @Override // ex.InterfaceC2137a
            public final Object invoke() {
                switch (i10) {
                    case 0:
                        C2088f c2088f = this.f9751b;
                        c0.m13502y(q0.m5340g(c2088f), null, null, new C2084b(c2088f, null, 1), 3);
                        return a0.f30746a;
                    case 1:
                        this.f9751b.f9765h.getClass();
                        return C2082h.m5794c();
                    case 2:
                        this.f9751b.f9765h.getClass();
                        return C2082h.m5793b();
                    default:
                        this.f9751b.f9765h.getClass();
                        return C2082h.m5795d();
                }
            }
        });
        this.f9774q = new C6294r(C2082h.m5793b(), new InterfaceC2137a(this) { // from class: ep.a

            /* renamed from: b */
            public final /* synthetic */ C2088f f9751b;

            {
                this.f9751b = this;
            }

            @Override // ex.InterfaceC2137a
            public final Object invoke() {
                switch (i11) {
                    case 0:
                        C2088f c2088f = this.f9751b;
                        c0.m13502y(q0.m5340g(c2088f), null, null, new C2084b(c2088f, null, 1), 3);
                        return a0.f30746a;
                    case 1:
                        this.f9751b.f9765h.getClass();
                        return C2082h.m5794c();
                    case 2:
                        this.f9751b.f9765h.getClass();
                        return C2082h.m5793b();
                    default:
                        this.f9751b.f9765h.getClass();
                        return C2082h.m5795d();
                }
            }
        }, context);
        final int i13 = 3;
        this.f9775r = new C6296t(C2082h.m5795d(), new InterfaceC2137a(this) { // from class: ep.a

            /* renamed from: b */
            public final /* synthetic */ C2088f f9751b;

            {
                this.f9751b = this;
            }

            @Override // ex.InterfaceC2137a
            public final Object invoke() {
                switch (i13) {
                    case 0:
                        C2088f c2088f = this.f9751b;
                        c0.m13502y(q0.m5340g(c2088f), null, null, new C2084b(c2088f, null, 1), 3);
                        return a0.f30746a;
                    case 1:
                        this.f9751b.f9765h.getClass();
                        return C2082h.m5794c();
                    case 2:
                        this.f9751b.f9765h.getClass();
                        return C2082h.m5793b();
                    default:
                        this.f9751b.f9765h.getClass();
                        return C2082h.m5795d();
                }
            }
        }, context);
        do {
            value = m1VarM15372c.getValue();
        } while (!m1VarM15372c.m15397i(value, C6265b.m12270a((C6265b) value, null, null, null, null, null, true, false, 223)));
        InterfaceC7559c interfaceC7559c = null;
        c0.m13502y(this.f9767j, null, null, new C2084b(this, interfaceC7559c, i12), 3);
        c0.m13502y(this.f9767j, null, null, new C0724d((d7.w0) this, interfaceC7559c, i11), 3);
        c0.m13502y(this.f9767j, null, null, new C0782a(this, interfaceC7559c, i11), 3);
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x00e3, code lost:
    
        if (tx.c0.m13489l(200, r10) != r4) goto L15;
     */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001c  */
    /* renamed from: h */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object m5800h(ep.C2088f r22, ww.AbstractC8193c r23) {
        /*
            Method dump skipped, instructions count: 261
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ep.C2088f.m5800h(ep.f, ww.c):java.lang.Object");
    }

    @Override // ur.AbstractC7524q
    /* renamed from: e */
    public final void mo2033e(AbstractC7523p event) {
        AbstractC4154l.m8923f(event, "event");
        c0.m13502y(this.f9767j, null, null, new C1770t(event, this, null, 6), 3);
    }

    @Override // ur.AbstractC7524q
    /* renamed from: f */
    public final void mo2034f() {
        m1 m1Var;
        Object value;
        ArrayList arrayListD0 = AbstractC6663m.d0(((ur.i0) this.f36253c.f39340a.getValue()).f36224a);
        c0.m13502y(this.f9767j, null, null, new C0388a(arrayListD0, this, null, 11), 3);
        do {
            m1Var = this.f36252b;
            value = m1Var.getValue();
        } while (!m1Var.m15397i(value, ur.i0.m14293a((ur.i0) value, arrayListD0, null, null, null, null, 30)));
    }
}
