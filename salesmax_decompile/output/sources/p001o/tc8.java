package p001o;

import java.util.concurrent.Executor;
import p001o.mq3;
import p001o.sc8;

/* loaded from: classes2.dex */
public final class tc8 implements c9i, qd8, sv8 {

    /* renamed from: I */
    public static final mq3.AbstractC15402a f46809I;

    /* renamed from: J */
    public static final mq3.AbstractC15402a f46810J;

    /* renamed from: K */
    public static final mq3.AbstractC15402a f46811K;

    /* renamed from: L */
    public static final mq3.AbstractC15402a f46812L;

    /* renamed from: M */
    public static final mq3.AbstractC15402a f46813M;

    /* renamed from: N */
    public static final mq3.AbstractC15402a f46814N;

    /* renamed from: O */
    public static final mq3.AbstractC15402a f46815O;

    /* renamed from: P */
    public static final mq3.AbstractC15402a f46816P;

    /* renamed from: Q */
    public static final mq3.AbstractC15402a f46817Q;

    /* renamed from: R */
    public static final mq3.AbstractC15402a f46818R;

    /* renamed from: S */
    public static final mq3.AbstractC15402a f46819S;

    /* renamed from: T */
    public static final mq3.AbstractC15402a f46820T;

    /* renamed from: U */
    public static final mq3.AbstractC15402a f46821U;

    /* renamed from: H */
    public final tec f46822H;

    static {
        Class cls = Integer.TYPE;
        f46809I = mq3.AbstractC15402a.m39507a("camerax.core.imageCapture.captureMode", cls);
        f46810J = mq3.AbstractC15402a.m39507a("camerax.core.imageCapture.flashMode", cls);
        f46811K = mq3.AbstractC15402a.m39507a("camerax.core.imageCapture.captureBundle", xc2.class);
        f46812L = mq3.AbstractC15402a.m39507a("camerax.core.imageCapture.bufferFormat", Integer.class);
        f46813M = mq3.AbstractC15402a.m39507a("camerax.core.imageCapture.outputFormat", Integer.class);
        f46814N = mq3.AbstractC15402a.m39507a("camerax.core.imageCapture.maxCaptureStages", Integer.class);
        f46815O = mq3.AbstractC15402a.m39507a("camerax.core.imageCapture.imageReaderProxyProvider", ae8.class);
        f46816P = mq3.AbstractC15402a.m39507a("camerax.core.imageCapture.useSoftwareJpegEncoder", Boolean.TYPE);
        f46817Q = mq3.AbstractC15402a.m39507a("camerax.core.imageCapture.flashType", cls);
        f46818R = mq3.AbstractC15402a.m39507a("camerax.core.imageCapture.jpegCompressionQuality", cls);
        f46819S = mq3.AbstractC15402a.m39507a("camerax.core.imageCapture.screenFlash", sc8.InterfaceC16805i.class);
        f46820T = mq3.AbstractC15402a.m39507a("camerax.core.useCase.postviewResolutionSelector", mne.class);
        f46821U = mq3.AbstractC15402a.m39507a("camerax.core.useCase.isPostviewEnabled", Boolean.class);
    }

    public tc8(tec tecVar) {
        this.f46822H = tecVar;
    }

    /* renamed from: W */
    public xc2 m49702W(xc2 xc2Var) {
        return (xc2) mo36958d(f46811K, xc2Var);
    }

    /* renamed from: X */
    public int m49703X() {
        return ((Integer) mo36960f(f46809I)).intValue();
    }

    /* renamed from: Y */
    public int m49704Y(int i) {
        return ((Integer) mo36958d(f46810J, Integer.valueOf(i))).intValue();
    }

    /* renamed from: Z */
    public int m49705Z(int i) {
        return ((Integer) mo36958d(f46817Q, Integer.valueOf(i))).intValue();
    }

    public ae8 a0() {
        tq.m50332a(mo36958d(f46815O, null));
        return null;
    }

    public Executor b0(Executor executor) {
        return (Executor) mo36958d(sv8.f46000t, executor);
    }

    public int c0() {
        return ((Integer) mo36960f(f46818R)).intValue();
    }

    public sc8.InterfaceC16805i d0() {
        return (sc8.InterfaceC16805i) mo36958d(f46819S, null);
    }

    public boolean e0() {
        return mo36957c(f46809I);
    }

    @Override // p001o.lce
    public mq3 getConfig() {
        return this.f46822H;
    }

    @Override // p001o.kd8
    /* renamed from: n */
    public int mo19021n() {
        return ((Integer) mo36960f(kd8.f31942h)).intValue();
    }
}
