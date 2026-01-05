package p001o;

/* loaded from: classes2.dex */
public final class buh {

    /* renamed from: a */
    public final int f16840a;

    /* renamed from: b */
    public final nke[] f16841b;

    /* renamed from: c */
    public final ko6[] f16842c;

    /* renamed from: d */
    public final euh f16843d;

    /* renamed from: e */
    public final Object f16844e;

    public buh(nke[] nkeVarArr, ko6[] ko6VarArr, euh euhVar, Object obj) {
        op0.m42511a(nkeVarArr.length == ko6VarArr.length);
        this.f16841b = nkeVarArr;
        this.f16842c = (ko6[]) ko6VarArr.clone();
        this.f16843d = euhVar;
        this.f16844e = obj;
        this.f16840a = nkeVarArr.length;
    }

    /* renamed from: a */
    public boolean m19840a(buh buhVar) {
        if (buhVar == null || buhVar.f16842c.length != this.f16842c.length) {
            return false;
        }
        for (int i = 0; i < this.f16842c.length; i++) {
            if (!m19841b(buhVar, i)) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: b */
    public boolean m19841b(buh buhVar, int i) {
        return buhVar != null && sqi.m48724c(this.f16841b[i], buhVar.f16841b[i]) && sqi.m48724c(this.f16842c[i], buhVar.f16842c[i]);
    }

    /* renamed from: c */
    public boolean m19842c(int i) {
        return this.f16841b[i] != null;
    }
}
