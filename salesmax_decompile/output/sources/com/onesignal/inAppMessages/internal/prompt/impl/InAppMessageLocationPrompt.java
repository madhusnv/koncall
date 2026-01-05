package com.onesignal.inAppMessages.internal.prompt.impl;

import com.onesignal.inAppMessages.internal.prompt.impl.InAppMessagePrompt;
import com.onesignal.location.ILocationManager;
import p001o.l75;
import p001o.n64;
import p001o.o64;
import p001o.sq8;
import p001o.szb;
import p001o.uq8;
import p001o.wre;

/* loaded from: classes6.dex */
public final class InAppMessageLocationPrompt extends InAppMessagePrompt {
    private final ILocationManager _locationManager;

    @l75(m36647c = "com.onesignal.inAppMessages.internal.prompt.impl.InAppMessageLocationPrompt", m36648f = "InAppMessageLocationPrompt.kt", m36649l = {10}, m36650m = "handlePrompt")
    /* renamed from: com.onesignal.inAppMessages.internal.prompt.impl.InAppMessageLocationPrompt$handlePrompt$1 */
    public static final class C116941 extends o64 {
        int label;
        /* synthetic */ Object result;

        public C116941(n64 n64Var) {
            super(n64Var);
        }

        @Override // p001o.vb1
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return InAppMessageLocationPrompt.this.handlePrompt(this);
        }
    }

    public InAppMessageLocationPrompt(ILocationManager iLocationManager) {
        sq8.m48649h(iLocationManager, "_locationManager");
        this._locationManager = iLocationManager;
    }

    @Override // com.onesignal.inAppMessages.internal.prompt.impl.InAppMessagePrompt
    public String getPromptKey() {
        return "location";
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // com.onesignal.inAppMessages.internal.prompt.impl.InAppMessagePrompt
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object handlePrompt(n64 n64Var) {
        C116941 c116941;
        if (n64Var instanceof C116941) {
            c116941 = (C116941) n64Var;
            int i = c116941.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c116941.label = i - Integer.MIN_VALUE;
            } else {
                c116941 = new C116941(n64Var);
            }
        }
        Object objRequestPermission = c116941.result;
        Object objM51918f = uq8.m51918f();
        int i2 = c116941.label;
        if (i2 == 0) {
            wre.m54934b(objRequestPermission);
            ILocationManager iLocationManager = this._locationManager;
            c116941.label = 1;
            objRequestPermission = iLocationManager.requestPermission(c116941);
            if (objRequestPermission == objM51918f) {
                return objM51918f;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            wre.m54934b(objRequestPermission);
        }
        boolean zBooleanValue = ((Boolean) objRequestPermission).booleanValue();
        if (zBooleanValue) {
            return InAppMessagePrompt.PromptActionResult.PERMISSION_GRANTED;
        }
        if (zBooleanValue) {
            throw new szb();
        }
        return InAppMessagePrompt.PromptActionResult.PERMISSION_DENIED;
    }
}
