package i0;

import androidx.camera.core.CameraUnavailableException;
import androidx.camera.core.InitializationException;
import androidx.camera.core.impl.CameraUpdateException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import p020v.C7600j;
import x4.C8299i;
import x4.C8302l;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class l0 implements e1 {

    /* renamed from: a */
    public final Object f16515a = new Object();

    /* renamed from: b */
    public final LinkedHashMap f16516b = new LinkedHashMap();

    /* renamed from: c */
    public final HashSet f16517c = new HashSet();

    /* renamed from: d */
    public C8302l f16518d;

    /* renamed from: e */
    public C8299i f16519e;

    /* renamed from: f */
    public C7600j f16520f;

    @Override // i0.e1
    /* renamed from: a */
    public final void mo3a(List list) {
        HashSet hashSet;
        HashMap map = new HashMap();
        synchronized (this.f16515a) {
            hashSet = new HashSet(list);
            hashSet.removeAll(this.f16516b.keySet());
        }
        try {
            Iterator it = hashSet.iterator();
            while (it.hasNext()) {
                String str = (String) it.next();
                map.put(str, this.f16520f.m14401b(str));
            }
            synchronized (this.f16515a) {
                try {
                    HashSet hashSet2 = new HashSet(this.f16516b.keySet());
                    hashSet2.removeAll(list);
                    ArrayList arrayList = new ArrayList();
                    Iterator it2 = hashSet2.iterator();
                    while (it2.hasNext()) {
                        arrayList.add((g0) this.f16516b.get((String) it2.next()));
                    }
                    LinkedHashMap linkedHashMap = new LinkedHashMap();
                    ArrayList arrayList2 = (ArrayList) list;
                    int size = arrayList2.size();
                    int i10 = 0;
                    int i11 = 0;
                    while (i11 < size) {
                        Object obj = arrayList2.get(i11);
                        i11++;
                        String str2 = (String) obj;
                        if (this.f16516b.containsKey(str2)) {
                            linkedHashMap.put(str2, (g0) this.f16516b.get(str2));
                        } else {
                            linkedHashMap.put(str2, (g0) map.get(str2));
                        }
                    }
                    this.f16516b.clear();
                    this.f16516b.putAll(linkedHashMap);
                    int size2 = arrayList.size();
                    while (i10 < size2) {
                        Object obj2 = arrayList.get(i10);
                        i10++;
                        g0 g0Var = (g0) obj2;
                        if (g0Var != null) {
                            g0Var.mo7339m();
                        }
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        } catch (CameraUnavailableException e2) {
            throw new CameraUpdateException("Failed to create CameraInternal", e2);
        }
    }

    /* renamed from: b */
    public final g0 m7358b(String str) {
        g0 g0Var;
        synchronized (this.f16515a) {
            try {
                g0Var = (g0) this.f16516b.get(str);
                if (g0Var == null) {
                    throw new IllegalArgumentException("Invalid camera: " + str);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return g0Var;
    }

    /* renamed from: c */
    public final LinkedHashSet m7359c() {
        LinkedHashSet linkedHashSet;
        synchronized (this.f16515a) {
            linkedHashSet = new LinkedHashSet(this.f16516b.values());
        }
        return linkedHashSet;
    }

    /* renamed from: d */
    public final void m7360d(C7600j c7600j) {
        this.f16520f = c7600j;
        synchronized (this.f16515a) {
            try {
                for (String str : c7600j.m14400a()) {
                    og.u1.m10942a("CameraRepository");
                    g0 g0Var = (g0) this.f16516b.put(str, c7600j.m14401b(str));
                    if (g0Var != null) {
                        g0Var.mo7308a();
                    }
                }
            } catch (CameraUnavailableException e2) {
                throw new InitializationException(e2);
            }
        }
    }
}
