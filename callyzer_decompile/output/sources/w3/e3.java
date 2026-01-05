package w3;

import ex.InterfaceC2141e;
import og.od;
import tx.InterfaceC7266z;
import uw.InterfaceC7559c;
import vw.EnumC7794a;
import ww.AbstractC8199i;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class e3 extends AbstractC8199i implements InterfaceC2141e {

    /* renamed from: a */
    public final /* synthetic */ int f37780a;

    /* renamed from: b */
    public int f37781b;

    /* renamed from: c */
    public final /* synthetic */ g3 f37782c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e3(g3 g3Var, InterfaceC7559c interfaceC7559c, int i10) {
        super(2, interfaceC7559c);
        this.f37780a = i10;
        this.f37782c = g3Var;
    }

    @Override // ww.AbstractC8191a
    public final InterfaceC7559c create(Object obj, InterfaceC7559c interfaceC7559c) {
        switch (this.f37780a) {
            case 0:
                return new e3(this.f37782c, interfaceC7559c, 0);
            default:
                return new e3(this.f37782c, interfaceC7559c, 1);
        }
    }

    @Override // ex.InterfaceC2141e
    public final Object invoke(Object obj, Object obj2) {
        InterfaceC7266z interfaceC7266z = (InterfaceC7266z) obj;
        InterfaceC7559c interfaceC7559c = (InterfaceC7559c) obj2;
        switch (this.f37780a) {
        }
        return ((e3) create(interfaceC7266z, interfaceC7559c)).invokeSuspend(qw.a0.f30746a);
    }

    @Override // ww.AbstractC8191a
    public final Object invokeSuspend(Object obj) throws Throwable {
        switch (this.f37780a) {
            case 0:
                EnumC7794a enumC7794a = EnumC7794a.COROUTINE_SUSPENDED;
                int i10 = this.f37781b;
                qw.a0 a0Var = qw.a0.f30746a;
                if (i10 == 0) {
                    od.m10798c(obj);
                    C7904v c7904v = this.f37782c.f37798a;
                    this.f37781b = 1;
                    Object objM14880l = c7904v.f38033r.m14880l(this);
                    if (objM14880l != enumC7794a) {
                        objM14880l = a0Var;
                    }
                    if (objM14880l == enumC7794a) {
                        return enumC7794a;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    od.m10798c(obj);
                }
                return a0Var;
            default:
                EnumC7794a enumC7794a2 = EnumC7794a.COROUTINE_SUSPENDED;
                int i11 = this.f37781b;
                qw.a0 a0Var2 = qw.a0.f30746a;
                if (i11 == 0) {
                    od.m10798c(obj);
                    C7904v c7904v2 = this.f37782c.f37798a;
                    this.f37781b = 1;
                    Object objM15798a = c7904v2.f38034s.m15798a(this);
                    if (objM15798a != enumC7794a2) {
                        objM15798a = a0Var2;
                    }
                    if (objM15798a == enumC7794a2) {
                        return enumC7794a2;
                    }
                } else {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    od.m10798c(obj);
                }
                return a0Var2;
        }
    }
}
