package retrofit2;

import java.lang.annotation.Annotation;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import p001o.lri;

/* loaded from: classes6.dex */
public interface CallAdapter<R, T> {

    /* renamed from: retrofit2.CallAdapter$a */
    public static abstract class AbstractC18788a {
        /* renamed from: b */
        public static Type m60227b(int i, ParameterizedType parameterizedType) {
            return lri.m37838g(i, parameterizedType);
        }

        /* renamed from: c */
        public static Class m60228c(Type type2) {
            return lri.m37839h(type2);
        }

        /* renamed from: a */
        public abstract CallAdapter mo60229a(Type type2, Annotation[] annotationArr, C18795f c18795f);
    }

    T adapt(Call<R> call);

    Type responseType();
}
