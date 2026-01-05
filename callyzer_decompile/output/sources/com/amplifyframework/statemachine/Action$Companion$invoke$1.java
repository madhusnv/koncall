package com.amplifyframework.statemachine;

import ex.InterfaceC2142f;
import qw.a0;
import uw.InterfaceC7559c;
import vw.EnumC7794a;
import ww.AbstractC8193c;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class Action$Companion$invoke$1 implements Action {
    final /* synthetic */ InterfaceC2142f $block;

    /* renamed from: id, reason: collision with root package name */
    private final String f43780id;

    public Action$Companion$invoke$1(String str, InterfaceC2142f interfaceC2142f) {
        this.$block = interfaceC2142f;
        this.f43780id = str == null ? super.getId() : str;
    }

    @Override // com.amplifyframework.statemachine.Action
    public Object execute(EventDispatcher eventDispatcher, Environment environment, InterfaceC7559c<? super a0> interfaceC7559c) {
        Object objInvoke = this.$block.invoke(eventDispatcher, environment, interfaceC7559c);
        return objInvoke == EnumC7794a.COROUTINE_SUSPENDED ? objInvoke : a0.f30746a;
    }

    public Object execute$$forInline(EventDispatcher eventDispatcher, Environment environment, final InterfaceC7559c<? super a0> interfaceC7559c) {
        new AbstractC8193c(interfaceC7559c) { // from class: com.amplifyframework.statemachine.Action$Companion$invoke$1$execute$1
            int label;
            /* synthetic */ Object result;

            @Override // ww.AbstractC8191a
            public final Object invokeSuspend(Object obj) {
                this.result = obj;
                this.label |= Integer.MIN_VALUE;
                return this.this$0.execute(null, null, this);
            }
        };
        this.$block.invoke(eventDispatcher, environment, interfaceC7559c);
        return a0.f30746a;
    }

    @Override // com.amplifyframework.statemachine.Action
    public String getId() {
        return this.f43780id;
    }
}
