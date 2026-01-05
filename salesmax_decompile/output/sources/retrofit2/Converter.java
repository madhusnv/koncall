package retrofit2;

import java.lang.annotation.Annotation;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import p001o.lri;

/* loaded from: classes6.dex */
public interface Converter<F, T> {

    /* renamed from: retrofit2.Converter$a */
    public static abstract class AbstractC18789a {
        /* renamed from: a */
        public static Type m60230a(int i, ParameterizedType parameterizedType) {
            return lri.m37838g(i, parameterizedType);
        }

        /* renamed from: b */
        public static Class m60231b(Type type2) {
            return lri.m37839h(type2);
        }

        /* renamed from: c */
        public Converter mo60232c(Type type2, Annotation[] annotationArr, Annotation[] annotationArr2, C18795f c18795f) {
            return null;
        }

        /* renamed from: d */
        public abstract Converter mo60233d(Type type2, Annotation[] annotationArr, C18795f c18795f);

        /* renamed from: e */
        public Converter m60234e(Type type2, Annotation[] annotationArr, C18795f c18795f) {
            return null;
        }
    }

    T convert(F f);
}
