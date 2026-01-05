package b0;

import a1.RunnableC0024w;
import a1.c0;
import androidx.camera.core.CameraControl$OperationCanceledException;
import k0.ExecutorC3900j;
import l0.AbstractC4308h;
import p020v.C7599i;
import pg.i7;
import x4.C8299i;
import x4.InterfaceC8300j;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: b0.a */
/* loaded from: classes.dex */
public final /* synthetic */ class C0509a implements InterfaceC8300j {

    /* renamed from: a */
    public final /* synthetic */ int f3566a;

    /* renamed from: b */
    public final /* synthetic */ C0512d f3567b;

    public /* synthetic */ C0509a(C0512d c0512d, int i10) {
        this.f3566a = i10;
        this.f3567b = c0512d;
    }

    @Override // x4.InterfaceC8300j
    /* renamed from: I */
    public final Object mo15I(final C8299i c8299i) {
        switch (this.f3566a) {
            case 0:
                final C0512d c0512d = this.f3567b;
                final int i10 = 1;
                ((ExecutorC3900j) c0512d.f3577d).execute(new Runnable() { // from class: b0.c
                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i10) {
                            case 0:
                                C0512d c0512d2 = c0512d;
                                c0512d2.f3575b = true;
                                CameraControl$OperationCanceledException cameraControl$OperationCanceledException = new CameraControl$OperationCanceledException("Camera2CameraControl was updated with new options.");
                                C8299i c8299i2 = (C8299i) c0512d2.f3580g;
                                if (c8299i2 != null) {
                                    c8299i2.m15509d(cameraControl$OperationCanceledException);
                                    c0512d2.f3580g = null;
                                }
                                c0512d2.f3580g = c8299i;
                                if (c0512d2.f3574a) {
                                    C7599i c7599i = (C7599i) c0512d2.f3576c;
                                    c7599i.getClass();
                                    AbstractC4308h.m9034d(i7.m11697b(new c0(28, c7599i))).mo9026a(new RunnableC0024w(1, c0512d2), (ExecutorC3900j) c0512d2.f3577d);
                                    c0512d2.f3575b = false;
                                    break;
                                }
                                break;
                            default:
                                C0512d c0512d3 = c0512d;
                                c0512d3.f3575b = true;
                                CameraControl$OperationCanceledException cameraControl$OperationCanceledException2 = new CameraControl$OperationCanceledException("Camera2CameraControl was updated with new options.");
                                C8299i c8299i3 = (C8299i) c0512d3.f3580g;
                                if (c8299i3 != null) {
                                    c8299i3.m15509d(cameraControl$OperationCanceledException2);
                                    c0512d3.f3580g = null;
                                }
                                c0512d3.f3580g = c8299i;
                                if (c0512d3.f3574a) {
                                    C7599i c7599i2 = (C7599i) c0512d3.f3576c;
                                    c7599i2.getClass();
                                    AbstractC4308h.m9034d(i7.m11697b(new c0(28, c7599i2))).mo9026a(new RunnableC0024w(1, c0512d3), (ExecutorC3900j) c0512d3.f3577d);
                                    c0512d3.f3575b = false;
                                    break;
                                }
                                break;
                        }
                    }
                });
                return "addCaptureRequestOptions";
            default:
                final C0512d c0512d2 = this.f3567b;
                final int i11 = 0;
                ((ExecutorC3900j) c0512d2.f3577d).execute(new Runnable() { // from class: b0.c
                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i11) {
                            case 0:
                                C0512d c0512d22 = c0512d2;
                                c0512d22.f3575b = true;
                                CameraControl$OperationCanceledException cameraControl$OperationCanceledException = new CameraControl$OperationCanceledException("Camera2CameraControl was updated with new options.");
                                C8299i c8299i2 = (C8299i) c0512d22.f3580g;
                                if (c8299i2 != null) {
                                    c8299i2.m15509d(cameraControl$OperationCanceledException);
                                    c0512d22.f3580g = null;
                                }
                                c0512d22.f3580g = c8299i;
                                if (c0512d22.f3574a) {
                                    C7599i c7599i = (C7599i) c0512d22.f3576c;
                                    c7599i.getClass();
                                    AbstractC4308h.m9034d(i7.m11697b(new c0(28, c7599i))).mo9026a(new RunnableC0024w(1, c0512d22), (ExecutorC3900j) c0512d22.f3577d);
                                    c0512d22.f3575b = false;
                                    break;
                                }
                                break;
                            default:
                                C0512d c0512d3 = c0512d2;
                                c0512d3.f3575b = true;
                                CameraControl$OperationCanceledException cameraControl$OperationCanceledException2 = new CameraControl$OperationCanceledException("Camera2CameraControl was updated with new options.");
                                C8299i c8299i3 = (C8299i) c0512d3.f3580g;
                                if (c8299i3 != null) {
                                    c8299i3.m15509d(cameraControl$OperationCanceledException2);
                                    c0512d3.f3580g = null;
                                }
                                c0512d3.f3580g = c8299i;
                                if (c0512d3.f3574a) {
                                    C7599i c7599i2 = (C7599i) c0512d3.f3576c;
                                    c7599i2.getClass();
                                    AbstractC4308h.m9034d(i7.m11697b(new c0(28, c7599i2))).mo9026a(new RunnableC0024w(1, c0512d3), (ExecutorC3900j) c0512d3.f3577d);
                                    c0512d3.f3575b = false;
                                    break;
                                }
                                break;
                        }
                    }
                });
                return "clearCaptureRequestOptions";
        }
    }
}
