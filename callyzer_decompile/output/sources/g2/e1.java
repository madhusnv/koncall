package g2;

import a3.C0043b;
import androidx.fragment.app.C0348m;
import c3.C0850e;
import c9.C0925t;
import com.skydoves.balloon.internals.DefinitionKt;
import d3.C1555i;
import d3.C1556j;
import d3.C1565s;
import d4.AbstractC1594v;
import d4.C1573a;
import d4.C1582j;
import d4.C1583k;
import d4.InterfaceC1596x;
import ex.InterfaceC2137a;
import ex.InterfaceC2139c;
import f3.C2201g;
import f3.C2202h;
import f3.InterfaceC2198d;
import java.util.List;
import kotlin.jvm.internal.AbstractC4154l;
import kotlin.jvm.internal.AbstractC4155m;
import kotlin.jvm.internal.C4166x;
import lx.InterfaceC4574m;
import o1.AbstractC5256o;
import o1.C5258q;
import pg.AbstractC5941v;
import tx.InterfaceC7266z;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class e1 extends AbstractC4155m implements InterfaceC2139c {

    /* renamed from: a */
    public final /* synthetic */ int f11427a;

    /* renamed from: b */
    public final /* synthetic */ Object f11428b;

    /* renamed from: c */
    public final /* synthetic */ Object f11429c;

    /* renamed from: d */
    public final /* synthetic */ Object f11430d;

    /* renamed from: e */
    public final /* synthetic */ Object f11431e;

    /* renamed from: f */
    public final /* synthetic */ Object f11432f;

    /* renamed from: g */
    public final /* synthetic */ Object f11433g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e1(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, int i10) {
        super(1);
        this.f11427a = i10;
        this.f11428b = obj;
        this.f11429c = obj2;
        this.f11430d = obj3;
        this.f11431e = obj4;
        this.f11432f = obj5;
        this.f11433g = obj6;
    }

    @Override // ex.InterfaceC2139c
    public final Object invoke(Object obj) {
        InterfaceC2198d interfaceC2198d;
        float f6;
        float f10;
        int i10 = this.f11427a;
        int i11 = 2;
        qw.a0 a0Var = qw.a0.f30746a;
        int i12 = 0;
        Object obj2 = this.f11433g;
        Object obj3 = this.f11432f;
        Object obj4 = this.f11431e;
        Object obj5 = this.f11430d;
        Object obj6 = this.f11429c;
        Object obj7 = this.f11428b;
        switch (i10) {
            case 0:
                InterfaceC2198d interfaceC2198d2 = (InterfaceC2198d) obj;
                float fFloor = (float) Math.floor(interfaceC2198d2.mo8435T(i1.f11780c));
                long j6 = ((C1565s) ((k2.h2) obj7).getValue()).f7819a;
                long j10 = ((C1565s) ((k2.h2) obj6).getValue()).f7819a;
                float fMo8435T = interfaceC2198d2.mo8435T(i1.f11781d);
                float f11 = fFloor / 2.0f;
                C2202h c2202h = new C2202h(fFloor, DefinitionKt.NO_Float_VALUE, 0, 0, 30);
                float fM2293d = C0850e.m2293d(interfaceC2198d2.mo5913e());
                boolean zM5187c = C1565s.m5187c(j6, j10);
                C2201g c2201g = C2201g.f10129a;
                if (zM5187c) {
                    interfaceC2198d = interfaceC2198d2;
                    interfaceC2198d.p0(j6, (226 & 2) != 0 ? 0L : 0L, og.d2.m10598a(fM2293d, fM2293d), og.y1.m11061a(fMo8435T), (226 & 16) != 0 ? C2201g.f10129a : c2201g, (226 & 128) != 0 ? 3 : 0);
                    f6 = fFloor;
                    f10 = 0.0f;
                } else {
                    float f12 = fM2293d - (2 * fFloor);
                    interfaceC2198d = interfaceC2198d2;
                    f6 = fFloor;
                    f10 = 0.0f;
                    interfaceC2198d.p0(j6, (226 & 2) != 0 ? 0L : og.a2.m10524a(fFloor, fFloor), og.d2.m10598a(f12, f12), og.y1.m11061a(Math.max(DefinitionKt.NO_Float_VALUE, fMo8435T - fFloor)), (226 & 16) != 0 ? C2201g.f10129a : c2201g, (226 & 128) != 0 ? 3 : 0);
                    float f13 = fM2293d - f6;
                    interfaceC2198d.p0(j10, (226 & 2) != 0 ? 0L : og.a2.m10524a(f11, f11), og.d2.m10598a(f13, f13), og.y1.m11061a(fMo8435T - f11), (226 & 16) != 0 ? C2201g.f10129a : c2202h, (226 & 128) != 0 ? 3 : 0);
                }
                long j11 = ((C1565s) ((k2.h2) obj5).getValue()).f7819a;
                float fFloatValue = ((Number) ((k2.h2) obj4).getValue()).floatValue();
                float fFloatValue2 = ((Number) ((k2.h2) obj3).getValue()).floatValue();
                z0 z0Var = (z0) obj2;
                C2202h c2202h2 = new C2202h(f6, DefinitionKt.NO_Float_VALUE, 2, 0, 26);
                float fM2293d2 = C0850e.m2293d(interfaceC2198d.mo5913e());
                float fM11891e = AbstractC5941v.m11891e(0.4f, 0.5f, fFloatValue2);
                float fM11891e2 = AbstractC5941v.m11891e(0.7f, 0.5f, fFloatValue2);
                float fM11891e3 = AbstractC5941v.m11891e(0.5f, 0.5f, fFloatValue2);
                float fM11891e4 = AbstractC5941v.m11891e(0.3f, 0.5f, fFloatValue2);
                z0Var.f13351a.m5158g();
                C1555i c1555i = z0Var.f13351a;
                c1555i.f7752a.moveTo(0.2f * fM2293d2, fM11891e3 * fM2293d2);
                c1555i.m5156e(fM11891e * fM2293d2, fM11891e2 * fM2293d2);
                c1555i.m5156e(0.8f * fM2293d2, fM2293d2 * fM11891e4);
                C1556j c1556j = z0Var.f13352b;
                c1556j.f7777a.setPath(c1555i != null ? c1555i.f7752a : null, false);
                C1555i c1555i2 = z0Var.f13353c;
                c1555i2.m5158g();
                c1556j.m5175a(f10, c1556j.f7777a.getLength() * fFloatValue, c1555i2);
                InterfaceC2198d.w0(interfaceC2198d, z0Var.f13353c, j11, DefinitionKt.NO_Float_VALUE, c2202h2, 52);
                break;
            case 1:
                ja jaVar = (ja) obj7;
                String str = (String) obj5;
                String str2 = (String) obj4;
                InterfaceC7266z interfaceC7266z = (InterfaceC7266z) obj2;
                v7 v7Var = new v7(0, (InterfaceC2137a) obj3);
                InterfaceC4574m[] interfaceC4574mArr = AbstractC1594v.f7944a;
                C1583k c1583k = (C1583k) ((InterfaceC1596x) obj);
                c1583k.m5202q(C1582j.f7862u, new C1573a((String) obj6, v7Var));
                C0925t c0925t = jaVar.f11872b;
                ka kaVar = (ka) ((k2.e1) c0925t.f5657g).getValue();
                ka kaVar2 = ka.PartiallyExpanded;
                if (kaVar != kaVar2) {
                    if (c0925t.m2679h().f15693a.containsKey(kaVar2)) {
                        c1583k.m5202q(C1582j.f7861t, new C1573a(str2, new C0043b(6, jaVar, interfaceC7266z)));
                        break;
                    }
                } else {
                    c1583k.m5202q(C1582j.f7860s, new C1573a(str, new C0348m(i11, jaVar, interfaceC7266z, jaVar)));
                    break;
                }
                break;
            default:
                t3.v0 v0Var = (t3.v0) obj;
                t3.w0[] w0VarArr = (t3.w0[]) obj7;
                List list = (List) obj6;
                t3.l0 l0Var = (t3.l0) obj5;
                C4166x c4166x = (C4166x) obj4;
                C4166x c4166x2 = (C4166x) obj3;
                C5258q c5258q = (C5258q) obj2;
                int length = w0VarArr.length;
                int i13 = 0;
                while (i12 < length) {
                    t3.w0 w0Var = w0VarArr[i12];
                    AbstractC4154l.m8921d(w0Var, "null cannot be cast to non-null type androidx.compose.ui.layout.Placeable");
                    AbstractC5256o.m10359b(v0Var, w0Var, (t3.i0) list.get(i13), l0Var.getLayoutDirection(), c4166x.f21162a, c4166x2.f21162a, c5258q.f25812a);
                    i12++;
                    i13++;
                }
                break;
        }
        return a0Var;
    }
}
