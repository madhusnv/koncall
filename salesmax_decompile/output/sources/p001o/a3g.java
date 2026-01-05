package p001o;

import ai.salesmax.model.FormFields;
import ai.salesmax.model.Leads;
import ai.salesmax.model.Tasks;
import android.util.SparseIntArray;
import android.view.View;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.widget.NestedScrollView;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.cast.MediaStatus;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.button.MaterialButtonToggleGroup;
import com.google.android.material.card.MaterialCardView;
import com.google.android.material.chip.Chip;
import com.google.android.material.chip.ChipGroup;
import com.google.android.material.imageview.ShapeableImageView;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;
import com.google.android.material.textview.MaterialTextView;
import lombok.javac.Javac;
import p001o.ewi;

/* loaded from: classes.dex */
public class a3g extends z2g {
    public static final ewi.C13274i C1;
    public static final SparseIntArray D1;
    public final FrameLayout A1;
    public long B1;

    static {
        ewi.C13274i c13274i = new ewi.C13274i(55);
        C1 = c13274i;
        int i = p9e.content_custom_form;
        c13274i.m25699a(7, new String[]{"content_custom_form", "content_custom_form"}, new int[]{16, 17}, new int[]{i, i});
        SparseIntArray sparseIntArray = new SparseIntArray();
        D1 = sparseIntArray;
        sparseIntArray.put(z8e.contentCallDataParent, 18);
        sparseIntArray.put(z8e.leadCallReminder, 19);
        sparseIntArray.put(z8e.leadDetailsClose, 20);
        sparseIntArray.put(z8e.editContact, 21);
        sparseIntArray.put(z8e.rvUserTags, 22);
        sparseIntArray.put(z8e.leadDetailsButtonGroup, 23);
        sparseIntArray.put(z8e.leadDetailsBorder1, 24);
        sparseIntArray.put(z8e.tvCallOutComeTitle, 25);
        sparseIntArray.put(z8e.tvCallOutcomeDateEdit, 26);
        sparseIntArray.put(z8e.leadDetailsBorder2, 27);
        sparseIntArray.put(z8e.chipPriorityGroup, 28);
        sparseIntArray.put(z8e.inTwoHours, 29);
        sparseIntArray.put(z8e.inFourHours, 30);
        sparseIntArray.put(z8e.callTomorrow, 31);
        sparseIntArray.put(z8e.callLaterWeek, 32);
        sparseIntArray.put(z8e.callNextWeek, 33);
        sparseIntArray.put(z8e.callSelectDate, 34);
        sparseIntArray.put(z8e.callGoBack, 35);
        sparseIntArray.put(z8e.rvCallOutcome, 36);
        sparseIntArray.put(z8e.btnLaterToday, 37);
        sparseIntArray.put(z8e.btnTomorrow, 38);
        sparseIntArray.put(z8e.btnLaterThisWeek, 39);
        sparseIntArray.put(z8e.btnNextWeek, 40);
        sparseIntArray.put(z8e.btnCustomDate, 41);
        sparseIntArray.put(z8e.tvCallOutComeNote, 42);
        sparseIntArray.put(z8e.tvNoteAddSpeech, 43);
        sparseIntArray.put(z8e.tvRedoStreamingStt, 44);
        sparseIntArray.put(z8e.scrollTranscript, 45);
        sparseIntArray.put(z8e.tvTranscript, 46);
        sparseIntArray.put(z8e.tiLayoutNotes, 47);
        sparseIntArray.put(z8e.sendMessageLayout, 48);
        sparseIntArray.put(z8e.leadWhatsapp, 49);
        sparseIntArray.put(z8e.leadMessage, 50);
        sparseIntArray.put(z8e.leadMail, 51);
        sparseIntArray.put(z8e.sendTemplateAction, 52);
        sparseIntArray.put(z8e.sendTemplateTitle, 53);
        sparseIntArray.put(z8e.callOutcome_ActionButton, 54);
    }

