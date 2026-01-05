package p001o;

/* loaded from: classes6.dex */
public final class x3e {

    /* renamed from: a */
    public pgb f53145a;

    /* renamed from: b */
    public hj6 f53146b;

    /* renamed from: c */
    public pti f53147c;

    /* renamed from: d */
    public int f53148d = -1;

    /* renamed from: e */
    public hq1 f53149e;

    /* renamed from: b */
    public static boolean m55614b(int i) {
        return i >= 0 && i < 8;
    }

    /* renamed from: a */
    public hq1 m55615a() {
        return this.f53149e;
    }

    /* renamed from: c */
    public void m55616c(hj6 hj6Var) {
        this.f53146b = hj6Var;
    }

    /* renamed from: d */
    public void m55617d(int i) {
        this.f53148d = i;
    }

    /* renamed from: e */
    public void m55618e(hq1 hq1Var) {
        this.f53149e = hq1Var;
    }

    /* renamed from: f */
    public void m55619f(pgb pgbVar) {
        this.f53145a = pgbVar;
    }

    /* renamed from: g */
    public void m55620g(pti ptiVar) {
        this.f53147c = ptiVar;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(200);
        sb.append("<<\n");
        sb.append(" mode: ");
        sb.append(this.f53145a);
        sb.append("\n ecLevel: ");
        sb.append(this.f53146b);
        sb.append("\n version: ");
        sb.append(this.f53147c);
        sb.append("\n maskPattern: ");
        sb.append(this.f53148d);
        if (this.f53149e == null) {
            sb.append("\n matrix: null\n");
        } else {
            sb.append("\n matrix:\n");
            sb.append(this.f53149e);
        }
        sb.append(">>\n");
        return sb.toString();
    }
}
