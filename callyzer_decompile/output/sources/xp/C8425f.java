package xp;

import aq.C0407j;
import ex.InterfaceC2141e;
import l7.a0;
import og.od;
import tx.InterfaceC7266z;
import uw.InterfaceC7559c;
import vw.EnumC7794a;
import ww.AbstractC8199i;
import wx.C8203d;
import yp.C8735o;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: xp.f */
/* loaded from: classes3.dex */
public final class C8425f extends AbstractC8199i implements InterfaceC2141e {

    /* renamed from: a */
    public final /* synthetic */ int f41123a;

    /* renamed from: b */
    public int f41124b;

    /* renamed from: c */
    public final /* synthetic */ C8735o f41125c;

    /* renamed from: d */
    public final /* synthetic */ a0 f41126d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C8425f(C8735o c8735o, a0 a0Var, InterfaceC7559c interfaceC7559c, int i10) {
        super(2, interfaceC7559c);
        this.f41123a = i10;
        this.f41125c = c8735o;
        this.f41126d = a0Var;
    }

    @Override // ww.AbstractC8191a
    public final InterfaceC7559c create(Object obj, InterfaceC7559c interfaceC7559c) {
        switch (this.f41123a) {
            case 0:
                return new C8425f(this.f41125c, this.f41126d, interfaceC7559c, 0);
            default:
                return new C8425f(this.f41125c, this.f41126d, interfaceC7559c, 1);
        }
    }

    @Override // ex.InterfaceC2141e
    public final Object invoke(Object obj, Object obj2) {
        InterfaceC7266z interfaceC7266z = (InterfaceC7266z) obj;
        InterfaceC7559c interfaceC7559c = (InterfaceC7559c) obj2;
        switch (this.f41123a) {
        }
        return ((C8425f) create(interfaceC7266z, interfaceC7559c)).invokeSuspend(qw.a0.f30746a);
    }

    @Override // ww.AbstractC8191a
    public final Object invokeSuspend(Object obj) {
        switch (this.f41123a) {
            case 0:
                EnumC7794a enumC7794a = EnumC7794a.COROUTINE_SUSPENDED;
                int i10 = this.f41124b;
                if (i10 == 0) {
                    od.m10798c(obj);
                    C8203d c8203d = this.f41125c.f42280s;
                    C0407j c0407j = new C0407j(this.f41126d, 11);
                    this.f41124b = 1;
                    if (c8203d.collect(c0407j, this) == enumC7794a) {
                        return enumC7794a;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    od.m10798c(obj);
                }
                return qw.a0.f30746a;
            default:
                EnumC7794a enumC7794a2 = EnumC7794a.COROUTINE_SUSPENDED;
                int i11 = this.f41124b;
                if (i11 == 0) {
                    od.m10798c(obj);
                    C8203d c8203d2 = this.f41125c.f36255e;
                    C0407j c0407j2 = new C0407j(this.f41126d, 12);
                    this.f41124b = 1;
                    if (c8203d2.collect(c0407j2, this) == enumC7794a2) {
                        return enumC7794a2;
                    }
                } else {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    od.m10798c(obj);
                }
                return qw.a0.f30746a;
        }
    }
}
