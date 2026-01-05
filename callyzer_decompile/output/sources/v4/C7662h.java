package v4;

import android.os.Parcelable;
import android.util.SparseArray;
import ex.InterfaceC2137a;
import kotlin.jvm.internal.AbstractC4155m;
import qw.a0;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: v4.h */
/* loaded from: classes.dex */
public final class C7662h extends AbstractC4155m implements InterfaceC2137a {

    /* renamed from: a */
    public final /* synthetic */ int f37103a;

    /* renamed from: b */
    public final /* synthetic */ C7672r f37104b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C7662h(C7672r c7672r, int i10) {
        super(0);
        this.f37103a = i10;
        this.f37104b = c7672r;
    }

    @Override // ex.InterfaceC2137a
    public final Object invoke() {
        switch (this.f37103a) {
            case 0:
                this.f37104b.getLayoutNode().m14573C();
                break;
            case 1:
                C7672r c7672r = this.f37104b;
                if (c7672r.f37111e && c7672r.isAttachedToWindow() && c7672r.getView().getParent() == c7672r) {
                    c7672r.getSnapshotObserver().m14657a(c7672r, C7657c.f37085b, c7672r.getUpdate());
                }
                break;
            case 2:
                SparseArray<Parcelable> sparseArray = new SparseArray<>();
                this.f37104b.f37152D.saveHierarchyState(sparseArray);
                break;
            case 3:
                C7672r c7672r2 = this.f37104b;
                c7672r2.getReleaseBlock().invoke(c7672r2.f37152D);
                C7672r.m14685p(c7672r2);
                break;
            case 4:
                C7672r c7672r3 = this.f37104b;
                c7672r3.getResetBlock().invoke(c7672r3.f37152D);
                break;
            default:
                C7672r c7672r4 = this.f37104b;
                c7672r4.getUpdateBlock().invoke(c7672r4.f37152D);
                break;
        }
        return a0.f30746a;
    }
}
