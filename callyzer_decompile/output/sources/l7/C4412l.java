package l7;

import android.os.Bundle;
import com.amplifyframework.auth.cognito.C1136c;
import com.sun.mail.util.AbstractC1452a;
import d7.EnumC1645q;
import ex.InterfaceC2139c;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.ListIterator;
import java.util.Set;
import kotlin.jvm.internal.AbstractC4154l;
import ng.C5070u;
import og.qe;
import q7.C6138e;
import rw.AbstractC6663m;
import rw.C6661k;
import rw.C6668r;
import rw.C6670t;
import wx.c1;
import wx.k1;
import wx.m1;
import wx.w0;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: l7.l */
/* loaded from: classes.dex */
public final class C4412l {

    /* renamed from: a */
    public final C5070u f22076a;

    /* renamed from: b */
    public final m1 f22077b;

    /* renamed from: c */
    public final m1 f22078c;

    /* renamed from: d */
    public boolean f22079d;

    /* renamed from: e */
    public final w0 f22080e;

    /* renamed from: f */
    public final w0 f22081f;

    /* renamed from: g */
    public final n0 f22082g;

    /* renamed from: h */
    public final /* synthetic */ a0 f22083h;

    public C4412l(a0 a0Var, n0 navigator) {
        AbstractC4154l.m8923f(navigator, "navigator");
        this.f22083h = a0Var;
        this.f22076a = new C5070u(25);
        m1 m1VarM15372c = c1.m15372c(C6668r.f31943a);
        this.f22077b = m1VarM15372c;
        m1 m1VarM15372c2 = c1.m15372c(C6670t.f31945a);
        this.f22078c = m1VarM15372c2;
        this.f22080e = new w0(m1VarM15372c);
        this.f22081f = new w0(m1VarM15372c2);
        this.f22082g = navigator;
    }

    /* renamed from: a */
    public final void m9215a(C4409i backStackEntry) {
        AbstractC4154l.m8923f(backStackEntry, "backStackEntry");
        synchronized (this.f22076a) {
            m1 m1Var = this.f22077b;
            ArrayList arrayListM12753Q = AbstractC6663m.m12753Q(backStackEntry, (Collection) m1Var.getValue());
            m1Var.getClass();
            m1Var.m15399k(null, arrayListM12753Q);
        }
    }

