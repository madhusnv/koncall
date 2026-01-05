package androidx.work;

import java.util.concurrent.CancellationException;
import p001o.vre;
import p001o.wre;
import p001o.xb2;
import p001o.zfa;

/* loaded from: classes2.dex */
public final class ListenableFutureKt$await$2$1 implements Runnable {
    final /* synthetic */ xb2 $cancellableContinuation;
    final /* synthetic */ zfa $this_await;

    public ListenableFutureKt$await$2$1(xb2 xb2Var, zfa zfaVar) {
        this.$cancellableContinuation = xb2Var;
        this.$this_await = zfaVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            xb2 xb2Var = this.$cancellableContinuation;
            vre.C17665a c17665a = vre.f50797b;
            xb2Var.resumeWith(vre.m53351b(this.$this_await.get()));
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause == null) {
                cause = th;
            }
            if (th instanceof CancellationException) {
                this.$cancellableContinuation.cancel(cause);
                return;
            }
            xb2 xb2Var2 = this.$cancellableContinuation;
            vre.C17665a c17665a2 = vre.f50797b;
            xb2Var2.resumeWith(vre.m53351b(wre.m54933a(cause)));
        }
    }
}
