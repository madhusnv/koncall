package com.onesignal.inAppMessages.internal;

import com.onesignal.common.consistency.IamFetchReadyCondition;
import com.onesignal.common.consistency.RywData;
import com.onesignal.common.consistency.models.IConsistencyManager;
import org.objectweb.asm.Opcodes;
import p001o.cl3;
import p001o.jgg;
import p001o.l75;
import p001o.n64;
import p001o.uq8;
import p001o.wre;
import p001o.xk7;
import p001o.y3i;

@l75(m36647c = "com.onesignal.inAppMessages.internal.InAppMessagesManager$identityModelChangeHandler$1$onModelUpdated$1", m36648f = "InAppMessagesManager.kt", m36649l = {Opcodes.F2I, Opcodes.F2L, Opcodes.D2I}, m36650m = "invokeSuspend")
/* renamed from: com.onesignal.inAppMessages.internal.InAppMessagesManager$identityModelChangeHandler$1$onModelUpdated$1 */
/* loaded from: classes6.dex */
public final class C11639xf589f1e7 extends jgg implements xk7 {
    final /* synthetic */ String $newOneSignalId;
    int label;
    final /* synthetic */ InAppMessagesManager this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C11639xf589f1e7(InAppMessagesManager inAppMessagesManager, String str, n64 n64Var) {
        super(1, n64Var);
        this.this$0 = inAppMessagesManager;
        this.$newOneSignalId = str;
    }

    @Override // p001o.vb1
    public final n64 create(n64 n64Var) {
        return new C11639xf589f1e7(this.this$0, this.$newOneSignalId, n64Var);
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x004d  */
    @Override // p001o.vb1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        RywData rywData;
        Object objM51918f = uq8.m51918f();
        int i = this.label;
        if (i == 0) {
            wre.m54934b(obj);
            IConsistencyManager iConsistencyManager = this.this$0._consistencyManager;
            IamFetchReadyCondition iamFetchReadyCondition = new IamFetchReadyCondition(this.$newOneSignalId);
            this.label = 1;
            obj = iConsistencyManager.getRywDataFromAwaitableCondition(iamFetchReadyCondition, this);
            if (obj == objM51918f) {
                return objM51918f;
            }
        } else {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    wre.m54934b(obj);
                    return y3i.f54824a;
                }
                wre.m54934b(obj);
                rywData = (RywData) obj;
                if (rywData != null) {
                    InAppMessagesManager inAppMessagesManager = this.this$0;
                    this.label = 3;
                    if (inAppMessagesManager.fetchMessages(rywData, this) == objM51918f) {
                        return objM51918f;
                    }
                }
                return y3i.f54824a;
            }
            wre.m54934b(obj);
        }
        this.label = 2;
        obj = ((cl3) obj).mo21334s(this);
        if (obj == objM51918f) {
            return objM51918f;
        }
        rywData = (RywData) obj;
        if (rywData != null) {
        }
        return y3i.f54824a;
    }

    @Override // p001o.xk7
    public final Object invoke(n64 n64Var) {
        return ((C11639xf589f1e7) create(n64Var)).invokeSuspend(y3i.f54824a);
    }
}