    /* renamed from: b */
    public final C4409i m9216b(AbstractC4422v abstractC4422v, Bundle bundle) {
        C6138e c6138e = this.f22083h.f21996b;
        c6138e.getClass();
        return l0.m9224a(c6138e.f29907a.f21997c, abstractC4422v, bundle, c6138e.m12175j(), c6138e.f29921o);
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0078  */
    /* renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m9217c(l7.C4409i r9) {
        /*
            r8 = this;
            java.lang.String r0 = "entry"
            kotlin.jvm.internal.AbstractC4154l.m8923f(r9, r0)
            l7.a0 r0 = r8.f22083h
            q7.e r0 = r0.f21996b
            l7.k r1 = new l7.k
            r1.<init>(r8, r9)
            wx.m1 r2 = r0.f29914h
            java.lang.String r3 = r9.f22050f
            java.util.LinkedHashMap r4 = r0.f29929w
            java.lang.Object r5 = r4.get(r9)
            java.lang.Boolean r6 = java.lang.Boolean.TRUE
            boolean r5 = kotlin.jvm.internal.AbstractC4154l.m8918a(r5, r6)
            r1.invoke()
            r4.remove(r9)
            rw.k r1 = r0.f29912f
            boolean r4 = r1.contains(r9)
            r6 = 0
            if (r4 != 0) goto L89
            r0.m12187w(r9)
            q7.c r4 = r9.f22052h
            d7.w r4 = r4.f29901j
            d7.q r4 = r4.f8148c
            d7.q r7 = d7.EnumC1645q.CREATED
            boolean r4 = r4.isAtLeast(r7)
            if (r4 == 0) goto L43
            d7.q r4 = d7.EnumC1645q.DESTROYED
            r9.m9214a(r4)
        L43:
            boolean r9 = r1.isEmpty()
            if (r9 == 0) goto L4a
            goto L63
        L4a:
            java.util.Iterator r9 = r1.iterator()
        L4e:
            boolean r1 = r9.hasNext()
            if (r1 == 0) goto L63
            java.lang.Object r1 = r9.next()
            l7.i r1 = (l7.C4409i) r1
            java.lang.String r1 = r1.f22050f
            boolean r1 = kotlin.jvm.internal.AbstractC4154l.m8918a(r1, r3)
            if (r1 == 0) goto L4e
            goto L7b
        L63:
            if (r5 != 0) goto L7b
            l7.m r9 = r0.f29921o
            if (r9 == 0) goto L7b
            java.lang.String r1 = "backStackEntryId"
            kotlin.jvm.internal.AbstractC4154l.m8923f(r3, r1)
            java.util.LinkedHashMap r9 = r9.f22084b
            java.lang.Object r9 = r9.remove(r3)
            d7.b1 r9 = (d7.b1) r9
            if (r9 == 0) goto L7b
            r9.m5307a()
        L7b:
            r0.m12188x()
            java.util.ArrayList r9 = r0.m12184t()
            r2.getClass()
            r2.m15399k(r6, r9)
            return
        L89:
            boolean r9 = r8.f22079d
            if (r9 != 0) goto La6
            r0.m12188x()
            wx.m1 r9 = r0.f29913g
            java.util.ArrayList r1 = rw.AbstractC6663m.d0(r1)
            r9.getClass()
            r9.m15399k(r6, r1)
            java.util.ArrayList r9 = r0.m12184t()
            r2.getClass()
            r2.m15399k(r6, r9)
        La6:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: l7.C4412l.m9217c(l7.i):void");
    }

    /* renamed from: d */
    public final void m9218d(C4409i c4409i) {
        int iNextIndex;
        synchronized (this.f22076a) {
            try {
                ArrayList arrayListD0 = AbstractC6663m.d0((Collection) this.f22080e.f39340a.getValue());
                ListIterator listIterator = arrayListD0.listIterator(arrayListD0.size());
                while (true) {
                    if (!listIterator.hasPrevious()) {
                        iNextIndex = -1;
                        break;
                    } else if (AbstractC4154l.m8918a(((C4409i) listIterator.previous()).f22050f, c4409i.f22050f)) {
                        iNextIndex = listIterator.nextIndex();
                        break;
                    }
                }
                arrayListD0.set(iNextIndex, c4409i);
                m1 m1Var = this.f22077b;
                m1Var.getClass();
                m1Var.m15399k(null, arrayListD0);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* renamed from: e */
    public final void m9219e(C4409i c4409i, boolean z6) {
        C6138e c6138e = this.f22083h.f21996b;
        C4411k c4411k = new C4411k(this, c4409i, z6);
        c6138e.getClass();
        n0 n0VarM9233b = c6138e.f29925s.m9233b(c4409i.f22046b.f22134a);
        c6138e.f29929w.put(c4409i, Boolean.valueOf(z6));
        if (!n0VarM9233b.equals(this.f22082g)) {
            Object obj = c6138e.f29926t.get(n0VarM9233b);
            AbstractC4154l.m8920c(obj);
            ((C4412l) obj).m9219e(c4409i, z6);
            return;
        }
        C1136c c1136c = c6138e.f29928v;
        if (c1136c != null) {
            c1136c.invoke(c4409i);
            c4411k.invoke();
            return;
        }
        C6661k c6661k = c6138e.f29912f;
        int iIndexOf = c6661k.indexOf(c4409i);
        if (iIndexOf < 0) {
            String message = "Ignoring pop of " + c4409i + " as it was not found on the current back stack";
            AbstractC4154l.m8923f(message, "message");
            return;
        }
        int i10 = iIndexOf + 1;
        if (i10 != c6661k.f31941c) {
            c6138e.m12181p(((C4409i) c6661k.get(i10)).f22046b.f22135b.f29939e, true, false);
        }
        C6138e.m12166s(c6138e, c4409i);
        c4411k.invoke();
        c6138e.f29908b.invoke();
        c6138e.m12168b();
    }

    /* renamed from: f */
    public final void m9220f(C4409i c4409i, boolean z6) {
        Object objPrevious;
        m1 m1Var = this.f22078c;
        Iterable iterable = (Iterable) m1Var.getValue();
        boolean z10 = iterable instanceof Collection;
        w0 w0Var = this.f22080e;
        if (!z10 || !((Collection) iterable).isEmpty()) {
            Iterator it = iterable.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                if (((C4409i) it.next()) == c4409i) {
                    Iterable iterable2 = (Iterable) w0Var.f39340a.getValue();
                    if ((iterable2 instanceof Collection) && ((Collection) iterable2).isEmpty()) {
                        return;
                    }
                    Iterator it2 = iterable2.iterator();
                    while (it2.hasNext()) {
                        if (((C4409i) it2.next()) == c4409i) {
                        }
                    }
                    return;
                }
            }
        }
        m1Var.m15399k(null, qe.m10859e((Set) m1Var.getValue(), c4409i));
        k1 k1Var = w0Var.f39340a;
        k1 k1Var2 = w0Var.f39340a;
        List list = (List) k1Var.getValue();
        ListIterator listIterator = list.listIterator(list.size());
        while (true) {
            if (!listIterator.hasPrevious()) {
                objPrevious = null;
                break;
            }
            objPrevious = listIterator.previous();
            C4409i c4409i2 = (C4409i) objPrevious;
            if (!AbstractC4154l.m8918a(c4409i2, c4409i) && ((List) k1Var2.getValue()).lastIndexOf(c4409i2) < ((List) k1Var2.getValue()).lastIndexOf(c4409i)) {
                break;
            }
        }
        C4409i c4409i3 = (C4409i) objPrevious;
        if (c4409i3 != null) {
            m1Var.m15399k(null, qe.m10859e((Set) m1Var.getValue(), c4409i3));
        }
        m9219e(c4409i, z6);
    }

    /* renamed from: g */
    public final void m9221g(C4409i entry) {
        AbstractC4154l.m8923f(entry, "entry");
        m1 m1Var = this.f22078c;
        m1Var.m15399k(null, qe.m10859e((Set) m1Var.getValue(), entry));
        C6138e c6138e = this.f22083h.f21996b;
        c6138e.getClass();
        if (!c6138e.f29912f.contains(entry)) {
            throw new IllegalStateException("Cannot transition entry that is not in the back stack");
        }
        entry.m9214a(EnumC1645q.STARTED);
    }

    /* renamed from: h */
    public final void m9222h(C4409i backStackEntry) {
        AbstractC4154l.m8923f(backStackEntry, "backStackEntry");
        C6138e c6138e = this.f22083h.f21996b;
        c6138e.getClass();
        n0 n0VarM9233b = c6138e.f29925s.m9233b(backStackEntry.f22046b.f22134a);
        if (!n0VarM9233b.equals(this.f22082g)) {
            Object obj = c6138e.f29926t.get(n0VarM9233b);
            if (obj == null) {
                throw new IllegalStateException(AbstractC1452a.m4564k(new StringBuilder("NavigatorBackStack for "), backStackEntry.f22046b.f22134a, " should already be created").toString());
            }
            ((C4412l) obj).m9222h(backStackEntry);
            return;
        }
        InterfaceC2139c interfaceC2139c = c6138e.f29927u;
        if (interfaceC2139c != null) {
            interfaceC2139c.invoke(backStackEntry);
            m9215a(backStackEntry);
            return;
        }
        String message = "Ignoring add of destination " + backStackEntry.f22046b + " outside of the call to navigate(). ";
        AbstractC4154l.m8923f(message, "message");
    }

    /* renamed from: i */
    public final void m9223i(C4409i backStackEntry) {
        AbstractC4154l.m8923f(backStackEntry, "backStackEntry");
        m1 m1Var = this.f22078c;
        Iterable iterable = (Iterable) m1Var.getValue();
        boolean z6 = iterable instanceof Collection;
        w0 w0Var = this.f22080e;
        if (!z6 || !((Collection) iterable).isEmpty()) {
            Iterator it = iterable.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                if (((C4409i) it.next()) == backStackEntry) {
                    Iterable iterable2 = (Iterable) w0Var.f39340a.getValue();
                    if (!(iterable2 instanceof Collection) || !((Collection) iterable2).isEmpty()) {
                        Iterator it2 = iterable2.iterator();
                        while (it2.hasNext()) {
                            if (((C4409i) it2.next()) == backStackEntry) {
                                return;
                            }
                        }
                    }
                }
            }
        }
        C4409i c4409i = (C4409i) AbstractC6663m.m12751O((List) w0Var.f39340a.getValue());
        if (c4409i != null) {
            LinkedHashSet linkedHashSetM10859e = qe.m10859e((Set) m1Var.getValue(), c4409i);
            m1Var.getClass();
            m1Var.m15399k(null, linkedHashSetM10859e);
        }
        LinkedHashSet linkedHashSetM10859e2 = qe.m10859e((Set) m1Var.getValue(), backStackEntry);
        m1Var.getClass();
        m1Var.m15399k(null, linkedHashSetM10859e2);
        m9222h(backStackEntry);
    }
}
