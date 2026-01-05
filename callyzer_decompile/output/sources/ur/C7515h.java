package ur;

import com.sun.mail.util.AbstractC1452a;
import java.util.List;
import kotlin.jvm.internal.AbstractC4154l;
import org.bouncycastle.jcajce.provider.digest.AbstractC5601a;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: ur.h */
/* loaded from: classes3.dex */
public final class C7515h extends AbstractC7523p {

    /* renamed from: a */
    public final String f36218a;

    /* renamed from: b */
    public final List f36219b;

    /* renamed from: c */
    public final boolean f36220c;

    public C7515h(String modelId, List updatedOptions, boolean z6) {
        AbstractC4154l.m8923f(modelId, "modelId");
        AbstractC4154l.m8923f(updatedOptions, "updatedOptions");
        this.f36218a = modelId;
        this.f36219b = updatedOptions;
        this.f36220c = z6;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C7515h)) {
            return false;
        }
        C7515h c7515h = (C7515h) obj;
        return AbstractC4154l.m8918a(this.f36218a, c7515h.f36218a) && AbstractC4154l.m8918a(this.f36219b, c7515h.f36219b) && this.f36220c == c7515h.f36220c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f36220c) + AbstractC1452a.m4559f(this.f36219b, this.f36218a.hashCode() * 31, 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("UpdateDynamicCheckValue(modelId=");
        sb2.append(this.f36218a);
        sb2.append(", updatedOptions=");
        sb2.append(this.f36219b);
        sb2.append(", quickApply=");
        return AbstractC5601a.m11242m(sb2, this.f36220c, ")");
    }
}
