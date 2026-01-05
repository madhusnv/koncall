package androidx.work.impl;

import android.content.Context;
import c9.AbstractC0911f;
import c9.C0907b;
import c9.C0908c;
import c9.C0910e;
import c9.C0913h;
import c9.C0914i;
import c9.C0917l;
import c9.C0919n;
import c9.C0925t;
import c9.C0927v;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.AbstractC4154l;
import l4.d0;
import l8.C4429c;
import l8.InterfaceC4431e;
import u8.C7355c;
import z7.C8873b;
import z7.C8881j;
import z7.C8895x;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class WorkDatabase_Impl extends WorkDatabase {

    /* renamed from: l */
    public volatile C0925t f2874l;

    /* renamed from: m */
    public volatile C0908c f2875m;

    /* renamed from: n */
    public volatile C0927v f2876n;

    /* renamed from: o */
    public volatile C0914i f2877o;

    /* renamed from: p */
    public volatile C0917l f2878p;

    /* renamed from: q */
    public volatile C0919n f2879q;

    /* renamed from: r */
    public volatile C0910e f2880r;

    @Override // androidx.work.impl.WorkDatabase
    /* renamed from: A */
    public final C0917l mo1366A() {
        C0917l c0917l;
        if (this.f2878p != null) {
            return this.f2878p;
        }
        synchronized (this) {
            try {
                if (this.f2878p == null) {
                    this.f2878p = new C0917l(this);
                }
                c0917l = this.f2878p;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return c0917l;
    }

    @Override // androidx.work.impl.WorkDatabase
    /* renamed from: B */
    public final C0919n mo1367B() {
        C0919n c0919n;
        if (this.f2879q != null) {
            return this.f2879q;
        }
        synchronized (this) {
            try {
                if (this.f2879q == null) {
                    C0919n c0919n2 = new C0919n();
                    c0919n2.f5598a = this;
                    c0919n2.f5599b = new C0907b(this, 4);
                    c0919n2.f5600c = new C0913h(this, 2);
                    c0919n2.f5601d = new C0913h(this, 3);
                    this.f2879q = c0919n2;
                }
                c0919n = this.f2879q;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return c0919n;
    }

    @Override // androidx.work.impl.WorkDatabase
    /* renamed from: C */
    public final C0925t mo1368C() {
        C0925t c0925t;
        if (this.f2874l != null) {
            return this.f2874l;
        }
        synchronized (this) {
            try {
                if (this.f2874l == null) {
                    this.f2874l = new C0925t(this);
                }
                c0925t = this.f2874l;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return c0925t;
    }

    @Override // androidx.work.impl.WorkDatabase
    /* renamed from: D */
    public final C0927v mo1369D() {
        C0927v c0927v;
        if (this.f2876n != null) {
            return this.f2876n;
        }
        synchronized (this) {
            try {
                if (this.f2876n == null) {
                    this.f2876n = new C0927v(this);
                }
                c0927v = this.f2876n;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return c0927v;
    }

    @Override // z7.AbstractC8894w
    /* renamed from: e */
    public final C8881j mo1373e() {
        return new C8881j(this, new HashMap(0), new HashMap(0), "Dependency", "WorkSpec", "WorkTag", "SystemIdInfo", "WorkName", "WorkProgress", "Preference");
    }

    @Override // z7.AbstractC8894w
    /* renamed from: g */
    public final InterfaceC4431e mo1374g(C8873b c8873b) {
        C8895x c8895x = new C8895x(c8873b, new d0(22, this));
        Context context = c8873b.f42690a;
        AbstractC4154l.m8923f(context, "context");
        return c8873b.f42692c.mo25c(new C4429c(context, c8873b.f42691b, c8895x, false, false));
    }

    @Override // z7.AbstractC8894w
    /* renamed from: h */
    public final List mo1375h(LinkedHashMap linkedHashMap) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new C7355c(13, 14, 10));
        arrayList.add(new C7355c(11));
        int i10 = 17;
        arrayList.add(new C7355c(16, i10, 12));
        int i11 = 18;
        arrayList.add(new C7355c(i10, i11, 13));
        arrayList.add(new C7355c(i11, 19, 14));
        arrayList.add(new C7355c(15));
        arrayList.add(new C7355c(20, 21, 16));
        arrayList.add(new C7355c(22, 23, 17));
        return arrayList;
    }

    @Override // z7.AbstractC8894w
    /* renamed from: m */
    public final Set mo1376m() {
        return new HashSet();
    }

    @Override // z7.AbstractC8894w
    /* renamed from: o */
    public final Map mo1377o() {
        HashMap map = new HashMap();
        List list = Collections.EMPTY_LIST;
        map.put(C0925t.class, list);
        map.put(C0908c.class, list);
        map.put(C0927v.class, list);
        map.put(C0914i.class, list);
        map.put(C0917l.class, list);
        map.put(C0919n.class, list);
        map.put(C0910e.class, list);
        map.put(AbstractC0911f.class, list);
        return map;
    }

    @Override // androidx.work.impl.WorkDatabase
    /* renamed from: x */
    public final C0908c mo1370x() {
        C0908c c0908c;
        if (this.f2875m != null) {
            return this.f2875m;
        }
        synchronized (this) {
            try {
                if (this.f2875m == null) {
                    this.f2875m = new C0908c(this);
                }
                c0908c = this.f2875m;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return c0908c;
    }

    @Override // androidx.work.impl.WorkDatabase
    /* renamed from: y */
    public final C0910e mo1371y() {
        C0910e c0910e;
        if (this.f2880r != null) {
            return this.f2880r;
        }
        synchronized (this) {
            try {
                if (this.f2880r == null) {
                    this.f2880r = new C0910e((WorkDatabase) this);
                }
                c0910e = this.f2880r;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return c0910e;
    }

    @Override // androidx.work.impl.WorkDatabase
    /* renamed from: z */
    public final C0914i mo1372z() {
        C0914i c0914i;
        if (this.f2877o != null) {
            return this.f2877o;
        }
        synchronized (this) {
            try {
                if (this.f2877o == null) {
                    C0914i c0914i2 = new C0914i();
                    c0914i2.f5585a = this;
                    c0914i2.f5586b = new C0907b(this, 2);
                    c0914i2.f5587c = new C0913h(this, 0);
                    c0914i2.f5588d = new C0913h(this, 1);
                    this.f2877o = c0914i2;
                }
                c0914i = this.f2877o;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return c0914i;
    }
}
