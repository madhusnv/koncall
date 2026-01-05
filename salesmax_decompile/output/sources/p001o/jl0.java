package p001o;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p001o.el0;

/* loaded from: classes5.dex */
public final class jl0 {

    /* renamed from: a */
    public static final jl0 f30647a = new jl0();

    /* renamed from: b */
    public static final Map f30648b;

    /* renamed from: c */
    public static final Map f30649c;

    /* renamed from: d */
    public static final Map f30650d;

    /* renamed from: o.jl0$a */
    public enum EnumC14582a {
        OPTIONS("data_processing_options"),
        COUNTRY("data_processing_options_country"),
        STATE("data_processing_options_state");

        public static final a Companion = new a(null);
        private final String rawValue;

        /* renamed from: o.jl0$a$a */
        public static final class a {
            public a() {
            }

            public /* synthetic */ a(id5 id5Var) {
                this();
            }

            /* renamed from: a */
            public final EnumC14582a m33993a(String str) {
                sq8.m48649h(str, "rawValue");
                for (EnumC14582a enumC14582a : EnumC14582a.values()) {
                    if (sq8.m48644c(enumC14582a.getRawValue(), str)) {
                        return enumC14582a;
                    }
                }
                return null;
            }
        }

        EnumC14582a(String str) {
            this.rawValue = str;
        }

        public final String getRawValue() {
            return this.rawValue;
        }
    }

    /* renamed from: o.jl0$b */
    public static final class C14583b {

        /* renamed from: a */
        public y64 f30651a;

        /* renamed from: b */
        public w64 f30652b;

        public C14583b(y64 y64Var, w64 w64Var) {
            sq8.m48649h(w64Var, "field");
            this.f30651a = y64Var;
            this.f30652b = w64Var;
        }

        /* renamed from: a */
        public final w64 m33994a() {
            return this.f30652b;
        }

