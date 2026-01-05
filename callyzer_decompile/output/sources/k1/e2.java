package k1;

import c3.C0847b;
import ex.InterfaceC2141e;
import ex.InterfaceC2142f;
import og.od;
import p3.C5819q;
import tx.InterfaceC7266z;
import uw.InterfaceC7559c;
import vw.EnumC7794a;
import ww.AbstractC8199i;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class e2 extends AbstractC8199i implements InterfaceC2141e {

    /* renamed from: a */
    public final /* synthetic */ int f20074a;

    /* renamed from: b */
    public int f20075b;

    /* renamed from: c */
    public final /* synthetic */ InterfaceC2142f f20076c;

    /* renamed from: d */
    public final /* synthetic */ a1 f20077d;

    /* renamed from: e */
    public final /* synthetic */ C5819q f20078e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e2(InterfaceC2142f interfaceC2142f, a1 a1Var, C5819q c5819q, InterfaceC7559c interfaceC7559c, int i10) {
        super(2, interfaceC7559c);
        this.f20074a = i10;
        this.f20076c = interfaceC2142f;
        this.f20077d = a1Var;
        this.f20078e = c5819q;
    }

    @Override // ww.AbstractC8191a
    public final InterfaceC7559c create(Object obj, InterfaceC7559c interfaceC7559c) {
        switch (this.f20074a) {
            case 0:
                return new e2(this.f20076c, this.f20077d, this.f20078e, interfaceC7559c, 0);
            default:
                return new e2(this.f20076c, this.f20077d, this.f20078e, interfaceC7559c, 1);
        }
    }

    @Override // ex.InterfaceC2141e
    public final Object invoke(Object obj, Object obj2) {
        InterfaceC7266z interfaceC7266z = (InterfaceC7266z) obj;
        InterfaceC7559c interfaceC7559c = (InterfaceC7559c) obj2;
        switch (this.f20074a) {
        }
        return ((e2) create(interfaceC7266z, interfaceC7559c)).invokeSuspend(qw.a0.f30746a);
    }

    @Override // ww.AbstractC8191a
    public final Object invokeSuspend(Object obj) {
        switch (this.f20074a) {
            case 0:
                EnumC7794a enumC7794a = EnumC7794a.COROUTINE_SUSPENDED;
                int i10 = this.f20075b;
                if (i10 == 0) {
                    od.m10798c(obj);
                    C0847b c0847b = new C0847b(this.f20078e.f28478c);
                    this.f20075b = 1;
                    if (this.f20076c.invoke(this.f20077d, c0847b, this) == enumC7794a) {
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
                int i11 = this.f20075b;
                if (i11 == 0) {
                    od.m10798c(obj);
                    C0847b c0847b2 = new C0847b(this.f20078e.f28478c);
                    this.f20075b = 1;
                    if (this.f20076c.invoke(this.f20077d, c0847b2, this) == enumC7794a2) {
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
