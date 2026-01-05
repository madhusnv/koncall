package com.skydoves.balloon.compose;

import android.annotation.SuppressLint;
import android.content.Context;
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
import d7.InterfaceC1649u;
import d7.q0;
import ex.InterfaceC2137a;
import ex.InterfaceC2139c;
import ex.InterfaceC2141e;
import ex.InterfaceC2142f;
import java.util.List;
import java.util.UUID;
import k2.AbstractC3969r;
import k2.C3953b;
import k2.C3966o;
import k2.InterfaceC3962k;
import k2.w0;
import kotlin.jvm.internal.AbstractC4154l;
import og.gg;
import qw.InterfaceC6353c;
import qw.a0;
import uw.InterfaceC7559c;
import vw.EnumC7794a;
import w3.AbstractC7883a;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
@SuppressLint({"ViewConstructor"})
/* loaded from: classes.dex */
public final class BalloonComposeView extends AbstractC7883a implements BalloonWindow {
    public static final int $stable = 0;
    private final View anchorView;
    private final Balloon balloon;
    private w0 balloonLayoutInfo;
    private final w0 content$delegate;
    private final InterfaceC1649u lifecycleOwner;
    private boolean shouldCreateCompositionOnAttachedToWindow;

    /* JADX WARN: Illegal instructions before constructor call */
    public BalloonComposeView(View anchorView, boolean z6, Balloon.Builder builder, UUID balloonID) {
        AbstractC4154l.m8923f(anchorView, "anchorView");
        AbstractC4154l.m8923f(builder, "builder");
        AbstractC4154l.m8923f(balloonID, "balloonID");
        Context context = anchorView.getContext();
        AbstractC4154l.m8922e(context, "getContext(...)");
        super(context);
        this.anchorView = anchorView;
        InterfaceC1649u interfaceC1649uM5337d = q0.m5337d(getAnchorView());
        this.lifecycleOwner = interfaceC1649uM5337d;
        Balloon.Builder isComposableContent = builder.setLifecycleOwner(interfaceC1649uM5337d).setIsComposableContent(z6);
        if (z6) {
            isComposableContent.setLayout((View) this);
        }
        this.balloon = isComposableContent.build();
        this.content$delegate = C3953b.m8517t(ComposableSingletons$BalloonComposeViewKt.INSTANCE.m16688getLambda1$balloon_compose_release());
        this.balloonLayoutInfo = C3953b.m8517t(null);
        q0.m5341h(this, interfaceC1649uM5337d);
        q0.m5342i(this, q0.m5338e(getAnchorView()));
        gg.m10676c(this, gg.m10674a(getAnchorView()));
        setTag(com.websoptimization.callyzerbiz.R.id.compose_view_saveable_id_tag, "BalloonComposeView:" + balloonID);
    }

    private final InterfaceC2142f getContent() {
        return (InterfaceC2142f) this.content$delegate.getValue();
    }

    private final void setContent(InterfaceC2142f interfaceC2142f) {
        this.content$delegate.setValue(interfaceC2142f);
    }

    @Override // w3.AbstractC7883a
    public void Content(InterfaceC3962k interfaceC3962k, int i10) {
        C3966o c3966o = (C3966o) interfaceC3962k;
        c3966o.m8607Y(-441221009);
        getContent().invoke(this, c3966o, Integer.valueOf(i10 & 14));
        c3966o.m8623p(false);
    }

    @Override // com.skydoves.balloon.compose.BalloonWindow
    public Object awaitAlign(BalloonAlign balloonAlign, View view, List<? extends View> list, int i10, int i11, InterfaceC7559c<? super a0> interfaceC7559c) {
        Object objAwaitAlign = getBalloon().awaitAlign(balloonAlign, view, list, i10, i11, interfaceC7559c);
        return objAwaitAlign == EnumC7794a.COROUTINE_SUSPENDED ? objAwaitAlign : a0.f30746a;
    }

    @Override // com.skydoves.balloon.compose.BalloonWindow
    public Object awaitAlignBottom(int i10, int i11, InterfaceC7559c<? super a0> interfaceC7559c) {
        Object objAwaitAlignBottom = getBalloon().awaitAlignBottom(getAnchorView(), i10, i11, interfaceC7559c);
        return objAwaitAlignBottom == EnumC7794a.COROUTINE_SUSPENDED ? objAwaitAlignBottom : a0.f30746a;
    }

