package p001o;

import android.util.Patterns;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.io.File;
import java.io.FileInputStream;
import java.util.Map;
import java.util.regex.Pattern;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes5.dex */
public final class it6 {

    /* renamed from: a */
    public static final it6 f29210a = new it6();

    /* renamed from: b */
    public static Map f29211b;

    /* renamed from: c */
    public static Map f29212c;

    /* renamed from: d */
    public static Map f29213d;

    /* renamed from: e */
    public static JSONObject f29214e;

    /* renamed from: f */
    public static boolean f29215f;

    /* renamed from: a */
    public static final float[] m32707a(JSONObject jSONObject, String str) {
        String lowerCase;
        JSONObject jSONObject2;
        String strOptString;
        JSONArray jSONArray;
        it6 it6Var;
        JSONObject jSONObjectM32711b;
        if (a94.m16694d(it6.class)) {
            return null;
        }
        try {
            sq8.m48649h(jSONObject, "viewHierarchy");
            sq8.m48649h(str, "appName");
            if (!f29215f) {
                return null;
            }
            float[] fArr = new float[30];
            for (int i = 0; i < 30; i++) {
                fArr[i] = 0.0f;
            }
            try {
                lowerCase = str.toLowerCase();
                sq8.m48648g(lowerCase, "this as java.lang.String).toLowerCase()");
                jSONObject2 = new JSONObject(jSONObject.optJSONObject("view").toString());
                strOptString = jSONObject.optString("screenname");
                jSONArray = new JSONArray();
                it6Var = f29210a;
                it6Var.m32716j(jSONObject2, jSONArray);
                it6Var.m32719m(fArr, it6Var.m32715i(jSONObject2));
                jSONObjectM32711b = it6Var.m32711b(jSONObject2);
            } catch (JSONException unused) {
            }
            if (jSONObjectM32711b == null) {
                return null;
            }
            sq8.m48648g(strOptString, "screenName");
            String string = jSONObject2.toString();
            sq8.m48648g(string, "viewTree.toString()");
            it6Var.m32719m(fArr, it6Var.m32714h(jSONObjectM32711b, jSONArray, strOptString, string, lowerCase));
            return fArr;
        } catch (Throwable th) {
            a94.m16692b(th, it6.class);
            return null;
        }
    }

    /* renamed from: c */
    public static final String m32708c(String str, String str2, String str3) {
        if (a94.m16694d(it6.class)) {
            return null;
        }
        try {
            sq8.m48649h(str, "buttonText");
            sq8.m48649h(str2, "activityName");
            sq8.m48649h(str3, "appName");
            String lowerCase = (str3 + " | " + str2 + ", " + str).toLowerCase();
            sq8.m48648g(lowerCase, "this as java.lang.String).toLowerCase()");
            return lowerCase;
        } catch (Throwable th) {
            a94.m16692b(th, it6.class);
            return null;
        }
    }

    /* renamed from: d */
    public static final void m32709d(File file) {
        if (a94.m16694d(it6.class)) {
            return;
        }
        try {
            try {
                f29214e = new JSONObject();
                FileInputStream fileInputStream = new FileInputStream(file);
                byte[] bArr = new byte[fileInputStream.available()];
                fileInputStream.read(bArr);
                fileInputStream.close();
                f29214e = new JSONObject(new String(bArr, sh2.f45422b));
                f29211b = isa.m32684k(vyh.m53620a("ENGLISH", "1"), vyh.m53620a("GERMAN", "2"), vyh.m53620a("SPANISH", "3"), vyh.m53620a("JAPANESE", "4"));
                f29212c = isa.m32684k(vyh.m53620a("VIEW_CONTENT", "0"), vyh.m53620a("SEARCH", "1"), vyh.m53620a("ADD_TO_CART", "2"), vyh.m53620a("ADD_TO_WISHLIST", "3"), vyh.m53620a("INITIATE_CHECKOUT", "4"), vyh.m53620a("ADD_PAYMENT_INFO", "5"), vyh.m53620a("PURCHASE", "6"), vyh.m53620a("LEAD", "7"), vyh.m53620a("COMPLETE_REGISTRATION", "8"));
                f29213d = isa.m32684k(vyh.m53620a("BUTTON_TEXT", "1"), vyh.m53620a("PAGE_TITLE", "2"), vyh.m53620a("RESOLVED_DOCUMENT_LINK", "3"), vyh.m53620a("BUTTON_ID", "4"));
                f29215f = true;
            } catch (Throwable th) {
                a94.m16692b(th, it6.class);
            }
        } catch (Exception unused) {
        }
    }

