package xd;

import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.Trace;
import ay.C0496f;
import c3.C0850e;
import d3.C1552f;
import d3.C1559m;
import ex.InterfaceC2139c;
import f3.C2196b;
import ge.C2571c;
import ge.C2576h;
import ge.C2577i;
import i3.AbstractC3166c;
import k2.C3953b;
import k2.a1;
import k2.e1;
import k2.r1;
import k9.C4032f;
import ke.AbstractC4064e;
import pg.w5;
import pg.x5;
import t3.C7022i;
import t3.InterfaceC7023j;
import te.C7146c;
import tx.c0;
import tx.m0;
import tx.u1;
import ub.C7393i;
import uw.InterfaceC7559c;
import v3.i0;
import wd.C7998f;
import wx.c1;
import wx.m1;
import yx.AbstractC8819m;
import yx.C8810d;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: xd.j */
/* loaded from: classes.dex */
public final class C8339j extends AbstractC3166c implements r1 {

    /* renamed from: x */
    public static final C7393i f39936x = new C7393i(14);

    /* renamed from: f */
    public C8810d f39937f;

    /* renamed from: g */
    public final m1 f39938g = c1.m15372c(new C0850e(0));

    /* renamed from: h */
    public final e1 f39939h = C3953b.m8517t(null);

    /* renamed from: j */
    public final a1 f39940j = new a1(1.0f);

    /* renamed from: k */
    public final e1 f39941k = C3953b.m8517t(null);

    /* renamed from: l */
    public AbstractC8337h f39942l;

    /* renamed from: m */
    public AbstractC3166c f39943m;

    /* renamed from: n */
    public InterfaceC2139c f39944n;

    /* renamed from: p */
    public InterfaceC2139c f39945p;

    /* renamed from: q */
    public InterfaceC7023j f39946q;

    /* renamed from: r */
    public int f39947r;

    /* renamed from: s */
    public boolean f39948s;

    /* renamed from: t */
    public final e1 f39949t;

    /* renamed from: v */
    public final e1 f39950v;

    /* renamed from: w */
    public final e1 f39951w;

    public C8339j(C2577i c2577i, C7998f c7998f) {
        C8333d c8333d = C8333d.f39927a;
        this.f39942l = c8333d;
        this.f39944n = f39936x;
        this.f39946q = C7022i.f34006b;
        this.f39947r = 1;
        this.f39949t = C3953b.m8517t(c8333d);
        this.f39950v = C3953b.m8517t(c2577i);
        this.f39951w = C3953b.m8517t(c7998f);
    }

    @Override // i3.AbstractC3166c
    /* renamed from: a */
    public final boolean mo7531a(float f6) {
        this.f39940j.m8491g(f6);
        return true;
    }

    @Override // k2.r1
    /* renamed from: b */
    public final void mo5874b() {
        C8810d c8810d = this.f39937f;
        if (c8810d != null) {
            c0.m13485h(c8810d, null);
        }
        this.f39937f = null;
        Object obj = this.f39943m;
        r1 r1Var = obj instanceof r1 ? (r1) obj : null;
        if (r1Var != null) {
            r1Var.mo5874b();
        }
    }

    @Override // k2.r1
    /* renamed from: c */
    public final void mo5875c() {
        C8810d c8810d = this.f39937f;
        if (c8810d != null) {
            c0.m13485h(c8810d, null);
        }
        this.f39937f = null;
        Object obj = this.f39943m;
        r1 r1Var = obj instanceof r1 ? (r1) obj : null;
        if (r1Var != null) {
            r1Var.mo5875c();
        }
    }

    @Override // i3.AbstractC3166c
    /* renamed from: d */
    public final boolean mo7532d(C1559m c1559m) {
        this.f39941k.setValue(c1559m);
        return true;
    }

