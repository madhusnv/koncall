package xt;

import ex.InterfaceC2139c;
import kotlin.jvm.internal.AbstractC4154l;
import qw.a0;
import vt.C7778i;
import vt.C7779j;
import vt.C7786q;
import yt.C8774f;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: xt.g */
/* loaded from: classes3.dex */
public final /* synthetic */ class C8456g implements InterfaceC2139c {

    /* renamed from: a */
    public final /* synthetic */ int f41247a;

    /* renamed from: b */
    public final /* synthetic */ C8774f f41248b;

    public /* synthetic */ C8456g(C8774f c8774f, int i10) {
        this.f41247a = i10;
        this.f41248b = c8774f;
    }

    @Override // ex.InterfaceC2139c
    public final Object invoke(Object obj) {
        String it = (String) obj;
        switch (this.f41247a) {
            case 0:
                AbstractC4154l.m8923f(it, "it");
                this.f41248b.m16129f(new C7779j(it));
                break;
            case 1:
                AbstractC4154l.m8923f(it, "it");
                this.f41248b.m16129f(new C7786q(it));
                break;
            default:
                AbstractC4154l.m8923f(it, "it");
                this.f41248b.m16129f(new C7778i(it));
                break;
        }
        return a0.f30746a;
    }
}
