package sq;

import ex.InterfaceC2141e;
import kotlin.jvm.internal.AbstractC4154l;
import l4.C4381z;
import og.od;
import og.yf;
import tx.InterfaceC7266z;
import uw.InterfaceC7559c;
import vw.EnumC7794a;
import ww.AbstractC8199i;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes3.dex */
public final class j1 extends AbstractC8199i implements InterfaceC2141e {

    /* renamed from: a */
    public final /* synthetic */ int f32977a;

    /* renamed from: b */
    public final /* synthetic */ String f32978b;

    /* renamed from: c */
    public final /* synthetic */ k2.w0 f32979c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ j1(String str, k2.w0 w0Var, InterfaceC7559c interfaceC7559c, int i10) {
        super(2, interfaceC7559c);
        this.f32977a = i10;
        this.f32978b = str;
        this.f32979c = w0Var;
    }

    @Override // ww.AbstractC8191a
    public final InterfaceC7559c create(Object obj, InterfaceC7559c interfaceC7559c) {
        switch (this.f32977a) {
            case 0:
                return new j1(this.f32978b, this.f32979c, interfaceC7559c, 0);
            case 1:
                return new j1(this.f32978b, this.f32979c, interfaceC7559c, 1);
            case 2:
                return new j1(this.f32979c, this.f32978b, interfaceC7559c, 2);
            default:
                return new j1(this.f32979c, this.f32978b, interfaceC7559c, 3);
        }
    }

    @Override // ex.InterfaceC2141e
    public final Object invoke(Object obj, Object obj2) {
        InterfaceC7266z interfaceC7266z = (InterfaceC7266z) obj;
        InterfaceC7559c interfaceC7559c = (InterfaceC7559c) obj2;
        switch (this.f32977a) {
            case 0:
                j1 j1Var = (j1) create(interfaceC7266z, interfaceC7559c);
                qw.a0 a0Var = qw.a0.f30746a;
                j1Var.invokeSuspend(a0Var);
                return a0Var;
            case 1:
                j1 j1Var2 = (j1) create(interfaceC7266z, interfaceC7559c);
                qw.a0 a0Var2 = qw.a0.f30746a;
                j1Var2.invokeSuspend(a0Var2);
                return a0Var2;
            case 2:
                j1 j1Var3 = (j1) create(interfaceC7266z, interfaceC7559c);
                qw.a0 a0Var3 = qw.a0.f30746a;
                j1Var3.invokeSuspend(a0Var3);
                return a0Var3;
            default:
                j1 j1Var4 = (j1) create(interfaceC7266z, interfaceC7559c);
                qw.a0 a0Var4 = qw.a0.f30746a;
                j1Var4.invokeSuspend(a0Var4);
                return a0Var4;
        }
    }

    @Override // ww.AbstractC8191a
    public final Object invokeSuspend(Object obj) {
        int i10 = this.f32977a;
        qw.a0 a0Var = qw.a0.f30746a;
        String str = this.f32978b;
        k2.w0 w0Var = this.f32979c;
        switch (i10) {
            case 0:
                EnumC7794a enumC7794a = EnumC7794a.COROUTINE_SUSPENDED;
                od.m10798c(obj);
                float f6 = m1.f33056a;
                w0Var.setValue(C4381z.m9154b((C4381z) w0Var.getValue(), str != null ? str : "", 0L, 6));
                break;
            case 1:
                EnumC7794a enumC7794a2 = EnumC7794a.COROUTINE_SUSPENDED;
                od.m10798c(obj);
                w0Var.setValue(str != null ? str : "");
                break;
            case 2:
                EnumC7794a enumC7794a3 = EnumC7794a.COROUTINE_SUSPENDED;
                od.m10798c(obj);
                if (!AbstractC4154l.m8918a(((C4381z) w0Var.getValue()).f21945a.f13620b, str)) {
                    int length = str.length();
                    w0Var.setValue(new C4381z(str, 4, yf.m11072a(length, length)));
                    break;
                }
                break;
            default:
                EnumC7794a enumC7794a4 = EnumC7794a.COROUTINE_SUSPENDED;
                od.m10798c(obj);
                int length2 = str.length();
                w0Var.setValue(new C4381z(str, 4, yf.m11072a(length2, length2)));
                break;
        }
        return a0Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ j1(k2.w0 w0Var, String str, InterfaceC7559c interfaceC7559c, int i10) {
        super(2, interfaceC7559c);
        this.f32977a = i10;
        this.f32979c = w0Var;
        this.f32978b = str;
    }
}
