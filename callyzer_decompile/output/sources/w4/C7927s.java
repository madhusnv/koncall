package w4;

import android.graphics.Rect;
import android.os.Build;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.WindowManager;
import com.skydoves.balloon.internals.DefinitionKt;
import com.sun.mail.util.AbstractC1452a;
import com.websoptimization.callyzerbiz.R;
import d6.AbstractC1614d;
import d7.q0;
import ex.InterfaceC2137a;
import ex.InterfaceC2141e;
import g2.e7;
import g2.l7;
import java.util.UUID;
import k2.AbstractC3969r;
import k2.C3953b;
import k2.C3966o;
import k2.InterfaceC3962k;
import k2.c0;
import k2.e1;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.AbstractC4154l;
import kotlin.jvm.internal.C4167y;
import o6.b0;
import og.gg;
import og.ye;
import s4.C6755k;
import s4.C6756l;
import s4.EnumC6757m;
import s4.InterfaceC6747c;
import t3.InterfaceC7033t;
import u2.C7325v;
import w3.AbstractC7883a;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: w4.s */
/* loaded from: classes.dex */
public final class C7927s extends AbstractC7883a {

    /* renamed from: a */
    public InterfaceC2137a f38126a;

    /* renamed from: b */
    public C7931w f38127b;

    /* renamed from: c */
    public String f38128c;

    /* renamed from: d */
    public final View f38129d;

    /* renamed from: e */
    public final C7929u f38130e;

    /* renamed from: f */
    public final WindowManager f38131f;

    /* renamed from: g */
    public final WindowManager.LayoutParams f38132g;

    /* renamed from: h */
    public InterfaceC7930v f38133h;

    /* renamed from: j */
    public EnumC6757m f38134j;

    /* renamed from: k */
    public final e1 f38135k;

    /* renamed from: l */
    public final e1 f38136l;

    /* renamed from: m */
    public C6755k f38137m;

    /* renamed from: n */
    public final c0 f38138n;

    /* renamed from: p */
    public final Rect f38139p;

    /* renamed from: q */
    public final C7325v f38140q;

    /* renamed from: r */
    public e7 f38141r;

    /* renamed from: s */
    public final e1 f38142s;

    /* renamed from: t */
    public boolean f38143t;

    /* renamed from: v */
    public final int[] f38144v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C7927s(InterfaceC2137a interfaceC2137a, C7931w c7931w, String str, View view, InterfaceC6747c interfaceC6747c, InterfaceC7930v interfaceC7930v, UUID uuid) {
        super(view.getContext());
        C7929u c7928t = Build.VERSION.SDK_INT >= 29 ? new C7928t() : new C7929u();
        this.f38126a = interfaceC2137a;
        this.f38127b = c7931w;
        this.f38128c = str;
        this.f38129d = view;
        this.f38130e = c7928t;
        Object systemService = view.getContext().getSystemService("window");
        AbstractC4154l.m8921d(systemService, "null cannot be cast to non-null type android.view.WindowManager");
        this.f38131f = (WindowManager) systemService;
        WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
        layoutParams.gravity = 8388659;
        C7931w c7931w2 = this.f38127b;
        boolean zM15049c = AbstractC7917i.m15049c(view);
        boolean z6 = c7931w2.f38146b;
        int i10 = c7931w2.f38145a;
        if (z6 && zM15049c) {
            i10 |= 8192;
        } else if (z6 && !zM15049c) {
            i10 &= -8193;
        }
        layoutParams.flags = i10;
        layoutParams.type = 1002;
        layoutParams.token = view.getApplicationWindowToken();
        layoutParams.width = -2;
        layoutParams.height = -2;
        layoutParams.format = -3;
        layoutParams.setTitle(view.getContext().getResources().getString(R.string.default_popup_window_title));
        this.f38132g = layoutParams;
        this.f38133h = interfaceC7930v;
        this.f38134j = EnumC6757m.Ltr;
        this.f38135k = C3953b.m8517t(null);
        this.f38136l = C3953b.m8517t(null);
        this.f38138n = C3953b.m8512o(new b0(14, this));
        this.f38139p = new Rect();
        this.f38140q = new C7325v(new C7916h(this, 2));
        setId(android.R.id.content);
        q0.m5341h(this, q0.m5337d(view));
        q0.m5342i(this, q0.m5338e(view));
        gg.m10676c(this, gg.m10674a(view));
        setTag(R.id.compose_view_saveable_id_tag, "Popup:" + uuid);
        setClipChildren(false);
        setElevation(interfaceC6747c.mo8435T((float) 8));
        setOutlineProvider(new l7(4));
        this.f38142s = C3953b.m8517t(AbstractC7920l.f38103a);
        this.f38144v = new int[2];
    }

