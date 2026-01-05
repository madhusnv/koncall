package androidx.work.multiprocess;

import android.annotation.SuppressLint;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import androidx.work.Data;
import androidx.work.ExistingPeriodicWorkPolicy;
import androidx.work.ExistingWorkPolicy;
import androidx.work.ForegroundInfo;
import androidx.work.Logger;
import androidx.work.OneTimeWorkRequest;
import androidx.work.PeriodicWorkRequest;
import androidx.work.WorkContinuation;
import androidx.work.WorkInfo;
import androidx.work.WorkQuery;
import androidx.work.WorkRequest;
import androidx.work.impl.WorkContinuationImpl;
import androidx.work.impl.WorkManagerImpl;
import androidx.work.impl.utils.futures.SettableFuture;
import androidx.work.multiprocess.IWorkManagerImpl;
import androidx.work.multiprocess.IWorkManagerImplCallback;
import androidx.work.multiprocess.ListenableCallback;
import androidx.work.multiprocess.RemoteWorkManagerClient;
import androidx.work.multiprocess.parcelable.ParcelConverters;
import androidx.work.multiprocess.parcelable.ParcelableForegroundRequestInfo;
import androidx.work.multiprocess.parcelable.ParcelableUpdateRequest;
import androidx.work.multiprocess.parcelable.ParcelableWorkContinuationImpl;
import androidx.work.multiprocess.parcelable.ParcelableWorkInfos;
import androidx.work.multiprocess.parcelable.ParcelableWorkQuery;
import androidx.work.multiprocess.parcelable.ParcelableWorkRequest;
import androidx.work.multiprocess.parcelable.ParcelableWorkRequests;
import java.util.Collections;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import p001o.lw7;
import p001o.zfa;
import p001o.zl7;

@SuppressLint({"BanKeepAnnotation"})
/* loaded from: classes2.dex */
public class RemoteWorkManagerClient extends RemoteWorkManager {
    private static final long SESSION_TIMEOUT_MILLIS = 60000;
    static final String TAG = Logger.tagWithPrefix("RemoteWorkManagerClient");

    /* renamed from: a */
    public static final /* synthetic */ int f10575a = 0;
    final Context mContext;
    final Executor mExecutor;
    private final Handler mHandler;
    final Object mLock;
    Session mSession;
    private volatile long mSessionIndex;
    private final long mSessionTimeout;
    private final SessionTracker mSessionTracker;
    final WorkManagerImpl mWorkManager;

    public static class Session implements ServiceConnection {
        private static final String TAG = Logger.tagWithPrefix("RemoteWMgr.Connection");
        final RemoteWorkManagerClient mClient;
        final SettableFuture<IWorkManagerImpl> mFuture = SettableFuture.create();

        public Session(RemoteWorkManagerClient remoteWorkManagerClient) {
            this.mClient = remoteWorkManagerClient;
        }

        @Override // android.content.ServiceConnection
        public void onBindingDied(ComponentName componentName) {
            onBindingDied();
        }

        @Override // android.content.ServiceConnection
        public void onNullBinding(ComponentName componentName) {
            Logger.get().error(TAG, "Unable to bind to service");
            this.mFuture.setException(new RuntimeException("Cannot bind to service " + componentName));
        }

        @Override // android.content.ServiceConnection
        public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            Logger.get().debug(TAG, "Service connected");
            this.mFuture.set(IWorkManagerImpl.Stub.asInterface(iBinder));
        }

        @Override // android.content.ServiceConnection
        public void onServiceDisconnected(ComponentName componentName) {
            Logger.get().debug(TAG, "Service disconnected");
            this.mFuture.setException(new RuntimeException("Service disconnected"));
            this.mClient.cleanUp();
        }

