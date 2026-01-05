package ln;

import android.content.Context;
import kotlin.jvm.internal.AbstractC4154l;
import xm.C8418z;
import xm.y5;
import yv.C8805t;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: ln.c */
/* loaded from: classes3.dex */
public final class C4490c {

    /* renamed from: a */
    public final y5 f22347a;

    /* renamed from: b */
    public final C8418z f22348b;

    /* renamed from: c */
    public final Context f22349c;

    /* renamed from: d */
    public final C8805t f22350d;

    public C4490c(y5 userSIMRepository, C8418z appPreferencesRepository, Context context, C8805t c8805t) {
        AbstractC4154l.m8923f(userSIMRepository, "userSIMRepository");
        AbstractC4154l.m8923f(appPreferencesRepository, "appPreferencesRepository");
        this.f22347a = userSIMRepository;
        this.f22348b = appPreferencesRepository;
        this.f22349c = context;
        this.f22350d = c8805t;
    }

    /* JADX WARN: Removed duplicated region for block: B:45:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00e7 A[Catch: Exception -> 0x003f, PHI: r0 r4 r5
      0x00e7: PHI (r0v19 java.lang.Object) = (r0v18 java.lang.Object), (r0v1 java.lang.Object) binds: [B:44:0x00e3, B:27:0x0087] A[DONT_GENERATE, DONT_INLINE]
      0x00e7: PHI (r4v10 java.util.List) = (r4v7 java.util.List), (r4v12 java.util.List) binds: [B:44:0x00e3, B:27:0x0087] A[DONT_GENERATE, DONT_INLINE]
      0x00e7: PHI (r5v4 java.util.Set) = (r5v3 java.util.Set), (r5v6 java.util.Set) binds: [B:44:0x00e3, B:27:0x0087] A[DONT_GENERATE, DONT_INLINE], TryCatch #0 {Exception -> 0x003f, blocks: (B:13:0x003a, B:97:0x0255, B:18:0x0052, B:63:0x0136, B:65:0x013c, B:66:0x014a, B:68:0x0150, B:70:0x0165, B:75:0x0175, B:81:0x01b2, B:82:0x01b9, B:84:0x01c5, B:93:0x0239, B:21:0x006b, B:24:0x007c, B:57:0x0118, B:58:0x0121, B:27:0x0087, B:46:0x00e7, B:48:0x00ef, B:50:0x00f5, B:52:0x00fb, B:54:0x0101, B:59:0x0122, B:61:0x012d, B:62:0x0131, B:100:0x025c, B:101:0x026a, B:102:0x026b, B:103:0x0279, B:30:0x008f, B:43:0x00d2, B:40:0x00c3), top: B:111:0x0029 }] */
    /* JADX WARN: Removed duplicated region for block: B:65:0x013c A[Catch: Exception -> 0x003f, TryCatch #0 {Exception -> 0x003f, blocks: (B:13:0x003a, B:97:0x0255, B:18:0x0052, B:63:0x0136, B:65:0x013c, B:66:0x014a, B:68:0x0150, B:70:0x0165, B:75:0x0175, B:81:0x01b2, B:82:0x01b9, B:84:0x01c5, B:93:0x0239, B:21:0x006b, B:24:0x007c, B:57:0x0118, B:58:0x0121, B:27:0x0087, B:46:0x00e7, B:48:0x00ef, B:50:0x00f5, B:52:0x00fb, B:54:0x0101, B:59:0x0122, B:61:0x012d, B:62:0x0131, B:100:0x025c, B:101:0x026a, B:102:0x026b, B:103:0x0279, B:30:0x008f, B:43:0x00d2, B:40:0x00c3), top: B:111:0x0029 }] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x01b0  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0230  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0239 A[Catch: Exception -> 0x003f, PHI: r0 r10
      0x0239: PHI (r0v32 kotlin.jvm.internal.v) = (r0v26 kotlin.jvm.internal.v), (r0v40 kotlin.jvm.internal.v) binds: [B:61:0x012d, B:64:0x013a] A[DONT_GENERATE, DONT_INLINE]
      0x0239: PHI (r10v6 int) = (r10v2 int), (r10v8 int) binds: [B:61:0x012d, B:64:0x013a] A[DONT_GENERATE, DONT_INLINE], TryCatch #0 {Exception -> 0x003f, blocks: (B:13:0x003a, B:97:0x0255, B:18:0x0052, B:63:0x0136, B:65:0x013c, B:66:0x014a, B:68:0x0150, B:70:0x0165, B:75:0x0175, B:81:0x01b2, B:82:0x01b9, B:84:0x01c5, B:93:0x0239, B:21:0x006b, B:24:0x007c, B:57:0x0118, B:58:0x0121, B:27:0x0087, B:46:0x00e7, B:48:0x00ef, B:50:0x00f5, B:52:0x00fb, B:54:0x0101, B:59:0x0122, B:61:0x012d, B:62:0x0131, B:100:0x025c, B:101:0x026a, B:102:0x026b, B:103:0x0279, B:30:0x008f, B:43:0x00d2, B:40:0x00c3), top: B:111:0x0029 }] */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0254  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:87:0x0228 -> B:88:0x022a). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:91:0x0232 -> B:89:0x022c). Please report as a decompilation issue!!! */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m9334a(ww.AbstractC8193c r37) throws java.lang.Exception {
        /*
            Method dump skipped, instructions count: 680
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ln.C4490c.m9334a(ww.c):java.lang.Object");
    }
}
