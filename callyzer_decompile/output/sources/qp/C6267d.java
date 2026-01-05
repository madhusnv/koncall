package qp;

import android.net.Uri;
import kotlin.jvm.internal.AbstractC4154l;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: qp.d */
/* loaded from: classes3.dex */
public final class C6267d {

    /* renamed from: a */
    public final Boolean f30392a;

    /* renamed from: b */
    public final Integer f30393b;

    /* renamed from: c */
    public final Uri f30394c;

    public C6267d(Boolean bool, Integer num, Uri uri) {
        this.f30392a = bool;
        this.f30393b = num;
        this.f30394c = uri;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C6267d)) {
            return false;
        }
        C6267d c6267d = (C6267d) obj;
        return AbstractC4154l.m8918a(this.f30392a, c6267d.f30392a) && AbstractC4154l.m8918a(this.f30393b, c6267d.f30393b) && AbstractC4154l.m8918a(this.f30394c, c6267d.f30394c);
    }

    public final int hashCode() {
        Boolean bool = this.f30392a;
        int iHashCode = (bool == null ? 0 : bool.hashCode()) * 31;
        Integer num = this.f30393b;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        Uri uri = this.f30394c;
        return iHashCode2 + (uri != null ? uri.hashCode() : 0);
    }

    public final String toString() {
        return "ExportCSVResultData(isSuccess=" + this.f30392a + ", resultMsg=" + this.f30393b + ", docUri=" + this.f30394c + ")";
    }
}
