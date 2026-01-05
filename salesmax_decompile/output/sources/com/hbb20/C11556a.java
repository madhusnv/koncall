package com.hbb20;

import android.content.Context;
import com.google.api.Service;
import com.hbb20.CountryCodePicker;
import com.onesignal.session.internal.outcomes.impl.OutcomeConstants;
import java.io.IOException;
import java.text.Collator;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import org.apache.http.HttpStatus;
import org.apache.http.message.TokenParser;
import org.apache.http.protocol.HTTP;
import org.objectweb.asm.Opcodes;
import org.objectweb.asm.TypeReference;
import org.objectweb.asm.signature.SignatureVisitor;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlPullParserFactory;
import p001o.um5;
import p001o.v7e;
import p001o.wm5;

/* renamed from: com.hbb20.a */
/* loaded from: classes6.dex */
public class C11556a implements Comparable {

    /* renamed from: f */
    public static int f13473f = -99;

    /* renamed from: g */
    public static CountryCodePicker.EnumC11551i f13474g;

    /* renamed from: h */
    public static String f13475h;

    /* renamed from: q */
    public static String f13476q;

    /* renamed from: s */
    public static String f13477s;

    /* renamed from: x */
    public static List f13478x;

    /* renamed from: a */
    public String f13479a;

    /* renamed from: b */
    public String f13480b;

    /* renamed from: c */
    public String f13481c;

    /* renamed from: d */
    public String f13482d;

    /* renamed from: e */
    public int f13483e;

    public C11556a() {
        this.f13483e = f13473f;
    }

    /* renamed from: A */
    public static String m15840A(Context context, CountryCodePicker.EnumC11551i enumC11551i) {
        String str;
        CountryCodePicker.EnumC11551i enumC11551i2 = f13474g;
        if (enumC11551i2 == null || enumC11551i2 != enumC11551i || (str = f13477s) == null || str.length() == 0) {
            m15842E(context, enumC11551i);
        }
        return f13477s;
    }

    /* renamed from: C */
    public static String m15841C(Context context, CountryCodePicker.EnumC11551i enumC11551i) {
        String str;
        CountryCodePicker.EnumC11551i enumC11551i2 = f13474g;
        if (enumC11551i2 == null || enumC11551i2 != enumC11551i || (str = f13476q) == null || str.length() == 0) {
            m15842E(context, enumC11551i);
        }
        return f13476q;
    }

    /* JADX WARN: Removed duplicated region for block: B:45:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x010c  */
    /* renamed from: E */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void m15842E(Context context, CountryCodePicker.EnumC11551i enumC11551i) {
        String attributeValue;
        String attributeValue2;
        List arrayList = new ArrayList();
        String attributeValue3 = "";
        try {
            XmlPullParser xmlPullParserNewPullParser = XmlPullParserFactory.newInstance().newPullParser();
            xmlPullParserNewPullParser.setInput(context.getResources().openRawResource(context.getResources().getIdentifier("ccp_" + enumC11551i.toString().toLowerCase(Locale.ROOT), "raw", context.getPackageName())), HTTP.UTF_8);
            attributeValue = "";
            attributeValue2 = attributeValue;
            for (int eventType = xmlPullParserNewPullParser.getEventType(); eventType != 1; eventType = xmlPullParserNewPullParser.next()) {
                try {
                    String name = xmlPullParserNewPullParser.getName();
                    if (eventType == 3) {
                        if (name.equals("country")) {
                            C11556a c11556a = new C11556a();
                            c11556a.m15861I(xmlPullParserNewPullParser.getAttributeValue(null, "name_code").toUpperCase(Locale.US));
                            c11556a.m15862J(xmlPullParserNewPullParser.getAttributeValue(null, "phone_code"));
                            c11556a.m15859G(xmlPullParserNewPullParser.getAttributeValue(null, "english_name"));
                            c11556a.m15860H(xmlPullParserNewPullParser.getAttributeValue(null, "name"));
                            arrayList.add(c11556a);
                        } else if (name.equals("ccp_dialog_title")) {
                            attributeValue3 = xmlPullParserNewPullParser.getAttributeValue(null, "translation");
                        } else if (name.equals("ccp_dialog_search_hint_message")) {
                            attributeValue = xmlPullParserNewPullParser.getAttributeValue(null, "translation");
                        } else if (name.equals("ccp_dialog_no_result_ack_message")) {
                            attributeValue2 = xmlPullParserNewPullParser.getAttributeValue(null, "translation");
                        }
                    }
                } catch (IOException e) {
                    e = e;
                    e.printStackTrace();
                    if (arrayList.size() == 0) {
                    }
                    if (attributeValue3.length() <= 0) {
                    }
                    f13475h = attributeValue3;
                    if (attributeValue.length() <= 0) {
                    }
                    f13476q = attributeValue;
                    if (attributeValue2.length() <= 0) {
                    }
                    f13477s = attributeValue2;
                    f13478x = arrayList;
                    Collections.sort(arrayList);
                } catch (XmlPullParserException e2) {
                    e = e2;
                    e.printStackTrace();
                    if (arrayList.size() == 0) {
                    }
                    if (attributeValue3.length() <= 0) {
                    }
                    f13475h = attributeValue3;
                    if (attributeValue.length() <= 0) {
                    }
                    f13476q = attributeValue;
                    if (attributeValue2.length() <= 0) {
                    }
                    f13477s = attributeValue2;
                    f13478x = arrayList;
                    Collections.sort(arrayList);
                } catch (Exception e3) {
                    e = e3;
                    e.printStackTrace();
                    if (arrayList.size() == 0) {
                    }
                    if (attributeValue3.length() <= 0) {
                    }
                    f13475h = attributeValue3;
                    if (attributeValue.length() <= 0) {
                    }
                    f13476q = attributeValue;
                    if (attributeValue2.length() <= 0) {
                    }
                    f13477s = attributeValue2;
                    f13478x = arrayList;
                    Collections.sort(arrayList);
                }
            }
            f13474g = enumC11551i;
        } catch (IOException e4) {
            e = e4;
            attributeValue = "";
            attributeValue2 = attributeValue;
        } catch (XmlPullParserException e5) {
            e = e5;
            attributeValue = "";
            attributeValue2 = attributeValue;
        } catch (Exception e6) {
            e = e6;
            attributeValue = "";
            attributeValue2 = attributeValue;
        }
        if (arrayList.size() == 0) {
            f13474g = CountryCodePicker.EnumC11551i.ENGLISH;
            arrayList = m15854w();
        }
        if (attributeValue3.length() <= 0) {
            attributeValue3 = "Select a country";
        }
        f13475h = attributeValue3;
        if (attributeValue.length() <= 0) {
            attributeValue = "Search...";
        }
        f13476q = attributeValue;
        if (attributeValue2.length() <= 0) {
            attributeValue2 = "Results not found";
        }
        f13477s = attributeValue2;
        f13478x = arrayList;
        Collections.sort(arrayList);
    }

    /* renamed from: d */
    public static C11556a m15843d(Context context, CountryCodePicker.EnumC11551i enumC11551i, List list, int i) {
        return m15844e(context, enumC11551i, list, i + "");
    }

