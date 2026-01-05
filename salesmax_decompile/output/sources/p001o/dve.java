package p001o;

import java.util.LinkedHashSet;
import java.util.Set;

/* loaded from: classes6.dex */
public final class dve {

    /* renamed from: a */
    public final Set f20580a = new LinkedHashSet();

    /* renamed from: a */
    public final synchronized void m23891a(bve bveVar) {
        sq8.m48649h(bveVar, "route");
        this.f20580a.remove(bveVar);
    }

    /* renamed from: b */
    public final synchronized void m23892b(bve bveVar) {
        sq8.m48649h(bveVar, "failedRoute");
        this.f20580a.add(bveVar);
    }

    /* renamed from: c */
    public final synchronized boolean m23893c(bve bveVar) {
        sq8.m48649h(bveVar, "route");
        return this.f20580a.contains(bveVar);
    }
}
