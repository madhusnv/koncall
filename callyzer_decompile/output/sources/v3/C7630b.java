package v3;

import ex.InterfaceC2137a;
import kotlin.jvm.internal.AbstractC4154l;
import kotlin.jvm.internal.AbstractC4155m;
import u3.InterfaceC7332c;
import w2.InterfaceC7877p;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: v3.b */
/* loaded from: classes.dex */
public final class C7630b extends AbstractC4155m implements InterfaceC2137a {

    /* renamed from: a */
    public final /* synthetic */ int f36787a;

    /* renamed from: b */
    public final /* synthetic */ C7631c f36788b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C7630b(C7631c c7631c, int i10) {
        super(0);
        this.f36787a = i10;
        this.f36788b = c7631c;
    }

    @Override // ex.InterfaceC2137a
    public final Object invoke() {
        switch (this.f36787a) {
            case 0:
                this.f36788b.N0();
                break;
            default:
                C7631c c7631c = this.f36788b;
                InterfaceC7877p interfaceC7877p = c7631c.f36789q;
                AbstractC4154l.m8921d(interfaceC7877p, "null cannot be cast to non-null type androidx.compose.ui.modifier.ModifierLocalConsumer");
                ((InterfaceC7332c) interfaceC7877p).mo10373d(c7631c);
                break;
        }
        return qw.a0.f30746a;
    }
}
