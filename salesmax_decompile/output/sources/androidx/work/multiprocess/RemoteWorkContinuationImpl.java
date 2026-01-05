package androidx.work.multiprocess;

import android.annotation.SuppressLint;
import androidx.work.OneTimeWorkRequest;
import androidx.work.WorkContinuation;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p001o.zfa;

/* loaded from: classes2.dex */
public class RemoteWorkContinuationImpl extends RemoteWorkContinuation {
    private final RemoteWorkManagerClient mClient;
    private final WorkContinuation mContinuation;

    public RemoteWorkContinuationImpl(RemoteWorkManagerClient remoteWorkManagerClient, WorkContinuation workContinuation) {
        this.mClient = remoteWorkManagerClient;
        this.mContinuation = workContinuation;
    }

    @Override // androidx.work.multiprocess.RemoteWorkContinuation
    @SuppressLint({"EnqueueWork"})
    public RemoteWorkContinuation combineInternal(List<RemoteWorkContinuation> list) {
        ArrayList arrayList = new ArrayList(list.size());
        Iterator<RemoteWorkContinuation> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(((RemoteWorkContinuationImpl) it.next()).mContinuation);
        }
        return new RemoteWorkContinuationImpl(this.mClient, WorkContinuation.combine(arrayList));
    }

    @Override // androidx.work.multiprocess.RemoteWorkContinuation
    public zfa enqueue() {
        return this.mClient.enqueue(this.mContinuation);
    }

    @Override // androidx.work.multiprocess.RemoteWorkContinuation
    @SuppressLint({"EnqueueWork"})
    public RemoteWorkContinuation then(List<OneTimeWorkRequest> list) {
        return new RemoteWorkContinuationImpl(this.mClient, this.mContinuation.then(list));
    }
}
