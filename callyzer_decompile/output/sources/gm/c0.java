package gm;

import a3.C0043b;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.widget.Toast;
import androidx.fragment.app.C0348m;
import aq.C0406i;
import bs.AbstractC0755m;
import bs.C0751i;
import bs.C0752j;
import bs.C0753k;
import bs.C0754l;
import com.websoptimization.callyzerbiz.MainActivity;
import com.websoptimization.callyzerbiz.R;
import ex.InterfaceC2137a;
import ex.InterfaceC2141e;
import k2.b1;
import k2.h2;
import k2.w0;
import k4.C3991l;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.AbstractC4154l;
import o6.s0;
import og.od;
import ps.C6021u;
import tx.InterfaceC7266z;
import u1.C7303e;
import uw.InterfaceC7559c;
import v3.h1;
import vs.AbstractC7766h;
import vt.C7787r;
import vt.EnumC7772c;
import vw.EnumC7794a;
import ws.AbstractC8180u;
import ws.C8164e;
import ws.C8177r;
import ws.C8178s;
import ws.C8179t;
import wt.C8185c;
import ww.AbstractC8199i;
import xs.C8449k;
import xt.AbstractC8461l;
import yr.C8756o;
import yt.C8774f;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes3.dex */
public final class c0 extends AbstractC8199i implements InterfaceC2141e {

    /* renamed from: a */
    public final /* synthetic */ int f14232a;

    /* renamed from: b */
    public /* synthetic */ Object f14233b;

    /* renamed from: c */
    public final /* synthetic */ Object f14234c;

    /* renamed from: d */
    public final /* synthetic */ Object f14235d;

    /* renamed from: e */
    public final /* synthetic */ Object f14236e;

    /* renamed from: f */
    public final /* synthetic */ Object f14237f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c0(C0751i c0751i, InterfaceC2137a interfaceC2137a, InterfaceC2137a interfaceC2137a2, w0 w0Var, InterfaceC7559c interfaceC7559c) {
        super(2, interfaceC7559c);
        this.f14232a = 3;
        this.f14235d = c0751i;
        this.f14236e = interfaceC2137a;
        this.f14237f = interfaceC2137a2;
        this.f14234c = w0Var;
    }

    @Override // ww.AbstractC8191a
    public final InterfaceC7559c create(Object obj, InterfaceC7559c interfaceC7559c) {
        switch (this.f14232a) {
            case 0:
                return new c0((InterfaceC7266z) this.f14233b, (w0) this.f14234c, (MainActivity) this.f14236e, (b1) this.f14237f, (w0) this.f14235d, interfaceC7559c);
            case 1:
                c0 c0Var = new c0((C7303e) this.f14234c, (h1) this.f14235d, (C0043b) this.f14236e, (C0348m) this.f14237f, interfaceC7559c, 1);
                c0Var.f14233b = obj;
                return c0Var;
            case 2:
                c0 c0Var2 = new c0((C6021u) this.f14236e, (w0) this.f14234c, (w0) this.f14235d, (C8449k) this.f14237f, interfaceC7559c);
                c0Var2.f14233b = obj;
                return c0Var2;
            case 3:
                c0 c0Var3 = new c0((C0751i) this.f14235d, (InterfaceC2137a) this.f14236e, (InterfaceC2137a) this.f14237f, (w0) this.f14234c, interfaceC7559c);
                c0Var3.f14233b = obj;
                return c0Var3;
            default:
                c0 c0Var4 = new c0((l7.a0) this.f14234c, (h2) this.f14235d, (Context) this.f14236e, (C8774f) this.f14237f, interfaceC7559c, 4);
                c0Var4.f14233b = obj;
                return c0Var4;
        }
    }

    @Override // ex.InterfaceC2141e
    public final Object invoke(Object obj, Object obj2) throws NumberFormatException {
        switch (this.f14232a) {
            case 0:
                c0 c0Var = (c0) create((InterfaceC7266z) obj, (InterfaceC7559c) obj2);
                qw.a0 a0Var = qw.a0.f30746a;
                c0Var.invokeSuspend(a0Var);
                return a0Var;
            case 1:
                return ((c0) create((InterfaceC7266z) obj, (InterfaceC7559c) obj2)).invokeSuspend(qw.a0.f30746a);
            case 2:
                c0 c0Var2 = (c0) create((AbstractC8180u) obj, (InterfaceC7559c) obj2);
                qw.a0 a0Var2 = qw.a0.f30746a;
                c0Var2.invokeSuspend(a0Var2);
                return a0Var2;
            case 3:
                c0 c0Var3 = (c0) create((AbstractC0755m) obj, (InterfaceC7559c) obj2);
                qw.a0 a0Var3 = qw.a0.f30746a;
                c0Var3.invokeSuspend(a0Var3);
                return a0Var3;
            default:
                c0 c0Var4 = (c0) create((EnumC7772c) obj, (InterfaceC7559c) obj2);
                qw.a0 a0Var4 = qw.a0.f30746a;
                c0Var4.invokeSuspend(a0Var4);
                return a0Var4;
        }
    }

