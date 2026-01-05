package g3;

import a1.C0005d;
import a3.C0045d;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Outline;
import android.graphics.Paint;
import android.os.Build;
import android.view.DisplayListCanvas;
import android.view.RenderNode;
import d3.AbstractC1550d;
import d3.C1549c;
import d3.C1564r;
import d3.C1565s;
import d3.InterfaceC1563q;
import d3.h0;
import f3.C2195a;
import f3.C2196b;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.AbstractC4154l;
import og.ze;
import s4.C6756l;
import s4.EnumC6757m;
import s4.InterfaceC6747c;
import w3.C7904v;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: g3.e */
/* loaded from: classes.dex */
public final class C2477e implements InterfaceC2476d {

    /* renamed from: A */
    public static final AtomicBoolean f13440A = new AtomicBoolean(true);

    /* renamed from: b */
    public final C1564r f13441b;

    /* renamed from: c */
    public final C2196b f13442c;

    /* renamed from: d */
    public final RenderNode f13443d;

    /* renamed from: e */
    public long f13444e;

    /* renamed from: f */
    public Matrix f13445f;

    /* renamed from: g */
    public boolean f13446g;

    /* renamed from: h */
    public long f13447h;

    /* renamed from: i */
    public int f13448i;

    /* renamed from: j */
    public final int f13449j;

    /* renamed from: k */
    public float f13450k;

    /* renamed from: l */
    public boolean f13451l;

    /* renamed from: m */
    public float f13452m;

    /* renamed from: n */
    public float f13453n;

    /* renamed from: o */
    public float f13454o;

    /* renamed from: p */
    public float f13455p;

    /* renamed from: q */
    public float f13456q;

    /* renamed from: r */
    public long f13457r;

    /* renamed from: s */
    public long f13458s;

    /* renamed from: t */
    public float f13459t;

    /* renamed from: u */
    public float f13460u;

    /* renamed from: v */
    public float f13461v;

    /* renamed from: w */
    public float f13462w;

    /* renamed from: x */
    public boolean f13463x;

    /* renamed from: y */
    public boolean f13464y;

    /* renamed from: z */
    public boolean f13465z;

    public C2477e(C7904v c7904v, C1564r c1564r, C2196b c2196b) {
        this.f13441b = c1564r;
        this.f13442c = c2196b;
        RenderNode renderNodeCreate = RenderNode.create("Compose", c7904v);
        this.f13443d = renderNodeCreate;
        this.f13444e = 0L;
        this.f13447h = 0L;
        if (f13440A.getAndSet(false)) {
            renderNodeCreate.setScaleX(renderNodeCreate.getScaleX());
            renderNodeCreate.setScaleY(renderNodeCreate.getScaleY());
            renderNodeCreate.setTranslationX(renderNodeCreate.getTranslationX());
            renderNodeCreate.setTranslationY(renderNodeCreate.getTranslationY());
            renderNodeCreate.setElevation(renderNodeCreate.getElevation());
            renderNodeCreate.setRotation(renderNodeCreate.getRotation());
            renderNodeCreate.setRotationX(renderNodeCreate.getRotationX());
            renderNodeCreate.setRotationY(renderNodeCreate.getRotationY());
            renderNodeCreate.setCameraDistance(renderNodeCreate.getCameraDistance());
            renderNodeCreate.setPivotX(renderNodeCreate.getPivotX());
            renderNodeCreate.setPivotY(renderNodeCreate.getPivotY());
            renderNodeCreate.setClipToOutline(renderNodeCreate.getClipToOutline());
            renderNodeCreate.setClipToBounds(false);
            renderNodeCreate.setAlpha(renderNodeCreate.getAlpha());
            renderNodeCreate.isValid();
            renderNodeCreate.setLeftTopRightBottom(0, 0, 0, 0);
            renderNodeCreate.offsetLeftAndRight(0);
            renderNodeCreate.offsetTopAndBottom(0);
            if (Build.VERSION.SDK_INT >= 28) {
                AbstractC2483k.m6411c(renderNodeCreate, AbstractC2483k.m6409a(renderNodeCreate));
                AbstractC2483k.m6412d(renderNodeCreate, AbstractC2483k.m6410b(renderNodeCreate));
            }
            AbstractC2482j.m6408a(renderNodeCreate);
            renderNodeCreate.setLayerType(0);
            renderNodeCreate.setHasOverlappingRendering(renderNodeCreate.hasOverlappingRendering());
        }
        renderNodeCreate.setClipToBounds(false);
        m6404L(0);
        this.f13448i = 0;
        this.f13449j = 3;
        this.f13450k = 1.0f;
        this.f13452m = 1.0f;
        this.f13453n = 1.0f;
        long j6 = C1565s.f7809b;
        this.f13457r = j6;
        this.f13458s = j6;
        this.f13462w = 8.0f;
    }

