package p001o;

import androidx.navigation.AbstractC2347n;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes2.dex */
public final class cve {

    /* renamed from: a */
    public final dc9 f18718a;

    /* renamed from: b */
    public final String f18719b;

    /* renamed from: c */
    public String f18720c;

    /* renamed from: d */
    public String f18721d;

    /* renamed from: o.cve$a */
    public enum EnumC12757a {
        PATH,
        QUERY
    }

    /* renamed from: o.cve$b */
    public /* synthetic */ class C12758b {

        /* renamed from: a */
        public static final /* synthetic */ int[] f18722a;

        static {
            int[] iArr = new int[EnumC12757a.values().length];
            try {
                iArr[EnumC12757a.PATH.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EnumC12757a.QUERY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f18722a = iArr;
        }
    }

    public cve(dc9 dc9Var) {
        sq8.m48649h(dc9Var, "serializer");
        this.f18720c = "";
        this.f18721d = "";
        this.f18718a = dc9Var;
        this.f18719b = dc9Var.getDescriptor().mo16766h();
    }

    /* renamed from: a */
    public final void m21876a(String str) {
        this.f18720c += '/' + str;
    }

    /* renamed from: b */
    public final void m21877b(String str, String str2) {
        this.f18721d += (this.f18721d.length() == 0 ? "?" : "&") + str + '=' + str2;
    }

    /* renamed from: c */
    public final void m21878c(int i, String str, AbstractC2347n abstractC2347n, List list) {
        sq8.m48649h(str, "name");
        sq8.m48649h(abstractC2347n, "type");
        sq8.m48649h(list, "value");
        int i2 = C12758b.f18722a[m21880e(i, abstractC2347n).ordinal()];
        if (i2 != 1) {
            if (i2 != 2) {
                return;
            }
            Iterator it = list.iterator();
            while (it.hasNext()) {
                m21877b(str, (String) it.next());
            }
            return;
        }
        if (list.size() == 1) {
            m21876a((String) kh3.f0(list));
            return;
        }
        throw new IllegalArgumentException(("Expected one value for argument " + str + ", found " + list.size() + "values instead.").toString());
    }

    /* renamed from: d */
    public final String m21879d() {
        return this.f18719b + this.f18720c + this.f18721d;
    }

    /* renamed from: e */
    public final EnumC12757a m21880e(int i, AbstractC2347n abstractC2347n) {
        return ((abstractC2347n instanceof vg3) || this.f18718a.getDescriptor().mo16767i(i)) ? EnumC12757a.QUERY : EnumC12757a.PATH;
    }
}
