package g3;

import a1.C0005d;
import android.graphics.Canvas;
import android.graphics.Outline;
import android.view.View;
import d3.C1549c;
import d3.C1564r;
import d3.InterfaceC1563q;
import ex.InterfaceC2139c;
import f3.AbstractC2197c;
import f3.C2195a;
import f3.C2196b;
import g2.l7;
import h3.AbstractC2822a;
import s4.EnumC6757m;
import s4.InterfaceC6747c;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: g3.l */
/* loaded from: classes.dex */
public final class C2484l extends View {

    /* renamed from: l */
    public static final l7 f13516l = new l7(1);

    /* renamed from: a */
    public final AbstractC2822a f13517a;

    /* renamed from: b */
    public final C1564r f13518b;

    /* renamed from: c */
    public final C2196b f13519c;

    /* renamed from: d */
    public boolean f13520d;

    /* renamed from: e */
    public Outline f13521e;

    /* renamed from: f */
    public boolean f13522f;

    /* renamed from: g */
    public InterfaceC6747c f13523g;

    /* renamed from: h */
    public EnumC6757m f13524h;

    /* renamed from: j */
    public InterfaceC2139c f13525j;

    /* renamed from: k */
    public C2474b f13526k;

    public C2484l(AbstractC2822a abstractC2822a, C1564r c1564r, C2196b c2196b) {
        super(abstractC2822a.getContext());
        this.f13517a = abstractC2822a;
        this.f13518b = c1564r;
        this.f13519c = c2196b;
        setOutlineProvider(f13516l);
        this.f13522f = true;
        this.f13523g = AbstractC2197c.f10127a;
        this.f13524h = EnumC6757m.Ltr;
        InterfaceC2476d.f13439a.getClass();
        this.f13525j = C2473a.f13412c;
        setWillNotDraw(false);
        setClipBounds(null);
    }

    @Override // android.view.View
    public final void dispatchDraw(Canvas canvas) {
        C1564r c1564r = this.f13518b;
        C1549c c1549c = c1564r.f7808a;
        Canvas canvas2 = c1549c.f7733a;
        c1549c.f7733a = canvas;
        InterfaceC6747c interfaceC6747c = this.f13523g;
        EnumC6757m enumC6757m = this.f13524h;
        float width = getWidth();
        float height = getHeight();
        long jFloatToRawIntBits = (Float.floatToRawIntBits(height) & 4294967295L) | (Float.floatToRawIntBits(width) << 32);
        C2474b c2474b = this.f13526k;
        InterfaceC2139c interfaceC2139c = this.f13525j;
        C2196b c2196b = this.f13519c;
        C0005d c0005d = c2196b.f10124b;
        C2195a c2195a = ((C2196b) c0005d.f26d).f10123a;
        InterfaceC6747c interfaceC6747c2 = c2195a.f10119a;
        EnumC6757m enumC6757m2 = c2195a.f10120b;
        InterfaceC1563q interfaceC1563qM75t = c0005d.m75t();
        C0005d c0005d2 = c2196b.f10124b;
        long jM81z = c0005d2.m81z();
        C2474b c2474b2 = (C2474b) c0005d2.f25c;
        c0005d2.c0(interfaceC6747c);
        c0005d2.d0(enumC6757m);
        c0005d2.b0(c1549c);
        c0005d2.e0(jFloatToRawIntBits);
        c0005d2.f25c = c2474b;
        c1549c.mo5107i();
        try {
            interfaceC2139c.invoke(c2196b);
            c1549c.mo5113o();
            c0005d2.c0(interfaceC6747c2);
            c0005d2.d0(enumC6757m2);
            c0005d2.b0(interfaceC1563qM75t);
            c0005d2.e0(jM81z);
            c0005d2.f25c = c2474b2;
            c1564r.f7808a.f7733a = canvas2;
            this.f13520d = false;
        } catch (Throwable th2) {
            c1549c.mo5113o();
            c0005d2.c0(interfaceC6747c2);
            c0005d2.d0(enumC6757m2);
            c0005d2.b0(interfaceC1563qM75t);
            c0005d2.e0(jM81z);
            c0005d2.f25c = c2474b2;
            throw th2;
        }
    }

    public final boolean getCanUseCompositingLayer$ui_graphics_release() {
        return this.f13522f;
    }

    public final C1564r getCanvasHolder() {
        return this.f13518b;
    }

    public final View getOwnerView() {
        return this.f13517a;
    }

    @Override // android.view.View
    public final boolean hasOverlappingRendering() {
        return this.f13522f;
    }

    @Override // android.view.View
    public final void invalidate() {
        if (this.f13520d) {
            return;
        }
        this.f13520d = true;
        super.invalidate();
    }

    public final void setCanUseCompositingLayer$ui_graphics_release(boolean z6) {
        if (this.f13522f != z6) {
            this.f13522f = z6;
            invalidate();
        }
    }

    public final void setInvalidated(boolean z6) {
        this.f13520d = z6;
    }

    @Override // android.view.View
    public final void forceLayout() {
    }

    @Override // android.view.View
    public final void onLayout(boolean z6, int i10, int i11, int i12, int i13) {
    }
}
