package b3;

import androidx.compose.animation.AbstractC0234a;
import com.skydoves.balloon.internals.DefinitionKt;
import d4.AbstractC1594v;
import d4.InterfaceC1596x;
import ex.InterfaceC2139c;
import g1.C2438r;
import g1.f1;
import g1.o0;
import g2.a2;
import g2.a5;
import g2.p0;
import h1.AbstractC2773d;
import kotlin.jvm.internal.AbstractC4155m;
import q1.C6097y;
import r1.C6436u;
import u2.AbstractC7311h;
import u2.AbstractC7321r;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: b3.p */
/* loaded from: classes.dex */
public final class C0584p extends AbstractC4155m implements InterfaceC2139c {

    /* renamed from: a */
    public final /* synthetic */ int f3934a;

    /* renamed from: b */
    public final /* synthetic */ int f3935b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0584p(int i10, int i11) {
        super(1);
        this.f3934a = i11;
        this.f3935b = i10;
    }

    @Override // ex.InterfaceC2139c
    public final Object invoke(Object obj) {
        switch (this.f3934a) {
            case 0:
                return Boolean.valueOf(((e0) obj).P0(this.f3935b));
            case 1:
                ((Number) obj).intValue();
                return Integer.valueOf(this.f3935b);
            case 2:
                ((Number) obj).intValue();
                return Integer.valueOf(this.f3935b);
            case 3:
                int i10 = ((a5) ((C2438r) obj).mo6100c()).f11169a;
                int i11 = this.f3935b;
                g1.a0 a0VarM625c = i10 == 1 ? AbstractC0234a.m625c(o0.m6097j(1, p0.f12360j).m6101a(o0.m6091d(AbstractC2773d.m6795r(100, 100, null, 4), DefinitionKt.NO_Float_VALUE, 2)), o0.m6092e(AbstractC2773d.m6795r(100, 0, null, 6), 2).m6102a(o0.m6098k(1, new C0584p(i11, 1)))) : AbstractC0234a.m625c(o0.m6096i(new C0584p(i11, 2), AbstractC2773d.m6795r(0, 50, null, 5)).m6101a(o0.m6091d(AbstractC2773d.m6795r(100, 100, null, 4), DefinitionKt.NO_Float_VALUE, 2)), o0.m6098k(1, p0.f12361k).m6102a(o0.m6092e(AbstractC2773d.m6795r(100, 0, null, 6), 2)));
                a0VarM625c.f10920d = new f1(a2.f11152t);
                return a0VarM625c;
            case 4:
                AbstractC1594v.m5234l((InterfaceC1596x) obj, this.f3935b);
                return qw.a0.f30746a;
            case 5:
                AbstractC1594v.m5234l((InterfaceC1596x) obj, 12 + this.f3935b);
                return qw.a0.f30746a;
            case 6:
                s1.f0 f0Var = (s1.f0) obj;
                AbstractC7311h abstractC7311hM13706c = AbstractC7321r.m13706c();
                AbstractC7321r.m13709f(abstractC7311hM13706c, AbstractC7321r.m13707d(abstractC7311hM13706c), abstractC7311hM13706c != null ? abstractC7311hM13706c.mo13650e() : null);
                for (int i12 = 0; i12 < 2; i12++) {
                    f0Var.m12847a(this.f3935b + i12);
                }
                return qw.a0.f30746a;
            case 7:
                return Integer.valueOf(((C6436u) obj).f31062a - this.f3935b);
            default:
                return Boolean.valueOf(((e0) obj).P0(this.f3935b));
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0584p(C6097y c6097y, int i10) {
        super(1);
        this.f3934a = 6;
        this.f3935b = i10;
    }
}
