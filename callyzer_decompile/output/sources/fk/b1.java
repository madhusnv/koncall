package fk;

import com.google.android.gms.internal.measurement.j4;
import ex.InterfaceC2141e;
import ex.InterfaceC2142f;
import kotlin.jvm.internal.AbstractC4154l;
import og.od;
import sc.C6802v;
import tc.C7117b;
import uw.InterfaceC7559c;
import vw.EnumC7794a;
import wc.InterfaceC7971e;
import ww.AbstractC8199i;
import wx.InterfaceC8210k;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class b1 extends AbstractC8199i implements InterfaceC2142f {

    /* renamed from: a */
    public final /* synthetic */ int f10343a;

    /* renamed from: b */
    public int f10344b;

    /* renamed from: c */
    public /* synthetic */ Object f10345c;

    /* renamed from: d */
    public /* synthetic */ Object f10346d;

    /* renamed from: e */
    public final /* synthetic */ Object f10347e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public b1(InterfaceC2141e interfaceC2141e, InterfaceC7559c interfaceC7559c) {
        super(3, interfaceC7559c);
        this.f10343a = 2;
        this.f10347e = (AbstractC8199i) interfaceC2141e;
    }

    /* JADX WARN: Type inference failed for: r1v5, types: [ex.e, ww.i] */
    @Override // ex.InterfaceC2142f
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        switch (this.f10343a) {
            case 0:
                b1 b1Var = new b1((h1) this.f10347e, (InterfaceC7559c) obj3, 0);
                b1Var.f10345c = (InterfaceC8210k) obj;
                b1Var.f10346d = (Throwable) obj2;
                return b1Var.invokeSuspend(qw.a0.f30746a);
            case 1:
                b1 b1Var2 = new b1((String) this.f10347e, (InterfaceC7559c) obj3, 1);
                b1Var2.f10345c = (C6802v) obj;
                b1Var2.f10346d = (InterfaceC7971e) obj2;
                return b1Var2.invokeSuspend(qw.a0.f30746a);
            default:
                b1 b1Var3 = new b1((AbstractC8199i) this.f10347e, (InterfaceC7559c) obj3);
                b1Var3.f10345c = (InterfaceC8210k) obj;
                b1Var3.f10346d = obj2;
                return b1Var3.invokeSuspend(qw.a0.f30746a);
        }
    }

    /* JADX WARN: Type inference failed for: r4v6, types: [ex.e, ww.i] */
    @Override // ww.AbstractC8191a
    public final Object invokeSuspend(Object obj) {
        InterfaceC8210k interfaceC8210k;
        switch (this.f10343a) {
            case 0:
                EnumC7794a enumC7794a = EnumC7794a.COROUTINE_SUSPENDED;
                int i10 = this.f10344b;
                if (i10 == 0) {
                    od.m10798c(obj);
                    InterfaceC8210k interfaceC8210k2 = (InterfaceC8210k) this.f10345c;
                    Throwable th2 = (Throwable) this.f10346d;
                    k0 k0Var = new k0(((h1) this.f10347e).f10410b.m5986a(null), null, null);
                    th2.getMessage();
                    this.f10345c = null;
                    this.f10344b = 1;
                    if (interfaceC8210k2.emit(k0Var, this) == enumC7794a) {
                        return enumC7794a;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    od.m10798c(obj);
                }
                return qw.a0.f30746a;
            case 1:
                C6802v c6802v = (C6802v) this.f10345c;
                InterfaceC7971e interfaceC7971e = (InterfaceC7971e) this.f10346d;
                EnumC7794a enumC7794a2 = EnumC7794a.COROUTINE_SUSPENDED;
                int i11 = this.f10344b;
                if (i11 != 0) {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    od.m10798c(obj);
                    return obj;
                }
                od.m10798c(obj);
                j4 j4Var = ((C7117b) c6802v.f32332b).f34311b.f361d;
                String value = (String) this.f10347e;
                j4Var.getClass();
                AbstractC4154l.m8923f(value, "value");
                j4Var.m3398p(value);
                this.f10345c = null;
                this.f10346d = null;
                this.f10344b = 1;
                Object objMo8275a = interfaceC7971e.mo8275a(c6802v, this);
                return objMo8275a == enumC7794a2 ? enumC7794a2 : objMo8275a;
            default:
                EnumC7794a enumC7794a3 = EnumC7794a.COROUTINE_SUSPENDED;
                int i12 = this.f10344b;
                if (i12 == 0) {
                    od.m10798c(obj);
                    interfaceC8210k = (InterfaceC8210k) this.f10345c;
                    Object obj2 = this.f10346d;
                    ?? r42 = (AbstractC8199i) this.f10347e;
                    this.f10345c = interfaceC8210k;
                    this.f10344b = 1;
                    obj = r42.invoke(obj2, this);
                    if (obj == enumC7794a3) {
                        return enumC7794a3;
                    }
                } else {
                    if (i12 != 1) {
                        if (i12 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        od.m10798c(obj);
                        return qw.a0.f30746a;
                    }
                    interfaceC8210k = (InterfaceC8210k) this.f10345c;
                    od.m10798c(obj);
                }
                this.f10345c = null;
                this.f10344b = 2;
                if (interfaceC8210k.emit(obj, this) == enumC7794a3) {
                    return enumC7794a3;
                }
                return qw.a0.f30746a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b1(Object obj, InterfaceC7559c interfaceC7559c, int i10) {
        super(3, interfaceC7559c);
        this.f10343a = i10;
        this.f10347e = obj;
    }
}
