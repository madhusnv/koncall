package p001o;

import android.util.Range;
import p001o.bhf;
import p001o.cd2;
import p001o.d9i;
import p001o.mq3;

/* loaded from: classes2.dex */
public interface c9i extends sjg, kd8 {

    /* renamed from: A */
    public static final mq3.AbstractC15402a f17557A;

    /* renamed from: B */
    public static final mq3.AbstractC15402a f17558B;

    /* renamed from: C */
    public static final mq3.AbstractC15402a f17559C;

    /* renamed from: D */
    public static final mq3.AbstractC15402a f17560D;

    /* renamed from: E */
    public static final mq3.AbstractC15402a f17561E;

    /* renamed from: F */
    public static final mq3.AbstractC15402a f17562F;

    /* renamed from: G */
    public static final mq3.AbstractC15402a f17563G;

    /* renamed from: w */
    public static final mq3.AbstractC15402a f17564w = mq3.AbstractC15402a.m39507a("camerax.core.useCase.defaultSessionConfig", bhf.class);

    /* renamed from: x */
    public static final mq3.AbstractC15402a f17565x = mq3.AbstractC15402a.m39507a("camerax.core.useCase.defaultCaptureConfig", cd2.class);

    /* renamed from: y */
    public static final mq3.AbstractC15402a f17566y = mq3.AbstractC15402a.m39507a("camerax.core.useCase.sessionConfigUnpacker", bhf.InterfaceC12405e.class);

    /* renamed from: z */
    public static final mq3.AbstractC15402a f17567z = mq3.AbstractC15402a.m39507a("camerax.core.useCase.captureConfigUnpacker", cd2.InterfaceC12639b.class);

    /* renamed from: o.c9i$a */
    public interface InterfaceC12595a extends hp6 {
        /* renamed from: b */
        c9i mo17074b();
    }

    static {
        Class cls = Integer.TYPE;
        f17557A = mq3.AbstractC15402a.m39507a("camerax.core.useCase.surfaceOccupancyPriority", cls);
        f17558B = mq3.AbstractC15402a.m39507a("camerax.core.useCase.targetFrameRate", Range.class);
        Class cls2 = Boolean.TYPE;
        f17559C = mq3.AbstractC15402a.m39507a("camerax.core.useCase.zslDisabled", cls2);
        f17560D = mq3.AbstractC15402a.m39507a("camerax.core.useCase.highResolutionDisabled", cls2);
        f17561E = mq3.AbstractC15402a.m39507a("camerax.core.useCase.captureType", d9i.EnumC12848b.class);
        f17562F = mq3.AbstractC15402a.m39507a("camerax.core.useCase.previewStabilizationMode", cls);
        f17563G = mq3.AbstractC15402a.m39507a("camerax.core.useCase.videoStabilizationMode", cls);
    }

    /* renamed from: A */
    default cd2.InterfaceC12639b m20529A(cd2.InterfaceC12639b interfaceC12639b) {
        return (cd2.InterfaceC12639b) mo36958d(f17567z, interfaceC12639b);
    }

    /* renamed from: B */
    default int m20530B() {
        return ((Integer) mo36958d(f17562F, 0)).intValue();
    }

    /* renamed from: I */
    default bhf m20531I() {
        return (bhf) mo36960f(f17564w);
    }

    /* renamed from: J */
    default boolean m20532J(boolean z) {
        return ((Boolean) mo36958d(f17559C, Boolean.valueOf(z))).booleanValue();
    }

    /* renamed from: M */
    default d9i.EnumC12848b mo20533M() {
        return (d9i.EnumC12848b) mo36960f(f17561E);
    }

    /* renamed from: T */
    default boolean m20534T(boolean z) {
        return ((Boolean) mo36958d(f17560D, Boolean.valueOf(z))).booleanValue();
    }

    /* renamed from: l */
    default cd2 m20535l(cd2 cd2Var) {
        return (cd2) mo36958d(f17565x, cd2Var);
    }

    /* renamed from: r */
    default bhf.InterfaceC12405e m20536r(bhf.InterfaceC12405e interfaceC12405e) {
        return (bhf.InterfaceC12405e) mo36958d(f17566y, interfaceC12405e);
    }

    /* renamed from: s */
    default bhf m20537s(bhf bhfVar) {
        return (bhf) mo36958d(f17564w, bhfVar);
    }

    /* renamed from: t */
    default int m20538t() {
        return ((Integer) mo36958d(f17563G, 0)).intValue();
    }

    /* renamed from: v */
    default Range m20539v(Range range) {
        return (Range) mo36958d(f17558B, range);
    }

    /* renamed from: x */
    default int m20540x(int i) {
        return ((Integer) mo36958d(f17557A, Integer.valueOf(i))).intValue();
    }
}
