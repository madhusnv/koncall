package i0;

import android.util.Size;
import c0.AbstractC0810c;
import java.util.List;
import t0.C6974b;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public interface b1 extends w1 {

    /* renamed from: g0, reason: collision with root package name */
    public static final C3076g f44332g0 = new C3076g("camerax.core.imageOutput.targetAspectRatio", AbstractC0810c.class, null);

    /* renamed from: i0, reason: collision with root package name */
    public static final C3076g f44333i0;

    /* renamed from: j0, reason: collision with root package name */
    public static final C3076g f44334j0;

    /* renamed from: k0, reason: collision with root package name */
    public static final C3076g f44335k0;

    /* renamed from: l0, reason: collision with root package name */
    public static final C3076g f44336l0;

    /* renamed from: m0, reason: collision with root package name */
    public static final C3076g f44337m0;

    /* renamed from: n0, reason: collision with root package name */
    public static final C3076g f44338n0;

    /* renamed from: o0, reason: collision with root package name */
    public static final C3076g f44339o0;

    /* renamed from: p0, reason: collision with root package name */
    public static final C3076g f44340p0;

    /* renamed from: q0, reason: collision with root package name */
    public static final C3076g f44341q0;

    static {
        Class cls = Integer.TYPE;
        f44333i0 = new C3076g("camerax.core.imageOutput.targetRotation", cls, null);
        f44334j0 = new C3076g("camerax.core.imageOutput.appTargetRotation", cls, null);
        f44335k0 = new C3076g("camerax.core.imageOutput.mirrorMode", cls, null);
        f44336l0 = new C3076g("camerax.core.imageOutput.targetResolution", Size.class, null);
        f44337m0 = new C3076g("camerax.core.imageOutput.defaultResolution", Size.class, null);
        f44338n0 = new C3076g("camerax.core.imageOutput.maxResolution", Size.class, null);
        f44339o0 = new C3076g("camerax.core.imageOutput.supportedResolutions", List.class, null);
        f44340p0 = new C3076g("camerax.core.imageOutput.resolutionSelector", C6974b.class, null);
        f44341q0 = new C3076g("camerax.core.imageOutput.customOrderedResolutions", List.class, null);
    }

    /* renamed from: K */
    static void m7299K(b1 b1Var) {
        boolean zMo7404i = b1Var.mo7404i(f44332g0);
        boolean z6 = ((Size) b1Var.mo7401e(f44336l0, null)) != null;
        if (zMo7404i && z6) {
            throw new IllegalArgumentException("Cannot use both setTargetResolution and setTargetAspectRatio on the same config.");
        }
        if (((C6974b) b1Var.mo7401e(f44340p0, null)) != null) {
            if (zMo7404i || z6) {
                throw new IllegalArgumentException("Cannot use setTargetResolution or setTargetAspectRatio with setResolutionSelector on the same config.");
            }
        }
    }

    /* renamed from: C */
    default int m7300C() {
        return ((Integer) mo7401e(f44333i0, 0)).intValue();
    }
}
