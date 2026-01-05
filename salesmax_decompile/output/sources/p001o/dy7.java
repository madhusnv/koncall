package p001o;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

/* loaded from: classes2.dex */
public class dy7 extends zt3 implements by7 {
    public zt3[] V0 = new zt3[4];
    public int W0 = 0;

    @Override // p001o.by7
    /* renamed from: a */
    public void mo19918a(zt3 zt3Var) {
        if (zt3Var == this || zt3Var == null) {
            return;
        }
        int i = this.W0 + 1;
        zt3[] zt3VarArr = this.V0;
        if (i > zt3VarArr.length) {
            this.V0 = (zt3[]) Arrays.copyOf(zt3VarArr, zt3VarArr.length * 2);
        }
        zt3[] zt3VarArr2 = this.V0;
        int i2 = this.W0;
        zt3VarArr2[i2] = zt3Var;
        this.W0 = i2 + 1;
    }

    @Override // p001o.by7
    /* renamed from: b */
    public void mo19919b(au3 au3Var) {
    }

    @Override // p001o.by7
    /* renamed from: c */
    public void mo19920c() {
        this.W0 = 0;
        Arrays.fill(this.V0, (Object) null);
    }

    @Override // p001o.zt3
    /* renamed from: n */
    public void mo23956n(zt3 zt3Var, HashMap map) {
        super.mo23956n(zt3Var, map);
        dy7 dy7Var = (dy7) zt3Var;
        this.W0 = 0;
        int i = dy7Var.W0;
        for (int i2 = 0; i2 < i; i2++) {
            mo19918a((zt3) map.get(dy7Var.V0[i2]));
        }
    }

    public void w1(ArrayList arrayList, int i, q8j q8jVar) {
        for (int i2 = 0; i2 < this.W0; i2++) {
            q8jVar.m45020a(this.V0[i2]);
        }
        for (int i3 = 0; i3 < this.W0; i3++) {
            ov7.m42714a(this.V0[i3], i, arrayList, q8jVar);
        }
    }

    public int x1(int i) {
        int i2;
        int i3;
        for (int i4 = 0; i4 < this.W0; i4++) {
            zt3 zt3Var = this.V0[i4];
            if (i == 0 && (i3 = zt3Var.S0) != -1) {
                return i3;
            }
            if (i == 1 && (i2 = zt3Var.T0) != -1) {
                return i2;
            }
        }
        return -1;
    }
}
