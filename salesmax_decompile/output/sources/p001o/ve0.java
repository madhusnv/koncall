package p001o;

import android.util.Log;
import com.onesignal.core.internal.database.impl.OneSignalDbContract;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.logging.Level;
import java.util.logging.Logger;

/* loaded from: classes6.dex */
public final class ve0 {

    /* renamed from: a */
    public static final ve0 f50224a = new ve0();

    /* renamed from: b */
    public static final CopyOnWriteArraySet f50225b = new CopyOnWriteArraySet();

    /* renamed from: c */
    public static final Map f50226c;

    static {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Package r2 = hac.class.getPackage();
        String name = r2 != null ? r2.getName() : null;
        if (name != null) {
            linkedHashMap.put(name, "OkHttp");
        }
        String name2 = hac.class.getName();
        sq8.m48648g(name2, "getName(...)");
        linkedHashMap.put(name2, "okhttp.OkHttpClient");
        String name3 = f18.class.getName();
        sq8.m48648g(name3, "getName(...)");
        linkedHashMap.put(name3, "okhttp.Http2");
        String name4 = uog.class.getName();
        sq8.m48648g(name4, "getName(...)");
        linkedHashMap.put(name4, "okhttp.TaskRunner");
        linkedHashMap.put("okhttp3.mockwebserver.MockWebServer", "okhttp.MockWebServer");
        f50226c = isa.m32693t(linkedHashMap);
    }

    /* renamed from: a */
    public final void m52648a(String str, int i, String str2, Throwable th) {
        int iMin;
        sq8.m48649h(str, "loggerName");
        sq8.m48649h(str2, OneSignalDbContract.NotificationTable.COLUMN_NAME_MESSAGE);
        String strM52651d = m52651d(str);
        if (Log.isLoggable(strM52651d, i)) {
            if (th != null) {
                str2 = str2 + '\n' + Log.getStackTraceString(th);
            }
            int length = str2.length();
            int i2 = 0;
            while (i2 < length) {
                int iA0 = f9g.a0(str2, '\n', i2, false, 4, null);
                if (iA0 == -1) {
                    iA0 = length;
                }
                while (true) {
                    iMin = Math.min(iA0, i2 + 4000);
                    String strSubstring = str2.substring(i2, iMin);
                    sq8.m48648g(strSubstring, "substring(...)");
                    Log.println(i, strM52651d, strSubstring);
                    if (iMin >= iA0) {
                        break;
                    } else {
                        i2 = iMin;
                    }
                }
                i2 = iMin + 1;
            }
        }
    }

    /* renamed from: b */
    public final void m52649b() {
        for (Map.Entry entry : f50226c.entrySet()) {
            m52650c((String) entry.getKey(), (String) entry.getValue());
        }
    }

    /* renamed from: c */
    public final void m52650c(String str, String str2) throws SecurityException {
        Logger logger = Logger.getLogger(str);
        if (f50225b.add(logger)) {
            logger.setUseParentHandlers(false);
            logger.setLevel(Log.isLoggable(str2, 3) ? Level.FINE : Log.isLoggable(str2, 4) ? Level.INFO : Level.WARNING);
            logger.addHandler(we0.f51826a);
        }
    }

    /* renamed from: d */
    public final String m52651d(String str) {
        String str2 = (String) f50226c.get(str);
        return str2 == null ? h9g.l1(str, 23) : str2;
    }
}
