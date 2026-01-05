package p001o;

import ai.salesmax.model.HomeTasksStatus;
import ai.salesmax.view.WrapContentViewPager;
import android.view.View;
import android.widget.Button;
import android.widget.FrameLayout;
import com.google.android.material.button.MaterialButtonToggleGroup;
import com.google.android.material.card.MaterialCardView;
import com.google.android.material.tabs.TabLayout;

/* loaded from: classes.dex */
public abstract class k24 extends ewi {
    public ck6 A0;
    public final Button n0;
    public final Button o0;
    public final Button p0;
    public final WrapContentViewPager q0;
    public final MaterialCardView r0;
    public final c24 s0;
    public final e24 t0;
    public final g24 u0;
    public final TabLayout v0;
    public final FrameLayout w0;
    public final MaterialButtonToggleGroup x0;
    public HomeTasksStatus y0;
    public Integer z0;

    public k24(Object obj, View view, int i, Button button, Button button2, Button button3, WrapContentViewPager wrapContentViewPager, MaterialCardView materialCardView, c24 c24Var, e24 e24Var, g24 g24Var, TabLayout tabLayout, FrameLayout frameLayout, MaterialButtonToggleGroup materialButtonToggleGroup) {
        super(obj, view, i);
        this.n0 = button;
        this.o0 = button2;
        this.p0 = button3;
        this.q0 = wrapContentViewPager;
        this.r0 = materialCardView;
        this.s0 = c24Var;
        this.t0 = e24Var;
        this.u0 = g24Var;
        this.v0 = tabLayout;
        this.w0 = frameLayout;
        this.x0 = materialButtonToggleGroup;
    }
}
