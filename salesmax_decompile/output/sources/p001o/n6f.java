package p001o;

import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes2.dex */
public final class n6f extends zig {

    /* renamed from: b */
    public long f36450b;

    /* renamed from: c */
    public long[] f36451c;

    /* renamed from: d */
    public long[] f36452d;

    public n6f() {
        super(new nt5());
        this.f36450b = -9223372036854775807L;
        this.f36451c = new long[0];
        this.f36452d = new long[0];
    }

    /* renamed from: g */
    public static Boolean m40151g(zwc zwcVar) {
        return Boolean.valueOf(zwcVar.m60004H() == 1);
    }

    /* renamed from: h */
    public static Object m40152h(zwc zwcVar, int i) {
        if (i == 0) {
            return m40154j(zwcVar);
        }
        if (i == 1) {
            return m40151g(zwcVar);
        }
        if (i == 2) {
            return m40158n(zwcVar);
        }
        if (i == 3) {
            return m40156l(zwcVar);
        }
        if (i == 8) {
            return m40155k(zwcVar);
        }
        if (i == 10) {
            return m40157m(zwcVar);
        }
        if (i != 11) {
            return null;
        }
        return m40153i(zwcVar);
    }

    /* renamed from: i */
    public static Date m40153i(zwc zwcVar) {
        Date date = new Date((long) m40154j(zwcVar).doubleValue());
        zwcVar.m60018V(2);
        return date;
    }

    /* renamed from: j */
    public static Double m40154j(zwc zwcVar) {
        return Double.valueOf(Double.longBitsToDouble(zwcVar.m59997A()));
    }

    /* renamed from: k */
    public static HashMap m40155k(zwc zwcVar) {
        int iM60008L = zwcVar.m60008L();
        HashMap map = new HashMap(iM60008L);
        for (int i = 0; i < iM60008L; i++) {
            String strM40158n = m40158n(zwcVar);
            Object objM40152h = m40152h(zwcVar, m40159o(zwcVar));
            if (objM40152h != null) {
                map.put(strM40158n, objM40152h);
            }
        }
        return map;
    }

    /* renamed from: l */
    public static HashMap m40156l(zwc zwcVar) {
        HashMap map = new HashMap();
        while (true) {
            String strM40158n = m40158n(zwcVar);
            int iM40159o = m40159o(zwcVar);
            if (iM40159o == 9) {
                return map;
            }
            Object objM40152h = m40152h(zwcVar, iM40159o);
            if (objM40152h != null) {
                map.put(strM40158n, objM40152h);
            }
        }
    }

    /* renamed from: m */
    public static ArrayList m40157m(zwc zwcVar) {
        int iM60008L = zwcVar.m60008L();
        ArrayList arrayList = new ArrayList(iM60008L);
        for (int i = 0; i < iM60008L; i++) {
            Object objM40152h = m40152h(zwcVar, m40159o(zwcVar));
            if (objM40152h != null) {
                arrayList.add(objM40152h);
            }
        }
        return arrayList;
    }

    /* renamed from: n */
    public static String m40158n(zwc zwcVar) {
        int iM60010N = zwcVar.m60010N();
        int iM60025f = zwcVar.m60025f();
        zwcVar.m60018V(iM60010N);
        return new String(zwcVar.m60024e(), iM60025f, iM60010N);
    }

    /* renamed from: o */
    public static int m40159o(zwc zwcVar) {
        return zwcVar.m60004H();
    }

    @Override // p001o.zig
    /* renamed from: b */
    public boolean mo23894b(zwc zwcVar) {
        return true;
    }

    @Override // p001o.zig
    /* renamed from: c */
    public boolean mo23895c(zwc zwcVar, long j) {
        if (m40159o(zwcVar) != 2 || !"onMetaData".equals(m40158n(zwcVar)) || zwcVar.m60020a() == 0 || m40159o(zwcVar) != 8) {
            return false;
        }
        HashMap mapM40155k = m40155k(zwcVar);
        Object obj = mapM40155k.get("duration");
        if (obj instanceof Double) {
            double dDoubleValue = ((Double) obj).doubleValue();
            if (dDoubleValue > FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE) {
                this.f36450b = (long) (dDoubleValue * 1000000.0d);
            }
        }
        Object obj2 = mapM40155k.get("keyframes");
        if (obj2 instanceof Map) {
            Map map = (Map) obj2;
            Object obj3 = map.get("filepositions");
            Object obj4 = map.get("times");
            if ((obj3 instanceof List) && (obj4 instanceof List)) {
                List list = (List) obj3;
                List list2 = (List) obj4;
                int size = list2.size();
                this.f36451c = new long[size];
                this.f36452d = new long[size];
                for (int i = 0; i < size; i++) {
                    Object obj5 = list.get(i);
                    Object obj6 = list2.get(i);
                    if (!(obj6 instanceof Double) || !(obj5 instanceof Double)) {
                        this.f36451c = new long[0];
                        this.f36452d = new long[0];
                        break;
                    }
                    this.f36451c[i] = (long) (((Double) obj6).doubleValue() * 1000000.0d);
                    this.f36452d[i] = ((Double) obj5).longValue();
                }
            }
        }
        return false;
    }

    /* renamed from: d */
    public long m40160d() {
        return this.f36450b;
    }

    /* renamed from: e */
    public long[] m40161e() {
        return this.f36452d;
    }

    /* renamed from: f */
    public long[] m40162f() {
        return this.f36451c;
    }
}
