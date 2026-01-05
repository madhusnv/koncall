package com.skydoves.balloon.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.skydoves.balloon.C1413R;
import com.skydoves.balloon.radius.RadiusLayout;
import com.skydoves.balloon.vectortext.VectorTextView;
import og.ef;
import s8.InterfaceC6771a;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class BalloonLayoutBodyBinding implements InterfaceC6771a {
    public final FrameLayout balloon;
    public final ImageView balloonArrow;
    public final RadiusLayout balloonCard;
    public final FrameLayout balloonContent;
    public final VectorTextView balloonText;
    public final FrameLayout balloonWrapper;
    private final FrameLayout rootView;

    private BalloonLayoutBodyBinding(FrameLayout frameLayout, FrameLayout frameLayout2, ImageView imageView, RadiusLayout radiusLayout, FrameLayout frameLayout3, VectorTextView vectorTextView, FrameLayout frameLayout4) {
        this.rootView = frameLayout;
        this.balloon = frameLayout2;
        this.balloonArrow = imageView;
        this.balloonCard = radiusLayout;
        this.balloonContent = frameLayout3;
        this.balloonText = vectorTextView;
        this.balloonWrapper = frameLayout4;
    }

    public static BalloonLayoutBodyBinding bind(View view) {
        FrameLayout frameLayout = (FrameLayout) view;
        int i10 = C1413R.id.balloon_arrow;
        ImageView imageView = (ImageView) ef.m10631a(i10, view);
        if (imageView != null) {
            i10 = C1413R.id.balloon_card;
            RadiusLayout radiusLayout = (RadiusLayout) ef.m10631a(i10, view);
            if (radiusLayout != null) {
                i10 = C1413R.id.balloon_content;
                FrameLayout frameLayout2 = (FrameLayout) ef.m10631a(i10, view);
                if (frameLayout2 != null) {
                    i10 = C1413R.id.balloon_text;
                    VectorTextView vectorTextView = (VectorTextView) ef.m10631a(i10, view);
                    if (vectorTextView != null) {
                        i10 = C1413R.id.balloon_wrapper;
                        FrameLayout frameLayout3 = (FrameLayout) ef.m10631a(i10, view);
                        if (frameLayout3 != null) {
                            return new BalloonLayoutBodyBinding(frameLayout, frameLayout, imageView, radiusLayout, frameLayout2, vectorTextView, frameLayout3);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    public static BalloonLayoutBodyBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static BalloonLayoutBodyBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z6) {
        View viewInflate = layoutInflater.inflate(C1413R.layout.balloon_layout_body, viewGroup, false);
        if (z6) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @Override // s8.InterfaceC6771a
    public FrameLayout getRoot() {
        return this.rootView;
    }
}
