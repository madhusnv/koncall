package vq;

import android.net.Uri;
import kotlin.jvm.internal.AbstractC4154l;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: vq.d */
/* loaded from: classes3.dex */
public final class C7732d {

    /* renamed from: a */
    public final Boolean f37285a;

    /* renamed from: b */
    public final Integer f37286b;

    /* renamed from: c */
    public final Uri f37287c;

    public C7732d(Boolean bool, Integer num, Uri uri) {
        this.f37285a = bool;
        this.f37286b = num;
        this.f37287c = uri;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C7732d)) {
            return false;
        }
        C7732d c7732d = (C7732d) obj;
        return AbstractC4154l.m8918a(this.f37285a, c7732d.f37285a) && AbstractC4154l.m8918a(this.f37286b, c7732d.f37286b) && AbstractC4154l.m8918a(this.f37287c, c7732d.f37287c);
    }

    public final int hashCode() {
        Boolean bool = this.f37285a;
        int iHashCode = (bool == null ? 0 : bool.hashCode()) * 31;
        Integer num = this.f37286b;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        Uri uri = this.f37287c;
        return iHashCode2 + (uri != null ? uri.hashCode() : 0);
    }

    public final String toString() {
        return "ExportCSVResultData(isSuccess=" + this.f37285a + ", resultMsg=" + this.f37286b + ", docUri=" + this.f37287c + ")";
    }
}
