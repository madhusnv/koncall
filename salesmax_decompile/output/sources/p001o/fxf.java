package p001o;

import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import p001o.h5d;
import p001o.uxf;

/* loaded from: classes2.dex */
public final class fxf extends hxf {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fxf(uxf uxfVar) {
        super(uxfVar);
        sq8.m48649h(uxfVar, "map");
    }

    @Override // java.util.Set, java.util.Collection
    public /* bridge */ /* synthetic */ boolean add(Object obj) {
        return ((Boolean) m27720j((Map.Entry) obj)).booleanValue();
    }

    @Override // java.util.Set, java.util.Collection
    public /* bridge */ /* synthetic */ boolean addAll(Collection collection) {
        return ((Boolean) m27721n(collection)).booleanValue();
    }

    @Override // java.util.Set, java.util.Collection
    public final /* bridge */ boolean contains(Object obj) {
        if (azh.m18060m(obj)) {
            return m27722o((Map.Entry) obj);
        }
        return false;
    }

    @Override // java.util.Set, java.util.Collection
    public boolean containsAll(Collection collection) {
        sq8.m48649h(collection, "elements");
        Collection collection2 = collection;
        if (collection2.isEmpty()) {
            return true;
        }
        Iterator it = collection2.iterator();
        while (it.hasNext()) {
            if (!contains((Map.Entry) it.next())) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.Set, java.util.Collection, java.lang.Iterable
    public Iterator iterator() {
        return new z4g(m31268d(), ((qf8) m31268d().m52109f().m52113i().entrySet()).iterator());
    }

    /* renamed from: j */
    public Void m27720j(Map.Entry entry) {
        sq8.m48649h(entry, "element");
        vxf.m53589b();
        throw new qe9();
    }

    /* renamed from: n */
    public Void m27721n(Collection collection) {
        sq8.m48649h(collection, "elements");
        vxf.m53589b();
        throw new qe9();
    }

    /* renamed from: o */
    public boolean m27722o(Map.Entry entry) {
        sq8.m48649h(entry, "element");
        return sq8.m48644c(m31268d().get(entry.getKey()), entry.getValue());
    }

    /* renamed from: p */
    public boolean m27723p(Map.Entry entry) {
        sq8.m48649h(entry, "element");
        return m31268d().remove(entry.getKey()) != null;
    }

    @Override // java.util.Set, java.util.Collection
    public final /* bridge */ boolean remove(Object obj) {
        if (azh.m18060m(obj)) {
            return m27723p((Map.Entry) obj);
        }
        return false;
    }

    @Override // java.util.Set, java.util.Collection
    public boolean removeAll(Collection collection) {
        sq8.m48649h(collection, "elements");
        Iterator it = collection.iterator();
        while (true) {
            boolean z = false;
            while (it.hasNext()) {
                if (m31268d().remove(((Map.Entry) it.next()).getKey()) != null || z) {
                    z = true;
                }
            }
            return z;
        }
    }

    @Override // java.util.Set, java.util.Collection
    public boolean retainAll(Collection collection) {
        h5d h5dVarM52113i;
        int iM52114j;
        boolean z;
        xwf xwfVarM56928b;
        sq8.m48649h(collection, "elements");
        Collection<Map.Entry> collection2 = collection;
        LinkedHashMap linkedHashMap = new LinkedHashMap(bce.m18601d(hsa.m31055e(dh3.m23088v(collection2, 10)), 16));
        for (Map.Entry entry : collection2) {
            hwc hwcVarM53620a = vyh.m53620a(entry.getKey(), entry.getValue());
            linkedHashMap.put(hwcVarM53620a.m31229c(), hwcVarM53620a.m31230d());
        }
        uxf uxfVarM31268d = m31268d();
        boolean z2 = false;
        do {
            synchronized (vxf.f51007a) {
                f5g f5gVarMo22332n = uxfVarM31268d.mo22332n();
                sq8.m48647f(f5gVarMo22332n, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap, V of androidx.compose.runtime.snapshots.SnapshotStateMap>");
                uxf.C17469a c17469a = (uxf.C17469a) exf.m25772D((uxf.C17469a) f5gVarMo22332n);
                h5dVarM52113i = c17469a.m52113i();
                iM52114j = c17469a.m52114j();
                y3i y3iVar = y3i.f54824a;
            }
            sq8.m48646e(h5dVarM52113i);
            h5d.InterfaceC13853a interfaceC13853aMo40065o = h5dVarM52113i.mo40065o();
            Iterator it = uxfVarM31268d.entrySet().iterator();
            while (true) {
                z = true;
                if (!it.hasNext()) {
                    break;
                }
                Map.Entry entry2 = (Map.Entry) it.next();
                if ((linkedHashMap.containsKey(entry2.getKey()) && sq8.m48644c(linkedHashMap.get(entry2.getKey()), entry2.getValue())) ? false : true) {
                    interfaceC13853aMo40065o.remove(entry2.getKey());
                    z2 = true;
                }
            }
            y3i y3iVar2 = y3i.f54824a;
            h5d h5dVarBuild = interfaceC13853aMo40065o.build();
            if (sq8.m48644c(h5dVarBuild, h5dVarM52113i)) {
                break;
            }
            f5g f5gVarMo22332n2 = uxfVarM31268d.mo22332n();
            sq8.m48647f(f5gVarMo22332n2, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap, V of androidx.compose.runtime.snapshots.SnapshotStateMap>");
            uxf.C17469a c17469a2 = (uxf.C17469a) f5gVarMo22332n2;
            exf.m25776H();
            synchronized (exf.m25775G()) {
                xwfVarM56928b = xwf.f54441e.m56928b();
                uxf.C17469a c17469a3 = (uxf.C17469a) exf.f0(c17469a2, uxfVarM31268d, xwfVarM56928b);
                synchronized (vxf.f51007a) {
                    if (c17469a3.m52114j() == iM52114j) {
                        c17469a3.m52115k(h5dVarBuild);
                        c17469a3.m52116l(c17469a3.m52114j() + 1);
                    } else {
                        z = false;
                    }
                }
            }
            exf.m25783O(xwfVarM56928b, uxfVarM31268d);
        } while (!z);
        return z2;
    }
}
