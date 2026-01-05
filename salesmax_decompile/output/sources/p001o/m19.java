package p001o;

import ai.salesmax.model.CommentSummary;
import ai.salesmax.model.EngagementUpdateSummary;
import ai.salesmax.model.Tasks;
import android.util.SparseIntArray;
import android.view.View;
import com.google.android.gms.cast.MediaStatus;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.card.MaterialCardView;
import com.google.android.material.chip.Chip;
import com.google.android.material.imageview.ShapeableImageView;
import com.google.android.material.textview.MaterialTextView;
import java.util.List;
import p001o.ewi;
import p001o.jbc;

/* loaded from: classes.dex */
public class m19 extends l19 implements jbc.InterfaceC14485a {
    public static final ewi.C13274i D0 = null;
    public static final SparseIntArray E0 = null;
    public final View.OnClickListener A0;
    public final View.OnClickListener B0;
    public long C0;

    public m19(yt4 yt4Var, View view) {
        this(yt4Var, view, ewi.m25671L(yt4Var, view, 10, D0, E0));
    }

    @Override // p001o.ewi
    /* renamed from: E */
    public boolean mo16290E() {
        synchronized (this) {
            return this.C0 != 0;
        }
    }

    @Override // p001o.ewi
    /* renamed from: G */
    public void mo16291G() {
        synchronized (this) {
            this.C0 = 8L;
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
            j0((Integer) obj);
        } else if (33 == i) {
            h0((ck6) obj);
        } else {
            if (67 != i) {
                return false;
            }
            i0((Tasks) obj);
        }
        return true;
    }

    @Override // p001o.jbc.InterfaceC14485a
    /* renamed from: c */
    public final void mo16294c(int i, View view) {
        if (i == 1) {
            ck6 ck6Var = this.z0;
            Tasks tasks = this.x0;
            Integer num = this.y0;
            if (ck6Var != null) {
                ck6Var.mo708b(view, num.intValue(), tasks);
                return;
            }
            return;
        }
        if (i != 2) {
            return;
        }
        ck6 ck6Var2 = this.z0;
        Tasks tasks2 = this.x0;
        Integer num2 = this.y0;
        if (ck6Var2 != null) {
            ck6Var2.mo708b(view, num2.intValue(), tasks2);
        }
    }

    public void h0(ck6 ck6Var) {
        this.z0 = ck6Var;
        synchronized (this) {
            this.C0 |= 2;
        }
        m28509h(33);
        super.m25692R();
    }

    public void i0(Tasks tasks) {
        this.x0 = tasks;
        synchronized (this) {
            this.C0 |= 4;
        }
        m28509h(67);
        super.m25692R();
    }

    public void j0(Integer num) {
        this.y0 = num;
        synchronized (this) {
            this.C0 |= 1;
        }
        m28509h(73);
        super.m25692R();
    }

