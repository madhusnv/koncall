package p001o;

import ai.salesmax.model.BulkUploadMapping;
import android.util.SparseIntArray;
import android.view.View;
import android.widget.HorizontalScrollView;
import androidx.appcompat.widget.AppCompatImageView;
import com.google.android.gms.cast.MediaStatus;
import com.google.android.material.card.MaterialCardView;
import com.google.android.material.chip.Chip;
import com.google.android.material.chip.ChipGroup;
import com.google.android.material.textview.MaterialTextView;
import p001o.ewi;
import p001o.jbc;

/* loaded from: classes.dex */
public class tw8 extends sw8 implements jbc.InterfaceC14485a {
    public static final ewi.C13274i I0 = null;
    public static final SparseIntArray J0;
    public final View.OnClickListener E0;
    public final View.OnClickListener F0;
    public final View.OnClickListener G0;
    public long H0;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        J0 = sparseIntArray;
        sparseIntArray.put(z8e.imgDragHandler, 10);
        sparseIntArray.put(z8e.mappedFieldSelection, 11);
        sparseIntArray.put(z8e.availableFieldsGroup, 12);
    }

    public tw8(yt4 yt4Var, View view) {
        this(yt4Var, view, ewi.m25671L(yt4Var, view, 13, I0, J0));
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
            this.H0 = 16L;
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
        if (7 == i) {
            h0((rog) obj);
        } else if (73 == i) {
            k0((Integer) obj);
        } else if (33 == i) {
            i0((ck6) obj);
        } else {
            if (67 != i) {
                return false;
            }
            j0((BulkUploadMapping) obj);
        }
        return true;
    }

    @Override // p001o.jbc.InterfaceC14485a
    /* renamed from: c */
    public final void mo16294c(int i, View view) {
        if (i == 1) {
            ck6 ck6Var = this.C0;
            BulkUploadMapping bulkUploadMapping = this.A0;
            Integer num = this.B0;
            if (ck6Var != null) {
                ck6Var.mo708b(view, num.intValue(), bulkUploadMapping);
                return;
            }
            return;
        }
        if (i == 2) {
            ck6 ck6Var2 = this.C0;
            BulkUploadMapping bulkUploadMapping2 = this.A0;
            Integer num2 = this.B0;
            if (ck6Var2 != null) {
                ck6Var2.mo708b(view, num2.intValue(), bulkUploadMapping2);
                return;
            }
            return;
        }
        if (i != 3) {
            return;
        }
        ck6 ck6Var3 = this.C0;
        BulkUploadMapping bulkUploadMapping3 = this.A0;
        Integer num3 = this.B0;
        if (ck6Var3 != null) {
            ck6Var3.mo708b(view, num3.intValue(), bulkUploadMapping3);
        }
    }

    public void h0(rog rogVar) {
        this.D0 = rogVar;
    }

    public void i0(ck6 ck6Var) {
        this.C0 = ck6Var;
        synchronized (this) {
            this.H0 |= 4;
        }
        m28509h(33);
        super.m25692R();
    }

    public void j0(BulkUploadMapping bulkUploadMapping) {
        this.A0 = bulkUploadMapping;
        synchronized (this) {
            this.H0 |= 8;
        }
        m28509h(67);
        super.m25692R();
    }

    public void k0(Integer num) {
        this.B0 = num;
        synchronized (this) {
            this.H0 |= 2;
        }
        m28509h(73);
        super.m25692R();
    }

    @Override // p001o.ewi
    /* renamed from: p */
    public void mo16295p() {
        long j;
        long j2;
        String str;
        boolean zEqualsIgnoreCase;
        boolean zEqualsIgnoreCase2;
        boolean zEqualsIgnoreCase3;
        boolean zEqualsIgnoreCase4;
        boolean zEqualsIgnoreCase5;
        boolean zEqualsIgnoreCase6;
        String sheetHeader;
        String mappedField;
        synchronized (this) {
            j = this.H0;
            this.H0 = 0L;
        }
        BulkUploadMapping bulkUploadMapping = this.A0;
        long j3 = j & 24;
        String sampleItem = null;
        boolean zEqualsIgnoreCase7 = false;
        if (j3 != 0) {
            if (bulkUploadMapping != null) {
                sampleItem = bulkUploadMapping.getSampleItem();
                mappedField = bulkUploadMapping.getMappedField();
                sheetHeader = bulkUploadMapping.getSheetHeader();
            } else {
                sheetHeader = null;
                mappedField = null;
            }
            sampleItem = "Sample Data : " + sampleItem;
            str = "Header : " + sheetHeader;
            if (mappedField != null) {
                zEqualsIgnoreCase7 = mappedField.equalsIgnoreCase(this.o0.getResources().getString(hae.demo));
                zEqualsIgnoreCase4 = mappedField.equalsIgnoreCase(this.p0.getResources().getString(hae.follow_up));
                zEqualsIgnoreCase5 = mappedField.equalsIgnoreCase(this.r0.getResources().getString(hae.get_document));
                zEqualsIgnoreCase6 = mappedField.equalsIgnoreCase(this.s0.getResources().getString(hae.in_person_meeting));
                zEqualsIgnoreCase = mappedField.equalsIgnoreCase(this.u0.getResources().getString(hae.send_proposal));
                zEqualsIgnoreCase2 = mappedField.equalsIgnoreCase(this.t0.getResources().getString(hae.send_document));
                zEqualsIgnoreCase3 = mappedField.equalsIgnoreCase(this.q0.getResources().getString(hae.get_appointment));
            } else {
                zEqualsIgnoreCase = false;
                zEqualsIgnoreCase2 = false;
                zEqualsIgnoreCase3 = false;
                zEqualsIgnoreCase4 = false;
                zEqualsIgnoreCase5 = false;
                zEqualsIgnoreCase6 = false;
            }
            if (j3 != 0) {
                j |= zEqualsIgnoreCase7 ? MediaStatus.COMMAND_STREAM_TRANSFER : MediaStatus.COMMAND_UNFOLLOW;
            }
            if ((j & 24) != 0) {
                j |= zEqualsIgnoreCase4 ? 256L : 128L;
            }
            if ((j & 24) != 0) {
                j |= zEqualsIgnoreCase5 ? MediaStatus.COMMAND_FOLLOW : MediaStatus.COMMAND_DISLIKE;
            }
            if ((j & 24) != 0) {
                j |= zEqualsIgnoreCase6 ? MediaStatus.COMMAND_EDIT_TRACKS : MediaStatus.COMMAND_QUEUE_REPEAT_ONE;
            }
            if ((j & 24) != 0) {
                j |= zEqualsIgnoreCase ? MediaStatus.COMMAND_QUEUE_REPEAT_ALL : 512L;
            }
            if ((j & 24) != 0) {
                j |= zEqualsIgnoreCase2 ? 64L : 32L;
            }
            if ((j & 24) != 0) {
                j |= zEqualsIgnoreCase3 ? MediaStatus.COMMAND_LIKE : MediaStatus.COMMAND_PLAYBACK_RATE;
            }
            j2 = 24;
        } else {
            j2 = 24;
            str = null;
            zEqualsIgnoreCase = false;
            zEqualsIgnoreCase2 = false;
            zEqualsIgnoreCase3 = false;
            zEqualsIgnoreCase4 = false;
            zEqualsIgnoreCase5 = false;
            zEqualsIgnoreCase6 = false;
        }
        if ((j2 & j) != 0) {
            np3.m40895a(this.o0, zEqualsIgnoreCase7);
            np3.m40895a(this.p0, zEqualsIgnoreCase4);
            np3.m40895a(this.q0, zEqualsIgnoreCase3);
            np3.m40895a(this.r0, zEqualsIgnoreCase5);
            np3.m40895a(this.s0, zEqualsIgnoreCase6);
            np3.m40895a(this.t0, zEqualsIgnoreCase2);
            np3.m40895a(this.u0, zEqualsIgnoreCase);
            nr1.f1(this.y0, sampleItem);
            nr1.f1(this.z0, str);
        }
        if ((j & 16) != 0) {
            this.w0.setOnClickListener(this.G0);
            this.y0.setOnClickListener(this.F0);
            this.z0.setOnClickListener(this.E0);
        }
    }

    public tw8(yt4 yt4Var, View view, Object[] objArr) {
        super(yt4Var, view, 0, (ChipGroup) objArr[12], (Chip) objArr[5], (Chip) objArr[3], (Chip) objArr[8], (Chip) objArr[7], (Chip) objArr[9], (Chip) objArr[6], (Chip) objArr[4], (AppCompatImageView) objArr[10], (MaterialCardView) objArr[0], (HorizontalScrollView) objArr[11], (MaterialTextView) objArr[2], (MaterialTextView) objArr[1]);
        this.H0 = -1L;
        this.o0.setTag(null);
        this.p0.setTag(null);
        this.q0.setTag(null);
        this.r0.setTag(null);
        this.s0.setTag(null);
        this.t0.setTag(null);
        this.u0.setTag(null);
        this.w0.setTag(null);
        this.y0.setTag(null);
        this.z0.setTag(null);
        a0(view);
        this.E0 = new jbc(this, 2);
        this.F0 = new jbc(this, 3);
        this.G0 = new jbc(this, 1);
        mo16291G();
    }
}
