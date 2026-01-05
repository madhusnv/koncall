package androidx.work.multiprocess;

import android.content.Context;
import androidx.work.Configuration;
import androidx.work.ForegroundUpdater;
import androidx.work.ListenableWorker;
import androidx.work.Logger;
import androidx.work.ProgressUpdater;
import androidx.work.WorkerParameters;
import androidx.work.impl.utils.futures.SettableFuture;
import androidx.work.impl.utils.taskexecutor.TaskExecutor;
import androidx.work.multiprocess.IListenableWorkerImpl;
import androidx.work.multiprocess.ListenableCallback;
import androidx.work.multiprocess.parcelable.ParcelConverters;
import androidx.work.multiprocess.parcelable.ParcelableRemoteWorkRequest;
import androidx.work.multiprocess.parcelable.ParcelableResult;
import androidx.work.multiprocess.parcelable.ParcelableWorkerParameters;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import p001o.zfa;

/* loaded from: classes2.dex */
public class ListenableWorkerImpl extends IListenableWorkerImpl.Stub {
    static final String TAG = Logger.tagWithPrefix("ListenableWorkerImpl");
    static byte[] sEMPTY = new byte[0];
    static final Object sLock = new Object();
    final Configuration mConfiguration;
    final Context mContext;
    final ForegroundUpdater mForegroundUpdater;
    final Map<String, zfa> mFutureMap;
    final ProgressUpdater mProgressUpdater;
    final TaskExecutor mTaskExecutor;

    public ListenableWorkerImpl(Context context) {
        this.mContext = context.getApplicationContext();
        RemoteWorkManagerInfo remoteWorkManagerInfo = RemoteWorkManagerInfo.getInstance(context);
        this.mConfiguration = remoteWorkManagerInfo.getConfiguration();
        this.mTaskExecutor = remoteWorkManagerInfo.getTaskExecutor();
        this.mProgressUpdater = remoteWorkManagerInfo.getProgressUpdater();
        this.mForegroundUpdater = remoteWorkManagerInfo.getForegroundUpdater();
        this.mFutureMap = new HashMap();
    }