    @Override // k2.r1
    /* renamed from: e */
    public final void mo5876e() {
        Trace.beginSection("AsyncImagePainter.onRemembered");
        try {
            if (this.f39937f == null) {
                u1 u1VarM13481d = c0.m13481d();
                C0496f c0496f = m0.f34659a;
                C8810d c8810dM13479b = c0.m13479b(x5.m11928d(u1VarM13481d, AbstractC8819m.f42514a.f36446f));
                this.f39937f = c8810dM13479b;
                Object obj = this.f39943m;
                InterfaceC7559c interfaceC7559c = null;
                r1 r1Var = obj instanceof r1 ? (r1) obj : null;
                if (r1Var != null) {
                    r1Var.mo5876e();
                }
                if (this.f39948s) {
                    C2576h c2576hM6575a = C2577i.m6575a((C2577i) this.f39950v.getValue());
                    c2576hM6575a.f14003b = ((C7998f) this.f39951w.getValue()).f38447b;
                    c2576hM6575a.f14017p = null;
                    c2576hM6575a.m6574a().f14043z.getClass();
                    C2571c c2571c = AbstractC4064e.f20918a;
                    m15521k(new C8335f(null));
                } else {
                    c0.m13502y(c8810dM13479b, null, null, new C4032f(this, interfaceC7559c, 20), 3);
                }
            }
            Trace.endSection();
        } catch (Throwable th2) {
            Trace.endSection();
            throw th2;
        }
    }

    @Override // i3.AbstractC3166c
    /* renamed from: h */
    public final long mo7533h() {
        AbstractC3166c abstractC3166c = (AbstractC3166c) this.f39939h.getValue();
        if (abstractC3166c != null) {
            return abstractC3166c.mo7533h();
        }
        return 9205357640488583168L;
    }

    @Override // i3.AbstractC3166c
    /* renamed from: i */
    public final void mo7534i(i0 i0Var) {
        C2196b c2196b = i0Var.f36917a;
        C0850e c0850e = new C0850e(c2196b.mo5913e());
        m1 m1Var = this.f39938g;
        m1Var.getClass();
        m1Var.m15399k(null, c0850e);
        AbstractC3166c abstractC3166c = (AbstractC3166c) this.f39939h.getValue();
        if (abstractC3166c != null) {
            abstractC3166c.m7536g(i0Var, c2196b.mo5913e(), this.f39940j.m8490f(), (C1559m) this.f39941k.getValue());
        }
    }

    /* renamed from: j */
    public final AbstractC3166c m15520j(Drawable drawable) {
        return drawable instanceof BitmapDrawable ? w5.m11905a(new C1552f(((BitmapDrawable) drawable).getBitmap()), this.f39947r) : new C7146c(drawable.mutate());
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:28:? A[RETURN, SYNTHETIC] */
    /* renamed from: k */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m15521k(xd.AbstractC8337h r4) {
        /*
            r3 = this;
            xd.h r0 = r3.f39942l
            ex.c r1 = r3.f39944n
            java.lang.Object r4 = r1.invoke(r4)
            xd.h r4 = (xd.AbstractC8337h) r4
            r3.f39942l = r4
            k2.e1 r1 = r3.f39949t
            r1.setValue(r4)
            boolean r1 = r4 instanceof xd.C8336g
            if (r1 == 0) goto L1b
            r1 = r4
            xd.g r1 = (xd.C8336g) r1
            ge.o r1 = r1.f39932b
            goto L24
        L1b:
            boolean r1 = r4 instanceof xd.C8334e
            if (r1 == 0) goto L2d
            r1 = r4
            xd.e r1 = (xd.C8334e) r1
            ge.e r1 = r1.f39929b
        L24:
            ge.i r1 = r1.mo6573a()
            je.a r1 = r1.f14024g
            r1.getClass()
        L2d:
            i3.c r1 = r4.mo15519a()
            r3.f39943m = r1
            k2.e1 r2 = r3.f39939h
            r2.setValue(r1)
            yx.d r1 = r3.f39937f
            if (r1 == 0) goto L68
            i3.c r1 = r0.mo15519a()
            i3.c r2 = r4.mo15519a()
            if (r1 == r2) goto L68
            i3.c r0 = r0.mo15519a()
            boolean r1 = r0 instanceof k2.r1
            r2 = 0
            if (r1 == 0) goto L52
            k2.r1 r0 = (k2.r1) r0
            goto L53
        L52:
            r0 = r2
        L53:
            if (r0 == 0) goto L58
            r0.mo5875c()
        L58:
            i3.c r0 = r4.mo15519a()
            boolean r1 = r0 instanceof k2.r1
            if (r1 == 0) goto L63
            r2 = r0
            k2.r1 r2 = (k2.r1) r2
        L63:
            if (r2 == 0) goto L68
            r2.mo5876e()
        L68:
            ex.c r0 = r3.f39945p
            if (r0 == 0) goto L6f
            r0.invoke(r4)
        L6f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: xd.C8339j.m15521k(xd.h):void");
    }
}
