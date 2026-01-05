package com.amplifyframework.devmenu;

import android.content.Context;
import android.view.View;
import com.skydoves.balloon.Balloon;
import com.skydoves.balloon.OnBalloonClickListener;
import com.skydoves.balloon.OnBalloonOverlayClickListener;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: com.amplifyframework.devmenu.b */
/* loaded from: classes.dex */
public final /* synthetic */ class ViewOnClickListenerC1189b implements View.OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ int f5880a;

    /* renamed from: b */
    public final /* synthetic */ Object f5881b;

    /* renamed from: c */
    public final /* synthetic */ Object f5882c;

    public /* synthetic */ ViewOnClickListenerC1189b(int i10, Object obj, Object obj2) {
        this.f5880a = i10;
        this.f5881b = obj;
        this.f5882c = obj2;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f5880a) {
            case 0:
                ((DevMenuFileIssueFragment) this.f5881b).lambda$onCreateView$1((Context) this.f5882c, view);
                break;
            case 1:
                Balloon.setOnBalloonClickListener$lambda$47((OnBalloonClickListener) this.f5881b, (Balloon) this.f5882c, view);
                break;
            default:
                Balloon.setOnBalloonOverlayClickListener$lambda$51((OnBalloonOverlayClickListener) this.f5881b, (Balloon) this.f5882c, view);
                break;
        }
    }
}
