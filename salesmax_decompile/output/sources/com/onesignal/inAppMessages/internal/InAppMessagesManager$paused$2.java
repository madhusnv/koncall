package com.onesignal.inAppMessages.internal;

import org.objectweb.asm.Opcodes;
import p001o.jgg;
import p001o.l75;
import p001o.n64;
import p001o.uq8;
import p001o.wre;
import p001o.xk7;
import p001o.y3i;

@l75(m36647c = "com.onesignal.inAppMessages.internal.InAppMessagesManager$paused$2", m36648f = "InAppMessagesManager.kt", m36649l = {Opcodes.IF_ACMPEQ}, m36650m = "invokeSuspend")
/* loaded from: classes6.dex */
public final class InAppMessagesManager$paused$2 extends jgg implements xk7 {
    int label;
    final /* synthetic */ InAppMessagesManager this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InAppMessagesManager$paused$2(InAppMessagesManager inAppMessagesManager, n64 n64Var) {
        super(1, n64Var);
        this.this$0 = inAppMessagesManager;
    }

    @Override // p001o.vb1
    public final n64 create(n64 n64Var) {
        return new InAppMessagesManager$paused$2(this.this$0, n64Var);
    }

    @Override // p001o.vb1
    public final Object invokeSuspend(Object obj) {
        Object objM51918f = uq8.m51918f();
        int i = this.label;
        if (i == 0) {
            wre.m54934b(obj);
            InAppMessagesManager inAppMessagesManager = this.this$0;
            this.label = 1;
            if (inAppMessagesManager.evaluateInAppMessages(this) == objM51918f) {
                return objM51918f;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            wre.m54934b(obj);
        }
        return y3i.f54824a;
    }

    @Override // p001o.xk7
    public final Object invoke(n64 n64Var) {
        return ((InAppMessagesManager$paused$2) create(n64Var)).invokeSuspend(y3i.f54824a);
    }
}
