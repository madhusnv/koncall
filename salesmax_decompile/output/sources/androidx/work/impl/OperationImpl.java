package androidx.work.impl;

import androidx.lifecycle.AbstractC2145n;
import androidx.work.Operation;
import androidx.work.impl.utils.futures.SettableFuture;
import p001o.hpb;
import p001o.zfa;

/* loaded from: classes2.dex */
public class OperationImpl implements Operation {
    private final hpb mOperationState = new hpb();
    private final SettableFuture<Operation.State.SUCCESS> mOperationFuture = SettableFuture.create();

    public OperationImpl() {
        markState(Operation.IN_PROGRESS);
    }

    @Override // androidx.work.Operation
    public zfa getResult() {
        return this.mOperationFuture;
    }

    @Override // androidx.work.Operation
    public AbstractC2145n getState() {
        return this.mOperationState;
    }

    public void markState(Operation.State state) {
        this.mOperationState.postValue(state);
        if (state instanceof Operation.State.SUCCESS) {
            this.mOperationFuture.set((Operation.State.SUCCESS) state);
        } else if (state instanceof Operation.State.FAILURE) {
            this.mOperationFuture.setException(((Operation.State.FAILURE) state).getThrowable());
        }
    }
}
