package p013o;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListAdapter;
import android.widget.ListView;
import bk.RunnableC0683n;
import com.websoptimization.callyzerbiz.R;
import g6.ViewOnTouchListenerC2530e;
import java.lang.reflect.InvocationTargetException;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public abstract class x0 extends ListView {

    /* renamed from: a */
    public final Rect f25670a;

    /* renamed from: b */
    public int f25671b;

    /* renamed from: c */
    public int f25672c;

    /* renamed from: d */
    public int f25673d;

    /* renamed from: e */
    public int f25674e;

    /* renamed from: f */
    public int f25675f;

    /* renamed from: g */
    public v0 f25676g;

    /* renamed from: h */
    public boolean f25677h;

    /* renamed from: j */
    public final boolean f25678j;

    /* renamed from: k */
    public boolean f25679k;

    /* renamed from: l */
    public ViewOnTouchListenerC2530e f25680l;

    /* renamed from: m */
    public RunnableC0683n f25681m;

    public x0(Context context, boolean z6) {
        super(context, null, R.attr.dropDownListViewStyle);
        this.f25670a = new Rect();
        this.f25671b = 0;
        this.f25672c = 0;
        this.f25673d = 0;
        this.f25674e = 0;
        this.f25678j = z6;
        setCacheColorHint(0);
    }

    /* renamed from: a */
    public final int m10302a(int i10, int i11) {
        int listPaddingTop = getListPaddingTop();
        int listPaddingBottom = getListPaddingBottom();
        int dividerHeight = getDividerHeight();
        Drawable divider = getDivider();
        ListAdapter adapter = getAdapter();
        if (adapter == null) {
            return listPaddingTop + listPaddingBottom;
        }
        int measuredHeight = listPaddingTop + listPaddingBottom;
        if (dividerHeight <= 0 || divider == null) {
            dividerHeight = 0;
        }
        int count = adapter.getCount();
        int i12 = 0;
        View view = null;
        for (int i13 = 0; i13 < count; i13++) {
            int itemViewType = adapter.getItemViewType(i13);
            if (itemViewType != i12) {
                view = null;
                i12 = itemViewType;
            }
            view = adapter.getView(i13, view, this);
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams == null) {
                layoutParams = generateDefaultLayoutParams();
                view.setLayoutParams(layoutParams);
            }
            int i14 = layoutParams.height;
            view.measure(i10, i14 > 0 ? View.MeasureSpec.makeMeasureSpec(i14, 1073741824) : View.MeasureSpec.makeMeasureSpec(0, 0));
            view.forceLayout();
            if (i13 > 0) {
                measuredHeight += dividerHeight;
            }
            measuredHeight += view.getMeasuredHeight();
            if (measuredHeight >= i11) {
                return i11;
            }
        }
        return measuredHeight;
    }

    /* JADX WARN: Removed duplicated region for block: B:82:0x014c  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0162  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0167  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x017d  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0015  */
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean m10303b(android.view.MotionEvent r18, int r19) throws java.lang.IllegalAccessException, java.lang.IllegalArgumentException {
        /*
            Method dump skipped, instructions count: 396
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p013o.x0.m10303b(android.view.MotionEvent, int):boolean");
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        Drawable selector;
        Rect rect = this.f25670a;
        if (!rect.isEmpty() && (selector = getSelector()) != null) {
            selector.setBounds(rect);
            selector.draw(canvas);
        }
        super.dispatchDraw(canvas);
    }

    @Override // android.widget.AbsListView, android.view.ViewGroup, android.view.View
    public final void drawableStateChanged() {
        if (this.f25681m != null) {
            return;
        }
        super.drawableStateChanged();
        v0 v0Var = this.f25676g;
        if (v0Var != null) {
            v0Var.f25657b = true;
        }
        Drawable selector = getSelector();
        if (selector != null && this.f25679k && isPressed()) {
            selector.setState(getDrawableState());
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean hasFocus() {
        return this.f25678j || super.hasFocus();
    }

    @Override // android.view.View
    public final boolean hasWindowFocus() {
        return this.f25678j || super.hasWindowFocus();
    }

    @Override // android.view.View
    public final boolean isFocused() {
        return this.f25678j || super.isFocused();
    }

    @Override // android.view.View
    public final boolean isInTouchMode() {
        return (this.f25678j && this.f25677h) || super.isInTouchMode();
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.widget.AdapterView, android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        this.f25681m = null;
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    public boolean onHoverEvent(MotionEvent motionEvent) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        int i10 = Build.VERSION.SDK_INT;
        if (i10 < 26) {
            return super.onHoverEvent(motionEvent);
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 10 && this.f25681m == null) {
            RunnableC0683n runnableC0683n = new RunnableC0683n(8, this);
            this.f25681m = runnableC0683n;
            post(runnableC0683n);
        }
        boolean zOnHoverEvent = super.onHoverEvent(motionEvent);
        if (actionMasked != 9 && actionMasked != 7) {
            setSelection(-1);
            return zOnHoverEvent;
        }
        int iPointToPosition = pointToPosition((int) motionEvent.getX(), (int) motionEvent.getY());
        if (iPointToPosition != -1 && iPointToPosition != getSelectedItemPosition()) {
            View childAt = getChildAt(iPointToPosition - getFirstVisiblePosition());
            if (childAt.isEnabled()) {
                requestFocus();
                if (i10 < 30 || !t0.f25650d) {
                    setSelectionFromTop(iPointToPosition, childAt.getTop() - getTop());
                } else {
                    try {
                        t0.f25647a.invoke(this, Integer.valueOf(iPointToPosition), childAt, Boolean.FALSE, -1, -1);
                        t0.f25648b.invoke(this, Integer.valueOf(iPointToPosition));
                        t0.f25649c.invoke(this, Integer.valueOf(iPointToPosition));
                    } catch (IllegalAccessException e2) {
                        e2.printStackTrace();
                    } catch (InvocationTargetException e10) {
                        e10.printStackTrace();
                    }
                }
            }
            Drawable selector = getSelector();
            if (selector != null && this.f25679k && isPressed()) {
                selector.setState(getDrawableState());
            }
        }
        return zOnHoverEvent;
    }

    @Override // android.widget.AbsListView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            this.f25675f = pointToPosition((int) motionEvent.getX(), (int) motionEvent.getY());
        }
        RunnableC0683n runnableC0683n = this.f25681m;
        if (runnableC0683n != null) {
            x0 x0Var = (x0) runnableC0683n.f4290b;
            x0Var.f25681m = null;
            x0Var.removeCallbacks(runnableC0683n);
        }
        return super.onTouchEvent(motionEvent);
    }

    public void setListSelectionHidden(boolean z6) {
        this.f25677h = z6;
    }

    @Override // android.widget.AbsListView
    public void setSelector(Drawable drawable) {
        v0 v0Var = null;
        if (drawable != null) {
            v0 v0Var2 = new v0();
            Drawable drawable2 = v0Var2.f25656a;
            if (drawable2 != null) {
                drawable2.setCallback(null);
            }
            v0Var2.f25656a = drawable;
            drawable.setCallback(v0Var2);
            v0Var2.f25657b = true;
            v0Var = v0Var2;
        }
        this.f25676g = v0Var;
        super.setSelector(v0Var);
        Rect rect = new Rect();
        if (drawable != null) {
            drawable.getPadding(rect);
        }
        this.f25671b = rect.left;
        this.f25672c = rect.top;
        this.f25673d = rect.right;
        this.f25674e = rect.bottom;
    }
}
