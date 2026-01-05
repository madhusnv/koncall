package ks;

import android.content.Context;
import com.websoptimization.callyzerbiz.R;
import ex.InterfaceC2141e;
import is.C3348b;
import java.util.List;
import og.od;
import org.bouncycastle.jcajce.provider.digest.AbstractC5601a;
import rw.C6668r;
import rw.C6669s;
import tx.InterfaceC7266z;
import uw.InterfaceC7559c;
import vw.EnumC7794a;
import ww.AbstractC8199i;
import wx.InterfaceC8210k;
import wx.m1;
import wx.w0;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: ks.f */
/* loaded from: classes3.dex */
public final class C4217f extends AbstractC8199i implements InterfaceC2141e {

    /* renamed from: a */
    public final /* synthetic */ int f21400a;

    /* renamed from: b */
    public final /* synthetic */ C4223l f21401b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C4217f(int i10, C4223l c4223l, InterfaceC7559c interfaceC7559c) {
        super(2, interfaceC7559c);
        this.f21400a = i10;
        this.f21401b = c4223l;
    }

    @Override // ww.AbstractC8191a
    public final InterfaceC7559c create(Object obj, InterfaceC7559c interfaceC7559c) {
        switch (this.f21400a) {
            case 0:
                return new C4217f(0, this.f21401b, interfaceC7559c);
            case 1:
                return new C4217f(1, this.f21401b, interfaceC7559c);
            case 2:
                return new C4217f(2, this.f21401b, interfaceC7559c);
            case 3:
                return new C4217f(3, this.f21401b, interfaceC7559c);
            default:
                return new C4217f(4, this.f21401b, interfaceC7559c);
        }
    }

    @Override // ex.InterfaceC2141e
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f21400a) {
            case 0:
                return ((C4217f) create((List) obj, (InterfaceC7559c) obj2)).invokeSuspend(qw.a0.f30746a);
            case 1:
                C4217f c4217f = (C4217f) create((InterfaceC8210k) obj, (InterfaceC7559c) obj2);
                qw.a0 a0Var = qw.a0.f30746a;
                c4217f.invokeSuspend(a0Var);
                return a0Var;
            case 2:
                C4217f c4217f2 = (C4217f) create((Throwable) obj, (InterfaceC7559c) obj2);
                qw.a0 a0Var2 = qw.a0.f30746a;
                c4217f2.invokeSuspend(a0Var2);
                return a0Var2;
            case 3:
                C4217f c4217f3 = (C4217f) create((InterfaceC7266z) obj, (InterfaceC7559c) obj2);
                qw.a0 a0Var3 = qw.a0.f30746a;
                c4217f3.invokeSuspend(a0Var3);
                return a0Var3;
            default:
                C4217f c4217f4 = (C4217f) create((List) obj, (InterfaceC7559c) obj2);
                qw.a0 a0Var4 = qw.a0.f30746a;
                c4217f4.invokeSuspend(a0Var4);
                return a0Var4;
        }
    }

    @Override // ww.AbstractC8191a
    public final Object invokeSuspend(Object obj) {
        Object value;
        Object value2;
        Object value3;
        int i10 = this.f21400a;
        qw.a0 a0Var = qw.a0.f30746a;
        C4223l c4223l = this.f21401b;
        switch (i10) {
            case 0:
                EnumC7794a enumC7794a = EnumC7794a.COROUTINE_SUSPENDED;
                od.m10798c(obj);
                w0 w0Var = c4223l.f21457q;
                break;
            case 1:
                EnumC7794a enumC7794a2 = EnumC7794a.COROUTINE_SUSPENDED;
                od.m10798c(obj);
                c4223l.f21455o = true;
                break;
            case 2:
                EnumC7794a enumC7794a3 = EnumC7794a.COROUTINE_SUSPENDED;
                od.m10798c(obj);
                m1 m1Var = c4223l.f21456p;
                if (((C3348b) c4223l.f21457q.f39340a.getValue()).f17723k) {
                    do {
                        value2 = m1Var.getValue();
                    } while (!m1Var.m15397i(value2, C3348b.m7669a((C3348b) value2, null, false, 0, null, 0, false, false, false, null, null, false, null, null, null, null, null, false, null, 1047551)));
                }
                do {
                    value = m1Var.getValue();
                } while (!m1Var.m15397i(value, C3348b.m7669a((C3348b) value, null, false, 0, null, 0, false, false, false, null, null, false, null, null, null, null, null, false, null, 1048573)));
            case 3:
                EnumC7794a enumC7794a4 = EnumC7794a.COROUTINE_SUSPENDED;
                od.m10798c(obj);
                Context context = c4223l.f21449i;
                AbstractC5601a.m11254y(context, R.string.subscription_expired, "getString(...)", context);
                break;
            default:
                EnumC7794a enumC7794a5 = EnumC7794a.COROUTINE_SUSPENDED;
                od.m10798c(obj);
                m1 m1Var2 = c4223l.f21456p;
                do {
                    value3 = m1Var2.getValue();
                } while (!m1Var2.m15397i(value3, C3348b.m7669a((C3348b) value3, C6668r.f31943a, false, 0, null, 0, false, false, false, null, null, false, null, null, null, null, null, false, C6669s.f31944a, 524286)));
        }
        return a0Var;
    }
}
