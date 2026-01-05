package v3;

import java.util.Comparator;
import kotlin.jvm.internal.AbstractC4154l;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class n1 implements Comparator {

    /* renamed from: b */
    public static final n1 f36960b = new n1(0);

    /* renamed from: a */
    public final /* synthetic */ int f36961a;

    public /* synthetic */ n1(int i10) {
        this.f36961a = i10;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        switch (this.f36961a) {
            case 0:
                g0 g0Var = (g0) obj;
                g0 g0Var2 = (g0) obj2;
                int iM8924g = AbstractC4154l.m8924g(g0Var2.f36857r, g0Var.f36857r);
                return iM8924g != 0 ? iM8924g : AbstractC4154l.m8924g(g0Var.hashCode(), g0Var2.hashCode());
            default:
                g0 g0Var3 = (g0) obj;
                g0 g0Var4 = (g0) obj2;
                int iM8924g2 = AbstractC4154l.m8924g(g0Var3.f36857r, g0Var4.f36857r);
                return iM8924g2 != 0 ? iM8924g2 : AbstractC4154l.m8924g(g0Var3.hashCode(), g0Var4.hashCode());
        }
    }
}
