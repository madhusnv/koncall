package i9;

import ex.InterfaceC2137a;
import kotlin.jvm.internal.C4168z;
import pc.C5884l;
import sb.C6778e;
import sb.InterfaceC6777d;
import td.C7126c;
import td.EnumC7143t;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: i9.v */
/* loaded from: classes.dex */
public final /* synthetic */ class C3204v implements InterfaceC2137a {

    /* renamed from: a */
    public final /* synthetic */ int f17283a;

    /* renamed from: b */
    public final /* synthetic */ C4168z f17284b;

    public /* synthetic */ C3204v(C4168z c4168z, int i10) {
        this.f17283a = i10;
        this.f17284b = c4168z;
    }

    @Override // ex.InterfaceC2137a
    public final Object invoke() {
        switch (this.f17283a) {
            case 0:
                StringBuilder sb2 = new StringBuilder("Obtained credentials from profile; expiration=");
                C7126c c7126c = ((C6778e) ((InterfaceC6777d) this.f17284b.f21164a)).f32242d;
                sb2.append(c7126c != null ? c7126c.m13409b(EnumC7143t.ISO_8601) : null);
                return sb2.toString();
            case 1:
                return "HttpResponse: " + ((C5884l) this.f17284b.f21164a).f28691b.f35158a;
            default:
                ((InterfaceC2137a) this.f17284b.f21164a).invoke();
                return qw.a0.f30746a;
        }
    }
}