    @Override // g3.InterfaceC2476d
    /* renamed from: A */
    public final void mo6368A(InterfaceC1563q interfaceC1563q) {
        DisplayListCanvas displayListCanvasM5119a = AbstractC1550d.m5119a(interfaceC1563q);
        AbstractC4154l.m8921d(displayListCanvasM5119a, "null cannot be cast to non-null type android.view.DisplayListCanvas");
        displayListCanvasM5119a.drawRenderNode(this.f13443d);
    }

    @Override // g3.InterfaceC2476d
    /* renamed from: B */
    public final float mo6369B() {
        return this.f13462w;
    }

    @Override // g3.InterfaceC2476d
    /* renamed from: C */
    public final float mo6370C() {
        return this.f13454o;
    }

    @Override // g3.InterfaceC2476d
    /* renamed from: D */
    public final void mo6371D(boolean z6) {
        this.f13463x = z6;
        m6405b();
    }

    @Override // g3.InterfaceC2476d
    /* renamed from: E */
    public final float mo6372E() {
        return this.f13459t;
    }

    @Override // g3.InterfaceC2476d
    /* renamed from: F */
    public final void mo6373F(int i10) {
        this.f13448i = i10;
        if (i10 != 1 && this.f13449j == 3) {
            m6404L(i10);
        } else {
            m6404L(1);
        }
    }

    @Override // g3.InterfaceC2476d
    /* renamed from: G */
    public final void mo6374G(long j6) {
        if (Build.VERSION.SDK_INT >= 28) {
            this.f13458s = j6;
            AbstractC2483k.m6412d(this.f13443d, h0.m5149u(j6));
        }
    }

    @Override // g3.InterfaceC2476d
    /* renamed from: H */
    public final Matrix mo6375H() {
        Matrix matrix = this.f13445f;
        if (matrix == null) {
            matrix = new Matrix();
            this.f13445f = matrix;
        }
        this.f13443d.getMatrix(matrix);
        return matrix;
    }

    @Override // g3.InterfaceC2476d
    /* renamed from: I */
    public final float mo6376I() {
        return this.f13456q;
    }

    @Override // g3.InterfaceC2476d
    /* renamed from: J */
    public final float mo6377J() {
        return this.f13453n;
    }

    @Override // g3.InterfaceC2476d
    /* renamed from: K */
    public final int mo6378K() {
        return this.f13449j;
    }

    /* renamed from: L */
    public final void m6404L(int i10) {
        RenderNode renderNode = this.f13443d;
        if (i10 == 1) {
            renderNode.setLayerType(2);
            renderNode.setLayerPaint((Paint) null);
            renderNode.setHasOverlappingRendering(true);
        } else if (i10 == 2) {
            renderNode.setLayerType(0);
            renderNode.setLayerPaint((Paint) null);
            renderNode.setHasOverlappingRendering(false);
        } else {
            renderNode.setLayerType(0);
            renderNode.setLayerPaint((Paint) null);
            renderNode.setHasOverlappingRendering(true);
        }
    }

    @Override // g3.InterfaceC2476d
    /* renamed from: a */
    public final float mo6379a() {
        return this.f13450k;
    }

