package androidx.camera.camera2.internal.compat;

import android.hardware.camera2.CameraAccessException;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public class CameraAccessExceptionCompat extends Exception {

    /* renamed from: b */
    public static final Set f1818b = Collections.unmodifiableSet(new HashSet(Arrays.asList(4, 5, 1, 2, 3)));

    /* renamed from: a */
    public final int f1819a;

    static {
        Collections.unmodifiableSet(new HashSet(Arrays.asList(10001, 10002)));
    }

    public CameraAccessExceptionCompat(CameraAccessException cameraAccessException) {
        super(cameraAccessException.getMessage(), cameraAccessException.getCause());
        this.f1819a = cameraAccessException.getReason();
    }

    public CameraAccessExceptionCompat(RuntimeException runtimeException) {
        super("Some API 28 devices cannot access the camera when the device is in \"Do Not Disturb\" mode. The camera will not be accessible until \"Do Not Disturb\" mode is disabled.", runtimeException);
        this.f1819a = 10001;
        if (f1818b.contains(10001)) {
            new CameraAccessException(10001, null, runtimeException);
        }
    }

    public CameraAccessExceptionCompat(String str, AssertionError assertionError) {
        super(String.format("%s (%d): %s", "CAMERA_CHARACTERISTICS_CREATION_ERROR", 10002, str), assertionError);
        this.f1819a = 10002;
        if (f1818b.contains(10002)) {
            new CameraAccessException(10002, str, assertionError);
        }
    }
}
