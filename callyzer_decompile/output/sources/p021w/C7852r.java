package p021w;

import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.CameraManager;
import android.os.Build;
import androidx.camera.camera2.internal.compat.CameraAccessExceptionCompat;
import c9.C0908c;
import java.util.concurrent.Executor;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: w.r */
/* loaded from: classes.dex */
public class C7852r extends C0908c {
    /* renamed from: J */
    public static boolean m14837J(RuntimeException runtimeException) {
        StackTraceElement[] stackTrace;
        if (Build.VERSION.SDK_INT == 28) {
            if ((!runtimeException.getClass().equals(RuntimeException.class) || (stackTrace = runtimeException.getStackTrace()) == null || stackTrace.length < 0) ? false : "_enableShutterSound".equals(stackTrace[0].getMethodName())) {
                return true;
            }
        }
        return false;
    }

    @Override // c9.C0908c
    /* renamed from: C */
    public void mo2550C(String str, Executor executor, CameraDevice.StateCallback stateCallback) throws CameraAccessException, CameraAccessExceptionCompat {
        try {
            ((CameraManager) this.f5574b).openCamera(str, executor, stateCallback);
        } catch (CameraAccessException e2) {
            throw new CameraAccessExceptionCompat(e2);
        } catch (IllegalArgumentException e10) {
        } catch (SecurityException e11) {
            throw e11;
        } catch (RuntimeException e12) {
            if (!m14837J(e12)) {
                throw e12;
            }
            throw new CameraAccessExceptionCompat(e12);
        }
    }

    @Override // c9.C0908c
    /* renamed from: E */
    public final void mo2552E(Executor executor, CameraManager.AvailabilityCallback availabilityCallback) {
        ((CameraManager) this.f5574b).registerAvailabilityCallback(executor, availabilityCallback);
    }

    @Override // c9.C0908c
    /* renamed from: F */
    public final void mo2553F(CameraManager.AvailabilityCallback availabilityCallback) {
        ((CameraManager) this.f5574b).unregisterAvailabilityCallback(availabilityCallback);
    }

    @Override // c9.C0908c
    /* renamed from: i */
    public CameraCharacteristics mo2565i(String str) throws CameraAccessExceptionCompat {
        try {
            return super.mo2565i(str);
        } catch (RuntimeException e2) {
            if (m14837J(e2)) {
                throw new CameraAccessExceptionCompat(e2);
            }
            throw e2;
        }
    }
}
