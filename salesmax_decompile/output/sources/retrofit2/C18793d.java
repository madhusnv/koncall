package retrofit2;

import java.lang.annotation.Annotation;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.Optional;
import p001o.cre;
import retrofit2.Converter;

/* renamed from: retrofit2.d */
/* loaded from: classes6.dex */
public final class C18793d extends Converter.AbstractC18789a {

    /* renamed from: a */
    public static final Converter.AbstractC18789a f58022a = new C18793d();

    /* renamed from: retrofit2.d$a */
    public static final class a implements Converter {

        /* renamed from: a */
        public final Converter f58023a;

        public a(Converter converter) {
            this.f58023a = converter;
        }

        @Override // retrofit2.Converter
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Optional convert(cre creVar) {
            return Optional.ofNullable(this.f58023a.convert(creVar));
        }
    }

    @Override // retrofit2.Converter.AbstractC18789a
    /* renamed from: d */
    public Converter mo60233d(Type type2, Annotation[] annotationArr, C18795f c18795f) {
        if (Converter.AbstractC18789a.m60231b(type2) != Optional.class) {
            return null;
        }
        return new a(c18795f.m60264h(Converter.AbstractC18789a.m60230a(0, (ParameterizedType) type2), annotationArr));
    }
}
