package p001o;

import com.facebook.C10773c;
import com.facebook.GraphRequest;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FilenameFilter;
import java.io.IOException;
import java.util.Arrays;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes5.dex */
public final class tk8 {

    /* renamed from: a */
    public static final tk8 f47335a = new tk8();

    /* renamed from: d */
    public static final boolean m50109d(String str) {
        File fileM50111f = m50111f();
        if (fileM50111f == null || str == null) {
            return false;
        }
        return new File(fileM50111f, str).delete();
    }

    /* renamed from: e */
    public static final String m50110e(Throwable th) {
        if (th == null) {
            return null;
        }
        return th.getCause() == null ? th.toString() : String.valueOf(th.getCause());
    }

    /* renamed from: f */
    public static final File m50111f() {
        File file = new File(C10773c.m13019l().getCacheDir(), "instrument");
        if (file.exists() || file.mkdirs()) {
            return file;
        }
        return null;
    }

    /* renamed from: g */
    public static final String m50112g(Thread thread) {
        sq8.m48649h(thread, "thread");
        StackTraceElement[] stackTrace = thread.getStackTrace();
        JSONArray jSONArray = new JSONArray();
        sq8.m48648g(stackTrace, "stackTrace");
        for (StackTraceElement stackTraceElement : stackTrace) {
            jSONArray.put(stackTraceElement.toString());
        }
        return jSONArray.toString();
    }

    /* renamed from: h */
    public static final String m50113h(Throwable th) {
        Throwable th2 = null;
        if (th == null) {
            return null;
        }
        JSONArray jSONArray = new JSONArray();
        while (th != null && th != th2) {
            StackTraceElement[] stackTrace = th.getStackTrace();
            sq8.m48648g(stackTrace, "t.stackTrace");
            for (StackTraceElement stackTraceElement : stackTrace) {
                jSONArray.put(stackTraceElement.toString());
            }
            th2 = th;
            th = th.getCause();
        }
        return jSONArray.toString();
    }

