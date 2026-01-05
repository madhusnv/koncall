package p001o;

import ai.salesmax.model.HomeLeaderBoard;
import ai.salesmax.services.model.LeaderboardActivityMetrics;
import android.util.SparseIntArray;
import android.view.View;
import android.widget.LinearLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.gms.cast.MediaStatus;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.card.MaterialCardView;
import com.google.android.material.chip.Chip;
import com.google.android.material.textview.MaterialTextView;
import java.util.ArrayList;
import p001o.ewi;
import p001o.jbc;

/* loaded from: classes.dex */
public class b24 extends a24 implements jbc.InterfaceC14485a {
    public static final ewi.C13274i H0;
    public static final SparseIntArray I0;
    public final LinearLayout A0;
    public final f29 B0;
    public final f29 C0;
    public final f29 D0;
    public final ConstraintLayout E0;
    public final View.OnClickListener F0;
    public long G0;
    public final ConstraintLayout x0;
    public final LinearLayout y0;
    public final j19 z0;

    static {
        ewi.C13274i c13274i = new ewi.C13274i(15);
        H0 = c13274i;
        c13274i.m25699a(2, new String[]{"item_my_performance"}, new int[]{8}, new int[]{p9e.item_my_performance});
        int i = p9e.item_rank;
        c13274i.m25699a(3, new String[]{"item_rank", "item_rank", "item_rank"}, new int[]{5, 6, 7}, new int[]{i, i, i});
        SparseIntArray sparseIntArray = new SparseIntArray();
        I0 = sparseIntArray;
        sparseIntArray.put(z8e.homeLeaderboardTitle, 9);
        sparseIntArray.put(z8e.homeLeaderBoardCard, 10);
        sparseIntArray.put(z8e.chip_metrics1, 11);
        sparseIntArray.put(z8e.chip_metrics2, 12);
        sparseIntArray.put(z8e.chip_metrics3, 13);
        sparseIntArray.put(z8e.chip_metrics4, 14);
    }

    public b24(yt4 yt4Var, View view) {
        this(yt4Var, view, ewi.m25671L(yt4Var, view, 15, H0, I0));
    }

    @Override // p001o.ewi
    /* renamed from: E */
    public boolean mo16290E() {
        synchronized (this) {
            if (this.G0 != 0) {
                return true;
            }
            return this.B0.mo16290E() || this.C0.mo16290E() || this.D0.mo16290E() || this.z0.mo16290E();
        }
    }

