package androidx.compose.ui.platform;

import android.content.Context;
import android.graphics.Canvas;
import p001o.sq8;

/* loaded from: classes2.dex */
public final class ViewLayerContainer extends DrawChildContainer {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ViewLayerContainer(Context context) {
        super(context);
        sq8.m48649h(context, "context");
    }

    @Override // androidx.compose.ui.platform.DrawChildContainer, android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
        sq8.m48649h(canvas, "canvas");
    }

    public final void dispatchGetDisplayList() {
    }
}