    /* renamed from: f */
    public static final boolean m32710f() {
        if (a94.m16694d(it6.class)) {
            return false;
        }
        try {
            return f29215f;
        } catch (Throwable th) {
            a94.m16692b(th, it6.class);
            return false;
        }
    }

    /* renamed from: b */
    public final JSONObject m32711b(JSONObject jSONObject) {
        if (a94.m16694d(this)) {
            return null;
        }
        try {
        } catch (JSONException unused) {
        } catch (Throwable th) {
            a94.m16692b(th, this);
        }
        if (jSONObject.optBoolean("is_interacted")) {
            return jSONObject;
        }
        JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("childviews");
        if (jSONArrayOptJSONArray == null) {
            return null;
        }
        int length = jSONArrayOptJSONArray.length();
        for (int i = 0; i < length; i++) {
            JSONObject jSONObject2 = jSONArrayOptJSONArray.getJSONObject(i);
            sq8.m48648g(jSONObject2, "children.getJSONObject(i)");
            JSONObject jSONObjectM32711b = m32711b(jSONObject2);
            if (jSONObjectM32711b != null) {
                return jSONObjectM32711b;
            }
        }
        return null;
    }

    /* renamed from: e */
    public final boolean m32712e(JSONObject jSONObject) {
        if (a94.m16694d(this)) {
            return false;
        }
        try {
            return ((jSONObject.optInt("classtypebitmask") & 1) << 5) > 0;
        } catch (Throwable th) {
            a94.m16692b(th, this);
            return false;
        }
    }

    /* renamed from: g */
    public final boolean m32713g(String[] strArr, String[] strArr2) {
        if (a94.m16694d(this)) {
            return false;
        }
        try {
            for (String str : strArr) {
                for (String str2 : strArr2) {
                    if (f9g.m26306P(str2, str, false, 2, null)) {
                        return true;
                    }
                }
            }
            return false;
        } catch (Throwable th) {
            a94.m16692b(th, this);
            return false;
        }
    }

