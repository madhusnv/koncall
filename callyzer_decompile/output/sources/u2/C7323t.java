package u2;

import fx.InterfaceC2399e;
import java.util.Collection;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.AbstractC4154l;
import n2.InterfaceC4944c;
import n2.InterfaceC4945d;
import p2.C5790b;
import p2.C5792d;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: u2.t */
/* loaded from: classes.dex */
public final class C7323t implements InterfaceC7328y, Map, InterfaceC2399e {

    /* renamed from: a */
    public C7322s f34909a;

    /* renamed from: b */
    public final C7317n f34910b;

    /* renamed from: c */
    public final C7317n f34911c;

    /* renamed from: d */
    public final C7317n f34912d;

    public C7323t() {
        C5790b c5790b = C5790b.f28376c;
        AbstractC7311h abstractC7311hM13686k = AbstractC7316m.m13686k();
        C7322s c7322s = new C7322s(abstractC7311hM13686k.mo13652g(), c5790b);
        if (!(abstractC7311hM13686k instanceof C7306c)) {
            c7322s.f34839b = new C7322s(1, c5790b);
        }
        this.f34909a = c7322s;
        this.f34910b = new C7317n(this, 0);
        this.f34911c = new C7317n(this, 1);
        this.f34912d = new C7317n(this, 2);
    }

    /* renamed from: d */
    public static final boolean m13711d(C7323t c7323t, C7322s c7322s, int i10, InterfaceC4945d interfaceC4945d) {
        boolean z6;
        synchronized (AbstractC7321r.f34906b) {
            int i11 = c7322s.f34908d;
            if (i11 == i10) {
                c7322s.f34907c = interfaceC4945d;
                z6 = true;
                c7322s.f34908d = i11 + 1;
            } else {
                z6 = false;
            }
        }
        return z6;
    }

    @Override // u2.InterfaceC7328y
    /* renamed from: b */
    public final a0 mo8488b() {
        return this.f34909a;
    }

