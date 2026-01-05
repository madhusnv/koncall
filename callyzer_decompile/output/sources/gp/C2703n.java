package gp;

import android.content.Context;
import ay.C0496f;
import ay.ExecutorC0495e;
import bq.C0724d;
import bq.C0732l;
import bq.C0733m;
import bq.C0735o;
import c9.C0927v;
import com.websoptimization.callyzerbiz.R;
import d7.n0;
import d7.q0;
import dr.C1768r;
import dr.C1770t;
import eo.C2082h;
import ex.InterfaceC2137a;
import fp.C2362b;
import java.util.ArrayList;
import java.util.Iterator;
import jp.AbstractC3837r;
import jp.C3830k;
import jp.C3831l;
import kotlin.jvm.internal.AbstractC4154l;
import lv.C4531c;
import mn.g0;
import nn.C5113e;
import no.C5122i;
import og.pe;
import pg.e9;
import pg.f9;
import pg.o6;
import pn.C5979e;
import qp.C6266c;
import qr.C6294r;
import qr.C6295s;
import qr.C6296t;
import qw.a0;
import rw.AbstractC6663m;
import rw.C6668r;
import sw.C6959c;
import tx.c0;
import tx.m0;
import ur.AbstractC7523p;
import ur.AbstractC7524q;
import ur.C7508a;
import ur.C7509b;
import ur.C7514g;
import ur.C7518k;
import ur.C7522o;
import ur.C7530w;
import ur.i0;
import ur.p0;
import ur.r0;
import ur.u0;
import uw.InterfaceC7559c;
import vw.EnumC7794a;
import vx.C7806h;
import ww.AbstractC8199i;
import wx.C8203d;
import wx.c1;
import wx.m1;
import wx.w0;
import yv.C8805t;
import yx.C8810d;
import zm.EnumC8994d;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: gp.n */
/* loaded from: classes3.dex */
public final class C2703n extends AbstractC7524q {

    /* renamed from: A */
    public final C6296t f15082A;

    /* renamed from: f */
    public final Context f15083f;

    /* renamed from: g */
    public final g0 f15084g;

    /* renamed from: h */
    public final C0927v f15085h;

    /* renamed from: i */
    public final C8810d f15086i;

    /* renamed from: j */
    public final C2082h f15087j;

    /* renamed from: k */
    public final C5113e f15088k;

    /* renamed from: l */
    public final C8805t f15089l;

    /* renamed from: m */
    public final C5979e f15090m;

    /* renamed from: n */
    public final C5122i f15091n;

    /* renamed from: o */
    public final EnumC8994d f15092o;

    /* renamed from: p */
    public final ArrayList f15093p;

    /* renamed from: q */
    public final m1 f15094q;

    /* renamed from: r */
    public final w0 f15095r;

    /* renamed from: s */
    public final C7806h f15096s;

    /* renamed from: t */
    public final C8203d f15097t;

    /* renamed from: u */
    public boolean f15098u;

    /* renamed from: v */
    public final C4531c f15099v;

    /* renamed from: w */
    public final C7530w f15100w;

    /* renamed from: x */
    public final C6295s f15101x;

    /* renamed from: y */
    public final qr.g0 f15102y;

    /* renamed from: z */
    public final C6294r f15103z;

