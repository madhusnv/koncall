package q7;

import an.b2;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import aq.C0401d;
import bx.C0797g;
import com.amplifyframework.auth.cognito.C1136c;
import com.sun.mail.util.AbstractC1452a;
import d7.C1639l;
import d7.EnumC1645q;
import d7.InterfaceC1649u;
import e1.v0;
import ex.InterfaceC2139c;
import h6.C2856l;
import i0.m0;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.ListIterator;
import java.util.Set;
import kotlin.jvm.internal.AbstractC4154l;
import kotlin.jvm.internal.C4164v;
import kotlin.jvm.internal.C4166x;
import l4.C4367l;
import l7.AbstractC4422v;
import l7.C4409i;
import l7.C4410j;
import l7.C4412l;
import l7.C4413m;
import l7.C4421u;
import l7.C4423w;
import l7.InterfaceC4405e;
import l7.a0;
import l7.d0;
import l7.l0;
import l7.n0;
import l7.o0;
import mx.AbstractC4913i;
import mx.C4915k;
import of.C5359n;
import og.fg;
import og.pe;
import p7.C5835f;
import pg.n7;
import qw.C6361k;
import r7.C6483a;
import rw.AbstractC6663m;
import rw.C6661k;
import rw.C6668r;
import vx.EnumC7799a;
import wx.b1;
import wx.c1;
import wx.m1;
import wx.w0;
import zh.AbstractC8954a;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: q7.e */
/* loaded from: classes.dex */
public final class C6138e {

    /* renamed from: a */
    public final a0 f29907a;

    /* renamed from: b */
    public final C0401d f29908b;

    /* renamed from: c */
    public C4423w f29909c;

    /* renamed from: d */
    public Bundle f29910d;

    /* renamed from: e */
    public Bundle[] f29911e;

    /* renamed from: f */
    public final C6661k f29912f = new C6661k();

    /* renamed from: g */
    public final m1 f29913g;

    /* renamed from: h */
    public final m1 f29914h;

    /* renamed from: i */
    public final w0 f29915i;

    /* renamed from: j */
    public final LinkedHashMap f29916j;

    /* renamed from: k */
    public final LinkedHashMap f29917k;

    /* renamed from: l */
    public final LinkedHashMap f29918l;

    /* renamed from: m */
    public final LinkedHashMap f29919m;

    /* renamed from: n */
    public InterfaceC1649u f29920n;

    /* renamed from: o */
    public C4413m f29921o;

    /* renamed from: p */
    public final ArrayList f29922p;

    /* renamed from: q */
    public EnumC1645q f29923q;

    /* renamed from: r */
    public final C1639l f29924r;

    /* renamed from: s */
    public final o0 f29925s;

    /* renamed from: t */
    public final LinkedHashMap f29926t;

    /* renamed from: u */
    public InterfaceC2139c f29927u;

    /* renamed from: v */
    public C1136c f29928v;

    /* renamed from: w */
    public final LinkedHashMap f29929w;

    /* renamed from: x */
    public int f29930x;

    /* renamed from: y */
    public final ArrayList f29931y;

    /* renamed from: z */
    public final b1 f29932z;

    public C6138e(a0 a0Var, C0401d c0401d) {
        this.f29907a = a0Var;
        this.f29908b = c0401d;
        C6668r c6668r = C6668r.f31943a;
        this.f29913g = c1.m15372c(c6668r);
        m1 m1VarM15372c = c1.m15372c(c6668r);
        this.f29914h = m1VarM15372c;
        this.f29915i = new w0(m1VarM15372c);
        this.f29916j = new LinkedHashMap();
        this.f29917k = new LinkedHashMap();
        this.f29918l = new LinkedHashMap();
        this.f29919m = new LinkedHashMap();
        this.f29922p = new ArrayList();
        this.f29923q = EnumC1645q.INITIALIZED;
        this.f29924r = new C1639l(5, this);
        this.f29925s = new o0();
        this.f29926t = new LinkedHashMap();
        this.f29929w = new LinkedHashMap();
        this.f29931y = new ArrayList();
        this.f29932z = c1.m15371b(1, 0, EnumC7799a.DROP_OLDEST, 2);
    }

    /* renamed from: e */
    public static AbstractC4422v m12165e(int i10, AbstractC4422v abstractC4422v, AbstractC4422v abstractC4422v2, boolean z6) {
        if (abstractC4422v.f22135b.f29939e == i10 && (abstractC4422v2 == null || (abstractC4422v.equals(abstractC4422v2) && AbstractC4154l.m8918a(abstractC4422v.f22136c, abstractC4422v2.f22136c)))) {
            return abstractC4422v;
        }
        C4423w c4423w = abstractC4422v instanceof C4423w ? (C4423w) abstractC4422v : null;
        if (c4423w == null) {
            c4423w = abstractC4422v.f22136c;
            AbstractC4154l.m8920c(c4423w);
        }
        return c4423w.f22140g.m9465r(i10, c4423w, abstractC4422v2, z6);
    }

    /* renamed from: s */
    public static /* synthetic */ void m12166s(C6138e c6138e, C4409i c4409i) {
        c6138e.m12183r(c4409i, false, new C6661k());
    }

