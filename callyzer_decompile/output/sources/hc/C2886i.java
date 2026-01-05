package hc;

import a2.AbstractC0030c;
import com.amplifyframework.core.model.ModelIdentifier;
import kotlin.jvm.internal.AbstractC4154l;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: hc.i */
/* loaded from: classes.dex */
public final class C2886i extends AbstractC2887j {

    /* renamed from: a */
    public final String f15913a;

    public C2886i(String value) {
        AbstractC4154l.m8923f(value, "value");
        this.f15913a = value;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C2886i) && AbstractC4154l.m8918a(this.f15913a, ((C2886i) obj).f15913a);
    }

    public final int hashCode() {
        return this.f15913a.hashCode();
    }

    public final String toString() {
        return AbstractC0030c.m123n(new StringBuilder(ModelIdentifier.Helper.PRIMARY_KEY_ENCAPSULATE_CHAR), this.f15913a, '\"');
    }
}
