package nd;

import java.util.Map;
import kotlin.jvm.internal.AbstractC4154l;
import uw.AbstractC7557a;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: nd.j */
/* loaded from: classes.dex */
public final class C5019j extends AbstractC7557a {

    /* renamed from: c */
    public static final C5012c f24768c = new C5012c();

    /* renamed from: b */
    public final Map f24769b;

    public C5019j(Map map) {
        super(f24768c);
        this.f24769b = map;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C5019j) && AbstractC4154l.m8918a(this.f24769b, ((C5019j) obj).f24769b);
    }

    public final int hashCode() {
        return this.f24769b.hashCode();
    }

    public final String toString() {
        return "LoggingContextElement(" + this.f24769b + ')';
    }
}
