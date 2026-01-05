package ug;

import android.os.Bundle;
import java.util.concurrent.Callable;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class r1 implements Callable {

    /* renamed from: a */
    public final /* synthetic */ int f35805a;

    /* renamed from: b */
    public final /* synthetic */ n4 f35806b;

    /* renamed from: c */
    public final /* synthetic */ Bundle f35807c;

    /* renamed from: d */
    public final /* synthetic */ s1 f35808d;

    public /* synthetic */ r1(s1 s1Var, n4 n4Var, Bundle bundle, int i10) {
        this.f35805a = i10;
        this.f35806b = n4Var;
        this.f35807c = bundle;
        this.f35808d = s1Var;
    }

    @Override // java.util.concurrent.Callable
    public final /* synthetic */ Object call() {
        switch (this.f35805a) {
            case 0:
                s1 s1Var = this.f35808d;
                s1Var.f35819e.m13947B();
                return s1Var.f35819e.d0(this.f35807c, this.f35806b);
            default:
                s1 s1Var2 = this.f35808d;
                s1Var2.f35819e.m13947B();
                return s1Var2.f35819e.d0(this.f35807c, this.f35806b);
        }
    }
}
