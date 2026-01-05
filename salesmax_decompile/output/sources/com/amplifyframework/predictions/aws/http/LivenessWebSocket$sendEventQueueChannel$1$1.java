package com.amplifyframework.predictions.aws.http;

import p001o.eee;
import p001o.h84;
import p001o.jg2;
import p001o.jgg;
import p001o.l75;
import p001o.n64;
import p001o.nl7;
import p001o.p69;
import p001o.sg2;
import p001o.uq8;
import p001o.wre;
import p001o.y3i;
import p001o.yg2;

@l75(m36647c = "com.amplifyframework.predictions.aws.http.LivenessWebSocket$sendEventQueueChannel$1$1", m36648f = "LivenessWebSocket.kt", m36649l = {538, 110}, m36650m = "invokeSuspend")
/* loaded from: classes5.dex */
public final class LivenessWebSocket$sendEventQueueChannel$1$1 extends jgg implements nl7 {
    final /* synthetic */ jg2 $this_apply;
    Object L$0;
    Object L$1;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LivenessWebSocket$sendEventQueueChannel$1$1(jg2 jg2Var, n64 n64Var) {
        super(2, n64Var);
        this.$this_apply = jg2Var;
    }

    @Override // p001o.vb1
    public final n64 create(Object obj, n64 n64Var) {
        return new LivenessWebSocket$sendEventQueueChannel$1$1(this.$this_apply, n64Var);
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0047 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0055 A[Catch: all -> 0x0075, TryCatch #0 {all -> 0x0075, blocks: (B:21:0x004d, B:23:0x0055, B:27:0x006c), top: B:37:0x004d }] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x006c A[Catch: all -> 0x0075, TRY_LEAVE, TryCatch #0 {all -> 0x0075, blocks: (B:21:0x004d, B:23:0x0055, B:27:0x006c), top: B:37:0x004d }] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:26:0x0068 -> B:17:0x003b). Please report as a decompilation issue!!! */
    @Override // p001o.vb1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        eee eeeVar;
        sg2 it;
        LivenessWebSocket$sendEventQueueChannel$1$1 livenessWebSocket$sendEventQueueChannel$1$1;
        Object objMo23482a;
        Object objM51918f = uq8.m51918f();
        int i = this.label;
        try {
            if (i == 0) {
                wre.m54934b(obj);
                eeeVar = this.$this_apply;
                it = eeeVar.iterator();
            } else if (i == 1) {
                sg2 sg2Var = (sg2) this.L$1;
                eee eeeVar2 = (eee) this.L$0;
                wre.m54934b(obj);
                eee eeeVar3 = eeeVar2;
                LivenessWebSocket$sendEventQueueChannel$1$1 livenessWebSocket$sendEventQueueChannel$1$12 = this;
                try {
                    if (!((Boolean) obj).booleanValue()) {
                        p69 p69Var = (p69) sg2Var.next();
                        livenessWebSocket$sendEventQueueChannel$1$12.L$0 = eeeVar3;
                        livenessWebSocket$sendEventQueueChannel$1$12.L$1 = sg2Var;
                        livenessWebSocket$sendEventQueueChannel$1$12.label = 2;
                        if (p69Var.d0(livenessWebSocket$sendEventQueueChannel$1$12) == objM51918f) {
                            return objM51918f;
                        }
                        it = sg2Var;
                        livenessWebSocket$sendEventQueueChannel$1$1 = livenessWebSocket$sendEventQueueChannel$1$12;
                        eeeVar = eeeVar3;
                        livenessWebSocket$sendEventQueueChannel$1$1.L$0 = eeeVar;
                        livenessWebSocket$sendEventQueueChannel$1$1.L$1 = it;
                        livenessWebSocket$sendEventQueueChannel$1$1.label = 1;
                        objMo23482a = it.mo23482a(livenessWebSocket$sendEventQueueChannel$1$1);
                        if (objMo23482a != objM51918f) {
                            return objM51918f;
                        }
                        LivenessWebSocket$sendEventQueueChannel$1$1 livenessWebSocket$sendEventQueueChannel$1$13 = livenessWebSocket$sendEventQueueChannel$1$1;
                        sg2Var = it;
                        obj = objMo23482a;
                        eeeVar3 = eeeVar;
                        livenessWebSocket$sendEventQueueChannel$1$12 = livenessWebSocket$sendEventQueueChannel$1$13;
                        if (!((Boolean) obj).booleanValue()) {
                            y3i y3iVar = y3i.f54824a;
                            yg2.m57772a(eeeVar3, null);
                            return y3i.f54824a;
                        }
                    }
                } catch (Throwable th) {
                    th = th;
                    eeeVar = eeeVar3;
                    try {
                        throw th;
                    } catch (Throwable th2) {
                        yg2.m57772a(eeeVar, th);
                        throw th2;
                    }
                }
            } else {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                sg2 sg2Var2 = (sg2) this.L$1;
                eeeVar = (eee) this.L$0;
                wre.m54934b(obj);
                it = sg2Var2;
            }
            livenessWebSocket$sendEventQueueChannel$1$1 = this;
            livenessWebSocket$sendEventQueueChannel$1$1.L$0 = eeeVar;
            livenessWebSocket$sendEventQueueChannel$1$1.L$1 = it;
            livenessWebSocket$sendEventQueueChannel$1$1.label = 1;
            objMo23482a = it.mo23482a(livenessWebSocket$sendEventQueueChannel$1$1);
            if (objMo23482a != objM51918f) {
            }
        } catch (Throwable th3) {
            th = th3;
        }
    }

    @Override // p001o.nl7
    public final Object invoke(h84 h84Var, n64 n64Var) {
        return ((LivenessWebSocket$sendEventQueueChannel$1$1) create(h84Var, n64Var)).invokeSuspend(y3i.f54824a);
    }
}
