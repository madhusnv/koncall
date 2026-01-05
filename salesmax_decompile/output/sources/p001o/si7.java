package p001o;

import ai.salesmax.model.LeadsTeam;
import android.util.SparseIntArray;
import android.view.View;
import android.widget.LinearLayout;
import androidx.appcompat.widget.Toolbar;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.viewpager2.widget.ViewPager2;
import com.google.android.gms.cast.MediaStatus;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.imageview.ShapeableImageView;
import com.google.android.material.tabs.TabLayout;
import com.google.android.material.textview.MaterialTextView;
import java.util.Date;
import p001o.ewi;

/* loaded from: classes.dex */
public class si7 extends ri7 {
    public static final ewi.C13274i I0 = null;
    public static final SparseIntArray J0;
    public final CoordinatorLayout F0;
    public boolean G0;
    public long H0;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        J0 = sparseIntArray;
        sparseIntArray.put(z8e.toolbar, 6);
        sparseIntArray.put(z8e.teamDetailsClose, 7);
        sparseIntArray.put(z8e.userDetailsMore, 8);
        sparseIntArray.put(z8e.userEdit, 9);
        sparseIntArray.put(z8e.memberAdd, 10);
        sparseIntArray.put(z8e.leadDetailsBorder1, 11);
        sparseIntArray.put(z8e.leadsPager, 12);
    }

    public si7(yt4 yt4Var, View view) {
        this(yt4Var, view, ewi.m25671L(yt4Var, view, 13, I0, J0));
    }

    @Override // p001o.ewi
    /* renamed from: E */
    public boolean mo16290E() {
        synchronized (this) {
            return this.H0 != 0;
        }
    }

    @Override // p001o.ewi
    /* renamed from: G */
    public void mo16291G() {
        synchronized (this) {
            this.H0 = 64L;
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
            j0((LeadsTeam) obj);
        }
        return true;
    }

    @Override // p001o.ri7
    public void j0(LeadsTeam leadsTeam) {
        this.z0 = leadsTeam;
        synchronized (this) {
            this.H0 |= 32;
        }
        m28509h(67);
        super.m25692R();
    }

    @Override // p001o.ri7
    public void k0(Boolean bool) {
        this.D0 = bool;
    }

    @Override // p001o.ri7
    public void l0(boolean z) {
        this.E0 = z;
        synchronized (this) {
            this.H0 |= 2;
        }
        m28509h(93);
        super.m25692R();
    }

    public void m0(ck6 ck6Var) {
        this.C0 = ck6Var;
    }

    public void n0(Boolean bool) {
        this.A0 = bool;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0027 A[PHI: r2
      0x0027: PHI (r2v1 long) = (r2v0 long), (r2v10 long) binds: [B:7:0x0017, B:13:0x0023] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // p001o.ewi
    /* renamed from: p */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void mo16295p() {
        long j;
        int i;
        int i2;
        String str;
        String teamName;
        Date date;
        synchronized (this) {
            j = this.H0;
            this.H0 = 0L;
        }
        boolean z = this.E0;
        LeadsTeam leadsTeam = this.z0;
        long j2 = j & 66;
        int i3 = 0;
        if (j2 == 0) {
            i = 0;
        } else {
            if (j2 != 0) {
                j |= z ? MediaStatus.COMMAND_EDIT_TRACKS : MediaStatus.COMMAND_QUEUE_REPEAT_ONE;
            }
            if (z) {
                i = 8;
            }
        }
        long j3 = j & 96;
        Date date2 = null;
        String description = null;
        if (j3 != 0) {
            Object[] objArr = leadsTeam == null;
            if (j3 != 0) {
                j |= objArr != false ? MediaStatus.COMMAND_QUEUE_REPEAT_ALL : 512L;
            }
            if (leadsTeam != null) {
                Date createdAt = leadsTeam.getCreatedAt();
                teamName = leadsTeam.getTeamName();
                description = leadsTeam.getDescription();
                date = createdAt;
            } else {
                date = null;
                teamName = null;
            }
            int i4 = objArr != false ? 4 : 0;
            boolean zIsEmpty = description != null ? description.isEmpty() : false;
            if ((j & 96) != 0) {
                j |= zIsEmpty ? 256L : 128L;
            }
            i2 = zIsEmpty ? 8 : 0;
            i3 = i4;
            String str2 = description;
            date2 = date;
            str = str2;
        } else {
            i2 = 0;
            str = null;
            teamName = null;
        }
        if ((96 & j) != 0) {
            this.o0.setVisibility(i3);
            nr1.j2(this.t0, date2);
            this.v0.setVisibility(i2);
            nr1.f1(this.v0, str);
            nr1.f1(this.w0, teamName);
        }
        if ((j & 66) != 0) {
            this.q0.setVisibility(i);
        }
        long j4 = j & 64;
        if (j4 != 0) {
            CoordinatorLayout coordinatorLayout = this.F0;
            boolean z2 = this.G0;
            wh1.m54388b(coordinatorLayout, false, z2, false, z2, false, true, false, true);
        }
        if (j4 != 0) {
            this.G0 = true;
        }
    }

    public void p0(Integer num) {
        this.B0 = num;
    }

    public si7(yt4 yt4Var, View view, Object[] objArr) {
        super(yt4Var, view, 0, (View) objArr[11], (LinearLayout) objArr[4], (ViewPager2) objArr[12], (TabLayout) objArr[5], (MaterialButton) objArr[10], (ShapeableImageView) objArr[7], (MaterialTextView) objArr[3], (Toolbar) objArr[6], (MaterialTextView) objArr[2], (MaterialTextView) objArr[1], (ShapeableImageView) objArr[8], (MaterialButton) objArr[9]);
        this.H0 = -1L;
        this.o0.setTag(null);
        this.q0.setTag(null);
        CoordinatorLayout coordinatorLayout = (CoordinatorLayout) objArr[0];
        this.F0 = coordinatorLayout;
        coordinatorLayout.setTag(null);
        this.t0.setTag(null);
        this.v0.setTag(null);
        this.w0.setTag(null);
        a0(view);
        mo16291G();
    }
}