    @Override // java.util.Map
    public final void clear() {
        AbstractC7311h abstractC7311hM13686k;
        C7322s c7322s = this.f34909a;
        AbstractC4154l.m8921d(c7322s, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap, V of androidx.compose.runtime.snapshots.SnapshotStateMap>");
        C7322s c7322s2 = (C7322s) AbstractC7316m.m13684i(c7322s);
        C5790b c5790b = C5790b.f28376c;
        if (c5790b != c7322s2.f34907c) {
            C7322s c7322s3 = this.f34909a;
            AbstractC4154l.m8921d(c7322s3, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap, V of androidx.compose.runtime.snapshots.SnapshotStateMap>");
            synchronized (AbstractC7316m.f34890b) {
                abstractC7311hM13686k = AbstractC7316m.m13686k();
                C7322s c7322s4 = (C7322s) AbstractC7316m.m13698w(c7322s3, this, abstractC7311hM13686k);
                synchronized (AbstractC7321r.f34906b) {
                    c7322s4.f34907c = c5790b;
                    c7322s4.f34908d++;
                }
            }
            AbstractC7316m.m13689n(abstractC7311hM13686k, this);
        }
    }

    @Override // java.util.Map
    public final boolean containsKey(Object obj) {
        return m13712f().f34907c.containsKey(obj);
    }

    @Override // java.util.Map
    public final boolean containsValue(Object obj) {
        return m13712f().f34907c.containsValue(obj);
    }

    @Override // java.util.Map
    public final Set entrySet() {
        return this.f34910b;
    }

    /* renamed from: f */
    public final C7322s m13712f() {
        C7322s c7322s = this.f34909a;
        AbstractC4154l.m8921d(c7322s, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap, V of androidx.compose.runtime.snapshots.SnapshotStateMap>");
        return (C7322s) AbstractC7316m.m13695t(c7322s, this);
    }

    @Override // java.util.Map
    public final Object get(Object obj) {
        return m13712f().f34907c.get(obj);
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
        return m13712f().f34907c.isEmpty();
    }

    @Override // u2.InterfaceC7328y
    /* renamed from: j */
    public final void mo8493j(a0 a0Var) {
        AbstractC4154l.m8921d(a0Var, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap, V of androidx.compose.runtime.snapshots.SnapshotStateMap>");
        this.f34909a = (C7322s) a0Var;
    }

    @Override // java.util.Map
    public final Set keySet() {
        return this.f34911c;
    }

    @Override // java.util.Map
    public final Object put(Object obj, Object obj2) {
        InterfaceC4945d interfaceC4945d;
        int i10;
        Object objPut;
        AbstractC7311h abstractC7311hM13686k;
        boolean zM13711d;
        do {
            synchronized (AbstractC7321r.f34906b) {
                C7322s c7322s = this.f34909a;
                AbstractC4154l.m8921d(c7322s, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap, V of androidx.compose.runtime.snapshots.SnapshotStateMap>");
                C7322s c7322s2 = (C7322s) AbstractC7316m.m13684i(c7322s);
                interfaceC4945d = c7322s2.f34907c;
                i10 = c7322s2.f34908d;
            }
            AbstractC4154l.m8920c(interfaceC4945d);
            C5792d c5792d = (C5792d) interfaceC4945d.builder();
            objPut = c5792d.put(obj, obj2);
            InterfaceC4945d interfaceC4945dBuild = c5792d.build();
            if (AbstractC4154l.m8918a(interfaceC4945dBuild, interfaceC4945d)) {
                break;
            }
            C7322s c7322s3 = this.f34909a;
            AbstractC4154l.m8921d(c7322s3, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap, V of androidx.compose.runtime.snapshots.SnapshotStateMap>");
            synchronized (AbstractC7316m.f34890b) {
                abstractC7311hM13686k = AbstractC7316m.m13686k();
                zM13711d = m13711d(this, (C7322s) AbstractC7316m.m13698w(c7322s3, this, abstractC7311hM13686k), i10, interfaceC4945dBuild);
            }
            AbstractC7316m.m13689n(abstractC7311hM13686k, this);
        } while (!zM13711d);
        return objPut;
    }

    @Override // java.util.Map
    public final void putAll(Map map) {
        InterfaceC4945d interfaceC4945d;
        int i10;
        AbstractC7311h abstractC7311hM13686k;
        boolean zM13711d;
        do {
            synchronized (AbstractC7321r.f34906b) {
                C7322s c7322s = this.f34909a;
                AbstractC4154l.m8921d(c7322s, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap, V of androidx.compose.runtime.snapshots.SnapshotStateMap>");
                C7322s c7322s2 = (C7322s) AbstractC7316m.m13684i(c7322s);
                interfaceC4945d = c7322s2.f34907c;
                i10 = c7322s2.f34908d;
            }
            AbstractC4154l.m8920c(interfaceC4945d);
            C5792d c5792d = (C5792d) interfaceC4945d.builder();
            c5792d.putAll(map);
            InterfaceC4945d interfaceC4945dBuild = c5792d.build();
            if (AbstractC4154l.m8918a(interfaceC4945dBuild, interfaceC4945d)) {
                return;
            }
            C7322s c7322s3 = this.f34909a;
            AbstractC4154l.m8921d(c7322s3, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap, V of androidx.compose.runtime.snapshots.SnapshotStateMap>");
            synchronized (AbstractC7316m.f34890b) {
                abstractC7311hM13686k = AbstractC7316m.m13686k();
                zM13711d = m13711d(this, (C7322s) AbstractC7316m.m13698w(c7322s3, this, abstractC7311hM13686k), i10, interfaceC4945dBuild);
            }
            AbstractC7316m.m13689n(abstractC7311hM13686k, this);
        } while (!zM13711d);
    }

    @Override // java.util.Map
    public final Object remove(Object obj) {
        InterfaceC4945d interfaceC4945d;
        int i10;
        Object objRemove;
        AbstractC7311h abstractC7311hM13686k;
        boolean zM13711d;
        do {
            synchronized (AbstractC7321r.f34906b) {
                C7322s c7322s = this.f34909a;
                AbstractC4154l.m8921d(c7322s, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap, V of androidx.compose.runtime.snapshots.SnapshotStateMap>");
                C7322s c7322s2 = (C7322s) AbstractC7316m.m13684i(c7322s);
                interfaceC4945d = c7322s2.f34907c;
                i10 = c7322s2.f34908d;
            }
            AbstractC4154l.m8920c(interfaceC4945d);
            InterfaceC4944c interfaceC4944cBuilder = interfaceC4945d.builder();
            objRemove = interfaceC4944cBuilder.remove(obj);
            InterfaceC4945d interfaceC4945dBuild = interfaceC4944cBuilder.build();
            if (AbstractC4154l.m8918a(interfaceC4945dBuild, interfaceC4945d)) {
                break;
            }
            C7322s c7322s3 = this.f34909a;
            AbstractC4154l.m8921d(c7322s3, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap, V of androidx.compose.runtime.snapshots.SnapshotStateMap>");
            synchronized (AbstractC7316m.f34890b) {
                abstractC7311hM13686k = AbstractC7316m.m13686k();
                zM13711d = m13711d(this, (C7322s) AbstractC7316m.m13698w(c7322s3, this, abstractC7311hM13686k), i10, interfaceC4945dBuild);
            }
            AbstractC7316m.m13689n(abstractC7311hM13686k, this);
        } while (!zM13711d);
        return objRemove;
    }

    @Override // java.util.Map
    public final int size() {
        return m13712f().f34907c.size();
    }

    public final String toString() {
        C7322s c7322s = this.f34909a;
        AbstractC4154l.m8921d(c7322s, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap, V of androidx.compose.runtime.snapshots.SnapshotStateMap>");
        return "SnapshotStateMap(value=" + ((C7322s) AbstractC7316m.m13684i(c7322s)).f34907c + ")@" + hashCode();
    }

    @Override // java.util.Map
    public final Collection values() {
        return this.f34912d;
    }
}
