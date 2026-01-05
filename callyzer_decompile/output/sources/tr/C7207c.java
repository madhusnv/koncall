package tr;

import kotlin.jvm.internal.AbstractC4154l;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: tr.c */
/* loaded from: classes3.dex */
public final class C7207c extends AbstractC7213i {

    /* renamed from: a */
    public final Object f34499a;

    public C7207c(Object obj) {
        this.f34499a = obj;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C7207c) && AbstractC4154l.m8918a(this.f34499a, ((C7207c) obj).f34499a);
    }

    public final int hashCode() {
        Object obj = this.f34499a;
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    public final String toString() {
        return "SetFieldType(fieldType=" + this.f34499a + ")";
    }
}
