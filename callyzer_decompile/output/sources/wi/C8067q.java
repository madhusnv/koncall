package wi;

import android.content.Context;
import c9.C0908c;
import c9.C0919n;
import io.C3328c;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import p020v.a1;
import zi.s0;
import zi.t0;
import zi.u0;
import zi.w0;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: wi.q */
/* loaded from: classes.dex */
public final class C8067q {

    /* renamed from: f */
    public static final HashMap f38639f;

    /* renamed from: g */
    public static final String f38640g;

    /* renamed from: a */
    public final Context f38641a;

    /* renamed from: b */
    public final C8072v f38642b;

    /* renamed from: c */
    public final C8051a f38643c;

    /* renamed from: d */
    public final C0908c f38644d;

    /* renamed from: e */
    public final C3328c f38645e;

    static {
        HashMap map = new HashMap();
        f38639f = map;
        map.put("armeabi", 5);
        map.put("armeabi-v7a", 6);
        map.put("arm64-v8a", 9);
        map.put("x86", 0);
        map.put("x86_64", 1);
        Locale locale = Locale.US;
        f38640g = "Crashlytics Android SDK/20.0.0";
    }

    public C8067q(Context context, C8072v c8072v, C8051a c8051a, C0908c c0908c, C3328c c3328c) {
        this.f38641a = context;
        this.f38642b = c8072v;
        this.f38643c = c8051a;
        this.f38644d = c0908c;
        this.f38645e = c3328c;
    }

    /* renamed from: c */
    public static t0 m15205c(C0919n c0919n, int i10) {
        String str = (String) c0919n.f5599b;
        String str2 = (String) c0919n.f5598a;
        StackTraceElement[] stackTraceElementArr = (StackTraceElement[]) c0919n.f5600c;
        int i11 = 0;
        if (stackTraceElementArr == null) {
            stackTraceElementArr = new StackTraceElement[0];
        }
        C0919n c0919n2 = (C0919n) c0919n.f5601d;
        if (i10 >= 8) {
            C0919n c0919n3 = c0919n2;
            while (c0919n3 != null) {
                c0919n3 = (C0919n) c0919n3.f5601d;
                i11++;
            }
        }
        int i12 = i11;
        List listM15206d = m15206d(stackTraceElementArr, 4);
        if (listM15206d == null) {
            throw new NullPointerException("Null frames");
        }
        byte b10 = (byte) (0 | 1);
        t0 t0VarM15205c = null;
        if (c0919n2 != null && i12 == 0) {
            t0VarM15205c = m15205c(c0919n2, i10 + 1);
        }
        if (b10 == 1) {
            return new t0(str, str2, listM15206d, t0VarM15205c, i12);
        }
        StringBuilder sb2 = new StringBuilder();
        if ((b10 & 1) == 0) {
            sb2.append(" overflowCount");
        }
        throw new IllegalStateException(a1.m14334n(sb2, "Missing required properties:"));
    }

    /* renamed from: d */
    public static List m15206d(StackTraceElement[] stackTraceElementArr, int i10) {
        ArrayList arrayList = new ArrayList();
        for (StackTraceElement stackTraceElement : stackTraceElementArr) {
            w0 w0Var = new w0();
            w0Var.f43304e = i10;
            w0Var.f43305f = (byte) (w0Var.f43305f | 4);
            long lineNumber = 0;
            long jMax = stackTraceElement.isNativeMethod() ? Math.max(stackTraceElement.getLineNumber(), 0L) : 0L;
            String str = stackTraceElement.getClassName() + "." + stackTraceElement.getMethodName();
            String fileName = stackTraceElement.getFileName();
            if (!stackTraceElement.isNativeMethod() && stackTraceElement.getLineNumber() > 0) {
                lineNumber = stackTraceElement.getLineNumber();
            }
            w0Var.f43300a = jMax;
            byte b10 = (byte) (w0Var.f43305f | 1);
            w0Var.f43305f = b10;
            if (str == null) {
                throw new NullPointerException("Null symbol");
            }
            w0Var.f43301b = str;
            w0Var.f43302c = fileName;
            w0Var.f43303d = lineNumber;
            w0Var.f43305f = (byte) (b10 | 2);
            arrayList.add(w0Var.m16455a());
        }
        return Collections.unmodifiableList(arrayList);
    }

    /* renamed from: e */
    public static u0 m15207e() {
        byte b10 = (byte) 1;
        if (b10 == 1) {
            return new u0("0", "0", 0L);
        }
        StringBuilder sb2 = new StringBuilder();
        if (b10 == 0) {
            sb2.append(" address");
        }
        throw new IllegalStateException(a1.m14334n(sb2, "Missing required properties:"));
    }

    /* renamed from: a */
    public final List m15208a() {
        byte b10 = (byte) (((byte) (0 | 1)) | 2);
        C8051a c8051a = this.f38643c;
        String str = c8051a.f38566e;
        if (str == null) {
            throw new NullPointerException("Null name");
        }
        String str2 = c8051a.f38563b;
        if (b10 == 3) {
            return Collections.singletonList(new s0(0L, 0L, str, str2));
        }
        StringBuilder sb2 = new StringBuilder();
        if ((b10 & 1) == 0) {
            sb2.append(" baseAddress");
        }
        if ((b10 & 2) == 0) {
            sb2.append(" size");
        }
        throw new IllegalStateException(a1.m14334n(sb2, "Missing required properties:"));
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0098  */
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final zi.b1 m15209b(int r17) {
        /*
            Method dump skipped, instructions count: 226
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: wi.C8067q.m15209b(int):zi.b1");
    }
}
