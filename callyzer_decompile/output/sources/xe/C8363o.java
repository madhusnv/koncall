package xe;

import java.util.Set;
import ue.C7421c;
import ue.InterfaceC7423e;
import ue.InterfaceC7424f;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: xe.o */
/* loaded from: classes.dex */
public final class C8363o implements InterfaceC7424f {

    /* renamed from: a */
    public final Set f40011a;

    /* renamed from: b */
    public final C8357i f40012b;

    /* renamed from: c */
    public final C8365q f40013c;

    public C8363o(Set set, C8357i c8357i, C8365q c8365q) {
        this.f40011a = set;
        this.f40012b = c8357i;
        this.f40013c = c8365q;
    }

    /* renamed from: a */
    public final C8364p m15534a(String str, C7421c c7421c, InterfaceC7423e interfaceC7423e) {
        Set set = this.f40011a;
        if (set.contains(c7421c)) {
            return new C8364p(this.f40012b, str, c7421c, interfaceC7423e, this.f40013c);
        }
        throw new IllegalArgumentException(String.format("%s is not supported byt this factory. Supported encodings are: %s.", c7421c, set));
    }
}
