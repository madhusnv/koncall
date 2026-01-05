package mq;

import ay.C0496f;
import ay.ExecutorC0495e;
import bq.C0732l;
import c9.C0910e;
import c9.C0927v;
import dy.AbstractC1856d;
import dy.C1855c;
import java.util.ArrayList;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.AbstractC4153k;
import kotlin.jvm.internal.AbstractC4154l;
import ln.C4494g;
import lp.C4504f;
import lq.C4508c;
import lv.C4531c;
import nn.C5113e;
import pg.o6;
import pn.C5979e;
import rt.C6617a;
import rw.C6668r;
import tq.EnumC7204p;
import uw.InterfaceC7559c;
import vx.C7806h;
import ww.AbstractC8193c;
import wx.C8203d;
import wx.c1;
import wx.m1;
import xm.y5;
import yv.C8805t;
import yx.C8810d;
import zp.C9007g;
import zp.C9008h;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes3.dex */
public final class a1 extends d7.w0 {

    /* renamed from: b */
    public final C0927v f24135b;

    /* renamed from: c */
    public final C0910e f24136c;

    /* renamed from: d */
    public final mn.g0 f24137d;

    /* renamed from: e */
    public final C5113e f24138e;

    /* renamed from: f */
    public final C5979e f24139f;

    /* renamed from: g */
    public final C8810d f24140g;

    /* renamed from: h */
    public final wx.w0 f24141h;

    /* renamed from: i */
    public final C4494g f24142i;

    /* renamed from: j */
    public final y5 f24143j;

    /* renamed from: k */
    public final boolean f24144k;

    /* renamed from: l */
    public final C8805t f24145l;

    /* renamed from: m */
    public final String f24146m;

    /* renamed from: n */
    public volatile EnumC7204p f24147n;

    /* renamed from: o */
    public final m1 f24148o;

    /* renamed from: p */
    public final wx.w0 f24149p;

    /* renamed from: q */
    public final int f24150q;

    /* renamed from: r */
    public boolean f24151r;

    /* renamed from: s */
    public Object f24152s;

    /* renamed from: t */
    public final C1855c f24153t;

    /* renamed from: u */
    public final C8810d f24154u;

    /* renamed from: v */
    public final C4531c f24155v;

    /* renamed from: w */
    public boolean f24156w;

    /* renamed from: x */
    public final C7806h f24157x;

    /* renamed from: y */
    public final C8203d f24158y;

