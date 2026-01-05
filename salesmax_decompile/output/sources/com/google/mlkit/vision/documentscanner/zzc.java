package com.google.mlkit.vision.documentscanner;

import android.net.Uri;
import com.google.mlkit.vision.documentscanner.GmsDocumentScanningResult;

/* loaded from: classes6.dex */
abstract class zzc extends GmsDocumentScanningResult.Pdf {

    /* renamed from: a */
    public final Uri f13450a;

    /* renamed from: b */
    public final int f13451b;

    public zzc(Uri uri, int i) {
        if (uri == null) {
            throw new NullPointerException("Null uri");
        }
        this.f13450a = uri;
        this.f13451b = i;
    }

    @Override // com.google.mlkit.vision.documentscanner.GmsDocumentScanningResult.Pdf
    /* renamed from: a */
    public final int mo15796a() {
        return this.f13451b;
    }

    @Override // com.google.mlkit.vision.documentscanner.GmsDocumentScanningResult.Pdf
    /* renamed from: b */
    public final Uri mo15797b() {
        return this.f13450a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof GmsDocumentScanningResult.Pdf) {
            GmsDocumentScanningResult.Pdf pdf = (GmsDocumentScanningResult.Pdf) obj;
            if (this.f13450a.equals(pdf.mo15797b()) && this.f13451b == pdf.mo15796a()) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.f13450a.hashCode() ^ 1000003) * 1000003) ^ this.f13451b;
    }

    public final String toString() {
        return "Pdf{uri=" + this.f13450a.toString() + ", pageCount=" + this.f13451b + "}";
    }
}
