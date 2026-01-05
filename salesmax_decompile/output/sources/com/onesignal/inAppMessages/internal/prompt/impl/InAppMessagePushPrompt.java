package com.onesignal.inAppMessages.internal.prompt.impl;

import com.onesignal.inAppMessages.internal.prompt.InAppMessagePromptTypes;
import com.onesignal.inAppMessages.internal.prompt.impl.InAppMessagePrompt;
import com.onesignal.notifications.INotificationsManager;
import p001o.l75;
import p001o.n64;
import p001o.o64;
import p001o.sq8;
import p001o.uq8;
import p001o.wre;

/* loaded from: classes6.dex */
public final class InAppMessagePushPrompt extends InAppMessagePrompt {
    private final INotificationsManager _notificationsManager;

    @l75(m36647c = "com.onesignal.inAppMessages.internal.prompt.impl.InAppMessagePushPrompt", m36648f = "InAppMessagePushPrompt.kt", m36649l = {10}, m36650m = "handlePrompt")
    /* renamed from: com.onesignal.inAppMessages.internal.prompt.impl.InAppMessagePushPrompt$handlePrompt$1 */
    public static final class C116951 extends o64 {
        int label;
        /* synthetic */ Object result;

        public C116951(n64 n64Var) {
            super(n64Var);
        }

        @Override // p001o.vb1
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return InAppMessagePushPrompt.this.handlePrompt(this);
        }
    }

    public InAppMessagePushPrompt(INotificationsManager iNotificationsManager) {
        sq8.m48649h(iNotificationsManager, "_notificationsManager");
        this._notificationsManager = iNotificationsManager;
    }

    @Override // com.onesignal.inAppMessages.internal.prompt.impl.InAppMessagePrompt
    public String getPromptKey() {
        return InAppMessagePromptTypes.PUSH_PROMPT_KEY;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // com.onesignal.inAppMessages.internal.prompt.impl.InAppMessagePrompt
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object handlePrompt(n64 n64Var) {
        C116951 c116951;
        if (n64Var instanceof C116951) {
            c116951 = (C116951) n64Var;
            int i = c116951.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c116951.label = i - Integer.MIN_VALUE;
            } else {
                c116951 = new C116951(n64Var);
            }
        }
        Object objRequestPermission = c116951.result;
        Object objM51918f = uq8.m51918f();
        int i2 = c116951.label;
        if (i2 == 0) {
            wre.m54934b(objRequestPermission);
            INotificationsManager iNotificationsManager = this._notificationsManager;
            c116951.label = 1;
            objRequestPermission = iNotificationsManager.requestPermission(true, c116951);
            if (objRequestPermission == objM51918f) {
                return objM51918f;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            wre.m54934b(objRequestPermission);
        }
        return ((Boolean) objRequestPermission).booleanValue() ? InAppMessagePrompt.PromptActionResult.PERMISSION_GRANTED : InAppMessagePrompt.PromptActionResult.PERMISSION_DENIED;
    }
}
