package ks;

import android.content.Context;
import ay.C0496f;
import ay.ExecutorC0495e;
import com.websoptimization.callyzerbiz.R;
import ex.InterfaceC2141e;
import i7.C3178a;
import is.C3348b;
import java.util.List;
import og.od;
import org.bouncycastle.jcajce.provider.digest.AbstractC5601a;
import tx.InterfaceC7266z;
import uw.InterfaceC7559c;
import vw.EnumC7794a;
import ww.AbstractC8199i;
import wx.m1;
import wx.w0;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: ks.s */
/* loaded from: classes3.dex */
public final class C4230s extends AbstractC8199i implements InterfaceC2141e {

    /* renamed from: a */
    public final /* synthetic */ int f21519a;

    /* renamed from: b */
    public final /* synthetic */ c0 f21520b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C4230s(c0 c0Var, InterfaceC7559c interfaceC7559c, int i10) {
        super(2, interfaceC7559c);
        this.f21519a = i10;
        this.f21520b = c0Var;
    }

    @Override // ww.AbstractC8191a
    public final InterfaceC7559c create(Object obj, InterfaceC7559c interfaceC7559c) {
        switch (this.f21519a) {
            case 0:
                return new C4230s(this.f21520b, interfaceC7559c, 0);
            case 1:
                return new C4230s(this.f21520b, interfaceC7559c, 1);
            case 2:
                return new C4230s(this.f21520b, interfaceC7559c, 2);
            case 3:
                return new C4230s(this.f21520b, interfaceC7559c, 3);
            default:
                return new C4230s(this.f21520b, interfaceC7559c, 4);
        }
    }

    @Override // ex.InterfaceC2141e
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f21519a) {
            case 0:
                C4230s c4230s = (C4230s) create((InterfaceC7266z) obj, (InterfaceC7559c) obj2);
                qw.a0 a0Var = qw.a0.f30746a;
                c4230s.invokeSuspend(a0Var);
                return a0Var;
            case 1:
                C4230s c4230s2 = (C4230s) create((InterfaceC7266z) obj, (InterfaceC7559c) obj2);
                qw.a0 a0Var2 = qw.a0.f30746a;
                c4230s2.invokeSuspend(a0Var2);
                return a0Var2;
            case 2:
                return ((C4230s) create((List) obj, (InterfaceC7559c) obj2)).invokeSuspend(qw.a0.f30746a);
            case 3:
                C4230s c4230s3 = (C4230s) create((Throwable) obj, (InterfaceC7559c) obj2);
                qw.a0 a0Var3 = qw.a0.f30746a;
                c4230s3.invokeSuspend(a0Var3);
                return a0Var3;
            default:
                C4230s c4230s4 = (C4230s) create((InterfaceC7266z) obj, (InterfaceC7559c) obj2);
                qw.a0 a0Var4 = qw.a0.f30746a;
                c4230s4.invokeSuspend(a0Var4);
                return a0Var4;
        }
    }

    @Override // ww.AbstractC8191a
    public final Object invokeSuspend(Object obj) {
        Object value;
        Object value2;
        int i10 = this.f21519a;
        int i11 = 3;
        int i12 = 2;
        InterfaceC7559c interfaceC7559c = null;
        qw.a0 a0Var = qw.a0.f30746a;
        c0 c0Var = this.f21520b;
        switch (i10) {
            case 0:
                EnumC7794a enumC7794a = EnumC7794a.COROUTINE_SUSPENDED;
                od.m10798c(obj);
                C3178a c3178aM5340g = d7.q0.m5340g(c0Var);
                C0496f c0496f = tx.m0.f34659a;
                tx.c0.m13502y(c3178aM5340g, ExecutorC0495e.f3538c, null, new C4229r(c0Var, interfaceC7559c, i11), 2);
                break;
            case 1:
                EnumC7794a enumC7794a2 = EnumC7794a.COROUTINE_SUSPENDED;
                od.m10798c(obj);
                tx.c0.m13502y(c0Var.f21369j, null, null, new C4229r(c0Var, interfaceC7559c, i12), 3);
                break;
            case 2:
                EnumC7794a enumC7794a3 = EnumC7794a.COROUTINE_SUSPENDED;
                od.m10798c(obj);
                w0 w0Var = c0Var.f21361C;
                break;
            case 3:
                EnumC7794a enumC7794a4 = EnumC7794a.COROUTINE_SUSPENDED;
                od.m10798c(obj);
                m1 m1Var = c0Var.f21359A;
                if (((C3348b) c0Var.f21361C.f39340a.getValue()).f17723k) {
                    do {
                        value2 = m1Var.getValue();
                    } while (!m1Var.m15397i(value2, C3348b.m7669a((C3348b) value2, null, false, 0, null, 0, false, false, false, null, null, false, null, null, null, null, null, false, null, 1047551)));
                }
                do {
                    value = m1Var.getValue();
                } while (!m1Var.m15397i(value, C3348b.m7669a((C3348b) value, null, false, 0, null, 0, false, false, false, null, null, false, null, null, null, null, null, false, null, 1048573)));
            default:
                EnumC7794a enumC7794a5 = EnumC7794a.COROUTINE_SUSPENDED;
                od.m10798c(obj);
                Context context = c0Var.f21374o;
                AbstractC5601a.m11254y(context, R.string.subscription_expired, "getString(...)", context);
                break;
        }
        return a0Var;
    }
}
