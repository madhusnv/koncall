package p001o;

/* loaded from: classes2.dex */
public class xf1 implements nfa {

    /* renamed from: a */
    public final nfa f53680a;

    /* renamed from: b */
    public int f53681b = 0;

    /* renamed from: c */
    public int f53682c = -1;

    /* renamed from: d */
    public int f53683d = -1;

    /* renamed from: e */
    public Object f53684e = null;

    public xf1(nfa nfaVar) {
        this.f53680a = nfaVar;
    }

    @Override // p001o.nfa
    /* renamed from: a */
    public void mo9426a(int i, int i2) {
        int i3;
        if (this.f53681b == 1 && i >= (i3 = this.f53682c)) {
            int i4 = this.f53683d;
            if (i <= i3 + i4) {
                this.f53683d = i4 + i2;
                this.f53682c = Math.min(i, i3);
                return;
            }
        }
        m56206e();
        this.f53682c = i;
        this.f53683d = i2;
        this.f53681b = 1;
    }

    @Override // p001o.nfa
    /* renamed from: b */
    public void mo9427b(int i, int i2) {
        int i3;
        if (this.f53681b == 2 && (i3 = this.f53682c) >= i && i3 <= i + i2) {
            this.f53683d += i2;
            this.f53682c = i;
        } else {
            m56206e();
            this.f53682c = i;
            this.f53683d = i2;
            this.f53681b = 2;
        }
    }

    @Override // p001o.nfa
    /* renamed from: c */
    public void mo9428c(int i, int i2, Object obj) {
        int i3;
        if (this.f53681b == 3) {
            int i4 = this.f53682c;
            int i5 = this.f53683d;
            if (i <= i4 + i5 && (i3 = i + i2) >= i4 && this.f53684e == obj) {
                this.f53682c = Math.min(i, i4);
                this.f53683d = Math.max(i5 + i4, i3) - this.f53682c;
                return;
            }
        }
        m56206e();
        this.f53682c = i;
        this.f53683d = i2;
        this.f53684e = obj;
        this.f53681b = 3;
    }

    @Override // p001o.nfa
    /* renamed from: d */
    public void mo9429d(int i, int i2) {
        m56206e();
        this.f53680a.mo9429d(i, i2);
    }

    /* renamed from: e */
    public void m56206e() {
        int i = this.f53681b;
        if (i == 0) {
            return;
        }
        if (i == 1) {
            this.f53680a.mo9426a(this.f53682c, this.f53683d);
        } else if (i == 2) {
            this.f53680a.mo9427b(this.f53682c, this.f53683d);
        } else if (i == 3) {
            this.f53680a.mo9428c(this.f53682c, this.f53683d, this.f53684e);
        }
        this.f53684e = null;
        this.f53681b = 0;
    }
}
