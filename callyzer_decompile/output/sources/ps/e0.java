package ps;

import android.content.Context;
import ex.InterfaceC2141e;
import og.od;
import p005f.C2162k;
import tx.InterfaceC7266z;
import us.C7536c;
import uw.InterfaceC7559c;
import vw.EnumC7794a;
import ww.AbstractC8199i;
import wx.C8203d;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes3.dex */
public final class e0 extends AbstractC8199i implements InterfaceC2141e {

    /* renamed from: a */
    public final /* synthetic */ int f29348a;

    /* renamed from: b */
    public int f29349b;

    /* renamed from: c */
    public final /* synthetic */ C7536c f29350c;

    /* renamed from: d */
    public final /* synthetic */ Context f29351d;

    /* renamed from: e */
    public final /* synthetic */ C2162k f29352e;

    /* renamed from: f */
    public final /* synthetic */ C2162k f29353f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e0(C7536c c7536c, Context context, C2162k c2162k, C2162k c2162k2, InterfaceC7559c interfaceC7559c, int i10) {
        super(2, interfaceC7559c);
        this.f29348a = i10;
        this.f29350c = c7536c;
        this.f29351d = context;
        this.f29352e = c2162k;
        this.f29353f = c2162k2;
    }

    @Override // ww.AbstractC8191a
    public final InterfaceC7559c create(Object obj, InterfaceC7559c interfaceC7559c) {
        switch (this.f29348a) {
            case 0:
                return new e0(this.f29350c, this.f29351d, this.f29352e, this.f29353f, interfaceC7559c, 0);
            default:
                return new e0(this.f29350c, this.f29351d, this.f29352e, this.f29353f, interfaceC7559c, 1);
        }
    }

    @Override // ex.InterfaceC2141e
    public final Object invoke(Object obj, Object obj2) {
        InterfaceC7266z interfaceC7266z = (InterfaceC7266z) obj;
        InterfaceC7559c interfaceC7559c = (InterfaceC7559c) obj2;
        switch (this.f29348a) {
        }
        return ((e0) create(interfaceC7266z, interfaceC7559c)).invokeSuspend(qw.a0.f30746a);
    }

    @Override // ww.AbstractC8191a
    public final Object invokeSuspend(Object obj) {
        switch (this.f29348a) {
            case 0:
                EnumC7794a enumC7794a = EnumC7794a.COROUTINE_SUSPENDED;
                int i10 = this.f29349b;
                if (i10 == 0) {
                    od.m10798c(obj);
                    C7536c c7536c = this.f29350c;
                    C8203d c8203d = c7536c.f36296k;
                    d0 d0Var = new d0(this.f29351d, c7536c, this.f29352e, this.f29353f, 0);
                    this.f29349b = 1;
                    if (c8203d.collect(d0Var, this) == enumC7794a) {
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
                int i11 = this.f29349b;
                if (i11 == 0) {
                    od.m10798c(obj);
                    C7536c c7536c2 = this.f29350c;
                    C8203d c8203d2 = c7536c2.f36296k;
                    d0 d0Var2 = new d0(this.f29351d, c7536c2, this.f29352e, this.f29353f, 1);
                    this.f29349b = 1;
                    if (c8203d2.collect(d0Var2, this) == enumC7794a2) {
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
