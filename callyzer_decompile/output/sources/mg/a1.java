package mg;

import com.google.android.gms.internal.fido.zzhf;
import java.io.IOException;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
import yk.C8687a;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class a1 extends c1 {

    /* renamed from: a */
    public final int f23626a;

    /* renamed from: b */
    public final C4740s f23627b;

    public a1(C4740s c4740s) throws zzhf {
        c4740s.getClass();
        this.f23627b = c4740s;
        e0 e0VarMo9591e = c4740s.entrySet().mo9591e();
        int i10 = 0;
        while (e0VarMo9591e.hasNext()) {
            Map.Entry entry = (Map.Entry) e0VarMo9591e.next();
            int iMo9598b = ((c1) entry.getKey()).mo9598b();
            i10 = i10 < iMo9598b ? iMo9598b : i10;
            int iMo9598b2 = ((c1) entry.getValue()).mo9598b();
            if (i10 < iMo9598b2) {
                i10 = iMo9598b2;
            }
        }
        int i11 = i10 + 1;
        this.f23626a = i11;
        if (i11 > 8) {
            throw new zzhf("Exceeded cutoff limit for max depth of cbor value");
        }
    }

    @Override // mg.c1
    /* renamed from: a */
    public final int mo9597a() {
        return c1.m9616d((byte) -96);
    }

    @Override // mg.c1
    /* renamed from: b */
    public final int mo9598b() {
        return this.f23626a;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        int iCompareTo;
        c1 c1Var = (c1) obj;
        int iMo9597a = c1Var.mo9597a();
        int iM9616d = c1.m9616d((byte) -96);
        if (iM9616d != iMo9597a) {
            return iM9616d - c1Var.mo9597a();
        }
        C4740s c4740s = ((a1) c1Var).f23627b;
        C4740s c4740s2 = this.f23627b;
        if (c4740s2.f23693d.size() != c4740s.f23693d.size()) {
            return c4740s2.f23693d.size() - c4740s.f23693d.size();
        }
        e0 e0VarMo9591e = c4740s2.entrySet().mo9591e();
        e0 e0VarMo9591e2 = c4740s.entrySet().mo9591e();
        do {
            if (!e0VarMo9591e.hasNext() && !e0VarMo9591e2.hasNext()) {
                return 0;
            }
            Map.Entry entry = (Map.Entry) e0VarMo9591e.next();
            Map.Entry entry2 = (Map.Entry) e0VarMo9591e2.next();
            int iCompareTo2 = ((c1) entry.getKey()).compareTo((c1) entry2.getKey());
            if (iCompareTo2 != 0) {
                return iCompareTo2;
            }
            iCompareTo = ((c1) entry.getValue()).compareTo((c1) entry2.getValue());
        } while (iCompareTo == 0);
        return iCompareTo;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && a1.class == obj.getClass()) {
            return this.f23627b.equals(((a1) obj).f23627b);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(c1.m9616d((byte) -96)), this.f23627b});
    }

    public final String toString() {
        C4740s c4740s = this.f23627b;
        if (c4740s.isEmpty()) {
            return "{}";
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        e0 e0VarMo9591e = c4740s.entrySet().mo9591e();
        while (e0VarMo9591e.hasNext()) {
            Map.Entry entry = (Map.Entry) e0VarMo9591e.next();
            linkedHashMap.put(((c1) entry.getKey()).toString().replace("\n", "\n  "), ((c1) entry.getValue()).toString().replace("\n", "\n  "));
        }
        C8687a c8687a = new C8687a(20);
        StringBuilder sb2 = new StringBuilder("{\n  ");
        try {
            AbstractC4723b.m9605g(sb2, linkedHashMap.entrySet().iterator(), c8687a);
            sb2.append("\n}");
            return sb2.toString();
        } catch (IOException e2) {
            throw new AssertionError(e2);
        }
    }
}
