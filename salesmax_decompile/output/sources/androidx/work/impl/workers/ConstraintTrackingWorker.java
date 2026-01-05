package androidx.work.impl.workers;

import android.content.Context;
import androidx.work.ListenableWorker;
import androidx.work.Logger;
import androidx.work.WorkerParameters;
import androidx.work.impl.WorkManagerImpl;
import androidx.work.impl.constraints.WorkConstraintsCallback;
import androidx.work.impl.constraints.WorkConstraintsTrackerImpl;
import androidx.work.impl.constraints.trackers.Trackers;
import androidx.work.impl.model.WorkSpec;
import androidx.work.impl.model.WorkSpecDao;
import androidx.work.impl.utils.futures.SettableFuture;
import androidx.work.impl.workers.ConstraintTrackingWorker;
import java.util.List;
import p001o.bh3;
import p001o.sq8;
import p001o.y3i;
import p001o.zfa;

/* loaded from: classes2.dex */
public final class ConstraintTrackingWorker extends ListenableWorker implements WorkConstraintsCallback {
    private volatile boolean areConstraintsUnmet;
    private ListenableWorker delegate;
    private final SettableFuture<ListenableWorker.Result> future;
    private final Object lock;
    private final WorkerParameters workerParameters;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ConstraintTrackingWorker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
        sq8.m48649h(context, "appContext");
        sq8.m48649h(workerParameters, "workerParameters");
        this.workerParameters = workerParameters;
        this.lock = new Object();
        this.future = SettableFuture.create();
    }

    private final void setupAndRunConstraintTrackingWork() {
        if (this.future.isCancelled()) {
            return;
        }
        String string = getInputData().getString(ConstraintTrackingWorkerKt.ARGUMENT_CLASS_NAME);
        Logger logger = Logger.get();
        sq8.m48648g(logger, "get()");
        if (string == null || string.length() == 0) {
            logger.error(ConstraintTrackingWorkerKt.TAG, "No worker to delegate to.");
            SettableFuture<ListenableWorker.Result> settableFuture = this.future;
            sq8.m48648g(settableFuture, "future");
            ConstraintTrackingWorkerKt.setFailed(settableFuture);
            return;
        }
        ListenableWorker listenableWorkerCreateWorkerWithDefaultFallback = getWorkerFactory().createWorkerWithDefaultFallback(getApplicationContext(), string, this.workerParameters);
        this.delegate = listenableWorkerCreateWorkerWithDefaultFallback;
        if (listenableWorkerCreateWorkerWithDefaultFallback == null) {
            logger.debug(ConstraintTrackingWorkerKt.TAG, "No worker to delegate to.");
            SettableFuture<ListenableWorker.Result> settableFuture2 = this.future;
            sq8.m48648g(settableFuture2, "future");
            ConstraintTrackingWorkerKt.setFailed(settableFuture2);
            return;
        }
        WorkManagerImpl workManagerImpl = WorkManagerImpl.getInstance(getApplicationContext());
        sq8.m48648g(workManagerImpl, "getInstance(applicationContext)");
        WorkSpecDao workSpecDao = workManagerImpl.getWorkDatabase().workSpecDao();
        String string2 = getId().toString();
        sq8.m48648g(string2, "id.toString()");
        WorkSpec workSpec = workSpecDao.getWorkSpec(string2);
        if (workSpec == null) {
            SettableFuture<ListenableWorker.Result> settableFuture3 = this.future;
            sq8.m48648g(settableFuture3, "future");
            ConstraintTrackingWorkerKt.setFailed(settableFuture3);
            return;
        }
        Trackers trackers = workManagerImpl.getTrackers();
        sq8.m48648g(trackers, "workManagerImpl.trackers");
        WorkConstraintsTrackerImpl workConstraintsTrackerImpl = new WorkConstraintsTrackerImpl(trackers, this);
        workConstraintsTrackerImpl.replace(bh3.m18963e(workSpec));
        String string3 = getId().toString();
        sq8.m48648g(string3, "id.toString()");
        if (!workConstraintsTrackerImpl.areAllConstraintsMet(string3)) {
            logger.debug(ConstraintTrackingWorkerKt.TAG, "Constraints not met for delegate " + string + ". Requesting retry.");
            SettableFuture<ListenableWorker.Result> settableFuture4 = this.future;
            sq8.m48648g(settableFuture4, "future");
            ConstraintTrackingWorkerKt.setRetry(settableFuture4);
            return;
        }
        logger.debug(ConstraintTrackingWorkerKt.TAG, "Constraints met for delegate " + string);
        try {
            ListenableWorker listenableWorker = this.delegate;
            sq8.m48646e(listenableWorker);
            final zfa zfaVarStartWork = listenableWorker.startWork();
            sq8.m48648g(zfaVarStartWork, "delegate!!.startWork()");
            zfaVarStartWork.addListener(new Runnable() { // from class: o.yt3
                @Override // java.lang.Runnable
                public final void run() {
                    ConstraintTrackingWorker.setupAndRunConstraintTrackingWork$lambda$2(this.f55907a, zfaVarStartWork);
                }
            }, getBackgroundExecutor());
        } catch (Throwable th) {
            logger.debug(ConstraintTrackingWorkerKt.TAG, "Delegated worker " + string + " threw exception in startWork.", th);
            synchronized (this.lock) {
                if (!this.areConstraintsUnmet) {
                    SettableFuture<ListenableWorker.Result> settableFuture5 = this.future;
                    sq8.m48648g(settableFuture5, "future");
                    ConstraintTrackingWorkerKt.setFailed(settableFuture5);
                } else {
                    logger.debug(ConstraintTrackingWorkerKt.TAG, "Constraints were unmet, Retrying.");
                    SettableFuture<ListenableWorker.Result> settableFuture6 = this.future;
                    sq8.m48648g(settableFuture6, "future");
                    ConstraintTrackingWorkerKt.setRetry(settableFuture6);
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setupAndRunConstraintTrackingWork$lambda$2(ConstraintTrackingWorker constraintTrackingWorker, zfa zfaVar) {
        sq8.m48649h(constraintTrackingWorker, "this$0");
        sq8.m48649h(zfaVar, "$innerFuture");
        synchronized (constraintTrackingWorker.lock) {
            if (constraintTrackingWorker.areConstraintsUnmet) {
                SettableFuture<ListenableWorker.Result> settableFuture = constraintTrackingWorker.future;
                sq8.m48648g(settableFuture, "future");
                ConstraintTrackingWorkerKt.setRetry(settableFuture);
            } else {
                constraintTrackingWorker.future.setFuture(zfaVar);
            }
            y3i y3iVar = y3i.f54824a;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void startWork$lambda$0(ConstraintTrackingWorker constraintTrackingWorker) {
        sq8.m48649h(constraintTrackingWorker, "this$0");
        constraintTrackingWorker.setupAndRunConstraintTrackingWork();
    }

    public final ListenableWorker getDelegate() {
        return this.delegate;
    }

    @Override // androidx.work.impl.constraints.WorkConstraintsCallback
    public void onAllConstraintsMet(List<WorkSpec> list) {
        sq8.m48649h(list, "workSpecs");
    }

    @Override // androidx.work.impl.constraints.WorkConstraintsCallback
    public void onAllConstraintsNotMet(List<WorkSpec> list) {
        sq8.m48649h(list, "workSpecs");
        Logger.get().debug(ConstraintTrackingWorkerKt.TAG, "Constraints changed for " + list);
        synchronized (this.lock) {
            this.areConstraintsUnmet = true;
            y3i y3iVar = y3i.f54824a;
        }
    }

    @Override // androidx.work.ListenableWorker
    public void onStopped() {
        super.onStopped();
        ListenableWorker listenableWorker = this.delegate;
        if (listenableWorker == null || listenableWorker.isStopped()) {
            return;
        }
        listenableWorker.stop();
    }

    @Override // androidx.work.ListenableWorker
    public zfa startWork() {
        getBackgroundExecutor().execute(new Runnable() { // from class: o.xt3
            @Override // java.lang.Runnable
            public final void run() {
                ConstraintTrackingWorker.startWork$lambda$0(this.f54249a);
            }
        });
        SettableFuture<ListenableWorker.Result> settableFuture = this.future;
        sq8.m48648g(settableFuture, "future");
        return settableFuture;
    }
}
