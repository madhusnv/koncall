package gv;

import ex.InterfaceC2139c;
import hv.C3042g;
import hv.C3043h;
import hv.C3044i;
import kotlin.jvm.internal.AbstractC4154l;
import l4.C4381z;
import nx.AbstractC5178p;
import og.yf;
import qw.a0;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: gv.g */
/* loaded from: classes3.dex */
public final class C2736g implements InterfaceC2139c {

    /* renamed from: a */
    public final /* synthetic */ int f15273a;

    /* renamed from: b */
    public final /* synthetic */ InterfaceC2139c f15274b;

    public /* synthetic */ C2736g(int i10, InterfaceC2139c interfaceC2139c) {
        this.f15273a = i10;
        this.f15274b = interfaceC2139c;
    }

    @Override // ex.InterfaceC2139c
    public final Object invoke(Object obj) {
        switch (this.f15273a) {
            case 0:
                C4381z it = (C4381z) obj;
                AbstractC4154l.m8923f(it, "it");
                String str = it.f21945a.f13620b;
                String strValueOf = str.length() > 1 ? String.valueOf(AbstractC5178p.m10102M(str)) : str;
                int length = str.length();
                this.f15274b.invoke(new C3042g(C4381z.m9154b(it, strValueOf, yf.m11072a(length, length), 4)));
                break;
            case 1:
                C4381z it2 = (C4381z) obj;
                AbstractC4154l.m8923f(it2, "it");
                String str2 = it2.f21945a.f13620b;
                String strValueOf2 = str2.length() > 1 ? String.valueOf(AbstractC5178p.m10102M(str2)) : str2;
                int length2 = str2.length();
                this.f15274b.invoke(new C3043h(C4381z.m9154b(it2, strValueOf2, yf.m11072a(length2, length2), 4)));
                break;
            case 2:
                C4381z it3 = (C4381z) obj;
                AbstractC4154l.m8923f(it3, "it");
                String str3 = it3.f21945a.f13620b;
                String strValueOf3 = str3.length() > 1 ? String.valueOf(AbstractC5178p.m10102M(str3)) : str3;
                int length3 = str3.length();
                this.f15274b.invoke(new C3044i(C4381z.m9154b(it3, strValueOf3, yf.m11072a(length3, length3), 4)));
                break;
            default:
                String it4 = (String) obj;
                AbstractC4154l.m8923f(it4, "it");
                this.f15274b.invoke(it4);
                break;
        }
        return a0.f30746a;
    }
}
