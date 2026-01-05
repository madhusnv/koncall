package tr;

import kotlin.jvm.internal.AbstractC4154l;
import qw.C6361k;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: tr.f */
/* loaded from: classes3.dex */
public final class C7210f extends AbstractC7213i {

    /* renamed from: a */
    public final C6361k f34504a;

    public C7210f(C6361k value) {
        AbstractC4154l.m8923f(value, "value");
        this.f34504a = value;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C7210f) && AbstractC4154l.m8918a(this.f34504a, ((C7210f) obj).f34504a);
    }

    public final int hashCode() {
        return this.f34504a.hashCode();
    }

    public final String toString() {
        return "UpdateNotContactedComponent(value=" + this.f34504a + ")";
    }
}
