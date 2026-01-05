package b0;

import a1.RunnableC0024w;
import a1.c0;
import android.hardware.camera2.CameraAccessException;
import androidx.camera.core.CameraControl$OperationCanceledException;
import k0.ExecutorC3900j;
import l0.AbstractC4308h;
import p020v.C7599i;
import p020v.C7612v;
import p020v.EnumC7610t;
import pg.i7;
import x4.C8299i;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: b0.b */
/* loaded from: classes.dex */
public final /* synthetic */ class RunnableC0510b implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ int f3568a;

    /* renamed from: b */
    public final /* synthetic */ boolean f3569b;

    /* renamed from: c */
    public final /* synthetic */ Object f3570c;

    public /* synthetic */ RunnableC0510b(Object obj, boolean z6, int i10) {
        this.f3568a = i10;
        this.f3570c = obj;
        this.f3569b = z6;
    }

    @Override // java.lang.Runnable
    public final void run() throws CameraAccessException {
        switch (this.f3568a) {
            case 0:
                C0512d c0512d = (C0512d) this.f3570c;
                boolean z6 = this.f3569b;
                if (c0512d.f3574a != z6) {
                    c0512d.f3574a = z6;
                    if (!z6) {
                        CameraControl$OperationCanceledException cameraControl$OperationCanceledException = new CameraControl$OperationCanceledException("The camera control has became inactive.");
                        C8299i c8299i = (C8299i) c0512d.f3580g;
                        if (c8299i != null) {
                            c8299i.m15509d(cameraControl$OperationCanceledException);
                            c0512d.f3580g = null;
                            break;
                        }
                    } else if (c0512d.f3575b) {
                        C7599i c7599i = (C7599i) c0512d.f3576c;
                        c7599i.getClass();
                        AbstractC4308h.m9034d(i7.m11697b(new c0(28, c7599i))).mo9026a(new RunnableC0024w(1, c0512d), (ExecutorC3900j) c0512d.f3577d);
                        c0512d.f3575b = false;
                        break;
                    }
                }
                break;
            default:
                C7612v c7612v = (C7612v) this.f3570c;
                boolean z10 = this.f3569b;
                c7612v.f36714M = z10;
                if (z10) {
                    if (c7612v.f36723e == EnumC7610t.PENDING_OPEN || c7612v.f36723e == EnumC7610t.OPENING_WITH_ERROR) {
                        c7612v.m14446K(false);
                        break;
                    }
                }
                break;
        }
    }
}
