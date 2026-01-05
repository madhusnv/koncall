package com.skydoves.balloon;

import android.view.View;
import kotlin.jvm.internal.AbstractC4154l;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public interface AwaitBalloonsDsl {

    /* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
    public static final class DefaultImpls {
        public static void alignBottom(AwaitBalloonsDsl awaitBalloonsDsl, View receiver, Balloon balloon, int i10, int i11) {
            AbstractC4154l.m8923f(receiver, "$receiver");
            AbstractC4154l.m8923f(balloon, "balloon");
            awaitBalloonsDsl.alignBottom(balloon, receiver, i10, i11);
        }

        public static /* synthetic */ void alignBottom$default(AwaitBalloonsDsl awaitBalloonsDsl, Balloon balloon, View view, int i10, int i11, int i12, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: alignBottom");
            }
            if ((i12 & 2) != 0) {
                i10 = 0;
            }
            if ((i12 & 4) != 0) {
                i11 = 0;
            }
            awaitBalloonsDsl.alignBottom(balloon, view, i10, i11);
        }

        public static void alignEnd(AwaitBalloonsDsl awaitBalloonsDsl, View receiver, Balloon balloon, int i10, int i11) {
            AbstractC4154l.m8923f(receiver, "$receiver");
            AbstractC4154l.m8923f(balloon, "balloon");
            awaitBalloonsDsl.alignEnd(balloon, receiver, i10, i11);
        }

        public static /* synthetic */ void alignEnd$default(AwaitBalloonsDsl awaitBalloonsDsl, Balloon balloon, View view, int i10, int i11, int i12, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: alignEnd");
            }
            if ((i12 & 2) != 0) {
                i10 = 0;
            }
            if ((i12 & 4) != 0) {
                i11 = 0;
            }
            awaitBalloonsDsl.alignEnd(balloon, view, i10, i11);
        }

        public static void alignStart(AwaitBalloonsDsl awaitBalloonsDsl, View receiver, Balloon balloon, int i10, int i11) {
            AbstractC4154l.m8923f(receiver, "$receiver");
            AbstractC4154l.m8923f(balloon, "balloon");
            awaitBalloonsDsl.alignStart(balloon, receiver, i10, i11);
        }

        public static /* synthetic */ void alignStart$default(AwaitBalloonsDsl awaitBalloonsDsl, Balloon balloon, View view, int i10, int i11, int i12, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: alignStart");
            }
            if ((i12 & 2) != 0) {
                i10 = 0;
            }
            if ((i12 & 4) != 0) {
                i11 = 0;
            }
            awaitBalloonsDsl.alignStart(balloon, view, i10, i11);
        }

        public static void alignTop(AwaitBalloonsDsl awaitBalloonsDsl, View receiver, Balloon balloon, int i10, int i11) {
            AbstractC4154l.m8923f(receiver, "$receiver");
            AbstractC4154l.m8923f(balloon, "balloon");
            awaitBalloonsDsl.alignTop(balloon, receiver, i10, i11);
        }

        public static /* synthetic */ void alignTop$default(AwaitBalloonsDsl awaitBalloonsDsl, Balloon balloon, View view, int i10, int i11, int i12, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: alignTop");
            }
            if ((i12 & 2) != 0) {
                i10 = 0;
            }
            if ((i12 & 4) != 0) {
                i11 = 0;
            }
            awaitBalloonsDsl.alignTop(balloon, view, i10, i11);
        }

        public static void asDropDown(AwaitBalloonsDsl awaitBalloonsDsl, View receiver, Balloon balloon, int i10, int i11) {
            AbstractC4154l.m8923f(receiver, "$receiver");
            AbstractC4154l.m8923f(balloon, "balloon");
            awaitBalloonsDsl.asDropDown(balloon, receiver, i10, i11);
        }

        public static /* synthetic */ void asDropDown$default(AwaitBalloonsDsl awaitBalloonsDsl, Balloon balloon, View view, int i10, int i11, int i12, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: asDropDown");
            }
            if ((i12 & 2) != 0) {
                i10 = 0;
            }
            if ((i12 & 4) != 0) {
                i11 = 0;
            }
            awaitBalloonsDsl.asDropDown(balloon, view, i10, i11);
        }

        public static void atCenter(AwaitBalloonsDsl awaitBalloonsDsl, View receiver, Balloon balloon, int i10, int i11, BalloonCenterAlign centerAlign) {
            AbstractC4154l.m8923f(receiver, "$receiver");
            AbstractC4154l.m8923f(balloon, "balloon");
            AbstractC4154l.m8923f(centerAlign, "centerAlign");
            awaitBalloonsDsl.atCenter(balloon, receiver, i10, i11, centerAlign);
        }

        public static /* synthetic */ void atCenter$default(AwaitBalloonsDsl awaitBalloonsDsl, Balloon balloon, View view, int i10, int i11, BalloonCenterAlign balloonCenterAlign, int i12, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: atCenter");
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
            awaitBalloonsDsl.atCenter(balloon, view, i10, i11, balloonCenterAlign);
        }

        public static /* synthetic */ void alignBottom$default(AwaitBalloonsDsl awaitBalloonsDsl, View view, Balloon balloon, int i10, int i11, int i12, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: alignBottom");
            }
            if ((i12 & 2) != 0) {
                i10 = 0;
            }
            if ((i12 & 4) != 0) {
                i11 = 0;
            }
            awaitBalloonsDsl.alignBottom(view, balloon, i10, i11);
        }

        public static /* synthetic */ void alignEnd$default(AwaitBalloonsDsl awaitBalloonsDsl, View view, Balloon balloon, int i10, int i11, int i12, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: alignEnd");
            }
            if ((i12 & 2) != 0) {
                i10 = 0;
            }
            if ((i12 & 4) != 0) {
                i11 = 0;
            }
            awaitBalloonsDsl.alignEnd(view, balloon, i10, i11);
        }

        public static /* synthetic */ void alignStart$default(AwaitBalloonsDsl awaitBalloonsDsl, View view, Balloon balloon, int i10, int i11, int i12, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: alignStart");
            }
            if ((i12 & 2) != 0) {
                i10 = 0;
            }
            if ((i12 & 4) != 0) {
                i11 = 0;
            }
            awaitBalloonsDsl.alignStart(view, balloon, i10, i11);
        }

        public static /* synthetic */ void alignTop$default(AwaitBalloonsDsl awaitBalloonsDsl, View view, Balloon balloon, int i10, int i11, int i12, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: alignTop");
            }
            if ((i12 & 2) != 0) {
                i10 = 0;
            }
            if ((i12 & 4) != 0) {
                i11 = 0;
            }
            awaitBalloonsDsl.alignTop(view, balloon, i10, i11);
        }

        public static /* synthetic */ void asDropDown$default(AwaitBalloonsDsl awaitBalloonsDsl, View view, Balloon balloon, int i10, int i11, int i12, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: asDropDown");
            }
            if ((i12 & 2) != 0) {
                i10 = 0;
            }
            if ((i12 & 4) != 0) {
                i11 = 0;
            }
            awaitBalloonsDsl.asDropDown(view, balloon, i10, i11);
        }

        public static /* synthetic */ void atCenter$default(AwaitBalloonsDsl awaitBalloonsDsl, View view, Balloon balloon, int i10, int i11, BalloonCenterAlign balloonCenterAlign, int i12, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: atCenter");
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
            awaitBalloonsDsl.atCenter(view, balloon, i10, i11, balloonCenterAlign);
        }
    }

    void alignBottom(View view, Balloon balloon, int i10, int i11);

    void alignBottom(Balloon balloon, View view, int i10, int i11);

    void alignEnd(View view, Balloon balloon, int i10, int i11);

    void alignEnd(Balloon balloon, View view, int i10, int i11);

    void alignStart(View view, Balloon balloon, int i10, int i11);

    void alignStart(Balloon balloon, View view, int i10, int i11);

    void alignTop(View view, Balloon balloon, int i10, int i11);

    void alignTop(Balloon balloon, View view, int i10, int i11);

    void asDropDown(View view, Balloon balloon, int i10, int i11);

    void asDropDown(Balloon balloon, View view, int i10, int i11);

    void atCenter(View view, Balloon balloon, int i10, int i11, BalloonCenterAlign balloonCenterAlign);

    void atCenter(Balloon balloon, View view, int i10, int i11, BalloonCenterAlign balloonCenterAlign);

    boolean getDismissSequentially();

    void setDismissSequentially(boolean z6);
}
