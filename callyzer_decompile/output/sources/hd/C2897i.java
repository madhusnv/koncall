package hd;

import fd.C2271i;
import fd.C2272j;
import fd.C2273k;
import fd.InterfaceC2266d;
import fd.InterfaceC2267e;
import fd.InterfaceC2275m;
import fd.InterfaceC2276n;
import hc.AbstractC2887j;
import hc.C2882e;
import hc.C2883f;
import hc.C2884g;
import hc.C2885h;
import hc.C2886i;
import java.util.ArrayList;
import java.util.Map;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.AbstractC4154l;
import pg.AbstractC5933n;
import rw.AbstractC6662l;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: hd.i */
/* loaded from: classes.dex */
public final class C2897i implements InterfaceC2275m, InterfaceC2266d, InterfaceC2267e, InterfaceC2276n {

    /* renamed from: a */
    public final C2893e f15931a = new C2893e(false);

    static {
        AbstractC6662l.m12710M(new Double[]{Double.valueOf(Double.NEGATIVE_INFINITY), Double.valueOf(Double.POSITIVE_INFINITY), Double.valueOf(Double.NaN)});
        AbstractC6662l.m12710M(new Float[]{Float.valueOf(Float.NEGATIVE_INFINITY), Float.valueOf(Float.POSITIVE_INFINITY), Float.valueOf(Float.NaN)});
    }

    @Override // fd.InterfaceC2270h
    /* renamed from: a */
    public final void mo5961a(C2273k c2273k) {
        c2273k.f10283b.invoke(this, c2273k.f10282a);
    }

    @Override // fd.InterfaceC2275m
    /* renamed from: b */
    public final InterfaceC2276n mo5962b(C2272j c2272j) {
        C2893e c2893e = this.f15931a;
        c2893e.getClass();
        EnumC2908t enumC2908t = EnumC2908t.ObjectFirstKeyOrEnd;
        c2893e.m7010d("{");
        if (c2893e.f15922a) {
            ((StringBuilder) c2893e.f15924c).append('\n');
        }
        c2893e.f15923b++;
        ArrayList arrayList = (ArrayList) c2893e.f15925d;
        AbstractC4154l.m8923f(arrayList, "<this>");
        arrayList.add(enumC2908t);
        return this;
    }

    @Override // fd.InterfaceC2276n
    /* renamed from: c */
    public final void mo2595c(C2271i c2271i, int i10) {
        String strM11794b = AbstractC5933n.m11794b(c2271i);
        C2893e c2893e = this.f15931a;
        c2893e.m7014h(strM11794b);
        c2893e.m7010d(Integer.valueOf(i10).toString());
    }

    @Override // fd.InterfaceC2276n
    /* renamed from: d */
    public final void mo2596d(C2271i c2271i, String value) {
        AbstractC4154l.m8923f(value, "value");
        this.f15931a.m7014h(AbstractC5933n.m11794b(c2271i));
        m7023m(value);
    }

    @Override // fd.InterfaceC2276n
    /* renamed from: e */
    public final void mo2597e(C2271i c2271i, C2273k c2273k) {
        this.f15931a.m7014h(AbstractC5933n.m11794b(c2271i));
        c2273k.f10283b.invoke(this, c2273k.f10282a);
    }

    @Override // fd.InterfaceC2276n
    /* renamed from: f */
    public final void mo2598f() {
        this.f15931a.m7011e();
    }

    /* renamed from: g */
    public final InterfaceC2266d m7018g(C2271i c2271i) {
        C2893e c2893e = this.f15931a;
        c2893e.getClass();
        EnumC2908t enumC2908t = EnumC2908t.ArrayFirstValueOrEnd;
        c2893e.m7010d("[");
        if (c2893e.f15922a) {
            ((StringBuilder) c2893e.f15924c).append('\n');
        }
        c2893e.f15923b++;
        ArrayList arrayList = (ArrayList) c2893e.f15925d;
        AbstractC4154l.m8923f(arrayList, "<this>");
        arrayList.add(enumC2908t);
        return this;
    }

    @Override // fd.InterfaceC2267e
    /* renamed from: h */
    public final void mo5960h(String key, String str) {
        AbstractC4154l.m8923f(key, "key");
        C2893e c2893e = this.f15931a;
        c2893e.m7014h(key);
        if (str != null) {
            m7023m(str);
        } else {
            c2893e.m7010d("null");
        }
    }

