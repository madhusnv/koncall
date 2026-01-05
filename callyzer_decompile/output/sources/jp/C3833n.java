package jp;

import android.content.ContentResolver;
import android.net.Uri;
import kotlin.jvm.internal.AbstractC4154l;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: jp.n */
/* loaded from: classes3.dex */
public final class C3833n extends AbstractC3837r {

    /* renamed from: a */
    public final Uri f19786a;

    /* renamed from: b */
    public final ContentResolver f19787b;

    public C3833n(Uri uri, ContentResolver contentResolver) {
        this.f19786a = uri;
        this.f19787b = contentResolver;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3833n)) {
            return false;
        }
        C3833n c3833n = (C3833n) obj;
        return AbstractC4154l.m8918a(this.f19786a, c3833n.f19786a) && AbstractC4154l.m8918a(this.f19787b, c3833n.f19787b);
    }

    public final int hashCode() {
        Uri uri = this.f19786a;
        return this.f19787b.hashCode() + ((uri == null ? 0 : uri.hashCode()) * 31);
    }

    public final String toString() {
        return "OnWriteToCSVFile(uri=" + this.f19786a + ", contentResolver=" + this.f19787b + ")";
    }
}
