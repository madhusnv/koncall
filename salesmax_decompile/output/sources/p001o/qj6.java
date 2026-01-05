package p001o;

import com.facebook.C10773c;
import com.facebook.C10776f;
import com.facebook.GraphRequest;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.io.File;
import java.io.FilenameFilter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes5.dex */
public final class qj6 {

    /* renamed from: a */
    public static final qj6 f42064a = new qj6();

    /* renamed from: d */
    public static final void m45536d() {
        if (C10773c.m13023p()) {
            m45540h();
        }
    }

    /* renamed from: e */
    public static final File[] m45537e() {
        File fileM50111f = tk8.m50111f();
        if (fileM50111f == null) {
            return new File[0];
        }
        File[] fileArrListFiles = fileM50111f.listFiles(new FilenameFilter() { // from class: o.pj6
            @Override // java.io.FilenameFilter
            public final boolean accept(File file, String str) {
                return qj6.m45538f(file, str);
            }
        });
        sq8.m48648g(fileArrListFiles, "reportDir.listFiles { di…OR_REPORT_PREFIX)))\n    }");
        return fileArrListFiles;
    }

    /* renamed from: f */
    public static final boolean m45538f(File file, String str) {
        sq8.m48648g(str, "name");
        h8g h8gVar = h8g.f26398a;
        String str2 = String.format("^%s[0-9]+.json$", Arrays.copyOf(new Object[]{"error_log_"}, 1));
        sq8.m48648g(str2, "format(format, *args)");
        return new mge(str2).m38995g(str);
    }

    /* renamed from: g */
    public static final void m45539g(String str) {
        try {
            new mj6(str).m39183e();
        } catch (Exception unused) {
        }
    }

    /* renamed from: h */
    public static final void m45540h() {
        if (cri.a0()) {
            return;
        }
        File[] fileArrM45537e = m45537e();
        final ArrayList arrayList = new ArrayList();
        for (File file : fileArrM45537e) {
            mj6 mj6Var = new mj6(file);
            if (mj6Var.m39182d()) {
                arrayList.add(mj6Var);
            }
        }
        gh3.m28657z(arrayList, new Comparator() { // from class: o.nj6
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return qj6.m45541i((mj6) obj, (mj6) obj2);
            }
        });
        JSONArray jSONArray = new JSONArray();
        for (int i = 0; i < arrayList.size() && i < 1000; i++) {
            jSONArray.put(arrayList.get(i));
        }
        tk8.m50124s("error_reports", jSONArray, new GraphRequest.InterfaceC10763b() { // from class: o.oj6
            @Override // com.facebook.GraphRequest.InterfaceC10763b
            /* renamed from: a */
            public final void mo12873a(C10776f c10776f) {
                qj6.m45542j(arrayList, c10776f);
            }
        });
    }

    /* renamed from: i */
    public static final int m45541i(mj6 mj6Var, mj6 mj6Var2) {
        sq8.m48648g(mj6Var2, "o2");
        return mj6Var.m39180b(mj6Var2);
    }

    /* renamed from: j */
    public static final void m45542j(ArrayList arrayList, C10776f c10776f) {
        sq8.m48649h(arrayList, "$validReports");
        sq8.m48649h(c10776f, "response");
        try {
            if (c10776f.m13064b() == null) {
                JSONObject jSONObjectM13066d = c10776f.m13066d();
                boolean z = false;
                if (jSONObjectM13066d != null && jSONObjectM13066d.getBoolean(FirebaseAnalytics.Param.SUCCESS)) {
                    z = true;
                }
                if (z) {
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        ((mj6) it.next()).m39179a();
                    }
                }
            }
        } catch (JSONException unused) {
        }
    }
}
