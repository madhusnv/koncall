package br;

import android.net.Uri;
import kotlin.jvm.internal.AbstractC4154l;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: br.d */
/* loaded from: classes3.dex */
public final class C0741d {

    /* renamed from: a */
    public final Boolean f4687a;

    /* renamed from: b */
    public final Integer f4688b;

    /* renamed from: c */
    public final Uri f4689c;

    public C0741d(Boolean bool, Integer num, Uri uri) {
        this.f4687a = bool;
        this.f4688b = num;
        this.f4689c = uri;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0741d)) {
            return false;
        }
        C0741d c0741d = (C0741d) obj;
        return AbstractC4154l.m8918a(this.f4687a, c0741d.f4687a) && AbstractC4154l.m8918a(this.f4688b, c0741d.f4688b) && AbstractC4154l.m8918a(this.f4689c, c0741d.f4689c);
    }

    public final int hashCode() {
        Boolean bool = this.f4687a;
        int iHashCode = (bool == null ? 0 : bool.hashCode()) * 31;
        Integer num = this.f4688b;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        Uri uri = this.f4689c;
        return iHashCode2 + (uri != null ? uri.hashCode() : 0);
    }

    public final String toString() {
        return "ExportCSVResultData(isSuccess=" + this.f4687a + ", resultMsg=" + this.f4688b + ", docUri=" + this.f4689c + ")";
    }
}
