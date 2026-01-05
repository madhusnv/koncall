package z5;

import android.view.View;
import android.view.ViewTreeObserver;
import c9.C0927v;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: z5.a */
/* loaded from: classes.dex */
public final class ViewTreeObserverOnPreDrawListenerC8868a implements ViewTreeObserver.OnPreDrawListener {

    /* renamed from: a */
    public final /* synthetic */ int f42682a;

    /* renamed from: b */
    public final /* synthetic */ View f42683b;

    /* renamed from: c */
    public final /* synthetic */ C0927v f42684c;

    public /* synthetic */ ViewTreeObserverOnPreDrawListenerC8868a(C0927v c0927v, View view, int i10) {
        this.f42682a = i10;
        this.f42684c = c0927v;
        this.f42683b = view;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        switch (this.f42682a) {
            case 0:
                C0927v c0927v = this.f42684c;
                if (!((InterfaceC8871d) c0927v.f5669c).mo6604a()) {
                    this.f42683b.getViewTreeObserver().removeOnPreDrawListener(this);
                    c0927v.getClass();
                    break;
                }
                break;
            default:
                if (!((InterfaceC8871d) ((C8870c) this.f42684c).f5669c).mo6604a()) {
                    this.f42683b.getViewTreeObserver().removeOnPreDrawListener(this);
                    break;
                }
                break;
        }
        return true;
    }
}
