package p001o;

import android.animation.Animator;
import android.view.View;
import com.google.android.material.search.SearchBar;
import java.util.LinkedHashSet;
import java.util.Set;

/* loaded from: classes3.dex */
public class x8f {

    /* renamed from: d */
    public Animator f53364d;

    /* renamed from: e */
    public Animator f53365e;

    /* renamed from: a */
    public final Set f53361a = new LinkedHashSet();

    /* renamed from: b */
    public final Set f53362b = new LinkedHashSet();

    /* renamed from: c */
    public final Set f53363c = new LinkedHashSet();

    /* renamed from: f */
    public boolean f53366f = true;

    /* renamed from: g */
    public Animator f53367g = null;

    /* renamed from: a */
    public void m55844a(boolean z) {
        this.f53366f = z;
    }

    /* renamed from: b */
    public void m55845b(SearchBar searchBar) {
        Animator animator = this.f53364d;
        if (animator != null) {
            animator.end();
        }
        Animator animator2 = this.f53365e;
        if (animator2 != null) {
            animator2.end();
        }
        View centerView = searchBar.getCenterView();
        if (centerView != null) {
            centerView.setAlpha(0.0f);
        }
    }
}
