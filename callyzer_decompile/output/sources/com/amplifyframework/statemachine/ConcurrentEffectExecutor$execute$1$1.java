package com.amplifyframework.statemachine;

import ex.InterfaceC2141e;
import og.od;
import qw.a0;
import tx.InterfaceC7266z;
import uw.InterfaceC7559c;
import vw.EnumC7794a;
import ww.AbstractC8199i;
import ww.InterfaceC8195e;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
@InterfaceC8195e(m15343c = "com.amplifyframework.statemachine.ConcurrentEffectExecutor$execute$1$1", m15344f = "ConcurrentEffectExecutor.kt", m15345l = {26}, m15346m = "invokeSuspend")
/* loaded from: classes.dex */
public final class ConcurrentEffectExecutor$execute$1$1 extends AbstractC8199i implements InterfaceC2141e {
    final /* synthetic */ Action $action;
    final /* synthetic */ Environment $environment;
    final /* synthetic */ EventDispatcher $eventDispatcher;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ConcurrentEffectExecutor$execute$1$1(Action action, EventDispatcher eventDispatcher, Environment environment, InterfaceC7559c<? super ConcurrentEffectExecutor$execute$1$1> interfaceC7559c) {
        super(2, interfaceC7559c);
        this.$action = action;
        this.$eventDispatcher = eventDispatcher;
        this.$environment = environment;
    }

    @Override // ww.AbstractC8191a
    public final InterfaceC7559c<a0> create(Object obj, InterfaceC7559c<?> interfaceC7559c) {
        return new ConcurrentEffectExecutor$execute$1$1(this.$action, this.$eventDispatcher, this.$environment, interfaceC7559c);
    }

    @Override // ww.AbstractC8191a
    public final Object invokeSuspend(Object obj) {
        EnumC7794a enumC7794a = EnumC7794a.COROUTINE_SUSPENDED;
        int i10 = this.label;
        if (i10 == 0) {
            od.m10798c(obj);
            Action action = this.$action;
            EventDispatcher eventDispatcher = this.$eventDispatcher;
            Environment environment = this.$environment;
            this.label = 1;
            if (action.execute(eventDispatcher, environment, this) == enumC7794a) {
                return enumC7794a;
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            od.m10798c(obj);
        }
        return a0.f30746a;
    }

    @Override // ex.InterfaceC2141e
    public final Object invoke(InterfaceC7266z interfaceC7266z, InterfaceC7559c<? super a0> interfaceC7559c) {
        return ((ConcurrentEffectExecutor$execute$1$1) create(interfaceC7266z, interfaceC7559c)).invokeSuspend(a0.f30746a);
    }
}
