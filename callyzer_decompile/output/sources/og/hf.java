package og;

import bd.C0645a;
import com.amplifyframework.storage.ObjectMetadata;
import ec.C2003a;
import iz.C3389v;
import kotlin.jvm.internal.AbstractC4154l;
import nx.AbstractC5185w;
import sc.AbstractC6791k;
import sc.C6801u;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public abstract class hf {
    /* renamed from: a */
    public static C3389v m10687a(C3389v c3389v, C3389v c3389v2) {
        eb.i3 i3Var = new eb.i3(2);
        int size = c3389v.size();
        for (int i10 = 0; i10 < size; i10++) {
            String strM7788h = c3389v.m7788h(i10);
            String strM7790q = c3389v.m7790q(i10);
            if ((!"Warning".equalsIgnoreCase(strM7788h) || !AbstractC5185w.m10138t(strM7790q, "1", false)) && ("Content-Length".equalsIgnoreCase(strM7788h) || ObjectMetadata.CONTENT_ENCODING.equalsIgnoreCase(strM7788h) || ObjectMetadata.CONTENT_TYPE.equalsIgnoreCase(strM7788h) || !m10689c(strM7788h) || c3389v2.m7787b(strM7788h) == null)) {
                i3Var.m5726d(strM7788h, strM7790q);
            }
        }
        int size2 = c3389v2.size();
        for (int i11 = 0; i11 < size2; i11++) {
            String strM7788h2 = c3389v2.m7788h(i11);
            if (!"Content-Length".equalsIgnoreCase(strM7788h2) && !ObjectMetadata.CONTENT_ENCODING.equalsIgnoreCase(strM7788h2) && !ObjectMetadata.CONTENT_TYPE.equalsIgnoreCase(strM7788h2) && m10689c(strM7788h2)) {
                i3Var.m5726d(strM7788h2, c3389v2.m7790q(i11));
            }
        }
        return i3Var.m5727e();
    }

    /* renamed from: b */
    public static final C6801u m10688b(C0645a c0645a) {
        AbstractC4154l.m8923f(c0645a, "<this>");
        C2003a c2003a = AbstractC6791k.f32292a;
        C6801u c6801u = (C6801u) c0645a.mo1864e(AbstractC6791k.f32296e);
        if (c6801u != null) {
            return c6801u;
        }
        C6801u c6801u2 = C6801u.f32317n;
        return C6801u.f32317n;
    }

    /* renamed from: c */
    public static boolean m10689c(String str) {
        return ("Connection".equalsIgnoreCase(str) || "Keep-Alive".equalsIgnoreCase(str) || "Proxy-Authenticate".equalsIgnoreCase(str) || "Proxy-Authorization".equalsIgnoreCase(str) || "TE".equalsIgnoreCase(str) || "Trailers".equalsIgnoreCase(str) || "Transfer-Encoding".equalsIgnoreCase(str) || "Upgrade".equalsIgnoreCase(str)) ? false : true;
    }
}
