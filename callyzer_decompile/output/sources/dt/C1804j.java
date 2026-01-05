package dt;

import android.content.Context;
import ap.C0395h;
import at.C0430a;
import aw.C0483w;
import d7.w0;
import java.util.ArrayList;
import kotlin.NoWhenBranchMatchedException;
import nn.C5113e;
import pg.ma;
import pg.o6;
import qn.C6263l;
import rw.C6668r;
import tq.EnumC7204p;
import tx.c0;
import uw.InterfaceC7559c;
import vx.C7806h;
import wx.C8203d;
import wx.c1;
import wx.m1;
import yv.C8791f;
import yx.C8810d;
import zs.C9036a;
import zs.C9037b;
import zs.C9038c;
import zs.C9039d;
import zs.C9040e;
import zs.C9041f;
import zs.C9042g;
import zs.C9043h;
import zs.C9044i;
import zs.C9045j;
import zs.C9046k;
import zs.C9047l;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: dt.j */
/* loaded from: classes3.dex */
public final class C1804j extends w0 {

    /* renamed from: b */
    public final C6263l f8728b;

    /* renamed from: c */
    public final C5113e f8729c;

    /* renamed from: d */
    public final Context f8730d;

    /* renamed from: e */
    public final C8810d f8731e;

    /* renamed from: f */
    public final m1 f8732f;

    /* renamed from: g */
    public final wx.w0 f8733g;

    /* renamed from: h */
    public final m1 f8734h;

    /* renamed from: i */
    public final wx.w0 f8735i;

    /* renamed from: j */
    public final C7806h f8736j;

    /* renamed from: k */
    public final C8203d f8737k;

