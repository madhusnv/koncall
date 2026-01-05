package p001o;

/* loaded from: classes6.dex */
public final class cmf extends r9 {

    /* renamed from: a */
    public long f18357a = -1;

    /* renamed from: b */
    public n64 f18358b;

    @Override // p001o.r9
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public boolean mo21435a(amf amfVar) {
        if (this.f18357a >= 0) {
            return false;
        }
        this.f18357a = amfVar.m17497X();
        return true;
    }

    @Override // p001o.r9
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public n64[] mo21436b(amf amfVar) {
        long j = this.f18357a;
        this.f18357a = -1L;
        this.f18358b = null;
        return amfVar.m17496W(j);
    }
}
