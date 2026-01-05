package p001o;

import android.os.Build;
import android.os.Bundle;
import com.facebook.C10773c;
import com.onesignal.session.internal.outcomes.impl.OutcomeConstants;
import com.onesignal.session.internal.outcomes.impl.OutcomeEventsTable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Locale;
import org.json.JSONArray;
import org.json.JSONObject;
import org.objectweb.asm.Opcodes;

/* loaded from: classes5.dex */
public final class cna {

    /* renamed from: b */
    public static boolean f18384b;

    /* renamed from: c */
    public static JSONArray f18385c;

    /* renamed from: a */
    public static final cna f18383a = new cna();

    /* renamed from: d */
    public static String[] f18386d = {"event", "_locale", "_appVersion", "_deviceOS", "_platform", "_deviceModel", "_nativeAppID", "_nativeAppShortVersion", "_timezone", "_carrier", "_deviceOSTypeName", "_deviceOSVersion", "_remainingDiskGB"};

    /* renamed from: a */
    public static final void m21447a() {
        if (a94.m16694d(cna.class)) {
            return;
        }
        try {
            f18383a.m21456g();
            if (f18385c != null) {
                f18384b = true;
            }
        } catch (Throwable th) {
            a94.m16692b(th, cna.class);
        }
    }

    /* renamed from: b */
    public static final void m21448b(Bundle bundle, String str) {
        if (a94.m16694d(cna.class)) {
            return;
        }
        try {
            sq8.m48649h(bundle, OutcomeEventsTable.COLUMN_NAME_PARAMS);
            sq8.m48649h(str, "event");
            bundle.putString("event", str);
            StringBuilder sb = new StringBuilder();
            cri criVar = cri.f18557a;
            Locale localeM21680J = criVar.m21680J();
            String language = localeM21680J != null ? localeM21680J.getLanguage() : null;
            String str2 = "";
            if (language == null) {
                language = "";
            }
            sb.append(language);
            sb.append('_');
            Locale localeM21680J2 = criVar.m21680J();
            String country = localeM21680J2 != null ? localeM21680J2.getCountry() : null;
            if (country == null) {
                country = "";
            }
            sb.append(country);
            bundle.putString("_locale", sb.toString());
            String strM21682Q = criVar.m21682Q();
            if (strM21682Q == null) {
                strM21682Q = "";
            }
            bundle.putString("_appVersion", strM21682Q);
            bundle.putString("_deviceOS", "ANDROID");
            bundle.putString("_platform", "mobile");
            String str3 = Build.MODEL;
            if (str3 == null) {
                str3 = "";
            }
            bundle.putString("_deviceModel", str3);
            bundle.putString("_nativeAppID", C10773c.m13020m());
            String strM21682Q2 = criVar.m21682Q();
            if (strM21682Q2 != null) {
                str2 = strM21682Q2;
            }
            bundle.putString("_nativeAppShortVersion", str2);
            bundle.putString("_timezone", criVar.m21678E());
            bundle.putString("_carrier", criVar.m21692z());
            bundle.putString("_deviceOSTypeName", "ANDROID");
            bundle.putString("_deviceOSVersion", Build.VERSION.RELEASE);
            bundle.putLong("_remainingDiskGB", criVar.m21691x());
        } catch (Throwable th) {
            a94.m16692b(th, cna.class);
        }
    }

    /* renamed from: c */
    public static final String m21449c(JSONObject jSONObject) {
        if (a94.m16694d(cna.class)) {
            return null;
        }
        try {
            sq8.m48649h(jSONObject, "logic");
            Iterator<String> itKeys = jSONObject.keys();
            if (itKeys.hasNext()) {
                return itKeys.next();
            }
            return null;
        } catch (Throwable th) {
            a94.m16692b(th, cna.class);
            return null;
        }
    }

