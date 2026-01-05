package p001o;

import android.view.View;
import android.widget.LinearLayout;
import com.google.android.material.button.MaterialButton;

/* loaded from: classes.dex */
public final class f40 {

    /* renamed from: a */
    public final LinearLayout f22639a;

    /* renamed from: b */
    public final MaterialButton f22640b;

    /* renamed from: c */
    public final MaterialButton f22641c;

    /* renamed from: d */
    public final MaterialButton f22642d;

    /* renamed from: e */
    public final MaterialButton f22643e;

    /* renamed from: f */
    public final MaterialButton f22644f;

    /* renamed from: g */
    public final MaterialButton f22645g;

    /* renamed from: h */
    public final MaterialButton f22646h;

    public f40(LinearLayout linearLayout, MaterialButton materialButton, MaterialButton materialButton2, MaterialButton materialButton3, MaterialButton materialButton4, MaterialButton materialButton5, MaterialButton materialButton6, MaterialButton materialButton7) {
        this.f22639a = linearLayout;
        this.f22640b = materialButton;
        this.f22641c = materialButton2;
        this.f22642d = materialButton3;
        this.f22643e = materialButton4;
        this.f22644f = materialButton5;
        this.f22645g = materialButton6;
        this.f22646h = materialButton7;
    }

    /* renamed from: a */
    public static f40 m26045a(View view) {
        int i = z8e.taskAssignee;
        MaterialButton materialButton = (MaterialButton) uvi.m52060a(view, i);
        if (materialButton != null) {
            i = z8e.taskCalender;
            MaterialButton materialButton2 = (MaterialButton) uvi.m52060a(view, i);
            if (materialButton2 != null) {
                i = z8e.taskLocation;
                MaterialButton materialButton3 = (MaterialButton) uvi.m52060a(view, i);
                if (materialButton3 != null) {
                    i = z8e.taskNext;
                    MaterialButton materialButton4 = (MaterialButton) uvi.m52060a(view, i);
                    if (materialButton4 != null) {
                        i = z8e.taskPriority;
                        MaterialButton materialButton5 = (MaterialButton) uvi.m52060a(view, i);
                        if (materialButton5 != null) {
                            i = z8e.taskReminder;
                            MaterialButton materialButton6 = (MaterialButton) uvi.m52060a(view, i);
                            if (materialButton6 != null) {
                                i = z8e.taskTag;
                                MaterialButton materialButton7 = (MaterialButton) uvi.m52060a(view, i);
                                if (materialButton7 != null) {
                                    return new f40((LinearLayout) view, materialButton, materialButton2, materialButton3, materialButton4, materialButton5, materialButton6, materialButton7);
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
    public LinearLayout m26046b() {
        return this.f22639a;
    }
}
