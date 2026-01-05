package p001o;

import ai.salesmax.model.BusinessInfo;
import ai.salesmax.model.CallLogs;
import ai.salesmax.model.Leads;
import ai.salesmax.model.PaymentDetail;
import ai.salesmax.model.RecentAction;
import ai.salesmax.model.VideoMeeting;
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
import java.util.List;
import lombok.javac.Javac;
import p001o.ewi;
import p001o.jbc;
import p001o.sbc;

/* loaded from: classes.dex */
public class yz8 extends xz8 implements jbc.InterfaceC14485a, sbc.InterfaceC16795a {
    public static final ewi.C13274i J1;
    public static final SparseIntArray K1;
    public final View.OnLongClickListener A1;
    public final View.OnClickListener B1;
    public final View.OnLongClickListener C1;
    public final View.OnLongClickListener D1;
    public final View.OnClickListener E1;
    public final View.OnClickListener F1;
    public final View.OnClickListener G1;
    public final View.OnClickListener H1;
    public long I1;
    public final ConstraintLayout f1;
    public final View.OnClickListener g1;
    public final View.OnClickListener h1;
    public final View.OnLongClickListener i1;
    public final View.OnClickListener j1;
    public final View.OnClickListener k1;
    public final View.OnClickListener l1;
    public final View.OnClickListener m1;
    public final View.OnClickListener n1;
    public final View.OnClickListener o1;
    public final View.OnClickListener p1;
    public final View.OnClickListener q1;
    public final View.OnClickListener r1;
    public final View.OnClickListener s1;
    public final View.OnClickListener t1;
    public final View.OnLongClickListener u1;
    public final View.OnClickListener v1;
    public final View.OnClickListener w1;
    public final View.OnClickListener x1;
    public final View.OnLongClickListener y1;
    public final View.OnClickListener z1;

    static {
        ewi.C13274i c13274i = new ewi.C13274i(41);
        J1 = c13274i;
        c13274i.m25699a(10, new String[]{"content_recent_actions_linear"}, new int[]{38}, new int[]{p9e.content_recent_actions_linear});
        SparseIntArray sparseIntArray = new SparseIntArray();
        K1 = sparseIntArray;
        sparseIntArray.put(z8e.frame_container_ivContactProfilePicInLead, 39);
        sparseIntArray.put(z8e.callTimeBlock, 40);
    }

    public yz8(yt4 yt4Var, View view) {
        this(yt4Var, view, ewi.m25671L(yt4Var, view, 41, J1, K1));
    }

    @Override // p001o.ewi
    /* renamed from: E */
    public boolean mo16290E() {
        synchronized (this) {
            if (this.I1 != 0) {
                return true;
            }
            return this.U0.mo16290E();
        }
    }

    @Override // p001o.ewi
    /* renamed from: G */
    public void mo16291G() {
        synchronized (this) {
            this.I1 = 32L;
        }
        this.U0.mo16291G();
        m25692R();
    }

    @Override // p001o.ewi
    /* renamed from: M */
    public boolean mo16292M(int i, Object obj, int i2) {
        if (i != 0) {
            return false;
        }
        return i0((r44) obj, i2);
    }

    @Override // p001o.sbc.InterfaceC16795a
    /* renamed from: a */
    public final boolean mo16293a(int i, View view) {
        if (i == 2) {
            ck6 ck6Var = this.d1;
            Leads leads = this.b1;
            Integer num = this.c1;
            if (ck6Var != null) {
                return ck6Var.mo707a(view, num.intValue(), leads);
            }
            return false;
        }
        if (i == 4) {
            ck6 ck6Var2 = this.d1;
            Leads leads2 = this.b1;
            Integer num2 = this.c1;
            if (ck6Var2 != null) {
                return ck6Var2.mo707a(view, num2.intValue(), leads2);
            }
            return false;
        }
        if (i == 7) {
            ck6 ck6Var3 = this.d1;
            Leads leads3 = this.b1;
            Integer num3 = this.c1;
            if (ck6Var3 != null) {
                return ck6Var3.mo707a(view, num3.intValue(), leads3);
            }
            return false;
        }
        if (i == 11) {
            ck6 ck6Var4 = this.d1;
            Leads leads4 = this.b1;
            Integer num4 = this.c1;
            if (ck6Var4 != null) {
                return ck6Var4.mo707a(view, num4.intValue(), leads4);
            }
            return false;
        }
        if (i == 16) {
            ck6 ck6Var5 = this.d1;
            Leads leads5 = this.b1;
            Integer num5 = this.c1;
            if (ck6Var5 != null) {
                return ck6Var5.mo707a(view, num5.intValue(), leads5);
            }
            return false;
        }
        if (i != 25) {
            return false;
        }
        ck6 ck6Var6 = this.d1;
        Leads leads6 = this.b1;
        Integer num6 = this.c1;
        if (ck6Var6 != null) {
            return ck6Var6.mo707a(view, num6.intValue(), leads6);
        }
        return false;
    }

