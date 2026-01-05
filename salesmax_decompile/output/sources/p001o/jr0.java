package p001o;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import p001o.fdd;
import p001o.k16;
import p001o.vig;

/* loaded from: classes2.dex */
public final class jr0 {

    /* renamed from: a */
    public final String f30971a;

    /* renamed from: b */
    public final String f30972b;

    /* renamed from: c */
    public final String f30973c;

    /* renamed from: d */
    public final long f30974d;

    /* renamed from: e */
    public final List f30975e;

    /* renamed from: f */
    public final String f30976f;

    /* renamed from: g */
    public final Map f30977g;

    /* renamed from: h */
    public final List f30978h;

    /* renamed from: i */
    public final String f30979i;

    /* renamed from: j */
    public final String f30980j;

    /* renamed from: k */
    public final String f30981k;

    /* renamed from: l */
    public final List f30982l;

    /* renamed from: m */
    public final List f30983m;

    public /* synthetic */ jr0(String str, String str2, String str3, long j, List list, String str4, Map map, List list2, String str5, String str6, String str7, id5 id5Var) {
        this(str, str2, str3, j, list, str4, map, list2, str5, str6, str7);
    }

    /* renamed from: c */
    public static final y3i m34345c(String str, fdd.C13403a c13403a) {
        sq8.m48649h(c13403a, "$this$PolicyDescriptorType");
        c13403a.m26469c(str);
        return y3i.f54824a;
    }

    /* renamed from: d */
    public static final y3i m34346d(Map.Entry entry, vig.C17599a c17599a) {
        sq8.m48649h(c17599a, "$this$Tag");
        c17599a.m52867d((String) entry.getKey());
        c17599a.m52868e((String) entry.getValue());
        return y3i.f54824a;
    }

    /* renamed from: e */
    public final List m34347e() {
        return this.f30982l;
    }

    /* renamed from: f */
    public final List m34348f() {
        return this.f30983m;
    }

    /* renamed from: g */
    public final long m34349g() {
        return this.f30974d;
    }

    /* renamed from: h */
    public final String m34350h() {
        return this.f30973c;
    }

    /* renamed from: i */
    public final String m34351i() {
        return this.f30976f;
    }

    /* renamed from: j */
    public final String m34352j() {
        return this.f30971a;
    }

    /* renamed from: k */
    public final String m34353k() {
        return this.f30972b;
    }

    /* renamed from: l */
    public final String m34354l() {
        return this.f30979i;
    }

    /* renamed from: m */
    public final String m34355m() {
        return this.f30981k;
    }

    /* renamed from: n */
    public final String m34356n() {
        return this.f30980j;
    }

    /* renamed from: o */
    public final List m34357o() {
        return this.f30978h;
    }

    public jr0(String str, String str2, String str3, long j, List list, String str4, Map map, List list2, String str5, String str6, String str7) {
        ArrayList arrayList;
        sq8.m48649h(str, "roleArn");
        this.f30971a = str;
        this.f30972b = str2;
        this.f30973c = str3;
        this.f30974d = j;
        this.f30975e = list;
        this.f30976f = str4;
        this.f30977g = map;
        this.f30978h = list2;
        this.f30979i = str5;
        this.f30980j = str6;
        this.f30981k = str7;
        ArrayList arrayList2 = null;
        if (list != null) {
            arrayList = new ArrayList(dh3.m23088v(list, 10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                final String str8 = (String) it.next();
                arrayList.add(fdd.f23157b.m26470a(new xk7() { // from class: o.hr0
                    @Override // p001o.xk7
                    public final Object invoke(Object obj) {
                        return jr0.m34345c(str8, (fdd.C13403a) obj);
                    }
                }));
            }
        } else {
            arrayList = null;
        }
        this.f30982l = arrayList;
        Map map2 = this.f30977g;
        if (map2 != null) {
            arrayList2 = new ArrayList(map2.size());
            for (final Map.Entry entry : map2.entrySet()) {
                arrayList2.add(vig.f50419c.m52869a(new xk7() { // from class: o.ir0
                    @Override // p001o.xk7
                    public final Object invoke(Object obj) {
                        return jr0.m34346d(entry, (vig.C17599a) obj);
                    }
                }));
            }
        }
        this.f30983m = arrayList2;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ jr0(String str, String str2, String str3, long j, List list, String str4, Map map, List list2, String str5, String str6, String str7, int i, id5 id5Var) {
        long jM38175s;
        String str8 = (i & 2) != 0 ? null : str2;
        String str9 = (i & 4) != 0 ? null : str3;
        if ((i & 8) != 0) {
            k16.C14700a c14700a = k16.f31358b;
            jM38175s = m16.m38175s(900, o16.SECONDS);
        } else {
            jM38175s = j;
        }
        this(str, str8, str9, jM38175s, (i & 16) != 0 ? null : list, (i & 32) != 0 ? null : str4, (i & 64) != 0 ? null : map, (i & 128) != 0 ? null : list2, (i & 256) != 0 ? null : str5, (i & 512) != 0 ? null : str6, (i & 1024) != 0 ? null : str7, null);
    }
}
