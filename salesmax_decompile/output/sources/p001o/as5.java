package p001o;

import ai.salesmax.model.BusinessInfo;
import ai.salesmax.model.CallLogs;
import ai.salesmax.model.ChatMessages;
import ai.salesmax.model.FileData;
import ai.salesmax.model.Leads;
import ai.salesmax.model.WaButton;
import android.util.SparseIntArray;
import android.view.View;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.SeekBar;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.gms.cast.MediaStatus;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.card.MaterialCardView;
import com.google.android.material.chip.Chip;
import com.google.android.material.imageview.ShapeableImageView;
import com.google.android.material.textview.MaterialTextView;
import java.util.ArrayList;
import java.util.List;
import lombok.javac.Javac;
import p001o.ewi;
import p001o.jbc;
import p001o.sbc;

/* loaded from: classes.dex */
public class as5 extends zr5 implements jbc.InterfaceC14485a, sbc.InterfaceC16795a {
    public static final ewi.C13274i b2 = null;
    public static final SparseIntArray c2;
    public final View A1;
    public final View.OnClickListener B1;
    public final View.OnLongClickListener C1;
    public final View.OnLongClickListener D1;
    public final View.OnClickListener E1;
    public final View.OnLongClickListener F1;
    public final View.OnClickListener G1;
    public final View.OnLongClickListener H1;
    public final View.OnClickListener I1;
    public final View.OnClickListener J1;
    public final View.OnLongClickListener K1;
    public final View.OnClickListener L1;
    public final View.OnClickListener M1;
    public final View.OnLongClickListener N1;
    public final View.OnClickListener O1;
    public final View.OnLongClickListener P1;
    public final View.OnLongClickListener Q1;
    public final View.OnLongClickListener R1;
    public final View.OnLongClickListener S1;
    public final View.OnClickListener T1;
    public final View.OnClickListener U1;
    public final View.OnLongClickListener V1;
    public final View.OnClickListener W1;
    public final View.OnClickListener X1;
    public final View.OnClickListener Y1;
    public final View.OnLongClickListener Z1;
    public long a2;
    public final LinearLayout v1;
    public final ConstraintLayout w1;
    public final LinearLayout x1;
    public final ProgressBar y1;
    public final LinearLayout z1;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        c2 = sparseIntArray;
        sparseIntArray.put(z8e.leadTitle, 45);
        sparseIntArray.put(z8e.closeDialog, 46);
        sparseIntArray.put(z8e.frame_container_ivContactProfilePicInLead, 47);
        sparseIntArray.put(z8e.callTimeBlock, 48);
        sparseIntArray.put(z8e.layoutMessageWithImage, 49);
        sparseIntArray.put(z8e.image_line, 50);
        sparseIntArray.put(z8e.ivFileView, 51);
        sparseIntArray.put(z8e.seekBar, 52);
        sparseIntArray.put(z8e.tvDuration, 53);
        sparseIntArray.put(z8e.threeButtonsContainerFirstPart, 54);
        sparseIntArray.put(z8e.quickActionBar, 55);
        sparseIntArray.put(z8e.newLeadWhatsappButton, 56);
        sparseIntArray.put(z8e.callButton, 57);
        sparseIntArray.put(z8e.dismissAllOptionBar, 58);
        sparseIntArray.put(z8e.dimissAllButton, 59);
        sparseIntArray.put(z8e.viewNextButton, 60);
    }

    public as5(yt4 yt4Var, View view) {
        this(yt4Var, view, ewi.m25671L(yt4Var, view, 61, b2, c2));
    }

    @Override // p001o.ewi
    /* renamed from: E */
    public boolean mo16290E() {
        synchronized (this) {
            return this.a2 != 0;
        }
    }

    @Override // p001o.ewi
    /* renamed from: G */
    public void mo16291G() {
        synchronized (this) {
            this.a2 = 32L;
        }
        m25692R();
    }

    @Override // p001o.ewi
    /* renamed from: M */
    public boolean mo16292M(int i, Object obj, int i2) {
        return false;
    }

    @Override // p001o.sbc.InterfaceC16795a
    /* renamed from: a */
    public final boolean mo16293a(int i, View view) {
        if (i == 2) {
            ck6 ck6Var = this.t1;
            ChatMessages chatMessages = this.q1;
            Integer num = this.s1;
            if (ck6Var != null) {
                return ck6Var.mo707a(view, num.intValue(), chatMessages);
            }
            return false;
        }
        if (i == 4) {
            ck6 ck6Var2 = this.t1;
            ChatMessages chatMessages2 = this.q1;
            Integer num2 = this.s1;
            if (ck6Var2 != null) {
                return ck6Var2.mo707a(view, num2.intValue(), chatMessages2);
            }
            return false;
        }
        if (i == 6) {
            ck6 ck6Var3 = this.t1;
            ChatMessages chatMessages3 = this.q1;
            Integer num3 = this.s1;
            if (ck6Var3 != null) {
                return ck6Var3.mo707a(view, num3.intValue(), chatMessages3);
            }
            return false;
        }
        if (i == 9) {
            ck6 ck6Var4 = this.t1;
            ChatMessages chatMessages4 = this.q1;
            Integer num4 = this.s1;
            if (ck6Var4 != null) {
                return ck6Var4.mo707a(view, num4.intValue(), chatMessages4);
            }
            return false;
        }
        if (i == 11) {
            ck6 ck6Var5 = this.t1;
            ChatMessages chatMessages5 = this.q1;
            Integer num5 = this.s1;
            if (ck6Var5 != null) {
                return ck6Var5.mo707a(view, num5.intValue(), chatMessages5);
            }
            return false;
        }
        if (i == 13) {
            ck6 ck6Var6 = this.t1;
            ChatMessages chatMessages6 = this.q1;
            Integer num6 = this.s1;
            if (ck6Var6 != null) {
                return ck6Var6.mo707a(view, num6.intValue(), chatMessages6);
            }
            return false;
        }
        if (i == 15) {
            ck6 ck6Var7 = this.t1;
            ChatMessages chatMessages7 = this.q1;
            Integer num7 = this.s1;
            if (ck6Var7 != null) {
                return ck6Var7.mo707a(view, num7.intValue(), chatMessages7);
            }
            return false;
        }
        if (i == 17) {
            ck6 ck6Var8 = this.t1;
            ChatMessages chatMessages8 = this.q1;
            Integer num8 = this.s1;
            if (ck6Var8 != null) {
                return ck6Var8.mo707a(view, num8.intValue(), chatMessages8);
            }
            return false;
        }
        if (i == 20) {
            ck6 ck6Var9 = this.t1;
            ChatMessages chatMessages9 = this.q1;
            Integer num9 = this.s1;
            if (ck6Var9 != null) {
                return ck6Var9.mo707a(view, num9.intValue(), chatMessages9);
            }
            return false;
        }
        if (i == 22) {
            ck6 ck6Var10 = this.t1;
            ChatMessages chatMessages10 = this.q1;
            Integer num10 = this.s1;
            if (ck6Var10 != null) {
                return ck6Var10.mo707a(view, num10.intValue(), chatMessages10);
            }
            return false;
        }
        if (i == 24) {
            ck6 ck6Var11 = this.t1;
            ChatMessages chatMessages11 = this.q1;
            Integer num11 = this.s1;
            if (ck6Var11 != null) {
                return ck6Var11.mo707a(view, num11.intValue(), chatMessages11);
            }
            return false;
        }
        if (i != 25) {
            return false;
        }
        ck6 ck6Var12 = this.t1;
        ChatMessages chatMessages12 = this.q1;
        Integer num12 = this.s1;
        if (ck6Var12 != null) {
            return ck6Var12.mo707a(view, num12.intValue(), chatMessages12);
        }
        return false;
    }

    @Override // p001o.ewi
    public boolean b0(int i, Object obj) {
        if (33 == i) {
            n0((ck6) obj);
        } else if (27 == i) {
            k0((Leads) obj);
        } else if (7 == i) {
            m0((rog) obj);
        } else if (73 == i) {
            p0((Integer) obj);
        } else {
            if (67 != i) {
                return false;
            }
            l0((ChatMessages) obj);
        }
        return true;
    }

    @Override // p001o.jbc.InterfaceC14485a
    /* renamed from: c */
    public final void mo16294c(int i, View view) {
        if (i == 1) {
            ck6 ck6Var = this.t1;
            ChatMessages chatMessages = this.q1;
            Integer num = this.s1;
            if (ck6Var != null) {
                ck6Var.mo708b(view, num.intValue(), chatMessages);
                return;
            }
            return;
        }
        if (i == 3) {
            ck6 ck6Var2 = this.t1;
            ChatMessages chatMessages2 = this.q1;
            Integer num2 = this.s1;
            if (ck6Var2 != null) {
                ck6Var2.mo708b(view, num2.intValue(), chatMessages2);
                return;
            }
            return;
        }
        if (i == 5) {
            ck6 ck6Var3 = this.t1;
            ChatMessages chatMessages3 = this.q1;
            Integer num3 = this.s1;
            if (ck6Var3 != null) {
                ck6Var3.mo708b(view, num3.intValue(), chatMessages3);
                return;
            }
            return;
        }
        if (i == 10) {
            ck6 ck6Var4 = this.t1;
            ChatMessages chatMessages4 = this.q1;
            Integer num4 = this.s1;
            if (ck6Var4 != null) {
                ck6Var4.mo708b(view, num4.intValue(), chatMessages4);
                return;
            }
            return;
        }
        if (i == 12) {
            ck6 ck6Var5 = this.t1;
            ChatMessages chatMessages5 = this.q1;
            Integer num5 = this.s1;
            if (ck6Var5 != null) {
                ck6Var5.mo708b(view, num5.intValue(), chatMessages5);
                return;
            }
            return;
        }
        if (i == 14) {
            ck6 ck6Var6 = this.t1;
            ChatMessages chatMessages6 = this.q1;
            Integer num6 = this.s1;
            if (ck6Var6 != null) {
                ck6Var6.mo708b(view, num6.intValue(), chatMessages6);
                return;
            }
            return;
        }
        if (i == 16) {
            ck6 ck6Var7 = this.t1;
            ChatMessages chatMessages7 = this.q1;
            Integer num7 = this.s1;
            if (ck6Var7 != null) {
                ck6Var7.mo708b(view, num7.intValue(), chatMessages7);
                return;
            }
            return;
        }
        if (i == 21) {
            ck6 ck6Var8 = this.t1;
            ChatMessages chatMessages8 = this.q1;
            Integer num8 = this.s1;
            if (ck6Var8 != null) {
                ck6Var8.mo708b(view, num8.intValue(), chatMessages8);
                return;
            }
            return;
        }
        if (i == 23) {
            ck6 ck6Var9 = this.t1;
            ChatMessages chatMessages9 = this.q1;
            Integer num9 = this.s1;
            if (ck6Var9 != null) {
                ck6Var9.mo708b(view, num9.intValue(), chatMessages9);
                return;
            }
            return;
        }
        if (i == 7) {
            ck6 ck6Var10 = this.t1;
            ChatMessages chatMessages10 = this.q1;
            Integer num10 = this.s1;
            if (ck6Var10 != null) {
                ck6Var10.mo708b(view, num10.intValue(), chatMessages10);
                return;
            }
            return;
        }
        if (i == 8) {
            ck6 ck6Var11 = this.t1;
            ChatMessages chatMessages11 = this.q1;
            Integer num11 = this.s1;
            if (ck6Var11 != null) {
                ck6Var11.mo708b(view, num11.intValue(), chatMessages11);
                return;
            }
            return;
        }
        if (i == 18) {
            ck6 ck6Var12 = this.t1;
            ChatMessages chatMessages12 = this.q1;
            Integer num12 = this.s1;
            if (ck6Var12 != null) {
                ck6Var12.mo708b(view, num12.intValue(), chatMessages12);
                return;
            }
            return;
        }
        if (i != 19) {
            return;
        }
        ck6 ck6Var13 = this.t1;
        ChatMessages chatMessages13 = this.q1;
        Integer num13 = this.s1;
        if (ck6Var13 != null) {
            ck6Var13.mo708b(view, num13.intValue(), chatMessages13);
        }
    }

    @Override // p001o.zr5
    public void k0(Leads leads) {
        this.r1 = leads;
        synchronized (this) {
            this.a2 |= 2;
        }
        m28509h(27);
        super.m25692R();
    }

    @Override // p001o.zr5
    public void l0(ChatMessages chatMessages) {
        this.q1 = chatMessages;
        synchronized (this) {
            this.a2 |= 16;
        }
        m28509h(67);
        super.m25692R();
    }

    public void m0(rog rogVar) {
        this.u1 = rogVar;
        synchronized (this) {
            this.a2 |= 4;
        }
        m28509h(7);
        super.m25692R();
    }

    public void n0(ck6 ck6Var) {
        this.t1 = ck6Var;
        synchronized (this) {
            this.a2 |= 1;
        }
        m28509h(33);
        super.m25692R();
    }

    /* JADX WARN: Removed duplicated region for block: B:182:0x02e9  */
    /* JADX WARN: Removed duplicated region for block: B:189:0x02fd  */
    /* JADX WARN: Removed duplicated region for block: B:192:0x030a  */
    /* JADX WARN: Removed duplicated region for block: B:200:0x031f  */
    /* JADX WARN: Removed duplicated region for block: B:203:0x032a  */
    /* JADX WARN: Removed duplicated region for block: B:214:0x0345  */
    /* JADX WARN: Removed duplicated region for block: B:217:0x034f  */
    /* JADX WARN: Removed duplicated region for block: B:222:0x0362  */
    /* JADX WARN: Removed duplicated region for block: B:226:0x036f A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:228:0x0376  */
    /* JADX WARN: Removed duplicated region for block: B:231:0x0382  */
    /* JADX WARN: Removed duplicated region for block: B:238:0x0395  */
    /* JADX WARN: Removed duplicated region for block: B:241:0x03a0  */
    /* JADX WARN: Removed duplicated region for block: B:252:0x03b7 A[PHI: r2
      0x03b7: PHI (r2v8 long) = (r2v7 long), (r2v30 long) binds: [B:240:0x039e, B:249:0x03b1] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:255:0x03c0  */
    /* JADX WARN: Removed duplicated region for block: B:263:0x03ea  */
    /* JADX WARN: Removed duplicated region for block: B:266:0x03f3  */
    /* JADX WARN: Removed duplicated region for block: B:277:0x040d A[PHI: r2
      0x040d: PHI (r2v11 long) = (r2v10 long), (r2v21 long) binds: [B:265:0x03f1, B:274:0x0408] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:280:0x0416 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:282:0x041b  */
    /* JADX WARN: Removed duplicated region for block: B:285:0x0422 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:287:0x0429  */
    /* JADX WARN: Removed duplicated region for block: B:290:0x0435  */
    /* JADX WARN: Removed duplicated region for block: B:299:0x044f  */
    /* JADX WARN: Removed duplicated region for block: B:302:0x045a  */
    /* JADX WARN: Removed duplicated region for block: B:305:0x0463  */
    /* JADX WARN: Removed duplicated region for block: B:308:0x046c  */
    /* JADX WARN: Removed duplicated region for block: B:320:0x0484  */
    /* JADX WARN: Removed duplicated region for block: B:323:0x048d  */
    /* JADX WARN: Removed duplicated region for block: B:324:0x053d  */
    /* JADX WARN: Removed duplicated region for block: B:327:0x0548  */
    /* JADX WARN: Removed duplicated region for block: B:330:0x0600  */
    /* JADX WARN: Removed duplicated region for block: B:333:0x0656  */
    /* JADX WARN: Removed duplicated region for block: B:340:? A[RETURN, SYNTHETIC] */
    @Override // p001o.ewi
    /* renamed from: p */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void mo16295p() throws NumberFormatException {
        long j;
        int i;
        Integer num;
        String str;
        int i2;
        String str2;
        BusinessInfo addedBusiness;
        boolean showSelection;
        boolean z;
        boolean z2;
        int i3;
        String str3;
        int i4;
        String str4;
        String str5;
        String str6;
        String waText;
        int i5;
        String str7;
        String waText2;
        FileData fileData;
        int i6;
        int i7;
        int i8;
        int i9;
        String str8;
        boolean z3;
        int i10;
        boolean zIsUploaded;
        String str9;
        String website;
        long j2;
        long j3;
        boolean z4;
        boolean z5;
        long j4;
        int i11;
        String str10;
        int i12;
        long j5;
        long j6;
        int i13;
        boolean z6;
        long j7;
        int i14;
        long j8;
        ArrayList<CallLogs> arrayList;
        boolean z7;
        long j9;
        int i15;
        int i16;
        List<WaButton> list;
        boolean z8;
        boolean zIsNewItem;
        FileData messageFile;
        ChatMessages replyingToMessage;
        boolean z9;
        int size;
        WaButton waButton;
        WaButton waButton2;
        WaButton waButton3;
        String fileName;
        String mimeType;
        String messageUserName;
        String messageText;
        String contactOwner;
        synchronized (this) {
            j = this.a2;
            this.a2 = 0L;
        }
        Leads leads = this.r1;
        rog rogVar = this.u1;
        ChatMessages chatMessages = this.q1;
        long j10 = j & 34;
        if (j10 != 0) {
            if (leads != null) {
                addedBusiness = leads.getAddedBusiness();
                Integer unsuccessfulCallAttempts = leads.getUnsuccessfulCallAttempts();
                contactOwner = leads.getContactOwner();
                showSelection = leads.getShowSelection();
                num = unsuccessfulCallAttempts;
            } else {
                num = null;
                addedBusiness = null;
                contactOwner = null;
                showSelection = false;
            }
            if (j10 != 0) {
                j = showSelection ? j | 8388608 | 137438953472L | 35184372088832L : j | 4194304 | 68719476736L | 17592186044416L;
            }
            boolean z10 = leads == null;
            if ((j & 34) != 0) {
                j |= z10 ? MediaStatus.COMMAND_UNFOLLOW : MediaStatus.COMMAND_FOLLOW;
            }
            z = addedBusiness != null;
            String str11 = "(" + num;
            i2 = showSelection ? 8 : 0;
            i = z10 ? 8 : 0;
            if ((j & 34) != 0) {
                j = z ? j | 128 : j | 64;
            }
            str = str11 + ")";
            str2 = contactOwner;
        } else {
            i = 0;
            num = null;
            str = null;
            i2 = 0;
            str2 = null;
            addedBusiness = null;
            showSelection = false;
            z = false;
        }
        long j11 = j & 38;
        if (j11 != 0) {
            z2 = rogVar != null;
            if (j11 != 0) {
                j = z2 ? j | MediaStatus.COMMAND_DISLIKE : j | MediaStatus.COMMAND_LIKE;
            }
        } else {
            z2 = false;
        }
        long j12 = j & 48;
        if (j12 != 0) {
            if (chatMessages != null) {
                zIsNewItem = chatMessages.isNewItem();
                List<WaButton> buttons = chatMessages.getButtons();
                boolean showSelection2 = chatMessages.getShowSelection();
                messageFile = chatMessages.getMessageFile();
                replyingToMessage = chatMessages.getReplyingToMessage();
                list = buttons;
                z8 = showSelection2;
            } else {
                list = null;
                z8 = false;
                zIsNewItem = false;
                messageFile = null;
                replyingToMessage = null;
            }
            if (j12 != 0) {
                j |= zIsNewItem ? 2199023255552L : 1099511627776L;
            }
            if ((j & 48) != 0) {
                j |= z8 ? 34359738368L : 17179869184L;
            }
            boolean z11 = chatMessages == null;
            if ((j & 48) != 0) {
                j |= z11 ? 536870912L : 268435456L;
            }
            int i17 = zIsNewItem ? 0 : 8;
            i5 = z8 ? 8 : 0;
            boolean z12 = replyingToMessage == null;
            int i18 = z11 ? 8 : 0;
            if ((j & 48) != 0) {
                j |= z12 ? 549755813888L : 274877906944L;
            }
            if (list != null) {
                size = list.size();
                waButton2 = (WaButton) ewi.m25667A(list, 2);
                waButton3 = (WaButton) ewi.m25667A(list, 1);
                z9 = false;
                waButton = (WaButton) ewi.m25667A(list, 0);
            } else {
                z9 = false;
                size = 0;
                waButton = null;
                waButton2 = null;
                waButton3 = null;
            }
            if (messageFile != null) {
                fileName = messageFile.getFileName();
                zIsUploaded = messageFile.isUploaded();
                mimeType = messageFile.getMimeType();
            } else {
                zIsUploaded = z9;
                fileName = null;
                mimeType = null;
            }
            if ((j & 48) != 0) {
                j = zIsUploaded ? j | 134217728 : j | 67108864;
            }
            if (replyingToMessage != null) {
                messageText = replyingToMessage.getMessageText();
                messageUserName = replyingToMessage.getMessageUserName();
            } else {
                messageUserName = null;
                messageText = null;
            }
            boolean z13 = z12 ? 8 : z9;
            boolean z14 = size == 1 ? true : z9;
            boolean z15 = size == 2;
            boolean z16 = size == 3;
            if ((j & 48) != 0) {
                j |= z14 ? 562949953421312L : 281474976710656L;
            }
            if ((j & 48) != 0) {
                j |= z15 ? MediaStatus.COMMAND_QUEUE_REPEAT_ONE : MediaStatus.COMMAND_QUEUE_REPEAT_ALL;
            }
            if ((j & 48) != 0) {
                j |= z16 ? 2147483648L : 1073741824L;
            }
            waText2 = waButton2 != null ? waButton2.getWaText() : null;
            String waText3 = waButton3 != null ? waButton3.getWaText() : null;
            waText = waButton != null ? waButton.getWaText() : null;
            int i19 = z14 ? 0 : 8;
            int i20 = z15 ? 0 : 8;
            i10 = i19;
            str9 = messageText;
            z3 = z13;
            i9 = z16 ? 0 : 8;
            str6 = mimeType;
            String str12 = messageUserName;
            i8 = i20;
            str5 = waText3;
            str8 = str12;
            String str13 = fileName;
            i3 = i;
            str7 = str13;
            FileData fileData2 = messageFile;
            str3 = str;
            fileData = fileData2;
            int i21 = i17;
            i4 = i2;
            i6 = i21;
            int i22 = i18;
            str4 = str2;
            i7 = i22;
        } else {
            i3 = i;
            str3 = str;
            i4 = i2;
            str4 = str2;
            str5 = null;
            str6 = null;
            waText = null;
            i5 = 0;
            str7 = null;
            waText2 = null;
            fileData = null;
            i6 = 0;
            i7 = 0;
            i8 = 0;
            i9 = 0;
            str8 = null;
            z3 = false;
            i10 = 0;
            zIsUploaded = false;
            str9 = null;
        }
        boolean viewOnly = ((j & 67108864) == 0 || fileData == null) ? false : fileData.getViewOnly();
        boolean zM47035a = ((j & MediaStatus.COMMAND_DISLIKE) == 0 || rogVar == null) ? false : rogVar.m47035a();
        if ((j & 128) != 0) {
            website = addedBusiness != null ? addedBusiness.getWebsite() : null;
            boolean z17 = website != null;
            j2 = j & 34;
            if (j2 == 0) {
                if (!z) {
                    z17 = false;
                }
                if (j2 != 0) {
                    j = z17 ? j | 8796093022208L : j | 4398046511104L;
                }
            } else {
                z17 = false;
            }
            j3 = j & 38;
            if (j3 == 0) {
                if (!z2) {
                    zM47035a = false;
                }
                z4 = true;
                z5 = !zM47035a;
                if (j3 != 0) {
                    j = z5 ? j | 524288 : j | MediaStatus.COMMAND_STREAM_TRANSFER;
                }
            } else {
                z4 = true;
                z5 = false;
            }
            j4 = j & 48;
            if (j4 == 0) {
                if (zIsUploaded) {
                    viewOnly = z4;
                }
                if (j4 != 0) {
                    j |= viewOnly ? 33554432L : Javac.GENERATED_MEMBER;
                }
                i11 = viewOnly ? 8 : 0;
            } else {
                i11 = 0;
            }
            if ((j & 8796093022208L) == 0) {
                if (addedBusiness != null) {
                    website = addedBusiness.getWebsite();
                }
                i12 = i7;
                String str14 = website;
                str10 = str6;
                boolean z18 = str14 != "" ? z4 : false;
                boolean zHasContactOwner = ((j & 524288) == 0 || leads == null) ? false : leads.hasContactOwner();
                j5 = j & 38;
                if (j5 != 0) {
                    if (!z5) {
                        zHasContactOwner = false;
                    }
                    if (j5 != 0) {
                        j = zHasContactOwner ? j | 8589934592L : j | 4294967296L;
                    }
                } else {
                    zHasContactOwner = false;
                }
                j6 = j & 34;
                if (j6 == 0) {
                    i13 = 0;
                } else {
                    if (!z17) {
                        z18 = false;
                    }
                    if (j6 != 0) {
                        j |= z18 ? 2097152L : 1048576L;
                    }
                    if (!z18) {
                        i13 = 8;
                    }
                }
                if ((j & 8589934592L) != 0) {
                    if (leads != null) {
                        showSelection = leads.getShowSelection();
                    }
                    if ((j & 34) != 0) {
                        j = showSelection ? j | 8388608 | 137438953472L | 35184372088832L : j | 4194304 | 68719476736L | 17592186044416L;
                    }
                    z6 = !showSelection;
                } else {
                    z6 = false;
                }
                j7 = j & 38;
                if (j7 == 0) {
                    i14 = 0;
                } else {
                    if (!zHasContactOwner) {
                        z6 = false;
                    }
                    if (j7 != 0) {
                        j |= z6 ? 140737488355328L : 70368744177664L;
                    }
                    if (!z6) {
                        i14 = 4;
                    }
                }
                boolean z19 = ((j & 68719476736L) == 0 || num != null) ? false : z4;
                ArrayList<CallLogs> callHistory = ((j & 17592186044416L) == 0 || leads == null) ? null : leads.getCallHistory();
                j8 = j & 34;
                if (j8 != 0) {
                    if (showSelection) {
                        z19 = z4;
                    }
                    if (showSelection) {
                        callHistory = null;
                    }
                    if (j8 != 0) {
                        j = z19 ? j | 512 : j | 256;
                    }
                    ArrayList<CallLogs> arrayList2 = callHistory;
                    z7 = z19;
                    arrayList = arrayList2;
                } else {
                    arrayList = null;
                    z7 = false;
                }
                boolean z20 = ((j & 256) == 0 || ewi.m25674U(num) != 0) ? false : z4;
                j9 = j & 34;
                if (j9 != 0) {
                    if (!z7) {
                        z4 = z20;
                    }
                    if (j9 != 0) {
                        j |= z4 ? MediaStatus.COMMAND_PLAYBACK_RATE : MediaStatus.COMMAND_EDIT_TRACKS;
                    }
                    i15 = z4 ? 8 : 0;
                } else {
                    i15 = 0;
                }
                if ((j & 48) != 0) {
                    i16 = i14;
                    this.n0.setVisibility(i6);
                    nr1.m40962g(this.o0, chatMessages);
                    fjh.m26938c(this.q0, waText);
                    fjh.m26938c(this.r0, waText);
                    fjh.m26938c(this.s0, waText);
                    fjh.m26938c(this.t0, str5);
                    fjh.m26938c(this.u0, str5);
                    fjh.m26938c(this.v0, waText2);
                    this.y0.setVisibility(i5);
                    nr1.O1(this.K0, fileData);
                    nr1.n2(this.M0, fileData);
                    fjh.m26938c(this.N0, str7);
                    nr1.x2(this.O0, chatMessages);
                    nr1.q2(this.Q0, str10);
                    nr1.U1(this.S0, chatMessages);
                    nr1.T2(this.T0, chatMessages);
                    this.w1.setVisibility(i12);
                    nr1.n2(this.x1, fileData);
                    this.y1.setVisibility(i11);
                    nr1.I0(this.z1, chatMessages);
                    nr1.m40961f(this.A1, fileData);
                    this.Z0.setVisibility(i10);
                    this.b1.setVisibility(z3 ? 1 : 0);
                    nr1.m40965j(this.d1, chatMessages);
                    String str15 = str9;
                    fjh.m26938c(this.e1, str15);
                    fjh.m26938c(this.f1, str15);
                    String str16 = str8;
                    fjh.m26938c(this.g1, str16);
                    fjh.m26938c(this.h1, str16);
                    this.i1.setVisibility(i9);
                    fu5.m27486a(this.m1, chatMessages);
                    this.o1.setVisibility(i8);
                } else {
                    i16 = i14;
                }
                if ((32 & j) != 0) {
                    this.p0.setOnClickListener(this.T1);
                    this.I0.setOnClickListener(this.E1);
                    this.I0.setOnLongClickListener(this.S1);
                    this.K0.setOnClickListener(this.G1);
                    this.K0.setOnLongClickListener(this.V1);
                    this.L0.setOnClickListener(this.O1);
                    this.L0.setOnLongClickListener(this.H1);
                    this.M0.setOnClickListener(this.U1);
                    this.M0.setOnLongClickListener(this.Z1);
                    this.N0.setOnClickListener(this.B1);
                    this.N0.setOnLongClickListener(this.F1);
                    this.O0.setOnClickListener(this.W1);
                    this.P0.setOnClickListener(this.M1);
                    this.P0.setOnLongClickListener(this.P1);
                    this.Q0.setOnClickListener(this.I1);
                    this.Q0.setOnLongClickListener(this.K1);
                    this.S0.setOnClickListener(this.X1);
                    this.S0.setOnLongClickListener(this.D1);
                    this.T0.setOnClickListener(this.L1);
                    this.T0.setOnLongClickListener(this.R1);
                    this.W0.setOnClickListener(this.J1);
                    this.W0.setOnLongClickListener(this.C1);
                    this.d1.setOnClickListener(this.Y1);
                    this.d1.setOnLongClickListener(this.N1);
                    this.h1.setOnLongClickListener(this.Q1);
                }
                if ((34 & j) != 0) {
                    this.w0.setVisibility(i15);
                    fjh.m26938c(this.w0, str3);
                    nr1.u2(this.y0, arrayList);
                    this.A0.setVisibility(i4);
                    nr1.v2(this.A0, arrayList);
                    this.E0.setVisibility(i3);
                    this.G0.setVisibility(i13);
                    nr1.N0(this.J0, leads);
                    nr1.X0(this.L0, leads);
                    nr1.u0(this.V0, leads);
                    nr1.m40944O(this.W0, leads);
                    nr1.g1(this.W0, str4);
                    nr1.d1(this.k1, leads);
                    nr1.Z0(this.l1, leads);
                }
                if ((j & 38) != 0) {
                    this.W0.setVisibility(i16);
                    return;
                }
                return;
            }
            str10 = str6;
            i12 = i7;
            if ((j & 524288) == 0) {
            }
            j5 = j & 38;
            if (j5 != 0) {
            }
            j6 = j & 34;
            if (j6 == 0) {
            }
            if ((j & 8589934592L) != 0) {
            }
            j7 = j & 38;
            if (j7 == 0) {
            }
            if ((j & 68719476736L) == 0) {
            }
            if ((j & 17592186044416L) == 0) {
            }
            j8 = j & 34;
            if (j8 != 0) {
            }
            if ((j & 256) == 0) {
            }
            j9 = j & 34;
            if (j9 != 0) {
            }
            if ((j & 48) != 0) {
            }
            if ((32 & j) != 0) {
            }
            if ((34 & j) != 0) {
            }
            if ((j & 38) != 0) {
            }
        } else {
            website = null;
        }
        j2 = j & 34;
        if (j2 == 0) {
        }
        j3 = j & 38;
        if (j3 == 0) {
        }
        j4 = j & 48;
        if (j4 == 0) {
        }
        if ((j & 8796093022208L) == 0) {
        }
        if ((j & 524288) == 0) {
        }
        j5 = j & 38;
        if (j5 != 0) {
        }
        j6 = j & 34;
        if (j6 == 0) {
        }
        if ((j & 8589934592L) != 0) {
        }
        j7 = j & 38;
        if (j7 == 0) {
        }
        if ((j & 68719476736L) == 0) {
        }
        if ((j & 17592186044416L) == 0) {
        }
        j8 = j & 34;
        if (j8 != 0) {
        }
        if ((j & 256) == 0) {
        }
        j9 = j & 34;
        if (j9 != 0) {
        }
        if ((j & 48) != 0) {
        }
        if ((32 & j) != 0) {
        }
        if ((34 & j) != 0) {
        }
        if ((j & 38) != 0) {
        }
    }

    public void p0(Integer num) {
        this.s1 = num;
        synchronized (this) {
            this.a2 |= 8;
        }
        m28509h(73);
        super.m25692R();
    }

    public as5(yt4 yt4Var, View view, Object[] objArr) {
        super(yt4Var, view, 0, (TextView) objArr[4], (MaterialButton) objArr[35], (ImageButton) objArr[28], (Button) objArr[42], (Button) objArr[37], (Button) objArr[39], (Button) objArr[43], (Button) objArr[40], (Button) objArr[44], (MaterialTextView) objArr[12], (MaterialButton) objArr[57], (MaterialTextView) objArr[13], (LinearLayout) objArr[48], (ShapeableImageView) objArr[11], (ShapeableImageView) objArr[46], (MaterialButton) objArr[59], (LinearLayout) objArr[58], (ConstraintLayout) objArr[1], (FrameLayout) objArr[47], (ShapeableImageView) objArr[8], (View) objArr[50], (CardView) objArr[15], (ShapeableImageView) objArr[6], (ShapeableImageView) objArr[31], (ShapeableImageView) objArr[3], (LinearLayout) objArr[22], (MaterialTextView) objArr[25], (ShapeableImageView) objArr[20], (MaterialCardView) objArr[23], (ShapeableImageView) objArr[24], (MaterialCardView) objArr[51], (ShapeableImageView) objArr[29], (ShapeableImageView) objArr[21], (LinearLayout) objArr[49], (MaterialTextView) objArr[5], (Chip) objArr[10], (MaterialTextView) objArr[45], (MaterialButton) objArr[56], (LinearLayout) objArr[36], (LinearLayout) objArr[55], (ConstraintLayout) objArr[16], (SeekBar) objArr[52], (MaterialTextView) objArr[32], (MaterialTextView) objArr[18], (MaterialTextView) objArr[33], (MaterialTextView) objArr[17], (MaterialTextView) objArr[34], (LinearLayout) objArr[41], (LinearLayout) objArr[54], (MaterialTextView) objArr[7], (MaterialTextView) objArr[9], (MaterialTextView) objArr[2], (TextView) objArr[53], (LinearLayout) objArr[38], (MaterialButton) objArr[60]);
        this.a2 = -1L;
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
        this.y0.setTag(null);
        this.A0.setTag(null);
        this.E0.setTag(null);
        this.G0.setTag(null);
        this.I0.setTag(null);
        this.J0.setTag(null);
        this.K0.setTag(null);
        this.L0.setTag(null);
        this.M0.setTag(null);
        this.N0.setTag(null);
        this.O0.setTag(null);
        this.P0.setTag(null);
        this.Q0.setTag(null);
        this.S0.setTag(null);
        this.T0.setTag(null);
        this.V0.setTag(null);
        this.W0.setTag(null);
        LinearLayout linearLayout = (LinearLayout) objArr[0];
        this.v1 = linearLayout;
        linearLayout.setTag(null);
        ConstraintLayout constraintLayout = (ConstraintLayout) objArr[14];
        this.w1 = constraintLayout;
        constraintLayout.setTag(null);
        LinearLayout linearLayout2 = (LinearLayout) objArr[19];
        this.x1 = linearLayout2;
        linearLayout2.setTag(null);
        ProgressBar progressBar = (ProgressBar) objArr[26];
        this.y1 = progressBar;
        progressBar.setTag(null);
        LinearLayout linearLayout3 = (LinearLayout) objArr[27];
        this.z1 = linearLayout3;
        linearLayout3.setTag(null);
        View view2 = (View) objArr[30];
        this.A1 = view2;
        view2.setTag(null);
        this.Z0.setTag(null);
        this.b1.setTag(null);
        this.d1.setTag(null);
        this.e1.setTag(null);
        this.f1.setTag(null);
        this.g1.setTag(null);
        this.h1.setTag(null);
        this.i1.setTag(null);
        this.k1.setTag(null);
        this.l1.setTag(null);
        this.m1.setTag(null);
        this.o1.setTag(null);
        a0(view);
        this.B1 = new jbc(this, 16);
        this.C1 = new sbc(this, 4);
        this.D1 = new sbc(this, 20);
        this.E1 = new jbc(this, 5);
        this.F1 = new sbc(this, 17);
        this.G1 = new jbc(this, 21);
        this.H1 = new sbc(this, 2);
        this.I1 = new jbc(this, 14);
        this.J1 = new jbc(this, 3);
        this.K1 = new sbc(this, 15);
        this.L1 = new jbc(this, 8);
        this.M1 = new jbc(this, 12);
        this.N1 = new sbc(this, 24);
        this.O1 = new jbc(this, 1);
        this.P1 = new sbc(this, 13);
        this.Q1 = new sbc(this, 25);
        this.R1 = new sbc(this, 9);
        this.S1 = new sbc(this, 6);
        this.T1 = new jbc(this, 18);
        this.U1 = new jbc(this, 10);
        this.V1 = new sbc(this, 22);
        this.W1 = new jbc(this, 7);
        this.X1 = new jbc(this, 19);
        this.Y1 = new jbc(this, 23);
        this.Z1 = new sbc(this, 11);
        mo16291G();
    }
}
