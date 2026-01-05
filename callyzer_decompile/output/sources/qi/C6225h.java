package qi;

import a1.RunnableC0012k;
import ak.C0169h;
import com.google.firebase.components.ComponentRegistrar;
import com.google.firebase.components.InvalidRegistrarException;
import com.google.firebase.components.MissingDependencyException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;
import ji.C3769c;
import nj.InterfaceC5076b;
import nj.InterfaceC5077c;
import og.ed;
import og.fd;
import qj.InterfaceC6237b;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: qi.h */
/* loaded from: classes.dex */
public final class C6225h implements InterfaceC6220c {

    /* renamed from: h */
    public static final C0169h f30225h = new C0169h(1);

    /* renamed from: e */
    public final C6229l f30230e;

    /* renamed from: g */
    public final InterfaceC6223f f30232g;

    /* renamed from: a */
    public final HashMap f30226a = new HashMap();

    /* renamed from: b */
    public final HashMap f30227b = new HashMap();

    /* renamed from: c */
    public final HashMap f30228c = new HashMap();

    /* renamed from: d */
    public final HashSet f30229d = new HashSet();

    /* renamed from: f */
    public final AtomicReference f30231f = new AtomicReference();

    public C6225h(Executor executor, ArrayList arrayList, ArrayList arrayList2, InterfaceC6223f interfaceC6223f) {
        C6229l c6229l = new C6229l(executor);
        this.f30230e = c6229l;
        this.f30232g = interfaceC6223f;
        ArrayList arrayList3 = new ArrayList();
        arrayList3.add(C6219b.m12233c(c6229l, C6229l.class, InterfaceC5077c.class, InterfaceC5076b.class));
        int i10 = 0;
        arrayList3.add(C6219b.m12233c(this, C6225h.class, new Class[0]));
        int size = arrayList2.size();
        int i11 = 0;
        while (i11 < size) {
            Object obj = arrayList2.get(i11);
            i11++;
            C6219b c6219b = (C6219b) obj;
            if (c6219b != null) {
                arrayList3.add(c6219b);
            }
        }
        ArrayList arrayList4 = new ArrayList();
        int size2 = arrayList.size();
        int i12 = 0;
        while (i12 < size2) {
            Object obj2 = arrayList.get(i12);
            i12++;
            arrayList4.add(obj2);
        }
        ArrayList arrayList5 = new ArrayList();
        synchronized (this) {
            Iterator it = arrayList4.iterator();
            while (it.hasNext()) {
                try {
                    ComponentRegistrar componentRegistrar = (ComponentRegistrar) ((InterfaceC6237b) it.next()).get();
                    if (componentRegistrar != null) {
                        arrayList3.addAll(this.f30232g.mo1987b(componentRegistrar));
                        it.remove();
                    }
                } catch (InvalidRegistrarException unused) {
                    it.remove();
                }
            }
            Iterator it2 = arrayList3.iterator();
            while (it2.hasNext()) {
                Object[] array = ((C6219b) it2.next()).f30214b.toArray();
                int length = array.length;
                int i13 = 0;
                while (true) {
                    if (i13 < length) {
                        Object obj3 = array[i13];
                        if (obj3.toString().contains("kotlinx.coroutines.CoroutineDispatcher")) {
                            if (this.f30229d.contains(obj3.toString())) {
                                it2.remove();
                                break;
                            }
                            this.f30229d.add(obj3.toString());
                        }
                        i13++;
                    }
                }
            }
            if (this.f30226a.isEmpty()) {
                ed.m10628a(arrayList3);
            } else {
                ArrayList arrayList6 = new ArrayList(this.f30226a.keySet());
                arrayList6.addAll(arrayList3);
                ed.m10628a(arrayList6);
            }
            int size3 = arrayList3.size();
            int i14 = 0;
            while (i14 < size3) {
                Object obj4 = arrayList3.get(i14);
                i14++;
                C6219b c6219b2 = (C6219b) obj4;
                this.f30226a.put(c6219b2, new C6230m(new C3769c(2, this, c6219b2)));
            }
            arrayList5.addAll(m12244k(arrayList3));
            arrayList5.addAll(m12245l());
            m12243j();
        }
        int size4 = arrayList5.size();
        while (i10 < size4) {
            Object obj5 = arrayList5.get(i10);
            i10++;
            ((Runnable) obj5).run();
        }
        Boolean bool = (Boolean) this.f30231f.get();
        if (bool != null) {
            m12241h(this.f30226a, bool.booleanValue());
        }
    }

    @Override // qi.InterfaceC6220c
    /* renamed from: b */
    public final C6232o mo12235b(C6234q c6234q) {
        InterfaceC6237b interfaceC6237bMo12240g = mo12240g(c6234q);
        return interfaceC6237bMo12240g == null ? new C6232o(C6232o.f30249c, C6232o.f30250d) : interfaceC6237bMo12240g instanceof C6232o ? (C6232o) interfaceC6237bMo12240g : new C6232o(null, interfaceC6237bMo12240g);
    }

    @Override // qi.InterfaceC6220c
    /* renamed from: e */
    public final synchronized InterfaceC6237b mo12238e(C6234q c6234q) {
        C6231n c6231n = (C6231n) this.f30228c.get(c6234q);
        if (c6231n != null) {
            return c6231n;
        }
        return f30225h;
    }

