package com.amplifyframework.auth.cognito.helpers;

import ex.InterfaceC2139c;
import ex.InterfaceC2141e;
import og.od;
import qw.a0;
import uw.InterfaceC7559c;
import vw.EnumC7794a;
import ww.AbstractC8199i;
import ww.InterfaceC8195e;
import wx.C8219t;
import wx.InterfaceC8209j;
import wx.c1;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class FlowExtensionsKt {

    /* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
    @InterfaceC8195e(m15343c = "com.amplifyframework.auth.cognito.helpers.FlowExtensionsKt$collectWhile$2", m15344f = "FlowExtensions.kt", m15345l = {}, m15346m = "invokeSuspend")
    /* renamed from: com.amplifyframework.auth.cognito.helpers.FlowExtensionsKt$collectWhile$2 */
    public static final class C11422 extends AbstractC8199i implements InterfaceC2141e {
        final /* synthetic */ InterfaceC2139c $collector;
        /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C11422(InterfaceC2139c interfaceC2139c, InterfaceC7559c<? super C11422> interfaceC7559c) {
            super(2, interfaceC7559c);
            this.$collector = interfaceC2139c;
        }

        @Override // ww.AbstractC8191a
        public final InterfaceC7559c<a0> create(Object obj, InterfaceC7559c<?> interfaceC7559c) {
            C11422 c11422 = new C11422(this.$collector, interfaceC7559c);
            c11422.L$0 = obj;
            return c11422;
        }

        @Override // ex.InterfaceC2141e
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            return invoke((C11422) obj, (InterfaceC7559c<? super Boolean>) obj2);
        }

        @Override // ww.AbstractC8191a
        public final Object invokeSuspend(Object obj) {
            Object obj2 = this.L$0;
            EnumC7794a enumC7794a = EnumC7794a.COROUTINE_SUSPENDED;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            od.m10798c(obj);
            return this.$collector.invoke(obj2);
        }

        public final Object invoke(T t7, InterfaceC7559c<? super Boolean> interfaceC7559c) {
            return ((C11422) create(t7, interfaceC7559c)).invokeSuspend(a0.f30746a);
        }
    }

    public static final <T> Object collectWhile(InterfaceC8209j interfaceC8209j, InterfaceC2139c interfaceC2139c, InterfaceC7559c<? super a0> interfaceC7559c) {
        Object objM15378i = c1.m15378i(new C8219t(interfaceC8209j, new C11422(interfaceC2139c, null), 3), interfaceC7559c);
        return objM15378i == EnumC7794a.COROUTINE_SUSPENDED ? objM15378i : a0.f30746a;
    }
}
