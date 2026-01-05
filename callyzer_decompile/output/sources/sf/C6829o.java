package sf;

import java.util.Arrays;
import qf.InterfaceC6203b;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: sf.o */
/* loaded from: classes.dex */
public final class C6829o implements InterfaceC6203b {

    /* renamed from: b */
    public static final C6829o f32476b = new C6829o(null);

    /* renamed from: a */
    public final String f32477a;

    public /* synthetic */ C6829o(String str) {
        this.f32477a = str;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C6829o) {
            return AbstractC6840z.m13040k(this.f32477a, ((C6829o) obj).f32477a);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f32477a});
    }
}
