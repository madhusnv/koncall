package i0;

import androidx.camera.core.impl.CameraValidator$CameraIdListIncorrectException;
import com.google.crypto.tink.shaded.protobuf.C1377d;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class k0 implements c0.m1 {

    /* renamed from: b */
    public final /* synthetic */ int f16506b;

    /* renamed from: c */
    public final c0.m1 f16507c;

    public k0(int i10, long j6) {
        this.f16506b = i10;
        switch (i10) {
            case 1:
                this.f16507c = new s2(j6, new j0(j6));
                break;
            default:
                this.f16507c = new k0(1, j6);
                break;
        }
    }

    @Override // c0.m1
    /* renamed from: a */
    public final long mo2220a() {
        switch (this.f16506b) {
            case 0:
                return ((s2) ((k0) this.f16507c).f16507c).f16578b;
            default:
                return ((s2) this.f16507c).f16578b;
        }
    }

    @Override // c0.m1
    /* renamed from: b */
    public final c0.l1 mo2221b(C1377d c1377d) {
        switch (this.f16506b) {
            case 0:
                if (((s2) ((k0) this.f16507c).f16507c).mo2221b(c1377d).f5153b) {
                    return c0.l1.f5150e;
                }
                Throwable th2 = (Throwable) c1377d.f7029c;
                if (th2 instanceof CameraValidator$CameraIdListIncorrectException) {
                    og.u1.m10943b("CameraX");
                    if (((CameraValidator$CameraIdListIncorrectException) th2).f1852a > 0) {
                        return c0.l1.f5151f;
                    }
                }
                return c0.l1.f5149d;
            default:
                return ((s2) this.f16507c).mo2221b(c1377d);
        }
    }
}