        /* renamed from: b */
        public final y64 m33995b() {
            return this.f30651a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C14583b)) {
                return false;
            }
            C14583b c14583b = (C14583b) obj;
            return this.f30651a == c14583b.f30651a && this.f30652b == c14583b.f30652b;
        }

        public int hashCode() {
            y64 y64Var = this.f30651a;
            return ((y64Var == null ? 0 : y64Var.hashCode()) * 31) + this.f30652b.hashCode();
        }

        public String toString() {
            return "SectionCustomEventFieldMapping(section=" + this.f30651a + ", field=" + this.f30652b + ')';
        }
    }

    /* renamed from: o.jl0$c */
    public static final class C14584c {

        /* renamed from: a */
        public y64 f30653a;

        /* renamed from: b */
        public z64 f30654b;

        public C14584c(y64 y64Var, z64 z64Var) {
            sq8.m48649h(y64Var, "section");
            this.f30653a = y64Var;
            this.f30654b = z64Var;
        }

        /* renamed from: a */
        public final z64 m33996a() {
            return this.f30654b;
        }

        /* renamed from: b */
        public final y64 m33997b() {
            return this.f30653a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C14584c)) {
                return false;
            }
            C14584c c14584c = (C14584c) obj;
            return this.f30653a == c14584c.f30653a && this.f30654b == c14584c.f30654b;
        }

        public int hashCode() {
            int iHashCode = this.f30653a.hashCode() * 31;
            z64 z64Var = this.f30654b;
            return iHashCode + (z64Var == null ? 0 : z64Var.hashCode());
        }

        public String toString() {
            return "SectionFieldMapping(section=" + this.f30653a + ", field=" + this.f30654b + ')';
        }
    }

    /* renamed from: o.jl0$d */
    public enum EnumC14585d {
        ARRAY,
        BOOL,
        INT;

        public static final a Companion = new a(null);

        /* renamed from: o.jl0$d$a */
        public static final class a {
            public a() {
            }

            public /* synthetic */ a(id5 id5Var) {
                this();
            }

            /* renamed from: a */
            public final EnumC14585d m33998a(String str) {
                sq8.m48649h(str, "rawValue");
                if (sq8.m48644c(str, fl0.EXT_INFO.getRawValue())) {
                    return EnumC14585d.ARRAY;
                }
                if (sq8.m48644c(str, fl0.URL_SCHEMES.getRawValue())) {
                    return EnumC14585d.ARRAY;
                }
                if (sq8.m48644c(str, vd4.CONTENT_IDS.getRawValue())) {
                    return EnumC14585d.ARRAY;
                }
                if (sq8.m48644c(str, vd4.CONTENTS.getRawValue())) {
                    return EnumC14585d.ARRAY;
                }
                if (sq8.m48644c(str, EnumC14582a.OPTIONS.getRawValue())) {
                    return EnumC14585d.ARRAY;
                }
                if (sq8.m48644c(str, fl0.ADV_TE.getRawValue())) {
                    return EnumC14585d.BOOL;
                }
                if (sq8.m48644c(str, fl0.APP_TE.getRawValue())) {
                    return EnumC14585d.BOOL;
                }
                if (sq8.m48644c(str, vd4.EVENT_TIME.getRawValue())) {
                    return EnumC14585d.INT;
                }
                return null;
            }
        }
    }

    /* renamed from: o.jl0$e */
    public /* synthetic */ class C14586e {

        /* renamed from: a */
        public static final /* synthetic */ int[] f30655a;

        /* renamed from: b */
        public static final /* synthetic */ int[] f30656b;

        /* renamed from: c */
        public static final /* synthetic */ int[] f30657c;

        static {
            int[] iArr = new int[EnumC14585d.values().length];
            try {
                iArr[EnumC14585d.ARRAY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EnumC14585d.BOOL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[EnumC14585d.INT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f30655a = iArr;
            int[] iArr2 = new int[y64.values().length];
            try {
                iArr2[y64.APP_DATA.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[y64.USER_DATA.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            f30656b = iArr2;
            int[] iArr3 = new int[el0.values().length];
            try {
                iArr3[el0.MOBILE_APP_INSTALL.ordinal()] = 1;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr3[el0.CUSTOM.ordinal()] = 2;
            } catch (NoSuchFieldError unused7) {
            }
            f30657c = iArr3;
        }
    }

    static {
        fl0 fl0Var = fl0.ANON_ID;
        y64 y64Var = y64.USER_DATA;
        hwc hwcVarM53620a = vyh.m53620a(fl0Var, new C14584c(y64Var, z64.ANON_ID));
        hwc hwcVarM53620a2 = vyh.m53620a(fl0.APP_USER_ID, new C14584c(y64Var, z64.FB_LOGIN_ID));
        hwc hwcVarM53620a3 = vyh.m53620a(fl0.ADVERTISER_ID, new C14584c(y64Var, z64.MAD_ID));
        hwc hwcVarM53620a4 = vyh.m53620a(fl0.PAGE_ID, new C14584c(y64Var, z64.PAGE_ID));
        hwc hwcVarM53620a5 = vyh.m53620a(fl0.PAGE_SCOPED_USER_ID, new C14584c(y64Var, z64.PAGE_SCOPED_USER_ID));
        fl0 fl0Var2 = fl0.ADV_TE;
        y64 y64Var2 = y64.APP_DATA;
        f30648b = isa.m32684k(hwcVarM53620a, hwcVarM53620a2, hwcVarM53620a3, hwcVarM53620a4, hwcVarM53620a5, vyh.m53620a(fl0Var2, new C14584c(y64Var2, z64.ADV_TE)), vyh.m53620a(fl0.APP_TE, new C14584c(y64Var2, z64.APP_TE)), vyh.m53620a(fl0.CONSIDER_VIEWS, new C14584c(y64Var2, z64.CONSIDER_VIEWS)), vyh.m53620a(fl0.DEVICE_TOKEN, new C14584c(y64Var2, z64.DEVICE_TOKEN)), vyh.m53620a(fl0.EXT_INFO, new C14584c(y64Var2, z64.EXT_INFO)), vyh.m53620a(fl0.INCLUDE_DWELL_DATA, new C14584c(y64Var2, z64.INCLUDE_DWELL_DATA)), vyh.m53620a(fl0.INCLUDE_VIDEO_DATA, new C14584c(y64Var2, z64.INCLUDE_VIDEO_DATA)), vyh.m53620a(fl0.INSTALL_REFERRER, new C14584c(y64Var2, z64.INSTALL_REFERRER)), vyh.m53620a(fl0.INSTALLER_PACKAGE, new C14584c(y64Var2, z64.INSTALLER_PACKAGE)), vyh.m53620a(fl0.RECEIPT_DATA, new C14584c(y64Var2, z64.RECEIPT_DATA)), vyh.m53620a(fl0.URL_SCHEMES, new C14584c(y64Var2, z64.URL_SCHEMES)), vyh.m53620a(fl0.USER_DATA, new C14584c(y64Var, null)));
        hwc hwcVarM53620a6 = vyh.m53620a(vd4.EVENT_TIME, new C14583b(null, w64.EVENT_TIME));
        hwc hwcVarM53620a7 = vyh.m53620a(vd4.EVENT_NAME, new C14583b(null, w64.EVENT_NAME));
        vd4 vd4Var = vd4.VALUE_TO_SUM;
        y64 y64Var3 = y64.CUSTOM_DATA;
        f30649c = isa.m32684k(hwcVarM53620a6, hwcVarM53620a7, vyh.m53620a(vd4Var, new C14583b(y64Var3, w64.VALUE_TO_SUM)), vyh.m53620a(vd4.CONTENT_IDS, new C14583b(y64Var3, w64.CONTENT_IDS)), vyh.m53620a(vd4.CONTENTS, new C14583b(y64Var3, w64.CONTENTS)), vyh.m53620a(vd4.CONTENT_TYPE, new C14583b(y64Var3, w64.CONTENT_TYPE)), vyh.m53620a(vd4.CURRENCY, new C14583b(y64Var3, w64.CURRENCY)), vyh.m53620a(vd4.DESCRIPTION, new C14583b(y64Var3, w64.DESCRIPTION)), vyh.m53620a(vd4.LEVEL, new C14583b(y64Var3, w64.LEVEL)), vyh.m53620a(vd4.MAX_RATING_VALUE, new C14583b(y64Var3, w64.MAX_RATING_VALUE)), vyh.m53620a(vd4.NUM_ITEMS, new C14583b(y64Var3, w64.NUM_ITEMS)), vyh.m53620a(vd4.PAYMENT_INFO_AVAILABLE, new C14583b(y64Var3, w64.PAYMENT_INFO_AVAILABLE)), vyh.m53620a(vd4.REGISTRATION_METHOD, new C14583b(y64Var3, w64.REGISTRATION_METHOD)), vyh.m53620a(vd4.SEARCH_STRING, new C14583b(y64Var3, w64.SEARCH_STRING)), vyh.m53620a(vd4.SUCCESS, new C14583b(y64Var3, w64.SUCCESS)), vyh.m53620a(vd4.ORDER_ID, new C14583b(y64Var3, w64.ORDER_ID)), vyh.m53620a(vd4.AD_TYPE, new C14583b(y64Var3, w64.AD_TYPE)));
        f30650d = isa.m32684k(vyh.m53620a("fb_mobile_achievement_unlocked", x64.UNLOCKED_ACHIEVEMENT), vyh.m53620a("fb_mobile_activate_app", x64.ACTIVATED_APP), vyh.m53620a("fb_mobile_add_payment_info", x64.ADDED_PAYMENT_INFO), vyh.m53620a("fb_mobile_add_to_cart", x64.ADDED_TO_CART), vyh.m53620a("fb_mobile_add_to_wishlist", x64.ADDED_TO_WISHLIST), vyh.m53620a("fb_mobile_complete_registration", x64.COMPLETED_REGISTRATION), vyh.m53620a("fb_mobile_content_view", x64.VIEWED_CONTENT), vyh.m53620a("fb_mobile_initiated_checkout", x64.INITIATED_CHECKOUT), vyh.m53620a("fb_mobile_level_achieved", x64.ACHIEVED_LEVEL), vyh.m53620a("fb_mobile_purchase", x64.PURCHASED), vyh.m53620a("fb_mobile_rate", x64.RATED), vyh.m53620a("fb_mobile_search", x64.SEARCHED), vyh.m53620a("fb_mobile_spent_credits", x64.SPENT_CREDITS), vyh.m53620a("fb_mobile_tutorial_completion", x64.COMPLETED_TUTORIAL));
    }

    /* renamed from: k */
    public static final ArrayList m33981k(String str) {
        sq8.m48649h(str, "appEvents");
        ArrayList<Map> arrayList = new ArrayList();
        try {
            Iterator it = cri.m21667n(new JSONArray(str)).iterator();
            while (it.hasNext()) {
                arrayList.add(cri.m21668o(new JSONObject((String) it.next())));
            }
            if (arrayList.isEmpty()) {
                return null;
            }
            ArrayList arrayList2 = new ArrayList();
            for (Map map : arrayList) {
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                for (String str2 : map.keySet()) {
                    vd4 vd4VarM52580a = vd4.Companion.m52580a(str2);
                    C14583b c14583b = (C14583b) f30649c.get(vd4VarM52580a);
                    if (vd4VarM52580a != null && c14583b != null) {
                        y64 y64VarM33995b = c14583b.m33995b();
                        if (y64VarM33995b == null) {
                            try {
                                String rawValue = c14583b.m33994a().getRawValue();
                                if (vd4VarM52580a == vd4.EVENT_NAME && ((String) map.get(str2)) != null) {
                                    jl0 jl0Var = f30647a;
                                    Object obj = map.get(str2);
                                    sq8.m48647f(obj, "null cannot be cast to non-null type kotlin.String");
                                    linkedHashMap2.put(rawValue, jl0Var.m33992j((String) obj));
                                } else if (vd4VarM52580a == vd4.EVENT_TIME && ((Integer) map.get(str2)) != null) {
                                    Object obj2 = map.get(str2);
                                    sq8.m48647f(obj2, "null cannot be cast to non-null type kotlin.Any");
                                    Object objM33982l = m33982l(str2, obj2);
                                    sq8.m48647f(objM33982l, "null cannot be cast to non-null type kotlin.Any");
                                    linkedHashMap2.put(rawValue, objM33982l);
                                }
                            } catch (ClassCastException e) {
                                sja.f45482e.m48388c(bka.APP_EVENTS, "AppEventsConversionsAPITransformer", "\n transformEvents ClassCastException: \n %s ", cl6.m21378c(e));
                            }
                        } else if (y64VarM33995b == y64.CUSTOM_DATA) {
                            String rawValue2 = c14583b.m33994a().getRawValue();
                            Object obj3 = map.get(str2);
                            sq8.m48647f(obj3, "null cannot be cast to non-null type kotlin.Any");
                            Object objM33982l2 = m33982l(str2, obj3);
                            sq8.m48647f(objM33982l2, "null cannot be cast to non-null type kotlin.Any");
                            linkedHashMap.put(rawValue2, objM33982l2);
                        }
                    }
                }
                if (!linkedHashMap.isEmpty()) {
                    linkedHashMap2.put(y64.CUSTOM_DATA.getRawValue(), linkedHashMap);
                }
                arrayList2.add(linkedHashMap2);
            }
            return arrayList2;
        } catch (JSONException e2) {
            sja.f45482e.m48388c(bka.APP_EVENTS, "AppEventsConversionsAPITransformer", "\n transformEvents JSONException: \n%s\n%s", str, e2);
            return null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v4, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r1v7, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r1v8, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v9, types: [java.util.Map] */
    /* renamed from: l */
    public static final Object m33982l(String str, Object obj) {
        sq8.m48649h(str, "field");
        sq8.m48649h(obj, "value");
        EnumC14585d enumC14585dM33998a = EnumC14585d.Companion.m33998a(str);
        String str2 = obj instanceof String ? (String) obj : null;
        if (enumC14585dM33998a == null || str2 == null) {
            return obj;
        }
        int i = C14586e.f30655a[enumC14585dM33998a.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i == 3) {
                    return d9g.m22638l(obj.toString());
                }
                throw new szb();
            }
            Integer numM22638l = d9g.m22638l(str2);
            if (numM22638l != null) {
                return Boolean.valueOf(numM22638l.intValue() != 0);
            }
            return null;
        }
        try {
            List<??> listM21667n = cri.m21667n(new JSONArray(str2));
            ArrayList arrayList = new ArrayList();
            for (?? M21667n : listM21667n) {
                try {
                    try {
                        M21667n = cri.m21668o(new JSONObject((String) M21667n));
                    } catch (JSONException unused) {
                    }
                } catch (JSONException unused2) {
                    M21667n = cri.m21667n(new JSONArray((String) M21667n));
                }
                arrayList.add(M21667n);
            }
            return arrayList;
        } catch (JSONException e) {
            sja.f45482e.m48388c(bka.APP_EVENTS, "AppEventsConversionsAPITransformer", "\n transformEvents JSONException: \n%s\n%s", obj, e);
            return y3i.f54824a;
        }
    }

    /* renamed from: a */
    public final List m33983a(el0 el0Var, Map map, Map map2, Map map3, List list, Object obj) {
        sq8.m48649h(el0Var, "eventType");
        sq8.m48649h(map, "userData");
        sq8.m48649h(map2, "appData");
        sq8.m48649h(map3, "restOfData");
        sq8.m48649h(list, "customEvents");
        Map mapM33986d = m33986d(map, map2, map3);
        int i = C14586e.f30657c[el0Var.ordinal()];
        if (i == 1) {
            return m33985c(mapM33986d, obj);
        }
        if (i != 2) {
            return null;
        }
        return m33984b(mapM33986d, list);
    }

    /* renamed from: b */
    public final List m33984b(Map map, List list) {
        if (list.isEmpty()) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Map map2 = (Map) it.next();
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            linkedHashMap.putAll(map);
            linkedHashMap.putAll(map2);
            arrayList.add(linkedHashMap);
        }
        return arrayList;
    }

    /* renamed from: c */
    public final List m33985c(Map map, Object obj) {
        if (obj == null) {
            return null;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.putAll(map);
        linkedHashMap.put(w64.EVENT_NAME.getRawValue(), rfc.MOBILE_APP_INSTALL.getRawValue());
        linkedHashMap.put(w64.EVENT_TIME.getRawValue(), obj);
        return bh3.m18963e(linkedHashMap);
    }

    /* renamed from: d */
    public final Map m33986d(Map map, Map map2, Map map3) {
        sq8.m48649h(map, "userData");
        sq8.m48649h(map2, "appData");
        sq8.m48649h(map3, "restOfData");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put(rfc.ACTION_SOURCE.getRawValue(), rfc.APP.getRawValue());
        linkedHashMap.put(y64.USER_DATA.getRawValue(), map);
        linkedHashMap.put(y64.APP_DATA.getRawValue(), map2);
        linkedHashMap.putAll(map3);
        return linkedHashMap;
    }

    /* renamed from: e */
    public final List m33987e(Map map) {
        sq8.m48649h(map, "parameters");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        ArrayList arrayList = new ArrayList();
        LinkedHashMap linkedHashMap3 = new LinkedHashMap();
        el0 el0VarM33988f = m33988f(map, linkedHashMap, linkedHashMap2, arrayList, linkedHashMap3);
        if (el0VarM33988f == el0.OTHER) {
            return null;
        }
        return m33983a(el0VarM33988f, linkedHashMap, linkedHashMap2, linkedHashMap3, arrayList, map.get(rfc.INSTALL_EVENT_TIME.getRawValue()));
    }

    /* renamed from: f */
    public final el0 m33988f(Map map, Map map2, Map map3, ArrayList arrayList, Map map4) {
        Object obj = map.get(rfc.EVENT.getRawValue());
        el0.C13211a c13211a = el0.Companion;
        sq8.m48647f(obj, "null cannot be cast to non-null type kotlin.String");
        el0 el0VarM25195a = c13211a.m25195a((String) obj);
        if (el0VarM25195a == el0.OTHER) {
            return el0VarM25195a;
        }
        for (Map.Entry entry : map.entrySet()) {
            String str = (String) entry.getKey();
            Object value = entry.getValue();
            fl0 fl0VarM26981a = fl0.Companion.m26981a(str);
            if (fl0VarM26981a != null) {
                f30647a.m33989g(map2, map3, fl0VarM26981a, value);
            } else {
                boolean zM48644c = sq8.m48644c(str, y64.CUSTOM_EVENTS.getRawValue());
                boolean z = value instanceof String;
                if (el0VarM25195a == el0.CUSTOM && zM48644c && z) {
                    sq8.m48647f(value, "null cannot be cast to non-null type kotlin.String");
                    ArrayList arrayListM33981k = m33981k((String) value);
                    if (arrayListM33981k != null) {
                        arrayList.addAll(arrayListM33981k);
                    }
                } else if (EnumC14582a.Companion.m33993a(str) != null) {
                    map4.put(str, value);
                }
            }
        }
        return el0VarM25195a;
    }

    /* renamed from: g */
    public final void m33989g(Map map, Map map2, fl0 fl0Var, Object obj) {
        y64 y64VarM33997b;
        sq8.m48649h(map, "userData");
        sq8.m48649h(map2, "appData");
        sq8.m48649h(fl0Var, "field");
        sq8.m48649h(obj, "value");
        C14584c c14584c = (C14584c) f30648b.get(fl0Var);
        if (c14584c == null || (y64VarM33997b = c14584c.m33997b()) == null) {
            return;
        }
        int i = C14586e.f30656b[y64VarM33997b.ordinal()];
        if (i == 1) {
            m33990h(map2, fl0Var, obj);
        } else {
            if (i != 2) {
                return;
            }
            m33991i(map, fl0Var, obj);
        }
    }

    /* renamed from: h */
    public final void m33990h(Map map, fl0 fl0Var, Object obj) {
        z64 z64VarM33996a;
        String rawValue;
        C14584c c14584c = (C14584c) f30648b.get(fl0Var);
        if (c14584c == null || (z64VarM33996a = c14584c.m33996a()) == null || (rawValue = z64VarM33996a.getRawValue()) == null) {
            return;
        }
        map.put(rawValue, obj);
    }

    /* renamed from: i */
    public final void m33991i(Map map, fl0 fl0Var, Object obj) {
        z64 z64VarM33996a;
        String rawValue;
        if (fl0Var == fl0.USER_DATA) {
            try {
                sq8.m48647f(obj, "null cannot be cast to non-null type kotlin.String");
                map.putAll(cri.m21668o(new JSONObject((String) obj)));
                return;
            } catch (JSONException e) {
                sja.f45482e.m48388c(bka.APP_EVENTS, "AppEventsConversionsAPITransformer", "\n transformEvents JSONException: \n%s\n%s", obj, e);
                return;
            }
        }
        C14584c c14584c = (C14584c) f30648b.get(fl0Var);
        if (c14584c == null || (z64VarM33996a = c14584c.m33996a()) == null || (rawValue = z64VarM33996a.getRawValue()) == null) {
            return;
        }
        map.put(rawValue, obj);
    }

    /* renamed from: j */
    public final String m33992j(String str) {
        String rawValue;
        Map map = f30650d;
        if (!map.containsKey(str)) {
            return str;
        }
        x64 x64Var = (x64) map.get(str);
        return (x64Var == null || (rawValue = x64Var.getRawValue()) == null) ? "" : rawValue;
    }
}
