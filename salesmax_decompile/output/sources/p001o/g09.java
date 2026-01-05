package p001o;

import ai.salesmax.model.BusinessInfo;
import ai.salesmax.model.CallLogs;
import ai.salesmax.model.Leads;
import ai.salesmax.model.RecentAction;
import ai.salesmax.model.VideoMeeting;
import android.content.res.Resources;
import android.util.SparseIntArray;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.FrameLayout;
import android.widget.HorizontalScrollView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.gms.cast.MediaStatus;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.card.MaterialCardView;
import com.google.android.material.chip.Chip;
import com.google.android.material.imageview.ShapeableImageView;
import com.google.android.material.textview.MaterialTextView;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import lombok.javac.Javac;
import p001o.ewi;
import p001o.jbc;
import p001o.sbc;

/* loaded from: classes.dex */
public class g09 extends f09 implements jbc.InterfaceC14485a, sbc.InterfaceC16795a {
    public static final ewi.C13274i D1;
    public static final SparseIntArray E1;
    public final View.OnClickListener A1;
    public final View.OnClickListener B1;
    public long C1;
    public final ConstraintLayout c1;
    public final View.OnClickListener d1;
    public final View.OnClickListener e1;
    public final View.OnClickListener f1;
    public final View.OnClickListener g1;
    public final View.OnClickListener h1;
    public final View.OnClickListener i1;
    public final View.OnLongClickListener j1;
    public final View.OnClickListener k1;
    public final View.OnLongClickListener l1;
    public final View.OnClickListener m1;
    public final View.OnClickListener n1;
    public final View.OnClickListener o1;
    public final View.OnClickListener p1;
    public final View.OnClickListener q1;
    public final View.OnLongClickListener r1;
    public final View.OnClickListener s1;
    public final View.OnClickListener t1;
    public final View.OnLongClickListener u1;
    public final View.OnClickListener v1;
    public final View.OnClickListener w1;
    public final View.OnClickListener x1;
    public final View.OnLongClickListener y1;
    public final View.OnClickListener z1;

    static {
        ewi.C13274i c13274i = new ewi.C13274i(38);
        D1 = c13274i;
        c13274i.m25699a(11, new String[]{"content_recent_actions_linear"}, new int[]{35}, new int[]{p9e.content_recent_actions_linear});
        SparseIntArray sparseIntArray = new SparseIntArray();
        E1 = sparseIntArray;
        sparseIntArray.put(z8e.frame_container_ivContactProfilePicInLead, 36);
        sparseIntArray.put(z8e.callTimeBlock, 37);
    }

    public g09(yt4 yt4Var, View view) {
        this(yt4Var, view, ewi.m25671L(yt4Var, view, 38, D1, E1));
    }

    @Override // p001o.ewi
    /* renamed from: E */
    public boolean mo16290E() {
        synchronized (this) {
            if (this.C1 != 0) {
                return true;
            }
            return this.R0.mo16290E();
        }
    }

    @Override // p001o.ewi
    /* renamed from: G */
    public void mo16291G() {
        synchronized (this) {
            this.C1 = 32L;
        }
        this.R0.mo16291G();
        m25692R();
    }

    @Override // p001o.ewi
    /* renamed from: M */
    public boolean mo16292M(int i, Object obj, int i2) {
        if (i != 0) {
            return false;
        }
        return h0((r44) obj, i2);
    }

    @Override // p001o.sbc.InterfaceC16795a
    /* renamed from: a */
    public final boolean mo16293a(int i, View view) {
        if (i == 2) {
            ck6 ck6Var = this.a1;
            Leads leads = this.Y0;
            Integer num = this.Z0;
            if (ck6Var != null) {
                return ck6Var.mo707a(view, num.intValue(), leads);
            }
            return false;
        }
        if (i == 4) {
            ck6 ck6Var2 = this.a1;
            Leads leads2 = this.Y0;
            Integer num2 = this.Z0;
            if (ck6Var2 != null) {
                return ck6Var2.mo707a(view, num2.intValue(), leads2);
            }
            return false;
        }
        if (i == 9) {
            ck6 ck6Var3 = this.a1;
            Leads leads3 = this.Y0;
            Integer num3 = this.Z0;
            if (ck6Var3 != null) {
                return ck6Var3.mo707a(view, num3.intValue(), leads3);
            }
            return false;
        }
        if (i == 13) {
            ck6 ck6Var4 = this.a1;
            Leads leads4 = this.Y0;
            Integer num4 = this.Z0;
            if (ck6Var4 != null) {
                return ck6Var4.mo707a(view, num4.intValue(), leads4);
            }
            return false;
        }
        if (i != 22) {
            return false;
        }
        ck6 ck6Var5 = this.a1;
        Leads leads5 = this.Y0;
        Integer num5 = this.Z0;
        if (ck6Var5 != null) {
            return ck6Var5.mo707a(view, num5.intValue(), leads5);
        }
        return false;
    }

