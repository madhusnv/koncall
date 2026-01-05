package p001o;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import java.lang.reflect.InvocationTargetException;

/* loaded from: classes2.dex */
public class fs7 extends ViewGroup implements cs7 {

    /* renamed from: a */
    public ViewGroup f24020a;

    /* renamed from: b */
    public View f24021b;

    /* renamed from: c */
    public final View f24022c;

    /* renamed from: d */
    public int f24023d;

    /* renamed from: e */
    public Matrix f24024e;

    /* renamed from: f */
    public final ViewTreeObserver.OnPreDrawListener f24025f;

    /* renamed from: o.fs7$a */
    public class ViewTreeObserverOnPreDrawListenerC13541a implements ViewTreeObserver.OnPreDrawListener {
        public ViewTreeObserverOnPreDrawListenerC13541a() {
        }

        @Override // android.view.ViewTreeObserver.OnPreDrawListener
        public boolean onPreDraw() {
            View view;
            fs7.this.postInvalidateOnAnimation();
            fs7 fs7Var = fs7.this;
            ViewGroup viewGroup = fs7Var.f24020a;
            if (viewGroup == null || (view = fs7Var.f24021b) == null) {
                return true;
            }
            viewGroup.endViewTransition(view);
            fs7.this.f24020a.postInvalidateOnAnimation();
            fs7 fs7Var2 = fs7.this;
            fs7Var2.f24020a = null;
            fs7Var2.f24021b = null;
            return true;
        }
    }

    public fs7(View view) {
        super(view.getContext());
        this.f24025f = new ViewTreeObserverOnPreDrawListenerC13541a();
        this.f24022c = view;
        setWillNotDraw(false);
        setClipChildren(false);
        setLayerType(2, null);
    }

    /* renamed from: b */
    public static fs7 m27417b(View view, ViewGroup viewGroup, Matrix matrix) {
        int i;
        ds7 ds7Var;
        if (!(view.getParent() instanceof ViewGroup)) {
            throw new IllegalArgumentException("Ghosted views must be parented by a ViewGroup");
        }
        ds7 ds7VarM23741b = ds7.m23741b(viewGroup);
        fs7 fs7VarM27420e = m27420e(view);
        if (fs7VarM27420e == null || (ds7Var = (ds7) fs7VarM27420e.getParent()) == ds7VarM23741b) {
            i = 0;
        } else {
            i = fs7VarM27420e.f24023d;
            ds7Var.removeView(fs7VarM27420e);
            fs7VarM27420e = null;
        }
        if (fs7VarM27420e == null) {
            if (matrix == null) {
                matrix = new Matrix();
                m27418c(view, viewGroup, matrix);
            }
            fs7VarM27420e = new fs7(view);
            fs7VarM27420e.m27423h(matrix);
            if (ds7VarM23741b == null) {
                ds7VarM23741b = new ds7(viewGroup);
            } else {
                ds7VarM23741b.m23747g();
            }
            m27419d(viewGroup, ds7VarM23741b);
            m27419d(viewGroup, fs7VarM27420e);
            ds7VarM23741b.m23745a(fs7VarM27420e);
            fs7VarM27420e.f24023d = i;
        } else if (matrix != null) {
            fs7VarM27420e.m27423h(matrix);
        }
        fs7VarM27420e.f24023d++;
        return fs7VarM27420e;
    }

    /* renamed from: c */
    public static void m27418c(View view, ViewGroup viewGroup, Matrix matrix) {
        ViewGroup viewGroup2 = (ViewGroup) view.getParent();
        matrix.reset();
        zzi.m60175h(viewGroup2, matrix);
        matrix.preTranslate(-viewGroup2.getScrollX(), -viewGroup2.getScrollY());
        zzi.m60176i(viewGroup, matrix);
    }

    /* renamed from: d */
    public static void m27419d(View view, View view2) {
        zzi.m60172e(view2, view2.getLeft(), view2.getTop(), view2.getLeft() + view.getWidth(), view2.getTop() + view.getHeight());
    }

    /* renamed from: e */
    public static fs7 m27420e(View view) {
        return (fs7) view.getTag(g8e.ghost_view);
    }

    /* renamed from: f */
    public static void m27421f(View view) {
        fs7 fs7VarM27420e = m27420e(view);
        if (fs7VarM27420e != null) {
            int i = fs7VarM27420e.f24023d - 1;
            fs7VarM27420e.f24023d = i;
            if (i <= 0) {
                ((ds7) fs7VarM27420e.getParent()).removeView(fs7VarM27420e);
            }
        }
    }

    /* renamed from: g */
    public static void m27422g(View view, fs7 fs7Var) {
        view.setTag(g8e.ghost_view, fs7Var);
    }

    @Override // p001o.cs7
    /* renamed from: a */
    public void mo21705a(ViewGroup viewGroup, View view) {
        this.f24020a = viewGroup;
        this.f24021b = view;
    }

    /* renamed from: h */
    public void m27423h(Matrix matrix) {
        this.f24024e = matrix;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() throws IllegalAccessException, NoSuchFieldException, SecurityException, IllegalArgumentException {
        super.onAttachedToWindow();
        m27422g(this.f24022c, this);
        this.f24022c.getViewTreeObserver().addOnPreDrawListener(this.f24025f);
        zzi.m60174g(this.f24022c, 4);
        if (this.f24022c.getParent() != null) {
            ((View) this.f24022c.getParent()).invalidate();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() throws IllegalAccessException, NoSuchFieldException, SecurityException, IllegalArgumentException {
        this.f24022c.getViewTreeObserver().removeOnPreDrawListener(this.f24025f);
        zzi.m60174g(this.f24022c, 0);
        m27422g(this.f24022c, null);
        if (this.f24022c.getParent() != null) {
            ((View) this.f24022c.getParent()).invalidate();
        }
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) throws IllegalAccessException, NoSuchFieldException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        rc2.m46502a(canvas, true);
        canvas.setMatrix(this.f24024e);
        zzi.m60174g(this.f24022c, 0);
        this.f24022c.invalidate();
        zzi.m60174g(this.f24022c, 4);
        drawChild(canvas, this.f24022c, getDrawingTime());
        rc2.m46502a(canvas, false);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
    }

    @Override // android.view.View, p001o.cs7
    public void setVisibility(int i) throws IllegalAccessException, NoSuchFieldException, SecurityException, IllegalArgumentException {
        super.setVisibility(i);
        if (m27420e(this.f24022c) == this) {
            zzi.m60174g(this.f24022c, i == 0 ? 4 : 0);
        }
    }
}
