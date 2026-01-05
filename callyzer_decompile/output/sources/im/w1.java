package im;

import kotlin.jvm.internal.AbstractC4154l;
import org.bouncycastle.jcajce.provider.digest.AbstractC5601a;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes3.dex */
public final class w1 implements z1 {

    /* renamed from: a */
    public final String f17588a;

    public w1(String templateId) {
        AbstractC4154l.m8923f(templateId, "templateId");
        this.f17588a = templateId;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof w1) && AbstractC4154l.m8918a(this.f17588a, ((w1) obj).f17588a);
    }

    public final int hashCode() {
        return this.f17588a.hashCode();
    }

    public final String toString() {
        return AbstractC5601a.m11238i("DeleteMasterTemplate(templateId=", this.f17588a, ")");
    }
}
