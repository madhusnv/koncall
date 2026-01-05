package com.google.mlkit.vision.documentscanner;

import android.net.Uri;
import com.google.mlkit.vision.documentscanner.GmsDocumentScanningResult;

/* loaded from: classes6.dex */
abstract class zzb extends GmsDocumentScanningResult.Page {

    /* renamed from: a */
    public final Uri f13449a;

    public zzb(Uri uri) {
        if (uri == null) {
            throw new NullPointerException("Null imageUri");
        }
        this.f13449a = uri;
    }

    @Override // com.google.mlkit.vision.documentscanner.GmsDocumentScanningResult.Page
    /* renamed from: a */
    public final Uri mo15795a() {
        return this.f13449a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof GmsDocumentScanningResult.Page) {
            return this.f13449a.equals(((GmsDocumentScanningResult.Page) obj).mo15795a());
        }
        return false;
    }

    public final int hashCode() {
        return this.f13449a.hashCode() ^ 1000003;
    }

    public final String toString() {
        return "Page{imageUri=" + this.f13449a.toString() + "}";
    }
}
