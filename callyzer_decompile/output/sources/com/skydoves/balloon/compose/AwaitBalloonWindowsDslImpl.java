package com.skydoves.balloon.compose;

import com.skydoves.balloon.BalloonAlign;
import com.skydoves.balloon.BalloonCenterAlign;
import com.skydoves.balloon.BalloonPlacement;
import com.skydoves.balloon.DeferredBalloon;
import com.skydoves.balloon.DeferredBalloonGroup;
import com.skydoves.balloon.PlacementType;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AbstractC4154l;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
final class AwaitBalloonWindowsDslImpl implements AwaitBalloonWindowsDsl {
    private final List<DeferredBalloon> _balloons = new ArrayList();
    private boolean dismissSequentially;

    @Override // com.skydoves.balloon.compose.AwaitBalloonWindowsDsl
    public void alignBottom(BalloonWindow balloonWindow, int i10, int i11) {
        AbstractC4154l.m8923f(balloonWindow, "<this>");
        this._balloons.add(new DeferredBalloon(balloonWindow.getBalloon(), new BalloonPlacement(balloonWindow.getAnchorView(), null, BalloonAlign.BOTTOM, i10, i11, null, 0, 0, 226, null)));
    }

    @Override // com.skydoves.balloon.compose.AwaitBalloonWindowsDsl
    public void alignEnd(BalloonWindow balloonWindow, int i10, int i11) {
        AbstractC4154l.m8923f(balloonWindow, "<this>");
        this._balloons.add(new DeferredBalloon(balloonWindow.getBalloon(), new BalloonPlacement(balloonWindow.getAnchorView(), null, BalloonAlign.END, i10, i11, null, 0, 0, 226, null)));
    }

    @Override // com.skydoves.balloon.compose.AwaitBalloonWindowsDsl
    public void alignStart(BalloonWindow balloonWindow, int i10, int i11) {
        AbstractC4154l.m8923f(balloonWindow, "<this>");
        this._balloons.add(new DeferredBalloon(balloonWindow.getBalloon(), new BalloonPlacement(balloonWindow.getAnchorView(), null, BalloonAlign.START, i10, i11, null, 0, 0, 226, null)));
    }

    @Override // com.skydoves.balloon.compose.AwaitBalloonWindowsDsl
    public void alignTop(BalloonWindow balloonWindow, int i10, int i11) {
        AbstractC4154l.m8923f(balloonWindow, "<this>");
        this._balloons.add(new DeferredBalloon(balloonWindow.getBalloon(), new BalloonPlacement(balloonWindow.getAnchorView(), null, BalloonAlign.TOP, i10, i11, null, 0, 0, 226, null)));
    }

    @Override // com.skydoves.balloon.compose.AwaitBalloonWindowsDsl
    public void asDropDown(BalloonWindow balloonWindow, int i10, int i11) {
        AbstractC4154l.m8923f(balloonWindow, "<this>");
        this._balloons.add(new DeferredBalloon(balloonWindow.getBalloon(), new BalloonPlacement(balloonWindow.getAnchorView(), null, null, i10, i11, PlacementType.DROPDOWN, 0, 0, 198, null)));
    }

    @Override // com.skydoves.balloon.compose.AwaitBalloonWindowsDsl
    public void atCenter(BalloonWindow balloonWindow, int i10, int i11, BalloonCenterAlign centerAlign) {
        AbstractC4154l.m8923f(balloonWindow, "<this>");
        AbstractC4154l.m8923f(centerAlign, "centerAlign");
        this._balloons.add(new DeferredBalloon(balloonWindow.getBalloon(), new BalloonPlacement(balloonWindow.getAnchorView(), null, centerAlign.toAlign(), i10, i11, PlacementType.CENTER, 0, 0, 194, null)));
    }

    public final DeferredBalloonGroup build() {
        return new DeferredBalloonGroup(this._balloons, getDismissSequentially());
    }

    @Override // com.skydoves.balloon.compose.AwaitBalloonWindowsDsl
    public boolean getDismissSequentially() {
        return this.dismissSequentially;
    }

    @Override // com.skydoves.balloon.compose.AwaitBalloonWindowsDsl
    public void setDismissSequentially(boolean z6) {
        this.dismissSequentially = z6;
    }
}
