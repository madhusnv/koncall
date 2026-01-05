package p001o;

import ai.salesmax.custom.CustomFormDataObservable;
import ai.salesmax.model.Tasks;
import ai.salesmax.view.MentionAutoCompleteTextView;
import android.util.SparseIntArray;
import android.view.View;
import android.widget.LinearLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.media3.ui.PlayerView;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.shimmer.ShimmerFrameLayout;
import com.google.android.gms.cast.MediaStatus;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.card.MaterialCardView;
import com.google.android.material.chip.Chip;
import com.google.android.material.imageview.ShapeableImageView;
import com.google.android.material.textfield.TextInputLayout;
import com.google.android.material.textview.MaterialTextView;
import p001o.ewi;

/* loaded from: classes.dex */
public class xt1 extends wt1 {
    public static final ewi.C13274i X0;
    public static final SparseIntArray Y0;
    public final ConstraintLayout T0;
    public final LinearLayout U0;
    public final f54 V0;
    public long W0;

    static {
        ewi.C13274i c13274i = new ewi.C13274i(32);
        X0 = c13274i;
        c13274i.m25699a(1, new String[]{"content_shimmer_tak_detail"}, new int[]{15}, new int[]{p9e.content_shimmer_tak_detail});
        c13274i.m25699a(8, new String[]{"content_custom_form_value"}, new int[]{16}, new int[]{p9e.content_custom_form_value});
        SparseIntArray sparseIntArray = new SparseIntArray();
        Y0 = sparseIntArray;
        sparseIntArray.put(z8e.shimmerLayout, 17);
        sparseIntArray.put(z8e.callDetailTitle, 18);
        sparseIntArray.put(z8e.buttonClose, 19);
        sparseIntArray.put(z8e.leadTitle, 20);
        sparseIntArray.put(z8e.taskLeadBlock, 21);
        sparseIntArray.put(z8e.notesDelete, 22);
        sparseIntArray.put(z8e.fileShareRecording, 23);
        sparseIntArray.put(z8e.notesEdit, 24);
        sparseIntArray.put(z8e.notesStatus, 25);
        sparseIntArray.put(z8e.mAudioPlayer, 26);
        sparseIntArray.put(z8e.notesCommentsTitle, 27);
        sparseIntArray.put(z8e.notesCommentsList, 28);
        sparseIntArray.put(z8e.notesDetailsBorderBottom, 29);
        sparseIntArray.put(z8e.notesCommentTextInputLayout, 30);
        sparseIntArray.put(z8e.notesCommentEditText, 31);
    }

    public xt1(yt4 yt4Var, View view) {
        this(yt4Var, view, ewi.m25671L(yt4Var, view, 32, X0, Y0));
    }

    @Override // p001o.ewi
    /* renamed from: E */
    public boolean mo16290E() {
        synchronized (this) {
            if (this.W0 != 0) {
                return true;
            }
            return this.V0.mo16290E() || this.q0.mo16290E();
        }
    }

    @Override // p001o.ewi
    /* renamed from: G */
    public void mo16291G() {
        synchronized (this) {
            this.W0 = 32L;
        }
        this.V0.mo16291G();
        this.q0.mo16291G();
        m25692R();
    }

    @Override // p001o.ewi
    /* renamed from: M */
    public boolean mo16292M(int i, Object obj, int i2) {
        if (i == 0) {
            return m0((CustomFormDataObservable) obj, i2);
        }
        if (i != 1) {
            return false;
        }
        return l0((t14) obj, i2);
    }

    @Override // p001o.ewi
    public boolean b0(int i, Object obj) {
        if (73 == i) {
            p0((Integer) obj);
        } else if (33 == i) {
            n0((ck6) obj);
        } else {
            if (67 != i) {
                return false;
            }
            k0((Tasks) obj);
        }
        return true;
    }

    @Override // p001o.wt1
    public void k0(Tasks tasks) {
        this.Q0 = tasks;
        synchronized (this) {
            this.W0 |= 16;
        }
        m28509h(67);
        super.m25692R();
    }

    public final boolean l0(t14 t14Var, int i) {
        if (i != 0) {
            return false;
        }
        synchronized (this) {
            this.W0 |= 2;
        }
        return true;
    }