    /* renamed from: i */
    public static final boolean m50114i(StackTraceElement stackTraceElement) {
        sq8.m48649h(stackTraceElement, "element");
        String className = stackTraceElement.getClassName();
        sq8.m48648g(className, "element.className");
        if (!e9g.m24597K(className, "com.facebook", false, 2, null)) {
            String className2 = stackTraceElement.getClassName();
            sq8.m48648g(className2, "element.className");
            if (!e9g.m24597K(className2, "com.meta", false, 2, null)) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: j */
    public static final boolean m50115j(Throwable th) {
        if (th == null) {
            return false;
        }
        Throwable th2 = null;
        while (th != null && th != th2) {
            StackTraceElement[] stackTrace = th.getStackTrace();
            sq8.m48648g(stackTrace, "t.stackTrace");
            for (StackTraceElement stackTraceElement : stackTrace) {
                sq8.m48648g(stackTraceElement, "element");
                if (m50114i(stackTraceElement)) {
                    return true;
                }
            }
            th2 = th;
            th = th.getCause();
        }
        return false;
    }

    /* renamed from: k */
    public static final boolean m50116k(Thread thread) {
        StackTraceElement[] stackTrace;
        if (thread != null && (stackTrace = thread.getStackTrace()) != null) {
            for (StackTraceElement stackTraceElement : stackTrace) {
                sq8.m48648g(stackTraceElement, "element");
                if (m50114i(stackTraceElement)) {
                    String className = stackTraceElement.getClassName();
                    sq8.m48648g(className, "element.className");
                    if (!e9g.m24597K(className, "com.facebook.appevents.codeless", false, 2, null)) {
                        String className2 = stackTraceElement.getClassName();
                        sq8.m48648g(className2, "element.className");
                        if (!e9g.m24597K(className2, "com.facebook.appevents.suggestedevents", false, 2, null)) {
                            return true;
                        }
                    }
                    String methodName = stackTraceElement.getMethodName();
                    sq8.m48648g(methodName, "element.methodName");
                    if (e9g.m24597K(methodName, "onClick", false, 2, null)) {
                        continue;
                    } else {
                        String methodName2 = stackTraceElement.getMethodName();
                        sq8.m48648g(methodName2, "element.methodName");
                        if (e9g.m24597K(methodName2, "onItemClick", false, 2, null)) {
                            continue;
                        } else {
                            String methodName3 = stackTraceElement.getMethodName();
                            sq8.m48648g(methodName3, "element.methodName");
                            if (!e9g.m24597K(methodName3, "onTouch", false, 2, null)) {
                                return true;
                            }
                        }
                    }
                }
            }
        }
        return false;
    }

    /* renamed from: l */
    public static final File[] m50117l() {
        File fileM50111f = m50111f();
        if (fileM50111f == null) {
            return new File[0];
        }
        File[] fileArrListFiles = fileM50111f.listFiles(new FilenameFilter() { // from class: o.sk8
            @Override // java.io.FilenameFilter
            public final boolean accept(File file, String str) {
                return tk8.m50118m(file, str);
            }
        });
        return fileArrListFiles == null ? new File[0] : fileArrListFiles;
    }

    /* renamed from: m */
    public static final boolean m50118m(File file, String str) {
        sq8.m48648g(str, "name");
        h8g h8gVar = h8g.f26398a;
        String str2 = String.format("^%s[0-9]+.json$", Arrays.copyOf(new Object[]{"anr_log_"}, 1));
        sq8.m48648g(str2, "format(format, *args)");
        return new mge(str2).m38995g(str);
    }

    /* renamed from: n */
    public static final File[] m50119n() {
        File fileM50111f = m50111f();
        if (fileM50111f == null) {
            return new File[0];
        }
        File[] fileArrListFiles = fileM50111f.listFiles(new FilenameFilter() { // from class: o.rk8
            @Override // java.io.FilenameFilter
            public final boolean accept(File file, String str) {
                return tk8.m50120o(file, str);
            }
        });
        return fileArrListFiles == null ? new File[0] : fileArrListFiles;
    }

    /* renamed from: o */
    public static final boolean m50120o(File file, String str) {
        sq8.m48648g(str, "name");
        h8g h8gVar = h8g.f26398a;
        String str2 = String.format("^%s[0-9]+.json$", Arrays.copyOf(new Object[]{"analysis_log_"}, 1));
        sq8.m48648g(str2, "format(format, *args)");
        return new mge(str2).m38995g(str);
    }

    /* renamed from: p */
    public static final File[] m50121p() {
        File fileM50111f = m50111f();
        if (fileM50111f == null) {
            return new File[0];
        }
        File[] fileArrListFiles = fileM50111f.listFiles(new FilenameFilter() { // from class: o.qk8
            @Override // java.io.FilenameFilter
            public final boolean accept(File file, String str) {
                return tk8.m50122q(file, str);
            }
        });
        return fileArrListFiles == null ? new File[0] : fileArrListFiles;
    }

    /* renamed from: q */
    public static final boolean m50122q(File file, String str) {
        sq8.m48648g(str, "name");
        h8g h8gVar = h8g.f26398a;
        String str2 = String.format("^(%s|%s|%s)[0-9]+.json$", Arrays.copyOf(new Object[]{"crash_log_", "shield_log_", "thread_check_log_"}, 3));
        sq8.m48648g(str2, "format(format, *args)");
        return new mge(str2).m38995g(str);
    }

    /* renamed from: r */
    public static final JSONObject m50123r(String str, boolean z) {
        File fileM50111f = m50111f();
        if (fileM50111f != null && str != null) {
            try {
                return new JSONObject(cri.t0(new FileInputStream(new File(fileM50111f, str))));
            } catch (Exception unused) {
                if (z) {
                    m50109d(str);
                }
            }
        }
        return null;
    }

    /* renamed from: s */
    public static final void m50124s(String str, JSONArray jSONArray, GraphRequest.InterfaceC10763b interfaceC10763b) {
        sq8.m48649h(jSONArray, "reports");
        if (jSONArray.length() == 0) {
            return;
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(str, jSONArray.toString());
            JSONObject jSONObjectM21643D = cri.m21643D();
            if (jSONObjectM21643D != null) {
                Iterator<String> itKeys = jSONObjectM21643D.keys();
                while (itKeys.hasNext()) {
                    String next = itKeys.next();
                    jSONObject.put(next, jSONObjectM21643D.get(next));
                }
            }
            GraphRequest.C10764c c10764c = GraphRequest.f11338n;
            h8g h8gVar = h8g.f26398a;
            String str2 = String.format("%s/instruments", Arrays.copyOf(new Object[]{C10773c.m13020m()}, 1));
            sq8.m48648g(str2, "format(format, *args)");
            c10764c.m12882A(null, str2, jSONObject, interfaceC10763b).m12852l();
        } catch (JSONException unused) {
        }
    }

    /* renamed from: t */
    public static final void m50125t(String str, String str2) throws IOException {
        File fileM50111f = m50111f();
        if (fileM50111f == null || str == null || str2 == null) {
            return;
        }
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(new File(fileM50111f, str));
            byte[] bytes = str2.getBytes(sh2.f45422b);
            sq8.m48648g(bytes, "this as java.lang.String).getBytes(charset)");
            fileOutputStream.write(bytes);
            fileOutputStream.close();
        } catch (Exception unused) {
        }
    }
}
