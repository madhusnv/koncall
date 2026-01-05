package c0;

import android.view.Surface;
import b6.C0601b;
import b6.InterfaceC0600a;
import com.skydoves.balloon.internals.DefinitionKt;
import l0.InterfaceC4303c;
import x4.C8299i;
import x4.C8302l;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: c0.z */
/* loaded from: classes.dex */
public final class C0833z implements InterfaceC4303c {

    /* renamed from: d */
    public static final C0833z f5289d;

    /* renamed from: a */
    public final /* synthetic */ int f5290a;

    /* renamed from: b */
    public final Object f5291b;

    /* renamed from: c */
    public final Object f5292c;

    static {
        Float fValueOf = Float.valueOf(1.0f);
        Float fValueOf2 = Float.valueOf(DefinitionKt.NO_Float_VALUE);
        f5289d = new C0833z(0, new C0601b(fValueOf2, fValueOf2), new C0601b(fValueOf, fValueOf));
    }

    public /* synthetic */ C0833z(int i10, Object obj, Object obj2) {
        this.f5290a = i10;
        this.f5291b = obj;
        this.f5292c = obj2;
    }

    @Override // l0.InterfaceC4303c
    /* renamed from: M */
    public void mo45M(Throwable th2) {
        switch (this.f5290a) {
            case 1:
                if (!(th2 instanceof v1)) {
                    og.y0.m11056f(null, ((C8299i) this.f5291b).m15507b(null));
                    break;
                } else {
                    og.y0.m11056f(null, ((C8302l) this.f5292c).cancel(false));
                    break;
                }
            default:
                og.y0.m11056f("Camera surface session should only fail with request cancellation. Instead failed due to:\n" + th2, th2 instanceof v1);
                ((InterfaceC0600a) this.f5291b).accept(new C0816i(1, (Surface) this.f5292c));
                break;
        }
    }

    @Override // l0.InterfaceC4303c
    /* renamed from: g */
    public void mo65g(Object obj) {
        switch (this.f5290a) {
            case 1:
                og.y0.m11056f(null, ((C8299i) this.f5291b).m15507b(null));
                break;
            default:
                ((InterfaceC0600a) this.f5291b).accept(new C0816i(0, (Surface) this.f5292c));
                break;
        }
    }
}
