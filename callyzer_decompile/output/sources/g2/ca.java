package g2;

import kotlin.jvm.internal.AbstractC4154l;
import w1.C7860d;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class ca {

    /* renamed from: a */
    public final C7860d f11318a;

    /* renamed from: b */
    public final C7860d f11319b;

    /* renamed from: c */
    public final C7860d f11320c;

    /* renamed from: d */
    public final C7860d f11321d;

    /* renamed from: e */
    public final C7860d f11322e;

    public ca(C7860d c7860d, C7860d c7860d2, C7860d c7860d3, C7860d c7860d4, int i10) {
        c7860d = (i10 & 1) != 0 ? ba.f11263a : c7860d;
        c7860d2 = (i10 & 2) != 0 ? ba.f11264b : c7860d2;
        c7860d3 = (i10 & 4) != 0 ? ba.f11265c : c7860d3;
        c7860d4 = (i10 & 8) != 0 ? ba.f11266d : c7860d4;
        C7860d c7860d5 = ba.f11267e;
        this.f11318a = c7860d;
        this.f11319b = c7860d2;
        this.f11320c = c7860d3;
        this.f11321d = c7860d4;
        this.f11322e = c7860d5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ca)) {
            return false;
        }
        ca caVar = (ca) obj;
        return AbstractC4154l.m8918a(this.f11318a, caVar.f11318a) && AbstractC4154l.m8918a(this.f11319b, caVar.f11319b) && AbstractC4154l.m8918a(this.f11320c, caVar.f11320c) && AbstractC4154l.m8918a(this.f11321d, caVar.f11321d) && AbstractC4154l.m8918a(this.f11322e, caVar.f11322e);
    }

    public final int hashCode() {
        return this.f11322e.hashCode() + ((this.f11321d.hashCode() + ((this.f11320c.hashCode() + ((this.f11319b.hashCode() + (this.f11318a.hashCode() * 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "Shapes(extraSmall=" + this.f11318a + ", small=" + this.f11319b + ", medium=" + this.f11320c + ", large=" + this.f11321d + ", extraLarge=" + this.f11322e + ')';
    }
}
