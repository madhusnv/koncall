package i0;

import androidx.camera.extensions.internal.sessionprocessor.AbstractC0230a;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: i0.y */
/* loaded from: classes.dex */
public interface InterfaceC3094y extends w1 {

    /* renamed from: U */
    public static final C3076g f16613U = new C3076g("camerax.core.camera.useCaseConfigFactory", z2.class, null);

    /* renamed from: W */
    public static final C3076g f16614W = new C3076g("camerax.core.camera.useCaseCombinationRequiredRule", Integer.class, null);

    /* renamed from: a0, reason: collision with root package name */
    public static final C3076g f44351a0 = new C3076g("camerax.core.camera.SessionProcessor", AbstractC0230a.class, null);

    /* renamed from: b0, reason: collision with root package name */
    public static final C3076g f44352b0 = new C3076g("camerax.core.camera.isPostviewSupported", Boolean.class, null);

    /* renamed from: c0, reason: collision with root package name */
    public static final C3076g f44353c0 = new C3076g("camerax.core.camera.isCaptureProcessProgressSupported", Boolean.class, null);

    /* renamed from: F */
    default void m7432F() {
        if (mo7401e(f44351a0, null) != null) {
            throw new ClassCastException();
        }
    }
}