    /* renamed from: b */
    public final void m6405b() {
        boolean z6 = this.f13463x;
        boolean z10 = false;
        boolean z11 = z6 && !this.f13446g;
        if (z6 && this.f13446g) {
            z10 = true;
        }
        if (z11 != this.f13464y) {
            this.f13464y = z11;
            this.f13443d.setClipToBounds(z11);
        }
        if (z10 != this.f13465z) {
            this.f13465z = z10;
            this.f13443d.setClipToOutline(z10);
        }
    }

    @Override // g3.InterfaceC2476d
    /* renamed from: c */
    public final void mo6380c(float f6) {
        this.f13460u = f6;
        this.f13443d.setRotationY(f6);
    }

    @Override // g3.InterfaceC2476d
    /* renamed from: d */
    public final void mo6381d(float f6) {
        this.f13461v = f6;
        this.f13443d.setRotation(f6);
    }

    @Override // g3.InterfaceC2476d
    /* renamed from: e */
    public final void mo6382e(float f6) {
        this.f13455p = f6;
        this.f13443d.setTranslationY(f6);
    }

    @Override // g3.InterfaceC2476d
    /* renamed from: f */
    public final void mo6383f() {
        AbstractC2482j.m6408a(this.f13443d);
    }

    @Override // g3.InterfaceC2476d
    /* renamed from: g */
    public final void mo6384g(float f6) {
        this.f13453n = f6;
        this.f13443d.setScaleY(f6);
    }

    @Override // g3.InterfaceC2476d
    /* renamed from: h */
    public final boolean mo6385h() {
        return this.f13443d.isValid();
    }

    @Override // g3.InterfaceC2476d
    /* renamed from: i */
    public final void mo6386i(float f6) {
        this.f13450k = f6;
        this.f13443d.setAlpha(f6);
    }

    @Override // g3.InterfaceC2476d
    /* renamed from: j */
    public final void mo6387j(float f6) {
        this.f13452m = f6;
        this.f13443d.setScaleX(f6);
    }

    @Override // g3.InterfaceC2476d
    /* renamed from: k */
    public final void mo6388k(float f6) {
        this.f13454o = f6;
        this.f13443d.setTranslationX(f6);
    }

    @Override // g3.InterfaceC2476d
    /* renamed from: l */
    public final void mo6389l(float f6) {
        this.f13462w = f6;
        this.f13443d.setCameraDistance(-f6);
    }

    @Override // g3.InterfaceC2476d
    /* renamed from: m */
    public final void mo6390m(float f6) {
        this.f13459t = f6;
        this.f13443d.setRotationX(f6);
    }

    @Override // g3.InterfaceC2476d
    /* renamed from: n */
    public final float mo6391n() {
        return this.f13452m;
    }

    @Override // g3.InterfaceC2476d
    /* renamed from: o */
    public final void mo6392o(float f6) {
        this.f13456q = f6;
        this.f13443d.setElevation(f6);
    }

    @Override // g3.InterfaceC2476d
    /* renamed from: p */
    public final void mo6393p(Outline outline, long j6) {
        this.f13447h = j6;
        this.f13443d.setOutline(outline);
        this.f13446g = outline != null;
        m6405b();
    }

    @Override // g3.InterfaceC2476d
    /* renamed from: q */
    public final int mo6394q() {
        return this.f13448i;
    }

    @Override // g3.InterfaceC2476d
    /* renamed from: r */
    public final void mo6395r(int i10, int i11, long j6) {
        int i12 = (int) (j6 >> 32);
        int i13 = (int) (4294967295L & j6);
        this.f13443d.setLeftTopRightBottom(i10, i11, i10 + i12, i11 + i13);
        if (C6756l.m12948a(this.f13444e, j6)) {
            return;
        }
        if (this.f13451l) {
            this.f13443d.setPivotX(i12 / 2.0f);
            this.f13443d.setPivotY(i13 / 2.0f);
        }
        this.f13444e = j6;
    }

