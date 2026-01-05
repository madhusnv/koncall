package com.google.android.gms.internal.measurement;

import android.net.Uri;
import e1.C1903e;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public abstract class n4 {

    /* renamed from: a */
    public static final C1903e f6313a = new C1903e(0);

    /* renamed from: a */
    public static synchronized Uri m3528a() {
        C1903e c1903e = f6313a;
        Uri uri = (Uri) c1903e.get("com.google.android.gms.measurement");
        if (uri != null) {
            return uri;
        }
        Uri uri2 = Uri.parse("content://com.google.android.gms.phenotype/".concat(String.valueOf(Uri.encode("com.google.android.gms.measurement"))));
        c1903e.put("com.google.android.gms.measurement", uri2);
        return uri2;
    }
}
