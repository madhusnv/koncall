package com.onesignal.location.internal.controller.impl;

import com.onesignal.location.internal.controller.impl.GmsLocationController;
import p001o.jgg;
import p001o.l75;
import p001o.n64;
import p001o.uq8;
import p001o.wre;
import p001o.xk7;
import p001o.y3i;

@l75(m36647c = "com.onesignal.location.internal.controller.impl.GmsLocationController$GoogleApiClientListener$onConnectionFailed$1", m36648f = "GmsLocationController.kt", m36649l = {156}, m36650m = "invokeSuspend")
/* renamed from: com.onesignal.location.internal.controller.impl.GmsLocationController$GoogleApiClientListener$onConnectionFailed$1 */
/* loaded from: classes6.dex */
public final class C11711xebb61691 extends jgg implements xk7 {
    int label;
    final /* synthetic */ GmsLocationController.GoogleApiClientListener this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C11711xebb61691(GmsLocationController.GoogleApiClientListener googleApiClientListener, n64 n64Var) {
        super(1, n64Var);
        this.this$0 = googleApiClientListener;
    }

    @Override // p001o.vb1
    public final n64 create(n64 n64Var) {
        return new C11711xebb61691(this.this$0, n64Var);
    }

    @Override // p001o.vb1
    public final Object invokeSuspend(Object obj) {
        Object objM51918f = uq8.m51918f();
        int i = this.label;
        if (i == 0) {
            wre.m54934b(obj);
            GmsLocationController gmsLocationController = this.this$0._parent;
            this.label = 1;
            if (gmsLocationController.stop(this) == objM51918f) {
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
        return ((C11711xebb61691) create(n64Var)).invokeSuspend(y3i.f54824a);
    }
}
