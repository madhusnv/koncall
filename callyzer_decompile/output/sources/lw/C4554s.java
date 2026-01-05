package lw;

import com.skydoves.balloon.internals.DefinitionKt;
import ex.InterfaceC2139c;
import kotlin.jvm.internal.AbstractC4154l;
import t3.v0;
import t3.w0;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: lw.s */
/* loaded from: classes3.dex */
public final /* synthetic */ class C4554s implements InterfaceC2139c {

    /* renamed from: a */
    public final /* synthetic */ int f22661a;

    /* renamed from: b */
    public final /* synthetic */ w0 f22662b;

    public /* synthetic */ C4554s(w0 w0Var, int i10) {
        this.f22661a = i10;
        this.f22662b = w0Var;
    }

    @Override // ex.InterfaceC2139c
    public final Object invoke(Object obj) {
        v0 layout = (v0) obj;
        switch (this.f22661a) {
            case 0:
                AbstractC4154l.m8923f(layout, "$this$layout");
                layout.m13324d(this.f22662b, 0, 0, DefinitionKt.NO_Float_VALUE);
                break;
            case 1:
                layout.m13324d(this.f22662b, 0, 0, DefinitionKt.NO_Float_VALUE);
                break;
            default:
                v0.m13319g(layout, this.f22662b, 0, 0);
                break;
        }
        return qw.a0.f30746a;
    }
}
