package androidx.compose.ui.platform;

import android.content.Context;
import android.os.IBinder;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import java.lang.ref.WeakReference;
import p001o.ap3;
import p001o.bbj;
import p001o.bp3;
import p001o.go3;
import p001o.id5;
import p001o.kf9;
import p001o.nl7;
import p001o.pn3;
import p001o.sgc;
import p001o.sq8;
import p001o.uee;
import p001o.uk7;
import p001o.un3;
import p001o.wcj;
import p001o.y3i;

/* loaded from: classes2.dex */
public abstract class AbstractComposeView extends ViewGroup {

    /* renamed from: a */
    public WeakReference f6319a;

    /* renamed from: b */
    public IBinder f6320b;

    /* renamed from: c */
    public ap3 f6321c;

    /* renamed from: d */
    public bp3 f6322d;

    /* renamed from: e */
    public uk7 f6323e;

    /* renamed from: f */
    public boolean f6324f;

    /* renamed from: g */
    public boolean f6325g;

    /* renamed from: h */
    public boolean f6326h;

    /* renamed from: androidx.compose.ui.platform.AbstractComposeView$a */
    public static final class C1941a extends kf9 implements nl7 {
        public C1941a() {
            super(2);
        }

        /* renamed from: a */
        public final void m5029a(un3 un3Var, int i) {
            if ((i & 11) == 2 && un3Var.mo27201c()) {
                un3Var.mo27211m();
                return;
            }
            if (go3.m29189I()) {
                go3.m29200T(-656146368, i, -1, "androidx.compose.ui.platform.AbstractComposeView.ensureCompositionCreated.<anonymous> (ComposeView.android.kt:250)");
            }
            AbstractComposeView.this.mo5019a(un3Var, 8);
            if (go3.m29189I()) {
                go3.m29199S();
            }
        }

        @Override // p001o.nl7
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            m5029a((un3) obj, ((Number) obj2).intValue());
            return y3i.f54824a;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public AbstractComposeView(Context context) {
        this(context, null, 0, 6, null);
        sq8.m48649h(context, "context");
    }

    private static /* synthetic */ void getDisposeViewCompositionStrategy$annotations() {
    }

    public static /* synthetic */ void getShowLayoutBounds$annotations() {
    }

    private final void setParentContext(bp3 bp3Var) {
        if (this.f6322d != bp3Var) {
            this.f6322d = bp3Var;
            if (bp3Var != null) {
                this.f6319a = null;
            }
            ap3 ap3Var = this.f6321c;
            if (ap3Var != null) {
                ap3Var.dispose();
                this.f6321c = null;
                if (isAttachedToWindow()) {
                    m5024f();
                }
            }
        }
    }

    private final void setPreviousAttachedWindowToken(IBinder iBinder) {
        if (this.f6320b != iBinder) {
            this.f6320b = iBinder;
            this.f6319a = null;
        }
    }

    /* renamed from: a */
    public abstract void mo5019a(un3 un3Var, int i);

    @Override // android.view.ViewGroup
    public void addView(View view) {
        m5021c();
        super.addView(view);
    }

    @Override // android.view.ViewGroup
    public boolean addViewInLayout(View view, int i, ViewGroup.LayoutParams layoutParams) {
        m5021c();
        return super.addViewInLayout(view, i, layoutParams);
    }

    /* renamed from: b */
    public final bp3 m5020b(bp3 bp3Var) {
        bp3 bp3Var2 = m5027i(bp3Var) ? bp3Var : null;
        if (bp3Var2 != null) {
            this.f6319a = new WeakReference(bp3Var2);
        }
        return bp3Var;
    }

    /* renamed from: c */
    public final void m5021c() {
        if (this.f6325g) {
            return;
        }
        throw new UnsupportedOperationException("Cannot add views to " + getClass().getSimpleName() + "; only Compose content is supported");
    }

    /* renamed from: d */
    public final void m5022d() {
        if (!(this.f6322d != null || isAttachedToWindow())) {
            throw new IllegalStateException("createComposition requires either a parent reference or the View to be attachedto a window. Attach the View or call setParentCompositionReference.".toString());
        }
        m5024f();
    }

    /* renamed from: e */
    public final void m5023e() {
        ap3 ap3Var = this.f6321c;
        if (ap3Var != null) {
            ap3Var.dispose();
        }
        this.f6321c = null;
        requestLayout();
    }

    /* renamed from: f */
    public final void m5024f() {
        if (this.f6321c == null) {
            try {
                this.f6325g = true;
                this.f6321c = wcj.m54230d(this, m5028j(), pn3.m43904c(-656146368, true, new C1941a()));
            } finally {
                this.f6325g = false;
            }
        }
    }

    /* renamed from: g */
    public void mo5025g(boolean z, int i, int i2, int i3, int i4) {
        View childAt = getChildAt(0);
        if (childAt != null) {
            childAt.layout(getPaddingLeft(), getPaddingTop(), (i3 - i) - getPaddingRight(), (i4 - i2) - getPaddingBottom());
        }
    }

