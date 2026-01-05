package p001o;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import p001o.h5d;
import p001o.uxf;

/* loaded from: classes2.dex */
public final class gxf extends hxf {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gxf(uxf uxfVar) {
        super(uxfVar);
        sq8.m48649h(uxfVar, "map");
    }

    @Override // java.util.Set, java.util.Collection
    public /* bridge */ /* synthetic */ boolean add(Object obj) {
        return ((Boolean) m29631j(obj)).booleanValue();
    }

    @Override // java.util.Set, java.util.Collection
    public /* bridge */ /* synthetic */ boolean addAll(Collection collection) {
        return ((Boolean) m29632n(collection)).booleanValue();
    }

    @Override // java.util.Set, java.util.Collection
    public boolean contains(Object obj) {
        return m31268d().containsKey(obj);
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
            if (!m31268d().containsKey(it.next())) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: j */
    public Void m29631j(Object obj) {
        vxf.m53589b();
        throw new qe9();
    }

    /* renamed from: n */
    public Void m29632n(Collection collection) {
        sq8.m48649h(collection, "elements");
        vxf.m53589b();
        throw new qe9();
    }

    @Override // java.util.Set, java.util.Collection, java.lang.Iterable
    /* renamed from: o, reason: merged with bridge method [inline-methods] */
    public b5g iterator() {
        return new b5g(m31268d(), ((qf8) m31268d().m52109f().m52113i().entrySet()).iterator());
    }

    @Override // java.util.Set, java.util.Collection
    public boolean remove(Object obj) {
        return m31268d().remove(obj) != null;
    }

    @Override // java.util.Set, java.util.Collection
    public boolean removeAll(Collection collection) {
        sq8.m48649h(collection, "elements");
        Iterator it = collection.iterator();
        while (true) {
            boolean z = false;
            while (it.hasNext()) {
                if (m31268d().remove(it.next()) != null || z) {
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
        Set setV0 = kh3.V0(collection);
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
                Map.Entry entry = (Map.Entry) it.next();
                if (!setV0.contains(entry.getKey())) {
                    interfaceC13853aMo40065o.remove(entry.getKey());
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