    /* renamed from: h */
    public final float[] m32714h(JSONObject jSONObject, JSONArray jSONArray, String str, String str2, String str3) {
        if (a94.m16694d(this)) {
            return null;
        }
        try {
            float[] fArr = new float[30];
            for (int i = 0; i < 30; i++) {
                fArr[i] = 0.0f;
            }
            int length = jSONArray.length();
            fArr[3] = length > 1 ? length - 1.0f : 0.0f;
            try {
                int length2 = jSONArray.length();
                for (int i2 = 0; i2 < length2; i2++) {
                    JSONObject jSONObject2 = jSONArray.getJSONObject(i2);
                    sq8.m48648g(jSONObject2, "siblings.getJSONObject(i)");
                    if (m32712e(jSONObject2)) {
                        fArr[9] = fArr[9] + 1.0f;
                    }
                }
            } catch (JSONException unused) {
            }
            fArr[13] = -1.0f;
            fArr[14] = -1.0f;
            String str4 = str + '|' + str3;
            StringBuilder sb = new StringBuilder();
            StringBuilder sb2 = new StringBuilder();
            m32720n(jSONObject, sb2, sb);
            String string = sb.toString();
            sq8.m48648g(string, "hintSB.toString()");
            String string2 = sb2.toString();
            sq8.m48648g(string2, "textSB.toString()");
            fArr[15] = m32718l("ENGLISH", "COMPLETE_REGISTRATION", "BUTTON_TEXT", string2) ? 1.0f : 0.0f;
            fArr[16] = m32718l("ENGLISH", "COMPLETE_REGISTRATION", "PAGE_TITLE", str4) ? 1.0f : 0.0f;
            fArr[17] = m32718l("ENGLISH", "COMPLETE_REGISTRATION", "BUTTON_ID", string) ? 1.0f : 0.0f;
            fArr[18] = f9g.m26306P(str2, "password", false, 2, null) ? 1.0f : 0.0f;
            fArr[19] = m32717k("(?i)(confirm.*password)|(password.*(confirmation|confirm)|confirmation)", str2) ? 1.0f : 0.0f;
            fArr[20] = m32717k("(?i)(sign in)|login|signIn", str2) ? 1.0f : 0.0f;
            fArr[21] = m32717k("(?i)(sign.*(up|now)|registration|register|(create|apply).*(profile|account)|open.*account|account.*(open|creation|application)|enroll|join.*now)", str2) ? 1.0f : 0.0f;
            fArr[22] = m32718l("ENGLISH", "PURCHASE", "BUTTON_TEXT", string2) ? 1.0f : 0.0f;
            fArr[24] = m32718l("ENGLISH", "PURCHASE", "PAGE_TITLE", str4) ? 1.0f : 0.0f;
            fArr[25] = m32717k("(?i)add to(\\s|\\Z)|update(\\s|\\Z)|cart", string2) ? 1.0f : 0.0f;
            fArr[27] = m32717k("(?i)add to(\\s|\\Z)|update(\\s|\\Z)|cart|shop|buy", str4) ? 1.0f : 0.0f;
            fArr[28] = m32718l("ENGLISH", "LEAD", "BUTTON_TEXT", string2) ? 1.0f : 0.0f;
            fArr[29] = m32718l("ENGLISH", "LEAD", "PAGE_TITLE", str4) ? 1.0f : 0.0f;
            return fArr;
        } catch (Throwable th) {
            a94.m16692b(th, this);
            return null;
        }
    }

