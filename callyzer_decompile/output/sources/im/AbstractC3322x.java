package im;

import android.net.Uri;
import android.provider.CallLog;
import java.util.List;
import kotlin.jvm.internal.AbstractC4154l;
import og.pe;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: im.x */
/* loaded from: classes3.dex */
public abstract class AbstractC3322x {

    /* renamed from: a */
    public static final String[] f17589a = {"display_name", "data1", "photo_uri"};

    /* renamed from: b */
    public static final Uri f17590b;

    /* renamed from: c */
    public static final List f17591c;

    static {
        Uri CONTENT_URI = CallLog.Calls.CONTENT_URI;
        AbstractC4154l.m8922e(CONTENT_URI, "CONTENT_URI");
        f17590b = CONTENT_URI;
        f17591c = pe.m10833h("225");
    }
}
