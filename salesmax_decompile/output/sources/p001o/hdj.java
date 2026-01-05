package p001o;

import android.view.ViewGroup;
import androidx.fragment.app.Fragment;

/* loaded from: classes2.dex */
public final class hdj extends o0j {

    /* renamed from: b */
    public final ViewGroup f26728b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hdj(Fragment fragment, ViewGroup viewGroup) {
        super(fragment, "Attempting to add fragment " + fragment + " to container " + viewGroup + " which is not a FragmentContainerView");
        sq8.m48649h(fragment, "fragment");
        sq8.m48649h(viewGroup, "container");
        this.f26728b = viewGroup;
    }
}