    /* renamed from: i */
    public final float[] m32715i(JSONObject jSONObject) {
        if (a94.m16694d(this)) {
            return null;
        }
        try {
            float[] fArr = new float[30];
            for (int i = 0; i < 30; i++) {
                fArr[i] = 0.0f;
            }
            String strOptString = jSONObject.optString("text");
            sq8.m48648g(strOptString, "node.optString(TEXT_KEY)");
            String lowerCase = strOptString.toLowerCase();
            sq8.m48648g(lowerCase, "this as java.lang.String).toLowerCase()");
            String strOptString2 = jSONObject.optString("hint");
            sq8.m48648g(strOptString2, "node.optString(HINT_KEY)");
            String lowerCase2 = strOptString2.toLowerCase();
            sq8.m48648g(lowerCase2, "this as java.lang.String).toLowerCase()");
            String strOptString3 = jSONObject.optString("classname");
            sq8.m48648g(strOptString3, "node.optString(CLASS_NAME_KEY)");
            String lowerCase3 = strOptString3.toLowerCase();
            sq8.m48648g(lowerCase3, "this as java.lang.String).toLowerCase()");
            int iOptInt = jSONObject.optInt("inputtype", -1);
            String[] strArr = {lowerCase, lowerCase2};
            if (m32713g(new String[]{"$", "amount", FirebaseAnalytics.Param.PRICE, "total"}, strArr)) {
                fArr[0] = fArr[0] + 1.0f;
            }
            if (m32713g(new String[]{"password", "pwd"}, strArr)) {
                fArr[1] = fArr[1] + 1.0f;
            }
            if (m32713g(new String[]{"tel", "phone"}, strArr)) {
                fArr[2] = fArr[2] + 1.0f;
            }
            if (m32713g(new String[]{FirebaseAnalytics.Event.SEARCH}, strArr)) {
                fArr[4] = fArr[4] + 1.0f;
            }
            if (iOptInt >= 0) {
                fArr[5] = fArr[5] + 1.0f;
            }
            if (iOptInt == 2 || iOptInt == 3) {
                fArr[6] = fArr[6] + 1.0f;
            }
            if (iOptInt == 32 || Patterns.EMAIL_ADDRESS.matcher(lowerCase).matches()) {
                fArr[7] = fArr[7] + 1.0f;
            }
            if (f9g.m26306P(lowerCase3, "checkbox", false, 2, null)) {
                fArr[8] = fArr[8] + 1.0f;
            }
            if (m32713g(new String[]{"complete", "confirm", "done", "submit"}, new String[]{lowerCase})) {
                fArr[10] = fArr[10] + 1.0f;
            }
            if (f9g.m26306P(lowerCase3, "radio", false, 2, null) && f9g.m26306P(lowerCase3, "button", false, 2, null)) {
                fArr[12] = fArr[12] + 1.0f;
            }
            try {
                JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("childviews");
                int length = jSONArrayOptJSONArray.length();
                for (int i2 = 0; i2 < length; i2++) {
                    JSONObject jSONObject2 = jSONArrayOptJSONArray.getJSONObject(i2);
                    sq8.m48648g(jSONObject2, "childViews.getJSONObject(i)");
                    m32719m(fArr, m32715i(jSONObject2));
                }
            } catch (JSONException unused) {
            }
            return fArr;
        } catch (Throwable th) {
            a94.m16692b(th, this);
            return null;
        }
    }

    /* renamed from: j */
    public final boolean m32716j(JSONObject jSONObject, JSONArray jSONArray) {
        boolean z;
        if (a94.m16694d(this)) {
            return false;
        }
        try {
            if (jSONObject.optBoolean("is_interacted")) {
                return true;
            }
            JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("childviews");
            int length = jSONArrayOptJSONArray.length();
            int i = 0;
            while (true) {
                if (i >= length) {
                    z = false;
                    break;
                }
                if (jSONArrayOptJSONArray.getJSONObject(i).optBoolean("is_interacted")) {
                    z = true;
                    break;
                }
                i++;
            }
            boolean z2 = z;
            JSONArray jSONArray2 = new JSONArray();
            if (z) {
                int length2 = jSONArrayOptJSONArray.length();
                for (int i2 = 0; i2 < length2; i2++) {
                    jSONArray.put(jSONArrayOptJSONArray.getJSONObject(i2));
                }
            } else {
                int length3 = jSONArrayOptJSONArray.length();
                for (int i3 = 0; i3 < length3; i3++) {
                    JSONObject jSONObject2 = jSONArrayOptJSONArray.getJSONObject(i3);
                    sq8.m48648g(jSONObject2, "child");
                    if (m32716j(jSONObject2, jSONArray)) {
                        jSONArray2.put(jSONObject2);
                        z2 = true;
                    }
                }
                jSONObject.put("childviews", jSONArray2);
            }
            return z2;
        } catch (JSONException unused) {
            return false;
        } catch (Throwable th) {
            a94.m16692b(th, this);
            return false;
        }
    }

    /* renamed from: k */
    public final boolean m32717k(String str, String str2) {
        if (a94.m16694d(this)) {
            return false;
        }
        try {
            return Pattern.compile(str).matcher(str2).find();
        } catch (Throwable th) {
            a94.m16692b(th, this);
            return false;
        }
    }