    public C2703n(Context context, g0 g0Var, C0927v c0927v, C8810d c8810d, C2082h c2082h, C5113e c5113e, C8805t c8805t, C5979e c5979e, C5122i noteUseCase, n0 savedStateHandle) {
        EnumC8994d enumC8994d;
        Object next;
        AbstractC4154l.m8923f(noteUseCase, "noteUseCase");
        AbstractC4154l.m8923f(savedStateHandle, "savedStateHandle");
        this.f15083f = context;
        this.f15084g = g0Var;
        this.f15085h = c0927v;
        this.f15086i = c8810d;
        this.f15087j = c2082h;
        this.f15088k = c5113e;
        this.f15089l = c8805t;
        this.f15090m = c5979e;
        this.f15091n = noteUseCase;
        String str = (String) savedStateHandle.m5330a("callType");
        InterfaceC7559c interfaceC7559c = null;
        if (str != null) {
            Iterator<E> it = EnumC8994d.getEntries().iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                } else {
                    next = it.next();
                    if (AbstractC4154l.m8918a(((EnumC8994d) next).name(), str)) {
                        break;
                    }
                }
            }
            enumC8994d = (EnumC8994d) next;
        } else {
            enumC8994d = null;
        }
        this.f15092o = enumC8994d;
        this.f15093p = new ArrayList();
        m1 m1VarM15372c = c1.m15372c(new C6266c());
        this.f15094q = m1VarM15372c;
        this.f15095r = new w0(m1VarM15372c);
        C7806h c7806hM11805a = o6.m11805a(0, null, null, 7);
        this.f15096s = c7806hM11805a;
        this.f15097t = c1.m15389t(c7806hM11805a);
        C2362b c2362b = new C2362b(this, 1);
        C2362b c2362b2 = new C2362b(this, 2);
        C2699j c2699j = new C2699j(this, null, 0);
        C2702m c2702m = new C2702m(this, null, 0);
        this.f15099v = new C4531c(Integer.valueOf(((C6266c) m1VarM15372c.getValue()).f30389p), c2362b, c2362b2, new C2702m(this, null, 1), c2702m, c2699j, null, new C2700k(this, interfaceC7559c, 1), new C1770t(this, interfaceC7559c, 27), new C0735o(this, interfaceC7559c, 2), 1088);
        C7530w c7530w = new C7530w(0, pe.m10835j(ur.g0.YES, ur.g0.NO), false);
        this.f15100w = c7530w;
        final int i10 = 0;
        final int i11 = 1;
        this.f15101x = new C6295s(c7530w, this.f15083f, new InterfaceC2137a(this) { // from class: gp.d

            /* renamed from: b */
            public final /* synthetic */ C2703n f15030b;

            {
                this.f15030b = this;
            }

            @Override // ex.InterfaceC2137a
            public final Object invoke() {
                switch (i10) {
                    case 0:
                        C2703n c2703n = this.f15030b;
                        c0.m13502y(q0.m5340g(c2703n), null, null, new C2694e(c2703n, null, 2), 3);
                        return a0.f30746a;
                    case 1:
                        return this.f15030b.f15100w;
                    case 2:
                        this.f15030b.f15087j.getClass();
                        return C2082h.m5793b();
                    default:
                        this.f15030b.f15087j.getClass();
                        return C2082h.m5795d();
                }
            }
        }, new InterfaceC2137a(this) { // from class: gp.d

            /* renamed from: b */
            public final /* synthetic */ C2703n f15030b;

            {
                this.f15030b = this;
            }

            @Override // ex.InterfaceC2137a
            public final Object invoke() {
                switch (i11) {
                    case 0:
                        C2703n c2703n = this.f15030b;
                        c0.m13502y(q0.m5340g(c2703n), null, null, new C2694e(c2703n, null, 2), 3);
                        return a0.f30746a;
                    case 1:
                        return this.f15030b.f15100w;
                    case 2:
                        this.f15030b.f15087j.getClass();
                        return C2082h.m5793b();
                    default:
                        this.f15030b.f15087j.getClass();
                        return C2082h.m5795d();
                }
            }
        });
        C6959c c6959cM10829d = pe.m10829d();
        c6959cM10829d.add(p0.f36251c);
        c6959cM10829d.add(ur.q0.f36256c);
        if (enumC8994d == EnumC8994d.INCOMING || enumC8994d == EnumC8994d.OUTGOING) {
            c6959cM10829d.add(u0.f36264c);
            c6959cM10829d.add(r0.f36258c);
        }
        this.f15102y = new qr.g0(f9.m11628b(this.f15083f, R.string.sort_by), new C7530w(1, AbstractC6663m.d0(pe.m10828c(c6959cM10829d)), false), this.f15083f);
        this.f15087j.getClass();
        final int i12 = 2;
        this.f15103z = new C6294r(C2082h.m5793b(), new InterfaceC2137a(this) { // from class: gp.d

            /* renamed from: b */
            public final /* synthetic */ C2703n f15030b;

            {
                this.f15030b = this;
            }

            @Override // ex.InterfaceC2137a
            public final Object invoke() {
                switch (i12) {
                    case 0:
                        C2703n c2703n = this.f15030b;
                        c0.m13502y(q0.m5340g(c2703n), null, null, new C2694e(c2703n, null, 2), 3);
                        return a0.f30746a;
                    case 1:
                        return this.f15030b.f15100w;
                    case 2:
                        this.f15030b.f15087j.getClass();
                        return C2082h.m5793b();
                    default:
                        this.f15030b.f15087j.getClass();
                        return C2082h.m5795d();
                }
            }
        }, this.f15083f);
        this.f15087j.getClass();
        final int i13 = 3;
        this.f15082A = new C6296t(C2082h.m5795d(), new InterfaceC2137a(this) { // from class: gp.d

            /* renamed from: b */
            public final /* synthetic */ C2703n f15030b;

            {
                this.f15030b = this;
            }

            @Override // ex.InterfaceC2137a
            public final Object invoke() {
                switch (i13) {
                    case 0:
                        C2703n c2703n = this.f15030b;
                        c0.m13502y(q0.m5340g(c2703n), null, null, new C2694e(c2703n, null, 2), 3);
                        return a0.f30746a;
                    case 1:
                        return this.f15030b.f15100w;
                    case 2:
                        this.f15030b.f15087j.getClass();
                        return C2082h.m5793b();
                    default:
                        this.f15030b.f15087j.getClass();
                        return C2082h.m5795d();
                }
            }
        }, this.f15083f);
        if (enumC8994d == null) {
            c0.m13502y(q0.m5340g(this), null, null, new C2694e(this, interfaceC7559c, 0), 3);
            return;
        }
        C8810d c8810d2 = this.f15086i;
        c0.m13502y(c8810d2, null, null, new C2694e(this, interfaceC7559c, 1), 3);
        c0.m13502y(c8810d2, null, null, new C0724d((d7.w0) this, interfaceC7559c, 4), 3);
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x00f9, code lost:
    
        if (r1 == r6) goto L31;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0110  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0133  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0158 A[LOOP:0: B:46:0x013d->B:50:0x0158, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0155 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001d  */
    /* JADX WARN: Type inference failed for: r10v8, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r1v28, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r7v10, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r8v8, types: [java.util.List] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:30:0x00f9 -> B:13:0x0055). Please report as a decompilation issue!!! */
    /* renamed from: h */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object m6707h(gp.C2703n r24, ww.AbstractC8193c r25) {
        /*
            Method dump skipped, instructions count: 346
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: gp.C2703n.m6707h(gp.n, ww.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0014  */
    /* renamed from: i */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object m6708i(gp.C2703n r12, int r13, ww.AbstractC8193c r14) {
        /*
            Method dump skipped, instructions count: 186
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: gp.C2703n.m6708i(gp.n, int, ww.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0014  */
    /* renamed from: j */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object m6709j(gp.C2703n r12, int r13, ww.AbstractC8193c r14) {
        /*
            Method dump skipped, instructions count: 186
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: gp.C2703n.m6709j(gp.n, int, ww.c):java.lang.Object");
    }

    /* renamed from: k */
    public static final Object m6710k(C2703n c2703n, AbstractC8199i abstractC8199i) {
        Object value;
        m1 m1Var = c2703n.f15094q;
        do {
            value = m1Var.getValue();
        } while (!m1Var.m15397i(value, C6266c.m12271a((C6266c) value, C6668r.f31943a, false, null, null, null, null, null, false, false, false, true, false, false, 0, false, false, 225278)));
        Object objM9381e = c2703n.f15099v.m9381e(abstractC8199i);
        return objM9381e == EnumC7794a.COROUTINE_SUSPENDED ? objM9381e : a0.f30746a;
    }

    @Override // ur.AbstractC7524q
    /* renamed from: e */
    public final void mo2033e(AbstractC7523p event) {
        m1 m1Var;
        Object value;
        AbstractC4154l.m8923f(event, "event");
        boolean z6 = event instanceof C7518k;
        C8810d c8810d = this.f15086i;
        InterfaceC7559c interfaceC7559c = null;
        if (z6) {
            c0.m13502y(c8810d, null, null, new C0732l(event, this, interfaceC7559c, 6, false), 3);
            return;
        }
        if (event instanceof C7514g) {
            C7514g c7514g = (C7514g) event;
            int i10 = c7514g.f36216a;
            int i11 = AbstractC2695f.f15034a[c7514g.f36217b.ordinal()];
            if (i11 == 1) {
                this.f15101x.m12320q(i10);
                return;
            } else if (i11 == 2) {
                this.f15103z.m12316q(i10);
                return;
            } else {
                if (i11 != 3) {
                    return;
                }
                this.f15082A.m12324q(i10);
                return;
            }
        }
        if (event instanceof C7508a) {
            m14294g();
            return;
        }
        boolean z10 = false;
        int i12 = 5;
        if (event instanceof C7509b) {
            c0.m13502y(c8810d, null, null, new C0733m(this, interfaceC7559c, i12, z10), 3);
            return;
        }
        if (event instanceof C7522o) {
            int i13 = ((C7522o) event).f36247a;
            qr.g0 g0Var = this.f15102y;
            g0Var.m12283c(i13);
            do {
                m1Var = this.f15094q;
                value = m1Var.getValue();
            } while (!m1Var.m15397i(value, C6266c.m12271a((C6266c) value, null, false, null, null, null, null, null, e9.m11604b(g0Var, r0.f36258c, u0.f36264c), false, false, false, false, e9.m11603a(g0Var), 0, false, false, 245247)));
            c0.m13502y(c8810d, null, null, new C2694e(this, interfaceC7559c, i12), 3);
        }
    }

    @Override // ur.AbstractC7524q
    /* renamed from: f */
    public final void mo2034f() {
        m1 m1Var;
        Object value;
        ArrayList arrayListD0 = AbstractC6663m.d0(((i0) this.f36253c.f39340a.getValue()).f36224a);
        c0.m13502y(this.f15086i, null, null, new C1770t(arrayListD0, this, null, 28), 3);
        do {
            m1Var = this.f36252b;
            value = m1Var.getValue();
        } while (!m1Var.m15397i(value, i0.m14293a((i0) value, arrayListD0, null, null, null, null, 30)));
    }

    /* renamed from: l */
    public final void m6711l(AbstractC3837r abstractC3837r) {
        InterfaceC7559c interfaceC7559c = null;
        if (abstractC3837r instanceof C3830k) {
            C0496f c0496f = m0.f34659a;
            c0.m13502y(c0.m13479b(ExecutorC0495e.f3538c), null, null, new C2694e(this, interfaceC7559c, 6), 3);
        } else if (abstractC3837r instanceof C3831l) {
            C3831l c3831l = (C3831l) abstractC3837r;
            c0.m13502y(this.f15086i, null, null, new C1768r(this, c3831l.f19784b, c3831l.f19783a, interfaceC7559c, 2), 3);
        }
    }
}
