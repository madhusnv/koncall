package p001o;

import ai.salesmax.custom.CustomFormDataObservable;
import ai.salesmax.model.Leads;
import ai.salesmax.model.PaymentDetail;
import ai.salesmax.model.RecentAction;
import android.content.res.Resources;
import android.util.SparseIntArray;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.HorizontalScrollView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.appcompat.widget.Toolbar;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import androidx.viewpager2.widget.ViewPager2;
import com.google.android.gms.cast.MediaStatus;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.card.MaterialCardView;
import com.google.android.material.chip.Chip;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.imageview.ShapeableImageView;
import com.google.android.material.tabs.TabLayout;
import com.google.android.material.textview.MaterialTextView;
import com.ortiz.touchview.TouchImageView;
import java.util.Date;
import java.util.List;
import lombok.javac.Javac;
import p001o.ewi;
import p001o.jbc;
import p001o.sbc;

/* loaded from: classes.dex */
public class zo9 extends yo9 implements jbc.InterfaceC14485a, sbc.InterfaceC16795a {
    public static final ewi.C13274i N1;
    public static final SparseIntArray O1;
    public final CoordinatorLayout G1;
    public final ConstraintLayout H1;
    public final View.OnClickListener I1;
    public final View.OnLongClickListener J1;
    public final View.OnClickListener K1;
    public boolean L1;
    public long M1;

    static {
        ewi.C13274i c13274i = new ewi.C13274i(66);
        N1 = c13274i;
        c13274i.m25699a(1, new String[]{"content_recent_actions", "content_custom_form_value"}, new int[]{40, 41}, new int[]{p9e.content_recent_actions, p9e.content_custom_form_value});
        SparseIntArray sparseIntArray = new SparseIntArray();
        O1 = sparseIntArray;
        sparseIntArray.put(z8e.appBar, 42);
        sparseIntArray.put(z8e.toolbar, 43);
        sparseIntArray.put(z8e.leadDetailsClose, 44);
        sparseIntArray.put(z8e.leadDetailsMore, 45);
        sparseIntArray.put(z8e.leadDetailsName, 46);
        sparseIntArray.put(z8e.existingSalesmaxUser, 47);
        sparseIntArray.put(z8e.leadBusinessLayout, 48);
        sparseIntArray.put(z8e.chipsGroupLayuot, 49);
        sparseIntArray.put(z8e.dealUpdateActionBlock, 50);
        sparseIntArray.put(z8e.dealUpdateActionText, 51);
        sparseIntArray.put(z8e.cardCallNextStepAction, 52);
        sparseIntArray.put(z8e.leadDetailsButtonGroupLayout, 53);
        sparseIntArray.put(z8e.leadAdd, 54);
        sparseIntArray.put(z8e.leadConversation, 55);
        sparseIntArray.put(z8e.leadSend, 56);
        sparseIntArray.put(z8e.leadShare, 57);
        sparseIntArray.put(z8e.leadWhatsapp, 58);
        sparseIntArray.put(z8e.leadDocuments, 59);
        sparseIntArray.put(z8e.leadPayments, 60);
        sparseIntArray.put(z8e.leadsTab, 61);
        sparseIntArray.put(z8e.swipeRefreshLayout, 62);
        sparseIntArray.put(z8e.leadsPager, 63);
        sparseIntArray.put(z8e.imageOverlayContainer, 64);
        sparseIntArray.put(z8e.closeButton, 65);
    }

    public zo9(yt4 yt4Var, View view) {
        this(yt4Var, view, ewi.m25671L(yt4Var, view, 66, N1, O1));
    }

    @Override // p001o.ewi
    /* renamed from: E */
    public boolean mo16290E() {
        synchronized (this) {
            if (this.M1 != 0) {
                return true;
            }
            return this.u1.mo16290E() || this.z0.mo16290E();
        }
    }

    @Override // p001o.ewi
    /* renamed from: G */
    public void mo16291G() {
        synchronized (this) {
            this.M1 = MediaStatus.COMMAND_QUEUE_REPEAT_ALL;
        }
        this.u1.mo16291G();
        this.z0.mo16291G();
        m25692R();
    }

