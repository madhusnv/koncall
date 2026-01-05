package ur;

import kotlin.jvm.internal.AbstractC4154l;
import org.bouncycastle.jcajce.provider.digest.AbstractC5601a;
import qw.C6361k;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: ur.n */
/* loaded from: classes3.dex */
public final class C7521n extends AbstractC7523p {

    /* renamed from: a */
    public final String f36243a;

    /* renamed from: b */
    public final C6361k f36244b;

    /* renamed from: c */
    public final boolean f36245c;

    public C7521n(String str, C6361k newValue, boolean z6) {
        AbstractC4154l.m8923f(newValue, "newValue");
        this.f36243a = str;
        this.f36244b = newValue;
        this.f36245c = z6;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C7521n)) {
            return false;
        }
        C7521n c7521n = (C7521n) obj;
        return this.f36243a.equals(c7521n.f36243a) && AbstractC4154l.m8918a(this.f36244b, c7521n.f36244b) && this.f36245c == c7521n.f36245c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f36245c) + ((this.f36244b.hashCode() + (this.f36243a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("UpdateNotContactedValues(modelId=");
        sb2.append(this.f36243a);
        sb2.append(", newValue=");
        sb2.append(this.f36244b);
        sb2.append(", quickApply=");
        return AbstractC5601a.m11242m(sb2, this.f36245c, ")");
    }
}
