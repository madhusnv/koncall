package d9;

import android.net.NetworkRequest;
import kotlin.jvm.internal.AbstractC4154l;
import t8.C7077w;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: d9.i */
/* loaded from: classes.dex */
public final class C1664i {

    /* renamed from: b */
    public static final /* synthetic */ int f8186b = 0;

    /* renamed from: a */
    public final Object f8187a;

    static {
        AbstractC4154l.m8922e(C7077w.m13372b("NetworkRequestCompat"), "tagWithPrefix(\"NetworkRequestCompat\")");
    }

    public C1664i(NetworkRequest networkRequest) {
        this.f8187a = networkRequest;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C1664i) && AbstractC4154l.m8918a(this.f8187a, ((C1664i) obj).f8187a);
    }

    public final int hashCode() {
        Object obj = this.f8187a;
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    public final String toString() {
        return "NetworkRequestCompat(wrapped=" + this.f8187a + ')';
    }
}
