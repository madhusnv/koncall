package ur;

import a2.AbstractC0030c;
import kotlin.jvm.internal.AbstractC4154l;
import org.bouncycastle.jcajce.provider.digest.AbstractC5601a;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: ur.j */
/* loaded from: classes3.dex */
public final class C7517j extends AbstractC7523p {

    /* renamed from: a */
    public final String f36229a;

    /* renamed from: b */
    public final String f36230b;

    /* renamed from: c */
    public final boolean f36231c;

    public C7517j(String modelId, String newValue, boolean z6) {
        AbstractC4154l.m8923f(modelId, "modelId");
        AbstractC4154l.m8923f(newValue, "newValue");
        this.f36229a = modelId;
        this.f36230b = newValue;
        this.f36231c = z6;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C7517j)) {
            return false;
        }
        C7517j c7517j = (C7517j) obj;
        return AbstractC4154l.m8918a(this.f36229a, c7517j.f36229a) && AbstractC4154l.m8918a(this.f36230b, c7517j.f36230b) && this.f36231c == c7517j.f36231c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f36231c) + AbstractC0030c.m113d(this.f36229a.hashCode() * 31, 31, this.f36230b);
    }

    public final String toString() {
        return AbstractC5601a.m11242m(AbstractC0030c.m127r("UpdateDynamicStringField(modelId=", this.f36229a, ", newValue=", this.f36230b, ", quickApply="), this.f36231c, ")");
    }
}
