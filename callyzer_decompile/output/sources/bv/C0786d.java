package bv;

import android.content.Context;
import ao.C0372k;
import av.C0459b;
import com.websoptimization.callyzerbiz.R;
import ex.InterfaceC2141e;
import kotlin.jvm.internal.AbstractC4154l;
import og.od;
import org.bouncycastle.jcajce.provider.digest.AbstractC5601a;
import qw.a0;
import r5.AbstractC6468c;
import tx.InterfaceC7266z;
import tx.c0;
import uw.InterfaceC7559c;
import vw.EnumC7794a;
import ww.AbstractC8199i;
import wx.m1;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: bv.d */
/* loaded from: classes3.dex */
public final class C0786d extends AbstractC8199i implements InterfaceC2141e {

    /* renamed from: a */
    public final /* synthetic */ int f4967a;

    /* renamed from: b */
    public final /* synthetic */ C0790h f4968b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0786d(C0790h c0790h, InterfaceC7559c interfaceC7559c, int i10) {
        super(2, interfaceC7559c);
        this.f4967a = i10;
        this.f4968b = c0790h;
    }

    @Override // ww.AbstractC8191a
    public final InterfaceC7559c create(Object obj, InterfaceC7559c interfaceC7559c) {
        switch (this.f4967a) {
            case 0:
                return new C0786d(this.f4968b, interfaceC7559c, 0);
            case 1:
                return new C0786d(this.f4968b, interfaceC7559c, 1);
            case 2:
                return new C0786d(this.f4968b, interfaceC7559c, 2);
            case 3:
                return new C0786d(this.f4968b, interfaceC7559c, 3);
            default:
                return new C0786d(this.f4968b, interfaceC7559c, 4);
        }
    }

    @Override // ex.InterfaceC2141e
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f4967a) {
            case 0:
                C0786d c0786d = (C0786d) create((InterfaceC7266z) obj, (InterfaceC7559c) obj2);
                a0 a0Var = a0.f30746a;
                c0786d.invokeSuspend(a0Var);
                return a0Var;
            case 1:
                C0786d c0786d2 = (C0786d) create((InterfaceC7266z) obj, (InterfaceC7559c) obj2);
                a0 a0Var2 = a0.f30746a;
                c0786d2.invokeSuspend(a0Var2);
                return a0Var2;
            case 2:
                C0786d c0786d3 = (C0786d) create((InterfaceC7266z) obj, (InterfaceC7559c) obj2);
                a0 a0Var3 = a0.f30746a;
                c0786d3.invokeSuspend(a0Var3);
                return a0Var3;
            case 3:
                C0786d c0786d4 = (C0786d) create((InterfaceC7266z) obj, (InterfaceC7559c) obj2);
                a0 a0Var4 = a0.f30746a;
                c0786d4.invokeSuspend(a0Var4);
                return a0Var4;
            default:
                C0786d c0786d5 = (C0786d) create((String) obj, (InterfaceC7559c) obj2);
                a0 a0Var5 = a0.f30746a;
                c0786d5.invokeSuspend(a0Var5);
                return a0Var5;
        }
    }

    @Override // ww.AbstractC8191a
    public final Object invokeSuspend(Object obj) {
        Object value;
        C0459b c0459b;
        Context context;
        int i10 = this.f4967a;
        a0 a0Var = a0.f30746a;
        C0790h c0790h = this.f4968b;
        switch (i10) {
            case 0:
                EnumC7794a enumC7794a = EnumC7794a.COROUTINE_SUSPENDED;
                od.m10798c(obj);
                m1 m1Var = c0790h.f5003o;
                do {
                    value = m1Var.getValue();
                    c0459b = (C0459b) value;
                    context = c0790h.f4990b;
                    AbstractC4154l.m8923f(context, "context");
                } while (!m1Var.m15397i(value, C0459b.m1461a(c0459b, null, null, null, null, null, null, AbstractC6468c.m12450a(context, "android.permission.RECORD_AUDIO") == 0, null, false, 0, 0, null, null, null, null, false, false, false, null, false, false, null, null, null, null, false, null, false, false, null, null, false, false, false, false, null, false, false, -129, 4095)));
            case 1:
                EnumC7794a enumC7794a2 = EnumC7794a.COROUTINE_SUSPENDED;
                od.m10798c(obj);
                Context context2 = c0790h.f4990b;
                AbstractC5601a.m11254y(context2, R.string.successfully_added, "getString(...)", context2);
                break;
            case 2:
                EnumC7794a enumC7794a3 = EnumC7794a.COROUTINE_SUSPENDED;
                od.m10798c(obj);
                Context context3 = c0790h.f4990b;
                AbstractC5601a.m11254y(context3, R.string.successfully_added, "getString(...)", context3);
                break;
            case 3:
                EnumC7794a enumC7794a4 = EnumC7794a.COROUTINE_SUSPENDED;
                od.m10798c(obj);
                AbstractC5601a.m11254y(c0790h.f4990b, R.string.subscription_expired, "getString(...)", c0790h.f4993e);
                break;
            default:
                EnumC7794a enumC7794a5 = EnumC7794a.COROUTINE_SUSPENDED;
                od.m10798c(obj);
                c0.m13502y(c0790h.f4995g, null, null, new C0372k(c0790h, null, 20), 3);
                break;
        }
        return a0Var;
    }
}