        public void onBindingDied() {
            Logger.get().debug(TAG, "Binding died");
            this.mFuture.setException(new RuntimeException("Binding died"));
            this.mClient.cleanUp();
        }
    }

    public static class SessionRemoteCallback extends RemoteCallback {
        private final RemoteWorkManagerClient mClient;

        public SessionRemoteCallback(RemoteWorkManagerClient remoteWorkManagerClient) {
            this.mClient = remoteWorkManagerClient;
        }

        @Override // androidx.work.multiprocess.RemoteCallback
        public void onRequestCompleted() {
            super.onRequestCompleted();
            this.mClient.getSessionHandler().postDelayed(this.mClient.getSessionTracker(), this.mClient.getSessionTimeout());
        }
    }

    public static class SessionTracker implements Runnable {
        private static final String TAG = Logger.tagWithPrefix("SessionHandler");
        private final RemoteWorkManagerClient mClient;

        public SessionTracker(RemoteWorkManagerClient remoteWorkManagerClient) {
            this.mClient = remoteWorkManagerClient;
        }

        @Override // java.lang.Runnable
        public void run() {
            long sessionIndex = this.mClient.getSessionIndex();
            synchronized (this.mClient.getSessionLock()) {
                long sessionIndex2 = this.mClient.getSessionIndex();
                Session currentSession = this.mClient.getCurrentSession();
                if (currentSession != null) {
                    if (sessionIndex == sessionIndex2) {
                        Logger.get().debug(TAG, "Unbinding service");
                        this.mClient.getContext().unbindService(currentSession);
                        currentSession.onBindingDied();
                    } else {
                        Logger.get().debug(TAG, "Ignoring request to unbind.");
                    }
                }
            }
        }
    }

    public RemoteWorkManagerClient(Context context, WorkManagerImpl workManagerImpl) {
        this(context, workManagerImpl, SESSION_TIMEOUT_MILLIS);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$enqueueUniquePeriodicWork$0(PeriodicWorkRequest periodicWorkRequest, String str, IWorkManagerImpl iWorkManagerImpl, IWorkManagerImplCallback iWorkManagerImplCallback) {
        iWorkManagerImpl.updateUniquePeriodicWorkRequest(str, ParcelConverters.marshall(new ParcelableWorkRequest(periodicWorkRequest)), iWorkManagerImplCallback);
    }

    private static Intent newIntent(Context context) {
        return new Intent(context, (Class<?>) RemoteWorkManagerService.class);
    }

    private void unableToBind(Session session, Throwable th) {
        Logger.get().error(TAG, "Unable to bind to service", th);
        session.mFuture.setException(th);
    }

    @Override // androidx.work.multiprocess.RemoteWorkManager
    public RemoteWorkContinuation beginUniqueWork(String str, ExistingWorkPolicy existingWorkPolicy, List<OneTimeWorkRequest> list) {
        return new RemoteWorkContinuationImpl(this, this.mWorkManager.beginUniqueWork(str, existingWorkPolicy, list));
    }

    @Override // androidx.work.multiprocess.RemoteWorkManager
    public RemoteWorkContinuation beginWith(List<OneTimeWorkRequest> list) {
        return new RemoteWorkContinuationImpl(this, this.mWorkManager.beginWith(list));
    }

    @Override // androidx.work.multiprocess.RemoteWorkManager
    public zfa cancelAllWork() {
        return RemoteClientUtils.map(execute(new RemoteDispatcher<IWorkManagerImpl>() { // from class: androidx.work.multiprocess.RemoteWorkManagerClient.6
            @Override // androidx.work.multiprocess.RemoteDispatcher
            public void execute(IWorkManagerImpl iWorkManagerImpl, IWorkManagerImplCallback iWorkManagerImplCallback) {
                iWorkManagerImpl.cancelAllWork(iWorkManagerImplCallback);
            }
        }), RemoteClientUtils.sVoidMapper, this.mExecutor);
    }

    @Override // androidx.work.multiprocess.RemoteWorkManager
    public zfa cancelAllWorkByTag(final String str) {
        return RemoteClientUtils.map(execute(new RemoteDispatcher<IWorkManagerImpl>() { // from class: androidx.work.multiprocess.RemoteWorkManagerClient.4
            @Override // androidx.work.multiprocess.RemoteDispatcher
            public void execute(IWorkManagerImpl iWorkManagerImpl, IWorkManagerImplCallback iWorkManagerImplCallback) {
                iWorkManagerImpl.cancelAllWorkByTag(str, iWorkManagerImplCallback);
            }
        }), RemoteClientUtils.sVoidMapper, this.mExecutor);
    }

    @Override // androidx.work.multiprocess.RemoteWorkManager
    public zfa cancelUniqueWork(final String str) {
        return RemoteClientUtils.map(execute(new RemoteDispatcher<IWorkManagerImpl>() { // from class: androidx.work.multiprocess.RemoteWorkManagerClient.5
            @Override // androidx.work.multiprocess.RemoteDispatcher
            public void execute(IWorkManagerImpl iWorkManagerImpl, IWorkManagerImplCallback iWorkManagerImplCallback) {
                iWorkManagerImpl.cancelUniqueWork(str, iWorkManagerImplCallback);
            }
        }), RemoteClientUtils.sVoidMapper, this.mExecutor);
    }

    @Override // androidx.work.multiprocess.RemoteWorkManager
    public zfa cancelWorkById(final UUID uuid) {
        return RemoteClientUtils.map(execute(new RemoteDispatcher<IWorkManagerImpl>() { // from class: androidx.work.multiprocess.RemoteWorkManagerClient.3
            @Override // androidx.work.multiprocess.RemoteDispatcher
            public void execute(IWorkManagerImpl iWorkManagerImpl, IWorkManagerImplCallback iWorkManagerImplCallback) {
                iWorkManagerImpl.cancelWorkById(uuid.toString(), iWorkManagerImplCallback);
            }
        }), RemoteClientUtils.sVoidMapper, this.mExecutor);
    }

    public void cleanUp() {
        synchronized (this.mLock) {
            Logger.get().debug(TAG, "Cleaning up.");
            this.mSession = null;
        }
    }

    @Override // androidx.work.multiprocess.RemoteWorkManager
    public zfa enqueue(WorkRequest workRequest) {
        return enqueue(Collections.singletonList(workRequest));
    }

    @Override // androidx.work.multiprocess.RemoteWorkManager
    public zfa enqueueUniquePeriodicWork(final String str, ExistingPeriodicWorkPolicy existingPeriodicWorkPolicy, final PeriodicWorkRequest periodicWorkRequest) {
        return existingPeriodicWorkPolicy == ExistingPeriodicWorkPolicy.UPDATE ? RemoteClientUtils.map(execute(new RemoteDispatcher() { // from class: o.lie
            @Override // androidx.work.multiprocess.RemoteDispatcher
            public final void execute(Object obj, IWorkManagerImplCallback iWorkManagerImplCallback) {
                RemoteWorkManagerClient.lambda$enqueueUniquePeriodicWork$0(periodicWorkRequest, str, (IWorkManagerImpl) obj, iWorkManagerImplCallback);
            }
        }), RemoteClientUtils.sVoidMapper, this.mExecutor) : enqueue(this.mWorkManager.createWorkContinuationForUniquePeriodicWork(str, existingPeriodicWorkPolicy, periodicWorkRequest));
    }

    @Override // androidx.work.multiprocess.RemoteWorkManager
    public zfa enqueueUniqueWork(String str, ExistingWorkPolicy existingWorkPolicy, List<OneTimeWorkRequest> list) {
        return beginUniqueWork(str, existingWorkPolicy, list).enqueue();
    }

    public zfa execute(RemoteDispatcher<IWorkManagerImpl> remoteDispatcher) {
        return execute(getSession(), remoteDispatcher, new SessionRemoteCallback(this));
    }

    public Context getContext() {
        return this.mContext;
    }

    public Session getCurrentSession() {
        return this.mSession;
    }

    public Executor getExecutor() {
        return this.mExecutor;
    }

    public zfa getSession() {
        return getSession(newIntent(this.mContext));
    }

    public Handler getSessionHandler() {
        return this.mHandler;
    }

    public long getSessionIndex() {
        return this.mSessionIndex;
    }

    public Object getSessionLock() {
        return this.mLock;
    }

    public long getSessionTimeout() {
        return this.mSessionTimeout;
    }

    public SessionTracker getSessionTracker() {
        return this.mSessionTracker;
    }

    @Override // androidx.work.multiprocess.RemoteWorkManager
    public zfa getWorkInfos(final WorkQuery workQuery) {
        return RemoteClientUtils.map(execute(new RemoteDispatcher<IWorkManagerImpl>() { // from class: androidx.work.multiprocess.RemoteWorkManagerClient.7
            @Override // androidx.work.multiprocess.RemoteDispatcher
            public void execute(IWorkManagerImpl iWorkManagerImpl, IWorkManagerImplCallback iWorkManagerImplCallback) {
                iWorkManagerImpl.queryWorkInfo(ParcelConverters.marshall(new ParcelableWorkQuery(workQuery)), iWorkManagerImplCallback);
            }
        }), new zl7() { // from class: androidx.work.multiprocess.RemoteWorkManagerClient.8
            @Override // p001o.zl7
            public List<WorkInfo> apply(byte[] bArr) {
                return ((ParcelableWorkInfos) ParcelConverters.unmarshall(bArr, ParcelableWorkInfos.CREATOR)).getWorkInfos();
            }
        }, this.mExecutor);
    }

    @Override // androidx.work.multiprocess.RemoteWorkManager
    public zfa setForegroundAsync(final String str, final ForegroundInfo foregroundInfo) {
        return RemoteClientUtils.map(execute(new RemoteDispatcher<IWorkManagerImpl>() { // from class: androidx.work.multiprocess.RemoteWorkManagerClient.10
            @Override // androidx.work.multiprocess.RemoteDispatcher
            public void execute(IWorkManagerImpl iWorkManagerImpl, IWorkManagerImplCallback iWorkManagerImplCallback) {
                iWorkManagerImpl.setForegroundAsync(ParcelConverters.marshall(new ParcelableForegroundRequestInfo(str, foregroundInfo)), iWorkManagerImplCallback);
            }
        }), RemoteClientUtils.sVoidMapper, this.mExecutor);
    }

    @Override // androidx.work.multiprocess.RemoteWorkManager
    public zfa setProgress(final UUID uuid, final Data data) {
        return RemoteClientUtils.map(execute(new RemoteDispatcher<IWorkManagerImpl>() { // from class: androidx.work.multiprocess.RemoteWorkManagerClient.9
            @Override // androidx.work.multiprocess.RemoteDispatcher
            public void execute(IWorkManagerImpl iWorkManagerImpl, IWorkManagerImplCallback iWorkManagerImplCallback) {
                iWorkManagerImpl.setProgress(ParcelConverters.marshall(new ParcelableUpdateRequest(uuid, data)), iWorkManagerImplCallback);
            }
        }), RemoteClientUtils.sVoidMapper, this.mExecutor);
    }

    public RemoteWorkManagerClient(Context context, WorkManagerImpl workManagerImpl, long j) {
        this.mContext = context.getApplicationContext();
        this.mWorkManager = workManagerImpl;
        this.mExecutor = workManagerImpl.getWorkTaskExecutor().getSerialTaskExecutor();
        this.mLock = new Object();
        this.mSession = null;
        this.mSessionTracker = new SessionTracker(this);
        this.mSessionTimeout = j;
        this.mHandler = lw7.m37994a(Looper.getMainLooper());
    }

    @Override // androidx.work.multiprocess.RemoteWorkManager
    public zfa enqueue(final List<WorkRequest> list) {
        return RemoteClientUtils.map(execute(new RemoteDispatcher<IWorkManagerImpl>() { // from class: androidx.work.multiprocess.RemoteWorkManagerClient.1
            @Override // androidx.work.multiprocess.RemoteDispatcher
            public void execute(IWorkManagerImpl iWorkManagerImpl, IWorkManagerImplCallback iWorkManagerImplCallback) {
                iWorkManagerImpl.enqueueWorkRequests(ParcelConverters.marshall(new ParcelableWorkRequests((List<WorkRequest>) list)), iWorkManagerImplCallback);
            }
        }), RemoteClientUtils.sVoidMapper, this.mExecutor);
    }

    public zfa execute(final zfa zfaVar, final RemoteDispatcher<IWorkManagerImpl> remoteDispatcher, final RemoteCallback remoteCallback) {
        zfaVar.addListener(new Runnable() { // from class: androidx.work.multiprocess.RemoteWorkManagerClient.11
            @Override // java.lang.Runnable
            public void run() {
                try {
                    final IWorkManagerImpl iWorkManagerImpl = (IWorkManagerImpl) zfaVar.get();
                    remoteCallback.setBinder(iWorkManagerImpl.asBinder());
                    RemoteWorkManagerClient.this.mExecutor.execute(new Runnable() { // from class: androidx.work.multiprocess.RemoteWorkManagerClient.11.1
                        @Override // java.lang.Runnable
                        public void run() {
                            try {
                                AnonymousClass11 anonymousClass11 = AnonymousClass11.this;
                                remoteDispatcher.execute(iWorkManagerImpl, remoteCallback);
                            } catch (Throwable th) {
                                Logger.get().error(RemoteWorkManagerClient.TAG, "Unable to execute", th);
                                ListenableCallback.ListenableCallbackRunnable.reportFailure(remoteCallback, th);
                            }
                        }
                    });
                } catch (InterruptedException | ExecutionException unused) {
                    Logger.get().error(RemoteWorkManagerClient.TAG, "Unable to bind to service");
                    ListenableCallback.ListenableCallbackRunnable.reportFailure(remoteCallback, new RuntimeException("Unable to bind to service"));
                    RemoteWorkManagerClient.this.cleanUp();
                }
            }
        }, this.mExecutor);
        return remoteCallback.getFuture();
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x003c A[Catch: all -> 0x0049, TryCatch #1 {, blocks: (B:4:0x0003, B:6:0x000e, B:12:0x0037, B:13:0x003c, B:14:0x0047, B:7:0x0020, B:9:0x0029), top: B:21:0x0003, inners: #0 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public zfa getSession(Intent intent) {
        SettableFuture<IWorkManagerImpl> settableFuture;
        synchronized (this.mLock) {
            this.mSessionIndex++;
            if (this.mSession == null) {
                Logger.get().debug(TAG, "Creating a new session");
                Session session = new Session(this);
                this.mSession = session;
                try {
                } catch (Throwable th) {
                    unableToBind(this.mSession, th);
                }
                if (this.mContext.bindService(intent, session, 1)) {
                    this.mHandler.removeCallbacks(this.mSessionTracker);
                    settableFuture = this.mSession.mFuture;
                } else {
                    unableToBind(this.mSession, new RuntimeException("Unable to bind to service"));
                    this.mHandler.removeCallbacks(this.mSessionTracker);
                    settableFuture = this.mSession.mFuture;
                }
            }
        }
        return settableFuture;
    }

    @Override // androidx.work.multiprocess.RemoteWorkManager
    public zfa enqueue(final WorkContinuation workContinuation) {
        return RemoteClientUtils.map(execute(new RemoteDispatcher<IWorkManagerImpl>() { // from class: androidx.work.multiprocess.RemoteWorkManagerClient.2
            @Override // androidx.work.multiprocess.RemoteDispatcher
            public void execute(IWorkManagerImpl iWorkManagerImpl, IWorkManagerImplCallback iWorkManagerImplCallback) {
                iWorkManagerImpl.enqueueContinuation(ParcelConverters.marshall(new ParcelableWorkContinuationImpl((WorkContinuationImpl) workContinuation)), iWorkManagerImplCallback);
            }
        }), RemoteClientUtils.sVoidMapper, this.mExecutor);
    }
}