    public final boolean getHasComposition() {
        return this.f6321c != null;
    }

    public boolean getShouldCreateCompositionOnAttachedToWindow() {
        return true;
    }

    public final boolean getShowLayoutBounds() {
        return this.f6324f;
    }

    /* renamed from: h */
    public void mo5026h(int i, int i2) {
        View childAt = getChildAt(0);
        if (childAt == null) {
            super.onMeasure(i, i2);
            return;
        }
        childAt.measure(View.MeasureSpec.makeMeasureSpec(Math.max(0, (View.MeasureSpec.getSize(i) - getPaddingLeft()) - getPaddingRight()), View.MeasureSpec.getMode(i)), View.MeasureSpec.makeMeasureSpec(Math.max(0, (View.MeasureSpec.getSize(i2) - getPaddingTop()) - getPaddingBottom()), View.MeasureSpec.getMode(i2)));
        setMeasuredDimension(childAt.getMeasuredWidth() + getPaddingLeft() + getPaddingRight(), childAt.getMeasuredHeight() + getPaddingTop() + getPaddingBottom());
    }

    /* renamed from: i */
    public final boolean m5027i(bp3 bp3Var) {
        return !(bp3Var instanceof uee) || ((uee.EnumC17360d) ((uee) bp3Var).m51437W().getValue()).compareTo(uee.EnumC17360d.ShuttingDown) > 0;
    }

    @Override // android.view.ViewGroup
    public boolean isTransitionGroup() {
        return !this.f6326h || super.isTransitionGroup();
    }

    /* renamed from: j */
    public final bp3 m5028j() {
        bp3 bp3Var;
        bp3 bp3Var2 = this.f6322d;
        if (bp3Var2 != null) {
            return bp3Var2;
        }
        bp3 bp3VarM18552d = bbj.m18552d(this);
        bp3 bp3Var3 = null;
        bp3 bp3VarM5020b = bp3VarM18552d != null ? m5020b(bp3VarM18552d) : null;
        if (bp3VarM5020b != null) {
            return bp3VarM5020b;
        }
        WeakReference weakReference = this.f6319a;
        if (weakReference != null && (bp3Var = (bp3) weakReference.get()) != null && m5027i(bp3Var)) {
            bp3Var3 = bp3Var;
        }
        bp3 bp3Var4 = bp3Var3;
        return bp3Var4 == null ? m5020b(bbj.m18556h(this)) : bp3Var4;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        setPreviousAttachedWindowToken(getWindowToken());
        if (getShouldCreateCompositionOnAttachedToWindow()) {
            m5024f();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        mo5025g(z, i, i2, i3, i4);
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        m5024f();
        mo5026h(i, i2);
    }

    @Override // android.view.View
    public void onRtlPropertiesChanged(int i) {
        View childAt = getChildAt(0);
        if (childAt == null) {
            return;
        }
        childAt.setLayoutDirection(i);
    }

    public final void setParentCompositionContext(bp3 bp3Var) {
        setParentContext(bp3Var);
    }

    public final void setShowLayoutBounds(boolean z) {
        this.f6324f = z;
        KeyEvent.Callback childAt = getChildAt(0);
        if (childAt != null) {
            ((sgc) childAt).setShowLayoutBounds(z);
        }
    }

    @Override // android.view.ViewGroup
    public void setTransitionGroup(boolean z) {
        super.setTransitionGroup(z);
        this.f6326h = true;
    }

    public final void setViewCompositionStrategy(InterfaceC1968i interfaceC1968i) {
        sq8.m48649h(interfaceC1968i, "strategy");
        uk7 uk7Var = this.f6323e;
        if (uk7Var != null) {
            uk7Var.invoke();
        }
        this.f6323e = interfaceC1968i.mo5267a(this);
    }

    @Override // android.view.ViewGroup
    public boolean shouldDelayChildPressedState() {
        return false;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public AbstractComposeView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        sq8.m48649h(context, "context");
    }

    public /* synthetic */ AbstractComposeView(Context context, AttributeSet attributeSet, int i, int i2, id5 id5Var) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i) {
        m5021c();
        super.addView(view, i);
    }

    @Override // android.view.ViewGroup
    public boolean addViewInLayout(View view, int i, ViewGroup.LayoutParams layoutParams, boolean z) {
        m5021c();
        return super.addViewInLayout(view, i, layoutParams, z);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbstractComposeView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        sq8.m48649h(context, "context");
        setClipChildren(false);
        setClipToPadding(false);
        this.f6323e = InterfaceC1968i.f6509a.m5268a().mo5267a(this);
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i, int i2) {
        m5021c();
        super.addView(view, i, i2);
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public void addView(View view, ViewGroup.LayoutParams layoutParams) {
        m5021c();
        super.addView(view, layoutParams);
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        m5021c();
        super.addView(view, i, layoutParams);
    }
}