    public a3g(yt4 yt4Var, View view) {
        this(yt4Var, view, ewi.m25671L(yt4Var, view, 55, C1, D1));
    }

    public final boolean B0(r14 r14Var, int i) {
        if (i != 0) {
            return false;
        }
        synchronized (this) {
            this.B1 |= 1;
        }
        return true;
    }

    public void C0(ck6 ck6Var) {
        this.z1 = ck6Var;
        synchronized (this) {
            this.B1 |= 64;
        }
        m28509h(33);
        super.m25692R();
    }

    public void D0(boolean z) {
        this.w1 = z;
    }

    @Override // p001o.ewi
    /* renamed from: E */
    public boolean mo16290E() {
        synchronized (this) {
            if (this.B1 != 0) {
                return true;
            }
            return this.C0.mo16290E() || this.D0.mo16290E();
        }
    }

    @Override // p001o.ewi
    /* renamed from: G */
    public void mo16291G() {
        synchronized (this) {
            this.B1 = MediaStatus.COMMAND_PLAYBACK_RATE;
        }
        this.C0.mo16291G();
        this.D0.mo16291G();
        m25692R();
    }

    public void G0(Integer num) {
        this.y1 = num;
        synchronized (this) {
            this.B1 |= MediaStatus.COMMAND_QUEUE_REPEAT_ALL;
        }
        m28509h(73);
        super.m25692R();
    }

    @Override // p001o.ewi
    /* renamed from: M */
    public boolean mo16292M(int i, Object obj, int i2) {
        if (i == 0) {
            return B0((r14) obj, i2);
        }
        if (i != 1) {
            return false;
        }
        return z0((r14) obj, i2);
    }

