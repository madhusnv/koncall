package p001o;

import android.graphics.drawable.Drawable;
import android.util.SparseIntArray;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.appcompat.widget.Toolbar;
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
public class lg7 extends kg7 {
    public static final ewi.C13274i S0 = null;
    public static final SparseIntArray T0;
    public final CoordinatorLayout P0;
    public boolean Q0;
    public long R0;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        T0 = sparseIntArray;
        sparseIntArray.put(z8e.appBar, 9);
        sparseIntArray.put(z8e.toolbar, 10);
        sparseIntArray.put(z8e.leadsAppBar, 11);
        sparseIntArray.put(z8e.pagerTab, 12);
        sparseIntArray.put(z8e.searchLeadsEditTextLayout, 13);
        sparseIntArray.put(z8e.searchLeadsEditText, 14);
        sparseIntArray.put(z8e.announcements, 15);
        sparseIntArray.put(z8e.leadsTab, 16);
        sparseIntArray.put(z8e.bulkActionLabel, 17);
        sparseIntArray.put(z8e.bulkActionAssign, 18);
        sparseIntArray.put(z8e.bulkActionResolve, 19);
        sparseIntArray.put(z8e.swipeRefreshLayout, 20);
        sparseIntArray.put(z8e.fabStartChat, 21);
    }

    public lg7(yt4 yt4Var, View view) {
        this(yt4Var, view, ewi.m25671L(yt4Var, view, 22, S0, T0));
    }

    @Override // p001o.ewi
    /* renamed from: E */
    public boolean mo16290E() {
        synchronized (this) {
            return this.R0 != 0;
        }
    }

    @Override // p001o.ewi
    /* renamed from: G */
    public void mo16291G() {
        synchronized (this) {
            this.R0 = 128L;
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
            m0(((Boolean) obj).booleanValue());
        } else if (89 == i) {
            t0(((Boolean) obj).booleanValue());
        } else if (87 == i) {
            s0(((Boolean) obj).booleanValue());
        } else if (93 == i) {
            n0(((Boolean) obj).booleanValue());
        } else if (86 == i) {
            q0(((Boolean) obj).booleanValue());
        } else if (83 == i) {
            p0(((Boolean) obj).booleanValue());
        } else {
            if (65 != i) {
                return false;
            }
            l0(((Boolean) obj).booleanValue());
        }
        return true;
    }

    @Override // p001o.kg7
    public void l0(boolean z) {
        this.J0 = z;
        synchronized (this) {
            this.R0 |= 64;
        }
        m28509h(65);
        super.m25692R();
    }

    @Override // p001o.kg7
    public void m0(boolean z) {
        this.O0 = z;
        synchronized (this) {
            this.R0 |= 1;
        }
        m28509h(90);
        super.m25692R();
    }

    @Override // p001o.kg7
    public void n0(boolean z) {
        this.N0 = z;
        synchronized (this) {
            this.R0 |= 8;
        }
        m28509h(93);
        super.m25692R();
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x0157  */
    /* JADX WARN: Removed duplicated region for block: B:102:0x015e  */
    /* JADX WARN: Removed duplicated region for block: B:109:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0080 A[PHI: r2
      0x0080: PHI (r2v3 long) = (r2v2 long), (r2v26 long), (r2v26 long) binds: [B:23:0x0057, B:35:0x0079, B:36:0x007b] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x009c A[PHI: r2
      0x009c: PHI (r2v5 long) = (r2v4 long), (r2v23 long) binds: [B:40:0x0088, B:46:0x0097] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00b7 A[PHI: r2
      0x00b7: PHI (r2v7 long) = (r2v6 long), (r2v21 long) binds: [B:50:0x00a4, B:56:0x00b1] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0109  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0114  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x012f  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x014c  */
    @Override // p001o.ewi
    /* renamed from: p */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void mo16295p() {
        long j;
        Drawable drawableM37353b;
        int i;
        long j2;
        int i2;
        long j3;
        int i3;
        long j4;
        int i4;
        boolean z;
        long j5;
        int i5;
        long j6;
        synchronized (this) {
            j = this.R0;
            this.R0 = 0L;
        }
        boolean z2 = this.O0;
        boolean z3 = this.N0;
        boolean z4 = this.I0;
        boolean z5 = this.J0;
        long j7 = j & 129;
        if (j7 != 0) {
            if (j7 != 0) {
                j = z2 ? j | MediaStatus.COMMAND_QUEUE_REPEAT_ONE | MediaStatus.COMMAND_UNFOLLOW : j | MediaStatus.COMMAND_QUEUE_REPEAT_ALL | MediaStatus.COMMAND_FOLLOW;
            }
            drawableM37353b = lk0.m37353b(this.y0.getContext(), z2 ? w7e.ic_back_arrow : w7e.ic_home_menu);
            if (!z2) {
                i = 8;
            }
            j2 = j & 137;
            if (j2 == 0) {
                i2 = 0;
            } else {
                if (j2 != 0) {
                    j = z3 ? j | MediaStatus.COMMAND_PLAYBACK_RATE : j | MediaStatus.COMMAND_EDIT_TRACKS;
                }
                if ((j & 136) != 0) {
                    j |= z3 ? 524288L : MediaStatus.COMMAND_STREAM_TRANSFER;
                }
                if ((j & 136) != 0 && z3) {
                    i2 = 8;
                }
            }
            j3 = j & 160;
            if (j3 == 0) {
                i3 = 0;
            } else {
                if (j3 != 0) {
                    j |= z4 ? 2097152L : 1048576L;
                }
                if (z4) {
                    i3 = 8;
                }
            }
            j4 = j & 192;
            if (j4 == 0) {
                i4 = 0;
            } else {
                if (j4 != 0) {
                    j |= z5 ? 512L : 256L;
                }
                if (!z5) {
                    i4 = 8;
                }
            }
            if ((j & MediaStatus.COMMAND_PLAYBACK_RATE) == 0) {
                if ((j & 129) != 0) {
                    j = z2 ? j | MediaStatus.COMMAND_QUEUE_REPEAT_ONE | MediaStatus.COMMAND_UNFOLLOW : j | MediaStatus.COMMAND_QUEUE_REPEAT_ALL | MediaStatus.COMMAND_FOLLOW;
                }
                z = !z2;
            } else {
                z = false;
            }
            j5 = j & 137;
            if (j5 == 0) {
                if (!z3) {
                    z = false;
                }
                if (j5 != 0) {
                    j |= z ? MediaStatus.COMMAND_DISLIKE : MediaStatus.COMMAND_LIKE;
                }
                i5 = z ? 0 : 8;
            } else {
                i5 = 0;
            }
            if ((j & 192) != 0) {
                this.s0.setVisibility(i4);
            }
            if ((j & 137) != 0) {
                this.t0.setVisibility(i5);
            }
            if ((j & 129) != 0) {
                this.u0.setVisibility(i);
                this.w0.setVisibility(i);
                nr1.w0(this.y0, drawableM37353b);
                this.z0.setVisibility(i);
            }
            j6 = 128 & j;
            if (j6 != 0) {
                CoordinatorLayout coordinatorLayout = this.P0;
                boolean z6 = this.Q0;
                wh1.m54388b(coordinatorLayout, false, z6, false, z6, false, true, false, true);
            }
            if ((j & 136) != 0) {
                this.F0.setVisibility(i2);
            }
            if ((j & 160) != 0) {
                this.G0.setVisibility(i3);
            }
            if (j6 == 0) {
                this.Q0 = true;
                return;
            }
            return;
        }
        drawableM37353b = null;
        i = 0;
        j2 = j & 137;
        if (j2 == 0) {
        }
        j3 = j & 160;
        if (j3 == 0) {
        }
        j4 = j & 192;
        if (j4 == 0) {
        }
        if ((j & MediaStatus.COMMAND_PLAYBACK_RATE) == 0) {
        }
        j5 = j & 137;
        if (j5 == 0) {
        }
        if ((j & 192) != 0) {
        }
        if ((j & 137) != 0) {
        }
        if ((j & 129) != 0) {
        }
        j6 = 128 & j;
        if (j6 != 0) {
        }
        if ((j & 136) != 0) {
        }
        if ((j & 160) != 0) {
        }
        if (j6 == 0) {
        }
    }

    public void p0(boolean z) {
        this.I0 = z;
        synchronized (this) {
            this.R0 |= 32;
        }
        m28509h(83);
        super.m25692R();
    }

    public void q0(boolean z) {
        this.M0 = z;
    }

    public void s0(boolean z) {
        this.K0 = z;
    }

    public void t0(boolean z) {
        this.L0 = z;
    }

    public lg7(yt4 yt4Var, View view, Object[] objArr) {
        super(yt4Var, view, 0, (ShapeableImageView) objArr[15], (AppBarLayout) objArr[9], (ShapeableImageView) objArr[18], (ShapeableImageView) objArr[17], (ShapeableImageView) objArr[19], (ShapeableImageView) objArr[7], (MaterialTextView) objArr[2], (ShapeableImageView) objArr[5], (FloatingActionButton) objArr[21], (MaterialTextView) objArr[6], (LinearLayout) objArr[11], (ShapeableImageView) objArr[3], (LinearLayout) objArr[4], (TabLayout) objArr[16], (TabLayout) objArr[12], (TextInputEditText) objArr[14], (TextInputLayout) objArr[13], (SwipeRefreshLayout) objArr[20], (FrameLayout) objArr[1], (ViewPager2) objArr[8], (Toolbar) objArr[10]);
        this.R0 = -1L;
        this.s0.setTag(null);
        this.t0.setTag(null);
        this.u0.setTag(null);
        this.w0.setTag(null);
        this.y0.setTag(null);
        this.z0.setTag(null);
        CoordinatorLayout coordinatorLayout = (CoordinatorLayout) objArr[0];
        this.P0 = coordinatorLayout;
        coordinatorLayout.setTag(null);
        this.F0.setTag(null);
        this.G0.setTag(null);
        a0(view);
        mo16291G();
    }
}
