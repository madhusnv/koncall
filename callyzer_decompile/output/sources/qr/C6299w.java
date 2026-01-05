package qr;

import c5.C0867e;
import c9.C0927v;
import com.skydoves.balloon.internals.DefinitionKt;
import ex.InterfaceC2139c;
import kotlin.jvm.internal.AbstractC4154l;
import y4.C8540a;
import y4.C8541b;
import y4.C8542c;
import y4.C8543d;
import y4.C8546g;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: qr.w */
/* loaded from: classes3.dex */
public final /* synthetic */ class C6299w implements InterfaceC2139c {

    /* renamed from: a */
    public final /* synthetic */ int f30621a;

    /* renamed from: b */
    public final /* synthetic */ C8543d f30622b;

    public /* synthetic */ C6299w(C8543d c8543d, int i10) {
        this.f30621a = i10;
        this.f30622b = c8543d;
    }

    @Override // ex.InterfaceC2139c
    public final Object invoke(Object obj) {
        C8540a constrain = (C8540a) obj;
        switch (this.f30621a) {
            case 0:
                AbstractC4154l.m8923f(constrain, "$this$constrain");
                C8541b c8541b = constrain.f41485b;
                C8542c c8542c = c8541b.f41494d;
                C8542c c8542c2 = c8541b.f41496f;
                float f6 = 0;
                constrain.f41487d.m2644j(c8542c, f6, f6);
                constrain.f41489f.m2644j(c8542c2, f6, f6);
                constrain.f41484a.m2315E("vBias", new C0867e(0.5f));
                C8540a.m15807a(constrain, c8541b.f41493c, this.f30622b);
                constrain.m15808b(new C8546g("spread"));
                constrain.f41491h.m2590I(constrain, C8540a.f41483i[1], new C8546g("spread"));
                break;
            default:
                AbstractC4154l.m8923f(constrain, "$this$constrain");
                C0927v.m2699n(constrain.f41486c, this.f30622b, DefinitionKt.NO_Float_VALUE, 6);
                break;
        }
        return qw.a0.f30746a;
    }
}