    private final InterfaceC2141e getContent() {
        return (InterfaceC2141e) this.f38142s.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final InterfaceC7033t getParentLayoutCoordinates() {
        return (InterfaceC7033t) this.f38136l.getValue();
    }

    private final C6755k getVisibleDisplayBounds() {
        this.f38130e.getClass();
        View view = this.f38129d;
        Rect rect = this.f38139p;
        view.getWindowVisibleDisplayFrame(rect);
        return new C6755k(rect.left, rect.top, rect.right, rect.bottom);
    }

    private final void setContent(InterfaceC2141e interfaceC2141e) {
        this.f38142s.setValue(interfaceC2141e);
    }

    private final void setParentLayoutCoordinates(InterfaceC7033t interfaceC7033t) {
        this.f38136l.setValue(interfaceC7033t);
    }

    @Override // w3.AbstractC7883a
    public final void Content(InterfaceC3962k interfaceC3962k, int i10) {
        C3966o c3966o = (C3966o) interfaceC3962k;
        c3966o.m8607Y(-857613600);
        AbstractC1452a.m4576w(0, getContent(), c3966o, false);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        if (!this.f38127b.f38147c) {
            return super.dispatchKeyEvent(keyEvent);
        }
        if (keyEvent.getKeyCode() == 4 || keyEvent.getKeyCode() == 111) {
            KeyEvent.DispatcherState keyDispatcherState = getKeyDispatcherState();
            if (keyDispatcherState == null) {
                return super.dispatchKeyEvent(keyEvent);
            }
            if (keyEvent.getAction() == 0 && keyEvent.getRepeatCount() == 0) {
                keyDispatcherState.startTracking(keyEvent, this);
                return true;
            }
            if (keyEvent.getAction() == 1 && keyDispatcherState.isTracking(keyEvent) && !keyEvent.isCanceled()) {
                InterfaceC2137a interfaceC2137a = this.f38126a;
                if (interfaceC2137a != null) {
                    interfaceC2137a.invoke();
                }
                return true;
            }
        }
        return super.dispatchKeyEvent(keyEvent);
    }

    /* renamed from: f */
    public final void m15053f(AbstractC3969r abstractC3969r, InterfaceC2141e interfaceC2141e) {
        setParentCompositionContext(abstractC3969r);
        setContent(interfaceC2141e);
        this.f38143t = true;
    }

    /* renamed from: g */
    public final void m15054g(InterfaceC2137a interfaceC2137a, C7931w c7931w, String str, EnumC6757m enumC6757m) {
        this.f38126a = interfaceC2137a;
        this.f38128c = str;
        if (!AbstractC4154l.m8918a(this.f38127b, c7931w)) {
            c7931w.getClass();
            this.f38127b = c7931w;
            boolean zM15049c = AbstractC7917i.m15049c(this.f38129d);
            boolean z6 = c7931w.f38146b;
            int i10 = c7931w.f38145a;
            if (z6 && zM15049c) {
                i10 |= 8192;
            } else if (z6 && !zM15049c) {
                i10 &= -8193;
            }
            WindowManager.LayoutParams layoutParams = this.f38132g;
            layoutParams.flags = i10;
            this.f38130e.getClass();
            this.f38131f.updateViewLayout(this, layoutParams);
        }
        int i11 = AbstractC7925q.f38120a[enumC6757m.ordinal()];
        int i12 = 1;
        if (i11 == 1) {
            i12 = 0;
        } else if (i11 != 2) {
            throw new NoWhenBranchMatchedException();
        }
        super.setLayoutDirection(i12);
    }

    public final boolean getCanCalculatePosition() {
        return ((Boolean) this.f38138n.getValue()).booleanValue();
    }

    public final WindowManager.LayoutParams getParams$ui_release() {
        return this.f38132g;
    }

    public final EnumC6757m getParentLayoutDirection() {
        return this.f38134j;
    }

    /* renamed from: getPopupContentSize-bOM6tXw, reason: not valid java name */
    public final C6756l m16704getPopupContentSizebOM6tXw() {
        return (C6756l) this.f38135k.getValue();
    }

    public final InterfaceC7930v getPositionProvider() {
        return this.f38133h;
    }

    @Override // w3.AbstractC7883a
    public boolean getShouldCreateCompositionOnAttachedToWindow() {
        return this.f38143t;
    }

    public final String getTestTag() {
        return this.f38128c;
    }

    public /* bridge */ /* synthetic */ View getViewRoot() {
        return null;
    }

    /* renamed from: h */
    public final void m15055h() {
        InterfaceC7033t parentLayoutCoordinates = getParentLayoutCoordinates();
        if (parentLayoutCoordinates != null) {
            if (!parentLayoutCoordinates.mo13305s()) {
                parentLayoutCoordinates = null;
            }
            if (parentLayoutCoordinates == null) {
                return;
            }
            long jMo13307v = parentLayoutCoordinates.mo13307v();
            long jMo13303f = parentLayoutCoordinates.mo13303f(0L);
            C6755k c6755kM11069a = ye.m11069a((Math.round(Float.intBitsToFloat((int) (jMo13303f >> 32))) << 32) | (4294967295L & Math.round(Float.intBitsToFloat((int) (jMo13303f & 4294967295L)))), jMo13307v);
            if (c6755kM11069a.equals(this.f38137m)) {
                return;
            }
            this.f38137m = c6755kM11069a;
            m15057j();
        }
    }

    /* renamed from: i */
    public final void m15056i(InterfaceC7033t interfaceC7033t) {
        setParentLayoutCoordinates(interfaceC7033t);
        m15055h();
    }

    @Override // w3.AbstractC7883a
    public final void internalOnLayout$ui_release(boolean z6, int i10, int i11, int i12, int i13) {
        super.internalOnLayout$ui_release(z6, i10, i11, i12, i13);
        this.f38127b.getClass();
        View childAt = getChildAt(0);
        if (childAt == null) {
            return;
        }
        int measuredWidth = childAt.getMeasuredWidth();
        WindowManager.LayoutParams layoutParams = this.f38132g;
        layoutParams.width = measuredWidth;
        layoutParams.height = childAt.getMeasuredHeight();
        this.f38130e.getClass();
        this.f38131f.updateViewLayout(this, layoutParams);
    }

    @Override // w3.AbstractC7883a
    public final void internalOnMeasure$ui_release(int i10, int i11) {
        this.f38127b.getClass();
        C6755k visibleDisplayBounds = getVisibleDisplayBounds();
        super.internalOnMeasure$ui_release(View.MeasureSpec.makeMeasureSpec(visibleDisplayBounds.m12947d(), Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(visibleDisplayBounds.m12945b(), Integer.MIN_VALUE));
    }

    /* renamed from: j */
    public final void m15057j() {
        C6756l c6756lM16704getPopupContentSizebOM6tXw;
        C6755k c6755k = this.f38137m;
        if (c6755k == null || (c6756lM16704getPopupContentSizebOM6tXw = m16704getPopupContentSizebOM6tXw()) == null) {
            return;
        }
        long j6 = c6756lM16704getPopupContentSizebOM6tXw.f32210a;
        C6755k visibleDisplayBounds = getVisibleDisplayBounds();
        long jM12945b = (visibleDisplayBounds.m12945b() & 4294967295L) | (visibleDisplayBounds.m12947d() << 32);
        C4167y c4167y = new C4167y();
        c4167y.f21163a = 0L;
        this.f38140q.m13721d(this, C7911c.f38080g, new C7926r(c4167y, this, c6755k, jM12945b, j6));
        long j10 = c4167y.f21163a;
        WindowManager.LayoutParams layoutParams = this.f38132g;
        layoutParams.x = (int) (j10 >> 32);
        layoutParams.y = (int) (j10 & 4294967295L);
        boolean z6 = this.f38127b.f38149e;
        C7929u c7929u = this.f38130e;
        if (z6) {
            c7929u.mo15058a(this, (int) (jM12945b >> 32), (int) (jM12945b & 4294967295L));
        }
        c7929u.getClass();
        this.f38131f.updateViewLayout(this, layoutParams);
    }

    @Override // w3.AbstractC7883a, android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f38140q.m13722e();
        if (!this.f38127b.f38147c || Build.VERSION.SDK_INT < 33) {
            return;
        }
        if (this.f38141r == null) {
            this.f38141r = new e7(1, this.f38126a);
        }
        AbstractC1614d.m5272h(this, this.f38141r);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        C7325v c7325v = this.f38140q;
        a1.c0 c0Var = c7325v.f34932h;
        if (c0Var != null) {
            c0Var.m29k();
        }
        c7325v.m13719b();
        if (Build.VERSION.SDK_INT >= 33) {
            AbstractC1614d.m5273i(this, this.f38141r);
        }
        this.f38141r = null;
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (!this.f38127b.f38148d) {
            return super.onTouchEvent(motionEvent);
        }
        if (motionEvent != null && motionEvent.getAction() == 0 && (motionEvent.getX() < DefinitionKt.NO_Float_VALUE || motionEvent.getX() >= getWidth() || motionEvent.getY() < DefinitionKt.NO_Float_VALUE || motionEvent.getY() >= getHeight())) {
            InterfaceC2137a interfaceC2137a = this.f38126a;
            if (interfaceC2137a != null) {
                interfaceC2137a.invoke();
            }
            return true;
        }
        if (motionEvent == null || motionEvent.getAction() != 4) {
            return super.onTouchEvent(motionEvent);
        }
        InterfaceC2137a interfaceC2137a2 = this.f38126a;
        if (interfaceC2137a2 != null) {
            interfaceC2137a2.invoke();
        }
        return true;
    }

    public final void setParentLayoutDirection(EnumC6757m enumC6757m) {
        this.f38134j = enumC6757m;
    }

    /* renamed from: setPopupContentSize-fhxjrPA, reason: not valid java name */
    public final void m16705setPopupContentSizefhxjrPA(C6756l c6756l) {
        this.f38135k.setValue(c6756l);
    }

    public final void setPositionProvider(InterfaceC7930v interfaceC7930v) {
        this.f38133h = interfaceC7930v;
    }

    public final void setTestTag(String str) {
        this.f38128c = str;
    }

    public static /* synthetic */ void getParams$ui_release$annotations() {
    }

    public AbstractC7883a getSubCompositionView() {
        return this;
    }

    @Override // android.view.View
    public void setLayoutDirection(int i10) {
    }
}
