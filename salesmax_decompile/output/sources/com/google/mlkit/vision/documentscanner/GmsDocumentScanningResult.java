package com.google.mlkit.vision.documentscanner;

import android.content.Intent;
import android.net.Uri;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes6.dex */
public abstract class GmsDocumentScanningResult implements Parcelable {

    public static abstract class Page implements Parcelable {
        /* renamed from: a */
        public abstract Uri mo15795a();
    }

    public static abstract class Pdf implements Parcelable {
        /* renamed from: a */
        public abstract int mo15796a();

        /* renamed from: b */
        public abstract Uri mo15797b();
    }

    /* renamed from: a */
    public static GmsDocumentScanningResult m15791a(Intent intent) {
        if (intent == null) {
            return null;
        }
        return (GmsDocumentScanningResult) intent.getParcelableExtra("extra_scanning_result");
    }

    /* renamed from: d */
    public static GmsDocumentScanningResult m15792d(List list, Uri uri, int i) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(new zzg((Uri) it.next()));
        }
        return new zze(arrayList, uri != null ? new zzi(uri, i) : null);
    }

    /* renamed from: b */
    public abstract List mo15793b();

    /* renamed from: c */
    public abstract Pdf mo15794c();
}
