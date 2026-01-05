package p001o;

import ai.salesmax.model.HomeLeaderBoard;
import ai.salesmax.services.model.LeaderboardActivityMetrics;
import android.util.SparseIntArray;
import android.view.View;
import android.widget.LinearLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.gms.cast.MediaStatus;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.chip.Chip;
import com.google.android.material.textview.MaterialTextView;
import java.util.ArrayList;
import p001o.ewi;
import p001o.jbc;

/* loaded from: classes.dex */
public class z14 extends y14 implements jbc.InterfaceC14485a {
    public static final ewi.C13274i E0;
    public static final SparseIntArray F0;
    public final ConstraintLayout A0;
    public final ConstraintLayout B0;
    public final View.OnClickListener C0;
    public long D0;

    static {
        ewi.C13274i c13274i = new ewi.C13274i(12);
        E0 = c13274i;
        int i = p9e.item_performer;
        c13274i.m25699a(2, new String[]{"item_performer", "item_performer", "item_performer"}, new int[]{4, 5, 6}, new int[]{i, i, i});
        SparseIntArray sparseIntArray = new SparseIntArray();
        F0 = sparseIntArray;
        sparseIntArray.put(z8e.homeLeaderboardTitle, 7);
        sparseIntArray.put(z8e.chip_metrics1, 8);
        sparseIntArray.put(z8e.chip_metrics2, 9);
        sparseIntArray.put(z8e.chip_metrics3, 10);
        sparseIntArray.put(z8e.chip_metrics4, 11);
    }

    public z14(yt4 yt4Var, View view) {
        this(yt4Var, view, ewi.m25671L(yt4Var, view, 12, E0, F0));
    }

    @Override // p001o.ewi
    /* renamed from: E */
    public boolean mo16290E() {
        synchronized (this) {
            if (this.D0 != 0) {
                return true;
            }
            return this.u0.mo16290E() || this.v0.mo16290E() || this.w0.mo16290E();
        }
    }

    @Override // p001o.ewi
    /* renamed from: G */
    public void mo16291G() {
        synchronized (this) {
            this.D0 = 64L;
        }
        this.u0.mo16291G();
        this.v0.mo16291G();
        this.w0.mo16291G();
        m25692R();
    }

    @Override // p001o.ewi
    /* renamed from: M */
    public boolean mo16292M(int i, Object obj, int i2) {
        if (i == 0) {
            return i0((v19) obj, i2);
        }
        if (i == 1) {
            return h0((v19) obj, i2);
        }
        if (i != 2) {
            return false;
        }
        return j0((v19) obj, i2);
    }

    @Override // p001o.ewi
    public boolean b0(int i, Object obj) {
        if (73 == i) {
            m0((Integer) obj);
        } else if (33 == i) {
            k0((ck6) obj);
        } else {
            if (67 != i) {
                return false;
            }
            l0((HomeLeaderBoard) obj);
        }
        return true;
    }

    @Override // p001o.jbc.InterfaceC14485a
    /* renamed from: c */
    public final void mo16294c(int i, View view) {
        ck6 ck6Var = this.z0;
        HomeLeaderBoard homeLeaderBoard = this.x0;
        Integer num = this.y0;
        if (ck6Var != null) {
            ck6Var.mo708b(view, num.intValue(), homeLeaderBoard);
        }
    }

    public final boolean h0(v19 v19Var, int i) {
        if (i != 0) {
            return false;
        }
        synchronized (this) {
            this.D0 |= 2;
        }
        return true;
    }

    public final boolean i0(v19 v19Var, int i) {
        if (i != 0) {
            return false;
        }
        synchronized (this) {
            this.D0 |= 1;
        }
        return true;
    }

    public final boolean j0(v19 v19Var, int i) {
        if (i != 0) {
            return false;
        }
        synchronized (this) {
            this.D0 |= 4;
        }
        return true;
    }

    public void k0(ck6 ck6Var) {
        this.z0 = ck6Var;
        synchronized (this) {
            this.D0 |= 16;
        }
        m28509h(33);
        super.m25692R();
    }

    public void l0(HomeLeaderBoard homeLeaderBoard) {
        this.x0 = homeLeaderBoard;
        synchronized (this) {
            this.D0 |= 32;
        }
        m28509h(67);
        super.m25692R();
    }

    public void m0(Integer num) {
        this.y0 = num;
        synchronized (this) {
            this.D0 |= 8;
        }
        m28509h(73);
        super.m25692R();
    }

