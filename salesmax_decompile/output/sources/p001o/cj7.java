package p001o;

import ai.salesmax.model.LeadsUser;
import android.util.SparseIntArray;
import android.view.View;
import android.widget.LinearLayout;
import androidx.appcompat.widget.Toolbar;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.viewpager2.widget.ViewPager2;
import com.google.android.gms.cast.MediaStatus;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.card.MaterialCardView;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.imageview.ShapeableImageView;
import com.google.android.material.tabs.TabLayout;
import com.google.android.material.textview.MaterialTextView;
import p001o.ewi;
import p001o.jbc;

/* loaded from: classes.dex */
public class cj7 extends bj7 implements jbc.InterfaceC14485a {
    public static final ewi.C13274i S0 = null;
    public static final SparseIntArray T0;
    public final CoordinatorLayout O0;
    public final View.OnClickListener P0;
    public boolean Q0;
    public long R0;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        T0 = sparseIntArray;
        sparseIntArray.put(z8e.toolbar, 8);
        sparseIntArray.put(z8e.userDetailsClose, 9);
        sparseIntArray.put(z8e.userDetailsMore, 10);
        sparseIntArray.put(z8e.userEdit, 11);
        sparseIntArray.put(z8e.userRemove, 12);
        sparseIntArray.put(z8e.leadSend, 13);
        sparseIntArray.put(z8e.leadShare, 14);
        sparseIntArray.put(z8e.leadWhatsapp, 15);
        sparseIntArray.put(z8e.requestedUser, 16);
        sparseIntArray.put(z8e.rejectRequest, 17);
        sparseIntArray.put(z8e.acceptRequest, 18);
        sparseIntArray.put(z8e.leadDetailsBorder1, 19);
        sparseIntArray.put(z8e.leadsPager, 20);
        sparseIntArray.put(z8e.fabCall, 21);
    }

    public cj7(yt4 yt4Var, View view) {
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
            this.R0 = 64L;
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
        if (73 == i) {
            p0((Integer) obj);
        } else if (93 == i) {
            l0(((Boolean) obj).booleanValue());
        } else if (70 == i) {
            k0((Boolean) obj);
        } else if (33 == i) {
            m0((ck6) obj);
        } else if (41 == i) {
            n0((Boolean) obj);
        } else {
            if (67 != i) {
                return false;
            }
            j0((LeadsUser) obj);
        }
        return true;
    }

    @Override // p001o.jbc.InterfaceC14485a
    /* renamed from: c */
    public final void mo16294c(int i, View view) {
        ck6 ck6Var = this.L0;
        LeadsUser leadsUser = this.I0;
        Integer num = this.K0;
        if (ck6Var != null) {
            ck6Var.mo708b(view, num.intValue(), leadsUser);
        }
    }

    @Override // p001o.bj7
    public void j0(LeadsUser leadsUser) {
        this.I0 = leadsUser;
        synchronized (this) {
            this.R0 |= 32;
        }
        m28509h(67);
        super.m25692R();
    }

    @Override // p001o.bj7
    public void k0(Boolean bool) {
        this.M0 = bool;
        synchronized (this) {
            this.R0 |= 4;
        }
        m28509h(70);
        super.m25692R();
    }

    @Override // p001o.bj7
    public void l0(boolean z) {
        this.N0 = z;
        synchronized (this) {
            this.R0 |= 2;
        }
        m28509h(93);
        super.m25692R();
    }

    public void m0(ck6 ck6Var) {
        this.L0 = ck6Var;
        synchronized (this) {
            this.R0 |= 8;
        }
        m28509h(33);
        super.m25692R();
    }

    public void n0(Boolean bool) {
        this.J0 = bool;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0028 A[PHI: r2
      0x0028: PHI (r2v1 long) = (r2v0 long), (r2v15 long) binds: [B:7:0x0017, B:13:0x0023] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0045 A[PHI: r2
      0x0045: PHI (r2v3 long) = (r2v2 long), (r2v13 long) binds: [B:17:0x002f, B:24:0x003f] A[DONT_GENERATE, DONT_INLINE]] */
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
        String str;
        String str2;
        String str3;
        String authorizationLevel;
        String name;
        synchronized (this) {
            j = this.R0;
            this.R0 = 0L;
        }
        boolean z = this.N0;
        Boolean bool = this.M0;
        LeadsUser leadsUser = this.I0;
        long j2 = j & 66;
        int i4 = 0;
        if (j2 == 0) {
            i = 0;
        } else {
            if (j2 != 0) {
                j |= z ? MediaStatus.COMMAND_LIKE : MediaStatus.COMMAND_PLAYBACK_RATE;
            }
            if (z) {
                i = 8;
            }
        }
        long j3 = j & 68;
        if (j3 != 0) {
            boolean zM25676W = ewi.m25676W(bool);
            if (j3 != 0) {
                j |= zM25676W ? MediaStatus.COMMAND_EDIT_TRACKS : MediaStatus.COMMAND_QUEUE_REPEAT_ONE;
            }
            i2 = zM25676W ? 0 : 8;
        }
        long j4 = j & 96;
        String designation = null;
        if (j4 != 0) {
            boolean z2 = leadsUser == null;
            if (j4 != 0) {
                j |= z2 ? MediaStatus.COMMAND_QUEUE_REPEAT_ALL : 512L;
            }
            if (leadsUser != null) {
                designation = leadsUser.getDesignation();
                authorizationLevel = leadsUser.getAuthorizationLevel();
                name = leadsUser.getName();
            } else {
                authorizationLevel = null;
                name = null;
            }
            int i5 = z2 ? 4 : 0;
            boolean zIsEmpty = designation != null ? designation.isEmpty() : false;
            if ((j & 96) != 0) {
                j |= zIsEmpty ? 256L : 128L;
            }
            str3 = authorizationLevel;
            i3 = zIsEmpty ? 8 : 0;
            str = designation;
            i4 = i5;
            str2 = name;
        } else {
            i3 = 0;
            str = null;
            str2 = null;
            str3 = null;
        }
        if ((68 & j) != 0) {
            this.o0.setVisibility(i2);
        }
        long j5 = 64 & j;
        if (j5 != 0) {
            this.q0.setOnClickListener(this.P0);
            CoordinatorLayout coordinatorLayout = this.O0;
            boolean z3 = this.Q0;
            wh1.m54388b(coordinatorLayout, false, z3, false, z3, false, true, false, true);
        }
        if ((j & 96) != 0) {
            nr1.V0(this.q0, leadsUser);
            this.s0.setVisibility(i4);
            nr1.f1(this.B0, str3);
            this.C0.setVisibility(i3);
            nr1.f1(this.C0, str);
            nr1.f1(this.D0, str2);
        }
        if ((j & 66) != 0) {
            this.x0.setVisibility(i);
        }
        if (j5 != 0) {
            this.Q0 = true;
        }
    }

    public void p0(Integer num) {
        this.K0 = num;
        synchronized (this) {
            this.R0 |= 1;
        }
        m28509h(73);
        super.m25692R();
    }

    public cj7(yt4 yt4Var, View view, Object[] objArr) {
        super(yt4Var, view, 0, (MaterialButton) objArr[18], (MaterialCardView) objArr[6], (FloatingActionButton) objArr[21], (ShapeableImageView) objArr[1], (View) objArr[19], (LinearLayout) objArr[5], (MaterialButton) objArr[13], (MaterialButton) objArr[14], (MaterialButton) objArr[15], (ViewPager2) objArr[20], (TabLayout) objArr[7], (MaterialButton) objArr[17], (MaterialTextView) objArr[16], (Toolbar) objArr[8], (MaterialTextView) objArr[4], (MaterialTextView) objArr[3], (MaterialTextView) objArr[2], (ShapeableImageView) objArr[9], (ShapeableImageView) objArr[10], (MaterialButton) objArr[11], (MaterialButton) objArr[12]);
        this.R0 = -1L;
        this.o0.setTag(null);
        this.q0.setTag(null);
        this.s0.setTag(null);
        this.x0.setTag(null);
        CoordinatorLayout coordinatorLayout = (CoordinatorLayout) objArr[0];
        this.O0 = coordinatorLayout;
        coordinatorLayout.setTag(null);
        this.B0.setTag(null);
        this.C0.setTag(null);
        this.D0.setTag(null);
        a0(view);
        this.P0 = new jbc(this, 1);
        mo16291G();
    }
}
