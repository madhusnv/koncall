package com.skydoves.balloon;

import a1.RunnableC0025x;
import a2.AbstractC0030c;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.Shader;
import android.graphics.Typeface;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.os.Handler;
import android.os.Looper;
import android.text.method.MovementMethod;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewAnimationUtils;
import android.view.ViewGroup;
import android.view.ViewOutlineProvider;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.PopupWindow;
import android.widget.TextView;
import aq.C0403f;
import ay.C0496f;
import c6.n0;
import c6.v0;
import com.amplifyframework.devmenu.ViewOnClickListenerC1189b;
import com.amplifyframework.statemachine.codegen.data.C1226a;
import com.skydoves.balloon.Balloon;
import com.skydoves.balloon.IconForm;
import com.skydoves.balloon.TextForm;
import com.skydoves.balloon.animations.BalloonRotateAnimation;
import com.skydoves.balloon.annotations.Dp;
import com.skydoves.balloon.annotations.InternalBalloonApi;
import com.skydoves.balloon.annotations.Sp;
import com.skydoves.balloon.databinding.BalloonLayoutBodyBinding;
import com.skydoves.balloon.databinding.BalloonLayoutOverlayBinding;
import com.skydoves.balloon.extensions.ContextExtensionKt;
import com.skydoves.balloon.extensions.DrawableExtensionKt;
import com.skydoves.balloon.extensions.GlobalExtensionKt;
import com.skydoves.balloon.extensions.TextViewExtensionKt;
import com.skydoves.balloon.extensions.ViewExtensionKt;
import com.skydoves.balloon.internals.DefinitionKt;
import com.skydoves.balloon.overlay.BalloonAnchorOverlayView;
import com.skydoves.balloon.overlay.BalloonOverlayAnimation;
import com.skydoves.balloon.overlay.BalloonOverlayOval;
import com.skydoves.balloon.overlay.BalloonOverlayShape;
import com.skydoves.balloon.radius.RadiusLayout;
import com.skydoves.balloon.vectortext.VectorTextView;
import d7.AbstractC1646r;
import d7.InterfaceC1633f;
import d7.InterfaceC1648t;
import d7.InterfaceC1649u;
import ex.InterfaceC2137a;
import ex.InterfaceC2139c;
import ex.InterfaceC2141e;
import gx.AbstractC2747a;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.AbstractC4148f;
import kotlin.jvm.internal.AbstractC4154l;
import kx.C4266h;
import og.nd;
import og.pe;
import org.bouncycastle.asn1.BERTags;
import pg.o6;
import pg.w9;
import qw.C6361k;
import qw.EnumC6359i;
import qw.InterfaceC6353c;
import qw.InterfaceC6357g;
import qw.a0;
import rw.AbstractC6663m;
import rw.AbstractC6664n;
import rw.AbstractC6672v;
import rw.C6668r;
import s8.InterfaceC6771a;
import tx.InterfaceC7266z;
import tx.c0;
import tx.m0;
import uw.InterfaceC7559c;
import vw.EnumC7794a;
import vx.InterfaceC7810l;
import yx.AbstractC8819m;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class Balloon implements InterfaceC1633f {
    private static boolean isConsumerActive;
    private final InterfaceC6357g autoDismissRunnable$delegate;
    private final InterfaceC6357g balloonPersistence$delegate;
    private final BalloonLayoutBodyBinding binding;
    private final PopupWindow bodyWindow;
    private final Builder builder;
    private final Context context;
    private BalloonAlign currentAlign;
    private boolean destroyed;
    private final InterfaceC6357g handler$delegate;
    private boolean isShowing;
    public OnBalloonInitializedListener onBalloonInitializedListener;
    private final BalloonLayoutOverlayBinding overlayBinding;
    private final PopupWindow overlayWindow;
    private C6361k passedEventActionDownEvent;
    public static final Companion Companion = new Companion(null);
    private static final InterfaceC6357g channel$delegate = nd.m10782c(new C1226a(12));
    private static final InterfaceC6357g scope$delegate = nd.m10782c(new C1226a(13));

    /* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
    @BalloonInlineDsl
    public static final class Builder {
        private float alpha;
        private int arrowAlignAnchorPadding;
        private float arrowAlignAnchorPaddingRatio;
        private int arrowBottomPadding;
        private int arrowColor;
        private boolean arrowColorMatchBalloon;
        private Drawable arrowDrawable;
        private float arrowElevation;
        private int arrowLeftPadding;
        private ArrowOrientation arrowOrientation;
        private ArrowOrientationRules arrowOrientationRules;
        private float arrowPosition;
        private ArrowPositionRules arrowPositionRules;
        private int arrowRightPadding;
        private int arrowSize;
        private int arrowTopPadding;
        private long autoDismissDuration;
        private int backgroundColor;
        private Drawable backgroundDrawable;
        private BalloonAnimation balloonAnimation;
        private int balloonAnimationStyle;
        private BalloonHighlightAnimation balloonHighlightAnimation;
        private long balloonHighlightAnimationStartDelay;
        private int balloonHighlightAnimationStyle;
        private BalloonOverlayAnimation balloonOverlayAnimation;
        private int balloonOverlayAnimationStyle;
        private BalloonRotateAnimation balloonRotateAnimation;
        private long circularDuration;
        private final Context context;
        private float cornerRadius;
        private boolean dismissWhenClicked;
        private boolean dismissWhenLifecycleOnPause;
        private boolean dismissWhenOverlayClicked;
        private boolean dismissWhenShowAgain;
        private boolean dismissWhenTouchMargin;
        private boolean dismissWhenTouchOutside;
        private float elevation;
        private boolean enableAutoSized;
        private int height;
        private int iconColor;
        private CharSequence iconContentDescription;
        private Drawable iconDrawable;
        private IconForm iconForm;
        private IconGravity iconGravity;
        private int iconHeight;
        private int iconSpace;
        private int iconWidth;
        private boolean includeFontPadding;
        private boolean isAttachedInDecor;
        private boolean isComposableContent;
        private boolean isFocusable;
        private boolean isRtlLayout;
        private boolean isStatusBarVisible;
        private boolean isVisibleArrow;
        private boolean isVisibleOverlay;
        private View layout;
        private Integer layoutRes;
        private InterfaceC1648t lifecycleObserver;
        private InterfaceC1649u lifecycleOwner;
        private int marginBottom;
        private int marginLeft;
        private int marginRight;
        private int marginTop;
        private float maxAutoSizeTextSize;
        private int maxWidth;
        private float maxWidthRatio;
        private int measuredWidth;
        private float minAutoSizeTextSize;
        private int minWidth;
        private float minWidthRatio;
        private MovementMethod movementMethod;
        private OnBalloonClickListener onBalloonClickListener;
        private OnBalloonDismissListener onBalloonDismissListener;
        private OnBalloonInitializedListener onBalloonInitializedListener;
        private OnBalloonOutsideTouchListener onBalloonOutsideTouchListener;
        private OnBalloonOverlayClickListener onBalloonOverlayClickListener;
        private View.OnTouchListener onBalloonOverlayTouchListener;
        private View.OnTouchListener onBalloonTouchListener;
        private int overlayColor;
        private int overlayGravity;
        private float overlayPadding;
        private int overlayPaddingColor;
        private Shader overlayPaddingShader;
        private Point overlayPosition;
        private BalloonOverlayShape overlayShape;
        private int paddingBottom;
        private int paddingLeft;
        private int paddingRight;
        private int paddingTop;
        private boolean passTouchEventToAnchor;
        private String preferenceName;
        private InterfaceC2137a runIfReachedShowCounts;
        private int showTimes;
        private int supportRtlLayoutFactor;
        private CharSequence text;
        private int textColor;
        private TextForm textForm;
        private int textGravity;
        private boolean textIsHtml;
        private Float textLetterSpacing;
        private Float textLineSpacing;

        @Sp
        private float textSize;
        private int textTypeface;
        private Typeface textTypefaceObject;
        private int width;
        private float widthRatio;

        public Builder(Context context) {
            AbstractC4154l.m8923f(context, "context");
            this.context = context;
            this.width = Integer.MIN_VALUE;
            this.maxWidth = new Point(Resources.getSystem().getDisplayMetrics().widthPixels, Resources.getSystem().getDisplayMetrics().heightPixels).x;
            this.measuredWidth = Integer.MIN_VALUE;
            this.height = Integer.MIN_VALUE;
            this.isVisibleArrow = true;
            this.arrowColor = Integer.MIN_VALUE;
            this.arrowSize = AbstractC0030c.m110a(12, 1);
            this.arrowPosition = 0.5f;
            this.arrowPositionRules = ArrowPositionRules.ALIGN_BALLOON;
            this.arrowOrientationRules = ArrowOrientationRules.ALIGN_ANCHOR;
            this.arrowOrientation = ArrowOrientation.BOTTOM;
            this.arrowAlignAnchorPaddingRatio = 2.5f;
            this.backgroundColor = -16777216;
            this.cornerRadius = TypedValue.applyDimension(1, 5.0f, Resources.getSystem().getDisplayMetrics());
            this.text = "";
            this.textColor = -1;
            this.textSize = 12.0f;
            this.minAutoSizeTextSize = 12.0f;
            this.maxAutoSizeTextSize = 12.0f + 1;
            this.includeFontPadding = true;
            this.textGravity = 17;
            this.iconGravity = IconGravity.START;
            float f6 = 28;
            this.iconWidth = AbstractC0030c.m110a(f6, 1);
            this.iconHeight = AbstractC0030c.m110a(f6, 1);
            this.iconSpace = AbstractC0030c.m110a(8, 1);
            this.iconColor = Integer.MIN_VALUE;
            this.iconContentDescription = "";
            this.alpha = 1.0f;
            this.elevation = TypedValue.applyDimension(1, 2.0f, Resources.getSystem().getDisplayMetrics());
            this.overlayShape = BalloonOverlayOval.INSTANCE;
            this.overlayGravity = 17;
            this.dismissWhenTouchOutside = true;
            this.dismissWhenTouchMargin = true;
            this.dismissWhenOverlayClicked = true;
            this.autoDismissDuration = -1L;
            this.balloonAnimationStyle = Integer.MIN_VALUE;
            this.balloonOverlayAnimationStyle = Integer.MIN_VALUE;
            this.balloonAnimation = BalloonAnimation.FADE;
            this.balloonOverlayAnimation = BalloonOverlayAnimation.FADE;
            this.circularDuration = 500L;
            this.balloonHighlightAnimation = BalloonHighlightAnimation.NONE;
            this.balloonHighlightAnimationStyle = Integer.MIN_VALUE;
            this.showTimes = 1;
            boolean z6 = context.getResources().getConfiguration().getLayoutDirection() == 1;
            this.isRtlLayout = z6;
            this.supportRtlLayoutFactor = DefinitionKt.unaryMinus(1, z6);
            this.isFocusable = true;
            this.isStatusBarVisible = true;
            this.isAttachedInDecor = true;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final a0 runIfReachedShowCounts$lambda$165$lambda$164(Runnable runnable) {
            runnable.run();
            return a0.f30746a;
        }

        public static /* synthetic */ Builder setBalloonHighlightAnimation$default(Builder builder, BalloonHighlightAnimation balloonHighlightAnimation, long j6, int i10, Object obj) {
            if ((i10 & 2) != 0) {
                j6 = 0;
            }
            return builder.setBalloonHighlightAnimation(balloonHighlightAnimation, j6);
        }

        public static /* synthetic */ Builder setBalloonHighlightAnimationResource$default(Builder builder, int i10, long j6, int i11, Object obj) {
            if ((i11 & 2) != 0) {
                j6 = 0;
            }
            return builder.setBalloonHighlightAnimationResource(i10, j6);
        }

        public final Balloon build() {
            return new Balloon(this.context, this, null);
        }

        public final float getAlpha() {
            return this.alpha;
        }

        public final int getArrowAlignAnchorPadding() {
            return this.arrowAlignAnchorPadding;
        }

        public final float getArrowAlignAnchorPaddingRatio() {
            return this.arrowAlignAnchorPaddingRatio;
        }

        public final int getArrowBottomPadding() {
            return this.arrowBottomPadding;
        }

        public final int getArrowColor() {
            return this.arrowColor;
        }

        public final boolean getArrowColorMatchBalloon() {
            return this.arrowColorMatchBalloon;
        }

        public final Drawable getArrowDrawable() {
            return this.arrowDrawable;
        }

        public final float getArrowElevation() {
            return this.arrowElevation;
        }

        public final /* synthetic */ float getArrowHalfSize() {
            return getArrowSize() * 0.5f;
        }

        public final int getArrowLeftPadding() {
            return this.arrowLeftPadding;
        }

        public final ArrowOrientation getArrowOrientation() {
            return this.arrowOrientation;
        }

        public final ArrowOrientationRules getArrowOrientationRules() {
            return this.arrowOrientationRules;
        }

        public final float getArrowPosition() {
            return this.arrowPosition;
        }

        public final ArrowPositionRules getArrowPositionRules() {
            return this.arrowPositionRules;
        }

        public final int getArrowRightPadding() {
            return this.arrowRightPadding;
        }

        public final int getArrowSize() {
            return this.arrowSize;
        }

        public final int getArrowTopPadding() {
            return this.arrowTopPadding;
        }

        public final long getAutoDismissDuration() {
            return this.autoDismissDuration;
        }

        public final int getBackgroundColor() {
            return this.backgroundColor;
        }

        public final Drawable getBackgroundDrawable() {
            return this.backgroundDrawable;
        }

        public final BalloonAnimation getBalloonAnimation() {
            return this.balloonAnimation;
        }

        public final int getBalloonAnimationStyle() {
            return this.balloonAnimationStyle;
        }

        public final BalloonHighlightAnimation getBalloonHighlightAnimation() {
            return this.balloonHighlightAnimation;
        }

        public final long getBalloonHighlightAnimationStartDelay() {
            return this.balloonHighlightAnimationStartDelay;
        }

        public final int getBalloonHighlightAnimationStyle() {
            return this.balloonHighlightAnimationStyle;
        }

        public final BalloonOverlayAnimation getBalloonOverlayAnimation() {
            return this.balloonOverlayAnimation;
        }

        public final int getBalloonOverlayAnimationStyle() {
            return this.balloonOverlayAnimationStyle;
        }

        public final BalloonRotateAnimation getBalloonRotateAnimation() {
            return this.balloonRotateAnimation;
        }

        public final long getCircularDuration() {
            return this.circularDuration;
        }

        public final float getCornerRadius() {
            return this.cornerRadius;
        }

        public final boolean getDismissWhenClicked() {
            return this.dismissWhenClicked;
        }

        public final boolean getDismissWhenLifecycleOnPause() {
            return this.dismissWhenLifecycleOnPause;
        }

        public final boolean getDismissWhenOverlayClicked() {
            return this.dismissWhenOverlayClicked;
        }

        public final boolean getDismissWhenShowAgain() {
            return this.dismissWhenShowAgain;
        }

        public final boolean getDismissWhenTouchMargin() {
            return this.dismissWhenTouchMargin;
        }

        public final boolean getDismissWhenTouchOutside() {
            return this.dismissWhenTouchOutside;
        }

        public final float getElevation() {
            return this.elevation;
        }

        public final boolean getEnableAutoSized() {
            return this.enableAutoSized;
        }

        public final int getHeight() {
            return this.height;
        }

        public final int getIconColor() {
            return this.iconColor;
        }

        public final CharSequence getIconContentDescription() {
            return this.iconContentDescription;
        }

        public final Drawable getIconDrawable() {
            return this.iconDrawable;
        }

        public final IconForm getIconForm() {
            return this.iconForm;
        }

        public final IconGravity getIconGravity() {
            return this.iconGravity;
        }

        public final int getIconHeight() {
            return this.iconHeight;
        }

        public final int getIconSpace() {
            return this.iconSpace;
        }

        public final int getIconWidth() {
            return this.iconWidth;
        }

        public final boolean getIncludeFontPadding() {
            return this.includeFontPadding;
        }

        public final View getLayout() {
            return this.layout;
        }

        public final Integer getLayoutRes() {
            return this.layoutRes;
        }

        public final InterfaceC1648t getLifecycleObserver() {
            return this.lifecycleObserver;
        }

        public final InterfaceC1649u getLifecycleOwner() {
            return this.lifecycleOwner;
        }

        public final int getMarginBottom() {
            return this.marginBottom;
        }

        public final int getMarginLeft() {
            return this.marginLeft;
        }

        public final int getMarginRight() {
            return this.marginRight;
        }

        public final int getMarginTop() {
            return this.marginTop;
        }

        public final float getMaxAutoSizeTextSize() {
            return this.maxAutoSizeTextSize;
        }

        public final int getMaxWidth() {
            return this.maxWidth;
        }

        public final float getMaxWidthRatio() {
            return this.maxWidthRatio;
        }

        public final int getMeasuredWidth() {
            return this.measuredWidth;
        }

        public final float getMinAutoSizeTextSize() {
            return this.minAutoSizeTextSize;
        }

        public final int getMinWidth() {
            return this.minWidth;
        }

        public final float getMinWidthRatio() {
            return this.minWidthRatio;
        }

        public final MovementMethod getMovementMethod() {
            return this.movementMethod;
        }

        public final OnBalloonClickListener getOnBalloonClickListener() {
            return this.onBalloonClickListener;
        }

        public final OnBalloonDismissListener getOnBalloonDismissListener() {
            return this.onBalloonDismissListener;
        }

        public final OnBalloonInitializedListener getOnBalloonInitializedListener() {
            return this.onBalloonInitializedListener;
        }

        public final OnBalloonOutsideTouchListener getOnBalloonOutsideTouchListener() {
            return this.onBalloonOutsideTouchListener;
        }

        public final OnBalloonOverlayClickListener getOnBalloonOverlayClickListener() {
            return this.onBalloonOverlayClickListener;
        }

        public final View.OnTouchListener getOnBalloonOverlayTouchListener() {
            return this.onBalloonOverlayTouchListener;
        }

        public final View.OnTouchListener getOnBalloonTouchListener() {
            return this.onBalloonTouchListener;
        }

        public final int getOverlayColor() {
            return this.overlayColor;
        }

        public final int getOverlayGravity() {
            return this.overlayGravity;
        }

        public final float getOverlayPadding() {
            return this.overlayPadding;
        }

        public final int getOverlayPaddingColor() {
            return this.overlayPaddingColor;
        }

        public final Shader getOverlayPaddingShader() {
            return this.overlayPaddingShader;
        }

        public final Point getOverlayPosition() {
            return this.overlayPosition;
        }

        public final BalloonOverlayShape getOverlayShape() {
            return this.overlayShape;
        }

        public final int getPaddingBottom() {
            return this.paddingBottom;
        }

        public final int getPaddingLeft() {
            return this.paddingLeft;
        }

        public final int getPaddingRight() {
            return this.paddingRight;
        }

        public final int getPaddingTop() {
            return this.paddingTop;
        }

        public final boolean getPassTouchEventToAnchor() {
            return this.passTouchEventToAnchor;
        }

        public final String getPreferenceName() {
            return this.preferenceName;
        }

        public final InterfaceC2137a getRunIfReachedShowCounts() {
            return this.runIfReachedShowCounts;
        }

        public final int getShowTimes() {
            return this.showTimes;
        }

        public final int getSupportRtlLayoutFactor() {
            return this.supportRtlLayoutFactor;
        }

        public final CharSequence getText() {
            return this.text;
        }

        public final int getTextColor() {
            return this.textColor;
        }

        public final TextForm getTextForm() {
            return this.textForm;
        }

        public final int getTextGravity() {
            return this.textGravity;
        }

        public final boolean getTextIsHtml() {
            return this.textIsHtml;
        }

        public final Float getTextLetterSpacing() {
            return this.textLetterSpacing;
        }

        public final Float getTextLineSpacing() {
            return this.textLineSpacing;
        }

        public final float getTextSize() {
            return this.textSize;
        }

        public final int getTextTypeface() {
            return this.textTypeface;
        }

        public final Typeface getTextTypefaceObject() {
            return this.textTypefaceObject;
        }

        public final int getWidth() {
            return this.width;
        }

        public final float getWidthRatio() {
            return this.widthRatio;
        }

        public final boolean isAttachedInDecor() {
            return this.isAttachedInDecor;
        }

        public final boolean isComposableContent() {
            return this.isComposableContent;
        }

        public final boolean isFocusable() {
            return this.isFocusable;
        }

        public final boolean isRtlLayout() {
            return this.isRtlLayout;
        }

        public final boolean isStatusBarVisible() {
            return this.isStatusBarVisible;
        }

        public final boolean isVisibleArrow() {
            return this.isVisibleArrow;
        }

        public final boolean isVisibleOverlay() {
            return this.isVisibleOverlay;
        }

        public final Builder runIfReachedShowCounts(InterfaceC2137a block) {
            AbstractC4154l.m8923f(block, "block");
            this.runIfReachedShowCounts = block;
            return this;
        }

        /* renamed from: setAlpha, reason: collision with other method in class */
        public final /* synthetic */ void m16574setAlpha(float f6) {
            this.alpha = f6;
        }

        public final Builder setArrowAlignAnchorPadding(@Dp int i10) {
            this.arrowAlignAnchorPadding = AbstractC0030c.m110a(i10, 1);
            return this;
        }

        /* renamed from: setArrowAlignAnchorPaddingRatio, reason: collision with other method in class */
        public final /* synthetic */ void m16576setArrowAlignAnchorPaddingRatio(float f6) {
            this.arrowAlignAnchorPaddingRatio = f6;
        }

        public final Builder setArrowAlignAnchorPaddingResource(int i10) {
            this.arrowAlignAnchorPadding = ContextExtensionKt.dimenPixel(this.context, i10);
            return this;
        }

        public final Builder setArrowBottomPadding(@Dp int i10) {
            this.arrowBottomPadding = AbstractC0030c.m110a(i10, 1);
            return this;
        }

        public final Builder setArrowBottomPaddingResource(int i10) {
            this.arrowBottomPadding = ContextExtensionKt.dimenPixel(this.context, i10);
            return this;
        }

        /* renamed from: setArrowColor, reason: collision with other method in class */
        public final /* synthetic */ void m16578setArrowColor(int i10) {
            this.arrowColor = i10;
        }

        /* renamed from: setArrowColorMatchBalloon, reason: collision with other method in class */
        public final /* synthetic */ void m16579setArrowColorMatchBalloon(boolean z6) {
            this.arrowColorMatchBalloon = z6;
        }

        public final Builder setArrowColorResource(int i10) {
            this.arrowColor = ContextExtensionKt.contextColor(this.context, i10);
            return this;
        }

        /* renamed from: setArrowDrawable, reason: collision with other method in class */
        public final /* synthetic */ void m16580setArrowDrawable(Drawable drawable) {
            this.arrowDrawable = drawable;
        }

        public final Builder setArrowDrawableResource(int i10) {
            setArrowDrawable(ContextExtensionKt.contextDrawable(this.context, i10));
            return this;
        }

        public final Builder setArrowElevation(@Dp int i10) {
            this.arrowElevation = AbstractC0030c.m110a(i10, 1);
            return this;
        }

        public final Builder setArrowElevationResource(int i10) {
            this.arrowElevation = ContextExtensionKt.dimen(this.context, i10);
            return this;
        }

        public final Builder setArrowLeftPadding(@Dp int i10) {
            this.arrowLeftPadding = AbstractC0030c.m110a(i10, 1);
            return this;
        }

        public final Builder setArrowLeftPaddingResource(int i10) {
            this.arrowLeftPadding = ContextExtensionKt.dimenPixel(this.context, i10);
            return this;
        }

        /* renamed from: setArrowOrientation, reason: collision with other method in class */
        public final /* synthetic */ void m16582setArrowOrientation(ArrowOrientation arrowOrientation) {
            AbstractC4154l.m8923f(arrowOrientation, "<set-?>");
            this.arrowOrientation = arrowOrientation;
        }

        /* renamed from: setArrowOrientationRules, reason: collision with other method in class */
        public final /* synthetic */ void m16583setArrowOrientationRules(ArrowOrientationRules arrowOrientationRules) {
            AbstractC4154l.m8923f(arrowOrientationRules, "<set-?>");
            this.arrowOrientationRules = arrowOrientationRules;
        }

        /* renamed from: setArrowPosition, reason: collision with other method in class */
        public final /* synthetic */ void m16584setArrowPosition(float f6) {
            this.arrowPosition = f6;
        }

        /* renamed from: setArrowPositionRules, reason: collision with other method in class */
        public final /* synthetic */ void m16585setArrowPositionRules(ArrowPositionRules arrowPositionRules) {
            AbstractC4154l.m8923f(arrowPositionRules, "<set-?>");
            this.arrowPositionRules = arrowPositionRules;
        }

        public final Builder setArrowRightPadding(@Dp int i10) {
            this.arrowRightPadding = AbstractC0030c.m110a(i10, 1);
            return this;
        }

        public final Builder setArrowRightPaddingResource(int i10) {
            this.arrowRightPadding = ContextExtensionKt.dimenPixel(this.context, i10);
            return this;
        }

        public final Builder setArrowSize(@Dp int i10) {
            this.arrowSize = i10 != Integer.MIN_VALUE ? AbstractC0030c.m110a(i10, 1) : Integer.MIN_VALUE;
            return this;
        }

        public final Builder setArrowSizeResource(int i10) {
            this.arrowSize = ContextExtensionKt.dimenPixel(this.context, i10);
            return this;
        }

        public final Builder setArrowTopPadding(@Dp int i10) {
            this.arrowTopPadding = AbstractC0030c.m110a(i10, 1);
            return this;
        }

        public final Builder setArrowTopPaddingResource(int i10) {
            this.arrowTopPadding = ContextExtensionKt.dimenPixel(this.context, i10);
            return this;
        }

        public final /* synthetic */ void setAttachedInDecor(boolean z6) {
            this.isAttachedInDecor = z6;
        }

        /* renamed from: setAutoDismissDuration, reason: collision with other method in class */
        public final /* synthetic */ void m16589setAutoDismissDuration(long j6) {
            this.autoDismissDuration = j6;
        }

        /* renamed from: setBackgroundColor, reason: collision with other method in class */
        public final /* synthetic */ void m16590setBackgroundColor(int i10) {
            this.backgroundColor = i10;
        }

        public final Builder setBackgroundColorResource(int i10) {
            this.backgroundColor = ContextExtensionKt.contextColor(this.context, i10);
            return this;
        }

        /* renamed from: setBackgroundDrawable, reason: collision with other method in class */
        public final /* synthetic */ void m16591setBackgroundDrawable(Drawable drawable) {
            this.backgroundDrawable = drawable;
        }

        public final Builder setBackgroundDrawableResource(int i10) {
            Drawable drawableContextDrawable = ContextExtensionKt.contextDrawable(this.context, i10);
            this.backgroundDrawable = drawableContextDrawable != null ? drawableContextDrawable.mutate() : null;
            return this;
        }

        /* renamed from: setBalloonAnimation, reason: collision with other method in class */
        public final /* synthetic */ void m16592setBalloonAnimation(BalloonAnimation balloonAnimation) {
            AbstractC4154l.m8923f(balloonAnimation, "<set-?>");
            this.balloonAnimation = balloonAnimation;
        }

        /* renamed from: setBalloonAnimationStyle, reason: collision with other method in class */
        public final /* synthetic */ void m16593setBalloonAnimationStyle(int i10) {
            this.balloonAnimationStyle = i10;
        }

        public final Builder setBalloonHighlightAnimation(BalloonHighlightAnimation value) {
            AbstractC4154l.m8923f(value, "value");
            return setBalloonHighlightAnimation$default(this, value, 0L, 2, null);
        }

        public final Builder setBalloonHighlightAnimationResource(int i10) {
            return setBalloonHighlightAnimationResource$default(this, i10, 0L, 2, null);
        }

        public final /* synthetic */ void setBalloonHighlightAnimationStartDelay(long j6) {
            this.balloonHighlightAnimationStartDelay = j6;
        }

        public final /* synthetic */ void setBalloonHighlightAnimationStyle(int i10) {
            this.balloonHighlightAnimationStyle = i10;
        }

        /* renamed from: setBalloonOverlayAnimation, reason: collision with other method in class */
        public final /* synthetic */ void m16595setBalloonOverlayAnimation(BalloonOverlayAnimation balloonOverlayAnimation) {
            AbstractC4154l.m8923f(balloonOverlayAnimation, "<set-?>");
            this.balloonOverlayAnimation = balloonOverlayAnimation;
        }

        /* renamed from: setBalloonOverlayAnimationStyle, reason: collision with other method in class */
        public final /* synthetic */ void m16596setBalloonOverlayAnimationStyle(int i10) {
            this.balloonOverlayAnimationStyle = i10;
        }

        public final /* synthetic */ void setBalloonRotateAnimation(BalloonRotateAnimation balloonRotateAnimation) {
            this.balloonRotateAnimation = balloonRotateAnimation;
        }

        public final Builder setBalloonRotationAnimation(BalloonRotateAnimation balloonRotateAnimation) {
            AbstractC4154l.m8923f(balloonRotateAnimation, "balloonRotateAnimation");
            this.balloonRotateAnimation = balloonRotateAnimation;
            return this;
        }

        /* renamed from: setCircularDuration, reason: collision with other method in class */
        public final /* synthetic */ void m16597setCircularDuration(long j6) {
            this.circularDuration = j6;
        }

        public final /* synthetic */ void setComposableContent(boolean z6) {
            this.isComposableContent = z6;
        }

        /* renamed from: setCornerRadius, reason: collision with other method in class */
        public final /* synthetic */ void m16598setCornerRadius(float f6) {
            this.cornerRadius = f6;
        }

        public final Builder setCornerRadiusResource(int i10) {
            this.cornerRadius = ContextExtensionKt.dimen(this.context, i10);
            return this;
        }

        /* renamed from: setDismissWhenClicked, reason: collision with other method in class */
        public final /* synthetic */ void m16599setDismissWhenClicked(boolean z6) {
            this.dismissWhenClicked = z6;
        }

        /* renamed from: setDismissWhenLifecycleOnPause, reason: collision with other method in class */
        public final /* synthetic */ void m16600setDismissWhenLifecycleOnPause(boolean z6) {
            this.dismissWhenLifecycleOnPause = z6;
        }

        /* renamed from: setDismissWhenOverlayClicked, reason: collision with other method in class */
        public final /* synthetic */ void m16601setDismissWhenOverlayClicked(boolean z6) {
            this.dismissWhenOverlayClicked = z6;
        }

        /* renamed from: setDismissWhenShowAgain, reason: collision with other method in class */
        public final /* synthetic */ void m16602setDismissWhenShowAgain(boolean z6) {
            this.dismissWhenShowAgain = z6;
        }

        /* renamed from: setDismissWhenTouchMargin, reason: collision with other method in class */
        public final /* synthetic */ void m16603setDismissWhenTouchMargin(boolean z6) {
            this.dismissWhenTouchMargin = z6;
        }

        /* renamed from: setDismissWhenTouchOutside, reason: collision with other method in class */
        public final /* synthetic */ void m16604setDismissWhenTouchOutside(boolean z6) {
            this.dismissWhenTouchOutside = z6;
        }

        public final Builder setElevation(@Dp int i10) {
            this.elevation = AbstractC0030c.m110a(i10, 1);
            return this;
        }

        public final Builder setElevationResource(int i10) {
            this.elevation = ContextExtensionKt.dimen(this.context, i10);
            return this;
        }

        /* renamed from: setEnableAutoSized, reason: collision with other method in class */
        public final /* synthetic */ void m16605setEnableAutoSized(boolean z6) {
            this.enableAutoSized = z6;
        }

        /* renamed from: setFocusable, reason: collision with other method in class */
        public final /* synthetic */ void m16606setFocusable(boolean z6) {
            this.isFocusable = z6;
        }

        /* renamed from: setHeight, reason: collision with other method in class */
        public final /* synthetic */ void m16607setHeight(int i10) {
            this.height = i10;
        }

        public final Builder setHeightResource(int i10) {
            this.height = ContextExtensionKt.dimenPixel(this.context, i10);
            return this;
        }

        /* renamed from: setIconColor, reason: collision with other method in class */
        public final /* synthetic */ void m16608setIconColor(int i10) {
            this.iconColor = i10;
        }

        public final Builder setIconColorResource(int i10) {
            this.iconColor = ContextExtensionKt.contextColor(this.context, i10);
            return this;
        }

        /* renamed from: setIconContentDescription, reason: collision with other method in class */
        public final /* synthetic */ void m16609setIconContentDescription(CharSequence charSequence) {
            AbstractC4154l.m8923f(charSequence, "<set-?>");
            this.iconContentDescription = charSequence;
        }

        public final Builder setIconContentDescriptionResource(int i10) {
            this.iconContentDescription = this.context.getString(i10);
            return this;
        }

        /* renamed from: setIconDrawable, reason: collision with other method in class */
        public final /* synthetic */ void m16610setIconDrawable(Drawable drawable) {
            this.iconDrawable = drawable;
        }

        public final Builder setIconDrawableResource(int i10) {
            Drawable drawableContextDrawable = ContextExtensionKt.contextDrawable(this.context, i10);
            this.iconDrawable = drawableContextDrawable != null ? drawableContextDrawable.mutate() : null;
            return this;
        }

        /* renamed from: setIconForm, reason: collision with other method in class */
        public final /* synthetic */ void m16611setIconForm(IconForm iconForm) {
            this.iconForm = iconForm;
        }

        /* renamed from: setIconGravity, reason: collision with other method in class */
        public final /* synthetic */ void m16612setIconGravity(IconGravity iconGravity) {
            AbstractC4154l.m8923f(iconGravity, "<set-?>");
            this.iconGravity = iconGravity;
        }

        public final Builder setIconHeight(@Dp int i10) {
            this.iconHeight = AbstractC0030c.m110a(i10, 1);
            return this;
        }

        public final Builder setIconHeightResource(int i10) {
            this.iconHeight = ContextExtensionKt.dimenPixel(this.context, i10);
            return this;
        }

        public final Builder setIconSize(@Dp int i10) {
            setIconWidth(i10);
            setIconHeight(i10);
            return this;
        }

        public final Builder setIconSizeResource(int i10) {
            setIconWidthResource(i10);
            setIconHeightResource(i10);
            return this;
        }

        public final Builder setIconSpace(@Dp int i10) {
            this.iconSpace = AbstractC0030c.m110a(i10, 1);
            return this;
        }

        public final Builder setIconSpaceResource(int i10) {
            this.iconSpace = ContextExtensionKt.dimenPixel(this.context, i10);
            return this;
        }

        public final Builder setIconWidth(@Dp int i10) {
            this.iconWidth = AbstractC0030c.m110a(i10, 1);
            return this;
        }

        public final Builder setIconWidthResource(int i10) {
            this.iconWidth = ContextExtensionKt.dimenPixel(this.context, i10);
            return this;
        }

        /* renamed from: setIncludeFontPadding, reason: collision with other method in class */
        public final /* synthetic */ void m16616setIncludeFontPadding(boolean z6) {
            this.includeFontPadding = z6;
        }

        public final Builder setIsAttachedInDecor(boolean z6) {
            this.isAttachedInDecor = z6;
            return this;
        }

        public final Builder setIsComposableContent(boolean z6) {
            this.isComposableContent = z6;
            return this;
        }

        public final Builder setIsStatusBarVisible(boolean z6) {
            this.isStatusBarVisible = z6;
            return this;
        }

        public final Builder setIsVisibleArrow(boolean z6) {
            this.isVisibleArrow = z6;
            return this;
        }

        public final Builder setIsVisibleOverlay(boolean z6) {
            this.isVisibleOverlay = z6;
            return this;
        }

        /* renamed from: setLayout, reason: collision with other method in class */
        public final /* synthetic */ void m16617setLayout(View view) {
            this.layout = view;
        }

        public final /* synthetic */ void setLayoutRes(Integer num) {
            this.layoutRes = num;
        }

        /* renamed from: setLifecycleObserver, reason: collision with other method in class */
        public final /* synthetic */ void m16618setLifecycleObserver(InterfaceC1648t interfaceC1648t) {
            this.lifecycleObserver = interfaceC1648t;
        }

        /* renamed from: setLifecycleOwner, reason: collision with other method in class */
        public final /* synthetic */ void m16619setLifecycleOwner(InterfaceC1649u interfaceC1649u) {
            this.lifecycleOwner = interfaceC1649u;
        }

        public final Builder setMargin(@Dp int i10) {
            setMarginLeft(i10);
            setMarginTop(i10);
            setMarginRight(i10);
            setMarginBottom(i10);
            return this;
        }

        public final Builder setMarginBottom(@Dp int i10) {
            this.marginBottom = AbstractC0030c.m110a(i10, 1);
            return this;
        }

        public final Builder setMarginBottomResource(int i10) {
            this.marginBottom = ContextExtensionKt.dimenPixel(this.context, i10);
            return this;
        }

        public final Builder setMarginHorizontal(@Dp int i10) {
            setMarginLeft(i10);
            setMarginRight(i10);
            return this;
        }

        public final Builder setMarginHorizontalResource(int i10) {
            setMarginLeftResource(i10);
            setMarginRightResource(i10);
            return this;
        }

        public final Builder setMarginLeft(@Dp int i10) {
            this.marginLeft = AbstractC0030c.m110a(i10, 1);
            return this;
        }

        public final Builder setMarginLeftResource(int i10) {
            this.marginLeft = ContextExtensionKt.dimenPixel(this.context, i10);
            return this;
        }

        public final Builder setMarginResource(int i10) {
            int iDimenPixel = ContextExtensionKt.dimenPixel(this.context, i10);
            this.marginLeft = iDimenPixel;
            this.marginTop = iDimenPixel;
            this.marginRight = iDimenPixel;
            this.marginBottom = iDimenPixel;
            return this;
        }

        public final Builder setMarginRight(@Dp int i10) {
            this.marginRight = AbstractC0030c.m110a(i10, 1);
            return this;
        }

        public final Builder setMarginRightResource(int i10) {
            this.marginRight = ContextExtensionKt.dimenPixel(this.context, i10);
            return this;
        }

        public final Builder setMarginTop(@Dp int i10) {
            this.marginTop = AbstractC0030c.m110a(i10, 1);
            return this;
        }

        public final Builder setMarginTopResource(int i10) {
            this.marginTop = ContextExtensionKt.dimenPixel(this.context, i10);
            return this;
        }

        public final Builder setMarginVertical(@Dp int i10) {
            setMarginTop(i10);
            setMarginBottom(i10);
            return this;
        }

        public final Builder setMarginVerticalResource(int i10) {
            setMarginTopResource(i10);
            setMarginBottomResource(i10);
            return this;
        }

        /* renamed from: setMaxAutoSizeTextSize, reason: collision with other method in class */
        public final /* synthetic */ void m16624setMaxAutoSizeTextSize(float f6) {
            this.maxAutoSizeTextSize = f6;
        }

        public final Builder setMaxWidth(@Dp int i10) {
            this.maxWidth = AbstractC0030c.m110a(i10, 1);
            return this;
        }

        /* renamed from: setMaxWidthRatio, reason: collision with other method in class */
        public final /* synthetic */ void m16626setMaxWidthRatio(float f6) {
            this.maxWidthRatio = f6;
        }

        public final Builder setMaxWidthResource(int i10) {
            this.maxWidth = ContextExtensionKt.dimenPixel(this.context, i10);
            return this;
        }

        /* renamed from: setMeasuredWidth, reason: collision with other method in class */
        public final /* synthetic */ void m16627setMeasuredWidth(int i10) {
            this.measuredWidth = i10;
        }

        /* renamed from: setMinAutoSizeTextSize, reason: collision with other method in class */
        public final /* synthetic */ void m16628setMinAutoSizeTextSize(float f6) {
            this.minAutoSizeTextSize = f6;
        }

        public final Builder setMinWidth(@Dp int i10) {
            this.minWidth = AbstractC0030c.m110a(i10, 1);
            return this;
        }

        /* renamed from: setMinWidthRatio, reason: collision with other method in class */
        public final /* synthetic */ void m16630setMinWidthRatio(float f6) {
            this.minWidthRatio = f6;
        }

        public final Builder setMinWidthResource(int i10) {
            this.minWidth = ContextExtensionKt.dimenPixel(this.context, i10);
            return this;
        }

        /* renamed from: setMovementMethod, reason: collision with other method in class */
        public final /* synthetic */ void m16631setMovementMethod(MovementMethod movementMethod) {
            this.movementMethod = movementMethod;
        }

        /* renamed from: setOnBalloonClickListener, reason: collision with other method in class */
        public final /* synthetic */ void m16632setOnBalloonClickListener(OnBalloonClickListener onBalloonClickListener) {
            this.onBalloonClickListener = onBalloonClickListener;
        }

        /* renamed from: setOnBalloonDismissListener, reason: collision with other method in class */
        public final /* synthetic */ void m16633setOnBalloonDismissListener(OnBalloonDismissListener onBalloonDismissListener) {
            this.onBalloonDismissListener = onBalloonDismissListener;
        }

        /* renamed from: setOnBalloonInitializedListener, reason: collision with other method in class */
        public final /* synthetic */ void m16634setOnBalloonInitializedListener(OnBalloonInitializedListener onBalloonInitializedListener) {
            this.onBalloonInitializedListener = onBalloonInitializedListener;
        }

        /* renamed from: setOnBalloonOutsideTouchListener, reason: collision with other method in class */
        public final /* synthetic */ void m16635setOnBalloonOutsideTouchListener(OnBalloonOutsideTouchListener onBalloonOutsideTouchListener) {
            this.onBalloonOutsideTouchListener = onBalloonOutsideTouchListener;
        }

        /* renamed from: setOnBalloonOverlayClickListener, reason: collision with other method in class */
        public final /* synthetic */ void m16636setOnBalloonOverlayClickListener(OnBalloonOverlayClickListener onBalloonOverlayClickListener) {
            this.onBalloonOverlayClickListener = onBalloonOverlayClickListener;
        }

        /* renamed from: setOnBalloonOverlayTouchListener, reason: collision with other method in class */
        public final /* synthetic */ void m16637setOnBalloonOverlayTouchListener(View.OnTouchListener onTouchListener) {
            this.onBalloonOverlayTouchListener = onTouchListener;
        }

        /* renamed from: setOnBalloonTouchListener, reason: collision with other method in class */
        public final /* synthetic */ void m16638setOnBalloonTouchListener(View.OnTouchListener onTouchListener) {
            this.onBalloonTouchListener = onTouchListener;
        }

        /* renamed from: setOverlayColor, reason: collision with other method in class */
        public final /* synthetic */ void m16639setOverlayColor(int i10) {
            this.overlayColor = i10;
        }

        public final Builder setOverlayColorResource(int i10) {
            this.overlayColor = ContextExtensionKt.contextColor(this.context, i10);
            return this;
        }

        /* renamed from: setOverlayGravity, reason: collision with other method in class */
        public final /* synthetic */ void m16640setOverlayGravity(int i10) {
            this.overlayGravity = i10;
        }

        /* renamed from: setOverlayPadding, reason: collision with other method in class */
        public final /* synthetic */ void m16641setOverlayPadding(float f6) {
            this.overlayPadding = f6;
        }

        /* renamed from: setOverlayPaddingColor, reason: collision with other method in class */
        public final /* synthetic */ void m16642setOverlayPaddingColor(int i10) {
            this.overlayPaddingColor = i10;
        }

        public final Builder setOverlayPaddingColorResource(int i10) {
            this.overlayPaddingColor = ContextExtensionKt.contextColor(this.context, i10);
            return this;
        }

        public final Builder setOverlayPaddingResource(int i10) {
            this.overlayPadding = ContextExtensionKt.dimen(this.context, i10);
            return this;
        }

        /* renamed from: setOverlayPaddingShader, reason: collision with other method in class */
        public final /* synthetic */ void m16643setOverlayPaddingShader(Shader shader) {
            this.overlayPaddingShader = shader;
        }

        /* renamed from: setOverlayPosition, reason: collision with other method in class */
        public final /* synthetic */ void m16644setOverlayPosition(Point point) {
            this.overlayPosition = point;
        }

        /* renamed from: setOverlayShape, reason: collision with other method in class */
        public final /* synthetic */ void m16645setOverlayShape(BalloonOverlayShape balloonOverlayShape) {
            AbstractC4154l.m8923f(balloonOverlayShape, "<set-?>");
            this.overlayShape = balloonOverlayShape;
        }

        public final Builder setPadding(@Dp int i10) {
            setPaddingLeft(i10);
            setPaddingTop(i10);
            setPaddingRight(i10);
            setPaddingBottom(i10);
            return this;
        }

        public final Builder setPaddingBottom(@Dp int i10) {
            this.paddingBottom = AbstractC0030c.m110a(i10, 1);
            return this;
        }

        public final Builder setPaddingBottomResource(int i10) {
            this.paddingBottom = ContextExtensionKt.dimenPixel(this.context, i10);
            return this;
        }

        public final Builder setPaddingHorizontal(@Dp int i10) {
            setPaddingLeft(i10);
            setPaddingRight(i10);
            return this;
        }

        public final Builder setPaddingHorizontalResource(int i10) {
            setPaddingLeftResource(i10);
            setPaddingRightResource(i10);
            return this;
        }

        public final Builder setPaddingLeft(@Dp int i10) {
            this.paddingLeft = AbstractC0030c.m110a(i10, 1);
            return this;
        }

        public final Builder setPaddingLeftResource(int i10) {
            this.paddingLeft = ContextExtensionKt.dimenPixel(this.context, i10);
            return this;
        }

        public final Builder setPaddingResource(int i10) {
            int iDimenPixel = ContextExtensionKt.dimenPixel(this.context, i10);
            this.paddingLeft = iDimenPixel;
            this.paddingTop = iDimenPixel;
            this.paddingRight = iDimenPixel;
            this.paddingBottom = iDimenPixel;
            return this;
        }

        public final Builder setPaddingRight(@Dp int i10) {
            this.paddingRight = AbstractC0030c.m110a(i10, 1);
            return this;
        }

        public final Builder setPaddingRightResource(int i10) {
            this.paddingRight = ContextExtensionKt.dimenPixel(this.context, i10);
            return this;
        }

        public final Builder setPaddingTop(@Dp int i10) {
            this.paddingTop = AbstractC0030c.m110a(i10, 1);
            return this;
        }

        public final Builder setPaddingTopResource(int i10) {
            this.paddingTop = ContextExtensionKt.dimenPixel(this.context, i10);
            return this;
        }

        public final Builder setPaddingVertical(@Dp int i10) {
            setPaddingTop(i10);
            setPaddingBottom(i10);
            return this;
        }

        public final Builder setPaddingVerticalResource(int i10) {
            setPaddingTopResource(i10);
            setPaddingBottomResource(i10);
            return this;
        }

        public final /* synthetic */ void setPassTouchEventToAnchor(boolean z6) {
            this.passTouchEventToAnchor = z6;
        }

        /* renamed from: setPreferenceName, reason: collision with other method in class */
        public final /* synthetic */ void m16650setPreferenceName(String str) {
            this.preferenceName = str;
        }

        public final /* synthetic */ void setRtlLayout(boolean z6) {
            this.isRtlLayout = z6;
        }

        public final Builder setRtlSupports(boolean z6) {
            this.isRtlLayout = z6;
            return this;
        }

        public final /* synthetic */ void setRunIfReachedShowCounts(InterfaceC2137a interfaceC2137a) {
            this.runIfReachedShowCounts = interfaceC2137a;
        }

        public final Builder setShouldPassTouchEventToAnchor(boolean z6) {
            this.passTouchEventToAnchor = z6;
            return this;
        }

        public final Builder setShowCounts(int i10) {
            this.showTimes = i10;
            return this;
        }

        public final /* synthetic */ void setShowTimes(int i10) {
            this.showTimes = i10;
        }

        public final Builder setSize(@Dp int i10, @Dp int i11) {
            setWidth(i10);
            setHeight(i11);
            return this;
        }

        public final Builder setSizeResource(int i10, int i11) {
            setWidthResource(i10);
            setHeightResource(i11);
            return this;
        }

        public final /* synthetic */ void setStatusBarVisible(boolean z6) {
            this.isStatusBarVisible = z6;
        }

        public final /* synthetic */ void setSupportRtlLayoutFactor(int i10) {
            this.supportRtlLayoutFactor = i10;
        }

        /* renamed from: setText, reason: collision with other method in class */
        public final /* synthetic */ void m16651setText(CharSequence charSequence) {
            AbstractC4154l.m8923f(charSequence, "<set-?>");
            this.text = charSequence;
        }

        /* renamed from: setTextColor, reason: collision with other method in class */
        public final /* synthetic */ void m16652setTextColor(int i10) {
            this.textColor = i10;
        }

        public final Builder setTextColorResource(int i10) {
            this.textColor = ContextExtensionKt.contextColor(this.context, i10);
            return this;
        }

        /* renamed from: setTextForm, reason: collision with other method in class */
        public final /* synthetic */ void m16653setTextForm(TextForm textForm) {
            this.textForm = textForm;
        }

        /* renamed from: setTextGravity, reason: collision with other method in class */
        public final /* synthetic */ void m16654setTextGravity(int i10) {
            this.textGravity = i10;
        }

        /* renamed from: setTextIsHtml, reason: collision with other method in class */
        public final /* synthetic */ void m16655setTextIsHtml(boolean z6) {
            this.textIsHtml = z6;
        }

        public final /* synthetic */ void setTextLetterSpacing(Float f6) {
            this.textLetterSpacing = f6;
        }

        public final Builder setTextLetterSpacingResource(int i10) {
            this.textLetterSpacing = Float.valueOf(ContextExtensionKt.dimen(this.context, i10));
            return this;
        }

        public final /* synthetic */ void setTextLineSpacing(Float f6) {
            this.textLineSpacing = f6;
        }

        public final Builder setTextLineSpacingResource(int i10) {
            this.textLineSpacing = Float.valueOf(ContextExtensionKt.dimen(this.context, i10));
            return this;
        }

        public final Builder setTextResource(int i10) {
            this.text = this.context.getString(i10);
            return this;
        }

        /* renamed from: setTextSize, reason: collision with other method in class */
        public final /* synthetic */ void m16656setTextSize(float f6) {
            this.textSize = f6;
        }

        public final Builder setTextSizeResource(int i10) {
            Context context = this.context;
            this.textSize = ContextExtensionKt.px2Sp(context, ContextExtensionKt.dimen(context, i10));
            return this;
        }

        /* renamed from: setTextTypeface, reason: collision with other method in class */
        public final /* synthetic */ void m16657setTextTypeface(int i10) {
            this.textTypeface = i10;
        }

        public final /* synthetic */ void setTextTypefaceObject(Typeface typeface) {
            this.textTypefaceObject = typeface;
        }

        public final /* synthetic */ void setVisibleArrow(boolean z6) {
            this.isVisibleArrow = z6;
        }

        public final /* synthetic */ void setVisibleOverlay(boolean z6) {
            this.isVisibleOverlay = z6;
        }

        /* renamed from: setWidth, reason: collision with other method in class */
        public final /* synthetic */ void m16658setWidth(int i10) {
            this.width = i10;
        }

        /* renamed from: setWidthRatio, reason: collision with other method in class */
        public final /* synthetic */ void m16659setWidthRatio(float f6) {
            this.widthRatio = f6;
        }

        public final Builder setWidthResource(int i10) {
            this.width = ContextExtensionKt.dimenPixel(this.context, i10);
            return this;
        }

        public final Builder runIfReachedShowCounts(Runnable runnable) {
            AbstractC4154l.m8923f(runnable, "runnable");
            runIfReachedShowCounts(new C1428e(runnable, 0));
            return this;
        }

        public final Builder setAlpha(float f6) {
            this.alpha = f6;
            return this;
        }

        public final Builder setArrowAlignAnchorPaddingRatio(float f6) {
            this.arrowAlignAnchorPaddingRatio = f6;
            return this;
        }

        public final Builder setArrowColor(int i10) {
            this.arrowColor = i10;
            return this;
        }

        public final Builder setArrowColorMatchBalloon(boolean z6) {
            this.arrowColorMatchBalloon = z6;
            return this;
        }

        public final Builder setArrowDrawable(Drawable drawable) {
            this.arrowDrawable = drawable != null ? drawable.mutate() : null;
            if (drawable != null && this.arrowSize == Integer.MIN_VALUE) {
                this.arrowSize = Math.max(drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight());
            }
            return this;
        }

        public final Builder setArrowOrientation(ArrowOrientation value) {
            AbstractC4154l.m8923f(value, "value");
            this.arrowOrientation = value;
            return this;
        }

        public final Builder setArrowOrientationRules(ArrowOrientationRules value) {
            AbstractC4154l.m8923f(value, "value");
            this.arrowOrientationRules = value;
            return this;
        }

        public final Builder setArrowPosition(float f6) {
            this.arrowPosition = f6;
            return this;
        }

        public final Builder setArrowPositionRules(ArrowPositionRules value) {
            AbstractC4154l.m8923f(value, "value");
            this.arrowPositionRules = value;
            return this;
        }

        public final Builder setAutoDismissDuration(long j6) {
            this.autoDismissDuration = j6;
            return this;
        }

        public final Builder setBackgroundColor(int i10) {
            this.backgroundColor = i10;
            return this;
        }

        public final Builder setBackgroundDrawable(Drawable drawable) {
            this.backgroundDrawable = drawable != null ? drawable.mutate() : null;
            return this;
        }

        public final Builder setBalloonAnimation(BalloonAnimation value) {
            AbstractC4154l.m8923f(value, "value");
            this.balloonAnimation = value;
            if (value == BalloonAnimation.CIRCULAR) {
                setFocusable(false);
            }
            return this;
        }

        public final Builder setBalloonAnimationStyle(int i10) {
            this.balloonAnimationStyle = i10;
            return this;
        }

        /* renamed from: setBalloonHighlightAnimation, reason: collision with other method in class */
        public final /* synthetic */ void m16594setBalloonHighlightAnimation(BalloonHighlightAnimation balloonHighlightAnimation) {
            AbstractC4154l.m8923f(balloonHighlightAnimation, "<set-?>");
            this.balloonHighlightAnimation = balloonHighlightAnimation;
        }

        public final Builder setBalloonHighlightAnimationResource(int i10, long j6) {
            this.balloonHighlightAnimationStyle = i10;
            this.balloonHighlightAnimationStartDelay = j6;
            return this;
        }

        public final Builder setBalloonOverlayAnimation(BalloonOverlayAnimation value) {
            AbstractC4154l.m8923f(value, "value");
            this.balloonOverlayAnimation = value;
            return this;
        }

        public final Builder setBalloonOverlayAnimationStyle(int i10) {
            this.balloonOverlayAnimationStyle = i10;
            return this;
        }

        public final Builder setCircularDuration(long j6) {
            this.circularDuration = j6;
            return this;
        }

        public final Builder setCornerRadius(@Dp float f6) {
            this.cornerRadius = TypedValue.applyDimension(1, f6, Resources.getSystem().getDisplayMetrics());
            return this;
        }

        public final Builder setDismissWhenClicked(boolean z6) {
            this.dismissWhenClicked = z6;
            return this;
        }

        public final Builder setDismissWhenLifecycleOnPause(boolean z6) {
            this.dismissWhenLifecycleOnPause = z6;
            return this;
        }

        public final Builder setDismissWhenOverlayClicked(boolean z6) {
            this.dismissWhenOverlayClicked = z6;
            return this;
        }

        public final Builder setDismissWhenShowAgain(boolean z6) {
            this.dismissWhenShowAgain = z6;
            return this;
        }

        public final Builder setDismissWhenTouchMargin(boolean z6) {
            this.dismissWhenTouchMargin = z6;
            return this;
        }

        public final Builder setDismissWhenTouchOutside(boolean z6) {
            this.dismissWhenTouchOutside = z6;
            if (!z6) {
                setFocusable(z6);
            }
            return this;
        }

        public final Builder setEnableAutoSized(boolean z6) {
            this.enableAutoSized = z6;
            return this;
        }

        public final Builder setFocusable(boolean z6) {
            this.isFocusable = z6;
            return this;
        }

        public final Builder setHeight(@Dp int i10) {
            if (i10 <= 0 && i10 != Integer.MIN_VALUE) {
                throw new IllegalArgumentException("The height of the balloon must bigger than zero.");
            }
            this.height = AbstractC0030c.m110a(i10, 1);
            return this;
        }

        public final Builder setIconColor(int i10) {
            this.iconColor = i10;
            return this;
        }

        public final Builder setIconContentDescription(CharSequence value) {
            AbstractC4154l.m8923f(value, "value");
            this.iconContentDescription = value;
            return this;
        }

        public final Builder setIconDrawable(Drawable drawable) {
            this.iconDrawable = drawable != null ? drawable.mutate() : null;
            return this;
        }

        public final Builder setIconForm(IconForm value) {
            AbstractC4154l.m8923f(value, "value");
            this.iconForm = value;
            return this;
        }

        public final Builder setIconGravity(IconGravity value) {
            AbstractC4154l.m8923f(value, "value");
            this.iconGravity = value;
            return this;
        }

        public final Builder setIncludeFontPadding(boolean z6) {
            this.includeFontPadding = z6;
            return this;
        }

        public final Builder setLayout(int i10) {
            this.layoutRes = Integer.valueOf(i10);
            return this;
        }

        public final Builder setLifecycleObserver(InterfaceC1648t value) {
            AbstractC4154l.m8923f(value, "value");
            this.lifecycleObserver = value;
            return this;
        }

        public final Builder setLifecycleOwner(InterfaceC1649u interfaceC1649u) {
            this.lifecycleOwner = interfaceC1649u;
            return this;
        }

        public final Builder setMaxAutoSizeTextSize(@Sp float f6) {
            this.maxAutoSizeTextSize = f6;
            return this;
        }

        public final Builder setMaxWidthRatio(float f6) {
            this.maxWidthRatio = f6;
            return this;
        }

        public final Builder setMeasuredWidth(int i10) {
            if (i10 <= 0 && i10 != Integer.MIN_VALUE) {
                throw new IllegalArgumentException("The width of the balloon must bigger than zero.");
            }
            this.measuredWidth = i10;
            return this;
        }

        public final Builder setMinAutoSizeTextSize(@Sp float f6) {
            this.minAutoSizeTextSize = f6;
            return this;
        }

        public final Builder setMinWidthRatio(float f6) {
            this.minWidthRatio = f6;
            return this;
        }

        public final Builder setMovementMethod(MovementMethod value) {
            AbstractC4154l.m8923f(value, "value");
            this.movementMethod = value;
            return this;
        }

        public final Builder setOnBalloonClickListener(OnBalloonClickListener value) {
            AbstractC4154l.m8923f(value, "value");
            this.onBalloonClickListener = value;
            return this;
        }

        public final Builder setOnBalloonDismissListener(OnBalloonDismissListener value) {
            AbstractC4154l.m8923f(value, "value");
            this.onBalloonDismissListener = value;
            return this;
        }

        public final Builder setOnBalloonInitializedListener(OnBalloonInitializedListener value) {
            AbstractC4154l.m8923f(value, "value");
            this.onBalloonInitializedListener = value;
            return this;
        }

        public final Builder setOnBalloonOutsideTouchListener(OnBalloonOutsideTouchListener value) {
            AbstractC4154l.m8923f(value, "value");
            this.onBalloonOutsideTouchListener = value;
            return this;
        }

        public final Builder setOnBalloonOverlayClickListener(OnBalloonOverlayClickListener value) {
            AbstractC4154l.m8923f(value, "value");
            this.onBalloonOverlayClickListener = value;
            return this;
        }

        public final Builder setOnBalloonOverlayTouchListener(View.OnTouchListener value) {
            AbstractC4154l.m8923f(value, "value");
            this.onBalloonOverlayTouchListener = value;
            setDismissWhenOverlayClicked(false);
            return this;
        }

        public final Builder setOnBalloonTouchListener(View.OnTouchListener value) {
            AbstractC4154l.m8923f(value, "value");
            this.onBalloonTouchListener = value;
            return this;
        }

        public final Builder setOverlayColor(int i10) {
            this.overlayColor = i10;
            return this;
        }

        public final Builder setOverlayGravity(int i10) {
            this.overlayGravity = i10;
            return this;
        }

        public final Builder setOverlayPadding(@Dp float f6) {
            this.overlayPadding = TypedValue.applyDimension(1, f6, Resources.getSystem().getDisplayMetrics());
            return this;
        }

        public final Builder setOverlayPaddingColor(int i10) {
            this.overlayPaddingColor = i10;
            return this;
        }

        public final Builder setOverlayPaddingShader(Shader shader) {
            AbstractC4154l.m8923f(shader, "shader");
            this.overlayPaddingShader = shader;
            return this;
        }

        public final Builder setOverlayPosition(Point value) {
            AbstractC4154l.m8923f(value, "value");
            this.overlayPosition = value;
            return this;
        }

        public final Builder setOverlayShape(BalloonOverlayShape value) {
            AbstractC4154l.m8923f(value, "value");
            this.overlayShape = value;
            return this;
        }

        public final Builder setPreferenceName(String value) {
            AbstractC4154l.m8923f(value, "value");
            this.preferenceName = value;
            return this;
        }

        public final Builder setText(CharSequence value) {
            AbstractC4154l.m8923f(value, "value");
            this.text = value;
            return this;
        }

        public final Builder setTextColor(int i10) {
            this.textColor = i10;
            return this;
        }

        public final Builder setTextForm(TextForm value) {
            AbstractC4154l.m8923f(value, "value");
            this.textForm = value;
            return this;
        }

        public final Builder setTextGravity(int i10) {
            this.textGravity = i10;
            return this;
        }

        public final Builder setTextIsHtml(boolean z6) {
            this.textIsHtml = z6;
            return this;
        }

        public final Builder setTextLetterSpacing(@Dp float f6) {
            this.textLetterSpacing = Float.valueOf(f6);
            return this;
        }

        public final Builder setTextLineSpacing(@Dp float f6) {
            this.textLineSpacing = Float.valueOf(f6);
            return this;
        }

        public final Builder setTextSize(@Sp float f6) {
            this.textSize = f6;
            return this;
        }

        public final Builder setTextTypeface(int i10) {
            this.textTypeface = i10;
            return this;
        }

        public final Builder setWidth(@Dp int i10) {
            if (i10 <= 0 && i10 != Integer.MIN_VALUE) {
                throw new IllegalArgumentException("The width of the balloon must bigger than zero.");
            }
            this.width = AbstractC0030c.m110a(i10, 1);
            return this;
        }

        public final Builder setWidthRatio(float f6) {
            this.widthRatio = f6;
            return this;
        }

        public final Builder setBalloonHighlightAnimation(BalloonHighlightAnimation value, long j6) {
            AbstractC4154l.m8923f(value, "value");
            this.balloonHighlightAnimation = value;
            this.balloonHighlightAnimationStartDelay = j6;
            return this;
        }

        public final Builder setLayout(View layout) {
            AbstractC4154l.m8923f(layout, "layout");
            this.layout = layout;
            return this;
        }

        public final /* synthetic */ Builder setOnBalloonClickListener(InterfaceC2139c block) {
            AbstractC4154l.m8923f(block, "block");
            this.onBalloonClickListener = new BalloonKt$sam$com_skydoves_balloon_OnBalloonClickListener$0(block);
            return this;
        }

        public final /* synthetic */ Builder setOnBalloonDismissListener(InterfaceC2137a block) {
            AbstractC4154l.m8923f(block, "block");
            this.onBalloonDismissListener = new BalloonKt$sam$com_skydoves_balloon_OnBalloonDismissListener$0(block);
            return this;
        }

        public final /* synthetic */ Builder setOnBalloonInitializedListener(InterfaceC2139c block) {
            AbstractC4154l.m8923f(block, "block");
            this.onBalloonInitializedListener = new C1410x4924968c(block);
            return this;
        }

        public final /* synthetic */ Builder setOnBalloonOutsideTouchListener(InterfaceC2141e block) {
            AbstractC4154l.m8923f(block, "block");
            this.onBalloonOutsideTouchListener = new C1411x89c13322(block);
            setDismissWhenTouchOutside(false);
            return this;
        }

        public final Builder setOnBalloonOverlayClickListener(InterfaceC2137a block) {
            AbstractC4154l.m8923f(block, "block");
            this.onBalloonOverlayClickListener = new C1412x24aff820(block);
            return this;
        }

        public final Builder setTextTypeface(Typeface value) {
            AbstractC4154l.m8923f(value, "value");
            this.textTypefaceObject = value;
            return this;
        }

        public final <T extends InterfaceC6771a> Builder setLayout(T binding) {
            AbstractC4154l.m8923f(binding, "binding");
            this.layout = binding.getRoot();
            return this;
        }

        /* renamed from: setArrowAlignAnchorPadding, reason: collision with other method in class */
        public final /* synthetic */ void m16575setArrowAlignAnchorPadding(int i10) {
            this.arrowAlignAnchorPadding = i10;
        }

        /* renamed from: setArrowBottomPadding, reason: collision with other method in class */
        public final /* synthetic */ void m16577setArrowBottomPadding(int i10) {
            this.arrowBottomPadding = i10;
        }

        public final /* synthetic */ void setArrowElevation(float f6) {
            this.arrowElevation = f6;
        }

        /* renamed from: setArrowLeftPadding, reason: collision with other method in class */
        public final /* synthetic */ void m16581setArrowLeftPadding(int i10) {
            this.arrowLeftPadding = i10;
        }

        /* renamed from: setArrowRightPadding, reason: collision with other method in class */
        public final /* synthetic */ void m16586setArrowRightPadding(int i10) {
            this.arrowRightPadding = i10;
        }

        /* renamed from: setArrowSize, reason: collision with other method in class */
        public final /* synthetic */ void m16587setArrowSize(int i10) {
            this.arrowSize = i10;
        }

        /* renamed from: setArrowTopPadding, reason: collision with other method in class */
        public final /* synthetic */ void m16588setArrowTopPadding(int i10) {
            this.arrowTopPadding = i10;
        }

        public final /* synthetic */ void setElevation(float f6) {
            this.elevation = f6;
        }

        /* renamed from: setIconHeight, reason: collision with other method in class */
        public final /* synthetic */ void m16613setIconHeight(int i10) {
            this.iconHeight = i10;
        }

        /* renamed from: setIconSpace, reason: collision with other method in class */
        public final /* synthetic */ void m16614setIconSpace(int i10) {
            this.iconSpace = i10;
        }

        /* renamed from: setIconWidth, reason: collision with other method in class */
        public final /* synthetic */ void m16615setIconWidth(int i10) {
            this.iconWidth = i10;
        }

        /* renamed from: setMarginBottom, reason: collision with other method in class */
        public final /* synthetic */ void m16620setMarginBottom(int i10) {
            this.marginBottom = i10;
        }

        /* renamed from: setMarginLeft, reason: collision with other method in class */
        public final /* synthetic */ void m16621setMarginLeft(int i10) {
            this.marginLeft = i10;
        }

        /* renamed from: setMarginRight, reason: collision with other method in class */
        public final /* synthetic */ void m16622setMarginRight(int i10) {
            this.marginRight = i10;
        }

        /* renamed from: setMarginTop, reason: collision with other method in class */
        public final /* synthetic */ void m16623setMarginTop(int i10) {
            this.marginTop = i10;
        }

        /* renamed from: setMaxWidth, reason: collision with other method in class */
        public final /* synthetic */ void m16625setMaxWidth(int i10) {
            this.maxWidth = i10;
        }

        /* renamed from: setMinWidth, reason: collision with other method in class */
        public final /* synthetic */ void m16629setMinWidth(int i10) {
            this.minWidth = i10;
        }

        /* renamed from: setPaddingBottom, reason: collision with other method in class */
        public final /* synthetic */ void m16646setPaddingBottom(int i10) {
            this.paddingBottom = i10;
        }

        /* renamed from: setPaddingLeft, reason: collision with other method in class */
        public final /* synthetic */ void m16647setPaddingLeft(int i10) {
            this.paddingLeft = i10;
        }

        /* renamed from: setPaddingRight, reason: collision with other method in class */
        public final /* synthetic */ void m16648setPaddingRight(int i10) {
            this.paddingRight = i10;
        }

        /* renamed from: setPaddingTop, reason: collision with other method in class */
        public final /* synthetic */ void m16649setPaddingTop(int i10) {
            this.paddingTop = i10;
        }
    }

    /* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
    @InternalBalloonApi
    public static final class Companion {
        public /* synthetic */ Companion(AbstractC4148f abstractC4148f) {
            this();
        }

        private final InterfaceC7266z getScope() {
            return (InterfaceC7266z) Balloon.scope$delegate.getValue();
        }

        public final InterfaceC7810l getChannel() {
            return (InterfaceC7810l) Balloon.channel$delegate.getValue();
        }

        public final void initConsumerIfNeeded() {
            if (Balloon.isConsumerActive) {
                return;
            }
            Balloon.isConsumerActive = true;
            c0.m13502y(getScope(), null, null, new Balloon$Companion$initConsumerIfNeeded$1(null), 3);
        }

        private Companion() {
        }
    }

    /* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
    public static abstract class Factory {
        public abstract Balloon create(Context context, InterfaceC1649u interfaceC1649u);
    }

    /* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;
        public static final /* synthetic */ int[] $EnumSwitchMapping$2;
        public static final /* synthetic */ int[] $EnumSwitchMapping$3;
        public static final /* synthetic */ int[] $EnumSwitchMapping$4;
        public static final /* synthetic */ int[] $EnumSwitchMapping$5;
        public static final /* synthetic */ int[] $EnumSwitchMapping$6;
        public static final /* synthetic */ int[] $EnumSwitchMapping$7;

        static {
            int[] iArr = new int[ArrowOrientation.values().length];
            try {
                iArr[ArrowOrientation.BOTTOM.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ArrowOrientation.TOP.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ArrowOrientation.START.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[ArrowOrientation.END.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[ArrowPositionRules.values().length];
            try {
                iArr2[ArrowPositionRules.ALIGN_BALLOON.ordinal()] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[ArrowPositionRules.ALIGN_ANCHOR.ordinal()] = 2;
            } catch (NoSuchFieldError unused6) {
            }
            $EnumSwitchMapping$1 = iArr2;
            int[] iArr3 = new int[BalloonAnimation.values().length];
            try {
                iArr3[BalloonAnimation.ELASTIC.ordinal()] = 1;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr3[BalloonAnimation.CIRCULAR.ordinal()] = 2;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr3[BalloonAnimation.FADE.ordinal()] = 3;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr3[BalloonAnimation.OVERSHOOT.ordinal()] = 4;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr3[BalloonAnimation.NONE.ordinal()] = 5;
            } catch (NoSuchFieldError unused11) {
            }
            $EnumSwitchMapping$2 = iArr3;
            int[] iArr4 = new int[BalloonOverlayAnimation.values().length];
            try {
                iArr4[BalloonOverlayAnimation.FADE.ordinal()] = 1;
            } catch (NoSuchFieldError unused12) {
            }
            $EnumSwitchMapping$3 = iArr4;
            int[] iArr5 = new int[BalloonHighlightAnimation.values().length];
            try {
                iArr5[BalloonHighlightAnimation.HEARTBEAT.ordinal()] = 1;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                iArr5[BalloonHighlightAnimation.SHAKE.ordinal()] = 2;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                iArr5[BalloonHighlightAnimation.BREATH.ordinal()] = 3;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                iArr5[BalloonHighlightAnimation.ROTATE.ordinal()] = 4;
            } catch (NoSuchFieldError unused16) {
            }
            $EnumSwitchMapping$4 = iArr5;
            int[] iArr6 = new int[PlacementType.values().length];
            try {
                iArr6[PlacementType.DROPDOWN.ordinal()] = 1;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                iArr6[PlacementType.ALIGNMENT.ordinal()] = 2;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                iArr6[PlacementType.CENTER.ordinal()] = 3;
            } catch (NoSuchFieldError unused19) {
            }
            $EnumSwitchMapping$5 = iArr6;
            int[] iArr7 = new int[BalloonAlign.values().length];
            try {
                iArr7[BalloonAlign.TOP.ordinal()] = 1;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                iArr7[BalloonAlign.BOTTOM.ordinal()] = 2;
            } catch (NoSuchFieldError unused21) {
            }
            try {
                iArr7[BalloonAlign.START.ordinal()] = 3;
            } catch (NoSuchFieldError unused22) {
            }
            try {
                iArr7[BalloonAlign.END.ordinal()] = 4;
            } catch (NoSuchFieldError unused23) {
            }
            $EnumSwitchMapping$6 = iArr7;
            int[] iArr8 = new int[BalloonCenterAlign.values().length];
            try {
                iArr8[BalloonCenterAlign.TOP.ordinal()] = 1;
            } catch (NoSuchFieldError unused24) {
            }
            try {
                iArr8[BalloonCenterAlign.BOTTOM.ordinal()] = 2;
            } catch (NoSuchFieldError unused25) {
            }
            try {
                iArr8[BalloonCenterAlign.START.ordinal()] = 3;
            } catch (NoSuchFieldError unused26) {
            }
            try {
                iArr8[BalloonCenterAlign.END.ordinal()] = 4;
            } catch (NoSuchFieldError unused27) {
            }
            $EnumSwitchMapping$7 = iArr8;
        }
    }

    public /* synthetic */ Balloon(Context context, Builder builder, AbstractC4148f abstractC4148f) {
        this(context, builder);
    }

    private final Bitmap adjustArrowColorByMatchingCardBackground(ImageView imageView, float f6, float f10) {
        LinearGradient linearGradient;
        int backgroundColor = this.builder.getBackgroundColor();
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        imageView.setColorFilter(backgroundColor, mode);
        Drawable drawable = imageView.getDrawable();
        AbstractC4154l.m8922e(drawable, "getDrawable(...)");
        Bitmap bitmapDrawableToBitmap = drawableToBitmap(drawable, imageView.getDrawable().getIntrinsicWidth(), imageView.getDrawable().getIntrinsicHeight());
        try {
            C6361k colorsFromBalloonCard = getColorsFromBalloonCard(f6, f10);
            int iIntValue = ((Number) colorsFromBalloonCard.f30755a).intValue();
            int iIntValue2 = ((Number) colorsFromBalloonCard.f30756b).intValue();
            Bitmap bitmapCreateBitmap = Bitmap.createBitmap(bitmapDrawableToBitmap.getWidth(), bitmapDrawableToBitmap.getHeight(), Bitmap.Config.ARGB_8888);
            AbstractC4154l.m8922e(bitmapCreateBitmap, "createBitmap(...)");
            Canvas canvas = new Canvas(bitmapCreateBitmap);
            canvas.drawBitmap(bitmapDrawableToBitmap, DefinitionKt.NO_Float_VALUE, DefinitionKt.NO_Float_VALUE, (Paint) null);
            Paint paint = new Paint();
            int i10 = WhenMappings.$EnumSwitchMapping$0[this.builder.getArrowOrientation().ordinal()];
            if (i10 == 1) {
                linearGradient = new LinearGradient((bitmapDrawableToBitmap.getWidth() / 2) - (this.builder.getArrowSize() * 0.5f), DefinitionKt.NO_Float_VALUE, bitmapDrawableToBitmap.getWidth(), DefinitionKt.NO_Float_VALUE, iIntValue, iIntValue2, Shader.TileMode.CLAMP);
            } else {
                if (i10 != 2) {
                    if (i10 != 3) {
                        if (i10 != 4) {
                            throw new NoWhenBranchMatchedException();
                        }
                    }
                    linearGradient = new LinearGradient((bitmapDrawableToBitmap.getWidth() / 2) - (this.builder.getArrowSize() * 0.5f), DefinitionKt.NO_Float_VALUE, bitmapDrawableToBitmap.getWidth(), DefinitionKt.NO_Float_VALUE, iIntValue, iIntValue2, Shader.TileMode.CLAMP);
                }
                linearGradient = new LinearGradient((bitmapDrawableToBitmap.getWidth() / 2) + (this.builder.getArrowSize() * 0.5f), DefinitionKt.NO_Float_VALUE, DefinitionKt.NO_Float_VALUE, DefinitionKt.NO_Float_VALUE, iIntValue, iIntValue2, Shader.TileMode.CLAMP);
            }
            paint.setShader(linearGradient);
            paint.setXfermode(new PorterDuffXfermode(mode));
            canvas.drawRect(DefinitionKt.NO_Float_VALUE, DefinitionKt.NO_Float_VALUE, bitmapDrawableToBitmap.getWidth(), bitmapDrawableToBitmap.getHeight(), paint);
            imageView.setColorFilter(0, mode);
            return bitmapCreateBitmap;
        } catch (IllegalArgumentException unused) {
            throw new IllegalArgumentException("Arrow attached outside balloon. Could not get a matching color.");
        }
    }

    private final void adjustArrowOrientationByRules(View view) {
        if (this.builder.getArrowOrientationRules() == ArrowOrientationRules.ALIGN_FIXED) {
            return;
        }
        Rect rect = new Rect();
        view.getGlobalVisibleRect(rect);
        int[] iArr = {0, 0};
        this.bodyWindow.getContentView().getLocationOnScreen(iArr);
        ArrowOrientation arrowOrientation = this.builder.getArrowOrientation();
        ArrowOrientation arrowOrientation2 = ArrowOrientation.TOP;
        if (arrowOrientation == arrowOrientation2 && iArr[1] < rect.bottom) {
            this.builder.setArrowOrientation(ArrowOrientation.BOTTOM);
        } else if (this.builder.getArrowOrientation() == ArrowOrientation.BOTTOM && iArr[1] > rect.top) {
            this.builder.setArrowOrientation(arrowOrientation2);
        }
        ArrowOrientation arrowOrientation3 = this.builder.getArrowOrientation();
        ArrowOrientation arrowOrientation4 = ArrowOrientation.START;
        if (arrowOrientation3 == arrowOrientation4 && iArr[0] < rect.right) {
            this.builder.setArrowOrientation(ArrowOrientation.END);
        } else if (this.builder.getArrowOrientation() == ArrowOrientation.END && iArr[0] > rect.left) {
            this.builder.setArrowOrientation(arrowOrientation4);
        }
        initializeBalloonContent();
    }

    private final void adjustFitsSystemWindows(ViewGroup viewGroup) {
        viewGroup.setFitsSystemWindows(false);
        C4266h c4266hM11919j = w9.m11919j(0, viewGroup.getChildCount());
        ArrayList arrayList = new ArrayList(AbstractC6664n.m12768r(c4266hM11919j, 10));
        Iterator it = c4266hM11919j.iterator();
        while (it.hasNext()) {
            arrayList.add(viewGroup.getChildAt(((AbstractC6672v) it).nextInt()));
        }
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            View view = (View) obj;
            view.setFitsSystemWindows(false);
            if (view instanceof ViewGroup) {
                adjustFitsSystemWindows((ViewGroup) view);
            }
        }
    }

    private final void applyBalloonAnimation() {
        if (this.builder.getBalloonAnimationStyle() != Integer.MIN_VALUE) {
            this.bodyWindow.setAnimationStyle(this.builder.getBalloonAnimationStyle());
            return;
        }
        int i10 = WhenMappings.$EnumSwitchMapping$2[this.builder.getBalloonAnimation().ordinal()];
        if (i10 == 1) {
            this.bodyWindow.setAnimationStyle(C1413R.style.Balloon_Elastic_Anim);
            return;
        }
        if (i10 == 2) {
            View contentView = this.bodyWindow.getContentView();
            AbstractC4154l.m8922e(contentView, "getContentView(...)");
            ViewExtensionKt.circularRevealed(contentView, this.builder.getCircularDuration());
            this.bodyWindow.setAnimationStyle(C1413R.style.Balloon_Normal_Dispose_Anim);
            return;
        }
        if (i10 == 3) {
            this.bodyWindow.setAnimationStyle(C1413R.style.Balloon_Fade_Anim);
        } else if (i10 == 4) {
            this.bodyWindow.setAnimationStyle(C1413R.style.Balloon_Overshoot_Anim);
        } else {
            if (i10 != 5) {
                throw new NoWhenBranchMatchedException();
            }
            this.bodyWindow.setAnimationStyle(C1413R.style.Balloon_None_Anim);
        }
    }

    private final void applyBalloonOverlayAnimation() {
        if (this.builder.getBalloonOverlayAnimationStyle() != Integer.MIN_VALUE) {
            this.overlayWindow.setAnimationStyle(this.builder.getBalloonAnimationStyle());
            return;
        }
        if (WhenMappings.$EnumSwitchMapping$3[this.builder.getBalloonOverlayAnimation().ordinal()] == 1) {
            this.overlayWindow.setAnimationStyle(C1413R.style.Balloon_Fade_Anim);
        } else {
            this.overlayWindow.setAnimationStyle(C1413R.style.Balloon_Normal_Anim);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final AutoDismissRunnable autoDismissRunnable_delegate$lambda$1(Balloon balloon) {
        return new AutoDismissRunnable(balloon);
    }

    public static /* synthetic */ Object awaitAlign$default(Balloon balloon, BalloonAlign balloonAlign, View view, List list, int i10, int i11, InterfaceC7559c interfaceC7559c, int i12, Object obj) {
        if ((i12 & 4) != 0) {
            list = C6668r.f31943a;
        }
        return balloon.awaitAlign(balloonAlign, view, list, (i12 & 8) != 0 ? 0 : i10, (i12 & 16) != 0 ? 0 : i11, interfaceC7559c);
    }

    public static /* synthetic */ Object awaitAlignBottom$default(Balloon balloon, View view, int i10, int i11, InterfaceC7559c interfaceC7559c, int i12, Object obj) {
        if ((i12 & 2) != 0) {
            i10 = 0;
        }
        if ((i12 & 4) != 0) {
            i11 = 0;
        }
        return balloon.awaitAlignBottom(view, i10, i11, interfaceC7559c);
    }

    public static /* synthetic */ Object awaitAlignEnd$default(Balloon balloon, View view, int i10, int i11, InterfaceC7559c interfaceC7559c, int i12, Object obj) {
        if ((i12 & 2) != 0) {
            i10 = 0;
        }
        if ((i12 & 4) != 0) {
            i11 = 0;
        }
        return balloon.awaitAlignEnd(view, i10, i11, interfaceC7559c);
    }

    public static /* synthetic */ Object awaitAlignStart$default(Balloon balloon, View view, int i10, int i11, InterfaceC7559c interfaceC7559c, int i12, Object obj) {
        if ((i12 & 2) != 0) {
            i10 = 0;
        }
        if ((i12 & 4) != 0) {
            i11 = 0;
        }
        return balloon.awaitAlignStart(view, i10, i11, interfaceC7559c);
    }

    public static /* synthetic */ Object awaitAlignTop$default(Balloon balloon, View view, int i10, int i11, InterfaceC7559c interfaceC7559c, int i12, Object obj) {
        if ((i12 & 2) != 0) {
            i10 = 0;
        }
        if ((i12 & 4) != 0) {
            i11 = 0;
        }
        return balloon.awaitAlignTop(view, i10, i11, interfaceC7559c);
    }

    public static /* synthetic */ Object awaitAsDropDown$default(Balloon balloon, View view, int i10, int i11, InterfaceC7559c interfaceC7559c, int i12, Object obj) {
        if ((i12 & 2) != 0) {
            i10 = 0;
        }
        if ((i12 & 4) != 0) {
            i11 = 0;
        }
        return balloon.awaitAsDropDown(view, i10, i11, interfaceC7559c);
    }

    public static /* synthetic */ Object awaitAtCenter$default(Balloon balloon, View view, int i10, int i11, BalloonCenterAlign balloonCenterAlign, InterfaceC7559c interfaceC7559c, int i12, Object obj) {
        if ((i12 & 2) != 0) {
            i10 = 0;
        }
        if ((i12 & 4) != 0) {
            i11 = 0;
        }
        if ((i12 & 8) != 0) {
            balloonCenterAlign = BalloonCenterAlign.TOP;
        }
        return balloon.awaitAtCenter(view, i10, i11, balloonCenterAlign, interfaceC7559c);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object awaitBalloon(BalloonPlacement balloonPlacement, InterfaceC7559c<? super a0> interfaceC7559c) {
        Companion companion = Companion;
        companion.initConsumerIfNeeded();
        Object objMo14775g = companion.getChannel().mo14775g(new DeferredBalloonGroup(pe.m10833h(new DeferredBalloon(this, balloonPlacement)), true), interfaceC7559c);
        return objMo14775g == EnumC7794a.COROUTINE_SUSPENDED ? objMo14775g : a0.f30746a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BalloonPersistence balloonPersistence_delegate$lambda$2(Balloon balloon) {
        return BalloonPersistence.Companion.getInstance(balloon.context);
    }

    private final C6361k calculateAlignOffset(BalloonPlacement balloonPlacement) {
        View anchor = balloonPlacement.getAnchor();
        int iM6747k = AbstractC2747a.m6747k(anchor.getMeasuredWidth() * 0.5f);
        int iM6747k2 = AbstractC2747a.m6747k(anchor.getMeasuredHeight() * 0.5f);
        int iM6747k3 = AbstractC2747a.m6747k(getMeasuredWidth() * 0.5f);
        int iM6747k4 = AbstractC2747a.m6747k(getMeasuredHeight() * 0.5f);
        int xOff = balloonPlacement.getXOff();
        int yOff = balloonPlacement.getYOff();
        int i10 = WhenMappings.$EnumSwitchMapping$6[balloonPlacement.getAlign().ordinal()];
        if (i10 == 1) {
            return new C6361k(Integer.valueOf(((iM6747k - iM6747k3) + xOff) * this.builder.getSupportRtlLayoutFactor()), Integer.valueOf((-(anchor.getMeasuredHeight() + getMeasuredHeight())) + yOff));
        }
        if (i10 == 2) {
            return new C6361k(Integer.valueOf(((iM6747k - iM6747k3) + xOff) * this.builder.getSupportRtlLayoutFactor()), Integer.valueOf(yOff));
        }
        if (i10 == 3) {
            return new C6361k(Integer.valueOf(((-getMeasuredWidth()) + xOff) * this.builder.getSupportRtlLayoutFactor()), Integer.valueOf((-(iM6747k4 + iM6747k2)) + yOff));
        }
        if (i10 != 4) {
            throw new NoWhenBranchMatchedException();
        }
        return new C6361k(Integer.valueOf((anchor.getMeasuredWidth() + xOff) * this.builder.getSupportRtlLayoutFactor()), Integer.valueOf((-(iM6747k4 + iM6747k2)) + yOff));
    }

    private final C6361k calculateCenterOffset(BalloonPlacement balloonPlacement) {
        View anchor = balloonPlacement.getAnchor();
        int iM6747k = AbstractC2747a.m6747k(anchor.getMeasuredWidth() * 0.5f);
        int iM6747k2 = AbstractC2747a.m6747k(anchor.getMeasuredHeight() * 0.5f);
        int iM6747k3 = AbstractC2747a.m6747k(getMeasuredWidth() * 0.5f);
        int iM6747k4 = AbstractC2747a.m6747k(getMeasuredHeight() * 0.5f);
        int xOff = balloonPlacement.getXOff();
        int yOff = balloonPlacement.getYOff();
        int i10 = WhenMappings.$EnumSwitchMapping$6[balloonPlacement.getAlign().ordinal()];
        if (i10 == 1) {
            return new C6361k(Integer.valueOf(((iM6747k - iM6747k3) + xOff) * this.builder.getSupportRtlLayoutFactor()), Integer.valueOf((-(getMeasuredHeight() + iM6747k2)) + yOff));
        }
        if (i10 == 2) {
            return new C6361k(Integer.valueOf(((iM6747k - iM6747k3) + xOff) * this.builder.getSupportRtlLayoutFactor()), Integer.valueOf((-iM6747k2) + yOff));
        }
        if (i10 == 3) {
            return new C6361k(Integer.valueOf(((iM6747k - getMeasuredWidth()) + xOff) * this.builder.getSupportRtlLayoutFactor()), Integer.valueOf(((-iM6747k4) - iM6747k2) + yOff));
        }
        if (i10 != 4) {
            throw new NoWhenBranchMatchedException();
        }
        return new C6361k(Integer.valueOf((iM6747k + xOff) * this.builder.getSupportRtlLayoutFactor()), Integer.valueOf(((-iM6747k4) - iM6747k2) + yOff));
    }

    private final C6361k calculateOffset(BalloonPlacement balloonPlacement) {
        int i10 = WhenMappings.$EnumSwitchMapping$5[balloonPlacement.getType().ordinal()];
        if (i10 == 1) {
            return new C6361k(Integer.valueOf(balloonPlacement.getXOff()), Integer.valueOf(balloonPlacement.getYOff()));
        }
        if (i10 == 2) {
            return calculateAlignOffset(balloonPlacement);
        }
        if (i10 == 3) {
            return calculateCenterOffset(balloonPlacement);
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean canShowBalloonWindow(View view) {
        if (this.isShowing || this.destroyed) {
            return false;
        }
        Context context = this.context;
        Activity activity = context instanceof Activity ? (Activity) context : null;
        if ((activity == null || !activity.isFinishing()) && this.bodyWindow.getContentView().getParent() == null && view.isAttachedToWindow()) {
            return view.getWindowToken().isBinderAlive();
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final InterfaceC7810l channel_delegate$lambda$56() {
        return o6.m11805a(0, null, null, 7);
    }

    private final void createByBuilder() {
        AbstractC1646r lifecycle;
        initializeBackground();
        initializeBalloonRoot();
        initializeBalloonWindow();
        initializeBalloonLayout();
        initializeBalloonContent();
        initializeBalloonOverlay();
        initializeBalloonListeners();
        FrameLayout root = this.binding.getRoot();
        AbstractC4154l.m8922e(root, "getRoot(...)");
        adjustFitsSystemWindows(root);
        if (this.builder.getLifecycleOwner() == null) {
            Object obj = this.context;
            if (obj instanceof InterfaceC1649u) {
                this.builder.setLifecycleOwner((InterfaceC1649u) obj);
                AbstractC1646r lifecycle2 = ((InterfaceC1649u) this.context).getLifecycle();
                InterfaceC1648t lifecycleObserver = this.builder.getLifecycleObserver();
                if (lifecycleObserver == null) {
                    lifecycleObserver = this;
                }
                lifecycle2.mo5343a(lifecycleObserver);
                return;
            }
        }
        InterfaceC1649u lifecycleOwner = this.builder.getLifecycleOwner();
        if (lifecycleOwner == null || (lifecycle = lifecycleOwner.getLifecycle()) == null) {
            return;
        }
        InterfaceC1648t lifecycleObserver2 = this.builder.getLifecycleObserver();
        if (lifecycleObserver2 == null) {
            lifecycleObserver2 = this;
        }
        lifecycle.mo5343a(lifecycleObserver2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final a0 dismiss$lambda$44(Balloon balloon) {
        balloon.isShowing = false;
        balloon.currentAlign = null;
        balloon.bodyWindow.dismiss();
        balloon.overlayWindow.dismiss();
        balloon.getHandler().removeCallbacks(balloon.getAutoDismissRunnable());
        return a0.f30746a;
    }

    private final Bitmap drawableToBitmap(Drawable drawable, int i10, int i11) {
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(i10, i11, Bitmap.Config.ARGB_8888);
        AbstractC4154l.m8922e(bitmapCreateBitmap, "createBitmap(...)");
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        drawable.setBounds(0, 0, canvas.getWidth(), canvas.getHeight());
        drawable.draw(canvas);
        return bitmapCreateBitmap;
    }

    private final float getArrowConstraintPositionX(View view) {
        FrameLayout balloonContent = this.binding.balloonContent;
        AbstractC4154l.m8922e(balloonContent, "balloonContent");
        int i10 = ViewExtensionKt.getViewPointOnScreen(balloonContent).x;
        int i11 = ViewExtensionKt.getViewPointOnScreen(view).x;
        float minArrowPosition = getMinArrowPosition();
        float measuredWidth = ((getMeasuredWidth() - minArrowPosition) - this.builder.getMarginRight()) - this.builder.getMarginLeft();
        int i12 = WhenMappings.$EnumSwitchMapping$1[this.builder.getArrowPositionRules().ordinal()];
        if (i12 == 1) {
            return (this.builder.getArrowPosition() * this.binding.balloonWrapper.getWidth()) - (this.builder.getArrowSize() * 0.5f);
        }
        if (i12 != 2) {
            throw new NoWhenBranchMatchedException();
        }
        if (view.getWidth() + i11 >= i10) {
            if (getMeasuredWidth() + i10 >= i11) {
                float f6 = i11;
                float f10 = i10;
                float arrowPosition = (((this.builder.getArrowPosition() * view.getWidth()) + f6) - f10) - (this.builder.getArrowSize() * 0.5f);
                float arrowPosition2 = (this.builder.getArrowPosition() * view.getWidth()) + f6;
                if (arrowPosition2 - (this.builder.getArrowSize() * 0.5f) <= f10) {
                    return DefinitionKt.NO_Float_VALUE;
                }
                if (arrowPosition2 - (this.builder.getArrowSize() * 0.5f) > f10 && view.getWidth() <= (getMeasuredWidth() - this.builder.getMarginRight()) - this.builder.getMarginLeft()) {
                    return (arrowPosition2 - (this.builder.getArrowSize() * 0.5f)) - f10;
                }
                if (arrowPosition > getDoubleArrowSize()) {
                    if (arrowPosition <= getMeasuredWidth() - getDoubleArrowSize()) {
                        return arrowPosition;
                    }
                }
            }
            return measuredWidth;
        }
        return minArrowPosition;
    }

    private final float getArrowConstraintPositionY(View view) {
        int statusBarHeight = ViewExtensionKt.getStatusBarHeight(view, this.builder.isStatusBarVisible());
        FrameLayout balloonContent = this.binding.balloonContent;
        AbstractC4154l.m8922e(balloonContent, "balloonContent");
        int i10 = ViewExtensionKt.getViewPointOnScreen(balloonContent).y - statusBarHeight;
        int i11 = ViewExtensionKt.getViewPointOnScreen(view).y - statusBarHeight;
        float minArrowPosition = getMinArrowPosition();
        float measuredHeight = ((getMeasuredHeight() - minArrowPosition) - this.builder.getMarginTop()) - this.builder.getMarginBottom();
        int arrowSize = this.builder.getArrowSize() / 2;
        int i12 = WhenMappings.$EnumSwitchMapping$1[this.builder.getArrowPositionRules().ordinal()];
        if (i12 == 1) {
            return (this.builder.getArrowPosition() * this.binding.balloonWrapper.getHeight()) - arrowSize;
        }
        if (i12 != 2) {
            throw new NoWhenBranchMatchedException();
        }
        if (view.getHeight() + i11 >= i10) {
            if (getMeasuredHeight() + i10 >= i11) {
                float arrowPosition = (((this.builder.getArrowPosition() * view.getHeight()) + i11) - i10) - arrowSize;
                if (arrowPosition > getDoubleArrowSize()) {
                    if (arrowPosition <= getMeasuredHeight() - getDoubleArrowSize()) {
                        return arrowPosition;
                    }
                }
            }
            return measuredHeight;
        }
        return minArrowPosition;
    }

    private final BitmapDrawable getArrowForeground(ImageView imageView, float f6, float f10) {
        if (this.builder.getArrowColorMatchBalloon() && GlobalExtensionKt.isAPILevelHigherThan23()) {
            return new BitmapDrawable(imageView.getResources(), adjustArrowColorByMatchingCardBackground(imageView, f6, f10));
        }
        return null;
    }

    private final AutoDismissRunnable getAutoDismissRunnable() {
        return (AutoDismissRunnable) this.autoDismissRunnable$delegate.getValue();
    }

    private final Animation getBalloonHighlightAnimation() {
        int balloonHighlightAnimationStyle;
        if (this.builder.getBalloonHighlightAnimationStyle() == Integer.MIN_VALUE) {
            int i10 = WhenMappings.$EnumSwitchMapping$4[this.builder.getBalloonHighlightAnimation().ordinal()];
            if (i10 != 1) {
                if (i10 == 2) {
                    int i11 = WhenMappings.$EnumSwitchMapping$0[this.builder.getArrowOrientation().ordinal()];
                    if (i11 == 1) {
                        balloonHighlightAnimationStyle = C1413R.anim.balloon_shake_top;
                    } else if (i11 == 2) {
                        balloonHighlightAnimationStyle = C1413R.anim.balloon_shake_bottom;
                    } else if (i11 == 3) {
                        balloonHighlightAnimationStyle = C1413R.anim.balloon_shake_right;
                    } else {
                        if (i11 != 4) {
                            throw new NoWhenBranchMatchedException();
                        }
                        balloonHighlightAnimationStyle = C1413R.anim.balloon_shake_left;
                    }
                } else {
                    if (i10 != 3) {
                        if (i10 != 4) {
                            return null;
                        }
                        return this.builder.getBalloonRotateAnimation();
                    }
                    balloonHighlightAnimationStyle = C1413R.anim.balloon_fade;
                }
            } else if (this.builder.isVisibleArrow()) {
                int i12 = WhenMappings.$EnumSwitchMapping$0[this.builder.getArrowOrientation().ordinal()];
                if (i12 == 1) {
                    balloonHighlightAnimationStyle = C1413R.anim.balloon_heartbeat_top;
                } else if (i12 == 2) {
                    balloonHighlightAnimationStyle = C1413R.anim.balloon_heartbeat_bottom;
                } else if (i12 == 3) {
                    balloonHighlightAnimationStyle = C1413R.anim.balloon_heartbeat_right;
                } else {
                    if (i12 != 4) {
                        throw new NoWhenBranchMatchedException();
                    }
                    balloonHighlightAnimationStyle = C1413R.anim.balloon_heartbeat_left;
                }
            } else {
                balloonHighlightAnimationStyle = C1413R.anim.balloon_heartbeat_center;
            }
        } else {
            balloonHighlightAnimationStyle = this.builder.getBalloonHighlightAnimationStyle();
        }
        return AnimationUtils.loadAnimation(this.context, balloonHighlightAnimationStyle);
    }

    private final BalloonPersistence getBalloonPersistence() {
        return (BalloonPersistence) this.balloonPersistence$delegate.getValue();
    }

    private final C6361k getColorsFromBalloonCard(float f6, float f10) {
        int pixel;
        int pixel2;
        Drawable background = this.binding.balloonCard.getBackground();
        AbstractC4154l.m8922e(background, "getBackground(...)");
        Bitmap bitmapDrawableToBitmap = drawableToBitmap(background, this.binding.balloonCard.getWidth() + 1, this.binding.balloonCard.getHeight() + 1);
        int i10 = WhenMappings.$EnumSwitchMapping$0[this.builder.getArrowOrientation().ordinal()];
        if (i10 == 1 || i10 == 2) {
            int i11 = (int) f10;
            pixel = bitmapDrawableToBitmap.getPixel((int) ((this.builder.getArrowSize() * 0.5f) + f6), i11);
            pixel2 = bitmapDrawableToBitmap.getPixel((int) (f6 - (this.builder.getArrowSize() * 0.5f)), i11);
        } else {
            if (i10 != 3 && i10 != 4) {
                throw new NoWhenBranchMatchedException();
            }
            int i12 = (int) f6;
            pixel = bitmapDrawableToBitmap.getPixel(i12, (int) ((this.builder.getArrowSize() * 0.5f) + f10));
            pixel2 = bitmapDrawableToBitmap.getPixel(i12, (int) (f10 - (this.builder.getArrowSize() * 0.5f)));
        }
        return new C6361k(Integer.valueOf(pixel), Integer.valueOf(pixel2));
    }

    private final int getDoubleArrowSize() {
        return this.builder.getArrowSize() * 2;
    }

    private final Handler getHandler() {
        return (Handler) this.handler$delegate.getValue();
    }

    private final int getMeasuredTextWidth(int i10, View view) {
        int widthRatio;
        int i11 = new Point(Resources.getSystem().getDisplayMetrics().widthPixels, Resources.getSystem().getDisplayMetrics().heightPixels).x;
        int paddingRight = view.getPaddingRight() + view.getPaddingLeft() + (this.builder.getIconDrawable() != null ? this.builder.getIconSpace() + this.builder.getIconWidth() : this.builder.getMarginLeft() + this.builder.getMarginRight() + (this.builder.getArrowSize() * 2));
        int maxWidth = this.builder.getMaxWidth() - paddingRight;
        if (maxWidth > i11) {
            maxWidth = i11;
        }
        if (this.builder.getWidthRatio() == DefinitionKt.NO_Float_VALUE) {
            if (this.builder.getMinWidthRatio() != DefinitionKt.NO_Float_VALUE || this.builder.getMaxWidthRatio() != DefinitionKt.NO_Float_VALUE) {
                int maxWidthRatio = ((int) (i11 * (this.builder.getMaxWidthRatio() == DefinitionKt.NO_Float_VALUE ? 1.0f : this.builder.getMaxWidthRatio()))) - paddingRight;
                if (i10 > maxWidthRatio) {
                    return maxWidthRatio;
                }
            } else if (this.builder.getWidth() != Integer.MIN_VALUE && this.builder.getWidth() <= i11) {
                widthRatio = this.builder.getWidth();
            } else if (i10 > maxWidth) {
                return maxWidth;
            }
            return i10;
        }
        widthRatio = (int) (this.builder.getWidthRatio() * i11);
        return widthRatio - paddingRight;
    }

    private final float getMinArrowPosition() {
        return (this.builder.getArrowAlignAnchorPaddingRatio() * this.builder.getArrowSize()) + this.builder.getArrowAlignAnchorPadding();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Handler handler_delegate$lambda$0() {
        return new Handler(Looper.getMainLooper());
    }

    private final boolean hasCustomLayout() {
        return (this.builder.getLayoutRes() == null && this.builder.getLayout() == null) ? false : true;
    }

    private final void initializeArrow(View view) {
        ImageView imageView = this.binding.balloonArrow;
        imageView.setLayoutParams(new FrameLayout.LayoutParams(this.builder.getArrowSize(), this.builder.getArrowSize()));
        imageView.setAlpha(this.builder.getAlpha());
        Drawable arrowDrawable = this.builder.getArrowDrawable();
        if (arrowDrawable != null) {
            imageView.setImageDrawable(arrowDrawable);
        }
        imageView.setPadding(this.builder.getArrowLeftPadding(), this.builder.getArrowTopPadding(), this.builder.getArrowRightPadding(), this.builder.getArrowBottomPadding());
        if (this.builder.getArrowColor() != Integer.MIN_VALUE) {
            imageView.setImageTintList(ColorStateList.valueOf(this.builder.getArrowColor()));
        } else {
            imageView.setImageTintList(ColorStateList.valueOf(this.builder.getBackgroundColor()));
        }
        imageView.setOutlineProvider(ViewOutlineProvider.BOUNDS);
        this.binding.balloonCard.post(new RunnableC0025x(6, this, view, imageView));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initializeArrow$lambda$7$lambda$6(Balloon balloon, View view, ImageView imageView) {
        OnBalloonInitializedListener onBalloonInitializedListener = balloon.onBalloonInitializedListener;
        if (onBalloonInitializedListener != null) {
            onBalloonInitializedListener.onBalloonInitialized(balloon.getContentView());
        }
        balloon.adjustArrowOrientationByRules(view);
        balloon.updateArrow(view);
        AbstractC4154l.m8920c(imageView);
        ViewExtensionKt.visible(imageView, balloon.builder.isVisibleArrow());
    }

    private final void initializeBackground() {
        RadiusLayout radiusLayout = this.binding.balloonCard;
        radiusLayout.setAlpha(this.builder.getAlpha());
        radiusLayout.setRadius(this.builder.getCornerRadius());
        float elevation = this.builder.getElevation();
        Field field = v0.f5527a;
        n0.m2459k(radiusLayout, elevation);
        Drawable backgroundDrawable = this.builder.getBackgroundDrawable();
        Drawable drawable = backgroundDrawable;
        if (backgroundDrawable == null) {
            GradientDrawable gradientDrawable = new GradientDrawable();
            gradientDrawable.setColor(this.builder.getBackgroundColor());
            gradientDrawable.setCornerRadius(this.builder.getCornerRadius());
            drawable = gradientDrawable;
        }
        radiusLayout.setBackground(drawable);
        radiusLayout.setPadding(this.builder.getPaddingLeft(), this.builder.getPaddingTop(), this.builder.getPaddingRight(), this.builder.getPaddingBottom());
    }

    private final void initializeBalloonContent() {
        int arrowSize = this.builder.getArrowSize() - 1;
        int elevation = (int) this.builder.getElevation();
        FrameLayout frameLayout = this.binding.balloonContent;
        int i10 = WhenMappings.$EnumSwitchMapping$0[this.builder.getArrowOrientation().ordinal()];
        if (i10 == 1) {
            if (arrowSize >= elevation) {
                elevation = arrowSize;
            }
            frameLayout.setPadding(0, arrowSize, 0, elevation);
        } else if (i10 == 2) {
            if (arrowSize >= elevation) {
                elevation = arrowSize;
            }
            frameLayout.setPadding(0, arrowSize, 0, elevation);
        } else if (i10 == 3) {
            frameLayout.setPadding(arrowSize, 0, arrowSize, 0);
        } else {
            if (i10 != 4) {
                throw new NoWhenBranchMatchedException();
            }
            frameLayout.setPadding(arrowSize, 0, arrowSize, 0);
        }
    }

    private final void initializeBalloonLayout() {
        if (hasCustomLayout()) {
            initializeCustomLayout();
        } else {
            initializeIcon();
            initializeText();
        }
    }

    private final void initializeBalloonListeners() {
        setOnBalloonClickListener(this.builder.getOnBalloonClickListener());
        setOnBalloonDismissListener(this.builder.getOnBalloonDismissListener());
        setOnBalloonOutsideTouchListener(this.builder.getOnBalloonOutsideTouchListener());
        setOnBalloonTouchListener(this.builder.getOnBalloonTouchListener());
        setOnBalloonOverlayClickListener(this.builder.getOnBalloonOverlayClickListener());
        setOnBalloonOverlayTouchListener(this.builder.getOnBalloonOverlayTouchListener());
    }

    private final void initializeBalloonOverlay() {
        if (this.builder.isVisibleOverlay()) {
            BalloonAnchorOverlayView balloonAnchorOverlayView = this.overlayBinding.balloonOverlayView;
            balloonAnchorOverlayView.setOverlayColor(this.builder.getOverlayColor());
            balloonAnchorOverlayView.setOverlayPadding(this.builder.getOverlayPadding());
            balloonAnchorOverlayView.setOverlayPosition(this.builder.getOverlayPosition());
            balloonAnchorOverlayView.setBalloonOverlayShape(this.builder.getOverlayShape());
            balloonAnchorOverlayView.setOverlayPaddingColor(this.builder.getOverlayPaddingColor());
            balloonAnchorOverlayView.setOverlayPaddingShader(this.builder.getOverlayPaddingShader());
            this.overlayWindow.setClippingEnabled(false);
        }
    }

    private final void initializeBalloonRoot() {
        ViewGroup.LayoutParams layoutParams = this.binding.balloonWrapper.getLayoutParams();
        AbstractC4154l.m8921d(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        ((ViewGroup.MarginLayoutParams) layoutParams).setMargins(this.builder.getMarginLeft(), this.builder.getMarginTop(), this.builder.getMarginRight(), this.builder.getMarginBottom());
    }

    private final void initializeBalloonWindow() {
        PopupWindow popupWindow = this.bodyWindow;
        popupWindow.setOutsideTouchable(true);
        popupWindow.setFocusable(this.builder.isFocusable());
        popupWindow.setBackgroundDrawable(new ColorDrawable(0));
        popupWindow.setElevation(this.builder.getElevation());
        setIsAttachedInDecor(this.builder.isAttachedInDecor());
    }

    /* JADX WARN: Removed duplicated region for block: B:6:0x001d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void initializeCustomLayout() {
        /*
            r4 = this;
            com.skydoves.balloon.Balloon$Builder r0 = r4.builder
            java.lang.Integer r0 = r0.getLayoutRes()
            if (r0 == 0) goto L1d
            int r0 = r0.intValue()
            android.content.Context r1 = r4.context
            android.view.LayoutInflater r1 = android.view.LayoutInflater.from(r1)
            com.skydoves.balloon.databinding.BalloonLayoutBodyBinding r2 = r4.binding
            com.skydoves.balloon.radius.RadiusLayout r2 = r2.balloonCard
            r3 = 0
            android.view.View r0 = r1.inflate(r0, r2, r3)
            if (r0 != 0) goto L25
        L1d:
            com.skydoves.balloon.Balloon$Builder r0 = r4.builder
            android.view.View r0 = r0.getLayout()
            if (r0 == 0) goto L51
        L25:
            android.view.ViewParent r1 = r0.getParent()
            boolean r2 = r1 instanceof android.view.ViewGroup
            if (r2 == 0) goto L30
            android.view.ViewGroup r1 = (android.view.ViewGroup) r1
            goto L31
        L30:
            r1 = 0
        L31:
            if (r1 == 0) goto L36
            r1.removeView(r0)
        L36:
            com.skydoves.balloon.databinding.BalloonLayoutBodyBinding r1 = r4.binding
            com.skydoves.balloon.radius.RadiusLayout r1 = r1.balloonCard
            r1.removeAllViews()
            com.skydoves.balloon.databinding.BalloonLayoutBodyBinding r1 = r4.binding
            com.skydoves.balloon.radius.RadiusLayout r1 = r1.balloonCard
            r1.addView(r0)
            com.skydoves.balloon.databinding.BalloonLayoutBodyBinding r0 = r4.binding
            com.skydoves.balloon.radius.RadiusLayout r0 = r0.balloonCard
            java.lang.String r1 = "balloonCard"
            kotlin.jvm.internal.AbstractC4154l.m8922e(r0, r1)
            r4.traverseAndMeasureTextWidth(r0)
            return
        L51:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "The custom layout is null."
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.skydoves.balloon.Balloon.initializeCustomLayout():void");
    }

    private final void initializeIcon() {
        VectorTextView vectorTextView = this.binding.balloonText;
        IconForm iconForm = this.builder.getIconForm();
        if (iconForm != null) {
            AbstractC4154l.m8920c(vectorTextView);
            TextViewExtensionKt.applyIconForm(vectorTextView, iconForm);
        } else {
            AbstractC4154l.m8920c(vectorTextView);
            Context context = vectorTextView.getContext();
            AbstractC4154l.m8922e(context, "getContext(...)");
            IconForm.Builder builder = new IconForm.Builder(context);
            builder.setDrawable(this.builder.getIconDrawable());
            builder.setIconWidth(this.builder.getIconWidth());
            builder.setIconHeight(this.builder.getIconHeight());
            builder.setIconColor(this.builder.getIconColor());
            builder.setIconSpace(this.builder.getIconSpace());
            builder.setDrawableGravity(this.builder.getIconGravity());
            TextViewExtensionKt.applyIconForm(vectorTextView, builder.build());
        }
        vectorTextView.isRtlSupport(this.builder.isRtlLayout());
    }

    private final void initializeText() {
        VectorTextView vectorTextView = this.binding.balloonText;
        TextForm textForm = this.builder.getTextForm();
        if (textForm != null) {
            AbstractC4154l.m8920c(vectorTextView);
            TextViewExtensionKt.applyTextForm(vectorTextView, textForm);
        } else {
            AbstractC4154l.m8920c(vectorTextView);
            Context context = vectorTextView.getContext();
            AbstractC4154l.m8922e(context, "getContext(...)");
            TextForm.Builder builder = new TextForm.Builder(context);
            builder.setText(this.builder.getText());
            builder.setTextSize(this.builder.getTextSize());
            builder.setTextColor(this.builder.getTextColor());
            builder.setTextIsHtml(this.builder.getTextIsHtml());
            builder.setTextGravity(this.builder.getTextGravity());
            builder.setTextTypeface(this.builder.getTextTypeface());
            builder.setTextTypeface(this.builder.getTextTypefaceObject());
            builder.setTextLineSpacing(this.builder.getTextLineSpacing());
            builder.setTextLetterSpacing(this.builder.getTextLetterSpacing());
            vectorTextView.setMovementMethod(this.builder.getMovementMethod());
            builder.setEnableAutoSized(this.builder.getEnableAutoSized());
            builder.setMinAutoSizeTextSize(this.builder.getMinAutoSizeTextSize());
            builder.setMaxAutoSizeTextSize(this.builder.getMaxAutoSizeTextSize());
            TextViewExtensionKt.applyTextForm(vectorTextView, builder.build());
        }
        RadiusLayout balloonCard = this.binding.balloonCard;
        AbstractC4154l.m8922e(balloonCard, "balloonCard");
        measureTextWidth(vectorTextView, balloonCard);
    }

    private final void measureTextWidth(TextView textView, View view) {
        int sumOfIntrinsicWidth;
        int iMeasureText = (int) textView.getPaint().measureText(textView.getText().toString());
        Drawable[] compoundDrawablesRelative = textView.getCompoundDrawablesRelative();
        AbstractC4154l.m8922e(compoundDrawablesRelative, "getCompoundDrawablesRelative(...)");
        if (!DrawableExtensionKt.isExistHorizontalDrawable(compoundDrawablesRelative)) {
            Drawable[] compoundDrawables = textView.getCompoundDrawables();
            AbstractC4154l.m8922e(compoundDrawables, "getCompoundDrawables(...)");
            if (DrawableExtensionKt.isExistHorizontalDrawable(compoundDrawables)) {
                Drawable[] compoundDrawables2 = textView.getCompoundDrawables();
                AbstractC4154l.m8922e(compoundDrawables2, "getCompoundDrawables(...)");
                textView.setMinHeight(DrawableExtensionKt.getIntrinsicHeight(compoundDrawables2));
                Drawable[] compoundDrawables3 = textView.getCompoundDrawables();
                AbstractC4154l.m8922e(compoundDrawables3, "getCompoundDrawables(...)");
                sumOfIntrinsicWidth = DrawableExtensionKt.getSumOfIntrinsicWidth(compoundDrawables3);
            }
            textView.setMaxWidth(getMeasuredTextWidth(textView.getCompoundPaddingEnd() + textView.getCompoundPaddingStart() + iMeasureText, view));
        }
        Drawable[] compoundDrawablesRelative2 = textView.getCompoundDrawablesRelative();
        AbstractC4154l.m8922e(compoundDrawablesRelative2, "getCompoundDrawablesRelative(...)");
        textView.setMinHeight(DrawableExtensionKt.getIntrinsicHeight(compoundDrawablesRelative2));
        Drawable[] compoundDrawablesRelative3 = textView.getCompoundDrawablesRelative();
        AbstractC4154l.m8922e(compoundDrawablesRelative3, "getCompoundDrawablesRelative(...)");
        sumOfIntrinsicWidth = DrawableExtensionKt.getSumOfIntrinsicWidth(compoundDrawablesRelative3);
        iMeasureText += sumOfIntrinsicWidth;
        textView.setMaxWidth(getMeasuredTextWidth(textView.getCompoundPaddingEnd() + textView.getCompoundPaddingStart() + iMeasureText, view));
    }

    private final void passTouchEventToAnchor(View view) {
        if (this.builder.getPassTouchEventToAnchor()) {
            setOnBalloonOverlayTouchListener(new C0403f(8, view, this));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean passTouchEventToAnchor$lambda$50(View view, Balloon balloon, View view2, MotionEvent event) {
        AbstractC4154l.m8923f(view2, "view");
        AbstractC4154l.m8923f(event, "event");
        view2.performClick();
        Rect rect = new Rect();
        view.getGlobalVisibleRect(rect);
        if (event.getAction() == 0) {
            balloon.passedEventActionDownEvent = new C6361k(event, Boolean.valueOf(rect.contains((int) event.getRawX(), (int) event.getRawY())));
        }
        C6361k c6361k = balloon.passedEventActionDownEvent;
        MotionEvent motionEvent = c6361k != null ? (MotionEvent) c6361k.f30755a : null;
        boolean zBooleanValue = c6361k != null ? ((Boolean) c6361k.f30756b).booleanValue() : false;
        if (zBooleanValue && event.getAction() == 1) {
            View rootView = view.getRootView();
            AbstractC4154l.m8920c(motionEvent);
            rootView.dispatchTouchEvent(motionEvent);
            return true;
        }
        if (!zBooleanValue) {
            return false;
        }
        view.getRootView().dispatchTouchEvent(event);
        return true;
    }

    private final Balloon relay(final Balloon balloon, final InterfaceC2139c interfaceC2139c) {
        final OnBalloonDismissListener onBalloonDismissListener = balloon.builder.getOnBalloonDismissListener();
        setOnBalloonDismissListener(new InterfaceC2137a() { // from class: com.skydoves.balloon.Balloon.relay.1
            @Override // ex.InterfaceC2137a
            public /* bridge */ /* synthetic */ Object invoke() {
                m16661invoke();
                return a0.f30746a;
            }

            /* renamed from: invoke, reason: collision with other method in class */
            public final void m16661invoke() {
                OnBalloonDismissListener onBalloonDismissListener2 = onBalloonDismissListener;
                if (onBalloonDismissListener2 != null) {
                    onBalloonDismissListener2.onBalloonDismiss();
                }
                if (this.destroyed) {
                    return;
                }
                interfaceC2139c.invoke(balloon);
            }
        });
        return balloon;
    }

    public static /* synthetic */ Balloon relayShowAlign$default(Balloon balloon, BalloonAlign balloonAlign, Balloon balloon2, View view, int i10, int i11, int i12, Object obj) {
        if ((i12 & 8) != 0) {
            i10 = 0;
        }
        if ((i12 & 16) != 0) {
            i11 = 0;
        }
        return balloon.relayShowAlign(balloonAlign, balloon2, view, i10, i11);
    }

    public static /* synthetic */ Balloon relayShowAlignBottom$default(Balloon balloon, Balloon balloon2, View view, int i10, int i11, int i12, Object obj) {
        if ((i12 & 4) != 0) {
            i10 = 0;
        }
        if ((i12 & 8) != 0) {
            i11 = 0;
        }
        return balloon.relayShowAlignBottom(balloon2, view, i10, i11);
    }

    public static /* synthetic */ Balloon relayShowAlignEnd$default(Balloon balloon, Balloon balloon2, View view, int i10, int i11, int i12, Object obj) {
        if ((i12 & 4) != 0) {
            i10 = 0;
        }
        if ((i12 & 8) != 0) {
            i11 = 0;
        }
        return balloon.relayShowAlignEnd(balloon2, view, i10, i11);
    }

    public static /* synthetic */ Balloon relayShowAlignLeft$default(Balloon balloon, Balloon balloon2, View view, int i10, int i11, int i12, Object obj) {
        if ((i12 & 4) != 0) {
            i10 = 0;
        }
        if ((i12 & 8) != 0) {
            i11 = 0;
        }
        return balloon.relayShowAlignLeft(balloon2, view, i10, i11);
    }

    public static /* synthetic */ Balloon relayShowAlignRight$default(Balloon balloon, Balloon balloon2, View view, int i10, int i11, int i12, Object obj) {
        if ((i12 & 4) != 0) {
            i10 = 0;
        }
        if ((i12 & 8) != 0) {
            i11 = 0;
        }
        return balloon.relayShowAlignRight(balloon2, view, i10, i11);
    }

    public static /* synthetic */ Balloon relayShowAlignStart$default(Balloon balloon, Balloon balloon2, View view, int i10, int i11, int i12, Object obj) {
        if ((i12 & 4) != 0) {
            i10 = 0;
        }
        if ((i12 & 8) != 0) {
            i11 = 0;
        }
        return balloon.relayShowAlignStart(balloon2, view, i10, i11);
    }

    public static /* synthetic */ Balloon relayShowAlignTop$default(Balloon balloon, Balloon balloon2, View view, int i10, int i11, int i12, Object obj) {
        if ((i12 & 4) != 0) {
            i10 = 0;
        }
        if ((i12 & 8) != 0) {
            i11 = 0;
        }
        return balloon.relayShowAlignTop(balloon2, view, i10, i11);
    }

    public static /* synthetic */ Balloon relayShowAsDropDown$default(Balloon balloon, Balloon balloon2, View view, int i10, int i11, int i12, Object obj) {
        if ((i12 & 4) != 0) {
            i10 = 0;
        }
        if ((i12 & 8) != 0) {
            i11 = 0;
        }
        return balloon.relayShowAsDropDown(balloon2, view, i10, i11);
    }

    public static /* synthetic */ Balloon relayShowAtCenter$default(Balloon balloon, Balloon balloon2, View view, int i10, int i11, BalloonCenterAlign balloonCenterAlign, int i12, Object obj) {
        if ((i12 & 4) != 0) {
            i10 = 0;
        }
        if ((i12 & 8) != 0) {
            i11 = 0;
        }
        if ((i12 & 16) != 0) {
            balloonCenterAlign = BalloonCenterAlign.TOP;
        }
        return balloon.relayShowAtCenter(balloon2, view, i10, i11, balloonCenterAlign);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final InterfaceC7266z scope_delegate$lambda$57() {
        C0496f c0496f = m0.f34659a;
        return c0.m13479b(AbstractC8819m.f42514a);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setOnBalloonClickListener$lambda$47(OnBalloonClickListener onBalloonClickListener, Balloon balloon, View view) {
        if (onBalloonClickListener != null) {
            AbstractC4154l.m8920c(view);
            onBalloonClickListener.onBalloonClick(view);
        }
        if (balloon.builder.getDismissWhenClicked()) {
            balloon.dismiss();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setOnBalloonDismissListener$lambda$48(Balloon balloon, OnBalloonDismissListener onBalloonDismissListener) {
        balloon.stopBalloonHighlightAnimation();
        balloon.dismiss();
        if (onBalloonDismissListener != null) {
            onBalloonDismissListener.onBalloonDismiss();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setOnBalloonOverlayClickListener$lambda$51(OnBalloonOverlayClickListener onBalloonOverlayClickListener, Balloon balloon, View view) {
        if (onBalloonOverlayClickListener != null) {
            onBalloonOverlayClickListener.onBalloonOverlayClick();
        }
        if (balloon.builder.getDismissWhenOverlayClicked()) {
            balloon.dismiss();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean setOnBalloonOverlayTouchListener$lambda$49(InterfaceC2141e interfaceC2141e, View view, MotionEvent motionEvent) {
        return ((Boolean) interfaceC2141e.invoke(view, motionEvent)).booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void show(BalloonPlacement balloonPlacement) {
        View anchor = balloonPlacement.getAnchor();
        if (canShowBalloonWindow(anchor)) {
            anchor.post(new RunnableC0025x(7, this, anchor, balloonPlacement));
        } else if (this.builder.getDismissWhenShowAgain()) {
            dismiss();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void show$lambda$34(Balloon balloon, View view, BalloonPlacement balloonPlacement) {
        boolean zCanShowBalloonWindow = balloon.canShowBalloonWindow(view);
        Boolean boolValueOf = Boolean.valueOf(zCanShowBalloonWindow);
        if (!zCanShowBalloonWindow) {
            boolValueOf = null;
        }
        if (boolValueOf != null) {
            String preferenceName = balloon.builder.getPreferenceName();
            if (preferenceName != null) {
                if (!balloon.getBalloonPersistence().shouldShowUp(preferenceName, balloon.builder.getShowTimes())) {
                    InterfaceC2137a runIfReachedShowCounts = balloon.builder.getRunIfReachedShowCounts();
                    if (runIfReachedShowCounts != null) {
                        runIfReachedShowCounts.invoke();
                        return;
                    }
                    return;
                }
                balloon.getBalloonPersistence().putIncrementedCounts(preferenceName);
            }
            balloon.isShowing = true;
            balloon.currentAlign = balloonPlacement.getAlign();
            long autoDismissDuration = balloon.builder.getAutoDismissDuration();
            if (autoDismissDuration != -1) {
                balloon.dismissWithDelay(autoDismissDuration);
            }
            if (balloon.hasCustomLayout()) {
                RadiusLayout balloonCard = balloon.binding.balloonCard;
                AbstractC4154l.m8922e(balloonCard, "balloonCard");
                balloon.traverseAndMeasureTextWidth(balloonCard);
            } else {
                VectorTextView balloonText = balloon.binding.balloonText;
                AbstractC4154l.m8922e(balloonText, "balloonText");
                RadiusLayout balloonCard2 = balloon.binding.balloonCard;
                AbstractC4154l.m8922e(balloonCard2, "balloonCard");
                balloon.measureTextWidth(balloonText, balloonCard2);
            }
            balloon.binding.getRoot().measure(0, 0);
            balloon.bodyWindow.setWidth(balloon.getMeasuredWidth());
            balloon.bodyWindow.setHeight(balloon.getMeasuredHeight());
            balloon.binding.balloonText.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
            balloon.initializeArrow(view);
            balloon.initializeBalloonContent();
            balloon.applyBalloonOverlayAnimation();
            balloon.showOverlayWindow(view, balloonPlacement.getSubAnchors());
            balloon.passTouchEventToAnchor(view);
            balloon.applyBalloonAnimation();
            balloon.startBalloonHighlightAnimation();
            C6361k c6361kCalculateOffset = balloon.calculateOffset(balloonPlacement);
            balloon.bodyWindow.showAsDropDown(view, ((Number) c6361kCalculateOffset.f30755a).intValue(), ((Number) c6361kCalculateOffset.f30756b).intValue());
        }
    }

    public static /* synthetic */ void showAlign$default(Balloon balloon, BalloonAlign balloonAlign, View view, List list, int i10, int i11, int i12, Object obj) {
        if ((i12 & 4) != 0) {
            list = C6668r.f31943a;
        }
        balloon.showAlign(balloonAlign, view, list, (i12 & 8) != 0 ? 0 : i10, (i12 & 16) != 0 ? 0 : i11);
    }

    public static /* synthetic */ void showAlignBottom$default(Balloon balloon, View view, int i10, int i11, int i12, Object obj) {
        if ((i12 & 2) != 0) {
            i10 = 0;
        }
        if ((i12 & 4) != 0) {
            i11 = 0;
        }
        balloon.showAlignBottom(view, i10, i11);
    }

    public static /* synthetic */ void showAlignEnd$default(Balloon balloon, View view, int i10, int i11, int i12, Object obj) {
        if ((i12 & 2) != 0) {
            i10 = 0;
        }
        if ((i12 & 4) != 0) {
            i11 = 0;
        }
        balloon.showAlignEnd(view, i10, i11);
    }

    public static /* synthetic */ void showAlignLeft$default(Balloon balloon, View view, int i10, int i11, int i12, Object obj) {
        if ((i12 & 2) != 0) {
            i10 = 0;
        }
        if ((i12 & 4) != 0) {
            i11 = 0;
        }
        balloon.showAlignLeft(view, i10, i11);
    }

    public static /* synthetic */ void showAlignRight$default(Balloon balloon, View view, int i10, int i11, int i12, Object obj) {
        if ((i12 & 2) != 0) {
            i10 = 0;
        }
        if ((i12 & 4) != 0) {
            i11 = 0;
        }
        balloon.showAlignRight(view, i10, i11);
    }

    public static /* synthetic */ void showAlignStart$default(Balloon balloon, View view, int i10, int i11, int i12, Object obj) {
        if ((i12 & 2) != 0) {
            i10 = 0;
        }
        if ((i12 & 4) != 0) {
            i11 = 0;
        }
        balloon.showAlignStart(view, i10, i11);
    }

    public static /* synthetic */ void showAlignTop$default(Balloon balloon, View view, int i10, int i11, int i12, Object obj) {
        if ((i12 & 2) != 0) {
            i10 = 0;
        }
        if ((i12 & 4) != 0) {
            i11 = 0;
        }
        balloon.showAlignTop(view, i10, i11);
    }

    public static /* synthetic */ void showAsDropDown$default(Balloon balloon, View view, int i10, int i11, int i12, Object obj) {
        if ((i12 & 2) != 0) {
            i10 = 0;
        }
        if ((i12 & 4) != 0) {
            i11 = 0;
        }
        balloon.showAsDropDown(view, i10, i11);
    }

    public static /* synthetic */ void showAtCenter$default(Balloon balloon, View view, int i10, int i11, BalloonCenterAlign balloonCenterAlign, int i12, Object obj) {
        if ((i12 & 2) != 0) {
            i10 = 0;
        }
        if ((i12 & 4) != 0) {
            i11 = 0;
        }
        if ((i12 & 8) != 0) {
            balloonCenterAlign = BalloonCenterAlign.TOP;
        }
        balloon.showAtCenter(view, i10, i11, balloonCenterAlign);
    }

    private final void showOverlayWindow(View view, List<? extends View> list) {
        if (this.builder.isVisibleOverlay()) {
            if (list.isEmpty()) {
                this.overlayBinding.balloonOverlayView.setAnchorView(view);
            } else {
                this.overlayBinding.balloonOverlayView.setAnchorViewList(AbstractC6663m.m12753Q(view, list));
            }
            this.overlayWindow.showAtLocation(view, this.builder.getOverlayGravity(), 0, 0);
        }
    }

    private final void startBalloonHighlightAnimation() {
        this.binding.balloon.post(new RunnableC1427d(this, 0));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void startBalloonHighlightAnimation$lambda$28(Balloon balloon) {
        new Handler(Looper.getMainLooper()).postDelayed(new RunnableC1427d(balloon, 1), balloon.builder.getBalloonHighlightAnimationStartDelay());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void startBalloonHighlightAnimation$lambda$28$lambda$27(Balloon balloon) {
        Animation balloonHighlightAnimation = balloon.getBalloonHighlightAnimation();
        if (balloonHighlightAnimation != null) {
            balloon.binding.balloon.startAnimation(balloonHighlightAnimation);
        }
    }

    private final void stopBalloonHighlightAnimation() {
        FrameLayout frameLayout = this.binding.balloon;
        Animation animation = frameLayout.getAnimation();
        if (animation != null) {
            animation.cancel();
            animation.reset();
        }
        frameLayout.clearAnimation();
    }

    private final void traverseAndMeasureTextWidth(ViewGroup viewGroup) {
        int childCount = viewGroup.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = viewGroup.getChildAt(i10);
            if (childAt instanceof TextView) {
                measureTextWidth((TextView) childAt, viewGroup);
            } else if (childAt instanceof ViewGroup) {
                traverseAndMeasureTextWidth((ViewGroup) childAt);
            }
        }
    }

    private final void update(BalloonPlacement balloonPlacement) {
        if (this.isShowing) {
            updateArrow(balloonPlacement.getAnchor());
            C6361k c6361kCalculateOffset = calculateOffset(balloonPlacement);
            this.bodyWindow.update(balloonPlacement.getAnchor(), ((Number) c6361kCalculateOffset.f30755a).intValue(), ((Number) c6361kCalculateOffset.f30756b).intValue(), balloonPlacement.getWidth(), balloonPlacement.getHeight());
            if (this.builder.isVisibleOverlay()) {
                this.overlayBinding.balloonOverlayView.forceInvalidate();
            }
        }
    }

    public static /* synthetic */ void update$default(Balloon balloon, View view, int i10, int i11, int i12, int i13, int i14, Object obj) {
        if ((i14 & 2) != 0) {
            i10 = 0;
        }
        if ((i14 & 4) != 0) {
            i11 = 0;
        }
        if ((i14 & 8) != 0) {
            i12 = balloon.getMeasuredWidth();
        }
        if ((i14 & 16) != 0) {
            i13 = balloon.getMeasuredHeight();
        }
        balloon.update(view, i10, i11, i12, i13);
    }

    public static /* synthetic */ void updateAlign$default(Balloon balloon, BalloonAlign balloonAlign, View view, int i10, int i11, int i12, int i13, int i14, Object obj) {
        if ((i14 & 4) != 0) {
            i10 = 0;
        }
        if ((i14 & 8) != 0) {
            i11 = 0;
        }
        if ((i14 & 16) != 0) {
            i12 = balloon.getMeasuredWidth();
        }
        if ((i14 & 32) != 0) {
            i13 = balloon.getMeasuredHeight();
        }
        balloon.updateAlign(balloonAlign, view, i10, i11, i12, i13);
    }

    public static /* synthetic */ void updateAlignBottom$default(Balloon balloon, View view, int i10, int i11, int i12, int i13, int i14, Object obj) {
        if ((i14 & 2) != 0) {
            i10 = 0;
        }
        if ((i14 & 4) != 0) {
            i11 = 0;
        }
        if ((i14 & 8) != 0) {
            i12 = balloon.getMeasuredWidth();
        }
        if ((i14 & 16) != 0) {
            i13 = balloon.getMeasuredHeight();
        }
        balloon.updateAlignBottom(view, i10, i11, i12, i13);
    }

    public static /* synthetic */ void updateAlignEnd$default(Balloon balloon, View view, int i10, int i11, int i12, int i13, int i14, Object obj) {
        if ((i14 & 2) != 0) {
            i10 = 0;
        }
        if ((i14 & 4) != 0) {
            i11 = 0;
        }
        if ((i14 & 8) != 0) {
            i12 = balloon.getMeasuredWidth();
        }
        if ((i14 & 16) != 0) {
            i13 = balloon.getMeasuredHeight();
        }
        balloon.updateAlignEnd(view, i10, i11, i12, i13);
    }

    public static /* synthetic */ void updateAlignStart$default(Balloon balloon, View view, int i10, int i11, int i12, int i13, int i14, Object obj) {
        if ((i14 & 2) != 0) {
            i10 = 0;
        }
        if ((i14 & 4) != 0) {
            i11 = 0;
        }
        if ((i14 & 8) != 0) {
            i12 = balloon.getMeasuredWidth();
        }
        if ((i14 & 16) != 0) {
            i13 = balloon.getMeasuredHeight();
        }
        balloon.updateAlignStart(view, i10, i11, i12, i13);
    }

    public static /* synthetic */ void updateAlignTop$default(Balloon balloon, View view, int i10, int i11, int i12, int i13, int i14, Object obj) {
        if ((i14 & 2) != 0) {
            i10 = 0;
        }
        if ((i14 & 4) != 0) {
            i11 = 0;
        }
        if ((i14 & 8) != 0) {
            i12 = balloon.getMeasuredWidth();
        }
        if ((i14 & 16) != 0) {
            i13 = balloon.getMeasuredHeight();
        }
        balloon.updateAlignTop(view, i10, i11, i12, i13);
    }

    private final void updateArrow(View view) {
        ImageView imageView = this.binding.balloonArrow;
        int i10 = WhenMappings.$EnumSwitchMapping$0[ArrowOrientation.Companion.getRTLSupportOrientation$balloon_release(this.builder.getArrowOrientation(), this.builder.isRtlLayout()).ordinal()];
        if (i10 == 1) {
            imageView.setRotation(180.0f);
            imageView.setX(getArrowConstraintPositionX(view));
            imageView.setY((this.binding.balloonCard.getY() + this.binding.balloonCard.getHeight()) - 1);
            float arrowElevation = this.builder.getArrowElevation();
            Field field = v0.f5527a;
            n0.m2459k(imageView, arrowElevation);
            imageView.setForeground(getArrowForeground(imageView, imageView.getX(), this.binding.balloonCard.getHeight()));
            return;
        }
        if (i10 == 2) {
            imageView.setRotation(DefinitionKt.NO_Float_VALUE);
            imageView.setX(getArrowConstraintPositionX(view));
            imageView.setY((this.binding.balloonCard.getY() - this.builder.getArrowSize()) + 1);
            imageView.setForeground(getArrowForeground(imageView, imageView.getX(), DefinitionKt.NO_Float_VALUE));
            return;
        }
        if (i10 == 3) {
            imageView.setRotation(-90.0f);
            imageView.setX((this.binding.balloonCard.getX() - this.builder.getArrowSize()) + 1);
            imageView.setY(getArrowConstraintPositionY(view));
            imageView.setForeground(getArrowForeground(imageView, DefinitionKt.NO_Float_VALUE, imageView.getY()));
            return;
        }
        if (i10 != 4) {
            throw new NoWhenBranchMatchedException();
        }
        imageView.setRotation(90.0f);
        imageView.setX((this.binding.balloonCard.getX() + this.binding.balloonCard.getWidth()) - 1);
        imageView.setY(getArrowConstraintPositionY(view));
        imageView.setForeground(getArrowForeground(imageView, this.binding.balloonCard.getWidth(), imageView.getY()));
    }

    public final Object awaitAlign(BalloonAlign balloonAlign, View view, List<? extends View> list, int i10, int i11, InterfaceC7559c<? super a0> interfaceC7559c) {
        Object objAwaitBalloon = awaitBalloon(new BalloonPlacement(view, list, balloonAlign, i10, i11, null, 0, 0, BERTags.FLAGS, null), interfaceC7559c);
        return objAwaitBalloon == EnumC7794a.COROUTINE_SUSPENDED ? objAwaitBalloon : a0.f30746a;
    }

    public final Object awaitAlignBottom(View view, int i10, int i11, InterfaceC7559c<? super a0> interfaceC7559c) {
        Object objAwaitBalloon = awaitBalloon(new BalloonPlacement(view, null, BalloonAlign.BOTTOM, i10, i11, null, 0, 0, 226, null), interfaceC7559c);
        return objAwaitBalloon == EnumC7794a.COROUTINE_SUSPENDED ? objAwaitBalloon : a0.f30746a;
    }

    public final Object awaitAlignEnd(View view, int i10, int i11, InterfaceC7559c<? super a0> interfaceC7559c) {
        Object objAwaitBalloon = awaitBalloon(new BalloonPlacement(view, null, BalloonAlign.END, i10, i11, null, 0, 0, 226, null), interfaceC7559c);
        return objAwaitBalloon == EnumC7794a.COROUTINE_SUSPENDED ? objAwaitBalloon : a0.f30746a;
    }

    public final Object awaitAlignStart(View view, int i10, int i11, InterfaceC7559c<? super a0> interfaceC7559c) {
        Object objAwaitBalloon = awaitBalloon(new BalloonPlacement(view, null, BalloonAlign.START, i10, i11, null, 0, 0, 226, null), interfaceC7559c);
        return objAwaitBalloon == EnumC7794a.COROUTINE_SUSPENDED ? objAwaitBalloon : a0.f30746a;
    }

    public final Object awaitAlignTop(View view, int i10, int i11, InterfaceC7559c<? super a0> interfaceC7559c) {
        Object objAwaitBalloon = awaitBalloon(new BalloonPlacement(view, null, BalloonAlign.TOP, i10, i11, null, 0, 0, 226, null), interfaceC7559c);
        return objAwaitBalloon == EnumC7794a.COROUTINE_SUSPENDED ? objAwaitBalloon : a0.f30746a;
    }

    public final Object awaitAsDropDown(View view, int i10, int i11, InterfaceC7559c<? super a0> interfaceC7559c) {
        Object objAwaitBalloon = awaitBalloon(new BalloonPlacement(view, null, null, i10, i11, PlacementType.DROPDOWN, 0, 0, 198, null), interfaceC7559c);
        return objAwaitBalloon == EnumC7794a.COROUTINE_SUSPENDED ? objAwaitBalloon : a0.f30746a;
    }

    public final Object awaitAtCenter(View view, int i10, int i11, BalloonCenterAlign balloonCenterAlign, InterfaceC7559c<? super a0> interfaceC7559c) {
        Object objAwaitBalloon = awaitBalloon(new BalloonPlacement(view, null, balloonCenterAlign.toAlign(), i10, i11, PlacementType.CENTER, 0, 0, 194, null), interfaceC7559c);
        return objAwaitBalloon == EnumC7794a.COROUTINE_SUSPENDED ? objAwaitBalloon : a0.f30746a;
    }

    public final void clearAllPreferences() {
        getBalloonPersistence().clearAllPreferences();
    }

    public final void dismiss() {
        if (this.isShowing) {
            final C1415b c1415b = new C1415b(this, 0);
            if (this.builder.getBalloonAnimation() != BalloonAnimation.CIRCULAR) {
                c1415b.invoke();
                return;
            }
            final View contentView = this.bodyWindow.getContentView();
            AbstractC4154l.m8922e(contentView, "getContentView(...)");
            final long circularDuration = this.builder.getCircularDuration();
            contentView.post(new Runnable() { // from class: com.skydoves.balloon.Balloon$dismiss$$inlined$circularUnRevealed$1
                @Override // java.lang.Runnable
                public final void run() {
                    if (contentView.isAttachedToWindow()) {
                        View view = contentView;
                        Animator animatorCreateCircularReveal = ViewAnimationUtils.createCircularReveal(view, (contentView.getRight() + view.getLeft()) / 2, (contentView.getBottom() + contentView.getTop()) / 2, Math.max(contentView.getWidth(), contentView.getHeight()), DefinitionKt.NO_Float_VALUE);
                        animatorCreateCircularReveal.setDuration(circularDuration);
                        animatorCreateCircularReveal.start();
                        final InterfaceC2137a interfaceC2137a = c1415b;
                        animatorCreateCircularReveal.addListener(new AnimatorListenerAdapter() { // from class: com.skydoves.balloon.Balloon$dismiss$$inlined$circularUnRevealed$1.1
                            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                            public void onAnimationEnd(Animator animation) {
                                AbstractC4154l.m8923f(animation, "animation");
                                super.onAnimationEnd(animation);
                                interfaceC2137a.invoke();
                            }
                        });
                    }
                }
            });
        }
    }

    public final boolean dismissWithDelay(long j6) {
        return getHandler().postDelayed(getAutoDismissRunnable(), j6);
    }

    public final View getBalloonArrowView() {
        ImageView balloonArrow = this.binding.balloonArrow;
        AbstractC4154l.m8922e(balloonArrow, "balloonArrow");
        return balloonArrow;
    }

    public final PopupWindow getBodyWindow() {
        return this.bodyWindow;
    }

    public final ViewGroup getContentView() {
        RadiusLayout balloonCard = this.binding.balloonCard;
        AbstractC4154l.m8922e(balloonCard, "balloonCard");
        return balloonCard;
    }

    public final BalloonAlign getCurrentAlign() {
        return this.currentAlign;
    }

    public final int getMeasuredHeight() {
        return this.builder.getHeight() != Integer.MIN_VALUE ? this.builder.getHeight() : this.binding.getRoot().getMeasuredHeight();
    }

    public final int getMeasuredWidth() {
        int i10 = new Point(Resources.getSystem().getDisplayMetrics().widthPixels, Resources.getSystem().getDisplayMetrics().heightPixels).x;
        if (this.builder.getWidthRatio() != DefinitionKt.NO_Float_VALUE) {
            return (int) (this.builder.getWidthRatio() * i10);
        }
        if (this.builder.getMinWidthRatio() != DefinitionKt.NO_Float_VALUE || this.builder.getMaxWidthRatio() != DefinitionKt.NO_Float_VALUE) {
            float f6 = i10;
            return w9.m11912c(this.binding.getRoot().getMeasuredWidth(), (int) (this.builder.getMinWidthRatio() * f6), (int) (f6 * (this.builder.getMaxWidthRatio() == DefinitionKt.NO_Float_VALUE ? 1.0f : this.builder.getMaxWidthRatio())));
        }
        if (this.builder.getWidth() != Integer.MIN_VALUE) {
            int width = this.builder.getWidth();
            if (width <= i10) {
                return width;
            }
        } else {
            int iM11912c = w9.m11912c(this.binding.getRoot().getMeasuredWidth(), this.builder.getMinWidth(), this.builder.getMaxWidth());
            if (iM11912c <= i10) {
                return iM11912c;
            }
        }
        return i10;
    }

    public final PopupWindow getOverlayWindow() {
        return this.overlayWindow;
    }

    public final boolean isShowing() {
        return this.isShowing;
    }

    @Override // d7.InterfaceC1633f
    public /* bridge */ /* synthetic */ void onCreate(InterfaceC1649u interfaceC1649u) {
        super.onCreate(interfaceC1649u);
    }

    @Override // d7.InterfaceC1633f
    public void onDestroy(InterfaceC1649u owner) {
        AbstractC1646r lifecycle;
        AbstractC4154l.m8923f(owner, "owner");
        this.destroyed = true;
        this.overlayWindow.dismiss();
        this.bodyWindow.dismiss();
        InterfaceC1649u lifecycleOwner = this.builder.getLifecycleOwner();
        if (lifecycleOwner == null || (lifecycle = lifecycleOwner.getLifecycle()) == null) {
            return;
        }
        lifecycle.mo5346d(this);
    }

    @Override // d7.InterfaceC1633f
    public void onPause(InterfaceC1649u owner) {
        AbstractC4154l.m8923f(owner, "owner");
        if (this.builder.getDismissWhenLifecycleOnPause()) {
            dismiss();
        }
    }

    @Override // d7.InterfaceC1633f
    public /* bridge */ /* synthetic */ void onResume(InterfaceC1649u interfaceC1649u) {
        super.onResume(interfaceC1649u);
    }

    @Override // d7.InterfaceC1633f
    public /* bridge */ /* synthetic */ void onStart(InterfaceC1649u interfaceC1649u) {
        super.onStart(interfaceC1649u);
    }

    @Override // d7.InterfaceC1633f
    public /* bridge */ /* synthetic */ void onStop(InterfaceC1649u interfaceC1649u) {
        super.onStop(interfaceC1649u);
    }

    public final Balloon relayShowAlign(BalloonAlign align, Balloon balloon, View anchor) {
        AbstractC4154l.m8923f(align, "align");
        AbstractC4154l.m8923f(balloon, "balloon");
        AbstractC4154l.m8923f(anchor, "anchor");
        return relayShowAlign$default(this, align, balloon, anchor, 0, 0, 24, null);
    }

    public final Balloon relayShowAlignBottom(Balloon balloon, View anchor) {
        AbstractC4154l.m8923f(balloon, "balloon");
        AbstractC4154l.m8923f(anchor, "anchor");
        return relayShowAlignBottom$default(this, balloon, anchor, 0, 0, 12, null);
    }

    public final Balloon relayShowAlignEnd(Balloon balloon, View anchor) {
        AbstractC4154l.m8923f(balloon, "balloon");
        AbstractC4154l.m8923f(anchor, "anchor");
        return relayShowAlignEnd$default(this, balloon, anchor, 0, 0, 12, null);
    }

    @InterfaceC6353c
    public final Balloon relayShowAlignLeft(Balloon balloon, View anchor) {
        AbstractC4154l.m8923f(balloon, "balloon");
        AbstractC4154l.m8923f(anchor, "anchor");
        return relayShowAlignLeft$default(this, balloon, anchor, 0, 0, 12, null);
    }

    @InterfaceC6353c
    public final Balloon relayShowAlignRight(Balloon balloon, View anchor) {
        AbstractC4154l.m8923f(balloon, "balloon");
        AbstractC4154l.m8923f(anchor, "anchor");
        return relayShowAlignRight$default(this, balloon, anchor, 0, 0, 12, null);
    }

    public final Balloon relayShowAlignStart(Balloon balloon, View anchor) {
        AbstractC4154l.m8923f(balloon, "balloon");
        AbstractC4154l.m8923f(anchor, "anchor");
        return relayShowAlignStart$default(this, balloon, anchor, 0, 0, 12, null);
    }

    public final Balloon relayShowAlignTop(Balloon balloon, View anchor) {
        AbstractC4154l.m8923f(balloon, "balloon");
        AbstractC4154l.m8923f(anchor, "anchor");
        return relayShowAlignTop$default(this, balloon, anchor, 0, 0, 12, null);
    }

    public final Balloon relayShowAsDropDown(Balloon balloon, View anchor) {
        AbstractC4154l.m8923f(balloon, "balloon");
        AbstractC4154l.m8923f(anchor, "anchor");
        return relayShowAsDropDown$default(this, balloon, anchor, 0, 0, 12, null);
    }

    public final Balloon relayShowAtCenter(Balloon balloon, View anchor) {
        AbstractC4154l.m8923f(balloon, "balloon");
        AbstractC4154l.m8923f(anchor, "anchor");
        return relayShowAtCenter$default(this, balloon, anchor, 0, 0, null, 28, null);
    }

    public final Balloon setIsAttachedInDecor(boolean z6) {
        this.bodyWindow.setAttachedInDecor(z6);
        return this;
    }

    public final void setOnBalloonClickListener(OnBalloonClickListener onBalloonClickListener) {
        if (onBalloonClickListener != null || this.builder.getDismissWhenClicked()) {
            this.binding.balloonWrapper.setOnClickListener(new ViewOnClickListenerC1189b(1, onBalloonClickListener, this));
        }
    }

    public final void setOnBalloonDismissListener(final OnBalloonDismissListener onBalloonDismissListener) {
        this.bodyWindow.setOnDismissListener(new PopupWindow.OnDismissListener() { // from class: com.skydoves.balloon.c
            @Override // android.widget.PopupWindow.OnDismissListener
            public final void onDismiss() {
                Balloon.setOnBalloonDismissListener$lambda$48(this.f7212a, onBalloonDismissListener);
            }
        });
    }

    public final void setOnBalloonInitializedListener(OnBalloonInitializedListener onBalloonInitializedListener) {
        this.onBalloonInitializedListener = onBalloonInitializedListener;
    }

    public final void setOnBalloonOutsideTouchListener(final OnBalloonOutsideTouchListener onBalloonOutsideTouchListener) {
        this.bodyWindow.setTouchInterceptor(new View.OnTouchListener() { // from class: com.skydoves.balloon.Balloon.setOnBalloonOutsideTouchListener.1
            @Override // android.view.View.OnTouchListener
            @SuppressLint({"ClickableViewAccessibility"})
            public boolean onTouch(View view, MotionEvent event) {
                AbstractC4154l.m8923f(view, "view");
                AbstractC4154l.m8923f(event, "event");
                if (event.getAction() == 4) {
                    if (Balloon.this.builder.getDismissWhenTouchOutside()) {
                        Balloon.this.dismiss();
                    }
                    OnBalloonOutsideTouchListener onBalloonOutsideTouchListener2 = onBalloonOutsideTouchListener;
                    if (onBalloonOutsideTouchListener2 != null) {
                        onBalloonOutsideTouchListener2.onBalloonOutsideTouch(view, event);
                    }
                    return true;
                }
                if (!Balloon.this.builder.getDismissWhenTouchMargin() || event.getAction() != 1) {
                    return false;
                }
                FrameLayout balloonWrapper = Balloon.this.binding.balloonWrapper;
                AbstractC4154l.m8922e(balloonWrapper, "balloonWrapper");
                if (ViewExtensionKt.getViewPointOnScreen(balloonWrapper).x <= event.getRawX()) {
                    FrameLayout balloonWrapper2 = Balloon.this.binding.balloonWrapper;
                    AbstractC4154l.m8922e(balloonWrapper2, "balloonWrapper");
                    if (Balloon.this.binding.balloonWrapper.getMeasuredWidth() + ViewExtensionKt.getViewPointOnScreen(balloonWrapper2).x >= event.getRawX()) {
                        return false;
                    }
                }
                if (Balloon.this.builder.getDismissWhenTouchOutside()) {
                    Balloon.this.dismiss();
                }
                OnBalloonOutsideTouchListener onBalloonOutsideTouchListener3 = onBalloonOutsideTouchListener;
                if (onBalloonOutsideTouchListener3 != null) {
                    onBalloonOutsideTouchListener3.onBalloonOutsideTouch(view, event);
                }
                return true;
            }
        });
    }

    public final void setOnBalloonOverlayClickListener(OnBalloonOverlayClickListener onBalloonOverlayClickListener) {
        this.overlayBinding.getRoot().setOnClickListener(new ViewOnClickListenerC1189b(2, onBalloonOverlayClickListener, this));
    }

    public final void setOnBalloonOverlayTouchListener(View.OnTouchListener onTouchListener) {
        if (onTouchListener != null) {
            this.overlayWindow.setTouchInterceptor(onTouchListener);
        }
    }

    public final void setOnBalloonTouchListener(View.OnTouchListener onTouchListener) {
        if (onTouchListener != null) {
            this.bodyWindow.setTouchInterceptor(onTouchListener);
        }
    }

    public final boolean shouldShowUp() {
        String preferenceName = this.builder.getPreferenceName();
        if (preferenceName != null) {
            return getBalloonPersistence().shouldShowUp(preferenceName, this.builder.getShowTimes());
        }
        return true;
    }

    public final void showAlign(BalloonAlign align, View mainAnchor) {
        AbstractC4154l.m8923f(align, "align");
        AbstractC4154l.m8923f(mainAnchor, "mainAnchor");
        showAlign$default(this, align, mainAnchor, null, 0, 0, 28, null);
    }

    public final void showAlignBottom(View anchor) {
        AbstractC4154l.m8923f(anchor, "anchor");
        showAlignBottom$default(this, anchor, 0, 0, 6, null);
    }

    public final void showAlignEnd(View anchor) {
        AbstractC4154l.m8923f(anchor, "anchor");
        showAlignEnd$default(this, anchor, 0, 0, 6, null);
    }

    @InterfaceC6353c
    public final void showAlignLeft(View anchor) {
        AbstractC4154l.m8923f(anchor, "anchor");
        showAlignLeft$default(this, anchor, 0, 0, 6, null);
    }

    @InterfaceC6353c
    public final void showAlignRight(View anchor) {
        AbstractC4154l.m8923f(anchor, "anchor");
        showAlignRight$default(this, anchor, 0, 0, 6, null);
    }

    public final void showAlignStart(View anchor) {
        AbstractC4154l.m8923f(anchor, "anchor");
        showAlignStart$default(this, anchor, 0, 0, 6, null);
    }

    public final void showAlignTop(View anchor) {
        AbstractC4154l.m8923f(anchor, "anchor");
        showAlignTop$default(this, anchor, 0, 0, 6, null);
    }

    public final void showAsDropDown(View anchor) {
        AbstractC4154l.m8923f(anchor, "anchor");
        showAsDropDown$default(this, anchor, 0, 0, 6, null);
    }

    public final void showAtCenter(View anchor) {
        AbstractC4154l.m8923f(anchor, "anchor");
        showAtCenter$default(this, anchor, 0, 0, null, 14, null);
    }

    public final void updateAlign(BalloonAlign align, View anchor) {
        AbstractC4154l.m8923f(align, "align");
        AbstractC4154l.m8923f(anchor, "anchor");
        updateAlign$default(this, align, anchor, 0, 0, 0, 0, 60, null);
    }

    public final void updateAlignBottom(View anchor) {
        AbstractC4154l.m8923f(anchor, "anchor");
        updateAlignBottom$default(this, anchor, 0, 0, 0, 0, 30, null);
    }

    public final void updateAlignEnd(View anchor) {
        AbstractC4154l.m8923f(anchor, "anchor");
        updateAlignEnd$default(this, anchor, 0, 0, 0, 0, 30, null);
    }

    public final void updateAlignStart(View anchor) {
        AbstractC4154l.m8923f(anchor, "anchor");
        updateAlignStart$default(this, anchor, 0, 0, 0, 0, 30, null);
    }

    public final void updateAlignTop(View anchor) {
        AbstractC4154l.m8923f(anchor, "anchor");
        updateAlignTop$default(this, anchor, 0, 0, 0, 0, 30, null);
    }

    @InternalBalloonApi
    public final void updateSizeOfBalloonCard(int i10, int i11) {
        this.builder.setMeasuredWidth(i10);
        if (this.binding.balloonCard.getChildCount() != 0) {
            RadiusLayout balloonCard = this.binding.balloonCard;
            AbstractC4154l.m8922e(balloonCard, "balloonCard");
            View childAt = balloonCard.getChildAt(0);
            if (childAt == null) {
                throw new IndexOutOfBoundsException("Index: 0, Size: " + balloonCard.getChildCount());
            }
            ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
            if (layoutParams == null) {
                throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
            }
            layoutParams.width = i10;
            layoutParams.height = i11;
            childAt.setLayoutParams(layoutParams);
        }
    }

    private Balloon(Context context, Builder builder) {
        this.context = context;
        this.builder = builder;
        BalloonLayoutBodyBinding balloonLayoutBodyBindingInflate = BalloonLayoutBodyBinding.inflate(LayoutInflater.from(context), null, false);
        AbstractC4154l.m8922e(balloonLayoutBodyBindingInflate, "inflate(...)");
        this.binding = balloonLayoutBodyBindingInflate;
        BalloonLayoutOverlayBinding balloonLayoutOverlayBindingInflate = BalloonLayoutOverlayBinding.inflate(LayoutInflater.from(context), null, false);
        AbstractC4154l.m8922e(balloonLayoutOverlayBindingInflate, "inflate(...)");
        this.overlayBinding = balloonLayoutOverlayBindingInflate;
        this.bodyWindow = new PopupWindow(balloonLayoutBodyBindingInflate.getRoot(), -2, -2);
        this.overlayWindow = new PopupWindow(balloonLayoutOverlayBindingInflate.getRoot(), -1, -1);
        this.onBalloonInitializedListener = builder.getOnBalloonInitializedListener();
        EnumC6359i enumC6359i = EnumC6359i.NONE;
        this.handler$delegate = nd.m10781b(enumC6359i, new C1226a(11));
        this.autoDismissRunnable$delegate = nd.m10781b(enumC6359i, new C1415b(this, 1));
        this.balloonPersistence$delegate = nd.m10781b(enumC6359i, new C1415b(this, 2));
        createByBuilder();
    }

    public final Balloon relayShowAlign(BalloonAlign align, Balloon balloon, View anchor, int i10) {
        AbstractC4154l.m8923f(align, "align");
        AbstractC4154l.m8923f(balloon, "balloon");
        AbstractC4154l.m8923f(anchor, "anchor");
        return relayShowAlign$default(this, align, balloon, anchor, i10, 0, 16, null);
    }

    public final Balloon relayShowAlignBottom(Balloon balloon, View anchor, int i10) {
        AbstractC4154l.m8923f(balloon, "balloon");
        AbstractC4154l.m8923f(anchor, "anchor");
        return relayShowAlignBottom$default(this, balloon, anchor, i10, 0, 8, null);
    }

    public final Balloon relayShowAlignEnd(Balloon balloon, View anchor, int i10) {
        AbstractC4154l.m8923f(balloon, "balloon");
        AbstractC4154l.m8923f(anchor, "anchor");
        return relayShowAlignEnd$default(this, balloon, anchor, i10, 0, 8, null);
    }

    @InterfaceC6353c
    public final Balloon relayShowAlignLeft(Balloon balloon, View anchor, int i10) {
        AbstractC4154l.m8923f(balloon, "balloon");
        AbstractC4154l.m8923f(anchor, "anchor");
        return relayShowAlignLeft$default(this, balloon, anchor, i10, 0, 8, null);
    }

    @InterfaceC6353c
    public final Balloon relayShowAlignRight(Balloon balloon, View anchor, int i10) {
        AbstractC4154l.m8923f(balloon, "balloon");
        AbstractC4154l.m8923f(anchor, "anchor");
        return relayShowAlignRight$default(this, balloon, anchor, i10, 0, 8, null);
    }

    public final Balloon relayShowAlignStart(Balloon balloon, View anchor, int i10) {
        AbstractC4154l.m8923f(balloon, "balloon");
        AbstractC4154l.m8923f(anchor, "anchor");
        return relayShowAlignStart$default(this, balloon, anchor, i10, 0, 8, null);
    }

    public final Balloon relayShowAlignTop(Balloon balloon, View anchor, int i10) {
        AbstractC4154l.m8923f(balloon, "balloon");
        AbstractC4154l.m8923f(anchor, "anchor");
        return relayShowAlignTop$default(this, balloon, anchor, i10, 0, 8, null);
    }

    public final Balloon relayShowAsDropDown(Balloon balloon, View anchor, int i10) {
        AbstractC4154l.m8923f(balloon, "balloon");
        AbstractC4154l.m8923f(anchor, "anchor");
        return relayShowAsDropDown$default(this, balloon, anchor, i10, 0, 8, null);
    }

    public final Balloon relayShowAtCenter(Balloon balloon, View anchor, int i10) {
        AbstractC4154l.m8923f(balloon, "balloon");
        AbstractC4154l.m8923f(anchor, "anchor");
        return relayShowAtCenter$default(this, balloon, anchor, i10, 0, null, 24, null);
    }

    public final /* synthetic */ void setOnBalloonDismissListener(InterfaceC2137a block) {
        AbstractC4154l.m8923f(block, "block");
        setOnBalloonDismissListener(new BalloonKt$sam$com_skydoves_balloon_OnBalloonDismissListener$0(block));
    }

    public final /* synthetic */ void setOnBalloonInitializedListener(InterfaceC2139c block) {
        AbstractC4154l.m8923f(block, "block");
        setOnBalloonInitializedListener(new C1410x4924968c(block));
    }

    public final /* synthetic */ void setOnBalloonOverlayClickListener(InterfaceC2137a block) {
        AbstractC4154l.m8923f(block, "block");
        setOnBalloonOverlayClickListener(new C1412x24aff820(block));
    }

    public final void setOnBalloonOverlayTouchListener(final InterfaceC2141e block) {
        AbstractC4154l.m8923f(block, "block");
        setOnBalloonOverlayTouchListener(new View.OnTouchListener() { // from class: com.skydoves.balloon.a
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                return Balloon.setOnBalloonOverlayTouchListener$lambda$49(block, view, motionEvent);
            }
        });
    }

    public final void showAlign(BalloonAlign align, View mainAnchor, List<? extends View> subAnchorList) {
        AbstractC4154l.m8923f(align, "align");
        AbstractC4154l.m8923f(mainAnchor, "mainAnchor");
        AbstractC4154l.m8923f(subAnchorList, "subAnchorList");
        showAlign$default(this, align, mainAnchor, subAnchorList, 0, 0, 24, null);
    }

    public final void showAlignBottom(View anchor, int i10) {
        AbstractC4154l.m8923f(anchor, "anchor");
        showAlignBottom$default(this, anchor, i10, 0, 4, null);
    }

    public final void showAlignEnd(View anchor, int i10) {
        AbstractC4154l.m8923f(anchor, "anchor");
        showAlignEnd$default(this, anchor, i10, 0, 4, null);
    }

    @InterfaceC6353c
    public final void showAlignLeft(View anchor, int i10) {
        AbstractC4154l.m8923f(anchor, "anchor");
        showAlignLeft$default(this, anchor, i10, 0, 4, null);
    }

    @InterfaceC6353c
    public final void showAlignRight(View anchor, int i10) {
        AbstractC4154l.m8923f(anchor, "anchor");
        showAlignRight$default(this, anchor, i10, 0, 4, null);
    }

    public final void showAlignStart(View anchor, int i10) {
        AbstractC4154l.m8923f(anchor, "anchor");
        showAlignStart$default(this, anchor, i10, 0, 4, null);
    }

    public final void showAlignTop(View anchor, int i10) {
        AbstractC4154l.m8923f(anchor, "anchor");
        showAlignTop$default(this, anchor, i10, 0, 4, null);
    }

    public final void showAsDropDown(View anchor, int i10) {
        AbstractC4154l.m8923f(anchor, "anchor");
        showAsDropDown$default(this, anchor, i10, 0, 4, null);
    }

    public final void showAtCenter(View anchor, int i10) {
        AbstractC4154l.m8923f(anchor, "anchor");
        showAtCenter$default(this, anchor, i10, 0, null, 12, null);
    }

    public final void updateAlign(BalloonAlign align, View anchor, int i10) {
        AbstractC4154l.m8923f(align, "align");
        AbstractC4154l.m8923f(anchor, "anchor");
        updateAlign$default(this, align, anchor, i10, 0, 0, 0, 56, null);
    }

    public final void updateAlignBottom(View anchor, int i10) {
        AbstractC4154l.m8923f(anchor, "anchor");
        updateAlignBottom$default(this, anchor, i10, 0, 0, 0, 28, null);
    }

    public final void updateAlignEnd(View anchor, int i10) {
        AbstractC4154l.m8923f(anchor, "anchor");
        updateAlignEnd$default(this, anchor, i10, 0, 0, 0, 28, null);
    }

    public final void updateAlignStart(View anchor, int i10) {
        AbstractC4154l.m8923f(anchor, "anchor");
        updateAlignStart$default(this, anchor, i10, 0, 0, 0, 28, null);
    }

    public final void updateAlignTop(View anchor, int i10) {
        AbstractC4154l.m8923f(anchor, "anchor");
        updateAlignTop$default(this, anchor, i10, 0, 0, 0, 28, null);
    }

    public final Balloon relayShowAlign(final BalloonAlign align, final Balloon balloon, final View anchor, final int i10, final int i11) {
        AbstractC4154l.m8923f(align, "align");
        AbstractC4154l.m8923f(balloon, "balloon");
        AbstractC4154l.m8923f(anchor, "anchor");
        final OnBalloonDismissListener onBalloonDismissListener = balloon.builder.getOnBalloonDismissListener();
        setOnBalloonDismissListener(new InterfaceC2137a() { // from class: com.skydoves.balloon.Balloon$relayShowAlign$$inlined$relay$1
            @Override // ex.InterfaceC2137a
            public /* bridge */ /* synthetic */ Object invoke() {
                m16565invoke();
                return a0.f30746a;
            }

            /* renamed from: invoke, reason: collision with other method in class */
            public final void m16565invoke() {
                OnBalloonDismissListener onBalloonDismissListener2 = onBalloonDismissListener;
                if (onBalloonDismissListener2 != null) {
                    onBalloonDismissListener2.onBalloonDismiss();
                }
                if (this.destroyed) {
                    return;
                }
                Balloon balloon2 = balloon;
                int i12 = Balloon.WhenMappings.$EnumSwitchMapping$6[align.ordinal()];
                if (i12 == 1) {
                    balloon2.showAlignTop(anchor, i10, i11);
                    return;
                }
                if (i12 == 2) {
                    balloon2.showAlignBottom(anchor, i10, i11);
                } else if (i12 == 3) {
                    balloon2.showAlignStart(anchor, i10, i11);
                } else {
                    if (i12 != 4) {
                        throw new NoWhenBranchMatchedException();
                    }
                    balloon2.showAlignEnd(anchor, i10, i11);
                }
            }
        });
        return balloon;
    }

    public final Balloon relayShowAlignBottom(final Balloon balloon, final View anchor, final int i10, final int i11) {
        AbstractC4154l.m8923f(balloon, "balloon");
        AbstractC4154l.m8923f(anchor, "anchor");
        final OnBalloonDismissListener onBalloonDismissListener = balloon.builder.getOnBalloonDismissListener();
        setOnBalloonDismissListener(new InterfaceC2137a() { // from class: com.skydoves.balloon.Balloon$relayShowAlignBottom$$inlined$relay$1
            @Override // ex.InterfaceC2137a
            public /* bridge */ /* synthetic */ Object invoke() {
                m16566invoke();
                return a0.f30746a;
            }

            /* renamed from: invoke, reason: collision with other method in class */
            public final void m16566invoke() {
                OnBalloonDismissListener onBalloonDismissListener2 = onBalloonDismissListener;
                if (onBalloonDismissListener2 != null) {
                    onBalloonDismissListener2.onBalloonDismiss();
                }
                if (this.destroyed) {
                    return;
                }
                balloon.showAlignBottom(anchor, i10, i11);
            }
        });
        return balloon;
    }

    public final Balloon relayShowAlignEnd(final Balloon balloon, final View anchor, final int i10, final int i11) {
        AbstractC4154l.m8923f(balloon, "balloon");
        AbstractC4154l.m8923f(anchor, "anchor");
        final OnBalloonDismissListener onBalloonDismissListener = balloon.builder.getOnBalloonDismissListener();
        setOnBalloonDismissListener(new InterfaceC2137a() { // from class: com.skydoves.balloon.Balloon$relayShowAlignEnd$$inlined$relay$1
            @Override // ex.InterfaceC2137a
            public /* bridge */ /* synthetic */ Object invoke() {
                m16567invoke();
                return a0.f30746a;
            }

            /* renamed from: invoke, reason: collision with other method in class */
            public final void m16567invoke() {
                OnBalloonDismissListener onBalloonDismissListener2 = onBalloonDismissListener;
                if (onBalloonDismissListener2 != null) {
                    onBalloonDismissListener2.onBalloonDismiss();
                }
                if (this.destroyed) {
                    return;
                }
                balloon.showAlignEnd(anchor, i10, i11);
            }
        });
        return balloon;
    }

    @InterfaceC6353c
    public final Balloon relayShowAlignLeft(final Balloon balloon, final View anchor, final int i10, final int i11) {
        AbstractC4154l.m8923f(balloon, "balloon");
        AbstractC4154l.m8923f(anchor, "anchor");
        final OnBalloonDismissListener onBalloonDismissListener = balloon.builder.getOnBalloonDismissListener();
        setOnBalloonDismissListener(new InterfaceC2137a() { // from class: com.skydoves.balloon.Balloon$relayShowAlignLeft$$inlined$relay$1
            @Override // ex.InterfaceC2137a
            public /* bridge */ /* synthetic */ Object invoke() {
                m16568invoke();
                return a0.f30746a;
            }

            /* renamed from: invoke, reason: collision with other method in class */
            public final void m16568invoke() {
                OnBalloonDismissListener onBalloonDismissListener2 = onBalloonDismissListener;
                if (onBalloonDismissListener2 != null) {
                    onBalloonDismissListener2.onBalloonDismiss();
                }
                if (this.destroyed) {
                    return;
                }
                balloon.showAlignLeft(anchor, i10, i11);
            }
        });
        return balloon;
    }

    @InterfaceC6353c
    public final Balloon relayShowAlignRight(final Balloon balloon, final View anchor, final int i10, final int i11) {
        AbstractC4154l.m8923f(balloon, "balloon");
        AbstractC4154l.m8923f(anchor, "anchor");
        final OnBalloonDismissListener onBalloonDismissListener = balloon.builder.getOnBalloonDismissListener();
        setOnBalloonDismissListener(new InterfaceC2137a() { // from class: com.skydoves.balloon.Balloon$relayShowAlignRight$$inlined$relay$1
            @Override // ex.InterfaceC2137a
            public /* bridge */ /* synthetic */ Object invoke() {
                m16569invoke();
                return a0.f30746a;
            }

            /* renamed from: invoke, reason: collision with other method in class */
            public final void m16569invoke() {
                OnBalloonDismissListener onBalloonDismissListener2 = onBalloonDismissListener;
                if (onBalloonDismissListener2 != null) {
                    onBalloonDismissListener2.onBalloonDismiss();
                }
                if (this.destroyed) {
                    return;
                }
                balloon.showAlignRight(anchor, i10, i11);
            }
        });
        return balloon;
    }

    public final Balloon relayShowAlignStart(final Balloon balloon, final View anchor, final int i10, final int i11) {
        AbstractC4154l.m8923f(balloon, "balloon");
        AbstractC4154l.m8923f(anchor, "anchor");
        final OnBalloonDismissListener onBalloonDismissListener = balloon.builder.getOnBalloonDismissListener();
        setOnBalloonDismissListener(new InterfaceC2137a() { // from class: com.skydoves.balloon.Balloon$relayShowAlignStart$$inlined$relay$1
            @Override // ex.InterfaceC2137a
            public /* bridge */ /* synthetic */ Object invoke() {
                m16570invoke();
                return a0.f30746a;
            }

            /* renamed from: invoke, reason: collision with other method in class */
            public final void m16570invoke() {
                OnBalloonDismissListener onBalloonDismissListener2 = onBalloonDismissListener;
                if (onBalloonDismissListener2 != null) {
                    onBalloonDismissListener2.onBalloonDismiss();
                }
                if (this.destroyed) {
                    return;
                }
                balloon.showAlignStart(anchor, i10, i11);
            }
        });
        return balloon;
    }

    public final Balloon relayShowAlignTop(final Balloon balloon, final View anchor, final int i10, final int i11) {
        AbstractC4154l.m8923f(balloon, "balloon");
        AbstractC4154l.m8923f(anchor, "anchor");
        final OnBalloonDismissListener onBalloonDismissListener = balloon.builder.getOnBalloonDismissListener();
        setOnBalloonDismissListener(new InterfaceC2137a() { // from class: com.skydoves.balloon.Balloon$relayShowAlignTop$$inlined$relay$1
            @Override // ex.InterfaceC2137a
            public /* bridge */ /* synthetic */ Object invoke() {
                m16571invoke();
                return a0.f30746a;
            }

            /* renamed from: invoke, reason: collision with other method in class */
            public final void m16571invoke() {
                OnBalloonDismissListener onBalloonDismissListener2 = onBalloonDismissListener;
                if (onBalloonDismissListener2 != null) {
                    onBalloonDismissListener2.onBalloonDismiss();
                }
                if (this.destroyed) {
                    return;
                }
                balloon.showAlignTop(anchor, i10, i11);
            }
        });
        return balloon;
    }

    public final Balloon relayShowAsDropDown(final Balloon balloon, final View anchor, final int i10, final int i11) {
        AbstractC4154l.m8923f(balloon, "balloon");
        AbstractC4154l.m8923f(anchor, "anchor");
        final OnBalloonDismissListener onBalloonDismissListener = balloon.builder.getOnBalloonDismissListener();
        setOnBalloonDismissListener(new InterfaceC2137a() { // from class: com.skydoves.balloon.Balloon$relayShowAsDropDown$$inlined$relay$1
            @Override // ex.InterfaceC2137a
            public /* bridge */ /* synthetic */ Object invoke() {
                m16572invoke();
                return a0.f30746a;
            }

            /* renamed from: invoke, reason: collision with other method in class */
            public final void m16572invoke() {
                OnBalloonDismissListener onBalloonDismissListener2 = onBalloonDismissListener;
                if (onBalloonDismissListener2 != null) {
                    onBalloonDismissListener2.onBalloonDismiss();
                }
                if (this.destroyed) {
                    return;
                }
                balloon.showAsDropDown(anchor, i10, i11);
            }
        });
        return balloon;
    }

    public final Balloon relayShowAtCenter(Balloon balloon, View anchor, int i10, int i11) {
        AbstractC4154l.m8923f(balloon, "balloon");
        AbstractC4154l.m8923f(anchor, "anchor");
        return relayShowAtCenter$default(this, balloon, anchor, i10, i11, null, 16, null);
    }

    public final /* synthetic */ void setOnBalloonClickListener(InterfaceC2139c block) {
        AbstractC4154l.m8923f(block, "block");
        setOnBalloonClickListener(new BalloonKt$sam$com_skydoves_balloon_OnBalloonClickListener$0(block));
    }

    public final void showAlign(BalloonAlign align, View mainAnchor, List<? extends View> subAnchorList, int i10) {
        AbstractC4154l.m8923f(align, "align");
        AbstractC4154l.m8923f(mainAnchor, "mainAnchor");
        AbstractC4154l.m8923f(subAnchorList, "subAnchorList");
        showAlign$default(this, align, mainAnchor, subAnchorList, i10, 0, 16, null);
    }

    public final void showAlignBottom(View anchor, int i10, int i11) {
        AbstractC4154l.m8923f(anchor, "anchor");
        show(new BalloonPlacement(anchor, null, BalloonAlign.BOTTOM, i10, i11, null, 0, 0, 226, null));
    }

    public final void showAlignEnd(View anchor, int i10, int i11) {
        AbstractC4154l.m8923f(anchor, "anchor");
        show(new BalloonPlacement(anchor, null, BalloonAlign.END, i10, i11, null, 0, 0, 226, null));
    }

    @InterfaceC6353c
    public final void showAlignLeft(View anchor, int i10, int i11) {
        AbstractC4154l.m8923f(anchor, "anchor");
        show(new BalloonPlacement(anchor, null, BalloonAlign.START, i10, i11, null, 0, 0, 226, null));
    }

    @InterfaceC6353c
    public final void showAlignRight(View anchor, int i10, int i11) {
        AbstractC4154l.m8923f(anchor, "anchor");
        show(new BalloonPlacement(anchor, null, BalloonAlign.END, i10, i11, null, 0, 0, 226, null));
    }

    public final void showAlignStart(View anchor, int i10, int i11) {
        AbstractC4154l.m8923f(anchor, "anchor");
        show(new BalloonPlacement(anchor, null, BalloonAlign.START, i10, i11, null, 0, 0, 226, null));
    }

    public final void showAlignTop(View anchor, int i10, int i11) {
        AbstractC4154l.m8923f(anchor, "anchor");
        show(new BalloonPlacement(anchor, null, BalloonAlign.TOP, i10, i11, null, 0, 0, 226, null));
    }

    public final void showAsDropDown(View anchor, int i10, int i11) {
        AbstractC4154l.m8923f(anchor, "anchor");
        show(new BalloonPlacement(anchor, null, null, i10, i11, PlacementType.DROPDOWN, 0, 0, 198, null));
    }

    public final void showAtCenter(View anchor, int i10, int i11) {
        AbstractC4154l.m8923f(anchor, "anchor");
        showAtCenter$default(this, anchor, i10, i11, null, 8, null);
    }

    public final void updateAlign(BalloonAlign align, View anchor, int i10, int i11) {
        AbstractC4154l.m8923f(align, "align");
        AbstractC4154l.m8923f(anchor, "anchor");
        updateAlign$default(this, align, anchor, i10, i11, 0, 0, 48, null);
    }

    public final void updateAlignBottom(View anchor, int i10, int i11) {
        AbstractC4154l.m8923f(anchor, "anchor");
        updateAlignBottom$default(this, anchor, i10, i11, 0, 0, 24, null);
    }

    public final void updateAlignEnd(View anchor, int i10, int i11) {
        AbstractC4154l.m8923f(anchor, "anchor");
        updateAlignEnd$default(this, anchor, i10, i11, 0, 0, 24, null);
    }

    public final void updateAlignStart(View anchor, int i10, int i11) {
        AbstractC4154l.m8923f(anchor, "anchor");
        updateAlignStart$default(this, anchor, i10, i11, 0, 0, 24, null);
    }

    public final void updateAlignTop(View anchor, int i10, int i11) {
        AbstractC4154l.m8923f(anchor, "anchor");
        updateAlignTop$default(this, anchor, i10, i11, 0, 0, 24, null);
    }

    public final Balloon relayShowAtCenter(final Balloon balloon, final View anchor, final int i10, final int i11, final BalloonCenterAlign centerAlign) {
        AbstractC4154l.m8923f(balloon, "balloon");
        AbstractC4154l.m8923f(anchor, "anchor");
        AbstractC4154l.m8923f(centerAlign, "centerAlign");
        final OnBalloonDismissListener onBalloonDismissListener = balloon.builder.getOnBalloonDismissListener();
        setOnBalloonDismissListener(new InterfaceC2137a() { // from class: com.skydoves.balloon.Balloon$relayShowAtCenter$$inlined$relay$1
            @Override // ex.InterfaceC2137a
            public /* bridge */ /* synthetic */ Object invoke() {
                m16573invoke();
                return a0.f30746a;
            }

            /* renamed from: invoke, reason: collision with other method in class */
            public final void m16573invoke() {
                OnBalloonDismissListener onBalloonDismissListener2 = onBalloonDismissListener;
                if (onBalloonDismissListener2 != null) {
                    onBalloonDismissListener2.onBalloonDismiss();
                }
                if (this.destroyed) {
                    return;
                }
                balloon.showAtCenter(anchor, i10, i11, centerAlign);
            }
        });
        return balloon;
    }

    public final /* synthetic */ void setOnBalloonOutsideTouchListener(InterfaceC2141e block) {
        AbstractC4154l.m8923f(block, "block");
        setOnBalloonOutsideTouchListener(new C1411x89c13322(block));
    }

    public final void showAlign(BalloonAlign align, View mainAnchor, List<? extends View> subAnchorList, int i10, int i11) {
        AbstractC4154l.m8923f(align, "align");
        AbstractC4154l.m8923f(mainAnchor, "mainAnchor");
        AbstractC4154l.m8923f(subAnchorList, "subAnchorList");
        show(new BalloonPlacement(mainAnchor, subAnchorList, align, i10, i11, null, 0, 0, BERTags.FLAGS, null));
    }

    public final void showAtCenter(View anchor, int i10, int i11, BalloonCenterAlign centerAlign) {
        BalloonAlign balloonAlign;
        AbstractC4154l.m8923f(anchor, "anchor");
        AbstractC4154l.m8923f(centerAlign, "centerAlign");
        PlacementType placementType = PlacementType.CENTER;
        int i12 = WhenMappings.$EnumSwitchMapping$7[centerAlign.ordinal()];
        if (i12 == 1) {
            balloonAlign = BalloonAlign.TOP;
        } else if (i12 == 2) {
            balloonAlign = BalloonAlign.BOTTOM;
        } else if (i12 == 3) {
            balloonAlign = BalloonAlign.START;
        } else if (i12 == 4) {
            balloonAlign = BalloonAlign.END;
        } else {
            throw new NoWhenBranchMatchedException();
        }
        show(new BalloonPlacement(anchor, null, balloonAlign, i10, i11, placementType, 0, 0, 194, null));
    }

    public final void updateAlign(BalloonAlign align, View anchor, int i10, int i11, int i12) {
        AbstractC4154l.m8923f(align, "align");
        AbstractC4154l.m8923f(anchor, "anchor");
        updateAlign$default(this, align, anchor, i10, i11, i12, 0, 32, null);
    }

    public final void updateAlignBottom(View anchor, int i10, int i11, int i12) {
        AbstractC4154l.m8923f(anchor, "anchor");
        updateAlignBottom$default(this, anchor, i10, i11, i12, 0, 16, null);
    }

    public final void updateAlignEnd(View anchor, int i10, int i11, int i12) {
        AbstractC4154l.m8923f(anchor, "anchor");
        updateAlignEnd$default(this, anchor, i10, i11, i12, 0, 16, null);
    }

    public final void updateAlignStart(View anchor, int i10, int i11, int i12) {
        AbstractC4154l.m8923f(anchor, "anchor");
        updateAlignStart$default(this, anchor, i10, i11, i12, 0, 16, null);
    }

    public final void updateAlignTop(View anchor, int i10, int i11, int i12) {
        AbstractC4154l.m8923f(anchor, "anchor");
        updateAlignTop$default(this, anchor, i10, i11, i12, 0, 16, null);
    }

    public final void updateAlign(BalloonAlign align, View anchor, int i10, int i11, int i12, int i13) {
        AbstractC4154l.m8923f(align, "align");
        AbstractC4154l.m8923f(anchor, "anchor");
        update(new BalloonPlacement(anchor, null, align, i10, i11, null, i12, i13, 34, null));
    }

    public final void updateAlignBottom(View anchor, int i10, int i11, int i12, int i13) {
        AbstractC4154l.m8923f(anchor, "anchor");
        update(new BalloonPlacement(anchor, null, BalloonAlign.BOTTOM, i10, i11, null, i12, i13, 34, null));
    }

    public final void updateAlignEnd(View anchor, int i10, int i11, int i12, int i13) {
        AbstractC4154l.m8923f(anchor, "anchor");
        update(new BalloonPlacement(anchor, null, BalloonAlign.END, i10, i11, null, i12, i13, 34, null));
    }

    public final void updateAlignStart(View anchor, int i10, int i11, int i12, int i13) {
        AbstractC4154l.m8923f(anchor, "anchor");
        update(new BalloonPlacement(anchor, null, BalloonAlign.START, i10, i11, null, i12, i13, 34, null));
    }

    public final void updateAlignTop(View anchor, int i10, int i11, int i12, int i13) {
        AbstractC4154l.m8923f(anchor, "anchor");
        update(new BalloonPlacement(anchor, null, BalloonAlign.TOP, i10, i11, null, i12, i13, 34, null));
    }

    public final void update(View anchor, int i10, int i11, int i12, int i13) {
        AbstractC4154l.m8923f(anchor, "anchor");
        update(new BalloonPlacement(anchor, null, null, i10, i11, PlacementType.CENTER, i12, i13, 6, null));
    }
}
