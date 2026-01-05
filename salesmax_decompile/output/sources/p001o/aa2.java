package p001o;

import android.content.Context;
import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.CameraManager;
import android.os.Build;
import java.util.concurrent.Executor;

/* loaded from: classes2.dex */
public class aa2 extends da2 {
    public aa2(Context context) {
        super(context, null);
    }

    /* renamed from: i */
    public static aa2 m16709i(Context context) {
        return new aa2(context);
    }

    /* renamed from: k */
    public static boolean m16710k(Throwable th) {
        StackTraceElement[] stackTrace;
        if (!th.getClass().equals(RuntimeException.class) || (stackTrace = th.getStackTrace()) == null || stackTrace.length < 0) {
            return false;
        }
        return "_enableShutterSound".equals(stackTrace[0].getMethodName());
    }

    @Override // p001o.da2, p001o.z92.InterfaceC18583b
    /* renamed from: a */
    public void mo16711a(Executor executor, CameraManager.AvailabilityCallback availabilityCallback) {
        this.f19451a.registerAvailabilityCallback(executor, availabilityCallback);
    }

    @Override // p001o.da2, p001o.z92.InterfaceC18583b
    /* renamed from: b */
    public CameraCharacteristics mo16712b(String str) throws h72 {
        try {
            return super.mo16712b(str);
        } catch (RuntimeException e) {
            if (m16715j(e)) {
                m16716l(e);
            }
            throw e;
        }
    }

    @Override // p001o.da2, p001o.z92.InterfaceC18583b
    /* renamed from: d */
    public void mo16713d(String str, Executor executor, CameraDevice.StateCallback stateCallback) throws h72, CameraAccessException {
        try {
            this.f19451a.openCamera(str, executor, stateCallback);
        } catch (CameraAccessException e) {
            throw h72.m29867e(e);
        } catch (IllegalArgumentException e2) {
            throw e2;
        } catch (SecurityException e3) {
        } catch (RuntimeException e4) {
            if (m16715j(e4)) {
                m16716l(e4);
            }
            throw e4;
        }
    }

    @Override // p001o.da2, p001o.z92.InterfaceC18583b
    /* renamed from: f */
    public void mo16714f(CameraManager.AvailabilityCallback availabilityCallback) {
        this.f19451a.unregisterAvailabilityCallback(availabilityCallback);
    }

    /* renamed from: j */
    public final boolean m16715j(Throwable th) {
        return Build.VERSION.SDK_INT == 28 && m16710k(th);
    }

    /* renamed from: l */
    public final void m16716l(Throwable th) throws h72 {
        throw new h72(10001, th);
    }
}
