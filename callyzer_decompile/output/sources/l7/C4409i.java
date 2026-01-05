package l7;

import android.os.Bundle;
import aw.C0465e;
import d7.AbstractC1646r;
import d7.EnumC1645q;
import d7.InterfaceC1637j;
import d7.InterfaceC1649u;
import d7.b1;
import d7.c1;
import d7.y0;
import g8.C2545e;
import g8.InterfaceC2547g;
import h6.C2856l;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Set;
import kotlin.jvm.internal.AbstractC4154l;
import og.nd;
import q7.C6136c;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: l7.i */
/* loaded from: classes.dex */
public final class C4409i implements InterfaceC1649u, c1, InterfaceC1637j, InterfaceC2547g {

    /* renamed from: a */
    public final C2856l f22045a;

    /* renamed from: b */
    public AbstractC4422v f22046b;

    /* renamed from: c */
    public final Bundle f22047c;

    /* renamed from: d */
    public EnumC1645q f22048d;

    /* renamed from: e */
    public final C4413m f22049e;

    /* renamed from: f */
    public final String f22050f;

    /* renamed from: g */
    public final Bundle f22051g;

    /* renamed from: h */
    public final C6136c f22052h = new C6136c(this);

    public C4409i(C2856l c2856l, AbstractC4422v abstractC4422v, Bundle bundle, EnumC1645q enumC1645q, C4413m c4413m, String str, Bundle bundle2) {
        this.f22045a = c2856l;
        this.f22046b = abstractC4422v;
        this.f22047c = bundle;
        this.f22048d = enumC1645q;
        this.f22049e = c4413m;
        this.f22050f = str;
        this.f22051g = bundle2;
        nd.m10782c(new C0465e(19, this));
    }

    /* renamed from: a */
    public final void m9214a(EnumC1645q value) {
        AbstractC4154l.m8923f(value, "value");
        C6136c c6136c = this.f22052h;
        c6136c.getClass();
        c6136c.f29902k = value;
        c6136c.m12164b();
    }

    public final boolean equals(Object obj) {
        Set<String> setKeySet;
        if (obj != null && (obj instanceof C4409i)) {
            C4409i c4409i = (C4409i) obj;
            Bundle bundle = c4409i.f22047c;
            if (AbstractC4154l.m8918a(this.f22050f, c4409i.f22050f) && AbstractC4154l.m8918a(this.f22046b, c4409i.f22046b) && AbstractC4154l.m8918a(this.f22052h.f29901j, c4409i.f22052h.f29901j) && AbstractC4154l.m8918a(getSavedStateRegistry(), c4409i.getSavedStateRegistry())) {
                Bundle bundle2 = this.f22047c;
                if (AbstractC4154l.m8918a(bundle2, bundle)) {
                    return true;
                }
                if (bundle2 != null && (setKeySet = bundle2.keySet()) != null) {
                    Set<String> set = setKeySet;
                    if ((set instanceof Collection) && set.isEmpty()) {
                        return true;
                    }
                    for (String str : set) {
                        if (!AbstractC4154l.m8918a(bundle2.get(str), bundle != null ? bundle.get(str) : null)) {
                        }
                    }
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x003a  */
    @Override // d7.InterfaceC1637j
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final g7.AbstractC2538c getDefaultViewModelCreationExtras() {
        /*
            r5 = this;
            q7.c r0 = r5.f22052h
            r0.getClass()
            g7.d r1 = new g7.d
            r2 = 0
            r1.<init>(r2)
            bl.a r2 = d7.q0.f8124a
            l7.i r3 = r0.f29892a
            java.util.LinkedHashMap r4 = r1.f13868a
            r4.put(r2, r3)
            ng.u r2 = d7.q0.f8125b
            r4.put(r2, r3)
            android.os.Bundle r0 = r0.m12163a()
            if (r0 == 0) goto L24
            oj.d r2 = d7.q0.f8126c
            r4.put(r2, r0)
        L24:
            r0 = 0
            h6.l r2 = r5.f22045a
            if (r2 == 0) goto L3a
            android.content.Context r2 = r2.f15864a
            if (r2 == 0) goto L32
            android.content.Context r2 = r2.getApplicationContext()
            goto L33
        L32:
            r2 = r0
        L33:
            boolean r3 = r2 instanceof android.app.Application
            if (r3 == 0) goto L3a
            android.app.Application r2 = (android.app.Application) r2
            goto L3b
        L3a:
            r2 = r0
        L3b:
            if (r2 == 0) goto L3e
            r0 = r2
        L3e:
            if (r0 == 0) goto L45
            ph.e r2 = d7.x0.f8158d
            r4.put(r2, r0)
        L45:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: l7.C4409i.getDefaultViewModelCreationExtras():g7.c");
    }

    @Override // d7.InterfaceC1637j
    public final y0 getDefaultViewModelProviderFactory() {
        return this.f22052h.f29903l;
    }

    @Override // d7.InterfaceC1649u
    public final AbstractC1646r getLifecycle() {
        return this.f22052h.f29901j;
    }

    @Override // g8.InterfaceC2547g
    public final C2545e getSavedStateRegistry() {
        return this.f22052h.f29899h.f13877b;
    }

    @Override // d7.c1
    public final b1 getViewModelStore() {
        C6136c c6136c = this.f22052h;
        if (!c6136c.f29900i) {
            throw new IllegalStateException("You cannot access the NavBackStackEntry's ViewModels until it is added to the NavController's back stack (i.e., the Lifecycle of the NavBackStackEntry reaches the CREATED state).");
        }
        if (c6136c.f29901j.f8148c == EnumC1645q.DESTROYED) {
            throw new IllegalStateException("You cannot access the NavBackStackEntry's ViewModels after the NavBackStackEntry is destroyed.");
        }
        C4413m c4413m = c6136c.f29896e;
        if (c4413m == null) {
            throw new IllegalStateException("You must call setViewModelStore() on your NavHostController before accessing the ViewModelStore of a navigation graph.");
        }
        String backStackEntryId = c6136c.f29897f;
        AbstractC4154l.m8923f(backStackEntryId, "backStackEntryId");
        LinkedHashMap linkedHashMap = c4413m.f22084b;
        b1 b1Var = (b1) linkedHashMap.get(backStackEntryId);
        if (b1Var != null) {
            return b1Var;
        }
        b1 b1Var2 = new b1();
        linkedHashMap.put(backStackEntryId, b1Var2);
        return b1Var2;
    }

    public final int hashCode() {
        Set<String> setKeySet;
        int iHashCode = this.f22046b.hashCode() + (this.f22050f.hashCode() * 31);
        Bundle bundle = this.f22047c;
        if (bundle != null && (setKeySet = bundle.keySet()) != null) {
            Iterator<T> it = setKeySet.iterator();
            while (it.hasNext()) {
                int i10 = iHashCode * 31;
                Object obj = bundle.get((String) it.next());
                iHashCode = i10 + (obj != null ? obj.hashCode() : 0);
            }
        }
        return getSavedStateRegistry().hashCode() + ((this.f22052h.f29901j.hashCode() + (iHashCode * 31)) * 31);
    }

    public final String toString() {
        return this.f22052h.toString();
    }
}
