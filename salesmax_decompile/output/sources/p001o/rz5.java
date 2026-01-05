package p001o;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.AdapterView;
import android.widget.ListAdapter;
import android.widget.ListView;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* loaded from: classes2.dex */
public class rz5 extends ListView {

    /* renamed from: H */
    public RunnableC16687f f44291H;

    /* renamed from: a */
    public final Rect f44292a;

    /* renamed from: b */
    public int f44293b;

    /* renamed from: c */
    public int f44294c;

    /* renamed from: d */
    public int f44295d;

    /* renamed from: e */
    public int f44296e;

    /* renamed from: f */
    public int f44297f;

    /* renamed from: g */
    public C16685d f44298g;

    /* renamed from: h */
    public boolean f44299h;

    /* renamed from: q */
    public boolean f44300q;

    /* renamed from: s */
    public boolean f44301s;

    /* renamed from: x */
    public xyi f44302x;

    /* renamed from: y */
    public rfa f44303y;

    /* renamed from: o.rz5$a */
    public static class C16682a {
        /* renamed from: a */
        public static void m47334a(View view, float f, float f2) {
            view.drawableHotspotChanged(f, f2);
        }
    }

    /* renamed from: o.rz5$b */
    public static class C16683b {

        /* renamed from: a */
        public static Method f44304a;

        /* renamed from: b */
        public static Method f44305b;

        /* renamed from: c */
        public static Method f44306c;

        /* renamed from: d */
        public static boolean f44307d;

        static {
            try {
                Class cls = Integer.TYPE;
                Class cls2 = Float.TYPE;
                Method declaredMethod = AbsListView.class.getDeclaredMethod("positionSelector", cls, View.class, Boolean.TYPE, cls2, cls2);
                f44304a = declaredMethod;
                declaredMethod.setAccessible(true);
                Method declaredMethod2 = AdapterView.class.getDeclaredMethod("setSelectedPositionInt", cls);
                f44305b = declaredMethod2;
                declaredMethod2.setAccessible(true);
                Method declaredMethod3 = AdapterView.class.getDeclaredMethod("setNextSelectedPositionInt", cls);
                f44306c = declaredMethod3;
                declaredMethod3.setAccessible(true);
                f44307d = true;
            } catch (NoSuchMethodException e) {
                e.printStackTrace();
            }
        }

        /* renamed from: a */
        public static boolean m47335a() {
            return f44307d;
        }

