package p021w;

import android.hardware.camera2.CameraDevice;
import p020v.C7607q;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: w.j */
/* loaded from: classes.dex */
public final /* synthetic */ class RunnableC7844j implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ int f37611a;

    /* renamed from: b */
    public final /* synthetic */ C7607q f37612b;

    /* renamed from: c */
    public final /* synthetic */ CameraDevice f37613c;

    public /* synthetic */ RunnableC7844j(C7607q c7607q, CameraDevice cameraDevice, int i10) {
        this.f37611a = i10;
        this.f37612b = c7607q;
        this.f37613c = cameraDevice;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f37611a) {
            case 0:
                ((CameraDevice.StateCallback) this.f37612b.f36666b).onClosed(this.f37613c);
                break;
            case 1:
                ((CameraDevice.StateCallback) this.f37612b.f36666b).onDisconnected(this.f37613c);
                break;
            default:
                ((CameraDevice.StateCallback) this.f37612b.f36666b).onOpened(this.f37613c);
                break;
        }
    }
}
