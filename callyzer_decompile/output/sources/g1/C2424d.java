package g1;

import androidx.compose.animation.AbstractC0234a;
import androidx.compose.animation.AbstractC0235b;
import ex.InterfaceC2139c;
import ex.InterfaceC2141e;
import g2.a5;
import h1.s1;
import k2.C3953b;
import k2.InterfaceC3962k;
import kotlin.jvm.internal.AbstractC4155m;
import s2.C6734c;
import w2.InterfaceC7866e;
import w2.InterfaceC7879r;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: g1.d */
/* loaded from: classes.dex */
public final class C2424d extends AbstractC4155m implements InterfaceC2141e {

    /* renamed from: a */
    public final /* synthetic */ int f10949a = 0;

    /* renamed from: b */
    public final /* synthetic */ InterfaceC2139c f10950b;

    /* renamed from: c */
    public final /* synthetic */ InterfaceC7879r f10951c;

    /* renamed from: d */
    public final /* synthetic */ C6734c f10952d;

    /* renamed from: e */
    public final /* synthetic */ int f10953e;

    /* renamed from: f */
    public final /* synthetic */ Object f10954f;

    /* renamed from: g */
    public final /* synthetic */ Object f10955g;

    /* renamed from: h */
    public final /* synthetic */ Object f10956h;

    /* renamed from: j */
    public final /* synthetic */ Object f10957j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2424d(a5 a5Var, InterfaceC7879r interfaceC7879r, InterfaceC2139c interfaceC2139c, InterfaceC7866e interfaceC7866e, String str, InterfaceC2139c interfaceC2139c2, C6734c c6734c, int i10) {
        super(2);
        this.f10954f = a5Var;
        this.f10951c = interfaceC7879r;
        this.f10950b = interfaceC2139c;
        this.f10956h = interfaceC7866e;
        this.f10957j = str;
        this.f10955g = interfaceC2139c2;
        this.f10952d = c6734c;
        this.f10953e = i10;
    }

    @Override // ex.InterfaceC2141e
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f10949a) {
            case 0:
                ((Number) obj2).intValue();
                a5 a5Var = (a5) this.f10954f;
                InterfaceC7866e interfaceC7866e = (InterfaceC7866e) this.f10956h;
                String str = (String) this.f10957j;
                InterfaceC2139c interfaceC2139c = (InterfaceC2139c) this.f10955g;
                AbstractC0234a.m623a(a5Var, this.f10951c, this.f10950b, interfaceC7866e, str, interfaceC2139c, this.f10952d, (InterfaceC3962k) obj, C3953b.m8496A(this.f10953e | 1));
                break;
            default:
                ((Number) obj2).intValue();
                s1 s1Var = (s1) this.f10954f;
                u0 u0Var = (u0) this.f10955g;
                v0 v0Var = (v0) this.f10956h;
                InterfaceC2141e interfaceC2141e = (InterfaceC2141e) this.f10957j;
                AbstractC0235b.m626a(s1Var, this.f10950b, this.f10951c, u0Var, v0Var, interfaceC2141e, this.f10952d, (InterfaceC3962k) obj, C3953b.m8496A(this.f10953e | 1));
                break;
        }
        return qw.a0.f30746a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2424d(s1 s1Var, InterfaceC2139c interfaceC2139c, InterfaceC7879r interfaceC7879r, u0 u0Var, v0 v0Var, InterfaceC2141e interfaceC2141e, C6734c c6734c, int i10) {
        super(2);
        this.f10954f = s1Var;
        this.f10950b = interfaceC2139c;
        this.f10951c = interfaceC7879r;
        this.f10955g = u0Var;
        this.f10956h = v0Var;
        this.f10957j = interfaceC2141e;
        this.f10952d = c6734c;
        this.f10953e = i10;
    }
}
