package p001o;

import android.hardware.camera2.CameraAccessException;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* loaded from: classes2.dex */
public class h72 extends Exception {

    /* renamed from: c */
    public static final Set f26320c = Collections.unmodifiableSet(new HashSet(Arrays.asList(4, 5, 1, 2, 3)));

    /* renamed from: d */
    public static final Set f26321d = Collections.unmodifiableSet(new HashSet(Arrays.asList(10001, 10002)));

    /* renamed from: a */
    public final int f26322a;

    /* renamed from: b */
    public final CameraAccessException f26323b;

    public h72(int i, String str, Throwable th) {
        super(m29864a(i, str), th);
        this.f26322a = i;
        this.f26323b = f26320c.contains(Integer.valueOf(i)) ? new CameraAccessException(i, str, th) : null;
    }

    /* renamed from: a */
    public static String m29864a(int i, String str) {
        return String.format("%s (%d): %s", m29866c(i), Integer.valueOf(i), str);
    }

    /* renamed from: b */
    public static String m29865b(int i) {
        if (i == 1) {
            return "The camera is disabled due to a device policy, and cannot be opened.";
        }
        if (i == 2) {
            return "The camera device is removable and has been disconnected from the Android device, or the camera service has shut down the connection due to a higher-priority access request for the camera device.";
        }
        if (i == 3) {
            return "The camera device is currently in the error state; no further calls to it will succeed.";
        }
        if (i == 4) {
            return "The camera device is in use already";
        }
        if (i == 5) {
            return "The system-wide limit for number of open cameras has been reached, and more camera devices cannot be opened until previous instances are closed.";
        }
        if (i == 10001) {
            return "Some API 28 devices cannot access the camera when the device is in \"Do Not Disturb\" mode. The camera will not be accessible until \"Do Not Disturb\" mode is disabled.";
        }
        if (i != 10002) {
            return null;
        }
        return "Failed to create CameraCharacteristics.";
    }

    /* renamed from: c */
    public static String m29866c(int i) {
        return i != 1 ? i != 2 ? i != 3 ? i != 4 ? i != 5 ? i != 1000 ? i != 10001 ? i != 10002 ? "<UNKNOWN ERROR>" : "CAMERA_CHARACTERISTICS_CREATION_ERROR" : "CAMERA_UNAVAILABLE_DO_NOT_DISTURB" : "CAMERA_DEPRECATED_HAL" : "MAX_CAMERAS_IN_USE" : "CAMERA_IN_USE" : "CAMERA_ERROR" : "CAMERA_DISCONNECTED" : "CAMERA_DISABLED";
    }

    /* renamed from: e */
    public static h72 m29867e(CameraAccessException cameraAccessException) {
        if (cameraAccessException != null) {
            return new h72(cameraAccessException);
        }
        throw new NullPointerException("cameraAccessException should not be null");
    }

    /* renamed from: d */
    public final int m29868d() {
        return this.f26322a;
    }

    public h72(int i, Throwable th) {
        super(m29865b(i), th);
        this.f26322a = i;
        this.f26323b = f26320c.contains(Integer.valueOf(i)) ? new CameraAccessException(i, null, th) : null;
    }

    public h72(CameraAccessException cameraAccessException) {
        super(cameraAccessException.getMessage(), cameraAccessException.getCause());
        this.f26322a = cameraAccessException.getReason();
        this.f26323b = cameraAccessException;
    }
}
