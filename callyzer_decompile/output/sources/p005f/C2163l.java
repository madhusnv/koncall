package p005f;

import ex.InterfaceC2142f;
import kotlin.jvm.internal.C4164v;
import og.od;
import qw.a0;
import uw.InterfaceC7559c;
import vw.EnumC7794a;
import ww.AbstractC8199i;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: f.l */
/* loaded from: classes.dex */
public final class C2163l extends AbstractC8199i implements InterfaceC2142f {

    /* renamed from: a */
    public final /* synthetic */ C4164v f10020a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2163l(C4164v c4164v, InterfaceC7559c interfaceC7559c) {
        super(3, interfaceC7559c);
        this.f10020a = c4164v;
    }

    @Override // ex.InterfaceC2142f
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        C2163l c2163l = new C2163l(this.f10020a, (InterfaceC7559c) obj3);
        a0 a0Var = a0.f30746a;
        c2163l.invokeSuspend(a0Var);
        return a0Var;
    }

    @Override // ww.AbstractC8191a
    public final Object invokeSuspend(Object obj) {
        EnumC7794a enumC7794a = EnumC7794a.COROUTINE_SUSPENDED;
        od.m10798c(obj);
        this.f10020a.f21160a = true;
        return a0.f30746a;
    }
}
