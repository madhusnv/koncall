package wi;

import android.os.Bundle;
import java.util.concurrent.Callable;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: wi.k */
/* loaded from: classes.dex */
public final class CallableC8061k implements Callable {

    /* renamed from: a */
    public final /* synthetic */ long f38595a;

    /* renamed from: b */
    public final /* synthetic */ C8062l f38596b;

    public CallableC8061k(C8062l c8062l, long j6) {
        this.f38596b = c8062l;
        this.f38595a = j6;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        Bundle bundle = new Bundle();
        bundle.putInt("fatal", 1);
        bundle.putLong("timestamp", this.f38595a);
        this.f38596b.f38609k.mo9084l(bundle);
        return null;
    }
}
