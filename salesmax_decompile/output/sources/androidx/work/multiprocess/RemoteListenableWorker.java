package androidx.work.multiprocess;

import android.content.ComponentName;
import android.content.Context;
import android.text.TextUtils;
import androidx.work.Data;
import androidx.work.ListenableWorker;
import androidx.work.Logger;
import androidx.work.WorkerParameters;
import androidx.work.impl.WorkManagerImpl;
import androidx.work.impl.model.WorkSpec;
import androidx.work.impl.utils.futures.SettableFuture;
import androidx.work.multiprocess.parcelable.ParcelConverters;
import androidx.work.multiprocess.parcelable.ParcelableRemoteWorkRequest;
import androidx.work.multiprocess.parcelable.ParcelableResult;
import androidx.work.multiprocess.parcelable.ParcelableWorkerParameters;
import p001o.zfa;
import p001o.zl7;

/* loaded from: classes2.dex */
public abstract class RemoteListenableWorker extends ListenableWorker {
    public static final String ARGUMENT_CLASS_NAME = "androidx.work.impl.workers.RemoteListenableWorker.ARGUMENT_CLASS_NAME";
    public static final String ARGUMENT_PACKAGE_NAME = "androidx.work.impl.workers.RemoteListenableWorker.ARGUMENT_PACKAGE_NAME";
    static final String TAG = Logger.tagWithPrefix("RemoteListenableWorker");
    final ListenableWorkerImplClient mClient;
    private ComponentName mComponentName;
    String mWorkerClassName;
    final WorkerParameters mWorkerParameters;

    public RemoteListenableWorker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
        this.mWorkerParameters = workerParameters;
        this.mClient = new ListenableWorkerImplClient(context, getBackgroundExecutor());
    }

    @Override // androidx.work.ListenableWorker
    public void onStopped() {
        super.onStopped();
        ComponentName componentName = this.mComponentName;
        if (componentName != null) {
            this.mClient.execute(componentName, new RemoteDispatcher<IListenableWorkerImpl>() { // from class: androidx.work.multiprocess.RemoteListenableWorker.3
                @Override // androidx.work.multiprocess.RemoteDispatcher
                public void execute(IListenableWorkerImpl iListenableWorkerImpl, IWorkManagerImplCallback iWorkManagerImplCallback) {
                    iListenableWorkerImpl.interrupt(ParcelConverters.marshall(new ParcelableWorkerParameters(RemoteListenableWorker.this.mWorkerParameters)), iWorkManagerImplCallback);
                }
            });
        }
    }

    public abstract zfa startRemoteWork();

    @Override // androidx.work.ListenableWorker
    public final zfa startWork() {
        SettableFuture settableFutureCreate = SettableFuture.create();
        Data inputData = getInputData();
        final String string = this.mWorkerParameters.getId().toString();
        String string2 = inputData.getString(ARGUMENT_PACKAGE_NAME);
        String string3 = inputData.getString(ARGUMENT_CLASS_NAME);
        if (TextUtils.isEmpty(string2)) {
            Logger.get().error(TAG, "Need to specify a package name for the Remote Service.");
            settableFutureCreate.setException(new IllegalArgumentException("Need to specify a package name for the Remote Service."));
            return settableFutureCreate;
        }
        if (TextUtils.isEmpty(string3)) {
            Logger.get().error(TAG, "Need to specify a class name for the Remote Service.");
            settableFutureCreate.setException(new IllegalArgumentException("Need to specify a class name for the Remote Service."));
            return settableFutureCreate;
        }
        this.mComponentName = new ComponentName(string2, string3);
        final WorkManagerImpl workManagerImpl = WorkManagerImpl.getInstance(getApplicationContext());
        return RemoteClientUtils.map(this.mClient.execute(this.mComponentName, new RemoteDispatcher<IListenableWorkerImpl>() { // from class: androidx.work.multiprocess.RemoteListenableWorker.1
            @Override // androidx.work.multiprocess.RemoteDispatcher
            public void execute(IListenableWorkerImpl iListenableWorkerImpl, IWorkManagerImplCallback iWorkManagerImplCallback) {
                WorkSpec workSpec = workManagerImpl.getWorkDatabase().workSpecDao().getWorkSpec(string);
                RemoteListenableWorker.this.mWorkerClassName = workSpec.workerClassName;
                iListenableWorkerImpl.startWork(ParcelConverters.marshall(new ParcelableRemoteWorkRequest(workSpec.workerClassName, RemoteListenableWorker.this.mWorkerParameters)), iWorkManagerImplCallback);
            }
        }), new zl7() { // from class: androidx.work.multiprocess.RemoteListenableWorker.2
            @Override // p001o.zl7
            public ListenableWorker.Result apply(byte[] bArr) {
                ParcelableResult parcelableResult = (ParcelableResult) ParcelConverters.unmarshall(bArr, ParcelableResult.CREATOR);
                Logger.get().debug(RemoteListenableWorker.TAG, "Cleaning up");
                RemoteListenableWorker.this.mClient.unbindService();
                return parcelableResult.getResult();
            }
        }, getBackgroundExecutor());
    }
}
