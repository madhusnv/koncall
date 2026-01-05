package w4;

import android.os.Build;
import android.view.ContextThemeWrapper;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import com.websoptimization.callyzerbiz.R;
import d7.q0;
import ex.InterfaceC2137a;
import g2.l7;
import gx.AbstractC2747a;
import java.util.UUID;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.AbstractC4154l;
import nx.AbstractC5179q;
import og.gg;
import og.ld;
import p004e.DialogC1879n;
import s4.EnumC6757m;
import s4.InterfaceC6747c;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: w4.p */
/* loaded from: classes.dex */
public final class DialogC7924p extends DialogC1879n {

    /* renamed from: d */
    public InterfaceC2137a f38116d;

    /* renamed from: e */
    public C7922n f38117e;

    /* renamed from: f */
    public final View f38118f;

    /* renamed from: g */
    public final C7921m f38119g;

    public DialogC7924p(InterfaceC2137a interfaceC2137a, C7922n c7922n, View view, EnumC6757m enumC6757m, InterfaceC6747c interfaceC6747c, UUID uuid) {
        super(new ContextThemeWrapper(view.getContext(), c7922n.f38114e ? R.style.DialogWindowTheme : R.style.FloatingDialogWindowTheme), 0);
        this.f38116d = interfaceC2137a;
        this.f38117e = c7922n;
        this.f38118f = view;
        float f6 = 8;
        Window window = getWindow();
        if (window == null) {
            throw new IllegalStateException("Dialog has no window");
        }
        window.requestFeature(1);
        window.setBackgroundDrawableResource(android.R.color.transparent);
        AbstractC5179q.m10121c(window, this.f38117e.f38114e);
        window.setGravity(17);
        C7921m c7921m = new C7921m(getContext(), window);
        c7921m.setTag(R.id.compose_view_saveable_id_tag, "Dialog:" + uuid);
        c7921m.setClipChildren(false);
        c7921m.setElevation(interfaceC6747c.mo8435T(f6));
        c7921m.setOutlineProvider(new l7(3));
        this.f38119g = c7921m;
        View decorView = window.getDecorView();
        ViewGroup viewGroup = decorView instanceof ViewGroup ? (ViewGroup) decorView : null;
        if (viewGroup != null) {
            m15050c(viewGroup);
        }
        setContentView(c7921m);
        q0.m5341h(c7921m, q0.m5337d(view));
        q0.m5342i(c7921m, q0.m5338e(view));
        gg.m10676c(c7921m, gg.m10674a(view));
        m15051d(this.f38116d, this.f38117e, enumC6757m);
        ld.m10749a(this.f8895c, this, new C7910b(this, 1));
    }

    /* renamed from: c */
    public static final void m15050c(ViewGroup viewGroup) {
        viewGroup.setClipChildren(false);
        if (viewGroup instanceof C7921m) {
            return;
        }
        int childCount = viewGroup.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = viewGroup.getChildAt(i10);
            ViewGroup viewGroup2 = childAt instanceof ViewGroup ? (ViewGroup) childAt : null;
            if (viewGroup2 != null) {
                m15050c(viewGroup2);
            }
        }
    }

    /* renamed from: d */
    public final void m15051d(InterfaceC2137a interfaceC2137a, C7922n c7922n, EnumC6757m enumC6757m) {
        int i10;
        this.f38116d = interfaceC2137a;
        this.f38117e = c7922n;
        EnumC7932x enumC7932x = c7922n.f38112c;
        boolean zM15049c = AbstractC7917i.m15049c(this.f38118f);
        int i11 = AbstractC7933y.f38150a[enumC7932x.ordinal()];
        if (i11 == 1) {
            zM15049c = false;
        } else if (i11 == 2) {
            zM15049c = true;
        } else if (i11 != 3) {
            throw new NoWhenBranchMatchedException();
        }
        Window window = getWindow();
        AbstractC4154l.m8920c(window);
        window.setFlags(zM15049c ? 8192 : -8193, 8192);
        int i12 = AbstractC7923o.f38115a[enumC6757m.ordinal()];
        if (i12 == 1) {
            i10 = 0;
        } else {
            if (i12 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            i10 = 1;
        }
        C7921m c7921m = this.f38119g;
        c7921m.setLayoutDirection(i10);
        boolean z6 = c7922n.f38114e;
        boolean z10 = c7922n.f38113d;
        Window window2 = c7921m.f38104a;
        boolean z11 = (c7921m.f38108e && z10 == c7921m.f38106c && z6 == c7921m.f38107d) ? false : true;
        c7921m.f38106c = z10;
        c7921m.f38107d = z6;
        if (z11) {
            WindowManager.LayoutParams attributes = window2.getAttributes();
            int i13 = z10 ? -2 : -1;
            if (i13 != attributes.width || !c7921m.f38108e) {
                window2.setLayout(i13, -2);
                c7921m.f38108e = true;
            }
        }
        setCanceledOnTouchOutside(c7922n.f38111b);
        Window window3 = getWindow();
        if (window3 != null) {
            window3.setSoftInputMode(z6 ? 0 : Build.VERSION.SDK_INT < 31 ? 16 : 48);
        }
    }

    @Override // android.app.Dialog, android.view.KeyEvent.Callback
    public final boolean onKeyUp(int i10, KeyEvent keyEvent) {
        if (!this.f38117e.f38110a || !keyEvent.isTracking() || keyEvent.isCanceled() || i10 != 111) {
            return super.onKeyUp(i10, keyEvent);
        }
        this.f38116d.invoke();
        return true;
    }

    @Override // android.app.Dialog
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        View childAt;
        int iM6747k;
        boolean zOnTouchEvent = super.onTouchEvent(motionEvent);
        if (!this.f38117e.f38111b) {
            return zOnTouchEvent;
        }
        C7921m c7921m = this.f38119g;
        c7921m.getClass();
        float x3 = motionEvent.getX();
        if (!Float.isInfinite(x3) && !Float.isNaN(x3)) {
            float y10 = motionEvent.getY();
            if (!Float.isInfinite(y10) && !Float.isNaN(y10) && (childAt = c7921m.getChildAt(0)) != null) {
                int left = childAt.getLeft() + c7921m.getLeft();
                int width = childAt.getWidth() + left;
                int top = childAt.getTop() + c7921m.getTop();
                int height = childAt.getHeight() + top;
                int iM6747k2 = AbstractC2747a.m6747k(motionEvent.getX());
                if (left <= iM6747k2 && iM6747k2 <= width && top <= (iM6747k = AbstractC2747a.m6747k(motionEvent.getY())) && iM6747k <= height) {
                    return zOnTouchEvent;
                }
            }
        }
        this.f38116d.invoke();
        return true;
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public final void cancel() {
    }
}
