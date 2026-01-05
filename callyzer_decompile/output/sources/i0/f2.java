package i0;

import android.hardware.camera2.params.InputConfiguration;
import android.util.Range;
import be.C0655j;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class f2 extends a2 {

    /* renamed from: j */
    public final eb.q0 f16455j = new eb.q0(2);

    /* renamed from: k */
    public boolean f16456k = true;

    /* renamed from: l */
    public final StringBuilder f16457l = new StringBuilder();

    /* renamed from: m */
    public boolean f16458m = false;

    /* renamed from: n */
    public final ArrayList f16459n = new ArrayList();

    /* renamed from: a */
    public final void m7336a(g2 g2Var) {
        q0 q0Var = g2Var.f16473g;
        int i10 = q0Var.f16567c;
        C0655j c0655j = this.f16425b;
        if (i10 != -1) {
            this.f16458m = true;
            int i11 = c0655j.f4191a;
            List list = g2.f16466j;
            if (list.indexOf(Integer.valueOf(i10)) < list.indexOf(Integer.valueOf(i11))) {
                i10 = i11;
            }
            c0655j.f4191a = i10;
        }
        Range rangeM7410a = q0Var.m7410a();
        Range range = C3082m.f16521h;
        boolean zEquals = rangeM7410a.equals(range);
        StringBuilder sb2 = this.f16457l;
        if (!zEquals) {
            if (c0655j.m1879i().equals(range)) {
                ((j1) c0655j.f4194d).m7352n(q0.f16564j, rangeM7410a);
            } else if (!c0655j.m1879i().equals(rangeM7410a)) {
                this.f16456k = false;
                String str = "Different ExpectedFrameRateRange values; current = " + c0655j.m1879i() + ", new = " + rangeM7410a;
                og.u1.m10943b("ValidatingBuilder");
                sb2.append(str);
            }
        }
        int iM7411b = q0Var.m7411b();
        if (iM7411b != 0) {
            c0655j.getClass();
            if (iM7411b != 0) {
                ((j1) c0655j.f4194d).m7352n(w2.D0, Integer.valueOf(iM7411b));
            }
        }
        int iM7412c = q0Var.m7412c();
        if (iM7412c != 0) {
            c0655j.getClass();
            if (iM7412c != 0) {
                ((j1) c0655j.f4194d).m7352n(w2.E0, Integer.valueOf(iM7412c));
            }
        }
        r2 r2Var = q0Var.f16570f;
        l1 l1Var = (l1) c0655j.f4196f;
        HashSet hashSet = (HashSet) c0655j.f4193c;
        l1Var.f16577a.putAll((Map) r2Var.f16577a);
        this.f16426c.addAll(g2Var.f16469c);
        this.f16427d.addAll(g2Var.f16470d);
        c0655j.m1873c(q0Var.f16568d);
        this.f16428e.addAll(g2Var.f16471e);
        d2 d2Var = g2Var.f16472f;
        if (d2Var != null) {
            this.f16459n.add(d2Var);
        }
        InputConfiguration inputConfiguration = g2Var.f16475i;
        if (inputConfiguration != null) {
            this.f16430g = inputConfiguration;
        }
        ArrayList arrayList = g2Var.f16467a;
        LinkedHashSet<C3080k> linkedHashSet = this.f16424a;
        linkedHashSet.addAll(arrayList);
        hashSet.addAll(Collections.unmodifiableList(q0Var.f16565a));
        ArrayList arrayList2 = new ArrayList();
        for (C3080k c3080k : linkedHashSet) {
            arrayList2.add(c3080k.f16501a);
            Iterator it = c3080k.f16502b.iterator();
            while (it.hasNext()) {
                arrayList2.add((v0) it.next());
            }
        }
        if (!arrayList2.containsAll(hashSet)) {
            og.u1.m10942a("ValidatingBuilder");
            this.f16456k = false;
            sb2.append("Invalid configuration due to capture request surfaces are not a subset of surfaces");
        }
        int i12 = g2Var.f16474h;
        int i13 = this.f16431h;
        if (i12 != i13 && i12 != 0 && i13 != 0) {
            og.u1.m10942a("ValidatingBuilder");
            this.f16456k = false;
            sb2.append("Invalid configuration due to that two non-default session types are set");
        } else if (i12 != 0) {
            this.f16431h = i12;
        }
        C3080k c3080k2 = g2Var.f16468b;
        if (c3080k2 != null) {
            C3080k c3080k3 = this.f16432i;
            if (c3080k3 == c3080k2 || c3080k3 == null) {
                this.f16432i = c3080k2;
            } else {
                og.u1.m10942a("ValidatingBuilder");
                this.f16456k = false;
                sb2.append("Invalid configuration due to that two different postview output configs are set");
            }
        }
        c0655j.m1875e(q0Var.f16566b);
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x0089  */
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final i0.g2 m7337b() {
        /*
            Method dump skipped, instructions count: 265
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: i0.f2.m7337b():i0.g2");
    }

    /* renamed from: c */
    public final boolean m7338c() {
        return this.f16458m && this.f16456k;
    }
}
