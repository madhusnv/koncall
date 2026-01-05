package p001o;

/* loaded from: classes6.dex */
public final class clh {

    /* renamed from: a */
    public final q74 f18306a;

    /* renamed from: b */
    public final Object[] f18307b;

    /* renamed from: c */
    public final fkh[] f18308c;

    /* renamed from: d */
    public int f18309d;

    public clh(q74 q74Var, int i) {
        this.f18306a = q74Var;
        this.f18307b = new Object[i];
        this.f18308c = new fkh[i];
    }

    /* renamed from: a */
    public final void m21387a(fkh fkhVar, Object obj) {
        Object[] objArr = this.f18307b;
        int i = this.f18309d;
        objArr[i] = obj;
        fkh[] fkhVarArr = this.f18308c;
        this.f18309d = i + 1;
        sq8.m48647f(fkhVar, "null cannot be cast to non-null type kotlinx.coroutines.ThreadContextElement<kotlin.Any?>");
        fkhVarArr[i] = fkhVar;
    }

    /* renamed from: b */
    public final void m21388b(q74 q74Var) {
        int length = this.f18308c.length - 1;
        if (length < 0) {
            return;
        }
        while (true) {
            int i = length - 1;
            fkh fkhVar = this.f18308c[length];
            sq8.m48646e(fkhVar);
            fkhVar.mo26969H(q74Var, this.f18307b[length]);
            if (i < 0) {
                return;
            } else {
                length = i;
            }
        }
    }
}
