package p001o;

import ai.salesmax.custom.CustomFormDataObservable;
import ai.salesmax.model.Leads;
import ai.salesmax.model.LeadsUser;
import ai.salesmax.model.RecentAction;
import ai.salesmax.model.Tasks;
import android.util.SparseIntArray;
import android.view.View;
import android.widget.LinearLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.gms.cast.MediaStatus;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.card.MaterialCardView;
import com.google.android.material.chip.Chip;
import com.google.android.material.imageview.ShapeableImageView;
import com.google.android.material.progressindicator.LinearProgressIndicator;
import com.google.android.material.textview.MaterialTextView;
import java.util.List;
import p001o.ewi;

/* loaded from: classes.dex */
public class u8d extends t8d {
    public static final ewi.C13274i a1;
    public static final SparseIntArray b1;
    public final LinearLayout X0;
    public final ConstraintLayout Y0;
    public long Z0;

    static {
        ewi.C13274i c13274i = new ewi.C13274i(33);
        a1 = c13274i;
        c13274i.m25699a(1, new String[]{"content_recent_actions", "content_custom_form_value"}, new int[]{18, 19}, new int[]{p9e.content_recent_actions, p9e.content_custom_form_value});
        SparseIntArray sparseIntArray = new SparseIntArray();
        b1 = sparseIntArray;
        sparseIntArray.put(z8e.loadingMoreData, 20);
        sparseIntArray.put(z8e.loadingMoreDataText, 21);
        sparseIntArray.put(z8e.summaryFirstCard, 22);
        sparseIntArray.put(z8e.chipsGroupLayuot, 23);
        sparseIntArray.put(z8e.tvLatestRemarkHeading, 24);
        sparseIntArray.put(z8e.tvPreviousEngagement, 25);
        sparseIntArray.put(z8e.buttonPlaceCall, 26);
        sparseIntArray.put(z8e.placingCallTitle, 27);
        sparseIntArray.put(z8e.progressbar, 28);
        sparseIntArray.put(z8e.autoDialActions, 29);
        sparseIntArray.put(z8e.btnPause, 30);
        sparseIntArray.put(z8e.btnSkip, 31);
        sparseIntArray.put(z8e.btnExit, 32);
    }

    public u8d(yt4 yt4Var, View view) {
        this(yt4Var, view, ewi.m25671L(yt4Var, view, 33, a1, b1));
    }

    @Override // p001o.ewi
    /* renamed from: E */
    public boolean mo16290E() {
        synchronized (this) {
            if (this.Z0 != 0) {
                return true;
            }
            return this.J0.mo16290E() || this.v0.mo16290E();
        }
    }

    @Override // p001o.ewi
    /* renamed from: G */
    public void mo16291G() {
        synchronized (this) {
            this.Z0 = 256L;
        }
        this.J0.mo16291G();
        this.v0.mo16291G();
        m25692R();
    }

    @Override // p001o.ewi
    /* renamed from: M */
    public boolean mo16292M(int i, Object obj, int i2) {
        if (i == 0) {
            return n0((CustomFormDataObservable) obj, i2);
        }
        if (i == 1) {
            return m0((t14) obj, i2);
        }
        if (i != 2) {
            return false;
        }
        return p0((p44) obj, i2);
    }

    @Override // p001o.ewi
    public boolean b0(int i, Object obj) {
        if (96 == i) {
            l0((Tasks) obj);
        } else if (32 == i) {
            j0((String) obj);
        } else if (73 == i) {
            s0((Integer) obj);
        } else if (33 == i) {
            q0((ck6) obj);
        } else {
            if (67 != i) {
                return false;
            }
            k0((Leads) obj);
        }
        return true;
    }

    @Override // p001o.t8d
    public void j0(String str) {
        this.U0 = str;
        synchronized (this) {
            this.Z0 |= 16;
        }
        m28509h(32);
        super.m25692R();
    }

    @Override // p001o.t8d
    public void k0(Leads leads) {
        this.S0 = leads;
        synchronized (this) {
            this.Z0 |= 128;
        }
        m28509h(67);
        super.m25692R();
    }

    @Override // p001o.t8d
    public void l0(Tasks tasks) {
        this.T0 = tasks;
        synchronized (this) {
            this.Z0 |= 8;
        }
        m28509h(96);
        super.m25692R();
    }

    public final boolean m0(t14 t14Var, int i) {
        if (i != 0) {
            return false;
        }
        synchronized (this) {
            this.Z0 |= 2;
        }
        return true;
    }

