package p001o;

import android.content.Context;
import android.graphics.Color;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes5.dex */
public final class li3 {

    /* renamed from: a */
    public static final li3 f33873a = new li3();

    /* renamed from: b */
    public static Map f33874b;

    /* renamed from: a */
    public static final String m37260a(int i) {
        h8g h8gVar = h8g.f26398a;
        String str = String.format("#%06x", Arrays.copyOf(new Object[]{Integer.valueOf(i & 16777215)}, 1));
        sq8.m48648g(str, "java.lang.String.format(format, *args)");
        return str;
    }

    /* renamed from: d */
    public static final boolean m37261d(int i) {
        return ni3.m40614f(i) <= 0.4d;
    }

    /* renamed from: e */
    public static final boolean m37262e(String str) {
        sq8.m48649h(str, "color");
        return m37261d(m37263f(str));
    }

    /* renamed from: f */
    public static final int m37263f(String str) {
        sq8.m48649h(str, "color");
        if (f9g.d0(str)) {
            return 0;
        }
        return Color.parseColor(str);
    }

    /* renamed from: b */
    public final HashMap m37264b(Context context) throws JSONException {
        JSONObject jSONObject = new JSONObject(tp0.f47515a.m50277a(context, "material-colors.json"));
        HashMap map = new HashMap();
        Iterator<String> itKeys = jSONObject.keys();
        sq8.m48648g(itKeys, "colorMain.keys()");
        while (itKeys.hasNext()) {
            JSONObject jSONObject2 = jSONObject.getJSONObject(itKeys.next());
            Iterator<String> itKeys2 = jSONObject2.keys();
            sq8.m48648g(itKeys2, "jsonObject.keys()");
            while (itKeys2.hasNext()) {
                String next = itKeys2.next();
                String string = jSONObject2.getString(next);
                List arrayList = (List) map.get(next);
                if (arrayList == null) {
                    arrayList = new ArrayList();
                    sq8.m48648g(next, "colorCode");
                    map.put(next, arrayList);
                }
                sq8.m48648g(string, "colorHex");
                arrayList.add(string);
            }
        }
        return map;
    }

    /* renamed from: c */
    public final List m37265c(Context context, String str) {
        sq8.m48649h(context, "context");
        sq8.m48649h(str, "brightness");
        if (f33874b == null) {
            f33874b = m37264b(context);
        }
        Map map = f33874b;
        if (map == null) {
            sq8.m48667z("mColorMap");
            throw null;
        }
        List list = (List) map.get(str);
        if (list != null) {
            return list;
        }
        List listEmptyList = Collections.emptyList();
        sq8.m48648g(listEmptyList, "emptyList()");
        return listEmptyList;
    }
}