    @Override // p001o.ewi
    /* renamed from: M */
    public boolean mo16292M(int i, Object obj, int i2) {
        if (i == 0) {
            return q0((CustomFormDataObservable) obj, i2);
        }
        if (i == 1) {
            return s0((p44) obj, i2);
        }
        if (i != 2) {
            return false;
        }
        return p0((t14) obj, i2);
    }

    @Override // p001o.sbc.InterfaceC16795a
    /* renamed from: a */
    public final boolean mo16293a(int i, View view) {
        ck6 ck6Var = this.F1;
        Leads leads = this.z1;
        Integer num = this.E1;
        if (ck6Var != null) {
            return ck6Var.mo707a(view, num.intValue(), leads);
        }
        return false;
    }

    @Override // p001o.ewi
    public boolean b0(int i, Object obj) {
        if (9 == i) {
            j0((Boolean) obj);
        } else if (33 == i) {
            t0((ck6) obj);
        } else if (48 == i) {
            l0((String) obj);
        } else if (41 == i) {
            k0((Boolean) obj);
        } else if (73 == i) {
            u0((Integer) obj);
        } else if (49 == i) {
            m0((Boolean) obj);
        } else {
            if (67 != i) {
                return false;
            }
            n0((Leads) obj);
        }
        return true;
    }

    @Override // p001o.jbc.InterfaceC14485a
    /* renamed from: c */
    public final void mo16294c(int i, View view) {
        if (i == 1) {
            ck6 ck6Var = this.F1;
            Leads leads = this.z1;
            Integer num = this.E1;
            if (ck6Var != null) {
                ck6Var.mo708b(view, num.intValue(), leads);
                return;
            }
            return;
        }
        if (i != 3) {
            return;
        }
        ck6 ck6Var2 = this.F1;
        Leads leads2 = this.z1;
        Integer num2 = this.E1;
        if (ck6Var2 != null) {
            ck6Var2.mo708b(view, num2.intValue(), leads2);
        }
    }

    @Override // p001o.yo9
    public void j0(Boolean bool) {
        this.B1 = bool;
        synchronized (this) {
            this.M1 |= 8;
        }
        m28509h(9);
        super.m25692R();
    }

    @Override // p001o.yo9
    public void k0(Boolean bool) {
        this.A1 = bool;
        synchronized (this) {
            this.M1 |= 64;
        }
        m28509h(41);
        super.m25692R();
    }

    @Override // p001o.yo9
    public void l0(String str) {
        this.C1 = str;
        synchronized (this) {
            this.M1 |= 32;
        }
        m28509h(48);
        super.m25692R();
    }

    @Override // p001o.yo9
    public void m0(Boolean bool) {
        this.D1 = bool;
        synchronized (this) {
            this.M1 |= 256;
        }
        m28509h(49);
        super.m25692R();
    }

    @Override // p001o.yo9
    public void n0(Leads leads) {
        this.z1 = leads;
        synchronized (this) {
            this.M1 |= 512;
        }
        m28509h(67);
        super.m25692R();
    }

