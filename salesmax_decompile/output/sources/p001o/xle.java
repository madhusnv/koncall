package p001o;

import com.google.firebase.analytics.FirebaseAnalytics;
import java.nio.charset.Charset;

/* loaded from: classes6.dex */
public abstract class xle {

    /* renamed from: a */
    public static final C18181a f53902a = new C18181a(null);

    /* renamed from: o.xle$a */
    public static final class C18181a {
        public C18181a() {
        }

        public /* synthetic */ C18181a(id5 id5Var) {
            this();
        }

        /* renamed from: g */
        public static /* synthetic */ xle m56457g(C18181a c18181a, y9b y9bVar, byte[] bArr, int i, int i2, int i3, Object obj) {
            if ((i3 & 4) != 0) {
                i = 0;
            }
            if ((i3 & 8) != 0) {
                i2 = bArr.length;
            }
            return c18181a.m56461c(y9bVar, bArr, i, i2);
        }

        /* renamed from: h */
        public static /* synthetic */ xle m56458h(C18181a c18181a, byte[] bArr, y9b y9bVar, int i, int i2, int i3, Object obj) {
            if ((i3 & 1) != 0) {
                y9bVar = null;
            }
            if ((i3 & 2) != 0) {
                i = 0;
            }
            if ((i3 & 4) != 0) {
                i2 = bArr.length;
            }
            return c18181a.m56464f(bArr, y9bVar, i, i2);
        }

        /* renamed from: a */
        public final xle m56459a(String str, y9b y9bVar) {
            sq8.m48649h(str, "<this>");
            hwc hwcVarM59635b = zn8.m59635b(y9bVar);
            Charset charset = (Charset) hwcVarM59635b.m31227a();
            y9b y9bVar2 = (y9b) hwcVarM59635b.m31228b();
            byte[] bytes = str.getBytes(charset);
            sq8.m48648g(bytes, "getBytes(...)");
            return m56464f(bytes, y9bVar2, 0, bytes.length);
        }

        /* renamed from: b */
        public final xle m56460b(y9b y9bVar, byte[] bArr) {
            sq8.m48649h(bArr, FirebaseAnalytics.Param.CONTENT);
            return m56457g(this, y9bVar, bArr, 0, 0, 12, null);
        }

        /* renamed from: c */
        public final xle m56461c(y9b y9bVar, byte[] bArr, int i, int i2) {
            sq8.m48649h(bArr, FirebaseAnalytics.Param.CONTENT);
            return m56464f(bArr, y9bVar, i, i2);
        }

        /* renamed from: d */
        public final xle m56462d(byte[] bArr) {
            sq8.m48649h(bArr, "<this>");
            return m56458h(this, bArr, null, 0, 0, 7, null);
        }

        /* renamed from: e */
        public final xle m56463e(byte[] bArr, y9b y9bVar) {
            sq8.m48649h(bArr, "<this>");
            return m56458h(this, bArr, y9bVar, 0, 0, 6, null);
        }

        /* renamed from: f */
        public final xle m56464f(byte[] bArr, y9b y9bVar, int i, int i2) {
            sq8.m48649h(bArr, "<this>");
            return bgj.m18952c(bArr, y9bVar, i, i2);
        }
    }

    /* renamed from: c */
    public static final xle m56453c(String str, y9b y9bVar) {
        return f53902a.m56459a(str, y9bVar);
    }

    /* renamed from: d */
    public static final xle m56454d(y9b y9bVar, byte[] bArr) {
        return f53902a.m56460b(y9bVar, bArr);
    }

    /* renamed from: e */
    public static final xle m56455e(byte[] bArr) {
        return f53902a.m56462d(bArr);
    }

    /* renamed from: f */
    public static final xle m56456f(byte[] bArr, y9b y9bVar) {
        return f53902a.m56463e(bArr, y9bVar);
    }

    /* renamed from: a */
    public abstract long mo18953a();

    /* renamed from: b */
    public abstract y9b mo18954b();

    /* renamed from: g */
    public boolean mo49546g() {
        return bgj.m18950a(this);
    }

    /* renamed from: h */
    public boolean mo42498h() {
        return bgj.m18951b(this);
    }

    /* renamed from: i */
    public abstract void mo18955i(gm1 gm1Var);
}
