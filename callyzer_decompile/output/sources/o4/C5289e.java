package o4;

import android.graphics.Paint;
import android.text.TextPaint;
import c3.C0850e;
import com.skydoves.balloon.internals.DefinitionKt;
import d3.AbstractC1561o;
import d3.C1565s;
import d3.h0;
import d3.k0;
import f3.AbstractC2199e;
import f3.C2201g;
import f3.C2202h;
import k2.c0;
import kotlin.jvm.internal.AbstractC4154l;
import of.C5359n;
import r4.C6457l;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: o4.e */
/* loaded from: classes.dex */
public final class C5289e extends TextPaint {

    /* renamed from: a */
    public C5359n f25969a;

    /* renamed from: b */
    public C6457l f25970b;

    /* renamed from: c */
    public int f25971c;

    /* renamed from: d */
    public k0 f25972d;

    /* renamed from: e */
    public C1565s f25973e;

    /* renamed from: f */
    public AbstractC1561o f25974f;

    /* renamed from: g */
    public c0 f25975g;

    /* renamed from: h */
    public C0850e f25976h;

    /* renamed from: i */
    public AbstractC2199e f25977i;

    /* renamed from: a */
    public final C5359n m10431a() {
        C5359n c5359n = this.f25969a;
        if (c5359n != null) {
            return c5359n;
        }
        C5359n c5359n2 = new C5359n(this);
        this.f25969a = c5359n2;
        return c5359n2;
    }

    /* renamed from: b */
    public final void m10432b(int i10) {
        if (i10 == this.f25971c) {
            return;
        }
        m10431a().m10513t(i10);
        this.f25971c = i10;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0038  */
    /* renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m10433c(d3.AbstractC1561o r6, long r7, float r9) {
        /*
            r5 = this;
            r0 = 0
            if (r6 != 0) goto Ld
            r5.f25975g = r0
            r5.f25974f = r0
            r5.f25976h = r0
            r5.setShader(r0)
            return
        Ld:
            boolean r1 = r6 instanceof d3.n0
            if (r1 == 0) goto L1d
            d3.n0 r6 = (d3.n0) r6
            long r6 = r6.f7801a
            long r6 = og.vd.m11017a(r9, r6)
            r5.m10434d(r6)
            return
        L1d:
            boolean r1 = r6 instanceof d3.j0
            if (r1 == 0) goto L71
            d3.o r1 = r5.f25974f
            boolean r1 = kotlin.jvm.internal.AbstractC4154l.m8918a(r1, r6)
            r2 = 0
            if (r1 == 0) goto L38
            c3.e r1 = r5.f25976h
            if (r1 != 0) goto L30
            r1 = r2
            goto L36
        L30:
            long r3 = r1.f5366a
            boolean r1 = c3.C0850e.m2290a(r3, r7)
        L36:
            if (r1 != 0) goto L59
        L38:
            r3 = 9205357640488583168(0x7fc000007fc00000, double:2.247117487993712E307)
            int r1 = (r7 > r3 ? 1 : (r7 == r3 ? 0 : -1))
            if (r1 == 0) goto L42
            r2 = 1
        L42:
            if (r2 == 0) goto L59
            r5.f25974f = r6
            c3.e r1 = new c3.e
            r1.<init>(r7)
            r5.f25976h = r1
            g2.p3 r1 = new g2.p3
            r2 = 1
            r1.<init>(r2, r7, r6)
            k2.c0 r6 = k2.C3953b.m8512o(r1)
            r5.f25975g = r6
        L59:
            of.n r6 = r5.m10431a()
            k2.c0 r7 = r5.f25975g
            if (r7 == 0) goto L68
            java.lang.Object r7 = r7.getValue()
            android.graphics.Shader r7 = (android.graphics.Shader) r7
            goto L69
        L68:
            r7 = r0
        L69:
            r6.m10517x(r7)
            r5.f25973e = r0
            og.la.m10744a(r5, r9)
        L71:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: o4.C5289e.m10433c(d3.o, long, float):void");
    }

    /* renamed from: d */
    public final void m10434d(long j6) {
        C1565s c1565s = this.f25973e;
        if (c1565s == null ? false : C1565s.m5187c(c1565s.f7819a, j6)) {
            return;
        }
        if (j6 != 16) {
            this.f25973e = new C1565s(j6);
            setColor(h0.m5149u(j6));
            this.f25975g = null;
            this.f25974f = null;
            this.f25976h = null;
            setShader(null);
        }
    }

    /* renamed from: e */
    public final void m10435e(AbstractC2199e abstractC2199e) {
        if (abstractC2199e == null || AbstractC4154l.m8918a(this.f25977i, abstractC2199e)) {
            return;
        }
        this.f25977i = abstractC2199e;
        if (abstractC2199e.equals(C2201g.f10129a)) {
            setStyle(Paint.Style.FILL);
            return;
        }
        if (abstractC2199e instanceof C2202h) {
            m10431a().m10487B(1);
            C2202h c2202h = (C2202h) abstractC2199e;
            m10431a().m10486A(c2202h.f10130a);
            C5359n c5359nM10431a = m10431a();
            ((Paint) c5359nM10431a.f26304b).setStrokeMiter(c2202h.f10131b);
            m10431a().m10519z(c2202h.f10133d);
            m10431a().m10518y(c2202h.f10132c);
            ((Paint) m10431a().f26304b).setPathEffect(null);
        }
    }

    /* renamed from: f */
    public final void m10436f(k0 k0Var) {
        if (k0Var == null || AbstractC4154l.m8918a(this.f25972d, k0Var)) {
            return;
        }
        this.f25972d = k0Var;
        if (k0Var.equals(k0.f7781d)) {
            clearShadowLayer();
            return;
        }
        k0 k0Var2 = this.f25972d;
        float f6 = k0Var2.f7784c;
        if (f6 == DefinitionKt.NO_Float_VALUE) {
            f6 = Float.MIN_VALUE;
        }
        setShadowLayer(f6, Float.intBitsToFloat((int) (k0Var2.f7783b >> 32)), Float.intBitsToFloat((int) (this.f25972d.f7783b & 4294967295L)), h0.m5149u(this.f25972d.f7782a));
    }

    /* renamed from: g */
    public final void m10437g(C6457l c6457l) {
        if (c6457l == null || AbstractC4154l.m8918a(this.f25970b, c6457l)) {
            return;
        }
        this.f25970b = c6457l;
        int i10 = c6457l.f31119a;
        setUnderlineText((i10 | 1) == i10);
        int i11 = this.f25970b.f31119a;
        setStrikeThruText((i11 | 2) == i11);
    }
}
