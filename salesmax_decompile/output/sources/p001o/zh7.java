package p001o;

import androidx.fragment.app.Fragment;

/* loaded from: classes2.dex */
public final class zh7 extends o0j {

    /* renamed from: b */
    public final String f57192b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zh7(Fragment fragment, String str) {
        super(fragment, "Attempting to reuse fragment " + fragment + " with previous ID " + str);
        sq8.m48649h(fragment, "fragment");
        sq8.m48649h(str, "previousFragmentId");
        this.f57192b = str;
    }
}
