package p001o;

import android.app.Activity;
import android.content.Intent;
import androidx.fragment.app.Fragment;

/* loaded from: classes5.dex */
public final class qj7 {

    /* renamed from: a */
    public Fragment f42065a;

    /* renamed from: b */
    public android.app.Fragment f42066b;

    public qj7(Fragment fragment) {
        sq8.m48649h(fragment, "fragment");
        this.f42065a = fragment;
    }

    /* renamed from: a */
    public final Activity m45543a() {
        Fragment fragment = this.f42065a;
        if (fragment != null) {
            if (fragment != null) {
                return fragment.getActivity();
            }
            return null;
        }
        android.app.Fragment fragment2 = this.f42066b;
        if (fragment2 != null) {
            return fragment2.getActivity();
        }
        return null;
    }

    /* renamed from: b */
    public final android.app.Fragment m45544b() {
        return this.f42066b;
    }

    /* renamed from: c */
    public final Fragment m45545c() {
        return this.f42065a;
    }

    /* renamed from: d */
    public final void m45546d(Intent intent, int i) {
        Fragment fragment = this.f42065a;
        if (fragment != null) {
            if (fragment != null) {
                fragment.startActivityForResult(intent, i);
            }
        } else {
            android.app.Fragment fragment2 = this.f42066b;
            if (fragment2 != null) {
                fragment2.startActivityForResult(intent, i);
            }
        }
    }

    public qj7(android.app.Fragment fragment) {
        sq8.m48649h(fragment, "fragment");
        this.f42066b = fragment;
    }
}
