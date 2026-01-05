package w3;

import android.os.SystemClock;
import android.view.MotionEvent;
import ex.InterfaceC2137a;
import kotlin.jvm.internal.AbstractC4155m;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: w3.t */
/* loaded from: classes.dex */
public final class C7902t extends AbstractC4155m implements InterfaceC2137a {

    /* renamed from: a */
    public final /* synthetic */ int f37957a;

    /* renamed from: b */
    public final /* synthetic */ C7904v f37958b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C7902t(C7904v c7904v, int i10) {
        super(0);
        this.f37957a = i10;
        this.f37958b = c7904v;
    }

    @Override // ex.InterfaceC2137a
    public final Object invoke() {
        int actionMasked;
        switch (this.f37957a) {
            case 0:
                C7904v c7904v = this.f37958b;
                MotionEvent motionEvent = c7904v.f44862x1;
                if (motionEvent != null && ((actionMasked = motionEvent.getActionMasked()) == 7 || actionMasked == 9)) {
                    c7904v.f44863y1 = SystemClock.uptimeMillis();
                    c7904v.post(c7904v.B1);
                }
                return qw.a0.f30746a;
            default:
                return this.f37958b.get_viewTreeOwners();
        }
    }
}
