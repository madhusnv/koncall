package a0;

import androidx.camera.camera2.internal.compat.CameraAccessExceptionCompat;
import androidx.camera.core.InitializationException;
import androidx.camera.core.impl.CameraUpdateException;
import i0.e0;
import i0.e1;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import og.u1;
import og.y0;
import p020v.C7613w;
import p021w.C7851q;
import pg.b6;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: a0.a */
/* loaded from: classes.dex */
public final class C0001a implements e1 {

    /* renamed from: b */
    public final C7851q f1b;

    /* renamed from: a */
    public final Object f0a = new Object();

    /* renamed from: d */
    public HashMap f3d = new HashMap();

    /* renamed from: e */
    public HashSet f4e = new HashSet();

    /* renamed from: f */
    public final ArrayList f5f = new ArrayList();

    /* renamed from: g */
    public int f6g = 0;

    /* renamed from: c */
    public final ArrayList f2c = new ArrayList();

    public C0001a(C7851q c7851q) {
        this.f1b = c7851q;
        try {
            mo3a(Arrays.asList(c7851q.m14836c()));
        } catch (CameraAccessExceptionCompat | CameraUpdateException unused) {
            u1.m10944c("Camera2CameraCoordinator");
        }
    }

    @Override // i0.e1
    /* renamed from: a */
    public final void mo3a(List list) throws CameraUpdateException {
        HashMap map = new HashMap();
        HashSet hashSet = new HashSet();
        try {
            for (Set set : this.f1b.f37624a.mo2566k()) {
                if (list.containsAll(set)) {
                    ArrayList arrayList = new ArrayList(set);
                    if (arrayList.size() >= 2) {
                        String str = (String) arrayList.get(0);
                        String str2 = (String) arrayList.get(1);
                        try {
                            if (b6.m11545b(str, this.f1b) && b6.m11545b(str2, this.f1b)) {
                                hashSet.add(new HashSet(Arrays.asList(str, str2)));
                                if (!map.containsKey(str)) {
                                    map.put(str, new ArrayList());
                                }
                                ((List) map.get(str)).add(str2);
                                if (!map.containsKey(str2)) {
                                    map.put(str2, new ArrayList());
                                }
                                ((List) map.get(str2)).add(str);
                            }
                        } catch (InitializationException unused) {
                            u1.m10942a("Camera2CameraCoordinator");
                        }
                    }
                }
            }
            synchronized (this.f0a) {
                this.f3d = map;
                this.f4e = hashSet;
                Objects.toString(map);
                u1.m10942a("Camera2CameraCoordinator");
            }
        } catch (CameraAccessExceptionCompat e2) {
            throw new CameraUpdateException("Failed to retrieve concurrent camera id info.", e2);
        }
    }

    /* renamed from: b */
    public final int m4b() {
        int i10;
        synchronized (this.f0a) {
            i10 = this.f6g;
        }
        return i10;
    }

    /* renamed from: c */
    public final String m5c(String str) {
        synchronized (this.f0a) {
            try {
                if (!this.f3d.containsKey(str)) {
                    return null;
                }
                List<String> list = (List) this.f3d.get(str);
                if (list == null) {
                    return null;
                }
                for (String str2 : list) {
                    ArrayList arrayList = this.f5f;
                    int size = arrayList.size();
                    int i10 = 0;
                    while (i10 < size) {
                        Object obj = arrayList.get(i10);
                        i10++;
                        e0 e0VarMo7306f = ((e0) obj).mo7306f();
                        y0.m11051a("CameraInfo doesn't contain Camera2 implementation.", e0VarMo7306f instanceof C7613w);
                        if (str2.equals(((C7613w) ((C7613w) e0VarMo7306f).f36744c.f24823b).f36742a)) {
                            return str2;
                        }
                    }
                }
                return null;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