        /* renamed from: b */
        public static void m47336b(rz5 rz5Var, int i, View view) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
            try {
                f44304a.invoke(rz5Var, Integer.valueOf(i), view, Boolean.FALSE, -1, -1);
                f44305b.invoke(rz5Var, Integer.valueOf(i));
                f44306c.invoke(rz5Var, Integer.valueOf(i));
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            } catch (InvocationTargetException e2) {
                e2.printStackTrace();
            }
        }
    }

    /* renamed from: o.rz5$c */
    public static class C16684c {
        /* renamed from: a */
        public static boolean m47337a(AbsListView absListView) {
            return absListView.isSelectedChildViewEnabled();
        }

        /* renamed from: b */
        public static void m47338b(AbsListView absListView, boolean z) {
            absListView.setSelectedChildViewEnabled(z);
        }
    }

    /* renamed from: o.rz5$d */
    public static class C16685d extends zy5 {

        /* renamed from: b */
        public boolean f44308b;

        public C16685d(Drawable drawable) {
            super(drawable);
            this.f44308b = true;
        }

        /* renamed from: b */
        public void m47339b(boolean z) {
            this.f44308b = z;
        }

        @Override // p001o.zy5, android.graphics.drawable.Drawable
        public void draw(Canvas canvas) {
            if (this.f44308b) {
                super.draw(canvas);
            }
        }

        @Override // p001o.zy5, android.graphics.drawable.Drawable
        public void setHotspot(float f, float f2) {
            if (this.f44308b) {
                super.setHotspot(f, f2);
            }
        }

        @Override // p001o.zy5, android.graphics.drawable.Drawable
        public void setHotspotBounds(int i, int i2, int i3, int i4) {
            if (this.f44308b) {
                super.setHotspotBounds(i, i2, i3, i4);
            }
        }

        @Override // p001o.zy5, android.graphics.drawable.Drawable
        public boolean setState(int[] iArr) {
            if (this.f44308b) {
                return super.setState(iArr);
            }
            return false;
        }

        @Override // p001o.zy5, android.graphics.drawable.Drawable
        public boolean setVisible(boolean z, boolean z2) {
            if (this.f44308b) {
                return super.setVisible(z, z2);
            }
            return false;
        }
    }

    /* renamed from: o.rz5$e */
    public static class C16686e {

        /* renamed from: a */
        public static final Field f44309a;

        static {
            Field declaredField = null;
            try {
                declaredField = AbsListView.class.getDeclaredField("mIsChildViewEnabled");
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException e) {
                e.printStackTrace();
            }
            f44309a = declaredField;
        }

        /* renamed from: a */
        public static boolean m47340a(AbsListView absListView) {
            Field field = f44309a;
            if (field == null) {
                return false;
            }
            try {
                return field.getBoolean(absListView);
            } catch (IllegalAccessException e) {
                e.printStackTrace();
                return false;
            }
        }

        /* renamed from: b */
        public static void m47341b(AbsListView absListView, boolean z) throws IllegalAccessException, IllegalArgumentException {
            Field field = f44309a;
            if (field != null) {
                try {
                    field.set(absListView, Boolean.valueOf(z));
                } catch (IllegalAccessException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    /* renamed from: o.rz5$f */
    public class RunnableC16687f implements Runnable {
        public RunnableC16687f() {
        }

        /* renamed from: a */
        public void m47342a() {
            rz5 rz5Var = rz5.this;
            rz5Var.f44291H = null;
            rz5Var.removeCallbacks(this);
        }

        /* renamed from: b */
        public void m47343b() {
            rz5.this.post(this);
        }

        @Override // java.lang.Runnable
        public void run() {
            rz5 rz5Var = rz5.this;
            rz5Var.f44291H = null;
            rz5Var.drawableStateChanged();
        }
    }

    public rz5(Context context, boolean z) {
        super(context, null, z5e.dropDownListViewStyle);
        this.f44292a = new Rect();
        this.f44293b = 0;
        this.f44294c = 0;
        this.f44295d = 0;
        this.f44296e = 0;
        this.f44300q = z;
        setCacheColorHint(0);
    }

    /* renamed from: a */
    public final void m47322a() {
        this.f44301s = false;
        setPressed(false);
        drawableStateChanged();
        View childAt = getChildAt(this.f44297f - getFirstVisiblePosition());
        if (childAt != null) {
            childAt.setPressed(false);
        }
        xyi xyiVar = this.f44302x;
        if (xyiVar != null) {
            xyiVar.m56974c();
            this.f44302x = null;
        }
    }

    /* renamed from: b */
    public final void m47323b(View view, int i) {
        performItemClick(view, i, getItemIdAtPosition(i));
    }

    /* renamed from: c */
    public final void m47324c(Canvas canvas) {
        Drawable selector;
        if (this.f44292a.isEmpty() || (selector = getSelector()) == null) {
            return;
        }
        selector.setBounds(this.f44292a);
        selector.draw(canvas);
    }

    /* renamed from: d */
    public int mo4323d(int i, int i2, int i3, int i4, int i5) {
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
        int i6 = 0;
        int i7 = 0;
        int i8 = 0;
        View view = null;
        while (i6 < count) {
            int itemViewType = adapter.getItemViewType(i6);
            if (itemViewType != i7) {
                view = null;
                i7 = itemViewType;
            }
            view = adapter.getView(i6, view, this);
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams == null) {
                layoutParams = generateDefaultLayoutParams();
                view.setLayoutParams(layoutParams);
            }
            int i9 = layoutParams.height;
            view.measure(i, i9 > 0 ? View.MeasureSpec.makeMeasureSpec(i9, 1073741824) : View.MeasureSpec.makeMeasureSpec(0, 0));
            view.forceLayout();
            if (i6 > 0) {
                measuredHeight += dividerHeight;
            }
            measuredHeight += view.getMeasuredHeight();
            if (measuredHeight >= i4) {
                return (i5 < 0 || i6 <= i5 || i8 <= 0 || measuredHeight == i4) ? i4 : i8;
            }
            if (i5 >= 0 && i6 >= i5) {
                i8 = measuredHeight;
            }
            i6++;
        }
        return measuredHeight;
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
        m47324c(canvas);
        super.dispatchDraw(canvas);
    }

    @Override // android.widget.AbsListView, android.view.ViewGroup, android.view.View
    public void drawableStateChanged() {
        if (this.f44291H != null) {
            return;
        }
        super.drawableStateChanged();
        m47329j(true);
        m47333n();
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0011  */
    /* renamed from: e */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean mo4324e(MotionEvent motionEvent, int i) throws IllegalAccessException, IllegalArgumentException {
        boolean z;
        boolean z2;
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 1) {
            z = false;
        } else {
            if (actionMasked != 2) {
                if (actionMasked != 3) {
                    z = true;
                    z2 = false;
                } else {
                    z2 = false;
                    z = false;
                }
                if (z || z2) {
                    m47322a();
                }
                if (z) {
                    rfa rfaVar = this.f44303y;
                    if (rfaVar != null) {
                        rfaVar.m46168m(false);
                    }
                } else {
                    if (this.f44303y == null) {
                        this.f44303y = new rfa(this);
                    }
                    this.f44303y.m46168m(true);
                    this.f44303y.onTouch(this, motionEvent);
                }
                return z;
            }
            z = true;
        }
        int iFindPointerIndex = motionEvent.findPointerIndex(i);
        if (iFindPointerIndex >= 0) {
            int x = (int) motionEvent.getX(iFindPointerIndex);
            int y = (int) motionEvent.getY(iFindPointerIndex);
            int iPointToPosition = pointToPosition(x, y);
            if (iPointToPosition == -1) {
                z2 = true;
            } else {
                View childAt = getChildAt(iPointToPosition - getFirstVisiblePosition());
                m47328i(childAt, iPointToPosition, x, y);
                if (actionMasked == 1) {
                    m47323b(childAt, iPointToPosition);
                }
                z = true;
                z2 = false;
            }
        }
        if (z) {
            m47322a();
        }
        if (z) {
        }
        return z;
    }

    /* renamed from: f */
    public final void m47325f(int i, View view) throws IllegalAccessException, IllegalArgumentException {
        Rect rect = this.f44292a;
        rect.set(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
        rect.left -= this.f44293b;
        rect.top -= this.f44294c;
        rect.right += this.f44295d;
        rect.bottom += this.f44296e;
        boolean zM47330k = m47330k();
        if (view.isEnabled() != zM47330k) {
            m47331l(!zM47330k);
            if (i != -1) {
                refreshDrawableState();
            }
        }
    }

    /* renamed from: g */
    public final void m47326g(int i, View view) throws IllegalAccessException, IllegalArgumentException {
        Drawable selector = getSelector();
        boolean z = (selector == null || i == -1) ? false : true;
        if (z) {
            selector.setVisible(false, false);
        }
        m47325f(i, view);
        if (z) {
            Rect rect = this.f44292a;
            float fExactCenterX = rect.exactCenterX();
            float fExactCenterY = rect.exactCenterY();
            selector.setVisible(getVisibility() == 0, false);
            fy5.m27737k(selector, fExactCenterX, fExactCenterY);
        }
    }

    /* renamed from: h */
    public final void m47327h(int i, View view, float f, float f2) throws IllegalAccessException, IllegalArgumentException {
        m47326g(i, view);
        Drawable selector = getSelector();
        if (selector == null || i == -1) {
            return;
        }
        fy5.m27737k(selector, f, f2);
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean hasFocus() {
        return this.f44300q || super.hasFocus();
    }

    @Override // android.view.View
    public boolean hasWindowFocus() {
        return this.f44300q || super.hasWindowFocus();
    }

    /* renamed from: i */
    public final void m47328i(View view, int i, float f, float f2) throws IllegalAccessException, IllegalArgumentException {
        View childAt;
        this.f44301s = true;
        C16682a.m47334a(this, f, f2);
        if (!isPressed()) {
            setPressed(true);
        }
        layoutChildren();
        int i2 = this.f44297f;
        if (i2 != -1 && (childAt = getChildAt(i2 - getFirstVisiblePosition())) != null && childAt != view && childAt.isPressed()) {
            childAt.setPressed(false);
        }
        this.f44297f = i;
        C16682a.m47334a(view, f - view.getLeft(), f2 - view.getTop());
        if (!view.isPressed()) {
            view.setPressed(true);
        }
        m47327h(i, view, f, f2);
        m47329j(false);
        refreshDrawableState();
    }

    @Override // android.view.View
    public boolean isFocused() {
        return this.f44300q || super.isFocused();
    }

    @Override // android.view.View
    public boolean isInTouchMode() {
        return (this.f44300q && this.f44299h) || super.isInTouchMode();
    }

    /* renamed from: j */
    public final void m47329j(boolean z) {
        C16685d c16685d = this.f44298g;
        if (c16685d != null) {
            c16685d.m47339b(z);
        }
    }

    /* renamed from: k */
    public final boolean m47330k() {
        return Build.VERSION.SDK_INT >= 33 ? C16684c.m47337a(this) : C16686e.m47340a(this);
    }

    /* renamed from: l */
    public final void m47331l(boolean z) throws IllegalAccessException, IllegalArgumentException {
        if (Build.VERSION.SDK_INT >= 33) {
            C16684c.m47338b(this, z);
        } else {
            C16686e.m47341b(this, z);
        }
    }

    /* renamed from: m */
    public final boolean m47332m() {
        return this.f44301s;
    }

    /* renamed from: n */
    public final void m47333n() {
        Drawable selector = getSelector();
        if (selector != null && m47332m() && isPressed()) {
            selector.setState(getDrawableState());
        }
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.widget.AdapterView, android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        this.f44291H = null;
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    public boolean onHoverEvent(MotionEvent motionEvent) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        int i = Build.VERSION.SDK_INT;
        if (i < 26) {
            return super.onHoverEvent(motionEvent);
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 10 && this.f44291H == null) {
            RunnableC16687f runnableC16687f = new RunnableC16687f();
            this.f44291H = runnableC16687f;
            runnableC16687f.m47343b();
        }
        boolean zOnHoverEvent = super.onHoverEvent(motionEvent);
        if (actionMasked == 9 || actionMasked == 7) {
            int iPointToPosition = pointToPosition((int) motionEvent.getX(), (int) motionEvent.getY());
            if (iPointToPosition != -1 && iPointToPosition != getSelectedItemPosition()) {
                View childAt = getChildAt(iPointToPosition - getFirstVisiblePosition());
                if (childAt.isEnabled()) {
                    requestFocus();
                    if (i < 30 || !C16683b.m47335a()) {
                        setSelectionFromTop(iPointToPosition, childAt.getTop() - getTop());
                    } else {
                        C16683b.m47336b(this, iPointToPosition, childAt);
                    }
                }
                m47333n();
            }
        } else {
            setSelection(-1);
        }
        return zOnHoverEvent;
    }

    @Override // android.widget.AbsListView, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            this.f44297f = pointToPosition((int) motionEvent.getX(), (int) motionEvent.getY());
        }
        RunnableC16687f runnableC16687f = this.f44291H;
        if (runnableC16687f != null) {
            runnableC16687f.m47342a();
        }
        return super.onTouchEvent(motionEvent);
    }

    public void setListSelectionHidden(boolean z) {
        this.f44299h = z;
    }

    @Override // android.widget.AbsListView
    public void setSelector(Drawable drawable) {
        C16685d c16685d = drawable != null ? new C16685d(drawable) : null;
        this.f44298g = c16685d;
        super.setSelector(c16685d);
        Rect rect = new Rect();
        if (drawable != null) {
            drawable.getPadding(rect);
        }
        this.f44293b = rect.left;
        this.f44294c = rect.top;
        this.f44295d = rect.right;
        this.f44296e = rect.bottom;
    }
}
