package xx;

import ex.InterfaceC2141e;
import g2.e4;
import kotlin.jvm.internal.C4168z;
import og.od;
import qw.a0;
import tx.InterfaceC7266z;
import uw.InterfaceC7559c;
import vw.EnumC7794a;
import ww.AbstractC8199i;
import wx.InterfaceC8209j;
import wx.InterfaceC8210k;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: xx.j */
/* loaded from: classes3.dex */
public final class C8504j extends AbstractC8199i implements InterfaceC2141e {

    /* renamed from: a */
    public final /* synthetic */ int f41414a = 0;

    /* renamed from: b */
    public int f41415b;

    /* renamed from: c */
    public /* synthetic */ Object f41416c;

    /* renamed from: d */
    public final /* synthetic */ C8506l f41417d;

    /* renamed from: e */
    public final /* synthetic */ InterfaceC8210k f41418e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C8504j(C8506l c8506l, InterfaceC8210k interfaceC8210k, Object obj, InterfaceC7559c interfaceC7559c) {
        super(2, interfaceC7559c);
        this.f41417d = c8506l;
        this.f41418e = interfaceC8210k;
        this.f41416c = obj;
    }

    @Override // ww.AbstractC8191a
    public final InterfaceC7559c create(Object obj, InterfaceC7559c interfaceC7559c) {
        switch (this.f41414a) {
            case 0:
                return new C8504j(this.f41417d, this.f41418e, this.f41416c, interfaceC7559c);
            default:
                C8504j c8504j = new C8504j(this.f41417d, this.f41418e, interfaceC7559c);
                c8504j.f41416c = obj;
                return c8504j;
        }
    }

    @Override // ex.InterfaceC2141e
    public final Object invoke(Object obj, Object obj2) {
        InterfaceC7266z interfaceC7266z = (InterfaceC7266z) obj;
        InterfaceC7559c interfaceC7559c = (InterfaceC7559c) obj2;
        switch (this.f41414a) {
        }
        return ((C8504j) create(interfaceC7266z, interfaceC7559c)).invokeSuspend(a0.f30746a);
    }

    /* JADX WARN: Type inference failed for: r10v2, types: [ex.f, ww.i] */
    @Override // ww.AbstractC8191a
    public final Object invokeSuspend(Object obj) {
        switch (this.f41414a) {
            case 0:
                EnumC7794a enumC7794a = EnumC7794a.COROUTINE_SUSPENDED;
                int i10 = this.f41415b;
                if (i10 == 0) {
                    od.m10798c(obj);
                    ?? r10 = this.f41417d.f41424e;
                    Object obj2 = this.f41416c;
                    this.f41415b = 1;
                    if (r10.invoke(this.f41418e, obj2, this) == enumC7794a) {
                        return enumC7794a;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    od.m10798c(obj);
                }
                return a0.f30746a;
            default:
                EnumC7794a enumC7794a2 = EnumC7794a.COROUTINE_SUSPENDED;
                int i11 = this.f41415b;
                if (i11 == 0) {
                    od.m10798c(obj);
                    InterfaceC7266z interfaceC7266z = (InterfaceC7266z) this.f41416c;
                    C4168z c4168z = new C4168z();
                    C8506l c8506l = this.f41417d;
                    InterfaceC8209j interfaceC8209j = c8506l.f41413d;
                    e4 e4Var = new e4(c4168z, interfaceC7266z, c8506l, this.f41418e, 7);
                    this.f41415b = 1;
                    if (interfaceC8209j.collect(e4Var, this) == enumC7794a2) {
                        return enumC7794a2;
                    }
                } else {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    od.m10798c(obj);
                }
                return a0.f30746a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C8504j(C8506l c8506l, InterfaceC8210k interfaceC8210k, InterfaceC7559c interfaceC7559c) {
        super(2, interfaceC7559c);
        this.f41417d = c8506l;
        this.f41418e = interfaceC8210k;
    }
}
