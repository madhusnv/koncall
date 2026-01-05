package i0;

import android.os.Handler;
import java.util.concurrent.Executor;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: i0.f */
/* loaded from: classes.dex */
public final class C3075f {

    /* renamed from: a */
    public final Executor f16452a;

    /* renamed from: b */
    public final Handler f16453b;

    public C3075f(Executor executor, Handler handler) {
        if (executor == null) {
            throw new NullPointerException("Null cameraExecutor");
        }
        this.f16452a = executor;
        if (handler == null) {
            throw new NullPointerException("Null schedulerHandler");
        }
        this.f16453b = handler;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C3075f) {
            C3075f c3075f = (C3075f) obj;
            if (this.f16452a.equals(c3075f.f16452a) && this.f16453b.equals(c3075f.f16453b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.f16452a.hashCode() ^ 1000003) * 1000003) ^ this.f16453b.hashCode();
    }

    public final String toString() {
        return "CameraThreadConfig{cameraExecutor=" + this.f16452a + ", schedulerHandler=" + this.f16453b + "}";
    }
}
