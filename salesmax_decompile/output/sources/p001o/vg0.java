package p001o;

import android.animation.LayoutTransition;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.LinearLayoutManager;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Comparator;

/* loaded from: classes2.dex */
public final class vg0 {

    /* renamed from: b */
    public static final ViewGroup.MarginLayoutParams f50290b;

    /* renamed from: a */
    public LinearLayoutManager f50291a;

    /* renamed from: o.vg0$a */
    public class C17572a implements Comparator {
        public C17572a() {
        }

        @Override // java.util.Comparator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(int[] iArr, int[] iArr2) {
            return iArr[0] - iArr2[0];
        }
    }

    static {
        ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(-1, -1);
        f50290b = marginLayoutParams;
        marginLayoutParams.setMargins(0, 0, 0, 0);
    }

    public vg0(LinearLayoutManager linearLayoutManager) {
        this.f50291a = linearLayoutManager;
    }

    /* renamed from: c */
    public static boolean m52728c(View view) {
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            LayoutTransition layoutTransition = viewGroup.getLayoutTransition();
            if (layoutTransition != null && layoutTransition.isChangingLayout()) {
                return true;
            }
            int childCount = viewGroup.getChildCount();
            for (int i = 0; i < childCount; i++) {
                if (m52728c(viewGroup.getChildAt(i))) {
                    return true;
                }
            }
        }
        return false;
    }

    /* renamed from: a */
    public final boolean m52729a() {
        int top;
        int i;
        int bottom;
        int i2;
        int iM9241Z = this.f50291a.m9241Z();
        if (iM9241Z == 0) {
            return true;
        }
        boolean z = this.f50291a.y2() == 0;
        int[][] iArr = (int[][]) Array.newInstance((Class<?>) Integer.TYPE, iM9241Z, 2);
        for (int i3 = 0; i3 < iM9241Z; i3++) {
            View viewM9240Y = this.f50291a.m9240Y(i3);
            if (viewM9240Y == null) {
                throw new IllegalStateException("null view contained in the view hierarchy");
            }
            ViewGroup.LayoutParams layoutParams = viewM9240Y.getLayoutParams();
            ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams : f50290b;
            int[] iArr2 = iArr[i3];
            if (z) {
                top = viewM9240Y.getLeft();
                i = marginLayoutParams.leftMargin;
            } else {
                top = viewM9240Y.getTop();
                i = marginLayoutParams.topMargin;
            }
            iArr2[0] = top - i;
            int[] iArr3 = iArr[i3];
            if (z) {
                bottom = viewM9240Y.getRight();
                i2 = marginLayoutParams.rightMargin;
            } else {
                bottom = viewM9240Y.getBottom();
                i2 = marginLayoutParams.bottomMargin;
            }
            iArr3[1] = bottom + i2;
        }
        Arrays.sort(iArr, new C17572a());
        for (int i4 = 1; i4 < iM9241Z; i4++) {
            if (iArr[i4 - 1][1] != iArr[i4][0]) {
                return false;
            }
        }
        int[] iArr4 = iArr[0];
        int i5 = iArr4[1];
        int i6 = iArr4[0];
        return i6 <= 0 && iArr[iM9241Z - 1][1] >= i5 - i6;
    }

    /* renamed from: b */
    public final boolean m52730b() {
        int iM9241Z = this.f50291a.m9241Z();
        for (int i = 0; i < iM9241Z; i++) {
            if (m52728c(this.f50291a.m9240Y(i))) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: d */
    public boolean m52731d() {
        return (!m52729a() || this.f50291a.m9241Z() <= 1) && m52730b();
    }
}
