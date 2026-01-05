package p021w;

import android.hardware.camera2.CameraCaptureSession;
import bg.AbstractC0656a;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: w.d */
/* loaded from: classes.dex */
public final /* synthetic */ class RunnableC7838d implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ int f37601a;

    /* renamed from: b */
    public final /* synthetic */ C7839e f37602b;

    /* renamed from: c */
    public final /* synthetic */ CameraCaptureSession f37603c;

    public /* synthetic */ RunnableC7838d(C7839e c7839e, CameraCaptureSession cameraCaptureSession, int i10) {
        this.f37601a = i10;
        this.f37602b = c7839e;
        this.f37603c = cameraCaptureSession;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f37601a) {
            case 0:
                this.f37602b.f37604a.onActive(this.f37603c);
                break;
            case 1:
                this.f37602b.f37604a.onClosed(this.f37603c);
                break;
            case 2:
                AbstractC0656a.m1909r(this.f37602b.f37604a, this.f37603c);
                break;
            case 3:
                this.f37602b.f37604a.onConfigured(this.f37603c);
                break;
            case 4:
                this.f37602b.f37604a.onReady(this.f37603c);
                break;
            default:
                this.f37602b.f37604a.onConfigureFailed(this.f37603c);
                break;
        }
    }
}
