package g3;

import a3.C0045d;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Outline;
import android.graphics.Rect;
import android.os.Build;
import android.view.View;
import android.view.ViewParent;
import c6.AbstractC0879i;
import d3.AbstractC1550d;
import d3.C1549c;
import d3.C1564r;
import d3.C1565s;
import d3.InterfaceC1563q;
import d3.h0;
import f3.C2196b;
import h3.AbstractC2822a;
import s4.C6756l;
import s4.EnumC6757m;
import s4.InterfaceC6747c;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: g3.h */
/* loaded from: classes.dex */
public final class C2480h implements InterfaceC2476d {

    /* renamed from: A */
    public static final C2479g f13489A = new C2479g();

    /* renamed from: b */
    public final AbstractC2822a f13490b;

    /* renamed from: c */
    public final C1564r f13491c;

    /* renamed from: d */
    public final C2484l f13492d;

    /* renamed from: e */
    public final Resources f13493e;

    /* renamed from: f */
    public final Rect f13494f;

    /* renamed from: g */
    public int f13495g;

    /* renamed from: h */
    public int f13496h;

    /* renamed from: i */
    public long f13497i;

    /* renamed from: j */
    public boolean f13498j;

    /* renamed from: k */
    public boolean f13499k;

    /* renamed from: l */
    public boolean f13500l;

    /* renamed from: m */
    public final int f13501m;

    /* renamed from: n */
    public int f13502n;

    /* renamed from: o */
    public float f13503o;

    /* renamed from: p */
    public boolean f13504p;

    /* renamed from: q */
    public float f13505q;

    /* renamed from: r */
    public float f13506r;

    /* renamed from: s */
    public float f13507s;

    /* renamed from: t */
    public float f13508t;

    /* renamed from: u */
    public float f13509u;

    /* renamed from: v */
    public long f13510v;

    /* renamed from: w */
    public long f13511w;

    /* renamed from: x */
    public float f13512x;

    /* renamed from: y */
    public float f13513y;

    /* renamed from: z */
    public float f13514z;

    public C2480h(AbstractC2822a abstractC2822a) {
        C1564r c1564r = new C1564r();
        C2196b c2196b = new C2196b();
        this.f13490b = abstractC2822a;
        this.f13491c = c1564r;
        C2484l c2484l = new C2484l(abstractC2822a, c1564r, c2196b);
        this.f13492d = c2484l;
        this.f13493e = abstractC2822a.getResources();
        this.f13494f = new Rect();
        abstractC2822a.addView(c2484l);
        c2484l.setClipBounds(null);
        this.f13497i = 0L;
        View.generateViewId();
        this.f13501m = 3;
        this.f13502n = 0;
        this.f13503o = 1.0f;
        this.f13505q = 1.0f;
        this.f13506r = 1.0f;
        long j6 = C1565s.f7809b;
        this.f13510v = j6;
        this.f13511w = j6;
    }

    @Override // g3.InterfaceC2476d
    /* renamed from: A */
    public final void mo6368A(InterfaceC1563q interfaceC1563q) {
        Rect rect;
        boolean z6 = this.f13498j;
        C2484l c2484l = this.f13492d;
        if (z6) {
            if ((this.f13500l || c2484l.getClipToOutline()) && !this.f13499k) {
                rect = this.f13494f;
                rect.left = 0;
                rect.top = 0;
                rect.right = c2484l.getWidth();
                rect.bottom = c2484l.getHeight();
            } else {
                rect = null;
            }
            c2484l.setClipBounds(rect);
        }
        if (AbstractC1550d.m5119a(interfaceC1563q).isHardwareAccelerated()) {
            this.f13490b.m6927a(interfaceC1563q, c2484l, c2484l.getDrawingTime());
        }
    }

    @Override // g3.InterfaceC2476d
    /* renamed from: B */
    public final float mo6369B() {
        return this.f13492d.getCameraDistance() / this.f13493e.getDisplayMetrics().densityDpi;
    }

    @Override // g3.InterfaceC2476d
    /* renamed from: C */
    public final float mo6370C() {
        return this.f13507s;
    }

    @Override // g3.InterfaceC2476d
    /* renamed from: D */
    public final void mo6371D(boolean z6) {
        boolean z10 = false;
        this.f13500l = z6 && !this.f13499k;
        this.f13498j = true;
        if (z6 && this.f13499k) {
            z10 = true;
        }
        this.f13492d.setClipToOutline(z10);
    }

