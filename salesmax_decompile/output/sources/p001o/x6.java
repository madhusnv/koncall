package p001o;

/* loaded from: classes6.dex */
public abstract class x6 extends d8 implements lm1 {

    /* renamed from: a */
    public int f53251a = 4096;

    /* renamed from: b */
    public int f53252b = 8192;

    /* renamed from: c */
    public int f53253c = 24576;

    /* renamed from: d */
    public final int[] f53254d = {2, 1, 1, 2};

    /* renamed from: e */
    public final ThreadLocal f53255e = new w6(this);

    /* renamed from: o.x6$a */
    public static class C18061a {

        /* renamed from: a */
        public final sl1[][] f53256a;

        public C18061a(int i, int i2, int i3, int i4) {
            this.f53256a = new sl1[][]{new sl1[i], new sl1[i2], new sl1[i3], new sl1[i4]};
        }
    }

    /* renamed from: B */
    public abstract sl1 mo27760B(int i);

    @Override // p001o.d8
    public void doStart() {
        super.doStart();
        int i = this.f53251a;
        int i2 = this.f53252b;
        if (i == i2 && i == this.f53253c) {
            int[] iArr = this.f53254d;
            iArr[0] = iArr[0] + iArr[1] + iArr[2];
            iArr[1] = 0;
            iArr[2] = 0;
            return;
        }
        if (i == i2) {
            int[] iArr2 = this.f53254d;
            iArr2[0] = iArr2[0] + iArr2[1];
            iArr2[1] = 0;
            return;
        }
        int i3 = this.f53253c;
        if (i == i3) {
            int[] iArr3 = this.f53254d;
            iArr3[0] = iArr3[0] + iArr3[2];
            iArr3[2] = 0;
        } else if (i2 == i3) {
            int[] iArr4 = this.f53254d;
            iArr4[2] = iArr4[2] + iArr4[1];
            iArr4[1] = 0;
        }
    }

    /* renamed from: e */
    public int m55678e() {
        return this.f53251a;
    }

    @Override // p001o.lm1
    /* renamed from: f */
    public sl1 mo37460f(int i) {
        sl1[] sl1VarArr = ((C18061a) this.f53255e.get()).f53256a[i == this.f53251a ? (char) 0 : i == this.f53253c ? (char) 2 : i == this.f53252b ? (char) 1 : (char) 3];
        for (int i2 = 0; i2 < sl1VarArr.length; i2++) {
            sl1 sl1Var = sl1VarArr[i2];
            if (sl1Var != null && sl1Var.capacity() == i) {
                sl1VarArr[i2] = null;
                return sl1Var;
            }
        }
        return mo27760B(i);
    }

    @Override // p001o.lm1
    /* renamed from: j */
    public void mo37461j(sl1 sl1Var) {
        sl1Var.clear();
        if (sl1Var.o2() || sl1Var.y0()) {
            return;
        }
        int iCapacity = sl1Var.capacity();
        sl1[] sl1VarArr = ((C18061a) this.f53255e.get()).f53256a[iCapacity == this.f53251a ? (char) 0 : iCapacity == this.f53253c ? (char) 2 : iCapacity == this.f53252b ? (char) 1 : (char) 3];
        for (int i = 0; i < sl1VarArr.length; i++) {
            if (sl1VarArr[i] == null) {
                sl1VarArr[i] = sl1Var;
                return;
            }
        }
    }

    /* renamed from: m */
    public int m55679m() {
        return this.f53252b;
    }

    /* renamed from: q */
    public int m55680q() {
        return this.f53253c;
    }
}
