package l7;

import android.os.Bundle;
import d7.EnumC1645q;
import h6.C2856l;
import java.util.UUID;
import kotlin.jvm.internal.AbstractC4154l;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class l0 {
    /* renamed from: a */
    public static C4409i m9224a(C2856l c2856l, AbstractC4422v destination, Bundle bundle, EnumC1645q hostLifecycleState, C4413m c4413m) {
        String string = UUID.randomUUID().toString();
        AbstractC4154l.m8922e(string, "toString(...)");
        AbstractC4154l.m8923f(destination, "destination");
        AbstractC4154l.m8923f(hostLifecycleState, "hostLifecycleState");
        return new C4409i(c2856l, destination, bundle, hostLifecycleState, c4413m, string, null);
    }
}