    private zfa executeWorkRequest(String str, final String str2, final WorkerParameters workerParameters) {
        final SettableFuture settableFutureCreate = SettableFuture.create();
        Logger.get().debug(TAG, "Tracking execution of " + str + " (" + str2 + ")");
        synchronized (sLock) {
            this.mFutureMap.put(str, settableFutureCreate);
        }
        this.mTaskExecutor.getMainThreadExecutor().execute(new Runnable() { // from class: o.aga
            @Override // java.lang.Runnable
            public final void run() {
                this.f14666a.lambda$executeWorkRequest$0(str2, workerParameters, settableFutureCreate);
            }
        });
        return settableFutureCreate;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$executeWorkRequest$0(String str, WorkerParameters workerParameters, SettableFuture settableFuture) {
        try {
            ListenableWorker listenableWorkerCreateWorkerWithDefaultFallback = this.mConfiguration.getWorkerFactory().createWorkerWithDefaultFallback(this.mContext, str, workerParameters);
            if (listenableWorkerCreateWorkerWithDefaultFallback == null) {
                String str2 = "Unable to create an instance of " + str;
                Logger.get().error(TAG, str2);
                settableFuture.setException(new IllegalStateException(str2));
                return;
            }
            if (listenableWorkerCreateWorkerWithDefaultFallback instanceof RemoteListenableWorker) {
                settableFuture.setFuture(((RemoteListenableWorker) listenableWorkerCreateWorkerWithDefaultFallback).startRemoteWork());
                return;
            }
            String str3 = str + " does not extend " + RemoteListenableWorker.class.getName();
            Logger.get().error(TAG, str3);
            settableFuture.setException(new IllegalStateException(str3));
        } catch (Throwable th) {
            settableFuture.setException(th);
        }
    }

    @Override // androidx.work.multiprocess.IListenableWorkerImpl
    public void interrupt(byte[] bArr, final IWorkManagerImplCallback iWorkManagerImplCallback) {
        final zfa zfaVarRemove;
        try {
            String string = ((ParcelableWorkerParameters) ParcelConverters.unmarshall(bArr, ParcelableWorkerParameters.CREATOR)).getId().toString();
            Logger.get().debug(TAG, "Interrupting work with id (" + string + ")");
            synchronized (sLock) {
                zfaVarRemove = this.mFutureMap.remove(string);
            }
            if (zfaVarRemove != null) {
                this.mTaskExecutor.getSerialTaskExecutor().execute(new Runnable() { // from class: androidx.work.multiprocess.ListenableWorkerImpl.2
                    @Override // java.lang.Runnable
                    public void run() {
                        zfaVarRemove.cancel(true);
                        ListenableCallback.ListenableCallbackRunnable.reportSuccess(iWorkManagerImplCallback, ListenableWorkerImpl.sEMPTY);
                    }
                });
            } else {
                ListenableCallback.ListenableCallbackRunnable.reportSuccess(iWorkManagerImplCallback, sEMPTY);
            }
        } catch (Throwable th) {
            ListenableCallback.ListenableCallbackRunnable.reportFailure(iWorkManagerImplCallback, th);
        }
    }

    @Override // androidx.work.multiprocess.IListenableWorkerImpl
    public void startWork(byte[] bArr, final IWorkManagerImplCallback iWorkManagerImplCallback) {
        try {
            ParcelableRemoteWorkRequest parcelableRemoteWorkRequest = (ParcelableRemoteWorkRequest) ParcelConverters.unmarshall(bArr, ParcelableRemoteWorkRequest.CREATOR);
            WorkerParameters workerParameters = parcelableRemoteWorkRequest.getParcelableWorkerParameters().toWorkerParameters(this.mConfiguration, this.mTaskExecutor, this.mProgressUpdater, this.mForegroundUpdater);
            final String string = workerParameters.getId().toString();
            String workerClassName = parcelableRemoteWorkRequest.getWorkerClassName();
            Logger.get().debug(TAG, "Executing work request (" + string + ", " + workerClassName + ")");
            final zfa zfaVarExecuteWorkRequest = executeWorkRequest(string, workerClassName, workerParameters);
            zfaVarExecuteWorkRequest.addListener(new Runnable() { // from class: androidx.work.multiprocess.ListenableWorkerImpl.1
                /* JADX WARN: Removed duplicated region for block: B:45:0x006c A[EXC_TOP_SPLITTER, SYNTHETIC] */
                @Override // java.lang.Runnable
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public void run() {
                    try {
                        try {
                            ListenableCallback.ListenableCallbackRunnable.reportSuccess(iWorkManagerImplCallback, ParcelConverters.marshall(new ParcelableResult((ListenableWorker.Result) zfaVarExecuteWorkRequest.get())));
                            synchronized (ListenableWorkerImpl.sLock) {
                                ListenableWorkerImpl.this.mFutureMap.remove(string);
                            }
                        } catch (InterruptedException e) {
                            e = e;
                            ListenableCallback.ListenableCallbackRunnable.reportFailure(iWorkManagerImplCallback, e);
                            synchronized (ListenableWorkerImpl.sLock) {
                                ListenableWorkerImpl.this.mFutureMap.remove(string);
                            }
                        } catch (CancellationException e2) {
                            Logger.get().debug(ListenableWorkerImpl.TAG, "Worker (" + string + ") was cancelled");
                            ListenableCallback.ListenableCallbackRunnable.reportFailure(iWorkManagerImplCallback, e2);
                            synchronized (ListenableWorkerImpl.sLock) {
                                ListenableWorkerImpl.this.mFutureMap.remove(string);
                            }
                        } catch (ExecutionException e3) {
                            e = e3;
                            ListenableCallback.ListenableCallbackRunnable.reportFailure(iWorkManagerImplCallback, e);
                            synchronized (ListenableWorkerImpl.sLock) {
                            }
                        }
                    } catch (Throwable th) {
                        synchronized (ListenableWorkerImpl.sLock) {
                            ListenableWorkerImpl.this.mFutureMap.remove(string);
                            throw th;
                        }
                    }
                }
            }, this.mTaskExecutor.getSerialTaskExecutor());
        } catch (Throwable th) {
            ListenableCallback.ListenableCallbackRunnable.reportFailure(iWorkManagerImplCallback, th);
        }
    }
}
