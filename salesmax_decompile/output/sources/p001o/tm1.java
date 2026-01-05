package p001o;

import ai.salesmax.model.FileData;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import ernestoyaquello.com.verticalstepperform.VerticalStepperFormView;

/* loaded from: classes.dex */
public abstract class tm1 extends ewi {
    public final vy8 n0;
    public final VerticalStepperFormView o0;
    public FileData p0;

    public tm1(Object obj, View view, int i, vy8 vy8Var, VerticalStepperFormView verticalStepperFormView) {
        super(obj, view, i);
        this.n0 = vy8Var;
        this.o0 = verticalStepperFormView;
    }

    public static tm1 h0(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        zt4.m59873g();
        return i0(layoutInflater, viewGroup, z, null);
    }

    public static tm1 i0(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z, Object obj) {
        return (tm1) ewi.m25668F(layoutInflater, p9e.bulk_upload_fragment, viewGroup, z, obj);
    }

    public abstract void j0(FileData fileData);
}
