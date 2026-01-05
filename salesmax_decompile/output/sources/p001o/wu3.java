package p001o;

import ai.salesmax.model.LeadsAddress;
import ai.salesmax.model.LeadsSummary;
import ai.salesmax.view.ViewProfileData;
import android.util.SparseIntArray;
import android.view.View;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.core.widget.NestedScrollView;
import com.google.android.gms.cast.MediaStatus;
import com.google.android.material.card.MaterialCardView;
import java.util.Date;
import java.util.List;
import lombok.javac.Javac;
import p001o.ewi;
import p001o.jbc;

/* loaded from: classes.dex */
public class wu3 extends vu3 implements jbc.InterfaceC14485a {
    public static final ewi.C13274i I0 = null;
    public static final SparseIntArray J0 = null;
    public final ViewProfileData A0;
    public final ViewProfileData B0;
    public final ViewProfileData C0;
    public final ViewProfileData D0;
    public final ViewProfileData E0;
    public final ViewProfileData F0;
    public final View.OnClickListener G0;
    public long H0;
    public final NestedScrollView s0;
    public final MaterialCardView t0;
    public final ViewProfileData u0;
    public final ViewProfileData v0;
    public final ViewProfileData w0;
    public final ViewProfileData x0;
    public final ViewProfileData y0;
    public final ViewProfileData z0;

    public wu3(yt4 yt4Var, View view) {
        this(yt4Var, view, ewi.m25671L(yt4Var, view, 16, I0, J0));
    }

    @Override // p001o.ewi
    /* renamed from: E */
    public boolean mo16290E() {
        synchronized (this) {
            return this.H0 != 0;
        }
    }

    @Override // p001o.ewi
    /* renamed from: G */
    public void mo16291G() {
        synchronized (this) {
            this.H0 = 8L;
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
            l0((Integer) obj);
        } else if (33 == i) {
            k0((ck6) obj);
        } else {
            if (67 != i) {
                return false;
            }
            j0((LeadsSummary) obj);
        }
        return true;
    }

    @Override // p001o.jbc.InterfaceC14485a
    /* renamed from: c */
    public final void mo16294c(int i, View view) {
        ck6 ck6Var = this.r0;
        LeadsSummary leadsSummary = this.p0;
        Integer num = this.q0;
        if (ck6Var != null) {
            ck6Var.mo708b(view, num.intValue(), leadsSummary);
        }
    }

    @Override // p001o.vu3
    public void j0(LeadsSummary leadsSummary) {
        this.p0 = leadsSummary;
        synchronized (this) {
            this.H0 |= 4;
        }
        m28509h(67);
        super.m25692R();
    }

    public void k0(ck6 ck6Var) {
        this.r0 = ck6Var;
        synchronized (this) {
            this.H0 |= 2;
        }
        m28509h(33);
        super.m25692R();
    }

