package p001o;

import android.os.Handler;
import java.util.concurrent.Executor;

/* loaded from: classes2.dex */
public final /* synthetic */ class rb5 implements Executor {

    /* renamed from: a */
    public final /* synthetic */ Handler f43339a;

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        this.f43339a.post(runnable);
    }
}
