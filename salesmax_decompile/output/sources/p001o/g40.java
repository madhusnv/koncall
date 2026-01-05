package p001o;

import android.view.View;
import android.widget.LinearLayout;
import com.google.android.material.button.MaterialButton;

/* loaded from: classes.dex */
public final class g40 {

    /* renamed from: a */
    public final LinearLayout f24542a;

    /* renamed from: b */
    public final LinearLayout f24543b;

    /* renamed from: c */
    public final MaterialButton f24544c;

    /* renamed from: d */
    public final MaterialButton f24545d;

    /* renamed from: e */
    public final MaterialButton f24546e;

    /* renamed from: f */
    public final MaterialButton f24547f;

    /* renamed from: g */
    public final MaterialButton f24548g;

    /* renamed from: h */
    public final MaterialButton f24549h;

    /* renamed from: i */
    public final MaterialButton f24550i;

    public g40(LinearLayout linearLayout, LinearLayout linearLayout2, MaterialButton materialButton, MaterialButton materialButton2, MaterialButton materialButton3, MaterialButton materialButton4, MaterialButton materialButton5, MaterialButton materialButton6, MaterialButton materialButton7) {
        this.f24542a = linearLayout;
        this.f24543b = linearLayout2;
        this.f24544c = materialButton;
        this.f24545d = materialButton2;
        this.f24546e = materialButton3;
        this.f24547f = materialButton4;
        this.f24548g = materialButton5;
        this.f24549h = materialButton6;
        this.f24550i = materialButton7;
    }

    /* renamed from: a */
    public static g40 m28029a(View view) {
        LinearLayout linearLayout = (LinearLayout) view;
        int i = z8e.taskAttachment;
        MaterialButton materialButton = (MaterialButton) uvi.m52060a(view, i);
        if (materialButton != null) {
            i = z8e.taskCall;
            MaterialButton materialButton2 = (MaterialButton) uvi.m52060a(view, i);
            if (materialButton2 != null) {
                i = z8e.taskLocation;
                MaterialButton materialButton3 = (MaterialButton) uvi.m52060a(view, i);
                if (materialButton3 != null) {
                    i = z8e.taskPicture;
                    MaterialButton materialButton4 = (MaterialButton) uvi.m52060a(view, i);
                    if (materialButton4 != null) {
                        i = z8e.taskPrevious;
                        MaterialButton materialButton5 = (MaterialButton) uvi.m52060a(view, i);
                        if (materialButton5 != null) {
                            i = z8e.taskReminder;
                            MaterialButton materialButton6 = (MaterialButton) uvi.m52060a(view, i);
                            if (materialButton6 != null) {
                                i = z8e.taskTag;
                                MaterialButton materialButton7 = (MaterialButton) uvi.m52060a(view, i);
                                if (materialButton7 != null) {
                                    return new g40(linearLayout, linearLayout, materialButton, materialButton2, materialButton3, materialButton4, materialButton5, materialButton6, materialButton7);
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    /* renamed from: b */
    public LinearLayout m28030b() {
        return this.f24542a;
    }
}
