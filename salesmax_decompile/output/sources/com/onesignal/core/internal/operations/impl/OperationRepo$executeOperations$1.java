package com.onesignal.core.internal.operations.impl;

import p001o.l75;
import p001o.n64;
import p001o.o64;

@l75(m36647c = "com.onesignal.core.internal.operations.impl.OperationRepo", m36648f = "OperationRepo.kt", m36649l = {242, 318, 320}, m36650m = "executeOperations$com_onesignal_core")
/* loaded from: classes6.dex */
public final class OperationRepo$executeOperations$1 extends o64 {
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ OperationRepo this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OperationRepo$executeOperations$1(OperationRepo operationRepo, n64 n64Var) {
        super(n64Var);
        this.this$0 = operationRepo;
    }

    @Override // p001o.vb1
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.executeOperations$com_onesignal_core(null, this);
    }
}
