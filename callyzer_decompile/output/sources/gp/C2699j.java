package gp;

import android.content.Context;
import com.websoptimization.callyzerbiz.R;
import ex.InterfaceC2141e;
import java.util.List;
import og.od;
import org.bouncycastle.jcajce.provider.digest.AbstractC5601a;
import qw.a0;
import tx.InterfaceC7266z;
import uw.InterfaceC7559c;
import vw.EnumC7794a;
import ww.AbstractC8199i;
import wx.InterfaceC8210k;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: gp.j */
/* loaded from: classes3.dex */
public final class C2699j extends AbstractC8199i implements InterfaceC2141e {

    /* renamed from: a */
    public final /* synthetic */ int f15072a;

    /* renamed from: b */
    public final /* synthetic */ C2703n f15073b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C2699j(C2703n c2703n, InterfaceC7559c interfaceC7559c, int i10) {
        super(2, interfaceC7559c);
        this.f15072a = i10;
        this.f15073b = c2703n;
    }

    @Override // ww.AbstractC8191a
    public final InterfaceC7559c create(Object obj, InterfaceC7559c interfaceC7559c) {
        switch (this.f15072a) {
            case 0:
                return new C2699j(this.f15073b, interfaceC7559c, 0);
            case 1:
                return new C2699j(this.f15073b, interfaceC7559c, 1);
            default:
                return new C2699j(this.f15073b, interfaceC7559c, 2);
        }
    }

    @Override // ex.InterfaceC2141e
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f15072a) {
            case 0:
                return ((C2699j) create((List) obj, (InterfaceC7559c) obj2)).invokeSuspend(a0.f30746a);
            case 1:
                C2699j c2699j = (C2699j) create((InterfaceC8210k) obj, (InterfaceC7559c) obj2);
                a0 a0Var = a0.f30746a;
                c2699j.invokeSuspend(a0Var);
                return a0Var;
            default:
                C2699j c2699j2 = (C2699j) create((InterfaceC7266z) obj, (InterfaceC7559c) obj2);
                a0 a0Var2 = a0.f30746a;
                c2699j2.invokeSuspend(a0Var2);
                return a0Var2;
        }
    }

    @Override // ww.AbstractC8191a
    public final Object invokeSuspend(Object obj) {
        int i10 = this.f15072a;
        a0 a0Var = a0.f30746a;
        C2703n c2703n = this.f15073b;
        switch (i10) {
            case 0:
                EnumC7794a enumC7794a = EnumC7794a.COROUTINE_SUSPENDED;
                od.m10798c(obj);
                break;
            case 1:
                EnumC7794a enumC7794a2 = EnumC7794a.COROUTINE_SUSPENDED;
                od.m10798c(obj);
                c2703n.f15098u = true;
                break;
            default:
                EnumC7794a enumC7794a3 = EnumC7794a.COROUTINE_SUSPENDED;
                od.m10798c(obj);
                Context context = c2703n.f15083f;
                AbstractC5601a.m11254y(context, R.string.subscription_expired, "getString(...)", context);
                break;
        }
        return a0Var;
    }
}
