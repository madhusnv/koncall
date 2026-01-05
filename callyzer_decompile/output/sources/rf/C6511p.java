package rf;

import a1.C0007f;
import android.content.Context;
import android.content.res.Resources;
import android.os.DeadObjectException;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.SparseIntArray;
import bk.RunnableC0683n;
import c9.C0910e;
import c9.C0927v;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.UnsupportedApiCallException;
import com.google.android.gms.internal.measurement.h0;
import com.google.android.material.datepicker.RunnableC1342f;
import com.sun.mail.util.AbstractC1452a;
import e1.C1903e;
import e1.C1904f;
import ig.C3245a;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Set;
import k4.C4001v;
import l4.C4367l;
import p020v.x0;
import pf.C5902b;
import pf.C5904d;
import pf.C5905e;
import qf.AbstractC6206e;
import qf.InterfaceC6204c;
import qf.InterfaceC6207f;
import qf.InterfaceC6208g;
import sf.AbstractC6819e;
import sf.AbstractC6840z;
import sf.C6826l;
import uf.C7429d;
import vg.C7709a;
import wg.C8028a;
import yg.C8650g;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: rf.p */
/* loaded from: classes.dex */
public final class C6511p implements InterfaceC6207f, InterfaceC6208g {

    /* renamed from: f */
    public final InterfaceC6204c f31256f;

    /* renamed from: g */
    public final C6496a f31257g;

    /* renamed from: h */
    public final C0910e f31258h;

    /* renamed from: k */
    public final int f31261k;

    /* renamed from: l */
    public final BinderC6520y f31262l;

    /* renamed from: m */
    public boolean f31263m;

    /* renamed from: q */
    public final /* synthetic */ C6500e f31267q;

    /* renamed from: e */
    public final LinkedList f31255e = new LinkedList();

    /* renamed from: i */
    public final HashSet f31259i = new HashSet();

    /* renamed from: j */
    public final HashMap f31260j = new HashMap();

    /* renamed from: n */
    public final ArrayList f31264n = new ArrayList();

    /* renamed from: o */
    public C5902b f31265o = null;

    /* renamed from: p */
    public int f31266p = 0;

    /* JADX WARN: Multi-variable type inference failed */
    public C6511p(C6500e c6500e, AbstractC6206e abstractC6206e) {
        this.f31267q = c6500e;
        Looper looper = c6500e.f31236p.getLooper();
        C4367l c4367lM12222a = abstractC6206e.m12222a();
        x0 x0Var = new x0((String) c4367lM12222a.f21922c, (String) c4367lM12222a.f21923d, (C1904f) c4367lM12222a.f21921b);
        C3245a c3245a = (C3245a) abstractC6206e.f30189c.f5579b;
        AbstractC6840z.m13036g(c3245a);
        InterfaceC6204c interfaceC6204cM7582a = c3245a.m7582a(abstractC6206e.f30187a, looper, x0Var, abstractC6206e.f30190d, this, this);
        String str = abstractC6206e.f30188b;
        if (str != null && (interfaceC6204cM7582a instanceof AbstractC6819e)) {
            ((AbstractC6819e) interfaceC6204cM7582a).f32398v = str;
        }
        if (str != null && (interfaceC6204cM7582a instanceof AbstractServiceConnectionC6504i)) {
            AbstractC1452a.m4578y(interfaceC6204cM7582a);
            throw null;
        }
        this.f31256f = interfaceC6204cM7582a;
        this.f31257g = abstractC6206e.f30191e;
        this.f31258h = new C0910e(14);
        this.f31261k = abstractC6206e.f30193g;
        if (!interfaceC6204cM7582a.mo12221m()) {
            this.f31262l = null;
            return;
        }
        Context context = c6500e.f31227e;
        h0 h0Var = c6500e.f31236p;
        C4367l c4367lM12222a2 = abstractC6206e.m12222a();
        this.f31262l = new BinderC6520y(context, h0Var, new x0((String) c4367lM12222a2.f21922c, (String) c4367lM12222a2.f21923d, (C1904f) c4367lM12222a2.f21921b));
    }

    /* renamed from: a */
    public final void m12529a(C5902b c5902b) {
        HashSet hashSet = this.f31259i;
        Iterator it = hashSet.iterator();
        if (!it.hasNext()) {
            hashSet.clear();
        } else {
            if (it.next() != null) {
                throw new ClassCastException();
            }
            if (AbstractC6840z.m13040k(c5902b, C5902b.f28734e)) {
                this.f31256f.m12213d();
            }
            throw null;
        }
    }

