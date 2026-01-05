package mt;

import kotlin.jvm.internal.AbstractC4154l;
import nt.C5138b;
import og.c1;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: mt.g */
/* loaded from: classes3.dex */
public final class C4878g extends c1 {

    /* renamed from: a */
    public final C5138b f24390a;

    public C4878g(C5138b messageSubTemplate) {
        AbstractC4154l.m8923f(messageSubTemplate, "messageSubTemplate");
        this.f24390a = messageSubTemplate;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C4878g) && AbstractC4154l.m8918a(this.f24390a, ((C4878g) obj).f24390a);
    }

    public final int hashCode() {
        return this.f24390a.hashCode();
    }

    public final String toString() {
        return "SelectedSubTemplate(messageSubTemplate=" + this.f24390a + ")";
    }
}
