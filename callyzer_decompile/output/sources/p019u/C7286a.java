package p019u;

import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.CaptureRequest;
import i0.C3076g;
import zk.C8989c;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: u.a */
/* loaded from: classes.dex */
public final class C7286a extends C8989c {

    /* renamed from: c */
    public static final C3076g f34752c = new C3076g("camera2.captureRequest.templateType", Integer.TYPE, null);

    /* renamed from: d */
    public static final C3076g f34753d = new C3076g("camera2.cameraCaptureSession.streamUseCase", Long.TYPE, null);

    /* renamed from: e */
    public static final C3076g f34754e = new C3076g("camera2.cameraDevice.stateCallback", CameraDevice.StateCallback.class, null);

    /* renamed from: f */
    public static final C3076g f34755f = new C3076g("camera2.cameraCaptureSession.stateCallback", CameraCaptureSession.StateCallback.class, null);

    /* renamed from: g */
    public static final C3076g f34756g = new C3076g("camera2.cameraCaptureSession.captureCallback", CameraCaptureSession.CaptureCallback.class, null);

    /* renamed from: h */
    public static final C3076g f34757h = new C3076g("camera2.cameraCaptureSession.physicalCameraId", String.class, null);

    public static C3076g g0(CaptureRequest.Key key) {
        return new C3076g("camera2.captureRequest.option." + key.getName(), Object.class, key);
    }
}
