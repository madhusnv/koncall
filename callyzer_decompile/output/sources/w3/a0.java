package w3;

import a3.C0043b;
import android.view.accessibility.AccessibilityEvent;
import ex.InterfaceC2139c;
import kotlin.jvm.internal.AbstractC4155m;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class a0 extends AbstractC4155m implements InterfaceC2139c {

    /* renamed from: a */
    public final /* synthetic */ int f37687a;

    /* renamed from: b */
    public final /* synthetic */ b0 f37688b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a0(b0 b0Var, int i10) {
        super(1);
        this.f37687a = i10;
        this.f37688b = b0Var;
    }

    @Override // ex.InterfaceC2139c
    public final Object invoke(Object obj) {
        switch (this.f37687a) {
            case 0:
                b0 b0Var = this.f37688b;
                return Boolean.valueOf(b0Var.f37711d.getParent().requestSendAccessibilityEvent(b0Var.f37711d, (AccessibilityEvent) obj));
            default:
                m2 m2Var = (m2) obj;
                if (m2Var.f37859b.contains(m2Var)) {
                    b0 b0Var2 = this.f37688b;
                    b0Var2.f37711d.getSnapshotObserver().m14657a(m2Var, b0Var2.f37710O, new C0043b(26, m2Var, b0Var2));
                }
                return qw.a0.f30746a;
        }
    }
}
