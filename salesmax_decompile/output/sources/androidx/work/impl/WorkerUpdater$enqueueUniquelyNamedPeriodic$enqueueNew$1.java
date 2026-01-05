package androidx.work.impl;

import androidx.work.ExistingWorkPolicy;
import androidx.work.WorkRequest;
import androidx.work.impl.utils.EnqueueRunnable;
import p001o.bh3;
import p001o.kf9;
import p001o.uk7;
import p001o.y3i;

/* loaded from: classes2.dex */
public final class WorkerUpdater$enqueueUniquelyNamedPeriodic$enqueueNew$1 extends kf9 implements uk7 {
    final /* synthetic */ String $name;
    final /* synthetic */ OperationImpl $operation;
    final /* synthetic */ WorkManagerImpl $this_enqueueUniquelyNamedPeriodic;
    final /* synthetic */ WorkRequest $workRequest;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WorkerUpdater$enqueueUniquelyNamedPeriodic$enqueueNew$1(WorkRequest workRequest, WorkManagerImpl workManagerImpl, String str, OperationImpl operationImpl) {
        super(0);
        this.$workRequest = workRequest;
        this.$this_enqueueUniquelyNamedPeriodic = workManagerImpl;
        this.$name = str;
        this.$operation = operationImpl;
    }

    @Override // p001o.uk7
    public /* bridge */ /* synthetic */ Object invoke() {
        m68705invoke();
        return y3i.f54824a;
    }

    /* renamed from: invoke, reason: collision with other method in class */
    public final void m68705invoke() {
        new EnqueueRunnable(new WorkContinuationImpl(this.$this_enqueueUniquelyNamedPeriodic, this.$name, ExistingWorkPolicy.KEEP, bh3.m18963e(this.$workRequest)), this.$operation).run();
    }
}
