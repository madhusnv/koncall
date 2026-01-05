package e1;

import android.view.View;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import f1.AbstractC2176a;
import f1.C2177b;
import java.util.ArrayList;
import kotlin.jvm.internal.AbstractC4154l;
import yk.C8687a;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: e1.s */
/* loaded from: classes.dex */
public class C1917s {

    /* renamed from: a */
    public final /* synthetic */ int f9046a;

    /* renamed from: b */
    public int f9047b;

    /* renamed from: c */
    public int f9048c;

    /* renamed from: d */
    public int f9049d;

    /* renamed from: e */
    public int f9050e;

    /* renamed from: f */
    public final Object f9051f;

    /* renamed from: g */
    public final Object f9052g;

    public C1917s(int i10) {
        this.f9046a = 0;
        this.f9047b = i10;
        if (i10 <= 0) {
            AbstractC2176a.m5862c("maxSize <= 0");
            throw null;
        }
        this.f9051f = new C2177b(0);
        this.f9052g = new C8687a(8);
    }

    /* renamed from: a */
    public void m5613a() {
        View view = (View) ((ArrayList) this.f9051f).get(r0.size() - 1);
        y7.y0 y0Var = (y7.y0) view.getLayoutParams();
        this.f9048c = ((StaggeredGridLayoutManager) this.f9052g).f2849r.mo15902d(view);
        y0Var.getClass();
    }

    /* renamed from: b */
    public void m5614b() {
        ((ArrayList) this.f9051f).clear();
        this.f9047b = Integer.MIN_VALUE;
        this.f9048c = Integer.MIN_VALUE;
        this.f9049d = 0;
    }

    /* renamed from: c */
    public Object mo5615c(Object key) {
        AbstractC4154l.m8923f(key, "key");
        return null;
    }

    /* renamed from: d */
    public void mo5616d(Object key, Object oldValue, Object obj) {
        AbstractC4154l.m8923f(key, "key");
        AbstractC4154l.m8923f(oldValue, "oldValue");
    }

    /* renamed from: e */
    public int m5617e() {
        return ((StaggeredGridLayoutManager) this.f9052g).f2854w ? m5619g(r0.size() - 1, -1) : m5619g(0, ((ArrayList) this.f9051f).size());
    }

    /* renamed from: f */
    public int m5618f() {
        return ((StaggeredGridLayoutManager) this.f9052g).f2854w ? m5619g(0, ((ArrayList) this.f9051f).size()) : m5619g(r0.size() - 1, -1);
    }

    /* renamed from: g */
    public int m5619g(int i10, int i11) {
        StaggeredGridLayoutManager staggeredGridLayoutManager = (StaggeredGridLayoutManager) this.f9052g;
        int iMo15911m = staggeredGridLayoutManager.f2849r.mo15911m();
        int iMo15907i = staggeredGridLayoutManager.f2849r.mo15907i();
        int i12 = i11 > i10 ? 1 : -1;
        while (i10 != i11) {
            View view = (View) ((ArrayList) this.f9051f).get(i10);
            int iMo15905g = staggeredGridLayoutManager.f2849r.mo15905g(view);
            int iMo15902d = staggeredGridLayoutManager.f2849r.mo15902d(view);
            boolean z6 = iMo15905g <= iMo15907i;
            boolean z10 = iMo15902d >= iMo15911m;
            if (z6 && z10 && (iMo15905g < iMo15911m || iMo15902d > iMo15907i)) {
                return y7.f0.m15843D(view);
            }
            i10 += i12;
        }
        return -1;
    }

    /* renamed from: h */
    public Object m5620h(Object key) {
        Object objPut;
        AbstractC4154l.m8923f(key, "key");
        synchronized (((C8687a) this.f9052g)) {
            C2177b c2177b = (C2177b) this.f9051f;
            c2177b.getClass();
            Object obj = c2177b.f10051a.get(key);
            if (obj != null) {
                this.f9049d++;
                return obj;
            }
            this.f9050e++;
            Object objMo5615c = mo5615c(key);
            if (objMo5615c == null) {
                return null;
            }
            synchronized (((C8687a) this.f9052g)) {
                C2177b c2177b2 = (C2177b) this.f9051f;
                c2177b2.getClass();
                objPut = c2177b2.f10051a.put(key, objMo5615c);
                if (objPut != null) {
                    C2177b c2177b3 = (C2177b) this.f9051f;
                    c2177b3.getClass();
                    c2177b3.f10051a.put(key, objPut);
                } else {
                    this.f9048c += m5626n(key, objMo5615c);
                }
            }
            if (objPut != null) {
                mo5616d(key, objMo5615c, objPut);
                return objPut;
            }
            m5628p(this.f9047b);
            return objMo5615c;
        }
    }

    /* renamed from: i */
    public int m5621i(int i10) {
        int i11 = this.f9048c;
        if (i11 != Integer.MIN_VALUE) {
            return i11;
        }
        if (((ArrayList) this.f9051f).size() == 0) {
            return i10;
        }
        m5613a();
        return this.f9048c;
    }

