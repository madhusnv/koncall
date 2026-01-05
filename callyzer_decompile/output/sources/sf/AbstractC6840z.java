package sf;

import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.common.api.ResolvableApiException;
import com.google.android.gms.common.api.Status;
import p020v.a1;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: sf.z */
/* loaded from: classes.dex */
public abstract class AbstractC6840z {

    /* renamed from: a */
    public static final Object f32500a = new Object();

    /* renamed from: b */
    public static boolean f32501b;

    /* renamed from: c */
    public static int f32502c;

    /* renamed from: a */
    public static void m13030a(String str, boolean z6) {
        if (!z6) {
            throw new IllegalArgumentException(str);
        }
    }

    /* renamed from: b */
    public static void m13031b(boolean z6) {
        if (!z6) {
            throw new IllegalArgumentException();
        }
    }

    /* renamed from: c */
    public static void m13032c(Handler handler) {
        Looper looperMyLooper = Looper.myLooper();
        if (looperMyLooper != handler.getLooper()) {
            throw new IllegalStateException(a1.m14333m("Must be called on ", handler.getLooper().getThread().getName(), " thread, but got ", looperMyLooper != null ? looperMyLooper.getThread().getName() : "null current looper", "."));
        }
    }

    /* renamed from: d */
    public static void m13033d(String str) {
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException("Given String is empty or null");
        }
    }

    /* renamed from: e */
    public static void m13034e(String str, String str2) {
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException(str2);
        }
    }

    /* renamed from: f */
    public static void m13035f(String str) {
        if (Looper.getMainLooper() == Looper.myLooper()) {
            throw new IllegalStateException(str);
        }
    }

    /* renamed from: g */
    public static void m13036g(Object obj) {
        if (obj == null) {
            throw new NullPointerException("null reference");
        }
    }

    /* renamed from: h */
    public static void m13037h(Object obj, String str) {
        if (obj == null) {
            throw new NullPointerException(str);
        }
    }

    /* renamed from: i */
    public static void m13038i(String str, boolean z6) {
        if (!z6) {
            throw new IllegalStateException(String.valueOf(str));
        }
    }

    /* renamed from: j */
    public static void m13039j(boolean z6) {
        if (!z6) {
            throw new IllegalStateException();
        }
    }

    /* renamed from: k */
    public static boolean m13040k(Object obj, Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
    }

    /* renamed from: l */
    public static ApiException m13041l(Status status) {
        return status.f6009c != null ? new ResolvableApiException(status) : new ApiException(status);
    }
}