    /* JADX WARN: Removed duplicated region for block: B:144:0x0236  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x0246  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x0251  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x0265  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0033 A[PHI: r2
      0x0033: PHI (r2v1 long) = (r2v0 long), (r2v63 long) binds: [B:7:0x001e, B:14:0x0031] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:160:0x028c  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x02ba  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x02c8  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x02d7  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x02e4  */
    /* JADX WARN: Removed duplicated region for block: B:189:0x030f  */
    /* JADX WARN: Removed duplicated region for block: B:192:0x0319  */
    /* JADX WARN: Removed duplicated region for block: B:200:0x0338  */
    /* JADX WARN: Removed duplicated region for block: B:202:0x0342  */
    /* JADX WARN: Removed duplicated region for block: B:205:0x0352  */
    /* JADX WARN: Removed duplicated region for block: B:228:0x0397  */
    /* JADX WARN: Removed duplicated region for block: B:231:0x03a3  */
    /* JADX WARN: Removed duplicated region for block: B:250:0x03d6  */
    /* JADX WARN: Removed duplicated region for block: B:253:0x03e2  */
    /* JADX WARN: Removed duplicated region for block: B:264:0x0401  */
    /* JADX WARN: Removed duplicated region for block: B:267:0x040a  */
    /* JADX WARN: Removed duplicated region for block: B:278:0x0429  */
    /* JADX WARN: Removed duplicated region for block: B:281:0x0432  */
    /* JADX WARN: Removed duplicated region for block: B:282:0x048b  */
    /* JADX WARN: Removed duplicated region for block: B:285:0x0495  */
    /* JADX WARN: Removed duplicated region for block: B:288:0x0522  */
    /* JADX WARN: Removed duplicated region for block: B:291:0x0530  */
    /* JADX WARN: Removed duplicated region for block: B:294:0x0543  */
    /* JADX WARN: Removed duplicated region for block: B:297:0x0555  */
    /* JADX WARN: Removed duplicated region for block: B:300:0x0565  */
    /* JADX WARN: Removed duplicated region for block: B:303:0x057d  */
    /* JADX WARN: Removed duplicated region for block: B:306:0x058b  */
    /* JADX WARN: Removed duplicated region for block: B:309:0x0599  */
    /* JADX WARN: Removed duplicated region for block: B:311:0x05be  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0115  */
    @Override // p001o.ewi
    /* renamed from: p */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void mo16295p() throws Resources.NotFoundException {
        long j;
        int i;
        boolean zM25676W;
        boolean z;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        boolean z2;
        boolean z3;
        boolean z4;
        int i9;
        ck6 ck6Var;
        String str;
        Integer num;
        String str2;
        String str3;
        String str4;
        Date date;
        String str5;
        List<String> userDefinedTags;
        CustomFormDataObservable customFormDataObservable;
        List<RecentAction> recentEngagements;
        PaymentDetail paymentDetail;
        String str6;
        String str7;
        int i10;
        int i11;
        boolean z5;
        int i12;
        Date date2;
        boolean z6;
        boolean z7;
        boolean z8;
        long j2;
        boolean z9;
        int i13;
        int i14;
        long j3;
        boolean z10;
        int i15;
        long j4;
        int i16;
        long j5;
        int i17;
        int i18;
        long j6;
        boolean z11;
        boolean zIsEmpty;
        String leadLifecycleStage;
        String str8;
        Date nextProspectingDueOn;
        String contactOwner;
        String contactSourceOne;
        PaymentDetail paymentRequestDetail;
        String name;
        String paymentProvider;
        String createdAt;
        int i19;
        int i20;
        int i21;
        boolean z12;
        CustomFormDataObservable customAttributesObservable;
        long j7;
        String customAttributes;
        boolean zHasContactOwner;
        int i22;
        long j8;
        long j9;
        long j10;
        long j11;
        synchronized (this) {
            j = this.M1;
            this.M1 = 0L;
        }
        Boolean bool = this.B1;
        ck6 ck6Var2 = this.F1;
        String str9 = this.C1;
        Boolean bool2 = this.A1;
        Integer num2 = this.E1;
        Boolean bool3 = this.D1;
        Leads leads = this.z1;
        long j12 = j & 1032;
        if (j12 != 0) {
            boolean zM25676W2 = ewi.m25676W(bool);
            if (j12 != 0) {
                j |= zM25676W2 ? MediaStatus.COMMAND_STREAM_TRANSFER : MediaStatus.COMMAND_UNFOLLOW;
            }
            i = zM25676W2 ? 0 : 8;
        }
        long j13 = j & 1600;
        if (j13 != 0) {
            zM25676W = ewi.m25676W(bool2);
            if (j13 != 0) {
                j = zM25676W ? j | 4194304 : j | 2097152;
            }
        } else {
            zM25676W = false;
        }
        if ((j & 1792) != 0) {
            boolean zM25676W3 = ewi.m25676W(bool3);
            if ((j & 1280) != 0) {
                if (zM25676W3) {
                    j10 = j | 1048576 | 67108864;
                    j11 = 281474976710656L;
                } else {
                    j10 = j | 524288 | 33554432;
                    j11 = 140737488355328L;
                }
                j = j10 | j11;
            }
            long j14 = j & 1280;
            if (j14 != 0) {
                i3 = zM25676W3 ? 0 : 8;
                i22 = zM25676W3 ? 4 : 0;
                int i23 = zM25676W3 ? 8 : 0;
                z = !zM25676W3;
                if (j14 != 0) {
                    if (z) {
                        j8 = j | Javac.GENERATED_MEMBER;
                        j9 = 1125899906842624L;
                    } else {
                        j8 = j | 8388608;
                        j9 = 562949953421312L;
                    }
                    j = j8 | j9;
                }
                if ((j & 1792) != 0) {
                    j = z ? j | 274877906944L : j | 137438953472L;
                }
                if ((j & 1280) == 0) {
                    i2 = z ? 8 : 0;
                    i4 = i22;
                    i5 = i23;
                    i6 = z ? 0 : 8;
                    if ((j & 1793) == 0) {
                        long j15 = j & 1536;
                        if (j15 != 0) {
                            if (leads != null) {
                                nextProspectingDueOn = leads.getNextProspectingDueOn();
                                zHasContactOwner = leads.hasContactOwner();
                                contactOwner = leads.getContactOwner();
                                customAttributes = leads.getCustomAttributes();
                                userDefinedTags = leads.getUserDefinedTags();
                                contactSourceOne = leads.getContactSourceOne();
                                String leadLifecycleStage2 = leads.getLeadLifecycleStage();
                                paymentRequestDetail = leads.getPaymentRequestDetail();
                                recentEngagements = leads.getRecentEngagements();
                                name = leads.getName();
                                str8 = leadLifecycleStage2;
                            } else {
                                str8 = null;
                                nextProspectingDueOn = null;
                                contactOwner = null;
                                customAttributes = null;
                                userDefinedTags = null;
                                contactSourceOne = null;
                                paymentRequestDetail = null;
                                recentEngagements = null;
                                name = null;
                                zHasContactOwner = false;
                            }
                            if (j15 != 0) {
                                j |= zHasContactOwner ? 4503599627370496L : 2251799813685248L;
                            }
                            i19 = zHasContactOwner ? 0 : 8;
                            boolean z13 = customAttributes == null;
                            z3 = userDefinedTags != null;
                            z2 = str8 == "CLOSED";
                            boolean z14 = paymentRequestDetail == null;
                            if ((j & 1536) != 0) {
                                j |= z13 ? 268435456L : 134217728L;
                            }
                            if ((j & 1536) != 0) {
                                j = z3 ? j | MediaStatus.COMMAND_EDIT_TRACKS : j | MediaStatus.COMMAND_QUEUE_REPEAT_ONE;
                            }
                            if ((j & 1536) != 0) {
                                j = z2 ? j | 68719476736L : j | 34359738368L;
                            }
                            if ((j & 1536) != 0) {
                                j |= z14 ? 70368744177664L : 35184372088832L;
                            }
                            boolean zIsEmpty2 = contactSourceOne != null ? contactSourceOne.isEmpty() : false;
                            if ((j & 1536) != 0) {
                                j |= zIsEmpty2 ? 17592186044416L : 8796093022208L;
                            }
                            if (paymentRequestDetail != null) {
                                paymentProvider = paymentRequestDetail.getPaymentProvider();
                                createdAt = paymentRequestDetail.getCreatedAt();
                            } else {
                                paymentProvider = null;
                                createdAt = null;
                            }
                            i20 = z13 ? 8 : 0;
                            i21 = z14 ? 8 : 0;
                            int i24 = zIsEmpty2 ? 8 : 0;
                            if ((j & 1537) == 0) {
                                customAttributesObservable = leads != null ? leads.getCustomAttributesObservable() : null;
                                z12 = false;
                                g0(0, customAttributesObservable);
                            } else {
                                z12 = false;
                                customAttributesObservable = null;
                            }
                            j7 = j & 1792;
                            if (j7 == 0) {
                                z4 = leads == null ? true : z12;
                                if (j7 != 0) {
                                    j = z4 ? j | MediaStatus.COMMAND_FOLLOW : j | MediaStatus.COMMAND_DISLIKE;
                                }
                            } else {
                                z4 = z12;
                            }
                            i7 = i19;
                            i9 = i21;
                            str7 = createdAt;
                            str5 = str8;
                            date = nextProspectingDueOn;
                            str6 = contactOwner;
                            str = str9;
                            num = num2;
                            i11 = i20;
                            str4 = contactSourceOne;
                            i8 = i;
                            ck6Var = ck6Var2;
                            i10 = i24;
                            str2 = paymentProvider;
                            PaymentDetail paymentDetail2 = paymentRequestDetail;
                            customFormDataObservable = customAttributesObservable;
                            str3 = name;
                            paymentDetail = paymentDetail2;
                        } else {
                            str8 = null;
                            nextProspectingDueOn = null;
                            contactOwner = null;
                            userDefinedTags = null;
                            contactSourceOne = null;
                            paymentRequestDetail = null;
                            recentEngagements = null;
                            name = null;
                            paymentProvider = null;
                            createdAt = null;
                            z2 = false;
                            i19 = 0;
                            i20 = 0;
                            z3 = false;
                            i21 = 0;
                        }
                        if ((j & 1537) == 0) {
                        }
                        j7 = j & 1792;
                        if (j7 == 0) {
                        }
                        i7 = i19;
                        i9 = i21;
                        str7 = createdAt;
                        str5 = str8;
                        date = nextProspectingDueOn;
                        str6 = contactOwner;
                        str = str9;
                        num = num2;
                        i11 = i20;
                        str4 = contactSourceOne;
                        i8 = i;
                        ck6Var = ck6Var2;
                        i10 = i24;
                        str2 = paymentProvider;
                        PaymentDetail paymentDetail22 = paymentRequestDetail;
                        customFormDataObservable = customAttributesObservable;
                        str3 = name;
                        paymentDetail = paymentDetail22;
                    } else {
                        i7 = 0;
                        i8 = i;
                        z2 = false;
                        z3 = false;
                        z4 = false;
                        i9 = 0;
                        ck6Var = ck6Var2;
                        str = str9;
                        num = num2;
                        str2 = null;
                        str3 = null;
                        str4 = null;
                        date = null;
                        str5 = null;
                        userDefinedTags = null;
                        customFormDataObservable = null;
                        recentEngagements = null;
                        paymentDetail = null;
                        str6 = null;
                        str7 = null;
                        i10 = 0;
                        i11 = 0;
                    }
                    if ((j & MediaStatus.COMMAND_EDIT_TRACKS) == 0) {
                        z5 = false;
                    } else {
                        if ((userDefinedTags != null ? userDefinedTags.size() : 0) > 0) {
                            z5 = true;
                        }
                    }
                    boolean z15 = (j & 34359738368L) == 0 && date == null;
                    if ((j & 137441083392L) == 0) {
                        if ((j & 137438953472L) != 0) {
                            z11 = !(leads != null ? leads.isCloudTelephonyEnabled() : false);
                        } else {
                            z11 = false;
                        }
                        if ((j & MediaStatus.COMMAND_DISLIKE) == 0) {
                            zIsEmpty = false;
                            if ((j & 2097152) == 0) {
                                if (leads != null) {
                                    i12 = i7;
                                    date2 = date;
                                    leadLifecycleStage = leads.getLeadLifecycleStage();
                                } else {
                                    i12 = i7;
                                    date2 = date;
                                    leadLifecycleStage = str5;
                                }
                                z6 = leadLifecycleStage != "PROSPECTING";
                                z7 = zIsEmpty;
                            } else {
                                i12 = i7;
                                date2 = date;
                                z7 = zIsEmpty;
                                z6 = false;
                            }
                            z8 = z11;
                        } else {
                            String contactID = leads != null ? leads.getContactID() : null;
                            if (contactID != null) {
                                zIsEmpty = contactID.isEmpty();
                            }
                            if ((j & 2097152) == 0) {
                            }
                            z8 = z11;
                        }
                    } else {
                        i12 = i7;
                        date2 = date;
                        z6 = false;
                        z7 = false;
                        z8 = false;
                    }
                    j2 = j & 1536;
                    if (j2 == 0) {
                        if (!z3) {
                            z5 = false;
                        }
                        if (z2) {
                            z15 = true;
                        }
                        if (j2 != 0) {
                            j |= z5 ? 1099511627776L : 549755813888L;
                        }
                        if ((j & 1536) != 0) {
                            j |= z15 ? 4294967296L : 2147483648L;
                        }
                        i14 = z5 ? 0 : 8;
                        z9 = z6;
                        i13 = z15 ? 8 : 0;
                    } else {
                        z9 = z6;
                        i13 = 0;
                        i14 = 0;
                    }
                    j3 = j & 1792;
                    if (j3 == 0) {
                        if (z4) {
                            z7 = true;
                        }
                        if (z) {
                            z8 = true;
                        }
                        if (j3 != 0) {
                            j |= z7 ? 1073741824L : 536870912L;
                        }
                        if ((j & 1792) != 0) {
                            j |= z8 ? MediaStatus.COMMAND_LIKE : MediaStatus.COMMAND_PLAYBACK_RATE;
                        }
                        int i25 = z8 ? 8 : 0;
                        z10 = z;
                        i15 = i25;
                    } else {
                        z10 = z;
                        i15 = 0;
                        z7 = false;
                    }
                    j4 = j & 1600;
                    if (j4 == 0) {
                        if (zM25676W) {
                            z9 = true;
                        }
                        if (j4 != 0) {
                            j |= z9 ? 4398046511104L : 2199023255552L;
                        }
                        i16 = z9 ? 8 : 0;
                    } else {
                        i16 = 0;
                    }
                    j5 = j & 1792;
                    if (j5 == 0) {
                        if (z7) {
                            z10 = true;
                        }
                        if (j5 != 0) {
                            j |= z10 ? 17179869184L : 8589934592L;
                        }
                        i17 = z10 ? 4 : 0;
                    } else {
                        i17 = 0;
                    }
                    if ((j & 1280) == 0) {
                        i18 = i16;
                        this.n0.setVisibility(i3);
                        this.p0.setVisibility(i3);
                        this.q0.setVisibility(i3);
                        this.r0.setVisibility(i3);
                        this.s0.setVisibility(i3);
                        this.t0.setVisibility(i3);
                        this.v0.setVisibility(i3);
                        this.w0.setVisibility(i3);
                        this.D0.setVisibility(i2);
                        this.F0.setVisibility(i2);
                        this.G0.setVisibility(i2);
                        this.L0.setVisibility(i6);
                        this.S0.setVisibility(i5);
                        int i26 = i4;
                        this.a1.setVisibility(i26);
                        this.b1.setVisibility(i26);
                        this.y1.setVisibility(i3);
                    } else {
                        i18 = i16;
                    }
                    if ((j & 1536) != 0) {
                        this.z0.m25689B().setVisibility(i11);
                        nr1.N0(this.M0, leads);
                        nr1.H1(this.N0, str2);
                        nr1.Q2(this.O0, leads);
                        nr1.f1(this.Y0, str3);
                        nr1.Z0(this.Z0, leads);
                        nr1.X0(this.a1, leads);
                        nr1.m40948S(this.d1, leads);
                        this.e1.setVisibility(i10);
                        fjh.m26938c(this.e1, str4);
                        nr1.U0(this.f1, leads);
                        this.h1.setVisibility(i12);
                        nr1.m40944O(this.h1, leads);
                        nr1.g1(this.h1, str6);
                        nr1.b3(this.H1, leads);
                        this.p1.setVisibility(i13);
                        nr1.s1(this.q1, date2);
                        nr1.u1(this.r1, paymentDetail);
                        nr1.O2(this.s1, leads);
                        this.t1.setVisibility(i9);
                        nr1.m0(this.t1, str7);
                        this.u1.i0(recentEngagements);
                        this.v1.setVisibility(i14);
                    }
                    if ((j & 1537) != 0) {
                        this.z0.i0(customFormDataObservable);
                    }
                    if ((1040 & j) != 0) {
                        ck6 ck6Var3 = ck6Var;
                        this.z0.h0(ck6Var3);
                        this.u1.h0(ck6Var3);
                    }
                    if ((1152 & j) != 0) {
                        Integer num3 = num;
                        this.z0.j0(num3);
                        this.u1.j0(num3);
                    }
                    if ((j & 1792) != 0) {
                        this.E0.setVisibility(i15);
                        this.T0.setVisibility(i17);
                    }
                    if ((j & 1600) != 0) {
                        int i27 = i18;
                        this.H0.setVisibility(i27);
                        this.g1.setVisibility(i27);
                        this.o1.setVisibility(i27);
                    }
                    if ((1032 & j) != 0) {
                        this.I0.setVisibility(i8);
                    }
                    if ((1056 & j) != 0) {
                        nr1.F2(this.K0, str);
                    }
                    j6 = j & MediaStatus.COMMAND_QUEUE_REPEAT_ALL;
                    if (j6 != 0) {
                        this.O0.setOnClickListener(this.I1);
                        this.O0.setOnLongClickListener(this.J1);
                        CoordinatorLayout coordinatorLayout = this.G1;
                        boolean z16 = this.L1;
                        wh1.m54388b(coordinatorLayout, false, z16, false, z16, false, true, false, true);
                        this.t1.setOnClickListener(this.K1);
                    }
                    if (j6 != 0) {
                        this.L1 = true;
                    }
                    ewi.m25683r(this.u1);
                    ewi.m25683r(this.z0);
                }
                i4 = i22;
                i5 = i23;
                i2 = 0;
            } else {
                i3 = 0;
                i22 = 0;
            }
            if (!zM25676W3) {
            }
            if (j14 != 0) {
            }
            if ((j & 1792) != 0) {
            }
            if ((j & 1280) == 0) {
            }
        } else {
            z = false;
            i2 = 0;
            i3 = 0;
            i4 = 0;
            i5 = 0;
        }
        i6 = 0;
        if ((j & 1793) == 0) {
        }
        if ((j & MediaStatus.COMMAND_EDIT_TRACKS) == 0) {
        }
        if ((j & 34359738368L) == 0) {
        }
        if ((j & 137441083392L) == 0) {
        }
        j2 = j & 1536;
        if (j2 == 0) {
        }
        j3 = j & 1792;
        if (j3 == 0) {
        }
        j4 = j & 1600;
        if (j4 == 0) {
        }
        j5 = j & 1792;
        if (j5 == 0) {
        }
        if ((j & 1280) == 0) {
        }
        if ((j & 1536) != 0) {
        }
        if ((j & 1537) != 0) {
        }
        if ((1040 & j) != 0) {
        }
        if ((1152 & j) != 0) {
        }
        if ((j & 1792) != 0) {
        }
        if ((j & 1600) != 0) {
        }
        if ((1032 & j) != 0) {
        }
        if ((1056 & j) != 0) {
        }
        j6 = j & MediaStatus.COMMAND_QUEUE_REPEAT_ALL;
        if (j6 != 0) {
        }
        if (j6 != 0) {
        }
        ewi.m25683r(this.u1);
        ewi.m25683r(this.z0);
    }

