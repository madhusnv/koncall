package qv;

import com.websoptimization.callyzerbiz.R;
import ex.InterfaceC2141e;
import km.C4120o;
import lu.C4525k;
import nn.C5113e;
import og.od;
import pg.y8;
import qw.a0;
import tx.InterfaceC7266z;
import uw.InterfaceC7559c;
import vw.EnumC7794a;
import ww.AbstractC8199i;
import wx.c1;
import wx.w0;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: qv.l */
/* loaded from: classes3.dex */
public final class C6337l extends AbstractC8199i implements InterfaceC2141e {

    /* renamed from: a */
    public final /* synthetic */ int f30716a;

    /* renamed from: b */
    public int f30717b;

    /* renamed from: c */
    public final /* synthetic */ C6338m f30718c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C6337l(C6338m c6338m, InterfaceC7559c interfaceC7559c, int i10) {
        super(2, interfaceC7559c);
        this.f30716a = i10;
        this.f30718c = c6338m;
    }

    @Override // ww.AbstractC8191a
    public final InterfaceC7559c create(Object obj, InterfaceC7559c interfaceC7559c) {
        switch (this.f30716a) {
            case 0:
                return new C6337l(this.f30718c, interfaceC7559c, 0);
            default:
                return new C6337l(this.f30718c, interfaceC7559c, 1);
        }
    }

    @Override // ex.InterfaceC2141e
    public final Object invoke(Object obj, Object obj2) {
        InterfaceC7266z interfaceC7266z = (InterfaceC7266z) obj;
        InterfaceC7559c interfaceC7559c = (InterfaceC7559c) obj2;
        switch (this.f30716a) {
        }
        return ((C6337l) create(interfaceC7266z, interfaceC7559c)).invokeSuspend(a0.f30746a);
    }

    @Override // ww.AbstractC8191a
    public final Object invokeSuspend(Object obj) {
        switch (this.f30716a) {
            case 0:
                EnumC7794a enumC7794a = EnumC7794a.COROUTINE_SUSPENDED;
                int i10 = this.f30717b;
                if (i10 == 0) {
                    od.m10798c(obj);
                    C6338m c6338m = this.f30718c;
                    w0 w0Var = c6338m.f30722e.f22370d;
                    C4525k c4525k = new C4525k(c6338m, null, 10);
                    this.f30717b = 1;
                    if (c1.m15379j(w0Var, c4525k, this) == enumC7794a) {
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
                int i11 = this.f30717b;
                C6338m c6338m2 = this.f30718c;
                if (i11 == 0) {
                    od.m10798c(obj);
                    C5113e c5113e = c6338m2.f30720c;
                    this.f30717b = 1;
                    obj = ((C4120o) c5113e.f25030a.f41069a.f10585a).m8884f("last_log_sent_time", this);
                    if (obj == enumC7794a2) {
                        return enumC7794a2;
                    }
                } else {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    od.m10798c(obj);
                }
                if (((Number) obj).longValue() + 60000 < System.currentTimeMillis()) {
                    c6338m2.f30721d.m16470f(false);
                } else {
                    y8.m11949d(c6338m2.f30719b, R.string.log_file_sent_already);
                }
                return a0.f30746a;
        }
    }
}
