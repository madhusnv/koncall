package d7;

import androidx.lifecycle.LifecycleDestroyedException;
import er.C2123w;
import og.od;
import tx.C7251k;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class d1 implements InterfaceC1647s {

    /* renamed from: a */
    public final /* synthetic */ EnumC1645q f8093a;

    /* renamed from: b */
    public final /* synthetic */ AbstractC1646r f8094b;

    /* renamed from: c */
    public final /* synthetic */ C7251k f8095c;

    /* renamed from: d */
    public final /* synthetic */ C2123w f8096d;

    public d1(EnumC1645q enumC1645q, AbstractC1646r abstractC1646r, C7251k c7251k, C2123w c2123w) {
        this.f8093a = enumC1645q;
        this.f8094b = abstractC1646r;
        this.f8095c = c7251k;
        this.f8096d = c2123w;
    }

    @Override // d7.InterfaceC1647s
    /* renamed from: u */
    public final void mo1120u(InterfaceC1649u interfaceC1649u, EnumC1644p enumC1644p) {
        Object objM10796a;
        EnumC1644p.Companion.getClass();
        EnumC1644p enumC1644pM5329c = C1642n.m5329c(this.f8093a);
        C7251k c7251k = this.f8095c;
        AbstractC1646r abstractC1646r = this.f8094b;
        if (enumC1644p != enumC1644pM5329c) {
            if (enumC1644p == EnumC1644p.ON_DESTROY) {
                abstractC1646r.mo5346d(this);
                c7251k.resumeWith(od.m10796a(new LifecycleDestroyedException()));
                return;
            }
            return;
        }
        abstractC1646r.mo5346d(this);
        try {
            this.f8096d.invoke();
            objM10796a = qw.a0.f30746a;
        } catch (Throwable th2) {
            objM10796a = od.m10796a(th2);
        }
        c7251k.resumeWith(objM10796a);
    }
}
