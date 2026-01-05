package p001o;

import ai.salesmax.model.ChatMessages;
import ai.salesmax.model.FileData;
import ai.salesmax.model.WaButton;
import ai.salesmax.model.WhatsAppTemplates;
import android.util.SparseIntArray;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.cast.MediaStatus;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.card.MaterialCardView;
import com.google.android.material.imageview.ShapeableImageView;
import com.google.android.material.materialswitch.MaterialSwitch;
import com.google.android.material.textview.MaterialTextView;
import java.util.List;
import p001o.ewi;
import p001o.jbc;
import p001o.sbc;

/* loaded from: classes.dex */
public class ek4 extends dk4 implements sbc.InterfaceC16795a, jbc.InterfaceC14485a {
    public static final ewi.C13274i H1 = null;
    public static final SparseIntArray I1;
    public final View.OnLongClickListener A1;
    public final View.OnClickListener B1;
    public final View.OnClickListener C1;
    public final View.OnLongClickListener D1;
    public final View.OnLongClickListener E1;
    public final View.OnClickListener F1;
    public long G1;
    public final MaterialCardView f1;
    public final ProgressBar g1;
    public final View h1;
    public final LinearLayout i1;
    public final LinearLayout j1;
    public final View.OnLongClickListener k1;
    public final View.OnClickListener l1;
    public final View.OnClickListener m1;
    public final View.OnLongClickListener n1;
    public final View.OnClickListener o1;
    public final View.OnClickListener p1;
    public final View.OnLongClickListener q1;
    public final View.OnClickListener r1;
    public final View.OnLongClickListener s1;
    public final View.OnLongClickListener t1;
    public final View.OnClickListener u1;
    public final View.OnClickListener v1;
    public final View.OnClickListener w1;
    public final View.OnLongClickListener x1;
    public final View.OnLongClickListener y1;
    public final View.OnLongClickListener z1;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        I1 = sparseIntArray;
        sparseIntArray.put(z8e.topActionButtons, 33);
        sparseIntArray.put(z8e.buttonCancel, 34);
        sparseIntArray.put(z8e.tvTemplatesTitle, 35);
        sparseIntArray.put(z8e.tvHeaderTitle, 36);
        sparseIntArray.put(z8e.taskAttachment, 37);
        sparseIntArray.put(z8e.revertFileButton, 38);
        sparseIntArray.put(z8e.removeUploadedFileButton, 39);
        sparseIntArray.put(z8e.tvVariableTitle, 40);
        sparseIntArray.put(z8e.tvVariableList, 41);
        sparseIntArray.put(z8e.saveTemplateVariables, 42);
        sparseIntArray.put(z8e.layoutMessageWithImage, 43);
        sparseIntArray.put(z8e.threeButtonsContainerFirstPart, 44);
    }

    public ek4(yt4 yt4Var, View view) {
        this(yt4Var, view, ewi.m25671L(yt4Var, view, 45, H1, I1));
    }

    @Override // p001o.ewi
    /* renamed from: E */
    public boolean mo16290E() {
        synchronized (this) {
            return this.G1 != 0;
        }
    }

    @Override // p001o.ewi
    /* renamed from: G */
    public void mo16291G() {
        synchronized (this) {
            this.G1 = 16L;
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
            ck6 ck6Var = this.e1;
            ChatMessages chatMessages = this.b1;
            Integer num = this.d1;
            if (ck6Var != null) {
                return ck6Var.mo707a(view, num.intValue(), chatMessages);
            }
            return false;
        }
        if (i == 4) {
            ck6 ck6Var2 = this.e1;
            ChatMessages chatMessages2 = this.b1;
            Integer num2 = this.d1;
            if (ck6Var2 != null) {
                return ck6Var2.mo707a(view, num2.intValue(), chatMessages2);
            }
            return false;
        }
        if (i == 7) {
            ck6 ck6Var3 = this.e1;
            ChatMessages chatMessages3 = this.b1;
            Integer num3 = this.d1;
            if (ck6Var3 != null) {
                return ck6Var3.mo707a(view, num3.intValue(), chatMessages3);
            }
            return false;
        }
        if (i == 9) {
            ck6 ck6Var4 = this.e1;
            ChatMessages chatMessages4 = this.b1;
            Integer num4 = this.d1;
            if (ck6Var4 != null) {
                return ck6Var4.mo707a(view, num4.intValue(), chatMessages4);
            }
            return false;
        }
        if (i == 11) {
            ck6 ck6Var5 = this.e1;
            ChatMessages chatMessages5 = this.b1;
            Integer num5 = this.d1;
            if (ck6Var5 != null) {
                return ck6Var5.mo707a(view, num5.intValue(), chatMessages5);
            }
            return false;
        }
        if (i == 13) {
            ck6 ck6Var6 = this.e1;
            ChatMessages chatMessages6 = this.b1;
            Integer num6 = this.d1;
            if (ck6Var6 != null) {
                return ck6Var6.mo707a(view, num6.intValue(), chatMessages6);
            }
            return false;
        }
        if (i == 15) {
            ck6 ck6Var7 = this.e1;
            ChatMessages chatMessages7 = this.b1;
            Integer num7 = this.d1;
            if (ck6Var7 != null) {
                return ck6Var7.mo707a(view, num7.intValue(), chatMessages7);
            }
            return false;
        }
        if (i == 17) {
            ck6 ck6Var8 = this.e1;
            ChatMessages chatMessages8 = this.b1;
            Integer num8 = this.d1;
            if (ck6Var8 != null) {
                return ck6Var8.mo707a(view, num8.intValue(), chatMessages8);
            }
            return false;
        }
        if (i == 19) {
            ck6 ck6Var9 = this.e1;
            ChatMessages chatMessages9 = this.b1;
            Integer num9 = this.d1;
            if (ck6Var9 != null) {
                return ck6Var9.mo707a(view, num9.intValue(), chatMessages9);
            }
            return false;
        }
        if (i == 21) {
            ck6 ck6Var10 = this.e1;
            ChatMessages chatMessages10 = this.b1;
            Integer num10 = this.d1;
            if (ck6Var10 != null) {
                return ck6Var10.mo707a(view, num10.intValue(), chatMessages10);
            }
            return false;
        }
        if (i != 22) {
            return false;
        }
        ck6 ck6Var11 = this.e1;
        ChatMessages chatMessages11 = this.b1;
        Integer num11 = this.d1;
        if (ck6Var11 != null) {
            return ck6Var11.mo707a(view, num11.intValue(), chatMessages11);
        }
        return false;
    }

    @Override // p001o.ewi
    public boolean b0(int i, Object obj) {
        if (33 == i) {
            l0((ck6) obj);
        } else if (73 == i) {
            m0((Integer) obj);
        } else if (97 == i) {
            k0((WhatsAppTemplates) obj);
        } else {
            if (67 != i) {
                return false;
            }
            j0((ChatMessages) obj);
        }
        return true;
    }

    @Override // p001o.jbc.InterfaceC14485a
    /* renamed from: c */
    public final void mo16294c(int i, View view) {
        if (i == 1) {
            ck6 ck6Var = this.e1;
            ChatMessages chatMessages = this.b1;
            Integer num = this.d1;
            if (ck6Var != null) {
                ck6Var.mo708b(view, num.intValue(), chatMessages);
                return;
            }
            return;
        }
        if (i == 3) {
            ck6 ck6Var2 = this.e1;
            ChatMessages chatMessages2 = this.b1;
            Integer num2 = this.d1;
            if (ck6Var2 != null) {
                ck6Var2.mo708b(view, num2.intValue(), chatMessages2);
                return;
            }
            return;
        }
        if (i == 8) {
            ck6 ck6Var3 = this.e1;
            ChatMessages chatMessages3 = this.b1;
            Integer num3 = this.d1;
            if (ck6Var3 != null) {
                ck6Var3.mo708b(view, num3.intValue(), chatMessages3);
                return;
            }
            return;
        }
        if (i == 10) {
            ck6 ck6Var4 = this.e1;
            ChatMessages chatMessages4 = this.b1;
            Integer num4 = this.d1;
            if (ck6Var4 != null) {
                ck6Var4.mo708b(view, num4.intValue(), chatMessages4);
                return;
            }
            return;
        }
        if (i == 12) {
            ck6 ck6Var5 = this.e1;
            ChatMessages chatMessages5 = this.b1;
            Integer num5 = this.d1;
            if (ck6Var5 != null) {
                ck6Var5.mo708b(view, num5.intValue(), chatMessages5);
                return;
            }
            return;
        }
        if (i == 14) {
            ck6 ck6Var6 = this.e1;
            ChatMessages chatMessages6 = this.b1;
            Integer num6 = this.d1;
            if (ck6Var6 != null) {
                ck6Var6.mo708b(view, num6.intValue(), chatMessages6);
                return;
            }
            return;
        }
        if (i == 16) {
            ck6 ck6Var7 = this.e1;
            ChatMessages chatMessages7 = this.b1;
            Integer num7 = this.d1;
            if (ck6Var7 != null) {
                ck6Var7.mo708b(view, num7.intValue(), chatMessages7);
                return;
            }
            return;
        }
        if (i == 18) {
            ck6 ck6Var8 = this.e1;
            ChatMessages chatMessages8 = this.b1;
            Integer num8 = this.d1;
            if (ck6Var8 != null) {
                ck6Var8.mo708b(view, num8.intValue(), chatMessages8);
                return;
            }
            return;
        }
        if (i == 20) {
            ck6 ck6Var9 = this.e1;
            ChatMessages chatMessages9 = this.b1;
            Integer num9 = this.d1;
            if (ck6Var9 != null) {
                ck6Var9.mo708b(view, num9.intValue(), chatMessages9);
                return;
            }
            return;
        }
        if (i == 5) {
            ck6 ck6Var10 = this.e1;
            ChatMessages chatMessages10 = this.b1;
            Integer num10 = this.d1;
            if (ck6Var10 != null) {
                ck6Var10.mo708b(view, num10.intValue(), chatMessages10);
                return;
            }
            return;
        }
        if (i != 6) {
            return;
        }
        ck6 ck6Var11 = this.e1;
        ChatMessages chatMessages11 = this.b1;
        Integer num11 = this.d1;
        if (ck6Var11 != null) {
            ck6Var11.mo708b(view, num11.intValue(), chatMessages11);
        }
    }

    @Override // p001o.dk4
    public void j0(ChatMessages chatMessages) {
        this.b1 = chatMessages;
        synchronized (this) {
            this.G1 |= 8;
        }
        m28509h(67);
        super.m25692R();
    }

    @Override // p001o.dk4
    public void k0(WhatsAppTemplates whatsAppTemplates) {
        this.c1 = whatsAppTemplates;
        synchronized (this) {
            this.G1 |= 4;
        }
        m28509h(97);
        super.m25692R();
    }

    public void l0(ck6 ck6Var) {
        this.e1 = ck6Var;
        synchronized (this) {
            this.G1 |= 1;
        }
        m28509h(33);
        super.m25692R();
    }

    public void m0(Integer num) {
        this.d1 = num;
        synchronized (this) {
            this.G1 |= 2;
        }
        m28509h(73);
        super.m25692R();
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x0149  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x016b  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0173  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0193  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x019b  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x021e  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x024a  */
    /* JADX WARN: Removed duplicated region for block: B:137:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0048  */
    @Override // p001o.ewi
    /* renamed from: p */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void mo16295p() {
        long j;
        int i;
        long j2;
        int i2;
        int i3;
        int i4;
        boolean zIsUploaded;
        int i5;
        FileData fileData;
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        String str7;
        long j3;
        String str8;
        int i6;
        List<WaButton> list;
        FileData messageFile;
        ChatMessages replyingToMessage;
        int size;
        WaButton waButton;
        WaButton waButton2;
        WaButton waButton3;
        String fileName;
        String mimeType;
        String messageText;
        String messageUserName;
        boolean newFileUploaded;
        FileData defaultMedia;
        synchronized (this) {
            j = this.G1;
            this.G1 = 0L;
        }
        WhatsAppTemplates whatsAppTemplates = this.c1;
        ChatMessages chatMessages = this.b1;
        long j4 = j & 20;
        if (j4 != 0) {
            if (whatsAppTemplates != null) {
                newFileUploaded = whatsAppTemplates.getNewFileUploaded();
                defaultMedia = whatsAppTemplates.getDefaultMedia();
            } else {
                newFileUploaded = false;
                defaultMedia = null;
            }
            if (j4 != 0) {
                j |= newFileUploaded ? MediaStatus.COMMAND_LIKE : MediaStatus.COMMAND_PLAYBACK_RATE;
            }
            i = newFileUploaded ? 0 : 8;
            String fileName2 = defaultMedia != null ? defaultMedia.getFileName() : null;
            j2 = j & 24;
            if (j2 == 0) {
                if (chatMessages != null) {
                    List<WaButton> buttons = chatMessages.getButtons();
                    messageFile = chatMessages.getMessageFile();
                    replyingToMessage = chatMessages.getReplyingToMessage();
                    list = buttons;
                } else {
                    list = null;
                    messageFile = null;
                    replyingToMessage = null;
                }
                if (list != null) {
                    size = list.size();
                    waButton2 = (WaButton) ewi.m25667A(list, 2);
                    waButton3 = (WaButton) ewi.m25667A(list, 1);
                    waButton = (WaButton) ewi.m25667A(list, 0);
                } else {
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
                    zIsUploaded = false;
                    fileName = null;
                    mimeType = null;
                }
                if (j2 != 0) {
                    j = zIsUploaded ? j | MediaStatus.COMMAND_QUEUE_REPEAT_ALL : j | 512;
                }
                if (replyingToMessage != null) {
                    messageText = replyingToMessage.getMessageText();
                    messageUserName = replyingToMessage.getMessageUserName();
                } else {
                    messageText = null;
                    messageUserName = null;
                }
                boolean z = size == 1;
                boolean z2 = size == 2;
                boolean z3 = size == 3;
                boolean z4 = size == 0;
                if ((j & 24) != 0) {
                    j |= z ? MediaStatus.COMMAND_STREAM_TRANSFER : MediaStatus.COMMAND_UNFOLLOW;
                }
                if ((j & 24) != 0) {
                    j |= z2 ? 64L : 32L;
                }
                if ((j & 24) != 0) {
                    j |= z3 ? MediaStatus.COMMAND_EDIT_TRACKS : MediaStatus.COMMAND_QUEUE_REPEAT_ONE;
                }
                if ((j & 24) != 0) {
                    j |= z4 ? MediaStatus.COMMAND_FOLLOW : MediaStatus.COMMAND_DISLIKE;
                }
                String waText = waButton2 != null ? waButton2.getWaText() : null;
                String waText2 = waButton3 != null ? waButton3.getWaText() : null;
                String waText3 = waButton != null ? waButton.getWaText() : null;
                int i7 = z ? 0 : 8;
                i2 = z2 ? 0 : 8;
                i4 = z3 ? 0 : 8;
                i3 = z4 ? 8 : 0;
                str = waText3;
                str4 = messageText;
                i5 = i7;
                fileData = messageFile;
                str6 = messageUserName;
                str5 = waText;
                str2 = waText2;
                str3 = fileName;
                str7 = mimeType;
            } else {
                i2 = 0;
                i3 = 0;
                i4 = 0;
                zIsUploaded = false;
                i5 = 0;
                fileData = null;
                str = null;
                str2 = null;
                str3 = null;
                str4 = null;
                str5 = null;
                str6 = null;
                str7 = null;
            }
            boolean viewOnly = ((j & 512) != 0 || fileData == null) ? false : fileData.getViewOnly();
            j3 = j & 24;
            if (j3 == 0) {
                boolean z5 = zIsUploaded ? true : viewOnly;
                if (j3 != 0) {
                    j |= z5 ? 256L : 128L;
                }
                str8 = fileName2;
                i6 = z5 ? 8 : 0;
            } else {
                str8 = fileName2;
                i6 = 0;
            }
            if ((24 & j) != 0) {
                fjh.m26938c(this.n0, str);
                fjh.m26938c(this.o0, str);
                fjh.m26938c(this.p0, str);
                String str9 = str2;
                fjh.m26938c(this.q0, str9);
                fjh.m26938c(this.r0, str9);
                fjh.m26938c(this.s0, str5);
                nr1.O1(this.w0, fileData);
                nr1.n2(this.x0, fileData);
                fjh.m26938c(this.y0, str3);
                nr1.x2(this.z0, chatMessages);
                nr1.q2(this.B0, str7);
                nr1.T2(this.E0, chatMessages);
                this.g1.setVisibility(i6);
                nr1.m40961f(this.h1, fileData);
                this.i1.setVisibility(i3);
                nr1.n2(this.j1, fileData);
                this.G0.setVisibility(i5);
                nr1.m40965j(this.O0, chatMessages);
                fjh.m26938c(this.P0, str4);
                fjh.m26938c(this.Q0, str6);
                this.R0.setVisibility(i4);
                this.Z0.setVisibility(i2);
            }
            if ((20 & j) != 0) {
                nr1.y0(this.u0, whatsAppTemplates);
                nr1.I1(this.D0, whatsAppTemplates);
                this.H0.setVisibility(i);
                nr1.y0(this.L0, whatsAppTemplates);
                nr1.E1(this.N0, whatsAppTemplates);
                fjh.m26938c(this.W0, str8);
                nr1.F1(this.a1, whatsAppTemplates);
            }
            if ((j & 16) == 0) {
                this.v0.setOnClickListener(this.F1);
                this.v0.setOnLongClickListener(this.x1);
                this.w0.setOnClickListener(this.v1);
                this.w0.setOnLongClickListener(this.z1);
                this.x0.setOnClickListener(this.p1);
                this.x0.setOnLongClickListener(this.t1);
                this.y0.setOnClickListener(this.w1);
                this.y0.setOnLongClickListener(this.A1);
                this.z0.setOnClickListener(this.u1);
                this.A0.setOnClickListener(this.l1);
                this.A0.setOnLongClickListener(this.n1);
                this.B0.setOnClickListener(this.C1);
                this.B0.setOnLongClickListener(this.E1);
                this.C0.setOnClickListener(this.B1);
                this.C0.setOnLongClickListener(this.q1);
                this.D0.setOnClickListener(this.r1);
                this.D0.setOnLongClickListener(this.D1);
                this.E0.setOnClickListener(this.m1);
                this.E0.setOnLongClickListener(this.y1);
                this.O0.setOnClickListener(this.o1);
                this.O0.setOnLongClickListener(this.s1);
                this.Q0.setOnLongClickListener(this.k1);
                return;
            }
            return;
        }
        i = 0;
        j2 = j & 24;
        if (j2 == 0) {
        }
        if ((j & 512) != 0) {
        }
        j3 = j & 24;
        if (j3 == 0) {
        }
        if ((24 & j) != 0) {
        }
        if ((20 & j) != 0) {
        }
        if ((j & 16) == 0) {
        }
    }

    public ek4(yt4 yt4Var, View view, Object[] objArr) {
        super(yt4Var, view, 0, (Button) objArr[29], (Button) objArr[24], (Button) objArr[26], (Button) objArr[30], (Button) objArr[27], (Button) objArr[31], (MaterialButton) objArr[34], (MaterialButton) objArr[1], (CardView) objArr[6], (ShapeableImageView) objArr[18], (LinearLayout) objArr[11], (MaterialTextView) objArr[14], (ShapeableImageView) objArr[9], (MaterialCardView) objArr[12], (ShapeableImageView) objArr[13], (MaterialCardView) objArr[7], (ShapeableImageView) objArr[17], (ShapeableImageView) objArr[10], (LinearLayout) objArr[43], (LinearLayout) objArr[23], (LinearLayout) objArr[4], (MaterialButton) objArr[39], (MaterialButton) objArr[38], (MaterialSwitch) objArr[42], (MaterialButton) objArr[32], (MaterialButton) objArr[37], (MaterialButton) objArr[3], (MaterialTextView) objArr[19], (MaterialTextView) objArr[20], (MaterialTextView) objArr[21], (LinearLayout) objArr[28], (LinearLayout) objArr[44], (ConstraintLayout) objArr[33], (MaterialTextView) objArr[36], (MaterialTextView) objArr[35], (MaterialTextView) objArr[5], (RecyclerView) objArr[41], (MaterialTextView) objArr[40], (LinearLayout) objArr[25], (LinearLayout) objArr[2]);
        this.G1 = -1L;
        this.n0.setTag(null);
        this.o0.setTag(null);
        this.p0.setTag(null);
        this.q0.setTag(null);
        this.r0.setTag(null);
        this.s0.setTag(null);
        this.u0.setTag(null);
        this.v0.setTag(null);
        this.w0.setTag(null);
        this.x0.setTag(null);
        this.y0.setTag(null);
        this.z0.setTag(null);
        this.A0.setTag(null);
        this.B0.setTag(null);
        this.C0.setTag(null);
        this.D0.setTag(null);
        this.E0.setTag(null);
        MaterialCardView materialCardView = (MaterialCardView) objArr[0];
        this.f1 = materialCardView;
        materialCardView.setTag(null);
        ProgressBar progressBar = (ProgressBar) objArr[15];
        this.g1 = progressBar;
        progressBar.setTag(null);
        View view2 = (View) objArr[16];
        this.h1 = view2;
        view2.setTag(null);
        LinearLayout linearLayout = (LinearLayout) objArr[22];
        this.i1 = linearLayout;
        linearLayout.setTag(null);
        LinearLayout linearLayout2 = (LinearLayout) objArr[8];
        this.j1 = linearLayout2;
        linearLayout2.setTag(null);
        this.G0.setTag(null);
        this.H0.setTag(null);
        this.L0.setTag(null);
        this.N0.setTag(null);
        this.O0.setTag(null);
        this.P0.setTag(null);
        this.Q0.setTag(null);
        this.R0.setTag(null);
        this.W0.setTag(null);
        this.Z0.setTag(null);
        this.a1.setTag(null);
        a0(view);
        this.k1 = new sbc(this, 22);
        this.l1 = new jbc(this, 10);
        this.m1 = new jbc(this, 6);
        this.n1 = new sbc(this, 11);
        this.o1 = new jbc(this, 20);
        this.p1 = new jbc(this, 8);
        this.q1 = new sbc(this, 4);
        this.r1 = new jbc(this, 16);
        this.s1 = new sbc(this, 21);
        this.t1 = new sbc(this, 9);
        this.u1 = new jbc(this, 5);
        this.v1 = new jbc(this, 18);
        this.w1 = new jbc(this, 14);
        this.x1 = new sbc(this, 2);
        this.y1 = new sbc(this, 7);
        this.z1 = new sbc(this, 19);
        this.A1 = new sbc(this, 15);
        this.B1 = new jbc(this, 3);
        this.C1 = new jbc(this, 12);
        this.D1 = new sbc(this, 17);
        this.E1 = new sbc(this, 13);
        this.F1 = new jbc(this, 1);
        mo16291G();
    }
}
