package uq;

import android.content.ContentResolver;
import android.net.Uri;
import kotlin.jvm.internal.AbstractC4154l;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: uq.k */
/* loaded from: classes3.dex */
public final class C7505k extends AbstractC7507m {

    /* renamed from: a */
    public final Uri f36200a;

    /* renamed from: b */
    public final ContentResolver f36201b;

    public C7505k(Uri uri, ContentResolver contentResolver) {
        this.f36200a = uri;
        this.f36201b = contentResolver;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C7505k)) {
            return false;
        }
        C7505k c7505k = (C7505k) obj;
        return AbstractC4154l.m8918a(this.f36200a, c7505k.f36200a) && AbstractC4154l.m8918a(this.f36201b, c7505k.f36201b);
    }

    public final int hashCode() {
        Uri uri = this.f36200a;
        return this.f36201b.hashCode() + ((uri == null ? 0 : uri.hashCode()) * 31);
    }

    public final String toString() {
        return "OnWriteToCSVFile(uri=" + this.f36200a + ", contentResolver=" + this.f36201b + ")";
    }
}
