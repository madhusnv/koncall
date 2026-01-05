package androidx.compose.ui.window;

import android.annotation.SuppressLint;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.WindowManager;
import androidx.compose.ui.platform.AbstractComposeView;
import com.google.firebase.analytics.FirebaseAnalytics;
import p001o.bp3;
import p001o.bqb;
import p001o.czi;
import p001o.g6f;
import p001o.go3;
import p001o.hf0;
import p001o.kf9;
import p001o.lza;
import p001o.mh9;
import p001o.ml8;
import p001o.ned;
import p001o.nl7;
import p001o.p4g;
import p001o.qh9;
import p001o.see;
import p001o.sq8;
import p001o.tq;
import p001o.un3;
import p001o.waf;
import p001o.xaf;
import p001o.y3i;

@SuppressLint({"ViewConstructor"})
/* loaded from: classes2.dex */
public final class PopupLayout extends AbstractComposeView implements czi {

    /* renamed from: H */
    public final bqb f6554H;

    /* renamed from: L */
    public final bqb f6555L;

    /* renamed from: M */
    public final p4g f6556M;

    /* renamed from: Q */
    public final bqb f6557Q;
    public boolean h0;

    /* renamed from: q */
    public String f6558q;

    /* renamed from: s */
    public final View f6559s;

    /* renamed from: x */
    public final WindowManager.LayoutParams f6560x;

    /* renamed from: y */
    public qh9 f6561y;

    /* renamed from: androidx.compose.ui.window.PopupLayout$a */
    public static final class C1975a extends kf9 implements nl7 {

        /* renamed from: b */
        public final /* synthetic */ int f6563b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C1975a(int i) {
            super(2);
            this.f6563b = i;
        }

        /* renamed from: a */
        public final void m5296a(un3 un3Var, int i) {
            PopupLayout.this.mo5019a(un3Var, see.m48284a(this.f6563b | 1));
        }

        @Override // p001o.nl7
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            m5296a((un3) obj, ((Number) obj2).intValue());
            return y3i.f54824a;
        }
    }

    private final nl7 getContent() {
        return (nl7) this.f6557Q.getValue();
    }

    private final int getDisplayHeight() {
        return lza.m38121d(getContext().getResources().getConfiguration().screenHeightDp * getContext().getResources().getDisplayMetrics().density);
    }

    private final int getDisplayWidth() {
        return lza.m38121d(getContext().getResources().getConfiguration().screenWidthDp * getContext().getResources().getDisplayMetrics().density);
    }

    public static /* synthetic */ void getParams$ui_release$annotations() {
    }

    private final mh9 getParentLayoutCoordinates() {
        return (mh9) this.f6555L.getValue();
    }

    private final void setClippingEnabled(boolean z) {
        m5295k(z ? this.f6560x.flags & (-513) : this.f6560x.flags | 512);
    }

    private final void setContent(nl7 nl7Var) {
        this.f6557Q.setValue(nl7Var);
    }

    private final void setIsFocusable(boolean z) {
        m5295k(!z ? this.f6560x.flags | 8 : this.f6560x.flags & (-9));
    }

    private final void setParentLayoutCoordinates(mh9 mh9Var) {
        this.f6555L.setValue(mh9Var);
    }

    private final void setSecurePolicy(waf wafVar) {
        m5295k(xaf.m55917a(wafVar, hf0.m30317a(this.f6559s)) ? this.f6560x.flags | 8192 : this.f6560x.flags & (-8193));
    }

    @Override // androidx.compose.ui.platform.AbstractComposeView
    /* renamed from: a */
    public void mo5019a(un3 un3Var, int i) {
        un3 un3VarMo27200b = un3Var.mo27200b(-857613600);
        if (go3.m29189I()) {
            go3.m29200T(-857613600, i, -1, "androidx.compose.ui.window.PopupLayout.Content (AndroidPopup.android.kt:463)");
        }
        getContent().invoke(un3VarMo27200b, 0);
        if (go3.m29189I()) {
            go3.m29199S();
        }
        g6f g6fVarMo27202d = un3VarMo27200b.mo27202d();
        if (g6fVarMo27202d == null) {
            return;
        }
        g6fVarMo27202d.mo28099a(new C1975a(i));
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        sq8.m48649h(keyEvent, "event");
        if (keyEvent.getKeyCode() != 4) {
            return super.dispatchKeyEvent(keyEvent);
        }
        throw null;
    }

    @Override // androidx.compose.ui.platform.AbstractComposeView
    /* renamed from: g */
    public void mo5025g(boolean z, int i, int i2, int i3, int i4) {
        super.mo5025g(z, i, i2, i3, i4);
        throw null;
    }

    public final boolean getCanCalculatePosition() {
        return ((Boolean) this.f6556M.getValue()).booleanValue();
    }

    public final WindowManager.LayoutParams getParams$ui_release() {
        return this.f6560x;
    }

    public final qh9 getParentLayoutDirection() {
        return this.f6561y;
    }

    /* renamed from: getPopupContentSize-bOM6tXw, reason: not valid java name */
    public final ml8 m68697getPopupContentSizebOM6tXw() {
        tq.m50332a(this.f6554H.getValue());
        return null;
    }

    public final ned getPositionProvider() {
        return null;
    }

    @Override // androidx.compose.ui.platform.AbstractComposeView
    public boolean getShouldCreateCompositionOnAttachedToWindow() {
        return this.h0;
    }

    @Override // p001o.czi
    public AbstractComposeView getSubCompositionView() {
        return this;
    }

    public final String getTestTag() {
        return this.f6558q;
    }

    @Override // p001o.czi
    public /* bridge */ /* synthetic */ View getViewRoot() {
        return super.getViewRoot();
    }

    @Override // androidx.compose.ui.platform.AbstractComposeView
    /* renamed from: h */
    public void mo5026h(int i, int i2) {
        throw null;
    }

    /* renamed from: k */
    public final void m5295k(int i) {
        this.f6560x.flags = i;
        throw null;
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        throw null;
    }

    @Override // android.view.View
    public void setLayoutDirection(int i) {
    }

    public final void setParentLayoutDirection(qh9 qh9Var) {
        sq8.m48649h(qh9Var, "<set-?>");
        this.f6561y = qh9Var;
    }

    /* renamed from: setPopupContentSize-fhxjrPA, reason: not valid java name */
    public final void m68698setPopupContentSizefhxjrPA(ml8 ml8Var) {
        this.f6554H.setValue(ml8Var);
    }

    public final void setPositionProvider(ned nedVar) {
        sq8.m48649h(nedVar, "<set-?>");
    }

    public final void setTestTag(String str) {
        sq8.m48649h(str, "<set-?>");
        this.f6558q = str;
    }

    public final void setContent(bp3 bp3Var, nl7 nl7Var) {
        sq8.m48649h(bp3Var, "parent");
        sq8.m48649h(nl7Var, FirebaseAnalytics.Param.CONTENT);
        setParentCompositionContext(bp3Var);
        setContent(nl7Var);
        this.h0 = true;
    }
}
