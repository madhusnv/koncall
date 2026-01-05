package p020v;

import android.content.Context;
import android.os.Build;
import androidx.camera.core.CameraUnavailableException;
import androidx.camera.core.impl.CameraUpdateException;
import e0.InterfaceC1893b;
import i0.e1;
import j0.AbstractC3504d;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import p019u.C7290e;
import p021w.C7851q;
import ug.C7453x;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class a0 implements e1 {

    /* renamed from: a */
    public final Object f36470a;

    /* renamed from: b */
    public final HashMap f36471b;

    /* renamed from: c */
    public final C7453x f36472c;

    /* renamed from: d */
    public final C7851q f36473d;

    /* renamed from: e */
    public final Context f36474e;

    public a0(Context context, Object obj, LinkedHashSet linkedHashSet) throws CameraUnavailableException {
        C7453x c7453x = new C7453x(20);
        this.f36470a = new Object();
        this.f36471b = new HashMap();
        this.f36472c = c7453x;
        this.f36474e = context;
        if (obj instanceof C7851q) {
            this.f36473d = (C7851q) obj;
        } else {
            this.f36473d = C7851q.m14834a(context, AbstractC3504d.m8060e());
        }
        try {
            mo3a(new ArrayList(linkedHashSet));
        } catch (CameraUpdateException e2) {
            if (!(e2.getCause() instanceof CameraUnavailableException)) {
                throw new CameraUnavailableException(e2);
            }
            throw ((CameraUnavailableException) e2.getCause());
        }
    }

    @Override // i0.e1
    /* renamed from: a */
    public final void mo3a(List list) throws CameraUpdateException {
        HashSet hashSet;
        HashMap map = new HashMap();
        synchronized (this.f36470a) {
            hashSet = new HashSet(list);
            hashSet.removeAll(this.f36471b.keySet());
        }
        try {
            Iterator it = hashSet.iterator();
            while (it.hasNext()) {
                String str = (String) it.next();
                map.put(str, m14317b(str));
            }
            synchronized (this.f36470a) {
                try {
                    HashMap map2 = new HashMap();
                    ArrayList arrayList = (ArrayList) list;
                    int size = arrayList.size();
                    int i10 = 0;
                    while (i10 < size) {
                        Object obj = arrayList.get(i10);
                        i10++;
                        String str2 = (String) obj;
                        if (this.f36471b.containsKey(str2)) {
                            map2.put(str2, (c1) this.f36471b.get(str2));
                        } else {
                            map2.put(str2, (c1) map.get(str2));
                        }
                    }
                    this.f36471b.clear();
                    this.f36471b.putAll(map2);
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        } catch (CameraUnavailableException | RuntimeException e2) {
            throw new CameraUpdateException("Failed to create SupportedSurfaceCombination", e2);
        }
    }

    /* renamed from: b */
    public final c1 m14317b(String str) {
        return new c1(this.f36474e, str, this.f36473d, this.f36472c, Build.VERSION.SDK_INT >= 35 ? new C7290e(this.f36474e, str, this.f36473d) : InterfaceC1893b.f8914S);
    }
}