    @Override // p001o.ewi
    /* renamed from: p */
    public void mo16295p() {
        long j;
        ArrayList<LeaderboardActivityMetrics> leaderBoardList;
        int i;
        boolean z;
        boolean z2;
        boolean z3;
        LeaderboardActivityMetrics leaderboardActivityMetrics;
        LeaderboardActivityMetrics leaderboardActivityMetrics2;
        long j2;
        long j3;
        synchronized (this) {
            j = this.D0;
            this.D0 = 0L;
        }
        HomeLeaderBoard homeLeaderBoard = this.x0;
        long j4 = j & 96;
        if (j4 != 0) {
            leaderBoardList = homeLeaderBoard != null ? homeLeaderBoard.getLeaderBoardList() : null;
            int size = leaderBoardList != null ? leaderBoardList.size() : 0;
            z2 = size > 1;
            z3 = size > 0;
            z = size > 2;
            if (j4 != 0) {
                j = z2 ? j | MediaStatus.COMMAND_EDIT_TRACKS : j | MediaStatus.COMMAND_QUEUE_REPEAT_ONE;
            }
            if ((j & 96) != 0) {
                if (z3) {
                    j2 = j | 256;
                    j3 = MediaStatus.COMMAND_LIKE;
                } else {
                    j2 = j | 128;
                    j3 = MediaStatus.COMMAND_PLAYBACK_RATE;
                }
                j = j2 | j3;
            }
            if ((j & 96) != 0) {
                j = z ? j | MediaStatus.COMMAND_QUEUE_REPEAT_ALL : j | 512;
            }
            i = z3 ? 0 : 8;
        } else {
            leaderBoardList = null;
            i = 0;
            z = false;
            z2 = false;
            z3 = false;
        }
        LeaderboardActivityMetrics leaderboardActivityMetrics3 = ((MediaStatus.COMMAND_EDIT_TRACKS & j) == 0 || leaderBoardList == null) ? null : leaderBoardList.get(1);
        LeaderboardActivityMetrics leaderboardActivityMetrics4 = ((j & MediaStatus.COMMAND_QUEUE_REPEAT_ALL) == 0 || leaderBoardList == null) ? null : leaderBoardList.get(2);
        LeaderboardActivityMetrics leaderboardActivityMetrics5 = ((256 & j) == 0 || leaderBoardList == null) ? null : leaderBoardList.get(0);
        long j5 = 96 & j;
        if (j5 != 0) {
            if (!z3) {
                leaderboardActivityMetrics5 = null;
            }
            if (!z) {
                leaderboardActivityMetrics4 = null;
            }
            leaderboardActivityMetrics2 = leaderboardActivityMetrics5;
            leaderboardActivityMetrics = z2 ? leaderboardActivityMetrics3 : null;
        } else {
            leaderboardActivityMetrics = null;
            leaderboardActivityMetrics2 = null;
            leaderboardActivityMetrics4 = null;
        }
        if ((j & 64) != 0) {
            this.t0.setOnClickListener(this.C0);
            this.u0.i0(0);
            this.v0.i0(1);
            this.w0.i0(2);
        }
        if (j5 != 0) {
            this.u0.h0(leaderboardActivityMetrics2);
            this.v0.h0(leaderboardActivityMetrics);
            this.w0.h0(leaderboardActivityMetrics4);
            this.B0.setVisibility(i);
        }
        ewi.m25683r(this.u0);
        ewi.m25683r(this.v0);
        ewi.m25683r(this.w0);
    }

    public z14(yt4 yt4Var, View view, Object[] objArr) {
        super(yt4Var, view, 3, (Chip) objArr[8], (Chip) objArr[9], (Chip) objArr[10], (Chip) objArr[11], (LinearLayout) objArr[2], (MaterialTextView) objArr[7], (MaterialButton) objArr[1], (v19) objArr[4], (v19) objArr[5], (v19) objArr[6]);
        this.D0 = -1L;
        this.r0.setTag(null);
        this.t0.setTag(null);
        m25693Z(this.u0);
        m25693Z(this.v0);
        m25693Z(this.w0);
        ConstraintLayout constraintLayout = (ConstraintLayout) objArr[0];
        this.A0 = constraintLayout;
        constraintLayout.setTag(null);
        ConstraintLayout constraintLayout2 = (ConstraintLayout) objArr[3];
        this.B0 = constraintLayout2;
        constraintLayout2.setTag(null);
        a0(view);
        this.C0 = new jbc(this, 1);
        mo16291G();
    }
}
