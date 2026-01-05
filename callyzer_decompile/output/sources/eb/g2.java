package eb;

import a1.C0005d;
import android.os.Process;
import android.text.TextUtils;
import android.util.Log;
import bd.C0645a;
import c5.AbstractC0865c;
import c5.C0870h;
import ej.C2060e;
import java.util.HashMap;
import java.util.IllegalFormatException;
import java.util.Locale;
import kotlin.jvm.internal.AbstractC4154l;
import pg.AbstractC5926g;
import sc.InterfaceC6794n;
import tc.C7117b;
import wi.C8072v;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class g2 implements InterfaceC6794n {

    /* renamed from: a */
    public String f9320a;

    public /* synthetic */ g2(String str, boolean z6) {
        this.f9320a = str;
    }

    /* renamed from: a */
    public static void m5716a(C0005d c0005d, C2060e c2060e) {
        String str = (String) c2060e.f9651b;
        if (str != null) {
            c0005d.m34A("X-CRASHLYTICS-GOOGLE-APP-ID", str);
        }
        c0005d.m34A("X-CRASHLYTICS-API-CLIENT-TYPE", "android");
        c0005d.m34A("X-CRASHLYTICS-API-CLIENT-VERSION", "20.0.0");
        c0005d.m34A("Accept", "application/json");
        String str2 = (String) c2060e.f9652c;
        if (str2 != null) {
            c0005d.m34A("X-CRASHLYTICS-DEVICE-MODEL", str2);
        }
        String str3 = (String) c2060e.f9653d;
        if (str3 != null) {
            c0005d.m34A("X-CRASHLYTICS-OS-BUILD-VERSION", str3);
        }
        String str4 = (String) c2060e.f9654e;
        if (str4 != null) {
            c0005d.m34A("X-CRASHLYTICS-OS-DISPLAY-VERSION", str4);
        }
        String str5 = ((C8072v) c2060e.f9658i).m15212c().f38573a;
        if (str5 != null) {
            c0005d.m34A("X-CRASHLYTICS-INSTALLATION-ID", str5);
        }
    }

    /* renamed from: c */
    public static HashMap m5717c(C2060e c2060e) {
        HashMap map = new HashMap();
        map.put("build_version", (String) c2060e.f9657h);
        map.put("display_version", (String) c2060e.f9656g);
        map.put("source", Integer.toString(c2060e.f9650a));
        String str = (String) c2060e.f9655f;
        if (!TextUtils.isEmpty(str)) {
            map.put("instance", str);
        }
        return map;
    }

    /* renamed from: f */
    public static String m5718f(String str, String str2, Object... objArr) {
        if (objArr.length > 0) {
            try {
                str2 = String.format(Locale.US, str2, objArr);
            } catch (IllegalFormatException unused) {
                "Unable to format ".concat(str2);
                str2 = str2 + " [" + TextUtils.join(", ", objArr) + "]";
            }
        }
        return i0.m0.m7379l(str, " : ", str2);
    }

    /* renamed from: b */
    public AbstractC0865c m5719b() {
        String str = this.f9320a;
        return str != null ? C0870h.m2333m(str) : C0870h.m2333m("wrap");
    }

    @Override // sc.InterfaceC6794n
    /* renamed from: d */
    public C7117b mo395d(C0645a context, Object obj) {
        qw.a0 input = (qw.a0) obj;
        AbstractC4154l.m8923f(context, "context");
        AbstractC4154l.m8923f(input, "input");
        C7117b c7117b = new C7117b();
        c7117b.f34311b.getClass();
        AbstractC5926g.m11642d(c7117b, "Accept", "application/json");
        AbstractC5926g.m11642d(c7117b, "Accept-Encoding", "identity");
        String str = this.f9320a;
        if (str != null) {
            AbstractC5926g.m11642d(c7117b, "Authorization", str);
        }
        return c7117b;
    }

    /* renamed from: e */
    public void m5720e(String str, Object... objArr) {
        if (Log.isLoggable("PlayCore", 4)) {
            m5718f(this.f9320a, str, objArr);
        }
    }

    public g2(String str) {
        this.f9320a = i0.m0.m7377j(Process.myUid(), Process.myPid(), "UID: [", "]  PID: [", "] ").concat(str);
    }

    public g2(String str, String str2) {
        this.f9320a = str;
    }
}