    @Override // p001o.ewi
    public boolean b0(int i, Object obj) {
        if (33 == i) {
            j0((ck6) obj);
        } else if (7 == i) {
            i0((rog) obj);
        } else if (73 == i) {
            l0((Integer) obj);
        } else {
            if (67 != i) {
                return false;
            }
            k0((Leads) obj);
        }
        return true;
    }

    @Override // p001o.jbc.InterfaceC14485a
    /* renamed from: c */
    public final void mo16294c(int i, View view) {
        switch (i) {
            case 1:
                ck6 ck6Var = this.a1;
                Leads leads = this.Y0;
                Integer num = this.Z0;
                if (ck6Var != null) {
                    ck6Var.mo708b(view, num.intValue(), leads);
                    break;
                }
                break;
            case 3:
                ck6 ck6Var2 = this.a1;
                Leads leads2 = this.Y0;
                Integer num2 = this.Z0;
                if (ck6Var2 != null) {
                    ck6Var2.mo708b(view, num2.intValue(), leads2);
                    break;
                }
                break;
            case 5:
                ck6 ck6Var3 = this.a1;
                Leads leads3 = this.Y0;
                Integer num3 = this.Z0;
                if (ck6Var3 != null) {
                    ck6Var3.mo708b(view, num3.intValue(), leads3);
                    break;
                }
                break;
            case 6:
                ck6 ck6Var4 = this.a1;
                Leads leads4 = this.Y0;
                Integer num4 = this.Z0;
                if (ck6Var4 != null) {
                    ck6Var4.mo708b(view, num4.intValue(), leads4);
                    break;
                }
                break;
            case 7:
                ck6 ck6Var5 = this.a1;
                Leads leads5 = this.Y0;
                Integer num5 = this.Z0;
                if (ck6Var5 != null) {
                    ck6Var5.mo708b(view, num5.intValue(), leads5);
                    break;
                }
                break;
            case 8:
                ck6 ck6Var6 = this.a1;
                Leads leads6 = this.Y0;
                Integer num6 = this.Z0;
                if (ck6Var6 != null) {
                    ck6Var6.mo708b(view, num6.intValue(), leads6);
                    break;
                }
                break;
            case 10:
                ck6 ck6Var7 = this.a1;
                Leads leads7 = this.Y0;
                Integer num7 = this.Z0;
                if (ck6Var7 != null) {
                    ck6Var7.mo708b(view, num7.intValue(), leads7);
                    break;
                }
                break;
            case 11:
                ck6 ck6Var8 = this.a1;
                Leads leads8 = this.Y0;
                Integer num8 = this.Z0;
                if (ck6Var8 != null) {
                    ck6Var8.mo708b(view, num8.intValue(), leads8);
                    break;
                }
                break;
            case 12:
                ck6 ck6Var9 = this.a1;
                Leads leads9 = this.Y0;
                Integer num9 = this.Z0;
                if (ck6Var9 != null) {
                    ck6Var9.mo708b(view, num9.intValue(), leads9);
                    break;
                }
                break;
            case 14:
                ck6 ck6Var10 = this.a1;
                Leads leads10 = this.Y0;
                Integer num10 = this.Z0;
                if (ck6Var10 != null) {
                    ck6Var10.mo708b(view, num10.intValue(), leads10);
                    break;
                }
                break;
            case 15:
                ck6 ck6Var11 = this.a1;
                Leads leads11 = this.Y0;
                Integer num11 = this.Z0;
                if (ck6Var11 != null) {
                    ck6Var11.mo708b(view, num11.intValue(), leads11);
                    break;
                }
                break;
            case 16:
                ck6 ck6Var12 = this.a1;
                Leads leads12 = this.Y0;
                Integer num12 = this.Z0;
                if (ck6Var12 != null) {
                    ck6Var12.mo708b(view, num12.intValue(), leads12);
                    break;
                }
                break;
            case 17:
                ck6 ck6Var13 = this.a1;
                Leads leads13 = this.Y0;
                Integer num13 = this.Z0;
                if (ck6Var13 != null) {
                    ck6Var13.mo708b(view, num13.intValue(), leads13);
                    break;
                }
                break;
            case 18:
                ck6 ck6Var14 = this.a1;
                Leads leads14 = this.Y0;
                Integer num14 = this.Z0;
                if (ck6Var14 != null) {
                    ck6Var14.mo708b(view, num14.intValue(), leads14);
                    break;
                }
                break;
            case 19:
                ck6 ck6Var15 = this.a1;
                Leads leads15 = this.Y0;
                Integer num15 = this.Z0;
                if (ck6Var15 != null) {
                    ck6Var15.mo708b(view, num15.intValue(), leads15);
                    break;
                }
                break;
            case 20:
                ck6 ck6Var16 = this.a1;
                Leads leads16 = this.Y0;
                Integer num16 = this.Z0;
                if (ck6Var16 != null) {
                    ck6Var16.mo708b(view, num16.intValue(), leads16);
                    break;
                }
                break;
            case 21:
                ck6 ck6Var17 = this.a1;
                Leads leads17 = this.Y0;
                Integer num17 = this.Z0;
                if (ck6Var17 != null) {
                    ck6Var17.mo708b(view, num17.intValue(), leads17);
                    break;
                }
                break;
            case 23:
                ck6 ck6Var18 = this.a1;
                Leads leads18 = this.Y0;
                Integer num18 = this.Z0;
                if (ck6Var18 != null) {
                    ck6Var18.mo708b(view, num18.intValue(), leads18);
                    break;
                }
                break;
            case 24:
                ck6 ck6Var19 = this.a1;
                Leads leads19 = this.Y0;
                Integer num19 = this.Z0;
                if (ck6Var19 != null) {
                    ck6Var19.mo708b(view, num19.intValue(), leads19);
                    break;
                }
                break;
            case 25:
                ck6 ck6Var20 = this.a1;
                Leads leads20 = this.Y0;
                Integer num20 = this.Z0;
                if (ck6Var20 != null) {
                    ck6Var20.mo708b(view, num20.intValue(), leads20);
                    break;
                }
                break;
        }
    }