    /* renamed from: a */
    public final void m12167a(AbstractC4422v abstractC4422v, Bundle bundle, C4409i c4409i, List list) {
        Object objPrevious;
        Object objPrevious2;
        C2856l c2856l = this.f29907a.f21997c;
        AbstractC4422v abstractC4422v2 = c4409i.f22046b;
        boolean z6 = abstractC4422v2 instanceof InterfaceC4405e;
        C6661k c6661k = this.f29912f;
        if (!z6) {
            while (!c6661k.isEmpty() && (((C4409i) c6661k.last()).f22046b instanceof InterfaceC4405e) && m12181p(((C4409i) c6661k.last()).f22046b.f22135b.f29939e, true, false)) {
            }
        }
        C6661k c6661k2 = new C6661k();
        Object obj = null;
        if (abstractC4422v instanceof C4423w) {
            AbstractC4422v abstractC4422v3 = abstractC4422v2;
            do {
                AbstractC4154l.m8920c(abstractC4422v3);
                abstractC4422v3 = abstractC4422v3.f22136c;
                if (abstractC4422v3 != null) {
                    ListIterator listIterator = list.listIterator(list.size());
                    while (true) {
                        if (!listIterator.hasPrevious()) {
                            objPrevious2 = null;
                            break;
                        } else {
                            objPrevious2 = listIterator.previous();
                            if (AbstractC4154l.m8918a(((C4409i) objPrevious2).f22046b, abstractC4422v3)) {
                                break;
                            }
                        }
                    }
                    C4409i c4409iM9224a = (C4409i) objPrevious2;
                    if (c4409iM9224a == null) {
                        c4409iM9224a = l0.m9224a(c2856l, abstractC4422v3, bundle, m12175j(), this.f29921o);
                    }
                    c6661k2.addFirst(c4409iM9224a);
                    if (!c6661k.isEmpty() && ((C4409i) c6661k.last()).f22046b == abstractC4422v3) {
                        m12166s(this, (C4409i) c6661k.last());
                    }
                }
                if (abstractC4422v3 == null) {
                    break;
                }
            } while (abstractC4422v3 != abstractC4422v);
        }
        AbstractC4422v abstractC4422v4 = c6661k2.isEmpty() ? abstractC4422v2 : ((C4409i) c6661k2.first()).f22046b;
        while (abstractC4422v4 != null && m12170d(abstractC4422v4.f22135b.f29939e, abstractC4422v4) != abstractC4422v4) {
            abstractC4422v4 = abstractC4422v4.f22136c;
            if (abstractC4422v4 != null) {
                Bundle bundle2 = (bundle == null || !bundle.isEmpty()) ? bundle : null;
                ListIterator listIterator2 = list.listIterator(list.size());
                while (true) {
                    if (!listIterator2.hasPrevious()) {
                        objPrevious = null;
                        break;
                    } else {
                        objPrevious = listIterator2.previous();
                        if (AbstractC4154l.m8918a(((C4409i) objPrevious).f22046b, abstractC4422v4)) {
                            break;
                        }
                    }
                }
                C4409i c4409iM9224a2 = (C4409i) objPrevious;
                if (c4409iM9224a2 == null) {
                    c4409iM9224a2 = l0.m9224a(c2856l, abstractC4422v4, abstractC4422v4.m9246h(bundle2), m12175j(), this.f29921o);
                }
                c6661k2.addFirst(c4409iM9224a2);
            }
        }
        if (!c6661k2.isEmpty()) {
            abstractC4422v2 = ((C4409i) c6661k2.first()).f22046b;
        }
        while (!c6661k.isEmpty() && (((C4409i) c6661k.last()).f22046b instanceof C4423w)) {
            AbstractC4422v abstractC4422v5 = ((C4409i) c6661k.last()).f22046b;
            AbstractC4154l.m8921d(abstractC4422v5, "null cannot be cast to non-null type androidx.navigation.NavGraph");
            if (((v0) ((C4423w) abstractC4422v5).f22140g.f22767f).m5646c(abstractC4422v2.f22135b.f29939e) != null) {
                break;
            } else {
                m12166s(this, (C4409i) c6661k.last());
            }
        }
        C4409i c4409i2 = (C4409i) c6661k.m12691r();
        if (c4409i2 == null) {
            c4409i2 = (C4409i) c6661k2.m12691r();
        }
        if (!AbstractC4154l.m8918a(c4409i2 != null ? c4409i2.f22046b : null, this.f29909c)) {
            ListIterator listIterator3 = list.listIterator(list.size());
            while (true) {
                if (!listIterator3.hasPrevious()) {
                    break;
                }
                Object objPrevious3 = listIterator3.previous();
                AbstractC4422v abstractC4422v6 = ((C4409i) objPrevious3).f22046b;
                C4423w c4423w = this.f29909c;
                AbstractC4154l.m8920c(c4423w);
                if (AbstractC4154l.m8918a(abstractC4422v6, c4423w)) {
                    obj = objPrevious3;
                    break;
                }
            }
            C4409i c4409iM9224a3 = (C4409i) obj;
            if (c4409iM9224a3 == null) {
                C4423w c4423w2 = this.f29909c;
                AbstractC4154l.m8920c(c4423w2);
                C4423w c4423w3 = this.f29909c;
                AbstractC4154l.m8920c(c4423w3);
                c4409iM9224a3 = l0.m9224a(c2856l, c4423w2, c4423w3.m9246h(bundle), m12175j(), this.f29921o);
            }
            c6661k2.addFirst(c4409iM9224a3);
        }
        Iterator it = c6661k2.iterator();
        while (it.hasNext()) {
            C4409i c4409i3 = (C4409i) it.next();
            Object obj2 = this.f29926t.get(this.f29925s.m9233b(c4409i3.f22046b.f22134a));
            if (obj2 == null) {
                throw new IllegalStateException(AbstractC1452a.m4564k(new StringBuilder("NavigatorBackStack for "), abstractC4422v.f22134a, " should already be created").toString());
            }
            ((C4412l) obj2).m9215a(c4409i3);
        }
        c6661k.addAll(c6661k2);
        c6661k.addLast(c4409i);
        ArrayList arrayListM12753Q = AbstractC6663m.m12753Q(c4409i, c6661k2);
        int size = arrayListM12753Q.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj3 = arrayListM12753Q.get(i10);
            i10++;
            C4409i c4409i4 = (C4409i) obj3;
            C4423w c4423w4 = c4409i4.f22046b.f22136c;
            if (c4423w4 != null) {
                m12177l(c4409i4, m12171f(c4423w4.f22135b.f29939e));
            }
        }
    }

    /* renamed from: b */
    public final boolean m12168b() {
        C6661k c6661k;
        while (true) {
            c6661k = this.f29912f;
            if (c6661k.isEmpty() || !(((C4409i) c6661k.last()).f22046b instanceof C4423w)) {
                break;
            }
            m12166s(this, (C4409i) c6661k.last());
        }
        C4409i c4409i = (C4409i) c6661k.m12693t();
        ArrayList arrayList = this.f29931y;
        if (c4409i != null) {
            arrayList.add(c4409i);
        }
        this.f29930x++;
        m12188x();
        int i10 = this.f29930x - 1;
        this.f29930x = i10;
        if (i10 == 0) {
            ArrayList arrayListD0 = AbstractC6663m.d0(arrayList);
            arrayList.clear();
            int size = arrayListD0.size();
            int i11 = 0;
            while (i11 < size) {
                Object obj = arrayListD0.get(i11);
                i11++;
                C4409i c4409i2 = (C4409i) obj;
                Iterator it = AbstractC6663m.c0(this.f29922p).iterator();
                while (it.hasNext()) {
                    ((C6483a) it.next()).m12483a(this.f29907a, c4409i2.f22046b, c4409i2.f22052h.m12163a());
                }
                this.f29932z.mo15352b(c4409i2);
            }
            ArrayList arrayListD02 = AbstractC6663m.d0(c6661k);
            m1 m1Var = this.f29913g;
            m1Var.getClass();
            m1Var.m15399k(null, arrayListD02);
            ArrayList arrayListM12184t = m12184t();
            m1 m1Var2 = this.f29914h;
            m1Var2.getClass();
            m1Var2.m15399k(null, arrayListM12184t);
        }
        return c4409i != null;
    }

    /* renamed from: c */
    public final boolean m12169c(ArrayList arrayList, AbstractC4422v abstractC4422v, boolean z6, boolean z10) {
        boolean z11;
        C4164v c4164v = new C4164v();
        C6661k c6661k = new C6661k();
        int size = arrayList.size();
        int i10 = 0;
        while (true) {
            if (i10 >= size) {
                z11 = z10;
                break;
            }
            int i11 = i10 + 1;
            n0 navigator = (n0) arrayList.get(i10);
            C4164v c4164v2 = new C4164v();
            C4409i popUpTo = (C4409i) this.f29912f.last();
            z11 = z10;
            C1136c c1136c = new C1136c(1, c4164v2, c4164v, this, c6661k, z11);
            AbstractC4154l.m8923f(navigator, "navigator");
            AbstractC4154l.m8923f(popUpTo, "popUpTo");
            this.f29928v = c1136c;
            navigator.mo9231i(popUpTo, z11);
            this.f29928v = null;
            if (!c4164v2.f21160a) {
                break;
            }
            i10 = i11;
        }
        if (z11) {
            LinkedHashMap linkedHashMap = this.f29918l;
            if (!z6) {
                final int i12 = 0;
                C0797g c0797g = new C0797g(new C4915k(AbstractC4913i.m9809e(new C5835f(8), abstractC4422v), new InterfaceC2139c(this) { // from class: q7.d

                    /* renamed from: b */
                    public final /* synthetic */ C6138e f29906b;

                    {
                        this.f29906b = this;
                    }

                    @Override // ex.InterfaceC2139c
                    public final Object invoke(Object obj) {
                        boolean zContainsKey;
                        AbstractC4422v destination = (AbstractC4422v) obj;
                        switch (i12) {
                            case 0:
                                AbstractC4154l.m8923f(destination, "destination");
                                zContainsKey = this.f29906b.f29918l.containsKey(Integer.valueOf(destination.f22135b.f29939e));
                                break;
                            default:
                                AbstractC4154l.m8923f(destination, "destination");
                                zContainsKey = this.f29906b.f29918l.containsKey(Integer.valueOf(destination.f22135b.f29939e));
                                break;
                        }
                        return Boolean.valueOf(!zContainsKey);
                    }
                }, 0));
                while (c0797g.hasNext()) {
                    Integer numValueOf = Integer.valueOf(((AbstractC4422v) c0797g.next()).f22135b.f29939e);
                    C4410j c4410j = (C4410j) c6661k.m12691r();
                    linkedHashMap.put(numValueOf, c4410j != null ? (String) c4410j.f22054a.f26304b : null);
                }
            }
            if (!c6661k.isEmpty()) {
                C5359n c5359n = ((C4410j) c6661k.first()).f22054a;
                final int i13 = 1;
                C0797g c0797g2 = new C0797g(new C4915k(AbstractC4913i.m9809e(new C5835f(9), m12170d(c5359n.f26303a, null)), new InterfaceC2139c(this) { // from class: q7.d

                    /* renamed from: b */
                    public final /* synthetic */ C6138e f29906b;

                    {
                        this.f29906b = this;
                    }

                    @Override // ex.InterfaceC2139c
                    public final Object invoke(Object obj) {
                        boolean zContainsKey;
                        AbstractC4422v destination = (AbstractC4422v) obj;
                        switch (i13) {
                            case 0:
                                AbstractC4154l.m8923f(destination, "destination");
                                zContainsKey = this.f29906b.f29918l.containsKey(Integer.valueOf(destination.f22135b.f29939e));
                                break;
                            default:
                                AbstractC4154l.m8923f(destination, "destination");
                                zContainsKey = this.f29906b.f29918l.containsKey(Integer.valueOf(destination.f22135b.f29939e));
                                break;
                        }
                        return Boolean.valueOf(!zContainsKey);
                    }
                }, 0));
                while (c0797g2.hasNext()) {
                    linkedHashMap.put(Integer.valueOf(((AbstractC4422v) c0797g2.next()).f22135b.f29939e), (String) c5359n.f26304b);
                }
                if (linkedHashMap.values().contains((String) c5359n.f26304b)) {
                    this.f29919m.put((String) c5359n.f26304b, c6661k);
                }
            }
        }
        this.f29908b.invoke();
        return c4164v.f21160a;
    }

    /* renamed from: d */
    public final AbstractC4422v m12170d(int i10, AbstractC4422v abstractC4422v) {
        AbstractC4422v abstractC4422v2;
        C4423w c4423w = this.f29909c;
        if (c4423w == null) {
            return null;
        }
        if (c4423w.f22135b.f29939e == i10) {
            if (abstractC4422v == null) {
                return c4423w;
            }
            if (AbstractC4154l.m8918a(c4423w, abstractC4422v) && abstractC4422v.f22136c == null) {
                return this.f29909c;
            }
        }
        C4409i c4409i = (C4409i) this.f29912f.m12693t();
        if (c4409i == null || (abstractC4422v2 = c4409i.f22046b) == null) {
            abstractC4422v2 = this.f29909c;
            AbstractC4154l.m8920c(abstractC4422v2);
        }
        return m12165e(i10, abstractC4422v2, abstractC4422v, false);
    }

    /* renamed from: f */
    public final C4409i m12171f(int i10) {
        Object objPrevious;
        C6661k c6661k = this.f29912f;
        ListIterator<E> listIterator = c6661k.listIterator(c6661k.size());
        while (true) {
            if (!listIterator.hasPrevious()) {
                objPrevious = null;
                break;
            }
            objPrevious = listIterator.previous();
            if (((C4409i) objPrevious).f22046b.f22135b.f29939e == i10) {
                break;
            }
        }
        C4409i c4409i = (C4409i) objPrevious;
        if (c4409i != null) {
            return c4409i;
        }
        StringBuilder sbM4567n = AbstractC1452a.m4567n(i10, "No destination with ID ", " is on the NavController's back stack. The current destination is ");
        sbM4567n.append(m12173h());
        throw new IllegalArgumentException(sbM4567n.toString().toString());
    }

    /* renamed from: g */
    public final C4409i m12172g() {
        return (C4409i) this.f29912f.m12693t();
    }

    /* renamed from: h */
    public final AbstractC4422v m12173h() {
        C4409i c4409iM12172g = m12172g();
        if (c4409iM12172g != null) {
            return c4409iM12172g.f22046b;
        }
        return null;
    }

    /* renamed from: i */
    public final C4423w m12174i() {
        C4423w c4423w = this.f29909c;
        if (c4423w == null) {
            throw new IllegalStateException("You must call setGraph() before calling getGraph()");
        }
        AbstractC4154l.m8921d(c4423w, "null cannot be cast to non-null type androidx.navigation.NavGraph");
        return c4423w;
    }

    /* renamed from: j */
    public final EnumC1645q m12175j() {
        return this.f29920n == null ? EnumC1645q.CREATED : this.f29923q;
    }

    /* renamed from: k */
    public final C4423w m12176k() {
        AbstractC4422v abstractC4422v;
        C4409i c4409i = (C4409i) this.f29912f.m12693t();
        if (c4409i == null || (abstractC4422v = c4409i.f22046b) == null) {
            abstractC4422v = this.f29909c;
            AbstractC4154l.m8920c(abstractC4422v);
        }
        C4423w c4423w = abstractC4422v instanceof C4423w ? (C4423w) abstractC4422v : null;
        if (c4423w != null) {
            return c4423w;
        }
        C4423w c4423w2 = abstractC4422v.f22136c;
        AbstractC4154l.m8920c(c4423w2);
        return c4423w2;
    }

    /* renamed from: l */
    public final void m12177l(C4409i c4409i, C4409i c4409i2) {
        this.f29916j.put(c4409i, c4409i2);
        LinkedHashMap linkedHashMap = this.f29917k;
        if (linkedHashMap.get(c4409i2) == null) {
            linkedHashMap.put(c4409i2, new C6134a());
        }
        Object obj = linkedHashMap.get(c4409i2);
        AbstractC4154l.m8920c(obj);
        ((C6134a) obj).f29890a.incrementAndGet();
    }

    /* renamed from: m */
    public final void m12178m(String route, d0 d0Var) {
        AbstractC4154l.m8923f(route, "route");
        if (this.f29909c == null) {
            throw new IllegalArgumentException(("Cannot navigate to " + route + ". Navigation graph has not been set for NavController " + this + '.').toString());
        }
        C4423w c4423wM12176k = m12176k();
        C4421u c4421uM9255y = c4423wM12176k.m9255y(route, true, c4423wM12176k);
        if (c4421uM9255y == null) {
            StringBuilder sbM7383p = m0.m7383p("Navigation destination that matches route ", route, " cannot be found in the navigation graph ");
            sbM7383p.append(this.f29909c);
            throw new IllegalArgumentException(sbM7383p.toString());
        }
        AbstractC4422v abstractC4422v = c4421uM9255y.f22127a;
        Bundle bundleM9246h = abstractC4422v.m9246h(c4421uM9255y.f22128b);
        if (bundleM9246h == null) {
            bundleM9246h = n7.m11799a((C6361k[]) Arrays.copyOf(new C6361k[0], 0));
        }
        int i10 = AbstractC4422v.f22133f;
        String str = abstractC4422v.f22135b.f29940f;
        String uriString = str != null ? "android-app://androidx.navigation/".concat(str) : "";
        AbstractC4154l.m8923f(uriString, "uriString");
        Uri uri = Uri.parse(uriString);
        AbstractC4154l.m8922e(uri, "parse(...)");
        Intent intent = new Intent();
        intent.setDataAndType(uri, null);
        intent.setAction(null);
        fg.m10657c(intent, bundleM9246h);
        m12180o(abstractC4422v, bundleM9246h, d0Var);
    }

    /* renamed from: n */
    public final void m12179n(C4367l c4367l, d0 d0Var) {
        if (this.f29909c == null) {
            throw new IllegalArgumentException(("Cannot navigate to " + c4367l + ". Navigation graph has not been set for NavController " + this.f29907a + '.').toString());
        }
        C4423w c4423wM12176k = m12176k();
        C4421u c4421uM9254x = c4423wM12176k.m9254x(c4367l, c4423wM12176k);
        if (c4421uM9254x == null) {
            throw new IllegalArgumentException("Navigation destination that matches request " + c4367l + " cannot be found in the navigation graph " + this.f29909c);
        }
        AbstractC4422v abstractC4422v = c4421uM9254x.f22127a;
        Bundle bundleM9246h = abstractC4422v.m9246h(c4421uM9254x.f22128b);
        if (bundleM9246h == null) {
            bundleM9246h = n7.m11799a((C6361k[]) Arrays.copyOf(new C6361k[0], 0));
        }
        Intent intent = new Intent();
        intent.setDataAndType((Uri) c4367l.f21921b, (String) c4367l.f21923d);
        intent.setAction((String) c4367l.f21922c);
        fg.m10657c(intent, bundleM9246h);
        m12180o(abstractC4422v, bundleM9246h, d0Var);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x010d  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x01b1  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x01b7  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x01e1  */
    /* renamed from: o */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m12180o(l7.AbstractC4422v r26, android.os.Bundle r27, l7.d0 r28) {
        /*
            Method dump skipped, instructions count: 531
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: q7.C6138e.m12180o(l7.v, android.os.Bundle, l7.d0):void");
    }

    /* renamed from: p */
    public final boolean m12181p(int i10, boolean z6, boolean z10) {
        AbstractC4422v abstractC4422v;
        C6661k c6661k = this.f29912f;
        if (c6661k.isEmpty()) {
            return false;
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = AbstractC6663m.m12758V(c6661k).iterator();
        while (true) {
            if (!it.hasNext()) {
                abstractC4422v = null;
                break;
            }
            abstractC4422v = ((C4409i) it.next()).f22046b;
            String str = abstractC4422v.f22134a;
            C6140g c6140g = abstractC4422v.f22135b;
            n0 n0VarM9233b = this.f29925s.m9233b(str);
            if (z6 || c6140g.f29939e != i10) {
                arrayList.add(n0VarM9233b);
            }
            if (c6140g.f29939e == i10) {
                break;
            }
        }
        if (abstractC4422v != null) {
            return m12169c(arrayList, abstractC4422v, z6, z10);
        }
        int i11 = AbstractC4422v.f22133f;
        String message = "Ignoring popBackStack to destination " + AbstractC8954a.m16435a(this.f29907a.f21997c, i10) + " as it was not found on the current back stack";
        AbstractC4154l.m8923f(message, "message");
        return false;
    }

    /* renamed from: q */
    public final boolean m12182q(String route, boolean z6, boolean z10) {
        Object objPrevious;
        AbstractC4154l.m8923f(route, "route");
        C6661k c6661k = this.f29912f;
        if (c6661k.isEmpty()) {
            return false;
        }
        ArrayList arrayList = new ArrayList();
        ListIterator listIterator = c6661k.listIterator(c6661k.mo10411b());
        while (true) {
            if (!listIterator.hasPrevious()) {
                objPrevious = null;
                break;
            }
            objPrevious = listIterator.previous();
            C4409i c4409i = (C4409i) objPrevious;
            boolean zM9250s = c4409i.f22046b.m9250s(route, c4409i.f22052h.m12163a());
            if (z6 || !zM9250s) {
                arrayList.add(this.f29925s.m9233b(c4409i.f22046b.f22134a));
            }
            if (zM9250s) {
                break;
            }
        }
        C4409i c4409i2 = (C4409i) objPrevious;
        AbstractC4422v abstractC4422v = c4409i2 != null ? c4409i2.f22046b : null;
        if (abstractC4422v != null) {
            return m12169c(arrayList, abstractC4422v, z6, z10);
        }
        String message = "Ignoring popBackStack to route " + route + " as it was not found on the current back stack";
        AbstractC4154l.m8923f(message, "message");
        return false;
    }

    /* renamed from: r */
    public final void m12183r(C4409i popUpTo, boolean z6, C6661k c6661k) {
        C4413m c4413m;
        w0 w0Var;
        Set set;
        AbstractC4154l.m8923f(popUpTo, "popUpTo");
        C6661k c6661k2 = this.f29912f;
        C4409i c4409i = (C4409i) c6661k2.last();
        if (!AbstractC4154l.m8918a(c4409i, popUpTo)) {
            throw new IllegalStateException(("Attempted to pop " + popUpTo.f22046b + ", which is not the top of the back stack (" + c4409i.f22046b + ')').toString());
        }
        AbstractC6663m.m12757U(c6661k2);
        C4412l c4412l = (C4412l) this.f29926t.get(this.f29925s.m9233b(c4409i.f22046b.f22134a));
        boolean z10 = true;
        if ((c4412l == null || (w0Var = c4412l.f22081f) == null || (set = (Set) w0Var.f39340a.getValue()) == null || !set.contains(c4409i)) && !this.f29917k.containsKey(c4409i)) {
            z10 = false;
        }
        EnumC1645q enumC1645q = c4409i.f22052h.f29901j.f8148c;
        EnumC1645q enumC1645q2 = EnumC1645q.CREATED;
        if (enumC1645q.isAtLeast(enumC1645q2)) {
            if (z6) {
                c4409i.m9214a(enumC1645q2);
                c6661k.addFirst(new C4410j(c4409i));
            }
            if (z10) {
                c4409i.m9214a(enumC1645q2);
            } else {
                c4409i.m9214a(EnumC1645q.DESTROYED);
                m12187w(c4409i);
            }
        }
        if (z6 || z10 || (c4413m = this.f29921o) == null) {
            return;
        }
        String backStackEntryId = c4409i.f22050f;
        AbstractC4154l.m8923f(backStackEntryId, "backStackEntryId");
        d7.b1 b1Var = (d7.b1) c4413m.f22084b.remove(backStackEntryId);
        if (b1Var != null) {
            b1Var.m5307a();
        }
    }

    /* renamed from: t */
    public final ArrayList m12184t() {
        ArrayList arrayList = new ArrayList();
        Iterator it = this.f29926t.values().iterator();
        while (it.hasNext()) {
            Iterable iterable = (Iterable) ((C4412l) it.next()).f22081f.f39340a.getValue();
            ArrayList arrayList2 = new ArrayList();
            for (Object obj : iterable) {
                C4409i c4409i = (C4409i) obj;
                if (!arrayList.contains(c4409i) && !c4409i.f22052h.f29902k.isAtLeast(EnumC1645q.STARTED)) {
                    arrayList2.add(obj);
                }
            }
            AbstractC6663m.m12765x(arrayList, arrayList2);
        }
        ArrayList arrayList3 = new ArrayList();
        Iterator it2 = this.f29912f.iterator();
        while (it2.hasNext()) {
            Object next = it2.next();
            C4409i c4409i2 = (C4409i) next;
            if (!arrayList.contains(c4409i2) && c4409i2.f22052h.f29902k.isAtLeast(EnumC1645q.STARTED)) {
                arrayList3.add(next);
            }
        }
        AbstractC6663m.m12765x(arrayList, arrayList3);
        ArrayList arrayList4 = new ArrayList();
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj2 = arrayList.get(i10);
            i10++;
            if (!(((C4409i) obj2).f22046b instanceof C4423w)) {
                arrayList4.add(obj2);
            }
        }
        return arrayList4;
    }

    /* renamed from: u */
    public final boolean m12185u(int i10, Bundle bundle, d0 d0Var) {
        AbstractC4422v abstractC4422vM12174i;
        C4409i c4409i;
        AbstractC4422v abstractC4422v;
        Bundle bundle2;
        Integer numValueOf = Integer.valueOf(i10);
        LinkedHashMap linkedHashMap = this.f29918l;
        int i11 = 0;
        if (!linkedHashMap.containsKey(numValueOf)) {
            return false;
        }
        String str = (String) linkedHashMap.get(Integer.valueOf(i10));
        Collection collectionValues = linkedHashMap.values();
        AbstractC4154l.m8923f(collectionValues, "<this>");
        Iterator it = collectionValues.iterator();
        while (it.hasNext()) {
            if (AbstractC4154l.m8918a((String) it.next(), str)) {
                it.remove();
            }
        }
        C6661k c6661k = (C6661k) kotlin.jvm.internal.d0.m8906c(this.f29919m).remove(str);
        C2856l context = this.f29907a.f21997c;
        ArrayList arrayList = new ArrayList();
        C4409i c4409i2 = (C4409i) this.f29912f.m12693t();
        if (c4409i2 == null || (abstractC4422vM12174i = c4409i2.f22046b) == null) {
            abstractC4422vM12174i = m12174i();
        }
        if (c6661k != null) {
            Iterator it2 = c6661k.iterator();
            while (it2.hasNext()) {
                C4410j c4410j = (C4410j) it2.next();
                C5359n c5359n = c4410j.f22054a;
                C5359n c5359n2 = c4410j.f22054a;
                AbstractC4422v abstractC4422vM12165e = m12165e(c5359n.f26303a, abstractC4422vM12174i, null, true);
                if (abstractC4422vM12165e == null) {
                    int i12 = AbstractC4422v.f22133f;
                    throw new IllegalStateException(("Restore State failed: destination " + AbstractC8954a.m16435a(context, c5359n2.f26303a) + " cannot be found from the current destination " + abstractC4422vM12174i).toString());
                }
                EnumC1645q hostLifecycleState = m12175j();
                C4413m c4413m = this.f29921o;
                AbstractC4154l.m8923f(context, "context");
                AbstractC4154l.m8923f(hostLifecycleState, "hostLifecycleState");
                Bundle bundle3 = (Bundle) c5359n2.f26305c;
                if (bundle3 != null) {
                    Context context2 = context.f15864a;
                    bundle3.setClassLoader(context2 != null ? context2.getClassLoader() : null);
                    bundle2 = bundle3;
                } else {
                    bundle2 = null;
                }
                String id2 = (String) c5359n2.f26304b;
                Bundle bundle4 = (Bundle) c5359n2.f26306d;
                AbstractC4154l.m8923f(id2, "id");
                arrayList.add(new C4409i(context, abstractC4422vM12165e, bundle2, hostLifecycleState, c4413m, id2, bundle4));
                abstractC4422vM12174i = abstractC4422vM12165e;
            }
        }
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        int size = arrayList.size();
        int i13 = 0;
        while (i13 < size) {
            Object obj = arrayList.get(i13);
            i13++;
            if (!(((C4409i) obj).f22046b instanceof C4423w)) {
                arrayList3.add(obj);
            }
        }
        int size2 = arrayList3.size();
        int i14 = 0;
        while (i14 < size2) {
            Object obj2 = arrayList3.get(i14);
            i14++;
            C4409i c4409i3 = (C4409i) obj2;
            List list = (List) AbstractC6663m.m12751O(arrayList2);
            if (AbstractC4154l.m8918a((list == null || (c4409i = (C4409i) AbstractC6663m.m12750N(list)) == null || (abstractC4422v = c4409i.f22046b) == null) ? null : abstractC4422v.f22134a, c4409i3.f22046b.f22134a)) {
                list.add(c4409i3);
            } else {
                arrayList2.add(pe.m10835j(c4409i3));
            }
        }
        C4164v c4164v = new C4164v();
        int size3 = arrayList2.size();
        while (i11 < size3) {
            Object obj3 = arrayList2.get(i11);
            i11++;
            List list2 = (List) obj3;
            n0 n0VarM9233b = this.f29925s.m9233b(((C4409i) AbstractC6663m.m12742F(list2)).f22046b.f22134a);
            ArrayList arrayList4 = arrayList;
            this.f29927u = new b2(c4164v, arrayList4, new C4166x(), this, bundle, 4);
            n0VarM9233b.mo9226d(list2, d0Var);
            this.f29927u = null;
            arrayList = arrayList4;
        }
        return c4164v.f21160a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:101:0x026c  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x0274  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0290  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x02b4  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x0309  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x0326  */
    /* JADX WARN: Removed duplicated region for block: B:246:0x0306 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:93:0x024a  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0252  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0262  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0269  */
    /* JADX WARN: Type inference failed for: r20v1, types: [android.os.Bundle[]] */
    /* JADX WARN: Type inference failed for: r20v2, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r5v15, types: [android.os.Bundle] */
    /* JADX WARN: Type inference failed for: r6v15, types: [l7.v, l7.w] */
    /* JADX WARN: Type inference failed for: r7v30 */
    /* JADX WARN: Type inference failed for: r7v31, types: [java.lang.ClassLoader] */
    /* JADX WARN: Type inference failed for: r7v35 */
    /* renamed from: v */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m12186v(l7.C4423w r29, android.os.Bundle r30) {
        /*
            Method dump skipped, instructions count: 1328
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: q7.C6138e.m12186v(l7.w, android.os.Bundle):void");
    }

    /* renamed from: w */
    public final void m12187w(C4409i child) {
        AbstractC4154l.m8923f(child, "child");
        C4409i c4409i = (C4409i) this.f29916j.remove(child);
        if (c4409i == null) {
            return;
        }
        LinkedHashMap linkedHashMap = this.f29917k;
        C6134a c6134a = (C6134a) linkedHashMap.get(c4409i);
        Integer numValueOf = c6134a != null ? Integer.valueOf(c6134a.f29890a.decrementAndGet()) : null;
        if (numValueOf != null && numValueOf.intValue() == 0) {
            C4412l c4412l = (C4412l) this.f29926t.get(this.f29925s.m9233b(c4409i.f22046b.f22134a));
            if (c4412l != null) {
                c4412l.m9217c(c4409i);
            }
            linkedHashMap.remove(c4409i);
        }
    }

    /* renamed from: x */
    public final void m12188x() {
        C6134a c6134a;
        w0 w0Var;
        Set set;
        ArrayList arrayListD0 = AbstractC6663m.d0(this.f29912f);
        if (arrayListD0.isEmpty()) {
            return;
        }
        ArrayList arrayListM10835j = pe.m10835j(((C4409i) AbstractC6663m.m12750N(arrayListD0)).f22046b);
        ArrayList arrayList = new ArrayList();
        if (AbstractC6663m.m12750N(arrayListM10835j) instanceof InterfaceC4405e) {
            Iterator it = AbstractC6663m.m12758V(arrayListD0).iterator();
            while (it.hasNext()) {
                AbstractC4422v abstractC4422v = ((C4409i) it.next()).f22046b;
                arrayList.add(abstractC4422v);
                if (!(abstractC4422v instanceof InterfaceC4405e) && !(abstractC4422v instanceof C4423w)) {
                    break;
                }
            }
        }
        HashMap map = new HashMap();
        for (C4409i c4409i : AbstractC6663m.m12758V(arrayListD0)) {
            EnumC1645q enumC1645q = c4409i.f22052h.f29902k;
            AbstractC4422v abstractC4422v2 = c4409i.f22046b;
            AbstractC4422v abstractC4422v3 = (AbstractC4422v) AbstractC6663m.m12743G(arrayListM10835j);
            if (abstractC4422v3 != null && abstractC4422v3.f22135b.f29939e == abstractC4422v2.f22135b.f29939e) {
                EnumC1645q enumC1645q2 = EnumC1645q.RESUMED;
                if (enumC1645q != enumC1645q2) {
                    C4412l c4412l = (C4412l) this.f29926t.get(this.f29925s.m9233b(c4409i.f22046b.f22134a));
                    if (AbstractC4154l.m8918a((c4412l == null || (w0Var = c4412l.f22081f) == null || (set = (Set) w0Var.f39340a.getValue()) == null) ? null : Boolean.valueOf(set.contains(c4409i)), Boolean.TRUE) || ((c6134a = (C6134a) this.f29917k.get(c4409i)) != null && c6134a.f29890a.get() == 0)) {
                        map.put(c4409i, EnumC1645q.STARTED);
                    } else {
                        map.put(c4409i, enumC1645q2);
                    }
                }
                AbstractC4422v abstractC4422v4 = (AbstractC4422v) AbstractC6663m.m12743G(arrayList);
                if (abstractC4422v4 != null && abstractC4422v4.f22135b.f29939e == abstractC4422v2.f22135b.f29939e) {
                    AbstractC6663m.m12756T(arrayList);
                }
                AbstractC6663m.m12756T(arrayListM10835j);
                C4423w c4423w = abstractC4422v2.f22136c;
                if (c4423w != null) {
                    arrayListM10835j.add(c4423w);
                }
            } else if (arrayList.isEmpty() || abstractC4422v2.f22135b.f29939e != ((AbstractC4422v) AbstractC6663m.m12742F(arrayList)).f22135b.f29939e) {
                c4409i.m9214a(EnumC1645q.CREATED);
            } else {
                AbstractC4422v abstractC4422v5 = (AbstractC4422v) AbstractC6663m.m12756T(arrayList);
                if (enumC1645q == EnumC1645q.RESUMED) {
                    c4409i.m9214a(EnumC1645q.STARTED);
                } else {
                    EnumC1645q enumC1645q3 = EnumC1645q.STARTED;
                    if (enumC1645q != enumC1645q3) {
                        map.put(c4409i, enumC1645q3);
                    }
                }
                C4423w c4423w2 = abstractC4422v5.f22136c;
                if (c4423w2 != null && !arrayList.contains(c4423w2)) {
                    arrayList.add(c4423w2);
                }
            }
        }
        int size = arrayListD0.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayListD0.get(i10);
            i10++;
            C4409i c4409i2 = (C4409i) obj;
            EnumC1645q enumC1645q4 = (EnumC1645q) map.get(c4409i2);
            if (enumC1645q4 != null) {
                c4409i2.m9214a(enumC1645q4);
            } else {
                c4409i2.f22052h.m12164b();
            }
        }
    }
}
