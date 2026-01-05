package com.skydoves.balloon;

import android.view.View;
import com.skydoves.balloon.AwaitBalloonsDsl;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AbstractC4154l;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
final class AwaitBalloonsDslImpl implements AwaitBalloonsDsl {
    private final List<DeferredBalloon> _balloons = new ArrayList();
    private boolean dismissSequentially;

    @Override // com.skydoves.balloon.AwaitBalloonsDsl
    public void alignBottom(View view, Balloon balloon, int i10, int i11) {
        AwaitBalloonsDsl.DefaultImpls.alignBottom(this, view, balloon, i10, i11);
    }

    @Override // com.skydoves.balloon.AwaitBalloonsDsl
    public void alignEnd(View view, Balloon balloon, int i10, int i11) {
        AwaitBalloonsDsl.DefaultImpls.alignEnd(this, view, balloon, i10, i11);
    }

    @Override // com.skydoves.balloon.AwaitBalloonsDsl
    public void alignStart(View view, Balloon balloon, int i10, int i11) {
        AwaitBalloonsDsl.DefaultImpls.alignStart(this, view, balloon, i10, i11);
    }

    @Override // com.skydoves.balloon.AwaitBalloonsDsl
    public void alignTop(View view, Balloon balloon, int i10, int i11) {
        AwaitBalloonsDsl.DefaultImpls.alignTop(this, view, balloon, i10, i11);
    }

    @Override // com.skydoves.balloon.AwaitBalloonsDsl
    public void asDropDown(View view, Balloon balloon, int i10, int i11) {
        AwaitBalloonsDsl.DefaultImpls.asDropDown(this, view, balloon, i10, i11);
    }

    @Override // com.skydoves.balloon.AwaitBalloonsDsl
    public void atCenter(View view, Balloon balloon, int i10, int i11, BalloonCenterAlign balloonCenterAlign) {
        AwaitBalloonsDsl.DefaultImpls.atCenter(this, view, balloon, i10, i11, balloonCenterAlign);
    }

    public final DeferredBalloonGroup build() {
        return new DeferredBalloonGroup(this._balloons, getDismissSequentially());
    }

    @Override // com.skydoves.balloon.AwaitBalloonsDsl
    public boolean getDismissSequentially() {
        return this.dismissSequentially;
    }

    @Override // com.skydoves.balloon.AwaitBalloonsDsl
    public void setDismissSequentially(boolean z6) {
        this.dismissSequentially = z6;
    }

    @Override // com.skydoves.balloon.AwaitBalloonsDsl
    public void alignBottom(Balloon balloon, View anchor, int i10, int i11) {
        AbstractC4154l.m8923f(balloon, "<this>");
        AbstractC4154l.m8923f(anchor, "anchor");
        this._balloons.add(new DeferredBalloon(balloon, new BalloonPlacement(anchor, null, BalloonAlign.BOTTOM, i10, i11, null, 0, 0, 226, null)));
    }

    @Override // com.skydoves.balloon.AwaitBalloonsDsl
    public void alignEnd(Balloon balloon, View anchor, int i10, int i11) {
        AbstractC4154l.m8923f(balloon, "<this>");
        AbstractC4154l.m8923f(anchor, "anchor");
        this._balloons.add(new DeferredBalloon(balloon, new BalloonPlacement(anchor, null, BalloonAlign.END, i10, i11, null, 0, 0, 226, null)));
    }

    @Override // com.skydoves.balloon.AwaitBalloonsDsl
    public void alignStart(Balloon balloon, View anchor, int i10, int i11) {
        AbstractC4154l.m8923f(balloon, "<this>");
        AbstractC4154l.m8923f(anchor, "anchor");
        this._balloons.add(new DeferredBalloon(balloon, new BalloonPlacement(anchor, null, BalloonAlign.START, i10, i11, null, 0, 0, 226, null)));
    }

    @Override // com.skydoves.balloon.AwaitBalloonsDsl
    public void alignTop(Balloon balloon, View anchor, int i10, int i11) {
        AbstractC4154l.m8923f(balloon, "<this>");
        AbstractC4154l.m8923f(anchor, "anchor");
        this._balloons.add(new DeferredBalloon(balloon, new BalloonPlacement(anchor, null, BalloonAlign.TOP, i10, i11, null, 0, 0, 226, null)));
    }

    @Override // com.skydoves.balloon.AwaitBalloonsDsl
    public void asDropDown(Balloon balloon, View anchor, int i10, int i11) {
        AbstractC4154l.m8923f(balloon, "<this>");
        AbstractC4154l.m8923f(anchor, "anchor");
        this._balloons.add(new DeferredBalloon(balloon, new BalloonPlacement(anchor, null, null, i10, i11, PlacementType.DROPDOWN, 0, 0, 198, null)));
    }

    @Override // com.skydoves.balloon.AwaitBalloonsDsl
    public void atCenter(Balloon balloon, View anchor, int i10, int i11, BalloonCenterAlign centerAlign) {
        AbstractC4154l.m8923f(balloon, "<this>");
        AbstractC4154l.m8923f(anchor, "anchor");
        AbstractC4154l.m8923f(centerAlign, "centerAlign");
        this._balloons.add(new DeferredBalloon(balloon, new BalloonPlacement(anchor, null, centerAlign.toAlign(), i10, i11, PlacementType.CENTER, 0, 0, 194, null)));
    }
}