    /* renamed from: d */
    public static final String m21450d(Bundle bundle) {
        String strOptString;
        if (a94.m16694d(cna.class)) {
            return null;
        }
        try {
            JSONArray jSONArray = f18385c;
            if (jSONArray == null) {
                return "[]";
            }
            if (jSONArray != null && jSONArray.length() == 0) {
                return "[]";
            }
            JSONArray jSONArray2 = f18385c;
            sq8.m48647f(jSONArray2, "null cannot be cast to non-null type org.json.JSONArray");
            ArrayList arrayList = new ArrayList();
            int length = jSONArray2.length();
            for (int i = 0; i < length; i++) {
                String strOptString2 = jSONArray2.optString(i);
                if (strOptString2 != null) {
                    JSONObject jSONObject = new JSONObject(strOptString2);
                    long jOptLong = jSONObject.optLong(OutcomeConstants.OUTCOME_ID);
                    if (jOptLong != 0 && (strOptString = jSONObject.optString("rule")) != null && m21452f(strOptString, bundle)) {
                        arrayList.add(Long.valueOf(jOptLong));
                    }
                }
            }
            String string = new JSONArray((Collection) arrayList).toString();
            sq8.m48648g(string, "JSONArray(res).toString()");
            return string;
        } catch (Throwable th) {
            a94.m16692b(th, cna.class);
            return null;
        }
    }

    /* renamed from: e */
    public static final ArrayList m21451e(JSONArray jSONArray) {
        if (a94.m16694d(cna.class) || jSONArray == null) {
            return null;
        }
        try {
            ArrayList arrayList = new ArrayList();
            int length = jSONArray.length();
            for (int i = 0; i < length; i++) {
                arrayList.add(jSONArray.get(i).toString());
            }
            return arrayList;
        } catch (Throwable th) {
            a94.m16692b(th, cna.class);
            return null;
        }
    }

    /* renamed from: f */
    public static final boolean m21452f(String str, Bundle bundle) {
        if (!a94.m16694d(cna.class) && str != null && bundle != null) {
            try {
                JSONObject jSONObject = new JSONObject(str);
                String strM21449c = m21449c(jSONObject);
                if (strM21449c == null) {
                    return false;
                }
                Object obj = jSONObject.get(strM21449c);
                int iHashCode = strM21449c.hashCode();
                if (iHashCode != 3555) {
                    if (iHashCode != 96727) {
                        if (iHashCode == 109267 && strM21449c.equals("not")) {
                            return !m21452f(obj.toString(), bundle);
                        }
                    } else if (strM21449c.equals("and")) {
                        JSONArray jSONArray = (JSONArray) obj;
                        if (jSONArray == null) {
                            return false;
                        }
                        int length = jSONArray.length();
                        for (int i = 0; i < length; i++) {
                            if (!m21452f(jSONArray.get(i).toString(), bundle)) {
                                return false;
                            }
                        }
                        return true;
                    }
                } else if (strM21449c.equals("or")) {
                    JSONArray jSONArray2 = (JSONArray) obj;
                    if (jSONArray2 == null) {
                        return false;
                    }
                    int length2 = jSONArray2.length();
                    for (int i2 = 0; i2 < length2; i2++) {
                        if (m21452f(jSONArray2.get(i2).toString(), bundle)) {
                            return true;
                        }
                    }
                    return false;
                }
                JSONObject jSONObject2 = (JSONObject) obj;
                if (jSONObject2 == null) {
                    return false;
                }
                return m21455j(strM21449c, jSONObject2, bundle);
            } catch (Throwable th) {
                a94.m16692b(th, cna.class);
            }
        }
        return false;
    }

    /* renamed from: h */
    public static final void m21453h(Bundle bundle, String str) {
        if (a94.m16694d(cna.class)) {
            return;
        }
        try {
            sq8.m48649h(str, "event");
            if (!f18384b || bundle == null) {
                return;
            }
            try {
                m21448b(bundle, str);
                bundle.putString("_audiencePropertyIds", m21450d(bundle));
                bundle.putString("cs_maca", "1");
                m21454i(bundle);
            } catch (Exception unused) {
            }
        } catch (Throwable th) {
            a94.m16692b(th, cna.class);
        }
    }

