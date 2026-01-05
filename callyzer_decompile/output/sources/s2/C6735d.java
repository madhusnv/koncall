package s2;

import kotlin.jvm.internal.AbstractC4154l;
import og.d2;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: s2.d */
/* loaded from: classes.dex */
public final class C6735d {

    /* renamed from: a */
    public int f32177a = 0;

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("IntRef(element = ");
        sb2.append(this.f32177a);
        sb2.append(")@");
        int iHashCode = hashCode();
        d2.m10599b(16);
        String string = Integer.toString(iHashCode, 16);
        AbstractC4154l.m8922e(string, "toString(...)");
        sb2.append(string);
        return sb2.toString();
    }
}
