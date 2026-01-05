package p001o;

import android.hardware.camera2.CameraCharacteristics;
import android.os.Build;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import p001o.d9i;
import p001o.mq3;
import p001o.ueg;

/* loaded from: classes2.dex */
public abstract class m7g {

    /* renamed from: a */
    public static final mq3.AbstractC15402a f34936a = mq3.AbstractC15402a.m39507a("camera2.streamSpec.streamUseCase", Long.TYPE);

    /* renamed from: b */
    public static final Map f34937b;

    /* renamed from: c */
    public static final Map f34938c;

    static {
        HashMap map = new HashMap();
        f34937b = map;
        HashMap map2 = new HashMap();
        f34938c = map2;
        if (Build.VERSION.SDK_INT >= 33) {
            HashSet hashSet = new HashSet();
            d9i.EnumC12848b enumC12848b = d9i.EnumC12848b.PREVIEW;
            hashSet.add(enumC12848b);
            d9i.EnumC12848b enumC12848b2 = d9i.EnumC12848b.METERING_REPEATING;
            hashSet.add(enumC12848b2);
            map.put(4L, hashSet);
            HashSet hashSet2 = new HashSet();
            hashSet2.add(enumC12848b);
            hashSet2.add(enumC12848b2);
            hashSet2.add(d9i.EnumC12848b.IMAGE_ANALYSIS);
            map.put(1L, hashSet2);
            HashSet hashSet3 = new HashSet();
            d9i.EnumC12848b enumC12848b3 = d9i.EnumC12848b.IMAGE_CAPTURE;
            hashSet3.add(enumC12848b3);
            map.put(2L, hashSet3);
            HashSet hashSet4 = new HashSet();
            d9i.EnumC12848b enumC12848b4 = d9i.EnumC12848b.VIDEO_CAPTURE;
            hashSet4.add(enumC12848b4);
            map.put(3L, hashSet4);
            HashSet hashSet5 = new HashSet();
            hashSet5.add(enumC12848b);
            hashSet5.add(enumC12848b3);
            hashSet5.add(enumC12848b4);
            map2.put(4L, hashSet5);
            HashSet hashSet6 = new HashSet();
            hashSet6.add(enumC12848b);
            hashSet6.add(enumC12848b4);
            map2.put(3L, hashSet6);
        }
    }

    /* renamed from: a */
    public static boolean m38495a(Map map, Map map2, List list) {
        for (int i = 0; i < list.size(); i++) {
            long jMo42974f = ((weg) list.get(i)).mo42974f();
            if (map.containsKey(Integer.valueOf(i))) {
                os0 os0Var = (os0) map.get(Integer.valueOf(i));
                if (!m38501g(os0Var.mo42613b().size() == 1 ? (d9i.EnumC12848b) os0Var.mo42613b().get(0) : d9i.EnumC12848b.STREAM_SHARING, jMo42974f, os0Var.mo42613b())) {
                    return false;
                }
            } else {
                if (!map2.containsKey(Integer.valueOf(i))) {
                    throw new AssertionError("SurfaceConfig does not map to any use case");
                }
                c9i c9iVar = (c9i) map2.get(Integer.valueOf(i));
                if (!m38501g(c9iVar.mo20533M(), jMo42974f, c9iVar.mo20533M() == d9i.EnumC12848b.STREAM_SHARING ? ((j7g) c9iVar).m33390W() : Collections.emptyList())) {
                    return false;
                }
            }
        }
        return true;
    }

