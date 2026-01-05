package com.onesignal.core.internal.operations;

import p001o.n64;
import p001o.ob9;

/* loaded from: classes6.dex */
public interface IOperationRepo {

    public static final class DefaultImpls {
        public static /* synthetic */ void enqueue$default(IOperationRepo iOperationRepo, Operation operation, boolean z, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: enqueue");
            }
            if ((i & 2) != 0) {
                z = false;
            }
            iOperationRepo.enqueue(operation, z);
        }

        public static /* synthetic */ Object enqueueAndWait$default(IOperationRepo iOperationRepo, Operation operation, boolean z, n64 n64Var, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: enqueueAndWait");
            }
            if ((i & 2) != 0) {
                z = false;
            }
            return iOperationRepo.enqueueAndWait(operation, z, n64Var);
        }
    }

    Object awaitInitialized(n64 n64Var);

    <T extends Operation> boolean containsInstanceOf(ob9 ob9Var);

    void enqueue(Operation operation, boolean z);

    Object enqueueAndWait(Operation operation, boolean z, n64 n64Var);

    void forceExecuteOperations();
}
