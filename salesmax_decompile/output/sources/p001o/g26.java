package p001o;

import android.hardware.camera2.params.DynamicRangeProfiles;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import p001o.f26;

/* loaded from: classes2.dex */
public class g26 implements f26.InterfaceC13313a {

    /* renamed from: a */
    public final DynamicRangeProfiles f24480a;

    public g26(Object obj) {
        this.f24480a = (DynamicRangeProfiles) obj;
    }

    /* renamed from: e */
    public static Set m27986e(Set set) {
        if (set.isEmpty()) {
            return Collections.emptySet();
        }
        HashSet hashSet = new HashSet(set.size());
        Iterator it = set.iterator();
        while (it.hasNext()) {
            hashSet.add(m27987f(((Long) it.next()).longValue()));
        }
        return Collections.unmodifiableSet(hashSet);
    }

    /* renamed from: f */
    public static y16 m27987f(long j) {
        return (y16) fgd.m26664h(a26.m16356b(j), "Dynamic range profile cannot be converted to a DynamicRange object: " + j);
    }

    @Override // p001o.f26.InterfaceC13313a
    /* renamed from: a */
    public DynamicRangeProfiles mo25956a() {
        return this.f24480a;
    }

    @Override // p001o.f26.InterfaceC13313a
    /* renamed from: b */
    public Set mo25957b(y16 y16Var) {
        Long lM27988d = m27988d(y16Var);
        fgd.m26658b(lM27988d != null, "DynamicRange is not supported: " + y16Var);
        return m27986e(this.f24480a.getProfileCaptureRequestConstraints(lM27988d.longValue()));
    }

    @Override // p001o.f26.InterfaceC13313a
    /* renamed from: c */
    public Set mo25958c() {
        return m27986e(this.f24480a.getSupportedProfiles());
    }

    /* renamed from: d */
    public final Long m27988d(y16 y16Var) {
        return a26.m16355a(y16Var, this.f24480a);
    }
}