    public final boolean p0(t14 t14Var, int i) {
        if (i != 0) {
            return false;
        }
        synchronized (this) {
            this.M1 |= 4;
        }
        return true;
    }

    public final boolean q0(CustomFormDataObservable customFormDataObservable, int i) {
        if (i != 0) {
            return false;
        }
        synchronized (this) {
            this.M1 |= 1;
        }
        return true;
    }

    public final boolean s0(p44 p44Var, int i) {
        if (i != 0) {
            return false;
        }
        synchronized (this) {
            this.M1 |= 2;
        }
        return true;
    }

    public void t0(ck6 ck6Var) {
        this.F1 = ck6Var;
        synchronized (this) {
            this.M1 |= 16;
        }
        m28509h(33);
        super.m25692R();
    }

    public void u0(Integer num) {
        this.E1 = num;
        synchronized (this) {
            this.M1 |= 128;
        }
        m28509h(73);
        super.m25692R();
    }

    public zo9(yt4 yt4Var, View view, Object[] objArr) {
        super(yt4Var, view, 3, (MaterialCardView) objArr[2], (AppBarLayout) objArr[42], (MaterialTextView) objArr[28], (MaterialTextView) objArr[29], (MaterialTextView) objArr[26], (MaterialTextView) objArr[24], (MaterialCardView) objArr[27], (MaterialCardView) objArr[52], (MaterialCardView) objArr[23], (MaterialCardView) objArr[25], (LinearLayout) objArr[49], (ImageView) objArr[65], (t14) objArr[41], (MaterialCardView) objArr[50], (MaterialTextView) objArr[51], (MaterialTextView) objArr[47], (FloatingActionButton) objArr[37], (FloatingActionButton) objArr[35], (FloatingActionButton) objArr[38], (FloatingActionButton) objArr[36], (FrameLayout) objArr[31], (ShapeableImageView) objArr[10], (FrameLayout) objArr[64], (TouchImageView) objArr[39], (LinearLayout) objArr[22], (ShapeableImageView) objArr[7], (ShapeableImageView) objArr[17], (ShapeableImageView) objArr[8], (MaterialButton) objArr[54], (LinearLayout) objArr[48], (MaterialButton) objArr[55], (View) objArr[34], (HorizontalScrollView) objArr[30], (LinearLayout) objArr[53], (ShapeableImageView) objArr[44], (ShapeableImageView) objArr[45], (LinearLayout) objArr[46], (MaterialTextView) objArr[9], (MaterialTextView) objArr[11], (ShapeableImageView) objArr[5], (FrameLayout) objArr[4], (MaterialButton) objArr[59], (Chip) objArr[14], (Chip) objArr[15], (MaterialTextView) objArr[6], (MaterialButton) objArr[32], (Chip) objArr[13], (MaterialButton) objArr[60], (MaterialButton) objArr[56], (MaterialButton) objArr[57], (MaterialButton) objArr[58], (ViewPager2) objArr[63], (TabLayout) objArr[61], (MaterialCardView) objArr[33], (MaterialCardView) objArr[20], (MaterialTextView) objArr[21], (MaterialTextView) objArr[18], (MaterialCardView) objArr[16], (MaterialTextView) objArr[19], (p44) objArr[40], (RecyclerView) objArr[12], (SwipeRefreshLayout) objArr[62], (Toolbar) objArr[43], (MaterialTextView) objArr[3]);
        this.M1 = -1L;
        this.n0.setTag(null);
        this.p0.setTag(null);
        this.q0.setTag(null);
        this.r0.setTag(null);
        this.s0.setTag(null);
        this.t0.setTag(null);
        this.v0.setTag(null);
        this.w0.setTag(null);
        m25693Z(this.z0);
        this.D0.setTag(null);
        this.E0.setTag(null);
        this.F0.setTag(null);
        this.G0.setTag(null);
        this.H0.setTag(null);
        this.I0.setTag(null);
        this.K0.setTag(null);
        this.L0.setTag(null);
        this.M0.setTag(null);
        this.N0.setTag(null);
        this.O0.setTag(null);
        this.S0.setTag(null);
        this.T0.setTag(null);
        this.Y0.setTag(null);
        this.Z0.setTag(null);
        this.a1.setTag(null);
        this.b1.setTag(null);
        this.d1.setTag(null);
        this.e1.setTag(null);
        this.f1.setTag(null);
        this.g1.setTag(null);
        this.h1.setTag(null);
        CoordinatorLayout coordinatorLayout = (CoordinatorLayout) objArr[0];
        this.G1 = coordinatorLayout;
        coordinatorLayout.setTag(null);
        ConstraintLayout constraintLayout = (ConstraintLayout) objArr[1];
        this.H1 = constraintLayout;
        constraintLayout.setTag(null);
        this.o1.setTag(null);
        this.p1.setTag(null);
        this.q1.setTag(null);
        this.r1.setTag(null);
        this.s1.setTag(null);
        this.t1.setTag(null);
        m25693Z(this.u1);
        this.v1.setTag(null);
        this.y1.setTag(null);
        a0(view);
        this.I1 = new jbc(this, 1);
        this.J1 = new sbc(this, 2);
        this.K1 = new jbc(this, 3);
        mo16291G();
    }
}
