package androidx.work.multiprocess;

import android.os.RemoteException;
import androidx.work.Logger;
import java.util.concurrent.Executor;
import p001o.zfa;

/* loaded from: classes2.dex */
public abstract class ListenableCallback<I> {
    final IWorkManagerImplCallback mCallback;
    final Executor mExecutor;
    final zfa mFuture;

    public static class ListenableCallbackRunnable<I> implements Runnable {
        private static final String TAG = Logger.tagWithPrefix("ListenableCallbackRbl");
        private final ListenableCallback<I> mCallback;

        public ListenableCallbackRunnable(ListenableCallback<I> listenableCallback) {
            this.mCallback = listenableCallback;
        }

        public static void reportFailure(IWorkManagerImplCallback iWorkManagerImplCallback, Throwable th) {
            try {
                iWorkManagerImplCallback.onFailure(th.getMessage());
            } catch (RemoteException e) {
                Logger.get().error(TAG, "Unable to notify failures in operation", e);
            }
        }

        public static void reportSuccess(IWorkManagerImplCallback iWorkManagerImplCallback, byte[] bArr) {
            try {
                iWorkManagerImplCallback.onSuccess(bArr);
            } catch (RemoteException e) {
                Logger.get().error(TAG, "Unable to notify successful operation", e);
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.lang.Runnable
        public void run() {
            try {
                Object obj = this.mCallback.mFuture.get();
                ListenableCallback<I> listenableCallback = this.mCallback;
                reportSuccess(listenableCallback.mCallback, listenableCallback.toByteArray(obj));
            } catch (Throwable th) {
                reportFailure(this.mCallback.mCallback, th);
            }
        }
    }

    public ListenableCallback(Executor executor, IWorkManagerImplCallback iWorkManagerImplCallback, zfa zfaVar) {
        this.mExecutor = executor;
        this.mCallback = iWorkManagerImplCallback;
        this.mFuture = zfaVar;
    }

    public void dispatchCallbackSafely() {
        this.mFuture.addListener(new ListenableCallbackRunnable(this), this.mExecutor);
    }

    public abstract byte[] toByteArray(I i);
}
