package g3;

import a1.C0005d;
import a3.C0045d;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Outline;
import android.graphics.RecordingCanvas;
import android.graphics.RenderNode;
import d3.AbstractC1550d;
import d3.C1549c;
import d3.C1564r;
import d3.C1565s;
import d3.InterfaceC1563q;
import d3.h0;
import f3.C2196b;
import og.ze;
import s4.EnumC6757m;
import s4.InterfaceC6747c;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: g3.f */
/* loaded from: classes.dex */
public final class C2478f implements InterfaceC2476d {

    /* renamed from: b */
    public final C1564r f13466b;

    /* renamed from: c */
    public final C2196b f13467c;

    /* renamed from: d */
    public final RenderNode f13468d;

    /* renamed from: e */
    public long f13469e;

    /* renamed from: f */
    public Matrix f13470f;

    /* renamed from: g */
    public boolean f13471g;

    /* renamed from: h */
    public float f13472h;

    /* renamed from: i */
    public final int f13473i;

    /* renamed from: j */
    public float f13474j;

    /* renamed from: k */
    public float f13475k;

    /* renamed from: l */
    public float f13476l;

    /* renamed from: m */
    public float f13477m;

    /* renamed from: n */
    public float f13478n;

    /* renamed from: o */
    public long f13479o;

    /* renamed from: p */
    public long f13480p;

    /* renamed from: q */
    public float f13481q;

    /* renamed from: r */
    public float f13482r;

    /* renamed from: s */
    public float f13483s;

    /* renamed from: t */
    public float f13484t;

    /* renamed from: u */
    public boolean f13485u;

    /* renamed from: v */
    public boolean f13486v;

    /* renamed from: w */
    public boolean f13487w;

    /* renamed from: x */
    public int f13488x;

    public C2478f() {
        C1564r c1564r = new C1564r();
        C2196b c2196b = new C2196b();
        this.f13466b = c1564r;
        this.f13467c = c2196b;
        RenderNode renderNode = new RenderNode("graphicsLayer");
        this.f13468d = renderNode;
        this.f13469e = 0L;
        renderNode.setClipToBounds(false);
        m6406L(renderNode, 0);
        this.f13472h = 1.0f;
        this.f13473i = 3;
        this.f13474j = 1.0f;
        this.f13475k = 1.0f;
        long j6 = C1565s.f7809b;
        this.f13479o = j6;
        this.f13480p = j6;
        this.f13484t = 8.0f;
        this.f13488x = 0;
    }

    /* renamed from: L */
    public static void m6406L(RenderNode renderNode, int i10) {
        if (i10 == 1) {
            renderNode.setUseCompositingLayer(true, null);
            renderNode.setHasOverlappingRendering(true);
        } else if (i10 == 2) {
            renderNode.setUseCompositingLayer(false, null);
            renderNode.setHasOverlappingRendering(false);
        } else {
            renderNode.setUseCompositingLayer(false, null);
            renderNode.setHasOverlappingRendering(true);
        }
    }

    @Override // g3.InterfaceC2476d
    /* renamed from: A */
    public final void mo6368A(InterfaceC1563q interfaceC1563q) {
        AbstractC1550d.m5119a(interfaceC1563q).drawRenderNode(this.f13468d);
    }

    @Override // g3.InterfaceC2476d
    /* renamed from: B */
    public final float mo6369B() {
        return this.f13484t;
    }

    @Override // g3.InterfaceC2476d
    /* renamed from: C */
    public final float mo6370C() {
        return this.f13476l;
    }

    @Override // g3.InterfaceC2476d
    /* renamed from: D */
    public final void mo6371D(boolean z6) {
        this.f13485u = z6;
        m6407b();
    }

    @Override // g3.InterfaceC2476d
    /* renamed from: E */
    public final float mo6372E() {
        return this.f13481q;
    }

    @Override // g3.InterfaceC2476d
    /* renamed from: F */
    public final void mo6373F(int i10) {
        this.f13488x = i10;
        if (i10 != 1 && this.f13473i == 3) {
            m6406L(this.f13468d, i10);
        } else {
            m6406L(this.f13468d, 1);
        }
    }

    @Override // g3.InterfaceC2476d
    /* renamed from: G */
    public final void mo6374G(long j6) {
        this.f13480p = j6;
        this.f13468d.setSpotShadowColor(h0.m5149u(j6));
    }

    @Override // g3.InterfaceC2476d
    /* renamed from: H */
    public final Matrix mo6375H() {
        Matrix matrix = this.f13470f;
        if (matrix == null) {
            matrix = new Matrix();
            this.f13470f = matrix;
        }
        this.f13468d.getMatrix(matrix);
        return matrix;
    }

    @Override // g3.InterfaceC2476d
    /* renamed from: I */
    public final float mo6376I() {
        return this.f13478n;
    }

    @Override // g3.InterfaceC2476d
    /* renamed from: J */
    public final float mo6377J() {
        return this.f13475k;
    }

    @Override // g3.InterfaceC2476d
    /* renamed from: K */
    public final int mo6378K() {
        return this.f13473i;
    }

    @Override // g3.InterfaceC2476d
    /* renamed from: a */
    public final float mo6379a() {
        return this.f13472h;
    }

    /* renamed from: b */
    public final void m6407b() {
        boolean z6 = this.f13485u;
        boolean z10 = false;
        boolean z11 = z6 && !this.f13471g;
        if (z6 && this.f13471g) {
            z10 = true;
        }
        if (z11 != this.f13486v) {
            this.f13486v = z11;
            this.f13468d.setClipToBounds(z11);
        }
        if (z10 != this.f13487w) {
            this.f13487w = z10;
            this.f13468d.setClipToOutline(z10);
        }
    }

