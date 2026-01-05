package kd;

import a2.AbstractC0030c;
import kotlin.jvm.internal.AbstractC4154l;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: kd.c */
/* loaded from: classes.dex */
public final class C4058c extends AbstractC4059d {

    /* renamed from: a */
    public final String f20910a;

    public C4058c(String text) {
        AbstractC4154l.m8923f(text, "text");
        this.f20910a = text;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C4058c) && AbstractC4154l.m8918a(this.f20910a, ((C4058c) obj).f20910a);
    }

    public final int hashCode() {
        return this.f20910a.hashCode();
    }

    public final String toString() {
        return AbstractC0030c.m123n(new StringBuilder("Text(text="), this.f20910a, ')');
    }
}