    /* renamed from: j */
    public View m5622j(int i10, int i11) {
        StaggeredGridLayoutManager staggeredGridLayoutManager = (StaggeredGridLayoutManager) this.f9052g;
        ArrayList arrayList = (ArrayList) this.f9051f;
        View view = null;
        if (i11 != -1) {
            int size = arrayList.size() - 1;
            while (size >= 0) {
                View view2 = (View) arrayList.get(size);
                if ((staggeredGridLayoutManager.f2854w && y7.f0.m15843D(view2) >= i10) || ((!staggeredGridLayoutManager.f2854w && y7.f0.m15843D(view2) <= i10) || !view2.hasFocusable())) {
                    break;
                }
                size--;
                view = view2;
            }
            return view;
        }
        int size2 = arrayList.size();
        int i12 = 0;
        while (i12 < size2) {
            View view3 = (View) arrayList.get(i12);
            if ((staggeredGridLayoutManager.f2854w && y7.f0.m15843D(view3) <= i10) || ((!staggeredGridLayoutManager.f2854w && y7.f0.m15843D(view3) >= i10) || !view3.hasFocusable())) {
                break;
            }
            i12++;
            view = view3;
        }
        return view;
    }

    /* renamed from: k */
    public int m5623k(int i10) {
        ArrayList arrayList = (ArrayList) this.f9051f;
        int i11 = this.f9047b;
        if (i11 != Integer.MIN_VALUE) {
            return i11;
        }
        if (arrayList.size() == 0) {
            return i10;
        }
        View view = (View) arrayList.get(0);
        y7.y0 y0Var = (y7.y0) view.getLayoutParams();
        this.f9047b = ((StaggeredGridLayoutManager) this.f9052g).f2849r.mo15905g(view);
        y0Var.getClass();
        return this.f9047b;
    }

    /* renamed from: l */
    public Object m5624l(Object key, Object obj) {
        Object objPut;
        AbstractC4154l.m8923f(key, "key");
        synchronized (((C8687a) this.f9052g)) {
            this.f9048c += m5626n(key, obj);
            C2177b c2177b = (C2177b) this.f9051f;
            c2177b.getClass();
            objPut = c2177b.f10051a.put(key, obj);
            if (objPut != null) {
                this.f9048c -= m5626n(key, objPut);
            }
        }
        if (objPut != null) {
            mo5616d(key, objPut, obj);
        }
        m5628p(this.f9047b);
        return objPut;
    }

    /* renamed from: m */
    public Object m5625m(Object key) {
        Object objRemove;
        AbstractC4154l.m8923f(key, "key");
        synchronized (((C8687a) this.f9052g)) {
            C2177b c2177b = (C2177b) this.f9051f;
            c2177b.getClass();
            objRemove = c2177b.f10051a.remove(key);
            if (objRemove != null) {
                this.f9048c -= m5626n(key, objRemove);
            }
        }
        if (objRemove != null) {
            mo5616d(key, objRemove, null);
        }
        return objRemove;
    }

    /* renamed from: n */
    public int m5626n(Object obj, Object obj2) {
        int iMo5627o = mo5627o(obj, obj2);
        if (iMo5627o >= 0) {
            return iMo5627o;
        }
        String message = "Negative size: " + obj + '=' + obj2;
        AbstractC4154l.m8923f(message, "message");
        throw new IllegalStateException(message);
    }

    /* renamed from: o */
    public int mo5627o(Object key, Object value) {
        AbstractC4154l.m8923f(key, "key");
        AbstractC4154l.m8923f(value, "value");
        return 1;
    }

