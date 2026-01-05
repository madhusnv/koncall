package p001o;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import java.util.ArrayList;

/* loaded from: classes2.dex */
public class ds7 extends FrameLayout {

    /* renamed from: a */
    public ViewGroup f20467a;

    /* renamed from: b */
    public boolean f20468b;

    /* renamed from: o.ds7$a */
    public static class C13024a {
        /* renamed from: a */
        public static float m23748a(View view) {
            return view.getZ();
        }
    }

    public ds7(ViewGroup viewGroup) {
        super(viewGroup.getContext());
        setClipChildren(false);
        this.f20467a = viewGroup;
        viewGroup.setTag(g8e.ghost_view_holder, this);
        this.f20467a.getOverlay().add(this);
        this.f20468b = true;
    }

    /* renamed from: b */
    public static ds7 m23741b(ViewGroup viewGroup) {
        return (ds7) viewGroup.getTag(g8e.ghost_view_holder);
    }

    /* renamed from: d */
    public static void m23742d(View view, ArrayList arrayList) {
        Object parent = view.getParent();
        if (parent instanceof ViewGroup) {
            m23742d((View) parent, arrayList);
        }
        arrayList.add(view);
    }

    /* renamed from: e */
    public static boolean m23743e(View view, View view2) {
        ViewGroup viewGroup = (ViewGroup) view.getParent();
        int childCount = viewGroup.getChildCount();
        if (C13024a.m23748a(view) != C13024a.m23748a(view2)) {
            return C13024a.m23748a(view) > C13024a.m23748a(view2);
        }
        for (int i = 0; i < childCount; i++) {
            View childAt = viewGroup.getChildAt(mwi.m39748a(viewGroup, i));
            if (childAt == view) {
                return false;
            }
            if (childAt == view2) {
                break;
            }
        }
        return true;
    }

    /* renamed from: f */
    public static boolean m23744f(ArrayList arrayList, ArrayList arrayList2) {
        if (arrayList.isEmpty() || arrayList2.isEmpty() || arrayList.get(0) != arrayList2.get(0)) {
            return true;
        }
        int iMin = Math.min(arrayList.size(), arrayList2.size());
        for (int i = 1; i < iMin; i++) {
            View view = (View) arrayList.get(i);
            View view2 = (View) arrayList2.get(i);
            if (view != view2) {
                return m23743e(view, view2);
            }
        }
        return arrayList2.size() == iMin;
    }

    /* renamed from: a */
    public void m23745a(fs7 fs7Var) {
        ArrayList arrayList = new ArrayList();
        m23742d(fs7Var.f24022c, arrayList);
        int iM23746c = m23746c(arrayList);
        if (iM23746c < 0 || iM23746c >= getChildCount()) {
            addView(fs7Var);
        } else {
            addView(fs7Var, iM23746c);
        }
    }

    /* renamed from: c */
    public final int m23746c(ArrayList arrayList) {
        ArrayList arrayList2 = new ArrayList();
        int childCount = getChildCount() - 1;
        int i = 0;
        while (i <= childCount) {
            int i2 = (i + childCount) / 2;
            m23742d(((fs7) getChildAt(i2)).f24022c, arrayList2);
            if (m23744f(arrayList, arrayList2)) {
                i = i2 + 1;
            } else {
                childCount = i2 - 1;
            }
            arrayList2.clear();
        }
        return i;
    }

    /* renamed from: g */
    public void m23747g() {
        if (!this.f20468b) {
            throw new IllegalStateException("This GhostViewHolder is detached!");
        }
        this.f20467a.getOverlay().remove(this);
        this.f20467a.getOverlay().add(this);
    }

    @Override // android.view.ViewGroup
    public void onViewAdded(View view) {
        if (!this.f20468b) {
            throw new IllegalStateException("This GhostViewHolder is detached!");
        }
        super.onViewAdded(view);
    }

    @Override // android.view.ViewGroup
    public void onViewRemoved(View view) {
        super.onViewRemoved(view);
        if ((getChildCount() == 1 && getChildAt(0) == view) || getChildCount() == 0) {
            this.f20467a.setTag(g8e.ghost_view_holder, null);
            this.f20467a.getOverlay().remove(this);
            this.f20468b = false;
        }
    }
}