    /* renamed from: i */
    public final InterfaceC2267e m7019i(C2271i c2271i) {
        C2893e c2893e = this.f15931a;
        c2893e.getClass();
        EnumC2908t enumC2908t = EnumC2908t.ObjectFirstKeyOrEnd;
        c2893e.m7010d("{");
        if (c2893e.f15922a) {
            ((StringBuilder) c2893e.f15924c).append('\n');
        }
        c2893e.f15923b++;
        ArrayList arrayList = (ArrayList) c2893e.f15925d;
        AbstractC4154l.m8923f(arrayList, "<this>");
        arrayList.add(enumC2908t);
        return this;
    }

    /* renamed from: j */
    public final void m7020j() {
        C2893e c2893e = this.f15931a;
        c2893e.getClass();
        c2893e.m7009c("]", EnumC2908t.ArrayFirstValueOrEnd, EnumC2908t.ArrayNextValueOrEnd);
    }

    /* renamed from: k */
    public final void m7021k() {
        this.f15931a.m7011e();
    }

    /* renamed from: l */
    public final void m7022l(AbstractC2887j abstractC2887j) {
        boolean z6 = abstractC2887j instanceof C2885h;
        C2893e c2893e = this.f15931a;
        if (z6) {
            Number value = ((C2885h) abstractC2887j).f15912a;
            c2893e.getClass();
            AbstractC4154l.m8923f(value, "value");
            c2893e.m7010d(value.toString());
            return;
        }
        if (abstractC2887j instanceof C2886i) {
            c2893e.m7015i(((C2886i) abstractC2887j).f15913a);
            return;
        }
        if (abstractC2887j instanceof C2882e) {
            boolean z10 = ((C2882e) abstractC2887j).f15909a;
            c2893e.getClass();
            c2893e.m7010d(String.valueOf(z10));
            return;
        }
        if (abstractC2887j == null) {
            c2893e.m7010d("null");
            return;
        }
        if (abstractC2887j instanceof C2883f) {
            c2893e.getClass();
            EnumC2908t enumC2908t = EnumC2908t.ArrayFirstValueOrEnd;
            c2893e.m7010d("[");
            if (c2893e.f15922a) {
                ((StringBuilder) c2893e.f15924c).append('\n');
            }
            c2893e.f15923b++;
            ArrayList arrayList = (ArrayList) c2893e.f15925d;
            AbstractC4154l.m8923f(arrayList, "<this>");
            arrayList.add(enumC2908t);
            ArrayList arrayList2 = ((C2883f) abstractC2887j).f15910a;
            int size = arrayList2.size();
            int i10 = 0;
            while (i10 < size) {
                Object obj = arrayList2.get(i10);
                i10++;
                m7022l((AbstractC2887j) obj);
            }
            c2893e.m7009c("]", EnumC2908t.ArrayFirstValueOrEnd, EnumC2908t.ArrayNextValueOrEnd);
            return;
        }
        if (!(abstractC2887j instanceof C2884g)) {
            throw new NoWhenBranchMatchedException();
        }
        c2893e.getClass();
        EnumC2908t enumC2908t2 = EnumC2908t.ObjectFirstKeyOrEnd;
        c2893e.m7010d("{");
        if (c2893e.f15922a) {
            ((StringBuilder) c2893e.f15924c).append('\n');
        }
        c2893e.f15923b++;
        ArrayList arrayList3 = (ArrayList) c2893e.f15925d;
        AbstractC4154l.m8923f(arrayList3, "<this>");
        arrayList3.add(enumC2908t2);
        for (Map.Entry entry : ((C2884g) abstractC2887j).f15911a.entrySet()) {
            c2893e.m7014h((String) entry.getKey());
            m7022l((AbstractC2887j) entry.getValue());
        }
        c2893e.m7011e();
    }

    /* renamed from: m */
    public final void m7023m(String value) {
        AbstractC4154l.m8923f(value, "value");
        this.f15931a.m7015i(value);
    }

    @Override // fd.InterfaceC2276n
    /* renamed from: n */
    public final void mo2604n(C2271i c2271i, boolean z6) {
        String strM11794b = AbstractC5933n.m11794b(c2271i);
        C2893e c2893e = this.f15931a;
        c2893e.m7014h(strM11794b);
        c2893e.m7010d(String.valueOf(z6));
    }
}