    @Override // g3.InterfaceC2476d
    /* renamed from: E */
    public final float mo6372E() {
        return this.f13512x;
    }

    @Override // g3.InterfaceC2476d
    /* renamed from: F */
    public final void mo6373F(int i10) {
        this.f13502n = i10;
        C2484l c2484l = this.f13492d;
        boolean z6 = true;
        if (i10 == 1 || this.f13501m != 3) {
            c2484l.setLayerType(2, null);
            c2484l.setCanUseCompositingLayer$ui_graphics_release(true);
            return;
        }
        if (i10 == 1) {
            c2484l.setLayerType(2, null);
        } else if (i10 == 2) {
            c2484l.setLayerType(0, null);
            z6 = false;
        } else {
            c2484l.setLayerType(0, null);
        }
        c2484l.setCanUseCompositingLayer$ui_graphics_release(z6);
    }

    @Override // g3.InterfaceC2476d
    /* renamed from: G */
    public final void mo6374G(long j6) {
        if (Build.VERSION.SDK_INT >= 28) {
            this.f13511w = j6;
            AbstractC0879i.m2411w(h0.m5149u(j6), this.f13492d);
        }
    }

    @Override // g3.InterfaceC2476d
    /* renamed from: H */
    public final Matrix mo6375H() {
        return this.f13492d.getMatrix();
    }

    @Override // g3.InterfaceC2476d
    /* renamed from: I */
    public final float mo6376I() {
        return this.f13509u;
    }

    @Override // g3.InterfaceC2476d
    /* renamed from: J */
    public final float mo6377J() {
        return this.f13506r;
    }

    @Override // g3.InterfaceC2476d
    /* renamed from: K */
    public final int mo6378K() {
        return this.f13501m;
    }

    @Override // g3.InterfaceC2476d
    /* renamed from: a */
    public final float mo6379a() {
        return this.f13503o;
    }

    @Override // g3.InterfaceC2476d
    /* renamed from: c */
    public final void mo6380c(float f6) {
        this.f13513y = f6;
        this.f13492d.setRotationY(f6);
    }

    @Override // g3.InterfaceC2476d
    /* renamed from: d */
    public final void mo6381d(float f6) {
        this.f13514z = f6;
        this.f13492d.setRotation(f6);
    }

    @Override // g3.InterfaceC2476d
    /* renamed from: e */
    public final void mo6382e(float f6) {
        this.f13508t = f6;
        this.f13492d.setTranslationY(f6);
    }

    @Override // g3.InterfaceC2476d
    /* renamed from: f */
    public final void mo6383f() {
        this.f13490b.removeViewInLayout(this.f13492d);
    }

    @Override // g3.InterfaceC2476d
    /* renamed from: g */
    public final void mo6384g(float f6) {
        this.f13506r = f6;
        this.f13492d.setScaleY(f6);
    }

    @Override // g3.InterfaceC2476d
    /* renamed from: i */
    public final void mo6386i(float f6) {
        this.f13503o = f6;
        this.f13492d.setAlpha(f6);
    }

    @Override // g3.InterfaceC2476d
    /* renamed from: j */
    public final void mo6387j(float f6) {
        this.f13505q = f6;
        this.f13492d.setScaleX(f6);
    }

    @Override // g3.InterfaceC2476d
    /* renamed from: k */
    public final void mo6388k(float f6) {
        this.f13507s = f6;
        this.f13492d.setTranslationX(f6);
    }

    @Override // g3.InterfaceC2476d
    /* renamed from: l */
    public final void mo6389l(float f6) {
        this.f13492d.setCameraDistance(f6 * this.f13493e.getDisplayMetrics().densityDpi);
    }

    @Override // g3.InterfaceC2476d
    /* renamed from: m */
    public final void mo6390m(float f6) {
        this.f13512x = f6;
        this.f13492d.setRotationX(f6);
    }

    @Override // g3.InterfaceC2476d
    /* renamed from: n */
    public final float mo6391n() {
        return this.f13505q;
    }

    @Override // g3.InterfaceC2476d
    /* renamed from: o */
    public final void mo6392o(float f6) {
        this.f13509u = f6;
        this.f13492d.setElevation(f6);
    }

    @Override // g3.InterfaceC2476d
    /* renamed from: p */
    public final void mo6393p(Outline outline, long j6) {
        C2484l c2484l = this.f13492d;
        c2484l.f13521e = outline;
        c2484l.invalidateOutline();
        if ((this.f13500l || c2484l.getClipToOutline()) && outline != null) {
            c2484l.setClipToOutline(true);
            if (this.f13500l) {
                this.f13500l = false;
                this.f13498j = true;
            }
        }
        this.f13499k = outline != null;
    }

