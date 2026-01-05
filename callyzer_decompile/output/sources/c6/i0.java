package c6;

import android.text.TextUtils;
import android.view.View;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class i0 extends k0 {

    /* renamed from: e */
    public final /* synthetic */ int f5468e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ i0(int i10, Class cls, int i11, int i12, int i13) {
        super(i10, cls, i11, i12);
        this.f5468e = i13;
    }

    @Override // c6.k0
    /* renamed from: d */
    public final Object mo2414d(View view) {
        switch (this.f5468e) {
            case 0:
                return q0.m2488a(view);
            default:
                return Boolean.valueOf(q0.m2489b(view));
        }
    }

    @Override // c6.k0
    /* renamed from: f */
    public final void mo2415f(View view, Object obj) {
        switch (this.f5468e) {
            case 0:
                q0.m2492e(view, (CharSequence) obj);
                break;
            default:
                q0.m2491d(view, ((Boolean) obj).booleanValue());
                break;
        }
    }

    @Override // c6.k0
    /* renamed from: j */
    public final boolean mo2416j(Object obj, Object obj2) {
        switch (this.f5468e) {
            case 0:
                return !TextUtils.equals((CharSequence) obj, (CharSequence) obj2);
            default:
                Boolean bool = (Boolean) obj;
                Boolean bool2 = (Boolean) obj2;
                return !((bool != null && bool.booleanValue()) == (bool2 != null && bool2.booleanValue()));
        }
    }
}
