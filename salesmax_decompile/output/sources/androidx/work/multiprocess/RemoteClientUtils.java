package androidx.work.multiprocess;

import androidx.work.impl.utils.futures.SettableFuture;
import java.util.concurrent.Executor;
import p001o.zfa;
import p001o.zl7;

/* loaded from: classes2.dex */
public final class RemoteClientUtils {
    public static final zl7 sVoidMapper = new zl7() { // from class: androidx.work.multiprocess.RemoteClientUtils.1
        @Override // p001o.zl7
        public Void apply(byte[] bArr) {
            return null;
        }
    };

    private RemoteClientUtils() {
    }

    public static <I, O> zfa map(final zfa zfaVar, final zl7 zl7Var, Executor executor) {
        final SettableFuture settableFutureCreate = SettableFuture.create();
        zfaVar.addListener(new Runnable() { // from class: androidx.work.multiprocess.RemoteClientUtils.2
            @Override // java.lang.Runnable
            public void run() {
                try {
                    settableFutureCreate.set(zl7Var.apply(zfaVar.get()));
                } catch (Throwable th) {
                    th = th;
                    Throwable cause = th.getCause();
                    if (cause != null) {
                        th = cause;
                    }
                    settableFutureCreate.setException(th);
                }
            }
        }, executor);
        return settableFutureCreate;
    }
}
