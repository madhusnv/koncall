package p001o;

import com.google.android.gms.common.Scopes;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import p001o.q71;
import p001o.qja;
import p001o.yqh;

/* loaded from: classes2.dex */
public abstract class p71 {

    /* renamed from: o.p71$a */
    public /* synthetic */ class C15994a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f39465a;

        static {
            int[] iArr = new int[wq3.values().length];
            try {
                iArr[wq3.PROFILE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[wq3.SSO_SESSION.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[wq3.SERVICES.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[wq3.UNKNOWN.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            f39465a = iArr;
        }
    }

    /* renamed from: o.p71$b */
    public static final class C15995b implements uk7 {

        /* renamed from: a */
        public final /* synthetic */ sw6 f39466a;

        /* renamed from: b */
        public final /* synthetic */ yqh f39467b;

        public C15995b(sw6 sw6Var, yqh yqhVar) {
            this.f39466a = sw6Var;
            this.f39467b = yqhVar;
        }

        @Override // p001o.uk7
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return cih.m21307a("Ignoring invalid " + p71.m43059b((yqh.C18467c) this.f39467b) + " '" + ((yqh.C18467c) this.f39467b).m58124b() + '\'', Integer.valueOf(this.f39466a.m48959b()));
        }
    }

    /* renamed from: o.p71$c */
    public static final class C15996c implements uk7 {

        /* renamed from: a */
        public final /* synthetic */ sw6 f39468a;

        /* renamed from: b */
        public final /* synthetic */ yqh f39469b;

        public C15996c(sw6 sw6Var, yqh yqhVar) {
            this.f39468a = sw6Var;
            this.f39469b = yqhVar;
        }

        @Override // p001o.uk7
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return cih.m21307a("Ignoring invalid property '" + ((yqh.C18466b) this.f39469b).m58120a() + '\'', Integer.valueOf(this.f39468a.m48959b()));
        }
    }

    /* renamed from: o.p71$d */
    public static final class C15997d implements uk7 {

        /* renamed from: a */
        public final /* synthetic */ sw6 f39470a;

        /* renamed from: b */
        public final /* synthetic */ gge f39471b;

        public C15997d(sw6 sw6Var, gge ggeVar) {
            this.f39470a = sw6Var;
            this.f39471b = ggeVar;
        }

        @Override // p001o.uk7
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return cih.m21307a("Ignoring property under invalid " + p71.m43059b((yqh.C18467c) this.f39471b.f25106a) + " '" + ((yqh.C18467c) this.f39471b.f25106a).m58124b() + '\'', Integer.valueOf(this.f39470a.m48959b()));
        }
    }

    /* renamed from: o.p71$e */
    public static final class C15998e implements uk7 {

        /* renamed from: a */
        public final /* synthetic */ sw6 f39472a;

        /* renamed from: b */
        public final /* synthetic */ yqh f39473b;

        /* renamed from: c */
        public final /* synthetic */ gge f39474c;

        public C15998e(sw6 sw6Var, yqh yqhVar, gge ggeVar) {
            this.f39472a = sw6Var;
            this.f39473b = yqhVar;
            this.f39474c = ggeVar;
        }

        @Override // p001o.uk7
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return cih.m21307a('\'' + ((yqh.C18466b) this.f39473b).m58120a() + "' defined multiple times in " + p71.m43059b((yqh.C18467c) this.f39474c.f25106a) + " '" + ((yqh.C18467c) this.f39474c.f25106a).m58124b() + '\'', Integer.valueOf(this.f39472a.m48959b()));
        }
    }

    /* renamed from: o.p71$f */
    public static final class C15999f implements uk7 {

        /* renamed from: a */
        public final /* synthetic */ sw6 f39475a;

        /* renamed from: b */
        public final /* synthetic */ yqh f39476b;

        public C15999f(sw6 sw6Var, yqh yqhVar) {
            this.f39475a = sw6Var;
            this.f39476b = yqhVar;
        }

