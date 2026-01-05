package n4;

import java.util.Locale;
import kotlin.jvm.internal.AbstractC4154l;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: n4.a */
/* loaded from: classes.dex */
public final class C4952a {

    /* renamed from: a */
    public final Locale f24637a;

    public C4952a(Locale locale) {
        this.f24637a = locale;
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof C4952a)) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        return AbstractC4154l.m8918a(this.f24637a.toLanguageTag(), ((C4952a) obj).f24637a.toLanguageTag());
    }

    public final int hashCode() {
        return this.f24637a.toLanguageTag().hashCode();
    }

    public final String toString() {
        return this.f24637a.toLanguageTag();
    }
}
