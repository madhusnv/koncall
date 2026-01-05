package p001o;

import ai.salesmax.model.UserManagementActionType;
import android.view.View;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.card.MaterialCardView;
import com.google.android.material.textview.MaterialTextView;

/* loaded from: classes.dex */
public abstract class a59 extends ewi {
    public final MaterialButton n0;
    public final MaterialCardView o0;
    public final MaterialTextView p0;
    public UserManagementActionType q0;
    public Integer r0;
    public ck6 s0;

    public a59(Object obj, View view, int i, MaterialButton materialButton, MaterialCardView materialCardView, MaterialTextView materialTextView) {
        super(obj, view, i);
        this.n0 = materialButton;
        this.o0 = materialCardView;
        this.p0 = materialTextView;
    }
}
