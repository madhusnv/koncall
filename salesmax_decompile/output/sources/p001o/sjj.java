package p001o;

import android.os.Process;
import android.text.TextUtils;
import android.util.Log;
import java.util.IllegalFormatException;
import java.util.Locale;

/* loaded from: classes3.dex */
public final class sjj {

    /* renamed from: a */
    public final String f45495a;

    public sjj(String str) {
        this.f45495a = ("UID: [" + Process.myUid() + "]  PID: [" + Process.myPid() + "] ").concat(str);
    }

    /* renamed from: e */
    public static String m48395e(String str, String str2, Object... objArr) {
        if (objArr.length > 0) {
            try {
                str2 = String.format(Locale.US, str2, objArr);
            } catch (IllegalFormatException unused) {
                "Unable to format ".concat(str2);
                str2 = str2 + " [" + TextUtils.join(", ", objArr) + "]";
            }
        }
        return str + " : " + str2;
    }

    /* renamed from: a */
    public final int m48396a(String str, Object... objArr) {
        if (Log.isLoggable("PlayCore", 6)) {
            return Log.e("PlayCore", m48395e(this.f45495a, str, objArr));
        }
        return 0;
    }

    /* renamed from: b */
    public final int m48397b(Throwable th, String str, Object... objArr) {
        if (Log.isLoggable("PlayCore", 6)) {
            return Log.e("PlayCore", m48395e(this.f45495a, str, objArr), th);
        }
        return 0;
    }

    /* renamed from: c */
    public final int m48398c(String str, Object... objArr) {
        if (Log.isLoggable("PlayCore", 4)) {
            return Log.i("PlayCore", m48395e(this.f45495a, str, objArr));
        }
        return 0;
    }

    /* renamed from: d */
    public final int m48399d(String str, Object... objArr) {
        if (Log.isLoggable("PlayCore", 5)) {
            return Log.w("PlayCore", m48395e(this.f45495a, "Phonesky package is not signed -- possibly self-built package. Could not verify.", objArr));
        }
        return 0;
    }
}
