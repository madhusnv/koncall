package fu;

import i0.m0;
import java.util.List;
import kotlin.jvm.internal.AbstractC4154l;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: fu.a */
/* loaded from: classes3.dex */
public final class C2373a {

    /* renamed from: a */
    public final List f10803a;

    public C2373a(List defaultScreens) {
        AbstractC4154l.m8923f(defaultScreens, "defaultScreens");
        this.f10803a = defaultScreens;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C2373a) && AbstractC4154l.m8918a(this.f10803a, ((C2373a) obj).f10803a);
    }

    public final int hashCode() {
        return this.f10803a.hashCode();
    }

    public final String toString() {
        return m0.m7380m("NotSyncNotificationState(defaultScreens=", ")", this.f10803a);
    }
}
