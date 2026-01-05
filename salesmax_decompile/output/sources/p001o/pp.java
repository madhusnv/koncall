package p001o;

import java.util.Collections;
import java.util.Iterator;
import java.util.Set;
import java.util.WeakHashMap;

/* loaded from: classes5.dex */
public class pp implements qca {

    /* renamed from: a */
    public final Set f40352a = Collections.newSetFromMap(new WeakHashMap());

    /* renamed from: b */
    public boolean f40353b;

    /* renamed from: c */
    public boolean f40354c;

    @Override // p001o.qca
    /* renamed from: a */
    public void mo43994a(vca vcaVar) {
        this.f40352a.add(vcaVar);
        if (this.f40354c) {
            vcaVar.onDestroy();
        } else if (this.f40353b) {
            vcaVar.onStart();
        } else {
            vcaVar.onStop();
        }
    }

    @Override // p001o.qca
    /* renamed from: b */
    public void mo43995b(vca vcaVar) {
        this.f40352a.remove(vcaVar);
    }

    /* renamed from: c */
    public void m43996c() {
        this.f40354c = true;
        Iterator it = uqi.m51928i(this.f40352a).iterator();
        while (it.hasNext()) {
            ((vca) it.next()).onDestroy();
        }
    }

    /* renamed from: d */
    public void m43997d() {
        this.f40353b = true;
        Iterator it = uqi.m51928i(this.f40352a).iterator();
        while (it.hasNext()) {
            ((vca) it.next()).onStart();
        }
    }

    /* renamed from: e */
    public void m43998e() {
        this.f40353b = false;
        Iterator it = uqi.m51928i(this.f40352a).iterator();
        while (it.hasNext()) {
            ((vca) it.next()).onStop();
        }
    }
}
