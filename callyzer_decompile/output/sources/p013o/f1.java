package p013o;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class f1 implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ int f25493a;

    /* renamed from: b */
    public final /* synthetic */ j1 f25494b;

    public /* synthetic */ f1(j1 j1Var, int i10) {
        this.f25493a = i10;
        this.f25494b = j1Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f25493a) {
            case 0:
                n1 n1Var = this.f25494b.f25549c;
                if (n1Var != null) {
                    n1Var.setListSelectionHidden(true);
                    n1Var.requestLayout();
                    break;
                }
                break;
            default:
                j1 j1Var = this.f25494b;
                n1 n1Var2 = j1Var.f25549c;
                if (n1Var2 != null && n1Var2.isAttachedToWindow() && j1Var.f25549c.getCount() > j1Var.f25549c.getChildCount() && j1Var.f25549c.getChildCount() <= Integer.MAX_VALUE) {
                    j1Var.f25568y.setInputMethodMode(2);
                    j1Var.mo9837f();
                    break;
                }
                break;
        }
    }
}
