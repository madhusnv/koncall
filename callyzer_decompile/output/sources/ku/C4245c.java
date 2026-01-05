package ku;

import i0.m0;
import java.util.List;
import kotlin.jvm.internal.AbstractC4154l;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: ku.c */
/* loaded from: classes3.dex */
public final class C4245c {

    /* renamed from: a */
    public final List f21566a;

    public C4245c(List themeList) {
        AbstractC4154l.m8923f(themeList, "themeList");
        this.f21566a = themeList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C4245c) && AbstractC4154l.m8918a(this.f21566a, ((C4245c) obj).f21566a);
    }

    public final int hashCode() {
        return this.f21566a.hashCode();
    }

    public final String toString() {
        return m0.m7380m("ThemeState(themeList=", ")", this.f21566a);
    }
}