    public final boolean h0(r44 r44Var, int i) {
        if (i != 0) {
            return false;
        }
        synchronized (this) {
            this.C1 |= 1;
        }
        return true;
    }

    public void i0(rog rogVar) {
        this.b1 = rogVar;
        synchronized (this) {
            this.C1 |= 4;
        }
        m28509h(7);
        super.m25692R();
    }

    public void j0(ck6 ck6Var) {
        this.a1 = ck6Var;
        synchronized (this) {
            this.C1 |= 2;
        }
        m28509h(33);
        super.m25692R();
    }

    public void k0(Leads leads) {
        this.Y0 = leads;
        synchronized (this) {
            this.C1 |= 16;
        }
        m28509h(67);
        super.m25692R();
    }

    public void l0(Integer num) {
        this.Z0 = num;
        synchronized (this) {
            this.C1 |= 8;
        }
        m28509h(73);
        super.m25692R();
    }

    /* JADX WARN: Removed duplicated region for block: B:134:0x0264  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x026c  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x0277  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x02a4  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x02b3  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x02c9  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x02d5  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x02e2  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x02eb A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:184:0x02f2  */
    /* JADX WARN: Removed duplicated region for block: B:187:0x02f9  */
    /* JADX WARN: Removed duplicated region for block: B:198:0x0310 A[PHI: r2
      0x0310: PHI (r2v5 long) = (r2v4 long), (r2v35 long) binds: [B:186:0x02f7, B:195:0x030a] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:201:0x031d  */
    /* JADX WARN: Removed duplicated region for block: B:208:0x032d  */
    /* JADX WARN: Removed duplicated region for block: B:211:0x0336  */
    /* JADX WARN: Removed duplicated region for block: B:226:0x0372  */
    /* JADX WARN: Removed duplicated region for block: B:237:0x0388 A[PHI: r2
      0x0388: PHI (r2v9 long) = (r2v8 long), (r2v21 long) binds: [B:225:0x0370, B:234:0x0383] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:240:0x0391 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:242:0x0398  */
    /* JADX WARN: Removed duplicated region for block: B:245:0x03a0 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:247:0x03a5  */
    /* JADX WARN: Removed duplicated region for block: B:250:0x03b0  */
    /* JADX WARN: Removed duplicated region for block: B:260:0x03c8  */
    /* JADX WARN: Removed duplicated region for block: B:263:0x03d4  */
    /* JADX WARN: Removed duplicated region for block: B:266:0x03dd  */
    /* JADX WARN: Removed duplicated region for block: B:269:0x03e4  */
    /* JADX WARN: Removed duplicated region for block: B:278:0x03fe A[PHI: r2
      0x03fe: PHI (r2v12 long) = (r2v11 long), (r2v16 long) binds: [B:268:0x03e2, B:276:0x03f9] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:281:0x0407  */
    /* JADX WARN: Removed duplicated region for block: B:282:0x04c0  */
    /* JADX WARN: Removed duplicated region for block: B:285:0x04cb  */
    /* JADX WARN: Removed duplicated region for block: B:288:0x0583  */
    /* JADX WARN: Removed duplicated region for block: B:291:0x0591  */
    /* JADX WARN: Removed duplicated region for block: B:294:0x059f  */
    @Override // p001o.ewi
    /* renamed from: p */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void mo16295p() throws Resources.NotFoundException, NumberFormatException {
        long j;
        boolean z;
        ck6 ck6Var;
        Integer num;
        String str;
        String str2;
        String str3;
        Integer num2;
        String str4;
        Date date;
        BusinessInfo addedBusiness;
        String str5;
        List<RecentAction> list;
        Integer num3;
        int i;
        int i2;
        boolean z2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        boolean showSelection;
        boolean z3;
        boolean z4;
        boolean z5;
        int i8;
        String website;
        boolean z6;
        long j2;
        int i9;
        long j3;
        boolean z7;
        boolean z8;
        boolean z9;
        long j4;
        int i10;
        long j5;
        long j6;
        int i11;
        long j7;
        ArrayList<CallLogs> arrayList;
        long j8;
        int i12;
        int i13;
        Date nextProspectingDueOn;
        String contactOwner;
        String lastKnownDisposition;
        VideoMeeting openVideoCallDetail;
        String latestRemark;
        List<RecentAction> recentEngagements;
        Integer prospectingAttempts;
        boolean zIsSelected;
        boolean showBottom;
        boolean zIsNewItem;
        synchronized (this) {
            j = this.C1;
            this.C1 = 0L;
        }
        ck6 ck6Var2 = this.a1;
        rog rogVar = this.b1;
        Integer num4 = this.Z0;
        Leads leads = this.Y0;
        long j9 = j & 52;
        if (j9 != 0) {
            z = rogVar != null;
            if (j9 != 0) {
                j = z ? j | MediaStatus.COMMAND_DISLIKE : j | MediaStatus.COMMAND_LIKE;
            }
        } else {
            z = false;
        }
        long j10 = j & 48;
        if (j10 != 0) {
            if (leads != null) {
                nextProspectingDueOn = leads.getNextProspectingDueOn();
                zIsSelected = leads.isSelected();
                showBottom = leads.getShowBottom();
                contactOwner = leads.getContactOwner();
                lastKnownDisposition = leads.getLastKnownDisposition();
                zIsNewItem = leads.isNewItem();
                openVideoCallDetail = leads.getOpenVideoCallDetail();
                latestRemark = leads.getLatestRemark();
                showSelection = leads.getShowSelection();
                addedBusiness = leads.getAddedBusiness();
                Integer unsuccessfulCallAttempts = leads.getUnsuccessfulCallAttempts();
                recentEngagements = leads.getRecentEngagements();
                prospectingAttempts = leads.getProspectingAttempts();
                num2 = unsuccessfulCallAttempts;
            } else {
                num2 = null;
                nextProspectingDueOn = null;
                contactOwner = null;
                lastKnownDisposition = null;
                openVideoCallDetail = null;
                latestRemark = null;
                addedBusiness = null;
                recentEngagements = null;
                prospectingAttempts = null;
                zIsSelected = false;
                showBottom = false;
                zIsNewItem = false;
                showSelection = false;
            }
            if (j10 != 0) {
                j |= showBottom ? 2147483648L : 1073741824L;
            }
            if ((j & 48) != 0) {
                j |= zIsNewItem ? 34359738368L : 17179869184L;
            }
            if ((j & 48) != 0) {
                j = showSelection ? j | 536870912 | 137438953472L | 549755813888L | 35184372088832L : j | 268435456 | 68719476736L | 274877906944L | 17592186044416L;
            }
            i4 = showBottom ? 0 : 8;
            boolean z10 = lastKnownDisposition == null;
            int i14 = zIsNewItem ? 0 : 8;
            z3 = latestRemark != null;
            z4 = !showSelection;
            int i15 = showSelection ? 8 : 0;
            int i16 = showSelection ? 0 : 8;
            z5 = addedBusiness != null;
            String str6 = "(" + num2;
            boolean z11 = prospectingAttempts == null;
            if ((j & 48) != 0) {
                j |= z10 ? 134217728L : 67108864L;
            }
            if ((j & 48) != 0) {
                j = z3 ? j | 512 : j | 256;
            }
            if ((j & 48) != 0) {
                j |= z4 ? MediaStatus.COMMAND_PLAYBACK_RATE : MediaStatus.COMMAND_EDIT_TRACKS;
            }
            if ((j & 48) != 0) {
                j = z5 ? j | 8589934592L : j | 4294967296L;
            }
            if ((j & 48) != 0) {
                j |= z11 ? 2199023255552L : 1099511627776L;
            }
            String dueDate = openVideoCallDetail != null ? openVideoCallDetail.getDueDate() : null;
            boolean zIsEmpty = recentEngagements != null ? recentEngagements.isEmpty() : false;
            if ((j & 48) != 0) {
                j |= zIsEmpty ? 140737488355328L : 70368744177664L;
            }
            int i17 = z10 ? 8 : 0;
            int i18 = z4 ? 0 : 8;
            str = str6 + ")";
            int i19 = z11 ? 8 : 0;
            int i20 = zIsEmpty ? 8 : 0;
            date = nextProspectingDueOn;
            str5 = lastKnownDisposition;
            list = recentEngagements;
            num3 = prospectingAttempts;
            i3 = i16;
            i8 = i18;
            num = num4;
            i6 = i20;
            z2 = zIsSelected;
            str2 = latestRemark;
            ck6Var = ck6Var2;
            i = i14;
            i7 = i19;
            i2 = i15;
            int i21 = i17;
            str4 = dueDate;
            str3 = contactOwner;
            i5 = i21;
        } else {
            ck6Var = ck6Var2;
            num = num4;
            str = null;
            str2 = null;
            str3 = null;
            num2 = null;
            str4 = null;
            date = null;
            addedBusiness = null;
            str5 = null;
            list = null;
            num3 = null;
            i = 0;
            i2 = 0;
            z2 = false;
            i3 = 0;
            i4 = 0;
            i5 = 0;
            i6 = 0;
            i7 = 0;
            showSelection = false;
            z3 = false;
            z4 = false;
            z5 = false;
            i8 = 0;
        }
        boolean zM47035a = ((MediaStatus.COMMAND_DISLIKE & j) == 0 || rogVar == null) ? false : rogVar.m47035a();
        if ((j & 8589934592L) != 0) {
            website = addedBusiness != null ? addedBusiness.getWebsite() : null;
            boolean z12 = website != null;
            if ((j & 512) == 0) {
                z6 = zM47035a;
                boolean z13 = str2 != "";
                j2 = j & 48;
                if (j2 != 0) {
                    if (!z3) {
                        z13 = false;
                    }
                    if (!z5) {
                        z12 = false;
                    }
                    if (j2 != 0) {
                        j |= z13 ? MediaStatus.COMMAND_UNFOLLOW : MediaStatus.COMMAND_FOLLOW;
                    }
                    if ((j & 48) != 0) {
                        j = z12 ? j | MediaStatus.COMMAND_QUEUE_REPEAT_ONE : j | MediaStatus.COMMAND_QUEUE_REPEAT_ALL;
                    }
                    i9 = z13 ? 0 : 8;
                } else {
                    i9 = 0;
                    z12 = false;
                }
                j3 = j & 52;
                if (j3 != 0) {
                    if (!z) {
                        z6 = false;
                    }
                    z7 = true;
                    z8 = !z6;
                    if (j3 != 0) {
                        j = z8 ? j | 8388608 : j | 4194304;
                    }
                } else {
                    z7 = true;
                    z8 = false;
                }
                if ((j & MediaStatus.COMMAND_QUEUE_REPEAT_ONE) == 0) {
                    z9 = false;
                } else {
                    if (addedBusiness != null) {
                        website = addedBusiness.getWebsite();
                    }
                    if (website != "") {
                        z9 = z7;
                    }
                }
                boolean zHasContactOwner = ((j & 8388608) == 0 || leads == null) ? false : leads.hasContactOwner();
                j4 = j & 48;
                if (j4 == 0) {
                    i10 = 0;
                } else {
                    if (!z12) {
                        z9 = false;
                    }
                    if (j4 != 0) {
                        j |= z9 ? 2097152L : 1048576L;
                    }
                    if (!z9) {
                        i10 = 8;
                    }
                }
                j5 = j & 52;
                if (j5 != 0) {
                    if (!z8) {
                        zHasContactOwner = false;
                    }
                    if (j5 != 0) {
                        j = zHasContactOwner ? j | 128 : j | 64;
                    }
                } else {
                    zHasContactOwner = false;
                }
                if ((j & 128) != 0) {
                    if (leads != null) {
                        showSelection = leads.getShowSelection();
                    }
                    if ((j & 48) != 0) {
                        j = showSelection ? j | 536870912 | 137438953472L | 549755813888L | 35184372088832L : j | 268435456 | 68719476736L | 274877906944L | 17592186044416L;
                    }
                    z4 = !showSelection;
                    if ((j & 48) != 0) {
                        j |= z4 ? MediaStatus.COMMAND_PLAYBACK_RATE : MediaStatus.COMMAND_EDIT_TRACKS;
                    }
                }
                j6 = j & 52;
                if (j6 == 0) {
                    i11 = 0;
                } else {
                    if (!zHasContactOwner) {
                        z4 = false;
                    }
                    if (j6 != 0) {
                        j |= z4 ? 33554432L : Javac.GENERATED_MEMBER;
                    }
                    if (!z4) {
                        i11 = 4;
                    }
                }
                ArrayList<CallLogs> callHistory = ((j & 17592186044416L) == 0 || leads == null) ? null : leads.getCallHistory();
                boolean z14 = ((j & 68719476736L) == 0 || num2 != null) ? false : z7;
                j7 = j & 48;
                if (j7 != 0) {
                    if (showSelection) {
                        z14 = z7;
                    }
                    ArrayList<CallLogs> arrayList2 = showSelection ? null : callHistory;
                    if (j7 != 0) {
                        j = z14 ? j | 524288 : j | MediaStatus.COMMAND_STREAM_TRANSFER;
                    }
                    arrayList = arrayList2;
                } else {
                    arrayList = null;
                    z14 = false;
                }
                boolean z15 = ((j & MediaStatus.COMMAND_STREAM_TRANSFER) == 0 || ewi.m25674U(num2) != 0) ? false : z7;
                j8 = j & 48;
                if (j8 == 0) {
                    i12 = 0;
                } else {
                    if (z14) {
                        z15 = z7;
                    }
                    if (j8 != 0) {
                        j |= z15 ? 8796093022208L : 4398046511104L;
                    }
                    if (z15) {
                        i12 = 8;
                    }
                }
                if ((j & 48) != 0) {
                    i13 = i11;
                    this.n0.setVisibility(i4);
                    this.o0.setVisibility(i);
                    this.r0.setVisibility(i12);
                    fjh.m26938c(this.r0, str);
                    this.s0.setVisibility(i2);
                    nr1.u2(this.s0, arrayList);
                    this.u0.setVisibility(i2);
                    nr1.v2(this.u0, arrayList);
                    this.w0.setVisibility(i10);
                    np3.m40895a(this.x0, z2);
                    this.x0.setVisibility(i3);
                    nr1.N0(this.z0, leads);
                    nr1.X0(this.A0, leads);
                    nr1.m40952W(this.E0, leads);
                    nr1.m40944O(this.J0, leads);
                    nr1.g1(this.J0, str3);
                    this.N0.setVisibility(i9);
                    nr1.O0(this.N0, leads);
                    Date date2 = date;
                    nr1.s1(this.O0, date2);
                    this.P0.setVisibility(i7);
                    nr1.S1(this.P0, num3);
                    this.Q0.setVisibility(i8);
                    nr1.x1(this.Q0, date2);
                    this.R0.m25689B().setVisibility(i6);
                    this.R0.i0(list);
                    nr1.d1(this.S0, leads);
                    nr1.Z0(this.T0, leads);
                    fu5.m27486a(this.U0, leads);
                    this.V0.setVisibility(i5);
                    nr1.V1(this.V0, str5);
                    nr1.l0(this.W0, str4);
                    nr1.P2(this.X0, leads);
                } else {
                    i13 = i11;
                }
                if ((32 & j) != 0) {
                    this.p0.setOnClickListener(this.m1);
                    this.q0.setOnClickListener(this.d1);
                    this.x0.setOnClickListener(this.z1);
                    this.y0.setOnClickListener(this.w1);
                    this.y0.setOnLongClickListener(this.y1);
                    this.A0.setOnClickListener(this.o1);
                    this.A0.setOnLongClickListener(this.r1);
                    this.B0.setOnClickListener(this.t1);
                    this.B0.setOnLongClickListener(this.j1);
                    this.C0.setOnClickListener(this.s1);
                    this.D0.setOnClickListener(this.n1);
                    this.E0.setOnClickListener(this.h1);
                    this.F0.setOnClickListener(this.x1);
                    this.G0.setOnClickListener(this.v1);
                    this.H0.setOnClickListener(this.f1);
                    this.I0.setOnClickListener(this.k1);
                    this.I0.setOnLongClickListener(this.l1);
                    this.J0.setOnClickListener(this.g1);
                    this.J0.setOnLongClickListener(this.u1);
                    this.K0.setOnClickListener(this.e1);
                    this.L0.setOnClickListener(this.q1);
                    this.M0.setOnClickListener(this.A1);
                    this.O0.setOnClickListener(this.B1);
                    this.Q0.setOnClickListener(this.i1);
                    this.X0.setOnClickListener(this.p1);
                }
                if ((52 & j) != 0) {
                    this.J0.setVisibility(i13);
                }
                if ((34 & j) != 0) {
                    this.R0.h0(ck6Var);
                }
                if ((j & 40) != 0) {
                    this.R0.j0(num);
                }
                ewi.m25683r(this.R0);
            }
            z6 = zM47035a;
            j2 = j & 48;
            if (j2 != 0) {
            }
            j3 = j & 52;
            if (j3 != 0) {
            }
            if ((j & MediaStatus.COMMAND_QUEUE_REPEAT_ONE) == 0) {
            }
            if ((j & 8388608) == 0) {
            }
            j4 = j & 48;
            if (j4 == 0) {
            }
            j5 = j & 52;
            if (j5 != 0) {
            }
            if ((j & 128) != 0) {
            }
            j6 = j & 52;
            if (j6 == 0) {
            }
            if ((j & 17592186044416L) == 0) {
            }
            if ((j & 68719476736L) == 0) {
            }
            j7 = j & 48;
            if (j7 != 0) {
            }
            if ((j & MediaStatus.COMMAND_STREAM_TRANSFER) == 0) {
            }
            j8 = j & 48;
            if (j8 == 0) {
            }
            if ((j & 48) != 0) {
            }
            if ((32 & j) != 0) {
            }
            if ((52 & j) != 0) {
            }
            if ((34 & j) != 0) {
            }
            if ((j & 40) != 0) {
            }
            ewi.m25683r(this.R0);
        }
        website = null;
        if ((j & 512) == 0) {
        }
        j2 = j & 48;
        if (j2 != 0) {
        }
        j3 = j & 52;
        if (j3 != 0) {
        }
        if ((j & MediaStatus.COMMAND_QUEUE_REPEAT_ONE) == 0) {
        }
        if ((j & 8388608) == 0) {
        }
        j4 = j & 48;
        if (j4 == 0) {
        }
        j5 = j & 52;
        if (j5 != 0) {
        }
        if ((j & 128) != 0) {
        }
        j6 = j & 52;
        if (j6 == 0) {
        }
        if ((j & 17592186044416L) == 0) {
        }
        if ((j & 68719476736L) == 0) {
        }
        j7 = j & 48;
        if (j7 != 0) {
        }
        if ((j & MediaStatus.COMMAND_STREAM_TRANSFER) == 0) {
        }
        j8 = j & 48;
        if (j8 == 0) {
        }
        if ((j & 48) != 0) {
        }
        if ((32 & j) != 0) {
        }
        if ((52 & j) != 0) {
        }
        if ((34 & j) != 0) {
        }
        if ((j & 40) != 0) {
        }
        ewi.m25683r(this.R0);
    }

