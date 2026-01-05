package com.skydoves.balloon.compose;

import com.skydoves.balloon.BalloonCenterAlign;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public interface AwaitBalloonWindowsDsl {

    /* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
    public static final class DefaultImpls {
        public static /* synthetic */ void alignBottom$default(AwaitBalloonWindowsDsl awaitBalloonWindowsDsl, BalloonWindow balloonWindow, int i10, int i11, int i12, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: alignBottom");
            }
            if ((i12 & 1) != 0) {
                i10 = 0;
            }
            if ((i12 & 2) != 0) {
                i11 = 0;
            }
            awaitBalloonWindowsDsl.alignBottom(balloonWindow, i10, i11);
        }

        public static /* synthetic */ void alignEnd$default(AwaitBalloonWindowsDsl awaitBalloonWindowsDsl, BalloonWindow balloonWindow, int i10, int i11, int i12, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: alignEnd");
            }
            if ((i12 & 1) != 0) {
                i10 = 0;
            }
            if ((i12 & 2) != 0) {
                i11 = 0;
            }
            awaitBalloonWindowsDsl.alignEnd(balloonWindow, i10, i11);
        }

        public static /* synthetic */ void alignStart$default(AwaitBalloonWindowsDsl awaitBalloonWindowsDsl, BalloonWindow balloonWindow, int i10, int i11, int i12, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: alignStart");
            }
            if ((i12 & 1) != 0) {
                i10 = 0;
            }
            if ((i12 & 2) != 0) {
                i11 = 0;
            }
            awaitBalloonWindowsDsl.alignStart(balloonWindow, i10, i11);
        }

        public static /* synthetic */ void alignTop$default(AwaitBalloonWindowsDsl awaitBalloonWindowsDsl, BalloonWindow balloonWindow, int i10, int i11, int i12, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: alignTop");
            }
            if ((i12 & 1) != 0) {
                i10 = 0;
            }
            if ((i12 & 2) != 0) {
                i11 = 0;
            }
            awaitBalloonWindowsDsl.alignTop(balloonWindow, i10, i11);
        }

        public static /* synthetic */ void asDropDown$default(AwaitBalloonWindowsDsl awaitBalloonWindowsDsl, BalloonWindow balloonWindow, int i10, int i11, int i12, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: asDropDown");
            }
            if ((i12 & 1) != 0) {
                i10 = 0;
            }
            if ((i12 & 2) != 0) {
                i11 = 0;
            }
            awaitBalloonWindowsDsl.asDropDown(balloonWindow, i10, i11);
        }

        public static /* synthetic */ void atCenter$default(AwaitBalloonWindowsDsl awaitBalloonWindowsDsl, BalloonWindow balloonWindow, int i10, int i11, BalloonCenterAlign balloonCenterAlign, int i12, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: atCenter");
            }
            if ((i12 & 1) != 0) {
                i10 = 0;
            }
            if ((i12 & 2) != 0) {
                i11 = 0;
            }
            if ((i12 & 4) != 0) {
                balloonCenterAlign = BalloonCenterAlign.TOP;
            }
            awaitBalloonWindowsDsl.atCenter(balloonWindow, i10, i11, balloonCenterAlign);
        }
    }

    void alignBottom(BalloonWindow balloonWindow, int i10, int i11);

    void alignEnd(BalloonWindow balloonWindow, int i10, int i11);

    void alignStart(BalloonWindow balloonWindow, int i10, int i11);

    void alignTop(BalloonWindow balloonWindow, int i10, int i11);

    void asDropDown(BalloonWindow balloonWindow, int i10, int i11);

    void atCenter(BalloonWindow balloonWindow, int i10, int i11, BalloonCenterAlign balloonCenterAlign);

    boolean getDismissSequentially();

    void setDismissSequentially(boolean z6);
}