    @Override // com.skydoves.balloon.compose.BalloonWindow
    public Object awaitAlignEnd(int i10, int i11, InterfaceC7559c<? super a0> interfaceC7559c) {
        Object objAwaitAlignEnd = getBalloon().awaitAlignEnd(getAnchorView(), i10, i11, interfaceC7559c);
        return objAwaitAlignEnd == EnumC7794a.COROUTINE_SUSPENDED ? objAwaitAlignEnd : a0.f30746a;
    }

    @Override // com.skydoves.balloon.compose.BalloonWindow
    public Object awaitAlignStart(int i10, int i11, InterfaceC7559c<? super a0> interfaceC7559c) {
        Object objAwaitAlignStart = getBalloon().awaitAlignStart(getAnchorView(), i10, i11, interfaceC7559c);
        return objAwaitAlignStart == EnumC7794a.COROUTINE_SUSPENDED ? objAwaitAlignStart : a0.f30746a;
    }

    @Override // com.skydoves.balloon.compose.BalloonWindow
    public Object awaitAlignTop(int i10, int i11, InterfaceC7559c<? super a0> interfaceC7559c) {
        Object objAwaitAlignTop = getBalloon().awaitAlignTop(getAnchorView(), i10, i11, interfaceC7559c);
        return objAwaitAlignTop == EnumC7794a.COROUTINE_SUSPENDED ? objAwaitAlignTop : a0.f30746a;
    }

    @Override // com.skydoves.balloon.compose.BalloonWindow
    public Object awaitAsDropDown(int i10, int i11, InterfaceC7559c<? super a0> interfaceC7559c) {
        Object objAwaitAsDropDown = getBalloon().awaitAsDropDown(getAnchorView(), i10, i11, interfaceC7559c);
        return objAwaitAsDropDown == EnumC7794a.COROUTINE_SUSPENDED ? objAwaitAsDropDown : a0.f30746a;
    }

    @Override // com.skydoves.balloon.compose.BalloonWindow
    public Object awaitAtCenter(int i10, int i11, BalloonCenterAlign balloonCenterAlign, InterfaceC7559c<? super a0> interfaceC7559c) {
        Object objAwaitAtCenter = getBalloon().awaitAtCenter(getAnchorView(), i10, i11, balloonCenterAlign, interfaceC7559c);
        return objAwaitAtCenter == EnumC7794a.COROUTINE_SUSPENDED ? objAwaitAtCenter : a0.f30746a;
    }

    @Override // com.skydoves.balloon.compose.BalloonWindow
    public void clearAllPreferences() {
        getBalloon().clearAllPreferences();
    }

    @Override // com.skydoves.balloon.compose.BalloonWindow
    public void dismiss() {
        getBalloon().dismiss();
    }

    @Override // com.skydoves.balloon.compose.BalloonWindow
    public boolean dismissWithDelay(long j6) {
        return getBalloon().dismissWithDelay(j6);
    }

    public final void dispose$balloon_compose_release() {
        getBalloon().dismiss();
        q0.m5341h(this, null);
        q0.m5342i(this, null);
        gg.m10676c(this, null);
    }

    @Override // android.view.ViewGroup, android.view.View
    public CharSequence getAccessibilityClassName() {
        return "com.skydoves.balloon.compose.BalloonComposeView";
    }

    @Override // com.skydoves.balloon.compose.BalloonWindow
    public View getAnchorView() {
        return this.anchorView;
    }

    @Override // com.skydoves.balloon.compose.BalloonWindow
    public Balloon getBalloon() {
        return this.balloon;
    }

    @Override // com.skydoves.balloon.compose.BalloonWindow
    public View getBalloonArrowView() {
        return getBalloon().getBalloonArrowView();
    }

    public final w0 getBalloonLayoutInfo$balloon_compose_release() {
        return this.balloonLayoutInfo;
    }

    @Override // com.skydoves.balloon.compose.BalloonWindow
    public ViewGroup getContentView() {
        return getBalloon().getContentView();
    }

