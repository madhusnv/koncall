package dr;

import an.r1;
import ex.InterfaceC2141e;
import lv.C4531c;
import og.od;
import og.pe;
import qw.C6364n;
import rn.h0;
import tx.InterfaceC7266z;
import uw.InterfaceC7559c;
import vw.EnumC7794a;
import ww.AbstractC8199i;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: dr.h */
/* loaded from: classes3.dex */
public final class C1758h extends AbstractC8199i implements InterfaceC2141e {

    /* renamed from: a */
    public final /* synthetic */ int f8526a;

    /* renamed from: b */
    public int f8527b;

    /* renamed from: c */
    public final /* synthetic */ C1775y f8528c;

    /* renamed from: d */
    public /* synthetic */ int f8529d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C1758h(C1775y c1775y, int i10, InterfaceC7559c interfaceC7559c, int i11) {
        super(2, interfaceC7559c);
        this.f8526a = i11;
        this.f8528c = c1775y;
        this.f8529d = i10;
    }

    @Override // ww.AbstractC8191a
    public final InterfaceC7559c create(Object obj, InterfaceC7559c interfaceC7559c) {
        switch (this.f8526a) {
            case 0:
                return new C1758h(this.f8528c, this.f8529d, interfaceC7559c, 0);
            case 1:
                return new C1758h(this.f8528c, this.f8529d, interfaceC7559c, 1);
            case 2:
                C1758h c1758h = new C1758h(this.f8528c, interfaceC7559c, 2);
                c1758h.f8529d = ((Number) obj).intValue();
                return c1758h;
            default:
                C1758h c1758h2 = new C1758h(this.f8528c, interfaceC7559c, 3);
                c1758h2.f8529d = ((Number) obj).intValue();
                return c1758h2;
        }
    }

    @Override // ex.InterfaceC2141e
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f8526a) {
            case 0:
                return ((C1758h) create((InterfaceC7266z) obj, (InterfaceC7559c) obj2)).invokeSuspend(qw.a0.f30746a);
            case 1:
                return ((C1758h) create((InterfaceC7266z) obj, (InterfaceC7559c) obj2)).invokeSuspend(qw.a0.f30746a);
            case 2:
                return ((C1758h) create(Integer.valueOf(((Number) obj).intValue()), (InterfaceC7559c) obj2)).invokeSuspend(qw.a0.f30746a);
            default:
                return ((C1758h) create(Integer.valueOf(((Number) obj).intValue()), (InterfaceC7559c) obj2)).invokeSuspend(qw.a0.f30746a);
        }
    }

    @Override // ww.AbstractC8191a
    public final Object invokeSuspend(Object obj) throws NumberFormatException {
        Object objM5450j;
        Object objM5449i;
        switch (this.f8526a) {
            case 0:
                EnumC7794a enumC7794a = EnumC7794a.COROUTINE_SUSPENDED;
                int i10 = this.f8527b;
                if (i10 != 0) {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    od.m10798c(obj);
                    return obj;
                }
                od.m10798c(obj);
                h0 h0Var = this.f8528c.f8632o;
                int i11 = this.f8529d;
                this.f8527b = 1;
                Object objM10839n = pe.m10839n(this, h0Var.f31523e.f40818c.f14941a.f899a, true, false, new r1(i11, 1));
                return objM10839n == enumC7794a ? enumC7794a : objM10839n;
            case 1:
                EnumC7794a enumC7794a2 = EnumC7794a.COROUTINE_SUSPENDED;
                int i12 = this.f8527b;
                qw.a0 a0Var = qw.a0.f30746a;
                C1775y c1775y = this.f8528c;
                if (i12 == 0) {
                    od.m10798c(obj);
                    h0 h0Var2 = c1775y.f8632o;
                    int i13 = this.f8529d;
                    this.f8527b = 1;
                    Object objM15634s = h0Var2.f31523e.m15634s(i13, "", this);
                    if (objM15634s != enumC7794a2) {
                        objM15634s = a0Var;
                    }
                    if (objM15634s == enumC7794a2) {
                        return enumC7794a2;
                    }
                } else {
                    if (i12 != 1) {
                        if (i12 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        od.m10798c(obj);
                        return a0Var;
                    }
                    od.m10798c(obj);
                }
                C4531c c4531c = c1775y.f8618B;
                this.f8527b = 2;
                if (c4531c.m9380d(this) == enumC7794a2) {
                    return enumC7794a2;
                }
                return a0Var;
            case 2:
                int i14 = this.f8529d;
                EnumC7794a enumC7794a3 = EnumC7794a.COROUTINE_SUSPENDED;
                int i15 = this.f8527b;
                if (i15 == 0) {
                    od.m10798c(obj);
                    this.f8529d = i14;
                    this.f8527b = 1;
                    objM5450j = C1775y.m5450j(this.f8528c, i14, this);
                    if (objM5450j == enumC7794a3) {
                        return enumC7794a3;
                    }
                } else {
                    if (i15 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    od.m10798c(obj);
                    objM5450j = ((C6364n) obj).f30758a;
                }
                return new C6364n(objM5450j);
            default:
                int i16 = this.f8529d;
                EnumC7794a enumC7794a4 = EnumC7794a.COROUTINE_SUSPENDED;
                int i17 = this.f8527b;
                if (i17 == 0) {
                    od.m10798c(obj);
                    this.f8529d = i16;
                    this.f8527b = 1;
                    objM5449i = C1775y.m5449i(this.f8528c, i16, this);
                    if (objM5449i == enumC7794a4) {
                        return enumC7794a4;
                    }
                } else {
                    if (i17 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    od.m10798c(obj);
                    objM5449i = ((C6364n) obj).f30758a;
                }
                return new C6364n(objM5449i);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C1758h(C1775y c1775y, InterfaceC7559c interfaceC7559c, int i10) {
        super(2, interfaceC7559c);
        this.f8526a = i10;
        this.f8528c = c1775y;
    }
}
