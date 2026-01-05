package p001o;

import android.os.Handler;
import java.util.concurrent.Executor;

/* loaded from: classes2.dex */
public final class c41 extends ua2 {

    /* renamed from: a */
    public final Executor f17255a;

    /* renamed from: b */
    public final Handler f17256b;

    public c41(Executor executor, Handler handler) {
        if (executor == null) {
            throw new NullPointerException("Null cameraExecutor");
        }
        this.f17255a = executor;
        if (handler == null) {
            throw new NullPointerException("Null schedulerHandler");
        }
        this.f17256b = handler;
    }

    @Override // p001o.ua2
    /* renamed from: b */
    public Executor mo20192b() {
        return this.f17255a;
    }

    @Override // p001o.ua2
    /* renamed from: c */
    public Handler mo20193c() {
        return this.f17256b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ua2)) {
            return false;
        }
        ua2 ua2Var = (ua2) obj;
        return this.f17255a.equals(ua2Var.mo20192b()) && this.f17256b.equals(ua2Var.mo20193c());
    }

    public int hashCode() {
        return ((this.f17255a.hashCode() ^ 1000003) * 1000003) ^ this.f17256b.hashCode();
    }

    public String toString() {
        return "CameraThreadConfig{cameraExecutor=" + this.f17255a + ", schedulerHandler=" + this.f17256b + "}";
    }
}
