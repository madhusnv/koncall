package p001o;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.Resources;
import android.graphics.Rect;
import android.util.DisplayMetrics;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.TextView;
import com.google.android.gms.cast.CredentialsData;

/* loaded from: classes2.dex */
public class osh {

    /* renamed from: a */
    public final Context f38867a;

    /* renamed from: b */
    public final View f38868b;

    /* renamed from: c */
    public final TextView f38869c;

    /* renamed from: d */
    public final WindowManager.LayoutParams f38870d;

    /* renamed from: e */
    public final Rect f38871e;

    /* renamed from: f */
    public final int[] f38872f;

    /* renamed from: g */
    public final int[] f38873g;

    public osh(Context context) {
        WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
        this.f38870d = layoutParams;
        this.f38871e = new Rect();
        this.f38872f = new int[2];
        this.f38873g = new int[2];
        this.f38867a = context;
        View viewInflate = LayoutInflater.from(context).inflate(g9e.abc_tooltip, (ViewGroup) null);
        this.f38868b = viewInflate;
        this.f38869c = (TextView) viewInflate.findViewById(r8e.message);
        layoutParams.setTitle(getClass().getSimpleName());
        layoutParams.packageName = context.getPackageName();
        layoutParams.type = 1002;
        layoutParams.width = -2;
        layoutParams.height = -2;
        layoutParams.format = -3;
        layoutParams.windowAnimations = iae.Animation_AppCompat_Tooltip;
        layoutParams.flags = 24;
    }

    /* renamed from: b */
    public static View m42634b(View view) {
        View rootView = view.getRootView();
        ViewGroup.LayoutParams layoutParams = rootView.getLayoutParams();
        if ((layoutParams instanceof WindowManager.LayoutParams) && ((WindowManager.LayoutParams) layoutParams).type == 2) {
            return rootView;
        }
        for (Context context = view.getContext(); context instanceof ContextWrapper; context = ((ContextWrapper) context).getBaseContext()) {
            if (context instanceof Activity) {
                return ((Activity) context).getWindow().getDecorView();
            }
        }
        return rootView;
    }

    /* renamed from: a */
    public final void m42635a(View view, int i, int i2, boolean z, WindowManager.LayoutParams layoutParams) throws Resources.NotFoundException {
        int height;
        int i3;
        layoutParams.token = view.getApplicationWindowToken();
        int dimensionPixelOffset = this.f38867a.getResources().getDimensionPixelOffset(b7e.tooltip_precise_anchor_threshold);
        if (view.getWidth() < dimensionPixelOffset) {
            i = view.getWidth() / 2;
        }
        if (view.getHeight() >= dimensionPixelOffset) {
            int dimensionPixelOffset2 = this.f38867a.getResources().getDimensionPixelOffset(b7e.tooltip_precise_anchor_extra_offset);
            height = i2 + dimensionPixelOffset2;
            i3 = i2 - dimensionPixelOffset2;
        } else {
            height = view.getHeight();
            i3 = 0;
        }
        layoutParams.gravity = 49;
        int dimensionPixelOffset3 = this.f38867a.getResources().getDimensionPixelOffset(z ? b7e.tooltip_y_offset_touch : b7e.tooltip_y_offset_non_touch);
        View viewM42634b = m42634b(view);
        if (viewM42634b == null) {
            return;
        }
        viewM42634b.getWindowVisibleDisplayFrame(this.f38871e);
        Rect rect = this.f38871e;
        if (rect.left < 0 && rect.top < 0) {
            Resources resources = this.f38867a.getResources();
            int identifier = resources.getIdentifier("status_bar_height", "dimen", CredentialsData.CREDENTIALS_TYPE_ANDROID);
            int dimensionPixelSize = identifier != 0 ? resources.getDimensionPixelSize(identifier) : 0;
            DisplayMetrics displayMetrics = resources.getDisplayMetrics();
            this.f38871e.set(0, dimensionPixelSize, displayMetrics.widthPixels, displayMetrics.heightPixels);
        }
        viewM42634b.getLocationOnScreen(this.f38873g);
        view.getLocationOnScreen(this.f38872f);
        int[] iArr = this.f38872f;
        int i4 = iArr[0];
        int[] iArr2 = this.f38873g;
        int i5 = i4 - iArr2[0];
        iArr[0] = i5;
        iArr[1] = iArr[1] - iArr2[1];
        layoutParams.x = (i5 + i) - (viewM42634b.getWidth() / 2);
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        this.f38868b.measure(iMakeMeasureSpec, iMakeMeasureSpec);
        int measuredHeight = this.f38868b.getMeasuredHeight();
        int i6 = this.f38872f[1];
        int i7 = ((i3 + i6) - dimensionPixelOffset3) - measuredHeight;
        int i8 = i6 + height + dimensionPixelOffset3;
        if (z) {
            if (i7 >= 0) {
                layoutParams.y = i7;
                return;
            } else {
                layoutParams.y = i8;
                return;
            }
        }
        if (measuredHeight + i8 <= this.f38871e.height()) {
            layoutParams.y = i8;
        } else {
            layoutParams.y = i7;
        }
    }

    /* renamed from: c */
    public void m42636c() {
        if (m42637d()) {
            ((WindowManager) this.f38867a.getSystemService("window")).removeView(this.f38868b);
        }
    }

    /* renamed from: d */
    public boolean m42637d() {
        return this.f38868b.getParent() != null;
    }

    /* renamed from: e */
    public void m42638e(View view, int i, int i2, boolean z, CharSequence charSequence) throws Resources.NotFoundException {
        if (m42637d()) {
            m42636c();
        }
        this.f38869c.setText(charSequence);
        m42635a(view, i, i2, z, this.f38870d);
        ((WindowManager) this.f38867a.getSystemService("window")).addView(this.f38868b, this.f38870d);
    }
}
