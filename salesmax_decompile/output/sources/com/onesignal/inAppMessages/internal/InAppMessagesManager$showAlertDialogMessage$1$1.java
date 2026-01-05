package com.onesignal.inAppMessages.internal;

import com.onesignal.inAppMessages.internal.prompt.impl.InAppMessagePrompt;
import java.util.List;
import p001o.jgg;
import p001o.l75;
import p001o.n64;
import p001o.uq8;
import p001o.wre;
import p001o.xk7;
import p001o.y3i;

@l75(m36647c = "com.onesignal.inAppMessages.internal.InAppMessagesManager$showAlertDialogMessage$1$1", m36648f = "InAppMessagesManager.kt", m36649l = {954}, m36650m = "invokeSuspend")
/* loaded from: classes6.dex */
public final class InAppMessagesManager$showAlertDialogMessage$1$1 extends jgg implements xk7 {
    final /* synthetic */ InAppMessage $inAppMessage;
    final /* synthetic */ List<InAppMessagePrompt> $prompts;
    int label;
    final /* synthetic */ InAppMessagesManager this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public InAppMessagesManager$showAlertDialogMessage$1$1(InAppMessagesManager inAppMessagesManager, InAppMessage inAppMessage, List<? extends InAppMessagePrompt> list, n64 n64Var) {
        super(1, n64Var);
        this.this$0 = inAppMessagesManager;
        this.$inAppMessage = inAppMessage;
        this.$prompts = list;
    }

    @Override // p001o.vb1
    public final n64 create(n64 n64Var) {
        return new InAppMessagesManager$showAlertDialogMessage$1$1(this.this$0, this.$inAppMessage, this.$prompts, n64Var);
    }

    @Override // p001o.vb1
    public final Object invokeSuspend(Object obj) {
        Object objM51918f = uq8.m51918f();
        int i = this.label;
        if (i == 0) {
            wre.m54934b(obj);
            InAppMessagesManager inAppMessagesManager = this.this$0;
            InAppMessage inAppMessage = this.$inAppMessage;
            List<InAppMessagePrompt> list = this.$prompts;
            this.label = 1;
            if (inAppMessagesManager.showMultiplePrompts(inAppMessage, list, this) == objM51918f) {
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
        return ((InAppMessagesManager$showAlertDialogMessage$1$1) create(n64Var)).invokeSuspend(y3i.f54824a);
    }
}
