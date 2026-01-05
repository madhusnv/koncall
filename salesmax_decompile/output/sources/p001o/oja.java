package p001o;

import java.util.HashSet;
import java.util.Set;

/* loaded from: classes3.dex */
public class oja implements jma {

    /* renamed from: a */
    public static final Set f38444a = new HashSet();

    @Override // p001o.jma
    /* renamed from: a */
    public void mo34079a(String str) {
        mo34080b(str, null);
    }

    @Override // p001o.jma
    /* renamed from: b */
    public void mo34080b(String str, Throwable th) {
        Set set = f38444a;
        if (set.contains(str)) {
            return;
        }
        set.add(str);
    }

    /* renamed from: c */
    public void m42294c(String str, Throwable th) {
        boolean z = ve9.f50232a;
    }

    @Override // p001o.jma
    public void debug(String str) {
        m42294c(str, null);
    }

    @Override // p001o.jma
    public void error(String str, Throwable th) {
        boolean z = ve9.f50232a;
    }
}
