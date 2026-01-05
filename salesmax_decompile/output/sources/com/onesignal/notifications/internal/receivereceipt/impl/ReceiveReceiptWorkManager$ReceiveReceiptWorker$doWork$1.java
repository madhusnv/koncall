package com.onesignal.notifications.internal.receivereceipt.impl;

import com.onesignal.notifications.internal.receivereceipt.impl.ReceiveReceiptWorkManager;
import org.objectweb.asm.Opcodes;
import p001o.l75;
import p001o.n64;
import p001o.o64;

@l75(m36647c = "com.onesignal.notifications.internal.receivereceipt.impl.ReceiveReceiptWorkManager$ReceiveReceiptWorker", m36648f = "ReceiveReceiptWorkManager.kt", m36649l = {Opcodes.CASTORE}, m36650m = "doWork")
/* loaded from: classes6.dex */
public final class ReceiveReceiptWorkManager$ReceiveReceiptWorker$doWork$1 extends o64 {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ ReceiveReceiptWorkManager.ReceiveReceiptWorker this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ReceiveReceiptWorkManager$ReceiveReceiptWorker$doWork$1(ReceiveReceiptWorkManager.ReceiveReceiptWorker receiveReceiptWorker, n64 n64Var) {
        super(n64Var);
        this.this$0 = receiveReceiptWorker;
    }

    @Override // p001o.vb1
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.doWork(this);
    }
}
