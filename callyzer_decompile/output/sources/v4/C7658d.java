package v4;

import android.view.WindowInsets;
import c6.v0;
import c6.y1;
import ex.InterfaceC2139c;
import java.util.HashMap;
import kotlin.jvm.internal.AbstractC4155m;
import qw.a0;
import s4.C6756l;
import t3.InterfaceC7033t;
import v3.g0;
import v3.p1;
import w3.C7897o;
import w3.C7904v;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: v4.d */
/* loaded from: classes.dex */
public final class C7658d extends AbstractC4155m implements InterfaceC2139c {

    /* renamed from: a */
    public final /* synthetic */ int f37090a;

    /* renamed from: b */
    public final /* synthetic */ C7672r f37091b;

    /* renamed from: c */
    public final /* synthetic */ g0 f37092c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C7658d(C7672r c7672r, g0 g0Var, int i10) {
        super(1);
        this.f37090a = i10;
        this.f37091b = c7672r;
        this.f37092c = g0Var;
    }

    @Override // ex.InterfaceC2139c
    public final Object invoke(Object obj) {
        WindowInsets windowInsetsM2539c;
        switch (this.f37090a) {
            case 0:
                p1 p1Var = (p1) obj;
                C7904v c7904v = p1Var instanceof C7904v ? (C7904v) p1Var : null;
                C7672r c7672r = this.f37091b;
                if (c7904v != null) {
                    HashMap<AbstractC7663i, g0> holderToLayoutNode = c7904v.getAndroidViewsHandler$ui_release().getHolderToLayoutNode();
                    g0 g0Var = this.f37092c;
                    holderToLayoutNode.put(c7672r, g0Var);
                    c7904v.getAndroidViewsHandler$ui_release().addView(c7672r);
                    c7904v.getAndroidViewsHandler$ui_release().getLayoutNodeToHolder().put(g0Var, c7672r);
                    c7672r.setImportantForAccessibility(1);
                    v0.m2528j(c7672r, new C7897o(c7904v, g0Var, c7904v));
                }
                if (c7672r.getView().getParent() != c7672r) {
                    c7672r.addView(c7672r.getView());
                }
                break;
            case 1:
                AbstractC7665k.m14684d(this.f37091b, this.f37092c);
                break;
            default:
                g0 g0Var2 = this.f37092c;
                C7672r c7672r2 = this.f37091b;
                AbstractC7665k.m14684d(c7672r2, g0Var2);
                ((C7904v) c7672r2.f37109c).f38003B = true;
                int[] iArr = c7672r2.f37120p;
                int i10 = iArr[0];
                int i11 = iArr[1];
                c7672r2.getView().getLocationOnScreen(iArr);
                long j6 = c7672r2.f37121q;
                long jMo13307v = ((InterfaceC7033t) obj).mo13307v();
                c7672r2.f37121q = jMo13307v;
                y1 y1Var = c7672r2.f37122r;
                if (y1Var != null && ((i10 != iArr[0] || i11 != iArr[1] || !C6756l.m12948a(j6, jMo13307v)) && (windowInsetsM2539c = c7672r2.m14680o(y1Var).m2539c()) != null)) {
                    c7672r2.getView().dispatchApplyWindowInsets(windowInsetsM2539c);
                }
                break;
        }
        return a0.f30746a;
    }
}
