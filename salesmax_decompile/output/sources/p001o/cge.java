package p001o;

import java.util.ArrayList;
import java.util.List;

/* loaded from: classes6.dex */
public final class cge {

    /* renamed from: a */
    public final do7 f18166a;

    /* renamed from: b */
    public final List f18167b;

    public cge(do7 do7Var) {
        this.f18166a = do7Var;
        ArrayList arrayList = new ArrayList();
        this.f18167b = arrayList;
        arrayList.add(new eo7(do7Var, new int[]{1}));
    }

    /* renamed from: a */
    public final eo7 m21198a(int i) {
        if (i >= this.f18167b.size()) {
            List list = this.f18167b;
            eo7 eo7VarM25378g = (eo7) list.get(list.size() - 1);
            for (int size = this.f18167b.size(); size <= i; size++) {
                do7 do7Var = this.f18166a;
                eo7VarM25378g = eo7VarM25378g.m25378g(new eo7(do7Var, new int[]{1, do7Var.m23643c((size - 1) + do7Var.m23644d())}));
                this.f18167b.add(eo7VarM25378g);
            }
        }
        return (eo7) this.f18167b.get(i);
    }

    /* renamed from: b */
    public void m21199b(int[] iArr, int i) {
        if (i == 0) {
            throw new IllegalArgumentException("No error correction bytes");
        }
        int length = iArr.length - i;
        if (length <= 0) {
            throw new IllegalArgumentException("No data bytes provided");
        }
        eo7 eo7VarM21198a = m21198a(i);
        int[] iArr2 = new int[length];
        System.arraycopy(iArr, 0, iArr2, 0, length);
        int[] iArrM25375d = new eo7(this.f18166a, iArr2).m25379h(i, 1).m25373b(eo7VarM21198a)[1].m25375d();
        int length2 = i - iArrM25375d.length;
        for (int i2 = 0; i2 < length2; i2++) {
            iArr[length + i2] = 0;
        }
        System.arraycopy(iArrM25375d, 0, iArr, length + length2, iArrM25375d.length);
    }
}
