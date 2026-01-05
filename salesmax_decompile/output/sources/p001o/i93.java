package p001o;

import android.util.Property;
import android.view.ViewGroup;

/* loaded from: classes3.dex */
public class i93 extends Property {

    /* renamed from: a */
    public static final Property f28267a = new i93("childrenAlpha");

    public i93(String str) {
        super(Float.class, str);
    }

    @Override // android.util.Property
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public Float get(ViewGroup viewGroup) {
        Float f = (Float) viewGroup.getTag(n8e.mtrl_internal_children_alpha_tag);
        return f != null ? f : Float.valueOf(1.0f);
    }

    @Override // android.util.Property
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public void set(ViewGroup viewGroup, Float f) {
        float fFloatValue = f.floatValue();
        viewGroup.setTag(n8e.mtrl_internal_children_alpha_tag, Float.valueOf(fFloatValue));
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            viewGroup.getChildAt(i).setAlpha(fFloatValue);
        }
    }
}
