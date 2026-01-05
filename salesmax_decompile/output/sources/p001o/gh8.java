package p001o;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.os.IBinder;
import com.facebook.C10773c;
import com.onesignal.session.internal.session.impl.SessionListener;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes5.dex */
public final class gh8 {

    /* renamed from: a */
    public static final gh8 f25160a = new gh8();

    /* renamed from: b */
    public static final HashMap f25161b = new HashMap();

    /* renamed from: c */
    public static final HashMap f25162c = new HashMap();

    /* renamed from: d */
    public static final String f25163d = C10773c.m13019l().getPackageName();

    /* renamed from: e */
    public static final SharedPreferences f25164e = C10773c.m13019l().getSharedPreferences("com.facebook.internal.SKU_DETAILS", 0);

    /* renamed from: f */
    public static final SharedPreferences f25165f = C10773c.m13019l().getSharedPreferences("com.facebook.internal.PURCHASE", 0);

    /* renamed from: a */
    public static final Object m28658a(Context context, IBinder iBinder) {
        if (a94.m16694d(gh8.class)) {
            return null;
        }
        try {
            sq8.m48649h(context, "context");
            return f25160a.m28671n(context, "com.android.vending.billing.IInAppBillingService$Stub", "asInterface", null, new Object[]{iBinder});
        } catch (Throwable th) {
            a94.m16692b(th, gh8.class);
            return null;
        }
    }

    /* renamed from: b */
    public static final void m28659b() {
        if (a94.m16694d(gh8.class)) {
            return;
        }
        try {
            long jCurrentTimeMillis = System.currentTimeMillis() / 1000;
            SharedPreferences sharedPreferences = f25164e;
            long j = sharedPreferences.getLong("LAST_CLEARED_TIME", 0L);
            if (j == 0) {
                sharedPreferences.edit().putLong("LAST_CLEARED_TIME", jCurrentTimeMillis).apply();
            } else if (jCurrentTimeMillis - j > 604800) {
                sharedPreferences.edit().clear().putLong("LAST_CLEARED_TIME", jCurrentTimeMillis).apply();
            }
        } catch (Throwable th) {
            a94.m16692b(th, gh8.class);
        }
    }

    /* renamed from: g */
    public static final ArrayList m28660g(Context context, Object obj) {
        gh8 gh8Var;
        Class clsM28665d;
        if (a94.m16694d(gh8.class)) {
            return null;
        }
        try {
            sq8.m48649h(context, "context");
            ArrayList arrayList = new ArrayList();
            return (obj == null || (clsM28665d = (gh8Var = f25160a).m28665d(context, "com.android.vending.billing.IInAppBillingService")) == null || gh8Var.m28666e(clsM28665d, "getPurchaseHistory") == null) ? arrayList : gh8Var.m28664c(gh8Var.m28667f(context, obj, "inapp"));
        } catch (Throwable th) {
            a94.m16692b(th, gh8.class);
            return null;
        }
    }

    /* renamed from: i */
    public static final ArrayList m28661i(Context context, Object obj) {
        if (a94.m16694d(gh8.class)) {
            return null;
        }
        try {
            sq8.m48649h(context, "context");
            gh8 gh8Var = f25160a;
            return gh8Var.m28664c(gh8Var.m28668h(context, obj, "inapp"));
        } catch (Throwable th) {
            a94.m16692b(th, gh8.class);
            return null;
        }
    }

    /* renamed from: j */
    public static final ArrayList m28662j(Context context, Object obj) {
        if (a94.m16694d(gh8.class)) {
            return null;
        }
        try {
            sq8.m48649h(context, "context");
            gh8 gh8Var = f25160a;
            return gh8Var.m28664c(gh8Var.m28668h(context, obj, "subs"));
        } catch (Throwable th) {
            a94.m16692b(th, gh8.class);
            return null;
        }
    }

