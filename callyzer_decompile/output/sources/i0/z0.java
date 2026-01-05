package i0;

import m0.InterfaceC4613g;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class z0 implements w2, b1, InterfaceC4613g {

    /* renamed from: b */
    public static final C3076g f16622b;

    /* renamed from: c */
    public static final C3076g f16623c;

    /* renamed from: d */
    public static final C3076g f16624d;

    /* renamed from: e */
    public static final C3076g f16625e;

    /* renamed from: f */
    public static final C3076g f16626f;

    /* renamed from: g */
    public static final C3076g f16627g;

    /* renamed from: h */
    public static final C3076g f16628h;

    /* renamed from: j */
    public static final C3076g f16629j;

    /* renamed from: k */
    public static final C3076g f16630k;

    /* renamed from: a */
    public final o1 f16631a;

    static {
        Class cls = Integer.TYPE;
        f16622b = new C3076g("camerax.core.imageCapture.captureMode", cls, null);
        f16623c = new C3076g("camerax.core.imageCapture.flashMode", cls, null);
        f16624d = new C3076g("camerax.core.imageCapture.bufferFormat", Integer.class, null);
        f16625e = new C3076g("camerax.core.imageCapture.outputFormat", Integer.class, null);
        f16626f = new C3076g("camerax.core.imageCapture.imageReaderProxyProvider", c0.c1.class, null);
        f16627g = new C3076g("camerax.core.imageCapture.useSoftwareJpegEncoder", Boolean.TYPE, null);
        f16628h = new C3076g("camerax.core.imageCapture.flashType", cls, null);
        f16629j = new C3076g("camerax.core.imageCapture.screenFlash", c0.t0.class, null);
        f16630k = new C3076g("camerax.core.useCase.isPostviewEnabled", Boolean.class, null);
    }

    public z0(o1 o1Var) {
        this.f16631a = o1Var;
    }

    @Override // i0.w1
    /* renamed from: d */
    public final s0 mo2241d() {
        return this.f16631a;
    }

    @Override // i0.a1
    /* renamed from: q */
    public final int mo7291q() {
        return ((Integer) mo7406k(a1.f44329d0)).intValue();
    }
}
