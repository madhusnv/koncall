package p013o;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.Resources;
import android.graphics.Rect;
import android.os.Build;
import android.util.DisplayMetrics;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.TextView;
import c6.AbstractC0879i;
import c6.v0;
import c6.w0;
import com.websoptimization.callyzerbiz.R;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class h2 implements View.OnLongClickListener, View.OnHoverListener, View.OnAttachStateChangeListener {

    /* renamed from: l */
    public static h2 f25502l;

    /* renamed from: m */
    public static h2 f25503m;

    /* renamed from: a */
    public final View f25504a;

    /* renamed from: b */
    public final CharSequence f25505b;

    /* renamed from: c */
    public final int f25506c;

    /* renamed from: d */
    public final g2 f25507d;

    /* renamed from: e */
    public final g2 f25508e;

    /* renamed from: f */
    public int f25509f;

    /* renamed from: g */
    public int f25510g;

    /* renamed from: h */
    public i2 f25511h;

    /* renamed from: j */
    public boolean f25512j;

    /* renamed from: k */
    public boolean f25513k;

    /* JADX WARN: Type inference failed for: r0v0, types: [o.g2] */
    /* JADX WARN: Type inference failed for: r0v1, types: [o.g2] */
    public h2(View view, CharSequence charSequence) {
        final int i10 = 0;
        this.f25507d = new Runnable(this) { // from class: o.g2

            /* renamed from: b */
            public final /* synthetic */ h2 f25498b;

            {
                this.f25498b = this;
            }

            @Override // java.lang.Runnable
            public final void run() throws Resources.NotFoundException {
                switch (i10) {
                    case 0:
                        this.f25498b.m10240c(false);
                        break;
                    default:
                        this.f25498b.m10239a();
                        break;
                }
            }
        };
        final int i11 = 1;
        this.f25508e = new Runnable(this) { // from class: o.g2

            /* renamed from: b */
            public final /* synthetic */ h2 f25498b;

            {
                this.f25498b = this;
            }

            @Override // java.lang.Runnable
            public final void run() throws Resources.NotFoundException {
                switch (i11) {
                    case 0:
                        this.f25498b.m10240c(false);
                        break;
                    default:
                        this.f25498b.m10239a();
                        break;
                }
            }
        };
        this.f25504a = view;
        this.f25505b = charSequence;
        ViewConfiguration viewConfiguration = ViewConfiguration.get(view.getContext());
        Method method = w0.f5534a;
        this.f25506c = Build.VERSION.SDK_INT >= 28 ? AbstractC0879i.m2401m(viewConfiguration) : viewConfiguration.getScaledTouchSlop() / 2;
        this.f25513k = true;
        view.setOnLongClickListener(this);
        view.setOnHoverListener(this);
    }

    /* renamed from: b */
    public static void m10238b(h2 h2Var) {
        h2 h2Var2 = f25502l;
        if (h2Var2 != null) {
            h2Var2.f25504a.removeCallbacks(h2Var2.f25507d);
        }
        f25502l = h2Var;
        if (h2Var != null) {
            h2Var.f25504a.postDelayed(h2Var.f25507d, ViewConfiguration.getLongPressTimeout());
        }
    }

    /* renamed from: a */
    public final void m10239a() {
        h2 h2Var = f25503m;
        View view = this.f25504a;
        if (h2Var == this) {
            f25503m = null;
            i2 i2Var = this.f25511h;
            if (i2Var != null) {
                View view2 = (View) i2Var.f25539b;
                if (view2.getParent() != null) {
                    ((WindowManager) ((Context) i2Var.f25538a).getSystemService("window")).removeView(view2);
                }
                this.f25511h = null;
                this.f25513k = true;
                view.removeOnAttachStateChangeListener(this);
            }
        }
        if (f25502l == this) {
            m10238b(null);
        }
        view.removeCallbacks(this.f25508e);
    }

    /* renamed from: c */
    public final void m10240c(boolean z6) throws Resources.NotFoundException {
        int height;
        int i10;
        int i11;
        boolean z10;
        int i12;
        int i13;
        long longPressTimeout;
        long j6;
        long j10;
        View view = this.f25504a;
        if (view.isAttachedToWindow()) {
            m10238b(null);
            h2 h2Var = f25503m;
            if (h2Var != null) {
                h2Var.m10239a();
            }
            f25503m = this;
            this.f25512j = z6;
            Context context = view.getContext();
            i2 i2Var = new i2();
            WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
            i2Var.f25541d = layoutParams;
            i2Var.f25542e = new Rect();
            i2Var.f25543f = new int[2];
            i2Var.f25544g = new int[2];
            i2Var.f25538a = context;
            View viewInflate = LayoutInflater.from(context).inflate(R.layout.abc_tooltip, (ViewGroup) null);
            i2Var.f25539b = viewInflate;
            i2Var.f25540c = (TextView) viewInflate.findViewById(R.id.message);
            layoutParams.setTitle(i2.class.getSimpleName());
            layoutParams.packageName = context.getPackageName();
            layoutParams.type = 1002;
            layoutParams.width = -2;
            layoutParams.height = -2;
            layoutParams.format = -3;
            layoutParams.windowAnimations = R.style.Animation_AppCompat_Tooltip;
            layoutParams.flags = 24;
            View view2 = (View) i2Var.f25539b;
            Context context2 = (Context) i2Var.f25538a;
            this.f25511h = i2Var;
            int width = this.f25509f;
            int i14 = this.f25510g;
            boolean z11 = this.f25512j;
            WindowManager.LayoutParams layoutParams2 = (WindowManager.LayoutParams) i2Var.f25541d;
            if (view2.getParent() != null && view2.getParent() != null) {
                ((WindowManager) context2.getSystemService("window")).removeView(view2);
            }
            ((TextView) i2Var.f25540c).setText(this.f25505b);
            int[] iArr = (int[]) i2Var.f25544g;
            int[] iArr2 = (int[]) i2Var.f25543f;
            Rect rect = (Rect) i2Var.f25542e;
            layoutParams2.token = view.getApplicationWindowToken();
            int dimensionPixelOffset = context2.getResources().getDimensionPixelOffset(R.dimen.tooltip_precise_anchor_threshold);
            if (view.getWidth() < dimensionPixelOffset) {
                width = view.getWidth() / 2;
            }
            if (view.getHeight() >= dimensionPixelOffset) {
                int dimensionPixelOffset2 = context2.getResources().getDimensionPixelOffset(R.dimen.tooltip_precise_anchor_extra_offset);
                height = i14 + dimensionPixelOffset2;
                i10 = i14 - dimensionPixelOffset2;
            } else {
                height = view.getHeight();
                i10 = 0;
            }
            layoutParams2.gravity = 49;
            int dimensionPixelOffset3 = context2.getResources().getDimensionPixelOffset(z11 ? R.dimen.tooltip_y_offset_touch : R.dimen.tooltip_y_offset_non_touch);
            View rootView = view.getRootView();
            ViewGroup.LayoutParams layoutParams3 = rootView.getLayoutParams();
            int i15 = width;
            if (!(layoutParams3 instanceof WindowManager.LayoutParams) || ((WindowManager.LayoutParams) layoutParams3).type != 2) {
                Context context3 = view.getContext();
                while (true) {
                    if (!(context3 instanceof ContextWrapper)) {
                        break;
                    }
                    if (context3 instanceof Activity) {
                        rootView = ((Activity) context3).getWindow().getDecorView();
                        break;
                    }
                    context3 = ((ContextWrapper) context3).getBaseContext();
                }
            }
            if (rootView == null) {
                i13 = 1;
            } else {
                rootView.getWindowVisibleDisplayFrame(rect);
                if (rect.left >= 0 || rect.top >= 0) {
                    i11 = i10;
                    z10 = z11;
                    i12 = 0;
                    i13 = 1;
                } else {
                    Resources resources = context2.getResources();
                    i13 = 1;
                    i11 = i10;
                    z10 = z11;
                    int identifier = resources.getIdentifier("status_bar_height", "dimen", "android");
                    int dimensionPixelSize = identifier != 0 ? resources.getDimensionPixelSize(identifier) : 0;
                    DisplayMetrics displayMetrics = resources.getDisplayMetrics();
                    i12 = 0;
                    rect.set(0, dimensionPixelSize, displayMetrics.widthPixels, displayMetrics.heightPixels);
                }
                rootView.getLocationOnScreen(iArr);
                view.getLocationOnScreen(iArr2);
                int i16 = iArr2[i12] - iArr[i12];
                iArr2[i12] = i16;
                iArr2[i13] = iArr2[i13] - iArr[i13];
                layoutParams2.x = (i16 + i15) - (rootView.getWidth() / 2);
                int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i12, i12);
                view2.measure(iMakeMeasureSpec, iMakeMeasureSpec);
                int measuredHeight = view2.getMeasuredHeight();
                int i17 = iArr2[i13];
                int i18 = ((i17 + i11) - dimensionPixelOffset3) - measuredHeight;
                int i19 = i17 + height + dimensionPixelOffset3;
                if (z10) {
                    if (i18 >= 0) {
                        layoutParams2.y = i18;
                    } else {
                        layoutParams2.y = i19;
                    }
                } else if (measuredHeight + i19 <= rect.height()) {
                    layoutParams2.y = i19;
                } else {
                    layoutParams2.y = i18;
                }
            }
            ((WindowManager) context2.getSystemService("window")).addView(view2, layoutParams2);
            view.addOnAttachStateChangeListener(this);
            if (this.f25512j) {
                j10 = 2500;
            } else {
                Field field = v0.f5527a;
                if ((view.getWindowSystemUiVisibility() & 1) == i13) {
                    longPressTimeout = ViewConfiguration.getLongPressTimeout();
                    j6 = 3000;
                } else {
                    longPressTimeout = ViewConfiguration.getLongPressTimeout();
                    j6 = 15000;
                }
                j10 = j6 - longPressTimeout;
            }
            g2 g2Var = this.f25508e;
            view.removeCallbacks(g2Var);
            view.postDelayed(g2Var, j10);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x0066  */
    @Override // android.view.View.OnHoverListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean onHover(android.view.View r4, android.view.MotionEvent r5) {
        /*
            r3 = this;
            o.i2 r4 = r3.f25511h
            r0 = 0
            if (r4 == 0) goto La
            boolean r4 = r3.f25512j
            if (r4 == 0) goto La
            goto L6f
        La:
            android.view.View r4 = r3.f25504a
            android.content.Context r1 = r4.getContext()
            java.lang.String r2 = "accessibility"
            java.lang.Object r1 = r1.getSystemService(r2)
            android.view.accessibility.AccessibilityManager r1 = (android.view.accessibility.AccessibilityManager) r1
            boolean r2 = r1.isEnabled()
            if (r2 == 0) goto L25
            boolean r1 = r1.isTouchExplorationEnabled()
            if (r1 == 0) goto L25
            goto L6f
        L25:
            int r1 = r5.getAction()
            r2 = 7
            if (r1 == r2) goto L38
            r4 = 10
            if (r1 == r4) goto L31
            goto L6f
        L31:
            r4 = 1
            r3.f25513k = r4
            r3.m10239a()
            return r0
        L38:
            boolean r4 = r4.isEnabled()
            if (r4 == 0) goto L6f
            o.i2 r4 = r3.f25511h
            if (r4 != 0) goto L6f
            float r4 = r5.getX()
            int r4 = (int) r4
            float r5 = r5.getY()
            int r5 = (int) r5
            boolean r1 = r3.f25513k
            if (r1 != 0) goto L66
            int r1 = r3.f25509f
            int r1 = r4 - r1
            int r1 = java.lang.Math.abs(r1)
            int r2 = r3.f25506c
            if (r1 > r2) goto L66
            int r1 = r3.f25510g
            int r1 = r5 - r1
            int r1 = java.lang.Math.abs(r1)
            if (r1 <= r2) goto L6f
        L66:
            r3.f25509f = r4
            r3.f25510g = r5
            r3.f25513k = r0
            m10238b(r3)
        L6f:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p013o.h2.onHover(android.view.View, android.view.MotionEvent):boolean");
    }

    @Override // android.view.View.OnLongClickListener
    public final boolean onLongClick(View view) throws Resources.NotFoundException {
        this.f25509f = view.getWidth() / 2;
        this.f25510g = view.getHeight() / 2;
        m10240c(true);
        return true;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        m10239a();
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
    }
}
