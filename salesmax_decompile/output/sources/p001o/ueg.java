package p001o;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.params.StreamConfigurationMap;
import android.media.CamcorderProfile;
import android.media.MediaRecorder;
import android.os.Build;
import android.util.Pair;
import android.util.Range;
import android.util.Rational;
import android.util.Size;
import com.google.android.gms.common.api.Api;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import p001o.k7g;
import p001o.weg;

/* loaded from: classes2.dex */
public final class ueg {

    /* renamed from: i */
    public final String f48847i;

    /* renamed from: j */
    public final q32 f48848j;

    /* renamed from: k */
    public final s82 f48849k;

    /* renamed from: l */
    public final qq6 f48850l;

    /* renamed from: m */
    public final int f48851m;

    /* renamed from: n */
    public boolean f48852n;

    /* renamed from: o */
    public boolean f48853o;

    /* renamed from: p */
    public boolean f48854p;

    /* renamed from: q */
    public boolean f48855q;

    /* renamed from: r */
    public boolean f48856r;

    /* renamed from: s */
    public boolean f48857s;

    /* renamed from: t */
    public cgg f48858t;

    /* renamed from: v */
    public final qu5 f48860v;

    /* renamed from: y */
    public final b26 f48863y;

    /* renamed from: a */
    public final List f48839a = new ArrayList();

    /* renamed from: b */
    public final List f48840b = new ArrayList();

    /* renamed from: c */
    public final List f48841c = new ArrayList();

    /* renamed from: d */
    public final List f48842d = new ArrayList();

    /* renamed from: e */
    public final Map f48843e = new HashMap();

    /* renamed from: f */
    public final List f48844f = new ArrayList();

    /* renamed from: g */
    public final List f48845g = new ArrayList();

    /* renamed from: h */
    public final List f48846h = new ArrayList();

    /* renamed from: u */
    public List f48859u = new ArrayList();

    /* renamed from: w */
    public final rjg f48861w = new rjg();

    /* renamed from: x */
    public final kne f48862x = new kne();

    /* renamed from: o.ueg$a */
    public static class C17370a {
        /* renamed from: a */
        public static Size[] m51498a(StreamConfigurationMap streamConfigurationMap, int i) {
            return streamConfigurationMap.getHighResolutionOutputSizes(i);
        }
    }

    /* renamed from: o.ueg$b */
    public static abstract class AbstractC17371b {
        /* renamed from: e */
        public static AbstractC17371b m51499e(int i, int i2, boolean z, boolean z2) {
            return new o51(i, i2, z, z2);
        }

        /* renamed from: a */
        public abstract int mo41606a();

        /* renamed from: b */
        public abstract int mo41607b();

        /* renamed from: c */
        public abstract boolean mo41608c();

        /* renamed from: d */
        public abstract boolean mo41609d();
    }

    public ueg(Context context, String str, z92 z92Var, q32 q32Var) throws NumberFormatException, va2 {
        this.f48852n = false;
        this.f48853o = false;
        this.f48854p = false;
        this.f48855q = false;
        this.f48856r = false;
        this.f48857s = false;
        String str2 = (String) fgd.m26663g(str);
        this.f48847i = str2;
        this.f48848j = (q32) fgd.m26663g(q32Var);
        this.f48850l = new qq6();
        this.f48860v = qu5.m45842c(context);
        try {
            s82 s82VarM58952c = z92Var.m58952c(str2);
            this.f48849k = s82VarM58952c;
            Integer num = (Integer) s82VarM58952c.m47965a(CameraCharacteristics.INFO_SUPPORTED_HARDWARE_LEVEL);
            this.f48851m = num != null ? num.intValue() : 2;
            int[] iArr = (int[]) s82VarM58952c.m47965a(CameraCharacteristics.REQUEST_AVAILABLE_CAPABILITIES);
            if (iArr != null) {
                for (int i : iArr) {
                    if (i == 3) {
                        this.f48852n = true;
                    } else if (i == 6) {
                        this.f48853o = true;
                    } else if (Build.VERSION.SDK_INT >= 31 && i == 16) {
                        this.f48856r = true;
                    }
                }
            }
            b26 b26Var = new b26(this.f48849k);
            this.f48863y = b26Var;
            m51486k();
            if (this.f48856r) {
                m51489n();
            }
            boolean zHasSystemFeature = context.getPackageManager().hasSystemFeature("android.hardware.camera.concurrent");
            this.f48854p = zHasSystemFeature;
            if (zHasSystemFeature) {
                m51483h();
            }
            if (b26Var.m18109d()) {
                m51482g();
            }
            if (m51470J()) {
                m51488m();
            }
            boolean zM38502h = m7g.m38502h(this.f48849k);
            this.f48855q = zM38502h;
            if (zM38502h) {
                m51485j();
            }
            boolean zM21886a = cvi.m21886a(this.f48849k);
            this.f48857s = zM21886a;
            if (zM21886a) {
                m51484i();
            }
            m51487l();
            m51478b();
        } catch (h72 e) {
            throw wa2.m54130a(e);
        }
    }

