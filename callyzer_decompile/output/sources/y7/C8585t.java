package y7;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: y7.t */
/* loaded from: classes.dex */
public final class C8585t extends AbstractC8586u {

    /* renamed from: d */
    public final /* synthetic */ int f41790d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C8585t(f0 f0Var, int i10) {
        super(f0Var);
        this.f41790d = i10;
    }

    @Override // y7.AbstractC8586u
    /* renamed from: d */
    public final int mo15902d(View view) {
        int right;
        int i10;
        switch (this.f41790d) {
            case 0:
                g0 g0Var = (g0) view.getLayoutParams();
                ((f0) this.f41811b).getClass();
                right = view.getRight() + ((g0) view.getLayoutParams()).f41640b.right;
                i10 = ((ViewGroup.MarginLayoutParams) g0Var).rightMargin;
                break;
            default:
                g0 g0Var2 = (g0) view.getLayoutParams();
                ((f0) this.f41811b).getClass();
                right = view.getBottom() + ((g0) view.getLayoutParams()).f41640b.bottom;
                i10 = ((ViewGroup.MarginLayoutParams) g0Var2).bottomMargin;
                break;
        }
        return right + i10;
    }

    @Override // y7.AbstractC8586u
    /* renamed from: e */
    public final int mo15903e(View view) {
        int measuredWidth;
        int i10;
        switch (this.f41790d) {
            case 0:
                g0 g0Var = (g0) view.getLayoutParams();
                ((f0) this.f41811b).getClass();
                Rect rect = ((g0) view.getLayoutParams()).f41640b;
                measuredWidth = view.getMeasuredWidth() + rect.left + rect.right + ((ViewGroup.MarginLayoutParams) g0Var).leftMargin;
                i10 = ((ViewGroup.MarginLayoutParams) g0Var).rightMargin;
                break;
            default:
                g0 g0Var2 = (g0) view.getLayoutParams();
                ((f0) this.f41811b).getClass();
                Rect rect2 = ((g0) view.getLayoutParams()).f41640b;
                measuredWidth = view.getMeasuredHeight() + rect2.top + rect2.bottom + ((ViewGroup.MarginLayoutParams) g0Var2).topMargin;
                i10 = ((ViewGroup.MarginLayoutParams) g0Var2).bottomMargin;
                break;
        }
        return measuredWidth + i10;
    }

    @Override // y7.AbstractC8586u
    /* renamed from: f */
    public final int mo15904f(View view) {
        int measuredHeight;
        int i10;
        switch (this.f41790d) {
            case 0:
                g0 g0Var = (g0) view.getLayoutParams();
                ((f0) this.f41811b).getClass();
                Rect rect = ((g0) view.getLayoutParams()).f41640b;
                measuredHeight = view.getMeasuredHeight() + rect.top + rect.bottom + ((ViewGroup.MarginLayoutParams) g0Var).topMargin;
                i10 = ((ViewGroup.MarginLayoutParams) g0Var).bottomMargin;
                break;
            default:
                g0 g0Var2 = (g0) view.getLayoutParams();
                ((f0) this.f41811b).getClass();
                Rect rect2 = ((g0) view.getLayoutParams()).f41640b;
                measuredHeight = view.getMeasuredWidth() + rect2.left + rect2.right + ((ViewGroup.MarginLayoutParams) g0Var2).leftMargin;
                i10 = ((ViewGroup.MarginLayoutParams) g0Var2).rightMargin;
                break;
        }
        return measuredHeight + i10;
    }

    @Override // y7.AbstractC8586u
    /* renamed from: g */
    public final int mo15905g(View view) {
        int left;
        int i10;
        switch (this.f41790d) {
            case 0:
                g0 g0Var = (g0) view.getLayoutParams();
                ((f0) this.f41811b).getClass();
                left = view.getLeft() - ((g0) view.getLayoutParams()).f41640b.left;
                i10 = ((ViewGroup.MarginLayoutParams) g0Var).leftMargin;
                break;
            default:
                g0 g0Var2 = (g0) view.getLayoutParams();
                ((f0) this.f41811b).getClass();
                left = view.getTop() - ((g0) view.getLayoutParams()).f41640b.top;
                i10 = ((ViewGroup.MarginLayoutParams) g0Var2).topMargin;
                break;
        }
        return left - i10;
    }