    @Override // p001o.ewi
    public boolean b0(int i, Object obj) {
        if (33 == i) {
            k0((ck6) obj);
        } else if (7 == i) {
            j0((rog) obj);
        } else if (73 == i) {
            l0((Integer) obj);
        } else {
            if (67 != i) {
                return false;
            }
            h0((Leads) obj);
        }
        return true;
    }

    @Override // p001o.jbc.InterfaceC14485a
    /* renamed from: c */
    public final void mo16294c(int i, View view) {
        switch (i) {
            case 1:
                ck6 ck6Var = this.d1;
                Leads leads = this.b1;
                Integer num = this.c1;
                if (ck6Var != null) {
                    ck6Var.mo708b(view, num.intValue(), leads);
                    break;
                }
                break;
            case 3:
                ck6 ck6Var2 = this.d1;
                Leads leads2 = this.b1;
                Integer num2 = this.c1;
                if (ck6Var2 != null) {
                    ck6Var2.mo708b(view, num2.intValue(), leads2);
                    break;
                }
                break;
            case 5:
                ck6 ck6Var3 = this.d1;
                Leads leads3 = this.b1;
                Integer num3 = this.c1;
                if (ck6Var3 != null) {
                    ck6Var3.mo708b(view, num3.intValue(), leads3);
                    break;
                }
                break;
            case 6:
                ck6 ck6Var4 = this.d1;
                Leads leads4 = this.b1;
                Integer num4 = this.c1;
                if (ck6Var4 != null) {
                    ck6Var4.mo708b(view, num4.intValue(), leads4);
                    break;
                }
                break;
            case 8:
                ck6 ck6Var5 = this.d1;
                Leads leads5 = this.b1;
                Integer num5 = this.c1;
                if (ck6Var5 != null) {
                    ck6Var5.mo708b(view, num5.intValue(), leads5);
                    break;
                }
                break;
            case 9:
                ck6 ck6Var6 = this.d1;
                Leads leads6 = this.b1;
                Integer num6 = this.c1;
                if (ck6Var6 != null) {
                    ck6Var6.mo708b(view, num6.intValue(), leads6);
                    break;
                }
                break;
            case 10:
                ck6 ck6Var7 = this.d1;
                Leads leads7 = this.b1;
                Integer num7 = this.c1;
                if (ck6Var7 != null) {
                    ck6Var7.mo708b(view, num7.intValue(), leads7);
                    break;
                }
                break;
            case 12:
                ck6 ck6Var8 = this.d1;
                Leads leads8 = this.b1;
                Integer num8 = this.c1;
                if (ck6Var8 != null) {
                    ck6Var8.mo708b(view, num8.intValue(), leads8);
                    break;
                }
                break;
            case 13:
                ck6 ck6Var9 = this.d1;
                Leads leads9 = this.b1;
                Integer num9 = this.c1;
                if (ck6Var9 != null) {
                    ck6Var9.mo708b(view, num9.intValue(), leads9);
                    break;
                }
                break;
            case 14:
                ck6 ck6Var10 = this.d1;
                Leads leads10 = this.b1;
                Integer num10 = this.c1;
                if (ck6Var10 != null) {
                    ck6Var10.mo708b(view, num10.intValue(), leads10);
                    break;
                }
                break;
            case 15:
                ck6 ck6Var11 = this.d1;
                Leads leads11 = this.b1;
                Integer num11 = this.c1;
                if (ck6Var11 != null) {
                    ck6Var11.mo708b(view, num11.intValue(), leads11);
                    break;
                }
                break;
            case 17:
                ck6 ck6Var12 = this.d1;
                Leads leads12 = this.b1;
                Integer num12 = this.c1;
                if (ck6Var12 != null) {
                    ck6Var12.mo708b(view, num12.intValue(), leads12);
                    break;
                }
                break;
            case 18:
                ck6 ck6Var13 = this.d1;
                Leads leads13 = this.b1;
                Integer num13 = this.c1;
                if (ck6Var13 != null) {
                    ck6Var13.mo708b(view, num13.intValue(), leads13);
                    break;
                }
                break;
            case 19:
                ck6 ck6Var14 = this.d1;
                Leads leads14 = this.b1;
                Integer num14 = this.c1;
                if (ck6Var14 != null) {
                    ck6Var14.mo708b(view, num14.intValue(), leads14);
                    break;
                }
                break;
            case 20:
                ck6 ck6Var15 = this.d1;
                Leads leads15 = this.b1;
                Integer num15 = this.c1;
                if (ck6Var15 != null) {
                    ck6Var15.mo708b(view, num15.intValue(), leads15);
                    break;
                }
                break;
            case 21:
                ck6 ck6Var16 = this.d1;
                Leads leads16 = this.b1;
                Integer num16 = this.c1;
                if (ck6Var16 != null) {
                    ck6Var16.mo708b(view, num16.intValue(), leads16);
                    break;
                }
                break;
            case 22:
                ck6 ck6Var17 = this.d1;
                Leads leads17 = this.b1;
                Integer num17 = this.c1;
                if (ck6Var17 != null) {
                    ck6Var17.mo708b(view, num17.intValue(), leads17);
                    break;
                }
                break;
            case 23:
                ck6 ck6Var18 = this.d1;
                Leads leads18 = this.b1;
                Integer num18 = this.c1;
                if (ck6Var18 != null) {
                    ck6Var18.mo708b(view, num18.intValue(), leads18);
                    break;
                }
                break;
            case 24:
                ck6 ck6Var19 = this.d1;
                Leads leads19 = this.b1;
                Integer num19 = this.c1;
                if (ck6Var19 != null) {
                    ck6Var19.mo708b(view, num19.intValue(), leads19);
                    break;
                }
                break;
            case 26:
                ck6 ck6Var20 = this.d1;
                Leads leads20 = this.b1;
                Integer num20 = this.c1;
                if (ck6Var20 != null) {
                    ck6Var20.mo708b(view, num20.intValue(), leads20);
                    break;
                }
                break;
            case 27:
                ck6 ck6Var21 = this.d1;
                Leads leads21 = this.b1;
                Integer num21 = this.c1;
                if (ck6Var21 != null) {
                    ck6Var21.mo708b(view, num21.intValue(), leads21);
                    break;
                }
                break;
            case Service.MONITORING_FIELD_NUMBER /* 28 */:
                ck6 ck6Var22 = this.d1;
                Leads leads22 = this.b1;
                Integer num22 = this.c1;
                if (ck6Var22 != null) {
                    ck6Var22.mo708b(view, num22.intValue(), leads22);
                    break;
                }
                break;
        }
    }