    public final boolean m0(CustomFormDataObservable customFormDataObservable, int i) {
        if (i != 0) {
            return false;
        }
        synchronized (this) {
            this.W0 |= 1;
        }
        return true;
    }

    public void n0(ck6 ck6Var) {
        this.S0 = ck6Var;
        synchronized (this) {
            this.W0 |= 8;
        }
        m28509h(33);
        super.m25692R();
    }

    /* JADX WARN: Removed duplicated region for block: B:74:0x0125  */
    @Override // p001o.ewi
    /* renamed from: p */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void mo16295p() {
        long j;
        int i;
        int i2;
        boolean z;
        boolean z2;
        CustomFormDataObservable customCallOutcomeDataObservable;
        Long l;
        String str;
        String str2;
        String str3;
        long callStartTime;
        boolean zIsEmpty;
        int i3;
        int i4;
        int i5;
        Long createdAt;
        ryh activityLocation;
        String customCallOutcomeData;
        long j2;
        long j3;
        synchronized (this) {
            j = this.W0;
            this.W0 = 0L;
        }
        Integer num = this.R0;
        ck6 ck6Var = this.S0;
        Tasks tasks = this.Q0;
        int i6 = 0;
        if ((j & 49) != 0) {
            long j4 = j & 48;
            if (j4 != 0) {
                if (tasks != null) {
                    activityLocation = tasks.getActivityLocation();
                    callStartTime = tasks.getCallStartTime();
                    String callNextStep = tasks.getCallNextStep();
                    String clientName = tasks.getClientName();
                    createdAt = tasks.getCreatedAt();
                    customCallOutcomeData = tasks.getCustomCallOutcomeData();
                    str = callNextStep;
                    str2 = clientName;
                } else {
                    callStartTime = 0;
                    str = null;
                    str2 = null;
                    activityLocation = null;
                    createdAt = null;
                    customCallOutcomeData = null;
                }
                z2 = tasks == null;
                if (j4 != 0) {
                    if (z2) {
                        j2 = j | MediaStatus.COMMAND_PLAYBACK_RATE;
                        j3 = 524288;
                    } else {
                        j2 = j | MediaStatus.COMMAND_EDIT_TRACKS;
                        j3 = MediaStatus.COMMAND_STREAM_TRANSFER;
                    }
                    j = j2 | j3;
                }
                boolean z3 = activityLocation == null;
                z = str == null;
                str3 = "Next Step : " + str;
                boolean z4 = customCallOutcomeData == null;
                i5 = z2 ? 8 : 0;
                if ((j & 48) != 0) {
                    j |= z3 ? 128L : 64L;
                }
                if ((j & 48) != 0) {
                    j = z ? j | 512 : j | 256;
                }
                if ((j & 48) != 0) {
                    j |= z4 ? MediaStatus.COMMAND_DISLIKE : MediaStatus.COMMAND_LIKE;
                }
                i = z3 ? 8 : 0;
                i2 = z4 ? 8 : 0;
            } else {
                callStartTime = 0;
                i = 0;
                i2 = 0;
                z = false;
                i5 = 0;
                z2 = false;
                str = null;
                str2 = null;
                str3 = null;
                createdAt = null;
            }
            customCallOutcomeDataObservable = tasks != null ? tasks.getCustomCallOutcomeDataObservable() : null;
            g0(0, customCallOutcomeDataObservable);
            l = createdAt;
            i6 = i5;
        } else {
            i = 0;
            i2 = 0;
            z = false;
            z2 = false;
            customCallOutcomeDataObservable = null;
            l = null;
            str = null;
            str2 = null;
            str3 = null;
            callStartTime = 0;
        }
        boolean zIsEmpty2 = ((256 & j) == 0 || str == null) ? false : str.isEmpty();
        if ((MediaStatus.COMMAND_EDIT_TRACKS & j) == 0) {
            zIsEmpty = false;
        } else {
            String id = tasks != null ? tasks.getId() : null;
            if (id != null) {
                zIsEmpty = id.isEmpty();
            }
        }
        long j5 = j & 48;
        if (j5 != 0) {
            if (z) {
                zIsEmpty2 = true;
            }
            boolean z5 = z2 ? true : zIsEmpty;
            if (j5 != 0) {
                j |= zIsEmpty2 ? MediaStatus.COMMAND_UNFOLLOW : MediaStatus.COMMAND_FOLLOW;
            }
            if ((j & 48) != 0) {
                j |= z5 ? MediaStatus.COMMAND_QUEUE_REPEAT_ONE : MediaStatus.COMMAND_QUEUE_REPEAT_ALL;
            }
            int i7 = zIsEmpty2 ? 8 : 0;
            i4 = z5 ? 4 : 0;
            i3 = i7;
        } else {
            i3 = 0;
            i4 = 0;
        }
        if ((j & 48) != 0) {
            fjh.m26938c(this.p0, str3);
            this.p0.setVisibility(i3);
            this.q0.m25689B().setVisibility(i2);
            this.r0.setVisibility(i);
            nr1.l2(this.t0, tasks);
            nr1.m40981z(this.u0, tasks);
            this.v0.setVisibility(i6);
            nr1.T1(this.v0, tasks);
            nr1.s2(this.w0, Long.valueOf(callStartTime));
            nr1.z0(this.x0, tasks);
            this.A0.setVisibility(i4);
            nr1.e0(this.F0, l);
            nr1.k2(this.N0, tasks);
            nr1.f1(this.O0, str2);
            nr1.b1(this.P0, tasks);
        }
        if ((49 & j) != 0) {
            this.q0.i0(customCallOutcomeDataObservable);
        }
        if ((40 & j) != 0) {
            this.q0.h0(ck6Var);
        }
        if ((j & 36) != 0) {
            this.q0.j0(num);
        }
        ewi.m25683r(this.V0);
        ewi.m25683r(this.q0);
    }