        @Override // p001o.uk7
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return cih.m21307a("Overwriting previously-defined property '" + ((yqh.C18466b) this.f39476b).m58120a() + '\'', Integer.valueOf(this.f39475a.m48959b()));
        }
    }

    /* renamed from: o.p71$g */
    public static final class C16000g implements uk7 {

        /* renamed from: a */
        public final /* synthetic */ sw6 f39477a;

        /* renamed from: b */
        public final /* synthetic */ yqh f39478b;

        public C16000g(sw6 sw6Var, yqh yqhVar) {
            this.f39477a = sw6Var;
            this.f39478b = yqhVar;
        }

        @Override // p001o.uk7
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return cih.m21307a("Ignoring invalid sub-property '" + ((yqh.C18468d) this.f39478b).m58127a() + '\'', Integer.valueOf(this.f39477a.m48959b()));
        }
    }

    /* renamed from: o.p71$h */
    public static final class C16001h implements uk7 {

        /* renamed from: a */
        public final /* synthetic */ sw6 f39479a;

        /* renamed from: b */
        public final /* synthetic */ yqh f39480b;

        public C16001h(sw6 sw6Var, yqh yqhVar) {
            this.f39479a = sw6Var;
            this.f39480b = yqhVar;
        }

        @Override // p001o.uk7
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return cih.m21307a("Overwriting previously-defined property '" + ((yqh.C18468d) this.f39480b).m58127a() + '\'', Integer.valueOf(this.f39479a.m48959b()));
        }
    }

    /* renamed from: b */
    public static final String m43059b(yqh.C18467c c18467c) {
        int i = C15994a.f39465a[c18467c.m58125c().ordinal()];
        if (i == 1) {
            return Scopes.PROFILE;
        }
        if (i == 2) {
            return "sso-session";
        }
        if (i == 3) {
            return "services";
        }
        if (i == 4) {
            return "unknown section";
        }
        throw new szb();
    }

    /* renamed from: c */
    public static final Map m43060c(List list) {
        Map mapM32681h;
        Map mapM31053c = hsa.m31053c();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            vq3 vq3Var = (vq3) it.next();
            vq3 vq3Var2 = (vq3) mapM31053c.get(vq3Var.m53205b());
            if (vq3Var2 == null || (mapM32681h = vq3Var2.m53207e()) == null) {
                mapM32681h = isa.m32681h();
            }
            mapM31053c.put(vq3Var.m53205b(), new vq3(vq3Var.m53205b(), isa.m32687n(mapM32681h, vq3Var.m53207e()), vq3Var.m53208f()));
        }
        return hsa.m31052b(mapM31053c);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0027  */
    /* renamed from: d */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Map m43061d(Map map) {
        boolean z;
        boolean z2;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator it = map.entrySet().iterator();
        while (true) {
            if (!it.hasNext()) {
                ArrayList arrayList = new ArrayList(linkedHashMap.size());
                for (Map.Entry entry : linkedHashMap.entrySet()) {
                    arrayList.add(new vq3(((yqh.C18467c) entry.getKey()).m58124b(), (Map) entry.getValue(), ((yqh.C18467c) entry.getKey()).m58125c()));
                }
                LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                wq3[] wq3VarArrValues = wq3.values();
                int length = wq3VarArrValues.length;
                for (int i = 0; i < length; i++) {
                    wq3 wq3Var = wq3VarArrValues[i];
                    ArrayList arrayList2 = new ArrayList();
                    for (Object obj : arrayList) {
                        if (((vq3) obj).m53208f() == wq3Var) {
                            arrayList2.add(obj);
                        }
                    }
                    Map mapM43060c = m43060c(arrayList2);
                    if (!mapM43060c.isEmpty()) {
                        linkedHashMap2.put(wq3Var, mapM43060c);
                    }
                }
                return linkedHashMap2;
            }
            Map.Entry entry2 = (Map.Entry) it.next();
            boolean zM58123a = ((yqh.C18467c) entry2.getKey()).m58123a();
            if (!zM58123a) {
                if (zM58123a) {
                    throw new szb();
                }
                Set<yqh.C18467c> setKeySet = map.keySet();
                if ((setKeySet instanceof Collection) && setKeySet.isEmpty()) {
                    z = false;
                    if (z) {
                    }
                } else {
                    for (yqh.C18467c c18467c : setKeySet) {
                        if (c18467c.m58123a() && sq8.m48644c(c18467c.m58124b(), ((yqh.C18467c) entry2.getKey()).m58124b()) && c18467c.m58125c() == ((yqh.C18467c) entry2.getKey()).m58125c()) {
                            z = true;
                            break;
                        }
                    }
                    z = false;
                    z2 = z ? false : true;
                }
            }
            if (z2) {
                linkedHashMap.put(entry2.getKey(), entry2.getValue());
            }
        }
    }

    /* renamed from: e */
    public static final Map m43062e(qja qjaVar, sz6 sz6Var, String str) {
        sq8.m48649h(qjaVar, "logger");
        sq8.m48649h(sz6Var, "type");
        return str == null || f9g.d0(str) ? isa.m32681h() : m43061d(m43063f(m43065h(sz6Var, str), qjaVar));
    }

    /* renamed from: f */
    public static final Map m43063f(List list, qja qjaVar) {
        sq8.m48649h(list, "<this>");
        sq8.m48649h(qjaVar, "logger");
        Map mapM31053c = hsa.m31053c();
        gge ggeVar = new gge();
        Iterator it = list.iterator();
        yqh.C18466b c18466b = null;
        LinkedHashMap linkedHashMap = null;
        while (it.hasNext()) {
            hwc hwcVar = (hwc) it.next();
            sw6 sw6Var = (sw6) hwcVar.m31227a();
            yqh yqhVar = (yqh) hwcVar.m31228b();
            if (yqhVar instanceof yqh.C18467c) {
                ggeVar.f25106a = yqhVar;
                if (!mapM31053c.containsKey(yqhVar)) {
                    if (((yqh.C18467c) yqhVar).m58126d()) {
                        mapM31053c.put(yqhVar, new LinkedHashMap());
                    } else {
                        qja.C16414b.m45551d(qjaVar, null, new C15995b(sw6Var, yqhVar), 1, null);
                    }
                }
                c18466b = null;
            } else if (yqhVar instanceof yqh.C18466b) {
                Object obj = ggeVar.f25106a;
                sq8.m48647f(obj, "null cannot be cast to non-null type aws.sdk.kotlin.runtime.config.profile.Token.Section");
                c18466b = (yqh.C18466b) yqhVar;
                if (!c18466b.m58122c()) {
                    qja.C16414b.m45551d(qjaVar, null, new C15996c(sw6Var, yqhVar), 1, null);
                } else if (((yqh.C18467c) ggeVar.f25106a).m58126d()) {
                    Object obj2 = mapM31053c.get(ggeVar.f25106a);
                    sq8.m48646e(obj2);
                    Map map = (Map) obj2;
                    if (map.containsKey(c18466b.m58120a())) {
                        qja.C16414b.m45551d(qjaVar, null, new C15998e(sw6Var, yqhVar, ggeVar), 1, null);
                    }
                    if (map.containsKey(c18466b.m58120a())) {
                        qja.C16414b.m45551d(qjaVar, null, new C15999f(sw6Var, yqhVar), 1, null);
                    }
                    map.put(c18466b.m58120a(), new q71.C16309b(c18466b.m58121b()));
                } else {
                    qja.C16414b.m45551d(qjaVar, null, new C15997d(sw6Var, ggeVar), 1, null);
                }
            } else if (yqhVar instanceof yqh.C18465a) {
                Object obj3 = ggeVar.f25106a;
                sq8.m48647f(obj3, "null cannot be cast to non-null type aws.sdk.kotlin.runtime.config.profile.Token.Section");
                sq8.m48647f(c18466b, "null cannot be cast to non-null type aws.sdk.kotlin.runtime.config.profile.Token.Property");
                Object obj4 = mapM31053c.get(ggeVar.f25106a);
                sq8.m48646e(obj4);
                Map map2 = (Map) obj4;
                Object obj5 = map2.get(c18466b.m58120a());
                sq8.m48647f(obj5, "null cannot be cast to non-null type aws.sdk.kotlin.runtime.config.profile.AwsConfigValue.String");
                String strM44917a = ((q71.C16309b) obj5).m44917a();
                map2.put(c18466b.m58120a(), new q71.C16309b(strM44917a + '\n' + ((yqh.C18465a) yqhVar).m58119a()));
            } else {
                if (!(yqhVar instanceof yqh.C18468d)) {
                    throw new szb();
                }
                Object obj6 = ggeVar.f25106a;
                sq8.m48647f(obj6, "null cannot be cast to non-null type aws.sdk.kotlin.runtime.config.profile.Token.Section");
                sq8.m48647f(c18466b, "null cannot be cast to non-null type aws.sdk.kotlin.runtime.config.profile.Token.Property");
                yqh.C18468d c18468d = (yqh.C18468d) yqhVar;
                if (c18468d.m58129c()) {
                    Object obj7 = mapM31053c.get(ggeVar.f25106a);
                    sq8.m48646e(obj7);
                    Map map3 = (Map) obj7;
                    q71 q71Var = (q71) map3.get(c18466b.m58120a());
                    if (q71Var instanceof q71.C16309b) {
                        if (((q71.C16309b) q71Var).m44917a().length() > 0) {
                            qja.C16414b.m45551d(qjaVar, null, new C16001h(sw6Var, yqhVar), 1, null);
                        }
                        linkedHashMap = new LinkedHashMap();
                        map3.put(c18466b.m58120a(), new q71.C16308a(linkedHashMap));
                    }
                    sq8.m48646e(linkedHashMap);
                    linkedHashMap.put(c18468d.m58127a(), c18468d.m58128b());
                } else {
                    qja.C16414b.m45551d(qjaVar, null, new C16000g(sw6Var, yqhVar), 1, null);
                }
            }
        }
        return hsa.m31052b(mapM31053c);
    }

    /* renamed from: g */
    public static final r81 m43064g(Map map, r71 r71Var) {
        sq8.m48649h(map, "<this>");
        sq8.m48649h(r71Var, "source");
        return new r81(map, r71Var);
    }

    /* renamed from: h */
    public static final List m43065h(sz6 sz6Var, String str) {
        sq8.m48649h(sz6Var, "type");
        sq8.m48649h(str, "input");
        List listM18961c = bh3.m18961c();
        List listK0 = f9g.k0(str);
        ArrayList arrayList = new ArrayList(dh3.m23088v(listK0, 10));
        int i = 0;
        for (Object obj : listK0) {
            int i2 = i + 1;
            if (i < 0) {
                ch3.m21256u();
            }
            arrayList.add(new sw6(i2, (String) obj));
            i = i2;
        }
        ArrayList<sw6> arrayList2 = new ArrayList();
        for (Object obj2 : arrayList) {
            sw6 sw6Var = (sw6) obj2;
            if ((f9g.d0(sw6Var.m48958a()) ^ true) && !tw6.m50718a(sw6Var)) {
                arrayList2.add(obj2);
            }
        }
        yqh.C18467c c18467c = null;
        yqh.C18466b c18466b = null;
        for (sw6 sw6Var2 : arrayList2) {
            yqh yqhVar = sz6Var.tokenOf(sw6Var2, c18467c, c18466b);
            if (yqhVar instanceof yqh.C18467c) {
                c18467c = (yqh.C18467c) yqhVar;
                c18466b = null;
            } else if (yqhVar instanceof yqh.C18466b) {
                c18466b = (yqh.C18466b) yqhVar;
            }
            listM18961c.add(vyh.m53620a(sw6Var2, yqhVar));
        }
        return bh3.m18959a(listM18961c);
    }
}
