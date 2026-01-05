package ar;

import android.content.ContentResolver;
import android.net.Uri;
import kotlin.jvm.internal.AbstractC4154l;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: ar.j */
/* loaded from: classes3.dex */
public final class C0420j extends AbstractC0427q {

    /* renamed from: a */
    public final Uri f3138a;

    /* renamed from: b */
    public final ContentResolver f3139b;

    public C0420j(Uri uri, ContentResolver contentResolver) {
        this.f3138a = uri;
        this.f3139b = contentResolver;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0420j)) {
            return false;
        }
        C0420j c0420j = (C0420j) obj;
        return AbstractC4154l.m8918a(this.f3138a, c0420j.f3138a) && AbstractC4154l.m8918a(this.f3139b, c0420j.f3139b);
    }

    public final int hashCode() {
        Uri uri = this.f3138a;
        return this.f3139b.hashCode() + ((uri == null ? 0 : uri.hashCode()) * 31);
    }

    public final String toString() {
        return "OnWriteToCSVFile(uri=" + this.f3138a + ", contentResolver=" + this.f3139b + ")";
    }
}
