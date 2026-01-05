package p001o;

/* loaded from: classes3.dex */
public final class vhj implements xhj {

    /* renamed from: c */
    public static final Object f50367c = new Object();

    /* renamed from: a */
    public volatile xhj f50368a;

    /* renamed from: b */
    public volatile Object f50369b = f50367c;

    public vhj(xhj xhjVar) {
        this.f50368a = xhjVar;
    }

    /* renamed from: a */
    public static xhj m52794a(xhj xhjVar) {
        xhjVar.getClass();
        return xhjVar instanceof vhj ? xhjVar : new vhj(xhjVar);
    }

    @Override // p001o.xhj
    public final Object zza() {
        Object objZza = this.f50369b;
        Object obj = f50367c;
        if (objZza == obj) {
            synchronized (this) {
                objZza = this.f50369b;
                if (objZza == obj) {
                    objZza = this.f50368a.zza();
                    Object obj2 = this.f50369b;
                    if (obj2 != obj && obj2 != objZza) {
                        throw new IllegalStateException("Scoped provider was invoked recursively returning different results: " + obj2 + " & " + objZza + ". This is likely due to a circular dependency.");
                    }
                    this.f50369b = objZza;
                    this.f50368a = null;
                }
            }
        }
        return objZza;
    }
}
