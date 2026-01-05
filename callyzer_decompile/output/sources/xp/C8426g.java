package xp;

import a9.C0065d;
import android.content.Context;
import android.content.IntentFilter;
import ap.C0397j;
import ar.C0424n;
import ar.C0425o;
import br.C0740c;
import com.websoptimization.callyzerbiz.data.model.request.AddDeviceRequest;
import d7.q0;
import dr.C1775y;
import en.AbstractC2072e;
import en.C2068a;
import en.C2069b;
import en.C2070c;
import en.C2071d;
import en.C2073f;
import er.C2106f;
import ex.InterfaceC2141e;
import gr.C2713i;
import hv.C3037b;
import hv.C3040e;
import hv.C3046k;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicReference;
import k2.w0;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.AbstractC4154l;
import kv.C4252f;
import og.od;
import p005f.C2162k;
import qp.C6273j;
import qv.C6328c;
import qv.C6338m;
import qw.a0;
import r5.AbstractC6468c;
import rv.C6632h;
import rv.p0;
import rw.AbstractC6663m;
import rw.C6668r;
import t1.C6979d;
import tx.InterfaceC7266z;
import tx.c0;
import tx.e1;
import tx.s1;
import u2.C7320q;
import uw.InterfaceC7559c;
import vw.EnumC7794a;
import wq.C8143b;
import wt.C8185c;
import ww.AbstractC8199i;
import wx.InterfaceC8209j;
import wx.m1;
import xv.C8489p;
import xv.C8491r;
import xv.C8492s;
import yp.C8735o;
import yt.C8769a;
import yt.C8774f;
import yv.C8800o;
import yv.C8805t;
import z1.C8847g;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: xp.g */
/* loaded from: classes3.dex */
public final class C8426g extends AbstractC8199i implements InterfaceC2141e {

    /* renamed from: a */
    public final /* synthetic */ int f41127a;

    /* renamed from: b */
    public /* synthetic */ Object f41128b;

    /* renamed from: c */
    public final /* synthetic */ Object f41129c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C8426g(C0740c c0740c, C2162k c2162k, InterfaceC7559c interfaceC7559c) {
        super(2, interfaceC7559c);
        this.f41127a = 13;
        this.f41129c = c0740c;
        this.f41128b = c2162k;
    }

    @Override // ww.AbstractC8191a
    public final InterfaceC7559c create(Object obj, InterfaceC7559c interfaceC7559c) {
        switch (this.f41127a) {
            case 0:
                return new C8426g((C2162k) this.f41128b, (C6273j) this.f41129c, interfaceC7559c, 0);
            case 1:
                return new C8426g((C2162k) this.f41128b, (w0) this.f41129c, interfaceC7559c, 1);
            case 2:
                return new C8426g((C2713i) this.f41128b, (InterfaceC8209j) this.f41129c, interfaceC7559c, 2);
            case 3:
                return new C8426g((C6338m) this.f41128b, (p0) this.f41129c, interfaceC7559c, 3);
            case 4:
                return new C8426g((C4252f) this.f41128b, (C6328c) this.f41129c, interfaceC7559c, 4);
            case 5:
                C8426g c8426g = new C8426g((C8489p) this.f41129c, interfaceC7559c, 5);
                c8426g.f41128b = obj;
                return c8426g;
            case 6:
                C8426g c8426g2 = new C8426g((C8492s) this.f41129c, interfaceC7559c, 6);
                c8426g2.f41128b = obj;
                return c8426g2;
            case 7:
                C8426g c8426g3 = new C8426g((C8735o) this.f41129c, interfaceC7559c, 7);
                c8426g3.f41128b = obj;
                return c8426g3;
            case 8:
                C8426g c8426g4 = new C8426g((C8774f) this.f41129c, interfaceC7559c, 8);
                c8426g4.f41128b = obj;
                return c8426g4;
            case 9:
                return new C8426g((String) this.f41128b, (C8805t) this.f41129c, interfaceC7559c, 9);
            case 10:
                return new C8426g((C8805t) this.f41128b, (Throwable) this.f41129c, interfaceC7559c, 10);
            case 11:
                C8426g c8426g5 = new C8426g((C8847g) this.f41129c, interfaceC7559c, 11);
                c8426g5.f41128b = obj;
                return c8426g5;
            case 12:
                return new C8426g((C6979d) this.f41128b, (C1775y) this.f41129c, interfaceC7559c, 12);
            default:
                return new C8426g((C0740c) this.f41129c, (C2162k) this.f41128b, interfaceC7559c);
        }
    }