    @Override // p001o.ewi
    /* renamed from: G */
    public void mo16291G() {
        synchronized (this) {
            this.G0 = 8L;
        }
        this.B0.mo16291G();
        this.C0.mo16291G();
        this.D0.mo16291G();
        this.z0.mo16291G();
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
            j0((Integer) obj);
        } else if (33 == i) {
            h0((ck6) obj);
        } else {
            if (67 != i) {
                return false;
            }
            i0((HomeLeaderBoard) obj);
        }
        return true;
    }

    @Override // p001o.jbc.InterfaceC14485a
    /* renamed from: c */
    public final void mo16294c(int i, View view) {
        ck6 ck6Var = this.w0;
        HomeLeaderBoard homeLeaderBoard = this.u0;
        Integer num = this.v0;
        if (ck6Var != null) {
            ck6Var.mo708b(view, num.intValue(), homeLeaderBoard);
        }
    }

    public void h0(ck6 ck6Var) {
        this.w0 = ck6Var;
        synchronized (this) {
            this.G0 |= 2;
        }
        m28509h(33);
        super.m25692R();
    }

    public void i0(HomeLeaderBoard homeLeaderBoard) {
        this.u0 = homeLeaderBoard;
        synchronized (this) {
            this.G0 |= 4;
        }
        m28509h(67);
        super.m25692R();
    }

    public void j0(Integer num) {
        this.v0 = num;
        synchronized (this) {
            this.G0 |= 1;
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
        LeaderboardActivityMetrics leaderboardActivityMetrics3;
        LeaderboardActivityMetrics myRank;
        long j2;
        long j3;
        synchronized (this) {
            j = this.G0;
            this.G0 = 0L;
        }
        HomeLeaderBoard homeLeaderBoard = this.u0;
        long j4 = j & 12;
        if (j4 != 0) {
            if (homeLeaderBoard != null) {
                myRank = homeLeaderBoard.getMyRank();
                leaderBoardList = homeLeaderBoard.getLeaderBoardList();
            } else {
                leaderBoardList = null;
                myRank = null;
            }
            int size = leaderBoardList != null ? leaderBoardList.size() : 0;
            z2 = size > 1;
            z3 = size > 0;
            z = size > 2;
            if (j4 != 0) {
                j = z2 ? j | MediaStatus.COMMAND_QUEUE_REPEAT_ONE : j | MediaStatus.COMMAND_QUEUE_REPEAT_ALL;
            }
            if ((j & 12) != 0) {
                if (z3) {
                    j2 = j | 32;
                    j3 = 512;
                } else {
                    j2 = j | 16;
                    j3 = 256;
                }
                j = j2 | j3;
            }
            if ((j & 12) != 0) {
                j = z ? j | 128 : j | 64;
            }
            i = z3 ? 0 : 8;
            leaderboardActivityMetrics = myRank;
        } else {
            leaderBoardList = null;
            i = 0;
            z = false;
            z2 = false;
            z3 = false;
            leaderboardActivityMetrics = null;
        }
        LeaderboardActivityMetrics leaderboardActivityMetrics4 = ((MediaStatus.COMMAND_QUEUE_REPEAT_ONE & j) == 0 || leaderBoardList == null) ? null : leaderBoardList.get(1);
        LeaderboardActivityMetrics leaderboardActivityMetrics5 = ((j & 128) == 0 || leaderBoardList == null) ? null : leaderBoardList.get(2);
        LeaderboardActivityMetrics leaderboardActivityMetrics6 = ((32 & j) == 0 || leaderBoardList == null) ? null : leaderBoardList.get(0);
        long j5 = 12 & j;
        if (j5 != 0) {
            if (!z3) {
                leaderboardActivityMetrics6 = null;
            }
            if (!z) {
                leaderboardActivityMetrics5 = null;
            }
            leaderboardActivityMetrics3 = leaderboardActivityMetrics6;
            leaderboardActivityMetrics2 = z2 ? leaderboardActivityMetrics4 : null;
        } else {
            leaderboardActivityMetrics2 = null;
            leaderboardActivityMetrics3 = null;
            leaderboardActivityMetrics5 = null;
        }
        if (j5 != 0) {
            this.t0.setVisibility(i);
            this.z0.h0(leaderboardActivityMetrics);
            this.B0.h0(leaderboardActivityMetrics3);
            this.C0.h0(leaderboardActivityMetrics2);
            this.D0.h0(leaderboardActivityMetrics5);
            this.E0.setVisibility(i);
        }
        if ((j & 8) != 0) {
            this.t0.setOnClickListener(this.F0);
            this.B0.i0(0);
            this.C0.i0(1);
            this.D0.i0(2);
        }
        ewi.m25683r(this.B0);
        ewi.m25683r(this.C0);
        ewi.m25683r(this.D0);
        ewi.m25683r(this.z0);
    }

    public b24(yt4 yt4Var, View view, Object[] objArr) {
        super(yt4Var, view, 0, (Chip) objArr[11], (Chip) objArr[12], (Chip) objArr[13], (Chip) objArr[14], (MaterialCardView) objArr[10], (MaterialTextView) objArr[9], (MaterialButton) objArr[1]);
        this.G0 = -1L;
        this.t0.setTag(null);
        ConstraintLayout constraintLayout = (ConstraintLayout) objArr[0];
        this.x0 = constraintLayout;
        constraintLayout.setTag(null);
        LinearLayout linearLayout = (LinearLayout) objArr[2];
        this.y0 = linearLayout;
        linearLayout.setTag(null);
        j19 j19Var = (j19) objArr[8];
        this.z0 = j19Var;
        m25693Z(j19Var);
        LinearLayout linearLayout2 = (LinearLayout) objArr[3];
        this.A0 = linearLayout2;
        linearLayout2.setTag(null);
        f29 f29Var = (f29) objArr[5];
        this.B0 = f29Var;
        m25693Z(f29Var);
        f29 f29Var2 = (f29) objArr[6];
        this.C0 = f29Var2;
        m25693Z(f29Var2);
        f29 f29Var3 = (f29) objArr[7];
        this.D0 = f29Var3;
        m25693Z(f29Var3);
        ConstraintLayout constraintLayout2 = (ConstraintLayout) objArr[4];
        this.E0 = constraintLayout2;
        constraintLayout2.setTag(null);
        a0(view);
        this.F0 = new jbc(this, 1);
        mo16291G();
    }
}
