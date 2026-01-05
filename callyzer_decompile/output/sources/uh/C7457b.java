package uh;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: uh.b */
/* loaded from: classes.dex */
public final class C7457b implements InterfaceC7458c {

    /* renamed from: c */
    public static final Object f36046c = new Object();

    /* renamed from: a */
    public volatile InterfaceC7458c f36047a;

    /* renamed from: b */
    public volatile Object f36048b;

    /* renamed from: a */
    public static InterfaceC7458c m14270a(InterfaceC7458c interfaceC7458c) {
        if (interfaceC7458c instanceof C7457b) {
            return interfaceC7458c;
        }
        C7457b c7457b = new C7457b();
        c7457b.f36048b = f36046c;
        c7457b.f36047a = interfaceC7458c;
        return c7457b;
    }

    @Override // uh.InterfaceC7458c
    public final Object zza() {
        Object objZza;
        Object obj = this.f36048b;
        Object obj2 = f36046c;
        if (obj != obj2) {
            return obj;
        }
        synchronized (this) {
            try {
                objZza = this.f36048b;
                if (objZza == obj2) {
                    objZza = this.f36047a.zza();
                    Object obj3 = this.f36048b;
                    if (obj3 != obj2 && obj3 != objZza) {
                        throw new IllegalStateException("Scoped provider was invoked recursively returning different results: " + obj3 + " & " + objZza + ". This is likely due to a circular dependency.");
                    }
                    this.f36048b = objZza;
                    this.f36047a = null;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return objZza;
    }
}