    public void p0(Integer num) {
        this.R0 = num;
        synchronized (this) {
            this.W0 |= 4;
        }
        m28509h(73);
        super.m25692R();
    }

    public xt1(yt4 yt4Var, View view, Object[] objArr) {
        super(yt4Var, view, 2, (ShapeableImageView) objArr[19], (ConstraintLayout) objArr[18], (MaterialButton) objArr[14], (t14) objArr[16], (ShapeableImageView) objArr[2], (Chip) objArr[23], (MaterialTextView) objArr[12], (MaterialTextView) objArr[10], (ShapeableImageView) objArr[9], (MaterialTextView) objArr[11], (ShapeableImageView) objArr[3], (MaterialTextView) objArr[20], (PlayerView) objArr[26], (LinearLayout) objArr[6], (MentionAutoCompleteTextView) objArr[31], (TextInputLayout) objArr[30], (RecyclerView) objArr[28], (MaterialTextView) objArr[27], (MaterialTextView) objArr[7], (MaterialButton) objArr[22], (ConstraintLayout) objArr[8], (View) objArr[29], (Chip) objArr[24], (MaterialTextView) objArr[25], (ShimmerFrameLayout) objArr[17], (MaterialCardView) objArr[21], (MaterialTextView) objArr[13], (MaterialTextView) objArr[4], (MaterialTextView) objArr[5]);
        this.W0 = -1L;
        this.p0.setTag(null);
        m25693Z(this.q0);
        this.r0.setTag(null);
        this.t0.setTag(null);
        this.u0.setTag(null);
        this.v0.setTag(null);
        this.w0.setTag(null);
        this.x0.setTag(null);
        ConstraintLayout constraintLayout = (ConstraintLayout) objArr[0];
        this.T0 = constraintLayout;
        constraintLayout.setTag(null);
        LinearLayout linearLayout = (LinearLayout) objArr[1];
        this.U0 = linearLayout;
        linearLayout.setTag(null);
        f54 f54Var = (f54) objArr[15];
        this.V0 = f54Var;
        m25693Z(f54Var);
        this.A0.setTag(null);
        this.F0.setTag(null);
        this.H0.setTag(null);
        this.N0.setTag(null);
        this.O0.setTag(null);
        this.P0.setTag(null);
        a0(view);
        mo16291G();
    }
}