    /* renamed from: b */
    public final void m12530b(Status status) {
        AbstractC6840z.m13032c(this.f31267q.f31236p);
        m12531c(status, null, false);
    }

    /* renamed from: c */
    public final void m12531c(Status status, Exception exc, boolean z6) {
        AbstractC6840z.m13032c(this.f31267q.f31236p);
        if ((status == null) == (exc == null)) {
            throw new IllegalArgumentException("Status XOR exception should be null");
        }
        Iterator it = this.f31255e.iterator();
        while (it.hasNext()) {
            c0 c0Var = (c0) it.next();
            if (!z6 || c0Var.f31216a == 2) {
                if (status != null) {
                    c0Var.mo12502a(status);
                } else {
                    c0Var.mo12503b(exc);
                }
                it.remove();
            }
        }
    }

    @Override // qf.InterfaceC6208g
    /* renamed from: d */
    public final void mo12226d(C5902b c5902b) {
        m12540o(c5902b, null);
    }

    /* renamed from: e */
    public final void m12532e() {
        LinkedList linkedList = this.f31255e;
        ArrayList arrayList = new ArrayList(linkedList);
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            c0 c0Var = (c0) arrayList.get(i10);
            if (!this.f31256f.m12216g()) {
                return;
            }
            if (m12536k(c0Var)) {
                linkedList.remove(c0Var);
            }
        }
    }

    @Override // qf.InterfaceC6207f
    /* renamed from: f */
    public final void mo12224f(int i10) {
        Looper looperMyLooper = Looper.myLooper();
        h0 h0Var = this.f31267q.f31236p;
        if (looperMyLooper == h0Var.getLooper()) {
            m12534i(i10);
        } else {
            h0Var.post(new RunnableC1342f(this, i10, 1));
        }
    }

    @Override // qf.InterfaceC6207f
    /* renamed from: g */
    public final void mo12225g() {
        Looper looperMyLooper = Looper.myLooper();
        h0 h0Var = this.f31267q.f31236p;
        if (looperMyLooper == h0Var.getLooper()) {
            m12533h();
        } else {
            h0Var.post(new RunnableC0683n(12, this));
        }
    }

    /* renamed from: h */
    public final void m12533h() {
        C6500e c6500e = this.f31267q;
        AbstractC6840z.m13032c(c6500e.f31236p);
        this.f31265o = null;
        m12529a(C5902b.f28734e);
        h0 h0Var = c6500e.f31236p;
        if (this.f31263m) {
            C6496a c6496a = this.f31257g;
            h0Var.removeMessages(11, c6496a);
            h0Var.removeMessages(9, c6496a);
            this.f31263m = false;
        }
        Iterator it = this.f31260j.values().iterator();
        if (it.hasNext()) {
            throw null;
        }
        m12532e();
        m12535j();
    }

    /* renamed from: i */
    public final void m12534i(int i10) {
        C6500e c6500e = this.f31267q;
        h0 h0Var = c6500e.f31236p;
        AbstractC6840z.m13032c(c6500e.f31236p);
        this.f31265o = null;
        this.f31263m = true;
        String strM12220l = this.f31256f.m12220l();
        C0910e c0910e = this.f31258h;
        c0910e.getClass();
        StringBuilder sb2 = new StringBuilder("The connection to Google Play services was lost");
        if (i10 == 1) {
            sb2.append(" due to service disconnection.");
        } else if (i10 == 3) {
            sb2.append(" due to dead object exception.");
        }
        if (strM12220l != null) {
            sb2.append(" Last reason for disconnect: ");
            sb2.append(strM12220l);
        }
        c0910e.m2594N(true, new Status(20, sb2.toString(), null, null));
        C6496a c6496a = this.f31257g;
        h0Var.sendMessageDelayed(Message.obtain(h0Var, 9, c6496a), 5000L);
        h0Var.sendMessageDelayed(Message.obtain(h0Var, 11, c6496a), 120000L);
        ((SparseIntArray) c6500e.f31229g.f5668b).clear();
        Iterator it = this.f31260j.values().iterator();
        while (it.hasNext()) {
            ((AbstractC6519x) it.next()).getClass();
        }
    }

    /* renamed from: j */
    public final void m12535j() {
        C6500e c6500e = this.f31267q;
        h0 h0Var = c6500e.f31236p;
        C6496a c6496a = this.f31257g;
        h0Var.removeMessages(12, c6496a);
        h0Var.sendMessageDelayed(h0Var.obtainMessage(12, c6496a), c6500e.f31223a);
    }

    /* renamed from: k */
    public final boolean m12536k(c0 c0Var) throws Resources.NotFoundException {
        C5904d c5904d;
        if (!(c0Var instanceof AbstractC6515t)) {
            C0910e c0910e = this.f31258h;
            InterfaceC6204c interfaceC6204c = this.f31256f;
            c0Var.mo12505d(c0910e, interfaceC6204c.mo12221m());
            try {
                c0Var.mo12504c(this);
                return true;
            } catch (DeadObjectException unused) {
                mo12224f(1);
                interfaceC6204c.m12211b("DeadObjectException thrown while running ApiCallRunner.");
                return true;
            }
        }
        AbstractC6515t abstractC6515t = (AbstractC6515t) c0Var;
        C5904d[] c5904dArrMo12507g = abstractC6515t.mo12507g(this);
        if (c5904dArrMo12507g == null || c5904dArrMo12507g.length == 0) {
            c5904d = null;
        } else {
            C5904d[] c5904dArrM12219k = this.f31256f.m12219k();
            if (c5904dArrM12219k == null) {
                c5904dArrM12219k = new C5904d[0];
            }
            C1903e c1903e = new C1903e(c5904dArrM12219k.length);
            for (C5904d c5904d2 : c5904dArrM12219k) {
                c1903e.put(c5904d2.f28742a, Long.valueOf(c5904d2.m11508b()));
            }
            int length = c5904dArrMo12507g.length;
            for (int i10 = 0; i10 < length; i10++) {
                c5904d = c5904dArrMo12507g[i10];
                Long l9 = (Long) c1903e.get(c5904d.f28742a);
                if (l9 == null || l9.longValue() < c5904d.m11508b()) {
                    break;
                }
            }
            c5904d = null;
        }
        if (c5904d == null) {
            C0910e c0910e2 = this.f31258h;
            InterfaceC6204c interfaceC6204c2 = this.f31256f;
            c0Var.mo12505d(c0910e2, interfaceC6204c2.mo12221m());
            try {
                c0Var.mo12504c(this);
                return true;
            } catch (DeadObjectException unused2) {
                mo12224f(1);
                interfaceC6204c2.m12211b("DeadObjectException thrown while running ApiCallRunner.");
                return true;
            }
        }
        this.f31256f.getClass();
        if (!this.f31267q.f31237q || !abstractC6515t.mo12506f(this)) {
            abstractC6515t.mo12503b(new UnsupportedApiCallException(c5904d));
            return true;
        }
        C6512q c6512q = new C6512q(this.f31257g, c5904d);
        int iIndexOf = this.f31264n.indexOf(c6512q);
        if (iIndexOf >= 0) {
            C6512q c6512q2 = (C6512q) this.f31264n.get(iIndexOf);
            this.f31267q.f31236p.removeMessages(15, c6512q2);
            h0 h0Var = this.f31267q.f31236p;
            h0Var.sendMessageDelayed(Message.obtain(h0Var, 15, c6512q2), 5000L);
        } else {
            this.f31264n.add(c6512q);
            h0 h0Var2 = this.f31267q.f31236p;
            h0Var2.sendMessageDelayed(Message.obtain(h0Var2, 15, c6512q), 5000L);
            h0 h0Var3 = this.f31267q.f31236p;
            h0Var3.sendMessageDelayed(Message.obtain(h0Var3, 16, c6512q), 120000L);
            C5902b c5902b = new C5902b(2, null);
            if (!m12537l(c5902b)) {
                this.f31267q.m12518d(c5902b, this.f31261k);
            }
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0042, code lost:
    
        if (r7.get() == null) goto L30;
     */
    /* renamed from: l */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean m12537l(pf.C5902b r7) {
        /*
            r6 = this;
            java.lang.Object r0 = rf.C6500e.f31221t
            monitor-enter(r0)
            rf.e r1 = r6.f31267q     // Catch: java.lang.Throwable -> L47
            rf.m r2 = r1.f31233l     // Catch: java.lang.Throwable -> L47
            if (r2 == 0) goto L49
            e1.f r1 = r1.f31234m     // Catch: java.lang.Throwable -> L47
            rf.a r2 = r6.f31257g     // Catch: java.lang.Throwable -> L47
            boolean r1 = r1.contains(r2)     // Catch: java.lang.Throwable -> L47
            if (r1 == 0) goto L49
            rf.e r1 = r6.f31267q     // Catch: java.lang.Throwable -> L47
            rf.m r1 = r1.f31233l     // Catch: java.lang.Throwable -> L47
            int r2 = r6.f31261k     // Catch: java.lang.Throwable -> L47
            r1.getClass()     // Catch: java.lang.Throwable -> L47
            rf.d0 r3 = new rf.d0     // Catch: java.lang.Throwable -> L47
            r3.<init>(r7, r2)     // Catch: java.lang.Throwable -> L47
        L21:
            java.util.concurrent.atomic.AtomicReference r7 = r1.f31247c     // Catch: java.lang.Throwable -> L47
        L23:
            r2 = 0
            boolean r2 = r7.compareAndSet(r2, r3)     // Catch: java.lang.Throwable -> L47
            if (r2 == 0) goto L38
            com.google.android.gms.internal.measurement.h0 r7 = r1.f31248d     // Catch: java.lang.Throwable -> L47
            zh.c r2 = new zh.c     // Catch: java.lang.Throwable -> L47
            r4 = 10
            r5 = 0
            r2.<init>(r4, r1, r3, r5)     // Catch: java.lang.Throwable -> L47
            r7.post(r2)     // Catch: java.lang.Throwable -> L47
            goto L44
        L38:
            java.lang.Object r2 = r7.get()     // Catch: java.lang.Throwable -> L47
            if (r2 == 0) goto L23
            java.lang.Object r7 = r7.get()     // Catch: java.lang.Throwable -> L47
            if (r7 == 0) goto L21
        L44:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L47
            r7 = 1
            return r7
        L47:
            r7 = move-exception
            goto L4c
        L49:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L47
            r7 = 0
            return r7
        L4c:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L47
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: rf.C6511p.m12537l(pf.b):boolean");
    }

    /* renamed from: m */
    public final void m12538m() {
        C6500e c6500e = this.f31267q;
        AbstractC6840z.m13032c(c6500e.f31236p);
        InterfaceC6204c interfaceC6204c = this.f31256f;
        if (interfaceC6204c.m12216g() || interfaceC6204c.m12212c()) {
            return;
        }
        try {
            C0927v c0927v = c6500e.f31229g;
            Context context = c6500e.f31227e;
            SparseIntArray sparseIntArray = (SparseIntArray) c0927v.f5668b;
            AbstractC6840z.m13036g(context);
            int iMo7588i = interfaceC6204c.mo7588i();
            int iM11516c = ((SparseIntArray) c0927v.f5668b).get(iMo7588i, -1);
            if (iM11516c == -1) {
                iM11516c = 0;
                int i10 = 0;
                while (true) {
                    if (i10 >= sparseIntArray.size()) {
                        iM11516c = -1;
                        break;
                    }
                    int iKeyAt = sparseIntArray.keyAt(i10);
                    if (iKeyAt > iMo7588i && sparseIntArray.get(iKeyAt) == 0) {
                        break;
                    } else {
                        i10++;
                    }
                }
                if (iM11516c == -1) {
                    iM11516c = ((C5905e) c0927v.f5669c).m11516c(context, iMo7588i);
                }
                sparseIntArray.put(iMo7588i, iM11516c);
            }
            if (iM11516c != 0) {
                C5902b c5902b = new C5902b(iM11516c, null);
                c5902b.toString();
                m12540o(c5902b, null);
                return;
            }
            C0007f c0007f = new C0007f(c6500e, interfaceC6204c, this.f31257g);
            if (interfaceC6204c.mo12221m()) {
                BinderC6520y binderC6520y = this.f31262l;
                AbstractC6840z.m13036g(binderC6520y);
                Handler handler = binderC6520y.f31288g;
                x0 x0Var = binderC6520y.f31291j;
                C8028a c8028a = binderC6520y.f31292k;
                if (c8028a != null) {
                    c8028a.m12214e();
                }
                x0Var.f36759g = Integer.valueOf(System.identityHashCode(binderC6520y));
                binderC6520y.f31292k = (C8028a) binderC6520y.f31289h.m7582a(binderC6520y.f31287f, handler.getLooper(), x0Var, (C7709a) x0Var.f36758f, binderC6520y, binderC6520y);
                binderC6520y.f31293l = c0007f;
                Set set = binderC6520y.f31290i;
                if (set == null || set.isEmpty()) {
                    handler.post(new RunnableC0683n(14, binderC6520y));
                } else {
                    C8028a c8028a2 = binderC6520y.f31292k;
                    c8028a2.getClass();
                    c8028a2.m13000f(new C6826l(c8028a2));
                }
            }
            try {
                interfaceC6204c.m12215f(c0007f);
            } catch (SecurityException e2) {
                m12540o(new C5902b(10), e2);
            }
        } catch (IllegalStateException e10) {
            m12540o(new C5902b(10), e10);
        }
    }

    /* renamed from: n */
    public final void m12539n(c0 c0Var) {
        AbstractC6840z.m13032c(this.f31267q.f31236p);
        boolean zM12216g = this.f31256f.m12216g();
        LinkedList linkedList = this.f31255e;
        if (zM12216g) {
            if (m12536k(c0Var)) {
                m12535j();
                return;
            } else {
                linkedList.add(c0Var);
                return;
            }
        }
        linkedList.add(c0Var);
        C5902b c5902b = this.f31265o;
        if (c5902b == null || c5902b.f28736b == 0 || c5902b.f28737c == null) {
            m12538m();
        } else {
            m12540o(c5902b, null);
        }
    }

    /* renamed from: o */
    public final void m12540o(C5902b c5902b, RuntimeException runtimeException) {
        C8028a c8028a;
        AbstractC6840z.m13032c(this.f31267q.f31236p);
        BinderC6520y binderC6520y = this.f31262l;
        if (binderC6520y != null && (c8028a = binderC6520y.f31292k) != null) {
            c8028a.m12214e();
        }
        AbstractC6840z.m13032c(this.f31267q.f31236p);
        this.f31265o = null;
        ((SparseIntArray) this.f31267q.f31229g.f5668b).clear();
        m12529a(c5902b);
        if ((this.f31256f instanceof C7429d) && c5902b.f28736b != 24) {
            C6500e c6500e = this.f31267q;
            c6500e.f31224b = true;
            h0 h0Var = c6500e.f31236p;
            h0Var.sendMessageDelayed(h0Var.obtainMessage(19), 300000L);
        }
        if (c5902b.f28736b == 4) {
            m12530b(C6500e.f31220s);
            return;
        }
        if (this.f31255e.isEmpty()) {
            this.f31265o = c5902b;
            return;
        }
        if (runtimeException != null) {
            AbstractC6840z.m13032c(this.f31267q.f31236p);
            m12531c(null, runtimeException, false);
            return;
        }
        if (!this.f31267q.f31237q) {
            m12530b(C6500e.m12514e(this.f31257g, c5902b));
            return;
        }
        m12531c(C6500e.m12514e(this.f31257g, c5902b), null, true);
        if (this.f31255e.isEmpty() || m12537l(c5902b) || this.f31267q.m12518d(c5902b, this.f31261k)) {
            return;
        }
        if (c5902b.f28736b == 18) {
            this.f31263m = true;
        }
        if (!this.f31263m) {
            m12530b(C6500e.m12514e(this.f31257g, c5902b));
            return;
        }
        C6500e c6500e2 = this.f31267q;
        C6496a c6496a = this.f31257g;
        h0 h0Var2 = c6500e2.f31236p;
        h0Var2.sendMessageDelayed(Message.obtain(h0Var2, 9, c6496a), 5000L);
    }

    /* renamed from: p */
    public final void m12541p(C5902b c5902b) {
        AbstractC6840z.m13032c(this.f31267q.f31236p);
        InterfaceC6204c interfaceC6204c = this.f31256f;
        interfaceC6204c.m12211b("onSignInFailed for " + interfaceC6204c.getClass().getName() + " with " + String.valueOf(c5902b));
        m12540o(c5902b, null);
    }

    /* renamed from: q */
    public final void m12542q() {
        AbstractC6840z.m13032c(this.f31267q.f31236p);
        Status status = C6500e.f31219r;
        m12530b(status);
        this.f31258h.m2594N(false, status);
        for (AbstractC6503h abstractC6503h : (AbstractC6503h[]) this.f31260j.keySet().toArray(new AbstractC6503h[0])) {
            m12539n(new b0(abstractC6503h, new C8650g()));
        }
        m12529a(new C5902b(4));
        InterfaceC6204c interfaceC6204c = this.f31256f;
        if (interfaceC6204c.m12216g()) {
            interfaceC6204c.m12218j(new C4001v(23, this));
        }
    }
}
