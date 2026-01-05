package com.amplifyframework.predictions.aws.service;

import com.amplifyframework.core.Consumer;
import org.objectweb.asm.Opcodes;
import p001o.h84;
import p001o.jgg;
import p001o.l75;
import p001o.n64;
import p001o.nl7;
import p001o.uq8;
import p001o.wre;
import p001o.xk7;
import p001o.y3i;

@l75(m36647c = "com.amplifyframework.predictions.aws.service.AWSTranslateService$execute$1$1", m36648f = "AWSTranslateService.kt", m36649l = {Opcodes.DUP2_X1}, m36650m = "invokeSuspend")
/* loaded from: classes5.dex */
public final class AWSTranslateService$execute$1$1 extends jgg implements nl7 {
    final /* synthetic */ Consumer<T> $onResult;
    final /* synthetic */ xk7 $runnableTask;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AWSTranslateService$execute$1$1(xk7 xk7Var, Consumer<T> consumer, n64 n64Var) {
        super(2, n64Var);
        this.$runnableTask = xk7Var;
        this.$onResult = consumer;
    }

    @Override // p001o.vb1
    public final n64 create(Object obj, n64 n64Var) {
        return new AWSTranslateService$execute$1$1(this.$runnableTask, this.$onResult, n64Var);
    }

    @Override // p001o.vb1
    public final Object invokeSuspend(Object obj) {
        Object objM51918f = uq8.m51918f();
        int i = this.label;
        if (i == 0) {
            wre.m54934b(obj);
            xk7 xk7Var = this.$runnableTask;
            this.label = 1;
            obj = xk7Var.invoke(this);
            if (obj == objM51918f) {
                return objM51918f;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            wre.m54934b(obj);
        }
        this.$onResult.accept(obj);
        return y3i.f54824a;
    }

    @Override // p001o.nl7
    public final Object invoke(h84 h84Var, n64 n64Var) {
        return ((AWSTranslateService$execute$1$1) create(h84Var, n64Var)).invokeSuspend(y3i.f54824a);
    }
}