    public g09(yt4 yt4Var, View view, Object[] objArr) {
        super(yt4Var, view, 1, (HorizontalScrollView) objArr[24], (TextView) objArr[3], (Button) objArr[17], (Button) objArr[18], (MaterialTextView) objArr[21], (MaterialTextView) objArr[22], (LinearLayout) objArr[37], (ShapeableImageView) objArr[20], (FrameLayout) objArr[36], (ShapeableImageView) objArr[7], (CheckBox) objArr[23], (MaterialCardView) objArr[0], (ShapeableImageView) objArr[5], (ShapeableImageView) objArr[2], (ShapeableImageView) objArr[15], (MaterialButton) objArr[30], (MaterialButton) objArr[25], (MaterialButton) objArr[26], (MaterialButton) objArr[27], (MaterialButton) objArr[34], (MaterialButton) objArr[33], (MaterialButton) objArr[31], (Chip) objArr[19], (MaterialButton) objArr[32], (MaterialButton) objArr[29], (MaterialButton) objArr[28], (MaterialTextView) objArr[13], (MaterialTextView) objArr[12], (MaterialTextView) objArr[4], (MaterialCardView) objArr[10], (r44) objArr[35], (MaterialTextView) objArr[6], (MaterialTextView) objArr[8], (MaterialTextView) objArr[1], (MaterialTextView) objArr[9], (MaterialTextView) objArr[16], (MaterialCardView) objArr[14]);
        this.C1 = -1L;
        this.n0.setTag(null);
        this.o0.setTag(null);
        this.p0.setTag(null);
        this.q0.setTag(null);
        this.r0.setTag(null);
        this.s0.setTag(null);
        this.u0.setTag(null);
        this.w0.setTag(null);
        this.x0.setTag(null);
        this.y0.setTag(null);
        this.z0.setTag(null);
        this.A0.setTag(null);
        this.B0.setTag(null);
        this.C0.setTag(null);
        this.D0.setTag(null);
        this.E0.setTag(null);
        this.F0.setTag(null);
        this.G0.setTag(null);
        this.H0.setTag(null);
        this.I0.setTag(null);
        this.J0.setTag(null);
        this.K0.setTag(null);
        this.L0.setTag(null);
        this.M0.setTag(null);
        ConstraintLayout constraintLayout = (ConstraintLayout) objArr[11];
        this.c1 = constraintLayout;
        constraintLayout.setTag(null);
        this.N0.setTag(null);
        this.O0.setTag(null);
        this.P0.setTag(null);
        this.Q0.setTag(null);
        m25693Z(this.R0);
        this.S0.setTag(null);
        this.T0.setTag(null);
        this.U0.setTag(null);
        this.V0.setTag(null);
        this.W0.setTag(null);
        this.X0.setTag(null);
        a0(view);
        this.d1 = new jbc(this, 11);
        this.e1 = new jbc(this, 23);
        this.f1 = new jbc(this, 24);
        this.g1 = new jbc(this, 12);
        this.h1 = new jbc(this, 16);
        this.i1 = new jbc(this, 5);
        this.j1 = new sbc(this, 9);
        this.k1 = new jbc(this, 21);
        this.l1 = new sbc(this, 22);
        this.m1 = new jbc(this, 10);
        this.n1 = new jbc(this, 15);
        this.o1 = new jbc(this, 3);
        this.p1 = new jbc(this, 7);
        this.q1 = new jbc(this, 19);
        this.r1 = new sbc(this, 4);
        this.s1 = new jbc(this, 20);
        this.t1 = new jbc(this, 8);
        this.u1 = new sbc(this, 13);
        this.v1 = new jbc(this, 25);
        this.w1 = new jbc(this, 1);
        this.x1 = new jbc(this, 17);
        this.y1 = new sbc(this, 2);
        this.z1 = new jbc(this, 14);
        this.A1 = new jbc(this, 18);
        this.B1 = new jbc(this, 6);
        mo16291G();
    }
}
