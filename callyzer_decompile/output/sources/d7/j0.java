package d7;

import ao.C0381t;
import aq.C0406i;
import dy.C1855c;
import kotlin.jvm.internal.C4168z;
import tx.C7251k;
import tx.InterfaceC7266z;
import tx.e1;
import uw.InterfaceC7559c;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class j0 implements InterfaceC1647s {

    /* renamed from: a */
    public final /* synthetic */ EnumC1644p f8107a;

    /* renamed from: b */
    public final /* synthetic */ C4168z f8108b;

    /* renamed from: c */
    public final /* synthetic */ InterfaceC7266z f8109c;

    /* renamed from: d */
    public final /* synthetic */ EnumC1644p f8110d;

    /* renamed from: e */
    public final /* synthetic */ C7251k f8111e;

    /* renamed from: f */
    public final /* synthetic */ C1855c f8112f;

    /* renamed from: g */
    public final /* synthetic */ C0406i f8113g;

    public j0(EnumC1644p enumC1644p, C4168z c4168z, InterfaceC7266z interfaceC7266z, EnumC1644p enumC1644p2, C7251k c7251k, C1855c c1855c, C0406i c0406i) {
        this.f8107a = enumC1644p;
        this.f8108b = c4168z;
        this.f8109c = interfaceC7266z;
        this.f8110d = enumC1644p2;
        this.f8111e = c7251k;
        this.f8112f = c1855c;
        this.f8113g = c0406i;
    }

    @Override // d7.InterfaceC1647s
    /* renamed from: u */
    public final void mo1120u(InterfaceC1649u interfaceC1649u, EnumC1644p enumC1644p) {
        EnumC1644p enumC1644p2 = this.f8107a;
        C4168z c4168z = this.f8108b;
        InterfaceC7559c interfaceC7559c = null;
        if (enumC1644p == enumC1644p2) {
            c4168z.f21164a = tx.c0.m13502y(this.f8109c, null, null, new C0381t(this.f8112f, this.f8113g, interfaceC7559c, 5), 3);
            return;
        }
        if (enumC1644p == this.f8110d) {
            e1 e1Var = (e1) c4168z.f21164a;
            if (e1Var != null) {
                e1Var.mo13510j(null);
            }
            c4168z.f21164a = null;
        }
        if (enumC1644p == EnumC1644p.ON_DESTROY) {
            this.f8111e.resumeWith(qw.a0.f30746a);
        }
    }
}
