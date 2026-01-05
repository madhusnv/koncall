package p022x;

import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.params.DynamicRangeProfiles;
import android.os.Build;
import c0.a0;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import mk.C4764c;
import og.y0;
import p021w.C7843i;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: x.c */
/* loaded from: classes.dex */
public final class C8233c implements InterfaceC8232b {

    /* renamed from: a */
    public final Object f39372a;

    public C8233c(Object obj) {
        this.f39372a = (DynamicRangeProfiles) obj;
    }

    /* renamed from: d */
    public static C8233c m15408d(C7843i c7843i) {
        DynamicRangeProfiles dynamicRangeProfilesM9683c;
        int i10 = Build.VERSION.SDK_INT;
        C8233c c8233c = null;
        if (i10 >= 33 && (dynamicRangeProfilesM9683c = C4764c.m9683c(c7843i.m14823a(CameraCharacteristics.REQUEST_AVAILABLE_DYNAMIC_RANGE_PROFILES))) != null) {
            y0.m11056f("DynamicRangeProfiles can only be converted to DynamicRangesCompat on API 33 or higher.", i10 >= 33);
            c8233c = new C8233c((InterfaceC8232b) new C8233c(dynamicRangeProfilesM9683c));
        }
        return c8233c == null ? C8234d.f39373a : c8233c;
    }

    /* renamed from: e */
    public static Set m15409e(Set set) {
        if (set.isEmpty()) {
            return Collections.EMPTY_SET;
        }
        HashSet hashSet = new HashSet(set.size());
        Iterator it = set.iterator();
        while (it.hasNext()) {
            Long l9 = (Long) it.next();
            long jLongValue = l9.longValue();
            a0 a0Var = (a0) AbstractC8231a.f39370a.get(l9);
            y0.m11055e(a0Var, "Dynamic range profile cannot be converted to a DynamicRange object: " + jLongValue);
            hashSet.add(a0Var);
        }
        return Collections.unmodifiableSet(hashSet);
    }

    @Override // p022x.InterfaceC8232b
    /* renamed from: a */
    public DynamicRangeProfiles mo15405a() {
        return (DynamicRangeProfiles) this.f39372a;
    }

    @Override // p022x.InterfaceC8232b
    /* renamed from: b */
    public Set mo15406b(a0 a0Var) {
        Long lM15404a = AbstractC8231a.m15404a(a0Var, (DynamicRangeProfiles) this.f39372a);
        y0.m11051a("DynamicRange is not supported: " + a0Var, lM15404a != null);
        return m15409e(((DynamicRangeProfiles) this.f39372a).getProfileCaptureRequestConstraints(lM15404a.longValue()));
    }

    @Override // p022x.InterfaceC8232b
    /* renamed from: c */
    public Set mo15407c() {
        return m15409e(((DynamicRangeProfiles) this.f39372a).getSupportedProfiles());
    }

    public C8233c(InterfaceC8232b interfaceC8232b) {
        this.f39372a = interfaceC8232b;
    }
}
