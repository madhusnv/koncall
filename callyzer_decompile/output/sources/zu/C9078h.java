package zu;

import kotlin.jvm.internal.AbstractC4154l;
import org.bouncycastle.jcajce.provider.digest.AbstractC5601a;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: zu.h */
/* loaded from: classes3.dex */
public final class C9078h extends AbstractC9092v {

    /* renamed from: a */
    public final String f43610a;

    public C9078h(String note) {
        AbstractC4154l.m8923f(note, "note");
        this.f43610a = note;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C9078h) && AbstractC4154l.m8918a(this.f43610a, ((C9078h) obj).f43610a);
    }

    public final int hashCode() {
        return this.f43610a.hashCode();
    }

    public final String toString() {
        return AbstractC5601a.m11238i("OnNoteChange(note=", this.f43610a, ")");
    }
}
