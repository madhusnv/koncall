package vw;

import ex.InterfaceC2141e;
import kotlin.jvm.internal.AbstractC4154l;
import kotlin.jvm.internal.d0;
import og.od;
import uw.InterfaceC7559c;
import uw.InterfaceC7564h;
import ww.AbstractC8193c;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: vw.c */
/* loaded from: classes3.dex */
public final class C7796c extends AbstractC8193c {

    /* renamed from: a */
    public int f37469a;

    /* renamed from: b */
    public final /* synthetic */ InterfaceC2141e f37470b;

    /* renamed from: c */
    public final /* synthetic */ Object f37471c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C7796c(InterfaceC7559c interfaceC7559c, InterfaceC7564h interfaceC7564h, InterfaceC2141e interfaceC2141e, Object obj) {
        super(interfaceC7559c, interfaceC7564h);
        this.f37470b = interfaceC2141e;
        this.f37471c = obj;
        AbstractC4154l.m8921d(interfaceC7559c, "null cannot be cast to non-null type kotlin.coroutines.Continuation<kotlin.Any?>");
    }

    @Override // ww.AbstractC8191a
    public final Object invokeSuspend(Object obj) {
        int i10 = this.f37469a;
        if (i10 != 0) {
            if (i10 != 1) {
                throw new IllegalStateException("This coroutine had already completed");
            }
            this.f37469a = 2;
            od.m10798c(obj);
            return obj;
        }
        this.f37469a = 1;
        od.m10798c(obj);
        InterfaceC2141e interfaceC2141e = this.f37470b;
        AbstractC4154l.m8921d(interfaceC2141e, "null cannot be cast to non-null type kotlin.Function2<R of kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt.createCoroutineUnintercepted, kotlin.coroutines.Continuation<T of kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt.createCoroutineUnintercepted>, kotlin.Any?>");
        d0.m8907d(2, interfaceC2141e);
        return interfaceC2141e.invoke(this.f37471c, this);
    }
}