    @Override // ex.InterfaceC2141e
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f41127a) {
            case 0:
                C8426g c8426g = (C8426g) create((InterfaceC7266z) obj, (InterfaceC7559c) obj2);
                a0 a0Var = a0.f30746a;
                c8426g.invokeSuspend(a0Var);
                return a0Var;
            case 1:
                C8426g c8426g2 = (C8426g) create((InterfaceC7266z) obj, (InterfaceC7559c) obj2);
                a0 a0Var2 = a0.f30746a;
                c8426g2.invokeSuspend(a0Var2);
                return a0Var2;
            case 2:
                C8426g c8426g3 = (C8426g) create((InterfaceC7266z) obj, (InterfaceC7559c) obj2);
                a0 a0Var3 = a0.f30746a;
                c8426g3.invokeSuspend(a0Var3);
                return a0Var3;
            case 3:
                C8426g c8426g4 = (C8426g) create((InterfaceC7266z) obj, (InterfaceC7559c) obj2);
                a0 a0Var4 = a0.f30746a;
                c8426g4.invokeSuspend(a0Var4);
                return a0Var4;
            case 4:
                C8426g c8426g5 = (C8426g) create((InterfaceC7266z) obj, (InterfaceC7559c) obj2);
                a0 a0Var5 = a0.f30746a;
                c8426g5.invokeSuspend(a0Var5);
                return a0Var5;
            case 5:
                C8426g c8426g6 = (C8426g) create((C2073f) obj, (InterfaceC7559c) obj2);
                a0 a0Var6 = a0.f30746a;
                c8426g6.invokeSuspend(a0Var6);
                return a0Var6;
            case 6:
                C8426g c8426g7 = (C8426g) create((AbstractC2072e) obj, (InterfaceC7559c) obj2);
                a0 a0Var7 = a0.f30746a;
                c8426g7.invokeSuspend(a0Var7);
                return a0Var7;
            case 7:
                C8426g c8426g8 = (C8426g) create((List) obj, (InterfaceC7559c) obj2);
                a0 a0Var8 = a0.f30746a;
                c8426g8.invokeSuspend(a0Var8);
                return a0Var8;
            case 8:
                C8426g c8426g9 = (C8426g) create((List) obj, (InterfaceC7559c) obj2);
                a0 a0Var9 = a0.f30746a;
                c8426g9.invokeSuspend(a0Var9);
                return a0Var9;
            case 9:
                C8426g c8426g10 = (C8426g) create((InterfaceC7266z) obj, (InterfaceC7559c) obj2);
                a0 a0Var10 = a0.f30746a;
                c8426g10.invokeSuspend(a0Var10);
                return a0Var10;
            case 10:
                C8426g c8426g11 = (C8426g) create((InterfaceC7266z) obj, (InterfaceC7559c) obj2);
                a0 a0Var11 = a0.f30746a;
                c8426g11.invokeSuspend(a0Var11);
                return a0Var11;
            case 11:
                return ((C8426g) create((InterfaceC7266z) obj, (InterfaceC7559c) obj2)).invokeSuspend(a0.f30746a);
            case 12:
                C8426g c8426g12 = (C8426g) create((InterfaceC7266z) obj, (InterfaceC7559c) obj2);
                a0 a0Var12 = a0.f30746a;
                c8426g12.invokeSuspend(a0Var12);
                return a0Var12;
            default:
                C8426g c8426g13 = (C8426g) create((InterfaceC7266z) obj, (InterfaceC7559c) obj2);
                a0 a0Var13 = a0.f30746a;
                c8426g13.invokeSuspend(a0Var13);
                return a0Var13;
        }
    }

    @Override // ww.AbstractC8191a
    public final Object invokeSuspend(Object obj) {
        Object value;
        Object value2;
        Object value3;
        Object value4;
        Object value5;
        Object value6;
        C7320q c7320q;
        Object value7;
        int i10 = this.f41127a;
        boolean z6 = false;
        InterfaceC7559c interfaceC7559c = null;
        int i11 = 3;
        int i12 = 2;
        int i13 = 1;
        a0 a0Var = a0.f30746a;
        Object obj2 = this.f41129c;
        switch (i10) {
            case 0:
                EnumC7794a enumC7794a = EnumC7794a.COROUTINE_SUSPENDED;
                od.m10798c(obj);
                ((C2162k) this.f41128b).mo1274a(((C6273j) obj2).f30463t);
                return a0Var;
            case 1:
                EnumC7794a enumC7794a2 = EnumC7794a.COROUTINE_SUSPENDED;
                od.m10798c(obj);
                C2162k c2162k = (C2162k) this.f41128b;
                String str = ((C8143b) ((w0) obj2).getValue()).f39015n;
                AbstractC4154l.m8920c(str);
                c2162k.mo1274a(str);
                return a0Var;
            case 2:
                EnumC7794a enumC7794a3 = EnumC7794a.COROUTINE_SUSPENDED;
                od.m10798c(obj);
                ((C2713i) this.f41128b).m6713f(new C2106f((InterfaceC8209j) obj2));
                return a0Var;
            case 3:
                EnumC7794a enumC7794a4 = EnumC7794a.COROUTINE_SUSPENDED;
                od.m10798c(obj);
                m1 m1Var = ((C6338m) this.f41128b).f30725h;
                if (!((C6328c) m1Var.getValue()).f30687c.isEmpty()) {
                    AddDeviceRequest addDeviceRequest = (AddDeviceRequest) AbstractC6663m.m12742F(((C6328c) m1Var.getValue()).f30687c);
                    ((p0) obj2).m12682m(new C6632h(addDeviceRequest.m4636d(), new Integer(addDeviceRequest.m4634b())));
                }
                return a0Var;
            case 4:
                EnumC7794a enumC7794a5 = EnumC7794a.COROUTINE_SUSPENDED;
                od.m10798c(obj);
                C4252f c4252f = (C4252f) this.f41128b;
                C6328c c6328c = (C6328c) obj2;
                c4252f.m8982g(new C3040e(c6328c.f30685a));
                c4252f.m8982g(new C3046k(c6328c.f30688d));
                List list = c6328c.f30687c;
                Objects.toString(list);
                c4252f.m8982g(new C3037b(list));
                return a0Var;
            case 5:
                C8489p c8489p = (C8489p) obj2;
                Context context = c8489p.f41354b;
                C2073f c2073f = (C2073f) this.f41128b;
                EnumC7794a enumC7794a6 = EnumC7794a.COROUTINE_SUSPENDED;
                od.m10798c(obj);
                if (!c2073f.f9689d) {
                    C0065d c0065d = c8489p.f41353I;
                    if (c0065d != null) {
                        context.unregisterReceiver(c0065d);
                    }
                } else if (c8489p.f41353I == null) {
                    C0065d c0065d2 = new C0065d(i11, c8489p);
                    c8489p.f41353I = c0065d2;
                    AbstractC6468c.m12453d(context, c0065d2, new IntentFilter("android.intent.action.DOWNLOAD_COMPLETE"));
                }
                return a0Var;
            case 6:
                C8492s c8492s = (C8492s) obj2;
                m1 m1Var2 = c8492s.f41385d;
                AbstractC2072e abstractC2072e = (AbstractC2072e) this.f41128b;
                EnumC7794a enumC7794a7 = EnumC7794a.COROUTINE_SUSPENDED;
                od.m10798c(obj);
                if (AbstractC4154l.m8918a(abstractC2072e, C2070c.f9684a)) {
                    do {
                        value4 = m1Var2.getValue();
                    } while (!m1Var2.m15397i(value4, C0397j.m1433a((C0397j) value4, true, 5)));
                } else if (AbstractC4154l.m8918a(abstractC2072e, C2068a.f9682a)) {
                    do {
                        value3 = m1Var2.getValue();
                    } while (!m1Var2.m15397i(value3, C0397j.m1433a((C0397j) value3, false, 1)));
                    c0.m13502y(q0.m5340g(c8492s), null, null, new C8491r(c8492s, interfaceC7559c, i13), 3);
                } else if (AbstractC4154l.m8918a(abstractC2072e, C2071d.f9685a)) {
                    do {
                        value2 = m1Var2.getValue();
                    } while (!m1Var2.m15397i(value2, C0397j.m1433a((C0397j) value2, false, 4)));
                    c0.m13502y(q0.m5340g(c8492s), null, null, new C8491r(c8492s, interfaceC7559c, i12), 3);
                } else {
                    if (!AbstractC4154l.m8918a(abstractC2072e, C2069b.f9683a)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    do {
                        value = m1Var2.getValue();
                    } while (!m1Var2.m15397i(value, C0397j.m1433a((C0397j) value, false, 5)));
                }
                return a0Var;
            case 7:
                List list2 = (List) this.f41128b;
                EnumC7794a enumC7794a8 = EnumC7794a.COROUTINE_SUSPENDED;
                od.m10798c(obj);
                m1 m1Var3 = ((C8735o) obj2).f42276o;
                do {
                    value5 = m1Var3.getValue();
                } while (!m1Var3.m15397i(value5, C6273j.m12277a((C6273j) value5, C6668r.f31943a, false, false, false, false, false, 0, null, null, false, null, null, null, null, false, false, false, null, null, false, 4194302)));
                do {
                    value6 = m1Var3.getValue();
                    c7320q = new C7320q();
                    c7320q.addAll(list2);
                } while (!m1Var3.m15397i(value6, C6273j.m12277a((C6273j) value6, c7320q, false, list2.isEmpty(), false, false, false, 0, null, null, false, null, null, null, null, false, false, false, null, null, false, 4194298)));
                return a0Var;
            case 8:
                List list3 = (List) this.f41128b;
                EnumC7794a enumC7794a9 = EnumC7794a.COROUTINE_SUSPENDED;
                od.m10798c(obj);
                m1 m1Var4 = ((C8774f) obj2).f42415g;
                do {
                    value7 = m1Var4.getValue();
                } while (!m1Var4.m15397i(value7, C8185c.m15342a((C8185c) value7, false, list3, false, false, 0, null, null, false, null, 509)));
                return a0Var;
            case 9:
                C8805t c8805t = (C8805t) obj2;
                EnumC7794a enumC7794a10 = EnumC7794a.COROUTINE_SUSPENDED;
                od.m10798c(obj);
                String str2 = (String) this.f41128b;
                if (str2.length() > 0) {
                    try {
                        C8805t.m16228c(c8805t, str2);
                    } catch (IOException e2) {
                        C8805t.m16226a(c8805t, str2, e2);
                    } catch (NullPointerException e10) {
                        C8805t.m16226a(c8805t, str2, e10);
                    }
                }
                return a0Var;
            case 10:
                C8805t c8805t2 = (C8805t) this.f41128b;
                EnumC7794a enumC7794a11 = EnumC7794a.COROUTINE_SUSPENDED;
                od.m10798c(obj);
                try {
                    PrintWriter printWriter = new PrintWriter(new FileWriter(c8805t2.m16229d(), true));
                    C8800o c8800o = C8800o.f42459a;
                    printWriter.println(C8800o.m16190N(System.currentTimeMillis()));
                    ((Throwable) obj2).printStackTrace(printWriter);
                    printWriter.flush();
                    printWriter.close();
                } catch (IOException e11) {
                    c8805t2.m16236k(e11);
                    c8805t2.m16230e(e11);
                }
                return a0Var;
            case 11:
                EnumC7794a enumC7794a12 = EnumC7794a.COROUTINE_SUSPENDED;
                od.m10798c(obj);
                InterfaceC7266z interfaceC7266z = (InterfaceC7266z) this.f41128b;
                C8847g c8847g = (C8847g) obj2;
                e1 e1Var = (e1) c8847g.f42579b.getAndSet(null);
                AtomicReference atomicReference = c8847g.f42579b;
                s1 s1VarM13502y = c0.m13502y(interfaceC7266z, null, null, new C8769a(e1Var, c8847g, interfaceC7559c, i12), 3);
                while (true) {
                    if (atomicReference.compareAndSet(null, s1VarM13502y)) {
                        z6 = true;
                    } else if (atomicReference.get() != null) {
                    }
                }
                return Boolean.valueOf(z6);
            case 12:
                C1775y c1775y = (C1775y) obj2;
                EnumC7794a enumC7794a13 = EnumC7794a.COROUTINE_SUSPENDED;
                od.m10798c(obj);
                C6979d c6979d = (C6979d) this.f41128b;
                if (c6979d.m13263j() == 2) {
                    c1775y.m5459s(C0424n.f3144a);
                } else if (c6979d.m13263j() == 0 || c6979d.m13263j() == 1) {
                    c1775y.m5459s(C0425o.f3145a);
                }
                return a0Var;
            default:
                EnumC7794a enumC7794a14 = EnumC7794a.COROUTINE_SUSPENDED;
                od.m10798c(obj);
                String str3 = ((C0740c) obj2).f4684r;
                if (str3 != null) {
                    ((C2162k) this.f41128b).mo1274a(str3);
                }
                return a0Var;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C8426g(Object obj, Object obj2, InterfaceC7559c interfaceC7559c, int i10) {
        super(2, interfaceC7559c);
        this.f41127a = i10;
        this.f41128b = obj;
        this.f41129c = obj2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C8426g(Object obj, InterfaceC7559c interfaceC7559c, int i10) {
        super(2, interfaceC7559c);
        this.f41127a = i10;
        this.f41129c = obj;
    }
}
