package androidx.work.multiprocess;

import android.annotation.SuppressLint;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import androidx.work.Logger;
import androidx.work.impl.utils.futures.SettableFuture;
import androidx.work.multiprocess.IListenableWorkerImpl;
import androidx.work.multiprocess.ListenableCallback;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import p001o.zfa;

/* loaded from: classes2.dex */
public class ListenableWorkerImplClient {
    static final String TAG = Logger.tagWithPrefix("ListenableWorkerImplClient");
    private Connection mConnection;
    final Context mContext;
    final Executor mExecutor;
    private final Object mLock = new Object();

    public static class Connection implements ServiceConnection {
        private static final String TAG = Logger.tagWithPrefix("ListenableWorkerImplSession");
        final SettableFuture<IListenableWorkerImpl> mFuture = SettableFuture.create();

        @Override // android.content.ServiceConnection
        public void onBindingDied(ComponentName componentName) {
            Logger.get().warning(TAG, "Binding died");
            this.mFuture.setException(new RuntimeException("Binding died"));
        }

        @Override // android.content.ServiceConnection
        public void onNullBinding(ComponentName componentName) {
            Logger.get().error(TAG, "Unable to bind to service");
            this.mFuture.setException(new RuntimeException("Cannot bind to service " + componentName));
        }

        @Override // android.content.ServiceConnection
        public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            Logger.get().debug(TAG, "Service connected");
            this.mFuture.set(IListenableWorkerImpl.Stub.asInterface(iBinder));
        }

        @Override // android.content.ServiceConnection
        public void onServiceDisconnected(ComponentName componentName) {
            Logger.get().warning(TAG, "Service disconnected");
            this.mFuture.setException(new RuntimeException("Service disconnected"));
        }
    }

    public ListenableWorkerImplClient(Context context, Executor executor) {
        this.mContext = context;
        this.mExecutor = executor;
    }

    private static void unableToBind(Connection connection, Throwable th) {
        Logger.get().error(TAG, "Unable to bind to service", th);
        connection.mFuture.setException(th);
    }

    public zfa execute(ComponentName componentName, RemoteDispatcher<IListenableWorkerImpl> remoteDispatcher) {
        return execute(getListenableWorkerImpl(componentName), remoteDispatcher, new RemoteCallback());
    }

    public Connection getConnection() {
        return this.mConnection;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x005e A[Catch: all -> 0x0064, TryCatch #0 {, blocks: (B:4:0x0003, B:6:0x0007, B:12:0x0059, B:13:0x005e, B:14:0x0062, B:7:0x0038, B:9:0x004b), top: B:19:0x0003, inners: #1 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public zfa getListenableWorkerImpl(ComponentName componentName) {
        SettableFuture<IListenableWorkerImpl> settableFuture;
        Intent intent;
        synchronized (this.mLock) {
            if (this.mConnection == null) {
                Logger.get().debug(TAG, "Binding to " + componentName.getPackageName() + ", " + componentName.getClassName());
                this.mConnection = new Connection();
                try {
                    intent = new Intent();
                    intent.setComponent(componentName);
                } catch (Throwable th) {
                    unableToBind(this.mConnection, th);
                }
                if (this.mContext.bindService(intent, this.mConnection, 1)) {
                    settableFuture = this.mConnection.mFuture;
                } else {
                    unableToBind(this.mConnection, new RuntimeException("Unable to bind to service"));
                    settableFuture = this.mConnection.mFuture;
                }
            }
        }
        return settableFuture;
    }

    public void unbindService() {
        synchronized (this.mLock) {
            Connection connection = this.mConnection;
            if (connection != null) {
                this.mContext.unbindService(connection);
                this.mConnection = null;
            }
        }
    }

    @SuppressLint({"LambdaLast"})
    public zfa execute(final zfa zfaVar, final RemoteDispatcher<IListenableWorkerImpl> remoteDispatcher, final RemoteCallback remoteCallback) {
        zfaVar.addListener(new Runnable() { // from class: androidx.work.multiprocess.ListenableWorkerImplClient.1
            @Override // java.lang.Runnable
            public void run() {
                try {
                    final IListenableWorkerImpl iListenableWorkerImpl = (IListenableWorkerImpl) zfaVar.get();
                    remoteCallback.setBinder(iListenableWorkerImpl.asBinder());
                    ListenableWorkerImplClient.this.mExecutor.execute(new Runnable() { // from class: androidx.work.multiprocess.ListenableWorkerImplClient.1.1
                        @Override // java.lang.Runnable
                        public void run() {
                            try {
                                RunnableC26331 runnableC26331 = RunnableC26331.this;
                                remoteDispatcher.execute(iListenableWorkerImpl, remoteCallback);
                            } catch (Throwable th) {
                                Logger.get().error(ListenableWorkerImplClient.TAG, "Unable to execute", th);
                                ListenableCallback.ListenableCallbackRunnable.reportFailure(remoteCallback, th);
                            }
                        }
                    });
                } catch (InterruptedException | ExecutionException e) {
                    Logger.get().error(ListenableWorkerImplClient.TAG, "Unable to bind to service", e);
                    ListenableCallback.ListenableCallbackRunnable.reportFailure(remoteCallback, e);
                }
            }
        }, this.mExecutor);
        return remoteCallback.getFuture();
    }
}
