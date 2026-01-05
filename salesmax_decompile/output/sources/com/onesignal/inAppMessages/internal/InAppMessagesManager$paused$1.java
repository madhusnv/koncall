package com.onesignal.inAppMessages.internal;

import p001o.h84;
import p001o.jgg;
import p001o.l75;
import p001o.n64;
import p001o.nl7;
import p001o.uq8;
import p001o.wre;
import p001o.y3i;

@l75(m36647c = "com.onesignal.inAppMessages.internal.InAppMessagesManager$paused$1", m36648f = "InAppMessagesManager.kt", m36649l = {}, m36650m = "invokeSuspend")
/* loaded from: classes6.dex */
public final class InAppMessagesManager$paused$1 extends jgg implements nl7 {
    int label;
    final /* synthetic */ InAppMessagesManager this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InAppMessagesManager$paused$1(InAppMessagesManager inAppMessagesManager, n64 n64Var) {
        super(2, n64Var);
        this.this$0 = inAppMessagesManager;
    }

    @Override // p001o.vb1
    public final n64 create(Object obj, n64 n64Var) {
        return new InAppMessagesManager$paused$1(this.this$0, n64Var);
    }

    @Override // p001o.vb1
    public final Object invokeSuspend(Object obj) {
        uq8.m51918f();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        wre.m54934b(obj);
        this.this$0._displayer.dismissCurrentInAppMessage();
        return y3i.f54824a;
    }

    @Override // p001o.nl7
    public final Object invoke(h84 h84Var, n64 n64Var) {
        return ((InAppMessagesManager$paused$1) create(h84Var, n64Var)).invokeSuspend(y3i.f54824a);
    }
}
