package com.google.android.gms.internal.measurement;

import a6.C0058f;
import android.net.Uri;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class o4 {

    /* renamed from: g */
    public static final Object f6321g = new Object();

    /* renamed from: h */
    public static volatile e4 f6322h;

    /* renamed from: i */
    public static final AtomicInteger f6323i;

    /* renamed from: a */
    public final C0058f f6324a;

    /* renamed from: b */
    public final String f6325b;

    /* renamed from: c */
    public final Object f6326c;

    /* renamed from: d */
    public volatile int f6327d = -1;

    /* renamed from: e */
    public volatile Object f6328e;

    /* renamed from: f */
    public final /* synthetic */ int f6329f;

    static {
        new AtomicReference();
        f6323i = new AtomicInteger();
    }

    public /* synthetic */ o4(C0058f c0058f, String str, Object obj, int i10) {
        this.f6329f = i10;
        if (((Uri) c0058f.f234b) == null) {
            throw new IllegalArgumentException("Must pass a valid SharedPreferences file name or ContentProvider URI");
        }
        this.f6324a = c0058f;
        this.f6325b = str;
        this.f6326c = obj;
    }

    /* renamed from: a */
    public final Object m3529a(Object obj) {
        switch (this.f6329f) {
            case 0:
                if (!(obj instanceof Long)) {
                    if (obj instanceof String) {
                        try {
                            break;
                        } catch (NumberFormatException unused) {
                        }
                    }
                    new StringBuilder(this.f6325b.length() + 25 + obj.toString().length());
                    break;
                } else {
                    break;
                }
            case 1:
                if (!(obj instanceof Boolean)) {
                    if (obj instanceof String) {
                        String str = (String) obj;
                        if (!a4.f6055b.matcher(str).matches()) {
                            if (a4.f6056c.matcher(str).matches()) {
                                break;
                            }
                        } else {
                            break;
                        }
                    }
                    new StringBuilder(this.f6325b.length() + 28 + obj.toString().length());
                    break;
                } else {
                    break;
                }
            case 2:
                if (!(obj instanceof Double)) {
                    if (!(obj instanceof Float)) {
                        if (obj instanceof String) {
                            try {
                                break;
                            } catch (NumberFormatException unused2) {
                            }
                        }
                        new StringBuilder(this.f6325b.length() + 27 + obj.toString().length());
                        break;
                    } else {
                        break;
                    }
                } else {
                    break;
                }
            default:
                if (obj instanceof String) {
                    break;
                }
                break;
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0058 A[PHI: r2
      0x0058: PHI (r2v1 xh.b) = (r2v0 xh.b), (r2v5 xh.b), (r2v5 xh.b) binds: [B:8:0x0014, B:10:0x0022, B:16:0x0047] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0062 A[Catch: all -> 0x0055, TryCatch #0 {all -> 0x0055, blocks: (B:5:0x000b, B:7:0x000f, B:9:0x0016, B:11:0x0024, B:13:0x0034, B:17:0x0048, B:26:0x0062, B:28:0x006a, B:30:0x0072, B:33:0x0082, B:35:0x0090, B:47:0x00b5, B:50:0x00bd, B:51:0x00c0, B:52:0x00c4, B:39:0x0099, B:41:0x009d, B:43:0x00ab, B:45:0x00b1, B:53:0x00c9, B:54:0x00cb, B:55:0x00cc, B:56:0x00d1, B:14:0x0041, B:57:0x00d2), top: B:63:0x000b }] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00cc A[Catch: all -> 0x0055, TryCatch #0 {all -> 0x0055, blocks: (B:5:0x000b, B:7:0x000f, B:9:0x0016, B:11:0x0024, B:13:0x0034, B:17:0x0048, B:26:0x0062, B:28:0x006a, B:30:0x0072, B:33:0x0082, B:35:0x0090, B:47:0x00b5, B:50:0x00bd, B:51:0x00c0, B:52:0x00c4, B:39:0x0099, B:41:0x009d, B:43:0x00ab, B:45:0x00b1, B:53:0x00c9, B:54:0x00cb, B:55:0x00cc, B:56:0x00d1, B:14:0x0041, B:57:0x00d2), top: B:63:0x000b }] */
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m3530b() {
        /*
            Method dump skipped, instructions count: 217
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.o4.m3530b():java.lang.Object");
    }
}
