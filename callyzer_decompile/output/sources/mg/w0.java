package mg;

import com.google.android.gms.internal.fido.zzhf;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import yk.C8687a;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class w0 extends c1 {

    /* renamed from: a */
    public final AbstractC4735n f23709a;

    /* renamed from: b */
    public final int f23710b;

    public w0(C4746y c4746y) throws zzhf {
        c4746y.getClass();
        this.f23709a = c4746y;
        int i10 = 0;
        int i11 = 0;
        while (true) {
            AbstractC4735n abstractC4735n = this.f23709a;
            if (i10 >= abstractC4735n.size()) {
                break;
            }
            int iMo9598b = ((c1) abstractC4735n.get(i10)).mo9598b();
            if (i11 < iMo9598b) {
                i11 = iMo9598b;
            }
            i10++;
        }
        int i12 = i11 + 1;
        this.f23710b = i12;
        if (i12 > 8) {
            throw new zzhf("Exceeded cutoff limit for max depth of cbor value");
        }
    }

    @Override // mg.c1
    /* renamed from: a */
    public final int mo9597a() {
        return c1.m9616d((byte) -128);
    }

    @Override // mg.c1
    /* renamed from: b */
    public final int mo9598b() {
        return this.f23710b;
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        c1 c1Var = (c1) obj;
        int iMo9597a = c1Var.mo9597a();
        int iM9616d = c1.m9616d((byte) -128);
        if (iM9616d != iMo9597a) {
            return iM9616d - c1Var.mo9597a();
        }
        AbstractC4735n abstractC4735n = ((w0) c1Var).f23709a;
        AbstractC4735n abstractC4735n2 = this.f23709a;
        if (abstractC4735n2.size() != abstractC4735n.size()) {
            return abstractC4735n2.size() - abstractC4735n.size();
        }
        for (int i10 = 0; i10 < abstractC4735n2.size(); i10++) {
            int iCompareTo = ((c1) abstractC4735n2.get(i10)).compareTo((c1) abstractC4735n.get(i10));
            if (iCompareTo != 0) {
                return iCompareTo;
            }
        }
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && w0.class == obj.getClass()) {
            return this.f23709a.equals(((w0) obj).f23709a);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(c1.m9616d((byte) -128)), this.f23709a});
    }

    public final String toString() {
        AbstractC4735n abstractC4735n = this.f23709a;
        if (abstractC4735n.isEmpty()) {
            return "[]";
        }
        ArrayList arrayList = new ArrayList();
        int size = abstractC4735n.size();
        for (int i10 = 0; i10 < size; i10++) {
            arrayList.add(((c1) abstractC4735n.get(i10)).toString().replace("\n", "\n  "));
        }
        StringBuilder sb2 = new StringBuilder("[\n  ");
        Iterator it = arrayList.iterator();
        try {
            if (it.hasNext()) {
                sb2.append(C8687a.m16044u(it.next()));
                while (it.hasNext()) {
                    sb2.append((CharSequence) ",\n  ");
                    sb2.append(C8687a.m16044u(it.next()));
                }
            }
            sb2.append("\n]");
            return sb2.toString();
        } catch (IOException e2) {
            throw new AssertionError(e2);
        }
    }
}
