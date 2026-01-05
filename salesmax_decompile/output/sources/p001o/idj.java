package p001o;

import androidx.fragment.app.Fragment;

/* loaded from: classes2.dex */
public final class idj extends o0j {

    /* renamed from: b */
    public final Fragment f28556b;

    /* renamed from: c */
    public final int f28557c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public idj(Fragment fragment, Fragment fragment2, int i) {
        super(fragment, "Attempting to nest fragment " + fragment + " within the view of parent fragment " + fragment2 + " via container with ID " + i + " without using parent's childFragmentManager");
        sq8.m48649h(fragment, "fragment");
        sq8.m48649h(fragment2, "expectedParentFragment");
        this.f28556b = fragment2;
        this.f28557c = i;
    }
}