    /* renamed from: l */
    public final boolean m32718l(String str, String str2, String str3, String str4) {
        JSONObject jSONObjectOptJSONObject;
        JSONObject jSONObjectOptJSONObject2;
        if (a94.m16694d(this)) {
            return false;
        }
        try {
            JSONObject jSONObject = f29214e;
            String strOptString = null;
            Map map = null;
            strOptString = null;
            strOptString = null;
            strOptString = null;
            strOptString = null;
            if (jSONObject == null) {
                sq8.m48667z("rules");
                jSONObject = null;
            }
            JSONObject jSONObjectOptJSONObject3 = jSONObject.optJSONObject("rulesForLanguage");
            if (jSONObjectOptJSONObject3 != null) {
                Map map2 = f29211b;
                if (map2 == null) {
                    sq8.m48667z("languageInfo");
                    map2 = null;
                }
                JSONObject jSONObjectOptJSONObject4 = jSONObjectOptJSONObject3.optJSONObject((String) map2.get(str));
                if (jSONObjectOptJSONObject4 != null && (jSONObjectOptJSONObject = jSONObjectOptJSONObject4.optJSONObject("rulesForEvent")) != null) {
                    Map map3 = f29212c;
                    if (map3 == null) {
                        sq8.m48667z("eventInfo");
                        map3 = null;
                    }
                    JSONObject jSONObjectOptJSONObject5 = jSONObjectOptJSONObject.optJSONObject((String) map3.get(str2));
                    if (jSONObjectOptJSONObject5 != null && (jSONObjectOptJSONObject2 = jSONObjectOptJSONObject5.optJSONObject("positiveRules")) != null) {
                        Map map4 = f29213d;
                        if (map4 == null) {
                            sq8.m48667z("textTypeInfo");
                        } else {
                            map = map4;
                        }
                        strOptString = jSONObjectOptJSONObject2.optString((String) map.get(str3));
                    }
                }
            }
            if (strOptString == null) {
                return false;
            }
            return m32717k(strOptString, str4);
        } catch (Throwable th) {
            a94.m16692b(th, this);
            return false;
        }
    }

    /* renamed from: m */
    public final void m32719m(float[] fArr, float[] fArr2) {
        if (a94.m16694d(this)) {
            return;
        }
        try {
            int length = fArr.length;
            for (int i = 0; i < length; i++) {
                fArr[i] = fArr[i] + fArr2[i];
            }
        } catch (Throwable th) {
            a94.m16692b(th, this);
        }
    }

    /* renamed from: n */
    public final void m32720n(JSONObject jSONObject, StringBuilder sb, StringBuilder sb2) {
        if (a94.m16694d(this)) {
            return;
        }
        try {
            String strOptString = jSONObject.optString("text", "");
            sq8.m48648g(strOptString, "view.optString(TEXT_KEY, \"\")");
            String lowerCase = strOptString.toLowerCase();
            sq8.m48648g(lowerCase, "this as java.lang.String).toLowerCase()");
            String strOptString2 = jSONObject.optString("hint", "");
            sq8.m48648g(strOptString2, "view.optString(HINT_KEY, \"\")");
            String lowerCase2 = strOptString2.toLowerCase();
            sq8.m48648g(lowerCase2, "this as java.lang.String).toLowerCase()");
            boolean z = true;
            if (lowerCase.length() > 0) {
                sb.append(lowerCase);
                sb.append(" ");
            }
            if (lowerCase2.length() <= 0) {
                z = false;
            }
            if (z) {
                sb2.append(lowerCase2);
                sb2.append(" ");
            }
            JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("childviews");
            if (jSONArrayOptJSONArray == null) {
                return;
            }
            int length = jSONArrayOptJSONArray.length();
            for (int i = 0; i < length; i++) {
                try {
                    JSONObject jSONObject2 = jSONArrayOptJSONArray.getJSONObject(i);
                    sq8.m48648g(jSONObject2, "currentChildView");
                    m32720n(jSONObject2, sb, sb2);
                } catch (JSONException unused) {
                }
            }
        } catch (Throwable th) {
            a94.m16692b(th, this);
        }
    }
}