    public final boolean n0(CustomFormDataObservable customFormDataObservable, int i) {
        if (i != 0) {
            return false;
        }
        synchronized (this) {
            this.Z0 |= 1;
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x0174  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x017f  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x01aa  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x01f4  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0202  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x0215  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0227  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0159  */
    @Override // p001o.ewi
    /* renamed from: p */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void mo16295p() {
        long j;
        int i;
        LeadsUser leadsUser;
        String str;
        boolean z;
        String str2;
        Integer num;
        ck6 ck6Var;
        String str3;
        int i2;
        int i3;
        int i4;
        String str4;
        String str5;
        List<RecentAction> list;
        CustomFormDataObservable customFormDataObservable;
        int i5;
        long j2;
        int i6;
        int i7;
        int i8;
        int i9;
        String contactOwner;
        List<RecentAction> recentEngagements;
        String name;
        boolean zHasContactOwner;
        String activeDealStage;
        String customAttributes;
        LeadsUser taskOwner;
        String taskAssignedTo;
        synchronized (this) {
            j = this.Z0;
            this.Z0 = 0L;
        }
        Tasks tasks = this.T0;
        String str6 = this.U0;
        Integer num2 = this.V0;
        ck6 ck6Var2 = this.W0;
        Leads leads = this.S0;
        long j3 = j & 264;
        if (j3 != 0) {
            if (tasks != null) {
                taskOwner = tasks.getTaskOwner();
                taskAssignedTo = tasks.getTaskAssignedTo();
            } else {
                taskOwner = null;
                taskAssignedTo = null;
            }
            boolean z2 = tasks != null;
            if (j3 != 0) {
                j |= z2 ? MediaStatus.COMMAND_LIKE : MediaStatus.COMMAND_PLAYBACK_RATE;
            }
            i = z2 ? 0 : 8;
            leadsUser = taskOwner;
            str = taskAssignedTo;
        } else {
            i = 0;
            leadsUser = null;
            str = null;
        }
        long j4 = j & 272;
        if (j4 != 0) {
            str2 = "Recommended Greeting : " + str6;
            z = str6 != null;
            if (j4 != 0) {
                j = z ? j | MediaStatus.COMMAND_EDIT_TRACKS : j | MediaStatus.COMMAND_QUEUE_REPEAT_ONE;
            }
        } else {
            z = false;
            str2 = null;
        }
        if ((j & 385) != 0) {
            long j5 = j & 384;
            if (j5 != 0) {
                if (leads != null) {
                    activeDealStage = leads.getActiveDealStage();
                    customAttributes = leads.getCustomAttributes();
                    zHasContactOwner = leads.hasContactOwner();
                    contactOwner = leads.getContactOwner();
                    recentEngagements = leads.getRecentEngagements();
                    name = leads.getName();
                } else {
                    zHasContactOwner = false;
                    activeDealStage = null;
                    customAttributes = null;
                    contactOwner = null;
                    recentEngagements = null;
                    name = null;
                }
                if (j5 != 0) {
                    j |= zHasContactOwner ? 1048576L : 524288L;
                }
                boolean z3 = activeDealStage == null;
                boolean z4 = customAttributes == null;
                i9 = zHasContactOwner ? 0 : 8;
                if ((j & 384) != 0) {
                    j |= z3 ? MediaStatus.COMMAND_FOLLOW : MediaStatus.COMMAND_DISLIKE;
                }
                if ((j & 384) != 0) {
                    j |= z4 ? MediaStatus.COMMAND_QUEUE_REPEAT_ALL : 512L;
                }
                i7 = z3 ? 8 : 0;
                i8 = z4 ? 8 : 0;
            } else {
                i7 = 0;
                i8 = 0;
                i9 = 0;
                contactOwner = null;
                recentEngagements = null;
                name = null;
            }
            CustomFormDataObservable customAttributesObservable = leads != null ? leads.getCustomAttributesObservable() : null;
            g0(0, customAttributesObservable);
            customFormDataObservable = customAttributesObservable;
            i2 = i9;
            str4 = contactOwner;
            list = recentEngagements;
            ck6Var = ck6Var2;
            i4 = i8;
            num = num2;
            i3 = i7;
            str3 = str2;
            str5 = name;
        } else {
            num = num2;
            ck6Var = ck6Var2;
            str3 = str2;
            i2 = 0;
            i3 = 0;
            i4 = 0;
            str4 = null;
            str5 = null;
            list = null;
            customFormDataObservable = null;
        }
        if ((j & MediaStatus.COMMAND_EDIT_TRACKS) != 0) {
            i5 = i3;
            boolean z5 = str6 != "";
            j2 = j & 272;
            if (j2 == 0) {
                if (!z) {
                    z5 = false;
                }
                if (j2 != 0) {
                    j |= z5 ? MediaStatus.COMMAND_STREAM_TRANSFER : MediaStatus.COMMAND_UNFOLLOW;
                }
                i6 = z5 ? 0 : 8;
            } else {
                i6 = 0;
            }
            if ((j & 264) != 0) {
                nr1.d0(this.s0, tasks);
                nr1.T1(this.t0, tasks);
                nr1.V0(this.y0, leadsUser);
                this.z0.setVisibility(i);
                this.K0.setVisibility(i);
                fjh.m26938c(this.M0, str);
                nr1.m40930A(this.N0, tasks);
            }
            if ((j & 384) != 0) {
                this.v0.m25689B().setVisibility(i4);
                nr1.f1(this.A0, str5);
                nr1.Z0(this.B0, leads);
                nr1.X0(this.C0, leads);
                nr1.m40948S(this.D0, leads);
                this.E0.setVisibility(i2);
                nr1.m40944O(this.E0, leads);
                nr1.g1(this.E0, str4);
                this.J0.i0(list);
                nr1.P0(this.O0, leads);
                this.Q0.setVisibility(i5);
                nr1.T0(this.Q0, leads);
            }
            if ((j & 385) != 0) {
                this.v0.i0(customFormDataObservable);
            }
            if ((320 & j) != 0) {
                ck6 ck6Var3 = ck6Var;
                this.v0.h0(ck6Var3);
                this.J0.h0(ck6Var3);
            }
            if ((288 & j) != 0) {
                Integer num3 = num;
                this.v0.j0(num3);
                this.J0.j0(num3);
            }
            if ((j & 272) != 0) {
                this.w0.setVisibility(i6);
                this.x0.setVisibility(i6);
                fjh.m26938c(this.x0, str3);
            }
            ewi.m25683r(this.J0);
            ewi.m25683r(this.v0);
        }
        i5 = i3;
        j2 = j & 272;
        if (j2 == 0) {
        }
        if ((j & 264) != 0) {
        }
        if ((j & 384) != 0) {
        }
        if ((j & 385) != 0) {
        }
        if ((320 & j) != 0) {
        }
        if ((288 & j) != 0) {
        }
        if ((j & 272) != 0) {
        }
        ewi.m25683r(this.J0);
        ewi.m25683r(this.v0);
    }

    public final boolean p0(p44 p44Var, int i) {
        if (i != 0) {
            return false;
        }
        synchronized (this) {
            this.Z0 |= 4;
        }
        return true;
    }

    public void q0(ck6 ck6Var) {
        this.W0 = ck6Var;
        synchronized (this) {
            this.Z0 |= 64;
        }
        m28509h(33);
        super.m25692R();
    }

    public void s0(Integer num) {
        this.V0 = num;
        synchronized (this) {
            this.Z0 |= 32;
        }
        m28509h(73);
        super.m25692R();
    }

    public u8d(yt4 yt4Var, View view, Object[] objArr) {
        super(yt4Var, view, 3, (LinearLayout) objArr[29], (MaterialButton) objArr[32], (MaterialButton) objArr[30], (MaterialButton) objArr[31], (MaterialButton) objArr[26], (MaterialTextView) objArr[15], (ShapeableImageView) objArr[14], (LinearLayout) objArr[23], (t14) objArr[19], (MaterialCardView) objArr[16], (MaterialTextView) objArr[17], (ShapeableImageView) objArr[11], (ConstraintLayout) objArr[9], (MaterialTextView) objArr[3], (MaterialTextView) objArr[4], (ShapeableImageView) objArr[2], (Chip) objArr[7], (Chip) objArr[6], (MaterialCardView) objArr[20], (MaterialTextView) objArr[21], (MaterialTextView) objArr[27], (LinearProgressIndicator) objArr[28], (p44) objArr[18], (View) objArr[8], (MaterialCardView) objArr[22], (MaterialTextView) objArr[12], (MaterialTextView) objArr[13], (MaterialTextView) objArr[10], (MaterialTextView) objArr[24], (MaterialTextView) objArr[5], (MaterialTextView) objArr[25]);
        this.Z0 = -1L;
        this.s0.setTag(null);
        this.t0.setTag(null);
        m25693Z(this.v0);
        this.w0.setTag(null);
        this.x0.setTag(null);
        this.y0.setTag(null);
        this.z0.setTag(null);
        this.A0.setTag(null);
        this.B0.setTag(null);
        this.C0.setTag(null);
        this.D0.setTag(null);
        this.E0.setTag(null);
        LinearLayout linearLayout = (LinearLayout) objArr[0];
        this.X0 = linearLayout;
        linearLayout.setTag(null);
        ConstraintLayout constraintLayout = (ConstraintLayout) objArr[1];
        this.Y0 = constraintLayout;
        constraintLayout.setTag(null);
        m25693Z(this.J0);
        this.K0.setTag(null);
        this.M0.setTag(null);
        this.N0.setTag(null);
        this.O0.setTag(null);
        this.Q0.setTag(null);
        a0(view);
        mo16291G();
    }
}
