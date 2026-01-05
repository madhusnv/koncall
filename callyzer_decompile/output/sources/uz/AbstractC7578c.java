package uz;

import android.util.Log;
import iz.d0;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArraySet;
import kotlin.jvm.internal.AbstractC4154l;
import mz.C4920d;
import nx.AbstractC5178p;
import qz.AbstractC6390h;
import rw.AbstractC6674x;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: uz.c */
/* loaded from: classes3.dex */
public abstract class AbstractC7578c {

    /* renamed from: a */
    public static final CopyOnWriteArraySet f36454a = new CopyOnWriteArraySet();

    /* renamed from: b */
    public static final Map f36455b;

    static {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Package r22 = d0.class.getPackage();
        String name = r22 != null ? r22.getName() : null;
        if (name != null) {
            linkedHashMap.put(name, "OkHttp");
        }
        linkedHashMap.put(d0.class.getName(), "okhttp.OkHttpClient");
        linkedHashMap.put(AbstractC6390h.class.getName(), "okhttp.Http2");
        linkedHashMap.put(C4920d.class.getName(), "okhttp.TaskRunner");
        linkedHashMap.put("okhttp3.mockwebserver.MockWebServer", "okhttp.MockWebServer");
        f36455b = AbstractC6674x.m12785m(linkedHashMap);
    }

    /* renamed from: a */
    public static void m14313a(String str, int i10, String str2, Throwable th2) {
        int iMin;
        String strF0 = (String) f36455b.get(str);
        if (strF0 == null) {
            strF0 = AbstractC5178p.f0(23, str);
        }
        if (Log.isLoggable(strF0, i10)) {
            if (th2 != null) {
                str2 = str2 + '\n' + Log.getStackTraceString(th2);
            }
            int length = str2.length();
            int i11 = 0;
            while (i11 < length) {
                int iM10098I = AbstractC5178p.m10098I(str2, '\n', i11, 4);
                if (iM10098I == -1) {
                    iM10098I = length;
                }
                while (true) {
                    iMin = Math.min(iM10098I, i11 + 4000);
                    String strSubstring = str2.substring(i11, iMin);
                    AbstractC4154l.m8922e(strSubstring, "substring(...)");
                    Log.println(i10, strF0, strSubstring);
                    if (iMin >= iM10098I) {
                        break;
                    } else {
                        i11 = iMin;
                    }
                }
                i11 = iMin + 1;
            }
        }
    }
}
