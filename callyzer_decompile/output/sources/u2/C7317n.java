package u2;

import fx.InterfaceC2395a;
import fx.InterfaceC2398d;
import fx.InterfaceC2400f;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.AbstractC4153k;
import kotlin.jvm.internal.AbstractC4154l;
import n2.InterfaceC4943b;
import n2.InterfaceC4944c;
import n2.InterfaceC4945d;
import rw.AbstractC6663m;
import rw.AbstractC6664n;
import rw.AbstractC6674x;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: u2.n */
/* loaded from: classes.dex */
public final class C7317n implements Set, InterfaceC2400f {

    /* renamed from: a */
    public final C7323t f34899a;

    /* renamed from: b */
    public final /* synthetic */ int f34900b;

    public C7317n(C7323t c7323t, int i10) {
        this.f34900b = i10;
        this.f34899a = c7323t;
    }

    /* renamed from: b */
    private final boolean m13699b(Collection collection) {
        InterfaceC4945d interfaceC4945d;
        int i10;
        AbstractC7311h abstractC7311hM13686k;
        boolean zM13711d;
        Set setG0 = AbstractC6663m.g0(collection);
        C7323t c7323t = this.f34899a;
        boolean z6 = false;
        do {
            synchronized (AbstractC7321r.f34906b) {
                C7322s c7322s = c7323t.f34909a;
                AbstractC4154l.m8921d(c7322s, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap, V of androidx.compose.runtime.snapshots.SnapshotStateMap>");
                C7322s c7322s2 = (C7322s) AbstractC7316m.m13684i(c7322s);
                interfaceC4945d = c7322s2.f34907c;
                i10 = c7322s2.f34908d;
            }
            AbstractC4154l.m8920c(interfaceC4945d);
            InterfaceC4944c interfaceC4944cBuilder = interfaceC4945d.builder();
            Iterator it = c7323t.f34910b.iterator();
            while (((C7327x) it).hasNext()) {
                Map.Entry entry = (Map.Entry) ((C7327x) it).next();
                if (!setG0.contains(entry.getKey())) {
                    interfaceC4944cBuilder.remove(entry.getKey());
                    z6 = true;
                }
            }
            InterfaceC4945d interfaceC4945dBuild = interfaceC4944cBuilder.build();
            if (AbstractC4154l.m8918a(interfaceC4945dBuild, interfaceC4945d)) {
                break;
            }
            C7322s c7322s3 = c7323t.f34909a;
            AbstractC4154l.m8921d(c7322s3, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap, V of androidx.compose.runtime.snapshots.SnapshotStateMap>");
            synchronized (AbstractC7316m.f34890b) {
                abstractC7311hM13686k = AbstractC7316m.m13686k();
                zM13711d = C7323t.m13711d(c7323t, (C7322s) AbstractC7316m.m13698w(c7322s3, c7323t, abstractC7311hM13686k), i10, interfaceC4945dBuild);
            }
            AbstractC7316m.m13689n(abstractC7311hM13686k, c7323t);
        } while (!zM13711d);
        return z6;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean add(Object obj) {
        switch (this.f34900b) {
            case 0:
                AbstractC7321r.m13710g();
                throw null;
            case 1:
                AbstractC7321r.m13710g();
                throw null;
            default:
                AbstractC7321r.m13710g();
                throw null;
        }
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean addAll(Collection collection) {
        switch (this.f34900b) {
            case 0:
                AbstractC7321r.m13710g();
                throw null;
            case 1:
                AbstractC7321r.m13710g();
                throw null;
            default:
                AbstractC7321r.m13710g();
                throw null;
        }
    }

    @Override // java.util.Set, java.util.Collection
    public final void clear() {
        this.f34899a.clear();
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean contains(Object obj) {
        switch (this.f34900b) {
            case 0:
                if (!(obj instanceof Map.Entry) || ((obj instanceof InterfaceC2395a) && !(obj instanceof InterfaceC2398d))) {
                    return false;
                }
                Map.Entry entry = (Map.Entry) obj;
                return AbstractC4154l.m8918a(this.f34899a.get(entry.getKey()), entry.getValue());
            case 1:
                return this.f34899a.containsKey(obj);
            default:
                return this.f34899a.containsValue(obj);
        }
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean containsAll(Collection collection) {
        switch (this.f34900b) {
            case 0:
                Collection collection2 = collection;
                if (!(collection2 instanceof Collection) || !collection2.isEmpty()) {
                    Iterator it = collection2.iterator();
                    while (it.hasNext()) {
                        if (!contains((Map.Entry) it.next())) {
                            break;
                        }
                    }
                    break;
                }
                break;
            case 1:
                Collection collection3 = collection;
                if (!(collection3 instanceof Collection) || !collection3.isEmpty()) {
                    Iterator it2 = collection3.iterator();
                    while (it2.hasNext()) {
                        if (!this.f34899a.containsKey(it2.next())) {
                            break;
                        }
                    }
                    break;
                }
                break;
            default:
                Collection collection4 = collection;
                if (!(collection4 instanceof Collection) || !collection4.isEmpty()) {
                    Iterator it3 = collection4.iterator();
                    while (it3.hasNext()) {
                        if (!this.f34899a.containsValue(it3.next())) {
                            break;
                        }
                    }
                    break;
                }
                break;
        }
        return true;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean isEmpty() {
        return this.f34899a.isEmpty();
    }

    @Override // java.util.Set, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        switch (this.f34900b) {
            case 0:
                C7323t c7323t = this.f34899a;
                return new C7327x(c7323t, ((InterfaceC4943b) c7323t.m13712f().f34907c.entrySet()).iterator(), 0);
            case 1:
                C7323t c7323t2 = this.f34899a;
                return new C7327x(c7323t2, ((InterfaceC4943b) c7323t2.m13712f().f34907c.entrySet()).iterator(), 1);
            default:
                C7323t c7323t3 = this.f34899a;
                return new C7327x(c7323t3, ((InterfaceC4943b) c7323t3.m13712f().f34907c.entrySet()).iterator(), 2);
        }
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean remove(Object obj) {
        Object next;
        switch (this.f34900b) {
            case 0:
                if (obj instanceof Map.Entry) {
                    return (!(obj instanceof InterfaceC2395a) || (obj instanceof InterfaceC2398d)) && this.f34899a.remove(((Map.Entry) obj).getKey()) != null;
                }
                return false;
            case 1:
                return this.f34899a.remove(obj) != null;
            default:
                C7323t c7323t = this.f34899a;
                Iterator it = c7323t.f34910b.iterator();
                while (true) {
                    if (((C7327x) it).hasNext()) {
                        next = ((C7327x) it).next();
                        if (AbstractC4154l.m8918a(((Map.Entry) next).getValue(), obj)) {
                        }
                    } else {
                        next = null;
                    }
                }
                Map.Entry entry = (Map.Entry) next;
                if (entry == null) {
                    return false;
                }
                c7323t.remove(entry.getKey());
                return true;
        }
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean removeAll(Collection collection) {
        InterfaceC4945d interfaceC4945d;
        int i10;
        AbstractC7311h abstractC7311hM13686k;
        boolean zM13711d;
        switch (this.f34900b) {
            case 0:
                Iterator it = collection.iterator();
                while (true) {
                    boolean z6 = false;
                    while (it.hasNext()) {
                        if (this.f34899a.remove(((Map.Entry) it.next()).getKey()) != null || z6) {
                            z6 = true;
                        }
                    }
                    return z6;
                    break;
                }
            case 1:
                Iterator it2 = collection.iterator();
                while (true) {
                    boolean z10 = false;
                    while (it2.hasNext()) {
                        if (this.f34899a.remove(it2.next()) != null || z10) {
                            z10 = true;
                        }
                    }
                    return z10;
                    break;
                }
                break;
            default:
                Set setG0 = AbstractC6663m.g0(collection);
                C7323t c7323t = this.f34899a;
                boolean z11 = false;
                do {
                    synchronized (AbstractC7321r.f34906b) {
                        C7322s c7322s = c7323t.f34909a;
                        AbstractC4154l.m8921d(c7322s, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap, V of androidx.compose.runtime.snapshots.SnapshotStateMap>");
                        C7322s c7322s2 = (C7322s) AbstractC7316m.m13684i(c7322s);
                        interfaceC4945d = c7322s2.f34907c;
                        i10 = c7322s2.f34908d;
                    }
                    AbstractC4154l.m8920c(interfaceC4945d);
                    InterfaceC4944c interfaceC4944cBuilder = interfaceC4945d.builder();
                    Iterator it3 = c7323t.f34910b.iterator();
                    while (((C7327x) it3).hasNext()) {
                        Map.Entry entry = (Map.Entry) ((C7327x) it3).next();
                        if (setG0.contains(entry.getValue())) {
                            interfaceC4944cBuilder.remove(entry.getKey());
                            z11 = true;
                        }
                    }
                    InterfaceC4945d interfaceC4945dBuild = interfaceC4944cBuilder.build();
                    if (!AbstractC4154l.m8918a(interfaceC4945dBuild, interfaceC4945d)) {
                        C7322s c7322s3 = c7323t.f34909a;
                        AbstractC4154l.m8921d(c7322s3, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap, V of androidx.compose.runtime.snapshots.SnapshotStateMap>");
                        synchronized (AbstractC7316m.f34890b) {
                            abstractC7311hM13686k = AbstractC7316m.m13686k();
                            zM13711d = C7323t.m13711d(c7323t, (C7322s) AbstractC7316m.m13698w(c7322s3, c7323t, abstractC7311hM13686k), i10, interfaceC4945dBuild);
                        }
                        AbstractC7316m.m13689n(abstractC7311hM13686k, c7323t);
                    }
                    return z11;
                } while (!zM13711d);
                return z11;
        }
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean retainAll(Collection collection) {
        InterfaceC4945d interfaceC4945d;
        int i10;
        AbstractC7311h abstractC7311hM13686k;
        boolean zM13711d;
        InterfaceC4945d interfaceC4945d2;
        int i11;
        AbstractC7311h abstractC7311hM13686k2;
        boolean zM13711d2;
        switch (this.f34900b) {
            case 0:
                Collection<Map.Entry> collection2 = collection;
                int iM12776d = AbstractC6674x.m12776d(AbstractC6664n.m12768r(collection2, 10));
                if (iM12776d < 16) {
                    iM12776d = 16;
                }
                LinkedHashMap linkedHashMap = new LinkedHashMap(iM12776d);
                for (Map.Entry entry : collection2) {
                    linkedHashMap.put(entry.getKey(), entry.getValue());
                }
                C7323t c7323t = this.f34899a;
                boolean z6 = false;
                do {
                    synchronized (AbstractC7321r.f34906b) {
                        C7322s c7322s = c7323t.f34909a;
                        AbstractC4154l.m8921d(c7322s, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap, V of androidx.compose.runtime.snapshots.SnapshotStateMap>");
                        C7322s c7322s2 = (C7322s) AbstractC7316m.m13684i(c7322s);
                        interfaceC4945d = c7322s2.f34907c;
                        i10 = c7322s2.f34908d;
                    }
                    AbstractC4154l.m8920c(interfaceC4945d);
                    InterfaceC4944c interfaceC4944cBuilder = interfaceC4945d.builder();
                    Iterator it = c7323t.f34910b.iterator();
                    while (((C7327x) it).hasNext()) {
                        Map.Entry entry2 = (Map.Entry) ((C7327x) it).next();
                        if (!linkedHashMap.containsKey(entry2.getKey()) || !AbstractC4154l.m8918a(linkedHashMap.get(entry2.getKey()), entry2.getValue())) {
                            interfaceC4944cBuilder.remove(entry2.getKey());
                            z6 = true;
                        }
                    }
                    InterfaceC4945d interfaceC4945dBuild = interfaceC4944cBuilder.build();
                    if (!AbstractC4154l.m8918a(interfaceC4945dBuild, interfaceC4945d)) {
                        C7322s c7322s3 = c7323t.f34909a;
                        AbstractC4154l.m8921d(c7322s3, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap, V of androidx.compose.runtime.snapshots.SnapshotStateMap>");
                        synchronized (AbstractC7316m.f34890b) {
                            abstractC7311hM13686k = AbstractC7316m.m13686k();
                            zM13711d = C7323t.m13711d(c7323t, (C7322s) AbstractC7316m.m13698w(c7322s3, c7323t, abstractC7311hM13686k), i10, interfaceC4945dBuild);
                        }
                        AbstractC7316m.m13689n(abstractC7311hM13686k, c7323t);
                    }
                    return z6;
                } while (!zM13711d);
                return z6;
            case 1:
                return m13699b(collection);
            default:
                Set setG0 = AbstractC6663m.g0(collection);
                C7323t c7323t2 = this.f34899a;
                boolean z10 = false;
                do {
                    synchronized (AbstractC7321r.f34906b) {
                        C7322s c7322s4 = c7323t2.f34909a;
                        AbstractC4154l.m8921d(c7322s4, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap, V of androidx.compose.runtime.snapshots.SnapshotStateMap>");
                        C7322s c7322s5 = (C7322s) AbstractC7316m.m13684i(c7322s4);
                        interfaceC4945d2 = c7322s5.f34907c;
                        i11 = c7322s5.f34908d;
                    }
                    AbstractC4154l.m8920c(interfaceC4945d2);
                    InterfaceC4944c interfaceC4944cBuilder2 = interfaceC4945d2.builder();
                    Iterator it2 = c7323t2.f34910b.iterator();
                    while (((C7327x) it2).hasNext()) {
                        Map.Entry entry3 = (Map.Entry) ((C7327x) it2).next();
                        if (!setG0.contains(entry3.getValue())) {
                            interfaceC4944cBuilder2.remove(entry3.getKey());
                            z10 = true;
                        }
                    }
                    InterfaceC4945d interfaceC4945dBuild2 = interfaceC4944cBuilder2.build();
                    if (!AbstractC4154l.m8918a(interfaceC4945dBuild2, interfaceC4945d2)) {
                        C7322s c7322s6 = c7323t2.f34909a;
                        AbstractC4154l.m8921d(c7322s6, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap, V of androidx.compose.runtime.snapshots.SnapshotStateMap>");
                        synchronized (AbstractC7316m.f34890b) {
                            abstractC7311hM13686k2 = AbstractC7316m.m13686k();
                            zM13711d2 = C7323t.m13711d(c7323t2, (C7322s) AbstractC7316m.m13698w(c7322s6, c7323t2, abstractC7311hM13686k2), i11, interfaceC4945dBuild2);
                        }
                        AbstractC7316m.m13689n(abstractC7311hM13686k2, c7323t2);
                    }
                    return z10;
                } while (!zM13711d2);
                return z10;
        }
    }

    @Override // java.util.Set, java.util.Collection
    public final int size() {
        return this.f34899a.size();
    }

    @Override // java.util.Set, java.util.Collection
    public final Object[] toArray() {
        return AbstractC4153k.m8916a(this);
    }

    @Override // java.util.Set, java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        return AbstractC4153k.m8917b(this, objArr);
    }
}
