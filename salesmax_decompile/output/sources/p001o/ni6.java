package p001o;

import java.lang.annotation.Annotation;

/* loaded from: classes6.dex */
public abstract class ni6 {
    /* renamed from: a */
    public static final dc9 m40629a(String str, Enum[] enumArr, String[] strArr, Annotation[][] annotationArr, Annotation[] annotationArr2) {
        sq8.m48649h(str, "serialName");
        sq8.m48649h(enumArr, "values");
        sq8.m48649h(strArr, "names");
        sq8.m48649h(annotationArr, "entryAnnotations");
        fi6 fi6Var = new fi6(str, enumArr.length);
        if (annotationArr2 != null) {
            for (Annotation annotation : annotationArr2) {
                fi6Var.m51344r(annotation);
            }
        }
        int length = enumArr.length;
        int i = 0;
        int i2 = 0;
        while (i < length) {
            Enum r4 = enumArr[i];
            int i3 = i2 + 1;
            String strName = (String) gp0.f0(strArr, i2);
            if (strName == null) {
                strName = r4.name();
            }
            ubd.m51337l(fi6Var, strName, false, 2, null);
            Annotation[] annotationArr3 = (Annotation[]) gp0.f0(annotationArr, i2);
            if (annotationArr3 != null) {
                for (Annotation annotation2 : annotationArr3) {
                    fi6Var.m51343q(annotation2);
                }
            }
            i++;
            i2 = i3;
        }
        return new li6(str, enumArr, fi6Var);
    }

    /* renamed from: b */
    public static final dc9 m40630b(String str, Enum[] enumArr) {
        sq8.m48649h(str, "serialName");
        sq8.m48649h(enumArr, "values");
        return new li6(str, enumArr);
    }
}
