package com.google.android.gms.internal.measurement;

import android.net.Uri;
import java.util.regex.Pattern;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public abstract class a4 {

    /* renamed from: a */
    public static final Uri f6054a = Uri.parse("content://com.google.android.gsf.gservices");

    /* renamed from: b */
    public static final Pattern f6055b;

    /* renamed from: c */
    public static final Pattern f6056c;

    static {
        Uri.parse("content://com.google.android.gsf.gservices/prefix");
        f6055b = Pattern.compile("^(1|true|t|on|yes|y)$", 2);
        f6056c = Pattern.compile("^(0|false|f|off|no|n)$", 2);
    }
}