    /* renamed from: e */
    public static C11556a m15844e(Context context, CountryCodePicker.EnumC11551i enumC11551i, List list, String str) {
        if (list != null && !list.isEmpty()) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                C11556a c11556a = (C11556a) it.next();
                if (c11556a.m15856B().equals(str)) {
                    return c11556a;
                }
            }
        }
        for (C11556a c11556a2 : m15855x(context, enumC11551i)) {
            if (c11556a2.m15856B().equals(str)) {
                return c11556a2;
            }
        }
        return null;
    }

    /* renamed from: g */
    public static C11556a m15845g(String str) {
        for (C11556a c11556a : m15854w()) {
            if (c11556a.m15856B().equals(str)) {
                return c11556a;
            }
        }
        return null;
    }

    /* renamed from: h */
    public static C11556a m15846h(Context context, List list, CountryCodePicker.EnumC11551i enumC11551i, String str) {
        if (list == null || list.size() == 0) {
            return m15848m(context, enumC11551i, str);
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C11556a c11556a = (C11556a) it.next();
            if (c11556a.m15868z().equalsIgnoreCase(str)) {
                return c11556a;
            }
        }
        return null;
    }

    /* renamed from: j */
    public static C11556a m15847j(String str) {
        for (C11556a c11556a : m15854w()) {
            if (c11556a.m15868z().equalsIgnoreCase(str)) {
                return c11556a;
            }
        }
        return null;
    }

    /* renamed from: m */
    public static C11556a m15848m(Context context, CountryCodePicker.EnumC11551i enumC11551i, String str) {
        for (C11556a c11556a : m15855x(context, enumC11551i)) {
            if (c11556a.m15868z().equalsIgnoreCase(str)) {
                return c11556a;
            }
        }
        return null;
    }

    /* renamed from: n */
    public static C11556a m15849n(Context context, CountryCodePicker.EnumC11551i enumC11551i, List list, String str) {
        C11557b c11557bM15872e;
        if (str == null) {
            return null;
        }
        String strTrim = str.trim();
        if (strTrim.length() != 0) {
            int i = strTrim.charAt(0) == '+' ? 1 : 0;
            for (int i2 = i; i2 <= strTrim.length(); i2++) {
                String strSubstring = strTrim.substring(i, i2);
                try {
                    c11557bM15872e = C11557b.m15872e(Integer.parseInt(strSubstring));
                } catch (Exception unused) {
                    c11557bM15872e = null;
                }
                if (c11557bM15872e != null) {
                    int length = i + strSubstring.length();
                    int length2 = strTrim.length();
                    int i3 = c11557bM15872e.f13486b;
                    return length2 >= length + i3 ? c11557bM15872e.m15874d(context, enumC11551i, strTrim.substring(length, i3 + length)) : m15848m(context, enumC11551i, c11557bM15872e.f13485a);
                }
                C11556a c11556aM15844e = m15844e(context, enumC11551i, list, strSubstring);
                if (c11556aM15844e != null) {
                    return c11556aM15844e;
                }
            }
        }
        return null;
    }

    /* renamed from: o */
    public static List m15850o(Context context, CountryCodePicker countryCodePicker) {
        countryCodePicker.m15804C();
        List list = countryCodePicker.T0;
        return (list == null || list.size() <= 0) ? m15855x(context, countryCodePicker.getLanguageToApply()) : countryCodePicker.getCustomMasterCountriesList();
    }

    /* renamed from: r */
    public static String m15851r(Context context, CountryCodePicker.EnumC11551i enumC11551i) {
        String str;
        CountryCodePicker.EnumC11551i enumC11551i2 = f13474g;
        if (enumC11551i2 == null || enumC11551i2 != enumC11551i || (str = f13475h) == null || str.length() == 0) {
            m15842E(context, enumC11551i);
        }
        return f13475h;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* renamed from: t */
    public static String m15852t(C11556a c11556a) {
        String lowerCase = c11556a.m15868z().toLowerCase();
        lowerCase.hashCode();
        char c = 65535;
        switch (lowerCase.hashCode()) {
            case 3107:
                if (lowerCase.equals("ad")) {
                    c = 0;
                    break;
                }
                break;
            case 3108:
                if (lowerCase.equals("ae")) {
                    c = 1;
                    break;
                }
                break;
            case 3109:
                if (lowerCase.equals("af")) {
                    c = 2;
                    break;
                }
                break;
            case 3110:
                if (lowerCase.equals("ag")) {
                    c = 3;
                    break;
                }
                break;
            case 3112:
                if (lowerCase.equals("ai")) {
                    c = 4;
                    break;
                }
                break;
            case 3115:
                if (lowerCase.equals("al")) {
                    c = 5;
                    break;
                }
                break;
            case 3116:
                if (lowerCase.equals("am")) {
                    c = 6;
                    break;
                }
                break;
            case 3118:
                if (lowerCase.equals("ao")) {
                    c = 7;
                    break;
                }
                break;
            case 3120:
                if (lowerCase.equals("aq")) {
                    c = '\b';
                    break;
                }
                break;
            case 3121:
                if (lowerCase.equals("ar")) {
                    c = '\t';
                    break;
                }
                break;
            case 3122:
                if (lowerCase.equals("as")) {
                    c = '\n';
                    break;
                }
                break;
            case 3123:
                if (lowerCase.equals("at")) {
                    c = 11;
                    break;
                }
                break;
            case 3124:
                if (lowerCase.equals("au")) {
                    c = '\f';
                    break;
                }
                break;
            case 3126:
                if (lowerCase.equals("aw")) {
                    c = TokenParser.CR;
                    break;
                }
                break;
            case 3127:
                if (lowerCase.equals("ax")) {
                    c = 14;
                    break;
                }
                break;
            case 3129:
                if (lowerCase.equals("az")) {
                    c = 15;
                    break;
                }
                break;
            case 3135:
                if (lowerCase.equals("ba")) {
                    c = 16;
                    break;
                }
                break;
            case 3136:
                if (lowerCase.equals("bb")) {
                    c = 17;
                    break;
                }
                break;
            case 3138:
                if (lowerCase.equals("bd")) {
                    c = 18;
                    break;
                }
                break;
            case 3139:
                if (lowerCase.equals("be")) {
                    c = 19;
                    break;
                }
                break;
            case 3140:
                if (lowerCase.equals("bf")) {
                    c = 20;
                    break;
                }
                break;
            case 3141:
                if (lowerCase.equals("bg")) {
                    c = 21;
                    break;
                }
                break;
            case 3142:
                if (lowerCase.equals("bh")) {
                    c = 22;
                    break;
                }
                break;
            case 3143:
                if (lowerCase.equals("bi")) {
                    c = 23;
                    break;
                }
                break;
            case 3144:
                if (lowerCase.equals("bj")) {
                    c = 24;
                    break;
                }
                break;
            case 3146:
                if (lowerCase.equals("bl")) {
                    c = 25;
                    break;
                }
                break;
            case 3147:
                if (lowerCase.equals("bm")) {
                    c = 26;
                    break;
                }
                break;
            case 3148:
                if (lowerCase.equals("bn")) {
                    c = 27;
                    break;
                }
                break;
            case 3149:
                if (lowerCase.equals("bo")) {
                    c = 28;
                    break;
                }
                break;
            case 3151:
                if (lowerCase.equals("bq")) {
                    c = 29;
                    break;
                }
                break;
            case 3152:
                if (lowerCase.equals("br")) {
                    c = 30;
                    break;
                }
                break;
            case 3153:
                if (lowerCase.equals("bs")) {
                    c = 31;
                    break;
                }
                break;
            case 3154:
                if (lowerCase.equals("bt")) {
                    c = TokenParser.SP;
                    break;
                }
                break;
            case 3156:
                if (lowerCase.equals("bv")) {
                    c = '!';
                    break;
                }
                break;
            case 3157:
                if (lowerCase.equals("bw")) {
                    c = TokenParser.DQUOTE;
                    break;
                }
                break;
            case 3159:
                if (lowerCase.equals("by")) {
                    c = '#';
                    break;
                }
                break;
            case 3160:
                if (lowerCase.equals("bz")) {
                    c = '$';
                    break;
                }
                break;
            case 3166:
                if (lowerCase.equals("ca")) {
                    c = '%';
                    break;
                }
                break;
            case 3168:
                if (lowerCase.equals("cc")) {
                    c = '&';
                    break;
                }
                break;
            case 3169:
                if (lowerCase.equals("cd")) {
                    c = '\'';
                    break;
                }
                break;
            case 3171:
                if (lowerCase.equals("cf")) {
                    c = '(';
                    break;
                }
                break;
            case 3172:
                if (lowerCase.equals("cg")) {
                    c = ')';
                    break;
                }
                break;
            case 3173:
                if (lowerCase.equals("ch")) {
                    c = '*';
                    break;
                }
                break;
            case 3174:
                if (lowerCase.equals("ci")) {
                    c = '+';
                    break;
                }
                break;
            case 3176:
                if (lowerCase.equals("ck")) {
                    c = ',';
                    break;
                }
                break;
            case 3177:
                if (lowerCase.equals("cl")) {
                    c = '-';
                    break;
                }
                break;
            case 3178:
                if (lowerCase.equals("cm")) {
                    c = '.';
                    break;
                }
                break;
            case 3179:
                if (lowerCase.equals("cn")) {
                    c = '/';
                    break;
                }
                break;
            case 3180:
                if (lowerCase.equals("co")) {
                    c = '0';
                    break;
                }
                break;
            case 3183:
                if (lowerCase.equals("cr")) {
                    c = '1';
                    break;
                }
                break;
            case 3186:
                if (lowerCase.equals("cu")) {
                    c = '2';
                    break;
                }
                break;
            case 3187:
                if (lowerCase.equals("cv")) {
                    c = '3';
                    break;
                }
                break;
            case 3188:
                if (lowerCase.equals("cw")) {
                    c = '4';
                    break;
                }
                break;
            case 3189:
                if (lowerCase.equals("cx")) {
                    c = '5';
                    break;
                }
                break;
            case 3190:
                if (lowerCase.equals("cy")) {
                    c = '6';
                    break;
                }
                break;
            case 3191:
                if (lowerCase.equals("cz")) {
                    c = '7';
                    break;
                }
                break;
            case 3201:
                if (lowerCase.equals("de")) {
                    c = '8';
                    break;
                }
                break;
            case 3206:
                if (lowerCase.equals("dj")) {
                    c = '9';
                    break;
                }
                break;
            case 3207:
                if (lowerCase.equals("dk")) {
                    c = ':';
                    break;
                }
                break;
            case 3209:
                if (lowerCase.equals("dm")) {
                    c = ';';
                    break;
                }
                break;
            case 3211:
                if (lowerCase.equals("do")) {
                    c = '<';
                    break;
                }
                break;
            case 3222:
                if (lowerCase.equals("dz")) {
                    c = '=';
                    break;
                }
                break;
            case 3230:
                if (lowerCase.equals("ec")) {
                    c = '>';
                    break;
                }
                break;
            case 3232:
                if (lowerCase.equals("ee")) {
                    c = '?';
                    break;
                }
                break;
            case 3234:
                if (lowerCase.equals("eg")) {
                    c = '@';
                    break;
                }
                break;
            case 3235:
                if (lowerCase.equals("eh")) {
                    c = 'A';
                    break;
                }
                break;
            case 3245:
                if (lowerCase.equals("er")) {
                    c = 'B';
                    break;
                }
                break;
            case 3246:
                if (lowerCase.equals("es")) {
                    c = 'C';
                    break;
                }
                break;
            case 3247:
                if (lowerCase.equals("et")) {
                    c = 'D';
                    break;
                }
                break;
            case 3267:
                if (lowerCase.equals("fi")) {
                    c = 'E';
                    break;
                }
                break;
            case 3268:
                if (lowerCase.equals("fj")) {
                    c = 'F';
                    break;
                }
                break;
            case 3269:
                if (lowerCase.equals("fk")) {
                    c = 'G';
                    break;
                }
                break;
            case 3271:
                if (lowerCase.equals("fm")) {
                    c = 'H';
                    break;
                }
                break;
            case 3273:
                if (lowerCase.equals("fo")) {
                    c = 'I';
                    break;
                }
                break;
            case 3276:
                if (lowerCase.equals("fr")) {
                    c = 'J';
                    break;
                }
                break;
            case 3290:
                if (lowerCase.equals("ga")) {
                    c = 'K';
                    break;
                }
                break;
            case 3291:
                if (lowerCase.equals("gb")) {
                    c = 'L';
                    break;
                }
                break;
            case 3293:
                if (lowerCase.equals("gd")) {
                    c = 'M';
                    break;
                }
                break;
            case 3294:
                if (lowerCase.equals("ge")) {
                    c = 'N';
                    break;
                }
                break;
            case 3295:
                if (lowerCase.equals("gf")) {
                    c = 'O';
                    break;
                }
                break;
            case 3296:
                if (lowerCase.equals("gg")) {
                    c = 'P';
                    break;
                }
                break;
            case 3297:
                if (lowerCase.equals("gh")) {
                    c = 'Q';
                    break;
                }
                break;
            case 3298:
                if (lowerCase.equals("gi")) {
                    c = 'R';
                    break;
                }
                break;
            case 3301:
                if (lowerCase.equals("gl")) {
                    c = 'S';
                    break;
                }
                break;
            case 3302:
                if (lowerCase.equals("gm")) {
                    c = 'T';
                    break;
                }
                break;
            case 3303:
                if (lowerCase.equals("gn")) {
                    c = 'U';
                    break;
                }
                break;
            case 3305:
                if (lowerCase.equals("gp")) {
                    c = 'V';
                    break;
                }
                break;
            case 3306:
                if (lowerCase.equals("gq")) {
                    c = 'W';
                    break;
                }
                break;
            case 3307:
                if (lowerCase.equals("gr")) {
                    c = 'X';
                    break;
                }
                break;
            case 3308:
                if (lowerCase.equals("gs")) {
                    c = 'Y';
                    break;
                }
                break;
            case 3309:
                if (lowerCase.equals("gt")) {
                    c = 'Z';
                    break;
                }
                break;
            case 3310:
                if (lowerCase.equals("gu")) {
                    c = '[';
                    break;
                }
                break;
            case 3312:
                if (lowerCase.equals("gw")) {
                    c = TokenParser.ESCAPE;
                    break;
                }
                break;
            case 3314:
                if (lowerCase.equals("gy")) {
                    c = ']';
                    break;
                }
                break;
            case 3331:
                if (lowerCase.equals("hk")) {
                    c = '^';
                    break;
                }
                break;
            case 3333:
                if (lowerCase.equals("hm")) {
                    c = '_';
                    break;
                }
                break;
            case 3334:
                if (lowerCase.equals("hn")) {
                    c = '`';
                    break;
                }
                break;
            case 3338:
                if (lowerCase.equals("hr")) {
                    c = 'a';
                    break;
                }
                break;
            case 3340:
                if (lowerCase.equals("ht")) {
                    c = 'b';
                    break;
                }
                break;
            case 3341:
                if (lowerCase.equals("hu")) {
                    c = 'c';
                    break;
                }
                break;
            case 3355:
                if (lowerCase.equals(OutcomeConstants.OUTCOME_ID)) {
                    c = 'd';
                    break;
                }
                break;
            case 3356:
                if (lowerCase.equals("ie")) {
                    c = 'e';
                    break;
                }
                break;
            case 3363:
                if (lowerCase.equals("il")) {
                    c = 'f';
                    break;
                }
                break;
            case 3364:
                if (lowerCase.equals("im")) {
                    c = 'g';
                    break;
                }
                break;
            case 3365:
                if (lowerCase.equals("in")) {
                    c = 'h';
                    break;
                }
                break;
            case 3366:
                if (lowerCase.equals("io")) {
                    c = 'i';
                    break;
                }
                break;
            case 3368:
                if (lowerCase.equals("iq")) {
                    c = 'j';
                    break;
                }
                break;
            case 3369:
                if (lowerCase.equals("ir")) {
                    c = 'k';
                    break;
                }
                break;
            case 3370:
                if (lowerCase.equals("is")) {
                    c = 'l';
                    break;
                }
                break;
            case 3371:
                if (lowerCase.equals("it")) {
                    c = 'm';
                    break;
                }
                break;
            case 3387:
                if (lowerCase.equals("je")) {
                    c = 'n';
                    break;
                }
                break;
            case 3395:
                if (lowerCase.equals("jm")) {
                    c = 'o';
                    break;
                }
                break;
            case 3397:
                if (lowerCase.equals("jo")) {
                    c = 'p';
                    break;
                }
                break;
            case 3398:
                if (lowerCase.equals("jp")) {
                    c = 'q';
                    break;
                }
                break;
            case 3418:
                if (lowerCase.equals("ke")) {
                    c = 'r';
                    break;
                }
                break;
            case 3420:
                if (lowerCase.equals("kg")) {
                    c = 's';
                    break;
                }
                break;
            case 3421:
                if (lowerCase.equals("kh")) {
                    c = 't';
                    break;
                }
                break;
            case 3422:
                if (lowerCase.equals("ki")) {
                    c = 'u';
                    break;
                }
                break;
            case 3426:
                if (lowerCase.equals("km")) {
                    c = 'v';
                    break;
                }
                break;
            case 3427:
                if (lowerCase.equals("kn")) {
                    c = 'w';
                    break;
                }
                break;
            case 3429:
                if (lowerCase.equals("kp")) {
                    c = 'x';
                    break;
                }
                break;
            case 3431:
                if (lowerCase.equals("kr")) {
                    c = 'y';
                    break;
                }
                break;
            case 3436:
                if (lowerCase.equals("kw")) {
                    c = 'z';
                    break;
                }
                break;
            case 3438:
                if (lowerCase.equals("ky")) {
                    c = '{';
                    break;
                }
                break;
            case 3439:
                if (lowerCase.equals("kz")) {
                    c = '|';
                    break;
                }
                break;
            case 3445:
                if (lowerCase.equals("la")) {
                    c = '}';
                    break;
                }
                break;
            case 3446:
                if (lowerCase.equals("lb")) {
                    c = '~';
                    break;
                }
                break;
            case 3447:
                if (lowerCase.equals("lc")) {
                    c = 127;
                    break;
                }
                break;
            case 3453:
                if (lowerCase.equals("li")) {
                    c = 128;
                    break;
                }
                break;
            case 3455:
                if (lowerCase.equals("lk")) {
                    c = 129;
                    break;
                }
                break;
            case 3462:
                if (lowerCase.equals("lr")) {
                    c = 130;
                    break;
                }
                break;
            case 3463:
                if (lowerCase.equals("ls")) {
                    c = 131;
                    break;
                }
                break;
            case 3464:
                if (lowerCase.equals("lt")) {
                    c = 132;
                    break;
                }
                break;
            case 3465:
                if (lowerCase.equals("lu")) {
                    c = 133;
                    break;
                }
                break;
            case 3466:
                if (lowerCase.equals("lv")) {
                    c = 134;
                    break;
                }
                break;
            case 3469:
                if (lowerCase.equals("ly")) {
                    c = 135;
                    break;
                }
                break;
            case 3476:
                if (lowerCase.equals("ma")) {
                    c = 136;
                    break;
                }
                break;
            case 3478:
                if (lowerCase.equals("mc")) {
                    c = 137;
                    break;
                }
                break;
            case 3479:
                if (lowerCase.equals("md")) {
                    c = 138;
                    break;
                }
                break;
            case 3480:
                if (lowerCase.equals("me")) {
                    c = 139;
                    break;
                }
                break;
            case 3481:
                if (lowerCase.equals("mf")) {
                    c = 140;
                    break;
                }
                break;
            case 3482:
                if (lowerCase.equals("mg")) {
                    c = 141;
                    break;
                }
                break;
            case 3483:
                if (lowerCase.equals("mh")) {
                    c = 142;
                    break;
                }
                break;
            case 3486:
                if (lowerCase.equals("mk")) {
                    c = 143;
                    break;
                }
                break;
            case 3487:
                if (lowerCase.equals("ml")) {
                    c = 144;
                    break;
                }
                break;
            case 3488:
                if (lowerCase.equals("mm")) {
                    c = 145;
                    break;
                }
                break;
            case 3489:
                if (lowerCase.equals("mn")) {
                    c = 146;
                    break;
                }
                break;
            case 3490:
                if (lowerCase.equals("mo")) {
                    c = 147;
                    break;
                }
                break;
            case 3491:
                if (lowerCase.equals("mp")) {
                    c = 148;
                    break;
                }
                break;
            case 3492:
                if (lowerCase.equals("mq")) {
                    c = 149;
                    break;
                }
                break;
            case 3493:
                if (lowerCase.equals("mr")) {
                    c = 150;
                    break;
                }
                break;
            case 3494:
                if (lowerCase.equals("ms")) {
                    c = 151;
                    break;
                }
                break;
            case 3495:
                if (lowerCase.equals("mt")) {
                    c = 152;
                    break;
                }
                break;
            case 3496:
                if (lowerCase.equals("mu")) {
                    c = 153;
                    break;
                }
                break;
            case 3497:
                if (lowerCase.equals("mv")) {
                    c = 154;
                    break;
                }
                break;
            case 3498:
                if (lowerCase.equals("mw")) {
                    c = 155;
                    break;
                }
                break;
            case 3499:
                if (lowerCase.equals("mx")) {
                    c = 156;
                    break;
                }
                break;
            case 3500:
                if (lowerCase.equals("my")) {
                    c = 157;
                    break;
                }
                break;
            case 3501:
                if (lowerCase.equals("mz")) {
                    c = 158;
                    break;
                }
                break;
            case 3507:
                if (lowerCase.equals("na")) {
                    c = 159;
                    break;
                }
                break;
            case 3509:
                if (lowerCase.equals("nc")) {
                    c = 160;
                    break;
                }
                break;
            case 3511:
                if (lowerCase.equals("ne")) {
                    c = 161;
                    break;
                }
                break;
            case 3512:
                if (lowerCase.equals("nf")) {
                    c = 162;
                    break;
                }
                break;
            case 3513:
                if (lowerCase.equals("ng")) {
                    c = 163;
                    break;
                }
                break;
            case 3515:
                if (lowerCase.equals("ni")) {
                    c = 164;
                    break;
                }
                break;
            case 3518:
                if (lowerCase.equals("nl")) {
                    c = 165;
                    break;
                }
                break;
            case 3521:
                if (lowerCase.equals("no")) {
                    c = 166;
                    break;
                }
                break;
            case 3522:
                if (lowerCase.equals("np")) {
                    c = 167;
                    break;
                }
                break;
            case 3524:
                if (lowerCase.equals("nr")) {
                    c = 168;
                    break;
                }
                break;
            case 3527:
                if (lowerCase.equals("nu")) {
                    c = 169;
                    break;
                }
                break;
            case 3532:
                if (lowerCase.equals("nz")) {
                    c = 170;
                    break;
                }
                break;
            case 3550:
                if (lowerCase.equals("om")) {
                    c = 171;
                    break;
                }
                break;
            case 3569:
                if (lowerCase.equals("pa")) {
                    c = 172;
                    break;
                }
                break;
            case 3573:
                if (lowerCase.equals("pe")) {
                    c = 173;
                    break;
                }
                break;
            case 3574:
                if (lowerCase.equals("pf")) {
                    c = 174;
                    break;
                }
                break;
            case 3575:
                if (lowerCase.equals("pg")) {
                    c = 175;
                    break;
                }
                break;
            case 3576:
                if (lowerCase.equals("ph")) {
                    c = 176;
                    break;
                }
                break;
            case 3579:
                if (lowerCase.equals("pk")) {
                    c = 177;
                    break;
                }
                break;
            case 3580:
                if (lowerCase.equals("pl")) {
                    c = 178;
                    break;
                }
                break;
            case 3581:
                if (lowerCase.equals("pm")) {
                    c = 179;
                    break;
                }
                break;
            case 3582:
                if (lowerCase.equals("pn")) {
                    c = 180;
                    break;
                }
                break;
            case 3586:
                if (lowerCase.equals("pr")) {
                    c = 181;
                    break;
                }
                break;
            case 3587:
                if (lowerCase.equals("ps")) {
                    c = 182;
                    break;
                }
                break;
            case 3588:
                if (lowerCase.equals("pt")) {
                    c = 183;
                    break;
                }
                break;
            case 3591:
                if (lowerCase.equals("pw")) {
                    c = 184;
                    break;
                }
                break;
            case 3593:
                if (lowerCase.equals("py")) {
                    c = 185;
                    break;
                }
                break;
            case 3600:
                if (lowerCase.equals("qa")) {
                    c = 186;
                    break;
                }
                break;
            case 3635:
                if (lowerCase.equals("re")) {
                    c = 187;
                    break;
                }
                break;
            case 3645:
                if (lowerCase.equals("ro")) {
                    c = 188;
                    break;
                }
                break;
            case 3649:
                if (lowerCase.equals("rs")) {
                    c = 189;
                    break;
                }
                break;
            case 3651:
                if (lowerCase.equals("ru")) {
                    c = 190;
                    break;
                }
                break;
            case 3653:
                if (lowerCase.equals("rw")) {
                    c = 191;
                    break;
                }
                break;
            case 3662:
                if (lowerCase.equals("sa")) {
                    c = 192;
                    break;
                }
                break;
            case 3663:
                if (lowerCase.equals("sb")) {
                    c = 193;
                    break;
                }
                break;
            case 3664:
                if (lowerCase.equals("sc")) {
                    c = 194;
                    break;
                }
                break;
            case 3665:
                if (lowerCase.equals("sd")) {
                    c = 195;
                    break;
                }
                break;
            case 3666:
                if (lowerCase.equals("se")) {
                    c = 196;
                    break;
                }
                break;
            case 3668:
                if (lowerCase.equals("sg")) {
                    c = 197;
                    break;
                }
                break;
            case 3669:
                if (lowerCase.equals("sh")) {
                    c = 198;
                    break;
                }
                break;
            case 3670:
                if (lowerCase.equals("si")) {
                    c = 199;
                    break;
                }
                break;
            case 3671:
                if (lowerCase.equals("sj")) {
                    c = 200;
                    break;
                }
                break;
            case 3672:
                if (lowerCase.equals("sk")) {
                    c = 201;
                    break;
                }
                break;
            case 3673:
                if (lowerCase.equals("sl")) {
                    c = 202;
                    break;
                }
                break;
            case 3674:
                if (lowerCase.equals("sm")) {
                    c = 203;
                    break;
                }
                break;
            case 3675:
                if (lowerCase.equals("sn")) {
                    c = 204;
                    break;
                }
                break;
            case 3676:
                if (lowerCase.equals("so")) {
                    c = 205;
                    break;
                }
                break;
            case 3679:
                if (lowerCase.equals("sr")) {
                    c = 206;
                    break;
                }
                break;
            case 3680:
                if (lowerCase.equals("ss")) {
                    c = 207;
                    break;
                }
                break;
            case 3681:
                if (lowerCase.equals("st")) {
                    c = 208;
                    break;
                }
                break;
            case 3683:
                if (lowerCase.equals("sv")) {
                    c = 209;
                    break;
                }
                break;
            case 3685:
                if (lowerCase.equals("sx")) {
                    c = 210;
                    break;
                }
                break;
            case 3686:
                if (lowerCase.equals("sy")) {
                    c = 211;
                    break;
                }
                break;
            case 3687:
                if (lowerCase.equals("sz")) {
                    c = 212;
                    break;
                }
                break;
            case 3695:
                if (lowerCase.equals("tc")) {
                    c = 213;
                    break;
                }
                break;
            case 3696:
                if (lowerCase.equals("td")) {
                    c = 214;
                    break;
                }
                break;
            case 3698:
                if (lowerCase.equals("tf")) {
                    c = 215;
                    break;
                }
                break;
            case 3699:
                if (lowerCase.equals("tg")) {
                    c = 216;
                    break;
                }
                break;
            case 3700:
                if (lowerCase.equals("th")) {
                    c = 217;
                    break;
                }
                break;
            case 3702:
                if (lowerCase.equals("tj")) {
                    c = 218;
                    break;
                }
                break;
            case 3703:
                if (lowerCase.equals("tk")) {
                    c = 219;
                    break;
                }
                break;
            case 3704:
                if (lowerCase.equals("tl")) {
                    c = 220;
                    break;
                }
                break;
            case 3705:
                if (lowerCase.equals("tm")) {
                    c = 221;
                    break;
                }
                break;
            case 3706:
                if (lowerCase.equals("tn")) {
                    c = 222;
                    break;
                }
                break;
            case 3707:
                if (lowerCase.equals("to")) {
                    c = 223;
                    break;
                }
                break;
            case 3710:
                if (lowerCase.equals("tr")) {
                    c = 224;
                    break;
                }
                break;
            case 3712:
                if (lowerCase.equals("tt")) {
                    c = 225;
                    break;
                }
                break;
            case 3714:
                if (lowerCase.equals("tv")) {
                    c = 226;
                    break;
                }
                break;
            case 3715:
                if (lowerCase.equals("tw")) {
                    c = 227;
                    break;
                }
                break;
            case 3718:
                if (lowerCase.equals("tz")) {
                    c = 228;
                    break;
                }
                break;
            case 3724:
                if (lowerCase.equals("ua")) {
                    c = 229;
                    break;
                }
                break;
            case 3730:
                if (lowerCase.equals("ug")) {
                    c = 230;
                    break;
                }
                break;
            case 3736:
                if (lowerCase.equals("um")) {
                    c = 231;
                    break;
                }
                break;
            case 3742:
                if (lowerCase.equals("us")) {
                    c = 232;
                    break;
                }
                break;
            case 3748:
                if (lowerCase.equals("uy")) {
                    c = 233;
                    break;
                }
                break;
            case 3749:
                if (lowerCase.equals("uz")) {
                    c = 234;
                    break;
                }
                break;
            case 3755:
                if (lowerCase.equals("va")) {
                    c = 235;
                    break;
                }
                break;
            case 3757:
                if (lowerCase.equals("vc")) {
                    c = 236;
                    break;
                }
                break;
            case 3759:
                if (lowerCase.equals("ve")) {
                    c = 237;
                    break;
                }
                break;
            case 3761:
                if (lowerCase.equals("vg")) {
                    c = 238;
                    break;
                }
                break;
            case 3763:
                if (lowerCase.equals("vi")) {
                    c = 239;
                    break;
                }
                break;
            case 3768:
                if (lowerCase.equals("vn")) {
                    c = 240;
                    break;
                }
                break;
            case 3775:
                if (lowerCase.equals("vu")) {
                    c = 241;
                    break;
                }
                break;
            case 3791:
                if (lowerCase.equals("wf")) {
                    c = 242;
                    break;
                }
                break;
            case 3804:
                if (lowerCase.equals("ws")) {
                    c = 243;
                    break;
                }
                break;
            case 3827:
                if (lowerCase.equals("xk")) {
                    c = 244;
                    break;
                }
                break;
            case 3852:
                if (lowerCase.equals("ye")) {
                    c = 245;
                    break;
                }
                break;
            case 3867:
                if (lowerCase.equals("yt")) {
                    c = 246;
                    break;
                }
                break;
            case 3879:
                if (lowerCase.equals("za")) {
                    c = 247;
                    break;
                }
                break;
            case 3891:
                if (lowerCase.equals("zm")) {
                    c = 248;
                    break;
                }
                break;
            case 3901:
                if (lowerCase.equals("zw")) {
                    c = 249;
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
                return "🇦🇩";
            case 1:
                return "🇦🇪";
            case 2:
                return "🇦🇫";
            case 3:
                return "🇦🇬";
            case 4:
                return "🇦🇮";
            case 5:
                return "🇦🇱";
            case 6:
                return "🇦🇲";
            case 7:
                return "🇦🇴";
            case '\b':
                return "🇦🇶";
            case '\t':
                return "🇦🇷";
            case '\n':
                return "🇦🇸";
            case 11:
                return "🇦🇹";
            case '\f':
                return "🇦🇺";
            case '\r':
                return "🇦🇼";
            case 14:
                return "🇦🇽";
            case 15:
                return "🇦🇿";
            case 16:
                return "🇧🇦";
            case 17:
                return "🇧🇧";
            case 18:
                return "🇧🇩";
            case 19:
                return "🇧🇪";
            case 20:
                return "🇧🇫";
            case 21:
                return "🇧🇬";
            case 22:
                return "🇧🇭";
            case 23:
                return "🇧🇮";
            case 24:
                return "🇧🇯";
            case 25:
                return "🇧🇱";
            case 26:
                return "🇧🇲";
            case 27:
                return "🇧🇳";
            case Service.MONITORING_FIELD_NUMBER /* 28 */:
                return "🇧🇴";
            case Service.SYSTEM_PARAMETERS_FIELD_NUMBER /* 29 */:
                return "🇧🇶";
            case 30:
                return "🇧🇷";
            case um5.CC_ENABLE_ARENAS_FIELD_NUMBER /* 31 */:
                return "🇧🇸";
            case ' ':
                return "🇧🇹";
            case '!':
                return "🇧🇻";
            case wm5.IDEMPOTENCY_LEVEL_FIELD_NUMBER /* 34 */:
                return "🇧🇼";
            case '#':
                return "🇧🇾";
            case um5.OBJC_CLASS_PREFIX_FIELD_NUMBER /* 36 */:
                return "🇧🇿";
            case '%':
                return "🇨🇦";
            case '&':
                return "🇨🇨";
            case um5.SWIFT_PREFIX_FIELD_NUMBER /* 39 */:
                return "🇨🇩";
            case '(':
                return "🇨🇫";
            case um5.PHP_NAMESPACE_FIELD_NUMBER /* 41 */:
                return "🇨🇬";
            case um5.PHP_GENERIC_SERVICES_FIELD_NUMBER /* 42 */:
                return "🇨🇭";
            case SignatureVisitor.EXTENDS /* 43 */:
                return "🇨🇮";
            case um5.PHP_METADATA_NAMESPACE_FIELD_NUMBER /* 44 */:
                return "🇨🇰";
            case '-':
                return "🇨🇱";
            case '.':
                return "🇨🇲";
            case '/':
                return "🇨🇳";
            case '0':
                return "🇨🇴";
            case '1':
                return "🇨🇷";
            case '2':
                return "🇨🇺";
            case '3':
                return "🇨🇻";
            case '4':
                return "🇨🇼";
            case '5':
                return "🇨🇽";
            case '6':
                return "🇨🇾";
            case '7':
                return "🇨🇿";
            case '8':
                return "🇩🇪";
            case '9':
                return "🇩🇯";
            case ':':
                return "🇩🇰";
            case Opcodes.V15 /* 59 */:
                return "🇩🇲";
            case Opcodes.V16 /* 60 */:
                return "🇩🇴";
            case '=':
                return "🇩🇿";
            case '>':
                return "🇪🇨";
            case '?':
                return "🇪🇪";
            case '@':
                return "🇪🇬";
            case 'A':
                return "🇪🇭";
            case TypeReference.EXCEPTION_PARAMETER /* 66 */:
                return "🇪🇷";
            case TypeReference.INSTANCEOF /* 67 */:
                return "🇪🇸";
            case TypeReference.NEW /* 68 */:
                return "🇪🇹";
            case TypeReference.CONSTRUCTOR_REFERENCE /* 69 */:
                return "🇫🇮";
            case TypeReference.METHOD_REFERENCE /* 70 */:
                return "🇫🇯";
            case TypeReference.CAST /* 71 */:
                return "🇫🇰";
            case TypeReference.CONSTRUCTOR_INVOCATION_TYPE_ARGUMENT /* 72 */:
                return "🇫🇲";
            case TypeReference.METHOD_INVOCATION_TYPE_ARGUMENT /* 73 */:
                return "🇫🇴";
            case TypeReference.CONSTRUCTOR_REFERENCE_TYPE_ARGUMENT /* 74 */:
                return "🇫🇷";
            case TypeReference.METHOD_REFERENCE_TYPE_ARGUMENT /* 75 */:
                return "🇬🇦";
            case 'L':
                return "🇬🇧";
            case 'M':
                return "🇬🇩";
            case 'N':
                return "🇬🇪";
            case Opcodes.IASTORE /* 79 */:
                return "🇬🇫";
            case 'P':
                return "🇬🇬";
            case Opcodes.FASTORE /* 81 */:
                return "🇬🇭";
            case Opcodes.DASTORE /* 82 */:
                return "🇬🇮";
            case Opcodes.AASTORE /* 83 */:
                return "🇬🇱";
            case Opcodes.BASTORE /* 84 */:
                return "🇬🇲";
            case Opcodes.CASTORE /* 85 */:
                return "🇬🇳";
            case 'V':
                return "🇬🇵";
            case Opcodes.POP /* 87 */:
                return "🇬🇶";
            case Opcodes.POP2 /* 88 */:
                return "🇬🇷";
            case Opcodes.DUP /* 89 */:
                return "🇬🇸";
            case Opcodes.DUP_X1 /* 90 */:
                return "🇬🇹";
            case Opcodes.DUP_X2 /* 91 */:
                return "🇬🇺";
            case Opcodes.DUP2 /* 92 */:
                return "🇬🇼";
            case Opcodes.DUP2_X1 /* 93 */:
                return "🇬🇾";
            case Opcodes.DUP2_X2 /* 94 */:
                return "🇭🇰";
            case Opcodes.SWAP /* 95 */:
                return "🇭🇲";
            case '`':
                return "🇭🇳";
            case Opcodes.LADD /* 97 */:
                return "🇭🇷";
            case Opcodes.FADD /* 98 */:
                return "🇭🇹";
            case Opcodes.DADD /* 99 */:
                return "🇭🇺";
            case 'd':
                return "🇮🇩";
            case 'e':
                return "🇮🇪";
            case 'f':
                return "🇮🇱";
            case 'g':
                return "🇮🇲";
            case 'h':
                return "🇮🇳";
            case 'i':
                return "🇮🇴";
            case Opcodes.FMUL /* 106 */:
                return "🇮🇶";
            case Opcodes.DMUL /* 107 */:
                return "🇮🇷";
            case 'l':
                return "🇮🇸";
            case Opcodes.LDIV /* 109 */:
                return "🇮🇹";
            case 'n':
                return "🇯🇪";
            case Opcodes.DDIV /* 111 */:
                return "🇯🇲";
            case 'p':
                return "🇯🇴";
            case Opcodes.LREM /* 113 */:
                return "🇯🇵";
            case Opcodes.FREM /* 114 */:
                return "🇰🇪";
            case Opcodes.DREM /* 115 */:
                return "🇰🇬";
            case 't':
                return "🇰🇭";
            case Opcodes.LNEG /* 117 */:
                return "🇰🇮";
            case Opcodes.FNEG /* 118 */:
                return "🇰🇲";
            case Opcodes.DNEG /* 119 */:
                return "🇰🇳";
            case 'x':
                return "🇰🇵";
            case Opcodes.LSHL /* 121 */:
                return "🇰🇷";
            case 'z':
                return "🇰🇼";
            case Opcodes.LSHR /* 123 */:
                return "🇰🇾";
            case '|':
                return "🇰🇿";
            case Opcodes.LUSHR /* 125 */:
                return "🇱🇦";
            case '~':
                return "🇱🇧";
            case Opcodes.LAND /* 127 */:
                return "🇱🇨";
            case 128:
                return "🇱🇮";
            case Opcodes.LOR /* 129 */:
                return "🇱🇰";
            case 130:
                return "🇱🇷";
            case Opcodes.LXOR /* 131 */:
                return "🇱🇸";
            case Opcodes.IINC /* 132 */:
                return "🇱🇹";
            case Opcodes.I2L /* 133 */:
                return "🇱🇺";
            case Opcodes.I2F /* 134 */:
                return "🇱🇻";
            case Opcodes.I2D /* 135 */:
                return "🇱🇾";
            case Opcodes.L2I /* 136 */:
                return "🇲🇦";
            case Opcodes.L2F /* 137 */:
                return "🇲🇨";
            case Opcodes.L2D /* 138 */:
                return "🇲🇩";
            case Opcodes.F2I /* 139 */:
                return "🇲🇪";
            case Opcodes.F2L /* 140 */:
                return "🇲🇫";
            case Opcodes.F2D /* 141 */:
                return "🇲🇬";
            case Opcodes.D2I /* 142 */:
                return "🇲🇭";
            case Opcodes.D2L /* 143 */:
                return "🇲🇰";
            case Opcodes.D2F /* 144 */:
                return "🇲🇱";
            case Opcodes.I2B /* 145 */:
                return "🇲🇲";
            case Opcodes.I2C /* 146 */:
                return "🇲🇳";
            case Opcodes.I2S /* 147 */:
                return "🇲🇴";
            case Opcodes.LCMP /* 148 */:
                return "🇲🇵";
            case Opcodes.FCMPL /* 149 */:
                return "🇲🇶";
            case Opcodes.FCMPG /* 150 */:
                return "🇲🇷";
            case Opcodes.DCMPL /* 151 */:
                return "🇲🇸";
            case Opcodes.DCMPG /* 152 */:
                return "🇲🇹";
            case 153:
                return "🇲🇺";
            case 154:
                return "🇲🇻";
            case 155:
                return "🇲🇼";
            case 156:
                return "🇲🇽";
            case 157:
                return "🇲🇾";
            case 158:
                return "🇲🇿";
            case Opcodes.IF_ICMPEQ /* 159 */:
                return "🇳🇦";
            case Opcodes.IF_ICMPNE /* 160 */:
                return "🇳🇨";
            case Opcodes.IF_ICMPLT /* 161 */:
                return "🇳🇪";
            case Opcodes.IF_ICMPGE /* 162 */:
                return "🇳🇫";
            case Opcodes.IF_ICMPGT /* 163 */:
                return "🇳🇬";
            case Opcodes.IF_ICMPLE /* 164 */:
                return "🇳🇮";
            case Opcodes.IF_ACMPEQ /* 165 */:
                return "🇳🇱";
            case Opcodes.IF_ACMPNE /* 166 */:
                return "🇳🇴";
            case Opcodes.GOTO /* 167 */:
                return "🇳🇵";
            case Opcodes.JSR /* 168 */:
                return "🇳🇷";
            case Opcodes.RET /* 169 */:
                return "🇳🇺";
            case Opcodes.TABLESWITCH /* 170 */:
                return "🇳🇿";
            case Opcodes.LOOKUPSWITCH /* 171 */:
                return "🇴🇲";
            case Opcodes.IRETURN /* 172 */:
                return "🇵🇦";
            case Opcodes.LRETURN /* 173 */:
                return "🇵🇪";
            case Opcodes.FRETURN /* 174 */:
                return "🇵🇫";
            case Opcodes.DRETURN /* 175 */:
                return "🇵🇬";
            case Opcodes.ARETURN /* 176 */:
                return "🇵🇭";
            case Opcodes.RETURN /* 177 */:
                return "🇵🇰";
            case Opcodes.GETSTATIC /* 178 */:
                return "🇵🇱";
            case Opcodes.PUTSTATIC /* 179 */:
                return "🇵🇲";
            case Opcodes.GETFIELD /* 180 */:
                return "🇵🇳";
            case Opcodes.PUTFIELD /* 181 */:
                return "🇵🇷";
            case Opcodes.INVOKEVIRTUAL /* 182 */:
                return "🇵🇸";
            case Opcodes.INVOKESPECIAL /* 183 */:
                return "🇵🇹";
            case Opcodes.INVOKESTATIC /* 184 */:
                return "🇵🇼";
            case Opcodes.INVOKEINTERFACE /* 185 */:
                return "🇵🇾";
            case Opcodes.INVOKEDYNAMIC /* 186 */:
                return "🇶🇦";
            case Opcodes.NEW /* 187 */:
                return "🇷🇪";
            case Opcodes.NEWARRAY /* 188 */:
                return "🇷🇴";
            case Opcodes.ANEWARRAY /* 189 */:
                return "🇷🇸";
            case Opcodes.ARRAYLENGTH /* 190 */:
                return "🇷🇺";
            case Opcodes.ATHROW /* 191 */:
                return "🇷🇼";
            case Opcodes.CHECKCAST /* 192 */:
                return "🇸🇦";
            case Opcodes.INSTANCEOF /* 193 */:
                return "🇸🇧";
            case Opcodes.MONITORENTER /* 194 */:
                return "🇸🇨";
            case Opcodes.MONITOREXIT /* 195 */:
                return "🇸🇩";
            case 196:
                return "🇸🇪";
            case Opcodes.MULTIANEWARRAY /* 197 */:
                return "🇸🇬";
            case Opcodes.IFNULL /* 198 */:
                return "🇸🇭";
            case Opcodes.IFNONNULL /* 199 */:
                return "🇸🇮";
            case 200:
                return "🇸🇯";
            case 201:
                return "🇸🇰";
            case 202:
                return "🇸🇱";
            case 203:
                return "🇸🇲";
            case 204:
                return "🇸🇳";
            case HttpStatus.SC_RESET_CONTENT /* 205 */:
                return "🇸🇴";
            case HttpStatus.SC_PARTIAL_CONTENT /* 206 */:
                return "🇸🇷";
            case HttpStatus.SC_MULTI_STATUS /* 207 */:
                return "🇸🇸";
            case 208:
                return "🇸🇹";
            case 209:
                return "🇸🇻";
            case 210:
                return "🇸🇽";
            case 211:
                return "🇸🇾";
            case 212:
                return "🇸🇿";
            case 213:
                return "🇹🇨";
            case 214:
                return "🇹🇩";
            case 215:
                return "🇹🇫";
            case 216:
                return "🇹🇬";
            case 217:
                return "🇹🇭";
            case 218:
                return "🇹🇯";
            case 219:
                return "🇹🇰";
            case 220:
                return "🇹🇱";
            case 221:
                return "🇹🇲";
            case 222:
                return "🇹🇳";
            case 223:
                return "🇹🇴";
            case 224:
                return "🇹🇷";
            case 225:
                return "🇹🇹";
            case 226:
                return "🇹🇻";
            case 227:
                return "🇹🇼";
            case 228:
                return "🇹🇿";
            case 229:
                return "🇺🇦";
            case 230:
                return "🇺🇬";
            case 231:
                return "🇺🇲";
            case 232:
                return "🇺🇸";
            case 233:
                return "🇺🇾";
            case 234:
                return "🇺🇿";
            case 235:
                return "🇻🇦";
            case 236:
                return "🇻🇨";
            case 237:
                return "🇻🇪";
            case 238:
                return "🇻🇬";
            case 239:
                return "🇻🇮";
            case 240:
                return "🇻🇳";
            case 241:
                return "🇻🇺";
            case 242:
                return "🇼🇫";
            case 243:
                return "🇼🇸";
            case 244:
                return "🇽🇰";
            case 245:
                return "🇾🇪";
            case 246:
                return "🇾🇹";
            case 247:
                return "🇿🇦";
            case 248:
                return "🇿🇲";
            case 249:
                return "🇿🇼";
            default:
                return " ";
        }
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* renamed from: v */
    public static int m15853v(C11556a c11556a) {
        String lowerCase = c11556a.m15868z().toLowerCase();
        lowerCase.hashCode();
        char c = 65535;
        switch (lowerCase.hashCode()) {
            case 3107:
                if (lowerCase.equals("ad")) {
                    c = 0;
                    break;
                }
                break;
            case 3108:
                if (lowerCase.equals("ae")) {
                    c = 1;
                    break;
                }
                break;
            case 3109:
                if (lowerCase.equals("af")) {
                    c = 2;
                    break;
                }
                break;
            case 3110:
                if (lowerCase.equals("ag")) {
                    c = 3;
                    break;
                }
                break;
            case 3112:
                if (lowerCase.equals("ai")) {
                    c = 4;
                    break;
                }
                break;
            case 3115:
                if (lowerCase.equals("al")) {
                    c = 5;
                    break;
                }
                break;
            case 3116:
                if (lowerCase.equals("am")) {
                    c = 6;
                    break;
                }
                break;
            case 3118:
                if (lowerCase.equals("ao")) {
                    c = 7;
                    break;
                }
                break;
            case 3120:
                if (lowerCase.equals("aq")) {
                    c = '\b';
                    break;
                }
                break;
            case 3121:
                if (lowerCase.equals("ar")) {
                    c = '\t';
                    break;
                }
                break;
            case 3122:
                if (lowerCase.equals("as")) {
                    c = '\n';
                    break;
                }
                break;
            case 3123:
                if (lowerCase.equals("at")) {
                    c = 11;
                    break;
                }
                break;
            case 3124:
                if (lowerCase.equals("au")) {
                    c = '\f';
                    break;
                }
                break;
            case 3126:
                if (lowerCase.equals("aw")) {
                    c = TokenParser.CR;
                    break;
                }
                break;
            case 3127:
                if (lowerCase.equals("ax")) {
                    c = 14;
                    break;
                }
                break;
            case 3129:
                if (lowerCase.equals("az")) {
                    c = 15;
                    break;
                }
                break;
            case 3135:
                if (lowerCase.equals("ba")) {
                    c = 16;
                    break;
                }
                break;
            case 3136:
                if (lowerCase.equals("bb")) {
                    c = 17;
                    break;
                }
                break;
            case 3138:
                if (lowerCase.equals("bd")) {
                    c = 18;
                    break;
                }
                break;
            case 3139:
                if (lowerCase.equals("be")) {
                    c = 19;
                    break;
                }
                break;
            case 3140:
                if (lowerCase.equals("bf")) {
                    c = 20;
                    break;
                }
                break;
            case 3141:
                if (lowerCase.equals("bg")) {
                    c = 21;
                    break;
                }
                break;
            case 3142:
                if (lowerCase.equals("bh")) {
                    c = 22;
                    break;
                }
                break;
            case 3143:
                if (lowerCase.equals("bi")) {
                    c = 23;
                    break;
                }
                break;
            case 3144:
                if (lowerCase.equals("bj")) {
                    c = 24;
                    break;
                }
                break;
            case 3146:
                if (lowerCase.equals("bl")) {
                    c = 25;
                    break;
                }
                break;
            case 3147:
                if (lowerCase.equals("bm")) {
                    c = 26;
                    break;
                }
                break;
            case 3148:
                if (lowerCase.equals("bn")) {
                    c = 27;
                    break;
                }
                break;
            case 3149:
                if (lowerCase.equals("bo")) {
                    c = 28;
                    break;
                }
                break;
            case 3152:
                if (lowerCase.equals("br")) {
                    c = 29;
                    break;
                }
                break;
            case 3153:
                if (lowerCase.equals("bs")) {
                    c = 30;
                    break;
                }
                break;
            case 3154:
                if (lowerCase.equals("bt")) {
                    c = 31;
                    break;
                }
                break;
            case 3157:
                if (lowerCase.equals("bw")) {
                    c = TokenParser.SP;
                    break;
                }
                break;
            case 3159:
                if (lowerCase.equals("by")) {
                    c = '!';
                    break;
                }
                break;
            case 3160:
                if (lowerCase.equals("bz")) {
                    c = TokenParser.DQUOTE;
                    break;
                }
                break;
            case 3166:
                if (lowerCase.equals("ca")) {
                    c = '#';
                    break;
                }
                break;
            case 3168:
                if (lowerCase.equals("cc")) {
                    c = '$';
                    break;
                }
                break;
            case 3169:
                if (lowerCase.equals("cd")) {
                    c = '%';
                    break;
                }
                break;
            case 3171:
                if (lowerCase.equals("cf")) {
                    c = '&';
                    break;
                }
                break;
            case 3172:
                if (lowerCase.equals("cg")) {
                    c = '\'';
                    break;
                }
                break;
            case 3173:
                if (lowerCase.equals("ch")) {
                    c = '(';
                    break;
                }
                break;
            case 3174:
                if (lowerCase.equals("ci")) {
                    c = ')';
                    break;
                }
                break;
            case 3176:
                if (lowerCase.equals("ck")) {
                    c = '*';
                    break;
                }
                break;
            case 3177:
                if (lowerCase.equals("cl")) {
                    c = '+';
                    break;
                }
                break;
            case 3178:
                if (lowerCase.equals("cm")) {
                    c = ',';
                    break;
                }
                break;
            case 3179:
                if (lowerCase.equals("cn")) {
                    c = '-';
                    break;
                }
                break;
            case 3180:
                if (lowerCase.equals("co")) {
                    c = '.';
                    break;
                }
                break;
            case 3183:
                if (lowerCase.equals("cr")) {
                    c = '/';
                    break;
                }
                break;
            case 3186:
                if (lowerCase.equals("cu")) {
                    c = '0';
                    break;
                }
                break;
            case 3187:
                if (lowerCase.equals("cv")) {
                    c = '1';
                    break;
                }
                break;
            case 3188:
                if (lowerCase.equals("cw")) {
                    c = '2';
                    break;
                }
                break;
            case 3189:
                if (lowerCase.equals("cx")) {
                    c = '3';
                    break;
                }
                break;
            case 3190:
                if (lowerCase.equals("cy")) {
                    c = '4';
                    break;
                }
                break;
            case 3191:
                if (lowerCase.equals("cz")) {
                    c = '5';
                    break;
                }
                break;
            case 3201:
                if (lowerCase.equals("de")) {
                    c = '6';
                    break;
                }
                break;
            case 3206:
                if (lowerCase.equals("dj")) {
                    c = '7';
                    break;
                }
                break;
            case 3207:
                if (lowerCase.equals("dk")) {
                    c = '8';
                    break;
                }
                break;
            case 3209:
                if (lowerCase.equals("dm")) {
                    c = '9';
                    break;
                }
                break;
            case 3211:
                if (lowerCase.equals("do")) {
                    c = ':';
                    break;
                }
                break;
            case 3222:
                if (lowerCase.equals("dz")) {
                    c = ';';
                    break;
                }
                break;
            case 3230:
                if (lowerCase.equals("ec")) {
                    c = '<';
                    break;
                }
                break;
            case 3232:
                if (lowerCase.equals("ee")) {
                    c = '=';
                    break;
                }
                break;
            case 3234:
                if (lowerCase.equals("eg")) {
                    c = '>';
                    break;
                }
                break;
            case 3245:
                if (lowerCase.equals("er")) {
                    c = '?';
                    break;
                }
                break;
            case 3246:
                if (lowerCase.equals("es")) {
                    c = '@';
                    break;
                }
                break;
            case 3247:
                if (lowerCase.equals("et")) {
                    c = 'A';
                    break;
                }
                break;
            case 3267:
                if (lowerCase.equals("fi")) {
                    c = 'B';
                    break;
                }
                break;
            case 3268:
                if (lowerCase.equals("fj")) {
                    c = 'C';
                    break;
                }
                break;
            case 3269:
                if (lowerCase.equals("fk")) {
                    c = 'D';
                    break;
                }
                break;
            case 3271:
                if (lowerCase.equals("fm")) {
                    c = 'E';
                    break;
                }
                break;
            case 3273:
                if (lowerCase.equals("fo")) {
                    c = 'F';
                    break;
                }
                break;
            case 3276:
                if (lowerCase.equals("fr")) {
                    c = 'G';
                    break;
                }
                break;
            case 3290:
                if (lowerCase.equals("ga")) {
                    c = 'H';
                    break;
                }
                break;
            case 3291:
                if (lowerCase.equals("gb")) {
                    c = 'I';
                    break;
                }
                break;
            case 3293:
                if (lowerCase.equals("gd")) {
                    c = 'J';
                    break;
                }
                break;
            case 3294:
                if (lowerCase.equals("ge")) {
                    c = 'K';
                    break;
                }
                break;
            case 3295:
                if (lowerCase.equals("gf")) {
                    c = 'L';
                    break;
                }
                break;
            case 3296:
                if (lowerCase.equals("gg")) {
                    c = 'M';
                    break;
                }
                break;
            case 3297:
                if (lowerCase.equals("gh")) {
                    c = 'N';
                    break;
                }
                break;
            case 3298:
                if (lowerCase.equals("gi")) {
                    c = 'O';
                    break;
                }
                break;
            case 3301:
                if (lowerCase.equals("gl")) {
                    c = 'P';
                    break;
                }
                break;
            case 3302:
                if (lowerCase.equals("gm")) {
                    c = 'Q';
                    break;
                }
                break;
            case 3303:
                if (lowerCase.equals("gn")) {
                    c = 'R';
                    break;
                }
                break;
            case 3305:
                if (lowerCase.equals("gp")) {
                    c = 'S';
                    break;
                }
                break;
            case 3306:
                if (lowerCase.equals("gq")) {
                    c = 'T';
                    break;
                }
                break;
            case 3307:
                if (lowerCase.equals("gr")) {
                    c = 'U';
                    break;
                }
                break;
            case 3309:
                if (lowerCase.equals("gt")) {
                    c = 'V';
                    break;
                }
                break;
            case 3310:
                if (lowerCase.equals("gu")) {
                    c = 'W';
                    break;
                }
                break;
            case 3312:
                if (lowerCase.equals("gw")) {
                    c = 'X';
                    break;
                }
                break;
            case 3314:
                if (lowerCase.equals("gy")) {
                    c = 'Y';
                    break;
                }
                break;
            case 3331:
                if (lowerCase.equals("hk")) {
                    c = 'Z';
                    break;
                }
                break;
            case 3334:
                if (lowerCase.equals("hn")) {
                    c = '[';
                    break;
                }
                break;
            case 3338:
                if (lowerCase.equals("hr")) {
                    c = TokenParser.ESCAPE;
                    break;
                }
                break;
            case 3340:
                if (lowerCase.equals("ht")) {
                    c = ']';
                    break;
                }
                break;
            case 3341:
                if (lowerCase.equals("hu")) {
                    c = '^';
                    break;
                }
                break;
            case 3355:
                if (lowerCase.equals(OutcomeConstants.OUTCOME_ID)) {
                    c = '_';
                    break;
                }
                break;
            case 3356:
                if (lowerCase.equals("ie")) {
                    c = '`';
                    break;
                }
                break;
            case 3363:
                if (lowerCase.equals("il")) {
                    c = 'a';
                    break;
                }
                break;
            case 3364:
                if (lowerCase.equals("im")) {
                    c = 'b';
                    break;
                }
                break;
            case 3365:
                if (lowerCase.equals("in")) {
                    c = 'c';
                    break;
                }
                break;
            case 3366:
                if (lowerCase.equals("io")) {
                    c = 'd';
                    break;
                }
                break;
            case 3368:
                if (lowerCase.equals("iq")) {
                    c = 'e';
                    break;
                }
                break;
            case 3369:
                if (lowerCase.equals("ir")) {
                    c = 'f';
                    break;
                }
                break;
            case 3370:
                if (lowerCase.equals("is")) {
                    c = 'g';
                    break;
                }
                break;
            case 3371:
                if (lowerCase.equals("it")) {
                    c = 'h';
                    break;
                }
                break;
            case 3387:
                if (lowerCase.equals("je")) {
                    c = 'i';
                    break;
                }
                break;
            case 3395:
                if (lowerCase.equals("jm")) {
                    c = 'j';
                    break;
                }
                break;
            case 3397:
                if (lowerCase.equals("jo")) {
                    c = 'k';
                    break;
                }
                break;
            case 3398:
                if (lowerCase.equals("jp")) {
                    c = 'l';
                    break;
                }
                break;
            case 3418:
                if (lowerCase.equals("ke")) {
                    c = 'm';
                    break;
                }
                break;
            case 3420:
                if (lowerCase.equals("kg")) {
                    c = 'n';
                    break;
                }
                break;
            case 3421:
                if (lowerCase.equals("kh")) {
                    c = 'o';
                    break;
                }
                break;
            case 3422:
                if (lowerCase.equals("ki")) {
                    c = 'p';
                    break;
                }
                break;
            case 3426:
                if (lowerCase.equals("km")) {
                    c = 'q';
                    break;
                }
                break;
            case 3427:
                if (lowerCase.equals("kn")) {
                    c = 'r';
                    break;
                }
                break;
            case 3429:
                if (lowerCase.equals("kp")) {
                    c = 's';
                    break;
                }
                break;
            case 3431:
                if (lowerCase.equals("kr")) {
                    c = 't';
                    break;
                }
                break;
            case 3436:
                if (lowerCase.equals("kw")) {
                    c = 'u';
                    break;
                }
                break;
            case 3438:
                if (lowerCase.equals("ky")) {
                    c = 'v';
                    break;
                }
                break;
            case 3439:
                if (lowerCase.equals("kz")) {
                    c = 'w';
                    break;
                }
                break;
            case 3445:
                if (lowerCase.equals("la")) {
                    c = 'x';
                    break;
                }
                break;
            case 3446:
                if (lowerCase.equals("lb")) {
                    c = 'y';
                    break;
                }
                break;
            case 3447:
                if (lowerCase.equals("lc")) {
                    c = 'z';
                    break;
                }
                break;
            case 3453:
                if (lowerCase.equals("li")) {
                    c = '{';
                    break;
                }
                break;
            case 3455:
                if (lowerCase.equals("lk")) {
                    c = '|';
                    break;
                }
                break;
            case 3462:
                if (lowerCase.equals("lr")) {
                    c = '}';
                    break;
                }
                break;
            case 3463:
                if (lowerCase.equals("ls")) {
                    c = '~';
                    break;
                }
                break;
            case 3464:
                if (lowerCase.equals("lt")) {
                    c = 127;
                    break;
                }
                break;
            case 3465:
                if (lowerCase.equals("lu")) {
                    c = 128;
                    break;
                }
                break;
            case 3466:
                if (lowerCase.equals("lv")) {
                    c = 129;
                    break;
                }
                break;
            case 3469:
                if (lowerCase.equals("ly")) {
                    c = 130;
                    break;
                }
                break;
            case 3476:
                if (lowerCase.equals("ma")) {
                    c = 131;
                    break;
                }
                break;
            case 3478:
                if (lowerCase.equals("mc")) {
                    c = 132;
                    break;
                }
                break;
            case 3479:
                if (lowerCase.equals("md")) {
                    c = 133;
                    break;
                }
                break;
            case 3480:
                if (lowerCase.equals("me")) {
                    c = 134;
                    break;
                }
                break;
            case 3481:
                if (lowerCase.equals("mf")) {
                    c = 135;
                    break;
                }
                break;
            case 3482:
                if (lowerCase.equals("mg")) {
                    c = 136;
                    break;
                }
                break;
            case 3483:
                if (lowerCase.equals("mh")) {
                    c = 137;
                    break;
                }
                break;
            case 3486:
                if (lowerCase.equals("mk")) {
                    c = 138;
                    break;
                }
                break;
            case 3487:
                if (lowerCase.equals("ml")) {
                    c = 139;
                    break;
                }
                break;
            case 3488:
                if (lowerCase.equals("mm")) {
                    c = 140;
                    break;
                }
                break;
            case 3489:
                if (lowerCase.equals("mn")) {
                    c = 141;
                    break;
                }
                break;
            case 3490:
                if (lowerCase.equals("mo")) {
                    c = 142;
                    break;
                }
                break;
            case 3491:
                if (lowerCase.equals("mp")) {
                    c = 143;
                    break;
                }
                break;
            case 3492:
                if (lowerCase.equals("mq")) {
                    c = 144;
                    break;
                }
                break;
            case 3493:
                if (lowerCase.equals("mr")) {
                    c = 145;
                    break;
                }
                break;
            case 3494:
                if (lowerCase.equals("ms")) {
                    c = 146;
                    break;
                }
                break;
            case 3495:
                if (lowerCase.equals("mt")) {
                    c = 147;
                    break;
                }
                break;
            case 3496:
                if (lowerCase.equals("mu")) {
                    c = 148;
                    break;
                }
                break;
            case 3497:
                if (lowerCase.equals("mv")) {
                    c = 149;
                    break;
                }
                break;
            case 3498:
                if (lowerCase.equals("mw")) {
                    c = 150;
                    break;
                }
                break;
            case 3499:
                if (lowerCase.equals("mx")) {
                    c = 151;
                    break;
                }
                break;
            case 3500:
                if (lowerCase.equals("my")) {
                    c = 152;
                    break;
                }
                break;
            case 3501:
                if (lowerCase.equals("mz")) {
                    c = 153;
                    break;
                }
                break;
            case 3507:
                if (lowerCase.equals("na")) {
                    c = 154;
                    break;
                }
                break;
            case 3509:
                if (lowerCase.equals("nc")) {
                    c = 155;
                    break;
                }
                break;
            case 3511:
                if (lowerCase.equals("ne")) {
                    c = 156;
                    break;
                }
                break;
            case 3512:
                if (lowerCase.equals("nf")) {
                    c = 157;
                    break;
                }
                break;
            case 3513:
                if (lowerCase.equals("ng")) {
                    c = 158;
                    break;
                }
                break;
            case 3515:
                if (lowerCase.equals("ni")) {
                    c = 159;
                    break;
                }
                break;
            case 3518:
                if (lowerCase.equals("nl")) {
                    c = 160;
                    break;
                }
                break;
            case 3521:
                if (lowerCase.equals("no")) {
                    c = 161;
                    break;
                }
                break;
            case 3522:
                if (lowerCase.equals("np")) {
                    c = 162;
                    break;
                }
                break;
            case 3524:
                if (lowerCase.equals("nr")) {
                    c = 163;
                    break;
                }
                break;
            case 3527:
                if (lowerCase.equals("nu")) {
                    c = 164;
                    break;
                }
                break;
            case 3532:
                if (lowerCase.equals("nz")) {
                    c = 165;
                    break;
                }
                break;
            case 3550:
                if (lowerCase.equals("om")) {
                    c = 166;
                    break;
                }
                break;
            case 3569:
                if (lowerCase.equals("pa")) {
                    c = 167;
                    break;
                }
                break;
            case 3573:
                if (lowerCase.equals("pe")) {
                    c = 168;
                    break;
                }
                break;
            case 3574:
                if (lowerCase.equals("pf")) {
                    c = 169;
                    break;
                }
                break;
            case 3575:
                if (lowerCase.equals("pg")) {
                    c = 170;
                    break;
                }
                break;
            case 3576:
                if (lowerCase.equals("ph")) {
                    c = 171;
                    break;
                }
                break;
            case 3579:
                if (lowerCase.equals("pk")) {
                    c = 172;
                    break;
                }
                break;
            case 3580:
                if (lowerCase.equals("pl")) {
                    c = 173;
                    break;
                }
                break;
            case 3581:
                if (lowerCase.equals("pm")) {
                    c = 174;
                    break;
                }
                break;
            case 3582:
                if (lowerCase.equals("pn")) {
                    c = 175;
                    break;
                }
                break;
            case 3586:
                if (lowerCase.equals("pr")) {
                    c = 176;
                    break;
                }
                break;
            case 3587:
                if (lowerCase.equals("ps")) {
                    c = 177;
                    break;
                }
                break;
            case 3588:
                if (lowerCase.equals("pt")) {
                    c = 178;
                    break;
                }
                break;
            case 3591:
                if (lowerCase.equals("pw")) {
                    c = 179;
                    break;
                }
                break;
            case 3593:
                if (lowerCase.equals("py")) {
                    c = 180;
                    break;
                }
                break;
            case 3600:
                if (lowerCase.equals("qa")) {
                    c = 181;
                    break;
                }
                break;
            case 3635:
                if (lowerCase.equals("re")) {
                    c = 182;
                    break;
                }
                break;
            case 3645:
                if (lowerCase.equals("ro")) {
                    c = 183;
                    break;
                }
                break;
            case 3649:
                if (lowerCase.equals("rs")) {
                    c = 184;
                    break;
                }
                break;
            case 3651:
                if (lowerCase.equals("ru")) {
                    c = 185;
                    break;
                }
                break;
            case 3653:
                if (lowerCase.equals("rw")) {
                    c = 186;
                    break;
                }
                break;
            case 3662:
                if (lowerCase.equals("sa")) {
                    c = 187;
                    break;
                }
                break;
            case 3663:
                if (lowerCase.equals("sb")) {
                    c = 188;
                    break;
                }
                break;
            case 3664:
                if (lowerCase.equals("sc")) {
                    c = 189;
                    break;
                }
                break;
            case 3665:
                if (lowerCase.equals("sd")) {
                    c = 190;
                    break;
                }
                break;
            case 3666:
                if (lowerCase.equals("se")) {
                    c = 191;
                    break;
                }
                break;
            case 3668:
                if (lowerCase.equals("sg")) {
                    c = 192;
                    break;
                }
                break;
            case 3669:
                if (lowerCase.equals("sh")) {
                    c = 193;
                    break;
                }
                break;
            case 3670:
                if (lowerCase.equals("si")) {
                    c = 194;
                    break;
                }
                break;
            case 3672:
                if (lowerCase.equals("sk")) {
                    c = 195;
                    break;
                }
                break;
            case 3673:
                if (lowerCase.equals("sl")) {
                    c = 196;
                    break;
                }
                break;
            case 3674:
                if (lowerCase.equals("sm")) {
                    c = 197;
                    break;
                }
                break;
            case 3675:
                if (lowerCase.equals("sn")) {
                    c = 198;
                    break;
                }
                break;
            case 3676:
                if (lowerCase.equals("so")) {
                    c = 199;
                    break;
                }
                break;
            case 3679:
                if (lowerCase.equals("sr")) {
                    c = 200;
                    break;
                }
                break;
            case 3680:
                if (lowerCase.equals("ss")) {
                    c = 201;
                    break;
                }
                break;
            case 3681:
                if (lowerCase.equals("st")) {
                    c = 202;
                    break;
                }
                break;
            case 3683:
                if (lowerCase.equals("sv")) {
                    c = 203;
                    break;
                }
                break;
            case 3685:
                if (lowerCase.equals("sx")) {
                    c = 204;
                    break;
                }
                break;
            case 3686:
                if (lowerCase.equals("sy")) {
                    c = 205;
                    break;
                }
                break;
            case 3687:
                if (lowerCase.equals("sz")) {
                    c = 206;
                    break;
                }
                break;
            case 3695:
                if (lowerCase.equals("tc")) {
                    c = 207;
                    break;
                }
                break;
            case 3696:
                if (lowerCase.equals("td")) {
                    c = 208;
                    break;
                }
                break;
            case 3699:
                if (lowerCase.equals("tg")) {
                    c = 209;
                    break;
                }
                break;
            case 3700:
                if (lowerCase.equals("th")) {
                    c = 210;
                    break;
                }
                break;
            case 3702:
                if (lowerCase.equals("tj")) {
                    c = 211;
                    break;
                }
                break;
            case 3703:
                if (lowerCase.equals("tk")) {
                    c = 212;
                    break;
                }
                break;
            case 3704:
                if (lowerCase.equals("tl")) {
                    c = 213;
                    break;
                }
                break;
            case 3705:
                if (lowerCase.equals("tm")) {
                    c = 214;
                    break;
                }
                break;
            case 3706:
                if (lowerCase.equals("tn")) {
                    c = 215;
                    break;
                }
                break;
            case 3707:
                if (lowerCase.equals("to")) {
                    c = 216;
                    break;
                }
                break;
            case 3710:
                if (lowerCase.equals("tr")) {
                    c = 217;
                    break;
                }
                break;
            case 3712:
                if (lowerCase.equals("tt")) {
                    c = 218;
                    break;
                }
                break;
            case 3714:
                if (lowerCase.equals("tv")) {
                    c = 219;
                    break;
                }
                break;
            case 3715:
                if (lowerCase.equals("tw")) {
                    c = 220;
                    break;
                }
                break;
            case 3718:
                if (lowerCase.equals("tz")) {
                    c = 221;
                    break;
                }
                break;
            case 3724:
                if (lowerCase.equals("ua")) {
                    c = 222;
                    break;
                }
                break;
            case 3730:
                if (lowerCase.equals("ug")) {
                    c = 223;
                    break;
                }
                break;
            case 3742:
                if (lowerCase.equals("us")) {
                    c = 224;
                    break;
                }
                break;
            case 3748:
                if (lowerCase.equals("uy")) {
                    c = 225;
                    break;
                }
                break;
            case 3749:
                if (lowerCase.equals("uz")) {
                    c = 226;
                    break;
                }
                break;
            case 3755:
                if (lowerCase.equals("va")) {
                    c = 227;
                    break;
                }
                break;
            case 3757:
                if (lowerCase.equals("vc")) {
                    c = 228;
                    break;
                }
                break;
            case 3759:
                if (lowerCase.equals("ve")) {
                    c = 229;
                    break;
                }
                break;
            case 3761:
                if (lowerCase.equals("vg")) {
                    c = 230;
                    break;
                }
                break;
            case 3763:
                if (lowerCase.equals("vi")) {
                    c = 231;
                    break;
                }
                break;
            case 3768:
                if (lowerCase.equals("vn")) {
                    c = 232;
                    break;
                }
                break;
            case 3775:
                if (lowerCase.equals("vu")) {
                    c = 233;
                    break;
                }
                break;
            case 3791:
                if (lowerCase.equals("wf")) {
                    c = 234;
                    break;
                }
                break;
            case 3804:
                if (lowerCase.equals("ws")) {
                    c = 235;
                    break;
                }
                break;
            case 3827:
                if (lowerCase.equals("xk")) {
                    c = 236;
                    break;
                }
                break;
            case 3852:
                if (lowerCase.equals("ye")) {
                    c = 237;
                    break;
                }
                break;
            case 3867:
                if (lowerCase.equals("yt")) {
                    c = 238;
                    break;
                }
                break;
            case 3879:
                if (lowerCase.equals("za")) {
                    c = 239;
                    break;
                }
                break;
            case 3891:
                if (lowerCase.equals("zm")) {
                    c = 240;
                    break;
                }
                break;
            case 3901:
                if (lowerCase.equals("zw")) {
                    c = 241;
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
                return v7e.flag_andorra;
            case 1:
                return v7e.flag_uae;
            case 2:
                return v7e.flag_afghanistan;
            case 3:
                return v7e.flag_antigua_and_barbuda;
            case 4:
                return v7e.flag_anguilla;
            case 5:
                return v7e.flag_albania;
            case 6:
                return v7e.flag_armenia;
            case 7:
                return v7e.flag_angola;
            case '\b':
                return v7e.flag_antarctica;
            case '\t':
                return v7e.flag_argentina;
            case '\n':
                return v7e.flag_american_samoa;
            case 11:
                return v7e.flag_austria;
            case '\f':
                return v7e.flag_australia;
            case '\r':
                return v7e.flag_aruba;
            case 14:
                return v7e.flag_aland;
            case 15:
                return v7e.flag_azerbaijan;
            case 16:
                return v7e.flag_bosnia;
            case 17:
                return v7e.flag_barbados;
            case 18:
                return v7e.flag_bangladesh;
            case 19:
                return v7e.flag_belgium;
            case 20:
                return v7e.flag_burkina_faso;
            case 21:
                return v7e.flag_bulgaria;
            case 22:
                return v7e.flag_bahrain;
            case 23:
                return v7e.flag_burundi;
            case 24:
                return v7e.flag_benin;
            case 25:
                return v7e.flag_saint_barthelemy;
            case 26:
                return v7e.flag_bermuda;
            case 27:
                return v7e.flag_brunei;
            case Service.MONITORING_FIELD_NUMBER /* 28 */:
                return v7e.flag_bolivia;
            case Service.SYSTEM_PARAMETERS_FIELD_NUMBER /* 29 */:
                return v7e.flag_brazil;
            case 30:
                return v7e.flag_bahamas;
            case um5.CC_ENABLE_ARENAS_FIELD_NUMBER /* 31 */:
                return v7e.flag_bhutan;
            case ' ':
                return v7e.flag_botswana;
            case '!':
                return v7e.flag_belarus;
            case wm5.IDEMPOTENCY_LEVEL_FIELD_NUMBER /* 34 */:
                return v7e.flag_belize;
            case '#':
                return v7e.flag_canada;
            case um5.OBJC_CLASS_PREFIX_FIELD_NUMBER /* 36 */:
                return v7e.flag_cocos;
            case '%':
                return v7e.flag_democratic_republic_of_the_congo;
            case '&':
                return v7e.flag_central_african_republic;
            case um5.SWIFT_PREFIX_FIELD_NUMBER /* 39 */:
                return v7e.flag_republic_of_the_congo;
            case '(':
                return v7e.flag_switzerland;
            case um5.PHP_NAMESPACE_FIELD_NUMBER /* 41 */:
                return v7e.flag_cote_divoire;
            case um5.PHP_GENERIC_SERVICES_FIELD_NUMBER /* 42 */:
                return v7e.flag_cook_islands;
            case SignatureVisitor.EXTENDS /* 43 */:
                return v7e.flag_chile;
            case um5.PHP_METADATA_NAMESPACE_FIELD_NUMBER /* 44 */:
                return v7e.flag_cameroon;
            case '-':
                return v7e.flag_china;
            case '.':
                return v7e.flag_colombia;
            case '/':
                return v7e.flag_costa_rica;
            case '0':
                return v7e.flag_cuba;
            case '1':
                return v7e.flag_cape_verde;
            case '2':
                return v7e.flag_curacao;
            case '3':
                return v7e.flag_christmas_island;
            case '4':
                return v7e.flag_cyprus;
            case '5':
                return v7e.flag_czech_republic;
            case '6':
                return v7e.flag_germany;
            case '7':
                return v7e.flag_djibouti;
            case '8':
                return v7e.flag_denmark;
            case '9':
                return v7e.flag_dominica;
            case ':':
                return v7e.flag_dominican_republic;
            case Opcodes.V15 /* 59 */:
                return v7e.flag_algeria;
            case Opcodes.V16 /* 60 */:
                return v7e.flag_ecuador;
            case '=':
                return v7e.flag_estonia;
            case '>':
                return v7e.flag_egypt;
            case '?':
                return v7e.flag_eritrea;
            case '@':
                return v7e.flag_spain;
            case 'A':
                return v7e.flag_ethiopia;
            case TypeReference.EXCEPTION_PARAMETER /* 66 */:
                return v7e.flag_finland;
            case TypeReference.INSTANCEOF /* 67 */:
                return v7e.flag_fiji;
            case TypeReference.NEW /* 68 */:
                return v7e.flag_falkland_islands;
            case TypeReference.CONSTRUCTOR_REFERENCE /* 69 */:
                return v7e.flag_micronesia;
            case TypeReference.METHOD_REFERENCE /* 70 */:
                return v7e.flag_faroe_islands;
            case TypeReference.CAST /* 71 */:
                return v7e.flag_france;
            case TypeReference.CONSTRUCTOR_INVOCATION_TYPE_ARGUMENT /* 72 */:
                return v7e.flag_gabon;
            case TypeReference.METHOD_INVOCATION_TYPE_ARGUMENT /* 73 */:
                return v7e.flag_united_kingdom;
            case TypeReference.CONSTRUCTOR_REFERENCE_TYPE_ARGUMENT /* 74 */:
                return v7e.flag_grenada;
            case TypeReference.METHOD_REFERENCE_TYPE_ARGUMENT /* 75 */:
                return v7e.flag_georgia;
            case 'L':
                return v7e.flag_guyane;
            case 'M':
                return v7e.flag_guernsey;
            case 'N':
                return v7e.flag_ghana;
            case Opcodes.IASTORE /* 79 */:
                return v7e.flag_gibraltar;
            case 'P':
                return v7e.flag_greenland;
            case Opcodes.FASTORE /* 81 */:
                return v7e.flag_gambia;
            case Opcodes.DASTORE /* 82 */:
                return v7e.flag_guinea;
            case Opcodes.AASTORE /* 83 */:
                return v7e.flag_guadeloupe;
            case Opcodes.BASTORE /* 84 */:
                return v7e.flag_equatorial_guinea;
            case Opcodes.CASTORE /* 85 */:
                return v7e.flag_greece;
            case 'V':
                return v7e.flag_guatemala;
            case Opcodes.POP /* 87 */:
                return v7e.flag_guam;
            case Opcodes.POP2 /* 88 */:
                return v7e.flag_guinea_bissau;
            case Opcodes.DUP /* 89 */:
                return v7e.flag_guyana;
            case Opcodes.DUP_X1 /* 90 */:
                return v7e.flag_hong_kong;
            case Opcodes.DUP_X2 /* 91 */:
                return v7e.flag_honduras;
            case Opcodes.DUP2 /* 92 */:
                return v7e.flag_croatia;
            case Opcodes.DUP2_X1 /* 93 */:
                return v7e.flag_haiti;
            case Opcodes.DUP2_X2 /* 94 */:
                return v7e.flag_hungary;
            case Opcodes.SWAP /* 95 */:
                return v7e.flag_indonesia;
            case '`':
                return v7e.flag_ireland;
            case Opcodes.LADD /* 97 */:
                return v7e.flag_israel;
            case Opcodes.FADD /* 98 */:
                return v7e.flag_isleof_man;
            case Opcodes.DADD /* 99 */:
                return v7e.flag_india;
            case 'd':
                return v7e.flag_british_indian_ocean_territory;
            case 'e':
                return v7e.flag_iraq_new;
            case 'f':
                return v7e.flag_iran;
            case 'g':
                return v7e.flag_iceland;
            case 'h':
                return v7e.flag_italy;
            case 'i':
                return v7e.flag_jersey;
            case Opcodes.FMUL /* 106 */:
                return v7e.flag_jamaica;
            case Opcodes.DMUL /* 107 */:
                return v7e.flag_jordan;
            case 'l':
                return v7e.flag_japan;
            case Opcodes.LDIV /* 109 */:
                return v7e.flag_kenya;
            case 'n':
                return v7e.flag_kyrgyzstan;
            case Opcodes.DDIV /* 111 */:
                return v7e.flag_cambodia;
            case 'p':
                return v7e.flag_kiribati;
            case Opcodes.LREM /* 113 */:
                return v7e.flag_comoros;
            case Opcodes.FREM /* 114 */:
                return v7e.flag_saint_kitts_and_nevis;
            case Opcodes.DREM /* 115 */:
                return v7e.flag_north_korea;
            case 't':
                return v7e.flag_south_korea;
            case Opcodes.LNEG /* 117 */:
                return v7e.flag_kuwait;
            case Opcodes.FNEG /* 118 */:
                return v7e.flag_cayman_islands;
            case Opcodes.DNEG /* 119 */:
                return v7e.flag_kazakhstan;
            case 'x':
                return v7e.flag_laos;
            case Opcodes.LSHL /* 121 */:
                return v7e.flag_lebanon;
            case 'z':
                return v7e.flag_saint_lucia;
            case Opcodes.LSHR /* 123 */:
                return v7e.flag_liechtenstein;
            case '|':
                return v7e.flag_sri_lanka;
            case Opcodes.LUSHR /* 125 */:
                return v7e.flag_liberia;
            case '~':
                return v7e.flag_lesotho;
            case Opcodes.LAND /* 127 */:
                return v7e.flag_lithuania;
            case 128:
                return v7e.flag_luxembourg;
            case Opcodes.LOR /* 129 */:
                return v7e.flag_latvia;
            case 130:
                return v7e.flag_libya;
            case Opcodes.LXOR /* 131 */:
                return v7e.flag_morocco;
            case Opcodes.IINC /* 132 */:
                return v7e.flag_monaco;
            case Opcodes.I2L /* 133 */:
                return v7e.flag_moldova;
            case Opcodes.I2F /* 134 */:
                return v7e.flag_of_montenegro;
            case Opcodes.I2D /* 135 */:
                return v7e.flag_saint_martin;
            case Opcodes.L2I /* 136 */:
                return v7e.flag_madagascar;
            case Opcodes.L2F /* 137 */:
                return v7e.flag_marshall_islands;
            case Opcodes.L2D /* 138 */:
                return v7e.flag_macedonia;
            case Opcodes.F2I /* 139 */:
                return v7e.flag_mali;
            case Opcodes.F2L /* 140 */:
                return v7e.flag_myanmar;
            case Opcodes.F2D /* 141 */:
                return v7e.flag_mongolia;
            case Opcodes.D2I /* 142 */:
                return v7e.flag_macao;
            case Opcodes.D2L /* 143 */:
                return v7e.flag_northern_mariana_islands;
            case Opcodes.D2F /* 144 */:
                return v7e.flag_martinique;
            case Opcodes.I2B /* 145 */:
                return v7e.flag_mauritania;
            case Opcodes.I2C /* 146 */:
                return v7e.flag_montserrat;
            case Opcodes.I2S /* 147 */:
                return v7e.flag_malta;
            case Opcodes.LCMP /* 148 */:
                return v7e.flag_mauritius;
            case Opcodes.FCMPL /* 149 */:
                return v7e.flag_maldives;
            case Opcodes.FCMPG /* 150 */:
                return v7e.flag_malawi;
            case Opcodes.DCMPL /* 151 */:
                return v7e.flag_mexico;
            case Opcodes.DCMPG /* 152 */:
                return v7e.flag_malaysia;
            case 153:
                return v7e.flag_mozambique;
            case 154:
                return v7e.flag_namibia;
            case 155:
                return v7e.flag_new_caledonia;
            case 156:
                return v7e.flag_niger;
            case 157:
                return v7e.flag_norfolk_island;
            case 158:
                return v7e.flag_nigeria;
            case Opcodes.IF_ICMPEQ /* 159 */:
                return v7e.flag_nicaragua;
            case Opcodes.IF_ICMPNE /* 160 */:
                return v7e.flag_netherlands;
            case Opcodes.IF_ICMPLT /* 161 */:
                return v7e.flag_norway;
            case Opcodes.IF_ICMPGE /* 162 */:
                return v7e.flag_nepal;
            case Opcodes.IF_ICMPGT /* 163 */:
                return v7e.flag_nauru;
            case Opcodes.IF_ICMPLE /* 164 */:
                return v7e.flag_niue;
            case Opcodes.IF_ACMPEQ /* 165 */:
                return v7e.flag_new_zealand;
            case Opcodes.IF_ACMPNE /* 166 */:
                return v7e.flag_oman;
            case Opcodes.GOTO /* 167 */:
                return v7e.flag_panama;
            case Opcodes.JSR /* 168 */:
                return v7e.flag_peru;
            case Opcodes.RET /* 169 */:
                return v7e.flag_french_polynesia;
            case Opcodes.TABLESWITCH /* 170 */:
                return v7e.flag_papua_new_guinea;
            case Opcodes.LOOKUPSWITCH /* 171 */:
                return v7e.flag_philippines;
            case Opcodes.IRETURN /* 172 */:
                return v7e.flag_pakistan;
            case Opcodes.LRETURN /* 173 */:
                return v7e.flag_poland;
            case Opcodes.FRETURN /* 174 */:
                return v7e.flag_saint_pierre;
            case Opcodes.DRETURN /* 175 */:
                return v7e.flag_pitcairn_islands;
            case Opcodes.ARETURN /* 176 */:
                return v7e.flag_puerto_rico;
            case Opcodes.RETURN /* 177 */:
                return v7e.flag_palestine;
            case Opcodes.GETSTATIC /* 178 */:
                return v7e.flag_portugal;
            case Opcodes.PUTSTATIC /* 179 */:
                return v7e.flag_palau;
            case Opcodes.GETFIELD /* 180 */:
                return v7e.flag_paraguay;
            case Opcodes.PUTFIELD /* 181 */:
                return v7e.flag_qatar;
            case Opcodes.INVOKEVIRTUAL /* 182 */:
                return v7e.flag_martinique;
            case Opcodes.INVOKESPECIAL /* 183 */:
                return v7e.flag_romania;
            case Opcodes.INVOKESTATIC /* 184 */:
                return v7e.flag_serbia;
            case Opcodes.INVOKEINTERFACE /* 185 */:
                return v7e.flag_russian_federation;
            case Opcodes.INVOKEDYNAMIC /* 186 */:
                return v7e.flag_rwanda;
            case Opcodes.NEW /* 187 */:
                return v7e.flag_saudi_arabia;
            case Opcodes.NEWARRAY /* 188 */:
                return v7e.flag_soloman_islands;
            case Opcodes.ANEWARRAY /* 189 */:
                return v7e.flag_seychelles;
            case Opcodes.ARRAYLENGTH /* 190 */:
                return v7e.flag_sudan;
            case Opcodes.ATHROW /* 191 */:
                return v7e.flag_sweden;
            case Opcodes.CHECKCAST /* 192 */:
                return v7e.flag_singapore;
            case Opcodes.INSTANCEOF /* 193 */:
                return v7e.flag_saint_helena;
            case Opcodes.MONITORENTER /* 194 */:
                return v7e.flag_slovenia;
            case Opcodes.MONITOREXIT /* 195 */:
                return v7e.flag_slovakia;
            case 196:
                return v7e.flag_sierra_leone;
            case Opcodes.MULTIANEWARRAY /* 197 */:
                return v7e.flag_san_marino;
            case Opcodes.IFNULL /* 198 */:
                return v7e.flag_senegal;
            case Opcodes.IFNONNULL /* 199 */:
                return v7e.flag_somalia;
            case 200:
                return v7e.flag_suriname;
            case 201:
                return v7e.flag_south_sudan;
            case 202:
                return v7e.flag_sao_tome_and_principe;
            case 203:
                return v7e.flag_el_salvador;
            case 204:
                return v7e.flag_sint_maarten;
            case HttpStatus.SC_RESET_CONTENT /* 205 */:
                return v7e.flag_syria;
            case HttpStatus.SC_PARTIAL_CONTENT /* 206 */:
                return v7e.flag_swaziland;
            case HttpStatus.SC_MULTI_STATUS /* 207 */:
                return v7e.flag_turks_and_caicos_islands;
            case 208:
                return v7e.flag_chad;
            case 209:
                return v7e.flag_togo;
            case 210:
                return v7e.flag_thailand;
            case 211:
                return v7e.flag_tajikistan;
            case 212:
                return v7e.flag_tokelau;
            case 213:
                return v7e.flag_timor_leste;
            case 214:
                return v7e.flag_turkmenistan;
            case 215:
                return v7e.flag_tunisia;
            case 216:
                return v7e.flag_tonga;
            case 217:
                return v7e.flag_turkey;
            case 218:
                return v7e.flag_trinidad_and_tobago;
            case 219:
                return v7e.flag_tuvalu;
            case 220:
                return v7e.flag_taiwan;
            case 221:
                return v7e.flag_tanzania;
            case 222:
                return v7e.flag_ukraine;
            case 223:
                return v7e.flag_uganda;
            case 224:
                return v7e.flag_united_states_of_america;
            case 225:
                return v7e.flag_uruguay;
            case 226:
                return v7e.flag_uzbekistan;
            case 227:
                return v7e.flag_vatican_city;
            case 228:
                return v7e.flag_saint_vicent_and_the_grenadines;
            case 229:
                return v7e.flag_venezuela;
            case 230:
                return v7e.flag_british_virgin_islands;
            case 231:
                return v7e.flag_us_virgin_islands;
            case 232:
                return v7e.flag_vietnam;
            case 233:
                return v7e.flag_vanuatu;
            case 234:
                return v7e.flag_wallis_and_futuna;
            case 235:
                return v7e.flag_samoa;
            case 236:
                return v7e.flag_kosovo;
            case 237:
                return v7e.flag_yemen;
            case 238:
                return v7e.flag_martinique;
            case 239:
                return v7e.flag_south_africa;
            case 240:
                return v7e.flag_zambia;
            case 241:
                return v7e.flag_zimbabwe;
            default:
                return v7e.flag_transparent;
        }
    }

    /* renamed from: w */
    public static List m15854w() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new C11556a("ad", "376", "Andorra", f13473f));
        arrayList.add(new C11556a("ae", "971", "United Arab Emirates (UAE)", f13473f));
        arrayList.add(new C11556a("af", "93", "Afghanistan", f13473f));
        arrayList.add(new C11556a("ag", "1", "Antigua and Barbuda", f13473f));
        arrayList.add(new C11556a("ai", "1", "Anguilla", f13473f));
        arrayList.add(new C11556a("al", "355", "Albania", f13473f));
        arrayList.add(new C11556a("am", "374", "Armenia", f13473f));
        arrayList.add(new C11556a("ao", "244", "Angola", f13473f));
        arrayList.add(new C11556a("aq", "672", "Antarctica", f13473f));
        arrayList.add(new C11556a("ar", "54", "Argentina", f13473f));
        arrayList.add(new C11556a("as", "1", "American Samoa", f13473f));
        arrayList.add(new C11556a("at", "43", "Austria", f13473f));
        arrayList.add(new C11556a("au", "61", "Australia", f13473f));
        arrayList.add(new C11556a("aw", "297", "Aruba", f13473f));
        arrayList.add(new C11556a("ax", "358", "Åland Islands", f13473f));
        arrayList.add(new C11556a("az", "994", "Azerbaijan", f13473f));
        arrayList.add(new C11556a("ba", "387", "Bosnia And Herzegovina", f13473f));
        arrayList.add(new C11556a("bb", "1", "Barbados", f13473f));
        arrayList.add(new C11556a("bd", "880", "Bangladesh", f13473f));
        arrayList.add(new C11556a("be", "32", "Belgium", f13473f));
        arrayList.add(new C11556a("bf", "226", "Burkina Faso", f13473f));
        arrayList.add(new C11556a("bg", "359", "Bulgaria", f13473f));
        arrayList.add(new C11556a("bh", "973", "Bahrain", f13473f));
        arrayList.add(new C11556a("bi", "257", "Burundi", f13473f));
        arrayList.add(new C11556a("bj", "229", "Benin", f13473f));
        arrayList.add(new C11556a("bl", "590", "Saint Barthélemy", f13473f));
        arrayList.add(new C11556a("bm", "1", "Bermuda", f13473f));
        arrayList.add(new C11556a("bn", "673", "Brunei Darussalam", f13473f));
        arrayList.add(new C11556a("bo", "591", "Bolivia, Plurinational State Of", f13473f));
        arrayList.add(new C11556a("br", "55", "Brazil", f13473f));
        arrayList.add(new C11556a("bs", "1", "Bahamas", f13473f));
        arrayList.add(new C11556a("bt", "975", "Bhutan", f13473f));
        arrayList.add(new C11556a("bw", "267", "Botswana", f13473f));
        arrayList.add(new C11556a("by", "375", "Belarus", f13473f));
        arrayList.add(new C11556a("bz", "501", "Belize", f13473f));
        arrayList.add(new C11556a("ca", "1", "Canada", f13473f));
        arrayList.add(new C11556a("cc", "61", "Cocos (keeling) Islands", f13473f));
        arrayList.add(new C11556a("cd", "243", "Congo, The Democratic Republic Of The", f13473f));
        arrayList.add(new C11556a("cf", "236", "Central African Republic", f13473f));
        arrayList.add(new C11556a("cg", "242", "Congo", f13473f));
        arrayList.add(new C11556a("ch", "41", "Switzerland", f13473f));
        arrayList.add(new C11556a("ci", "225", "Côte D'ivoire", f13473f));
        arrayList.add(new C11556a("ck", "682", "Cook Islands", f13473f));
        arrayList.add(new C11556a("cl", "56", "Chile", f13473f));
        arrayList.add(new C11556a("cm", "237", "Cameroon", f13473f));
        arrayList.add(new C11556a("cn", "86", "China", f13473f));
        arrayList.add(new C11556a("co", "57", "Colombia", f13473f));
        arrayList.add(new C11556a("cr", "506", "Costa Rica", f13473f));
        arrayList.add(new C11556a("cu", "53", "Cuba", f13473f));
        arrayList.add(new C11556a("cv", "238", "Cape Verde", f13473f));
        arrayList.add(new C11556a("cw", "599", "Curaçao", f13473f));
        arrayList.add(new C11556a("cx", "61", "Christmas Island", f13473f));
        arrayList.add(new C11556a("cy", "357", "Cyprus", f13473f));
        arrayList.add(new C11556a("cz", "420", "Czech Republic", f13473f));
        arrayList.add(new C11556a("de", "49", "Germany", f13473f));
        arrayList.add(new C11556a("dj", "253", "Djibouti", f13473f));
        arrayList.add(new C11556a("dk", "45", "Denmark", f13473f));
        arrayList.add(new C11556a("dm", "1", "Dominica", f13473f));
        arrayList.add(new C11556a("do", "1", "Dominican Republic", f13473f));
        arrayList.add(new C11556a("dz", "213", "Algeria", f13473f));
        arrayList.add(new C11556a("ec", "593", "Ecuador", f13473f));
        arrayList.add(new C11556a("ee", "372", "Estonia", f13473f));
        arrayList.add(new C11556a("eg", "20", "Egypt", f13473f));
        arrayList.add(new C11556a("er", "291", "Eritrea", f13473f));
        arrayList.add(new C11556a("es", "34", "Spain", f13473f));
        arrayList.add(new C11556a("et", "251", "Ethiopia", f13473f));
        arrayList.add(new C11556a("fi", "358", "Finland", f13473f));
        arrayList.add(new C11556a("fj", "679", "Fiji", f13473f));
        arrayList.add(new C11556a("fk", "500", "Falkland Islands (malvinas)", f13473f));
        arrayList.add(new C11556a("fm", "691", "Micronesia, Federated States Of", f13473f));
        arrayList.add(new C11556a("fo", "298", "Faroe Islands", f13473f));
        arrayList.add(new C11556a("fr", "33", "France", f13473f));
        arrayList.add(new C11556a("ga", "241", "Gabon", f13473f));
        arrayList.add(new C11556a("gb", "44", "United Kingdom", f13473f));
        arrayList.add(new C11556a("gd", "1", "Grenada", f13473f));
        arrayList.add(new C11556a("ge", "995", "Georgia", f13473f));
        arrayList.add(new C11556a("gf", "594", "French Guyana", f13473f));
        arrayList.add(new C11556a("gh", "233", "Ghana", f13473f));
        arrayList.add(new C11556a("gi", "350", "Gibraltar", f13473f));
        arrayList.add(new C11556a("gl", "299", "Greenland", f13473f));
        arrayList.add(new C11556a("gm", "220", "Gambia", f13473f));
        arrayList.add(new C11556a("gn", "224", "Guinea", f13473f));
        arrayList.add(new C11556a("gp", "450", "Guadeloupe", f13473f));
        arrayList.add(new C11556a("gq", "240", "Equatorial Guinea", f13473f));
        arrayList.add(new C11556a("gr", "30", "Greece", f13473f));
        arrayList.add(new C11556a("gt", "502", "Guatemala", f13473f));
        arrayList.add(new C11556a("gu", "1", "Guam", f13473f));
        arrayList.add(new C11556a("gw", "245", "Guinea-bissau", f13473f));
        arrayList.add(new C11556a("gy", "592", "Guyana", f13473f));
        arrayList.add(new C11556a("hk", "852", "Hong Kong", f13473f));
        arrayList.add(new C11556a("hn", "504", "Honduras", f13473f));
        arrayList.add(new C11556a("hr", "385", "Croatia", f13473f));
        arrayList.add(new C11556a("ht", "509", "Haiti", f13473f));
        arrayList.add(new C11556a("hu", "36", "Hungary", f13473f));
        arrayList.add(new C11556a(OutcomeConstants.OUTCOME_ID, "62", "Indonesia", f13473f));
        arrayList.add(new C11556a("ie", "353", "Ireland", f13473f));
        arrayList.add(new C11556a("il", "972", "Israel", f13473f));
        arrayList.add(new C11556a("im", "44", "Isle Of Man", f13473f));
        arrayList.add(new C11556a("is", "354", "Iceland", f13473f));
        arrayList.add(new C11556a("in", "91", "India", f13473f));
        arrayList.add(new C11556a("io", "246", "British Indian Ocean Territory", f13473f));
        arrayList.add(new C11556a("iq", "964", "Iraq", f13473f));
        arrayList.add(new C11556a("ir", "98", "Iran, Islamic Republic Of", f13473f));
        arrayList.add(new C11556a("it", "39", "Italy", f13473f));
        arrayList.add(new C11556a("je", "44", "Jersey ", f13473f));
        arrayList.add(new C11556a("jm", "1", "Jamaica", f13473f));
        arrayList.add(new C11556a("jo", "962", "Jordan", f13473f));
        arrayList.add(new C11556a("jp", "81", "Japan", f13473f));
        arrayList.add(new C11556a("ke", "254", "Kenya", f13473f));
        arrayList.add(new C11556a("kg", "996", "Kyrgyzstan", f13473f));
        arrayList.add(new C11556a("kh", "855", "Cambodia", f13473f));
        arrayList.add(new C11556a("ki", "686", "Kiribati", f13473f));
        arrayList.add(new C11556a("km", "269", "Comoros", f13473f));
        arrayList.add(new C11556a("kn", "1", "Saint Kitts and Nevis", f13473f));
        arrayList.add(new C11556a("kp", "850", "North Korea", f13473f));
        arrayList.add(new C11556a("kr", "82", "South Korea", f13473f));
        arrayList.add(new C11556a("kw", "965", "Kuwait", f13473f));
        arrayList.add(new C11556a("ky", "1", "Cayman Islands", f13473f));
        arrayList.add(new C11556a("kz", "7", "Kazakhstan", f13473f));
        arrayList.add(new C11556a("la", "856", "Lao People's Democratic Republic", f13473f));
        arrayList.add(new C11556a("lb", "961", "Lebanon", f13473f));
        arrayList.add(new C11556a("lc", "1", "Saint Lucia", f13473f));
        arrayList.add(new C11556a("li", "423", "Liechtenstein", f13473f));
        arrayList.add(new C11556a("lk", "94", "Sri Lanka", f13473f));
        arrayList.add(new C11556a("lr", "231", "Liberia", f13473f));
        arrayList.add(new C11556a("ls", "266", "Lesotho", f13473f));
        arrayList.add(new C11556a("lt", "370", "Lithuania", f13473f));
        arrayList.add(new C11556a("lu", "352", "Luxembourg", f13473f));
        arrayList.add(new C11556a("lv", "371", "Latvia", f13473f));
        arrayList.add(new C11556a("ly", "218", "Libya", f13473f));
        arrayList.add(new C11556a("ma", "212", "Morocco", f13473f));
        arrayList.add(new C11556a("mc", "377", "Monaco", f13473f));
        arrayList.add(new C11556a("md", "373", "Moldova, Republic Of", f13473f));
        arrayList.add(new C11556a("me", "382", "Montenegro", f13473f));
        arrayList.add(new C11556a("mf", "590", "Saint Martin", f13473f));
        arrayList.add(new C11556a("mg", "261", "Madagascar", f13473f));
        arrayList.add(new C11556a("mh", "692", "Marshall Islands", f13473f));
        arrayList.add(new C11556a("mk", "389", "Macedonia (FYROM)", f13473f));
        arrayList.add(new C11556a("ml", "223", "Mali", f13473f));
        arrayList.add(new C11556a("mm", "95", "Myanmar", f13473f));
        arrayList.add(new C11556a("mn", "976", "Mongolia", f13473f));
        arrayList.add(new C11556a("mo", "853", "Macau", f13473f));
        arrayList.add(new C11556a("mp", "1", "Northern Mariana Islands", f13473f));
        arrayList.add(new C11556a("mq", "596", "Martinique", f13473f));
        arrayList.add(new C11556a("mr", "222", "Mauritania", f13473f));
        arrayList.add(new C11556a("ms", "1", "Montserrat", f13473f));
        arrayList.add(new C11556a("mt", "356", "Malta", f13473f));
        arrayList.add(new C11556a("mu", "230", "Mauritius", f13473f));
        arrayList.add(new C11556a("mv", "960", "Maldives", f13473f));
        arrayList.add(new C11556a("mw", "265", "Malawi", f13473f));
        arrayList.add(new C11556a("mx", "52", "Mexico", f13473f));
        arrayList.add(new C11556a("my", "60", "Malaysia", f13473f));
        arrayList.add(new C11556a("mz", "258", "Mozambique", f13473f));
        arrayList.add(new C11556a("na", "264", "Namibia", f13473f));
        arrayList.add(new C11556a("nc", "687", "New Caledonia", f13473f));
        arrayList.add(new C11556a("ne", "227", "Niger", f13473f));
        arrayList.add(new C11556a("nf", "672", "Norfolk Islands", f13473f));
        arrayList.add(new C11556a("ng", "234", "Nigeria", f13473f));
        arrayList.add(new C11556a("ni", "505", "Nicaragua", f13473f));
        arrayList.add(new C11556a("nl", "31", "Netherlands", f13473f));
        arrayList.add(new C11556a("no", "47", "Norway", f13473f));
        arrayList.add(new C11556a("np", "977", "Nepal", f13473f));
        arrayList.add(new C11556a("nr", "674", "Nauru", f13473f));
        arrayList.add(new C11556a("nu", "683", "Niue", f13473f));
        arrayList.add(new C11556a("nz", "64", "New Zealand", f13473f));
        arrayList.add(new C11556a("om", "968", "Oman", f13473f));
        arrayList.add(new C11556a("pa", "507", "Panama", f13473f));
        arrayList.add(new C11556a("pe", "51", "Peru", f13473f));
        arrayList.add(new C11556a("pf", "689", "French Polynesia", f13473f));
        arrayList.add(new C11556a("pg", "675", "Papua New Guinea", f13473f));
        arrayList.add(new C11556a("ph", "63", "Philippines", f13473f));
        arrayList.add(new C11556a("pk", "92", "Pakistan", f13473f));
        arrayList.add(new C11556a("pl", "48", "Poland", f13473f));
        arrayList.add(new C11556a("pm", "508", "Saint Pierre And Miquelon", f13473f));
        arrayList.add(new C11556a("pn", "870", "Pitcairn Islands", f13473f));
        arrayList.add(new C11556a("pr", "1", "Puerto Rico", f13473f));
        arrayList.add(new C11556a("ps", "970", "Palestine", f13473f));
        arrayList.add(new C11556a("pt", "351", "Portugal", f13473f));
        arrayList.add(new C11556a("pw", "680", "Palau", f13473f));
        arrayList.add(new C11556a("py", "595", "Paraguay", f13473f));
        arrayList.add(new C11556a("qa", "974", "Qatar", f13473f));
        arrayList.add(new C11556a("re", "262", "Réunion", f13473f));
        arrayList.add(new C11556a("ro", "40", "Romania", f13473f));
        arrayList.add(new C11556a("rs", "381", "Serbia", f13473f));
        arrayList.add(new C11556a("ru", "7", "Russian Federation", f13473f));
        arrayList.add(new C11556a("rw", "250", "Rwanda", f13473f));
        arrayList.add(new C11556a("sa", "966", "Saudi Arabia", f13473f));
        arrayList.add(new C11556a("sb", "677", "Solomon Islands", f13473f));
        arrayList.add(new C11556a("sc", "248", "Seychelles", f13473f));
        arrayList.add(new C11556a("sd", "249", "Sudan", f13473f));
        arrayList.add(new C11556a("se", "46", "Sweden", f13473f));
        arrayList.add(new C11556a("sg", "65", "Singapore", f13473f));
        arrayList.add(new C11556a("sh", "290", "Saint Helena, Ascension And Tristan Da Cunha", f13473f));
        arrayList.add(new C11556a("si", "386", "Slovenia", f13473f));
        arrayList.add(new C11556a("sk", "421", "Slovakia", f13473f));
        arrayList.add(new C11556a("sl", "232", "Sierra Leone", f13473f));
        arrayList.add(new C11556a("sm", "378", "San Marino", f13473f));
        arrayList.add(new C11556a("sn", "221", "Senegal", f13473f));
        arrayList.add(new C11556a("so", "252", "Somalia", f13473f));
        arrayList.add(new C11556a("sr", "597", "Suriname", f13473f));
        arrayList.add(new C11556a("ss", "211", "South Sudan", f13473f));
        arrayList.add(new C11556a("st", "239", "Sao Tome And Principe", f13473f));
        arrayList.add(new C11556a("sv", "503", "El Salvador", f13473f));
        arrayList.add(new C11556a("sx", "1", "Sint Maarten", f13473f));
        arrayList.add(new C11556a("sy", "963", "Syrian Arab Republic", f13473f));
        arrayList.add(new C11556a("sz", "268", "Swaziland", f13473f));
        arrayList.add(new C11556a("tc", "1", "Turks and Caicos Islands", f13473f));
        arrayList.add(new C11556a("td", "235", "Chad", f13473f));
        arrayList.add(new C11556a("tg", "228", "Togo", f13473f));
        arrayList.add(new C11556a("th", "66", "Thailand", f13473f));
        arrayList.add(new C11556a("tj", "992", "Tajikistan", f13473f));
        arrayList.add(new C11556a("tk", "690", "Tokelau", f13473f));
        arrayList.add(new C11556a("tl", "670", "Timor-leste", f13473f));
        arrayList.add(new C11556a("tm", "993", "Turkmenistan", f13473f));
        arrayList.add(new C11556a("tn", "216", "Tunisia", f13473f));
        arrayList.add(new C11556a("to", "676", "Tonga", f13473f));
        arrayList.add(new C11556a("tr", "90", "Turkey", f13473f));
        arrayList.add(new C11556a("tt", "1", "Trinidad &amp; Tobago", f13473f));
        arrayList.add(new C11556a("tv", "688", "Tuvalu", f13473f));
        arrayList.add(new C11556a("tw", "886", "Taiwan", f13473f));
        arrayList.add(new C11556a("tz", "255", "Tanzania, United Republic Of", f13473f));
        arrayList.add(new C11556a("ua", "380", "Ukraine", f13473f));
        arrayList.add(new C11556a("ug", "256", "Uganda", f13473f));
        arrayList.add(new C11556a("us", "1", "United States", f13473f));
        arrayList.add(new C11556a("uy", "598", "Uruguay", f13473f));
        arrayList.add(new C11556a("uz", "998", "Uzbekistan", f13473f));
        arrayList.add(new C11556a("va", "379", "Holy See (vatican City State)", f13473f));
        arrayList.add(new C11556a("vc", "1", "Saint Vincent &amp; The Grenadines", f13473f));
        arrayList.add(new C11556a("ve", "58", "Venezuela, Bolivarian Republic Of", f13473f));
        arrayList.add(new C11556a("vg", "1", "British Virgin Islands", f13473f));
        arrayList.add(new C11556a("vi", "1", "US Virgin Islands", f13473f));
        arrayList.add(new C11556a("vn", "84", "Vietnam", f13473f));
        arrayList.add(new C11556a("vu", "678", "Vanuatu", f13473f));
        arrayList.add(new C11556a("wf", "681", "Wallis And Futuna", f13473f));
        arrayList.add(new C11556a("ws", "685", "Samoa", f13473f));
        arrayList.add(new C11556a("xk", "383", "Kosovo", f13473f));
        arrayList.add(new C11556a("ye", "967", "Yemen", f13473f));
        arrayList.add(new C11556a("yt", "262", "Mayotte", f13473f));
        arrayList.add(new C11556a("za", "27", "South Africa", f13473f));
        arrayList.add(new C11556a("zm", "260", "Zambia", f13473f));
        arrayList.add(new C11556a("zw", "263", "Zimbabwe", f13473f));
        return arrayList;
    }

    /* renamed from: x */
    public static List m15855x(Context context, CountryCodePicker.EnumC11551i enumC11551i) {
        List list;
        CountryCodePicker.EnumC11551i enumC11551i2 = f13474g;
        if (enumC11551i2 == null || enumC11551i != enumC11551i2 || (list = f13478x) == null || list.size() == 0) {
            m15842E(context, enumC11551i);
        }
        return f13478x;
    }

    /* renamed from: B */
    public String m15856B() {
        return this.f13480b;
    }

    /* renamed from: D */
    public boolean m15857D(String str) {
        String lowerCase = str.toLowerCase();
        return m15864c("Name", m15867y(), lowerCase) || m15864c("NameCode", m15868z(), lowerCase) || m15864c("PhoneCode", m15856B(), lowerCase) || m15864c("EnglishName", m15865s(), lowerCase);
    }

    /* renamed from: F */
    public void m15858F() {
        try {
            StringBuilder sb = new StringBuilder();
            sb.append("Country->");
            sb.append(this.f13479a);
            sb.append(":");
            sb.append(this.f13480b);
            sb.append(":");
            sb.append(this.f13481c);
        } catch (NullPointerException unused) {
        }
    }

    /* renamed from: G */
    public void m15859G(String str) {
        this.f13482d = str;
    }

    /* renamed from: H */
    public void m15860H(String str) {
        this.f13481c = str;
    }

    /* renamed from: I */
    public void m15861I(String str) {
        this.f13479a = str;
    }

    /* renamed from: J */
    public void m15862J(String str) {
        this.f13480b = str;
    }

    @Override // java.lang.Comparable
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public int compareTo(C11556a c11556a) {
        return Collator.getInstance().compare(m15867y(), c11556a.m15867y());
    }

    /* renamed from: c */
    public final boolean m15864c(String str, String str2, String str3) {
        if (str2 != null && str3 != null) {
            try {
                return str2.toLowerCase(Locale.ROOT).contains(str3);
            } catch (Exception unused) {
                StringBuilder sb = new StringBuilder();
                sb.append(str);
                sb.append(":");
                sb.append(str2);
                sb.append(" failed to execute toLowerCase(Locale.ROOT).contains(query) for query:");
                sb.append(str3);
            }
        }
        return false;
    }

    /* renamed from: s */
    public String m15865s() {
        return this.f13482d;
    }

    /* renamed from: u */
    public int m15866u() {
        if (this.f13483e == -99) {
            this.f13483e = m15853v(this);
        }
        return this.f13483e;
    }

    /* renamed from: y */
    public String m15867y() {
        return this.f13481c;
    }

    /* renamed from: z */
    public String m15868z() {
        return this.f13479a;
    }

    public C11556a(String str, String str2, String str3, int i) {
        this.f13483e = f13473f;
        this.f13479a = str.toUpperCase(Locale.US);
        this.f13480b = str2;
        this.f13481c = str3;
        this.f13483e = i;
    }
}
