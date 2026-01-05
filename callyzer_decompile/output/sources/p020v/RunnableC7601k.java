package p020v;

import android.hardware.camera2.CameraAccessException;
import c0.C0812e;
import i0.f0;
import og.y0;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: v.k */
/* loaded from: classes.dex */
public final /* synthetic */ class RunnableC7601k implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ int f36616a;

    /* renamed from: b */
    public final /* synthetic */ C7612v f36617b;

    public /* synthetic */ RunnableC7601k(C7612v c7612v, int i10) {
        this.f36616a = i10;
        this.f36617b = c7612v;
    }

    @Override // java.lang.Runnable
    public final void run() throws CameraAccessException {
        switch (this.f36616a) {
            case 0:
                C7612v c7612v = this.f36617b;
                c7612v.f36706D = false;
                c7612v.f36705C = false;
                c7612v.m14455w("OpenCameraConfigAndClose is done, state: " + c7612v.f36723e);
                int iOrdinal = c7612v.f36723e.ordinal();
                if (iOrdinal != 1 && iOrdinal != 5) {
                    if (iOrdinal == 7) {
                        int i10 = c7612v.f36730m;
                        if (i10 == 0) {
                            c7612v.m14447L(false);
                            break;
                        } else {
                            c7612v.m14455w("OpenCameraConfigAndClose in error: ".concat(C7612v.m14435y(i10)));
                            c7612v.f36727j.m14431b();
                            break;
                        }
                    } else {
                        c7612v.m14455w("OpenCameraConfigAndClose finished while in state: " + c7612v.f36723e);
                        break;
                    }
                } else {
                    y0.m11056f(null, c7612v.f36735s.isEmpty());
                    c7612v.m14456x();
                    break;
                }
            default:
                C7612v c7612v2 = this.f36617b;
                c7612v2.m14455w("Camera is removed. Updating state and cleaning up.");
                EnumC7610t enumC7610t = c7612v2.f36723e;
                EnumC7610t enumC7610t2 = EnumC7610t.RELEASING;
                if (enumC7610t != enumC7610t2 && c7612v2.f36723e != EnumC7610t.RELEASED) {
                    C0812e c0812e = new C0812e(null, 8);
                    c7612v2.f36725g.m2709s(f0.CLOSED, c0812e);
                    c7612v2.m14443H(enumC7610t2, c0812e, true);
                    c7612v2.f36727j.m14430a();
                    c7612v2.f36718V.m2640d();
                    if (c7612v2.f36729l == null) {
                        c7612v2.m14456x();
                        break;
                    } else {
                        c7612v2.m14452t();
                        break;
                    }
                }
                break;
        }
    }
}
