package p001o;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p001o.fdd;
import p001o.k16;

/* loaded from: classes2.dex */
public final class rr0 {

    /* renamed from: a */
    public final String f43972a;

    /* renamed from: b */
    public final String f43973b;

    /* renamed from: c */
    public final String f43974c;

    /* renamed from: d */
    public final long f43975d;

    /* renamed from: e */
    public final String f43976e;

    /* renamed from: f */
    public final List f43977f;

    /* renamed from: g */
    public final String f43978g;

    /* renamed from: h */
    public final List f43979h;

    public /* synthetic */ rr0(String str, String str2, String str3, long j, String str4, List list, String str5, id5 id5Var) {
        this(str, str2, str3, j, str4, list, str5);
    }

    /* renamed from: b */
    public static final y3i m47075b(String str, fdd.C13403a c13403a) {
        sq8.m48649h(c13403a, "$this$PolicyDescriptorType");
        c13403a.m26469c(str);
        return y3i.f54824a;
    }

    /* renamed from: c */
    public final List m47076c() {
        return this.f43979h;
    }

    /* renamed from: d */
    public final long m47077d() {
        return this.f43975d;
    }

    /* renamed from: e */
    public final String m47078e() {
        return this.f43978g;
    }

    /* renamed from: f */
    public final String m47079f() {
        return this.f43976e;
    }

    /* renamed from: g */
    public final String m47080g() {
        return this.f43972a;
    }

    /* renamed from: h */
    public final String m47081h() {
        return this.f43974c;
    }

    /* renamed from: i */
    public final String m47082i() {
        return this.f43973b;
    }

    public rr0(String str, String str2, String str3, long j, String str4, List list, String str5) {
        ArrayList arrayList;
        sq8.m48649h(str, "roleArn");
        sq8.m48649h(str2, "webIdentityTokenFilePath");
        this.f43972a = str;
        this.f43973b = str2;
        this.f43974c = str3;
        this.f43975d = j;
        this.f43976e = str4;
        this.f43977f = list;
        this.f43978g = str5;
        if (list != null) {
            arrayList = new ArrayList(dh3.m23088v(list, 10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                final String str6 = (String) it.next();
                arrayList.add(fdd.f23157b.m26470a(new xk7() { // from class: o.qr0
                    @Override // p001o.xk7
                    public final Object invoke(Object obj) {
                        return rr0.m47075b(str6, (fdd.C13403a) obj);
                    }
                }));
            }
        } else {
            arrayList = null;
        }
        this.f43979h = arrayList;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ rr0(String str, String str2, String str3, long j, String str4, List list, String str5, int i, id5 id5Var) {
        long jM38175s;
        String str6 = (i & 4) != 0 ? null : str3;
        if ((i & 8) != 0) {
            k16.C14700a c14700a = k16.f31358b;
            jM38175s = m16.m38175s(900, o16.SECONDS);
        } else {
            jM38175s = j;
        }
        this(str, str2, str6, jM38175s, (i & 16) != 0 ? null : str4, (i & 32) != 0 ? null : list, (i & 64) != 0 ? null : str5, null);
    }
}
