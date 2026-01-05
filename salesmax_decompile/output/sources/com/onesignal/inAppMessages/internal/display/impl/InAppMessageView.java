package com.onesignal.inAppMessages.internal.display.impl;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.app.Activity;
import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.animation.Animation;
import android.webkit.WebView;
import android.widget.PopupWindow;
import android.widget.RelativeLayout;
import androidx.cardview.widget.CardView;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import com.onesignal.common.AndroidUtils;
import com.onesignal.common.ViewUtils;
import com.onesignal.common.threading.ThreadUtilsKt;
import com.onesignal.common.threading.Waiter;
import com.onesignal.debug.internal.logging.Logging;
import com.onesignal.inAppMessages.internal.InAppMessageContent;
import com.onesignal.inAppMessages.internal.display.impl.DraggableRelativeLayout;
import com.onesignal.inAppMessages.internal.display.impl.WebViewManager;
import p001o.eu5;
import p001o.h84;
import p001o.id5;
import p001o.jgg;
import p001o.l75;
import p001o.n64;
import p001o.nk5;
import p001o.nl7;
import p001o.o64;
import p001o.oed;
import p001o.pm1;
import p001o.sq8;
import p001o.szb;
import p001o.uq8;
import p001o.wre;
import p001o.y3i;

/* loaded from: classes6.dex */
public final class InAppMessageView {
    private static final int ACTIVITY_BACKGROUND_COLOR_EMPTY = 0;
    private static final int ACTIVITY_FINISH_AFTER_DISMISS_DELAY_MS = 600;
    private static final int ACTIVITY_INIT_DELAY = 200;
    private static final int IN_APP_BACKGROUND_ANIMATION_DURATION_MS = 400;
    private static final int IN_APP_BANNER_ANIMATION_DURATION_MS = 1000;
    private static final int IN_APP_CENTER_ANIMATION_DURATION_MS = 1000;
    private static final String IN_APP_MESSAGE_CARD_VIEW_TAG = "IN_APP_MESSAGE_CARD_VIEW_TAG";
    private boolean cancelDismissTimer;
    private Activity currentActivity;
    private final boolean disableDragDismiss;
    private final double displayDuration;
    private final WebViewManager.Position displayPosition;
    private DraggableRelativeLayout draggableRelativeLayout;
    private final boolean hasBackground;
    private final boolean hideGrayOverlay;
    private boolean isDismissTimerSet;
    private boolean isDragging;
    private int marginPxSizeBottom;
    private int marginPxSizeLeft;
    private int marginPxSizeRight;
    private int marginPxSizeTop;
    private final InAppMessageContent messageContent;
    private InAppMessageViewListener messageController;
    private int pageHeight;
    private final int pageWidth;
    private RelativeLayout parentRelativeLayout;
    private PopupWindow popupWindow;
    private boolean shouldDismissWhenActive;
    private WebView webView;
    public static final Companion Companion = new Companion(null);
    private static final int ACTIVITY_BACKGROUND_COLOR_FULL = Color.parseColor("#BB000000");
    private static final int DRAG_THRESHOLD_PX_SIZE = ViewUtils.INSTANCE.dpToPx(4);

    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(id5 id5Var) {
            this();
        }
    }

    public interface InAppMessageViewListener {
        void onMessageWasDismissed();

        void onMessageWasDisplayed();

        void onMessageWillDismiss();
    }

    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[WebViewManager.Position.values().length];
            iArr[WebViewManager.Position.TOP_BANNER.ordinal()] = 1;
            iArr[WebViewManager.Position.BOTTOM_BANNER.ordinal()] = 2;
            iArr[WebViewManager.Position.CENTER_MODAL.ordinal()] = 3;
            iArr[WebViewManager.Position.FULL_SCREEN.ordinal()] = 4;
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @l75(m36647c = "com.onesignal.inAppMessages.internal.display.impl.InAppMessageView", m36648f = "InAppMessageView.kt", m36649l = {440, 444, 445}, m36650m = "delayShowUntilAvailable")
    /* renamed from: com.onesignal.inAppMessages.internal.display.impl.InAppMessageView$delayShowUntilAvailable$1 */
    public static final class C116711 extends o64 {
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        public C116711(n64 n64Var) {
            super(n64Var);
        }

        @Override // p001o.vb1
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return InAppMessageView.this.delayShowUntilAvailable(null, this);
        }
    }

    @l75(m36647c = "com.onesignal.inAppMessages.internal.display.impl.InAppMessageView$finishAfterDelay$2", m36648f = "InAppMessageView.kt", m36649l = {467, 469}, m36650m = "invokeSuspend")
    /* renamed from: com.onesignal.inAppMessages.internal.display.impl.InAppMessageView$finishAfterDelay$2 */
    public static final class C116722 extends jgg implements nl7 {
        int label;

        public C116722(n64 n64Var) {
            super(2, n64Var);
        }

        @Override // p001o.vb1
        public final n64 create(Object obj, n64 n64Var) {
            return InAppMessageView.this.new C116722(n64Var);
        }

        @Override // p001o.vb1
        public final Object invokeSuspend(Object obj) {
            Object objM51918f = uq8.m51918f();
            int i = this.label;
            if (i == 0) {
                wre.m54934b(obj);
                this.label = 1;
                if (nk5.m40720b(600L, this) == objM51918f) {
                    return objM51918f;
                }
            } else {
                if (i != 1) {
                    if (i != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    wre.m54934b(obj);
                    return y3i.f54824a;
                }
                wre.m54934b(obj);
            }
            if (!InAppMessageView.this.hasBackground || InAppMessageView.this.parentRelativeLayout == null) {
                InAppMessageView.this.cleanupViewsAfterDismiss();
            } else {
                InAppMessageView inAppMessageView = InAppMessageView.this;
                RelativeLayout relativeLayout = inAppMessageView.parentRelativeLayout;
                sq8.m48646e(relativeLayout);
                this.label = 2;
                if (inAppMessageView.animateAndDismissLayout(relativeLayout, this) == objM51918f) {
                    return objM51918f;
                }
            }
            return y3i.f54824a;
        }

        @Override // p001o.nl7
        public final Object invoke(h84 h84Var, n64 n64Var) {
            return ((C116722) create(h84Var, n64Var)).invokeSuspend(y3i.f54824a);
        }
    }

    @l75(m36647c = "com.onesignal.inAppMessages.internal.display.impl.InAppMessageView$showDraggableView$2", m36648f = "InAppMessageView.kt", m36649l = {263}, m36650m = "invokeSuspend")
    /* renamed from: com.onesignal.inAppMessages.internal.display.impl.InAppMessageView$showDraggableView$2 */
    public static final class C116742 extends jgg implements nl7 {
        final /* synthetic */ WebViewManager.Position $displayLocation;
        final /* synthetic */ RelativeLayout.LayoutParams $draggableRelativeLayoutParams;
        final /* synthetic */ RelativeLayout.LayoutParams $relativeLayoutParams;
        final /* synthetic */ DraggableRelativeLayout.Params $webViewLayoutParams;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C116742(RelativeLayout.LayoutParams layoutParams, RelativeLayout.LayoutParams layoutParams2, DraggableRelativeLayout.Params params, WebViewManager.Position position, n64 n64Var) {
            super(2, n64Var);
            this.$relativeLayoutParams = layoutParams;
            this.$draggableRelativeLayoutParams = layoutParams2;
            this.$webViewLayoutParams = params;
            this.$displayLocation = position;
        }

        @Override // p001o.vb1
        public final n64 create(Object obj, n64 n64Var) {
            return InAppMessageView.this.new C116742(this.$relativeLayoutParams, this.$draggableRelativeLayoutParams, this.$webViewLayoutParams, this.$displayLocation, n64Var);
        }

        @Override // p001o.vb1
        public final Object invokeSuspend(Object obj) {
            Object objM51918f = uq8.m51918f();
            int i = this.label;
            if (i == 0) {
                wre.m54934b(obj);
                if (InAppMessageView.this.webView == null) {
                    return y3i.f54824a;
                }
                WebView webView = InAppMessageView.this.webView;
                sq8.m48646e(webView);
                webView.setLayoutParams(this.$relativeLayoutParams);
                InAppMessageView inAppMessageView = InAppMessageView.this;
                Activity activity = inAppMessageView.currentActivity;
                sq8.m48646e(activity);
                inAppMessageView.setUpDraggableLayout(activity, this.$draggableRelativeLayoutParams, this.$webViewLayoutParams);
                InAppMessageView inAppMessageView2 = InAppMessageView.this;
                Activity activity2 = inAppMessageView2.currentActivity;
                sq8.m48646e(activity2);
                inAppMessageView2.setUpParentRelativeLayout(activity2);
                InAppMessageView inAppMessageView3 = InAppMessageView.this;
                RelativeLayout relativeLayout = inAppMessageView3.parentRelativeLayout;
                sq8.m48646e(relativeLayout);
                inAppMessageView3.createPopupWindow(relativeLayout);
                if (InAppMessageView.this.messageController != null) {
                    InAppMessageView inAppMessageView4 = InAppMessageView.this;
                    WebViewManager.Position position = this.$displayLocation;
                    DraggableRelativeLayout draggableRelativeLayout = inAppMessageView4.draggableRelativeLayout;
                    sq8.m48646e(draggableRelativeLayout);
                    RelativeLayout relativeLayout2 = InAppMessageView.this.parentRelativeLayout;
                    sq8.m48646e(relativeLayout2);
                    inAppMessageView4.animateInAppMessage(position, draggableRelativeLayout, relativeLayout2);
                }
                InAppMessageView inAppMessageView5 = InAppMessageView.this;
                this.label = 1;
                if (inAppMessageView5.startDismissTimerIfNeeded(this) == objM51918f) {
                    return objM51918f;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                wre.m54934b(obj);
            }
            return y3i.f54824a;
        }

        @Override // p001o.nl7
        public final Object invoke(h84 h84Var, n64 n64Var) {
            return ((C116742) create(h84Var, n64Var)).invokeSuspend(y3i.f54824a);
        }
    }

    @l75(m36647c = "com.onesignal.inAppMessages.internal.display.impl.InAppMessageView", m36648f = "InAppMessageView.kt", m36649l = {418, 429}, m36650m = "startDismissTimerIfNeeded")
    /* renamed from: com.onesignal.inAppMessages.internal.display.impl.InAppMessageView$startDismissTimerIfNeeded$1 */
    public static final class C116751 extends o64 {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        public C116751(n64 n64Var) {
            super(n64Var);
        }

        @Override // p001o.vb1
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return InAppMessageView.this.startDismissTimerIfNeeded(this);
        }
    }

    @l75(m36647c = "com.onesignal.inAppMessages.internal.display.impl.InAppMessageView$updateHeight$2", m36648f = "InAppMessageView.kt", m36649l = {}, m36650m = "invokeSuspend")
    /* renamed from: com.onesignal.inAppMessages.internal.display.impl.InAppMessageView$updateHeight$2 */
    public static final class C116762 extends jgg implements nl7 {
        final /* synthetic */ int $pageHeight;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C116762(int i, n64 n64Var) {
            super(2, n64Var);
            this.$pageHeight = i;
        }

        @Override // p001o.vb1
        public final n64 create(Object obj, n64 n64Var) {
            return InAppMessageView.this.new C116762(this.$pageHeight, n64Var);
        }

        @Override // p001o.vb1
        public final Object invokeSuspend(Object obj) {
            uq8.m51918f();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            wre.m54934b(obj);
            if (InAppMessageView.this.webView == null) {
                Logging.warn$default("WebView height update skipped, new height will be used once it is displayed.", null, 2, null);
                return y3i.f54824a;
            }
            WebView webView = InAppMessageView.this.webView;
            sq8.m48646e(webView);
            ViewGroup.LayoutParams layoutParams = webView.getLayoutParams();
            if (layoutParams == null) {
                Logging.warn$default("WebView height update skipped because of null layoutParams, new height will be used once it is displayed.", null, 2, null);
                return y3i.f54824a;
            }
            layoutParams.height = this.$pageHeight;
            WebView webView2 = InAppMessageView.this.webView;
            sq8.m48646e(webView2);
            webView2.setLayoutParams(layoutParams);
            if (InAppMessageView.this.draggableRelativeLayout != null) {
                DraggableRelativeLayout draggableRelativeLayout = InAppMessageView.this.draggableRelativeLayout;
                sq8.m48646e(draggableRelativeLayout);
                InAppMessageView inAppMessageView = InAppMessageView.this;
                draggableRelativeLayout.setParams(inAppMessageView.createDraggableLayoutParams(this.$pageHeight, inAppMessageView.getDisplayPosition(), InAppMessageView.this.disableDragDismiss));
            }
            return y3i.f54824a;
        }

        @Override // p001o.nl7
        public final Object invoke(h84 h84Var, n64 n64Var) {
            return ((C116762) create(h84Var, n64Var)).invokeSuspend(y3i.f54824a);
        }
    }

    public InAppMessageView(WebView webView, InAppMessageContent inAppMessageContent, boolean z, boolean z2) {
        double dDoubleValue;
        sq8.m48649h(inAppMessageContent, "messageContent");
        this.webView = webView;
        this.messageContent = inAppMessageContent;
        this.disableDragDismiss = z;
        this.hideGrayOverlay = z2;
        this.pageWidth = -1;
        this.pageHeight = inAppMessageContent.getPageHeight();
        ViewUtils viewUtils = ViewUtils.INSTANCE;
        this.marginPxSizeLeft = viewUtils.dpToPx(24);
        this.marginPxSizeRight = viewUtils.dpToPx(24);
        this.marginPxSizeTop = viewUtils.dpToPx(24);
        this.marginPxSizeBottom = viewUtils.dpToPx(24);
        WebViewManager.Position displayLocation = inAppMessageContent.getDisplayLocation();
        sq8.m48646e(displayLocation);
        this.displayPosition = displayLocation;
        if (inAppMessageContent.getDisplayDuration() == null) {
            dDoubleValue = FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE;
        } else {
            Double displayDuration = inAppMessageContent.getDisplayDuration();
            sq8.m48646e(displayDuration);
            dDoubleValue = displayDuration.doubleValue();
        }
        this.displayDuration = dDoubleValue;
        this.hasBackground = !displayLocation.isBanner();
        setMarginsFromContent(inAppMessageContent);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object animateAndDismissLayout(View view, n64 n64Var) {
        final Waiter waiter = new Waiter();
        animateBackgroundColor(view, 400, getOverlayColor(), 0, new AnimatorListenerAdapter() { // from class: com.onesignal.inAppMessages.internal.display.impl.InAppMessageView$animateAndDismissLayout$animCallback$1
            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) throws Exception {
                sq8.m48649h(animator, "animation");
                this.this$0.cleanupViewsAfterDismiss();
                waiter.wake();
            }
        }).start();
        Object objWaitForWake = waiter.waitForWake(n64Var);
        return objWaitForWake == uq8.m51918f() ? objWaitForWake : y3i.f54824a;
    }

    private final ValueAnimator animateBackgroundColor(View view, int i, int i2, int i3, Animator.AnimatorListener animatorListener) {
        return OneSignalAnimate.INSTANCE.animateViewColor(view, i, i2, i3, animatorListener);
    }

    private final void animateBottom(View view, int i, Animation.AnimationListener animationListener) {
        OneSignalAnimate.INSTANCE.animateViewByTranslation(view, i + this.marginPxSizeBottom, 0.0f, 1000, new OneSignalBounceInterpolator(0.1d, 8.0d), animationListener).start();
    }

    private final void animateCenter(View view, View view2, Animation.AnimationListener animationListener, Animator.AnimatorListener animatorListener) {
        Animation animationAnimateViewSmallToLarge = OneSignalAnimate.INSTANCE.animateViewSmallToLarge(view, 1000, new OneSignalBounceInterpolator(0.1d, 8.0d), animationListener);
        ValueAnimator valueAnimatorAnimateBackgroundColor = animateBackgroundColor(view2, 400, 0, getOverlayColor(), animatorListener);
        animationAnimateViewSmallToLarge.start();
        valueAnimatorAnimateBackgroundColor.start();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void animateInAppMessage(WebViewManager.Position position, View view, View view2) {
        sq8.m48646e(view);
        CardView cardView = (CardView) view.findViewWithTag(IN_APP_MESSAGE_CARD_VIEW_TAG);
        sq8.m48648g(cardView, "messageViewCardView");
        Animation.AnimationListener animationListenerCreateAnimationListener = createAnimationListener(cardView);
        int i = WhenMappings.$EnumSwitchMapping$0[position.ordinal()];
        if (i == 1) {
            WebView webView = this.webView;
            sq8.m48646e(webView);
            animateTop(cardView, webView.getHeight(), animationListenerCreateAnimationListener);
        } else if (i == 2) {
            WebView webView2 = this.webView;
            sq8.m48646e(webView2);
            animateBottom(cardView, webView2.getHeight(), animationListenerCreateAnimationListener);
        } else if (i == 3 || i == 4) {
            animateCenter(view, view2, animationListenerCreateAnimationListener, null);
        }
    }

    private final void animateTop(View view, int i, Animation.AnimationListener animationListener) {
        OneSignalAnimate.INSTANCE.animateViewByTranslation(view, (-i) - this.marginPxSizeTop, 0.0f, 1000, new OneSignalBounceInterpolator(0.1d, 8.0d), animationListener).start();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void cleanupViewsAfterDismiss() {
        removeAllViews();
        InAppMessageViewListener inAppMessageViewListener = this.messageController;
        if (inAppMessageViewListener != null) {
            inAppMessageViewListener.onMessageWasDismissed();
        }
    }

    private final Animation.AnimationListener createAnimationListener(final CardView cardView) {
        return new Animation.AnimationListener() { // from class: com.onesignal.inAppMessages.internal.display.impl.InAppMessageView.createAnimationListener.1
            @Override // android.view.animation.Animation.AnimationListener
            public void onAnimationEnd(Animation animation) {
                sq8.m48649h(animation, "animation");
                if (this.messageController != null) {
                    InAppMessageViewListener inAppMessageViewListener = this.messageController;
                    sq8.m48646e(inAppMessageViewListener);
                    inAppMessageViewListener.onMessageWasDisplayed();
                }
            }

            @Override // android.view.animation.Animation.AnimationListener
            public void onAnimationRepeat(Animation animation) {
                sq8.m48649h(animation, "animation");
            }

            @Override // android.view.animation.Animation.AnimationListener
            public void onAnimationStart(Animation animation) {
                sq8.m48649h(animation, "animation");
            }
        };
    }

    private final CardView createCardView(Context context) {
        CardView cardView = new CardView(context);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, this.displayPosition == WebViewManager.Position.FULL_SCREEN ? -1 : -2);
        layoutParams.addRule(13);
        cardView.setLayoutParams(layoutParams);
        if (getHideDropShadow(context)) {
            cardView.setCardElevation(0.0f);
        } else {
            cardView.setCardElevation(ViewUtils.INSTANCE.dpToPx(5));
        }
        cardView.setRadius(ViewUtils.INSTANCE.dpToPx(8));
        cardView.setClipChildren(false);
        cardView.setClipToPadding(false);
        cardView.setPreventCornerOverlap(false);
        cardView.setCardBackgroundColor(0);
        return cardView;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final DraggableRelativeLayout.Params createDraggableLayoutParams(int i, WebViewManager.Position position, boolean z) {
        DraggableRelativeLayout.Params params = new DraggableRelativeLayout.Params();
        params.setMaxXPos(this.marginPxSizeRight);
        params.setMaxYPos(this.marginPxSizeTop);
        params.setDraggingDisabled(z);
        params.setMessageHeight(i);
        params.setHeight(getDisplayYSize());
        int i2 = WhenMappings.$EnumSwitchMapping$0[position.ordinal()];
        if (i2 == 1) {
            params.setDragThresholdY(this.marginPxSizeTop - DRAG_THRESHOLD_PX_SIZE);
        } else if (i2 == 2) {
            params.setPosY(getDisplayYSize() - i);
            params.setDragThresholdY(this.marginPxSizeBottom + DRAG_THRESHOLD_PX_SIZE);
        } else if (i2 == 3) {
            int displayYSize = (getDisplayYSize() / 2) - (i / 2);
            params.setDragThresholdY(DRAG_THRESHOLD_PX_SIZE + displayYSize);
            params.setMaxYPos(displayYSize);
            params.setPosY(displayYSize);
        } else if (i2 == 4) {
            int displayYSize2 = getDisplayYSize() - (this.marginPxSizeBottom + this.marginPxSizeTop);
            params.setMessageHeight(displayYSize2);
            int displayYSize3 = (getDisplayYSize() / 2) - (displayYSize2 / 2);
            params.setDragThresholdY(DRAG_THRESHOLD_PX_SIZE + displayYSize3);
            params.setMaxYPos(displayYSize3);
            params.setPosY(displayYSize3);
        }
        params.setDragDirection(position == WebViewManager.Position.TOP_BANNER ? 0 : 1);
        return params;
    }

    private final RelativeLayout.LayoutParams createParentRelativeLayoutParams() {
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(this.pageWidth, -1);
        int i = WhenMappings.$EnumSwitchMapping$0[this.displayPosition.ordinal()];
        if (i == 1) {
            layoutParams.addRule(10);
            layoutParams.addRule(14);
        } else if (i == 2) {
            layoutParams.addRule(12);
            layoutParams.addRule(14);
        } else if (i == 3 || i == 4) {
            layoutParams.addRule(13);
        }
        return layoutParams;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void createPopupWindow(RelativeLayout relativeLayout) {
        boolean z = this.hasBackground;
        PopupWindow popupWindow = new PopupWindow((View) relativeLayout, z ? -1 : this.pageWidth, z ? -1 : -2, false);
        this.popupWindow = popupWindow;
        popupWindow.setBackgroundDrawable(new ColorDrawable(0));
        PopupWindow popupWindow2 = this.popupWindow;
        int i = 1;
        if (popupWindow2 != null) {
            popupWindow2.setTouchable(true);
        }
        PopupWindow popupWindow3 = this.popupWindow;
        if (popupWindow3 != null) {
            popupWindow3.setFocusable(!this.displayPosition.isBanner());
        }
        PopupWindow popupWindow4 = this.popupWindow;
        if (popupWindow4 != null) {
            popupWindow4.setClippingEnabled(false);
        }
        if (this.hasBackground) {
            i = 0;
        } else {
            int i2 = WhenMappings.$EnumSwitchMapping$0[this.displayPosition.ordinal()];
            if (i2 == 1) {
                i = 49;
            } else if (i2 == 2) {
                i = 81;
            } else if (i2 != 3 && i2 != 4) {
                throw new szb();
            }
        }
        int i3 = this.messageContent.isFullBleed() ? 1000 : 1003;
        PopupWindow popupWindow5 = this.popupWindow;
        sq8.m48646e(popupWindow5);
        oed.m42134b(popupWindow5, i3);
        PopupWindow popupWindow6 = this.popupWindow;
        if (popupWindow6 != null) {
            Activity activity = this.currentActivity;
            sq8.m48646e(activity);
            popupWindow6.showAtLocation(activity.getWindow().getDecorView().getRootView(), i, 0, 0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:33:0x007f A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object delayShowUntilAvailable(Activity activity, n64 n64Var) {
        C116711 c116711;
        InAppMessageView inAppMessageView;
        if (n64Var instanceof C116711) {
            c116711 = (C116711) n64Var;
            int i = c116711.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c116711.label = i - Integer.MIN_VALUE;
            } else {
                c116711 = new C116711(n64Var);
            }
        }
        Object obj = c116711.result;
        Object objM51918f = uq8.m51918f();
        int i2 = c116711.label;
        if (i2 == 0) {
            wre.m54934b(obj);
            if (AndroidUtils.INSTANCE.isActivityFullyReady(activity) && this.parentRelativeLayout == null) {
                c116711.label = 1;
                if (showInAppMessageView(activity, c116711) == objM51918f) {
                    return objM51918f;
                }
                return y3i.f54824a;
            }
            c116711.L$0 = this;
            c116711.L$1 = activity;
            c116711.label = 2;
            if (nk5.m40720b(200L, c116711) == objM51918f) {
                return objM51918f;
            }
            inAppMessageView = this;
            c116711.L$0 = null;
            c116711.L$1 = null;
            c116711.label = 3;
            if (inAppMessageView.delayShowUntilAvailable(activity, c116711) == objM51918f) {
            }
        } else {
            if (i2 == 1) {
                wre.m54934b(obj);
                return y3i.f54824a;
            }
            if (i2 == 2) {
                activity = (Activity) c116711.L$1;
                inAppMessageView = (InAppMessageView) c116711.L$0;
                wre.m54934b(obj);
                c116711.L$0 = null;
                c116711.L$1 = null;
                c116711.label = 3;
                if (inAppMessageView.delayShowUntilAvailable(activity, c116711) == objM51918f) {
                    return objM51918f;
                }
            } else {
                if (i2 != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                wre.m54934b(obj);
            }
        }
        return y3i.f54824a;
    }

    private final void dereferenceViews() {
        this.parentRelativeLayout = null;
        this.draggableRelativeLayout = null;
        this.webView = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object finishAfterDelay(n64 n64Var) {
        Object objM43867g = pm1.m43867g(eu5.m25612c(), new C116722(null), n64Var);
        return objM43867g == uq8.m51918f() ? objM43867g : y3i.f54824a;
    }

    private final int getDisplayYSize() {
        ViewUtils viewUtils = ViewUtils.INSTANCE;
        Activity activity = this.currentActivity;
        sq8.m48646e(activity);
        return viewUtils.getWindowHeight(activity);
    }

    private final boolean getHideDropShadow(Context context) {
        return AndroidUtils.INSTANCE.getManifestMetaBoolean(context, "com.onesignal.inAppMessageHideDropShadow");
    }

    private final int getOverlayColor() {
        if (this.hideGrayOverlay) {
            return 0;
        }
        return ACTIVITY_BACKGROUND_COLOR_FULL;
    }

    private final void setMarginsFromContent(InAppMessageContent inAppMessageContent) {
        this.marginPxSizeTop = inAppMessageContent.getUseHeightMargin() ? ViewUtils.INSTANCE.dpToPx(24) : 0;
        this.marginPxSizeBottom = inAppMessageContent.getUseHeightMargin() ? ViewUtils.INSTANCE.dpToPx(24) : 0;
        this.marginPxSizeLeft = inAppMessageContent.getUseWidthMargin() ? ViewUtils.INSTANCE.dpToPx(24) : 0;
        this.marginPxSizeRight = inAppMessageContent.getUseWidthMargin() ? ViewUtils.INSTANCE.dpToPx(24) : 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setUpDraggableLayout(Context context, RelativeLayout.LayoutParams layoutParams, DraggableRelativeLayout.Params params) {
        DraggableRelativeLayout draggableRelativeLayout = new DraggableRelativeLayout(context);
        this.draggableRelativeLayout = draggableRelativeLayout;
        if (layoutParams != null) {
            sq8.m48646e(draggableRelativeLayout);
            draggableRelativeLayout.setLayoutParams(layoutParams);
        }
        DraggableRelativeLayout draggableRelativeLayout2 = this.draggableRelativeLayout;
        sq8.m48646e(draggableRelativeLayout2);
        draggableRelativeLayout2.setParams(params);
        DraggableRelativeLayout draggableRelativeLayout3 = this.draggableRelativeLayout;
        sq8.m48646e(draggableRelativeLayout3);
        draggableRelativeLayout3.setListener(new DraggableRelativeLayout.DraggableListener() { // from class: com.onesignal.inAppMessages.internal.display.impl.InAppMessageView.setUpDraggableLayout.1
            @Override // com.onesignal.inAppMessages.internal.display.impl.DraggableRelativeLayout.DraggableListener
            public void onDismiss() {
                if (InAppMessageView.this.messageController != null) {
                    InAppMessageViewListener inAppMessageViewListener = InAppMessageView.this.messageController;
                    sq8.m48646e(inAppMessageViewListener);
                    inAppMessageViewListener.onMessageWillDismiss();
                }
                ThreadUtilsKt.suspendifyOnThread$default(0, new InAppMessageView$setUpDraggableLayout$1$onDismiss$1(InAppMessageView.this, null), 1, null);
            }

            @Override // com.onesignal.inAppMessages.internal.display.impl.DraggableRelativeLayout.DraggableListener
            public void onDragEnd() {
                InAppMessageView.this.isDragging = false;
            }

            @Override // com.onesignal.inAppMessages.internal.display.impl.DraggableRelativeLayout.DraggableListener
            public void onDragStart() {
                InAppMessageView.this.isDragging = true;
            }
        });
        WebView webView = this.webView;
        sq8.m48646e(webView);
        if (webView.getParent() != null) {
            WebView webView2 = this.webView;
            sq8.m48646e(webView2);
            ViewParent parent = webView2.getParent();
            sq8.m48647f(parent, "null cannot be cast to non-null type android.view.ViewGroup");
            ((ViewGroup) parent).removeAllViews();
        }
        CardView cardViewCreateCardView = createCardView(context);
        cardViewCreateCardView.setTag(IN_APP_MESSAGE_CARD_VIEW_TAG);
        cardViewCreateCardView.addView(this.webView);
        DraggableRelativeLayout draggableRelativeLayout4 = this.draggableRelativeLayout;
        sq8.m48646e(draggableRelativeLayout4);
        draggableRelativeLayout4.setPadding(this.marginPxSizeLeft, this.marginPxSizeTop, this.marginPxSizeRight, this.marginPxSizeBottom);
        DraggableRelativeLayout draggableRelativeLayout5 = this.draggableRelativeLayout;
        sq8.m48646e(draggableRelativeLayout5);
        draggableRelativeLayout5.setClipChildren(false);
        DraggableRelativeLayout draggableRelativeLayout6 = this.draggableRelativeLayout;
        sq8.m48646e(draggableRelativeLayout6);
        draggableRelativeLayout6.setClipToPadding(false);
        DraggableRelativeLayout draggableRelativeLayout7 = this.draggableRelativeLayout;
        sq8.m48646e(draggableRelativeLayout7);
        draggableRelativeLayout7.addView(cardViewCreateCardView);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setUpParentRelativeLayout(Context context) {
        RelativeLayout relativeLayout = new RelativeLayout(context);
        this.parentRelativeLayout = relativeLayout;
        sq8.m48646e(relativeLayout);
        relativeLayout.setBackgroundDrawable(new ColorDrawable(0));
        RelativeLayout relativeLayout2 = this.parentRelativeLayout;
        sq8.m48646e(relativeLayout2);
        relativeLayout2.setClipChildren(false);
        RelativeLayout relativeLayout3 = this.parentRelativeLayout;
        sq8.m48646e(relativeLayout3);
        relativeLayout3.setClipToPadding(false);
        RelativeLayout relativeLayout4 = this.parentRelativeLayout;
        sq8.m48646e(relativeLayout4);
        relativeLayout4.addView(this.draggableRelativeLayout);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object showDraggableView(WebViewManager.Position position, RelativeLayout.LayoutParams layoutParams, RelativeLayout.LayoutParams layoutParams2, DraggableRelativeLayout.Params params, n64 n64Var) {
        Object objM43867g = pm1.m43867g(eu5.m25612c(), new C116742(layoutParams, layoutParams2, params, position, null), n64Var);
        return objM43867g == uq8.m51918f() ? objM43867g : y3i.f54824a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object startDismissTimerIfNeeded(n64 n64Var) {
        C116751 c116751;
        InAppMessageView inAppMessageView;
        InAppMessageView inAppMessageView2;
        if (n64Var instanceof C116751) {
            c116751 = (C116751) n64Var;
            int i = c116751.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c116751.label = i - Integer.MIN_VALUE;
            } else {
                c116751 = new C116751(n64Var);
            }
        }
        Object obj = c116751.result;
        Object objM51918f = uq8.m51918f();
        int i2 = c116751.label;
        if (i2 == 0) {
            wre.m54934b(obj);
            double d = this.displayDuration;
            if (d <= FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE || this.isDismissTimerSet) {
                return y3i.f54824a;
            }
            this.isDismissTimerSet = true;
            c116751.L$0 = this;
            c116751.label = 1;
            if (nk5.m40720b(((long) d) * 1000, c116751) == objM51918f) {
                return objM51918f;
            }
            inAppMessageView = this;
        } else {
            if (i2 != 1) {
                if (i2 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                inAppMessageView2 = (InAppMessageView) c116751.L$0;
                wre.m54934b(obj);
                inAppMessageView2.isDismissTimerSet = false;
                return y3i.f54824a;
            }
            inAppMessageView = (InAppMessageView) c116751.L$0;
            wre.m54934b(obj);
        }
        if (inAppMessageView.cancelDismissTimer) {
            inAppMessageView.cancelDismissTimer = false;
            return y3i.f54824a;
        }
        InAppMessageViewListener inAppMessageViewListener = inAppMessageView.messageController;
        if (inAppMessageViewListener != null) {
            sq8.m48646e(inAppMessageViewListener);
            inAppMessageViewListener.onMessageWillDismiss();
        }
        if (inAppMessageView.currentActivity == null) {
            inAppMessageView.shouldDismissWhenActive = true;
            return y3i.f54824a;
        }
        c116751.L$0 = inAppMessageView;
        c116751.label = 2;
        if (inAppMessageView.dismissAndAwaitNextMessage(c116751) == objM51918f) {
            return objM51918f;
        }
        inAppMessageView2 = inAppMessageView;
        inAppMessageView2.isDismissTimerSet = false;
        return y3i.f54824a;
    }

    public final Object checkIfShouldDismiss(n64 n64Var) {
        if (!this.shouldDismissWhenActive) {
            return y3i.f54824a;
        }
        this.shouldDismissWhenActive = false;
        Object objFinishAfterDelay = finishAfterDelay(n64Var);
        return objFinishAfterDelay == uq8.m51918f() ? objFinishAfterDelay : y3i.f54824a;
    }

    public final Object dismissAndAwaitNextMessage(n64 n64Var) {
        DraggableRelativeLayout draggableRelativeLayout = this.draggableRelativeLayout;
        if (draggableRelativeLayout == null) {
            Logging.error$default("No host presenter to trigger dismiss animation, counting as dismissed already", null, 2, null);
            dereferenceViews();
            return y3i.f54824a;
        }
        sq8.m48646e(draggableRelativeLayout);
        draggableRelativeLayout.dismiss();
        Object objFinishAfterDelay = finishAfterDelay(n64Var);
        return objFinishAfterDelay == uq8.m51918f() ? objFinishAfterDelay : y3i.f54824a;
    }

    public final WebViewManager.Position getDisplayPosition() {
        return this.displayPosition;
    }

    public final boolean isDragging() {
        return this.isDragging;
    }

    public final void removeAllViews() {
        Logging.debug$default("InAppMessageView.removeAllViews()", null, 2, null);
        if (this.isDismissTimerSet) {
            this.cancelDismissTimer = true;
        }
        DraggableRelativeLayout draggableRelativeLayout = this.draggableRelativeLayout;
        if (draggableRelativeLayout != null) {
            sq8.m48646e(draggableRelativeLayout);
            draggableRelativeLayout.removeAllViews();
        }
        PopupWindow popupWindow = this.popupWindow;
        if (popupWindow != null) {
            sq8.m48646e(popupWindow);
            popupWindow.dismiss();
        }
        dereferenceViews();
    }

    public final void setMessageController(InAppMessageViewListener inAppMessageViewListener) {
        this.messageController = inAppMessageViewListener;
    }

    public final void setWebView(WebView webView) {
        sq8.m48649h(webView, "webView");
        this.webView = webView;
        if (webView != null) {
            webView.setBackgroundColor(0);
        }
    }

    public final Object showInAppMessageView(Activity activity, n64 n64Var) {
        this.currentActivity = activity;
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, this.pageHeight);
        layoutParams.addRule(13);
        RelativeLayout.LayoutParams layoutParamsCreateParentRelativeLayoutParams = this.hasBackground ? createParentRelativeLayoutParams() : null;
        WebViewManager.Position position = this.displayPosition;
        Object objShowDraggableView = showDraggableView(position, layoutParams, layoutParamsCreateParentRelativeLayoutParams, createDraggableLayoutParams(this.pageHeight, position, this.disableDragDismiss), n64Var);
        return objShowDraggableView == uq8.m51918f() ? objShowDraggableView : y3i.f54824a;
    }

    public final Object showView(Activity activity, n64 n64Var) {
        Object objDelayShowUntilAvailable = delayShowUntilAvailable(activity, n64Var);
        return objDelayShowUntilAvailable == uq8.m51918f() ? objDelayShowUntilAvailable : y3i.f54824a;
    }

    public String toString() {
        return "InAppMessageView{currentActivity=" + this.currentActivity + ", pageWidth=" + this.pageWidth + ", pageHeight=" + this.pageHeight + ", displayDuration=" + this.displayDuration + ", hasBackground=" + this.hasBackground + ", shouldDismissWhenActive=" + this.shouldDismissWhenActive + ", isDragging=" + this.isDragging + ", disableDragDismiss=" + this.disableDragDismiss + ", displayLocation=" + this.displayPosition + ", webView=" + this.webView + '}';
    }

    public final Object updateHeight(int i, n64 n64Var) {
        this.pageHeight = i;
        Object objM43867g = pm1.m43867g(eu5.m25612c(), new C116762(i, null), n64Var);
        return objM43867g == uq8.m51918f() ? objM43867g : y3i.f54824a;
    }
}