    @Override // y7.AbstractC8586u
    /* renamed from: h */
    public final int mo15906h() {
        switch (this.f41790d) {
            case 0:
                return ((f0) this.f41811b).f41632n;
            default:
                return ((f0) this.f41811b).f41633o;
        }
    }

    @Override // y7.AbstractC8586u
    /* renamed from: i */
    public final int mo15907i() {
        int i10;
        int iM15851B;
        switch (this.f41790d) {
            case 0:
                f0 f0Var = (f0) this.f41811b;
                i10 = f0Var.f41632n;
                iM15851B = f0Var.m15851B();
                break;
            default:
                f0 f0Var2 = (f0) this.f41811b;
                i10 = f0Var2.f41633o;
                iM15851B = f0Var2.m15859z();
                break;
        }
        return i10 - iM15851B;
    }

    @Override // y7.AbstractC8586u
    /* renamed from: j */
    public final int mo15908j() {
        switch (this.f41790d) {
            case 0:
                return ((f0) this.f41811b).m15851B();
            default:
                return ((f0) this.f41811b).m15859z();
        }
    }

    @Override // y7.AbstractC8586u
    /* renamed from: k */
    public final int mo15909k() {
        switch (this.f41790d) {
            case 0:
                return ((f0) this.f41811b).f41630l;
            default:
                return ((f0) this.f41811b).f41631m;
        }
    }

    @Override // y7.AbstractC8586u
    /* renamed from: l */
    public final int mo15910l() {
        switch (this.f41790d) {
            case 0:
                return ((f0) this.f41811b).f41631m;
            default:
                return ((f0) this.f41811b).f41630l;
        }
    }

    @Override // y7.AbstractC8586u
    /* renamed from: m */
    public final int mo15911m() {
        switch (this.f41790d) {
            case 0:
                return ((f0) this.f41811b).m15850A();
            default:
                return ((f0) this.f41811b).m15852C();
        }
    }

    @Override // y7.AbstractC8586u
    /* renamed from: n */
    public final int mo15912n() {
        int iM15850A;
        int iM15851B;
        switch (this.f41790d) {
            case 0:
                f0 f0Var = (f0) this.f41811b;
                iM15850A = f0Var.f41632n - f0Var.m15850A();
                iM15851B = f0Var.m15851B();
                break;
            default:
                f0 f0Var2 = (f0) this.f41811b;
                iM15850A = f0Var2.f41633o - f0Var2.m15852C();
                iM15851B = f0Var2.m15859z();
                break;
        }
        return iM15850A - iM15851B;
    }

    @Override // y7.AbstractC8586u
    /* renamed from: o */
    public final int mo15913o(View view) {
        switch (this.f41790d) {
            case 0:
                f0 f0Var = (f0) this.f41811b;
                Rect rect = (Rect) this.f41812c;
                f0Var.m15853G(view, rect);
                return rect.right;
            default:
                f0 f0Var2 = (f0) this.f41811b;
                Rect rect2 = (Rect) this.f41812c;
                f0Var2.m15853G(view, rect2);
                return rect2.bottom;
        }
    }

    @Override // y7.AbstractC8586u
    /* renamed from: p */
    public final int mo15914p(View view) {
        switch (this.f41790d) {
            case 0:
                f0 f0Var = (f0) this.f41811b;
                Rect rect = (Rect) this.f41812c;
                f0Var.m15853G(view, rect);
                return rect.left;
            default:
                f0 f0Var2 = (f0) this.f41811b;
                Rect rect2 = (Rect) this.f41812c;
                f0Var2.m15853G(view, rect2);
                return rect2.top;
        }
    }

    @Override // y7.AbstractC8586u
    /* renamed from: q */
    public final void mo15915q(int i10) {
        switch (this.f41790d) {
            case 0:
                ((f0) this.f41811b).mo1364K(i10);
                break;
            default:
                ((f0) this.f41811b).mo1365L(i10);
                break;
        }
    }
}
