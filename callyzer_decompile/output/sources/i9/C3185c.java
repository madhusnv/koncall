package i9;

import ex.InterfaceC2137a;
import sb.C6778e;
import sb.InterfaceC6777d;
import td.C7126c;
import td.EnumC7143t;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: i9.c */
/* loaded from: classes.dex */
public final /* synthetic */ class C3185c implements InterfaceC2137a {

    /* renamed from: a */
    public final /* synthetic */ int f17130a;

    /* renamed from: b */
    public final /* synthetic */ InterfaceC6777d f17131b;

    public /* synthetic */ C3185c(InterfaceC6777d interfaceC6777d, int i10) {
        this.f17130a = i10;
        this.f17131b = interfaceC6777d;
    }

    @Override // ex.InterfaceC2137a
    public final Object invoke() {
        switch (this.f17130a) {
            case 0:
                StringBuilder sb2 = new StringBuilder("obtained credentials from container metadata service; expiration=");
                C7126c c7126c = ((C6778e) this.f17131b).f32242d;
                sb2.append(c7126c != null ? c7126c.m13409b(EnumC7143t.ISO_8601) : null);
                return sb2.toString();
            default:
                return "Attempting to reuse previously-fetched credentials (expiration = " + ((C6778e) this.f17131b).f32242d + ')';
        }
    }
}
