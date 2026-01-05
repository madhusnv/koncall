package p001o;

import java.security.MessageDigest;

/* loaded from: classes5.dex */
public final class rec implements ic9 {

    /* renamed from: b */
    public final vo0 f43445b = new is1();

    /* renamed from: f */
    public static void m46584f(mec mecVar, Object obj, MessageDigest messageDigest) {
        mecVar.m38836g(obj, messageDigest);
    }

    @Override // p001o.ic9
    /* renamed from: a */
    public void mo19806a(MessageDigest messageDigest) {
        for (int i = 0; i < this.f43445b.size(); i++) {
            m46584f((mec) this.f43445b.m36227g(i), this.f43445b.m36228o(i), messageDigest);
        }
    }

    /* renamed from: c */
    public Object m46585c(mec mecVar) {
        return this.f43445b.containsKey(mecVar) ? this.f43445b.get(mecVar) : mecVar.m38834c();
    }

    /* renamed from: d */
    public void m46586d(rec recVar) {
        this.f43445b.mo32669h(recVar.f43445b);
    }

    /* renamed from: e */
    public rec m46587e(mec mecVar, Object obj) {
        this.f43445b.put(mecVar, obj);
        return this;
    }

    @Override // p001o.ic9
    public boolean equals(Object obj) {
        if (obj instanceof rec) {
            return this.f43445b.equals(((rec) obj).f43445b);
        }
        return false;
    }

    @Override // p001o.ic9
    public int hashCode() {
        return this.f43445b.hashCode();
    }

    public String toString() {
        return "Options{values=" + this.f43445b + '}';
    }
}
