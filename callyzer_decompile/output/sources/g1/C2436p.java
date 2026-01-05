package g1;

import androidx.compose.animation.AbstractC0234a;
import com.skydoves.balloon.internals.DefinitionKt;
import ex.InterfaceC2139c;
import h1.AbstractC2773d;
import h1.InterfaceC2794y;
import h1.n1;
import k2.h2;
import kotlin.jvm.internal.AbstractC4154l;
import kotlin.jvm.internal.AbstractC4155m;
import s4.C6756l;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: g1.p */
/* loaded from: classes.dex */
public final class C2436p extends AbstractC4155m implements InterfaceC2139c {

    /* renamed from: a */
    public final /* synthetic */ int f11047a;

    /* renamed from: b */
    public final /* synthetic */ C2437q f11048b;

    /* renamed from: c */
    public final /* synthetic */ long f11049c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C2436p(C2437q c2437q, long j6, int i10) {
        super(1);
        this.f11047a = i10;
        this.f11048b = c2437q;
        this.f11049c = j6;
    }

    @Override // ex.InterfaceC2139c
    public final Object invoke(Object obj) {
        long j6;
        InterfaceC2794y interfaceC2794y;
        long j10;
        switch (this.f11047a) {
            case 0:
                n1 n1Var = (n1) obj;
                Object objMo6099a = n1Var.mo6099a();
                C2437q c2437q = this.f11048b;
                if (AbstractC4154l.m8918a(objMo6099a, c2437q.f11053s.mo6099a())) {
                    j6 = C6756l.m12948a(c2437q.f11054t, AbstractC0234a.f1882a) ? this.f11049c : c2437q.f11054t;
                } else {
                    h2 h2Var = (h2) c2437q.f11053s.f11063d.m5574g(n1Var.mo6099a());
                    j6 = h2Var != null ? ((C6756l) h2Var.getValue()).f32210a : 0L;
                }
                h2 h2Var2 = (h2) c2437q.f11053s.f11063d.m5574g(n1Var.mo6100c());
                long j11 = h2Var2 != null ? ((C6756l) h2Var2.getValue()).f32210a : 0L;
                f1 f1Var = (f1) c2437q.f11052r.getValue();
                return (f1Var == null || (interfaceC2794y = (InterfaceC2794y) f1Var.f10983a.invoke(new C6756l(j6), new C6756l(j11))) == null) ? AbstractC2773d.m6794q(DefinitionKt.NO_Float_VALUE, 400.0f, null, 5) : interfaceC2794y;
            default:
                C2437q c2437q2 = this.f11048b;
                if (AbstractC4154l.m8918a(obj, c2437q2.f11053s.mo6099a())) {
                    j10 = C6756l.m12948a(c2437q2.f11054t, AbstractC0234a.f1882a) ? this.f11049c : c2437q2.f11054t;
                } else {
                    h2 h2Var3 = (h2) c2437q2.f11053s.f11063d.m5574g(obj);
                    j10 = h2Var3 != null ? ((C6756l) h2Var3.getValue()).f32210a : 0L;
                }
                return new C6756l(j10);
        }
    }
}
