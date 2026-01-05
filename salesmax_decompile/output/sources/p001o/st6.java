package p001o;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import com.amplifyframework.storage.s3.transfer.TransferTable;
import com.facebook.C10773c;
import com.facebook.GraphRequest;
import com.google.android.gms.cast.CredentialsData;
import com.google.firebase.messaging.Constants;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes5.dex */
public final class st6 {

    /* renamed from: a */
    public static final st6 f45902a = new st6();

    /* renamed from: b */
    public static final String f45903b = kge.m35689b(st6.class).mo26337d();

    /* renamed from: c */
    public static final AtomicBoolean f45904c = new AtomicBoolean(false);

    /* renamed from: d */
    public static final ConcurrentLinkedQueue f45905d = new ConcurrentLinkedQueue();

    /* renamed from: e */
    public static final Map f45906e = new ConcurrentHashMap();

    /* renamed from: f */
    public static Long f45907f;

    /* renamed from: g */
    public static in7 f45908g;

    /* renamed from: o.st6$a */
    public interface InterfaceC16913a {
        void onCompleted();
    }

    /* renamed from: d */
    public static final boolean m48897d(String str, String str2, boolean z) {
        Boolean bool;
        sq8.m48649h(str, "name");
        Map mapM48904e = f45902a.m48904e(str2);
        return (mapM48904e.containsKey(str) && (bool = (Boolean) mapM48904e.get(str)) != null) ? bool.booleanValue() : z;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0041 A[DONT_GENERATE] */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0043 A[Catch: all -> 0x0083, TRY_ENTER, TRY_LEAVE, TryCatch #0 {, blocks: (B:5:0x0005, B:6:0x000a, B:8:0x0018, B:10:0x0020, B:13:0x0025, B:17:0x0043, B:19:0x0055, B:24:0x0064, B:25:0x0067, B:29:0x006f, B:33:0x0079, B:22:0x005d), top: B:39:0x0005, inners: #1 }] */
    /* renamed from: h */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final synchronized void m48898h(InterfaceC16913a interfaceC16913a) {
        final String strM13020m;
        st6 st6Var;
        final Context contextM13019l;
        if (interfaceC16913a != null) {
            f45905d.add(interfaceC16913a);
            strM13020m = C10773c.m13020m();
            st6Var = f45902a;
            if (!st6Var.m48905f(f45907f) && f45906e.containsKey(strM13020m)) {
                st6Var.m48907k();
                return;
            }
            contextM13019l = C10773c.m13019l();
            h8g h8gVar = h8g.f26398a;
            final String str = String.format("com.facebook.internal.APP_GATEKEEPERS.%s", Arrays.copyOf(new Object[]{strM13020m}, 1));
            sq8.m48648g(str, "format(format, *args)");
            if (contextM13019l != null) {
                return;
            }
            JSONObject jSONObject = null;
            String string = contextM13019l.getSharedPreferences("com.facebook.internal.preferences.APP_GATEKEEPERS", 0).getString(str, null);
            if (!cri.d0(string)) {
                try {
                    jSONObject = new JSONObject(string);
                } catch (JSONException e) {
                    cri.j0("FacebookSDK", e);
                }
                if (jSONObject != null) {
                    m48900j(strM13020m, jSONObject);
                }
            }
            Executor executorM13028u = C10773c.m13028u();
            if (executorM13028u == null) {
                return;
            }
            if (f45904c.compareAndSet(false, true)) {
                executorM13028u.execute(new Runnable() { // from class: o.qt6
                    @Override // java.lang.Runnable
                    public final void run() {
                        st6.m48899i(strM13020m, contextM13019l, str);
                    }
                });
                return;
            }
            return;
        }
        strM13020m = C10773c.m13020m();
        st6Var = f45902a;
        if (!st6Var.m48905f(f45907f)) {
        }
        contextM13019l = C10773c.m13019l();
        h8g h8gVar2 = h8g.f26398a;
        final String str2 = String.format("com.facebook.internal.APP_GATEKEEPERS.%s", Arrays.copyOf(new Object[]{strM13020m}, 1));
        sq8.m48648g(str2, "format(format, *args)");
        if (contextM13019l != null) {
        }
    }

    /* renamed from: i */
    public static final void m48899i(String str, Context context, String str2) {
        sq8.m48649h(str, "$applicationId");
        sq8.m48649h(context, "$context");
        sq8.m48649h(str2, "$gateKeepersKey");
        st6 st6Var = f45902a;
        JSONObject jSONObjectM48903c = st6Var.m48903c(str);
        if (jSONObjectM48903c.length() != 0) {
            m48900j(str, jSONObjectM48903c);
            context.getSharedPreferences("com.facebook.internal.preferences.APP_GATEKEEPERS", 0).edit().putString(str2, jSONObjectM48903c.toString()).apply();
            f45907f = Long.valueOf(System.currentTimeMillis());
        }
        st6Var.m48907k();
        f45904c.set(false);
    }

    /* renamed from: j */
    public static final synchronized JSONObject m48900j(String str, JSONObject jSONObject) {
        JSONObject jSONObject2;
        JSONArray jSONArrayOptJSONArray;
        sq8.m48649h(str, "applicationId");
        jSONObject2 = (JSONObject) f45906e.get(str);
        if (jSONObject2 == null) {
            jSONObject2 = new JSONObject();
        }
        JSONObject jSONObjectOptJSONObject = (jSONObject == null || (jSONArrayOptJSONArray = jSONObject.optJSONArray(Constants.ScionAnalytics.MessageType.DATA_MESSAGE)) == null) ? null : jSONArrayOptJSONArray.optJSONObject(0);
        if (jSONObjectOptJSONObject == null) {
            jSONObjectOptJSONObject = new JSONObject();
        }
        JSONArray jSONArrayOptJSONArray2 = jSONObjectOptJSONObject.optJSONArray("gatekeepers");
        if (jSONArrayOptJSONArray2 == null) {
            jSONArrayOptJSONArray2 = new JSONArray();
        }
        int length = jSONArrayOptJSONArray2.length();
        for (int i = 0; i < length; i++) {
            try {
                JSONObject jSONObject3 = jSONArrayOptJSONArray2.getJSONObject(i);
                jSONObject2.put(jSONObject3.getString(TransferTable.COLUMN_KEY), jSONObject3.getBoolean("value"));
            } catch (JSONException e) {
                cri.j0("FacebookSDK", e);
            }
        }
        f45906e.put(str, jSONObject2);
        return jSONObject2;
    }

    /* renamed from: l */
    public static final void m48901l(InterfaceC16913a interfaceC16913a) {
        interfaceC16913a.onCompleted();
    }

    /* renamed from: m */
    public static final JSONObject m48902m(String str, boolean z) {
        sq8.m48649h(str, "applicationId");
        if (!z) {
            Map map = f45906e;
            if (map.containsKey(str)) {
                JSONObject jSONObject = (JSONObject) map.get(str);
                return jSONObject == null ? new JSONObject() : jSONObject;
            }
        }
        JSONObject jSONObjectM48903c = f45902a.m48903c(str);
        Context contextM13019l = C10773c.m13019l();
        h8g h8gVar = h8g.f26398a;
        String str2 = String.format("com.facebook.internal.APP_GATEKEEPERS.%s", Arrays.copyOf(new Object[]{str}, 1));
        sq8.m48648g(str2, "format(format, *args)");
        contextM13019l.getSharedPreferences("com.facebook.internal.preferences.APP_GATEKEEPERS", 0).edit().putString(str2, jSONObjectM48903c.toString()).apply();
        return m48900j(str, jSONObjectM48903c);
    }

    /* renamed from: c */
    public final JSONObject m48903c(String str) {
        Bundle bundle = new Bundle();
        bundle.putString("platform", CredentialsData.CREDENTIALS_TYPE_ANDROID);
        bundle.putString("sdk_version", C10773c.m12989C());
        bundle.putString("fields", "gatekeepers");
        GraphRequest.C10764c c10764c = GraphRequest.f11338n;
        h8g h8gVar = h8g.f26398a;
        String str2 = String.format("app/%s", Arrays.copyOf(new Object[]{"mobile_sdk_gk"}, 1));
        sq8.m48648g(str2, "format(format, *args)");
        GraphRequest graphRequestM12913x = c10764c.m12913x(null, str2, null);
        graphRequestM12913x.m12846G(bundle);
        JSONObject jSONObjectM13066d = graphRequestM12913x.m12851k().m13066d();
        return jSONObjectM13066d == null ? new JSONObject() : jSONObjectM13066d;
    }

    /* renamed from: e */
    public final Map m48904e(String str) {
        m48906g();
        if (str != null) {
            Map map = f45906e;
            if (map.containsKey(str)) {
                in7 in7Var = f45908g;
                List<hn7> listM32437a = in7Var != null ? in7Var.m32437a(str) : null;
                if (listM32437a != null) {
                    HashMap map2 = new HashMap();
                    for (hn7 hn7Var : listM32437a) {
                        map2.put(hn7Var.m30846a(), Boolean.valueOf(hn7Var.m30847b()));
                    }
                    return map2;
                }
                HashMap map3 = new HashMap();
                JSONObject jSONObject = (JSONObject) map.get(str);
                if (jSONObject == null) {
                    jSONObject = new JSONObject();
                }
                Iterator<String> itKeys = jSONObject.keys();
                while (itKeys.hasNext()) {
                    String next = itKeys.next();
                    sq8.m48648g(next, TransferTable.COLUMN_KEY);
                    map3.put(next, Boolean.valueOf(jSONObject.optBoolean(next)));
                }
                in7 in7Var2 = f45908g;
                if (in7Var2 == null) {
                    in7Var2 = new in7();
                }
                ArrayList arrayList = new ArrayList(map3.size());
                for (Map.Entry entry : map3.entrySet()) {
                    arrayList.add(new hn7((String) entry.getKey(), ((Boolean) entry.getValue()).booleanValue()));
                }
                in7Var2.m32438b(str, arrayList);
                f45908g = in7Var2;
                return map3;
            }
        }
        return new HashMap();
    }

    /* renamed from: f */
    public final boolean m48905f(Long l) {
        return l != null && System.currentTimeMillis() - l.longValue() < 3600000;
    }

    /* renamed from: g */
    public final void m48906g() {
        m48898h(null);
    }

    /* renamed from: k */
    public final void m48907k() {
        Handler handler = new Handler(Looper.getMainLooper());
        while (true) {
            ConcurrentLinkedQueue concurrentLinkedQueue = f45905d;
            if (concurrentLinkedQueue.isEmpty()) {
                return;
            }
            final InterfaceC16913a interfaceC16913a = (InterfaceC16913a) concurrentLinkedQueue.poll();
            if (interfaceC16913a != null) {
                handler.post(new Runnable() { // from class: o.rt6
                    @Override // java.lang.Runnable
                    public final void run() {
                        st6.m48901l(interfaceC16913a);
                    }
                });
            }
        }
    }
}
