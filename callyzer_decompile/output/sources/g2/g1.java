package g2;

import ex.InterfaceC2137a;
import ex.InterfaceC2141e;
import f4.EnumC2203a;
import k2.C3953b;
import k2.InterfaceC3962k;
import kotlin.jvm.internal.AbstractC4155m;
import s2.C6734c;
import w1.C7860d;
import w2.InterfaceC7879r;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class g1 extends AbstractC4155m implements InterfaceC2141e {

    /* renamed from: a */
    public final /* synthetic */ int f11613a = 0;

    /* renamed from: b */
    public final /* synthetic */ boolean f11614b;

    /* renamed from: c */
    public final /* synthetic */ InterfaceC2137a f11615c;

    /* renamed from: d */
    public final /* synthetic */ int f11616d;

    /* renamed from: e */
    public final /* synthetic */ Object f11617e;

    /* renamed from: f */
    public final /* synthetic */ Object f11618f;

    /* renamed from: g */
    public final /* synthetic */ Object f11619g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g1(EnumC2203a enumC2203a, InterfaceC2137a interfaceC2137a, InterfaceC7879r interfaceC7879r, boolean z6, b1 b1Var, int i10) {
        super(2);
        this.f11617e = enumC2203a;
        this.f11615c = interfaceC2137a;
        this.f11618f = interfaceC7879r;
        this.f11614b = z6;
        this.f11619g = b1Var;
        this.f11616d = i10;
    }

    @Override // ex.InterfaceC2141e
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f11613a) {
            case 0:
                ((Number) obj2).intValue();
                EnumC2203a enumC2203a = (EnumC2203a) this.f11617e;
                InterfaceC7879r interfaceC7879r = (InterfaceC7879r) this.f11618f;
                b1 b1Var = (b1) this.f11619g;
                i1.m6174c(enumC2203a, this.f11615c, interfaceC7879r, this.f11614b, b1Var, (InterfaceC3962k) obj, C3953b.m8496A(this.f11616d | 1));
                break;
            default:
                ((Number) obj2).intValue();
                C7860d c7860d = (C7860d) this.f11617e;
                vc vcVar = (vc) this.f11618f;
                C6734c c6734c = (C6734c) this.f11619g;
                pd.m6272h(this.f11614b, c7860d, this.f11615c, vcVar, c6734c, (InterfaceC3962k) obj, C3953b.m8496A(this.f11616d | 1));
                break;
        }
        return qw.a0.f30746a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g1(boolean z6, C7860d c7860d, InterfaceC2137a interfaceC2137a, vc vcVar, C6734c c6734c, int i10) {
        super(2);
        this.f11614b = z6;
        this.f11617e = c7860d;
        this.f11615c = interfaceC2137a;
        this.f11618f = vcVar;
        this.f11619g = c6734c;
        this.f11616d = i10;
    }
}
