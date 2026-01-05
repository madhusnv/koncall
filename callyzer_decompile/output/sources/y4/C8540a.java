package y4;

import c5.C0867e;
import c5.C0869g;
import c9.C0910e;
import c9.C0917l;
import c9.C0927v;
import kotlin.jvm.internal.C4156n;
import kotlin.jvm.internal.a0;
import lx.InterfaceC4574m;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: y4.a */
/* loaded from: classes.dex */
public final class C8540a {

    /* renamed from: i */
    public static final /* synthetic */ InterfaceC4574m[] f41483i;

    /* renamed from: a */
    public final C0869g f41484a;

    /* renamed from: c */
    public final C0927v f41486c;

    /* renamed from: d */
    public final C0917l f41487d;

    /* renamed from: e */
    public final C0927v f41488e;

    /* renamed from: f */
    public final C0917l f41489f;

    /* renamed from: b */
    public final C8541b f41485b = new C8541b("parent");

    /* renamed from: g */
    public final C0910e f41490g = new C0910e(23, this, new C8546g("wrap"), false);

    /* renamed from: h */
    public final C0910e f41491h = new C0910e(23, this, new C8546g("wrap"), false);

    static {
        C4156n c4156n = new C4156n(C8540a.class, "width", "getWidth()Landroidx/constraintlayout/compose/Dimension;", 0);
        a0.f21154a.getClass();
        f41483i = new InterfaceC4574m[]{c4156n, new C4156n(C8540a.class, "height", "getHeight()Landroidx/constraintlayout/compose/Dimension;", 0), new C4156n(C8540a.class, "visibility", "getVisibility()Landroidx/constraintlayout/compose/Visibility;", 0), new C4156n(C8540a.class, "scaleX", "getScaleX()F", 0), new C4156n(C8540a.class, "scaleY", "getScaleY()F", 0), new C4156n(C8540a.class, "rotationX", "getRotationX()F", 0), new C4156n(C8540a.class, "rotationY", "getRotationY()F", 0), new C4156n(C8540a.class, "rotationZ", "getRotationZ()F", 0), new C4156n(C8540a.class, "translationX", "getTranslationX-D9Ej5fM()F", 0), new C4156n(C8540a.class, "translationY", "getTranslationY-D9Ej5fM()F", 0), new C4156n(C8540a.class, "translationZ", "getTranslationZ-D9Ej5fM()F", 0), new C4156n(C8540a.class, "pivotX", "getPivotX()F", 0), new C4156n(C8540a.class, "pivotY", "getPivotY()F", 0), new C4156n(C8540a.class, "horizontalChainWeight", "getHorizontalChainWeight()F", 0), new C4156n(C8540a.class, "verticalChainWeight", "getVerticalChainWeight()F", 0)};
    }

    public C8540a(String str, C0869g c0869g) {
        this.f41484a = c0869g;
        this.f41486c = new C0927v(-2, c0869g);
        this.f41487d = new C0917l(0, c0869g);
        this.f41488e = new C0927v(-1, c0869g);
        this.f41489f = new C0917l(1, c0869g);
    }

    /* renamed from: a */
    public static void m15807a(C8540a c8540a, C8543d c8543d, C8543d c8543d2) {
        c8540a.f41486c.m2705m(c8543d, 0, 0);
        c8540a.f41488e.m2705m(c8543d2, 0, 0);
        c8540a.f41484a.m2315E("hRtlBias", new C0867e(0.5f));
    }

    /* renamed from: b */
    public final void m15808b(C8546g c8546g) {
        this.f41490g.m2590I(this, f41483i[0], c8546g);
    }
}