    /* JADX WARN: Code restructure failed: missing block: B:36:0x0092, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x009a, code lost:
    
        throw new java.lang.IllegalStateException("LruCache.sizeOf() is reporting inconsistent results!");
     */
    /* renamed from: p */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void m5628p(int r7) {
        /*
            r6 = this;
        L0:
            java.lang.Object r0 = r6.f9052g
            yk.a r0 = (yk.C8687a) r0
            monitor-enter(r0)
            int r1 = r6.f9048c     // Catch: java.lang.Throwable -> L1a
            if (r1 < 0) goto L93
            java.lang.Object r1 = r6.f9051f     // Catch: java.lang.Throwable -> L1a
            f1.b r1 = (f1.C2177b) r1     // Catch: java.lang.Throwable -> L1a
            java.util.LinkedHashMap r1 = r1.f10051a     // Catch: java.lang.Throwable -> L1a
            boolean r1 = r1.isEmpty()     // Catch: java.lang.Throwable -> L1a
            if (r1 == 0) goto L1d
            int r1 = r6.f9048c     // Catch: java.lang.Throwable -> L1a
            if (r1 != 0) goto L93
            goto L1d
        L1a:
            r7 = move-exception
            goto L9b
        L1d:
            int r1 = r6.f9048c     // Catch: java.lang.Throwable -> L1a
            if (r1 <= r7) goto L91
            java.lang.Object r1 = r6.f9051f     // Catch: java.lang.Throwable -> L1a
            f1.b r1 = (f1.C2177b) r1     // Catch: java.lang.Throwable -> L1a
            java.util.LinkedHashMap r1 = r1.f10051a     // Catch: java.lang.Throwable -> L1a
            boolean r1 = r1.isEmpty()     // Catch: java.lang.Throwable -> L1a
            if (r1 == 0) goto L2e
            goto L91
        L2e:
            java.lang.Object r1 = r6.f9051f     // Catch: java.lang.Throwable -> L1a
            f1.b r1 = (f1.C2177b) r1     // Catch: java.lang.Throwable -> L1a
            java.util.LinkedHashMap r1 = r1.f10051a     // Catch: java.lang.Throwable -> L1a
            java.util.Set r1 = r1.entrySet()     // Catch: java.lang.Throwable -> L1a
            java.lang.String r2 = "<get-entries>(...)"
            kotlin.jvm.internal.AbstractC4154l.m8922e(r1, r2)     // Catch: java.lang.Throwable -> L1a
            java.lang.Iterable r1 = (java.lang.Iterable) r1     // Catch: java.lang.Throwable -> L1a
            boolean r2 = r1 instanceof java.util.List     // Catch: java.lang.Throwable -> L1a
            r3 = 0
            if (r2 == 0) goto L54
            java.util.List r1 = (java.util.List) r1     // Catch: java.lang.Throwable -> L1a
            boolean r2 = r1.isEmpty()     // Catch: java.lang.Throwable -> L1a
            if (r2 == 0) goto L4e
        L4c:
            r1 = r3
            goto L63
        L4e:
            r2 = 0
            java.lang.Object r1 = r1.get(r2)     // Catch: java.lang.Throwable -> L1a
            goto L63
        L54:
            java.util.Iterator r1 = r1.iterator()     // Catch: java.lang.Throwable -> L1a
            boolean r2 = r1.hasNext()     // Catch: java.lang.Throwable -> L1a
            if (r2 != 0) goto L5f
            goto L4c
        L5f:
            java.lang.Object r1 = r1.next()     // Catch: java.lang.Throwable -> L1a
        L63:
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1     // Catch: java.lang.Throwable -> L1a
            if (r1 != 0) goto L69
            monitor-exit(r0)
            return
        L69:
            java.lang.Object r2 = r1.getKey()     // Catch: java.lang.Throwable -> L1a
            java.lang.Object r1 = r1.getValue()     // Catch: java.lang.Throwable -> L1a
            java.lang.Object r4 = r6.f9051f     // Catch: java.lang.Throwable -> L1a
            f1.b r4 = (f1.C2177b) r4     // Catch: java.lang.Throwable -> L1a
            r4.getClass()     // Catch: java.lang.Throwable -> L1a
            java.lang.String r5 = "key"
            kotlin.jvm.internal.AbstractC4154l.m8923f(r2, r5)     // Catch: java.lang.Throwable -> L1a
            java.util.LinkedHashMap r4 = r4.f10051a     // Catch: java.lang.Throwable -> L1a
            r4.remove(r2)     // Catch: java.lang.Throwable -> L1a
            int r4 = r6.f9048c     // Catch: java.lang.Throwable -> L1a
            int r5 = r6.m5626n(r2, r1)     // Catch: java.lang.Throwable -> L1a
            int r4 = r4 - r5
            r6.f9048c = r4     // Catch: java.lang.Throwable -> L1a
            monitor-exit(r0)
            r6.mo5616d(r2, r1, r3)
            goto L0
        L91:
            monitor-exit(r0)
            return
        L93:
            java.lang.String r7 = "LruCache.sizeOf() is reporting inconsistent results!"
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L1a
            r1.<init>(r7)     // Catch: java.lang.Throwable -> L1a
            throw r1     // Catch: java.lang.Throwable -> L1a
        L9b:
            monitor-exit(r0)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: e1.C1917s.m5628p(int):void");
    }

    public String toString() {
        String str;
        switch (this.f9046a) {
            case 0:
                synchronized (((C8687a) this.f9052g)) {
                    try {
                        int i10 = this.f9049d;
                        int i11 = this.f9050e + i10;
                        str = "LruCache[maxSize=" + this.f9047b + ",hits=" + this.f9049d + ",misses=" + this.f9050e + ",hitRate=" + (i11 != 0 ? (i10 * 100) / i11 : 0) + "%]";
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                return str;
            default:
                return super.toString();
        }
    }

    public C1917s(StaggeredGridLayoutManager staggeredGridLayoutManager, int i10) {
        this.f9046a = 1;
        this.f9052g = staggeredGridLayoutManager;
        this.f9051f = new ArrayList();
        this.f9047b = Integer.MIN_VALUE;
        this.f9048c = Integer.MIN_VALUE;
        this.f9049d = 0;
        this.f9050e = i10;
    }
}
