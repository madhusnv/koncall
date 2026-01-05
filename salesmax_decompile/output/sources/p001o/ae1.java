package p001o;

import p001o.l93;

/* loaded from: classes2.dex */
public final class ae1 implements l93.InterfaceC15043b {

    /* renamed from: a */
    public final int[] f14558a;

    /* renamed from: b */
    public final s0f[] f14559b;

    public ae1(int[] iArr, s0f[] s0fVarArr) {
        this.f14558a = iArr;
        this.f14559b = s0fVarArr;
    }

    /* renamed from: a */
    public int[] m16938a() {
        int[] iArr = new int[this.f14559b.length];
        int i = 0;
        while (true) {
            s0f[] s0fVarArr = this.f14559b;
            if (i >= s0fVarArr.length) {
                return iArr;
            }
            iArr[i] = s0fVarArr[i].m47404H();
            i++;
        }
    }

    /* renamed from: b */
    public void m16939b(long j) {
        for (s0f s0fVar : this.f14559b) {
            s0fVar.a0(j);
        }
    }

    @Override // p001o.l93.InterfaceC15043b
    /* renamed from: f */
    public uth mo16940f(int i, int i2) {
        int i3 = 0;
        while (true) {
            int[] iArr = this.f14558a;
            if (i3 >= iArr.length) {
                ria.m46819c("BaseMediaChunkOutput", "Unmatched track of type: " + i2);
                return new nt5();
            }
            if (i2 == iArr[i3]) {
                return this.f14559b[i3];
            }
            i3++;
        }
    }
}
