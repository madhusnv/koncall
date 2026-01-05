package g7;

import java.util.LinkedHashMap;
import kotlin.jvm.internal.AbstractC4154l;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: g7.c */
/* loaded from: classes.dex */
public abstract class AbstractC2538c {

    /* renamed from: a */
    public final LinkedHashMap f13868a = new LinkedHashMap();

    /* renamed from: a */
    public abstract Object mo6562a(InterfaceC2537b interfaceC2537b);

    public final boolean equals(Object obj) {
        if (obj instanceof AbstractC2538c) {
            return AbstractC4154l.m8918a(this.f13868a, ((AbstractC2538c) obj).f13868a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f13868a.hashCode();
    }

    public final String toString() {
        return "CreationExtras(extras=" + this.f13868a + ')';
    }
}
