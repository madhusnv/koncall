package iu;

import i0.m0;
import java.util.List;
import kotlin.jvm.internal.AbstractC4154l;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: iu.f */
/* loaded from: classes3.dex */
public final class C3354f {

    /* renamed from: a */
    public final List f17735a;

    public C3354f(List notePopUpOptions) {
        AbstractC4154l.m8923f(notePopUpOptions, "notePopUpOptions");
        this.f17735a = notePopUpOptions;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C3354f) && AbstractC4154l.m8918a(this.f17735a, ((C3354f) obj).f17735a);
    }

    public final int hashCode() {
        return this.f17735a.hashCode();
    }

    public final String toString() {
        return m0.m7380m("NotePopupState(notePopUpOptions=", ")", this.f17735a);
    }
}
