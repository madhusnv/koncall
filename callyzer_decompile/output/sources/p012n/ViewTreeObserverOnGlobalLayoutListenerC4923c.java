package p012n;

import android.view.View;
import android.view.ViewTreeObserver;
import java.util.ArrayList;
import p013o.o1;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: n.c */
/* loaded from: classes.dex */
public final class ViewTreeObserverOnGlobalLayoutListenerC4923c implements ViewTreeObserver.OnGlobalLayoutListener {

    /* renamed from: a */
    public final /* synthetic */ int f24494a;

    /* renamed from: b */
    public final /* synthetic */ AbstractC4931k f24495b;

    public /* synthetic */ ViewTreeObserverOnGlobalLayoutListenerC4923c(AbstractC4931k abstractC4931k, int i10) {
        this.f24494a = i10;
        this.f24495b = abstractC4931k;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        switch (this.f24494a) {
            case 0:
                ViewOnKeyListenerC4926f viewOnKeyListenerC4926f = (ViewOnKeyListenerC4926f) this.f24495b;
                ArrayList arrayList = viewOnKeyListenerC4926f.f24510h;
                if (viewOnKeyListenerC4926f.mo9836e() && arrayList.size() > 0) {
                    int i10 = 0;
                    if (!((C4925e) arrayList.get(0)).f24498a.f25567x) {
                        View view = viewOnKeyListenerC4926f.f24517q;
                        if (view != null && view.isShown()) {
                            int size = arrayList.size();
                            while (i10 < size) {
                                Object obj = arrayList.get(i10);
                                i10++;
                                ((C4925e) obj).f24498a.mo9837f();
                            }
                            break;
                        } else {
                            viewOnKeyListenerC4926f.dismiss();
                            break;
                        }
                    }
                }
                break;
            default:
                ViewOnKeyListenerC4938r viewOnKeyListenerC4938r = (ViewOnKeyListenerC4938r) this.f24495b;
                o1 o1Var = viewOnKeyListenerC4938r.f24600h;
                if (viewOnKeyListenerC4938r.mo9836e() && !o1Var.f25567x) {
                    View view2 = viewOnKeyListenerC4938r.f24605n;
                    if (view2 != null && view2.isShown()) {
                        o1Var.mo9837f();
                        break;
                    } else {
                        viewOnKeyListenerC4938r.dismiss();
                        break;
                    }
                }
                break;
        }
    }
}
