package o1;

import com.skydoves.balloon.internals.DefinitionKt;
import com.sun.mail.util.AbstractC1452a;
import kotlin.jvm.internal.AbstractC4154l;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class l1 {

    /* renamed from: a */
    public float f25782a = DefinitionKt.NO_Float_VALUE;

    /* renamed from: b */
    public boolean f25783b = true;

    /* renamed from: c */
    public AbstractC5244c f25784c = null;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l1)) {
            return false;
        }
        l1 l1Var = (l1) obj;
        return Float.compare(this.f25782a, l1Var.f25782a) == 0 && this.f25783b == l1Var.f25783b && AbstractC4154l.m8918a(this.f25784c, l1Var.f25784c);
    }

    public final int hashCode() {
        int iM4558e = AbstractC1452a.m4558e(Float.hashCode(this.f25782a) * 31, 31, this.f25783b);
        AbstractC5244c abstractC5244c = this.f25784c;
        return (iM4558e + (abstractC5244c == null ? 0 : abstractC5244c.hashCode())) * 31;
    }

    public final String toString() {
        return "RowColumnParentData(weight=" + this.f25782a + ", fill=" + this.f25783b + ", crossAxisAlignment=" + this.f25784c + ", flowLayoutData=null)";
    }
}