    public a1(C0927v c0927v, C0910e c0910e, mn.g0 g0Var, C5113e c5113e, C5979e c5979e, C8810d c8810d, wx.w0 w0Var, C4494g c4494g, y5 userSIMUseCase, boolean z6, C8805t c8805t) {
        AbstractC4154l.m8923f(userSIMUseCase, "userSIMUseCase");
        this.f24135b = c0927v;
        this.f24136c = c0910e;
        this.f24137d = g0Var;
        this.f24138e = c5113e;
        this.f24139f = c5979e;
        this.f24140g = c8810d;
        this.f24141h = w0Var;
        this.f24142i = c4494g;
        this.f24143j = userSIMUseCase;
        this.f24144k = z6;
        this.f24145l = c8805t;
        this.f24146m = "NeverAttendAndNotPickUp";
        EnumC7204p enumC7204p = EnumC7204p.DEFAULT;
        C6668r c6668r = C6668r.f31943a;
        m1 m1VarM15372c = c1.m15372c(new C4508c(c6668r, false, true, 0, true, 0, false, enumC7204p, false, ""));
        this.f24148o = m1VarM15372c;
        this.f24149p = new wx.w0(m1VarM15372c);
        this.f24150q = 10;
        this.f24152s = c6668r;
        this.f24153t = AbstractC1856d.m5490a();
        C0496f c0496f = tx.m0.f34659a;
        ExecutorC0495e executorC0495e = ExecutorC0495e.f3538c;
        this.f24154u = tx.c0.m13479b(executorC0495e);
        hq.e0 e0Var = new hq.e0(this, 1);
        InterfaceC7559c interfaceC7559c = null;
        y0 y0Var = new y0(this, null, 0);
        x0 x0Var = new x0(this, interfaceC7559c, 2);
        z0 z0Var = new z0(this, (InterfaceC7559c) null);
        u0 u0Var = new u0(this, interfaceC7559c, 6);
        y0 y0Var2 = new y0(this, null, 1);
        hq.e0 e0Var2 = new hq.e0(this, 2);
        int i10 = ((C4508c) m1VarM15372c.getValue()).f22431d;
        i1.e0 e0Var3 = new i1.e0(2, e0Var2, AbstractC4153k.class, "suspendConversion0", "callHistoryPagination$suspendConversion0(Lkotlin/jvm/functions/Function1;Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0, 2);
        InterfaceC7559c interfaceC7559c2 = null;
        this.f24155v = new C4531c(Integer.valueOf(i10), e0Var, new hq.d0(18), y0Var, y0Var2, u0Var, null, e0Var3, x0Var, z0Var, 1088);
        C7806h c7806hM11805a = o6.m11805a(0, null, null, 7);
        this.f24157x = c7806hM11805a;
        this.f24158y = c1.m15389t(c7806hM11805a);
        tx.c0.m13502y(d7.q0.m5340g(this), executorC0495e, null, new C4504f(this, interfaceC7559c2, 8), 2);
        tx.c0.m13502y(c8810d, null, null, new C0732l(this, interfaceC7559c2, 10), 3);
    }

    /* JADX WARN: Code restructure failed: missing block: B:37:0x0105, code lost:
    
        if (r1 != r4) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x0154, code lost:
    
        if (r1 != r4) goto L55;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0126  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001c  */
    /* JADX WARN: Type inference failed for: r14v0, types: [uw.c] */
    /* JADX WARN: Type inference failed for: r14v6 */
    /* JADX WARN: Type inference failed for: r7v1, types: [java.lang.Object, java.util.List] */
    /* renamed from: e */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object m9788e(mq.a1 r17, int r18, int r19, ww.AbstractC8193c r20) {
        /*
            Method dump skipped, instructions count: 373
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: mq.a1.m9788e(mq.a1, int, int, ww.c):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:38:0x0111, code lost:
    
        if (r1 != r4) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x0160, code lost:
    
        if (r1 != r4) goto L56;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0132  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001c  */
    /* JADX WARN: Type inference failed for: r14v0, types: [uw.c] */
    /* JADX WARN: Type inference failed for: r14v6 */
    /* renamed from: f */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object m9789f(mq.a1 r17, int r18, int r19, ww.AbstractC8193c r20) {
        /*
            Method dump skipped, instructions count: 385
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: mq.a1.m9789f(mq.a1, int, int, ww.c):java.lang.Object");
    }

    /* renamed from: g */
    public static final void m9790g(a1 a1Var) {
        Object value;
        C4531c c4531c = a1Var.f24155v;
        c4531c.f22521l = c4531c.f22511b;
        m1 m1Var = a1Var.f24148o;
        do {
            value = m1Var.getValue();
        } while (!m1Var.m15397i(value, C4508c.m9341a((C4508c) value, C6668r.f31943a, false, false, 0, false, 0, false, null, false, null, 964)));
        tx.c0.m13502y(a1Var.f24154u, null, null, new u0(a1Var, null, 2), 3);
    }

    /* renamed from: h */
    public final Object m9791h(AbstractC8193c abstractC8193c) {
        EnumC7204p enumC7204p = this.f24147n;
        if (enumC7204p == null) {
            AbstractC4154l.m8928k("simSelectionMode");
            throw null;
        }
        if (enumC7204p == EnumC7204p.DEFAULT) {
            return "";
        }
        EnumC7204p enumC7204p2 = this.f24147n;
        if (enumC7204p2 == null) {
            AbstractC4154l.m8928k("simSelectionMode");
            throw null;
        }
        if (enumC7204p2 == EnumC7204p.ALL) {
            return "";
        }
        C5113e c5113e = this.f24138e;
        EnumC7204p enumC7204p3 = this.f24147n;
        if (enumC7204p3 != null) {
            return c5113e.m10040c(enumC7204p3, abstractC8193c);
        }
        AbstractC4154l.m8928k("simSelectionMode");
        throw null;
    }

    /* renamed from: i */
    public final void m9792i(s0 action) {
        C6617a c6617a;
        m1 m1Var;
        Object value;
        AbstractC4154l.m8923f(action, "action");
        boolean z6 = action instanceof m0;
        C8810d c8810d = this.f24154u;
        InterfaceC7559c interfaceC7559c = null;
        if (z6) {
            do {
                m1Var = this.f24148o;
                value = m1Var.getValue();
            } while (!m1Var.m15397i(value, C4508c.m9341a((C4508c) value, null, false, false, 0, false, 0, ((m0) action).f24303a, null, false, null, 959)));
            tx.c0.m13502y(c8810d, null, null, new u0(this, interfaceC7559c, 5), 3);
            return;
        }
        boolean z10 = action instanceof l0;
        C0910e c0910e = this.f24136c;
        if (z10) {
            c0910e.m2609s(((l0) action).f24301a);
            return;
        }
        if (action.equals(n0.f24305a)) {
            tx.c0.m13502y(c8810d, null, null, new w0(this, interfaceC7559c, 3), 3);
            return;
        }
        if (action instanceof p0) {
            c0910e.m2588G(((p0) action).f24311a);
            return;
        }
        if (action instanceof o0) {
            c0910e.m2585D(((o0) action).f24308a);
            return;
        }
        if (action instanceof r0) {
            c0910e.m2587F(((r0) action).f24315a);
            return;
        }
        if (!(action instanceof q0)) {
            throw new NoWhenBranchMatchedException();
        }
        C9008h c9008h = ((q0) action).f24313a;
        if (c9008h != null) {
            ArrayList arrayList = c9008h.f43402h;
            c6617a = new C6617a(c9008h.f43397c, c9008h.f43399e, c9008h.f43401g, String.valueOf(c9008h.f43400f), ((C9007g) arrayList.get(0)).f43389a.f27177b, ((C9007g) arrayList.get(0)).f43389a.f27176a, "00", null, 0, null, null, null, 3968);
        } else {
            c6617a = null;
        }
        tx.c0.m13502y(this.f24140g, null, null, new C4504f(this, c6617a, interfaceC7559c, 10), 3);
    }
}
