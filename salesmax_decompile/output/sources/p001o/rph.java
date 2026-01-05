package p001o;

import android.graphics.drawable.Drawable;
import android.util.SparseIntArray;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import androidx.viewpager2.widget.ViewPager2;
import com.google.android.gms.cast.MediaStatus;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.imageview.ShapeableImageView;
import com.google.android.material.tabs.TabLayout;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;
import com.google.android.material.textview.MaterialTextView;
import p001o.ewi;

/* loaded from: classes.dex */
public class rph extends qph {
    public static final ewi.C13274i K0 = null;
    public static final SparseIntArray L0;
    public final CoordinatorLayout G0;
    public final ShapeableImageView H0;
    public boolean I0;
    public long J0;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        L0 = sparseIntArray;
        sparseIntArray.put(z8e.appBar, 9);
        sparseIntArray.put(z8e.toolbar, 10);
        sparseIntArray.put(z8e.todoAppBar, 11);
        sparseIntArray.put(z8e.searchTodoTextInputLayout, 12);
        sparseIntArray.put(z8e.searchTodoEditText, 13);
        sparseIntArray.put(z8e.todoFilter, 14);
        sparseIntArray.put(z8e.todoFilter_badge, 15);
        sparseIntArray.put(z8e.swipeRefreshLayout, 16);
        sparseIntArray.put(z8e.tasksPager, 17);
        sparseIntArray.put(z8e.floating_action_button, 18);
    }

    public rph(yt4 yt4Var, View view) {
        this(yt4Var, view, ewi.m25671L(yt4Var, view, 19, K0, L0));
    }

    @Override // p001o.ewi
    /* renamed from: E */
    public boolean mo16290E() {
        synchronized (this) {
            return this.J0 != 0;
        }
    }

    @Override // p001o.ewi
    /* renamed from: G */
    public void mo16291G() {
        synchronized (this) {
            this.J0 = 4L;
        }
        m25692R();
    }

    @Override // p001o.ewi
    /* renamed from: M */
    public boolean mo16292M(int i, Object obj, int i2) {
        return false;
    }

    @Override // p001o.ewi
    public boolean b0(int i, Object obj) {
        if (90 == i) {
            l0(((Boolean) obj).booleanValue());
        } else {
            if (93 != i) {
                return false;
            }
            m0(((Boolean) obj).booleanValue());
        }
        return true;
    }

    @Override // p001o.qph
    public void l0(boolean z) {
        this.F0 = z;
        synchronized (this) {
            this.J0 |= 1;
        }
        m28509h(90);
        super.m25692R();
    }

    @Override // p001o.qph
    public void m0(boolean z) {
        this.E0 = z;
        synchronized (this) {
            this.J0 |= 2;
        }
        m28509h(93);
        super.m25692R();
    }

    @Override // p001o.ewi
    /* renamed from: p */
    public void mo16295p() {
        long j;
        Drawable drawableM37353b;
        int i;
        int iM25688z;
        int i2;
        long j2;
        long j3;
        synchronized (this) {
            j = this.J0;
            this.J0 = 0L;
        }
        boolean z = this.F0;
        boolean z2 = this.E0;
        long j4 = j & 5;
        int i3 = 0;
        if (j4 != 0) {
            if (j4 != 0) {
                if (z) {
                    j2 = j | 16 | 64 | 256;
                    j3 = MediaStatus.COMMAND_QUEUE_REPEAT_ALL;
                } else {
                    j2 = j | 8 | 32 | 128;
                    j3 = 512;
                }
                j = j2 | j3;
            }
            iM25688z = ewi.m25688z(this.H0, z ? u6e.superfone_purple_10 : u6e.superfone_white);
            i2 = z ? 8 : 0;
            drawableM37353b = lk0.m37353b(this.r0.getContext(), z ? w7e.ic_back_arrow : w7e.ic_home_menu);
            i = z ? 0 : 8;
        } else {
            drawableM37353b = null;
            i = 0;
            iM25688z = 0;
            i2 = 0;
        }
        long j5 = j & 6;
        if (j5 != 0) {
            if (j5 != 0) {
                j |= z2 ? MediaStatus.COMMAND_EDIT_TRACKS : MediaStatus.COMMAND_QUEUE_REPEAT_ONE;
            }
            i3 = z2 ? 8 : 0;
        }
        if ((j & 5) != 0) {
            this.o0.setVisibility(i);
            this.q0.setVisibility(i2);
            nr1.w0(this.r0, drawableM37353b);
            tvi.m50715a(this.H0, b74.m18213b(iM25688z));
            this.v0.setVisibility(i);
            this.w0.setVisibility(i);
            this.y0.setVisibility(i);
        }
        long j6 = 4 & j;
        if (j6 != 0) {
            CoordinatorLayout coordinatorLayout = this.G0;
            boolean z3 = this.I0;
            wh1.m54388b(coordinatorLayout, false, z3, false, z3, false, true, false, true);
        }
        if ((j & 6) != 0) {
            this.z0.setVisibility(i3);
        }
        if (j6 != 0) {
            this.I0 = true;
        }
    }

    public rph(yt4 yt4Var, View view, Object[] objArr) {
        super(yt4Var, view, 0, (AppBarLayout) objArr[9], (ShapeableImageView) objArr[7], (FloatingActionButton) objArr[18], (FrameLayout) objArr[3], (ShapeableImageView) objArr[2], (TextInputEditText) objArr[13], (TextInputLayout) objArr[12], (SwipeRefreshLayout) objArr[16], (MaterialTextView) objArr[8], (ShapeableImageView) objArr[4], (ViewPager2) objArr[17], (LinearLayout) objArr[6], (TabLayout) objArr[5], (ConstraintLayout) objArr[11], (ShapeableImageView) objArr[14], (TextView) objArr[15], (Toolbar) objArr[10]);
        this.J0 = -1L;
        this.o0.setTag(null);
        this.q0.setTag(null);
        this.r0.setTag(null);
        CoordinatorLayout coordinatorLayout = (CoordinatorLayout) objArr[0];
        this.G0 = coordinatorLayout;
        coordinatorLayout.setTag(null);
        ShapeableImageView shapeableImageView = (ShapeableImageView) objArr[1];
        this.H0 = shapeableImageView;
        shapeableImageView.setTag(null);
        this.v0.setTag(null);
        this.w0.setTag(null);
        this.y0.setTag(null);
        this.z0.setTag(null);
        a0(view);
        mo16291G();
    }
}
