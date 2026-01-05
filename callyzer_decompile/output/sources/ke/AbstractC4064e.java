package ke;

import ge.C2571c;
import ge.C2577i;
import he.C2912c;
import kotlin.NoWhenBranchMatchedException;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: ke.e */
/* loaded from: classes.dex */
public abstract class AbstractC4064e {

    /* renamed from: a */
    public static final C2571c f20918a = new C2571c();

    /* renamed from: a */
    public static final boolean m8839a(C2577i c2577i) {
        int i10 = AbstractC4063d.f20917a[c2577i.f14022e.ordinal()];
        if (i10 == 1) {
            return false;
        }
        if (i10 == 2) {
            return true;
        }
        if (i10 == 3) {
            return c2577i.f14042y.f13994a == null && (c2577i.f14039v instanceof C2912c);
        }
        throw new NoWhenBranchMatchedException();
    }
}
