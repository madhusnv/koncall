package m5;

import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.TypedValue;
import android.util.Xml;
import com.skydoves.balloon.internals.DefinitionKt;
import java.util.HashMap;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: m5.c */
/* loaded from: classes.dex */
public final class C4649c {

    /* renamed from: a */
    public EnumC4648b f22891a;

    /* renamed from: b */
    public int f22892b;

    /* renamed from: c */
    public float f22893c;

    /* renamed from: d */
    public String f22894d;

    /* renamed from: e */
    public boolean f22895e;

    /* renamed from: f */
    public int f22896f;

    public C4649c(C4649c c4649c, Object obj) {
        c4649c.getClass();
        this.f22891a = c4649c.f22891a;
        m9528b(obj);
    }

    /* renamed from: a */
    public static void m9527a(Context context, XmlResourceParser xmlResourceParser, HashMap map) {
        EnumC4648b enumC4648b;
        Object string;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlResourceParser), AbstractC4664r.f23056c);
        int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
        String string2 = null;
        Object objValueOf = null;
        EnumC4648b enumC4648b2 = null;
        for (int i10 = 0; i10 < indexCount; i10++) {
            int index = typedArrayObtainStyledAttributes.getIndex(i10);
            if (index == 0) {
                string2 = typedArrayObtainStyledAttributes.getString(index);
                if (string2 != null && string2.length() > 0) {
                    string2 = Character.toUpperCase(string2.charAt(0)) + string2.substring(1);
                }
            } else if (index == 1) {
                objValueOf = Boolean.valueOf(typedArrayObtainStyledAttributes.getBoolean(index, false));
                enumC4648b2 = EnumC4648b.BOOLEAN_TYPE;
            } else {
                if (index == 3) {
                    enumC4648b = EnumC4648b.COLOR_TYPE;
                    string = Integer.valueOf(typedArrayObtainStyledAttributes.getColor(index, 0));
                } else if (index == 2) {
                    enumC4648b = EnumC4648b.COLOR_DRAWABLE_TYPE;
                    string = Integer.valueOf(typedArrayObtainStyledAttributes.getColor(index, 0));
                } else if (index == 7) {
                    enumC4648b = EnumC4648b.DIMENSION_TYPE;
                    string = Float.valueOf(TypedValue.applyDimension(1, typedArrayObtainStyledAttributes.getDimension(index, DefinitionKt.NO_Float_VALUE), context.getResources().getDisplayMetrics()));
                } else if (index == 4) {
                    enumC4648b = EnumC4648b.DIMENSION_TYPE;
                    string = Float.valueOf(typedArrayObtainStyledAttributes.getDimension(index, DefinitionKt.NO_Float_VALUE));
                } else if (index == 5) {
                    enumC4648b = EnumC4648b.FLOAT_TYPE;
                    string = Float.valueOf(typedArrayObtainStyledAttributes.getFloat(index, Float.NaN));
                } else if (index == 6) {
                    enumC4648b = EnumC4648b.INT_TYPE;
                    string = Integer.valueOf(typedArrayObtainStyledAttributes.getInteger(index, -1));
                } else if (index == 8) {
                    enumC4648b = EnumC4648b.STRING_TYPE;
                    string = typedArrayObtainStyledAttributes.getString(index);
                }
                Object obj = string;
                enumC4648b2 = enumC4648b;
                objValueOf = obj;
            }
        }
        if (string2 != null && objValueOf != null) {
            C4649c c4649c = new C4649c();
            c4649c.f22891a = enumC4648b2;
            c4649c.m9528b(objValueOf);
            map.put(string2, c4649c);
        }
        typedArrayObtainStyledAttributes.recycle();
    }

    /* renamed from: b */
    public final void m9528b(Object obj) {
        switch (AbstractC4647a.f22890a[this.f22891a.ordinal()]) {
            case 1:
            case 2:
                this.f22896f = ((Integer) obj).intValue();
                break;
            case 3:
                this.f22892b = ((Integer) obj).intValue();
                break;
            case 4:
                this.f22893c = ((Float) obj).floatValue();
                break;
            case 5:
                this.f22894d = (String) obj;
                break;
            case 6:
                this.f22895e = ((Boolean) obj).booleanValue();
                break;
            case 7:
                this.f22893c = ((Float) obj).floatValue();
                break;
        }
    }
}
