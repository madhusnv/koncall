package p001o;

import com.google.firebase.messaging.Constants;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import p001o.h5d;

/* loaded from: classes2.dex */
public final class uxf implements Map, d5g, wb9 {

    /* renamed from: a */
    public f5g f49607a = new C17469a(bq6.m19555a());

    /* renamed from: b */
    public final Set f49608b = new fxf(this);

    /* renamed from: c */
    public final Set f49609c = new gxf(this);

    /* renamed from: d */
    public final Collection f49610d = new ixf(this);

    /* renamed from: o.uxf$a */
    public static final class C17469a extends f5g {

        /* renamed from: c */
        public h5d f49611c;

        /* renamed from: d */
        public int f49612d;

        public C17469a(h5d h5dVar) {
            sq8.m48649h(h5dVar, "map");
            this.f49611c = h5dVar;
        }

        @Override // p001o.f5g
        /* renamed from: c */
        public void mo26181c(f5g f5gVar) {
            sq8.m48649h(f5gVar, "value");
            C17469a c17469a = (C17469a) f5gVar;
            synchronized (vxf.f51007a) {
                this.f49611c = c17469a.f49611c;
                this.f49612d = c17469a.f49612d;
                y3i y3iVar = y3i.f54824a;
            }
        }

        @Override // p001o.f5g
        /* renamed from: d */
        public f5g mo26182d() {
            return new C17469a(this.f49611c);
        }

        /* renamed from: i */
        public final h5d m52113i() {
            return this.f49611c;
        }

        /* renamed from: j */
        public final int m52114j() {
            return this.f49612d;
        }

        /* renamed from: k */
        public final void m52115k(h5d h5dVar) {
            sq8.m48649h(h5dVar, "<set-?>");
            this.f49611c = h5dVar;
        }

        /* renamed from: l */
        public final void m52116l(int i) {
            this.f49612d = i;
        }
    }

    /* renamed from: a */
    public Set m52106a() {
        return this.f49608b;
    }

    /* renamed from: c */
    public Set m52107c() {
        return this.f49609c;
    }

