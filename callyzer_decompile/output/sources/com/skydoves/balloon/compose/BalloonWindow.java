package com.skydoves.balloon.compose;

import android.view.View;
import android.view.ViewGroup;
import com.skydoves.balloon.Balloon;
import com.skydoves.balloon.BalloonAlign;
import com.skydoves.balloon.BalloonCenterAlign;
import com.skydoves.balloon.OnBalloonClickListener;
import com.skydoves.balloon.OnBalloonDismissListener;
import com.skydoves.balloon.OnBalloonInitializedListener;
import com.skydoves.balloon.OnBalloonOutsideTouchListener;
import com.skydoves.balloon.OnBalloonOverlayClickListener;
import com.skydoves.balloon.annotations.InternalBalloonApi;
import ex.InterfaceC2137a;
import ex.InterfaceC2139c;
import ex.InterfaceC2141e;
import java.util.List;
import qw.InterfaceC6353c;
import qw.a0;
import rw.C6668r;
import uw.InterfaceC7559c;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public interface BalloonWindow {

    /* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
    public static final class DefaultImpls {
        public static /* synthetic */ Object awaitAlign$default(BalloonWindow balloonWindow, BalloonAlign balloonAlign, View view, List list, int i10, int i11, InterfaceC7559c interfaceC7559c, int i12, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: awaitAlign");
            }
            if ((i12 & 4) != 0) {
                list = C6668r.f31943a;
            }
            return balloonWindow.awaitAlign(balloonAlign, view, list, (i12 & 8) != 0 ? 0 : i10, (i12 & 16) != 0 ? 0 : i11, interfaceC7559c);
        }

        public static /* synthetic */ Object awaitAlignBottom$default(BalloonWindow balloonWindow, int i10, int i11, InterfaceC7559c interfaceC7559c, int i12, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: awaitAlignBottom");
            }
            if ((i12 & 1) != 0) {
                i10 = 0;
            }
            if ((i12 & 2) != 0) {
                i11 = 0;
            }
            return balloonWindow.awaitAlignBottom(i10, i11, interfaceC7559c);
        }

        public static /* synthetic */ Object awaitAlignEnd$default(BalloonWindow balloonWindow, int i10, int i11, InterfaceC7559c interfaceC7559c, int i12, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: awaitAlignEnd");
            }
            if ((i12 & 1) != 0) {
                i10 = 0;
            }
            if ((i12 & 2) != 0) {
                i11 = 0;
            }
            return balloonWindow.awaitAlignEnd(i10, i11, interfaceC7559c);
        }

        public static /* synthetic */ Object awaitAlignStart$default(BalloonWindow balloonWindow, int i10, int i11, InterfaceC7559c interfaceC7559c, int i12, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: awaitAlignStart");
            }
            if ((i12 & 1) != 0) {
                i10 = 0;
            }
            if ((i12 & 2) != 0) {
                i11 = 0;
            }
            return balloonWindow.awaitAlignStart(i10, i11, interfaceC7559c);
        }

        public static /* synthetic */ Object awaitAlignTop$default(BalloonWindow balloonWindow, int i10, int i11, InterfaceC7559c interfaceC7559c, int i12, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: awaitAlignTop");
            }
            if ((i12 & 1) != 0) {
                i10 = 0;
            }
            if ((i12 & 2) != 0) {
                i11 = 0;
            }
            return balloonWindow.awaitAlignTop(i10, i11, interfaceC7559c);
        }

        public static /* synthetic */ Object awaitAsDropDown$default(BalloonWindow balloonWindow, int i10, int i11, InterfaceC7559c interfaceC7559c, int i12, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: awaitAsDropDown");
            }
            if ((i12 & 1) != 0) {
                i10 = 0;
            }
            if ((i12 & 2) != 0) {
                i11 = 0;
            }
            return balloonWindow.awaitAsDropDown(i10, i11, interfaceC7559c);
        }

        public static /* synthetic */ Object awaitAtCenter$default(BalloonWindow balloonWindow, int i10, int i11, BalloonCenterAlign balloonCenterAlign, InterfaceC7559c interfaceC7559c, int i12, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: awaitAtCenter");
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
            return balloonWindow.awaitAtCenter(i10, i11, balloonCenterAlign, interfaceC7559c);
        }

        public static /* synthetic */ Balloon relayShowAlign$default(BalloonWindow balloonWindow, BalloonAlign balloonAlign, Balloon balloon, int i10, int i11, int i12, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: relayShowAlign");
            }
            if ((i12 & 4) != 0) {
                i10 = 0;
            }
            if ((i12 & 8) != 0) {
                i11 = 0;
            }
            return balloonWindow.relayShowAlign(balloonAlign, balloon, i10, i11);
        }

        public static /* synthetic */ Balloon relayShowAlignBottom$default(BalloonWindow balloonWindow, Balloon balloon, int i10, int i11, int i12, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: relayShowAlignBottom");
            }
            if ((i12 & 2) != 0) {
                i10 = 0;
            }
            if ((i12 & 4) != 0) {
                i11 = 0;
            }
            return balloonWindow.relayShowAlignBottom(balloon, i10, i11);
        }

        public static /* synthetic */ Balloon relayShowAlignEnd$default(BalloonWindow balloonWindow, Balloon balloon, int i10, int i11, int i12, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: relayShowAlignEnd");
            }
            if ((i12 & 2) != 0) {
                i10 = 0;
            }
            if ((i12 & 4) != 0) {
                i11 = 0;
            }
            return balloonWindow.relayShowAlignEnd(balloon, i10, i11);
        }

        public static /* synthetic */ Balloon relayShowAlignLeft$default(BalloonWindow balloonWindow, Balloon balloon, int i10, int i11, int i12, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: relayShowAlignLeft");
            }
            if ((i12 & 2) != 0) {
                i10 = 0;
            }
            if ((i12 & 4) != 0) {
                i11 = 0;
            }
            return balloonWindow.relayShowAlignLeft(balloon, i10, i11);
        }

        public static /* synthetic */ Balloon relayShowAlignRight$default(BalloonWindow balloonWindow, Balloon balloon, int i10, int i11, int i12, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: relayShowAlignRight");
            }
            if ((i12 & 2) != 0) {
                i10 = 0;
            }
            if ((i12 & 4) != 0) {
                i11 = 0;
            }
            return balloonWindow.relayShowAlignRight(balloon, i10, i11);
        }

        public static /* synthetic */ Balloon relayShowAlignStart$default(BalloonWindow balloonWindow, Balloon balloon, int i10, int i11, int i12, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: relayShowAlignStart");
            }
            if ((i12 & 2) != 0) {
                i10 = 0;
            }
            if ((i12 & 4) != 0) {
                i11 = 0;
            }
            return balloonWindow.relayShowAlignStart(balloon, i10, i11);
        }

        public static /* synthetic */ Balloon relayShowAlignTop$default(BalloonWindow balloonWindow, Balloon balloon, int i10, int i11, int i12, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: relayShowAlignTop");
            }
            if ((i12 & 2) != 0) {
                i10 = 0;
            }
            if ((i12 & 4) != 0) {
                i11 = 0;
            }
            return balloonWindow.relayShowAlignTop(balloon, i10, i11);
        }

        public static /* synthetic */ Balloon relayShowAsDropDown$default(BalloonWindow balloonWindow, Balloon balloon, int i10, int i11, int i12, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: relayShowAsDropDown");
            }
            if ((i12 & 2) != 0) {
                i10 = 0;
            }
            if ((i12 & 4) != 0) {
                i11 = 0;
            }
            return balloonWindow.relayShowAsDropDown(balloon, i10, i11);
        }

        public static /* synthetic */ Balloon relayShowAtCenter$default(BalloonWindow balloonWindow, Balloon balloon, int i10, int i11, BalloonCenterAlign balloonCenterAlign, int i12, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: relayShowAtCenter");
            }
            if ((i12 & 2) != 0) {
                i10 = 0;
            }
            if ((i12 & 4) != 0) {
                i11 = 0;
            }
            if ((i12 & 8) != 0) {
                balloonCenterAlign = BalloonCenterAlign.TOP;
            }
            return balloonWindow.relayShowAtCenter(balloon, i10, i11, balloonCenterAlign);
        }

        public static /* synthetic */ void showAlign$default(BalloonWindow balloonWindow, BalloonAlign balloonAlign, View view, List list, int i10, int i11, int i12, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: showAlign");
            }
            if ((i12 & 4) != 0) {
                list = C6668r.f31943a;
            }
            balloonWindow.showAlign(balloonAlign, view, list, (i12 & 8) != 0 ? 0 : i10, (i12 & 16) != 0 ? 0 : i11);
        }

        public static /* synthetic */ void showAlignBottom$default(BalloonWindow balloonWindow, int i10, int i11, int i12, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: showAlignBottom");
            }
            if ((i12 & 1) != 0) {
                i10 = 0;
            }
            if ((i12 & 2) != 0) {
                i11 = 0;
            }
            balloonWindow.showAlignBottom(i10, i11);
        }

        public static /* synthetic */ void showAlignEnd$default(BalloonWindow balloonWindow, int i10, int i11, int i12, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: showAlignEnd");
            }
            if ((i12 & 1) != 0) {
                i10 = 0;
            }
            if ((i12 & 2) != 0) {
                i11 = 0;
            }
            balloonWindow.showAlignEnd(i10, i11);
        }

        public static /* synthetic */ void showAlignLeft$default(BalloonWindow balloonWindow, int i10, int i11, int i12, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: showAlignLeft");
            }
            if ((i12 & 1) != 0) {
                i10 = 0;
            }
            if ((i12 & 2) != 0) {
                i11 = 0;
            }
            balloonWindow.showAlignLeft(i10, i11);
        }

        public static /* synthetic */ void showAlignRight$default(BalloonWindow balloonWindow, int i10, int i11, int i12, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: showAlignRight");
            }
            if ((i12 & 1) != 0) {
                i10 = 0;
            }
            if ((i12 & 2) != 0) {
                i11 = 0;
            }
            balloonWindow.showAlignRight(i10, i11);
        }

        public static /* synthetic */ void showAlignStart$default(BalloonWindow balloonWindow, int i10, int i11, int i12, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: showAlignStart");
            }
            if ((i12 & 1) != 0) {
                i10 = 0;
            }
            if ((i12 & 2) != 0) {
                i11 = 0;
            }
            balloonWindow.showAlignStart(i10, i11);
        }

        public static /* synthetic */ void showAlignTop$default(BalloonWindow balloonWindow, int i10, int i11, int i12, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: showAlignTop");
            }
            if ((i12 & 1) != 0) {
                i10 = 0;
            }
            if ((i12 & 2) != 0) {
                i11 = 0;
            }
            balloonWindow.showAlignTop(i10, i11);
        }

        public static /* synthetic */ void showAsDropDown$default(BalloonWindow balloonWindow, int i10, int i11, int i12, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: showAsDropDown");
            }
            if ((i12 & 1) != 0) {
                i10 = 0;
            }
            if ((i12 & 2) != 0) {
                i11 = 0;
            }
            balloonWindow.showAsDropDown(i10, i11);
        }

        public static /* synthetic */ void showAtCenter$default(BalloonWindow balloonWindow, int i10, int i11, BalloonCenterAlign balloonCenterAlign, int i12, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: showAtCenter");
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
            balloonWindow.showAtCenter(i10, i11, balloonCenterAlign);
        }

        public static /* synthetic */ void update$default(BalloonWindow balloonWindow, int i10, int i11, int i12, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: update");
            }
            if ((i12 & 1) != 0) {
                i10 = 0;
            }
            if ((i12 & 2) != 0) {
                i11 = 0;
            }
            balloonWindow.update(i10, i11);
        }

        public static /* synthetic */ void updateAlign$default(BalloonWindow balloonWindow, BalloonAlign balloonAlign, int i10, int i11, int i12, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: updateAlign");
            }
            if ((i12 & 2) != 0) {
                i10 = 0;
            }
            if ((i12 & 4) != 0) {
                i11 = 0;
            }
            balloonWindow.updateAlign(balloonAlign, i10, i11);
        }

        public static /* synthetic */ void updateAlignBottom$default(BalloonWindow balloonWindow, int i10, int i11, int i12, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: updateAlignBottom");
            }
            if ((i12 & 1) != 0) {
                i10 = 0;
            }
            if ((i12 & 2) != 0) {
                i11 = 0;
            }
            balloonWindow.updateAlignBottom(i10, i11);
        }

        public static /* synthetic */ void updateAlignEnd$default(BalloonWindow balloonWindow, int i10, int i11, int i12, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: updateAlignEnd");
            }
            if ((i12 & 1) != 0) {
                i10 = 0;
            }
            if ((i12 & 2) != 0) {
                i11 = 0;
            }
            balloonWindow.updateAlignEnd(i10, i11);
        }

        public static /* synthetic */ void updateAlignStart$default(BalloonWindow balloonWindow, int i10, int i11, int i12, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: updateAlignStart");
            }
            if ((i12 & 1) != 0) {
                i10 = 0;
            }
            if ((i12 & 2) != 0) {
                i11 = 0;
            }
            balloonWindow.updateAlignStart(i10, i11);
        }

        public static /* synthetic */ void updateAlignTop$default(BalloonWindow balloonWindow, int i10, int i11, int i12, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: updateAlignTop");
            }
            if ((i12 & 1) != 0) {
                i10 = 0;
            }
            if ((i12 & 2) != 0) {
                i11 = 0;
            }
            balloonWindow.updateAlignTop(i10, i11);
        }
    }

    Object awaitAlign(BalloonAlign balloonAlign, View view, List<? extends View> list, int i10, int i11, InterfaceC7559c<? super a0> interfaceC7559c);

    Object awaitAlignBottom(int i10, int i11, InterfaceC7559c<? super a0> interfaceC7559c);

    Object awaitAlignEnd(int i10, int i11, InterfaceC7559c<? super a0> interfaceC7559c);

    Object awaitAlignStart(int i10, int i11, InterfaceC7559c<? super a0> interfaceC7559c);

    Object awaitAlignTop(int i10, int i11, InterfaceC7559c<? super a0> interfaceC7559c);

    Object awaitAsDropDown(int i10, int i11, InterfaceC7559c<? super a0> interfaceC7559c);

    Object awaitAtCenter(int i10, int i11, BalloonCenterAlign balloonCenterAlign, InterfaceC7559c<? super a0> interfaceC7559c);

    void clearAllPreferences();

    void dismiss();

    boolean dismissWithDelay(long j6);

    View getAnchorView();

    Balloon getBalloon();

    View getBalloonArrowView();

    ViewGroup getContentView();

    int getMeasuredHeight();

    int getMeasuredWidth();

    Balloon relayShowAlign(BalloonAlign balloonAlign, Balloon balloon, int i10, int i11);

    Balloon relayShowAlignBottom(Balloon balloon, int i10, int i11);

    Balloon relayShowAlignEnd(Balloon balloon, int i10, int i11);

    @InterfaceC6353c
    Balloon relayShowAlignLeft(Balloon balloon, int i10, int i11);

    @InterfaceC6353c
    Balloon relayShowAlignRight(Balloon balloon, int i10, int i11);

    Balloon relayShowAlignStart(Balloon balloon, int i10, int i11);

    Balloon relayShowAlignTop(Balloon balloon, int i10, int i11);

    Balloon relayShowAsDropDown(Balloon balloon, int i10, int i11);

    Balloon relayShowAtCenter(Balloon balloon, int i10, int i11, BalloonCenterAlign balloonCenterAlign);

    Balloon setIsAttachedInDecor(boolean z6);

    void setOnBalloonClickListener(OnBalloonClickListener onBalloonClickListener);

    /* synthetic */ void setOnBalloonClickListener(InterfaceC2139c interfaceC2139c);

    void setOnBalloonDismissListener(OnBalloonDismissListener onBalloonDismissListener);

    /* synthetic */ void setOnBalloonDismissListener(InterfaceC2137a interfaceC2137a);

    void setOnBalloonInitializedListener(OnBalloonInitializedListener onBalloonInitializedListener);

    /* synthetic */ void setOnBalloonInitializedListener(InterfaceC2139c interfaceC2139c);

    void setOnBalloonOutsideTouchListener(OnBalloonOutsideTouchListener onBalloonOutsideTouchListener);

    /* synthetic */ void setOnBalloonOutsideTouchListener(InterfaceC2141e interfaceC2141e);

    void setOnBalloonOverlayClickListener(OnBalloonOverlayClickListener onBalloonOverlayClickListener);

    /* synthetic */ void setOnBalloonOverlayClickListener(InterfaceC2137a interfaceC2137a);

    void setOnBalloonOverlayTouchListener(View.OnTouchListener onTouchListener);

    void setOnBalloonOverlayTouchListener(InterfaceC2141e interfaceC2141e);

    void setOnBalloonTouchListener(View.OnTouchListener onTouchListener);

    boolean shouldShowUp();

    void showAlign(BalloonAlign balloonAlign, View view, List<? extends View> list, int i10, int i11);

    void showAlignBottom(int i10, int i11);

    void showAlignEnd(int i10, int i11);

    @InterfaceC6353c
    void showAlignLeft(int i10, int i11);

    @InterfaceC6353c
    void showAlignRight(int i10, int i11);

    void showAlignStart(int i10, int i11);

    void showAlignTop(int i10, int i11);

    void showAsDropDown(int i10, int i11);

    void showAtCenter(int i10, int i11, BalloonCenterAlign balloonCenterAlign);

    void update(int i10, int i11);

    void updateAlign(BalloonAlign balloonAlign, int i10, int i11);

    void updateAlignBottom(int i10, int i11);

    void updateAlignEnd(int i10, int i11);

    void updateAlignStart(int i10, int i11);

    void updateAlignTop(int i10, int i11);

    @InternalBalloonApi
    void updateSizeOfBalloonCard(int i10, int i11);
}