    /* renamed from: k */
    public static final Map m28663k(Context context, ArrayList arrayList, Object obj, boolean z) {
        if (a94.m16694d(gh8.class)) {
            return null;
        }
        try {
            sq8.m48649h(context, "context");
            sq8.m48649h(arrayList, "skuList");
            Map mapM28673p = f25160a.m28673p(arrayList);
            ArrayList arrayList2 = new ArrayList();
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                String str = (String) it.next();
                if (!mapM28673p.containsKey(str)) {
                    arrayList2.add(str);
                }
            }
            mapM28673p.putAll(f25160a.m28669l(context, arrayList2, obj, z));
            return mapM28673p;
        } catch (Throwable th) {
            a94.m16692b(th, gh8.class);
            return null;
        }
    }

    /* renamed from: c */
    public final ArrayList m28664c(ArrayList arrayList) {
        if (a94.m16694d(this)) {
            return null;
        }
        try {
            ArrayList arrayList2 = new ArrayList();
            SharedPreferences.Editor editorEdit = f25165f.edit();
            long jCurrentTimeMillis = System.currentTimeMillis() / 1000;
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                String str = (String) it.next();
                try {
                    JSONObject jSONObject = new JSONObject(str);
                    String string = jSONObject.getString("productId");
                    long j = jSONObject.getLong("purchaseTime");
                    String string2 = jSONObject.getString("purchaseToken");
                    if (jCurrentTimeMillis - (j / 1000) <= SessionListener.SECONDS_IN_A_DAY && !sq8.m48644c(f25165f.getString(string, ""), string2)) {
                        editorEdit.putString(string, string2);
                        arrayList2.add(str);
                    }
                } catch (JSONException unused) {
                }
            }
            editorEdit.apply();
            return arrayList2;
        } catch (Throwable th) {
            a94.m16692b(th, this);
            return null;
        }
    }

    /* renamed from: d */
    public final Class m28665d(Context context, String str) {
        if (a94.m16694d(this)) {
            return null;
        }
        try {
            HashMap map = f25162c;
            Class cls = (Class) map.get(str);
            if (cls != null) {
                return cls;
            }
            Class clsM35713b = kh8.m35713b(context, str);
            if (clsM35713b != null) {
                map.put(str, clsM35713b);
            }
            return clsM35713b;
        } catch (Throwable th) {
            a94.m16692b(th, this);
            return null;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* renamed from: e */
    public final Method m28666e(Class cls, String str) {
        Class[] clsArr;
        if (a94.m16694d(this)) {
            return null;
        }
        try {
            HashMap map = f25161b;
            Method method = (Method) map.get(str);
            if (method != null) {
                return method;
            }
            switch (str.hashCode()) {
                case -1801122596:
                    if (!str.equals("getPurchases")) {
                        clsArr = null;
                        break;
                    } else {
                        Class cls2 = Integer.TYPE;
                        sq8.m48648g(cls2, "TYPE");
                        clsArr = new Class[]{cls2, String.class, String.class, String.class};
                        break;
                    }
                case -1450694211:
                    if (!str.equals("isBillingSupported")) {
                        clsArr = null;
                        break;
                    } else {
                        Class cls3 = Integer.TYPE;
                        sq8.m48648g(cls3, "TYPE");
                        clsArr = new Class[]{cls3, String.class, String.class};
                        break;
                    }
                case -1123215065:
                    if (!str.equals("asInterface")) {
                        clsArr = null;
                        break;
                    } else {
                        clsArr = new Class[]{IBinder.class};
                        break;
                    }
                case -594356707:
                    if (!str.equals("getPurchaseHistory")) {
                        clsArr = null;
                        break;
                    } else {
                        Class cls4 = Integer.TYPE;
                        sq8.m48648g(cls4, "TYPE");
                        clsArr = new Class[]{cls4, String.class, String.class, String.class, Bundle.class};
                        break;
                    }
                case -573310373:
                    if (!str.equals("getSkuDetails")) {
                        clsArr = null;
                        break;
                    } else {
                        Class cls5 = Integer.TYPE;
                        sq8.m48648g(cls5, "TYPE");
                        clsArr = new Class[]{cls5, String.class, String.class, Bundle.class};
                        break;
                    }
                default:
                    clsArr = null;
                    break;
            }
            Method methodM35714c = clsArr == null ? kh8.m35714c(cls, str, null) : kh8.m35714c(cls, str, (Class[]) Arrays.copyOf(clsArr, clsArr.length));
            if (methodM35714c != null) {
                map.put(str, methodM35714c);
            }
            return methodM35714c;
        } catch (Throwable th) {
            a94.m16692b(th, this);
            return null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0091  */
    /* renamed from: f */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final ArrayList m28667f(Context context, Object obj, String str) {
        ArrayList<String> stringArrayList;
        if (a94.m16694d(this)) {
            return null;
        }
        try {
            ArrayList arrayList = new ArrayList();
            if (m28672o(context, obj, str)) {
                String string = null;
                int i = 0;
                boolean z = false;
                do {
                    Object objM28671n = m28671n(context, "com.android.vending.billing.IInAppBillingService", "getPurchaseHistory", obj, new Object[]{6, f25163d, str, string, new Bundle()});
                    if (objM28671n != null) {
                        long jCurrentTimeMillis = System.currentTimeMillis() / 1000;
                        Bundle bundle = (Bundle) objM28671n;
                        if (bundle.getInt("RESPONSE_CODE") != 0 || (stringArrayList = bundle.getStringArrayList("INAPP_PURCHASE_DATA_LIST")) == null) {
                            string = null;
                        } else {
                            Iterator<String> it = stringArrayList.iterator();
                            while (true) {
                                if (!it.hasNext()) {
                                    break;
                                }
                                String next = it.next();
                                if (jCurrentTimeMillis - (new JSONObject(next).getLong("purchaseTime") / 1000) > 1200) {
                                    z = true;
                                    break;
                                }
                                arrayList.add(next);
                                i++;
                            }
                            string = bundle.getString("INAPP_CONTINUATION_TOKEN");
                        }
                        if (i >= 30 || string == null) {
                            break;
                        }
                    }
                } while (!z);
            }
            return arrayList;
        } catch (Throwable th) {
            a94.m16692b(th, this);
            return null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x005b  */
    /* renamed from: h */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final ArrayList m28668h(Context context, Object obj, String str) {
        if (a94.m16694d(this)) {
            return null;
        }
        try {
            ArrayList arrayList = new ArrayList();
            if (obj != null && m28672o(context, obj, str)) {
                String string = null;
                int size = 0;
                do {
                    Object objM28671n = m28671n(context, "com.android.vending.billing.IInAppBillingService", "getPurchases", obj, new Object[]{3, f25163d, str, string});
                    if (objM28671n != null) {
                        Bundle bundle = (Bundle) objM28671n;
                        if (bundle.getInt("RESPONSE_CODE") == 0) {
                            ArrayList<String> stringArrayList = bundle.getStringArrayList("INAPP_PURCHASE_DATA_LIST");
                            if (stringArrayList == null) {
                                break;
                            }
                            size += stringArrayList.size();
                            arrayList.addAll(stringArrayList);
                            string = bundle.getString("INAPP_CONTINUATION_TOKEN");
                        } else {
                            string = null;
                        }
                        if (size >= 30) {
                            break;
                        }
                    }
                } while (string != null);
            }
            return arrayList;
        } catch (Throwable th) {
            a94.m16692b(th, this);
            return null;
        }
    }

    /* renamed from: l */
    public final Map m28669l(Context context, ArrayList arrayList, Object obj, boolean z) {
        if (a94.m16694d(this)) {
            return null;
        }
        try {
            Map linkedHashMap = new LinkedHashMap();
            if (obj != null && !arrayList.isEmpty()) {
                Bundle bundle = new Bundle();
                bundle.putStringArrayList("ITEM_ID_LIST", arrayList);
                Object[] objArr = new Object[4];
                objArr[0] = 3;
                objArr[1] = f25163d;
                objArr[2] = z ? "subs" : "inapp";
                objArr[3] = bundle;
                Object objM28671n = m28671n(context, "com.android.vending.billing.IInAppBillingService", "getSkuDetails", obj, objArr);
                if (objM28671n != null) {
                    Bundle bundle2 = (Bundle) objM28671n;
                    if (bundle2.getInt("RESPONSE_CODE") == 0) {
                        ArrayList<String> stringArrayList = bundle2.getStringArrayList("DETAILS_LIST");
                        if (stringArrayList != null && arrayList.size() == stringArrayList.size()) {
                            int size = arrayList.size();
                            for (int i = 0; i < size; i++) {
                                Object obj2 = arrayList.get(i);
                                sq8.m48648g(obj2, "skuList[i]");
                                String str = stringArrayList.get(i);
                                sq8.m48648g(str, "skuDetailsList[i]");
                                linkedHashMap.put(obj2, str);
                            }
                        }
                        m28674q(linkedHashMap);
                    }
                }
            }
            return linkedHashMap;
        } catch (Throwable th) {
            a94.m16692b(th, this);
            return null;
        }
    }

    /* renamed from: m */
    public final boolean m28670m(String str) {
        if (a94.m16694d(this)) {
            return false;
        }
        try {
            sq8.m48649h(str, "skuDetail");
            try {
                String strOptString = new JSONObject(str).optString("freeTrialPeriod");
                if (strOptString != null) {
                    return strOptString.length() > 0;
                }
                return false;
            } catch (JSONException unused) {
                return false;
            }
        } catch (Throwable th) {
            a94.m16692b(th, this);
            return false;
        }
    }

    /* renamed from: n */
    public final Object m28671n(Context context, String str, String str2, Object obj, Object[] objArr) {
        Method methodM28666e;
        if (a94.m16694d(this)) {
            return null;
        }
        try {
            Class clsM28665d = m28665d(context, str);
            if (clsM28665d == null || (methodM28666e = m28666e(clsM28665d, str2)) == null) {
                return null;
            }
            return kh8.m35716e(clsM28665d, methodM28666e, obj, Arrays.copyOf(objArr, objArr.length));
        } catch (Throwable th) {
            a94.m16692b(th, this);
            return null;
        }
    }

    /* renamed from: o */
    public final boolean m28672o(Context context, Object obj, String str) {
        if (a94.m16694d(this) || obj == null) {
            return false;
        }
        try {
            Object objM28671n = m28671n(context, "com.android.vending.billing.IInAppBillingService", "isBillingSupported", obj, new Object[]{3, f25163d, str});
            if (objM28671n != null) {
                return ((Integer) objM28671n).intValue() == 0;
            }
            return false;
        } catch (Throwable th) {
            a94.m16692b(th, this);
            return false;
        }
    }

    /* renamed from: p */
    public final Map m28673p(ArrayList arrayList) {
        if (a94.m16694d(this)) {
            return null;
        }
        try {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            long jCurrentTimeMillis = System.currentTimeMillis() / 1000;
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                String str = (String) it.next();
                String string = f25164e.getString(str, null);
                if (string != null) {
                    List listD0 = f9g.D0(string, new String[]{";"}, false, 2, 2, null);
                    if (jCurrentTimeMillis - Long.parseLong((String) listD0.get(0)) < 43200) {
                        sq8.m48648g(str, "sku");
                        linkedHashMap.put(str, listD0.get(1));
                    }
                }
            }
            return linkedHashMap;
        } catch (Throwable th) {
            a94.m16692b(th, this);
            return null;
        }
    }

    /* renamed from: q */
    public final void m28674q(Map map) {
        if (a94.m16694d(this)) {
            return;
        }
        try {
            long jCurrentTimeMillis = System.currentTimeMillis() / 1000;
            SharedPreferences.Editor editorEdit = f25164e.edit();
            for (Map.Entry entry : map.entrySet()) {
                editorEdit.putString((String) entry.getKey(), jCurrentTimeMillis + ';' + ((String) entry.getValue()));
            }
            editorEdit.apply();
        } catch (Throwable th) {
            a94.m16692b(th, this);
        }
    }
}