    /* renamed from: i */
    public static final void m21454i(Bundle bundle) {
        if (a94.m16694d(cna.class)) {
            return;
        }
        try {
            sq8.m48649h(bundle, OutcomeEventsTable.COLUMN_NAME_PARAMS);
            for (String str : f18386d) {
                bundle.remove(str);
            }
        } catch (Throwable th) {
            a94.m16692b(th, cna.class);
        }
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:107:0x01d7  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0206  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0214 A[Catch: all -> 0x0347, TryCatch #0 {all -> 0x0347, blocks: (B:5:0x000a, B:8:0x001b, B:11:0x0036, B:17:0x0047, B:24:0x0062, B:25:0x0067, B:27:0x006c, B:30:0x0076, B:31:0x0090, B:34:0x009a, B:37:0x00a6, B:123:0x0214, B:126:0x021b, B:127:0x021f, B:129:0x0225, B:40:0x00b0, B:43:0x00ba, B:44:0x00d4, B:137:0x0255, B:140:0x025d, B:141:0x0261, B:143:0x0267, B:47:0x00de, B:50:0x00e8, B:51:0x0102, B:99:0x01b0, B:54:0x010c, B:93:0x0195, B:57:0x0116, B:84:0x0170, B:60:0x0120, B:63:0x012a, B:115:0x01f6, B:66:0x0134, B:69:0x013e, B:178:0x0318, B:72:0x0148, B:105:0x01c7, B:75:0x0152, B:78:0x015c, B:111:0x01e2, B:81:0x0166, B:87:0x0181, B:90:0x018b, B:96:0x01a6, B:102:0x01bd, B:108:0x01d8, B:112:0x01ec, B:118:0x0207, B:132:0x0248, B:146:0x0289, B:149:0x0293, B:152:0x02af, B:155:0x02b9, B:156:0x02c3, B:172:0x0303, B:159:0x02cd, B:162:0x02d7, B:163:0x02e5, B:166:0x02ee, B:167:0x02f7, B:173:0x030c, B:179:0x0321, B:182:0x032a, B:20:0x0058), top: B:189:0x000a }] */
    /* JADX WARN: Removed duplicated region for block: B:143:0x0267 A[Catch: all -> 0x0347, TryCatch #0 {all -> 0x0347, blocks: (B:5:0x000a, B:8:0x001b, B:11:0x0036, B:17:0x0047, B:24:0x0062, B:25:0x0067, B:27:0x006c, B:30:0x0076, B:31:0x0090, B:34:0x009a, B:37:0x00a6, B:123:0x0214, B:126:0x021b, B:127:0x021f, B:129:0x0225, B:40:0x00b0, B:43:0x00ba, B:44:0x00d4, B:137:0x0255, B:140:0x025d, B:141:0x0261, B:143:0x0267, B:47:0x00de, B:50:0x00e8, B:51:0x0102, B:99:0x01b0, B:54:0x010c, B:93:0x0195, B:57:0x0116, B:84:0x0170, B:60:0x0120, B:63:0x012a, B:115:0x01f6, B:66:0x0134, B:69:0x013e, B:178:0x0318, B:72:0x0148, B:105:0x01c7, B:75:0x0152, B:78:0x015c, B:111:0x01e2, B:81:0x0166, B:87:0x0181, B:90:0x018b, B:96:0x01a6, B:102:0x01bd, B:108:0x01d8, B:112:0x01ec, B:118:0x0207, B:132:0x0248, B:146:0x0289, B:149:0x0293, B:152:0x02af, B:155:0x02b9, B:156:0x02c3, B:172:0x0303, B:159:0x02cd, B:162:0x02d7, B:163:0x02e5, B:166:0x02ee, B:167:0x02f7, B:173:0x030c, B:179:0x0321, B:182:0x032a, B:20:0x0058), top: B:189:0x000a }] */
    /* JADX WARN: Removed duplicated region for block: B:172:0x0303 A[Catch: all -> 0x0347, TryCatch #0 {all -> 0x0347, blocks: (B:5:0x000a, B:8:0x001b, B:11:0x0036, B:17:0x0047, B:24:0x0062, B:25:0x0067, B:27:0x006c, B:30:0x0076, B:31:0x0090, B:34:0x009a, B:37:0x00a6, B:123:0x0214, B:126:0x021b, B:127:0x021f, B:129:0x0225, B:40:0x00b0, B:43:0x00ba, B:44:0x00d4, B:137:0x0255, B:140:0x025d, B:141:0x0261, B:143:0x0267, B:47:0x00de, B:50:0x00e8, B:51:0x0102, B:99:0x01b0, B:54:0x010c, B:93:0x0195, B:57:0x0116, B:84:0x0170, B:60:0x0120, B:63:0x012a, B:115:0x01f6, B:66:0x0134, B:69:0x013e, B:178:0x0318, B:72:0x0148, B:105:0x01c7, B:75:0x0152, B:78:0x015c, B:111:0x01e2, B:81:0x0166, B:87:0x0181, B:90:0x018b, B:96:0x01a6, B:102:0x01bd, B:108:0x01d8, B:112:0x01ec, B:118:0x0207, B:132:0x0248, B:146:0x0289, B:149:0x0293, B:152:0x02af, B:155:0x02b9, B:156:0x02c3, B:172:0x0303, B:159:0x02cd, B:162:0x02d7, B:163:0x02e5, B:166:0x02ee, B:167:0x02f7, B:173:0x030c, B:179:0x0321, B:182:0x032a, B:20:0x0058), top: B:189:0x000a }] */
    /* JADX WARN: Removed duplicated region for block: B:178:0x0318 A[Catch: all -> 0x0347, TryCatch #0 {all -> 0x0347, blocks: (B:5:0x000a, B:8:0x001b, B:11:0x0036, B:17:0x0047, B:24:0x0062, B:25:0x0067, B:27:0x006c, B:30:0x0076, B:31:0x0090, B:34:0x009a, B:37:0x00a6, B:123:0x0214, B:126:0x021b, B:127:0x021f, B:129:0x0225, B:40:0x00b0, B:43:0x00ba, B:44:0x00d4, B:137:0x0255, B:140:0x025d, B:141:0x0261, B:143:0x0267, B:47:0x00de, B:50:0x00e8, B:51:0x0102, B:99:0x01b0, B:54:0x010c, B:93:0x0195, B:57:0x0116, B:84:0x0170, B:60:0x0120, B:63:0x012a, B:115:0x01f6, B:66:0x0134, B:69:0x013e, B:178:0x0318, B:72:0x0148, B:105:0x01c7, B:75:0x0152, B:78:0x015c, B:111:0x01e2, B:81:0x0166, B:87:0x0181, B:90:0x018b, B:96:0x01a6, B:102:0x01bd, B:108:0x01d8, B:112:0x01ec, B:118:0x0207, B:132:0x0248, B:146:0x0289, B:149:0x0293, B:152:0x02af, B:155:0x02b9, B:156:0x02c3, B:172:0x0303, B:159:0x02cd, B:162:0x02d7, B:163:0x02e5, B:166:0x02ee, B:167:0x02f7, B:173:0x030c, B:179:0x0321, B:182:0x032a, B:20:0x0058), top: B:189:0x000a }] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0180  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x01a5  */
    /* renamed from: j */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final boolean m21455j(String str, JSONObject jSONObject, Bundle bundle) {
        Object obj;
        if (a94.m16694d(cna.class)) {
            return false;
        }
        try {
            sq8.m48649h(str, "variable");
            sq8.m48649h(jSONObject, "values");
            String strM21449c = m21449c(jSONObject);
            if (strM21449c == null) {
                return false;
            }
            String string = jSONObject.get(strM21449c).toString();
            ArrayList<String> arrayListM21451e = m21451e(jSONObject.optJSONArray(strM21449c));
            if (sq8.m48644c(strM21449c, "exists")) {
                return bundle != null && bundle.containsKey(str) == Boolean.parseBoolean(string);
            }
            if (bundle != null) {
                String lowerCase = str.toLowerCase(Locale.ROOT);
                sq8.m48648g(lowerCase, "this as java.lang.String).toLowerCase(Locale.ROOT)");
                obj = bundle.get(lowerCase);
                if (obj == null) {
                    obj = bundle != null ? bundle.get(str) : null;
                    if (obj == null) {
                        return false;
                    }
                }
            }
            switch (strM21449c.hashCode()) {
                case -1729128927:
                    if (strM21449c.equals("i_not_contains")) {
                        String string2 = obj.toString();
                        Locale locale = Locale.ROOT;
                        String lowerCase2 = string2.toLowerCase(locale);
                        sq8.m48648g(lowerCase2, "this as java.lang.String).toLowerCase(Locale.ROOT)");
                        String lowerCase3 = string.toLowerCase(locale);
                        sq8.m48648g(lowerCase3, "this as java.lang.String).toLowerCase(Locale.ROOT)");
                        if (f9g.m26306P(lowerCase2, lowerCase3, false, 2, null)) {
                        }
                        break;
                    } else {
                        break;
                    }
                case -1179774633:
                    if (!strM21449c.equals("is_any")) {
                        break;
                    }
                    if (arrayListM21451e == null) {
                        break;
                    }
                    break;
                case -1039699439:
                    if (!strM21449c.equals("not_in")) {
                        break;
                    }
                    if (arrayListM21451e == null) {
                        break;
                    }
                    break;
                case -969266188:
                    if (strM21449c.equals("starts_with")) {
                        break;
                    } else {
                        break;
                    }
                case -966353971:
                    if (strM21449c.equals("regex_match")) {
                        break;
                    } else {
                        break;
                    }
                case -665609109:
                    if (!strM21449c.equals("is_not_any")) {
                        break;
                    }
                    if (arrayListM21451e == null) {
                    }
                    break;
                case -567445985:
                    if (strM21449c.equals("contains")) {
                        break;
                    } else {
                        break;
                    }
                case -327990090:
                    if (strM21449c.equals("i_str_neq")) {
                        String string3 = obj.toString();
                        Locale locale2 = Locale.ROOT;
                        String lowerCase4 = string3.toLowerCase(locale2);
                        sq8.m48648g(lowerCase4, "this as java.lang.String).toLowerCase(Locale.ROOT)");
                        String lowerCase5 = string.toLowerCase(locale2);
                        sq8.m48648g(lowerCase5, "this as java.lang.String).toLowerCase(Locale.ROOT)");
                        if (!sq8.m48644c(lowerCase4, lowerCase5)) {
                            break;
                        }
                    } else {
                        break;
                    }
                    break;
                case -159812115:
                    if (!strM21449c.equals("i_is_any")) {
                        break;
                    }
                    if (arrayListM21451e != null && !arrayListM21451e.isEmpty()) {
                        for (String str2 : arrayListM21451e) {
                            Locale locale3 = Locale.ROOT;
                            String lowerCase6 = str2.toLowerCase(locale3);
                            sq8.m48648g(lowerCase6, "this as java.lang.String).toLowerCase(Locale.ROOT)");
                            String lowerCase7 = obj.toString().toLowerCase(locale3);
                            sq8.m48648g(lowerCase7, "this as java.lang.String).toLowerCase(Locale.ROOT)");
                            if (sq8.m48644c(lowerCase6, lowerCase7)) {
                                break;
                            }
                        }
                        break;
                    }
                    break;
                case -92753547:
                    if (!strM21449c.equals("i_str_not_in")) {
                        break;
                    }
                    if (arrayListM21451e == null) {
                        if (!arrayListM21451e.isEmpty()) {
                            for (String str3 : arrayListM21451e) {
                                Locale locale4 = Locale.ROOT;
                                sq8.m48648g(str3.toLowerCase(locale4), "this as java.lang.String).toLowerCase(Locale.ROOT)");
                                sq8.m48648g(obj.toString().toLowerCase(locale4), "this as java.lang.String).toLowerCase(Locale.ROOT)");
                                if (!(!sq8.m48644c(r9, r10))) {
                                    break;
                                }
                            }
                        }
                        break;
                    }
                    break;
                case Opcodes.V16 /* 60 */:
                    if (!strM21449c.equals("<")) {
                        break;
                    }
                    if (Double.parseDouble(obj.toString()) >= Double.parseDouble(string)) {
                        break;
                    }
                    break;
                case 61:
                    if (!strM21449c.equals("=")) {
                        break;
                    }
                    break;
                case 62:
                    if (!strM21449c.equals(">")) {
                        break;
                    }
                    if (Double.parseDouble(obj.toString()) <= Double.parseDouble(string)) {
                        break;
                    }
                    break;
                case 1084:
                    if (!strM21449c.equals("!=")) {
                        break;
                    }
                    if (sq8.m48644c(obj.toString(), string)) {
                    }
                    break;
                case 1921:
                    if (!strM21449c.equals("<=")) {
                        break;
                    }
                    if (Double.parseDouble(obj.toString()) <= Double.parseDouble(string)) {
                        break;
                    }
                    break;
                case 1952:
                    if (!strM21449c.equals("==")) {
                        break;
                    }
                    break;
                case 1983:
                    if (!strM21449c.equals(">=")) {
                        break;
                    }
                    if (Double.parseDouble(obj.toString()) >= Double.parseDouble(string)) {
                        break;
                    }
                    break;
                case 3244:
                    if (!strM21449c.equals("eq")) {
                        break;
                    }
                    break;
                case 3294:
                    if (!strM21449c.equals("ge")) {
                        break;
                    }
                    if (Double.parseDouble(obj.toString()) >= Double.parseDouble(string)) {
                    }
                    break;
                case 3309:
                    if (!strM21449c.equals("gt")) {
                        break;
                    }
                    if (Double.parseDouble(obj.toString()) <= Double.parseDouble(string)) {
                    }
                    break;
                case 3365:
                    if (!strM21449c.equals("in")) {
                        break;
                    }
                    if (arrayListM21451e == null) {
                    }
                    break;
                case 3449:
                    if (!strM21449c.equals("le")) {
                        break;
                    }
                    if (Double.parseDouble(obj.toString()) <= Double.parseDouble(string)) {
                    }
                    break;
                case 3464:
                    if (!strM21449c.equals("lt")) {
                        break;
                    }
                    if (Double.parseDouble(obj.toString()) >= Double.parseDouble(string)) {
                    }
                    break;
                case 3511:
                    if (!strM21449c.equals("ne")) {
                        break;
                    }
                    if (sq8.m48644c(obj.toString(), string)) {
                    }
                    break;
                case 102680:
                    if (!strM21449c.equals("gte")) {
                        break;
                    }
                    if (Double.parseDouble(obj.toString()) >= Double.parseDouble(string)) {
                    }
                    break;
                case 107485:
                    if (!strM21449c.equals("lte")) {
                        break;
                    }
                    if (Double.parseDouble(obj.toString()) <= Double.parseDouble(string)) {
                    }
                    break;
                case 108954:
                    if (!strM21449c.equals("neq")) {
                        break;
                    }
                    if (sq8.m48644c(obj.toString(), string)) {
                    }
                    break;
                case 127966736:
                    if (strM21449c.equals("i_str_eq")) {
                        String string4 = obj.toString();
                        Locale locale5 = Locale.ROOT;
                        String lowerCase8 = string4.toLowerCase(locale5);
                        sq8.m48648g(lowerCase8, "this as java.lang.String).toLowerCase(Locale.ROOT)");
                        String lowerCase9 = string.toLowerCase(locale5);
                        sq8.m48648g(lowerCase9, "this as java.lang.String).toLowerCase(Locale.ROOT)");
                        break;
                    } else {
                        break;
                    }
                case 127966857:
                    if (!strM21449c.equals("i_str_in")) {
                        break;
                    }
                    if (arrayListM21451e != null) {
                        while (r8.hasNext()) {
                        }
                        break;
                    }
                    break;
                case 363990325:
                    if (strM21449c.equals("i_contains")) {
                        String string5 = obj.toString();
                        Locale locale6 = Locale.ROOT;
                        String lowerCase10 = string5.toLowerCase(locale6);
                        sq8.m48648g(lowerCase10, "this as java.lang.String).toLowerCase(Locale.ROOT)");
                        String lowerCase11 = string.toLowerCase(locale6);
                        sq8.m48648g(lowerCase11, "this as java.lang.String).toLowerCase(Locale.ROOT)");
                        break;
                    } else {
                        break;
                    }
                case 1091487233:
                    if (!strM21449c.equals("i_is_not_any")) {
                        break;
                    }
                    if (arrayListM21451e == null) {
                    }
                    break;
                case 1918401035:
                    if (strM21449c.equals("not_contains") && !f9g.m26306P(obj.toString(), string, false, 2, null)) {
                        break;
                    }
                    break;
                case 1961112862:
                    if (strM21449c.equals("i_starts_with")) {
                        String string6 = obj.toString();
                        Locale locale7 = Locale.ROOT;
                        String lowerCase12 = string6.toLowerCase(locale7);
                        sq8.m48648g(lowerCase12, "this as java.lang.String).toLowerCase(Locale.ROOT)");
                        String lowerCase13 = string.toLowerCase(locale7);
                        sq8.m48648g(lowerCase13, "this as java.lang.String).toLowerCase(Locale.ROOT)");
                        break;
                    } else {
                        break;
                    }
            }
            return false;
        } catch (Throwable th) {
            a94.m16692b(th, cna.class);
            return false;
        }
    }

    /* renamed from: g */
    public final void m21456g() {
        if (a94.m16694d(this)) {
            return;
        }
        try {
            tt6 tt6VarM56803u = xt6.m56803u(C10773c.m13020m(), false);
            if (tt6VarM56803u == null) {
                return;
            }
            f18385c = tt6VarM56803u.m50543j();
        } catch (Throwable th) {
            a94.m16692b(th, this);
        }
    }
}
