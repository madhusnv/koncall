package p001o;

import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.WeakHashMap;

/* loaded from: classes5.dex */
public class wme {

    /* renamed from: a */
    public final Set f52357a = Collections.newSetFromMap(new WeakHashMap());

    /* renamed from: b */
    public final Set f52358b = new HashSet();

    /* renamed from: c */
    public boolean f52359c;

    /* renamed from: a */
    public boolean m54715a(wle wleVar) {
        boolean z = true;
        if (wleVar == null) {
            return true;
        }
        boolean zRemove = this.f52357a.remove(wleVar);
        if (!this.f52358b.remove(wleVar) && !zRemove) {
            z = false;
        }
        if (z) {
            wleVar.clear();
        }
        return z;
    }

    /* renamed from: b */
    public void m54716b() {
        Iterator it = uqi.m51928i(this.f52357a).iterator();
        while (it.hasNext()) {
            m54715a((wle) it.next());
        }
        this.f52358b.clear();
    }

    /* renamed from: c */
    public void m54717c() {
        this.f52359c = true;
        for (wle wleVar : uqi.m51928i(this.f52357a)) {
            if (wleVar.isRunning() || wleVar.isComplete()) {
                wleVar.clear();
                this.f52358b.add(wleVar);
            }
        }
    }

    /* renamed from: d */
    public void m54718d() {
        this.f52359c = true;
        for (wle wleVar : uqi.m51928i(this.f52357a)) {
            if (wleVar.isRunning()) {
                wleVar.pause();
                this.f52358b.add(wleVar);
            }
        }
    }

    /* renamed from: e */
    public void m54719e() {
        for (wle wleVar : uqi.m51928i(this.f52357a)) {
            if (!wleVar.isComplete() && !wleVar.mo43855f()) {
                wleVar.clear();
                if (this.f52359c) {
                    this.f52358b.add(wleVar);
                } else {
                    wleVar.mo43856j();
                }
            }
        }
    }

    /* renamed from: f */
    public void m54720f() {
        this.f52359c = false;
        for (wle wleVar : uqi.m51928i(this.f52357a)) {
            if (!wleVar.isComplete() && !wleVar.isRunning()) {
                wleVar.mo43856j();
            }
        }
        this.f52358b.clear();
    }

    /* renamed from: g */
    public void m54721g(wle wleVar) {
        this.f52357a.add(wleVar);
        if (!this.f52359c) {
            wleVar.mo43856j();
        } else {
            wleVar.clear();
            this.f52358b.add(wleVar);
        }
    }

    public String toString() {
        return super.toString() + "{numRequests=" + this.f52357a.size() + ", isPaused=" + this.f52359c + "}";
    }
}
