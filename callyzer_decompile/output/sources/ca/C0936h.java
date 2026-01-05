package ca;

import kotlin.jvm.internal.AbstractC4154l;
import og.la;
import og.ma;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: ca.h */
/* loaded from: classes.dex */
public final class C0936h extends ma {

    /* renamed from: a */
    public final la f5690a;

    public C0936h(la laVar) {
        this.f5690a = laVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C0936h) && AbstractC4154l.m8918a(this.f5690a, ((C0936h) obj).f5690a);
    }

    public final int hashCode() {
        return this.f5690a.hashCode();
    }

    public final String toString() {
        return "Ok(provider=" + this.f5690a + ')';
    }
}