    @Override // w3.AbstractC7883a
    public boolean getShouldCreateCompositionOnAttachedToWindow() {
        return this.shouldCreateCompositionOnAttachedToWindow;
    }

    @Override // com.skydoves.balloon.compose.BalloonWindow
    public Balloon relayShowAlign(BalloonAlign align, Balloon balloon, int i10, int i11) {
        AbstractC4154l.m8923f(align, "align");
        AbstractC4154l.m8923f(balloon, "balloon");
        return balloon.relayShowAlign(align, balloon, getAnchorView(), i10, i11);
    }

    @Override // com.skydoves.balloon.compose.BalloonWindow
    public Balloon relayShowAlignBottom(Balloon balloon, int i10, int i11) {
        AbstractC4154l.m8923f(balloon, "balloon");
        return balloon.relayShowAlignBottom(balloon, getAnchorView(), i10, i11);
    }

    @Override // com.skydoves.balloon.compose.BalloonWindow
    public Balloon relayShowAlignEnd(Balloon balloon, int i10, int i11) {
        AbstractC4154l.m8923f(balloon, "balloon");
        return balloon.relayShowAlignEnd(balloon, getAnchorView(), i10, i11);
    }

    @Override // com.skydoves.balloon.compose.BalloonWindow
    @InterfaceC6353c
    public Balloon relayShowAlignLeft(Balloon balloon, int i10, int i11) {
        AbstractC4154l.m8923f(balloon, "balloon");
        return balloon.relayShowAlignLeft(balloon, getAnchorView(), i10, i11);
    }

    @Override // com.skydoves.balloon.compose.BalloonWindow
    @InterfaceC6353c
    public Balloon relayShowAlignRight(Balloon balloon, int i10, int i11) {
        AbstractC4154l.m8923f(balloon, "balloon");
        return balloon.relayShowAlignRight(balloon, getAnchorView(), i10, i11);
    }

    @Override // com.skydoves.balloon.compose.BalloonWindow
    public Balloon relayShowAlignStart(Balloon balloon, int i10, int i11) {
        AbstractC4154l.m8923f(balloon, "balloon");
        return balloon.relayShowAlignStart(balloon, getAnchorView(), i10, i11);
    }

    @Override // com.skydoves.balloon.compose.BalloonWindow
    public Balloon relayShowAlignTop(Balloon balloon, int i10, int i11) {
        AbstractC4154l.m8923f(balloon, "balloon");
        return balloon.relayShowAlignTop(balloon, getAnchorView(), i10, i11);
    }

    @Override // com.skydoves.balloon.compose.BalloonWindow
    public Balloon relayShowAsDropDown(Balloon balloon, int i10, int i11) {
        AbstractC4154l.m8923f(balloon, "balloon");
        return balloon.relayShowAsDropDown(balloon, getAnchorView(), i10, i11);
    }

    @Override // com.skydoves.balloon.compose.BalloonWindow
    public Balloon relayShowAtCenter(Balloon balloon, int i10, int i11, BalloonCenterAlign centerAlign) {
        AbstractC4154l.m8923f(balloon, "balloon");
        AbstractC4154l.m8923f(centerAlign, "centerAlign");
        return balloon.relayShowAtCenter(balloon, getAnchorView(), i10, i11, centerAlign);
    }

    public final void setBalloonLayoutInfo$balloon_compose_release(w0 w0Var) {
        AbstractC4154l.m8923f(w0Var, "<set-?>");
        this.balloonLayoutInfo = w0Var;
    }

    @Override // com.skydoves.balloon.compose.BalloonWindow
    public Balloon setIsAttachedInDecor(boolean z6) {
        return getBalloon().setIsAttachedInDecor(z6);
    }

    @Override // com.skydoves.balloon.compose.BalloonWindow
    public void setOnBalloonClickListener(OnBalloonClickListener onBalloonClickListener) {
        getBalloon().setOnBalloonClickListener(onBalloonClickListener);
    }

    @Override // com.skydoves.balloon.compose.BalloonWindow
    public void setOnBalloonDismissListener(OnBalloonDismissListener onBalloonDismissListener) {
        getBalloon().setOnBalloonDismissListener(onBalloonDismissListener);
    }

