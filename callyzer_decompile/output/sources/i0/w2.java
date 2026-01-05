package i0;

import android.util.Range;
import java.util.Objects;
import m0.InterfaceC4617k;
import p020v.C7616z;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public interface w2 extends InterfaceC4617k, a1 {
    public static final C3076g A0;
    public static final C3076g B0;
    public static final C3076g C0;
    public static final C3076g D0;
    public static final C3076g E0;
    public static final C3076g F0;
    public static final C3076g G0;

    /* renamed from: r0, reason: collision with root package name */
    public static final C3076g f44343r0 = new C3076g("camerax.core.useCase.defaultSessionConfig", g2.class, null);

    /* renamed from: s0, reason: collision with root package name */
    public static final C3076g f44344s0 = new C3076g("camerax.core.useCase.defaultCaptureConfig", q0.class, null);

    /* renamed from: u0, reason: collision with root package name */
    public static final C3076g f44345u0 = new C3076g("camerax.core.useCase.sessionConfigUnpacker", p020v.d0.class, null);

    /* renamed from: v0, reason: collision with root package name */
    public static final C3076g f44346v0 = new C3076g("camerax.core.useCase.captureConfigUnpacker", C7616z.class, null);

    /* renamed from: w0, reason: collision with root package name */
    public static final C3076g f44347w0;

    /* renamed from: x0, reason: collision with root package name */
    public static final C3076g f44348x0;

    /* renamed from: y0, reason: collision with root package name */
    public static final C3076g f44349y0;

    /* renamed from: z0, reason: collision with root package name */
    public static final C3076g f44350z0;

    static {
        Class cls = Integer.TYPE;
        f44347w0 = new C3076g("camerax.core.useCase.surfaceOccupancyPriority", cls, null);
        f44348x0 = new C3076g("camerax.core.useCase.sessionType", cls, null);
        f44349y0 = new C3076g("camerax.core.useCase.targetFrameRate", Range.class, null);
        f44350z0 = new C3076g("camerax.core.useCase.isStrictFrameRateRequired", Boolean.class, null);
        Class cls2 = Boolean.TYPE;
        A0 = new C3076g("camerax.core.useCase.zslDisabled", cls2, null);
        B0 = new C3076g("camerax.core.useCase.highResolutionDisabled", cls2, null);
        C0 = new C3076g("camerax.core.useCase.captureType", y2.class, null);
        D0 = new C3076g("camerax.core.useCase.previewStabilizationMode", cls, null);
        E0 = new C3076g("camerax.core.useCase.videoStabilizationMode", cls, null);
        F0 = new C3076g("camerax.core.useCase.takePictureManagerProvider", u2.class, null);
        G0 = new C3076g("camerax.core.useCase.streamUseCase", j2.class, null);
    }

    /* renamed from: E */
    default y2 mo7421E() {
        return (y2) mo7406k(C0);
    }

    /* renamed from: P */
    default int m7422P() {
        return ((Integer) mo7401e(D0, 0)).intValue();
    }

    /* renamed from: z */
    default j2 m7423z() {
        j2 j2Var = (j2) mo7401e(G0, j2.DEFAULT);
        Objects.requireNonNull(j2Var);
        return j2Var;
    }
}
