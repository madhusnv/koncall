package androidx.work.multiprocess;

import android.os.IBinder;
import android.os.RemoteException;
import androidx.work.impl.utils.futures.SettableFuture;
import androidx.work.multiprocess.IWorkManagerImplCallback;
import java.util.NoSuchElementException;
import p001o.zfa;

/* loaded from: classes2.dex */
public class RemoteCallback extends IWorkManagerImplCallback.Stub {
    private IBinder mBinder = null;
    private final SettableFuture<byte[]> mFuture = SettableFuture.create();
    private final IBinder.DeathRecipient mRecipient = new DeathRecipient(this);

    public static class DeathRecipient implements IBinder.DeathRecipient {
        private final RemoteCallback mCallback;

        public DeathRecipient(RemoteCallback remoteCallback) {
            this.mCallback = remoteCallback;
        }

        @Override // android.os.IBinder.DeathRecipient
        public void binderDied() {
            this.mCallback.onFailure("Binder died");
        }
    }

    private void unlinkToDeath() {
        IBinder iBinder = this.mBinder;
        if (iBinder != null) {
            try {
                iBinder.unlinkToDeath(this.mRecipient, 0);
            } catch (NoSuchElementException unused) {
            }
        }
    }

    public zfa getFuture() {
        return this.mFuture;
    }

    @Override // androidx.work.multiprocess.IWorkManagerImplCallback
    public void onFailure(String str) {
        onFailure(new RuntimeException(str));
    }

    public void onRequestCompleted() {
    }

    @Override // androidx.work.multiprocess.IWorkManagerImplCallback
    public void onSuccess(byte[] bArr) {
        this.mFuture.set(bArr);
        unlinkToDeath();
        onRequestCompleted();
    }

    public void setBinder(IBinder iBinder) throws RemoteException {
        this.mBinder = iBinder;
        try {
            iBinder.linkToDeath(this.mRecipient, 0);
        } catch (RemoteException e) {
            onFailure(e);
        }
    }

    private void onFailure(Throwable th) {
        this.mFuture.setException(th);
        unlinkToDeath();
        onRequestCompleted();
    }
}
