package ja;

import java.util.Map;
import kotlin.jvm.internal.AbstractC4154l;
import rw.C6669s;
import sw.C6962f;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: ja.j */
/* loaded from: classes.dex */
public final class C3616j {

    /* renamed from: a */
    public final C6962f f19255a;

    /* renamed from: b */
    public final C3614h f19256b;

    public C3616j(C6962f c6962f, C3614h source) {
        AbstractC4154l.m8923f(source, "source");
        this.f19255a = c6962f;
        this.f19256b = source;
    }

    /* renamed from: a */
    public final C3617k m8167a() {
        EnumC3618l enumC3618l = EnumC3618l.PROFILE;
        Map map = (Map) this.f19255a.get(enumC3618l);
        C6669s c6669s = C6669s.f31944a;
        if (map == null) {
            map = c6669s;
        }
        C3614h c3614h = this.f19256b;
        C3617k c3617k = (C3617k) map.get(c3614h.f19248a);
        return c3617k == null ? new C3617k(c3614h.f19248a, c6669s, enumC3618l) : c3617k;
    }
}
