package p001o;

import ai.salesmax.model.FileData;
import ai.salesmax.model.Template;
import android.util.SparseIntArray;
import android.view.View;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.card.MaterialCardView;
import com.google.android.material.materialswitch.MaterialSwitch;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;
import java.util.List;
import p001o.ewi;

/* loaded from: classes.dex */
public class u40 extends t40 {
    public static final ewi.C13274i M0 = null;
    public static final SparseIntArray N0;
    public final MaterialCardView K0;
    public long L0;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        N0 = sparseIntArray;
        sparseIntArray.put(z8e.buttonCancel, 6);
        sparseIntArray.put(z8e.buttonDone, 7);
        sparseIntArray.put(z8e.parentFolderNameLayout, 8);
        sparseIntArray.put(z8e.templateNameLayout, 9);
        sparseIntArray.put(z8e.rvTagList, 10);
        sparseIntArray.put(z8e.templateTitleLayout, 11);
        sparseIntArray.put(z8e.templateBodyLayout, 12);
        sparseIntArray.put(z8e.notesBorder1, 13);
        sparseIntArray.put(z8e.notesActionButtons, 14);
        sparseIntArray.put(z8e.taskAttachment, 15);
        sparseIntArray.put(z8e.taskLink, 16);
        sparseIntArray.put(z8e.taskPicture, 17);
        sparseIntArray.put(z8e.scanDoc, 18);
        sparseIntArray.put(z8e.createTemplateAccountLevel, 19);
    }

    public u40(yt4 yt4Var, View view) {
        this(yt4Var, view, ewi.m25671L(yt4Var, view, 20, M0, N0));
    }

    @Override // p001o.ewi
    /* renamed from: E */
    public boolean mo16290E() {
        synchronized (this) {
            return this.L0 != 0;
        }
    }

    @Override // p001o.ewi
    /* renamed from: G */
    public void mo16291G() {
        synchronized (this) {
            this.L0 = 16L;
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
            m0((Integer) obj);
        } else if (33 == i) {
            l0((ck6) obj);
        } else if (16 == i) {
            j0((String) obj);
        } else {
            if (67 != i) {
                return false;
            }
            k0((Template) obj);
        }
        return true;
    }

    @Override // p001o.t40
    public void j0(String str) {
        this.J0 = str;
    }

    @Override // p001o.t40
    public void k0(Template template) {
        this.G0 = template;
        synchronized (this) {
            this.L0 |= 8;
        }
        m28509h(67);
        super.m25692R();
    }

    public void l0(ck6 ck6Var) {
        this.I0 = ck6Var;
    }

    public void m0(Integer num) {
        this.H0 = num;
    }

    @Override // p001o.ewi
    /* renamed from: p */
    public void mo16295p() {
        long j;
        String description;
        String templateTitle;
        String templateBody;
        String str;
        synchronized (this) {
            j = this.L0;
            this.L0 = 0L;
        }
        Template template = this.G0;
        long j2 = j & 24;
        String str2 = null;
        List<FileData> list = null;
        if (j2 != 0) {
            if (template != null) {
                String hasParent = template.getHasParent();
                description = template.getDescription();
                List<FileData> fileList = template.getFileList();
                templateBody = template.getTemplateBody();
                templateTitle = template.getTemplateTitle();
                str = hasParent;
                list = fileList;
            } else {
                str = null;
                description = null;
                templateTitle = null;
                templateBody = null;
            }
            boolean z = (list != null ? list.size() : 0) > 0;
            if (j2 != 0) {
                j |= z ? 64L : 32L;
            }
            i = z ? 0 : 8;
            str2 = str;
        } else {
            description = null;
            templateTitle = null;
            templateBody = null;
        }
        if ((j & 24) != 0) {
            fjh.m26938c(this.s0, str2);
            this.x0.setVisibility(i);
            fjh.m26938c(this.A0, templateBody);
            fjh.m26938c(this.C0, description);
            fjh.m26938c(this.E0, templateTitle);
        }
    }

    public u40(yt4 yt4Var, View view, Object[] objArr) {
        super(yt4Var, view, 0, (MaterialButton) objArr[6], (MaterialButton) objArr[7], (MaterialSwitch) objArr[19], (LinearLayout) objArr[14], (View) objArr[13], (TextInputEditText) objArr[1], (TextInputLayout) objArr[8], (RecyclerView) objArr[10], (MaterialButton) objArr[18], (MaterialButton) objArr[15], (RecyclerView) objArr[5], (MaterialButton) objArr[16], (MaterialButton) objArr[17], (TextInputEditText) objArr[4], (TextInputLayout) objArr[12], (TextInputEditText) objArr[2], (TextInputLayout) objArr[9], (TextInputEditText) objArr[3], (TextInputLayout) objArr[11]);
        this.L0 = -1L;
        MaterialCardView materialCardView = (MaterialCardView) objArr[0];
        this.K0 = materialCardView;
        materialCardView.setTag(null);
        this.s0.setTag(null);
        this.x0.setTag(null);
        this.A0.setTag(null);
        this.C0.setTag(null);
        this.E0.setTag(null);
        a0(view);
        mo16291G();
    }
}
