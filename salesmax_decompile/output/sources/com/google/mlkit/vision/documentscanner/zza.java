package com.google.mlkit.vision.documentscanner;

import com.google.mlkit.vision.documentscanner.GmsDocumentScanningResult;
import java.util.List;

/* loaded from: classes6.dex */
abstract class zza extends GmsDocumentScanningResult {

    /* renamed from: a */
    public final List f13447a;

    /* renamed from: b */
    public final GmsDocumentScanningResult.Pdf f13448b;

    public zza(List list, GmsDocumentScanningResult.Pdf pdf) {
        this.f13447a = list;
        this.f13448b = pdf;
    }

    @Override // com.google.mlkit.vision.documentscanner.GmsDocumentScanningResult
    /* renamed from: b */
    public final List mo15793b() {
        return this.f13447a;
    }

    @Override // com.google.mlkit.vision.documentscanner.GmsDocumentScanningResult
    /* renamed from: c */
    public final GmsDocumentScanningResult.Pdf mo15794c() {
        return this.f13448b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof GmsDocumentScanningResult) {
            GmsDocumentScanningResult gmsDocumentScanningResult = (GmsDocumentScanningResult) obj;
            List list = this.f13447a;
            if (list != null ? list.equals(gmsDocumentScanningResult.mo15793b()) : gmsDocumentScanningResult.mo15793b() == null) {
                GmsDocumentScanningResult.Pdf pdf = this.f13448b;
                if (pdf != null ? pdf.equals(gmsDocumentScanningResult.mo15794c()) : gmsDocumentScanningResult.mo15794c() == null) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        List list = this.f13447a;
        int iHashCode = list == null ? 0 : list.hashCode();
        GmsDocumentScanningResult.Pdf pdf = this.f13448b;
        return ((iHashCode ^ 1000003) * 1000003) ^ (pdf != null ? pdf.hashCode() : 0);
    }

    public final String toString() {
        GmsDocumentScanningResult.Pdf pdf = this.f13448b;
        return "GmsDocumentScanningResult{pages=" + String.valueOf(this.f13447a) + ", pdf=" + String.valueOf(pdf) + "}";
    }
}
