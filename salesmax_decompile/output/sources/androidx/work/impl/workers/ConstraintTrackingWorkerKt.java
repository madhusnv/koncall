package androidx.work.impl.workers;

import androidx.work.ListenableWorker;
import androidx.work.Logger;
import androidx.work.impl.utils.futures.SettableFuture;
import p001o.sq8;

/* loaded from: classes2.dex */
public final class ConstraintTrackingWorkerKt {
    public static final String ARGUMENT_CLASS_NAME = "androidx.work.impl.workers.ConstraintTrackingWorker.ARGUMENT_CLASS_NAME";
    private static final String TAG;

    static {
        String strTagWithPrefix = Logger.tagWithPrefix("ConstraintTrkngWrkr");
        sq8.m48648g(strTagWithPrefix, "tagWithPrefix(\"ConstraintTrkngWrkr\")");
        TAG = strTagWithPrefix;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean setFailed(SettableFuture<ListenableWorker.Result> settableFuture) {
        return settableFuture.set(ListenableWorker.Result.failure());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean setRetry(SettableFuture<ListenableWorker.Result> settableFuture) {
        return settableFuture.set(ListenableWorker.Result.retry());
    }
}
