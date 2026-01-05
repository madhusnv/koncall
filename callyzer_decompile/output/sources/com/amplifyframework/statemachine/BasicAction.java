package com.amplifyframework.statemachine;

import ex.InterfaceC2142f;
import kotlin.jvm.internal.AbstractC4154l;
import qw.a0;
import uw.InterfaceC7559c;
import vw.EnumC7794a;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class BasicAction implements Action {
    private final InterfaceC2142f block;

    /* renamed from: id, reason: collision with root package name */
    private String f43782id;

    public BasicAction(String id2, InterfaceC2142f block) {
        AbstractC4154l.m8923f(id2, "id");
        AbstractC4154l.m8923f(block, "block");
        this.f43782id = id2;
        this.block = block;
    }

    @Override // com.amplifyframework.statemachine.Action
    public Object execute(EventDispatcher eventDispatcher, Environment environment, InterfaceC7559c<? super a0> interfaceC7559c) {
        Object objInvoke = this.block.invoke(eventDispatcher, environment, interfaceC7559c);
        return objInvoke == EnumC7794a.COROUTINE_SUSPENDED ? objInvoke : a0.f30746a;
    }

    public final InterfaceC2142f getBlock() {
        return this.block;
    }

    @Override // com.amplifyframework.statemachine.Action
    public String getId() {
        return this.f43782id;
    }

    public void setId(String str) {
        AbstractC4154l.m8923f(str, "<set-?>");
        this.f43782id = str;
    }
}