    @Override // qi.InterfaceC6220c
    /* renamed from: g */
    public final synchronized InterfaceC6237b mo12240g(C6234q c6234q) {
        fd.m10650a(c6234q, "Null interface requested.");
        return (InterfaceC6237b) this.f30227b.get(c6234q);
    }

    /* renamed from: h */
    public final void m12241h(HashMap map, boolean z6) {
        ArrayDeque arrayDeque;
        for (Map.Entry entry : map.entrySet()) {
            C6219b c6219b = (C6219b) entry.getKey();
            InterfaceC6237b interfaceC6237b = (InterfaceC6237b) entry.getValue();
            int i10 = c6219b.f30216d;
            if (i10 == 1 || (i10 == 2 && z6)) {
                interfaceC6237b.get();
            }
        }
        C6229l c6229l = this.f30230e;
        synchronized (c6229l) {
            try {
                arrayDeque = c6229l.f30242b;
                if (arrayDeque != null) {
                    c6229l.f30242b = null;
                } else {
                    arrayDeque = null;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (arrayDeque != null) {
            Iterator it = arrayDeque.iterator();
            if (it.hasNext()) {
                it.next().getClass();
                throw new ClassCastException();
            }
        }
    }

    /* renamed from: i */
    public final void m12242i(boolean z6) {
        HashMap map;
        AtomicReference atomicReference = this.f30231f;
        Boolean boolValueOf = Boolean.valueOf(z6);
        while (!atomicReference.compareAndSet(null, boolValueOf)) {
            if (atomicReference.get() != null) {
                return;
            }
        }
        synchronized (this) {
            map = new HashMap(this.f30226a);
        }
        m12241h(map, z6);
    }

    /* renamed from: j */
    public final void m12243j() {
        HashMap map = this.f30227b;
        HashMap map2 = this.f30228c;
        for (C6219b c6219b : this.f30226a.keySet()) {
            for (C6228k c6228k : c6219b.f30215c) {
                boolean z6 = c6228k.f30239b == 2;
                C6234q c6234q = c6228k.f30238a;
                if (z6 && !map2.containsKey(c6234q)) {
                    Set set = Collections.EMPTY_SET;
                    C6231n c6231n = new C6231n();
                    c6231n.f30248b = null;
                    c6231n.f30247a = Collections.newSetFromMap(new ConcurrentHashMap());
                    c6231n.f30247a.addAll(set);
                    map2.put(c6234q, c6231n);
                } else if (map.containsKey(c6234q)) {
                    continue;
                } else {
                    int i10 = c6228k.f30239b;
                    if (i10 == 1) {
                        throw new MissingDependencyException("Unsatisfied dependency for component " + c6219b + ": " + c6234q);
                    }
                    if (i10 != 2) {
                        map.put(c6234q, new C6232o(C6232o.f30249c, C6232o.f30250d));
                    }
                }
            }
        }
    }

    /* renamed from: k */
    public final ArrayList m12244k(ArrayList arrayList) {
        ArrayList arrayList2 = new ArrayList();
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            C6219b c6219b = (C6219b) obj;
            if (c6219b.f30217e == 0) {
                InterfaceC6237b interfaceC6237b = (InterfaceC6237b) this.f30226a.get(c6219b);
                for (C6234q c6234q : c6219b.f30214b) {
                    HashMap map = this.f30227b;
                    if (map.containsKey(c6234q)) {
                        arrayList2.add(new RunnableC0012k(29, (C6232o) ((InterfaceC6237b) map.get(c6234q)), interfaceC6237b));
                    } else {
                        map.put(c6234q, interfaceC6237b);
                    }
                }
            }
        }
        return arrayList2;
    }

    /* renamed from: l */
    public final ArrayList m12245l() {
        HashMap map = this.f30228c;
        ArrayList arrayList = new ArrayList();
        HashMap map2 = new HashMap();
        for (Map.Entry entry : this.f30226a.entrySet()) {
            C6219b c6219b = (C6219b) entry.getKey();
            if (c6219b.f30217e != 0) {
                InterfaceC6237b interfaceC6237b = (InterfaceC6237b) entry.getValue();
                for (C6234q c6234q : c6219b.f30214b) {
                    if (!map2.containsKey(c6234q)) {
                        map2.put(c6234q, new HashSet());
                    }
                    ((Set) map2.get(c6234q)).add(interfaceC6237b);
                }
            }
        }
        for (Map.Entry entry2 : map2.entrySet()) {
            if (map.containsKey(entry2.getKey())) {
                C6231n c6231n = (C6231n) map.get(entry2.getKey());
                Iterator it = ((Set) entry2.getValue()).iterator();
                while (it.hasNext()) {
                    arrayList.add(new RunnableC6224g(0, c6231n, (InterfaceC6237b) it.next()));
                }
            } else {
                C6234q c6234q2 = (C6234q) entry2.getKey();
                Set set = (Set) ((Collection) entry2.getValue());
                C6231n c6231n2 = new C6231n();
                c6231n2.f30248b = null;
                c6231n2.f30247a = Collections.newSetFromMap(new ConcurrentHashMap());
                c6231n2.f30247a.addAll(set);
                map.put(c6234q2, c6231n2);
            }
        }
        return arrayList;
    }
}
