package t2;

import e1.j0;
import e1.r0;
import ex.InterfaceC2137a;
import ex.InterfaceC2139c;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import l4.C4367l;
import og.d2;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: t2.i */
/* loaded from: classes.dex */
public final class C7010i implements InterfaceC7009h {

    /* renamed from: a */
    public final InterfaceC2139c f33945a;

    /* renamed from: b */
    public final j0 f33946b;

    /* renamed from: c */
    public j0 f33947c;

    public C7010i(Map map, InterfaceC2139c interfaceC2139c) {
        j0 j0Var;
        this.f33945a = interfaceC2139c;
        if (map == null || map.isEmpty()) {
            j0Var = null;
        } else {
            j0Var = new j0(map.size());
            for (Map.Entry entry : map.entrySet()) {
                j0Var.m5579l(entry.getKey(), entry.getValue());
            }
        }
        this.f33946b = j0Var;
    }

    @Override // t2.InterfaceC7009h
    /* renamed from: b */
    public final boolean mo12856b(Object obj) {
        return ((Boolean) this.f33945a.invoke(obj)).booleanValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x008e  */
    @Override // t2.InterfaceC7009h
    /* renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.Map mo12857c() {
        /*
            Method dump skipped, instructions count: 355
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: t2.C7010i.mo12857c():java.util.Map");
    }

    @Override // t2.InterfaceC7009h
    /* renamed from: d */
    public final Object mo12858d(String str) {
        j0 j0Var = this.f33946b;
        List list = j0Var != null ? (List) j0Var.m5577j(str) : null;
        if (list == null || list.isEmpty()) {
            return null;
        }
        if (list.size() > 1 && j0Var != null) {
            List listSubList = list.subList(1, list.size());
            int iM5573f = j0Var.m5573f(str);
            if (iM5573f < 0) {
                iM5573f = ~iM5573f;
            }
            Object[] objArr = j0Var.f9000c;
            Object obj = objArr[iM5573f];
            j0Var.f8999b[iM5573f] = str;
            objArr[iM5573f] = listSubList;
        }
        return list.get(0);
    }

    @Override // t2.InterfaceC7009h
    /* renamed from: e */
    public final InterfaceC7008g mo12859e(String str, InterfaceC2137a interfaceC2137a) {
        int length = str.length();
        for (int i10 = 0; i10 < length; i10++) {
            if (!d2.m10603f(str.charAt(i10))) {
                j0 j0Var = this.f33947c;
                if (j0Var == null) {
                    long[] jArr = r0.f9045a;
                    j0Var = new j0();
                    this.f33947c = j0Var;
                }
                Object objM5574g = j0Var.m5574g(str);
                if (objM5574g == null) {
                    objM5574g = new ArrayList();
                    j0Var.m5579l(str, objM5574g);
                }
                ((List) objM5574g).add(interfaceC2137a);
                return new C4367l(j0Var, str, interfaceC2137a);
            }
        }
        throw new IllegalArgumentException("Registered key is empty or blank");
    }
}