    public void l0(Integer num) {
        this.q0 = num;
        synchronized (this) {
            this.H0 |= 1;
        }
        m28509h(73);
        super.m25692R();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:122:0x022a  */
    /* JADX WARN: Removed duplicated region for block: B:189:0x02d0  */
    /* JADX WARN: Removed duplicated region for block: B:192:0x02e1  */
    /* JADX WARN: Removed duplicated region for block: B:195:0x0380  */
    /* JADX WARN: Removed duplicated region for block: B:202:? A[RETURN, SYNTHETIC] */
    @Override // p001o.ewi
    /* renamed from: p */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void mo16295p() {
        long j;
        String str;
        List<String> list;
        String str2;
        String str3;
        String str4;
        String str5;
        List<String> list2;
        String str6;
        String str7;
        String str8;
        String str9;
        String str10;
        String str11;
        int i;
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        boolean z6;
        int i2;
        String str12;
        boolean zIsEmpty;
        long j2;
        String str13;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        Date activeDealStageUpdatedAt;
        String str14;
        String str15;
        LeadsAddress primaryAddress;
        String contactType;
        List<String> email;
        String contactOwnerName;
        String relatedBusiness;
        String designation;
        List<String> contactNumbers;
        String str16;
        String str17;
        String str18;
        String streetAddress;
        String country;
        synchronized (this) {
            j = this.H0;
            this.H0 = 0L;
        }
        LeadsSummary leadsSummary = this.p0;
        long j3 = j & 12;
        List<String> list3 = null;
        if (j3 != 0) {
            if (leadsSummary != null) {
                primaryAddress = leadsSummary.getPrimaryAddress();
                String activeDealStage = leadsSummary.getActiveDealStage();
                String companyName = leadsSummary.getCompanyName();
                contactType = leadsSummary.getContactType();
                email = leadsSummary.getEmail();
                contactOwnerName = leadsSummary.getContactOwnerName();
                relatedBusiness = leadsSummary.getRelatedBusiness();
                designation = leadsSummary.getDesignation();
                contactNumbers = leadsSummary.getContactNumbers();
                activeDealStageUpdatedAt = leadsSummary.getActiveDealStageUpdatedAt();
                str14 = activeDealStage;
                str15 = companyName;
            } else {
                activeDealStageUpdatedAt = null;
                str14 = null;
                str15 = null;
                primaryAddress = null;
                contactType = null;
                email = null;
                contactOwnerName = null;
                relatedBusiness = null;
                designation = null;
                contactNumbers = null;
            }
            if (primaryAddress != null) {
                String city = primaryAddress.getCity();
                String zipcode = primaryAddress.getZipcode();
                String state = primaryAddress.getState();
                String rawAddressText = primaryAddress.getRawAddressText();
                streetAddress = primaryAddress.getStreetAddress();
                country = primaryAddress.getCountry();
                str16 = city;
                list3 = rawAddressText;
                str18 = state;
                str17 = zipcode;
            } else {
                str16 = null;
                str17 = null;
                str18 = null;
                streetAddress = null;
                country = null;
            }
            boolean z7 = primaryAddress == null;
            boolean z8 = str14 == null;
            String str19 = str14 + "-";
            z = contactType == null;
            z2 = email == null;
            z3 = contactOwnerName == null;
            z4 = relatedBusiness == null;
            z5 = designation == null;
            z6 = contactNumbers == null;
            if (j3 != 0) {
                j |= z7 ? MediaStatus.COMMAND_PLAYBACK_RATE : MediaStatus.COMMAND_EDIT_TRACKS;
            }
            if ((j & 12) != 0) {
                j |= z8 ? 524288L : MediaStatus.COMMAND_STREAM_TRANSFER;
            }
            if ((j & 12) != 0) {
                j = z ? j | MediaStatus.COMMAND_DISLIKE : j | MediaStatus.COMMAND_LIKE;
            }
            if ((j & 12) != 0) {
                j = z2 ? j | MediaStatus.COMMAND_QUEUE_REPEAT_ONE : j | MediaStatus.COMMAND_QUEUE_REPEAT_ALL;
            }
            if ((j & 12) != 0) {
                j = z3 ? j | 512 : j | 256;
            }
            if ((j & 12) != 0) {
                j = z4 ? j | 2147483648L : j | 1073741824;
            }
            if ((j & 12) != 0) {
                j = z5 ? j | 8388608 : j | 4194304;
            }
            if ((j & 12) != 0) {
                j = z6 ? j | 134217728 : j | 67108864;
            }
            i = z7 ? 8 : 0;
            str5 = str19 + activeDealStageUpdatedAt;
            str7 = str15;
            list2 = list3;
            i2 = z8 ? 8 : 0;
            str3 = contactType;
            list = email;
            str = contactOwnerName;
            str2 = relatedBusiness;
            str4 = designation;
            list3 = contactNumbers;
            str8 = str16;
            str10 = str17;
            str11 = str18;
            str6 = streetAddress;
            str9 = country;
        } else {
            str = null;
            list = null;
            str2 = null;
            str3 = null;
            str4 = null;
            str5 = null;
            list2 = null;
            str6 = null;
            str7 = null;
            str8 = null;
            str9 = null;
            str10 = null;
            str11 = null;
            i = 0;
            z = false;
            z2 = false;
            z3 = false;
            z4 = false;
            z5 = false;
            z6 = false;
            i2 = 0;
        }
        boolean zIsEmpty2 = ((j & 256) == 0 || str == null) ? false : str.isEmpty();
        boolean zIsEmpty3 = ((j & MediaStatus.COMMAND_QUEUE_REPEAT_ALL) == 0 || list == null) ? false : list.isEmpty();
        boolean zIsEmpty4 = ((j & 67108864) == 0 || list3 == null) ? false : list3.isEmpty();
        boolean zIsEmpty5 = ((1073741824 & j) == 0 || str2 == null) ? false : str2.isEmpty();
        boolean zIsEmpty6 = ((MediaStatus.COMMAND_LIKE & j) == 0 || str3 == null) ? false : str3.isEmpty();
        if ((j & 4194304) != 0) {
            str12 = str4;
            if (str12 != null) {
                zIsEmpty = str12.isEmpty();
            }
            j2 = j & 12;
            if (j2 == 0) {
                if (z3) {
                    zIsEmpty2 = true;
                }
                if (z2) {
                    zIsEmpty3 = true;
                }
                if (z) {
                    zIsEmpty6 = true;
                }
                if (z5) {
                    zIsEmpty = true;
                }
                if (z6) {
                    zIsEmpty4 = true;
                }
                boolean z9 = z4 ? true : zIsEmpty5;
                if (j2 != 0) {
                    j |= zIsEmpty2 ? 536870912L : 268435456L;
                }
                if ((j & 12) != 0) {
                    j |= zIsEmpty3 ? 32L : 16L;
                }
                if ((j & 12) != 0) {
                    j |= zIsEmpty6 ? 33554432L : Javac.GENERATED_MEMBER;
                }
                if ((j & 12) != 0) {
                    j |= zIsEmpty ? MediaStatus.COMMAND_UNFOLLOW : MediaStatus.COMMAND_FOLLOW;
                }
                if ((j & 12) != 0) {
                    j |= zIsEmpty4 ? 128L : 64L;
                }
                if ((j & 12) != 0) {
                    j |= z9 ? 2097152L : 1048576L;
                }
                i4 = zIsEmpty2 ? 8 : 0;
                i6 = zIsEmpty3 ? 8 : 0;
                i5 = zIsEmpty6 ? 8 : 0;
                i7 = zIsEmpty ? 8 : 0;
                i8 = zIsEmpty4 ? 8 : 0;
                str13 = str2;
                i3 = z9 ? 8 : 0;
            } else {
                str13 = str2;
                i3 = 0;
                i4 = 0;
                i5 = 0;
                i6 = 0;
                i7 = 0;
                i8 = 0;
            }
            if ((j & 12) != 0) {
                this.n0.setVisibility(i8);
                nr1.W1(this.o0, str7);
                this.u0.setVisibility(i);
                nr1.W1(this.u0, list2);
                this.v0.setVisibility(i);
                nr1.W1(this.v0, str6);
                this.w0.setVisibility(i);
                nr1.W1(this.w0, str8);
                this.x0.setVisibility(i);
                nr1.W1(this.x0, str11);
                this.y0.setVisibility(i);
                nr1.W1(this.y0, str9);
                this.z0.setVisibility(i);
                nr1.W1(this.z0, str10);
                this.A0.setVisibility(i7);
                nr1.W1(this.A0, str12);
                this.B0.setVisibility(i6);
                nr1.x0(this.B0, list);
                this.C0.setVisibility(i5);
                nr1.W1(this.C0, str3);
                this.D0.setVisibility(i4);
                nr1.W1(this.D0, str);
                this.E0.setVisibility(i3);
                nr1.W1(this.E0, str13);
                this.F0.setVisibility(i2);
                nr1.W1(this.F0, str5);
            }
            if ((j & 8) == 0) {
                this.t0.setOnClickListener(this.G0);
                return;
            }
            return;
        }
        str12 = str4;
        zIsEmpty = false;
        j2 = j & 12;
        if (j2 == 0) {
        }
        if ((j & 12) != 0) {
        }
        if ((j & 8) == 0) {
        }
    }

    public wu3(yt4 yt4Var, View view, Object[] objArr) {
        super(yt4Var, view, 0, (LinearLayoutCompat) objArr[2], (ViewProfileData) objArr[4]);
        this.H0 = -1L;
        this.n0.setTag(null);
        this.o0.setTag(null);
        NestedScrollView nestedScrollView = (NestedScrollView) objArr[0];
        this.s0 = nestedScrollView;
        nestedScrollView.setTag(null);
        MaterialCardView materialCardView = (MaterialCardView) objArr[1];
        this.t0 = materialCardView;
        materialCardView.setTag(null);
        ViewProfileData viewProfileData = (ViewProfileData) objArr[10];
        this.u0 = viewProfileData;
        viewProfileData.setTag(null);
        ViewProfileData viewProfileData2 = (ViewProfileData) objArr[11];
        this.v0 = viewProfileData2;
        viewProfileData2.setTag(null);
        ViewProfileData viewProfileData3 = (ViewProfileData) objArr[12];
        this.w0 = viewProfileData3;
        viewProfileData3.setTag(null);
        ViewProfileData viewProfileData4 = (ViewProfileData) objArr[13];
        this.x0 = viewProfileData4;
        viewProfileData4.setTag(null);
        ViewProfileData viewProfileData5 = (ViewProfileData) objArr[14];
        this.y0 = viewProfileData5;
        viewProfileData5.setTag(null);
        ViewProfileData viewProfileData6 = (ViewProfileData) objArr[15];
        this.z0 = viewProfileData6;
        viewProfileData6.setTag(null);
        ViewProfileData viewProfileData7 = (ViewProfileData) objArr[3];
        this.A0 = viewProfileData7;
        viewProfileData7.setTag(null);
        ViewProfileData viewProfileData8 = (ViewProfileData) objArr[5];
        this.B0 = viewProfileData8;
        viewProfileData8.setTag(null);
        ViewProfileData viewProfileData9 = (ViewProfileData) objArr[6];
        this.C0 = viewProfileData9;
        viewProfileData9.setTag(null);
        ViewProfileData viewProfileData10 = (ViewProfileData) objArr[7];
        this.D0 = viewProfileData10;
        viewProfileData10.setTag(null);
        ViewProfileData viewProfileData11 = (ViewProfileData) objArr[8];
        this.E0 = viewProfileData11;
        viewProfileData11.setTag(null);
        ViewProfileData viewProfileData12 = (ViewProfileData) objArr[9];
        this.F0 = viewProfileData12;
        viewProfileData12.setTag(null);
        a0(view);
        this.G0 = new jbc(this, 1);
        mo16291G();
    }
}
