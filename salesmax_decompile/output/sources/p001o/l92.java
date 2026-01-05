package p001o;

import android.hardware.camera2.CameraDevice;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes2.dex */
public abstract class l92 {

    /* renamed from: o.l92$a */
    public static final class C15040a extends CameraDevice.StateCallback {

        /* renamed from: a */
        public final List f33495a = new ArrayList();

        public C15040a(List list) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                CameraDevice.StateCallback stateCallback = (CameraDevice.StateCallback) it.next();
                if (!(stateCallback instanceof C15041b)) {
                    this.f33495a.add(stateCallback);
                }
            }
        }

        @Override // android.hardware.camera2.CameraDevice.StateCallback
        public void onClosed(CameraDevice cameraDevice) {
            Iterator it = this.f33495a.iterator();
            while (it.hasNext()) {
                ((CameraDevice.StateCallback) it.next()).onClosed(cameraDevice);
            }
        }

        @Override // android.hardware.camera2.CameraDevice.StateCallback
        public void onDisconnected(CameraDevice cameraDevice) {
            Iterator it = this.f33495a.iterator();
            while (it.hasNext()) {
                ((CameraDevice.StateCallback) it.next()).onDisconnected(cameraDevice);
            }
        }

        @Override // android.hardware.camera2.CameraDevice.StateCallback
        public void onError(CameraDevice cameraDevice, int i) {
            Iterator it = this.f33495a.iterator();
            while (it.hasNext()) {
                ((CameraDevice.StateCallback) it.next()).onError(cameraDevice, i);
            }
        }

        @Override // android.hardware.camera2.CameraDevice.StateCallback
        public void onOpened(CameraDevice cameraDevice) {
            Iterator it = this.f33495a.iterator();
            while (it.hasNext()) {
                ((CameraDevice.StateCallback) it.next()).onOpened(cameraDevice);
            }
        }
    }

    /* renamed from: o.l92$b */
    public static final class C15041b extends CameraDevice.StateCallback {
        @Override // android.hardware.camera2.CameraDevice.StateCallback
        public void onClosed(CameraDevice cameraDevice) {
        }

        @Override // android.hardware.camera2.CameraDevice.StateCallback
        public void onDisconnected(CameraDevice cameraDevice) {
        }

        @Override // android.hardware.camera2.CameraDevice.StateCallback
        public void onError(CameraDevice cameraDevice, int i) {
        }

        @Override // android.hardware.camera2.CameraDevice.StateCallback
        public void onOpened(CameraDevice cameraDevice) {
        }
    }

    /* renamed from: a */
    public static CameraDevice.StateCallback m36809a(List list) {
        return list.isEmpty() ? m36810b() : list.size() == 1 ? (CameraDevice.StateCallback) list.get(0) : new C15040a(list);
    }

    /* renamed from: b */
    public static CameraDevice.StateCallback m36810b() {
        return new C15041b();
    }
}