    @Override // com.skydoves.balloon.compose.BalloonWindow
    public void setOnBalloonInitializedListener(OnBalloonInitializedListener onBalloonInitializedListener) {
        getBalloon().setOnBalloonInitializedListener(onBalloonInitializedListener);
    }

    @Override // com.skydoves.balloon.compose.BalloonWindow
    public void setOnBalloonOutsideTouchListener(OnBalloonOutsideTouchListener onBalloonOutsideTouchListener) {
        getBalloon().setOnBalloonOutsideTouchListener(onBalloonOutsideTouchListener);
    }

    @Override // com.skydoves.balloon.compose.BalloonWindow
    public void setOnBalloonOverlayClickListener(OnBalloonOverlayClickListener onBalloonOverlayClickListener) {
        getBalloon().setOnBalloonOverlayClickListener(onBalloonOverlayClickListener);
    }

    @Override // com.skydoves.balloon.compose.BalloonWindow
    public void setOnBalloonOverlayTouchListener(View.OnTouchListener onTouchListener) {
        getBalloon().setOnBalloonOverlayTouchListener(onTouchListener);
    }

    @Override // com.skydoves.balloon.compose.BalloonWindow
    public void setOnBalloonTouchListener(View.OnTouchListener onTouchListener) {
        getBalloon().setOnBalloonTouchListener(onTouchListener);
    }

    @Override // com.skydoves.balloon.compose.BalloonWindow
    public boolean shouldShowUp() {
        return getBalloon().shouldShowUp();
    }

    @Override // com.skydoves.balloon.compose.BalloonWindow
    public void showAlign(BalloonAlign align, View mainAnchor, List<? extends View> subAnchorList, int i10, int i11) {
        AbstractC4154l.m8923f(align, "align");
        AbstractC4154l.m8923f(mainAnchor, "mainAnchor");
        AbstractC4154l.m8923f(subAnchorList, "subAnchorList");
        getBalloon().showAlign(align, mainAnchor, subAnchorList, i10, i11);
    }

    @Override // com.skydoves.balloon.compose.BalloonWindow
    public void showAlignBottom(int i10, int i11) {
        getBalloon().showAlignBottom(getAnchorView(), i10, i11);
    }

    @Override // com.skydoves.balloon.compose.BalloonWindow
    public void showAlignEnd(int i10, int i11) {
        getBalloon().showAlignEnd(getAnchorView(), i10, i11);
    }

    @Override // com.skydoves.balloon.compose.BalloonWindow
    @InterfaceC6353c
    public void showAlignLeft(int i10, int i11) {
        getBalloon().showAlignLeft(getAnchorView(), i10, i11);
    }

    @Override // com.skydoves.balloon.compose.BalloonWindow
    @InterfaceC6353c
    public void showAlignRight(int i10, int i11) {
        getBalloon().showAlignRight(getAnchorView(), i10, i11);
    }

    @Override // com.skydoves.balloon.compose.BalloonWindow
    public void showAlignStart(int i10, int i11) {
        getBalloon().showAlignStart(getAnchorView(), i10, i11);
    }

    @Override // com.skydoves.balloon.compose.BalloonWindow
    public void showAlignTop(int i10, int i11) {
        getBalloon().showAlignTop(getAnchorView(), i10, i11);
    }

    @Override // com.skydoves.balloon.compose.BalloonWindow
    public void showAsDropDown(int i10, int i11) {
        getBalloon().showAsDropDown(getAnchorView(), i10, i11);
    }

    @Override // com.skydoves.balloon.compose.BalloonWindow
    public void showAtCenter(int i10, int i11, BalloonCenterAlign centerAlign) {
        AbstractC4154l.m8923f(centerAlign, "centerAlign");
        getBalloon().showAtCenter(getAnchorView(), i10, i11, centerAlign);
    }

    @Override // com.skydoves.balloon.compose.BalloonWindow
    public void update(int i10, int i11) {
        Balloon.update$default(getBalloon(), getAnchorView(), i10, i11, 0, 0, 24, null);
    }

