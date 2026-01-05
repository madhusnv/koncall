package m1;

import ex.InterfaceC2141e;
import i0.m0;
import java.util.ArrayList;
import k2.w0;
import og.od;
import qw.a0;
import tx.InterfaceC7266z;
import uw.InterfaceC7559c;
import vw.EnumC7794a;
import ww.AbstractC8199i;
import wx.InterfaceC8209j;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: m1.g */
/* loaded from: classes.dex */
public final class C4625g extends AbstractC8199i implements InterfaceC2141e {

    /* renamed from: a */
    public final /* synthetic */ int f22868a;

    /* renamed from: b */
    public int f22869b;

    /* renamed from: c */
    public final /* synthetic */ InterfaceC4629k f22870c;

    /* renamed from: d */
    public final /* synthetic */ w0 f22871d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C4625g(InterfaceC4629k interfaceC4629k, w0 w0Var, InterfaceC7559c interfaceC7559c, int i10) {
        super(2, interfaceC7559c);
        this.f22868a = i10;
        this.f22870c = interfaceC4629k;
        this.f22871d = w0Var;
    }

    @Override // ww.AbstractC8191a
    public final InterfaceC7559c create(Object obj, InterfaceC7559c interfaceC7559c) {
        switch (this.f22868a) {
            case 0:
                return new C4625g(this.f22870c, this.f22871d, interfaceC7559c, 0);
            default:
                return new C4625g(this.f22870c, this.f22871d, interfaceC7559c, 1);
        }
    }

    @Override // ex.InterfaceC2141e
    public final Object invoke(Object obj, Object obj2) {
        InterfaceC7266z interfaceC7266z = (InterfaceC7266z) obj;
        InterfaceC7559c interfaceC7559c = (InterfaceC7559c) obj2;
        switch (this.f22868a) {
        }
        return ((C4625g) create(interfaceC7266z, interfaceC7559c)).invokeSuspend(a0.f30746a);
    }

    @Override // ww.AbstractC8191a
    public final Object invokeSuspend(Object obj) {
        switch (this.f22868a) {
            case 0:
                EnumC7794a enumC7794a = EnumC7794a.COROUTINE_SUSPENDED;
                int i10 = this.f22869b;
                if (i10 == 0) {
                    ArrayList arrayListM7386s = m0.m7386s(obj);
                    InterfaceC8209j interfaceC8209jMo6892c = this.f22870c.mo6892c();
                    C4624f c4624f = new C4624f(arrayListM7386s, this.f22871d, 0);
                    this.f22869b = 1;
                    if (interfaceC8209jMo6892c.collect(c4624f, this) == enumC7794a) {
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
                int i11 = this.f22869b;
                if (i11 == 0) {
                    ArrayList arrayListM7386s2 = m0.m7386s(obj);
                    InterfaceC8209j interfaceC8209jMo6892c2 = this.f22870c.mo6892c();
                    C4624f c4624f2 = new C4624f(arrayListM7386s2, this.f22871d, 1);
                    this.f22869b = 1;
                    if (interfaceC8209jMo6892c2.collect(c4624f2, this) == enumC7794a2) {
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
}
