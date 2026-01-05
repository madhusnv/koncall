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
import com.google.android.material.button.MaterialButton;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.imageview.ShapeableImageView;
import com.google.android.material.tabs.TabLayout;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;
import com.google.android.material.textview.MaterialTextView;
import lombok.javac.Javac;
import p001o.ewi;

/* loaded from: classes.dex */
public class o5a extends n5a {
    public static final ewi.C13274i W0 = null;
    public static final SparseIntArray X0;
    public final CoordinatorLayout T0;
    public boolean U0;
    public long V0;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        X0 = sparseIntArray;
        sparseIntArray.put(z8e.appBar, 17);
        sparseIntArray.put(z8e.toolbar, 18);
        sparseIntArray.put(z8e.leadsAppBar, 19);
        sparseIntArray.put(z8e.searchLeadsEditText, 20);
        sparseIntArray.put(z8e.frame_container, 21);
        sparseIntArray.put(z8e.leadsFilter_badge, 22);
        sparseIntArray.put(z8e.deletePic, 23);
        sparseIntArray.put(z8e.swipeRefreshLayout, 24);
    }

    public o5a(yt4 yt4Var, View view) {
        this(yt4Var, view, ewi.m25671L(yt4Var, view, 25, W0, X0));
    }

    @Override // p001o.ewi
    /* renamed from: E */
    public boolean mo16290E() {
        synchronized (this) {
            return this.V0 != 0;
        }
    }

    @Override // p001o.ewi
    /* renamed from: G */
    public void mo16291G() {
        synchronized (this) {
            this.V0 = 256L;
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
            p0(((Boolean) obj).booleanValue());
        } else if (89 == i) {
            v0(((Boolean) obj).booleanValue());
        } else if (93 == i) {
            q0(((Boolean) obj).booleanValue());
        } else if (83 == i) {
            n0(((Boolean) obj).booleanValue());
        } else if (24 == i) {
            m0(((Boolean) obj).booleanValue());
        } else if (85 == i) {
            s0(((Boolean) obj).booleanValue());
        } else if (87 == i) {
            u0(((Boolean) obj).booleanValue());
        } else {
            if (86 != i) {
                return false;
            }
            t0(((Boolean) obj).booleanValue());
        }
        return true;
    }

    @Override // p001o.n5a
    public void m0(boolean z) {
        this.S0 = z;
        synchronized (this) {
            this.V0 |= 16;
        }
        m28509h(24);
        super.m25692R();
    }

    @Override // p001o.n5a
    public void n0(boolean z) {
        this.L0 = z;
        synchronized (this) {
            this.V0 |= 8;
        }
        m28509h(83);
        super.m25692R();
    }

    /* JADX WARN: Removed duplicated region for block: B:103:0x0145 A[PHI: r2
      0x0145: PHI (r2v7 long) = (r2v6 long), (r2v19 long) binds: [B:93:0x0130, B:101:0x0140] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0162 A[PHI: r2
      0x0162: PHI (r2v9 long) = (r2v8 long), (r2v17 long) binds: [B:105:0x014b, B:113:0x015d] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x007a A[PHI: r2
      0x007a: PHI (r2v1 long) = (r2v0 long), (r2v42 long) binds: [B:7:0x0026, B:26:0x0067] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00d3 A[PHI: r2
      0x00d3: PHI (r2v3 long) = (r2v2 long), (r2v33 long) binds: [B:36:0x009a, B:53:0x00c7] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // p001o.ewi
    /* renamed from: p */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void mo16295p() {
        long j;
        int i;
        int i2;
        int i3;
        Drawable drawableM37353b;
        int i4;
        int i5;
        int i6;
        long j2;
        long j3;
        synchronized (this) {
            j = this.V0;
            this.V0 = 0L;
        }
        boolean z = this.R0;
        boolean z2 = this.Q0;
        boolean z3 = this.L0;
        boolean z4 = this.S0;
        boolean z5 = this.M0;
        if ((281 & j) == 0) {
            i = 0;
            i2 = 0;
        } else {
            if ((j & 257) != 0) {
                if (z) {
                    j2 = j | 1048576;
                    j3 = 67108864;
                } else {
                    j2 = j | 524288;
                    j3 = 33554432;
                }
                j = j2 | j3;
            }
            if ((j & 265) != 0) {
                j = z ? j | 4194304 : j | 2097152;
            }
            if ((j & 273) != 0) {
                j |= z ? 268435456L : 134217728L;
            }
            if ((j & 257) != 0) {
                i = z ? 8 : 0;
                i2 = z ? 0 : 8;
            }
        }
        if ((j & 300) == 0) {
            i3 = 0;
        } else {
            if ((j & 296) != 0) {
                j = z3 ? j | MediaStatus.COMMAND_QUEUE_REPEAT_ALL : j | 512;
            }
            if ((j & 268) != 0) {
                j = z3 ? j | Javac.GENERATED_MEMBER : j | 8388608;
            }
            if ((j & 264) != 0) {
                j = z3 ? j | 1073741824 : j | 536870912;
            }
            if ((j & 264) != 0) {
                i3 = z3 ? 8 : 0;
            }
        }
        if ((2097152 & j) != 0) {
            if ((j & 296) != 0) {
                j = z3 ? j | MediaStatus.COMMAND_QUEUE_REPEAT_ALL : j | 512;
            }
            if ((j & 268) != 0) {
                j = z3 ? j | Javac.GENERATED_MEMBER : j | 8388608;
            }
            if ((j & 264) != 0) {
                j = z3 ? j | 1073741824 : j | 536870912;
            }
        }
        long j4 = j & 265;
        if (j4 != 0) {
            boolean z6 = z ? true : z3;
            if (j4 != 0) {
                j |= z6 ? MediaStatus.COMMAND_LIKE : MediaStatus.COMMAND_PLAYBACK_RATE;
            }
            drawableM37353b = lk0.m37353b(this.A0.getContext(), z6 ? w7e.ic_back_arrow : w7e.ic_home_menu);
        } else {
            drawableM37353b = null;
        }
        long j5 = j & 273;
        if (j5 == 0) {
            i4 = 0;
        } else {
            if (z) {
                z4 = true;
            }
            if (j5 != 0) {
                j |= z4 ? MediaStatus.COMMAND_EDIT_TRACKS : MediaStatus.COMMAND_QUEUE_REPEAT_ONE;
            }
            if (z4) {
                i4 = 8;
            }
        }
        long j6 = j & 296;
        if (j6 == 0) {
            i5 = 0;
        } else {
            if (z3) {
                z5 = true;
            }
            if (j6 != 0) {
                j |= z5 ? MediaStatus.COMMAND_STREAM_TRANSFER : MediaStatus.COMMAND_UNFOLLOW;
            }
            if (z5) {
                i5 = 8;
            }
        }
        long j7 = j & 268;
        if (j7 != 0) {
            if (z3) {
                z2 = true;
            }
            if (j7 != 0) {
                j |= z2 ? MediaStatus.COMMAND_FOLLOW : MediaStatus.COMMAND_DISLIKE;
            }
            i6 = z2 ? 8 : 0;
        } else {
            i6 = 0;
        }
        if ((j & 257) != 0) {
            int i7 = i2;
            this.n0.setVisibility(i7);
            this.p0.setVisibility(i7);
            this.q0.setVisibility(i7);
            this.s0.setVisibility(i7);
            this.t0.setVisibility(i);
            this.u0.setVisibility(i);
            this.w0.setVisibility(i7);
            this.B0.setVisibility(i7);
            this.D0.setVisibility(i);
            this.E0.setVisibility(i7);
            this.I0.setVisibility(i7);
        }
        if ((j & 273) != 0) {
            this.y0.setVisibility(i4);
        }
        if ((j & 265) != 0) {
            nr1.w0(this.A0, drawableM37353b);
        }
        if ((j & 296) != 0) {
            this.C0.setVisibility(i5);
        }
        if ((j & 268) != 0) {
            this.F0.setVisibility(i6);
        }
        long j8 = 256 & j;
        if (j8 != 0) {
            CoordinatorLayout coordinatorLayout = this.T0;
            boolean z7 = this.U0;
            wh1.m54388b(coordinatorLayout, false, z7, false, z7, false, true, false, true);
        }
        if ((j & 264) != 0) {
            this.H0.setVisibility(i3);
        }
        if (j8 != 0) {
            this.U0 = true;
        }
    }

    @Override // p001o.n5a
    public void p0(boolean z) {
        this.R0 = z;
        synchronized (this) {
            this.V0 |= 1;
        }
        m28509h(90);
        super.m25692R();
    }

    @Override // p001o.n5a
    public void q0(boolean z) {
        this.Q0 = z;
        synchronized (this) {
            this.V0 |= 4;
        }
        m28509h(93);
        super.m25692R();
    }

    public void s0(boolean z) {
        this.M0 = z;
        synchronized (this) {
            this.V0 |= 32;
        }
        m28509h(85);
        super.m25692R();
    }

    public void t0(boolean z) {
        this.P0 = z;
    }

    public void u0(boolean z) {
        this.N0 = z;
    }

    public void v0(boolean z) {
        this.O0 = z;
    }

    public o5a(yt4 yt4Var, View view, Object[] objArr) {
        super(yt4Var, view, 0, (MaterialButton) objArr[10], (AppBarLayout) objArr[17], (MaterialButton) objArr[12], (MaterialButton) objArr[13], (MaterialButton) objArr[23], (ShapeableImageView) objArr[8], (FloatingActionButton) objArr[15], (FloatingActionButton) objArr[16], (FrameLayout) objArr[21], (MaterialTextView) objArr[9], (ConstraintLayout) objArr[19], (ShapeableImageView) objArr[3], (TextView) objArr[22], (ShapeableImageView) objArr[1], (ShapeableImageView) objArr[5], (ViewPager2) objArr[14], (ShapeableImageView) objArr[4], (LinearLayout) objArr[7], (TabLayout) objArr[6], (TextInputEditText) objArr[20], (TextInputLayout) objArr[2], (MaterialButton) objArr[11], (SwipeRefreshLayout) objArr[24], (Toolbar) objArr[18]);
        this.V0 = -1L;
        this.n0.setTag(null);
        this.p0.setTag(null);
        this.q0.setTag(null);
        this.s0.setTag(null);
        this.t0.setTag(null);
        this.u0.setTag(null);
        this.w0.setTag(null);
        this.y0.setTag(null);
        this.A0.setTag(null);
        this.B0.setTag(null);
        this.C0.setTag(null);
        this.D0.setTag(null);
        this.E0.setTag(null);
        this.F0.setTag(null);
        CoordinatorLayout coordinatorLayout = (CoordinatorLayout) objArr[0];
        this.T0 = coordinatorLayout;
        coordinatorLayout.setTag(null);
        this.H0.setTag(null);
        this.I0.setTag(null);
        a0(view);
        mo16291G();
    }
}
