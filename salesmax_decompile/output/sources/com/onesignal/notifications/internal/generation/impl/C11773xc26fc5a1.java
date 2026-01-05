package com.onesignal.notifications.internal.generation.impl;

import com.onesignal.notifications.internal.generation.impl.NotificationGenerationWorkManager;
import org.objectweb.asm.Opcodes;
import p001o.l75;
import p001o.n64;
import p001o.o64;

@l75(m36647c = "com.onesignal.notifications.internal.generation.impl.NotificationGenerationWorkManager$NotificationGenerationWorker", m36648f = "NotificationGenerationWorkManager.kt", m36649l = {Opcodes.FASTORE}, m36650m = "doWork")
/* renamed from: com.onesignal.notifications.internal.generation.impl.NotificationGenerationWorkManager$NotificationGenerationWorker$doWork$1 */
/* loaded from: classes6.dex */
public final class C11773xc26fc5a1 extends o64 {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ NotificationGenerationWorkManager.NotificationGenerationWorker this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C11773xc26fc5a1(NotificationGenerationWorkManager.NotificationGenerationWorker notificationGenerationWorker, n64 n64Var) {
        super(n64Var);
        this.this$0 = notificationGenerationWorker;
    }

    @Override // p001o.vb1
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.doWork(this);
    }
}