    /* renamed from: b */
    public static boolean m38496b(Set set, Set set2) {
        Iterator it = set2.iterator();
        while (it.hasNext()) {
            if (!set.contains((Long) it.next())) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: c */
    public static boolean m38497c(s82 s82Var, List list) {
        long[] jArr;
        if (Build.VERSION.SDK_INT < 33 || (jArr = (long[]) s82Var.m47965a(CameraCharacteristics.SCALER_AVAILABLE_STREAM_USE_CASES)) == null || jArr.length == 0) {
            return false;
        }
        HashSet hashSet = new HashSet();
        for (long j : jArr) {
            hashSet.add(Long.valueOf(j));
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            if (!hashSet.contains(Long.valueOf(((weg) it.next()).mo42974f()))) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: d */
    public static boolean m38498d(List list, List list2) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            os0 os0Var = (os0) it.next();
            if (m38504j(os0Var.mo42616e(), (d9i.EnumC12848b) os0Var.mo42613b().get(0))) {
                return true;
            }
        }
        Iterator it2 = list2.iterator();
        while (it2.hasNext()) {
            c9i c9iVar = (c9i) it2.next();
            if (m38504j(c9iVar, c9iVar.mo20533M())) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: e */
    public static d72 m38499e(c9i c9iVar) {
        qpb qpbVarA0 = qpb.a0();
        mq3.AbstractC15402a abstractC15402a = d72.f19165J;
        if (c9iVar.mo36957c(abstractC15402a)) {
            qpbVarA0.mo45760N(abstractC15402a, (Long) c9iVar.mo36960f(abstractC15402a));
        }
        mq3.AbstractC15402a abstractC15402a2 = c9i.f17559C;
        if (c9iVar.mo36957c(abstractC15402a2)) {
            qpbVarA0.mo45760N(abstractC15402a2, (Boolean) c9iVar.mo36960f(abstractC15402a2));
        }
        mq3.AbstractC15402a abstractC15402a3 = tc8.f46809I;
        if (c9iVar.mo36957c(abstractC15402a3)) {
            qpbVarA0.mo45760N(abstractC15402a3, (Integer) c9iVar.mo36960f(abstractC15402a3));
        }
        mq3.AbstractC15402a abstractC15402a4 = kd8.f31942h;
        if (c9iVar.mo36957c(abstractC15402a4)) {
            qpbVarA0.mo45760N(abstractC15402a4, (Integer) c9iVar.mo36960f(abstractC15402a4));
        }
        return new d72(qpbVarA0);
    }

    /* renamed from: f */
    public static mq3 m38500f(mq3 mq3Var, long j) {
        mq3.AbstractC15402a abstractC15402a = f34936a;
        if (mq3Var.mo36957c(abstractC15402a) && ((Long) mq3Var.mo36960f(abstractC15402a)).longValue() == j) {
            return null;
        }
        qpb qpbVarB0 = qpb.b0(mq3Var);
        qpbVarB0.mo45760N(abstractC15402a, Long.valueOf(j));
        return new d72(qpbVarB0);
    }

    /* renamed from: g */
    public static boolean m38501g(d9i.EnumC12848b enumC12848b, long j, List list) {
        if (Build.VERSION.SDK_INT < 33) {
            return false;
        }
        if (enumC12848b != d9i.EnumC12848b.STREAM_SHARING) {
            Map map = f34937b;
            return map.containsKey(Long.valueOf(j)) && ((Set) map.get(Long.valueOf(j))).contains(enumC12848b);
        }
        Map map2 = f34938c;
        if (!map2.containsKey(Long.valueOf(j))) {
            return false;
        }
        Set set = (Set) map2.get(Long.valueOf(j));
        if (list.size() != set.size()) {
            return false;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            if (!set.contains((d9i.EnumC12848b) it.next())) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: h */
    public static boolean m38502h(s82 s82Var) {
        long[] jArr;
        return (Build.VERSION.SDK_INT < 33 || (jArr = (long[]) s82Var.m47965a(CameraCharacteristics.SCALER_AVAILABLE_STREAM_USE_CASES)) == null || jArr.length == 0) ? false : true;
    }

    /* renamed from: i */
    public static boolean m38503i(List list, List list2, Set set) {
        boolean z;
        boolean z2;
        HashSet hashSet = new HashSet();
        Iterator it = list.iterator();
        if (it.hasNext()) {
            os0 os0Var = (os0) it.next();
            mq3 mq3VarMo42616e = os0Var.mo42616e();
            mq3.AbstractC15402a abstractC15402a = d72.f19165J;
            if (mq3VarMo42616e.mo36957c(abstractC15402a) && ((Long) os0Var.mo42616e().mo36960f(abstractC15402a)).longValue() != 0) {
                z = true;
                z2 = false;
            } else {
                z2 = true;
                z = false;
            }
        } else {
            z = false;
            z2 = false;
        }
        Iterator it2 = list2.iterator();
        while (it2.hasNext()) {
            c9i c9iVar = (c9i) it2.next();
            mq3.AbstractC15402a abstractC15402a2 = d72.f19165J;
            if (c9iVar.mo36957c(abstractC15402a2)) {
                long jLongValue = ((Long) c9iVar.mo36960f(abstractC15402a2)).longValue();
                if (jLongValue != 0) {
                    if (z2) {
                        m38509o();
                    }
                    hashSet.add(Long.valueOf(jLongValue));
                    z = true;
                } else if (z) {
                    m38509o();
                }
            } else if (z) {
                m38509o();
            }
            z2 = true;
        }
        return !z2 && m38496b(set, hashSet);
    }

    /* renamed from: j */
    public static boolean m38504j(mq3 mq3Var, d9i.EnumC12848b enumC12848b) {
        if (((Boolean) mq3Var.mo36958d(c9i.f17559C, Boolean.FALSE)).booleanValue()) {
            return false;
        }
        mq3.AbstractC15402a abstractC15402a = tc8.f46809I;
        return mq3Var.mo36957c(abstractC15402a) && nfh.m40526b(enumC12848b, ((Integer) mq3Var.mo36960f(abstractC15402a)).intValue()) == 5;
    }

    /* renamed from: k */
    public static boolean m38505k(s82 s82Var, List list, Map map, Map map2) {
        if (Build.VERSION.SDK_INT < 33) {
            return false;
        }
        ArrayList<c9i> arrayList = new ArrayList(map.keySet());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            fgd.m26663g(((os0) it.next()).mo42616e());
        }
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            fgd.m26663g(((k7g) fgd.m26663g((k7g) map.get((c9i) it2.next()))).mo35128d());
        }
        long[] jArr = (long[]) s82Var.m47965a(CameraCharacteristics.SCALER_AVAILABLE_STREAM_USE_CASES);
        if (jArr != null && jArr.length != 0) {
            HashSet hashSet = new HashSet();
            for (long j : jArr) {
                hashSet.add(Long.valueOf(j));
            }
            if (m38503i(list, arrayList, hashSet)) {
                Iterator it3 = list.iterator();
                while (it3.hasNext()) {
                    os0 os0Var = (os0) it3.next();
                    mq3 mq3VarMo42616e = os0Var.mo42616e();
                    mq3 mq3VarM38500f = m38500f(mq3VarMo42616e, ((Long) mq3VarMo42616e.mo36960f(d72.f19165J)).longValue());
                    if (mq3VarM38500f != null) {
                        map2.put(os0Var, os0Var.m42620i(mq3VarM38500f));
                    }
                }
                for (c9i c9iVar : arrayList) {
                    k7g k7gVar = (k7g) map.get(c9iVar);
                    mq3 mq3VarMo35128d = k7gVar.mo35128d();
                    mq3 mq3VarM38500f2 = m38500f(mq3VarMo35128d, ((Long) mq3VarMo35128d.mo36960f(d72.f19165J)).longValue());
                    if (mq3VarM38500f2 != null) {
                        map.put(c9iVar, k7gVar.mo35131g().mo35135d(mq3VarM38500f2).mo35132a());
                    }
                }
                return true;
            }
        }
        return false;
    }

    /* renamed from: l */
    public static void m38506l(Map map, Map map2, Map map3, Map map4, List list) {
        for (int i = 0; i < list.size(); i++) {
            long jMo42974f = ((weg) list.get(i)).mo42974f();
            if (map3.containsKey(Integer.valueOf(i))) {
                os0 os0Var = (os0) map3.get(Integer.valueOf(i));
                mq3 mq3VarM38500f = m38500f(os0Var.mo42616e(), jMo42974f);
                if (mq3VarM38500f != null) {
                    map2.put(os0Var, os0Var.m42620i(mq3VarM38500f));
                }
            } else {
                if (!map4.containsKey(Integer.valueOf(i))) {
                    throw new AssertionError("SurfaceConfig does not map to any use case");
                }
                c9i c9iVar = (c9i) map4.get(Integer.valueOf(i));
                k7g k7gVar = (k7g) map.get(c9iVar);
                mq3 mq3VarM38500f2 = m38500f(k7gVar.mo35128d(), jMo42974f);
                if (mq3VarM38500f2 != null) {
                    map.put(c9iVar, k7gVar.mo35131g().mo35135d(mq3VarM38500f2).mo35132a());
                }
            }
        }
    }

    /* renamed from: m */
    public static void m38507m(Collection collection, Collection collection2, Map map) {
        boolean z;
        ArrayList arrayList = new ArrayList(collection2);
        Iterator it = collection.iterator();
        while (true) {
            if (!it.hasNext()) {
                z = false;
                break;
            }
            bhf bhfVar = (bhf) it.next();
            mq3 mq3VarM19027f = bhfVar.m19027f();
            mq3.AbstractC15402a abstractC15402a = f34936a;
            if (mq3VarM19027f.mo36957c(abstractC15402a) && bhfVar.m19035n().size() != 1) {
                wja.m54629c("StreamUseCaseUtil", String.format("SessionConfig has stream use case but also contains %d surfaces, abort populateSurfaceToStreamUseCaseMapping().", Integer.valueOf(bhfVar.m19035n().size())));
                return;
            } else if (bhfVar.m19027f().mo36957c(abstractC15402a)) {
                z = true;
                break;
            }
        }
        if (z) {
            Iterator it2 = collection.iterator();
            int i = 0;
            while (it2.hasNext()) {
                bhf bhfVar2 = (bhf) it2.next();
                if (((c9i) arrayList.get(i)).mo20533M() == d9i.EnumC12848b.METERING_REPEATING) {
                    fgd.m26666j(!bhfVar2.m19035n().isEmpty(), "MeteringRepeating should contain a surface");
                    map.put((yj5) bhfVar2.m19035n().get(0), 1L);
                } else {
                    mq3 mq3VarM19027f2 = bhfVar2.m19027f();
                    mq3.AbstractC15402a abstractC15402a2 = f34936a;
                    if (mq3VarM19027f2.mo36957c(abstractC15402a2) && !bhfVar2.m19035n().isEmpty()) {
                        map.put((yj5) bhfVar2.m19035n().get(0), (Long) bhfVar2.m19027f().mo36960f(abstractC15402a2));
                    }
                }
                i++;
            }
        }
    }

    /* renamed from: n */
    public static boolean m38508n(ueg.AbstractC17371b abstractC17371b) {
        return abstractC17371b.mo41606a() == 0 && abstractC17371b.mo41607b() == 8;
    }

    /* renamed from: o */
    public static void m38509o() {
        throw new IllegalArgumentException("Either all use cases must have non-default stream use case assigned or none should have it");
    }
}
