package com.skydoves.balloon.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.skydoves.balloon.C1413R;
import com.skydoves.balloon.overlay.BalloonAnchorOverlayView;
import s8.InterfaceC6771a;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class BalloonLayoutOverlayBinding implements InterfaceC6771a {
    public final BalloonAnchorOverlayView balloonOverlayView;
    private final BalloonAnchorOverlayView rootView;

    private BalloonLayoutOverlayBinding(BalloonAnchorOverlayView balloonAnchorOverlayView, BalloonAnchorOverlayView balloonAnchorOverlayView2) {
        this.rootView = balloonAnchorOverlayView;
        this.balloonOverlayView = balloonAnchorOverlayView2;
    }

    public static BalloonLayoutOverlayBinding bind(View view) {
        if (view == null) {
            throw new NullPointerException("rootView");
        }
        BalloonAnchorOverlayView balloonAnchorOverlayView = (BalloonAnchorOverlayView) view;
        return new BalloonLayoutOverlayBinding(balloonAnchorOverlayView, balloonAnchorOverlayView);
    }

    public static BalloonLayoutOverlayBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static BalloonLayoutOverlayBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z6) {
        View viewInflate = layoutInflater.inflate(C1413R.layout.balloon_layout_overlay, viewGroup, false);
        if (z6) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @Override // s8.InterfaceC6771a
    public BalloonAnchorOverlayView getRoot() {
        return this.rootView;
    }
}
