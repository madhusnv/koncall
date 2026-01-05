package p001o;

import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;

/* loaded from: classes2.dex */
public final class la2 {

    /* renamed from: a */
    public final Object f33525a = new Object();

    /* renamed from: b */
    public final Map f33526b = new LinkedHashMap();

    /* renamed from: c */
    public final Set f33527c = new HashSet();

    /* renamed from: a */
    public LinkedHashSet m36829a() {
        LinkedHashSet linkedHashSet;
        synchronized (this.f33525a) {
            linkedHashSet = new LinkedHashSet(this.f33526b.values());
        }
        return linkedHashSet;
    }

    /* renamed from: b */
    public void m36830b(q92 q92Var) {
        synchronized (this.f33525a) {
            try {
                try {
                    for (String str : q92Var.mo42953b()) {
                        wja.m54627a("CameraRepository", "Added camera: " + str);
                        this.f33526b.put(str, q92Var.mo42952a(str));
                    }
                } catch (va2 e) {
                    throw new li8(e);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
