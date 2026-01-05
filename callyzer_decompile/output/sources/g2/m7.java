package g2;

import ex.InterfaceC2139c;
import kotlin.jvm.internal.AbstractC4155m;
import p005f.C2153b;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class m7 extends AbstractC4155m implements InterfaceC2139c {

    /* renamed from: a */
    public final /* synthetic */ int f12098a;

    /* renamed from: b */
    public final /* synthetic */ o7 f12099b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ m7(o7 o7Var, int i10) {
        super(1);
        this.f12098a = i10;
        this.f12099b = o7Var;
    }

    @Override // ex.InterfaceC2139c
    public final Object invoke(Object obj) {
        switch (this.f12098a) {
            case 0:
                o7 o7Var = this.f12099b;
                if (o7Var.f12285e.f11177b) {
                    o7Var.f12284d.invoke();
                }
                return qw.a0.f30746a;
            default:
                o7 o7Var2 = this.f12099b;
                o7Var2.show();
                return new C2153b(4, o7Var2);
        }
    }
}
