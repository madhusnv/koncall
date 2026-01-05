package p001o;

import android.view.ViewGroup;
import androidx.fragment.app.Fragment;

/* loaded from: classes2.dex */
public final class ii7 extends o0j {

    /* renamed from: b */
    public final ViewGroup f28724b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ii7(Fragment fragment, ViewGroup viewGroup) {
        super(fragment, "Attempting to use <fragment> tag to add fragment " + fragment + " to container " + viewGroup);
        sq8.m48649h(fragment, "fragment");
        this.f28724b = viewGroup;
    }
}
