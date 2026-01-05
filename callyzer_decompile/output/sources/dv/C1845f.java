package dv;

import kotlin.jvm.internal.AbstractC4154l;
import og.id;
import org.bouncycastle.jcajce.provider.digest.AbstractC5601a;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: dv.f */
/* loaded from: classes3.dex */
public final class C1845f extends id {

    /* renamed from: b */
    public final String f8823b;

    public C1845f(String note) {
        AbstractC4154l.m8923f(note, "note");
        this.f8823b = note;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C1845f) && AbstractC4154l.m8918a(this.f8823b, ((C1845f) obj).f8823b);
    }

    public final int hashCode() {
        return this.f8823b.hashCode();
    }

    public final String toString() {
        return AbstractC5601a.m11238i("OnNoteChange(note=", this.f8823b, ")");
    }
}
