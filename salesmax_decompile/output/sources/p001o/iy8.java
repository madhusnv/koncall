package p001o;

import ai.salesmax.model.BusinessInfo;
import ai.salesmax.model.CallLogs;
import ai.salesmax.model.Leads;
import ai.salesmax.model.LeadsDeal;
import ai.salesmax.model.PaymentDetail;
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
import com.google.api.Service;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import lombok.javac.Javac;
import p001o.ewi;
import p001o.jbc;
import p001o.sbc;

/* loaded from: classes.dex */
public class iy8 extends hy8 implements jbc.InterfaceC14485a, sbc.InterfaceC16795a {
    public static final ewi.C13274i N1;
    public static final SparseIntArray O1;
    public final View.OnClickListener A1;
    public final View.OnClickListener B1;
    public final View.OnClickListener C1;
    public final View.OnClickListener D1;
    public final View.OnLongClickListener E1;
    public final View.OnClickListener F1;
    public final View.OnClickListener G1;
    public final View.OnClickListener H1;
    public final View.OnClickListener I1;
    public final View.OnClickListener J1;
    public final View.OnClickListener K1;
    public final View.OnClickListener L1;
    public long M1;
    public final ConstraintLayout i1;
    public final View.OnClickListener j1;
    public final View.OnClickListener k1;
    public final View.OnClickListener l1;
    public final View.OnClickListener m1;
    public final View.OnClickListener n1;
    public final View.OnLongClickListener o1;
    public final View.OnClickListener p1;
    public final View.OnLongClickListener q1;
    public final View.OnClickListener r1;
    public final View.OnClickListener s1;
    public final View.OnClickListener t1;
    public final View.OnLongClickListener u1;
    public final View.OnClickListener v1;
    public final View.OnLongClickListener w1;
    public final View.OnClickListener x1;
    public final View.OnClickListener y1;
    public final View.OnClickListener z1;

    static {
        ewi.C13274i c13274i = new ewi.C13274i(43);
        N1 = c13274i;
        c13274i.m25699a(18, new String[]{"content_recent_actions_linear"}, new int[]{40}, new int[]{p9e.content_recent_actions_linear});
        SparseIntArray sparseIntArray = new SparseIntArray();
        O1 = sparseIntArray;
        sparseIntArray.put(z8e.frame_container_ivContactProfilePicInLead, 41);
        sparseIntArray.put(z8e.callTimeBlock, 42);
    }

    public iy8(yt4 yt4Var, View view) {
        this(yt4Var, view, ewi.m25671L(yt4Var, view, 43, N1, O1));
    }

    @Override // p001o.ewi
    /* renamed from: E */
    public boolean mo16290E() {
        synchronized (this) {
            if (this.M1 != 0) {
                return true;
            }
            return this.V0.mo16290E();
        }
    }

