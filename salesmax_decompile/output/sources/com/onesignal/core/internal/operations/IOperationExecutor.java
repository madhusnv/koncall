package com.onesignal.core.internal.operations;

import java.util.List;
import p001o.n64;

/* loaded from: classes6.dex */
public interface IOperationExecutor {
    Object execute(List<? extends Operation> list, n64 n64Var);

    List<String> getOperations();
}
