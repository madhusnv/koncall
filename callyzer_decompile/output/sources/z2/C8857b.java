package z2;

import android.graphics.Canvas;
import android.graphics.Point;
import android.view.View;
import d3.AbstractC1550d;
import d3.C1549c;
import d3.InterfaceC1563q;
import ex.InterfaceC2139c;
import f3.C2195a;
import f3.C2196b;
import s4.C6748d;
import s4.EnumC6757m;
import s4.InterfaceC6747c;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: z2.b */
/* loaded from: classes.dex */
public final class C8857b extends View.DragShadowBuilder {

    /* renamed from: a */
    public final C6748d f42635a;

    /* renamed from: b */
    public final long f42636b;

    /* renamed from: c */
    public final InterfaceC2139c f42637c;

    public C8857b(C6748d c6748d, long j6, InterfaceC2139c interfaceC2139c) {
        this.f42635a = c6748d;
        this.f42636b = j6;
        this.f42637c = interfaceC2139c;
    }

    @Override // android.view.View.DragShadowBuilder
    public final void onDrawShadow(Canvas canvas) {
        C2196b c2196b = new C2196b();
        EnumC6757m enumC6757m = EnumC6757m.Ltr;
        Canvas canvas2 = AbstractC1550d.f7737a;
        C1549c c1549c = new C1549c();
        c1549c.f7733a = canvas;
        C2195a c2195a = c2196b.f10123a;
        InterfaceC6747c interfaceC6747c = c2195a.f10119a;
        EnumC6757m enumC6757m2 = c2195a.f10120b;
        InterfaceC1563q interfaceC1563q = c2195a.f10121c;
        long j6 = c2195a.f10122d;
        c2195a.f10119a = this.f42635a;
        c2195a.f10120b = enumC6757m;
        c2195a.f10121c = c1549c;
        c2195a.f10122d = this.f42636b;
        c1549c.mo5107i();
        this.f42637c.invoke(c2196b);
        c1549c.mo5113o();
        c2195a.f10119a = interfaceC6747c;
        c2195a.f10120b = enumC6757m2;
        c2195a.f10121c = interfaceC1563q;
        c2195a.f10122d = j6;
    }

    @Override // android.view.View.DragShadowBuilder
    public final void onProvideShadowMetrics(Point point, Point point2) {
        long j6 = this.f42636b;
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j6 >> 32));
        C6748d c6748d = this.f42635a;
        point.set(c6748d.e0(fIntBitsToFloat / c6748d.mo155a()), c6748d.e0(Float.intBitsToFloat((int) (j6 & 4294967295L)) / c6748d.mo155a()));
        point2.set(point.x / 2, point.y / 2);
    }
}
