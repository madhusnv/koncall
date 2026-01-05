package p8;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import java.util.ArrayList;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: p8.u */
/* loaded from: classes.dex */
public final class ViewTreeObserverOnPreDrawListenerC5860u implements ViewTreeObserver.OnPreDrawListener, View.OnAttachStateChangeListener {

    /* renamed from: a */
    public AbstractC5857r f28627a;

    /* renamed from: b */
    public ViewGroup f28628b;

    /* JADX WARN: Removed duplicated region for block: B:100:0x021d  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x024b  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x01f5 A[EDGE_INSN: B:134:0x01f5->B:90:0x01f5 BREAK  A[LOOP:1: B:18:0x0084->B:89:0x01eb], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x01fc  */
    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean onPreDraw() {
        /*
            Method dump skipped, instructions count: 700
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p8.ViewTreeObserverOnPreDrawListenerC5860u.onPreDraw():boolean");
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        ViewGroup viewGroup = this.f28628b;
        viewGroup.getViewTreeObserver().removeOnPreDrawListener(this);
        viewGroup.removeOnAttachStateChangeListener(this);
        AbstractC5861v.f28631c.remove(viewGroup);
        ArrayList arrayList = (ArrayList) AbstractC5861v.m11464b().get(viewGroup);
        if (arrayList != null && arrayList.size() > 0) {
            int size = arrayList.size();
            int i10 = 0;
            while (i10 < size) {
                Object obj = arrayList.get(i10);
                i10++;
                ((AbstractC5857r) obj).mo11439A(viewGroup);
            }
        }
        this.f28627a.m11453k(true);
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
    }
}
