package yi;

import android.util.Log;
import cj.C0979e;
import java.io.BufferedWriter;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.OutputStreamWriter;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import k4.C4001v;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import wi.AbstractC8057g;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: yi.h */
/* loaded from: classes.dex */
public final class C8679h {

    /* renamed from: b */
    public static final Charset f42017b = Charset.forName("UTF-8");

    /* renamed from: a */
    public final C0979e f42018a;

    public C8679h(C0979e c0979e) {
        this.f42018a = c0979e;
    }

    /* renamed from: a */
    public static HashMap m16013a(String str) {
        JSONObject jSONObject = new JSONObject(str);
        HashMap map = new HashMap();
        Iterator<String> itKeys = jSONObject.keys();
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            String strOptString = null;
            if (!jSONObject.isNull(next)) {
                strOptString = jSONObject.optString(next, null);
            }
            map.put(next, strOptString);
        }
        return map;
    }

    /* renamed from: b */
    public static ArrayList m16014b(String str) throws JSONException {
        JSONArray jSONArray = new JSONObject(str).getJSONArray("rolloutsState");
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < jSONArray.length(); i10++) {
            String string = jSONArray.getString(i10);
            try {
                C4001v c4001v = AbstractC8685n.f42035a;
                JSONObject jSONObject = new JSONObject(string);
                String string2 = jSONObject.getString("rolloutId");
                String string3 = jSONObject.getString("parameterKey");
                String string4 = jSONObject.getString("parameterValue");
                String string5 = jSONObject.getString("variantId");
                long j6 = jSONObject.getLong("templateVersion");
                if (string4.length() > 256) {
                    string4 = string4.substring(0, 256);
                }
                arrayList.add(new C8673b(string2, string3, string4, string5, j6));
            } catch (Exception unused) {
            }
        }
        return arrayList;
    }

    /* renamed from: e */
    public static String m16015e(List list) {
        HashMap map = new HashMap();
        JSONArray jSONArray = new JSONArray();
        for (int i10 = 0; i10 < list.size(); i10++) {
            try {
                jSONArray.put(new JSONObject(AbstractC8685n.f42035a.m8776q(list.get(i10))));
            } catch (JSONException unused) {
            }
        }
        map.put("rolloutsState", jSONArray);
        return new JSONObject(map).toString();
    }

    /* renamed from: f */
    public static void m16016f(File file) {
        if (file.exists() && file.delete()) {
            file.getAbsolutePath();
        }
    }

    /* renamed from: c */
    public final Map m16017c(String str, boolean z6) throws Throwable {
        FileInputStream fileInputStream;
        C0979e c0979e = this.f42018a;
        File fileM2781o = z6 ? c0979e.m2781o(str, "internal-keys") : c0979e.m2781o(str, "keys");
        if (!fileM2781o.exists() || fileM2781o.length() == 0) {
            if (fileM2781o.exists() && fileM2781o.delete()) {
                fileM2781o.getAbsolutePath();
            }
            return Collections.EMPTY_MAP;
        }
        FileInputStream fileInputStream2 = null;
        try {
            try {
                fileInputStream = new FileInputStream(fileM2781o);
            } catch (Exception unused) {
            }
        } catch (Throwable th2) {
            th = th2;
        }
        try {
            HashMap mapM16013a = m16013a(AbstractC8057g.m15195i(fileInputStream));
            AbstractC8057g.m15188b(fileInputStream);
            return mapM16013a;
        } catch (Exception unused2) {
            fileInputStream2 = fileInputStream;
            m16016f(fileM2781o);
            AbstractC8057g.m15188b(fileInputStream2);
            return Collections.EMPTY_MAP;
        } catch (Throwable th3) {
            th = th3;
            fileInputStream2 = fileInputStream;
            AbstractC8057g.m15188b(fileInputStream2);
            throw th;
        }
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [int] */
    /* renamed from: d */
    public final String m16018d(String str) {
        FileInputStream fileInputStream;
        File fileM2781o = this.f42018a.m2781o(str, "user-data");
        Closeable closeable = null;
        if (fileM2781o.exists()) {
            ?? r02 = (fileM2781o.length() > 0L ? 1 : (fileM2781o.length() == 0L ? 0 : -1));
            try {
                if (r02 != 0) {
                    try {
                        fileInputStream = new FileInputStream(fileM2781o);
                        try {
                            JSONObject jSONObject = new JSONObject(AbstractC8057g.m15195i(fileInputStream));
                            String strOptString = !jSONObject.isNull("userId") ? jSONObject.optString("userId", null) : null;
                            Log.isLoggable("FirebaseCrashlytics", 3);
                            AbstractC8057g.m15188b(fileInputStream);
                            return strOptString;
                        } catch (Exception unused) {
                            m16016f(fileM2781o);
                            AbstractC8057g.m15188b(fileInputStream);
                            return null;
                        }
                    } catch (Exception unused2) {
                        fileInputStream = null;
                    } catch (Throwable th2) {
                        th = th2;
                        AbstractC8057g.m15188b(closeable);
                        throw th;
                    }
                }
            } catch (Throwable th3) {
                th = th3;
                closeable = r02;
            }
        }
        Log.isLoggable("FirebaseCrashlytics", 3);
        m16016f(fileM2781o);
        return null;
    }

    /* renamed from: g */
    public final void m16019g(String str, Map map, boolean z6) {
        String string;
        BufferedWriter bufferedWriter;
        C0979e c0979e = this.f42018a;
        File fileM2781o = z6 ? c0979e.m2781o(str, "internal-keys") : c0979e.m2781o(str, "keys");
        BufferedWriter bufferedWriter2 = null;
        try {
            try {
                string = new JSONObject(map).toString();
                bufferedWriter = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(fileM2781o), f42017b));
            } catch (Exception unused) {
            }
        } catch (Throwable th2) {
            th = th2;
        }
        try {
            bufferedWriter.write(string);
            bufferedWriter.flush();
            AbstractC8057g.m15188b(bufferedWriter);
        } catch (Exception unused2) {
            bufferedWriter2 = bufferedWriter;
            m16016f(fileM2781o);
            AbstractC8057g.m15188b(bufferedWriter2);
        } catch (Throwable th3) {
            th = th3;
            bufferedWriter2 = bufferedWriter;
            AbstractC8057g.m15188b(bufferedWriter2);
            throw th;
        }
    }

    /* renamed from: h */
    public final void m16020h(String str, List list) {
        String strM16015e;
        BufferedWriter bufferedWriter;
        File fileM2781o = this.f42018a.m2781o(str, "rollouts-state");
        if (list.isEmpty()) {
            if (fileM2781o.exists() && fileM2781o.delete()) {
                fileM2781o.getAbsolutePath();
                return;
            }
            return;
        }
        BufferedWriter bufferedWriter2 = null;
        try {
            try {
                strM16015e = m16015e(list);
                bufferedWriter = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(fileM2781o), f42017b));
            } catch (Throwable th2) {
                th = th2;
            }
        } catch (Exception unused) {
        }
        try {
            bufferedWriter.write(strM16015e);
            bufferedWriter.flush();
            AbstractC8057g.m15188b(bufferedWriter);
        } catch (Exception unused2) {
            bufferedWriter2 = bufferedWriter;
            m16016f(fileM2781o);
            AbstractC8057g.m15188b(bufferedWriter2);
        } catch (Throwable th3) {
            th = th3;
            bufferedWriter2 = bufferedWriter;
            AbstractC8057g.m15188b(bufferedWriter2);
            throw th;
        }
    }
}