    @Override // java.util.Map
    public void clear() {
        xwf xwfVarM56928b;
        f5g f5gVarMo22332n = mo22332n();
        sq8.m48647f(f5gVarMo22332n, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap, V of androidx.compose.runtime.snapshots.SnapshotStateMap>");
        C17469a c17469a = (C17469a) exf.m25772D((C17469a) f5gVarMo22332n);
        c17469a.m52113i();
        h5d h5dVarM19555a = bq6.m19555a();
        if (h5dVarM19555a != c17469a.m52113i()) {
            f5g f5gVarMo22332n2 = mo22332n();
            sq8.m48647f(f5gVarMo22332n2, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap, V of androidx.compose.runtime.snapshots.SnapshotStateMap>");
            C17469a c17469a2 = (C17469a) f5gVarMo22332n2;
            exf.m25776H();
            synchronized (exf.m25775G()) {
                xwfVarM56928b = xwf.f54441e.m56928b();
                C17469a c17469a3 = (C17469a) exf.f0(c17469a2, this, xwfVarM56928b);
                synchronized (vxf.f51007a) {
                    c17469a3.m52115k(h5dVarM19555a);
                    c17469a3.m52116l(c17469a3.m52114j() + 1);
                }
            }
            exf.m25783O(xwfVarM56928b, this);
        }
    }

    @Override // java.util.Map
    public boolean containsKey(Object obj) {
        return m52109f().m52113i().containsKey(obj);
    }

    @Override // java.util.Map
    public boolean containsValue(Object obj) {
        return m52109f().m52113i().containsValue(obj);
    }

    /* renamed from: e */
    public final int m52108e() {
        return m52109f().m52114j();
    }

    @Override // java.util.Map
    public final /* bridge */ Set entrySet() {
        return m52106a();
    }

    /* renamed from: f */
    public final C17469a m52109f() {
        f5g f5gVarMo22332n = mo22332n();
        sq8.m48647f(f5gVarMo22332n, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap, V of androidx.compose.runtime.snapshots.SnapshotStateMap>");
        return (C17469a) exf.m25790V((C17469a) f5gVarMo22332n, this);
    }

    /* renamed from: g */
    public int m52110g() {
        return m52109f().m52113i().size();
    }

    @Override // java.util.Map
    public Object get(Object obj) {
        return m52109f().m52113i().get(obj);
    }

    /* renamed from: h */
    public Collection m52111h() {
        return this.f49610d;
    }

    @Override // java.util.Map
    public boolean isEmpty() {
        return m52109f().m52113i().isEmpty();
    }

    /* renamed from: k */
    public final boolean m52112k(Object obj) {
        Object next;
        Iterator it = entrySet().iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (sq8.m48644c(((Map.Entry) next).getValue(), obj)) {
                break;
            }
        }
        Map.Entry entry = (Map.Entry) next;
        if (entry == null) {
            return false;
        }
        remove(entry.getKey());
        return true;
    }

    @Override // java.util.Map
    public final /* bridge */ Set keySet() {
        return m52107c();
    }

    @Override // p001o.d5g
    /* renamed from: n */
    public f5g mo22332n() {
        return this.f49607a;
    }

    @Override // java.util.Map
    public Object put(Object obj, Object obj2) {
        h5d h5dVarM52113i;
        int iM52114j;
        Object objPut;
        xwf xwfVarM56928b;
        boolean z;
        do {
            synchronized (vxf.f51007a) {
                f5g f5gVarMo22332n = mo22332n();
                sq8.m48647f(f5gVarMo22332n, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap, V of androidx.compose.runtime.snapshots.SnapshotStateMap>");
                C17469a c17469a = (C17469a) exf.m25772D((C17469a) f5gVarMo22332n);
                h5dVarM52113i = c17469a.m52113i();
                iM52114j = c17469a.m52114j();
                y3i y3iVar = y3i.f54824a;
            }
            sq8.m48646e(h5dVarM52113i);
            h5d.InterfaceC13853a interfaceC13853aMo40065o = h5dVarM52113i.mo40065o();
            objPut = interfaceC13853aMo40065o.put(obj, obj2);
            h5d h5dVarBuild = interfaceC13853aMo40065o.build();
            if (sq8.m48644c(h5dVarBuild, h5dVarM52113i)) {
                break;
            }
            f5g f5gVarMo22332n2 = mo22332n();
            sq8.m48647f(f5gVarMo22332n2, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap, V of androidx.compose.runtime.snapshots.SnapshotStateMap>");
            C17469a c17469a2 = (C17469a) f5gVarMo22332n2;
            exf.m25776H();
            synchronized (exf.m25775G()) {
                xwfVarM56928b = xwf.f54441e.m56928b();
                C17469a c17469a3 = (C17469a) exf.f0(c17469a2, this, xwfVarM56928b);
                synchronized (vxf.f51007a) {
                    if (c17469a3.m52114j() == iM52114j) {
                        c17469a3.m52115k(h5dVarBuild);
                        z = true;
                        c17469a3.m52116l(c17469a3.m52114j() + 1);
                    } else {
                        z = false;
                    }
                }
            }
            exf.m25783O(xwfVarM56928b, this);
        } while (!z);
        return objPut;
    }

    @Override // java.util.Map
    public void putAll(Map map) {
        h5d h5dVarM52113i;
        int iM52114j;
        xwf xwfVarM56928b;
        boolean z;
        sq8.m48649h(map, Constants.MessagePayloadKeys.FROM);
        do {
            synchronized (vxf.f51007a) {
                f5g f5gVarMo22332n = mo22332n();
                sq8.m48647f(f5gVarMo22332n, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap, V of androidx.compose.runtime.snapshots.SnapshotStateMap>");
                C17469a c17469a = (C17469a) exf.m25772D((C17469a) f5gVarMo22332n);
                h5dVarM52113i = c17469a.m52113i();
                iM52114j = c17469a.m52114j();
                y3i y3iVar = y3i.f54824a;
            }
            sq8.m48646e(h5dVarM52113i);
            h5d.InterfaceC13853a interfaceC13853aMo40065o = h5dVarM52113i.mo40065o();
            interfaceC13853aMo40065o.putAll(map);
            h5d h5dVarBuild = interfaceC13853aMo40065o.build();
            if (sq8.m48644c(h5dVarBuild, h5dVarM52113i)) {
                return;
            }
            f5g f5gVarMo22332n2 = mo22332n();
            sq8.m48647f(f5gVarMo22332n2, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap, V of androidx.compose.runtime.snapshots.SnapshotStateMap>");
            C17469a c17469a2 = (C17469a) f5gVarMo22332n2;
            exf.m25776H();
            synchronized (exf.m25775G()) {
                xwfVarM56928b = xwf.f54441e.m56928b();
                C17469a c17469a3 = (C17469a) exf.f0(c17469a2, this, xwfVarM56928b);
                synchronized (vxf.f51007a) {
                    if (c17469a3.m52114j() == iM52114j) {
                        c17469a3.m52115k(h5dVarBuild);
                        z = true;
                        c17469a3.m52116l(c17469a3.m52114j() + 1);
                    } else {
                        z = false;
                    }
                }
            }
            exf.m25783O(xwfVarM56928b, this);
        } while (!z);
    }

    @Override // p001o.d5g
    /* renamed from: r */
    public void mo22333r(f5g f5gVar) {
        sq8.m48649h(f5gVar, "value");
        this.f49607a = (C17469a) f5gVar;
    }

    @Override // java.util.Map
    public Object remove(Object obj) {
        h5d h5dVarM52113i;
        int iM52114j;
        Object objRemove;
        xwf xwfVarM56928b;
        boolean z;
        do {
            synchronized (vxf.f51007a) {
                f5g f5gVarMo22332n = mo22332n();
                sq8.m48647f(f5gVarMo22332n, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap, V of androidx.compose.runtime.snapshots.SnapshotStateMap>");
                C17469a c17469a = (C17469a) exf.m25772D((C17469a) f5gVarMo22332n);
                h5dVarM52113i = c17469a.m52113i();
                iM52114j = c17469a.m52114j();
                y3i y3iVar = y3i.f54824a;
            }
            sq8.m48646e(h5dVarM52113i);
            h5d.InterfaceC13853a interfaceC13853aMo40065o = h5dVarM52113i.mo40065o();
            objRemove = interfaceC13853aMo40065o.remove(obj);
            h5d h5dVarBuild = interfaceC13853aMo40065o.build();
            if (sq8.m48644c(h5dVarBuild, h5dVarM52113i)) {
                break;
            }
            f5g f5gVarMo22332n2 = mo22332n();
            sq8.m48647f(f5gVarMo22332n2, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap, V of androidx.compose.runtime.snapshots.SnapshotStateMap>");
            C17469a c17469a2 = (C17469a) f5gVarMo22332n2;
            exf.m25776H();
            synchronized (exf.m25775G()) {
                xwfVarM56928b = xwf.f54441e.m56928b();
                C17469a c17469a3 = (C17469a) exf.f0(c17469a2, this, xwfVarM56928b);
                synchronized (vxf.f51007a) {
                    if (c17469a3.m52114j() == iM52114j) {
                        c17469a3.m52115k(h5dVarBuild);
                        z = true;
                        c17469a3.m52116l(c17469a3.m52114j() + 1);
                    } else {
                        z = false;
                    }
                }
            }
            exf.m25783O(xwfVarM56928b, this);
        } while (!z);
        return objRemove;
    }

    @Override // java.util.Map
    public final /* bridge */ int size() {
        return m52110g();
    }

    @Override // java.util.Map
    public final /* bridge */ Collection values() {
        return m52111h();
    }
}