    @Override // p001o.ewi
    /* renamed from: G */
    public void mo16291G() {
        synchronized (this) {
            this.M1 = 64L;
        }
        this.V0.mo16291G();
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
            Leads leads = this.e1;
            ck6 ck6Var = this.g1;
            Integer num = this.f1;
            if (ck6Var != null) {
                return ck6Var.mo707a(view, num.intValue(), leads);
            }
            return false;
        }
        if (i == 4) {
            Leads leads2 = this.e1;
            ck6 ck6Var2 = this.g1;
            Integer num2 = this.f1;
            if (ck6Var2 != null) {
                return ck6Var2.mo707a(view, num2.intValue(), leads2);
            }
            return false;
        }
        if (i == 7) {
            Leads leads3 = this.e1;
            ck6 ck6Var3 = this.g1;
            Integer num3 = this.f1;
            if (ck6Var3 != null) {
                return ck6Var3.mo707a(view, num3.intValue(), leads3);
            }
            return false;
        }
        if (i == 13) {
            ck6 ck6Var4 = this.g1;
            LeadsDeal leadsDeal = this.d1;
            Integer num4 = this.f1;
            if (ck6Var4 != null) {
                return ck6Var4.mo707a(view, num4.intValue(), leadsDeal);
            }
            return false;
        }
        if (i != 18) {
            return false;
        }
        ck6 ck6Var5 = this.g1;
        LeadsDeal leadsDeal2 = this.d1;
        Integer num5 = this.f1;
        if (ck6Var5 != null) {
            return ck6Var5.mo707a(view, num5.intValue(), leadsDeal2);
        }
        return false;
    }

    @Override // p001o.ewi
    public boolean b0(int i, Object obj) {
        if (61 == i) {
            k0((Leads) obj);
        } else if (33 == i) {
            j0((ck6) obj);
        } else if (7 == i) {
            i0((rog) obj);
        } else if (73 == i) {
            m0((Integer) obj);
        } else {
            if (67 != i) {
                return false;
            }
            l0((LeadsDeal) obj);
        }
        return true;
    }

    @Override // p001o.jbc.InterfaceC14485a
    /* renamed from: c */
    public final void mo16294c(int i, View view) {
        switch (i) {
            case 1:
                Leads leads = this.e1;
                ck6 ck6Var = this.g1;
                Integer num = this.f1;
                if (ck6Var != null) {
                    ck6Var.mo708b(view, num.intValue(), leads);
                    break;
                }
                break;
            case 3:
                Leads leads2 = this.e1;
                ck6 ck6Var2 = this.g1;
                Integer num2 = this.f1;
                if (ck6Var2 != null) {
                    ck6Var2.mo708b(view, num2.intValue(), leads2);
                    break;
                }
                break;
            case 5:
                ck6 ck6Var3 = this.g1;
                LeadsDeal leadsDeal = this.d1;
                Integer num3 = this.f1;
                if (ck6Var3 != null) {
                    ck6Var3.mo708b(view, num3.intValue(), leadsDeal);
                    break;
                }
                break;
            case 6:
                Leads leads3 = this.e1;
                ck6 ck6Var4 = this.g1;
                Integer num4 = this.f1;
                if (ck6Var4 != null) {
                    ck6Var4.mo708b(view, num4.intValue(), leads3);
                    break;
                }
                break;
            case 8:
                Leads leads4 = this.e1;
                ck6 ck6Var5 = this.g1;
                Integer num5 = this.f1;
                if (ck6Var5 != null) {
                    ck6Var5.mo708b(view, num5.intValue(), leads4);
                    break;
                }
                break;
            case 9:
                ck6 ck6Var6 = this.g1;
                LeadsDeal leadsDeal2 = this.d1;
                Integer num6 = this.f1;
                if (ck6Var6 != null) {
                    ck6Var6.mo708b(view, num6.intValue(), leadsDeal2);
                    break;
                }
                break;
            case 10:
                ck6 ck6Var7 = this.g1;
                LeadsDeal leadsDeal3 = this.d1;
                Integer num7 = this.f1;
                if (ck6Var7 != null) {
                    ck6Var7.mo708b(view, num7.intValue(), leadsDeal3);
                    break;
                }
                break;
            case 11:
                ck6 ck6Var8 = this.g1;
                LeadsDeal leadsDeal4 = this.d1;
                Integer num8 = this.f1;
                if (ck6Var8 != null) {
                    ck6Var8.mo708b(view, num8.intValue(), leadsDeal4);
                    break;
                }
                break;
            case 12:
                ck6 ck6Var9 = this.g1;
                LeadsDeal leadsDeal5 = this.d1;
                Integer num9 = this.f1;
                if (ck6Var9 != null) {
                    ck6Var9.mo708b(view, num9.intValue(), leadsDeal5);
                    break;
                }
                break;
            case 14:
                ck6 ck6Var10 = this.g1;
                LeadsDeal leadsDeal6 = this.d1;
                Integer num10 = this.f1;
                if (ck6Var10 != null) {
                    ck6Var10.mo708b(view, num10.intValue(), leadsDeal6);
                    break;
                }
                break;
            case 15:
                ck6 ck6Var11 = this.g1;
                LeadsDeal leadsDeal7 = this.d1;
                Integer num11 = this.f1;
                if (ck6Var11 != null) {
                    ck6Var11.mo708b(view, num11.intValue(), leadsDeal7);
                    break;
                }
                break;
            case 16:
                ck6 ck6Var12 = this.g1;
                LeadsDeal leadsDeal8 = this.d1;
                Integer num12 = this.f1;
                if (ck6Var12 != null) {
                    ck6Var12.mo708b(view, num12.intValue(), leadsDeal8);
                    break;
                }
                break;
            case 17:
                ck6 ck6Var13 = this.g1;
                LeadsDeal leadsDeal9 = this.d1;
                Integer num13 = this.f1;
                if (ck6Var13 != null) {
                    ck6Var13.mo708b(view, num13.intValue(), leadsDeal9);
                    break;
                }
                break;
            case 19:
                ck6 ck6Var14 = this.g1;
                LeadsDeal leadsDeal10 = this.d1;
                Integer num14 = this.f1;
                if (ck6Var14 != null) {
                    ck6Var14.mo708b(view, num14.intValue(), leadsDeal10);
                    break;
                }
                break;
            case 20:
                Leads leads5 = this.e1;
                ck6 ck6Var15 = this.g1;
                Integer num15 = this.f1;
                if (ck6Var15 != null) {
                    ck6Var15.mo708b(view, num15.intValue(), leads5);
                    break;
                }
                break;
            case 21:
                ck6 ck6Var16 = this.g1;
                LeadsDeal leadsDeal11 = this.d1;
                Integer num16 = this.f1;
                if (ck6Var16 != null) {
                    ck6Var16.mo708b(view, num16.intValue(), leadsDeal11);
                    break;
                }
                break;
            case 22:
                ck6 ck6Var17 = this.g1;
                LeadsDeal leadsDeal12 = this.d1;
                Integer num17 = this.f1;
                if (ck6Var17 != null) {
                    ck6Var17.mo708b(view, num17.intValue(), leadsDeal12);
                    break;
                }
                break;
            case 23:
                Leads leads6 = this.e1;
                ck6 ck6Var18 = this.g1;
                Integer num18 = this.f1;
                if (ck6Var18 != null) {
                    ck6Var18.mo708b(view, num18.intValue(), leads6);
                    break;
                }
                break;
            case 24:
                ck6 ck6Var19 = this.g1;
                LeadsDeal leadsDeal13 = this.d1;
                Integer num19 = this.f1;
                if (ck6Var19 != null) {
                    ck6Var19.mo708b(view, num19.intValue(), leadsDeal13);
                    break;
                }
                break;
            case 25:
                Leads leads7 = this.e1;
                ck6 ck6Var20 = this.g1;
                Integer num20 = this.f1;
                if (ck6Var20 != null) {
                    ck6Var20.mo708b(view, num20.intValue(), leads7);
                    break;
                }
                break;
            case 26:
                Leads leads8 = this.e1;
                ck6 ck6Var21 = this.g1;
                Integer num21 = this.f1;
                if (ck6Var21 != null) {
                    ck6Var21.mo708b(view, num21.intValue(), leads8);
                    break;
                }
                break;
            case 27:
                Leads leads9 = this.e1;
                ck6 ck6Var22 = this.g1;
                Integer num22 = this.f1;
                if (ck6Var22 != null) {
                    ck6Var22.mo708b(view, num22.intValue(), leads9);
                    break;
                }
                break;
            case Service.MONITORING_FIELD_NUMBER /* 28 */:
                Leads leads10 = this.e1;
                ck6 ck6Var23 = this.g1;
                Integer num23 = this.f1;
                if (ck6Var23 != null) {
                    ck6Var23.mo708b(view, num23.intValue(), leads10);
                    break;
                }
                break;
            case Service.SYSTEM_PARAMETERS_FIELD_NUMBER /* 29 */:
                Leads leads11 = this.e1;
                ck6 ck6Var24 = this.g1;
                Integer num24 = this.f1;
                if (ck6Var24 != null) {
                    ck6Var24.mo708b(view, num24.intValue(), leads11);
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
            this.M1 |= 1;
        }
        return true;
    }

    public void i0(rog rogVar) {
        this.h1 = rogVar;
        synchronized (this) {
            this.M1 |= 8;
        }
        m28509h(7);
        super.m25692R();
    }

    public void j0(ck6 ck6Var) {
        this.g1 = ck6Var;
        synchronized (this) {
            this.M1 |= 4;
        }
        m28509h(33);
        super.m25692R();
    }

    public void k0(Leads leads) {
        this.e1 = leads;
        synchronized (this) {
            this.M1 |= 2;
        }
        m28509h(61);
        super.m25692R();
    }

    public void l0(LeadsDeal leadsDeal) {
        this.d1 = leadsDeal;
        synchronized (this) {
            this.M1 |= 32;
        }
        m28509h(67);
        super.m25692R();
    }

    public void m0(Integer num) {
        this.f1 = num;
        synchronized (this) {
            this.M1 |= 16;
        }
        m28509h(73);
        super.m25692R();
    }

    /* JADX WARN: Removed duplicated region for block: B:131:0x0274  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x0283  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x0290  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x02a6  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x02b0  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x02c1  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x02c9  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x02d9  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x02e1  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x02f0  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x02ff  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x0309  */
    /* JADX WARN: Removed duplicated region for block: B:188:0x0317  */
    /* JADX WARN: Removed duplicated region for block: B:191:0x031f  */
    /* JADX WARN: Removed duplicated region for block: B:199:0x0332  */
    /* JADX WARN: Removed duplicated region for block: B:202:0x033c  */
    /* JADX WARN: Removed duplicated region for block: B:213:0x0354 A[PHI: r2
      0x0354: PHI (r2v8 long) = (r2v7 long), (r2v38 long) binds: [B:201:0x033a, B:210:0x034e] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:216:0x035c  */
    /* JADX WARN: Removed duplicated region for block: B:224:0x0373  */
    /* JADX WARN: Removed duplicated region for block: B:227:0x0380  */
    /* JADX WARN: Removed duplicated region for block: B:237:0x03b9 A[PHI: r2 r40
      0x03b9: PHI (r2v11 long) = (r2v10 long), (r2v28 long) binds: [B:226:0x037e, B:235:0x03b4] A[DONT_GENERATE, DONT_INLINE]
      0x03b9: PHI (r40v2 boolean) = (r40v1 boolean), (r40v4 boolean) binds: [B:226:0x037e, B:235:0x03b4] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:240:0x03c1  */
    /* JADX WARN: Removed duplicated region for block: B:252:0x03e7  */
    /* JADX WARN: Removed duplicated region for block: B:255:0x03f1  */
    /* JADX WARN: Removed duplicated region for block: B:266:0x0408 A[PHI: r2
      0x0408: PHI (r2v14 long) = (r2v13 long), (r2v24 long) binds: [B:254:0x03ef, B:263:0x0403] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:271:0x0417  */
    /* JADX WARN: Removed duplicated region for block: B:276:0x0424  */
    /* JADX WARN: Removed duplicated region for block: B:279:0x042e  */
    /* JADX WARN: Removed duplicated region for block: B:290:0x0445  */
    /* JADX WARN: Removed duplicated region for block: B:296:0x045a  */
    /* JADX WARN: Removed duplicated region for block: B:299:0x0464  */
    /* JADX WARN: Removed duplicated region for block: B:311:0x0484  */
    /* JADX WARN: Removed duplicated region for block: B:314:0x0490  */
    /* JADX WARN: Removed duplicated region for block: B:317:0x052f  */
    /* JADX WARN: Removed duplicated region for block: B:320:0x0602  */
    /* JADX WARN: Removed duplicated region for block: B:323:0x063d  */
    /* JADX WARN: Removed duplicated region for block: B:326:0x0649  */
    /* JADX WARN: Removed duplicated region for block: B:329:0x0655  */
    /* JADX WARN: Removed duplicated region for block: B:332:0x0660  */
    @Override // p001o.ewi
    /* renamed from: p */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void mo16295p() throws Resources.NotFoundException, NumberFormatException {
        long j;
        String str;
        PaymentDetail paymentDetail;
        String str2;
        BusinessInfo addedBusiness;
        Integer num;
        String str3;
        Date date;
        String str4;
        String str5;
        int i;
        boolean showSelection;
        boolean z;
        int i2;
        int i3;
        boolean z2;
        int i4;
        int i5;
        boolean z3;
        long dealStageUpdated;
        String lastActivity;
        String str6;
        List<RecentAction> list;
        boolean z4;
        int i6;
        int i7;
        String website;
        boolean z5;
        long j2;
        boolean z6;
        long j3;
        long j4;
        boolean z7;
        boolean z8;
        long j5;
        long j6;
        int i8;
        long j7;
        boolean z9;
        long j8;
        boolean z10;
        int i9;
        long j9;
        int i10;
        long j10;
        ArrayList<CallLogs> arrayList;
        long j11;
        int i11;
        int i12;
        String stage;
        List<RecentAction> recentEngagements;
        int i13;
        int i14;
        boolean zIsCloudTelephonyEnabled;
        PaymentDetail paymentRequestDetail;
        String contactOwner;
        VideoMeeting openVideoCallDetail;
        Date nextProspectingDueOn;
        Integer unsuccessfulCallAttempts;
        boolean showBottom;
        boolean zIsNewItem;
        boolean zIsSelected;
        String paymentProvider;
        String createdAt;
        synchronized (this) {
            j = this.M1;
            this.M1 = 0L;
        }
        Leads leads = this.e1;
        ck6 ck6Var = this.g1;
        rog rogVar = this.h1;
        Integer num2 = this.f1;
        LeadsDeal leadsDeal = this.d1;
        long j12 = j & 66;
        if (j12 != 0) {
            if (leads != null) {
                paymentRequestDetail = leads.getPaymentRequestDetail();
                contactOwner = leads.getContactOwner();
                showBottom = leads.getShowBottom();
                zIsNewItem = leads.isNewItem();
                addedBusiness = leads.getAddedBusiness();
                showSelection = leads.getShowSelection();
                openVideoCallDetail = leads.getOpenVideoCallDetail();
                zIsSelected = leads.isSelected();
                nextProspectingDueOn = leads.getNextProspectingDueOn();
                unsuccessfulCallAttempts = leads.getUnsuccessfulCallAttempts();
            } else {
                paymentRequestDetail = null;
                contactOwner = null;
                addedBusiness = null;
                openVideoCallDetail = null;
                nextProspectingDueOn = null;
                unsuccessfulCallAttempts = null;
                showBottom = false;
                zIsNewItem = false;
                showSelection = false;
                zIsSelected = false;
            }
            if (j12 != 0) {
                j |= showBottom ? 274877906944L : 137438953472L;
            }
            if ((j & 66) != 0) {
                j |= zIsNewItem ? MediaStatus.COMMAND_STREAM_TRANSFER : MediaStatus.COMMAND_UNFOLLOW;
            }
            if ((j & 66) != 0) {
                j = showSelection ? j | MediaStatus.COMMAND_FOLLOW | 67108864 | 68719476736L | 70368744177664L : j | MediaStatus.COMMAND_DISLIKE | 33554432 | 34359738368L | 35184372088832L;
            }
            boolean z11 = paymentRequestDetail == null;
            int i15 = showBottom ? 0 : 8;
            int i16 = zIsNewItem ? 0 : 8;
            z = addedBusiness != null;
            int i17 = showSelection ? 0 : 8;
            int i18 = showSelection ? 8 : 0;
            StringBuilder sb = new StringBuilder();
            sb.append("(");
            Integer num3 = unsuccessfulCallAttempts;
            sb.append(num3);
            String string = sb.toString();
            if ((j & 66) != 0) {
                j |= z11 ? Javac.GENERATED_MEMBER : 8388608L;
            }
            if ((j & 66) != 0) {
                j = z ? j | 17179869184L : j | 8589934592L;
            }
            if (paymentRequestDetail != null) {
                paymentProvider = paymentRequestDetail.getPaymentProvider();
                createdAt = paymentRequestDetail.getCreatedAt();
            } else {
                paymentProvider = null;
                createdAt = null;
            }
            String dueDate = openVideoCallDetail != null ? openVideoCallDetail.getDueDate() : null;
            i = z11 ? 8 : 0;
            str = string + ")";
            str2 = contactOwner;
            i2 = i15;
            i3 = i16;
            str3 = dueDate;
            z2 = zIsSelected;
            date = nextProspectingDueOn;
            str4 = paymentProvider;
            i4 = i17;
            i5 = i18;
            str5 = createdAt;
            num = num3;
            paymentDetail = paymentRequestDetail;
        } else {
            str = null;
            paymentDetail = null;
            str2 = null;
            addedBusiness = null;
            num = null;
            str3 = null;
            date = null;
            str4 = null;
            str5 = null;
            i = 0;
            showSelection = false;
            z = false;
            i2 = 0;
            i3 = 0;
            z2 = false;
            i4 = 0;
            i5 = 0;
        }
        long j13 = j & 74;
        if (j13 != 0) {
            z3 = rogVar != null;
            if (j13 != 0) {
                j = z3 ? j | 4194304 : j | 2097152;
            }
        } else {
            z3 = false;
        }
        if ((j & 98) != 0) {
            long j14 = j & 96;
            if (j14 != 0) {
                if (leadsDeal != null) {
                    stage = leadsDeal.getStage();
                    zIsCloudTelephonyEnabled = leadsDeal.isCloudTelephonyEnabled();
                    dealStageUpdated = leadsDeal.getDealStageUpdated();
                    recentEngagements = leadsDeal.getRecentEngagements();
                } else {
                    dealStageUpdated = 0;
                    stage = null;
                    recentEngagements = null;
                    zIsCloudTelephonyEnabled = false;
                }
                if (j14 != 0) {
                    j |= zIsCloudTelephonyEnabled ? 256L : 128L;
                }
                i13 = zIsCloudTelephonyEnabled ? 0 : 8;
                boolean zIsEmpty = recentEngagements != null ? recentEngagements.isEmpty() : false;
                if ((j & 96) != 0) {
                    j |= zIsEmpty ? 1125899906842624L : 562949953421312L;
                }
                i14 = zIsEmpty ? 8 : 0;
            } else {
                dealStageUpdated = 0;
                stage = null;
                recentEngagements = null;
                i13 = 0;
                i14 = 0;
            }
            lastActivity = leadsDeal != null ? leadsDeal.getLastActivity() : null;
            z4 = lastActivity == null;
            if ((j & 98) != 0) {
                j = z4 ? j | 281474976710656L : j | 140737488355328L;
            }
            i6 = i13;
            str6 = stage;
            i7 = i14;
            list = recentEngagements;
        } else {
            dealStageUpdated = 0;
            lastActivity = null;
            str6 = null;
            list = null;
            z4 = false;
            i6 = 0;
            i7 = 0;
        }
        if ((j & 17179869184L) != 0) {
            website = addedBusiness != null ? addedBusiness.getWebsite() : null;
            if (website != null) {
                z5 = true;
            }
            boolean zM47035a = ((j & 4194304) != 0 || rogVar == null) ? false : rogVar.m47035a();
            boolean zIsEmpty2 = ((j & 140737488355328L) != 0 || lastActivity == null) ? false : lastActivity.isEmpty();
            j2 = j & 74;
            if (j2 == 0) {
                if (!z3) {
                    zM47035a = false;
                }
                z6 = !zM47035a;
                if (j2 != 0) {
                    j = z6 ? j | 1099511627776L : j | 549755813888L;
                }
            } else {
                z6 = false;
            }
            j3 = j & 66;
            if (j3 == 0) {
                if (!z) {
                    z5 = false;
                }
                if (j3 != 0) {
                    j = z5 ? j | MediaStatus.COMMAND_EDIT_TRACKS : j | MediaStatus.COMMAND_QUEUE_REPEAT_ONE;
                }
            } else {
                z5 = false;
            }
            j4 = j & 98;
            if (j4 == 0) {
                if (z4) {
                    zIsEmpty2 = true;
                }
                if (j4 != 0) {
                    j |= zIsEmpty2 ? MediaStatus.COMMAND_QUEUE_REPEAT_ALL : 512L;
                }
            } else {
                zIsEmpty2 = false;
            }
            if ((j & MediaStatus.COMMAND_EDIT_TRACKS) == 0) {
                z7 = false;
            } else {
                if (addedBusiness != null) {
                    website = addedBusiness.getWebsite();
                }
                if (website != "") {
                    z7 = true;
                }
            }
            boolean zHasContactOwner = ((j & 1099511627776L) != 0 || leads == null) ? false : leads.hasContactOwner();
            if ((j & MediaStatus.COMMAND_QUEUE_REPEAT_ALL) == 0) {
                z8 = false;
            } else {
                if ((leadsDeal != null ? leadsDeal.getDealLostReason() : null) == null) {
                    z8 = true;
                }
            }
            j5 = j & 98;
            if (j5 == 0) {
                if (!zIsEmpty2) {
                    z8 = false;
                }
                if (j5 != 0) {
                    j |= z8 ? 1048576L : 524288L;
                }
            } else {
                z8 = false;
            }
            j6 = j & 66;
            if (j6 == 0) {
                i8 = 0;
            } else {
                if (!z5) {
                    z7 = false;
                }
                if (j6 != 0) {
                    j |= z7 ? 268435456L : 134217728L;
                }
                if (!z7) {
                    i8 = 8;
                }
            }
            j7 = j & 74;
            if (j7 == 0) {
                if (!z6) {
                    zHasContactOwner = false;
                }
                if (j7 != 0) {
                    j |= zHasContactOwner ? 4398046511104L : 2199023255552L;
                }
            } else {
                zHasContactOwner = false;
            }
            if ((j & 4398047035392L) == 0) {
                z9 = false;
            } else {
                if (leads != null) {
                    showSelection = leads.getShowSelection();
                }
                if ((j & 66) != 0) {
                    j = showSelection ? j | MediaStatus.COMMAND_FOLLOW | 67108864 | 68719476736L | 70368744177664L : j | MediaStatus.COMMAND_DISLIKE | 33554432 | 34359738368L | 35184372088832L;
                }
                if ((j & 4398046511104L) != 0) {
                    z9 = !showSelection;
                }
            }
            j8 = j & 98;
            if (j8 == 0) {
                boolean z12 = z8 ? true : showSelection;
                if (j8 != 0) {
                    j |= z12 ? 4294967296L : 2147483648L;
                }
                int i19 = z12 ? 8 : 0;
                z10 = z9;
                i9 = i19;
            } else {
                z10 = z9;
                i9 = 0;
            }
            j9 = j & 74;
            if (j9 == 0) {
                i10 = 0;
            } else {
                if (!zHasContactOwner) {
                    z10 = false;
                }
                if (j9 != 0) {
                    j |= z10 ? 1073741824L : 536870912L;
                }
                if (!z10) {
                    i10 = 4;
                }
            }
            ArrayList<CallLogs> callHistory = ((j & 35184372088832L) != 0 || leads == null) ? null : leads.getCallHistory();
            boolean z13 = (j & 33554432) == 0 && num == null;
            j10 = j & 66;
            if (j10 == 0) {
                if (showSelection) {
                    z13 = true;
                }
                ArrayList<CallLogs> arrayList2 = showSelection ? null : callHistory;
                if (j10 != 0) {
                    j |= z13 ? MediaStatus.COMMAND_LIKE : MediaStatus.COMMAND_PLAYBACK_RATE;
                }
                arrayList = arrayList2;
            } else {
                arrayList = null;
                z13 = false;
            }
            boolean z14 = (j & MediaStatus.COMMAND_PLAYBACK_RATE) == 0 && ewi.m25674U(num) == 0;
            j11 = j & 66;
            if (j11 == 0) {
                boolean z15 = z13 ? true : z14;
                if (j11 != 0) {
                    j |= z15 ? 17592186044416L : 8796093022208L;
                }
                i11 = i9;
                i12 = z15 ? 8 : 0;
            } else {
                i11 = i9;
                i12 = 0;
            }
            if ((j & 66) != 0) {
                this.n0.setVisibility(i2);
                this.o0.setVisibility(i3);
                this.r0.setVisibility(i12);
                fjh.m26938c(this.r0, str);
                int i20 = i5;
                this.s0.setVisibility(i20);
                ArrayList<CallLogs> arrayList3 = arrayList;
                nr1.u2(this.s0, arrayList3);
                this.u0.setVisibility(i20);
                nr1.v2(this.u0, arrayList3);
                this.x0.setVisibility(i8);
                np3.m40895a(this.y0, z2);
                this.y0.setVisibility(i4);
                nr1.N0(this.A0, leads);
                nr1.X0(this.B0, leads);
                nr1.H1(this.C0, str4);
                nr1.m40944O(this.M0, leads);
                nr1.g1(this.M0, str2);
                nr1.s1(this.Q0, date);
                nr1.u1(this.R0, paymentDetail);
                nr1.O2(this.S0, leads);
                this.T0.setVisibility(i);
                nr1.m0(this.T0, str5);
                nr1.d1(this.W0, leads);
                nr1.Z0(this.X0, leads);
                fu5.m27486a(this.Y0, leads);
                nr1.l0(this.b1, str3);
                nr1.P2(this.c1, leads);
            }
            if ((64 & j) != 0) {
                this.p0.setOnClickListener(this.s1);
                this.q0.setOnClickListener(this.x1);
                this.v0.setOnClickListener(this.F1);
                this.y0.setOnClickListener(this.j1);
                this.z0.setOnClickListener(this.r1);
                this.z0.setOnLongClickListener(this.w1);
                this.B0.setOnClickListener(this.l1);
                this.B0.setOnLongClickListener(this.o1);
                this.C0.setOnClickListener(this.B1);
                this.C0.setOnLongClickListener(this.q1);
                this.D0.setOnClickListener(this.z1);
                this.D0.setOnLongClickListener(this.E1);
                this.E0.setOnClickListener(this.D1);
                this.F0.setOnClickListener(this.k1);
                this.G0.setOnClickListener(this.p1);
                this.H0.setOnClickListener(this.H1);
                this.I0.setOnClickListener(this.C1);
                this.J0.setOnClickListener(this.y1);
                this.L0.setOnClickListener(this.t1);
                this.M0.setOnClickListener(this.I1);
                this.M0.setOnLongClickListener(this.u1);
                this.N0.setOnClickListener(this.J1);
                this.O0.setOnClickListener(this.A1);
                this.P0.setOnClickListener(this.L1);
                this.Q0.setOnClickListener(this.G1);
                this.S0.setOnClickListener(this.m1);
                this.T0.setOnClickListener(this.v1);
                this.U0.setOnClickListener(this.n1);
                this.c1.setOnClickListener(this.K1);
            }
            if ((j & 96) != 0) {
                nr1.E2(this.v0, leadsDeal);
                this.G0.setVisibility(i6);
                nr1.K0(this.K0, Long.valueOf(dealStageUpdated));
                this.V0.m25689B().setVisibility(i7);
                this.V0.i0(list);
                nr1.p0(this.Z0, leadsDeal);
                nr1.j1(this.a1, str6);
            }
            if ((j & 74) != 0) {
                this.M0.setVisibility(i10);
            }
            if ((68 & j) != 0) {
                this.V0.h0(ck6Var);
            }
            if ((80 & j) != 0) {
                this.V0.j0(num2);
            }
            if ((j & 98) != 0) {
                this.Z0.setVisibility(i11);
            }
            ewi.m25683r(this.V0);
        }
        website = null;
        z5 = false;
        if ((j & 4194304) != 0) {
        }
        if ((j & 140737488355328L) != 0) {
        }
        j2 = j & 74;
        if (j2 == 0) {
        }
        j3 = j & 66;
        if (j3 == 0) {
        }
        j4 = j & 98;
        if (j4 == 0) {
        }
        if ((j & MediaStatus.COMMAND_EDIT_TRACKS) == 0) {
        }
        if ((j & 1099511627776L) != 0) {
        }
        if ((j & MediaStatus.COMMAND_QUEUE_REPEAT_ALL) == 0) {
        }
        j5 = j & 98;
        if (j5 == 0) {
        }
        j6 = j & 66;
        if (j6 == 0) {
        }
        j7 = j & 74;
        if (j7 == 0) {
        }
        if ((j & 4398047035392L) == 0) {
        }
        j8 = j & 98;
        if (j8 == 0) {
        }
        j9 = j & 74;
        if (j9 == 0) {
        }
        if ((j & 35184372088832L) != 0) {
        }
        if ((j & 33554432) == 0) {
        }
        j10 = j & 66;
        if (j10 == 0) {
        }
        if ((j & MediaStatus.COMMAND_PLAYBACK_RATE) == 0) {
        }
        j11 = j & 66;
        if (j11 == 0) {
        }
        if ((j & 66) != 0) {
        }
        if ((64 & j) != 0) {
        }
        if ((j & 96) != 0) {
        }
        if ((j & 74) != 0) {
        }
        if ((68 & j) != 0) {
        }
        if ((80 & j) != 0) {
        }
        if ((j & 98) != 0) {
        }
        ewi.m25683r(this.V0);
    }

    public iy8(yt4 yt4Var, View view, Object[] objArr) {
        super(yt4Var, view, 1, (HorizontalScrollView) objArr[29], (TextView) objArr[3], (Button) objArr[23], (Button) objArr[24], (MaterialTextView) objArr[14], (MaterialTextView) objArr[15], (LinearLayout) objArr[42], (ShapeableImageView) objArr[13], (MaterialTextView) objArr[10], (FrameLayout) objArr[41], (ShapeableImageView) objArr[7], (CheckBox) objArr[16], (MaterialCardView) objArr[0], (ShapeableImageView) objArr[5], (ShapeableImageView) objArr[2], (ShapeableImageView) objArr[26], (ShapeableImageView) objArr[21], (MaterialButton) objArr[35], (MaterialButton) objArr[30], (MaterialButton) objArr[31], (MaterialButton) objArr[32], (MaterialButton) objArr[39], (MaterialButton) objArr[38], (MaterialTextView) objArr[4], (MaterialButton) objArr[36], (Chip) objArr[12], (MaterialButton) objArr[37], (MaterialButton) objArr[34], (MaterialButton) objArr[33], (MaterialTextView) objArr[19], (MaterialTextView) objArr[27], (MaterialCardView) objArr[25], (MaterialTextView) objArr[28], (MaterialCardView) objArr[17], (r44) objArr[40], (MaterialTextView) objArr[6], (MaterialTextView) objArr[8], (MaterialTextView) objArr[1], (MaterialTextView) objArr[11], (MaterialTextView) objArr[9], (MaterialTextView) objArr[22], (MaterialCardView) objArr[20]);
        this.M1 = -1L;
        this.n0.setTag(null);
        this.o0.setTag(null);
        this.p0.setTag(null);
        this.q0.setTag(null);
        this.r0.setTag(null);
        this.s0.setTag(null);
        this.u0.setTag(null);
        this.v0.setTag(null);
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
        this.N0.setTag(null);
        this.O0.setTag(null);
        this.P0.setTag(null);
        ConstraintLayout constraintLayout = (ConstraintLayout) objArr[18];
        this.i1 = constraintLayout;
        constraintLayout.setTag(null);
        this.Q0.setTag(null);
        this.R0.setTag(null);
        this.S0.setTag(null);
        this.T0.setTag(null);
        this.U0.setTag(null);
        m25693Z(this.V0);
        this.W0.setTag(null);
        this.X0.setTag(null);
        this.Y0.setTag(null);
        this.Z0.setTag(null);
        this.a1.setTag(null);
        this.b1.setTag(null);
        this.c1.setTag(null);
        a0(view);
        this.j1 = new jbc(this, 8);
        this.k1 = new jbc(this, 20);
        this.l1 = new jbc(this, 3);
        this.m1 = new jbc(this, 16);
        this.n1 = new jbc(this, 9);
        this.o1 = new sbc(this, 4);
        this.p1 = new jbc(this, 21);
        this.q1 = new sbc(this, 18);
        this.r1 = new jbc(this, 1);
        this.s1 = new jbc(this, 14);
        this.t1 = new jbc(this, 26);
        this.u1 = new sbc(this, 7);
        this.v1 = new jbc(this, 19);
        this.w1 = new sbc(this, 2);
        this.x1 = new jbc(this, 15);
        this.y1 = new jbc(this, 28);
        this.z1 = new jbc(this, 12);
        this.A1 = new jbc(this, 24);
        this.B1 = new jbc(this, 17);
        this.C1 = new jbc(this, 29);
        this.D1 = new jbc(this, 25);
        this.E1 = new sbc(this, 13);
        this.F1 = new jbc(this, 5);
        this.G1 = new jbc(this, 10);
        this.H1 = new jbc(this, 22);
        this.I1 = new jbc(this, 6);
        this.J1 = new jbc(this, 27);
        this.K1 = new jbc(this, 11);
        this.L1 = new jbc(this, 23);
        mo16291G();
    }
}
