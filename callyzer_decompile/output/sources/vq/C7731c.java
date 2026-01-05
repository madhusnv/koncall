package vq;

import a2.AbstractC0030c;
import kotlin.jvm.internal.AbstractC4154l;
import org.bouncycastle.jcajce.provider.digest.AbstractC5601a;
import p020v.a1;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: vq.c */
/* loaded from: classes3.dex */
public final class C7731c {

    /* renamed from: a */
    public final int f37282a;

    /* renamed from: b */
    public final String f37283b;

    /* renamed from: c */
    public boolean f37284c;

    public C7731c(int i10, String valueToDisplay) {
        AbstractC4154l.m8923f(valueToDisplay, "valueToDisplay");
        this.f37282a = i10;
        this.f37283b = valueToDisplay;
        this.f37284c = false;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C7731c)) {
            return false;
        }
        C7731c c7731c = (C7731c) obj;
        return this.f37282a == c7731c.f37282a && AbstractC4154l.m8918a(this.f37283b, c7731c.f37283b) && this.f37284c == c7731c.f37284c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f37284c) + AbstractC0030c.m113d(Integer.hashCode(this.f37282a) * 31, 31, this.f37283b);
    }

    public final String toString() {
        return AbstractC5601a.m11242m(a1.m14337q(this.f37282a, "CompareValueElement(value=", ", valueToDisplay=", this.f37283b, ", shouldHighlighted="), this.f37284c, ")");
    }
}
