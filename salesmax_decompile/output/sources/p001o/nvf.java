package p001o;

import java.lang.annotation.Annotation;
import retrofit2.SkipCallbackExecutor;

/* loaded from: classes6.dex */
public final class nvf implements SkipCallbackExecutor {

    /* renamed from: a */
    public static final SkipCallbackExecutor f37354a = new nvf();

    /* renamed from: a */
    public static Annotation[] m41181a(Annotation[] annotationArr) {
        if (lri.m37843l(annotationArr, SkipCallbackExecutor.class)) {
            return annotationArr;
        }
        Annotation[] annotationArr2 = new Annotation[annotationArr.length + 1];
        annotationArr2[0] = f37354a;
        System.arraycopy(annotationArr, 0, annotationArr2, 1, annotationArr.length);
        return annotationArr2;
    }

    @Override // java.lang.annotation.Annotation
    public Class annotationType() {
        return SkipCallbackExecutor.class;
    }

    @Override // java.lang.annotation.Annotation
    public boolean equals(Object obj) {
        return obj instanceof SkipCallbackExecutor;
    }

    @Override // java.lang.annotation.Annotation
    public int hashCode() {
        return 0;
    }

    @Override // java.lang.annotation.Annotation
    public String toString() {
        return "@" + SkipCallbackExecutor.class.getName() + "()";
    }
}
