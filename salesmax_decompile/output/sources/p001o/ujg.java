package p001o;

import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.WeakHashMap;

/* loaded from: classes5.dex */
public final class ujg implements vca {

    /* renamed from: a */
    public final Set f49001a = Collections.newSetFromMap(new WeakHashMap());

    /* renamed from: c */
    public void m51657c() {
        this.f49001a.clear();
    }

    /* renamed from: f */
    public List m51658f() {
        return uqi.m51928i(this.f49001a);
    }

    /* renamed from: k */
    public void m51659k(pjg pjgVar) {
        this.f49001a.add(pjgVar);
    }

    /* renamed from: l */
    public void m51660l(pjg pjgVar) {
        this.f49001a.remove(pjgVar);
    }

    @Override // p001o.vca
    public void onDestroy() {
        Iterator it = uqi.m51928i(this.f49001a).iterator();
        while (it.hasNext()) {
            ((pjg) it.next()).onDestroy();
        }
    }

    @Override // p001o.vca
    public void onStart() {
        Iterator it = uqi.m51928i(this.f49001a).iterator();
        while (it.hasNext()) {
            ((pjg) it.next()).onStart();
        }
    }

    @Override // p001o.vca
    public void onStop() {
        Iterator it = uqi.m51928i(this.f49001a).iterator();
        while (it.hasNext()) {
            ((pjg) it.next()).onStop();
        }
    }
}
