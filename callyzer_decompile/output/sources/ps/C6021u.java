package ps;

import android.content.Context;
import android.widget.Toast;
import as.C0428a;
import aw.C0471k;
import bs.C0751i;
import com.websoptimization.callyzerbiz.R;
import cr.C1480b;
import cs.C1497p;
import du.C1825g;
import du.C1829k;
import du.C1835q;
import ex.InterfaceC2137a;
import ex.InterfaceC2139c;
import ex.InterfaceC2141e;
import hq.C3002g;
import im.EnumC3313o;
import java.io.IOException;
import k2.w0;
import kotlin.jvm.internal.AbstractC4154l;
import kotlin.jvm.internal.C4164v;
import kotlin.jvm.internal.C4168z;
import ks.C4223l;
import ks.q0;
import l7.C4409i;
import mm.C4798i;
import mz.C4919c;
import or.AbstractC5453p;
import or.C5440c;
import or.C5442e;
import org.bouncycastle.iana.AEADAlgorithm;
import qw.C6361k;
import qz.C6398p;
import qz.C6406x;
import qz.EnumC6384b;
import rr.C6610j;
import rs.C6613c;
import ss.C6913b;
import ss.C6923l;
import ss.z0;
import su.C6952k;
import t1.AbstractC7000y;
import ts.EnumC7215b;
import tz.AbstractC7285d;
import u2.C7320q;
import ur.AbstractC7524q;
import ur.C7509b;
import us.C7536c;
import vt.C7771b;
import yp.C8735o;
import yr.C8756o;
import yt.C8770b;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: ps.u */
/* loaded from: classes3.dex */
public final /* synthetic */ class C6021u implements InterfaceC2137a {

    /* renamed from: a */
    public final /* synthetic */ int f29426a;

    /* renamed from: b */
    public final /* synthetic */ Object f29427b;

    /* renamed from: c */
    public final /* synthetic */ Object f29428c;

    public /* synthetic */ C6021u(int i10, Object obj, Object obj2) {
        this.f29426a = i10;
        this.f29427b = obj;
        this.f29428c = obj2;
    }

    @Override // ex.InterfaceC2137a
    public final Object invoke() throws NumberFormatException {
        long jM12369a;
        C6406x[] c6406xArr = null;
        c6406xArr = null;
        switch (this.f29426a) {
            case 0:
                z0 z0Var = (z0) this.f29427b;
                l7.a0 a0Var = (l7.a0) this.f29428c;
                z0Var.m13196s(new C6923l(EnumC7215b.NeedStoragePermission));
                l7.a0.m9181f(a0Var, "permission_not_granted");
                break;
            case 1:
                AbstractC7524q abstractC7524q = (AbstractC7524q) this.f29427b;
                C7320q c7320q = (C7320q) this.f29428c;
                abstractC7524q.mo2034f();
                c7320q.clear();
                c7320q.addAll(((ur.i0) abstractC7524q.f36253c.f39340a.getValue()).f36224a);
                break;
            case 2:
                AbstractC7524q abstractC7524q2 = (AbstractC7524q) this.f29427b;
                l7.a0 a0Var2 = (l7.a0) this.f29428c;
                abstractC7524q2.mo2033e(new C7509b(new hq.d0(18)));
                a0Var2.m9188g();
                break;
            case 3:
                ((InterfaceC2139c) this.f29427b).invoke(((C5440c) this.f29428c).f27354f);
                break;
            case 4:
                ((InterfaceC2139c) this.f29427b).invoke((C5442e) this.f29428c);
                break;
            case 5:
                ((InterfaceC2139c) this.f29427b).invoke(((C7320q) this.f29428c).m13701r().f34901c);
                break;
            case 6:
                C6913b c6913b = (C6913b) this.f29427b;
                C7536c c7536c = (C7536c) this.f29428c;
                c6913b.f33407h.invoke();
                c7536c.m14297e(C6613c.f31768a);
                break;
            case 7:
                C6398p c6398p = (C6398p) this.f29427b;
                C6406x c6406x = (C6406x) this.f29428c;
                try {
                    c6398p.f30845a.mo10199c(c6406x);
                } catch (IOException e2) {
                    AbstractC7285d abstractC7285d = AbstractC7285d.f34750a;
                    AbstractC7285d.f34750a.mo13616h("Http2Connection.Listener failure for " + c6398p.f30847c, 4, e2);
                    try {
                        c6406x.m12404c(EnumC6384b.PROTOCOL_ERROR, e2);
                    } catch (IOException unused) {
                    }
                }
                return qw.a0.f30746a;
            case 8:
                C0471k c0471k = (C0471k) this.f29427b;
                qz.b0 b0Var = (qz.b0) this.f29428c;
                C4168z c4168z = new C4168z();
                C6398p c6398p2 = (C6398p) c0471k.f3386c;
                synchronized (c6398p2.f30842B) {
                    synchronized (c6398p2) {
                        try {
                            qz.b0 b0Var2 = c6398p2.f30863v;
                            qz.b0 b0Var3 = new qz.b0();
                            b0Var3.m12370b(b0Var2);
                            b0Var3.m12370b(b0Var);
                            c4168z.f21164a = b0Var3;
                            jM12369a = b0Var3.m12369a() - b0Var2.m12369a();
                            if (jM12369a != 0 && !c6398p2.f30846b.isEmpty()) {
                                c6406xArr = (C6406x[]) c6398p2.f30846b.values().toArray(new C6406x[0]);
                            }
                            qz.b0 b0Var4 = (qz.b0) c4168z.f21164a;
                            AbstractC4154l.m8923f(b0Var4, "<set-?>");
                            c6398p2.f30863v = b0Var4;
                            C4919c.m9815c(c6398p2.f30854k, c6398p2.f30847c + " onSettings", new C6021u(9, c6398p2, c4168z));
                        } catch (Throwable th2) {
                            throw th2;
                        }
                    }
                    try {
                        c6398p2.f30842B.m12413h((qz.b0) c4168z.f21164a);
                    } catch (IOException e10) {
                        EnumC6384b enumC6384b = EnumC6384b.PROTOCOL_ERROR;
                        c6398p2.m12388h(enumC6384b, enumC6384b, e10);
                    }
                }
                if (c6406xArr != null) {
                    for (C6406x c6406x2 : c6406xArr) {
                        synchronized (c6406x2) {
                            c6406x2.f30901e += jM12369a;
                            if (jM12369a > 0) {
                                c6406x2.notifyAll();
                            }
                        }
                    }
                }
                return qw.a0.f30746a;
            case 9:
                C6398p c6398p3 = (C6398p) this.f29427b;
                c6398p3.f30845a.mo10198a(c6398p3, (qz.b0) ((C4168z) this.f29428c).f21164a);
                break;
            case 10:
                InterfaceC2137a interfaceC2137a = (InterfaceC2137a) this.f29427b;
                InterfaceC2141e interfaceC2141e = (InterfaceC2141e) this.f29428c;
                interfaceC2137a.invoke();
                interfaceC2141e.invoke(null, null);
                break;
            case 11:
                ((w0) this.f29428c).setValue((C5442e) ((AbstractC5453p) this.f29427b));
                break;
            case 12:
                ((InterfaceC2139c) this.f29427b).invoke(((C6610j) this.f29428c).f31763b);
                break;
            case 13:
                C4223l c4223l = (C4223l) this.f29427b;
                ((w0) this.f29428c).setValue(Boolean.TRUE);
                c4223l.m8961h(C1497p.f7583a);
                break;
            case 14:
                ks.c0 c0Var = (ks.c0) this.f29427b;
                ((w0) this.f29428c).setValue(Boolean.TRUE);
                c0Var.m8957r(C1497p.f7583a);
                break;
            case AEADAlgorithm.AEAD_AES_SIV_CMAC_256 /* 15 */:
                q0 q0Var = (q0) this.f29427b;
                ((w0) this.f29428c).setValue(Boolean.TRUE);
                q0Var.m8972o(C1497p.f7583a);
                break;
            case 16:
                ((InterfaceC2139c) this.f29427b).invoke((EnumC3313o) this.f29428c);
                break;
            case 17:
                C0751i c0751i = (C0751i) this.f29427b;
                InterfaceC2137a interfaceC2137a2 = (InterfaceC2137a) this.f29428c;
                c0751i.m2057q(C8756o.f42375a);
                interfaceC2137a2.invoke();
                break;
            case 18:
                C0751i c0751i2 = (C0751i) this.f29427b;
                ((w0) this.f29428c).setValue(Boolean.TRUE);
                c0751i2.m2058r(yr.d0.f42357a);
                break;
            case 19:
                ((InterfaceC2139c) this.f29427b).invoke(Boolean.valueOf(!((C0428a) this.f29428c).f3148b));
                break;
            case 20:
                return new C6361k(Integer.valueOf(((AbstractC7000y) this.f29427b).m13263j()), ((C8735o) this.f29428c).f42283v.getValue());
            case 21:
                ((InterfaceC2139c) this.f29427b).invoke((C4798i) this.f29428c);
                break;
            case 22:
                C8770b c8770b = (C8770b) this.f29427b;
                l7.a0 a0Var3 = (l7.a0) this.f29428c;
                c8770b.m16127e(C7771b.f37435a);
                a0Var3.m9188g();
                break;
            case 23:
                l7.a0 a0Var4 = (l7.a0) this.f29428c;
                w0 w0Var = (w0) this.f29427b;
                a0Var4.m9188g();
                l7.a0 a0Var5 = (l7.a0) w0Var.getValue();
                if ((a0Var5 != null ? a0Var5.f21996b.m12172g() : null) == null) {
                    a0Var4.m9187e(new C3002g(a0Var4, 8), "main_screen?tabScreen=lead");
                } else {
                    l7.a0 a0Var6 = (l7.a0) w0Var.getValue();
                    if (a0Var6 != null) {
                        l7.a0.m9181f(a0Var6, "lead");
                    }
                }
                return qw.a0.f30746a;
            case 24:
                C4164v c4164v = (C4164v) this.f29427b;
                l7.a0 a0Var7 = (l7.a0) this.f29428c;
                if (!c4164v.f21160a) {
                    c4164v.f21160a = true;
                    l7.a0.m9181f(a0Var7, "main_screen");
                }
                return qw.a0.f30746a;
            case 25:
                l7.a0.m9181f((l7.a0) this.f29428c, "filter_screen/" + ((C4409i) this.f29427b).f22046b.f22135b.f29940f);
                break;
            case 26:
                InterfaceC2141e interfaceC2141e2 = (InterfaceC2141e) this.f29427b;
                C1480b c1480b = (C1480b) this.f29428c;
                interfaceC2141e2.invoke(Integer.valueOf(c1480b.f7551a.f27143a), c1480b.f7551a.f27156n);
                break;
            case 27:
                C6952k c6952k = (C6952k) this.f29427b;
                w0 w0Var2 = (w0) this.f29428c;
                c6952k.m13203e(C1835q.f8813a);
                w0Var2.setValue(Boolean.FALSE);
                break;
            case 28:
                l7.a0 a0Var8 = (l7.a0) this.f29428c;
                C6952k c6952k2 = (C6952k) this.f29427b;
                l7.a0.m9181f(a0Var8, "permission_not_granted");
                c6952k2.m13203e(C1825g.f8802a);
                break;
            default:
                Context context = (Context) this.f29427b;
                C6952k c6952k3 = (C6952k) this.f29428c;
                Toast.makeText(context, context.getString(R.string.call_recording_process_in_background), 0).show();
                c6952k3.m13203e(new C1829k(true));
                break;
        }
        return qw.a0.f30746a;
    }

    public /* synthetic */ C6021u(l7.a0 a0Var, Object obj, int i10) {
        this.f29426a = i10;
        this.f29428c = a0Var;
        this.f29427b = obj;
    }
}