    @Override // p001o.ewi
    public boolean b0(int i, Object obj) {
        if (19 == i) {
            s0((FormFields) obj);
        } else if (21 == i) {
            u0(((Boolean) obj).booleanValue());
        } else if (61 == i) {
            w0((Leads) obj);
        } else if (20 == i) {
            t0((FormFields) obj);
        } else if (33 == i) {
            C0((ck6) obj);
        } else if (55 == i) {
            v0(((Boolean) obj).booleanValue());
        } else if (82 == i) {
            y0(((Boolean) obj).booleanValue());
        } else if (17 == i) {
            q0(((Boolean) obj).booleanValue());
        } else if (73 == i) {
            G0((Integer) obj);
        } else if (52 == i) {
            D0(((Boolean) obj).booleanValue());
        } else {
            if (67 != i) {
                return false;
            }
            x0((Tasks) obj);
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:127:0x01d8  */
    /* JADX WARN: Removed duplicated region for block: B:215:0x02d9 A[PHI: r2
      0x02d9: PHI (r2v10 long) = (r2v9 long), (r2v18 long) binds: [B:203:0x02c1, B:212:0x02d3] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:80:0x012d A[PHI: r2
      0x012d: PHI (r2v2 long) = (r2v1 long), (r2v38 long) binds: [B:34:0x0099, B:75:0x0121] A[DONT_GENERATE, DONT_INLINE]] */
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
        int i4;
        long callStartTime;
        boolean z;
        boolean z2;
        boolean zIsEmpty;
        boolean z3;
        int i5;
        int i6;
        Tasks tasks;
        int i7;
        int i8;
        int i9;
        int i10;
        String engagementSource;
        String callInputNotes;
        synchronized (this) {
            j = this.B1;
            this.B1 = 0L;
        }
        FormFields formFields = this.u1;
        boolean z4 = this.s1;
        Leads leads = this.q1;
        FormFields formFields2 = this.v1;
        ck6 ck6Var = this.z1;
        boolean z5 = this.t1;
        boolean z6 = this.x1;
        boolean z7 = this.r1;
        Integer num = this.y1;
        Tasks tasks2 = this.p1;
        String name = ((j & 8208) == 0 || leads == null) ? null : leads.getName();
        long j2 = j & 8448;
        if (j2 != 0) {
            if (j2 != 0) {
                j |= z6 ? 8796093022208L : 4398046511104L;
            }
            boolean z8 = !z6;
            i = z6 ? 0 : 8;
            if ((j & 8448) != 0) {
                j |= z8 ? 35184372088832L : 17592186044416L;
            }
            i2 = z8 ? 0 : 8;
        } else {
            i = 0;
            i2 = 0;
        }
        if ((j & 12936) == 0) {
            i3 = 0;
        } else {
            if ((j & 8704) != 0) {
                j |= z7 ? 524288L : MediaStatus.COMMAND_STREAM_TRANSFER;
            }
            if ((j & 12936) != 0) {
                j = z7 ? j | 2097152 : j | 1048576;
            }
            if ((j & 12800) != 0) {
                j = z7 ? j | 134217728 : j | 67108864;
            }
            if ((j & 268435456) != 0) {
                j |= z7 ? 8589934592L : 4294967296L;
            }
            if ((j & 8832) != 0) {
                j |= z7 ? 137438953472L : 68719476736L;
            }
            if ((j & 8712) != 0) {
                j = z7 ? j | 549755813888L : j | 274877906944L;
            }
            if ((j & 12808) != 0) {
                j |= z7 ? 140737488355328L : 70368744177664L;
            }
            if ((j & 8704) != 0) {
                i3 = z7 ? 0 : 8;
            }
        }
        long j3 = j & 12288;
        if (j3 != 0) {
            if (tasks2 != null) {
                callStartTime = tasks2.getCallStartTime();
                callInputNotes = tasks2.getCallInputNotes();
                engagementSource = tasks2.getEngagementSource();
            } else {
                callStartTime = 0;
                engagementSource = null;
                callInputNotes = null;
            }
            boolean z9 = engagementSource == "WhatsApp";
            if (j3 != 0) {
                j |= z9 ? MediaStatus.COMMAND_DISLIKE : MediaStatus.COMMAND_LIKE;
            }
            i4 = z9 ? 8 : 0;
            str = callInputNotes;
        } else {
            str = null;
            i4 = 0;
            callStartTime = 0;
        }
        boolean z10 = ((j & 558345748480L) == 0 || (j & 549755813888L) == 0) ? false : !z4;
        if ((j & 140737624670208L) != 0) {
            if ((j & 140737490452480L) != 0) {
                String callNextStep = tasks2 != null ? tasks2.getCallNextStep() : null;
                zIsEmpty = callNextStep != null ? callNextStep.isEmpty() : false;
                z2 = (j & 2097152) != 0 ? !zIsEmpty : false;
            } else {
                z2 = false;
                zIsEmpty = false;
            }
            if ((j & 134217728) == 0) {
                z = false;
            } else {
                if ((tasks2 != null ? tasks2.getAssignmentOutcome() : null) != null) {
                    z = true;
                }
            }
        } else {
            z = false;
            z2 = false;
            zIsEmpty = false;
        }
        long j4 = j & 12936;
        if (j4 != 0) {
            if (!z7) {
                z2 = false;
            }
            if (j4 != 0) {
                j = z2 ? j | 536870912 : j | 268435456;
            }
        } else {
            z2 = false;
        }
        long j5 = j & 12800;
        if (j5 != 0) {
            if (!z7) {
                z = false;
            }
            if (j5 != 0) {
                j |= z ? 34359738368L : 17179869184L;
            }
            int i11 = z ? 0 : 8;
            z3 = z5;
            i5 = i11;
        } else {
            z3 = z5;
            i5 = 0;
        }
        long j6 = j & 8832;
        if (j6 != 0) {
            boolean z11 = z7 ? true : z3;
            if (j6 != 0) {
                j |= z11 ? 33554432L : Javac.GENERATED_MEMBER;
            }
            i6 = z11 ? 0 : 8;
        } else {
            i6 = 0;
        }
        long j7 = j & 8712;
        if (j7 != 0) {
            boolean z12 = z7 ? z10 : false;
            if (j7 != 0) {
                j |= z12 ? 2147483648L : 1073741824L;
            }
            tasks = tasks2;
            i7 = z12 ? 0 : 8;
        } else {
            tasks = tasks2;
            i7 = 0;
        }
        long j8 = j & 12808;
        if (j8 != 0) {
            if (!z7) {
                zIsEmpty = false;
            }
            if (j8 != 0) {
                j = zIsEmpty ? j | 2199023255552L : j | 1099511627776L;
            }
        } else {
            zIsEmpty = false;
        }
        if ((j & 2199023255552L) != 0) {
            z10 = !z4;
        }
        if ((j & 268435456) == 0 || !z7) {
            z4 = false;
        }
        long j9 = j & 12808;
        if (j9 == 0) {
            i8 = 0;
        } else {
            if (!zIsEmpty) {
                z10 = false;
            }
            if (j9 != 0) {
                j |= z10 ? 562949953421312L : 281474976710656L;
            }
            if (!z10) {
                i8 = 8;
            }
        }
        long j10 = j & 12936;
        if (j10 != 0) {
            if (z2) {
                z4 = true;
            }
            if (j10 != 0) {
                j |= z4 ? 8388608L : 4194304L;
            }
        } else {
            z4 = false;
        }
        long j11 = j & 12936;
        if (j11 != 0) {
            boolean z13 = z4 ? true : z3;
            if (j11 != 0) {
                j |= z13 ? MediaStatus.COMMAND_UNFOLLOW : MediaStatus.COMMAND_FOLLOW;
            }
            i9 = z13 ? 0 : 8;
        } else {
            i9 = 0;
        }
        if ((j & 8448) != 0) {
            i10 = i8;
            this.s0.setVisibility(i);
            this.x0.setVisibility(i2);
        } else {
            i10 = i8;
        }
        if ((8196 & j) != 0) {
            this.C0.i0(formFields);
        }
        if ((8256 & j) != 0) {
            this.C0.h0(ck6Var);
            this.D0.h0(ck6Var);
        }
        if ((9216 & j) != 0) {
            this.C0.j0(num);
            this.D0.j0(num);
        }
        if ((8224 & j) != 0) {
            this.D0.i0(formFields2);
        }
        if ((8208 & j) != 0) {
            nr1.f1(this.M0, name);
            nr1.Z0(this.N0, leads);
            nr1.X0(this.O0, leads);
        }
        if ((j & 12800) != 0) {
            this.S0.setVisibility(i5);
        }
        if ((j & 8712) != 0) {
            this.U0.setVisibility(i7);
        }
        if ((j & 12288) != 0) {
            fjh.m26938c(this.a1, str);
            this.h1.setVisibility(i4);
            nr1.s2(this.h1, Long.valueOf(callStartTime));
            this.j1.setVisibility(i4);
            nr1.m40930A(this.j1, tasks);
        }
        if ((j & 12936) != 0) {
            this.c1.setVisibility(i9);
        }
        if ((j & 8704) != 0) {
            int i12 = i3;
            this.d1.setVisibility(i12);
            this.n1.setVisibility(i12);
        }
        if ((j & 8832) != 0) {
            this.e1.setVisibility(i6);
        }
        if ((j & 12808) != 0) {
            this.k1.setVisibility(i10);
        }
        ewi.m25683r(this.C0);
        ewi.m25683r(this.D0);
    }

    @Override // p001o.z2g
    public void q0(boolean z) {
        this.r1 = z;
        synchronized (this) {
            this.B1 |= 512;
        }
        m28509h(17);
        super.m25692R();
    }

    @Override // p001o.z2g
    public void s0(FormFields formFields) {
        this.u1 = formFields;
        synchronized (this) {
            this.B1 |= 4;
        }
        m28509h(19);
        super.m25692R();
    }

    @Override // p001o.z2g
    public void t0(FormFields formFields) {
        this.v1 = formFields;
        synchronized (this) {
            this.B1 |= 32;
        }
        m28509h(20);
        super.m25692R();
    }

    @Override // p001o.z2g
    public void u0(boolean z) {
        this.s1 = z;
        synchronized (this) {
            this.B1 |= 8;
        }
        m28509h(21);
        super.m25692R();
    }

    @Override // p001o.z2g
    public void v0(boolean z) {
        this.t1 = z;
        synchronized (this) {
            this.B1 |= 128;
        }
        m28509h(55);
        super.m25692R();
    }

    @Override // p001o.z2g
    public void w0(Leads leads) {
        this.q1 = leads;
        synchronized (this) {
            this.B1 |= 16;
        }
        m28509h(61);
        super.m25692R();
    }

    @Override // p001o.z2g
    public void x0(Tasks tasks) {
        this.p1 = tasks;
        synchronized (this) {
            this.B1 |= MediaStatus.COMMAND_EDIT_TRACKS;
        }
        m28509h(67);
        super.m25692R();
    }

    @Override // p001o.z2g
    public void y0(boolean z) {
        this.x1 = z;
        synchronized (this) {
            this.B1 |= 256;
        }
        m28509h(82);
        super.m25692R();
    }

    public final boolean z0(r14 r14Var, int i) {
        if (i != 0) {
            return false;
        }
        synchronized (this) {
            this.B1 |= 2;
        }
        return true;
    }

    public a3g(yt4 yt4Var, View view, Object[] objArr) {
        super(yt4Var, view, 2, (Button) objArr[41], (Button) objArr[39], (Button) objArr[37], (Button) objArr[40], (Button) objArr[38], (LinearLayout) objArr[6], (Chip) objArr[35], (Chip) objArr[32], (Chip) objArr[33], (MaterialButton) objArr[54], (ConstraintLayout) objArr[7], (Chip) objArr[34], (Chip) objArr[31], (ChipGroup) objArr[28], (MaterialCardView) objArr[18], (r14) objArr[16], (r14) objArr[17], (ShapeableImageView) objArr[21], (Chip) objArr[30], (Chip) objArr[29], (ShapeableImageView) objArr[19], (View) objArr[24], (View) objArr[27], (LinearLayout) objArr[23], (ShapeableImageView) objArr[20], (MaterialTextView) objArr[2], (MaterialTextView) objArr[3], (ShapeableImageView) objArr[1], (MaterialButton) objArr[51], (MaterialButton) objArr[50], (MaterialButton) objArr[49], (MaterialButton) objArr[11], (RecyclerView) objArr[36], (RecyclerView) objArr[13], (RecyclerView) objArr[22], (NestedScrollView) objArr[45], (LinearLayout) objArr[48], (MaterialCardView) objArr[52], (MaterialTextView) objArr[53], (TextInputEditText) objArr[15], (TextInputLayout) objArr[47], (MaterialButtonToggleGroup) objArr[14], (MaterialTextView) objArr[10], (MaterialTextView) objArr[9], (MaterialTextView) objArr[42], (MaterialTextView) objArr[25], (MaterialTextView) objArr[4], (MaterialButton) objArr[26], (MaterialTextView) objArr[5], (MaterialTextView) objArr[12], (MaterialButton) objArr[43], (MaterialButton) objArr[44], (MaterialTextView) objArr[8], (MaterialTextView) objArr[46]);
        this.B1 = -1L;
        this.s0.setTag(null);
        this.x0.setTag(null);
        m25693Z(this.C0);
        m25693Z(this.D0);
        this.M0.setTag(null);
        this.N0.setTag(null);
        this.O0.setTag(null);
        FrameLayout frameLayout = (FrameLayout) objArr[0];
        this.A1 = frameLayout;
        frameLayout.setTag(null);
        this.S0.setTag(null);
        this.U0.setTag(null);
        this.a1.setTag(null);
        this.c1.setTag(null);
        this.d1.setTag(null);
        this.e1.setTag(null);
        this.h1.setTag(null);
        this.j1.setTag(null);
        this.k1.setTag(null);
        this.n1.setTag(null);
        a0(view);
        mo16291G();
    }
}
