package k1;

import androidx.compose.foundation.gestures.FlingCancellationException;
import com.skydoves.balloon.internals.DefinitionKt;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class t1 implements d1 {

    /* renamed from: a */
    public final /* synthetic */ x1 f20242a;

    /* renamed from: b */
    public final /* synthetic */ v1 f20243b;

    public t1(x1 x1Var, v1 v1Var) {
        this.f20242a = x1Var;
        this.f20243b = v1Var;
    }

    @Override // k1.d1
    /* renamed from: a */
    public final float mo8445a(float f6) {
        float fAbs = Math.abs(f6);
        x1 x1Var = this.f20242a;
        if (fAbs != DefinitionKt.NO_Float_VALUE && ((f6 > DefinitionKt.NO_Float_VALUE && !x1Var.f20309a.mo7523d()) || ((f6 < DefinitionKt.NO_Float_VALUE && !x1Var.f20309a.mo7522c()) || !((Boolean) x1Var.f20315g.invoke()).booleanValue()))) {
            throw new FlingCancellationException();
        }
        return x1Var.m8477c(x1Var.m8480f(this.f20243b.m8474a(2, x1Var.m8478d(x1Var.m8481g(f6)))));
    }
}
