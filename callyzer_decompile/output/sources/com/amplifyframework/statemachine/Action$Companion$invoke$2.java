package com.amplifyframework.statemachine;

import ex.InterfaceC2143g;
import kotlin.jvm.internal.AbstractC4154l;
import qw.a0;
import uw.InterfaceC7559c;
import vw.EnumC7794a;
import ww.AbstractC8193c;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class Action$Companion$invoke$2 implements Action {
    final /* synthetic */ InterfaceC2143g $block;

    /* renamed from: id, reason: collision with root package name */
    private final String f43781id;

    public Action$Companion$invoke$2(String str, InterfaceC2143g interfaceC2143g) {
        this.$block = interfaceC2143g;
        this.f43781id = str == null ? super.getId() : str;
    }

    @Override // com.amplifyframework.statemachine.Action
    public Object execute(EventDispatcher eventDispatcher, Environment environment, InterfaceC7559c<? super a0> interfaceC7559c) {
        AbstractC4154l.m8921d(environment, "null cannot be cast to non-null type EnvType of com.amplifyframework.statemachine.Action.Companion.invoke");
        Object objMo1450c = this.$block.mo1450c(environment, getId(), eventDispatcher, interfaceC7559c);
        return objMo1450c == EnumC7794a.COROUTINE_SUSPENDED ? objMo1450c : a0.f30746a;
    }

    public Object execute$$forInline(EventDispatcher eventDispatcher, Environment environment, final InterfaceC7559c<? super a0> interfaceC7559c) {
        new AbstractC8193c(interfaceC7559c) { // from class: com.amplifyframework.statemachine.Action$Companion$invoke$2$execute$1
            int label;
            /* synthetic */ Object result;

            @Override // ww.AbstractC8191a
            public final Object invokeSuspend(Object obj) {
                this.result = obj;
                this.label |= Integer.MIN_VALUE;
                return this.this$0.execute(null, null, this);
            }
        };
        AbstractC4154l.m8921d(environment, "null cannot be cast to non-null type EnvType of com.amplifyframework.statemachine.Action.Companion.invoke");
        this.$block.mo1450c(environment, getId(), eventDispatcher, interfaceC7559c);
        return a0.f30746a;
    }

    @Override // com.amplifyframework.statemachine.Action
    public String getId() {
        return this.f43781id;
    }
}
