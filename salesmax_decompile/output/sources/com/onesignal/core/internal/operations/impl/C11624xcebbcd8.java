package com.onesignal.core.internal.operations.impl;

import com.onesignal.common.threading.WaiterWithValue;
import p001o.gge;
import p001o.h84;
import p001o.jgg;
import p001o.l75;
import p001o.n64;
import p001o.nl7;
import p001o.uq8;
import p001o.wre;
import p001o.y3i;

@l75(m36647c = "com.onesignal.core.internal.operations.impl.OperationRepo$waitForNewOperationAndExecutionInterval$waitedTheFullTime$1", m36648f = "OperationRepo.kt", m36649l = {227}, m36650m = "invokeSuspend")
/* renamed from: com.onesignal.core.internal.operations.impl.OperationRepo$waitForNewOperationAndExecutionInterval$waitedTheFullTime$1 */
/* loaded from: classes6.dex */
public final class C11624xcebbcd8 extends jgg implements nl7 {
    final /* synthetic */ gge $wakeMessage;
    Object L$0;
    int label;
    final /* synthetic */ OperationRepo this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C11624xcebbcd8(gge ggeVar, OperationRepo operationRepo, n64 n64Var) {
        super(2, n64Var);
        this.$wakeMessage = ggeVar;
        this.this$0 = operationRepo;
    }

    @Override // p001o.vb1
    public final n64 create(Object obj, n64 n64Var) {
        return new C11624xcebbcd8(this.$wakeMessage, this.this$0, n64Var);
    }

    @Override // p001o.vb1
    public final Object invokeSuspend(Object obj) {
        gge ggeVar;
        Object objM51918f = uq8.m51918f();
        int i = this.label;
        if (i == 0) {
            wre.m54934b(obj);
            gge ggeVar2 = this.$wakeMessage;
            WaiterWithValue waiterWithValue = this.this$0.waiter;
            this.L$0 = ggeVar2;
            this.label = 1;
            Object objWaitForWake = waiterWithValue.waitForWake(this);
            if (objWaitForWake == objM51918f) {
                return objM51918f;
            }
            ggeVar = ggeVar2;
            obj = objWaitForWake;
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ggeVar = (gge) this.L$0;
            wre.m54934b(obj);
        }
        ggeVar.f25106a = obj;
        return y3i.f54824a;
    }

    @Override // p001o.nl7
    public final Object invoke(h84 h84Var, n64 n64Var) {
        return ((C11624xcebbcd8) create(h84Var, n64Var)).invokeSuspend(y3i.f54824a);
    }
}
