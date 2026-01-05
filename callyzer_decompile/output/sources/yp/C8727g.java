package yp;

import android.content.Context;
import com.websoptimization.callyzerbiz.R;
import ex.InterfaceC2141e;
import java.util.ArrayList;
import java.util.List;
import og.od;
import org.bouncycastle.jcajce.provider.digest.AbstractC5601a;
import qr.AbstractC6297u;
import qr.C6293q;
import qw.a0;
import rw.AbstractC6663m;
import tx.InterfaceC7266z;
import ur.i0;
import uw.InterfaceC7559c;
import vw.EnumC7794a;
import ww.AbstractC8199i;
import wx.InterfaceC8210k;
import wx.m1;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: yp.g */
/* loaded from: classes3.dex */
public final class C8727g extends AbstractC8199i implements InterfaceC2141e {

    /* renamed from: a */
    public final /* synthetic */ int f42232a;

    /* renamed from: b */
    public final /* synthetic */ C8735o f42233b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C8727g(C8735o c8735o, InterfaceC7559c interfaceC7559c, int i10) {
        super(2, interfaceC7559c);
        this.f42232a = i10;
        this.f42233b = c8735o;
    }

    @Override // ww.AbstractC8191a
    public final InterfaceC7559c create(Object obj, InterfaceC7559c interfaceC7559c) {
        switch (this.f42232a) {
            case 0:
                return new C8727g(this.f42233b, interfaceC7559c, 0);
            case 1:
                return new C8727g(this.f42233b, interfaceC7559c, 1);
            case 2:
                return new C8727g(this.f42233b, interfaceC7559c, 2);
            case 3:
                return new C8727g(this.f42233b, interfaceC7559c, 3);
            default:
                return new C8727g(this.f42233b, interfaceC7559c, 4);
        }
    }

    @Override // ex.InterfaceC2141e
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f42232a) {
            case 0:
                return ((C8727g) create((List) obj, (InterfaceC7559c) obj2)).invokeSuspend(a0.f30746a);
            case 1:
                C8727g c8727g = (C8727g) create((InterfaceC8210k) obj, (InterfaceC7559c) obj2);
                a0 a0Var = a0.f30746a;
                c8727g.invokeSuspend(a0Var);
                return a0Var;
            case 2:
                C8727g c8727g2 = (C8727g) create((InterfaceC7266z) obj, (InterfaceC7559c) obj2);
                a0 a0Var2 = a0.f30746a;
                c8727g2.invokeSuspend(a0Var2);
                return a0Var2;
            case 3:
                C8727g c8727g3 = (C8727g) create((InterfaceC7266z) obj, (InterfaceC7559c) obj2);
                a0 a0Var3 = a0.f30746a;
                c8727g3.invokeSuspend(a0Var3);
                return a0Var3;
            default:
                C8727g c8727g4 = (C8727g) create((InterfaceC7266z) obj, (InterfaceC7559c) obj2);
                a0 a0Var4 = a0.f30746a;
                c8727g4.invokeSuspend(a0Var4);
                return a0Var4;
        }
    }

    @Override // ww.AbstractC8191a
    public final Object invokeSuspend(Object obj) {
        Object value;
        Object value2;
        int i10 = this.f42232a;
        a0 a0Var = a0.f30746a;
        C8735o c8735o = this.f42233b;
        switch (i10) {
            case 0:
                EnumC7794a enumC7794a = EnumC7794a.COROUTINE_SUSPENDED;
                od.m10798c(obj);
                break;
            case 1:
                EnumC7794a enumC7794a2 = EnumC7794a.COROUTINE_SUSPENDED;
                od.m10798c(obj);
                c8735o.f42281t = true;
                break;
            case 2:
                EnumC7794a enumC7794a3 = EnumC7794a.COROUTINE_SUSPENDED;
                od.m10798c(obj);
                ArrayList arrayListD0 = AbstractC6663m.d0(c8735o.f42278q);
                if (arrayListD0.isEmpty()) {
                    arrayListD0.add(c8735o.f42265A);
                } else {
                    int size = arrayListD0.size();
                    int i11 = 0;
                    while (i11 < size) {
                        Object obj2 = arrayListD0.get(i11);
                        i11++;
                        if (((AbstractC6297u) obj2) instanceof C6293q) {
                        }
                    }
                    arrayListD0.add(c8735o.f42265A);
                }
                m1 m1Var = c8735o.f36252b;
                do {
                    value = m1Var.getValue();
                } while (!m1Var.m15397i(value, i0.m14293a((i0) value, arrayListD0, null, null, c8735o.f42266B, null, 22)));
                C8735o.m16116l(c8735o, arrayListD0);
                break;
            case 3:
                EnumC7794a enumC7794a4 = EnumC7794a.COROUTINE_SUSPENDED;
                od.m10798c(obj);
                ArrayList arrayListD02 = AbstractC6663m.d0(c8735o.f42278q);
                arrayListD02.remove(c8735o.f42265A);
                m1 m1Var2 = c8735o.f36252b;
                do {
                    value2 = m1Var2.getValue();
                } while (!m1Var2.m15397i(value2, i0.m14293a((i0) value2, arrayListD02, null, null, null, null, 22)));
                C8735o.m16116l(c8735o, arrayListD02);
                break;
            default:
                EnumC7794a enumC7794a5 = EnumC7794a.COROUTINE_SUSPENDED;
                od.m10798c(obj);
                Context context = c8735o.f42267f;
                AbstractC5601a.m11254y(context, R.string.subscription_expired, "getString(...)", context);
                break;
        }
        return a0Var;
    }
}