    @Override // g3.InterfaceC2476d
    /* renamed from: s */
    public final float mo6396s() {
        return this.f13460u;
    }

    @Override // g3.InterfaceC2476d
    /* renamed from: t */
    public final float mo6397t() {
        return this.f13461v;
    }

    @Override // g3.InterfaceC2476d
    /* renamed from: u */
    public final void mo6398u(long j6) {
        if ((9223372034707292159L & j6) == 9205357640488583168L) {
            this.f13451l = true;
            this.f13443d.setPivotX(((int) (this.f13444e >> 32)) / 2.0f);
            this.f13443d.setPivotY(((int) (4294967295L & this.f13444e)) / 2.0f);
        } else {
            this.f13451l = false;
            this.f13443d.setPivotX(Float.intBitsToFloat((int) (j6 >> 32)));
            this.f13443d.setPivotY(Float.intBitsToFloat((int) (j6 & 4294967295L)));
        }
    }

    @Override // g3.InterfaceC2476d
    /* renamed from: v */
    public final long mo6399v() {
        return this.f13457r;
    }

    @Override // g3.InterfaceC2476d
    /* renamed from: w */
    public final void mo6400w(InterfaceC6747c interfaceC6747c, EnumC6757m enumC6757m, C2474b c2474b, C0045d c0045d) {
        Canvas canvasStart = this.f13443d.start(Math.max((int) (this.f13444e >> 32), (int) (this.f13447h >> 32)), Math.max((int) (this.f13444e & 4294967295L), (int) (this.f13447h & 4294967295L)));
        try {
            C1549c c1549c = this.f13441b.f7808a;
            Canvas canvas = c1549c.f7733a;
            c1549c.f7733a = canvasStart;
            C2196b c2196b = this.f13442c;
            C0005d c0005d = c2196b.f10124b;
            long jM11098d = ze.m11098d(this.f13444e);
            C2195a c2195a = ((C2196b) c0005d.f26d).f10123a;
            InterfaceC6747c interfaceC6747c2 = c2195a.f10119a;
            EnumC6757m enumC6757m2 = c2195a.f10120b;
            InterfaceC1563q interfaceC1563qM75t = c0005d.m75t();
            long jM81z = c0005d.m81z();
            C2474b c2474b2 = (C2474b) c0005d.f25c;
            c0005d.c0(interfaceC6747c);
            c0005d.d0(enumC6757m);
            c0005d.b0(c1549c);
            c0005d.e0(jM11098d);
            c0005d.f25c = c2474b;
            c1549c.mo5107i();
            try {
                c0045d.invoke(c2196b);
                c1549c.mo5113o();
                c0005d.c0(interfaceC6747c2);
                c0005d.d0(enumC6757m2);
                c0005d.b0(interfaceC1563qM75t);
                c0005d.e0(jM81z);
                c0005d.f25c = c2474b2;
                c1549c.f7733a = canvas;
                this.f13443d.end(canvasStart);
            } catch (Throwable th2) {
                c1549c.mo5113o();
                C0005d c0005d2 = c2196b.f10124b;
                c0005d2.c0(interfaceC6747c2);
                c0005d2.d0(enumC6757m2);
                c0005d2.b0(interfaceC1563qM75t);
                c0005d2.e0(jM81z);
                c0005d2.f25c = c2474b2;
                throw th2;
            }
        } catch (Throwable th3) {
            this.f13443d.end(canvasStart);
            throw th3;
        }
    }

    @Override // g3.InterfaceC2476d
    /* renamed from: x */
    public final float mo6401x() {
        return this.f13455p;
    }

    @Override // g3.InterfaceC2476d
    /* renamed from: y */
    public final long mo6402y() {
        return this.f13458s;
    }

    @Override // g3.InterfaceC2476d
    /* renamed from: z */
    public final void mo6403z(long j6) {
        if (Build.VERSION.SDK_INT >= 28) {
            this.f13457r = j6;
            AbstractC2483k.m6411c(this.f13443d, h0.m5149u(j6));
        }
    }
}
