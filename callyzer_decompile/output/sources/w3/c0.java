package w3;

import android.graphics.Matrix;
import android.view.View;
import com.skydoves.balloon.internals.DefinitionKt;
import d4.AbstractC1592t;
import d4.C1583k;
import d4.C1589q;
import d4.C1595w;
import ex.InterfaceC2141e;
import k2.C3966o;
import k2.InterfaceC3962k;
import kotlin.jvm.internal.AbstractC4155m;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class c0 extends AbstractC4155m implements InterfaceC2141e {

    /* renamed from: b */
    public static final c0 f37752b;

    /* renamed from: c */
    public static final c0 f37753c;

    /* renamed from: d */
    public static final c0 f37754d;

    /* renamed from: e */
    public static final c0 f37755e;

    /* renamed from: a */
    public final /* synthetic */ int f37756a;

    static {
        int i10 = 2;
        f37752b = new c0(i10, 0);
        f37753c = new c0(i10, 1);
        f37754d = new c0(i10, 2);
        f37755e = new c0(i10, 3);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c0(int i10, int i11) {
        super(i10);
        this.f37756a = i11;
    }

    @Override // ex.InterfaceC2141e
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f37756a) {
            case 0:
                C1589q c1589q = (C1589q) obj2;
                Object objValueOf = Float.valueOf(DefinitionKt.NO_Float_VALUE);
                C1583k c1583k = ((C1589q) obj).f7879d;
                C1595w c1595w = AbstractC1592t.f7934r;
                Object objM5574g = c1583k.f7868a.m5574g(c1595w);
                if (objM5574g == null) {
                    objM5574g = objValueOf;
                }
                float fFloatValue = ((Number) objM5574g).floatValue();
                Object objM5574g2 = c1589q.f7879d.f7868a.m5574g(c1595w);
                if (objM5574g2 != null) {
                    objValueOf = objM5574g2;
                }
                break;
            case 1:
                InterfaceC3962k interfaceC3962k = (InterfaceC3962k) obj;
                int iIntValue = ((Number) obj2).intValue();
                C3966o c3966o = (C3966o) interfaceC3962k;
                if (!c3966o.m8598P(iIntValue & 1, (iIntValue & 3) != 2)) {
                    c3966o.m8601S();
                }
                break;
            case 2:
                ((m1) obj).mo14926J((Matrix) obj2);
                break;
            default:
                ((Matrix) obj2).set(((View) obj).getMatrix());
                break;
        }
        return qw.a0.f30746a;
    }
}
