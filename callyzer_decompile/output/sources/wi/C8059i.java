package wi;

import a9.C0073l;
import cj.C0979e;
import java.io.IOException;
import java.util.Objects;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: wi.i */
/* loaded from: classes.dex */
public final class C8059i {

    /* renamed from: a */
    public final C0073l f38588a;

    /* renamed from: b */
    public final C8058h f38589b;

    public C8059i(C0073l c0073l, C0979e c0979e) {
        this.f38588a = c0073l;
        this.f38589b = new C8058h(c0979e);
    }

    /* renamed from: a */
    public final void m15196a(String str) {
        C8058h c8058h = this.f38589b;
        synchronized (c8058h) {
            if (!Objects.equals(c8058h.f38586b, str)) {
                C0979e c0979e = c8058h.f38585a;
                String str2 = c8058h.f38587c;
                if (str != null && str2 != null) {
                    try {
                        c0979e.m2781o(str, "aqs.".concat(str2)).createNewFile();
                    } catch (IOException unused) {
                    }
                }
                c8058h.f38586b = str;
            }
        }
    }
}
