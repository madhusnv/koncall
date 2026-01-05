package g2;

import ex.InterfaceC2137a;
import ex.InterfaceC2141e;
import f4.EnumC2203a;
import k2.C3953b;
import k2.InterfaceC3962k;
import kotlin.jvm.internal.AbstractC4155m;
import s2.C6734c;
import w2.InterfaceC7879r;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class f1 extends AbstractC4155m implements InterfaceC2141e {

    /* renamed from: a */
    public final /* synthetic */ int f11539a = 1;

    /* renamed from: b */
    public final /* synthetic */ boolean f11540b;

    /* renamed from: c */
    public final /* synthetic */ InterfaceC7879r f11541c;

    /* renamed from: d */
    public final /* synthetic */ int f11542d;

    /* renamed from: e */
    public final /* synthetic */ Object f11543e;

    /* renamed from: f */
    public final /* synthetic */ Object f11544f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f1(InterfaceC2137a interfaceC2137a, boolean z6, InterfaceC7879r interfaceC7879r, C6734c c6734c, int i10) {
        super(2);
        this.f11543e = interfaceC2137a;
        this.f11540b = z6;
        this.f11541c = interfaceC7879r;
        this.f11544f = c6734c;
        this.f11542d = i10;
    }

    @Override // ex.InterfaceC2141e
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f11539a) {
            case 0:
                ((Number) obj2).intValue();
                EnumC2203a enumC2203a = (EnumC2203a) this.f11543e;
                b1 b1Var = (b1) this.f11544f;
                i1.m6173b(this.f11540b, enumC2203a, this.f11541c, b1Var, (InterfaceC3962k) obj, C3953b.m8496A(this.f11542d | 1));
                break;
            default:
                ((Number) obj2).intValue();
                InterfaceC2137a interfaceC2137a = (InterfaceC2137a) this.f11543e;
                C6734c c6734c = (C6734c) this.f11544f;
                f4.m6155o(interfaceC2137a, this.f11540b, this.f11541c, c6734c, (InterfaceC3962k) obj, C3953b.m8496A(this.f11542d | 1));
                break;
        }
        return qw.a0.f30746a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f1(boolean z6, EnumC2203a enumC2203a, InterfaceC7879r interfaceC7879r, b1 b1Var, int i10) {
        super(2);
        this.f11540b = z6;
        this.f11543e = enumC2203a;
        this.f11541c = interfaceC7879r;
        this.f11544f = b1Var;
        this.f11542d = i10;
    }
}
