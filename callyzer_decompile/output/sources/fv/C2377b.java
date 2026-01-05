package fv;

import android.content.Context;
import ay.C0496f;
import ay.ExecutorC0495e;
import com.websoptimization.callyzerbiz.R;
import ev.C2136a;
import ex.InterfaceC2141e;
import kotlin.jvm.internal.AbstractC4154l;
import og.od;
import org.bouncycastle.jcajce.provider.digest.AbstractC5601a;
import qw.a0;
import r5.AbstractC6468c;
import tx.InterfaceC7266z;
import tx.c0;
import tx.m0;
import uw.InterfaceC7559c;
import vw.EnumC7794a;
import ww.AbstractC8199i;
import wx.m1;
import yx.C8810d;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: fv.b */
/* loaded from: classes3.dex */
public final class C2377b extends AbstractC8199i implements InterfaceC2141e {

    /* renamed from: a */
    public final /* synthetic */ int f10816a;

    /* renamed from: b */
    public final /* synthetic */ C2386k f10817b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C2377b(C2386k c2386k, InterfaceC7559c interfaceC7559c, int i10) {
        super(2, interfaceC7559c);
        this.f10816a = i10;
        this.f10817b = c2386k;
    }

    @Override // ww.AbstractC8191a
    public final InterfaceC7559c create(Object obj, InterfaceC7559c interfaceC7559c) {
        switch (this.f10816a) {
            case 0:
                return new C2377b(this.f10817b, interfaceC7559c, 0);
            case 1:
                return new C2377b(this.f10817b, interfaceC7559c, 1);
            default:
                return new C2377b(this.f10817b, interfaceC7559c, 2);
        }
    }

    @Override // ex.InterfaceC2141e
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f10816a) {
            case 0:
                C2377b c2377b = (C2377b) create((InterfaceC7266z) obj, (InterfaceC7559c) obj2);
                a0 a0Var = a0.f30746a;
                c2377b.invokeSuspend(a0Var);
                return a0Var;
            case 1:
                C2377b c2377b2 = (C2377b) create((InterfaceC7266z) obj, (InterfaceC7559c) obj2);
                a0 a0Var2 = a0.f30746a;
                c2377b2.invokeSuspend(a0Var2);
                return a0Var2;
            default:
                C2377b c2377b3 = (C2377b) create((String) obj, (InterfaceC7559c) obj2);
                a0 a0Var3 = a0.f30746a;
                c2377b3.invokeSuspend(a0Var3);
                return a0Var3;
        }
    }

    @Override // ww.AbstractC8191a
    public final Object invokeSuspend(Object obj) {
        Object value;
        C2136a c2136a;
        Context context;
        int i10 = this.f10816a;
        a0 a0Var = a0.f30746a;
        C2386k c2386k = this.f10817b;
        switch (i10) {
            case 0:
                EnumC7794a enumC7794a = EnumC7794a.COROUTINE_SUSPENDED;
                od.m10798c(obj);
                m1 m1Var = c2386k.f10867r;
                do {
                    value = m1Var.getValue();
                    c2136a = (C2136a) value;
                    context = c2386k.f10851b;
                    AbstractC4154l.m8923f(context, "context");
                } while (!m1Var.m15397i(value, C2136a.m5817a(c2136a, null, null, null, null, AbstractC6468c.m12450a(context, "android.permission.RECORD_AUDIO") == 0, null, null, null, false, false, null, null, 0, false, null, null, null, null, null, null, 268435327)));
            case 1:
                EnumC7794a enumC7794a2 = EnumC7794a.COROUTINE_SUSPENDED;
                od.m10798c(obj);
                AbstractC5601a.m11254y(c2386k.f10851b, R.string.subscription_expired, "getString(...)", c2386k.f10856g);
                break;
            default:
                EnumC7794a enumC7794a3 = EnumC7794a.COROUTINE_SUSPENDED;
                od.m10798c(obj);
                C8810d c8810d = c2386k.f10860k;
                C0496f c0496f = m0.f34659a;
                c0.m13502y(c8810d, ExecutorC0495e.f3538c, null, new C2376a(c2386k, null, 10), 2);
                break;
        }
        return a0Var;
    }
}