    @Override // p001o.ewi
    /* renamed from: p */
    public void mo16295p() {
        long j;
        long taskDateTimeInMillis;
        String str;
        String str2;
        String str3;
        int i;
        boolean z;
        int i2;
        int i3;
        int i4;
        int i5;
        String taskTitle;
        String taskContent;
        String clientName;
        List<CommentSummary> comments;
        String taskContactMode;
        boolean zIsExpired;
        synchronized (this) {
            j = this.C0;
            this.C0 = 0L;
        }
        Tasks tasks = this.x0;
        long j2 = j & 12;
        String str4 = null;
        List<EngagementUpdateSummary> engagementUpdates = null;
        if (j2 != 0) {
            if (tasks != null) {
                engagementUpdates = tasks.getEngagementUpdates();
                taskTitle = tasks.getTaskTitle();
                taskContent = tasks.getTaskContent();
                clientName = tasks.getClientName();
                comments = tasks.getComments();
                zIsExpired = tasks.isExpired();
                taskContactMode = tasks.getTaskContactMode();
                taskDateTimeInMillis = tasks.getTaskDateTimeInMillis();
            } else {
                taskDateTimeInMillis = 0;
                taskTitle = null;
                taskContent = null;
                clientName = null;
                comments = null;
                taskContactMode = null;
                zIsExpired = false;
            }
            if (j2 != 0) {
                j |= zIsExpired ? 32L : 16L;
            }
            int size = engagementUpdates != null ? engagementUpdates.size() : 0;
            boolean z2 = taskContent == null;
            int i6 = zIsExpired ? 0 : 8;
            boolean z3 = taskDateTimeInMillis > 0;
            if ((j & 12) != 0) {
                j = z2 ? j | 128 : j | 64;
            }
            if ((j & 12) != 0) {
                j |= z3 ? MediaStatus.COMMAND_DISLIKE : MediaStatus.COMMAND_LIKE;
            }
            int size2 = comments != null ? comments.size() : 0;
            boolean z4 = size > 0;
            int i7 = z3 ? 0 : 8;
            boolean z5 = size2 > 0;
            if ((j & 12) != 0) {
                j |= z4 ? MediaStatus.COMMAND_PLAYBACK_RATE : MediaStatus.COMMAND_EDIT_TRACKS;
            }
            if ((j & 12) != 0) {
                j |= z5 ? 512L : 256L;
            }
            i = z4 ? 0 : 8;
            str = taskTitle;
            str2 = clientName;
            i2 = z5 ? 0 : 8;
            i3 = i6;
            str3 = taskContactMode;
            i4 = i7;
            z = z2;
            str4 = taskContent;
        } else {
            taskDateTimeInMillis = 0;
            str = null;
            str2 = null;
            str3 = null;
            i = 0;
            z = false;
            i2 = 0;
            i3 = 0;
            i4 = 0;
        }
        boolean zIsEmpty = ((64 & j) == 0 || str4 == null) ? false : str4.isEmpty();
        long j3 = j & 12;
        if (j3 != 0) {
            boolean z6 = z ? true : zIsEmpty;
            if (j3 != 0) {
                j |= z6 ? MediaStatus.COMMAND_QUEUE_REPEAT_ONE : MediaStatus.COMMAND_QUEUE_REPEAT_ALL;
            }
            i5 = z6 ? 8 : 0;
        } else {
            i5 = 0;
        }
        if ((12 & j) != 0) {
            nr1.s2(this.n0, Long.valueOf(taskDateTimeInMillis));
            this.o0.setVisibility(i4);
            nr1.g1(this.p0, str2);
            nr1.m40946Q(this.p0, tasks);
            this.q0.setVisibility(i2);
            nr1.K1(this.r0, tasks);
            this.r0.setVisibility(i3);
            nr1.n3(this.s0, str3);
            nr1.p3(this.t0, str3);
            this.u0.setVisibility(i);
            fjh.m26938c(this.v0, str);
            this.w0.setVisibility(i5);
            fjh.m26938c(this.w0, str4);
        }
        if ((j & 8) != 0) {
            this.p0.setOnClickListener(this.A0);
            this.s0.setOnClickListener(this.B0);
        }
    }

    public m19(yt4 yt4Var, View view, Object[] objArr) {
        super(yt4Var, view, 0, (MaterialTextView) objArr[9], (ShapeableImageView) objArr[8], (Chip) objArr[5], (ShapeableImageView) objArr[6], (MaterialButton) objArr[3], (MaterialCardView) objArr[0], (ShapeableImageView) objArr[4], (ShapeableImageView) objArr[7], (MaterialTextView) objArr[1], (MaterialTextView) objArr[2]);
        this.C0 = -1L;
        this.n0.setTag(null);
        this.o0.setTag(null);
        this.p0.setTag(null);
        this.q0.setTag(null);
        this.r0.setTag(null);
        this.s0.setTag(null);
        this.t0.setTag(null);
        this.u0.setTag(null);
        this.v0.setTag(null);
        this.w0.setTag(null);
        a0(view);
        this.A0 = new jbc(this, 2);
        this.B0 = new jbc(this, 1);
        mo16291G();
    }
}