    @Override // com.skydoves.balloon.compose.BalloonWindow
    public void updateAlign(BalloonAlign align, int i10, int i11) {
        AbstractC4154l.m8923f(align, "align");
        Balloon.updateAlign$default(getBalloon(), align, getAnchorView(), i10, i11, 0, 0, 48, null);
    }

    @Override // com.skydoves.balloon.compose.BalloonWindow
    public void updateAlignBottom(int i10, int i11) {
        Balloon.updateAlignBottom$default(getBalloon(), getAnchorView(), i10, i11, 0, 0, 24, null);
    }

    @Override // com.skydoves.balloon.compose.BalloonWindow
    public void updateAlignEnd(int i10, int i11) {
        Balloon.updateAlignEnd$default(getBalloon(), getAnchorView(), i10, i11, 0, 0, 24, null);
    }

    @Override // com.skydoves.balloon.compose.BalloonWindow
    public void updateAlignStart(int i10, int i11) {
        Balloon.updateAlignStart$default(getBalloon(), getAnchorView(), i10, i11, 0, 0, 24, null);
    }

    @Override // com.skydoves.balloon.compose.BalloonWindow
    public void updateAlignTop(int i10, int i11) {
        Balloon.updateAlignTop$default(getBalloon(), getAnchorView(), i10, i11, 0, 0, 24, null);
    }

    @Override // com.skydoves.balloon.compose.BalloonWindow
    @InternalBalloonApi
    public void updateSizeOfBalloonCard(int i10, int i11) {
        getBalloon().updateSizeOfBalloonCard(i10, i11);
    }

    /* renamed from: updateSizeOfBalloonCard-ozmzZPI$balloon_compose_release, reason: not valid java name */
    public final void m16687updateSizeOfBalloonCardozmzZPI$balloon_compose_release(long j6) {
        int i10 = (int) (j6 >> 32);
        int i11 = (int) (j6 & 4294967295L);
        getBalloon().updateSizeOfBalloonCard(i10, i11);
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        if (layoutParams == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
        }
        layoutParams.width = i10;
        layoutParams.height = i11;
        setLayoutParams(layoutParams);
    }

    @Override // com.skydoves.balloon.compose.BalloonWindow
    public void setOnBalloonClickListener(InterfaceC2139c block) {
        AbstractC4154l.m8923f(block, "block");
        getBalloon().setOnBalloonClickListener(block);
    }

    @Override // com.skydoves.balloon.compose.BalloonWindow
    public void setOnBalloonDismissListener(InterfaceC2137a block) {
        AbstractC4154l.m8923f(block, "block");
        getBalloon().setOnBalloonDismissListener(block);
    }

    @Override // com.skydoves.balloon.compose.BalloonWindow
    public void setOnBalloonInitializedListener(InterfaceC2139c block) {
        AbstractC4154l.m8923f(block, "block");
        getBalloon().setOnBalloonInitializedListener(block);
    }

    @Override // com.skydoves.balloon.compose.BalloonWindow
    public void setOnBalloonOutsideTouchListener(InterfaceC2141e block) {
        AbstractC4154l.m8923f(block, "block");
        getBalloon().setOnBalloonOutsideTouchListener(block);
    }

    @Override // com.skydoves.balloon.compose.BalloonWindow
    public void setOnBalloonOverlayClickListener(InterfaceC2137a block) {
        AbstractC4154l.m8923f(block, "block");
        getBalloon().setOnBalloonOverlayClickListener(block);
    }

    @Override // com.skydoves.balloon.compose.BalloonWindow
    public void setOnBalloonOverlayTouchListener(InterfaceC2141e block) {
        AbstractC4154l.m8923f(block, "block");
        getBalloon().setOnBalloonOverlayTouchListener(block);
    }

    public final void setContent(AbstractC3969r compositionContext, InterfaceC2142f content) {
        AbstractC4154l.m8923f(compositionContext, "compositionContext");
        AbstractC4154l.m8923f(content, "content");
        setParentCompositionContext(compositionContext);
        this.shouldCreateCompositionOnAttachedToWindow = true;
        setContent(content);
        if (isAttachedToWindow()) {
            createComposition();
        }
    }
}