    /* renamed from: H */
    public static List m51456H(List list) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            int iM20540x = ((c9i) it.next()).m20540x(0);
            if (!arrayList2.contains(Integer.valueOf(iM20540x))) {
                arrayList2.add(Integer.valueOf(iM20540x));
            }
        }
        Collections.sort(arrayList2);
        Collections.reverse(arrayList2);
        Iterator it2 = arrayList2.iterator();
        while (it2.hasNext()) {
            int iIntValue = ((Integer) it2.next()).intValue();
            Iterator it3 = list.iterator();
            while (it3.hasNext()) {
                c9i c9iVar = (c9i) it3.next();
                if (iIntValue == c9iVar.m20540x(0)) {
                    arrayList.add(Integer.valueOf(list.indexOf(c9iVar)));
                }
            }
        }
        return arrayList;
    }

    /* renamed from: I */
    public static boolean m51457I(List list, Map map) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            if (((os0) it.next()).mo42615d() == 4101) {
                return true;
            }
        }
        Iterator it2 = map.keySet().iterator();
        while (it2.hasNext()) {
            if (((c9i) it2.next()).mo19021n() == 4101) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: d */
    public static Range m51458d(Range range, Range range2, Range range3) {
        double dM51461v = m51461v(range2.intersect(range));
        double dM51461v2 = m51461v(range3.intersect(range));
        double dM51461v3 = dM51461v2 / m51461v(range3);
        double dM51461v4 = dM51461v / m51461v(range2);
        if (dM51461v2 > dM51461v) {
            if (dM51461v3 >= 0.5d || dM51461v3 >= dM51461v4) {
                return range3;
            }
        } else if (dM51461v2 == dM51461v) {
            if (dM51461v3 > dM51461v4) {
                return range3;
            }
            if (dM51461v3 == dM51461v4 && ((Integer) range3.getLower()).intValue() > ((Integer) range2.getLower()).intValue()) {
                return range3;
            }
        } else if (dM51461v4 < 0.5d && dM51461v3 > dM51461v4) {
            return range3;
        }
        return range2;
    }

    /* renamed from: q */
    public static int m51459q(s82 s82Var, int i, Size size) {
        try {
            return (int) (1.0E9d / ((StreamConfigurationMap) s82Var.m47965a(CameraCharacteristics.SCALER_STREAM_CONFIGURATION_MAP)).getOutputMinFrameDuration(i, size));
        } catch (Exception unused) {
            return 0;
        }
    }

    /* renamed from: u */
    public static int m51460u(Range range, Range range2) {
        fgd.m26666j((range.contains((Range) range2.getUpper()) || range.contains((Range) range2.getLower())) ? false : true, "Ranges must not intersect");
        return ((Integer) range.getLower()).intValue() > ((Integer) range2.getUpper()).intValue() ? ((Integer) range.getLower()).intValue() - ((Integer) range2.getUpper()).intValue() : ((Integer) range2.getLower()).intValue() - ((Integer) range.getUpper()).intValue();
    }

    /* renamed from: v */
    public static int m51461v(Range range) {
        return (((Integer) range.getUpper()).intValue() - ((Integer) range.getLower()).intValue()) + 1;
    }

    /* renamed from: z */
    public static int m51462z(Map map) {
        Iterator it = map.values().iterator();
        while (it.hasNext()) {
            if (((y16) it.next()).m57102a() == 10) {
                return 10;
            }
        }
        return 8;
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x02e2  */
    /* renamed from: A */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Pair m51463A(int i, List list, Map map, boolean z, boolean z2) throws NumberFormatException {
        Map map2;
        HashMap map3;
        HashMap map4;
        Range range;
        List list2;
        Map map5;
        int i2;
        String str;
        String str2;
        Map map6;
        List list3;
        String str3;
        String str4;
        Map map7;
        Map map8;
        List list4;
        List list5;
        HashMap map9;
        int i3;
        int i4;
        String str5;
        m51472L();
        List arrayList = new ArrayList(map.keySet());
        List listM51456H = m51456H(arrayList);
        Map mapM18110g = this.f48863y.m18110g(list, arrayList, listM51456H);
        AbstractC17371b abstractC17371bM51480e = m51480e(i, mapM18110g, z, m51457I(list, map));
        boolean zM51471K = m51471K(abstractC17371bM51480e, list, map);
        String str6 = ".  May be attempting to bind too many use cases. Existing surfaces: ";
        String str7 = " New configs: ";
        String str8 = "No supported surface combination is found for camera device - Id : ";
        if (!zM51471K) {
            throw new IllegalArgumentException("No supported surface combination is found for camera device - Id : " + this.f48847i + ".  May be attempting to bind too many use cases. Existing surfaces: " + list + " New configs: " + arrayList);
        }
        Range rangeM51466D = m51466D(list, arrayList, listM51456H);
        Map mapM51481f = m51481f(map, abstractC17371bM51480e, rangeM51466D);
        List arrayList2 = new ArrayList();
        Iterator it = listM51456H.iterator();
        while (it.hasNext()) {
            c9i c9iVar = (c9i) arrayList.get(((Integer) it.next()).intValue());
            arrayList2.add(m51477a((List) mapM51481f.get(c9iVar), c9iVar.mo19021n()));
        }
        List listM51490o = m51490o(arrayList2);
        HashMap map10 = new HashMap();
        HashMap map11 = new HashMap();
        Map map12 = new HashMap();
        Map map13 = new HashMap();
        boolean zM38498d = m7g.m38498d(list, arrayList);
        int iM51493s = m51493s(list);
        Map map14 = map13;
        if (!this.f48855q || zM38498d) {
            map2 = map12;
            map3 = map11;
            map4 = map10;
            range = rangeM51466D;
            list2 = listM51456H;
            map5 = mapM18110g;
            i2 = iM51493s;
            str = "No supported surface combination is found for camera device - Id : ";
            str2 = " New configs: ";
            map6 = map14;
            list3 = null;
        } else {
            Iterator it2 = listM51490o.iterator();
            List listM51494t = null;
            while (true) {
                if (!it2.hasNext()) {
                    map3 = map11;
                    map4 = map10;
                    range = rangeM51466D;
                    list2 = listM51456H;
                    map5 = mapM18110g;
                    i2 = iM51493s;
                    str = str8;
                    str2 = str7;
                    str5 = str6;
                    map6 = map14;
                    map2 = map12;
                    break;
                }
                Map map15 = map14;
                Map map16 = map12;
                map3 = map11;
                map4 = map10;
                map5 = mapM18110g;
                Range range2 = rangeM51466D;
                List list6 = listM51456H;
                range = range2;
                str = str8;
                int i5 = iM51493s;
                i2 = iM51493s;
                str2 = str7;
                list2 = listM51456H;
                str5 = str6;
                listM51494t = m51494t(abstractC17371bM51480e, (List) m51465C(i, list, (List) it2.next(), arrayList, list6, i5, map16, map15).first);
                map2 = map16;
                map6 = map15;
                if (listM51494t != null && !m7g.m38495a(map2, map6, listM51494t)) {
                    listM51494t = null;
                }
                if (listM51494t != null) {
                    if (m7g.m38497c(this.f48849k, listM51494t)) {
                        break;
                    }
                    listM51494t = null;
                }
                map2.clear();
                map6.clear();
                map14 = map6;
                map12 = map2;
                str6 = str5;
                str8 = str;
                str7 = str2;
                mapM18110g = map5;
                map11 = map3;
                map10 = map4;
                rangeM51466D = range;
                iM51493s = i2;
                listM51456H = list2;
            }
            if (listM51494t == null && !zM51471K) {
                throw new IllegalArgumentException(str + this.f48847i + str5 + list + str2 + arrayList);
            }
            list3 = listM51494t;
        }
        Iterator it3 = listM51490o.iterator();
        boolean z3 = false;
        int i6 = Integer.MAX_VALUE;
        int iIntValue = Integer.MAX_VALUE;
        boolean z4 = false;
        boolean z5 = false;
        List list7 = null;
        List list8 = null;
        while (true) {
            if (!it3.hasNext()) {
                str3 = str;
                str4 = str2;
                map7 = map6;
                map8 = map2;
                list4 = list7;
                list5 = list8;
                break;
            }
            List list9 = (List) it3.next();
            int i7 = i6;
            int i8 = iIntValue;
            str4 = str2;
            map7 = map6;
            str3 = str;
            map8 = map2;
            Pair pairM51465C = m51465C(i, list, list9, arrayList, list2, i2, null, null);
            List list10 = (List) pairM51465C.first;
            iIntValue = ((Integer) pairM51465C.second).intValue();
            int i9 = i2;
            boolean z6 = range == null || i9 <= iIntValue || iIntValue >= ((Integer) range.getLower()).intValue();
            if (z4 || !m51479c(abstractC17371bM51480e, list10)) {
                i3 = i8;
                i4 = Api.BaseClientBuilder.API_PRIORITY_OTHER;
            } else {
                i3 = i8;
                i4 = Api.BaseClientBuilder.API_PRIORITY_OTHER;
                if (i3 == Integer.MAX_VALUE || i3 < iIntValue) {
                    i3 = iIntValue;
                    list7 = list9;
                }
                if (z6) {
                    if (z5) {
                        list5 = list8;
                        list4 = list9;
                        i6 = i7;
                        break;
                    }
                    i3 = iIntValue;
                    z4 = true;
                    list7 = list9;
                }
            }
            if (list3 == null || z5 || m51494t(abstractC17371bM51480e, list10) == null) {
                i6 = i7;
            } else {
                if (i7 != i4 && i7 >= iIntValue) {
                    i6 = i7;
                } else {
                    i6 = iIntValue;
                    list8 = list9;
                }
                if (z6) {
                    i6 = iIntValue;
                    if (z4) {
                        iIntValue = i3;
                        list4 = list7;
                        list5 = list9;
                        break;
                    }
                    z5 = true;
                    list8 = list9;
                } else {
                    continue;
                }
            }
            i2 = i9;
            iIntValue = i3;
            map2 = map8;
            map6 = map7;
            str = str3;
            str2 = str4;
        }
        if (list4 == null) {
            throw new IllegalArgumentException(str3 + this.f48847i + " and Hardware level: " + this.f48851m + ". May be the specified resolution is too large and not supported. Existing surfaces: " + list + str4 + arrayList);
        }
        Range rangeM51491p = range != null ? m51491p(range, iIntValue) : null;
        Iterator it4 = arrayList.iterator();
        while (it4.hasNext()) {
            c9i c9iVar2 = (c9i) it4.next();
            List list11 = list2;
            Map map17 = map5;
            Iterator it5 = it4;
            k7g.AbstractC14726a abstractC14726aMo35137f = k7g.m35125a((Size) list4.get(list11.indexOf(Integer.valueOf(arrayList.indexOf(c9iVar2))))).mo35133b((y16) fgd.m26663g((y16) map17.get(c9iVar2))).mo35135d(m7g.m38499e(c9iVar2)).mo35137f(z2);
            if (rangeM51491p != null) {
                abstractC14726aMo35137f.mo35134c(rangeM51491p);
            }
            map3.put(c9iVar2, abstractC14726aMo35137f.mo35132a());
            it4 = it5;
            list2 = list11;
            map5 = map17;
            rangeM51491p = rangeM51491p;
        }
        HashMap map18 = map3;
        if (list3 != null && iIntValue == i6 && list4.size() == list5.size()) {
            int i10 = 0;
            while (true) {
                if (i10 >= list4.size()) {
                    break;
                }
                if (!((Size) list4.get(i10)).equals(list5.get(i10))) {
                    z3 = true;
                    break;
                }
                i10++;
            }
            if (!z3) {
                map9 = map4;
                if (!m7g.m38505k(this.f48849k, list, map18, map9)) {
                    m7g.m38506l(map18, map9, map8, map7, list3);
                }
            }
        } else {
            map9 = map4;
        }
        return new Pair(map18, map9);
    }

    /* renamed from: B */
    public final List m51464B(AbstractC17371b abstractC17371b) {
        if (this.f48843e.containsKey(abstractC17371b)) {
            return (List) this.f48843e.get(abstractC17371b);
        }
        List arrayList = new ArrayList();
        if (abstractC17371b.mo41609d()) {
            if (abstractC17371b.mo41606a() == 0) {
                arrayList.addAll(this.f48845g);
            }
        } else if (abstractC17371b.mo41607b() == 8) {
            int iMo41606a = abstractC17371b.mo41606a();
            if (iMo41606a == 1) {
                arrayList = this.f48841c;
            } else if (iMo41606a != 2) {
                arrayList.addAll(abstractC17371b.mo41608c() ? this.f48842d : this.f48839a);
            } else {
                arrayList.addAll(this.f48840b);
                arrayList.addAll(this.f48839a);
            }
        } else if (abstractC17371b.mo41607b() == 10 && abstractC17371b.mo41606a() == 0) {
            arrayList.addAll(this.f48844f);
        }
        this.f48843e.put(abstractC17371b, arrayList);
        return arrayList;
    }

    /* renamed from: C */
    public final Pair m51465C(int i, List list, List list2, List list3, List list4, int i2, Map map, Map map2) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            os0 os0Var = (os0) it.next();
            arrayList.add(os0Var.mo42618g());
            if (map != null) {
                map.put(Integer.valueOf(arrayList.size() - 1), os0Var);
            }
        }
        for (int i3 = 0; i3 < list2.size(); i3++) {
            Size size = (Size) list2.get(i3);
            c9i c9iVar = (c9i) list3.get(((Integer) list4.get(i3)).intValue());
            int iMo19021n = c9iVar.mo19021n();
            arrayList.add(weg.m54277h(i, iMo19021n, size, m51468F(iMo19021n)));
            if (map2 != null) {
                map2.put(Integer.valueOf(arrayList.size() - 1), c9iVar);
            }
            i2 = m51467E(i2, c9iVar.mo19021n(), size);
        }
        return new Pair(arrayList, Integer.valueOf(i2));
    }

    /* renamed from: D */
    public final Range m51466D(List list, List list2, List list3) {
        Iterator it = list.iterator();
        Range rangeM51469G = null;
        while (it.hasNext()) {
            rangeM51469G = m51469G(((os0) it.next()).mo42619h(), rangeM51469G);
        }
        Iterator it2 = list3.iterator();
        while (it2.hasNext()) {
            rangeM51469G = m51469G(((c9i) list2.get(((Integer) it2.next()).intValue())).m20539v(null), rangeM51469G);
        }
        return rangeM51469G;
    }

    /* renamed from: E */
    public final int m51467E(int i, int i2, Size size) {
        return Math.min(i, m51459q(this.f48849k, i2, size));
    }

    /* renamed from: F */
    public cgg m51468F(int i) {
        if (!this.f48859u.contains(Integer.valueOf(i))) {
            m51475O(this.f48858t.mo21220j(), mvf.f36042e, i);
            m51475O(this.f48858t.mo21218h(), mvf.f36044g, i);
            m51474N(this.f48858t.mo21214d(), i);
            m51476P(this.f48858t.mo21222l(), i);
            this.f48859u.add(Integer.valueOf(i));
        }
        return this.f48858t;
    }

    /* renamed from: G */
    public final Range m51469G(Range range, Range range2) {
        if (range2 == null) {
            return range;
        }
        if (range != null) {
            try {
                return range2.intersect(range);
            } catch (IllegalArgumentException unused) {
            }
        }
        return range2;
    }

    /* renamed from: J */
    public final boolean m51470J() {
        int[] iArrM44876b = this.f48849k.m47966b().m44876b();
        if (iArrM44876b == null) {
            return false;
        }
        for (int i : iArrM44876b) {
            if (i == 4101) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: K */
    public final boolean m51471K(AbstractC17371b abstractC17371b, List list, Map map) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(((os0) it.next()).mo42618g());
        }
        nk3 nk3Var = new nk3();
        for (c9i c9iVar : map.keySet()) {
            List list2 = (List) map.get(c9iVar);
            fgd.m26658b((list2 == null || list2.isEmpty()) ? false : true, "No available output size is found for " + c9iVar + ".");
            Size size = (Size) Collections.min(list2, nk3Var);
            int iMo19021n = c9iVar.mo19021n();
            arrayList.add(weg.m54277h(abstractC17371b.mo41606a(), iMo19021n, size, m51468F(iMo19021n)));
        }
        return m51479c(abstractC17371b, arrayList);
    }

    /* renamed from: L */
    public final void m51472L() throws NumberFormatException {
        this.f48860v.m45848g();
        if (this.f48858t == null) {
            m51487l();
        } else {
            this.f48858t = cgg.m21211a(this.f48858t.mo21212b(), this.f48858t.mo21220j(), this.f48860v.m45847f(), this.f48858t.mo21218h(), this.f48858t.mo21216f(), this.f48858t.mo21214d(), this.f48858t.mo21222l());
        }
    }

    /* renamed from: M */
    public weg m51473M(int i, int i2, Size size) {
        return weg.m54277h(i, i2, size, m51468F(i2));
    }

    /* renamed from: N */
    public final void m51474N(Map map, int i) {
        Size sizeM51492r = m51492r(this.f48849k.m47966b().m44878d(), i, true);
        if (sizeM51492r != null) {
            map.put(Integer.valueOf(i), sizeM51492r);
        }
    }

    /* renamed from: O */
    public final void m51475O(Map map, Size size, int i) {
        if (this.f48854p) {
            Size sizeM51492r = m51492r(this.f48849k.m47966b().m44878d(), i, false);
            Integer numValueOf = Integer.valueOf(i);
            if (sizeM51492r != null) {
                size = (Size) Collections.min(Arrays.asList(size, sizeM51492r), new nk3());
            }
            map.put(numValueOf, size);
        }
    }

    /* renamed from: P */
    public final void m51476P(Map map, int i) {
        StreamConfigurationMap streamConfigurationMap;
        if (Build.VERSION.SDK_INT < 31 || !this.f48856r || (streamConfigurationMap = (StreamConfigurationMap) this.f48849k.m47965a(CameraCharacteristics.SCALER_STREAM_CONFIGURATION_MAP_MAXIMUM_RESOLUTION)) == null) {
            return;
        }
        map.put(Integer.valueOf(i), m51492r(streamConfigurationMap, i, true));
    }

    /* renamed from: a */
    public List m51477a(List list, int i) {
        Rational rational;
        int iM46869a = this.f48861w.m46869a(this.f48847i, this.f48849k);
        if (iM46869a == 0) {
            rational = np0.f37119a;
        } else if (iM46869a == 1) {
            rational = np0.f37121c;
        } else if (iM46869a != 2) {
            rational = null;
        } else {
            Size sizeM21213c = m51468F(256).m21213c(256);
            rational = new Rational(sizeM21213c.getWidth(), sizeM21213c.getHeight());
        }
        if (rational != null) {
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                Size size = (Size) it.next();
                if (np0.m40886a(size, rational)) {
                    arrayList.add(size);
                } else {
                    arrayList2.add(size);
                }
            }
            arrayList2.addAll(0, arrayList);
            list = arrayList2;
        }
        return this.f48862x.m35965a(weg.m54276e(i), list);
    }

    /* renamed from: b */
    public final void m51478b() {
    }

    /* renamed from: c */
    public boolean m51479c(AbstractC17371b abstractC17371b, List list) {
        Iterator it = m51464B(abstractC17371b).iterator();
        boolean z = false;
        while (it.hasNext()) {
            z = ((veg) it.next()).m52680d(list) != null;
            if (z) {
                break;
            }
        }
        return z;
    }

    /* renamed from: e */
    public final AbstractC17371b m51480e(int i, Map map, boolean z, boolean z2) {
        int iM51462z = m51462z(map);
        if (i != 0 && z2) {
            throw new IllegalArgumentException(String.format("Camera device id is %s. Ultra HDR is not currently supported in %s camera mode.", this.f48847i, ea2.m24654a(i)));
        }
        if (i == 0 || iM51462z != 10) {
            return AbstractC17371b.m51499e(i, iM51462z, z, z2);
        }
        throw new IllegalArgumentException(String.format("Camera device id is %s. 10 bit dynamic range is not currently supported in %s camera mode.", this.f48847i, ea2.m24654a(i)));
    }

    /* renamed from: f */
    public final Map m51481f(Map map, AbstractC17371b abstractC17371b, Range range) {
        HashMap map2 = new HashMap();
        for (c9i c9iVar : map.keySet()) {
            ArrayList arrayList = new ArrayList();
            HashMap map3 = new HashMap();
            for (Size size : (List) map.get(c9iVar)) {
                int iMo19021n = c9iVar.mo19021n();
                weg.EnumC17832a enumC17832aMo42972c = weg.m54277h(abstractC17371b.mo41606a(), iMo19021n, size, m51468F(iMo19021n)).mo42972c();
                int iM51459q = range != null ? m51459q(this.f48849k, iMo19021n, size) : Api.BaseClientBuilder.API_PRIORITY_OTHER;
                Set hashSet = (Set) map3.get(enumC17832aMo42972c);
                if (hashSet == null) {
                    hashSet = new HashSet();
                    map3.put(enumC17832aMo42972c, hashSet);
                }
                if (!hashSet.contains(Integer.valueOf(iM51459q))) {
                    arrayList.add(size);
                    hashSet.add(Integer.valueOf(iM51459q));
                }
            }
            map2.put(c9iVar, arrayList);
        }
        return map2;
    }

    /* renamed from: g */
    public final void m51482g() {
        this.f48844f.addAll(qv7.m45866b());
    }

    /* renamed from: h */
    public final void m51483h() {
        this.f48841c.addAll(qv7.m45868d());
    }

    /* renamed from: i */
    public final void m51484i() {
        if (Build.VERSION.SDK_INT >= 33) {
            this.f48842d.addAll(qv7.m45873i());
        }
    }

    /* renamed from: j */
    public final void m51485j() {
        if (Build.VERSION.SDK_INT >= 33) {
            this.f48846h.addAll(qv7.m45875k());
        }
    }

    /* renamed from: k */
    public final void m51486k() {
        this.f48839a.addAll(qv7.m45865a(this.f48851m, this.f48852n, this.f48853o));
        this.f48839a.addAll(this.f48850l.m45764a(this.f48847i));
    }

    /* renamed from: l */
    public final void m51487l() throws NumberFormatException {
        this.f48858t = cgg.m21211a(mvf.f36040c, new HashMap(), this.f48860v.m45847f(), new HashMap(), m51495w(), new HashMap(), new HashMap());
    }

    /* renamed from: m */
    public final void m51488m() {
        this.f48845g.addAll(qv7.m45876l());
    }

    /* renamed from: n */
    public final void m51489n() {
        this.f48840b.addAll(qv7.m45877m());
    }

    /* renamed from: o */
    public final List m51490o(List list) {
        Iterator it = list.iterator();
        int size = 1;
        while (it.hasNext()) {
            size *= ((List) it.next()).size();
        }
        if (size == 0) {
            throw new IllegalArgumentException("Failed to find supported resolutions.");
        }
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < size; i++) {
            arrayList.add(new ArrayList());
        }
        int size2 = size / ((List) list.get(0)).size();
        int i2 = size;
        for (int i3 = 0; i3 < list.size(); i3++) {
            List list2 = (List) list.get(i3);
            for (int i4 = 0; i4 < size; i4++) {
                ((List) arrayList.get(i4)).add((Size) list2.get((i4 % i2) / size2));
            }
            if (i3 < list.size() - 1) {
                i2 = size2;
                size2 /= ((List) list.get(i3 + 1)).size();
            }
        }
        return arrayList;
    }

    /* renamed from: p */
    public final Range m51491p(Range range, int i) {
        if (range != null) {
            Range rangeM51458d = k7g.f31605a;
            if (!range.equals(rangeM51458d)) {
                Range[] rangeArr = (Range[]) this.f48849k.m47965a(CameraCharacteristics.CONTROL_AE_AVAILABLE_TARGET_FPS_RANGES);
                if (rangeArr == null) {
                    return rangeM51458d;
                }
                Range range2 = new Range(Integer.valueOf(Math.min(((Integer) range.getLower()).intValue(), i)), Integer.valueOf(Math.min(((Integer) range.getUpper()).intValue(), i)));
                int iM51461v = 0;
                for (Range range3 : rangeArr) {
                    if (i >= ((Integer) range3.getLower()).intValue()) {
                        if (rangeM51458d.equals(k7g.f31605a)) {
                            rangeM51458d = range3;
                        }
                        if (range3.equals(range2)) {
                            return range3;
                        }
                        try {
                            int iM51461v2 = m51461v(range3.intersect(range2));
                            if (iM51461v == 0) {
                                iM51461v = iM51461v2;
                            } else {
                                if (iM51461v2 >= iM51461v) {
                                    rangeM51458d = m51458d(range2, rangeM51458d, range3);
                                    iM51461v = m51461v(range2.intersect(rangeM51458d));
                                }
                                range3 = rangeM51458d;
                            }
                        } catch (IllegalArgumentException unused) {
                            if (iM51461v != 0 || (m51460u(range3, range2) >= m51460u(rangeM51458d, range2) && (m51460u(range3, range2) != m51460u(rangeM51458d, range2) || (((Integer) range3.getLower()).intValue() <= ((Integer) rangeM51458d.getUpper()).intValue() && m51461v(range3) >= m51461v(rangeM51458d))))) {
                            }
                        }
                        rangeM51458d = range3;
                    }
                }
                return rangeM51458d;
            }
        }
        return k7g.f31605a;
    }

    /* renamed from: r */
    public final Size m51492r(StreamConfigurationMap streamConfigurationMap, int i, boolean z) {
        Size[] sizeArrM51498a;
        Size[] outputSizes = i == 34 ? streamConfigurationMap.getOutputSizes(SurfaceTexture.class) : streamConfigurationMap.getOutputSizes(i);
        if (outputSizes == null || outputSizes.length == 0) {
            return null;
        }
        nk3 nk3Var = new nk3();
        Size size = (Size) Collections.max(Arrays.asList(outputSizes), nk3Var);
        Size size2 = mvf.f36038a;
        if (z && (sizeArrM51498a = C17370a.m51498a(streamConfigurationMap, i)) != null && sizeArrM51498a.length > 0) {
            size2 = (Size) Collections.max(Arrays.asList(sizeArrM51498a), nk3Var);
        }
        return (Size) Collections.max(Arrays.asList(size, size2), nk3Var);
    }

    /* renamed from: s */
    public final int m51493s(List list) {
        Iterator it = list.iterator();
        int iM51467E = Api.BaseClientBuilder.API_PRIORITY_OTHER;
        while (it.hasNext()) {
            os0 os0Var = (os0) it.next();
            iM51467E = m51467E(iM51467E, os0Var.mo42615d(), os0Var.mo42617f());
        }
        return iM51467E;
    }

    /* renamed from: t */
    public List m51494t(AbstractC17371b abstractC17371b, List list) {
        if (!m7g.m38508n(abstractC17371b)) {
            return null;
        }
        Iterator it = this.f48846h.iterator();
        while (it.hasNext()) {
            List listM52680d = ((veg) it.next()).m52680d(list);
            if (listM52680d != null) {
                return listM52680d;
            }
        }
        return null;
    }

    /* renamed from: w */
    public final Size m51495w() throws NumberFormatException {
        try {
            int i = Integer.parseInt(this.f48847i);
            CamcorderProfile camcorderProfileMo18210a = this.f48848j.mo18211b(i, 1) ? this.f48848j.mo18210a(i, 1) : null;
            return camcorderProfileMo18210a != null ? new Size(camcorderProfileMo18210a.videoFrameWidth, camcorderProfileMo18210a.videoFrameHeight) : m51496x(i);
        } catch (NumberFormatException unused) {
            return m51497y();
        }
    }

    /* renamed from: x */
    public final Size m51496x(int i) {
        Size size = mvf.f36041d;
        CamcorderProfile camcorderProfileMo18210a = this.f48848j.mo18211b(i, 10) ? this.f48848j.mo18210a(i, 10) : this.f48848j.mo18211b(i, 8) ? this.f48848j.mo18210a(i, 8) : this.f48848j.mo18211b(i, 12) ? this.f48848j.mo18210a(i, 12) : this.f48848j.mo18211b(i, 6) ? this.f48848j.mo18210a(i, 6) : this.f48848j.mo18211b(i, 5) ? this.f48848j.mo18210a(i, 5) : this.f48848j.mo18211b(i, 4) ? this.f48848j.mo18210a(i, 4) : null;
        return camcorderProfileMo18210a != null ? new Size(camcorderProfileMo18210a.videoFrameWidth, camcorderProfileMo18210a.videoFrameHeight) : size;
    }

    /* renamed from: y */
    public final Size m51497y() {
        Size[] outputSizes = this.f48849k.m47966b().m44878d().getOutputSizes(MediaRecorder.class);
        if (outputSizes == null) {
            return mvf.f36041d;
        }
        Arrays.sort(outputSizes, new nk3(true));
        for (Size size : outputSizes) {
            int width = size.getWidth();
            Size size2 = mvf.f36043f;
            if (width <= size2.getWidth() && size.getHeight() <= size2.getHeight()) {
                return size;
            }
        }
        return mvf.f36041d;
    }
}