    @Override // ww.AbstractC8191a
    public final Object invokeSuspend(Object obj) throws NumberFormatException {
        int i10 = this.f14232a;
        qw.a0 a0Var = qw.a0.f30746a;
        Object obj2 = this.f14235d;
        Object obj3 = this.f14236e;
        Object obj4 = this.f14234c;
        Object obj5 = this.f14237f;
        switch (i10) {
            case 0:
                EnumC7794a enumC7794a = EnumC7794a.COROUTINE_SUSPENDED;
                od.m10798c(obj);
                InterfaceC7266z interfaceC7266z = (InterfaceC7266z) this.f14233b;
                MainActivity mainActivity = (MainActivity) obj3;
                tx.c0.m13502y(interfaceC7266z, null, null, new aw.d0((w0) obj4, mainActivity, (b1) obj5, (w0) obj2, null, 3), 3);
                tx.c0.m13502y(interfaceC7266z, null, null, new C0406i(mainActivity, (w0) obj4, (b1) obj5, null, 20), 3);
                return a0Var;
            case 1:
                EnumC7794a enumC7794a2 = EnumC7794a.COROUTINE_SUSPENDED;
                od.m10798c(obj);
                InterfaceC7266z interfaceC7266z2 = (InterfaceC7266z) this.f14233b;
                C7303e c7303e = (C7303e) obj4;
                InterfaceC7559c interfaceC7559c = null;
                tx.c0.m13502y(interfaceC7266z2, null, null, new s0(c7303e, (h1) obj2, (C0043b) obj3, interfaceC7559c, 10), 3);
                return tx.c0.m13502y(interfaceC7266z2, null, null, new ps.c0(c7303e, (C0348m) obj5, interfaceC7559c, 29), 3);
            case 2:
                AbstractC8180u abstractC8180u = (AbstractC8180u) this.f14233b;
                EnumC7794a enumC7794a3 = EnumC7794a.COROUTINE_SUSPENDED;
                od.m10798c(obj);
                C6021u c6021u = (C6021u) obj3;
                w0 w0Var = (w0) obj4;
                w0 w0Var2 = (w0) obj2;
                C8449k c8449k = (C8449k) obj5;
                C3991l c3991l = AbstractC7766h.f37417a;
                if (abstractC8180u instanceof C8177r) {
                    c6021u.invoke();
                } else if (abstractC8180u instanceof C8178s) {
                    w0Var2.setValue(Boolean.TRUE);
                } else {
                    if (!(abstractC8180u instanceof C8179t)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    c8449k.m15752h(C8164e.f39087a);
                    w0Var.setValue(Boolean.FALSE);
                }
                return a0Var;
            case 3:
                C0751i c0751i = (C0751i) obj2;
                w0 w0Var3 = (w0) obj4;
                AbstractC0755m abstractC0755m = (AbstractC0755m) this.f14233b;
                EnumC7794a enumC7794a4 = EnumC7794a.COROUTINE_SUSPENDED;
                od.m10798c(obj);
                boolean zM8918a = AbstractC4154l.m8918a(abstractC0755m, C0752j.f4764a);
                C8756o c8756o = C8756o.f42375a;
                if (zM8918a || AbstractC4154l.m8918a(abstractC0755m, C0753k.f4765a)) {
                    w0Var3.setValue(Boolean.TRUE);
                    c0751i.m2057q(c8756o);
                    ((InterfaceC2137a) obj3).invoke();
                } else {
                    if (!AbstractC4154l.m8918a(abstractC0755m, C0754l.f4766a)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    w0Var3.setValue(Boolean.TRUE);
                    c0751i.m2057q(c8756o);
                    ((InterfaceC2137a) obj5).invoke();
                }
                return a0Var;
            default:
                Context context = (Context) obj3;
                EnumC7772c enumC7772c = (EnumC7772c) this.f14233b;
                EnumC7794a enumC7794a5 = EnumC7794a.COROUTINE_SUSPENDED;
                od.m10798c(obj);
                int i11 = AbstractC8461l.f41258a[enumC7772c.ordinal()];
                if (i11 == 1) {
                    l7.a0.m9181f((l7.a0) obj4, "QR_scanner");
                } else if (i11 != 2) {
                    if (i11 != 3) {
                        throw new NoWhenBranchMatchedException();
                    }
                    try {
                        context.startActivity(new Intent("android.intent.action.VIEW", Uri.parse(((C8185c) ((h2) obj2).getValue()).f39152i)));
                    } catch (Exception e2) {
                        ((C8774f) obj5).m16129f(new C7787r(e2));
                        Toast.makeText(context, R.string.something_went_wrong_Please_try_again, 0).show();
                    }
                }
                return a0Var;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c0(Object obj, Object obj2, Object obj3, Object obj4, InterfaceC7559c interfaceC7559c, int i10) {
        super(2, interfaceC7559c);
        this.f14232a = i10;
        this.f14234c = obj;
        this.f14235d = obj2;
        this.f14236e = obj3;
        this.f14237f = obj4;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c0(C6021u c6021u, w0 w0Var, w0 w0Var2, C8449k c8449k, InterfaceC7559c interfaceC7559c) {
        super(2, interfaceC7559c);
        this.f14232a = 2;
        this.f14236e = c6021u;
        this.f14234c = w0Var;
        this.f14235d = w0Var2;
        this.f14237f = c8449k;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c0(InterfaceC7266z interfaceC7266z, w0 w0Var, MainActivity mainActivity, b1 b1Var, w0 w0Var2, InterfaceC7559c interfaceC7559c) {
        super(2, interfaceC7559c);
        this.f14232a = 0;
        this.f14233b = interfaceC7266z;
        this.f14234c = w0Var;
        this.f14236e = mainActivity;
        this.f14237f = b1Var;
        this.f14235d = w0Var2;
    }
}
