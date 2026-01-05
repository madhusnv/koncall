package ec;

import java.util.Locale;
import kotlin.jvm.internal.AbstractC4154l;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: ec.h */
/* loaded from: classes.dex */
public final class C2010h {

    /* renamed from: a */
    public final String f9541a;

    /* renamed from: b */
    public final String f9542b;

    public C2010h(String original) {
        AbstractC4154l.m8923f(original, "original");
        this.f9541a = original;
        String lowerCase = original.toLowerCase(Locale.ROOT);
        AbstractC4154l.m8922e(lowerCase, "toLowerCase(...)");
        this.f9542b = lowerCase;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C2010h) {
            return AbstractC4154l.m8918a(this.f9542b, ((C2010h) obj).f9542b);
        }
        return false;
    }

    public final int hashCode() {
        return this.f9542b.hashCode();
    }

    public final String toString() {
        return this.f9541a;
    }
}