    @Override // g3.InterfaceC2476d
    /* renamed from: c */
    public final void mo6380c(float f6) {
        this.f13482r = f6;
        this.f13468d.setRotationY(f6);
    }

    @Override // g3.InterfaceC2476d
    /* renamed from: d */
    public final void mo6381d(float f6) {
        this.f13483s = f6;
        this.f13468d.setRotationZ(f6);
    }

    @Override // g3.InterfaceC2476d
    /* renamed from: e */
    public final void mo6382e(float f6) {
        this.f13477m = f6;
        this.f13468d.setTranslationY(f6);
    }

    @Override // g3.InterfaceC2476d
    /* renamed from: f */
    public final void mo6383f() {
        this.f13468d.discardDisplayList();
    }

    @Override // g3.InterfaceC2476d
    /* renamed from: g */
    public final void mo6384g(float f6) {
        this.f13475k = f6;
        this.f13468d.setScaleY(f6);
    }

    @Override // g3.InterfaceC2476d
    /* renamed from: h */
    public final boolean mo6385h() {
        return this.f13468d.hasDisplayList();
    }

    @Override // g3.InterfaceC2476d
    /* renamed from: i */
    public final void mo6386i(float f6) {
        this.f13472h = f6;
        this.f13468d.setAlpha(f6);
    }

    @Override // g3.InterfaceC2476d
    /* renamed from: j */
    public final void mo6387j(float f6) {
        this.f13474j = f6;
        this.f13468d.setScaleX(f6);
    }

    @Override // g3.InterfaceC2476d
    /* renamed from: k */
    public final void mo6388k(float f6) {
        this.f13476l = f6;
        this.f13468d.setTranslationX(f6);
    }

    @Override // g3.InterfaceC2476d
    /* renamed from: l */
    public final void mo6389l(float f6) {
        this.f13484t = f6;
        this.f13468d.setCameraDistance(f6);
    }

    @Override // g3.InterfaceC2476d
    /* renamed from: m */
    public final void mo6390m(float f6) {
        this.f13481q = f6;
        this.f13468d.setRotationX(f6);
    }

    @Override // g3.InterfaceC2476d
    /* renamed from: n */
    public final float mo6391n() {
        return this.f13474j;
    }

    @Override // g3.InterfaceC2476d
    /* renamed from: o */
    public final void mo6392o(float f6) {
        this.f13478n = f6;
        this.f13468d.setElevation(f6);
    }

    @Override // g3.InterfaceC2476d
    /* renamed from: p */
    public final void mo6393p(Outline outline, long j6) {
        this.f13468d.setOutline(outline);
        this.f13471g = outline != null;
        m6407b();
    }

    @Override // g3.InterfaceC2476d
    /* renamed from: q */
    public final int mo6394q() {
        return this.f13488x;
    }

    @Override // g3.InterfaceC2476d
    /* renamed from: r */
    public final void mo6395r(int i10, int i11, long j6) {
        this.f13468d.setPosition(i10, i11, ((int) (j6 >> 32)) + i10, ((int) (4294967295L & j6)) + i11);
        this.f13469e = ze.m11098d(j6);
    }

    @Override // g3.InterfaceC2476d
    /* renamed from: s */
    public final float mo6396s() {
        return this.f13482r;
    }

    @Override // g3.InterfaceC2476d
    /* renamed from: t */
    public final float mo6397t() {
        return this.f13483s;
    }

    @Override // g3.InterfaceC2476d
    /* renamed from: u */
    public final void mo6398u(long j6) {
        if ((9223372034707292159L & j6) == 9205357640488583168L) {
            this.f13468d.resetPivot();
        } else {
            this.f13468d.setPivotX(Float.intBitsToFloat((int) (j6 >> 32)));
            this.f13468d.setPivotY(Float.intBitsToFloat((int) (j6 & 4294967295L)));
        }
    }

    @Override // g3.InterfaceC2476d
    /* renamed from: v */
    public final long mo6399v() {
        return this.f13479o;
    }

    @Override // g3.InterfaceC2476d
    /* renamed from: w */
    public final void mo6400w(InterfaceC6747c interfaceC6747c, EnumC6757m enumC6757m, C2474b c2474b, C0045d c0045d) {
        C2196b c2196b = this.f13467c;
        RecordingCanvas recordingCanvasBeginRecording = this.f13468d.beginRecording();
        try {
            C1564r c1564r = this.f13466b;
            C1549c c1549c = c1564r.f7808a;
            Canvas canvas = c1549c.f7733a;
            c1549c.f7733a = recordingCanvasBeginRecording;
            C0005d c0005d = c2196b.f10124b;
            c0005d.c0(interfaceC6747c);
            c0005d.d0(enumC6757m);
            c0005d.f25c = c2474b;
            c0005d.e0(this.f13469e);
            c0005d.b0(c1549c);
            c0045d.invoke(c2196b);
            c1564r.f7808a.f7733a = canvas;
        } finally {
            this.f13468d.endRecording();
        }
    }

    @Override // g3.InterfaceC2476d
    /* renamed from: x */
    public final float mo6401x() {
        return this.f13477m;
    }

    @Override // g3.InterfaceC2476d
    /* renamed from: y */
    public final long mo6402y() {
        return this.f13480p;
    }

    @Override // g3.InterfaceC2476d
    /* renamed from: z */
    public final void mo6403z(long j6) {
        this.f13479o = j6;
        this.f13468d.setAmbientShadowColor(h0.m5149u(j6));
    }
}
