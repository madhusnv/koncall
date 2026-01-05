package p012n;

import android.content.Context;
import android.graphics.Point;
import android.graphics.Rect;
import android.view.Display;
import android.view.Gravity;
import android.view.View;
import android.view.WindowManager;
import android.widget.PopupWindow;
import com.websoptimization.callyzerbiz.R;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: n.m */
/* loaded from: classes.dex */
public class C4933m {

    /* renamed from: a */
    public final Context f24583a;

    /* renamed from: b */
    public final MenuC4929i f24584b;

    /* renamed from: c */
    public final boolean f24585c;

    /* renamed from: d */
    public final int f24586d;

    /* renamed from: e */
    public View f24587e;

    /* renamed from: g */
    public boolean f24589g;

    /* renamed from: h */
    public InterfaceC4934n f24590h;

    /* renamed from: i */
    public AbstractC4931k f24591i;

    /* renamed from: j */
    public PopupWindow.OnDismissListener f24592j;

    /* renamed from: f */
    public int f24588f = 8388611;

    /* renamed from: k */
    public final C4932l f24593k = new C4932l(this);

    public C4933m(Context context, MenuC4929i menuC4929i, View view, boolean z6, int i10, int i11) {
        this.f24583a = context;
        this.f24584b = menuC4929i;
        this.f24587e = view;
        this.f24585c = z6;
        this.f24586d = i10;
    }

    /* renamed from: a */
    public final AbstractC4931k m9880a() {
        AbstractC4931k viewOnKeyListenerC4938r;
        if (this.f24591i == null) {
            Context context = this.f24583a;
            Display defaultDisplay = ((WindowManager) context.getSystemService("window")).getDefaultDisplay();
            Point point = new Point();
            defaultDisplay.getRealSize(point);
            if (Math.min(point.x, point.y) >= context.getResources().getDimensionPixelSize(R.dimen.abc_cascading_menus_min_smallest_width)) {
                viewOnKeyListenerC4938r = new ViewOnKeyListenerC4926f(context, this.f24587e, this.f24586d, this.f24585c);
            } else {
                viewOnKeyListenerC4938r = new ViewOnKeyListenerC4938r(this.f24583a, this.f24584b, this.f24587e, this.f24586d, this.f24585c);
            }
            viewOnKeyListenerC4938r.mo9841l(this.f24584b);
            viewOnKeyListenerC4938r.mo9846r(this.f24593k);
            viewOnKeyListenerC4938r.mo9842n(this.f24587e);
            viewOnKeyListenerC4938r.mo9840j(this.f24590h);
            viewOnKeyListenerC4938r.mo9843o(this.f24589g);
            viewOnKeyListenerC4938r.mo9844p(this.f24588f);
            this.f24591i = viewOnKeyListenerC4938r;
        }
        return this.f24591i;
    }

    /* renamed from: b */
    public final boolean m9881b() {
        AbstractC4931k abstractC4931k = this.f24591i;
        return abstractC4931k != null && abstractC4931k.mo9836e();
    }

    /* renamed from: c */
    public void mo9882c() {
        this.f24591i = null;
        PopupWindow.OnDismissListener onDismissListener = this.f24592j;
        if (onDismissListener != null) {
            onDismissListener.onDismiss();
        }
    }

    /* renamed from: d */
    public final void m9883d(int i10, int i11, boolean z6, boolean z10) {
        AbstractC4931k abstractC4931kM9880a = m9880a();
        abstractC4931kM9880a.mo9847s(z10);
        if (z6) {
            if ((Gravity.getAbsoluteGravity(this.f24588f, this.f24587e.getLayoutDirection()) & 7) == 5) {
                i10 -= this.f24587e.getWidth();
            }
            abstractC4931kM9880a.mo9845q(i10);
            abstractC4931kM9880a.mo9848t(i11);
            int i12 = (int) ((this.f24583a.getResources().getDisplayMetrics().density * 48.0f) / 2.0f);
            abstractC4931kM9880a.f24581a = new Rect(i10 - i12, i11 - i12, i10 + i12, i11 + i12);
        }
        abstractC4931kM9880a.mo9837f();
    }
}