    @Override // p001o.xz8
    public void h0(Leads leads) {
        this.b1 = leads;
        synchronized (this) {
            this.I1 |= 16;
        }
        m28509h(67);
        super.m25692R();
    }

    public final boolean i0(r44 r44Var, int i) {
        if (i != 0) {
            return false;
        }
        synchronized (this) {
            this.I1 |= 1;
        }
        return true;
    }

    public void j0(rog rogVar) {
        this.e1 = rogVar;
        synchronized (this) {
            this.I1 |= 4;
        }
        m28509h(7);
        super.m25692R();
    }

    public void k0(ck6 ck6Var) {
        this.d1 = ck6Var;
        synchronized (this) {
            this.I1 |= 2;
        }
        m28509h(33);
        super.m25692R();
    }

    public void l0(Integer num) {
        this.c1 = num;
        synchronized (this) {
            this.I1 |= 8;
        }
        m28509h(73);
        super.m25692R();
    }

    /* JADX WARN: Removed duplicated region for block: B:119:0x0239  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0246  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x0288  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x0294  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x029d  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x02b0  */
    /* JADX WARN: Removed duplicated region for block: B:192:0x0317  */
    /* JADX WARN: Removed duplicated region for block: B:195:0x032d  */
    /* JADX WARN: Removed duplicated region for block: B:203:0x0343  */
    /* JADX WARN: Removed duplicated region for block: B:206:0x034f  */
    /* JADX WARN: Removed duplicated region for block: B:209:0x0358  */
    /* JADX WARN: Removed duplicated region for block: B:212:0x035f  */
    /* JADX WARN: Removed duplicated region for block: B:218:0x037b  */
    /* JADX WARN: Removed duplicated region for block: B:222:0x0388 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:224:0x038f  */
    /* JADX WARN: Removed duplicated region for block: B:227:0x0396  */
    /* JADX WARN: Removed duplicated region for block: B:251:0x03d1  */
    /* JADX WARN: Removed duplicated region for block: B:254:0x03dd  */
    /* JADX WARN: Removed duplicated region for block: B:265:0x03f3 A[PHI: r2
      0x03f3: PHI (r2v6 long) = (r2v5 long), (r2v10 long) binds: [B:253:0x03db, B:262:0x03ee] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:268:0x03fc  */
    /* JADX WARN: Removed duplicated region for block: B:269:0x04bc  */
    /* JADX WARN: Removed duplicated region for block: B:272:0x04c7  */
    /* JADX WARN: Removed duplicated region for block: B:275:0x0594  */
    /* JADX WARN: Removed duplicated region for block: B:278:0x05a2  */
    /* JADX WARN: Removed duplicated region for block: B:281:0x05b0  */
    @Override // p001o.ewi
    /* renamed from: p */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void mo16295p() throws NumberFormatException {
        long j;
        boolean z;
        ck6 ck6Var;
        Integer num;
        String str;
        String str2;
        Long l;
        Integer num2;
        String str3;
        BusinessInfo addedBusiness;
        PaymentDetail paymentRequestDetail;
        String str4;
        List<RecentAction> list;
        String str5;
        int i;
        int i2;
        int i3;
        boolean z2;
        int i4;
        int i5;
        int i6;
        boolean showSelection;
        int i7;
        boolean z3;
        String website;
        boolean z4;
        String str6;
        ArrayList<CallLogs> callHistory;
        boolean z5;
        boolean z6;
        long j2;
        String str7;
        ArrayList<CallLogs> arrayList;
        int i8;
        int i9;
        long j3;
        long j4;
        boolean z7;
        boolean z8;
        int i10;
        boolean z9;
        long j5;
        int i11;
        int i12;
        long j6;
        int i13;
        int i14;
        String website2;
        String leadLifecycleStage;
        String contactOwner;
        VideoMeeting openVideoCallDetail;
        Long createdAt;
        List<RecentAction> recentEngagements;
        boolean zIsSelected;
        boolean showBottom;
        boolean zIsNewItem;
        String paymentProvider;
        String createdAt2;
        synchronized (this) {
            j = this.I1;
            this.I1 = 0L;
        }
        ck6 ck6Var2 = this.d1;
        rog rogVar = this.e1;
        Integer num3 = this.c1;
        Leads leads = this.b1;
        long j7 = j & 52;
        if (j7 != 0) {
            z = rogVar != null;
            if (j7 != 0) {
                j = z ? j | MediaStatus.COMMAND_DISLIKE : j | MediaStatus.COMMAND_LIKE;
            }
        } else {
            z = false;
        }
        long j8 = j & 48;
        if (j8 != 0) {
            if (leads != null) {
                zIsSelected = leads.isSelected();
                showBottom = leads.getShowBottom();
                contactOwner = leads.getContactOwner();
                zIsNewItem = leads.isNewItem();
                openVideoCallDetail = leads.getOpenVideoCallDetail();
                showSelection = leads.getShowSelection();
                createdAt = leads.getCreatedAt();
                addedBusiness = leads.getAddedBusiness();
                Integer unsuccessfulCallAttempts = leads.getUnsuccessfulCallAttempts();
                paymentRequestDetail = leads.getPaymentRequestDetail();
                recentEngagements = leads.getRecentEngagements();
                num2 = unsuccessfulCallAttempts;
            } else {
                num2 = null;
                contactOwner = null;
                openVideoCallDetail = null;
                createdAt = null;
                addedBusiness = null;
                paymentRequestDetail = null;
                recentEngagements = null;
                zIsSelected = false;
                showBottom = false;
                zIsNewItem = false;
                showSelection = false;
            }
            if (j8 != 0) {
                j |= showBottom ? 134217728L : 67108864L;
            }
            if ((j & 48) != 0) {
                j |= zIsNewItem ? 2147483648L : 1073741824L;
            }
            if ((j & 48) != 0) {
                j = showSelection ? j | MediaStatus.COMMAND_QUEUE_REPEAT_ONE | 33554432 | 8589934592L | 34359738368L | 137438953472L | 8796093022208L : j | MediaStatus.COMMAND_QUEUE_REPEAT_ALL | Javac.GENERATED_MEMBER | 4294967296L | 17179869184L | 68719476736L | 4398046511104L;
            }
            i4 = showBottom ? 0 : 8;
            int i15 = zIsNewItem ? 0 : 8;
            boolean z10 = !showSelection;
            int i16 = showSelection ? 8 : 0;
            int i17 = showSelection ? 0 : 8;
            z3 = addedBusiness != null;
            String str8 = "(" + num2;
            boolean z11 = paymentRequestDetail == null;
            if ((j & 48) != 0) {
                j |= z10 ? 512L : 256L;
            }
            if ((j & 48) != 0) {
                j = z3 ? j | 536870912 : j | 268435456;
            }
            if ((j & 48) != 0) {
                j |= z11 ? 2199023255552L : 1099511627776L;
            }
            String dueDate = openVideoCallDetail != null ? openVideoCallDetail.getDueDate() : null;
            if (paymentRequestDetail != null) {
                paymentProvider = paymentRequestDetail.getPaymentProvider();
                createdAt2 = paymentRequestDetail.getCreatedAt();
            } else {
                paymentProvider = null;
                createdAt2 = null;
            }
            boolean zIsEmpty = recentEngagements != null ? recentEngagements.isEmpty() : false;
            if ((j & 48) != 0) {
                j |= zIsEmpty ? 35184372088832L : 17592186044416L;
            }
            int i18 = z10 ? 0 : 8;
            str = str8 + ")";
            int i19 = z11 ? 8 : 0;
            z2 = zIsSelected;
            list = recentEngagements;
            str5 = createdAt2;
            num = num3;
            i3 = i15;
            str4 = contactOwner;
            ck6Var = ck6Var2;
            str3 = dueDate;
            l = createdAt;
            i = i17;
            i7 = i19;
            i2 = i16;
            int i20 = i18;
            i5 = zIsEmpty ? 8 : 0;
            str2 = paymentProvider;
            i6 = i20;
        } else {
            ck6Var = ck6Var2;
            num = num3;
            str = null;
            str2 = null;
            l = null;
            num2 = null;
            str3 = null;
            addedBusiness = null;
            paymentRequestDetail = null;
            str4 = null;
            list = null;
            str5 = null;
            i = 0;
            i2 = 0;
            i3 = 0;
            z2 = false;
            i4 = 0;
            i5 = 0;
            i6 = 0;
            showSelection = false;
            i7 = 0;
            z3 = false;
        }
        boolean zM47035a = ((MediaStatus.COMMAND_DISLIKE & j) == 0 || rogVar == null) ? false : rogVar.m47035a();
        if ((j & 536870912) != 0) {
            website = addedBusiness != null ? addedBusiness.getWebsite() : null;
            boolean z12 = website != null;
            boolean z13 = (j & 4294967296L) == 0 && num2 == null;
            if ((j & 4415226381312L) == 0) {
                callHistory = ((j & 4398046511104L) == 0 || leads == null) ? null : leads.getCallHistory();
                if ((j & 17179870208L) != 0) {
                    if (leads != null) {
                        z4 = zM47035a;
                        leadLifecycleStage = leads.getLeadLifecycleStage();
                    } else {
                        z4 = zM47035a;
                        leadLifecycleStage = null;
                    }
                    if ((j & MediaStatus.COMMAND_QUEUE_REPEAT_ALL) != 0) {
                        str6 = website;
                        z6 = leadLifecycleStage != "UNCONTACTED_NEW";
                        if ((j & 17179869184L) == 0) {
                            boolean z14 = z6;
                            z5 = leadLifecycleStage == "UNCONTACTED_NEW";
                            z6 = z14;
                        } else {
                            z5 = false;
                        }
                        j2 = j & 48;
                        if (j2 == 0) {
                            if (showSelection) {
                                z6 = true;
                            }
                            if (!z3) {
                                z12 = false;
                            }
                            if (showSelection) {
                                z13 = true;
                            }
                            if (showSelection) {
                                z5 = true;
                            }
                            ArrayList<CallLogs> arrayList2 = showSelection ? null : callHistory;
                            if (j2 != 0) {
                                j |= z6 ? 140737488355328L : 70368744177664L;
                            }
                            if ((j & 48) != 0) {
                                j = z12 ? j | 128 : j | 64;
                            }
                            if ((j & 48) != 0) {
                                j = z13 ? j | MediaStatus.COMMAND_UNFOLLOW : j | MediaStatus.COMMAND_FOLLOW;
                            }
                            if ((j & 48) != 0) {
                                j |= z5 ? MediaStatus.COMMAND_PLAYBACK_RATE : MediaStatus.COMMAND_EDIT_TRACKS;
                            }
                            i9 = z6 ? 8 : 0;
                            i8 = z5 ? 8 : 0;
                            str7 = str2;
                            arrayList = arrayList2;
                            j3 = 52;
                        } else {
                            str7 = str2;
                            arrayList = null;
                            i8 = 0;
                            i9 = 0;
                            z12 = false;
                            j3 = 52;
                            z13 = false;
                        }
                        j4 = j & j3;
                        if (j4 == 0) {
                            if (!z) {
                                z4 = false;
                            }
                            z7 = true;
                            z8 = !z4;
                            if (j4 != 0) {
                                j = z8 ? j | 8388608 : j | 4194304;
                            }
                        } else {
                            z7 = true;
                            z8 = false;
                        }
                        boolean z15 = ((j & MediaStatus.COMMAND_FOLLOW) == 0 && ewi.m25674U(num2) == 0) ? z7 : false;
                        if ((j & 128) == 0) {
                            if (addedBusiness != null) {
                                i10 = i;
                                z9 = z15;
                                website2 = addedBusiness.getWebsite();
                            } else {
                                z9 = z15;
                                website2 = str6;
                                i10 = i;
                            }
                            boolean z16 = website2 != "" ? z7 : false;
                            boolean zHasContactOwner = ((j & 8388608) == 0 || leads == null) ? false : leads.hasContactOwner();
                            j5 = j & 48;
                            if (j5 != 0) {
                                if (!z12) {
                                    z16 = false;
                                }
                                if (!z13) {
                                    z7 = z9;
                                }
                                if (j5 != 0) {
                                    j |= z16 ? 524288L : MediaStatus.COMMAND_STREAM_TRANSFER;
                                }
                                if ((j & 48) != 0) {
                                    j |= z7 ? 549755813888L : 274877906944L;
                                }
                                i11 = z16 ? 0 : 8;
                                i12 = z7 ? 8 : 0;
                            } else {
                                i11 = 0;
                                i12 = 0;
                            }
                            j6 = j & 52;
                            if (j6 == 0) {
                                i13 = 0;
                            } else {
                                if (!z8) {
                                    zHasContactOwner = false;
                                }
                                if (j6 != 0) {
                                    j |= zHasContactOwner ? 2097152L : 1048576L;
                                }
                                if (!zHasContactOwner) {
                                    i13 = 4;
                                }
                            }
                            if ((j & 48) != 0) {
                                i14 = i13;
                                this.n0.setVisibility(i4);
                                this.o0.setVisibility(i3);
                                this.r0.setVisibility(i12);
                                fjh.m26938c(this.r0, str);
                                this.s0.setVisibility(i8);
                                nr1.u2(this.s0, arrayList);
                                this.u0.setVisibility(i2);
                                nr1.v2(this.u0, arrayList);
                                this.v0.setVisibility(i9);
                                nr1.L0(this.v0, l);
                                this.x0.setVisibility(i11);
                                np3.m40895a(this.y0, z2);
                                this.y0.setVisibility(i10);
                                nr1.N0(this.A0, leads);
                                nr1.X0(this.B0, leads);
                                nr1.H1(this.C0, str7);
                                nr1.m40952W(this.G0, leads);
                                nr1.u0(this.K0, leads);
                                nr1.m40944O(this.M0, leads);
                                nr1.g1(this.M0, str4);
                                nr1.u1(this.Q0, paymentRequestDetail);
                                nr1.O2(this.R0, leads);
                                this.S0.setVisibility(i7);
                                nr1.m0(this.S0, str5);
                                this.T0.setVisibility(i6);
                                this.U0.m25689B().setVisibility(i5);
                                this.U0.i0(list);
                                nr1.d1(this.V0, leads);
                                nr1.Z0(this.W0, leads);
                                fu5.m27486a(this.X0, leads);
                                nr1.T0(this.Y0, leads);
                                nr1.l0(this.Z0, str3);
                                nr1.P2(this.a1, leads);
                            } else {
                                i14 = i13;
                            }
                            if ((32 & j) != 0) {
                                this.p0.setOnClickListener(this.p1);
                                this.q0.setOnClickListener(this.s1);
                                this.y0.setOnClickListener(this.z1);
                                this.z0.setOnClickListener(this.r1);
                                this.z0.setOnLongClickListener(this.i1);
                                this.B0.setOnClickListener(this.l1);
                                this.B0.setOnLongClickListener(this.D1);
                                this.C0.setOnClickListener(this.m1);
                                this.C0.setOnLongClickListener(this.C1);
                                this.D0.setOnClickListener(this.x1);
                                this.D0.setOnLongClickListener(this.A1);
                                this.E0.setOnClickListener(this.E1);
                                this.F0.setOnClickListener(this.F1);
                                this.G0.setOnClickListener(this.v1);
                                this.H0.setOnClickListener(this.g1);
                                this.I0.setOnClickListener(this.j1);
                                this.J0.setOnClickListener(this.q1);
                                this.L0.setOnClickListener(this.t1);
                                this.L0.setOnLongClickListener(this.y1);
                                this.M0.setOnClickListener(this.w1);
                                this.M0.setOnLongClickListener(this.u1);
                                this.N0.setOnClickListener(this.n1);
                                this.O0.setOnClickListener(this.B1);
                                this.P0.setOnClickListener(this.k1);
                                this.R0.setOnClickListener(this.h1);
                                this.S0.setOnClickListener(this.H1);
                                this.T0.setOnClickListener(this.G1);
                                this.a1.setOnClickListener(this.o1);
                            }
                            if ((52 & j) != 0) {
                                this.M0.setVisibility(i14);
                            }
                            if ((34 & j) != 0) {
                                this.U0.h0(ck6Var);
                            }
                            if ((j & 40) != 0) {
                                this.U0.j0(num);
                            }
                            ewi.m25683r(this.U0);
                        }
                        i10 = i;
                        z9 = z15;
                        if ((j & 8388608) == 0) {
                        }
                        j5 = j & 48;
                        if (j5 != 0) {
                        }
                        j6 = j & 52;
                        if (j6 == 0) {
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
                        ewi.m25683r(this.U0);
                    }
                    str6 = website;
                    if ((j & 17179869184L) == 0) {
                    }
                    j2 = j & 48;
                    if (j2 == 0) {
                    }
                    j4 = j & j3;
                    if (j4 == 0) {
                    }
                    if ((j & MediaStatus.COMMAND_FOLLOW) == 0) {
                    }
                    if ((j & 128) == 0) {
                    }
                    if ((j & 8388608) == 0) {
                    }
                    j5 = j & 48;
                    if (j5 != 0) {
                    }
                    j6 = j & 52;
                    if (j6 == 0) {
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
                    ewi.m25683r(this.U0);
                }
                z4 = zM47035a;
                str6 = website;
            } else {
                z4 = zM47035a;
                str6 = website;
                callHistory = null;
            }
            z5 = false;
            z6 = false;
            j2 = j & 48;
            if (j2 == 0) {
            }
            j4 = j & j3;
            if (j4 == 0) {
            }
            if ((j & MediaStatus.COMMAND_FOLLOW) == 0) {
            }
            if ((j & 128) == 0) {
            }
            if ((j & 8388608) == 0) {
            }
            j5 = j & 48;
            if (j5 != 0) {
            }
            j6 = j & 52;
            if (j6 == 0) {
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
            ewi.m25683r(this.U0);
        }
        website = null;
        if ((j & 4294967296L) == 0) {
        }
        if ((j & 4415226381312L) == 0) {
        }
        z5 = false;
        z6 = false;
        j2 = j & 48;
        if (j2 == 0) {
        }
        j4 = j & j3;
        if (j4 == 0) {
        }
        if ((j & MediaStatus.COMMAND_FOLLOW) == 0) {
        }
        if ((j & 128) == 0) {
        }
        if ((j & 8388608) == 0) {
        }
        j5 = j & 48;
        if (j5 != 0) {
        }
        j6 = j & 52;
        if (j6 == 0) {
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
        ewi.m25683r(this.U0);
    }

    public yz8(yt4 yt4Var, View view, Object[] objArr) {
        super(yt4Var, view, 1, (HorizontalScrollView) objArr[27], (TextView) objArr[3], (Button) objArr[21], (Button) objArr[22], (MaterialTextView) objArr[14], (MaterialTextView) objArr[15], (LinearLayout) objArr[40], (ShapeableImageView) objArr[13], (MaterialTextView) objArr[16], (FrameLayout) objArr[39], (ShapeableImageView) objArr[7], (CheckBox) objArr[17], (MaterialCardView) objArr[0], (ShapeableImageView) objArr[5], (ShapeableImageView) objArr[2], (ShapeableImageView) objArr[24], (ShapeableImageView) objArr[19], (MaterialButton) objArr[33], (MaterialButton) objArr[28], (MaterialButton) objArr[29], (MaterialButton) objArr[30], (MaterialButton) objArr[37], (MaterialButton) objArr[36], (MaterialTextView) objArr[4], (MaterialButton) objArr[34], (Chip) objArr[12], (MaterialButton) objArr[35], (MaterialButton) objArr[32], (MaterialButton) objArr[31], (MaterialTextView) objArr[25], (MaterialCardView) objArr[23], (MaterialTextView) objArr[26], (MaterialCardView) objArr[9], (r44) objArr[38], (MaterialTextView) objArr[6], (MaterialTextView) objArr[8], (MaterialTextView) objArr[1], (MaterialTextView) objArr[11], (MaterialTextView) objArr[20], (MaterialCardView) objArr[18]);
        this.I1 = -1L;
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
        ConstraintLayout constraintLayout = (ConstraintLayout) objArr[10];
        this.f1 = constraintLayout;
        constraintLayout.setTag(null);
        this.Q0.setTag(null);
        this.R0.setTag(null);
        this.S0.setTag(null);
        this.T0.setTag(null);
        m25693Z(this.U0);
        this.V0.setTag(null);
        this.W0.setTag(null);
        this.X0.setTag(null);
        this.Y0.setTag(null);
        this.Z0.setTag(null);
        this.a1.setTag(null);
        a0(view);
        this.g1 = new jbc(this, 20);
        this.h1 = new jbc(this, 14);
        this.i1 = new sbc(this, 2);
        this.j1 = new jbc(this, 28);
        this.k1 = new jbc(this, 21);
        this.l1 = new jbc(this, 3);
        this.m1 = new jbc(this, 15);
        this.n1 = new jbc(this, 26);
        this.o1 = new jbc(this, 9);
        this.p1 = new jbc(this, 12);
        this.q1 = new jbc(this, 27);
        this.r1 = new jbc(this, 1);
        this.s1 = new jbc(this, 13);
        this.t1 = new jbc(this, 24);
        this.u1 = new sbc(this, 7);
        this.v1 = new jbc(this, 19);
        this.w1 = new jbc(this, 6);
        this.x1 = new jbc(this, 10);
        this.y1 = new sbc(this, 25);
        this.z1 = new jbc(this, 8);
        this.A1 = new sbc(this, 11);
        this.B1 = new jbc(this, 22);
        this.C1 = new sbc(this, 16);
        this.D1 = new sbc(this, 4);
        this.E1 = new jbc(this, 23);
        this.F1 = new jbc(this, 18);
        this.G1 = new jbc(this, 5);
        this.H1 = new jbc(this, 17);
        mo16291G();
    }
}
