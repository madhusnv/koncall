package androidx.work.multiprocess;

import p001o.kf9;
import p001o.xk7;
import p001o.y3i;
import p001o.zfa;

/* loaded from: classes2.dex */
public final class RemoteCoroutineWorker$setProgress$$inlined$await$2 extends kf9 implements xk7 {
    final /* synthetic */ zfa $this_await;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RemoteCoroutineWorker$setProgress$$inlined$await$2(zfa zfaVar) {
        super(1);
        this.$this_await = zfaVar;
    }

    @Override // p001o.xk7
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((Throwable) obj);
        return y3i.f54824a;
    }

    public final void invoke(Throwable th) {
        this.$this_await.cancel(false);
    }
}
