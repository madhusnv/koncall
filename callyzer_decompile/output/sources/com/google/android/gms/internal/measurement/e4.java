package com.google.android.gms.internal.measurement;

import android.content.Context;
import xh.InterfaceC8379d;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class e4 {

    /* renamed from: a */
    public final Context f6125a;

    /* renamed from: b */
    public final InterfaceC8379d f6126b;

    public e4(Context context, InterfaceC8379d interfaceC8379d) {
        this.f6125a = context;
        this.f6126b = interfaceC8379d;
    }

    public final boolean equals(Object obj) {
        InterfaceC8379d interfaceC8379d;
        if (obj == this) {
            return true;
        }
        if (obj instanceof e4) {
            e4 e4Var = (e4) obj;
            InterfaceC8379d interfaceC8379d2 = e4Var.f6126b;
            if (this.f6125a.equals(e4Var.f6125a) && ((interfaceC8379d = this.f6126b) != null ? interfaceC8379d.equals(interfaceC8379d2) : interfaceC8379d2 == null)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = this.f6125a.hashCode() ^ 1000003;
        InterfaceC8379d interfaceC8379d = this.f6126b;
        return (iHashCode * 1000003) ^ (interfaceC8379d == null ? 0 : interfaceC8379d.hashCode());
    }

    public final String toString() {
        String string = this.f6125a.toString();
        int length = string.length();
        String strValueOf = String.valueOf(this.f6126b);
        StringBuilder sb2 = new StringBuilder(length + 45 + strValueOf.length() + 1);
        p020v.a1.m14319B(sb2, "FlagsContext{context=", string, ", hermeticFileOverrides=", strValueOf);
        sb2.append("}");
        return sb2.toString();
    }
}
