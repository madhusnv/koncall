package og;

import android.view.View;
import android.view.ViewGroup;
import f2.C2184g;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public abstract class ne {

    /* renamed from: a */
    public static final /* synthetic */ int f26676a = 0;

    /* renamed from: a */
    public static final C2184g m10783a(ViewGroup viewGroup) {
        int childCount = viewGroup.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = viewGroup.getChildAt(i10);
            if (childAt instanceof C2184g) {
                return (C2184g) childAt;
            }
        }
        C2184g c2184g = new C2184g(viewGroup.getContext());
        viewGroup.addView(c2184g);
        return c2184g;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v3, types: [android.view.ViewParent] */
    /* renamed from: b */
    public static final ViewGroup m10784b(View view) {
        while (!(view instanceof ViewGroup)) {
            ?? parent = view.getParent();
            if (!(parent instanceof View)) {
                throw new IllegalArgumentException(("Couldn't find a valid parent for " + view + ". Are you overriding LocalView and providing a View that is not attached to the view hierarchy?").toString());
            }
            view = parent;
        }
        return (ViewGroup) view;
    }
}