    public C1804j(C6263l c6263l, C5113e c5113e, Context context, C8810d c8810d) {
        this.f8728b = c6263l;
        this.f8729c = c5113e;
        this.f8730d = context;
        this.f8731e = c8810d;
        m1 m1VarM15372c = c1.m15372c(new C0430a(false, false, "", true, false, false, EnumC7204p.DEFAULT, "", "", -1, false, true, 0, null, new ArrayList(), C6668r.f31943a));
        this.f8732f = m1VarM15372c;
        this.f8733g = new wx.w0(m1VarM15372c);
        m1 m1VarM15372c2 = c1.m15372c("");
        this.f8734h = m1VarM15372c2;
        this.f8735i = new wx.w0(m1VarM15372c2);
        InterfaceC7559c interfaceC7559c = null;
        C7806h c7806hM11805a = o6.m11805a(0, null, null, 7);
        this.f8736j = c7806hM11805a;
        this.f8737k = c1.m15389t(c7806hM11805a);
        c0.m13502y(c8810d, null, null, new C0395h(this, interfaceC7559c, 1), 3);
        c0.m13502y(c8810d, null, null, new C0483w(this, interfaceC7559c, 1), 3);
        c0.m13502y(c8810d, null, null, new C1795a(this, interfaceC7559c, 0), 3);
        c0.m13502y(c8810d, null, null, new C1795a(this, interfaceC7559c, 1), 3);
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x007a, code lost:
    
        if (r2.mo14775g(r5, r0) == r1) goto L23;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* renamed from: e */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object m5474e(dt.C1804j r12, ww.AbstractC8193c r13) {
        /*
            boolean r0 = r13 instanceof dt.C1801g
            if (r0 == 0) goto L13
            r0 = r13
            dt.g r0 = (dt.C1801g) r0
            int r1 = r0.f8718c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f8718c = r1
            goto L18
        L13:
            dt.g r0 = new dt.g
            r0.<init>(r12, r13)
        L18:
            java.lang.Object r13 = r0.f8716a
            vw.a r1 = vw.EnumC7794a.COROUTINE_SUSPENDED
            int r2 = r0.f8718c
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L36
            if (r2 == r4) goto L32
            if (r2 != r3) goto L2a
            og.od.m10798c(r13)
            goto L7d
        L2a:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r13 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r13)
            throw r12
        L32:
            og.od.m10798c(r13)
            goto L50
        L36:
            og.od.m10798c(r13)
            qn.l r13 = r12.f8728b
            wx.w0 r2 = r12.f8733g
            wx.k1 r2 = r2.f39340a
            java.lang.Object r2 = r2.getValue()
            at.a r2 = (at.C0430a) r2
            java.lang.String r2 = r2.f3155c
            r0.f8718c = r4
            java.lang.Object r13 = r13.m12265k(r2, r0)
            if (r13 != r1) goto L50
            goto L7c
        L50:
            java.lang.Boolean r13 = (java.lang.Boolean) r13
            boolean r13 = r13.booleanValue()
            if (r13 != 0) goto L80
            vx.h r2 = r12.f8736j
            at.f r5 = new at.f
            r6 = r13 ^ 1
            android.content.Context r12 = r12.f8730d
            r13 = 2131952892(0x7f1304fc, float:1.954224E38)
            java.lang.String r7 = r12.getString(r13)
            java.lang.String r12 = "getString(...)"
            kotlin.jvm.internal.AbstractC4154l.m8922e(r7, r12)
            r10 = 0
            r11 = 28
            r8 = 0
            r9 = 0
            r5.<init>(r6, r7, r8, r9, r10, r11)
            r0.f8718c = r3
            java.lang.Object r12 = r2.mo14775g(r5, r0)
            if (r12 != r1) goto L7d
        L7c:
            return r1
        L7d:
            java.lang.Boolean r12 = java.lang.Boolean.FALSE
            return r12
        L80:
            java.lang.Boolean r12 = java.lang.Boolean.TRUE
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: dt.C1804j.m5474e(dt.j, ww.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:43:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x010a  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x012b A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0141  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001f  */
    /* renamed from: f */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object m5475f(dt.C1804j r32, tq.EnumC7204p r33, ww.AbstractC8193c r34) throws java.lang.Exception {
        /*
            Method dump skipped, instructions count: 377
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: dt.C1804j.m5475f(dt.j, tq.p, ww.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /* renamed from: g */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object m5476g(dt.C1804j r19, ww.AbstractC8193c r20) {
        /*
            r0 = r19
            r1 = r20
            boolean r2 = r1 instanceof dt.C1803i
            if (r2 == 0) goto L17
            r2 = r1
            dt.i r2 = (dt.C1803i) r2
            int r3 = r2.f8727c
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L17
            int r3 = r3 - r4
            r2.f8727c = r3
            goto L1c
        L17:
            dt.i r2 = new dt.i
            r2.<init>(r0, r1)
        L1c:
            java.lang.Object r1 = r2.f8725a
            vw.a r3 = vw.EnumC7794a.COROUTINE_SUSPENDED
            int r4 = r2.f8727c
            r5 = 1
            if (r4 == 0) goto L33
            if (r4 != r5) goto L2b
            og.od.m10798c(r1)
            goto L4d
        L2b:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L33:
            og.od.m10798c(r1)
            qn.l r1 = r0.f8728b
            wx.w0 r4 = r0.f8733g
            wx.k1 r4 = r4.f39340a
            java.lang.Object r4 = r4.getValue()
            at.a r4 = (at.C0430a) r4
            java.lang.String r4 = r4.f3155c
            r2.f8727c = r5
            java.lang.Object r1 = r1.m12260f(r4, r2)
            if (r1 != r3) goto L4d
            return r3
        L4d:
            java.util.List r1 = (java.util.List) r1
            wx.m1 r2 = r0.f8732f
        L51:
            java.lang.Object r3 = r2.getValue()
            r4 = r3
            at.a r4 = (at.C0430a) r4
            java.util.ArrayList r16 = rw.AbstractC6663m.d0(r1)
            wx.w0 r5 = r0.f8735i
            wx.k1 r5 = r5.f39340a
            java.lang.Object r5 = r5.getValue()
            java.lang.CharSequence r5 = (java.lang.CharSequence) r5
            int r5 = r5.length()
            if (r5 != 0) goto L6f
            r5 = -1
        L6d:
            r12 = r5
            goto L74
        L6f:
            int r5 = r1.size()
            goto L6d
        L74:
            r17 = 0
            r18 = 97279(0x17bff, float:1.36317E-40)
            r5 = 0
            r6 = 0
            r7 = 0
            r8 = 0
            r9 = 0
            r10 = 0
            r11 = 0
            r13 = 0
            r14 = 0
            r15 = 0
            at.a r4 = at.C0430a.m1453a(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18)
            boolean r3 = r2.m15397i(r3, r4)
            if (r3 == 0) goto L51
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: dt.C1804j.m5476g(dt.j, ww.c):java.lang.Object");
    }

    /* renamed from: h */
    public final void m5477h(ma maVar) {
        m1 m1Var;
        Object value;
        Object value2;
        Object value3;
        boolean z6 = maVar instanceof C9040e;
        int i10 = 3;
        C8810d c8810d = this.f8731e;
        InterfaceC7559c interfaceC7559c = null;
        if (z6) {
            c0.m13502y(c8810d, null, null, new C1799e(this, maVar, interfaceC7559c, i10), 3);
            return;
        }
        int i11 = 4;
        if (maVar instanceof C9044i) {
            c0.m13502y(c8810d, null, null, new C1799e(this, maVar, interfaceC7559c, i11), 3);
            return;
        }
        int i12 = 0;
        if (maVar instanceof C9039d) {
            c0.m13502y(c8810d, null, null, new C1800f(this, interfaceC7559c, i12), 3);
            return;
        }
        int i13 = 1;
        if (maVar.equals(C9038c.f43548b)) {
            c0.m13502y(c8810d, null, null, new C1800f(this, interfaceC7559c, i13), 3);
            return;
        }
        boolean z10 = maVar instanceof C9043h;
        m1 m1Var2 = this.f8734h;
        if (z10) {
            do {
                value3 = m1Var2.getValue();
            } while (!m1Var2.m15397i(value3, ((C9043h) maVar).f43553b));
            c0.m13502y(c8810d, null, null, new C1795a(this, interfaceC7559c, i11), 3);
            return;
        }
        int i14 = 2;
        if (maVar.equals(C9036a.f43545b)) {
            do {
                value2 = m1Var2.getValue();
            } while (!m1Var2.m15397i(value2, ((C0430a) this.f8733g.f39340a.getValue()).f3161i));
            c0.m13502y(c8810d, null, null, new C1795a(this, interfaceC7559c, i14), 3);
            return;
        }
        if (maVar instanceof C9045j) {
            do {
                m1Var = this.f8732f;
                value = m1Var.getValue();
            } while (!m1Var.m15397i(value, C0430a.m1453a((C0430a) value, false, false, null, false, false, ((C9045j) maVar).f43554b, null, 0, false, 0, null, null, null, 131007)));
            return;
        }
        if (maVar instanceof C9047l) {
            c0.m13502y(c8810d, null, null, new C1799e(this, maVar, interfaceC7559c, 5), 3);
            return;
        }
        if (maVar instanceof C9037b) {
            c0.m13502y(c8810d, null, null, new C1799e(this, maVar, interfaceC7559c, i12), 3);
            return;
        }
        if (maVar instanceof C9046k) {
            c0.m13502y(c8810d, null, null, new C1799e(this, maVar, interfaceC7559c, i13), 3);
            return;
        }
        if (maVar instanceof C9041f) {
            c0.m13502y(c8810d, null, null, new C1799e(this, maVar, interfaceC7559c, i14), 3);
        } else {
            if (!maVar.equals(C9042g.f43552b)) {
                throw new NoWhenBranchMatchedException();
            }
            C8791f c8791f = C8791f.f42457a;
            C8791f.m16174g(this.f8730d, "https://youtube.com/shorts/2VFoUdnAWus?si=ugdwuQ-gRpVcToK5");
        }
    }
}
