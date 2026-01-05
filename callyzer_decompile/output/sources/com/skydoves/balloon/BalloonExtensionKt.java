package com.skydoves.balloon;

import android.view.View;
import ex.InterfaceC2137a;
import java.util.List;
import kotlin.jvm.internal.AbstractC4154l;
import qw.InterfaceC6353c;
import qw.a0;
import rw.C6668r;
import uw.InterfaceC7559c;
import vw.EnumC7794a;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class BalloonExtensionKt {
    public static final Object awaitAlign(View view, Balloon balloon, BalloonAlign balloonAlign, List<? extends View> list, int i10, int i11, InterfaceC7559c<? super a0> interfaceC7559c) {
        Object objAwaitAlign = balloon.awaitAlign(balloonAlign, view, list, i10, i11, interfaceC7559c);
        return objAwaitAlign == EnumC7794a.COROUTINE_SUSPENDED ? objAwaitAlign : a0.f30746a;
    }

    public static /* synthetic */ Object awaitAlign$default(View view, Balloon balloon, BalloonAlign balloonAlign, List list, int i10, int i11, InterfaceC7559c interfaceC7559c, int i12, Object obj) {
        if ((i12 & 4) != 0) {
            list = C6668r.f31943a;
        }
        return awaitAlign(view, balloon, balloonAlign, list, (i12 & 8) != 0 ? 0 : i10, (i12 & 16) != 0 ? 0 : i11, interfaceC7559c);
    }

    public static final Object awaitAlignBottom(View view, Balloon balloon, int i10, int i11, InterfaceC7559c<? super a0> interfaceC7559c) {
        Object objAwaitAlignBottom = balloon.awaitAlignBottom(view, i10, i11, interfaceC7559c);
        return objAwaitAlignBottom == EnumC7794a.COROUTINE_SUSPENDED ? objAwaitAlignBottom : a0.f30746a;
    }

    public static /* synthetic */ Object awaitAlignBottom$default(View view, Balloon balloon, int i10, int i11, InterfaceC7559c interfaceC7559c, int i12, Object obj) {
        if ((i12 & 2) != 0) {
            i10 = 0;
        }
        if ((i12 & 4) != 0) {
            i11 = 0;
        }
        return awaitAlignBottom(view, balloon, i10, i11, interfaceC7559c);
    }

    public static final Object awaitAlignEnd(View view, Balloon balloon, int i10, int i11, InterfaceC7559c<? super a0> interfaceC7559c) {
        Object objAwaitAlignEnd = balloon.awaitAlignEnd(view, i10, i11, interfaceC7559c);
        return objAwaitAlignEnd == EnumC7794a.COROUTINE_SUSPENDED ? objAwaitAlignEnd : a0.f30746a;
    }

    public static /* synthetic */ Object awaitAlignEnd$default(View view, Balloon balloon, int i10, int i11, InterfaceC7559c interfaceC7559c, int i12, Object obj) {
        if ((i12 & 2) != 0) {
            i10 = 0;
        }
        if ((i12 & 4) != 0) {
            i11 = 0;
        }
        return awaitAlignEnd(view, balloon, i10, i11, interfaceC7559c);
    }

    public static final Object awaitAlignStart(View view, Balloon balloon, int i10, int i11, InterfaceC7559c<? super a0> interfaceC7559c) {
        Object objAwaitAlignStart = balloon.awaitAlignStart(view, i10, i11, interfaceC7559c);
        return objAwaitAlignStart == EnumC7794a.COROUTINE_SUSPENDED ? objAwaitAlignStart : a0.f30746a;
    }

    public static /* synthetic */ Object awaitAlignStart$default(View view, Balloon balloon, int i10, int i11, InterfaceC7559c interfaceC7559c, int i12, Object obj) {
        if ((i12 & 2) != 0) {
            i10 = 0;
        }
        if ((i12 & 4) != 0) {
            i11 = 0;
        }
        return awaitAlignStart(view, balloon, i10, i11, interfaceC7559c);
    }

    public static final Object awaitAlignTop(View view, Balloon balloon, int i10, int i11, InterfaceC7559c<? super a0> interfaceC7559c) {
        Object objAwaitAlignTop = balloon.awaitAlignTop(view, i10, i11, interfaceC7559c);
        return objAwaitAlignTop == EnumC7794a.COROUTINE_SUSPENDED ? objAwaitAlignTop : a0.f30746a;
    }

    public static /* synthetic */ Object awaitAlignTop$default(View view, Balloon balloon, int i10, int i11, InterfaceC7559c interfaceC7559c, int i12, Object obj) {
        if ((i12 & 2) != 0) {
            i10 = 0;
        }
        if ((i12 & 4) != 0) {
            i11 = 0;
        }
        return awaitAlignTop(view, balloon, i10, i11, interfaceC7559c);
    }

    public static final Object awaitAsDropDown(View view, Balloon balloon, int i10, int i11, InterfaceC7559c<? super a0> interfaceC7559c) {
        Object objAwaitAsDropDown = balloon.awaitAsDropDown(view, i10, i11, interfaceC7559c);
        return objAwaitAsDropDown == EnumC7794a.COROUTINE_SUSPENDED ? objAwaitAsDropDown : a0.f30746a;
    }

    public static /* synthetic */ Object awaitAsDropDown$default(View view, Balloon balloon, int i10, int i11, InterfaceC7559c interfaceC7559c, int i12, Object obj) {
        if ((i12 & 2) != 0) {
            i10 = 0;
        }
        if ((i12 & 4) != 0) {
            i11 = 0;
        }
        return awaitAsDropDown(view, balloon, i10, i11, interfaceC7559c);
    }

    public static final Object awaitAtCenter(View view, Balloon balloon, int i10, int i11, BalloonCenterAlign balloonCenterAlign, InterfaceC7559c<? super a0> interfaceC7559c) {
        Object objAwaitAtCenter = balloon.awaitAtCenter(view, i10, i11, balloonCenterAlign, interfaceC7559c);
        return objAwaitAtCenter == EnumC7794a.COROUTINE_SUSPENDED ? objAwaitAtCenter : a0.f30746a;
    }

    public static /* synthetic */ Object awaitAtCenter$default(View view, Balloon balloon, int i10, int i11, BalloonCenterAlign balloonCenterAlign, InterfaceC7559c interfaceC7559c, int i12, Object obj) {
        if ((i12 & 2) != 0) {
            i10 = 0;
        }
        if ((i12 & 4) != 0) {
            i11 = 0;
        }
        if ((i12 & 8) != 0) {
            balloonCenterAlign = BalloonCenterAlign.TOP;
        }
        return awaitAtCenter(view, balloon, i10, i11, balloonCenterAlign, interfaceC7559c);
    }

    public static final /* synthetic */ void balloon(View view, final InterfaceC2137a block) {
        AbstractC4154l.m8923f(view, "<this>");
        AbstractC4154l.m8923f(block, "block");
        view.post(new Runnable() { // from class: com.skydoves.balloon.BalloonExtensionKt.balloon.1
            @Override // java.lang.Runnable
            public final void run() {
                block.invoke();
            }
        });
    }

    public static final /* synthetic */ void showAlign(View view, Balloon balloon, BalloonAlign align) {
        AbstractC4154l.m8923f(view, "<this>");
        AbstractC4154l.m8923f(balloon, "balloon");
        AbstractC4154l.m8923f(align, "align");
        showAlign$default(view, balloon, align, null, 0, 0, 28, null);
    }

    public static /* synthetic */ void showAlign$default(View view, Balloon balloon, BalloonAlign balloonAlign, List list, int i10, int i11, int i12, Object obj) {
        if ((i12 & 4) != 0) {
            list = C6668r.f31943a;
        }
        showAlign(view, balloon, balloonAlign, list, (i12 & 8) != 0 ? 0 : i10, (i12 & 16) != 0 ? 0 : i11);
    }

    public static final /* synthetic */ void showAlignBottom(View view, Balloon balloon) {
        AbstractC4154l.m8923f(view, "<this>");
        AbstractC4154l.m8923f(balloon, "balloon");
        showAlignBottom$default(view, balloon, 0, 0, 6, null);
    }

    public static /* synthetic */ void showAlignBottom$default(View view, Balloon balloon, int i10, int i11, int i12, Object obj) {
        if ((i12 & 2) != 0) {
            i10 = 0;
        }
        if ((i12 & 4) != 0) {
            i11 = 0;
        }
        showAlignBottom(view, balloon, i10, i11);
    }

    public static final /* synthetic */ void showAlignEnd(View view, Balloon balloon) {
        AbstractC4154l.m8923f(view, "<this>");
        AbstractC4154l.m8923f(balloon, "balloon");
        showAlignEnd$default(view, balloon, 0, 0, 6, null);
    }

    public static /* synthetic */ void showAlignEnd$default(View view, Balloon balloon, int i10, int i11, int i12, Object obj) {
        if ((i12 & 2) != 0) {
            i10 = 0;
        }
        if ((i12 & 4) != 0) {
            i11 = 0;
        }
        showAlignEnd(view, balloon, i10, i11);
    }

    @InterfaceC6353c
    public static final /* synthetic */ void showAlignLeft(View view, Balloon balloon) {
        AbstractC4154l.m8923f(view, "<this>");
        AbstractC4154l.m8923f(balloon, "balloon");
        showAlignLeft$default(view, balloon, 0, 0, 6, null);
    }

    public static /* synthetic */ void showAlignLeft$default(View view, Balloon balloon, int i10, int i11, int i12, Object obj) {
        if ((i12 & 2) != 0) {
            i10 = 0;
        }
        if ((i12 & 4) != 0) {
            i11 = 0;
        }
        showAlignLeft(view, balloon, i10, i11);
    }

    @InterfaceC6353c
    public static final /* synthetic */ void showAlignRight(View view, Balloon balloon) {
        AbstractC4154l.m8923f(view, "<this>");
        AbstractC4154l.m8923f(balloon, "balloon");
        showAlignRight$default(view, balloon, 0, 0, 6, null);
    }

    public static /* synthetic */ void showAlignRight$default(View view, Balloon balloon, int i10, int i11, int i12, Object obj) {
        if ((i12 & 2) != 0) {
            i10 = 0;
        }
        if ((i12 & 4) != 0) {
            i11 = 0;
        }
        showAlignRight(view, balloon, i10, i11);
    }

    public static final /* synthetic */ void showAlignStart(View view, Balloon balloon) {
        AbstractC4154l.m8923f(view, "<this>");
        AbstractC4154l.m8923f(balloon, "balloon");
        showAlignStart$default(view, balloon, 0, 0, 6, null);
    }

    public static /* synthetic */ void showAlignStart$default(View view, Balloon balloon, int i10, int i11, int i12, Object obj) {
        if ((i12 & 2) != 0) {
            i10 = 0;
        }
        if ((i12 & 4) != 0) {
            i11 = 0;
        }
        showAlignStart(view, balloon, i10, i11);
    }

    public static final /* synthetic */ void showAlignTop(View view, Balloon balloon) {
        AbstractC4154l.m8923f(view, "<this>");
        AbstractC4154l.m8923f(balloon, "balloon");
        showAlignTop$default(view, balloon, 0, 0, 6, null);
    }

    public static /* synthetic */ void showAlignTop$default(View view, Balloon balloon, int i10, int i11, int i12, Object obj) {
        if ((i12 & 2) != 0) {
            i10 = 0;
        }
        if ((i12 & 4) != 0) {
            i11 = 0;
        }
        showAlignTop(view, balloon, i10, i11);
    }

    public static final /* synthetic */ void showAsDropDown(View view, Balloon balloon) {
        AbstractC4154l.m8923f(view, "<this>");
        AbstractC4154l.m8923f(balloon, "balloon");
        showAsDropDown$default(view, balloon, 0, 0, 6, null);
    }

    public static /* synthetic */ void showAsDropDown$default(View view, Balloon balloon, int i10, int i11, int i12, Object obj) {
        if ((i12 & 2) != 0) {
            i10 = 0;
        }
        if ((i12 & 4) != 0) {
            i11 = 0;
        }
        showAsDropDown(view, balloon, i10, i11);
    }

    public static final /* synthetic */ void showAtCenter(View view, Balloon balloon) {
        AbstractC4154l.m8923f(view, "<this>");
        AbstractC4154l.m8923f(balloon, "balloon");
        showAtCenter$default(view, balloon, 0, 0, null, 14, null);
    }

    public static /* synthetic */ void showAtCenter$default(View view, Balloon balloon, int i10, int i11, BalloonCenterAlign balloonCenterAlign, int i12, Object obj) {
        if ((i12 & 2) != 0) {
            i10 = 0;
        }
        if ((i12 & 4) != 0) {
            i11 = 0;
        }
        if ((i12 & 8) != 0) {
            balloonCenterAlign = BalloonCenterAlign.TOP;
        }
        showAtCenter(view, balloon, i10, i11, balloonCenterAlign);
    }

    public static final /* synthetic */ void showAlign(View view, Balloon balloon, BalloonAlign align, List subAnchorList) {
        AbstractC4154l.m8923f(view, "<this>");
        AbstractC4154l.m8923f(balloon, "balloon");
        AbstractC4154l.m8923f(align, "align");
        AbstractC4154l.m8923f(subAnchorList, "subAnchorList");
        showAlign$default(view, balloon, align, subAnchorList, 0, 0, 24, null);
    }

    public static final /* synthetic */ void showAlignBottom(View view, Balloon balloon, int i10) {
        AbstractC4154l.m8923f(view, "<this>");
        AbstractC4154l.m8923f(balloon, "balloon");
        showAlignBottom$default(view, balloon, i10, 0, 4, null);
    }

    public static final /* synthetic */ void showAlignEnd(View view, Balloon balloon, int i10) {
        AbstractC4154l.m8923f(view, "<this>");
        AbstractC4154l.m8923f(balloon, "balloon");
        showAlignEnd$default(view, balloon, i10, 0, 4, null);
    }

    @InterfaceC6353c
    public static final /* synthetic */ void showAlignLeft(View view, Balloon balloon, int i10) {
        AbstractC4154l.m8923f(view, "<this>");
        AbstractC4154l.m8923f(balloon, "balloon");
        showAlignLeft$default(view, balloon, i10, 0, 4, null);
    }

    @InterfaceC6353c
    public static final /* synthetic */ void showAlignRight(View view, Balloon balloon, int i10) {
        AbstractC4154l.m8923f(view, "<this>");
        AbstractC4154l.m8923f(balloon, "balloon");
        showAlignRight$default(view, balloon, i10, 0, 4, null);
    }

    public static final /* synthetic */ void showAlignStart(View view, Balloon balloon, int i10) {
        AbstractC4154l.m8923f(view, "<this>");
        AbstractC4154l.m8923f(balloon, "balloon");
        showAlignStart$default(view, balloon, i10, 0, 4, null);
    }

    public static final /* synthetic */ void showAlignTop(View view, Balloon balloon, int i10) {
        AbstractC4154l.m8923f(view, "<this>");
        AbstractC4154l.m8923f(balloon, "balloon");
        showAlignTop$default(view, balloon, i10, 0, 4, null);
    }

    public static final /* synthetic */ void showAsDropDown(View view, Balloon balloon, int i10) {
        AbstractC4154l.m8923f(view, "<this>");
        AbstractC4154l.m8923f(balloon, "balloon");
        showAsDropDown$default(view, balloon, i10, 0, 4, null);
    }

    public static final /* synthetic */ void showAtCenter(View view, Balloon balloon, int i10) {
        AbstractC4154l.m8923f(view, "<this>");
        AbstractC4154l.m8923f(balloon, "balloon");
        showAtCenter$default(view, balloon, i10, 0, null, 12, null);
    }

    public static final /* synthetic */ void showAlign(View view, Balloon balloon, BalloonAlign align, List subAnchorList, int i10) {
        AbstractC4154l.m8923f(view, "<this>");
        AbstractC4154l.m8923f(balloon, "balloon");
        AbstractC4154l.m8923f(align, "align");
        AbstractC4154l.m8923f(subAnchorList, "subAnchorList");
        showAlign$default(view, balloon, align, subAnchorList, i10, 0, 16, null);
    }

    public static final /* synthetic */ void showAlignBottom(final View view, final Balloon balloon, final int i10, final int i11) {
        AbstractC4154l.m8923f(view, "<this>");
        AbstractC4154l.m8923f(balloon, "balloon");
        view.post(new Runnable() { // from class: com.skydoves.balloon.BalloonExtensionKt$showAlignBottom$$inlined$balloon$1
            @Override // java.lang.Runnable
            public final void run() {
                balloon.showAlignBottom(view, i10, i11);
            }
        });
    }

    public static final /* synthetic */ void showAlignEnd(final View view, final Balloon balloon, final int i10, final int i11) {
        AbstractC4154l.m8923f(view, "<this>");
        AbstractC4154l.m8923f(balloon, "balloon");
        view.post(new Runnable() { // from class: com.skydoves.balloon.BalloonExtensionKt$showAlignEnd$$inlined$balloon$1
            @Override // java.lang.Runnable
            public final void run() {
                balloon.showAlignEnd(view, i10, i11);
            }
        });
    }

    @InterfaceC6353c
    public static final /* synthetic */ void showAlignLeft(final View view, final Balloon balloon, final int i10, final int i11) {
        AbstractC4154l.m8923f(view, "<this>");
        AbstractC4154l.m8923f(balloon, "balloon");
        view.post(new Runnable() { // from class: com.skydoves.balloon.BalloonExtensionKt$showAlignLeft$$inlined$balloon$1
            @Override // java.lang.Runnable
            public final void run() {
                balloon.showAlignLeft(view, i10, i11);
            }
        });
    }

    @InterfaceC6353c
    public static final /* synthetic */ void showAlignRight(final View view, final Balloon balloon, final int i10, final int i11) {
        AbstractC4154l.m8923f(view, "<this>");
        AbstractC4154l.m8923f(balloon, "balloon");
        view.post(new Runnable() { // from class: com.skydoves.balloon.BalloonExtensionKt$showAlignRight$$inlined$balloon$1
            @Override // java.lang.Runnable
            public final void run() {
                balloon.showAlignRight(view, i10, i11);
            }
        });
    }

    public static final /* synthetic */ void showAlignStart(final View view, final Balloon balloon, final int i10, final int i11) {
        AbstractC4154l.m8923f(view, "<this>");
        AbstractC4154l.m8923f(balloon, "balloon");
        view.post(new Runnable() { // from class: com.skydoves.balloon.BalloonExtensionKt$showAlignStart$$inlined$balloon$1
            @Override // java.lang.Runnable
            public final void run() {
                balloon.showAlignStart(view, i10, i11);
            }
        });
    }

    public static final /* synthetic */ void showAlignTop(final View view, final Balloon balloon, final int i10, final int i11) {
        AbstractC4154l.m8923f(view, "<this>");
        AbstractC4154l.m8923f(balloon, "balloon");
        view.post(new Runnable() { // from class: com.skydoves.balloon.BalloonExtensionKt$showAlignTop$$inlined$balloon$1
            @Override // java.lang.Runnable
            public final void run() {
                balloon.showAlignTop(view, i10, i11);
            }
        });
    }

    public static final /* synthetic */ void showAsDropDown(final View view, final Balloon balloon, final int i10, final int i11) {
        AbstractC4154l.m8923f(view, "<this>");
        AbstractC4154l.m8923f(balloon, "balloon");
        view.post(new Runnable() { // from class: com.skydoves.balloon.BalloonExtensionKt$showAsDropDown$$inlined$balloon$1
            @Override // java.lang.Runnable
            public final void run() {
                balloon.showAsDropDown(view, i10, i11);
            }
        });
    }

    public static final /* synthetic */ void showAtCenter(View view, Balloon balloon, int i10, int i11) {
        AbstractC4154l.m8923f(view, "<this>");
        AbstractC4154l.m8923f(balloon, "balloon");
        showAtCenter$default(view, balloon, i10, i11, null, 8, null);
    }

    public static final /* synthetic */ void showAlign(final View view, final Balloon balloon, final BalloonAlign align, final List subAnchorList, final int i10, final int i11) {
        AbstractC4154l.m8923f(view, "<this>");
        AbstractC4154l.m8923f(balloon, "balloon");
        AbstractC4154l.m8923f(align, "align");
        AbstractC4154l.m8923f(subAnchorList, "subAnchorList");
        view.post(new Runnable() { // from class: com.skydoves.balloon.BalloonExtensionKt$showAlign$$inlined$balloon$1
            @Override // java.lang.Runnable
            public final void run() {
                balloon.showAlign(align, view, subAnchorList, i10, i11);
            }
        });
    }

    public static final /* synthetic */ void showAtCenter(final View view, final Balloon balloon, final int i10, final int i11, final BalloonCenterAlign centerAlign) {
        AbstractC4154l.m8923f(view, "<this>");
        AbstractC4154l.m8923f(balloon, "balloon");
        AbstractC4154l.m8923f(centerAlign, "centerAlign");
        view.post(new Runnable() { // from class: com.skydoves.balloon.BalloonExtensionKt$showAtCenter$$inlined$balloon$1
            @Override // java.lang.Runnable
            public final void run() {
                balloon.showAtCenter(view, i10, i11, centerAlign);
            }
        });
    }
}