    @Override // g3.InterfaceC2476d
    /* renamed from: q */
    public final int mo6394q() {
        return this.f13502n;
    }

    @Override // g3.InterfaceC2476d
    /* renamed from: r */
    public final void mo6395r(int i10, int i11, long j6) {
        boolean zM12948a = C6756l.m12948a(this.f13497i, j6);
        C2484l c2484l = this.f13492d;
        if (zM12948a) {
            int i12 = this.f13495g;
            if (i12 != i10) {
                c2484l.offsetLeftAndRight(i10 - i12);
            }
            int i13 = this.f13496h;
            if (i13 != i11) {
                c2484l.offsetTopAndBottom(i11 - i13);
            }
        } else {
            if (this.f13500l || c2484l.getClipToOutline()) {
                this.f13498j = true;
            }
            int i14 = (int) (j6 >> 32);
            int i15 = (int) (4294967295L & j6);
            c2484l.layout(i10, i11, i10 + i14, i11 + i15);
            this.f13497i = j6;
            if (this.f13504p) {
                c2484l.setPivotX(i14 / 2.0f);
                c2484l.setPivotY(i15 / 2.0f);
            }
        }
        this.f13495g = i10;
        this.f13496h = i11;
    }

    @Override // g3.InterfaceC2476d
    /* renamed from: s */
    public final float mo6396s() {
        return this.f13513y;
    }

    @Override // g3.InterfaceC2476d
    /* renamed from: t */
    public final float mo6397t() {
        return this.f13514z;
    }

    @Override // g3.InterfaceC2476d
    /* renamed from: u */
    public final void mo6398u(long j6) {
        long j10 = 9223372034707292159L & j6;
        C2484l c2484l = this.f13492d;
        if (j10 != 9205357640488583168L) {
            this.f13504p = false;
            c2484l.setPivotX(Float.intBitsToFloat((int) (j6 >> 32)));
            c2484l.setPivotY(Float.intBitsToFloat((int) (j6 & 4294967295L)));
        } else {
            if (Build.VERSION.SDK_INT >= 28) {
                AbstractC0879i.m2407s(c2484l);
                return;
            }
            this.f13504p = true;
            c2484l.setPivotX(((int) (this.f13497i >> 32)) / 2.0f);
            c2484l.setPivotY(((int) (this.f13497i & 4294967295L)) / 2.0f);
        }
    }

    @Override // g3.InterfaceC2476d
    /* renamed from: v */
    public final long mo6399v() {
        return this.f13510v;
    }

    @Override // g3.InterfaceC2476d
    /* renamed from: w */
    public final void mo6400w(InterfaceC6747c interfaceC6747c, EnumC6757m enumC6757m, C2474b c2474b, C0045d c0045d) {
        C2484l c2484l = this.f13492d;
        ViewParent parent = c2484l.getParent();
        AbstractC2822a abstractC2822a = this.f13490b;
        if (parent == null) {
            abstractC2822a.addView(c2484l);
        }
        c2484l.f13523g = interfaceC6747c;
        c2484l.f13524h = enumC6757m;
        c2484l.f13525j = c0045d;
        c2484l.f13526k = c2474b;
        if (c2484l.isAttachedToWindow()) {
            c2484l.setVisibility(4);
            c2484l.setVisibility(0);
            try {
                C1564r c1564r = this.f13491c;
                C2479g c2479g = f13489A;
                C1549c c1549c = c1564r.f7808a;
                Canvas canvas = c1549c.f7733a;
                c1549c.f7733a = c2479g;
                abstractC2822a.m6927a(c1549c, c2484l, c2484l.getDrawingTime());
                c1564r.f7808a.f7733a = canvas;
            } catch (Throwable unused) {
            }
        }
    }

    @Override // g3.InterfaceC2476d
    /* renamed from: x */
    public final float mo6401x() {
        return this.f13508t;
    }

    @Override // g3.InterfaceC2476d
    /* renamed from: y */
    public final long mo6402y() {
        return this.f13511w;
    }

    @Override // g3.InterfaceC2476d
    /* renamed from: z */
    public final void mo6403z(long j6) {
        if (Build.VERSION.SDK_INT >= 28) {
            this.f13510v = j6;
            AbstractC0879i.m2410v(h0.m5149u(j6), this.f13492d);
        }
    }
}
