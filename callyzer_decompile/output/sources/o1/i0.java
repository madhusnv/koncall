package o1;

import ex.InterfaceC2137a;
import ex.InterfaceC2141e;
import k2.C3953b;
import k2.InterfaceC3962k;
import kotlin.jvm.internal.AbstractC4155m;
import pg.r6;
import s1.AbstractC6731z;
import s1.InterfaceC6728w;
import s2.C6734c;
import w2.InterfaceC7879r;
import w4.C7922n;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class i0 extends AbstractC4155m implements InterfaceC2141e {

    /* renamed from: a */
    public final /* synthetic */ int f25747a = 3;

    /* renamed from: b */
    public final /* synthetic */ int f25748b;

    /* renamed from: c */
    public final /* synthetic */ int f25749c;

    /* renamed from: d */
    public final /* synthetic */ Object f25750d;

    /* renamed from: e */
    public final /* synthetic */ Object f25751e;

    /* renamed from: f */
    public final /* synthetic */ Object f25752f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i0(InterfaceC2137a interfaceC2137a, C7922n c7922n, C6734c c6734c, int i10, int i11) {
        super(2);
        this.f25750d = interfaceC2137a;
        this.f25751e = c7922n;
        this.f25752f = c6734c;
        this.f25748b = i10;
        this.f25749c = i11;
    }

    @Override // ex.InterfaceC2141e
    public final Object invoke(Object obj, Object obj2) {
        int i10 = this.f25747a;
        int i11 = this.f25749c;
        Object obj3 = this.f25752f;
        Object obj4 = this.f25751e;
        Object obj5 = this.f25750d;
        qw.a0 a0Var = qw.a0.f30746a;
        switch (i10) {
            case 0:
                ((Number) obj2).intValue();
                C5243b c5243b = AbstractC5251j.f25757a;
                C5243b c5243b2 = AbstractC5251j.f25757a;
                int iM8496A = C3953b.m8496A(i11 | 1);
                int i12 = this.f25748b;
                AbstractC5244c.m10318b((InterfaceC7879r) obj5, i12, (d0) obj4, (C6734c) obj3, (InterfaceC3962k) obj, iM8496A);
                break;
            case 1:
                ((Number) obj2).intValue();
                int iM8496A2 = C3953b.m8496A(i11 | 1);
                AbstractC6731z.m12879d((InterfaceC6728w) obj5, this.f25751e, this.f25748b, this.f25752f, (InterfaceC3962k) obj, iM8496A2);
                break;
            case 2:
                ((Number) obj2).intValue();
                int iM8496A3 = C3953b.m8496A(i11 | 1);
                Object obj6 = this.f25750d;
                int i13 = this.f25748b;
                AbstractC6731z.m12877b(obj6, i13, (s1.e0) obj4, (C6734c) obj3, (InterfaceC3962k) obj, iM8496A3);
                break;
            default:
                ((Number) obj2).intValue();
                r6.m11845a((InterfaceC2137a) obj5, (C7922n) obj4, (C6734c) obj3, (InterfaceC3962k) obj, C3953b.m8496A(this.f25748b | 1), this.f25749c);
                break;
        }
        return a0Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i0(Object obj, int i10, s1.e0 e0Var, C6734c c6734c, int i11) {
        super(2);
        this.f25750d = obj;
        this.f25748b = i10;
        this.f25751e = e0Var;
        this.f25752f = c6734c;
        this.f25749c = i11;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i0(InterfaceC6728w interfaceC6728w, Object obj, int i10, Object obj2, int i11) {
        super(2);
        this.f25750d = interfaceC6728w;
        this.f25751e = obj;
        this.f25748b = i10;
        this.f25752f = obj2;
        this.f25749c = i11;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i0(InterfaceC7879r interfaceC7879r, int i10, d0 d0Var, C6734c c6734c, int i11) {
        super(2);
        C5243b c5243b = AbstractC5251j.f25757a;
        C5243b c5243b2 = AbstractC5251j.f25757a;
        this.f25750d = interfaceC7879r;
        this.f25748b = i10;
        this.f25751e = d0Var;
        this.f25752f = c6734c;
        this.f25749c = i11;
    }
}
